/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IAlarmListener.aidl
 */
package android.app;
/**
 * System private API for direct alarm callbacks (non-broadcast deliver).  See the
 * AlarmManager#set() variants that take an AlarmReceiver callback object
 * rather than a PendingIntent.
 *
 * {@hide}
 */
public interface IAlarmListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IAlarmListener
{
private static final java.lang.String DESCRIPTOR = "android.app.IAlarmListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IAlarmListener interface,
 * generating a proxy if needed.
 */
public static android.app.IAlarmListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IAlarmListener))) {
return ((android.app.IAlarmListener)iin);
}
return new android.app.IAlarmListener.Stub.Proxy(obj);
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
case TRANSACTION_doAlarm:
{
data.enforceInterface(DESCRIPTOR);
android.app.IAlarmCompleteListener _arg0;
_arg0 = android.app.IAlarmCompleteListener.Stub.asInterface(data.readStrongBinder());
this.doAlarm(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IAlarmListener
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
@Override public void doAlarm(android.app.IAlarmCompleteListener callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_doAlarm, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_doAlarm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void doAlarm(android.app.IAlarmCompleteListener callback) throws android.os.RemoteException;
}
