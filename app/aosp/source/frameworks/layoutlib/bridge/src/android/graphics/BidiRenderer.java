/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.graphics;

import com.android.ide.common.rendering.api.LayoutLog;
import com.android.layoutlib.bridge.Bridge;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.Paint_Delegate.FontInfo;
import android.icu.lang.UScriptRun;
import android.icu.text.Bidi;
import android.icu.text.BidiRun;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;
import java.util.List;

/**
 * Render the text by breaking it into various scripts and using the right font for each script.
 * Can be used to measure the text without actually drawing it.
 */
@SuppressWarnings("deprecation")
public class BidiRenderer {
    private static String JAVA_VENDOR = System.getProperty("java.vendor");

    private static class ScriptRun {
        private final int start;
        private final int limit;
        private final Font font;

        private ScriptRun(int start, int limit, @NonNull Font font) {
            this.start = start;
            this.limit = limit;
            this.font = font;
        }
    }

    private final Graphics2D mGraphics;
    private final Paint_Delegate mPaint;
    private char[] mText;
    // Bounds of the text drawn so far.
    private RectF mBounds;
    private float mBaseline;

    /**
     * @param graphics May be null.
     * @param paint The Paint to use to get the fonts. Should not be null.
     * @param text Unidirectional text. Should not be null.
     */
    public BidiRenderer(Graphics2D graphics, Paint_Delegate paint, char[] text) {
        assert (paint != null);
        mGraphics = graphics;
        mPaint = paint;
        mText = text;
        mBounds = new RectF();
    }

    /**
     *
     * @param x The x-coordinate of the left edge of where the text should be drawn on the given
     *            graphics.
     * @param y The y-coordinate at which to draw the text on the given mGraphics.
     *
     */
    public BidiRenderer setRenderLocation(float x, float y) {
        mBounds.set(x, y, x, y);
        mBaseline = y;
        return this;
    }

    /**
     * Perform Bidi Analysis on the text and then render it.
     * <p/>
     * To skip the analysis and render unidirectional text, see {@link
     * #renderText(int, int, boolean, float[], int, boolean)}
     */
    public RectF renderText(int start, int limit, int bidiFlags, float[] advances,
            int advancesIndex, boolean draw) {
        Bidi bidi = new Bidi(mText, start, null, 0, limit - start, getIcuFlags(bidiFlags));
        mText = bidi.getText();
        for (int i = 0; i < bidi.countRuns(); i++) {
            BidiRun visualRun = bidi.getVisualRun(i);
            boolean isRtl = visualRun.getDirection() == Bidi.RTL;
            renderText(visualRun.getStart(), visualRun.getLimit(), isRtl, advances,
                    advancesIndex, draw);
        }
        return mBounds;
    }

    /**
     * Render unidirectional text.
     * <p/>
     * This method can also be used to measure the width of the text without actually drawing it.
     * <p/>
     * @param start index of the first character
     * @param limit index of the first character that should not be rendered.
     * @param isRtl is the text right-to-left
     * @param advances If not null, then advances for each character to be rendered are returned
     *            here.
     * @param advancesIndex index into advances from where the advances need to be filled.
     * @param draw If true and {@code graphics} is not null, draw the rendered text on the graphics
     *            at the given co-ordinates
     * @return A rectangle specifying the bounds of the text drawn.
     */
    public RectF renderText(int start, int limit, boolean isRtl, float[] advances,
            int advancesIndex, boolean draw) {
        // We break the text into scripts and then select font based on it and then render each of
        // the script runs.
        for (ScriptRun run : getScriptRuns(mText, start, limit, mPaint.getFonts())) {
            int flag = Font.LAYOUT_NO_LIMIT_CONTEXT | Font.LAYOUT_NO_START_CONTEXT;
            flag |= isRtl ? Font.LAYOUT_RIGHT_TO_LEFT : Font.LAYOUT_LEFT_TO_RIGHT;
            renderScript(run.start, run.limit, run.font, flag, advances, advancesIndex, draw);
            advancesIndex += run.limit - run.start;
        }
        return mBounds;
    }

    /**
     * Render a script run to the right of the bounds passed. Use the preferred font to render as
     * much as possible. This also implements a fallback mechanism to render characters that cannot
     * be drawn using the preferred font.
     */
    private void renderScript(int start, int limit, Font preferredFont, int flag,
            float[] advances, int advancesIndex, boolean draw) {
        if (mPaint.getFonts().size() == 0 || preferredFont == null) {
            return;
        }

        while (start < limit) {
            boolean foundFont = false;
            int canDisplayUpTo = preferredFont.canDisplayUpTo(mText, start, limit);
            if (canDisplayUpTo == -1) {
                // We can draw all characters in the text.
                render(start, limit, preferredFont, flag, advances, advancesIndex, draw);
                return;
            }
            if (canDisplayUpTo > start) {
                // We can draw something.
                render(start, canDisplayUpTo, preferredFont, flag, advances, advancesIndex, draw);
                advancesIndex += canDisplayUpTo - start;
                start = canDisplayUpTo;
            }

            // The current character cannot be drawn with the preferred font. Cycle through all the
            // fonts to check which one can draw it.
            int charCount = Character.isHighSurrogate(mText[start]) ? 2 : 1;
            List<FontInfo> fontInfos = mPaint.getFonts();
            //noinspection ForLoopReplaceableByForEach (avoid iterator allocation)
            for (int i = 0; i < fontInfos.size(); i++) {
                Font font = fontInfos.get(i).mFont;
                if (font == null) {
                    logFontWarning();
                    continue;
                }
                canDisplayUpTo = font.canDisplayUpTo(mText, start, start + charCount);
                if (canDisplayUpTo == -1) {
                    render(start, start+charCount, font, flag, advances, advancesIndex, draw);
                    start += charCount;
                    advancesIndex += charCount;
                    foundFont = true;
                    break;
                }
            }
            if (!foundFont) {
                // No font can display this char. Use the preferred font. The char will most
                // probably appear as a box or a blank space. We could, probably, use some
                // heuristics and break the character into the base character and diacritics and
                // then draw it, but it's probably not worth the effort.
                render(start, start + charCount, preferredFont, flag, advances, advancesIndex,
                        draw);
                start += charCount;
                advancesIndex += charCount;
            }
        }
    }

    private static void logFontWarning() {
        Bridge.getLog().fidelityWarning(LayoutLog.TAG_BROKEN,
                "Some fonts could not be loaded. The rendering may not be perfect. " +
                        "Try running the IDE with JRE 7.", null, null);
    }

    /**
     * Renders the text to the right of the bounds with the given font.
     * @param font The font to render the text with.
     */
    private void render(int start, int limit, Font font, int flag, float[] advances,
            int advancesIndex, boolean draw) {

        FontRenderContext frc;
        if (mGraphics != null) {
            frc = mGraphics.getFontRenderContext();
        } else {
            frc = Toolkit.getDefaultToolkit().getFontMetrics(font).getFontRenderContext();

            // Metrics obtained this way don't have anti-aliasing set. So,
            // we create a new FontRenderContext with anti-aliasing set.
            AffineTransform transform = font.getTransform();
            if (mPaint.isAntiAliased() &&
                    // Workaround for http://b.android.com/211659
                    (transform.getScaleX() <= 9.9 ||
                    !"JetBrains s.r.o".equals(JAVA_VENDOR))) {
                frc = new FontRenderContext(transform, true, frc.usesFractionalMetrics());
            }
        }
        GlyphVector gv = font.layoutGlyphVector(frc, mText, start, limit, flag);
        int ng = gv.getNumGlyphs();
        int[] ci = gv.getGlyphCharIndices(0, ng, null);
        if (advances != null) {
            for (int i = 0; i < ng; i++) {
                int adv_idx = advancesIndex + ci[i];
                advances[adv_idx] += gv.getGlyphMetrics(i).getAdvanceX();
            }
        }
        if (draw && mGraphics != null) {
            mGraphics.drawGlyphVector(gv, mBounds.right, mBaseline);
        }

        // Update the bounds.
        Rectangle2D awtBounds = gv.getLogicalBounds();
        // If the width of the bounds is zero, no text had been drawn earlier. Hence, use the
        // coordinates from the bounds as an offset.
        if (Math.abs(mBounds.right - mBounds.left) == 0) {
            mBounds = awtRectToAndroidRect(awtBounds, mBounds.right, mBaseline, mBounds);
        } else {
            mBounds.union(awtRectToAndroidRect(awtBounds, mBounds.right, mBaseline, null));
        }
    }

    // --- Static helper methods ---

    private static RectF awtRectToAndroidRect(Rectangle2D awtRec, float offsetX, float offsetY,
            @Nullable RectF destination) {
        float left = (float) awtRec.getX();
        float top = (float) awtRec.getY();
        float right = (float) (left + awtRec.getWidth());
        float bottom = (float) (top + awtRec.getHeight());
        if (destination != null) {
            destination.set(left, top, right, bottom);
        } else {
            destination = new RectF(left, top, right, bottom);
        }
        destination.offset(offsetX, offsetY);
        return destination;
    }

    private static List<ScriptRun> getScriptRuns(char[] text, int start, int limit, List<FontInfo> fonts) {
        LinkedList<ScriptRun> scriptRuns = new LinkedList<>();

        int count = limit - start;
        UScriptRun uScriptRun = new UScriptRun(text, start, count);
        while (uScriptRun.next()) {
            int scriptStart = uScriptRun.getScriptStart();
            int scriptLimit = uScriptRun.getScriptLimit();
            ScriptRun run = new ScriptRun(
                    scriptStart, scriptLimit,
                    getScriptFont(text, scriptStart, scriptLimit, fonts));
            scriptRuns.add(run);
        }
        return scriptRuns;
    }

    // TODO: Replace this method with one which returns the font based on the scriptCode.
    @NonNull
    private static Font getScriptFont(char[] text, int start, int limit, List<FontInfo> fonts) {
        for (FontInfo fontInfo : fonts) {
            if (fontInfo.mFont == null) {
                logFontWarning();
                continue;
            }
            if (fontInfo.mFont.canDisplayUpTo(text, start, limit) == -1) {
                return fontInfo.mFont;
            }
        }

        return fonts.get(0).mFont;
    }

    private static int getIcuFlags(int bidiFlag) {
        switch (bidiFlag) {
            case Paint.BIDI_LTR:
            case Paint.BIDI_FORCE_LTR:
                return Bidi.DIRECTION_LEFT_TO_RIGHT;
            case Paint.BIDI_RTL:
            case Paint.BIDI_FORCE_RTL:
                return Bidi.DIRECTION_RIGHT_TO_LEFT;
            case Paint.BIDI_DEFAULT_LTR:
                return Bidi.DIRECTION_DEFAULT_LEFT_TO_RIGHT;
            case Paint.BIDI_DEFAULT_RTL:
                return Bidi.DIRECTION_DEFAULT_RIGHT_TO_LEFT;
            default:
                assert false;
                return Bidi.DIRECTION_DEFAULT_LEFT_TO_RIGHT;
        }
    }
}
