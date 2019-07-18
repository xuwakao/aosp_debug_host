/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../../system/update_engine/binder_bindings/android/os/IUpdateEngineCallback.aidl
 */
package android.os;
/** @hide */
public interface IUpdateEngineCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IUpdateEngineCallback
{
private static final java.lang.String DESCRIPTOR = "android.os.IUpdateEngineCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IUpdateEngineCallback interface,
 * generating a proxy if needed.
 */
public static android.os.IUpdateEngineCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IUpdateEngineCallback))) {
return ((android.os.IUpdateEngineCallback)iin);
}
return new android.os.IUpdateEngineCallback.Stub.Proxy(obj);
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
case TRANSACTION_onStatusUpdate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.onStatusUpdate(_arg0, _arg1);
return true;
}
case TRANSACTION_onPayloadApplicationComplete:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onPayloadApplicationComplete(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IUpdateEngineCallback
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
/** @hide */
@Override public void onStatusUpdate(int status_code, float percentage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status_code);
_data.writeFloat(percentage);
mRemote.transact(Stub.TRANSACTION_onStatusUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/** @hide */
@Override public void onPayloadApplicationComplete(int error_code) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(error_code);
mRemote.transact(Stub.TRANSACTION_onPayloadApplicationComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onStatusUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onPayloadApplicationComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/** @hide */
public void onStatusUpdate(int status_code, float percentage) throws android.os.RemoteException;
/** @hide */
public void onPayloadApplicationComplete(int error_code) throws android.os.RemoteException;
}
