/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../native/libs/binder/aidl/android/content/pm/IPackageManagerNative.aidl
 */
package android.content.pm;
/**
 * Parallel implementation of certain {@link PackageManager} APIs that need to
 * be exposed to native code.
 * <p>These APIs are a parallel definition to the APIs in PackageManager, so,
 * they can technically diverge. However, it's good practice to keep these
 * APIs in sync with each other.
 * <p>Because these APIs are exposed to native code, it's possible they will
 * be exposed to privileged components [such as UID 0]. Care should be taken
 * to avoid exposing potential security holes for methods where permission
 * checks are bypassed based upon UID alone.
 *
 * @hide
 */
public interface IPackageManagerNative extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageManagerNative
{
private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageManagerNative";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.content.pm.IPackageManagerNative interface,
 * generating a proxy if needed.
 */
public static android.content.pm.IPackageManagerNative asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.pm.IPackageManagerNative))) {
return ((android.content.pm.IPackageManagerNative)iin);
}
return new android.content.pm.IPackageManagerNative.Stub.Proxy(obj);
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
case TRANSACTION_getNamesForUids:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.lang.String[] _result = this.getNamesForUids(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getInstallerForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getInstallerForPackage(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getVersionCodeForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getVersionCodeForPackage(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.pm.IPackageManagerNative
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
@Override public java.lang.String[] getNamesForUids(int[] uids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(uids);
mRemote.transact(Stub.TRANSACTION_getNamesForUids, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getInstallerForPackage(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getInstallerForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getVersionCodeForPackage(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getVersionCodeForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getNamesForUids = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getInstallerForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getVersionCodeForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public java.lang.String[] getNamesForUids(int[] uids) throws android.os.RemoteException;
public java.lang.String getInstallerForPackage(java.lang.String packageName) throws android.os.RemoteException;
public int getVersionCodeForPackage(java.lang.String packageName) throws android.os.RemoteException;
}
