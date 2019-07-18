/* This file is auto-generated.  DO NOT MODIFY.
 * Source file: frameworks/base/core/java/com/android/internal/logging/EventLogTags.logtags
 */

package com.android.internal.logging;;

/**
 * @hide
 */
public class EventLogTags {
  private EventLogTags() { }  // don't instantiate

  /** 524287 sysui_view_visibility (category|1|5),(visible|1|6) */
  public static final int SYSUI_VIEW_VISIBILITY = 524287;

  /** 524288 sysui_action (category|1|5),(pkg|3) */
  public static final int SYSUI_ACTION = 524288;

  /** 524292 sysui_multi_action (content|4) */
  public static final int SYSUI_MULTI_ACTION = 524292;

  /** 524290 sysui_count (name|3),(increment|1) */
  public static final int SYSUI_COUNT = 524290;

  /** 524291 sysui_histogram (name|3),(bucket|1) */
  public static final int SYSUI_HISTOGRAM = 524291;

  public static void writeSysuiViewVisibility(int category, int visible) {
    android.util.EventLog.writeEvent(SYSUI_VIEW_VISIBILITY, category, visible);
  }

  public static void writeSysuiAction(int category, String pkg) {
    android.util.EventLog.writeEvent(SYSUI_ACTION, category, pkg);
  }

  public static void writeSysuiMultiAction(Object[] content) {
    android.util.EventLog.writeEvent(SYSUI_MULTI_ACTION, content);
  }

  public static void writeSysuiCount(String name, int increment) {
    android.util.EventLog.writeEvent(SYSUI_COUNT, name, increment);
  }

  public static void writeSysuiHistogram(String name, int bucket) {
    android.util.EventLog.writeEvent(SYSUI_HISTOGRAM, name, bucket);
  }
}
