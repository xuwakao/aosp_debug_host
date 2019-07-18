/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../av/camera/aidl/android/hardware/ICameraServiceListener.aidl
 */
package android.hardware;
/** @hide */
public interface ICameraServiceListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.ICameraServiceListener
{
private static final java.lang.String DESCRIPTOR = "android.hardware.ICameraServiceListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.ICameraServiceListener interface,
 * generating a proxy if needed.
 */
public static android.hardware.ICameraServiceListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.ICameraServiceListener))) {
return ((android.hardware.ICameraServiceListener)iin);
}
return new android.hardware.ICameraServiceListener.Stub.Proxy(obj);
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
case TRANSACTION_onStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.onStatusChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onTorchStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.onTorchStatusChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.ICameraServiceListener
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
@Override public void onStatusChanged(int status, java.lang.String cameraId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeString(cameraId);
mRemote.transact(Stub.TRANSACTION_onStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onTorchStatusChanged(int status, java.lang.String cameraId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeString(cameraId);
mRemote.transact(Stub.TRANSACTION_onTorchStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onTorchStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public static final int STATUS_NOT_PRESENT = 0;
public static final int STATUS_PRESENT = 1;
public static final int STATUS_ENUMERATING = 2;
public static final int STATUS_NOT_AVAILABLE = -2;
public static final int STATUS_UNKNOWN = -1;
public static final int TORCH_STATUS_NOT_AVAILABLE = 0;
public static final int TORCH_STATUS_AVAILABLE_OFF = 1;
public static final int TORCH_STATUS_AVAILABLE_ON = 2;
public static final int TORCH_STATUS_UNKNOWN = -1;
public void onStatusChanged(int status, java.lang.String cameraId) throws android.os.RemoteException;
public void onTorchStatusChanged(int status, java.lang.String cameraId) throws android.os.RemoteException;
}
