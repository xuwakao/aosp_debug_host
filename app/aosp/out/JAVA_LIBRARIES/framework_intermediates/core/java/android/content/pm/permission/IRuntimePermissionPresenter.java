/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/content/pm/permission/IRuntimePermissionPresenter.aidl
 */
package android.content.pm.permission;
/**
 * Interface for communication with the permission presenter service.
 *
 * @hide
 */
public interface IRuntimePermissionPresenter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.pm.permission.IRuntimePermissionPresenter
{
private static final java.lang.String DESCRIPTOR = "android.content.pm.permission.IRuntimePermissionPresenter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.content.pm.permission.IRuntimePermissionPresenter interface,
 * generating a proxy if needed.
 */
public static android.content.pm.permission.IRuntimePermissionPresenter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.pm.permission.IRuntimePermissionPresenter))) {
return ((android.content.pm.permission.IRuntimePermissionPresenter)iin);
}
return new android.content.pm.permission.IRuntimePermissionPresenter.Stub.Proxy(obj);
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
case TRANSACTION_getAppPermissions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.RemoteCallback _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.RemoteCallback.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.getAppPermissions(_arg0, _arg1);
return true;
}
case TRANSACTION_revokeRuntimePermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.revokeRuntimePermission(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.pm.permission.IRuntimePermissionPresenter
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
@Override public void getAppPermissions(java.lang.String packageName, android.os.RemoteCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((callback!=null)) {
_data.writeInt(1);
callback.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAppPermissions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void revokeRuntimePermission(java.lang.String packageName, java.lang.String permissionName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeString(permissionName);
mRemote.transact(Stub.TRANSACTION_revokeRuntimePermission, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getAppPermissions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_revokeRuntimePermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void getAppPermissions(java.lang.String packageName, android.os.RemoteCallback callback) throws android.os.RemoteException;
public void revokeRuntimePermission(java.lang.String packageName, java.lang.String permissionName) throws android.os.RemoteException;
}
