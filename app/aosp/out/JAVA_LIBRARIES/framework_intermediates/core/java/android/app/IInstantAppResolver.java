/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IInstantAppResolver.aidl
 */
package android.app;
/** @hide */
public interface IInstantAppResolver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IInstantAppResolver
{
private static final java.lang.String DESCRIPTOR = "android.app.IInstantAppResolver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IInstantAppResolver interface,
 * generating a proxy if needed.
 */
public static android.app.IInstantAppResolver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IInstantAppResolver))) {
return ((android.app.IInstantAppResolver)iin);
}
return new android.app.IInstantAppResolver.Stub.Proxy(obj);
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
case TRANSACTION_getInstantAppResolveInfoList:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
android.os.IRemoteCallback _arg3;
_arg3 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
this.getInstantAppResolveInfoList(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_getInstantAppIntentFilterList:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.IRemoteCallback _arg3;
_arg3 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
this.getInstantAppIntentFilterList(_arg0, _arg1, _arg2, _arg3);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IInstantAppResolver
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
@Override public void getInstantAppResolveInfoList(int[] digestPrefix, java.lang.String token, int sequence, android.os.IRemoteCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(digestPrefix);
_data.writeString(token);
_data.writeInt(sequence);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getInstantAppResolveInfoList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getInstantAppIntentFilterList(int[] digestPrefix, java.lang.String token, java.lang.String hostName, android.os.IRemoteCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(digestPrefix);
_data.writeString(token);
_data.writeString(hostName);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getInstantAppIntentFilterList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getInstantAppResolveInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getInstantAppIntentFilterList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void getInstantAppResolveInfoList(int[] digestPrefix, java.lang.String token, int sequence, android.os.IRemoteCallback callback) throws android.os.RemoteException;
public void getInstantAppIntentFilterList(int[] digestPrefix, java.lang.String token, java.lang.String hostName, android.os.IRemoteCallback callback) throws android.os.RemoteException;
}
