/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/trust/ITrustManager.aidl
 */
package android.app.trust;
/**
 * System private API to comunicate with trust service.
 *
 * {@hide}
 */
public interface ITrustManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.trust.ITrustManager
{
private static final java.lang.String DESCRIPTOR = "android.app.trust.ITrustManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.trust.ITrustManager interface,
 * generating a proxy if needed.
 */
public static android.app.trust.ITrustManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.trust.ITrustManager))) {
return ((android.app.trust.ITrustManager)iin);
}
return new android.app.trust.ITrustManager.Stub.Proxy(obj);
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
case TRANSACTION_reportUnlockAttempt:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.reportUnlockAttempt(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reportUnlockLockout:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.reportUnlockLockout(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reportEnabledTrustAgentsChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportEnabledTrustAgentsChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerTrustListener:
{
data.enforceInterface(DESCRIPTOR);
android.app.trust.ITrustListener _arg0;
_arg0 = android.app.trust.ITrustListener.Stub.asInterface(data.readStrongBinder());
this.registerTrustListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterTrustListener:
{
data.enforceInterface(DESCRIPTOR);
android.app.trust.ITrustListener _arg0;
_arg0 = android.app.trust.ITrustListener.Stub.asInterface(data.readStrongBinder());
this.unregisterTrustListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportKeyguardShowingChanged:
{
data.enforceInterface(DESCRIPTOR);
this.reportKeyguardShowingChanged();
reply.writeNoException();
return true;
}
case TRANSACTION_setDeviceLockedForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setDeviceLockedForUser(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isDeviceLocked:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isDeviceLocked(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDeviceSecure:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isDeviceSecure(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isTrustUsuallyManaged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isTrustUsuallyManaged(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unlockedByFingerprintForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.unlockedByFingerprintForUser(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearAllFingerprints:
{
data.enforceInterface(DESCRIPTOR);
this.clearAllFingerprints();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.trust.ITrustManager
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
@Override public void reportUnlockAttempt(boolean successful, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((successful)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_reportUnlockAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportUnlockLockout(int timeoutMs, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(timeoutMs);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_reportUnlockLockout, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportEnabledTrustAgentsChanged(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_reportEnabledTrustAgentsChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerTrustListener(android.app.trust.ITrustListener trustListener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((trustListener!=null))?(trustListener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerTrustListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterTrustListener(android.app.trust.ITrustListener trustListener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((trustListener!=null))?(trustListener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterTrustListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportKeyguardShowingChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reportKeyguardShowingChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDeviceLockedForUser(int userId, boolean locked) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeInt(((locked)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setDeviceLockedForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isDeviceLocked(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isDeviceLocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDeviceSecure(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isDeviceSecure, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isTrustUsuallyManaged(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isTrustUsuallyManaged, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void unlockedByFingerprintForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_unlockedByFingerprintForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearAllFingerprints() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearAllFingerprints, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_reportUnlockAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_reportUnlockLockout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_reportEnabledTrustAgentsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_registerTrustListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_unregisterTrustListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_reportKeyguardShowingChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setDeviceLockedForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isDeviceLocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_isDeviceSecure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_isTrustUsuallyManaged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_unlockedByFingerprintForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_clearAllFingerprints = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
}
public void reportUnlockAttempt(boolean successful, int userId) throws android.os.RemoteException;
public void reportUnlockLockout(int timeoutMs, int userId) throws android.os.RemoteException;
public void reportEnabledTrustAgentsChanged(int userId) throws android.os.RemoteException;
public void registerTrustListener(android.app.trust.ITrustListener trustListener) throws android.os.RemoteException;
public void unregisterTrustListener(android.app.trust.ITrustListener trustListener) throws android.os.RemoteException;
public void reportKeyguardShowingChanged() throws android.os.RemoteException;
public void setDeviceLockedForUser(int userId, boolean locked) throws android.os.RemoteException;
public boolean isDeviceLocked(int userId) throws android.os.RemoteException;
public boolean isDeviceSecure(int userId) throws android.os.RemoteException;
public boolean isTrustUsuallyManaged(int userId) throws android.os.RemoteException;
public void unlockedByFingerprintForUser(int userId) throws android.os.RemoteException;
public void clearAllFingerprints() throws android.os.RemoteException;
}
