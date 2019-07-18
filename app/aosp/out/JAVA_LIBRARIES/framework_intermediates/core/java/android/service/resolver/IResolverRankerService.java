/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/resolver/IResolverRankerService.aidl
 */
package android.service.resolver;
/**
 * @hide
 */
public interface IResolverRankerService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.resolver.IResolverRankerService
{
private static final java.lang.String DESCRIPTOR = "android.service.resolver.IResolverRankerService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.resolver.IResolverRankerService interface,
 * generating a proxy if needed.
 */
public static android.service.resolver.IResolverRankerService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.resolver.IResolverRankerService))) {
return ((android.service.resolver.IResolverRankerService)iin);
}
return new android.service.resolver.IResolverRankerService.Stub.Proxy(obj);
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
case TRANSACTION_predict:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.service.resolver.ResolverTarget> _arg0;
_arg0 = data.createTypedArrayList(android.service.resolver.ResolverTarget.CREATOR);
android.service.resolver.IResolverRankerResult _arg1;
_arg1 = android.service.resolver.IResolverRankerResult.Stub.asInterface(data.readStrongBinder());
this.predict(_arg0, _arg1);
return true;
}
case TRANSACTION_train:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.service.resolver.ResolverTarget> _arg0;
_arg0 = data.createTypedArrayList(android.service.resolver.ResolverTarget.CREATOR);
int _arg1;
_arg1 = data.readInt();
this.train(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.resolver.IResolverRankerService
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
@Override public void predict(java.util.List<android.service.resolver.ResolverTarget> targets, android.service.resolver.IResolverRankerResult result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(targets);
_data.writeStrongBinder((((result!=null))?(result.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_predict, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void train(java.util.List<android.service.resolver.ResolverTarget> targets, int selectedPosition) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(targets);
_data.writeInt(selectedPosition);
mRemote.transact(Stub.TRANSACTION_train, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_predict = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_train = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void predict(java.util.List<android.service.resolver.ResolverTarget> targets, android.service.resolver.IResolverRankerResult result) throws android.os.RemoteException;
public void train(java.util.List<android.service.resolver.ResolverTarget> targets, int selectedPosition) throws android.os.RemoteException;
}
