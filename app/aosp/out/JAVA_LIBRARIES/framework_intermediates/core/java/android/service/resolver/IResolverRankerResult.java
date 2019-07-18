/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/resolver/IResolverRankerResult.aidl
 */
package android.service.resolver;
/**
 * @hide
 */
public interface IResolverRankerResult extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.resolver.IResolverRankerResult
{
private static final java.lang.String DESCRIPTOR = "android.service.resolver.IResolverRankerResult";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.resolver.IResolverRankerResult interface,
 * generating a proxy if needed.
 */
public static android.service.resolver.IResolverRankerResult asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.resolver.IResolverRankerResult))) {
return ((android.service.resolver.IResolverRankerResult)iin);
}
return new android.service.resolver.IResolverRankerResult.Stub.Proxy(obj);
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
case TRANSACTION_sendResult:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.service.resolver.ResolverTarget> _arg0;
_arg0 = data.createTypedArrayList(android.service.resolver.ResolverTarget.CREATOR);
this.sendResult(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.resolver.IResolverRankerResult
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
@Override public void sendResult(java.util.List<android.service.resolver.ResolverTarget> results) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(results);
mRemote.transact(Stub.TRANSACTION_sendResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_sendResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void sendResult(java.util.List<android.service.resolver.ResolverTarget> results) throws android.os.RemoteException;
}
