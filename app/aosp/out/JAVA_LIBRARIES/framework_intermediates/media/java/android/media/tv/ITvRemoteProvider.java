/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/tv/ITvRemoteProvider.aidl
 */
package android.media.tv;
/**
 * {@hide}
 */
public interface ITvRemoteProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvRemoteProvider
{
private static final java.lang.String DESCRIPTOR = "android.media.tv.ITvRemoteProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.tv.ITvRemoteProvider interface,
 * generating a proxy if needed.
 */
public static android.media.tv.ITvRemoteProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.tv.ITvRemoteProvider))) {
return ((android.media.tv.ITvRemoteProvider)iin);
}
return new android.media.tv.ITvRemoteProvider.Stub.Proxy(obj);
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
case TRANSACTION_setRemoteServiceInputSink:
{
data.enforceInterface(DESCRIPTOR);
android.media.tv.ITvRemoteServiceInput _arg0;
_arg0 = android.media.tv.ITvRemoteServiceInput.Stub.asInterface(data.readStrongBinder());
this.setRemoteServiceInputSink(_arg0);
return true;
}
case TRANSACTION_onInputBridgeConnected:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onInputBridgeConnected(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.tv.ITvRemoteProvider
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
@Override public void setRemoteServiceInputSink(android.media.tv.ITvRemoteServiceInput tvServiceInput) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((tvServiceInput!=null))?(tvServiceInput.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setRemoteServiceInputSink, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onInputBridgeConnected(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_onInputBridgeConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setRemoteServiceInputSink = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onInputBridgeConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void setRemoteServiceInputSink(android.media.tv.ITvRemoteServiceInput tvServiceInput) throws android.os.RemoteException;
public void onInputBridgeConnected(android.os.IBinder token) throws android.os.RemoteException;
}
