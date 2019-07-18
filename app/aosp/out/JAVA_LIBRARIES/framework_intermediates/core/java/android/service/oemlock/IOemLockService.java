/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/oemlock/IOemLockService.aidl
 */
package android.service.oemlock;
/**
 * Interface for communication with the OemLockService.
 *
 * @hide
 */
public interface IOemLockService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.oemlock.IOemLockService
{
private static final java.lang.String DESCRIPTOR = "android.service.oemlock.IOemLockService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.oemlock.IOemLockService interface,
 * generating a proxy if needed.
 */
public static android.service.oemlock.IOemLockService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.oemlock.IOemLockService))) {
return ((android.service.oemlock.IOemLockService)iin);
}
return new android.service.oemlock.IOemLockService.Stub.Proxy(obj);
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
case TRANSACTION_setOemUnlockAllowedByCarrier:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
byte[] _arg1;
_arg1 = data.createByteArray();
this.setOemUnlockAllowedByCarrier(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isOemUnlockAllowedByCarrier:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isOemUnlockAllowedByCarrier();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setOemUnlockAllowedByUser:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setOemUnlockAllowedByUser(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isOemUnlockAllowedByUser:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isOemUnlockAllowedByUser();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isOemUnlockAllowed:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isOemUnlockAllowed();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDeviceOemUnlocked:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDeviceOemUnlocked();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.oemlock.IOemLockService
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
@Override public void setOemUnlockAllowedByCarrier(boolean allowed, byte[] signature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((allowed)?(1):(0)));
_data.writeByteArray(signature);
mRemote.transact(Stub.TRANSACTION_setOemUnlockAllowedByCarrier, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isOemUnlockAllowedByCarrier, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setOemUnlockAllowedByUser(boolean allowed) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((allowed)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setOemUnlockAllowedByUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isOemUnlockAllowedByUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isOemUnlockAllowed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isOemUnlockAllowed, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDeviceOemUnlocked() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDeviceOemUnlocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setOemUnlockAllowedByCarrier = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_isOemUnlockAllowedByCarrier = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setOemUnlockAllowedByUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_isOemUnlockAllowedByUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isOemUnlockAllowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_isDeviceOemUnlocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void setOemUnlockAllowedByCarrier(boolean allowed, byte[] signature) throws android.os.RemoteException;
public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException;
public void setOemUnlockAllowedByUser(boolean allowed) throws android.os.RemoteException;
public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException;
public boolean isOemUnlockAllowed() throws android.os.RemoteException;
public boolean isDeviceOemUnlocked() throws android.os.RemoteException;
}
