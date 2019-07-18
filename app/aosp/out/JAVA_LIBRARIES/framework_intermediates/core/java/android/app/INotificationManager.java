/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/INotificationManager.aidl
 */
package android.app;
/** {@hide} */
public interface INotificationManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.INotificationManager
{
private static final java.lang.String DESCRIPTOR = "android.app.INotificationManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.INotificationManager interface,
 * generating a proxy if needed.
 */
public static android.app.INotificationManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.INotificationManager))) {
return ((android.app.INotificationManager)iin);
}
return new android.app.INotificationManager.Stub.Proxy(obj);
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
case TRANSACTION_cancelAllNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.cancelAllNotifications(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.clearData(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_enqueueToast:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.ITransientNotification _arg1;
_arg1 = android.app.ITransientNotification.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
this.enqueueToast(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelToast:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.ITransientNotification _arg1;
_arg1 = android.app.ITransientNotification.Stub.asInterface(data.readStrongBinder());
this.cancelToast(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_enqueueNotificationWithTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
android.app.Notification _arg4;
if ((0!=data.readInt())) {
_arg4 = android.app.Notification.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
this.enqueueNotificationWithTag(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelNotificationWithTag:
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
this.cancelNotificationWithTag(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setShowBadge:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setShowBadge(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_canShowBadge:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.canShowBadge(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNotificationsEnabledForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setNotificationsEnabledForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_areNotificationsEnabledForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.areNotificationsEnabledForPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_areNotificationsEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.areNotificationsEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPackageImportance:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getPackageImportance(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createNotificationChannelGroups:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.ParceledListSlice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.createNotificationChannelGroups(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_createNotificationChannels:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.ParceledListSlice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.createNotificationChannels(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_createNotificationChannelsForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.ParceledListSlice _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.createNotificationChannelsForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getNotificationChannelGroupsForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
android.content.pm.ParceledListSlice _result = this.getNotificationChannelGroupsForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNotificationChannelGroupForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
android.app.NotificationChannelGroup _result = this.getNotificationChannelGroupForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_updateNotificationChannelForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.app.NotificationChannel _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.NotificationChannel.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.updateNotificationChannelForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getNotificationChannel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.app.NotificationChannel _result = this.getNotificationChannel(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNotificationChannelForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _arg3;
_arg3 = (0!=data.readInt());
android.app.NotificationChannel _result = this.getNotificationChannelForPackage(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_deleteNotificationChannel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.deleteNotificationChannel(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getNotificationChannels:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.ParceledListSlice _result = this.getNotificationChannels(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNotificationChannelsForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
android.content.pm.ParceledListSlice _result = this.getNotificationChannelsForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNumNotificationChannelsForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getNumNotificationChannelsForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDeletedChannelCount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.getDeletedChannelCount(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deleteNotificationChannelGroup:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.deleteNotificationChannelGroup(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getNotificationChannelGroups:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.ParceledListSlice _result = this.getNotificationChannelGroups(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_onlyHasDefaultChannel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.onlyHasDefaultChannel(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.service.notification.StatusBarNotification[] _result = this.getActiveNotifications(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getHistoricalNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.service.notification.StatusBarNotification[] _result = this.getHistoricalNotifications(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.registerListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.unregisterListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelNotificationFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.cancelNotificationFromListener(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelNotificationsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.cancelNotificationsFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_snoozeNotificationUntilContextFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.snoozeNotificationUntilContextFromListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_snoozeNotificationUntilFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
long _arg2;
_arg2 = data.readLong();
this.snoozeNotificationUntilFromListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_requestBindListener:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.requestBindListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requestUnbindListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
this.requestUnbindListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requestBindProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.requestBindProvider(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requestUnbindProvider:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IConditionProvider _arg0;
_arg0 = android.service.notification.IConditionProvider.Stub.asInterface(data.readStrongBinder());
this.requestUnbindProvider(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setNotificationsShownFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.setNotificationsShownFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getActiveNotificationsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
int _arg2;
_arg2 = data.readInt();
android.content.pm.ParceledListSlice _result = this.getActiveNotificationsFromListener(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getSnoozedNotificationsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
android.content.pm.ParceledListSlice _result = this.getSnoozedNotificationsFromListener(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_requestHintsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.requestHintsFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getHintsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _result = this.getHintsFromListener(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_requestInterruptionFilterFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.requestInterruptionFilterFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getInterruptionFilterFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _result = this.getInterruptionFilterFromListener(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setOnNotificationPostedTrimFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.setOnNotificationPostedTrimFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setInterruptionFilter:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.setInterruptionFilter(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_updateNotificationChannelFromPrivilegedListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
android.os.UserHandle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.app.NotificationChannel _arg3;
if ((0!=data.readInt())) {
_arg3 = android.app.NotificationChannel.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.updateNotificationChannelFromPrivilegedListener(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getNotificationChannelsFromPrivilegedListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
android.os.UserHandle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.content.pm.ParceledListSlice _result = this.getNotificationChannelsFromPrivilegedListener(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNotificationChannelGroupsFromPrivilegedListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
android.os.UserHandle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.content.pm.ParceledListSlice _result = this.getNotificationChannelGroupsFromPrivilegedListener(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_applyEnqueuedAdjustmentFromAssistant:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
android.service.notification.Adjustment _arg1;
if ((0!=data.readInt())) {
_arg1 = android.service.notification.Adjustment.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.applyEnqueuedAdjustmentFromAssistant(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_applyAdjustmentFromAssistant:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
android.service.notification.Adjustment _arg1;
if ((0!=data.readInt())) {
_arg1 = android.service.notification.Adjustment.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.applyAdjustmentFromAssistant(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_applyAdjustmentsFromAssistant:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.util.List<android.service.notification.Adjustment> _arg1;
_arg1 = data.createTypedArrayList(android.service.notification.Adjustment.CREATOR);
this.applyAdjustmentsFromAssistant(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unsnoozeNotificationFromAssistant:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
this.unsnoozeNotificationFromAssistant(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getEffectsSuppressor:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _result = this.getEffectsSuppressor();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_matchesCallFilter:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.matchesCallFilter(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSystemConditionProviderEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isSystemConditionProviderEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isNotificationListenerAccessGranted:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isNotificationListenerAccessGranted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isNotificationListenerAccessGrantedForUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isNotificationListenerAccessGrantedForUser(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isNotificationAssistantAccessGranted:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isNotificationAssistantAccessGranted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNotificationListenerAccessGranted:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setNotificationListenerAccessGranted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setNotificationAssistantAccessGranted:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setNotificationAssistantAccessGranted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setNotificationListenerAccessGrantedForUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setNotificationListenerAccessGrantedForUser(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setNotificationAssistantAccessGrantedForUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setNotificationAssistantAccessGrantedForUser(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getEnabledNotificationListenerPackages:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getEnabledNotificationListenerPackages();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_getEnabledNotificationListeners:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.ComponentName> _result = this.getEnabledNotificationListeners(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getZenMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getZenMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getZenModeConfig:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.ZenModeConfig _result = this.getZenModeConfig();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setZenMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.setZenMode(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_notifyConditions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.service.notification.IConditionProvider _arg1;
_arg1 = android.service.notification.IConditionProvider.Stub.asInterface(data.readStrongBinder());
android.service.notification.Condition[] _arg2;
_arg2 = data.createTypedArray(android.service.notification.Condition.CREATOR);
this.notifyConditions(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_isNotificationPolicyAccessGranted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isNotificationPolicyAccessGranted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getNotificationPolicy:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.NotificationManager.Policy _result = this.getNotificationPolicy(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setNotificationPolicy:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.NotificationManager.Policy _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.NotificationManager.Policy.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setNotificationPolicy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isNotificationPolicyAccessGrantedForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isNotificationPolicyAccessGrantedForPackage(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNotificationPolicyAccessGranted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setNotificationPolicyAccessGranted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setNotificationPolicyAccessGrantedForUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setNotificationPolicyAccessGrantedForUser(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAutomaticZenRule:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.AutomaticZenRule _result = this.getAutomaticZenRule(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getZenRules:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.service.notification.ZenModeConfig.ZenRule> _result = this.getZenRules();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_addAutomaticZenRule:
{
data.enforceInterface(DESCRIPTOR);
android.app.AutomaticZenRule _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.AutomaticZenRule.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.addAutomaticZenRule(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_updateAutomaticZenRule:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.AutomaticZenRule _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.AutomaticZenRule.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.updateAutomaticZenRule(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeAutomaticZenRule:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.removeAutomaticZenRule(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeAutomaticZenRules:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.removeAutomaticZenRules(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRuleInstanceCount:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getRuleInstanceCount(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getBackupPayload:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _result = this.getBackupPayload(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_applyRestore:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
this.applyRestore(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAppActiveNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.ParceledListSlice _result = this.getAppActiveNotifications(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.INotificationManager
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
@Override public void cancelAllNotifications(java.lang.String pkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelAllNotifications, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearData(java.lang.String pkg, int uid, boolean fromApp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((fromApp)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_clearData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enqueueToast(java.lang.String pkg, android.app.ITransientNotification callback, int duration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(duration);
mRemote.transact(Stub.TRANSACTION_enqueueToast, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelToast(java.lang.String pkg, android.app.ITransientNotification callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_cancelToast, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enqueueNotificationWithTag(java.lang.String pkg, java.lang.String opPkg, java.lang.String tag, int id, android.app.Notification notification, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(opPkg);
_data.writeString(tag);
_data.writeInt(id);
if ((notification!=null)) {
_data.writeInt(1);
notification.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_enqueueNotificationWithTag, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelNotificationWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelNotificationWithTag, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setShowBadge(java.lang.String pkg, int uid, boolean showBadge) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((showBadge)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setShowBadge, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean canShowBadge(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_canShowBadge, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setNotificationsEnabledForPackage(java.lang.String pkg, int uid, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationsEnabledForPackage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean areNotificationsEnabledForPackage(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_areNotificationsEnabledForPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean areNotificationsEnabled(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_areNotificationsEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPackageImportance(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_getPackageImportance, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void createNotificationChannelGroups(java.lang.String pkg, android.content.pm.ParceledListSlice channelGroupList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
if ((channelGroupList!=null)) {
_data.writeInt(1);
channelGroupList.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createNotificationChannelGroups, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void createNotificationChannels(java.lang.String pkg, android.content.pm.ParceledListSlice channelsList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
if ((channelsList!=null)) {
_data.writeInt(1);
channelsList.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createNotificationChannels, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void createNotificationChannelsForPackage(java.lang.String pkg, int uid, android.content.pm.ParceledListSlice channelsList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
if ((channelsList!=null)) {
_data.writeInt(1);
channelsList.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createNotificationChannelsForPackage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String pkg, int uid, boolean includeDeleted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((includeDeleted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getNotificationChannelGroupsForPackage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String groupId, java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.NotificationChannelGroup _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(groupId);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getNotificationChannelGroupForPackage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.NotificationChannelGroup.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void updateNotificationChannelForPackage(java.lang.String pkg, int uid, android.app.NotificationChannel channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
if ((channel!=null)) {
_data.writeInt(1);
channel.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateNotificationChannelForPackage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.app.NotificationChannel getNotificationChannel(java.lang.String pkg, java.lang.String channelId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.NotificationChannel _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(channelId);
mRemote.transact(Stub.TRANSACTION_getNotificationChannel, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.NotificationChannel.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String pkg, int uid, java.lang.String channelId, boolean includeDeleted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.NotificationChannel _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeString(channelId);
_data.writeInt(((includeDeleted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getNotificationChannelForPackage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.NotificationChannel.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void deleteNotificationChannel(java.lang.String pkg, java.lang.String channelId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(channelId);
mRemote.transact(Stub.TRANSACTION_deleteNotificationChannel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_getNotificationChannels, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String pkg, int uid, boolean includeDeleted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((includeDeleted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getNotificationChannelsForPackage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNumNotificationChannelsForPackage(java.lang.String pkg, int uid, boolean includeDeleted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((includeDeleted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getNumNotificationChannelsForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDeletedChannelCount(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getDeletedChannelCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void deleteNotificationChannelGroup(java.lang.String pkg, java.lang.String channelGroupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(channelGroupId);
mRemote.transact(Stub.TRANSACTION_deleteNotificationChannelGroup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_getNotificationChannelGroups, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean onlyHasDefaultChannel(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_onlyHasDefaultChannel, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// TODO: Remove this when callers have been migrated to the equivalent
// INotificationListener method.

@Override public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String callingPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.StatusBarNotification[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
mRemote.transact(Stub.TRANSACTION_getActiveNotifications, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.service.notification.StatusBarNotification.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String callingPkg, int count) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.StatusBarNotification[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeInt(count);
mRemote.transact(Stub.TRANSACTION_getHistoricalNotifications, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.service.notification.StatusBarNotification.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerListener(android.service.notification.INotificationListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userid);
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterListener(android.service.notification.INotificationListener listener, int userid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(userid);
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelNotificationFromListener(android.service.notification.INotificationListener token, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_cancelNotificationFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelNotificationsFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeStringArray(keys);
mRemote.transact(Stub.TRANSACTION_cancelNotificationsFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener token, java.lang.String key, java.lang.String snoozeCriterionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(key);
_data.writeString(snoozeCriterionId);
mRemote.transact(Stub.TRANSACTION_snoozeNotificationUntilContextFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener token, java.lang.String key, long until) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(key);
_data.writeLong(until);
mRemote.transact(Stub.TRANSACTION_snoozeNotificationUntilFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestBindListener(android.content.ComponentName component) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestBindListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestUnbindListener(android.service.notification.INotificationListener token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_requestUnbindListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestBindProvider(android.content.ComponentName component) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestBindProvider, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestUnbindProvider(android.service.notification.IConditionProvider token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_requestUnbindProvider, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setNotificationsShownFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeStringArray(keys);
mRemote.transact(Stub.TRANSACTION_setNotificationsShownFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys, int trim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeStringArray(keys);
_data.writeInt(trim);
mRemote.transact(Stub.TRANSACTION_getActiveNotificationsFromListener, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener token, int trim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(trim);
mRemote.transact(Stub.TRANSACTION_getSnoozedNotificationsFromListener, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void requestHintsFromListener(android.service.notification.INotificationListener token, int hints) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(hints);
mRemote.transact(Stub.TRANSACTION_requestHintsFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getHintsFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getHintsFromListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener token, int interruptionFilter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(interruptionFilter);
mRemote.transact(Stub.TRANSACTION_requestInterruptionFilterFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getInterruptionFilterFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getInterruptionFilterFromListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener token, int trim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(trim);
mRemote.transact(Stub.TRANSACTION_setOnNotificationPostedTrimFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setInterruptionFilter(java.lang.String pkg, int interruptionFilter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(interruptionFilter);
mRemote.transact(Stub.TRANSACTION_setInterruptionFilter, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener token, java.lang.String pkg, android.os.UserHandle user, android.app.NotificationChannel channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(pkg);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((channel!=null)) {
_data.writeInt(1);
channel.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateNotificationChannelFromPrivilegedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.pm.ParceledListSlice getNotificationChannelsFromPrivilegedListener(android.service.notification.INotificationListener token, java.lang.String pkg, android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(pkg);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getNotificationChannelsFromPrivilegedListener, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ParceledListSlice getNotificationChannelGroupsFromPrivilegedListener(android.service.notification.INotificationListener token, java.lang.String pkg, android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(pkg);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getNotificationChannelGroupsFromPrivilegedListener, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void applyEnqueuedAdjustmentFromAssistant(android.service.notification.INotificationListener token, android.service.notification.Adjustment adjustment) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
if ((adjustment!=null)) {
_data.writeInt(1);
adjustment.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_applyEnqueuedAdjustmentFromAssistant, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void applyAdjustmentFromAssistant(android.service.notification.INotificationListener token, android.service.notification.Adjustment adjustment) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
if ((adjustment!=null)) {
_data.writeInt(1);
adjustment.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_applyAdjustmentFromAssistant, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void applyAdjustmentsFromAssistant(android.service.notification.INotificationListener token, java.util.List<android.service.notification.Adjustment> adjustments) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeTypedList(adjustments);
mRemote.transact(Stub.TRANSACTION_applyAdjustmentsFromAssistant, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unsnoozeNotificationFromAssistant(android.service.notification.INotificationListener token, java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_unsnoozeNotificationFromAssistant, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEffectsSuppressor, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean matchesCallFilter(android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_matchesCallFilter, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isSystemConditionProviderEnabled(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_isSystemConditionProviderEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isNotificationListenerAccessGranted(android.content.ComponentName listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((listener!=null)) {
_data.writeInt(1);
listener.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isNotificationListenerAccessGranted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName listener, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((listener!=null)) {
_data.writeInt(1);
listener.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isNotificationListenerAccessGrantedForUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isNotificationAssistantAccessGranted(android.content.ComponentName assistant) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((assistant!=null)) {
_data.writeInt(1);
assistant.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isNotificationAssistantAccessGranted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setNotificationListenerAccessGranted(android.content.ComponentName listener, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((listener!=null)) {
_data.writeInt(1);
listener.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationListenerAccessGranted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setNotificationAssistantAccessGranted(android.content.ComponentName assistant, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((assistant!=null)) {
_data.writeInt(1);
assistant.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationAssistantAccessGranted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName listener, int userId, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((listener!=null)) {
_data.writeInt(1);
listener.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationListenerAccessGrantedForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName assistant, int userId, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((assistant!=null)) {
_data.writeInt(1);
assistant.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationAssistantAccessGrantedForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEnabledNotificationListenerPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.ComponentName> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getEnabledNotificationListeners, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.ComponentName.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getZenMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getZenMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.ZenModeConfig _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getZenModeConfig, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.service.notification.ZenModeConfig.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setZenMode(int mode, android.net.Uri conditionId, java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
if ((conditionId!=null)) {
_data.writeInt(1);
conditionId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_setZenMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void notifyConditions(java.lang.String pkg, android.service.notification.IConditionProvider provider, android.service.notification.Condition[] conditions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((provider!=null))?(provider.asBinder()):(null)));
_data.writeTypedArray(conditions, 0);
mRemote.transact(Stub.TRANSACTION_notifyConditions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public boolean isNotificationPolicyAccessGranted(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_isNotificationPolicyAccessGranted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.NotificationManager.Policy _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_getNotificationPolicy, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.NotificationManager.Policy.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setNotificationPolicy(java.lang.String pkg, android.app.NotificationManager.Policy policy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
if ((policy!=null)) {
_data.writeInt(1);
policy.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNotificationPolicy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_isNotificationPolicyAccessGrantedForPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setNotificationPolicyAccessGranted(java.lang.String pkg, boolean granted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(((granted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationPolicyAccessGranted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setNotificationPolicyAccessGrantedForUser(java.lang.String pkg, int userId, boolean granted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(userId);
_data.writeInt(((granted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationPolicyAccessGrantedForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.AutomaticZenRule _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_getAutomaticZenRule, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.AutomaticZenRule.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.service.notification.ZenModeConfig.ZenRule> getZenRules() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.service.notification.ZenModeConfig.ZenRule> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getZenRules, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.service.notification.ZenModeConfig.ZenRule.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule automaticZenRule) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((automaticZenRule!=null)) {
_data.writeInt(1);
automaticZenRule.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addAutomaticZenRule, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean updateAutomaticZenRule(java.lang.String id, android.app.AutomaticZenRule automaticZenRule) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
if ((automaticZenRule!=null)) {
_data.writeInt(1);
automaticZenRule.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateAutomaticZenRule, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeAutomaticZenRule(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_removeAutomaticZenRule, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeAutomaticZenRules(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_removeAutomaticZenRules, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getRuleInstanceCount(android.content.ComponentName owner) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((owner!=null)) {
_data.writeInt(1);
owner.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getRuleInstanceCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public byte[] getBackupPayload(int user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(user);
mRemote.transact(Stub.TRANSACTION_getBackupPayload, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void applyRestore(byte[] payload, int user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(payload);
_data.writeInt(user);
mRemote.transact(Stub.TRANSACTION_applyRestore, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String callingPkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getAppActiveNotifications, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_cancelAllNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_clearData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_enqueueToast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancelToast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_enqueueNotificationWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_cancelNotificationWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setShowBadge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_canShowBadge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setNotificationsEnabledForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_areNotificationsEnabledForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_areNotificationsEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getPackageImportance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_createNotificationChannelGroups = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_createNotificationChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_createNotificationChannelsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getNotificationChannelGroupsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getNotificationChannelGroupForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_updateNotificationChannelForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getNotificationChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getNotificationChannelForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_deleteNotificationChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getNotificationChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getNotificationChannelsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getNumNotificationChannelsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getDeletedChannelCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_deleteNotificationChannelGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getNotificationChannelGroups = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_onlyHasDefaultChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getActiveNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getHistoricalNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_cancelNotificationFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_cancelNotificationsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_snoozeNotificationUntilContextFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_snoozeNotificationUntilFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_requestBindListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_requestUnbindListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_requestBindProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_requestUnbindProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_setNotificationsShownFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_getActiveNotificationsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getSnoozedNotificationsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_requestHintsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_getHintsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_requestInterruptionFilterFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_getInterruptionFilterFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_setOnNotificationPostedTrimFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_setInterruptionFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_updateNotificationChannelFromPrivilegedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_getNotificationChannelsFromPrivilegedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_getNotificationChannelGroupsFromPrivilegedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_applyEnqueuedAdjustmentFromAssistant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_applyAdjustmentFromAssistant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_applyAdjustmentsFromAssistant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_unsnoozeNotificationFromAssistant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_getEffectsSuppressor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_matchesCallFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_isSystemConditionProviderEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_isNotificationListenerAccessGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_isNotificationListenerAccessGrantedForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_isNotificationAssistantAccessGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_setNotificationListenerAccessGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_setNotificationAssistantAccessGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_setNotificationListenerAccessGrantedForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_setNotificationAssistantAccessGrantedForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_getEnabledNotificationListenerPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_getEnabledNotificationListeners = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_getZenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
static final int TRANSACTION_getZenModeConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
static final int TRANSACTION_setZenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
static final int TRANSACTION_notifyConditions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
static final int TRANSACTION_isNotificationPolicyAccessGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
static final int TRANSACTION_getNotificationPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
static final int TRANSACTION_setNotificationPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
static final int TRANSACTION_isNotificationPolicyAccessGrantedForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
static final int TRANSACTION_setNotificationPolicyAccessGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
static final int TRANSACTION_setNotificationPolicyAccessGrantedForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
static final int TRANSACTION_getAutomaticZenRule = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
static final int TRANSACTION_getZenRules = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
static final int TRANSACTION_addAutomaticZenRule = (android.os.IBinder.FIRST_CALL_TRANSACTION + 80);
static final int TRANSACTION_updateAutomaticZenRule = (android.os.IBinder.FIRST_CALL_TRANSACTION + 81);
static final int TRANSACTION_removeAutomaticZenRule = (android.os.IBinder.FIRST_CALL_TRANSACTION + 82);
static final int TRANSACTION_removeAutomaticZenRules = (android.os.IBinder.FIRST_CALL_TRANSACTION + 83);
static final int TRANSACTION_getRuleInstanceCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 84);
static final int TRANSACTION_getBackupPayload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 85);
static final int TRANSACTION_applyRestore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 86);
static final int TRANSACTION_getAppActiveNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 87);
}
public void cancelAllNotifications(java.lang.String pkg, int userId) throws android.os.RemoteException;
public void clearData(java.lang.String pkg, int uid, boolean fromApp) throws android.os.RemoteException;
public void enqueueToast(java.lang.String pkg, android.app.ITransientNotification callback, int duration) throws android.os.RemoteException;
public void cancelToast(java.lang.String pkg, android.app.ITransientNotification callback) throws android.os.RemoteException;
public void enqueueNotificationWithTag(java.lang.String pkg, java.lang.String opPkg, java.lang.String tag, int id, android.app.Notification notification, int userId) throws android.os.RemoteException;
public void cancelNotificationWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException;
public void setShowBadge(java.lang.String pkg, int uid, boolean showBadge) throws android.os.RemoteException;
public boolean canShowBadge(java.lang.String pkg, int uid) throws android.os.RemoteException;
public void setNotificationsEnabledForPackage(java.lang.String pkg, int uid, boolean enabled) throws android.os.RemoteException;
public boolean areNotificationsEnabledForPackage(java.lang.String pkg, int uid) throws android.os.RemoteException;
public boolean areNotificationsEnabled(java.lang.String pkg) throws android.os.RemoteException;
public int getPackageImportance(java.lang.String pkg) throws android.os.RemoteException;
public void createNotificationChannelGroups(java.lang.String pkg, android.content.pm.ParceledListSlice channelGroupList) throws android.os.RemoteException;
public void createNotificationChannels(java.lang.String pkg, android.content.pm.ParceledListSlice channelsList) throws android.os.RemoteException;
public void createNotificationChannelsForPackage(java.lang.String pkg, int uid, android.content.pm.ParceledListSlice channelsList) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String pkg, int uid, boolean includeDeleted) throws android.os.RemoteException;
public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String groupId, java.lang.String pkg, int uid) throws android.os.RemoteException;
public void updateNotificationChannelForPackage(java.lang.String pkg, int uid, android.app.NotificationChannel channel) throws android.os.RemoteException;
public android.app.NotificationChannel getNotificationChannel(java.lang.String pkg, java.lang.String channelId) throws android.os.RemoteException;
public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String pkg, int uid, java.lang.String channelId, boolean includeDeleted) throws android.os.RemoteException;
public void deleteNotificationChannel(java.lang.String pkg, java.lang.String channelId) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String pkg) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String pkg, int uid, boolean includeDeleted) throws android.os.RemoteException;
public int getNumNotificationChannelsForPackage(java.lang.String pkg, int uid, boolean includeDeleted) throws android.os.RemoteException;
public int getDeletedChannelCount(java.lang.String pkg, int uid) throws android.os.RemoteException;
public void deleteNotificationChannelGroup(java.lang.String pkg, java.lang.String channelGroupId) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String pkg) throws android.os.RemoteException;
public boolean onlyHasDefaultChannel(java.lang.String pkg, int uid) throws android.os.RemoteException;
// TODO: Remove this when callers have been migrated to the equivalent
// INotificationListener method.

public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String callingPkg) throws android.os.RemoteException;
public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String callingPkg, int count) throws android.os.RemoteException;
public void registerListener(android.service.notification.INotificationListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException;
public void unregisterListener(android.service.notification.INotificationListener listener, int userid) throws android.os.RemoteException;
public void cancelNotificationFromListener(android.service.notification.INotificationListener token, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException;
public void cancelNotificationsFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys) throws android.os.RemoteException;
public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener token, java.lang.String key, java.lang.String snoozeCriterionId) throws android.os.RemoteException;
public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener token, java.lang.String key, long until) throws android.os.RemoteException;
public void requestBindListener(android.content.ComponentName component) throws android.os.RemoteException;
public void requestUnbindListener(android.service.notification.INotificationListener token) throws android.os.RemoteException;
public void requestBindProvider(android.content.ComponentName component) throws android.os.RemoteException;
public void requestUnbindProvider(android.service.notification.IConditionProvider token) throws android.os.RemoteException;
public void setNotificationsShownFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys, int trim) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener token, int trim) throws android.os.RemoteException;
public void requestHintsFromListener(android.service.notification.INotificationListener token, int hints) throws android.os.RemoteException;
public int getHintsFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException;
public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener token, int interruptionFilter) throws android.os.RemoteException;
public int getInterruptionFilterFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException;
public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener token, int trim) throws android.os.RemoteException;
public void setInterruptionFilter(java.lang.String pkg, int interruptionFilter) throws android.os.RemoteException;
public void updateNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener token, java.lang.String pkg, android.os.UserHandle user, android.app.NotificationChannel channel) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getNotificationChannelsFromPrivilegedListener(android.service.notification.INotificationListener token, java.lang.String pkg, android.os.UserHandle user) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getNotificationChannelGroupsFromPrivilegedListener(android.service.notification.INotificationListener token, java.lang.String pkg, android.os.UserHandle user) throws android.os.RemoteException;
public void applyEnqueuedAdjustmentFromAssistant(android.service.notification.INotificationListener token, android.service.notification.Adjustment adjustment) throws android.os.RemoteException;
public void applyAdjustmentFromAssistant(android.service.notification.INotificationListener token, android.service.notification.Adjustment adjustment) throws android.os.RemoteException;
public void applyAdjustmentsFromAssistant(android.service.notification.INotificationListener token, java.util.List<android.service.notification.Adjustment> adjustments) throws android.os.RemoteException;
public void unsnoozeNotificationFromAssistant(android.service.notification.INotificationListener token, java.lang.String key) throws android.os.RemoteException;
public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException;
public boolean matchesCallFilter(android.os.Bundle extras) throws android.os.RemoteException;
public boolean isSystemConditionProviderEnabled(java.lang.String path) throws android.os.RemoteException;
public boolean isNotificationListenerAccessGranted(android.content.ComponentName listener) throws android.os.RemoteException;
public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName listener, int userId) throws android.os.RemoteException;
public boolean isNotificationAssistantAccessGranted(android.content.ComponentName assistant) throws android.os.RemoteException;
public void setNotificationListenerAccessGranted(android.content.ComponentName listener, boolean enabled) throws android.os.RemoteException;
public void setNotificationAssistantAccessGranted(android.content.ComponentName assistant, boolean enabled) throws android.os.RemoteException;
public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName listener, int userId, boolean enabled) throws android.os.RemoteException;
public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName assistant, int userId, boolean enabled) throws android.os.RemoteException;
public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException;
public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int userId) throws android.os.RemoteException;
public int getZenMode() throws android.os.RemoteException;
public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException;
public void setZenMode(int mode, android.net.Uri conditionId, java.lang.String reason) throws android.os.RemoteException;
public void notifyConditions(java.lang.String pkg, android.service.notification.IConditionProvider provider, android.service.notification.Condition[] conditions) throws android.os.RemoteException;
public boolean isNotificationPolicyAccessGranted(java.lang.String pkg) throws android.os.RemoteException;
public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String pkg) throws android.os.RemoteException;
public void setNotificationPolicy(java.lang.String pkg, android.app.NotificationManager.Policy policy) throws android.os.RemoteException;
public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String pkg) throws android.os.RemoteException;
public void setNotificationPolicyAccessGranted(java.lang.String pkg, boolean granted) throws android.os.RemoteException;
public void setNotificationPolicyAccessGrantedForUser(java.lang.String pkg, int userId, boolean granted) throws android.os.RemoteException;
public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String id) throws android.os.RemoteException;
public java.util.List<android.service.notification.ZenModeConfig.ZenRule> getZenRules() throws android.os.RemoteException;
public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule automaticZenRule) throws android.os.RemoteException;
public boolean updateAutomaticZenRule(java.lang.String id, android.app.AutomaticZenRule automaticZenRule) throws android.os.RemoteException;
public boolean removeAutomaticZenRule(java.lang.String id) throws android.os.RemoteException;
public boolean removeAutomaticZenRules(java.lang.String packageName) throws android.os.RemoteException;
public int getRuleInstanceCount(android.content.ComponentName owner) throws android.os.RemoteException;
public byte[] getBackupPayload(int user) throws android.os.RemoteException;
public void applyRestore(byte[] payload, int user) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String callingPkg, int userId) throws android.os.RemoteException;
}
