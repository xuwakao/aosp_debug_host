/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/notification/INotificationListener.aidl
 */
package android.service.notification;
/** @hide */
public interface INotificationListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.notification.INotificationListener
{
private static final java.lang.String DESCRIPTOR = "android.service.notification.INotificationListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.notification.INotificationListener interface,
 * generating a proxy if needed.
 */
public static android.service.notification.INotificationListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.notification.INotificationListener))) {
return ((android.service.notification.INotificationListener)iin);
}
return new android.service.notification.INotificationListener.Stub.Proxy(obj);
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
case TRANSACTION_onListenerConnected:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.NotificationRankingUpdate _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.notification.NotificationRankingUpdate.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onListenerConnected(_arg0);
return true;
}
case TRANSACTION_onNotificationPosted:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IStatusBarNotificationHolder _arg0;
_arg0 = android.service.notification.IStatusBarNotificationHolder.Stub.asInterface(data.readStrongBinder());
android.service.notification.NotificationRankingUpdate _arg1;
if ((0!=data.readInt())) {
_arg1 = android.service.notification.NotificationRankingUpdate.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onNotificationPosted(_arg0, _arg1);
return true;
}
case TRANSACTION_onNotificationRemoved:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IStatusBarNotificationHolder _arg0;
_arg0 = android.service.notification.IStatusBarNotificationHolder.Stub.asInterface(data.readStrongBinder());
android.service.notification.NotificationRankingUpdate _arg1;
if ((0!=data.readInt())) {
_arg1 = android.service.notification.NotificationRankingUpdate.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.onNotificationRemoved(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onNotificationRankingUpdate:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.NotificationRankingUpdate _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.notification.NotificationRankingUpdate.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onNotificationRankingUpdate(_arg0);
return true;
}
case TRANSACTION_onListenerHintsChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onListenerHintsChanged(_arg0);
return true;
}
case TRANSACTION_onInterruptionFilterChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onInterruptionFilterChanged(_arg0);
return true;
}
case TRANSACTION_onNotificationChannelModification:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.app.NotificationChannel _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.NotificationChannel.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
this.onNotificationChannelModification(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onNotificationChannelGroupModification:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.app.NotificationChannelGroup _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.NotificationChannelGroup.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
this.onNotificationChannelGroupModification(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onNotificationEnqueued:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IStatusBarNotificationHolder _arg0;
_arg0 = android.service.notification.IStatusBarNotificationHolder.Stub.asInterface(data.readStrongBinder());
this.onNotificationEnqueued(_arg0);
return true;
}
case TRANSACTION_onNotificationSnoozedUntilContext:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IStatusBarNotificationHolder _arg0;
_arg0 = android.service.notification.IStatusBarNotificationHolder.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
this.onNotificationSnoozedUntilContext(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.notification.INotificationListener
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
// listeners and rankers

@Override public void onListenerConnected(android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((update!=null)) {
_data.writeInt(1);
update.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onListenerConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationPosted(android.service.notification.IStatusBarNotificationHolder notificationHolder, android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((notificationHolder!=null))?(notificationHolder.asBinder()):(null)));
if ((update!=null)) {
_data.writeInt(1);
update.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onNotificationPosted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationRemoved(android.service.notification.IStatusBarNotificationHolder notificationHolder, android.service.notification.NotificationRankingUpdate update, int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((notificationHolder!=null))?(notificationHolder.asBinder()):(null)));
if ((update!=null)) {
_data.writeInt(1);
update.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onNotificationRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationRankingUpdate(android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((update!=null)) {
_data.writeInt(1);
update.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onNotificationRankingUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onListenerHintsChanged(int hints) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(hints);
mRemote.transact(Stub.TRANSACTION_onListenerHintsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onInterruptionFilterChanged(int interruptionFilter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(interruptionFilter);
mRemote.transact(Stub.TRANSACTION_onInterruptionFilterChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// companion device managers only

@Override public void onNotificationChannelModification(java.lang.String pkgName, android.os.UserHandle user, android.app.NotificationChannel channel, int modificationType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkgName);
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
_data.writeInt(modificationType);
mRemote.transact(Stub.TRANSACTION_onNotificationChannelModification, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationChannelGroupModification(java.lang.String pkgName, android.os.UserHandle user, android.app.NotificationChannelGroup group, int modificationType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkgName);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((group!=null)) {
_data.writeInt(1);
group.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(modificationType);
mRemote.transact(Stub.TRANSACTION_onNotificationChannelGroupModification, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// rankers only

@Override public void onNotificationEnqueued(android.service.notification.IStatusBarNotificationHolder notificationHolder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((notificationHolder!=null))?(notificationHolder.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onNotificationEnqueued, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationSnoozedUntilContext(android.service.notification.IStatusBarNotificationHolder notificationHolder, java.lang.String snoozeCriterionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((notificationHolder!=null))?(notificationHolder.asBinder()):(null)));
_data.writeString(snoozeCriterionId);
mRemote.transact(Stub.TRANSACTION_onNotificationSnoozedUntilContext, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onListenerConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onNotificationPosted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onNotificationRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onNotificationRankingUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onListenerHintsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onInterruptionFilterChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onNotificationChannelModification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onNotificationChannelGroupModification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onNotificationEnqueued = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onNotificationSnoozedUntilContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
// listeners and rankers

public void onListenerConnected(android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException;
public void onNotificationPosted(android.service.notification.IStatusBarNotificationHolder notificationHolder, android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException;
public void onNotificationRemoved(android.service.notification.IStatusBarNotificationHolder notificationHolder, android.service.notification.NotificationRankingUpdate update, int reason) throws android.os.RemoteException;
public void onNotificationRankingUpdate(android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException;
public void onListenerHintsChanged(int hints) throws android.os.RemoteException;
public void onInterruptionFilterChanged(int interruptionFilter) throws android.os.RemoteException;
// companion device managers only

public void onNotificationChannelModification(java.lang.String pkgName, android.os.UserHandle user, android.app.NotificationChannel channel, int modificationType) throws android.os.RemoteException;
public void onNotificationChannelGroupModification(java.lang.String pkgName, android.os.UserHandle user, android.app.NotificationChannelGroup group, int modificationType) throws android.os.RemoteException;
// rankers only

public void onNotificationEnqueued(android.service.notification.IStatusBarNotificationHolder notificationHolder) throws android.os.RemoteException;
public void onNotificationSnoozedUntilContext(android.service.notification.IStatusBarNotificationHolder notificationHolder, java.lang.String snoozeCriterionId) throws android.os.RemoteException;
}
