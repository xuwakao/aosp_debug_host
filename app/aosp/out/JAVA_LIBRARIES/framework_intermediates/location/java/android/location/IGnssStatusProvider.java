/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/location/java/android/location/IGnssStatusProvider.aidl
 */
package android.location;
/**
 * An interface for location providers that provide GNSS status information.
 *
 * {@hide}
 */
public interface IGnssStatusProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.IGnssStatusProvider
{
private static final java.lang.String DESCRIPTOR = "android.location.IGnssStatusProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.IGnssStatusProvider interface,
 * generating a proxy if needed.
 */
public static android.location.IGnssStatusProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.IGnssStatusProvider))) {
return ((android.location.IGnssStatusProvider)iin);
}
return new android.location.IGnssStatusProvider.Stub.Proxy(obj);
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
case TRANSACTION_registerGnssStatusCallback:
{
data.enforceInterface(DESCRIPTOR);
android.location.IGnssStatusListener _arg0;
_arg0 = android.location.IGnssStatusListener.Stub.asInterface(data.readStrongBinder());
this.registerGnssStatusCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterGnssStatusCallback:
{
data.enforceInterface(DESCRIPTOR);
android.location.IGnssStatusListener _arg0;
_arg0 = android.location.IGnssStatusListener.Stub.asInterface(data.readStrongBinder());
this.unregisterGnssStatusCallback(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.IGnssStatusProvider
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
@Override public void registerGnssStatusCallback(android.location.IGnssStatusListener callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerGnssStatusCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterGnssStatusCallback(android.location.IGnssStatusListener callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterGnssStatusCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerGnssStatusCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterGnssStatusCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void registerGnssStatusCallback(android.location.IGnssStatusListener callback) throws android.os.RemoteException;
public void unregisterGnssStatusCallback(android.location.IGnssStatusListener callback) throws android.os.RemoteException;
}
