/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../av/camera/aidl/android/hardware/ICameraServiceProxy.aidl
 */
package android.hardware;
/**
 * Binder interface for the camera service proxy running in system_server.
 *
 * Keep in sync with frameworks/av/include/camera/ICameraServiceProxy.h
 *
 * @hide
 */
public interface ICameraServiceProxy extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.ICameraServiceProxy
{
private static final java.lang.String DESCRIPTOR = "android.hardware.ICameraServiceProxy";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.ICameraServiceProxy interface,
 * generating a proxy if needed.
 */
public static android.hardware.ICameraServiceProxy asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.ICameraServiceProxy))) {
return ((android.hardware.ICameraServiceProxy)iin);
}
return new android.hardware.ICameraServiceProxy.Stub.Proxy(obj);
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
case TRANSACTION_pingForUserUpdate:
{
data.enforceInterface(DESCRIPTOR);
this.pingForUserUpdate();
return true;
}
case TRANSACTION_notifyCameraState:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
this.notifyCameraState(_arg0, _arg1, _arg2, _arg3);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.ICameraServiceProxy
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
     * Ping the service proxy to update the valid users for the camera service.
     */
@Override public void pingForUserUpdate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pingForUserUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Update the status of a camera device.
     */
@Override public void notifyCameraState(java.lang.String cameraId, int facing, int newCameraState, java.lang.String clientName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(cameraId);
_data.writeInt(facing);
_data.writeInt(newCameraState);
_data.writeString(clientName);
mRemote.transact(Stub.TRANSACTION_notifyCameraState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_pingForUserUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_notifyCameraState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public static final int CAMERA_STATE_OPEN = 0;
public static final int CAMERA_STATE_ACTIVE = 1;
public static final int CAMERA_STATE_IDLE = 2;
public static final int CAMERA_STATE_CLOSED = 3;
public static final int CAMERA_FACING_BACK = 0;
public static final int CAMERA_FACING_FRONT = 1;
public static final int CAMERA_FACING_EXTERNAL = 2;
/**
     * Ping the service proxy to update the valid users for the camera service.
     */
public void pingForUserUpdate() throws android.os.RemoteException;
/**
     * Update the status of a camera device.
     */
public void notifyCameraState(java.lang.String cameraId, int facing, int newCameraState, java.lang.String clientName) throws android.os.RemoteException;
}
