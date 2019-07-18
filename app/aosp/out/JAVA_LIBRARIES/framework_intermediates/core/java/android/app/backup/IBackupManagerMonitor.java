/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/backup/IBackupManagerMonitor.aidl
 */
package android.app.backup;
/**
 * Callback class for receiving important events during backup/restore operations.
 * These callbacks will run on the binder thread.
 *
 * @hide
 */
public interface IBackupManagerMonitor extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.backup.IBackupManagerMonitor
{
private static final java.lang.String DESCRIPTOR = "android.app.backup.IBackupManagerMonitor";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.backup.IBackupManagerMonitor interface,
 * generating a proxy if needed.
 */
public static android.app.backup.IBackupManagerMonitor asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.backup.IBackupManagerMonitor))) {
return ((android.app.backup.IBackupManagerMonitor)iin);
}
return new android.app.backup.IBackupManagerMonitor.Stub.Proxy(obj);
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
case TRANSACTION_onEvent:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onEvent(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.backup.IBackupManagerMonitor
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
/**
   * This method will be called each time something important happens on BackupManager.
   *
   * @param event bundle will contain data about event, like package name, package version etc.
   */
@Override public void onEvent(android.os.Bundle event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
   * This method will be called each time something important happens on BackupManager.
   *
   * @param event bundle will contain data about event, like package name, package version etc.
   */
public void onEvent(android.os.Bundle event) throws android.os.RemoteException;
}
