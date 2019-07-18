/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IHardwarePropertiesManager.aidl
 */
package android.os;
/** @hide */
public interface IHardwarePropertiesManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IHardwarePropertiesManager
{
private static final java.lang.String DESCRIPTOR = "android.os.IHardwarePropertiesManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IHardwarePropertiesManager interface,
 * generating a proxy if needed.
 */
public static android.os.IHardwarePropertiesManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IHardwarePropertiesManager))) {
return ((android.os.IHardwarePropertiesManager)iin);
}
return new android.os.IHardwarePropertiesManager.Stub.Proxy(obj);
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
case TRANSACTION_getDeviceTemperatures:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
float[] _result = this.getDeviceTemperatures(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeFloatArray(_result);
return true;
}
case TRANSACTION_getCpuUsages:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.CpuUsageInfo[] _result = this.getCpuUsages(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getFanSpeeds:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
float[] _result = this.getFanSpeeds(_arg0);
reply.writeNoException();
reply.writeFloatArray(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IHardwarePropertiesManager
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
@Override public float[] getDeviceTemperatures(java.lang.String callingPackage, int type, int source) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(type);
_data.writeInt(source);
mRemote.transact(Stub.TRANSACTION_getDeviceTemperatures, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.CpuUsageInfo[] getCpuUsages(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.CpuUsageInfo[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCpuUsages, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.os.CpuUsageInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public float[] getFanSpeeds(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getFanSpeeds, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getDeviceTemperatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCpuUsages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getFanSpeeds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public float[] getDeviceTemperatures(java.lang.String callingPackage, int type, int source) throws android.os.RemoteException;
public android.os.CpuUsageInfo[] getCpuUsages(java.lang.String callingPackage) throws android.os.RemoteException;
public float[] getFanSpeeds(java.lang.String callingPackage) throws android.os.RemoteException;
}
