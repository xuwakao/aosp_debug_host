/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/packages/services/Proxy/com/android/net/IProxyCallback.aidl
 */
package com.android.net;
/** @hide */
public interface IProxyCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.net.IProxyCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.net.IProxyCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.net.IProxyCallback interface,
 * generating a proxy if needed.
 */
public static com.android.net.IProxyCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.net.IProxyCallback))) {
return ((com.android.net.IProxyCallback)iin);
}
return new com.android.net.IProxyCallback.Stub.Proxy(obj);
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
case TRANSACTION_getProxyPort:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.getProxyPort(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.net.IProxyCallback
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
@Override public void getProxyPort(android.os.IBinder callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callback);
mRemote.transact(Stub.TRANSACTION_getProxyPort, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getProxyPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void getProxyPort(android.os.IBinder callback) throws android.os.RemoteException;
}
