/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/statusbar/IStatusBar.aidl
 */
package com.android.internal.statusbar;
/** @hide */
public interface IStatusBar extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBar
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBar";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.statusbar.IStatusBar interface,
 * generating a proxy if needed.
 */
public static com.android.internal.statusbar.IStatusBar asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.statusbar.IStatusBar))) {
return ((com.android.internal.statusbar.IStatusBar)iin);
}
return new com.android.internal.statusbar.IStatusBar.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setIcon:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.internal.statusbar.StatusBarIcon _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.statusbar.StatusBarIcon.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setIcon(_arg0, _arg1);
return true;
}
case TRANSACTION_removeIcon:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removeIcon(_arg0);
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.disable(_arg0, _arg1);
return true;
}
case TRANSACTION_animateExpandNotificationsPanel:
{
data.enforceInterface(DESCRIPTOR);
this.animateExpandNotificationsPanel();
return true;
}
case TRANSACTION_animateExpandSettingsPanel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.animateExpandSettingsPanel(_arg0);
return true;
}
case TRANSACTION_animateCollapsePanels:
{
data.enforceInterface(DESCRIPTOR);
this.animateCollapsePanels();
return true;
}
case TRANSACTION_togglePanel:
{
data.enforceInterface(DESCRIPTOR);
this.togglePanel();
return true;
}
case TRANSACTION_setSystemUiVisibility:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.graphics.Rect _arg4;
if ((0!=data.readInt())) {
_arg4 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.graphics.Rect _arg5;
if ((0!=data.readInt())) {
_arg5 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.setSystemUiVisibility(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
return true;
}
case TRANSACTION_topAppWindowChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.topAppWindowChanged(_arg0);
return true;
}
case TRANSACTION_setImeWindowStatus:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
this.setImeWindowStatus(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_setWindowState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setWindowState(_arg0, _arg1);
return true;
}
case TRANSACTION_showRecentApps:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.showRecentApps(_arg0, _arg1);
return true;
}
case TRANSACTION_hideRecentApps:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.hideRecentApps(_arg0, _arg1);
return true;
}
case TRANSACTION_toggleRecentApps:
{
data.enforceInterface(DESCRIPTOR);
this.toggleRecentApps();
return true;
}
case TRANSACTION_toggleSplitScreen:
{
data.enforceInterface(DESCRIPTOR);
this.toggleSplitScreen();
return true;
}
case TRANSACTION_preloadRecentApps:
{
data.enforceInterface(DESCRIPTOR);
this.preloadRecentApps();
return true;
}
case TRANSACTION_cancelPreloadRecentApps:
{
data.enforceInterface(DESCRIPTOR);
this.cancelPreloadRecentApps();
return true;
}
case TRANSACTION_showScreenPinningRequest:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.showScreenPinningRequest(_arg0);
return true;
}
case TRANSACTION_dismissKeyboardShortcutsMenu:
{
data.enforceInterface(DESCRIPTOR);
this.dismissKeyboardShortcutsMenu();
return true;
}
case TRANSACTION_toggleKeyboardShortcutsMenu:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.toggleKeyboardShortcutsMenu(_arg0);
return true;
}
case TRANSACTION_appTransitionPending:
{
data.enforceInterface(DESCRIPTOR);
this.appTransitionPending();
return true;
}
case TRANSACTION_appTransitionCancelled:
{
data.enforceInterface(DESCRIPTOR);
this.appTransitionCancelled();
return true;
}
case TRANSACTION_appTransitionStarting:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
this.appTransitionStarting(_arg0, _arg1);
return true;
}
case TRANSACTION_appTransitionFinished:
{
data.enforceInterface(DESCRIPTOR);
this.appTransitionFinished();
return true;
}
case TRANSACTION_showAssistDisclosure:
{
data.enforceInterface(DESCRIPTOR);
this.showAssistDisclosure();
return true;
}
case TRANSACTION_startAssist:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.startAssist(_arg0);
return true;
}
case TRANSACTION_onCameraLaunchGestureDetected:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onCameraLaunchGestureDetected(_arg0);
return true;
}
case TRANSACTION_showPictureInPictureMenu:
{
data.enforceInterface(DESCRIPTOR);
this.showPictureInPictureMenu();
return true;
}
case TRANSACTION_showGlobalActionsMenu:
{
data.enforceInterface(DESCRIPTOR);
this.showGlobalActionsMenu();
return true;
}
case TRANSACTION_setTopAppHidesStatusBar:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setTopAppHidesStatusBar(_arg0);
return true;
}
case TRANSACTION_addQsTile:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.addQsTile(_arg0);
return true;
}
case TRANSACTION_remQsTile:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.remQsTile(_arg0);
return true;
}
case TRANSACTION_clickQsTile:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.clickQsTile(_arg0);
return true;
}
case TRANSACTION_handleSystemKey:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.handleSystemKey(_arg0);
return true;
}
case TRANSACTION_showShutdownUi:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
java.lang.String _arg1;
_arg1 = data.readString();
this.showShutdownUi(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.statusbar.IStatusBar
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void setIcon(java.lang.String slot, com.android.internal.statusbar.StatusBarIcon icon) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(slot);
if ((icon!=null)) {
_data.writeInt(1);
icon.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setIcon, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void removeIcon(java.lang.String slot) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(slot);
mRemote.transact(Stub.TRANSACTION_removeIcon, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void disable(int state1, int state2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state1);
_data.writeInt(state2);
mRemote.transact(Stub.TRANSACTION_disable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void animateExpandNotificationsPanel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_animateExpandNotificationsPanel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void animateExpandSettingsPanel(java.lang.String subPanel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(subPanel);
mRemote.transact(Stub.TRANSACTION_animateExpandSettingsPanel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void animateCollapsePanels() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_animateCollapsePanels, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void togglePanel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_togglePanel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the status bar of a System UI visibility flag change.
     *
     * @param vis the visibility flags except SYSTEM_UI_FLAG_LIGHT_STATUS_BAR which will be reported
     *            separately in fullscreenStackVis and dockedStackVis
     * @param fullscreenStackVis the flags which only apply in the region of the fullscreen stack,
     *                           which is currently only SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
     * @param dockedStackVis the flags that only apply in the region of the docked stack, which is
     *                       currently only SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
     * @param mask which flags to change
     * @param fullscreenBounds the current bounds of the fullscreen stack, in screen coordinates
     * @param dockedBounds the current bounds of the docked stack, in screen coordinates
     */
@Override public void setSystemUiVisibility(int vis, int fullscreenStackVis, int dockedStackVis, int mask, android.graphics.Rect fullscreenBounds, android.graphics.Rect dockedBounds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(vis);
_data.writeInt(fullscreenStackVis);
_data.writeInt(dockedStackVis);
_data.writeInt(mask);
if ((fullscreenBounds!=null)) {
_data.writeInt(1);
fullscreenBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((dockedBounds!=null)) {
_data.writeInt(1);
dockedBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setSystemUiVisibility, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void topAppWindowChanged(boolean menuVisible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((menuVisible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_topAppWindowChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setImeWindowStatus(android.os.IBinder token, int vis, int backDisposition, boolean showImeSwitcher) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(vis);
_data.writeInt(backDisposition);
_data.writeInt(((showImeSwitcher)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setImeWindowStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setWindowState(int window, int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(window);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_setWindowState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void showRecentApps(boolean triggeredFromAltTab, boolean fromHome) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((triggeredFromAltTab)?(1):(0)));
_data.writeInt(((fromHome)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_showRecentApps, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void hideRecentApps(boolean triggeredFromAltTab, boolean triggeredFromHomeKey) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((triggeredFromAltTab)?(1):(0)));
_data.writeInt(((triggeredFromHomeKey)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_hideRecentApps, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void toggleRecentApps() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_toggleRecentApps, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void toggleSplitScreen() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_toggleSplitScreen, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void preloadRecentApps() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_preloadRecentApps, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void cancelPreloadRecentApps() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelPreloadRecentApps, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void showScreenPinningRequest(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_showScreenPinningRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dismissKeyboardShortcutsMenu() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dismissKeyboardShortcutsMenu, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void toggleKeyboardShortcutsMenu(int deviceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceId);
mRemote.transact(Stub.TRANSACTION_toggleKeyboardShortcutsMenu, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the status bar that an app transition is pending to delay applying some flags with
     * visual impact until {@link #appTransitionReady} is called.
     */
@Override public void appTransitionPending() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_appTransitionPending, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the status bar that a pending app transition has been cancelled.
     */
@Override public void appTransitionCancelled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_appTransitionCancelled, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the status bar that an app transition is now being executed.
     *
     * @param statusBarAnimationsStartTime the desired start time for all visual animations in the
     *        status bar caused by this app transition in uptime millis
     * @param statusBarAnimationsDuration the duration for all visual animations in the status
     *        bar caused by this app transition in millis
     */
@Override public void appTransitionStarting(long statusBarAnimationsStartTime, long statusBarAnimationsDuration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(statusBarAnimationsStartTime);
_data.writeLong(statusBarAnimationsDuration);
mRemote.transact(Stub.TRANSACTION_appTransitionStarting, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the status bar that an app transition is done.
     */
@Override public void appTransitionFinished() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_appTransitionFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void showAssistDisclosure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_showAssistDisclosure, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void startAssist(android.os.Bundle args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startAssist, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the status bar that a camera launch gesture has been detected.
     *
     * @param source the identifier for the gesture, see {@link StatusBarManager}
     */
@Override public void onCameraLaunchGestureDetected(int source) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(source);
mRemote.transact(Stub.TRANSACTION_onCameraLaunchGestureDetected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Shows the picture-in-picture menu if an activity is in picture-in-picture mode.
     */
@Override public void showPictureInPictureMenu() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_showPictureInPictureMenu, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Shows the global actions menu.
     */
@Override public void showGlobalActionsMenu() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_showGlobalActionsMenu, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Set whether the top app currently hides the statusbar.
     *
     * @param hidesStatusBar whether it is being hidden
     */
@Override public void setTopAppHidesStatusBar(boolean hidesStatusBar) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((hidesStatusBar)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setTopAppHidesStatusBar, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void addQsTile(android.content.ComponentName tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tile!=null)) {
_data.writeInt(1);
tile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addQsTile, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void remQsTile(android.content.ComponentName tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tile!=null)) {
_data.writeInt(1);
tile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_remQsTile, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void clickQsTile(android.content.ComponentName tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tile!=null)) {
_data.writeInt(1);
tile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clickQsTile, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleSystemKey(int key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(key);
mRemote.transact(Stub.TRANSACTION_handleSystemKey, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void showShutdownUi(boolean isReboot, java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isReboot)?(1):(0)));
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_showShutdownUi, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_disable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_animateExpandNotificationsPanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_animateExpandSettingsPanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_animateCollapsePanels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_togglePanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setSystemUiVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_topAppWindowChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setImeWindowStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setWindowState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_showRecentApps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_hideRecentApps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_toggleRecentApps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_toggleSplitScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_preloadRecentApps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_cancelPreloadRecentApps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_showScreenPinningRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_dismissKeyboardShortcutsMenu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_toggleKeyboardShortcutsMenu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_appTransitionPending = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_appTransitionCancelled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_appTransitionStarting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_appTransitionFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_showAssistDisclosure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_startAssist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_onCameraLaunchGestureDetected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_showPictureInPictureMenu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_showGlobalActionsMenu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_setTopAppHidesStatusBar = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_addQsTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_remQsTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_clickQsTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_handleSystemKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_showShutdownUi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
}
public void setIcon(java.lang.String slot, com.android.internal.statusbar.StatusBarIcon icon) throws android.os.RemoteException;
public void removeIcon(java.lang.String slot) throws android.os.RemoteException;
public void disable(int state1, int state2) throws android.os.RemoteException;
public void animateExpandNotificationsPanel() throws android.os.RemoteException;
public void animateExpandSettingsPanel(java.lang.String subPanel) throws android.os.RemoteException;
public void animateCollapsePanels() throws android.os.RemoteException;
public void togglePanel() throws android.os.RemoteException;
/**
     * Notifies the status bar of a System UI visibility flag change.
     *
     * @param vis the visibility flags except SYSTEM_UI_FLAG_LIGHT_STATUS_BAR which will be reported
     *            separately in fullscreenStackVis and dockedStackVis
     * @param fullscreenStackVis the flags which only apply in the region of the fullscreen stack,
     *                           which is currently only SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
     * @param dockedStackVis the flags that only apply in the region of the docked stack, which is
     *                       currently only SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
     * @param mask which flags to change
     * @param fullscreenBounds the current bounds of the fullscreen stack, in screen coordinates
     * @param dockedBounds the current bounds of the docked stack, in screen coordinates
     */
public void setSystemUiVisibility(int vis, int fullscreenStackVis, int dockedStackVis, int mask, android.graphics.Rect fullscreenBounds, android.graphics.Rect dockedBounds) throws android.os.RemoteException;
public void topAppWindowChanged(boolean menuVisible) throws android.os.RemoteException;
public void setImeWindowStatus(android.os.IBinder token, int vis, int backDisposition, boolean showImeSwitcher) throws android.os.RemoteException;
public void setWindowState(int window, int state) throws android.os.RemoteException;
public void showRecentApps(boolean triggeredFromAltTab, boolean fromHome) throws android.os.RemoteException;
public void hideRecentApps(boolean triggeredFromAltTab, boolean triggeredFromHomeKey) throws android.os.RemoteException;
public void toggleRecentApps() throws android.os.RemoteException;
public void toggleSplitScreen() throws android.os.RemoteException;
public void preloadRecentApps() throws android.os.RemoteException;
public void cancelPreloadRecentApps() throws android.os.RemoteException;
public void showScreenPinningRequest(int taskId) throws android.os.RemoteException;
public void dismissKeyboardShortcutsMenu() throws android.os.RemoteException;
public void toggleKeyboardShortcutsMenu(int deviceId) throws android.os.RemoteException;
/**
     * Notifies the status bar that an app transition is pending to delay applying some flags with
     * visual impact until {@link #appTransitionReady} is called.
     */
public void appTransitionPending() throws android.os.RemoteException;
/**
     * Notifies the status bar that a pending app transition has been cancelled.
     */
public void appTransitionCancelled() throws android.os.RemoteException;
/**
     * Notifies the status bar that an app transition is now being executed.
     *
     * @param statusBarAnimationsStartTime the desired start time for all visual animations in the
     *        status bar caused by this app transition in uptime millis
     * @param statusBarAnimationsDuration the duration for all visual animations in the status
     *        bar caused by this app transition in millis
     */
public void appTransitionStarting(long statusBarAnimationsStartTime, long statusBarAnimationsDuration) throws android.os.RemoteException;
/**
     * Notifies the status bar that an app transition is done.
     */
public void appTransitionFinished() throws android.os.RemoteException;
public void showAssistDisclosure() throws android.os.RemoteException;
public void startAssist(android.os.Bundle args) throws android.os.RemoteException;
/**
     * Notifies the status bar that a camera launch gesture has been detected.
     *
     * @param source the identifier for the gesture, see {@link StatusBarManager}
     */
public void onCameraLaunchGestureDetected(int source) throws android.os.RemoteException;
/**
     * Shows the picture-in-picture menu if an activity is in picture-in-picture mode.
     */
public void showPictureInPictureMenu() throws android.os.RemoteException;
/**
     * Shows the global actions menu.
     */
public void showGlobalActionsMenu() throws android.os.RemoteException;
/**
     * Set whether the top app currently hides the statusbar.
     *
     * @param hidesStatusBar whether it is being hidden
     */
public void setTopAppHidesStatusBar(boolean hidesStatusBar) throws android.os.RemoteException;
public void addQsTile(android.content.ComponentName tile) throws android.os.RemoteException;
public void remQsTile(android.content.ComponentName tile) throws android.os.RemoteException;
public void clickQsTile(android.content.ComponentName tile) throws android.os.RemoteException;
public void handleSystemKey(int key) throws android.os.RemoteException;
public void showShutdownUi(boolean isReboot, java.lang.String reason) throws android.os.RemoteException;
}
