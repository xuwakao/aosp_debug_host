/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/statusbar/IStatusBarService.aidl
 */
package com.android.internal.statusbar;
/** @hide */
public interface IStatusBarService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBarService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBarService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.statusbar.IStatusBarService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.statusbar.IStatusBarService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.statusbar.IStatusBarService))) {
return ((com.android.internal.statusbar.IStatusBarService)iin);
}
return new com.android.internal.statusbar.IStatusBarService.Stub.Proxy(obj);
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
case TRANSACTION_expandNotificationsPanel:
{
data.enforceInterface(DESCRIPTOR);
this.expandNotificationsPanel();
reply.writeNoException();
return true;
}
case TRANSACTION_collapsePanels:
{
data.enforceInterface(DESCRIPTOR);
this.collapsePanels();
reply.writeNoException();
return true;
}
case TRANSACTION_togglePanel:
{
data.enforceInterface(DESCRIPTOR);
this.togglePanel();
reply.writeNoException();
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String _arg2;
_arg2 = data.readString();
this.disable(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_disableForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.disableForUser(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_disable2:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String _arg2;
_arg2 = data.readString();
this.disable2(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_disable2ForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.disable2ForUser(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setIcon:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
java.lang.String _arg4;
_arg4 = data.readString();
this.setIcon(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_setIconVisibility:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setIconVisibility(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeIcon:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removeIcon(_arg0);
reply.writeNoException();
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
reply.writeNoException();
return true;
}
case TRANSACTION_expandSettingsPanel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.expandSettingsPanel(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerStatusBar:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.statusbar.IStatusBar _arg0;
_arg0 = com.android.internal.statusbar.IStatusBar.Stub.asInterface(data.readStrongBinder());
java.util.List<java.lang.String> _arg1;
_arg1 = new java.util.ArrayList<java.lang.String>();
java.util.List<com.android.internal.statusbar.StatusBarIcon> _arg2;
_arg2 = new java.util.ArrayList<com.android.internal.statusbar.StatusBarIcon>();
int[] _arg3;
int _arg3_length = data.readInt();
if ((_arg3_length<0)) {
_arg3 = null;
}
else {
_arg3 = new int[_arg3_length];
}
java.util.List<android.os.IBinder> _arg4;
_arg4 = new java.util.ArrayList<android.os.IBinder>();
android.graphics.Rect _arg5;
_arg5 = new android.graphics.Rect();
android.graphics.Rect _arg6;
_arg6 = new android.graphics.Rect();
this.registerStatusBar(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeStringList(_arg1);
reply.writeTypedList(_arg2);
reply.writeIntArray(_arg3);
reply.writeBinderList(_arg4);
if ((_arg5!=null)) {
reply.writeInt(1);
_arg5.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
if ((_arg6!=null)) {
reply.writeInt(1);
_arg6.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_onPanelRevealed:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.onPanelRevealed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onPanelHidden:
{
data.enforceInterface(DESCRIPTOR);
this.onPanelHidden();
reply.writeNoException();
return true;
}
case TRANSACTION_clearNotificationEffects:
{
data.enforceInterface(DESCRIPTOR);
this.clearNotificationEffects();
reply.writeNoException();
return true;
}
case TRANSACTION_onNotificationClick:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onNotificationClick(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onNotificationActionClick:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onNotificationActionClick(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onNotificationError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
int _arg6;
_arg6 = data.readInt();
this.onNotificationError(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_onClearAllNotifications:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onClearAllNotifications(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onNotificationClear:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onNotificationClear(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_onNotificationVisibilityChanged:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.statusbar.NotificationVisibility[] _arg0;
_arg0 = data.createTypedArray(com.android.internal.statusbar.NotificationVisibility.CREATOR);
com.android.internal.statusbar.NotificationVisibility[] _arg1;
_arg1 = data.createTypedArray(com.android.internal.statusbar.NotificationVisibility.CREATOR);
this.onNotificationVisibilityChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onNotificationExpansionChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onNotificationExpansionChanged(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setSystemUiVisibility:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.setSystemUiVisibility(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onGlobalActionsShown:
{
data.enforceInterface(DESCRIPTOR);
this.onGlobalActionsShown();
reply.writeNoException();
return true;
}
case TRANSACTION_onGlobalActionsHidden:
{
data.enforceInterface(DESCRIPTOR);
this.onGlobalActionsHidden();
reply.writeNoException();
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
this.shutdown();
reply.writeNoException();
return true;
}
case TRANSACTION_reboot:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.reboot(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addTile:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.addTile(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_remTile:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.remTile(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clickTile:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.clickTile(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_handleSystemKey:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.handleSystemKey(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.statusbar.IStatusBarService
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
@Override public void expandNotificationsPanel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_expandNotificationsPanel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void collapsePanels() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_collapsePanels, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void togglePanel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_togglePanel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disable(int what, android.os.IBinder token, java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(what);
_data.writeStrongBinder(token);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_disable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disableForUser(int what, android.os.IBinder token, java.lang.String pkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(what);
_data.writeStrongBinder(token);
_data.writeString(pkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_disableForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disable2(int what, android.os.IBinder token, java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(what);
_data.writeStrongBinder(token);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_disable2, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disable2ForUser(int what, android.os.IBinder token, java.lang.String pkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(what);
_data.writeStrongBinder(token);
_data.writeString(pkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_disable2ForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setIcon(java.lang.String slot, java.lang.String iconPackage, int iconId, int iconLevel, java.lang.String contentDescription) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(slot);
_data.writeString(iconPackage);
_data.writeInt(iconId);
_data.writeInt(iconLevel);
_data.writeString(contentDescription);
mRemote.transact(Stub.TRANSACTION_setIcon, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setIconVisibility(java.lang.String slot, boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(slot);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setIconVisibility, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeIcon(java.lang.String slot) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(slot);
mRemote.transact(Stub.TRANSACTION_removeIcon, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setImeWindowStatus(android.os.IBinder token, int vis, int backDisposition, boolean showImeSwitcher) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(vis);
_data.writeInt(backDisposition);
_data.writeInt(((showImeSwitcher)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setImeWindowStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void expandSettingsPanel(java.lang.String subPanel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(subPanel);
mRemote.transact(Stub.TRANSACTION_expandSettingsPanel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// ---- Methods below are for use by the status bar policy services ----
// You need the STATUS_BAR_SERVICE permission

@Override public void registerStatusBar(com.android.internal.statusbar.IStatusBar callbacks, java.util.List<java.lang.String> iconSlots, java.util.List<com.android.internal.statusbar.StatusBarIcon> iconList, int[] switches, java.util.List<android.os.IBinder> binders, android.graphics.Rect fullscreenStackBounds, android.graphics.Rect dockedStackBounds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callbacks!=null))?(callbacks.asBinder()):(null)));
if ((switches==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(switches.length);
}
mRemote.transact(Stub.TRANSACTION_registerStatusBar, _data, _reply, 0);
_reply.readException();
_reply.readStringList(iconSlots);
_reply.readTypedList(iconList, com.android.internal.statusbar.StatusBarIcon.CREATOR);
_reply.readIntArray(switches);
_reply.readBinderList(binders);
if ((0!=_reply.readInt())) {
fullscreenStackBounds.readFromParcel(_reply);
}
if ((0!=_reply.readInt())) {
dockedStackBounds.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onPanelRevealed(boolean clearNotificationEffects, int numItems) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((clearNotificationEffects)?(1):(0)));
_data.writeInt(numItems);
mRemote.transact(Stub.TRANSACTION_onPanelRevealed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onPanelHidden() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onPanelHidden, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Mark current notifications as "seen" and stop ringing, vibrating, blinking.

@Override public void clearNotificationEffects() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearNotificationEffects, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onNotificationClick(java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_onNotificationClick, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onNotificationActionClick(java.lang.String key, int actionIndex) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(actionIndex);
mRemote.transact(Stub.TRANSACTION_onNotificationActionClick, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onNotificationError(java.lang.String pkg, java.lang.String tag, int id, int uid, int initialPid, java.lang.String message, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
_data.writeInt(uid);
_data.writeInt(initialPid);
_data.writeString(message);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_onNotificationError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onClearAllNotifications(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_onClearAllNotifications, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onNotificationClear(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_onNotificationClear, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onNotificationVisibilityChanged(com.android.internal.statusbar.NotificationVisibility[] newlyVisibleKeys, com.android.internal.statusbar.NotificationVisibility[] noLongerVisibleKeys) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(newlyVisibleKeys, 0);
_data.writeTypedArray(noLongerVisibleKeys, 0);
mRemote.transact(Stub.TRANSACTION_onNotificationVisibilityChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onNotificationExpansionChanged(java.lang.String key, boolean userAction, boolean expanded) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(((userAction)?(1):(0)));
_data.writeInt(((expanded)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onNotificationExpansionChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setSystemUiVisibility(int vis, int mask, java.lang.String cause) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(vis);
_data.writeInt(mask);
_data.writeString(cause);
mRemote.transact(Stub.TRANSACTION_setSystemUiVisibility, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onGlobalActionsShown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onGlobalActionsShown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onGlobalActionsHidden() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onGlobalActionsHidden, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * These methods are needed for global actions control which the UI is shown in sysui.
     */
@Override public void shutdown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reboot(boolean safeMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((safeMode)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_reboot, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addTile(android.content.ComponentName tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tile!=null)) {
_data.writeInt(1);
tile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addTile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void remTile(android.content.ComponentName tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tile!=null)) {
_data.writeInt(1);
tile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_remTile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clickTile(android.content.ComponentName tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tile!=null)) {
_data.writeInt(1);
tile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clickTile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void handleSystemKey(int key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(key);
mRemote.transact(Stub.TRANSACTION_handleSystemKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_expandNotificationsPanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_collapsePanels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_togglePanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_disable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_disableForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_disable2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_disable2ForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setIconVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_removeIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setImeWindowStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_expandSettingsPanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_registerStatusBar = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onPanelRevealed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_onPanelHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_clearNotificationEffects = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_onNotificationClick = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_onNotificationActionClick = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_onNotificationError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_onClearAllNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_onNotificationClear = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_onNotificationVisibilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_onNotificationExpansionChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setSystemUiVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_onGlobalActionsShown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_onGlobalActionsHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_reboot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_addTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_remTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_clickTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_handleSystemKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
}
public void expandNotificationsPanel() throws android.os.RemoteException;
public void collapsePanels() throws android.os.RemoteException;
public void togglePanel() throws android.os.RemoteException;
public void disable(int what, android.os.IBinder token, java.lang.String pkg) throws android.os.RemoteException;
public void disableForUser(int what, android.os.IBinder token, java.lang.String pkg, int userId) throws android.os.RemoteException;
public void disable2(int what, android.os.IBinder token, java.lang.String pkg) throws android.os.RemoteException;
public void disable2ForUser(int what, android.os.IBinder token, java.lang.String pkg, int userId) throws android.os.RemoteException;
public void setIcon(java.lang.String slot, java.lang.String iconPackage, int iconId, int iconLevel, java.lang.String contentDescription) throws android.os.RemoteException;
public void setIconVisibility(java.lang.String slot, boolean visible) throws android.os.RemoteException;
public void removeIcon(java.lang.String slot) throws android.os.RemoteException;
public void setImeWindowStatus(android.os.IBinder token, int vis, int backDisposition, boolean showImeSwitcher) throws android.os.RemoteException;
public void expandSettingsPanel(java.lang.String subPanel) throws android.os.RemoteException;
// ---- Methods below are for use by the status bar policy services ----
// You need the STATUS_BAR_SERVICE permission

public void registerStatusBar(com.android.internal.statusbar.IStatusBar callbacks, java.util.List<java.lang.String> iconSlots, java.util.List<com.android.internal.statusbar.StatusBarIcon> iconList, int[] switches, java.util.List<android.os.IBinder> binders, android.graphics.Rect fullscreenStackBounds, android.graphics.Rect dockedStackBounds) throws android.os.RemoteException;
public void onPanelRevealed(boolean clearNotificationEffects, int numItems) throws android.os.RemoteException;
public void onPanelHidden() throws android.os.RemoteException;
// Mark current notifications as "seen" and stop ringing, vibrating, blinking.

public void clearNotificationEffects() throws android.os.RemoteException;
public void onNotificationClick(java.lang.String key) throws android.os.RemoteException;
public void onNotificationActionClick(java.lang.String key, int actionIndex) throws android.os.RemoteException;
public void onNotificationError(java.lang.String pkg, java.lang.String tag, int id, int uid, int initialPid, java.lang.String message, int userId) throws android.os.RemoteException;
public void onClearAllNotifications(int userId) throws android.os.RemoteException;
public void onNotificationClear(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException;
public void onNotificationVisibilityChanged(com.android.internal.statusbar.NotificationVisibility[] newlyVisibleKeys, com.android.internal.statusbar.NotificationVisibility[] noLongerVisibleKeys) throws android.os.RemoteException;
public void onNotificationExpansionChanged(java.lang.String key, boolean userAction, boolean expanded) throws android.os.RemoteException;
public void setSystemUiVisibility(int vis, int mask, java.lang.String cause) throws android.os.RemoteException;
public void onGlobalActionsShown() throws android.os.RemoteException;
public void onGlobalActionsHidden() throws android.os.RemoteException;
/**
     * These methods are needed for global actions control which the UI is shown in sysui.
     */
public void shutdown() throws android.os.RemoteException;
public void reboot(boolean safeMode) throws android.os.RemoteException;
public void addTile(android.content.ComponentName tile) throws android.os.RemoteException;
public void remTile(android.content.ComponentName tile) throws android.os.RemoteException;
public void clickTile(android.content.ComponentName tile) throws android.os.RemoteException;
public void handleSystemKey(int key) throws android.os.RemoteException;
}
