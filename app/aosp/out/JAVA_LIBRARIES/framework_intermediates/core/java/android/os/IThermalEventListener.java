/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IThermalEventListener.aidl
 */
package android.os;
/**
 * Listener for thermal events.
 * {@hide}
 */
public interface IThermalEventListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IThermalEventListener
{
private static final java.lang.String DESCRIPTOR = "android.os.IThermalEventListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IThermalEventListener interface,
 * generating a proxy if needed.
 */
public static android.os.IThermalEventListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IThermalEventListener))) {
return ((android.os.IThermalEventListener)iin);
}
return new android.os.IThermalEventListener.Stub.Proxy(obj);
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
case TRANSACTION_notifyThrottling:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.os.Temperature _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Temperature.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.notifyThrottling(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IThermalEventListener
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
     * Called when a thermal throttling start/stop event is received.
     * @param temperature the temperature at which the event was generated.
     */
@Override public void notifyThrottling(boolean isThrottling, android.os.Temperature temperature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isThrottling)?(1):(0)));
if ((temperature!=null)) {
_data.writeInt(1);
temperature.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyThrottling, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_notifyThrottling = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Called when a thermal throttling start/stop event is received.
     * @param temperature the temperature at which the event was generated.
     */
public void notifyThrottling(boolean isThrottling, android.os.Temperature temperature) throws android.os.RemoteException;
}
