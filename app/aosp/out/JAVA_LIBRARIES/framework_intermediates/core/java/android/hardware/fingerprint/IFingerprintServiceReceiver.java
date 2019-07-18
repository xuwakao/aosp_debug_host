/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/fingerprint/IFingerprintServiceReceiver.aidl
 */
package android.hardware.fingerprint;
/**
 * Communication channel from the FingerprintService back to FingerprintManager.
 * @hide
 */
public interface IFingerprintServiceReceiver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintServiceReceiver
{
private static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintServiceReceiver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.fingerprint.IFingerprintServiceReceiver interface,
 * generating a proxy if needed.
 */
public static android.hardware.fingerprint.IFingerprintServiceReceiver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.fingerprint.IFingerprintServiceReceiver))) {
return ((android.hardware.fingerprint.IFingerprintServiceReceiver)iin);
}
return new android.hardware.fingerprint.IFingerprintServiceReceiver.Stub.Proxy(obj);
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
case TRANSACTION_onEnrollResult:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onEnrollResult(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onAcquired:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onAcquired(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onAuthenticationSucceeded:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.hardware.fingerprint.Fingerprint _arg1;
if ((0!=data.readInt())) {
_arg1 = android.hardware.fingerprint.Fingerprint.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.onAuthenticationSucceeded(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onAuthenticationFailed:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.onAuthenticationFailed(_arg0);
return true;
}
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onError(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onRemoved:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onRemoved(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onEnumerated:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onEnumerated(_arg0, _arg1, _arg2, _arg3);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.fingerprint.IFingerprintServiceReceiver
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
@Override public void onEnrollResult(long deviceId, int fingerId, int groupId, int remaining) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(fingerId);
_data.writeInt(groupId);
_data.writeInt(remaining);
mRemote.transact(Stub.TRANSACTION_onEnrollResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAcquired(long deviceId, int acquiredInfo, int vendorCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(acquiredInfo);
_data.writeInt(vendorCode);
mRemote.transact(Stub.TRANSACTION_onAcquired, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAuthenticationSucceeded(long deviceId, android.hardware.fingerprint.Fingerprint fp, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
if ((fp!=null)) {
_data.writeInt(1);
fp.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_onAuthenticationSucceeded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAuthenticationFailed(long deviceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
mRemote.transact(Stub.TRANSACTION_onAuthenticationFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onError(long deviceId, int error, int vendorCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(error);
_data.writeInt(vendorCode);
mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRemoved(long deviceId, int fingerId, int groupId, int remaining) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(fingerId);
_data.writeInt(groupId);
_data.writeInt(remaining);
mRemote.transact(Stub.TRANSACTION_onRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onEnumerated(long deviceId, int fingerId, int groupId, int remaining) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(fingerId);
_data.writeInt(groupId);
_data.writeInt(remaining);
mRemote.transact(Stub.TRANSACTION_onEnumerated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onEnrollResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onAcquired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onAuthenticationSucceeded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onAuthenticationFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onEnumerated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void onEnrollResult(long deviceId, int fingerId, int groupId, int remaining) throws android.os.RemoteException;
public void onAcquired(long deviceId, int acquiredInfo, int vendorCode) throws android.os.RemoteException;
public void onAuthenticationSucceeded(long deviceId, android.hardware.fingerprint.Fingerprint fp, int userId) throws android.os.RemoteException;
public void onAuthenticationFailed(long deviceId) throws android.os.RemoteException;
public void onError(long deviceId, int error, int vendorCode) throws android.os.RemoteException;
public void onRemoved(long deviceId, int fingerId, int groupId, int remaining) throws android.os.RemoteException;
public void onEnumerated(long deviceId, int fingerId, int groupId, int remaining) throws android.os.RemoteException;
}
