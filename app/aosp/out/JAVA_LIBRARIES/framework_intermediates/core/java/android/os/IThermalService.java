/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IThermalService.aidl
 */
package android.os;
/**
 * {@hide}
 */
public interface IThermalService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IThermalService
{
private static final java.lang.String DESCRIPTOR = "android.os.IThermalService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IThermalService interface,
 * generating a proxy if needed.
 */
public static android.os.IThermalService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IThermalService))) {
return ((android.os.IThermalService)iin);
}
return new android.os.IThermalService.Stub.Proxy(obj);
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
case TRANSACTION_registerThermalEventListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.IThermalEventListener _arg0;
_arg0 = android.os.IThermalEventListener.Stub.asInterface(data.readStrongBinder());
this.registerThermalEventListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterThermalEventListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.IThermalEventListener _arg0;
_arg0 = android.os.IThermalEventListener.Stub.asInterface(data.readStrongBinder());
this.unregisterThermalEventListener(_arg0);
reply.writeNoException();
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
case TRANSACTION_isThrottling:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isThrottling();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IThermalService
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
      * Register a listener for thermal events.
      * @param listener the IThermalEventListener to be notified.
      * {@hide}
      */
@Override public void registerThermalEventListener(android.os.IThermalEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerThermalEventListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
      * Unregister a previously-registered listener for thermal events.
      * @param listener the IThermalEventListener to no longer be notified.
      * {@hide}
      */
@Override public void unregisterThermalEventListener(android.os.IThermalEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterThermalEventListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
      * Send a thermal throttling start/stop notification to all listeners.
      * @param temperature the temperature at which the event was generated.
      * {@hide}
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
/**
      * Return whether system performance is currently thermal throttling.
      * @return true if thermal throttling is currently in effect
      * {@hide}
      */
@Override public boolean isThrottling() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isThrottling, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerThermalEventListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterThermalEventListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_notifyThrottling = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_isThrottling = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
      * Register a listener for thermal events.
      * @param listener the IThermalEventListener to be notified.
      * {@hide}
      */
public void registerThermalEventListener(android.os.IThermalEventListener listener) throws android.os.RemoteException;
/**
      * Unregister a previously-registered listener for thermal events.
      * @param listener the IThermalEventListener to no longer be notified.
      * {@hide}
      */
public void unregisterThermalEventListener(android.os.IThermalEventListener listener) throws android.os.RemoteException;
/**
      * Send a thermal throttling start/stop notification to all listeners.
      * @param temperature the temperature at which the event was generated.
      * {@hide}
      */
public void notifyThrottling(boolean isThrottling, android.os.Temperature temperature) throws android.os.RemoteException;
/**
      * Return whether system performance is currently thermal throttling.
      * @return true if thermal throttling is currently in effect
      * {@hide}
      */
public boolean isThrottling() throws android.os.RemoteException;
}
