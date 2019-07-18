/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/widget/ILockSettings.aidl
 */
package com.android.internal.widget;
/** {@hide} */
public interface ILockSettings extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.widget.ILockSettings
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.widget.ILockSettings";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.widget.ILockSettings interface,
 * generating a proxy if needed.
 */
public static com.android.internal.widget.ILockSettings asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.widget.ILockSettings))) {
return ((com.android.internal.widget.ILockSettings)iin);
}
return new com.android.internal.widget.ILockSettings.Stub.Proxy(obj);
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
case TRANSACTION_setBoolean:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.setBoolean(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setLong:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.setLong(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.setString(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getBoolean:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
boolean _result = this.getBoolean(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLong:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
long _result = this.getLong(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.String _result = this.getString(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setLockCredential:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.setLockCredential(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_resetKeyStore:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.resetKeyStore(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_checkCredential:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
com.android.internal.widget.ICheckCredentialProgressCallback _arg3;
_arg3 = com.android.internal.widget.ICheckCredentialProgressCallback.Stub.asInterface(data.readStrongBinder());
com.android.internal.widget.VerifyCredentialResponse _result = this.checkCredential(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_verifyCredential:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
com.android.internal.widget.VerifyCredentialResponse _result = this.verifyCredential(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_verifyTiedProfileChallenge:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
com.android.internal.widget.VerifyCredentialResponse _result = this.verifyTiedProfileChallenge(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_checkVoldPassword:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.checkVoldPassword(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_havePattern:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.havePattern(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_havePassword:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.havePassword(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setSeparateProfileChallengeEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
java.lang.String _arg2;
_arg2 = data.readString();
this.setSeparateProfileChallengeEnabled(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getSeparateProfileChallengeEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.getSeparateProfileChallengeEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerStrongAuthTracker:
{
data.enforceInterface(DESCRIPTOR);
android.app.trust.IStrongAuthTracker _arg0;
_arg0 = android.app.trust.IStrongAuthTracker.Stub.asInterface(data.readStrongBinder());
this.registerStrongAuthTracker(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterStrongAuthTracker:
{
data.enforceInterface(DESCRIPTOR);
android.app.trust.IStrongAuthTracker _arg0;
_arg0 = android.app.trust.IStrongAuthTracker.Stub.asInterface(data.readStrongBinder());
this.unregisterStrongAuthTracker(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requireStrongAuth:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.requireStrongAuth(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_systemReady:
{
data.enforceInterface(DESCRIPTOR);
this.systemReady();
reply.writeNoException();
return true;
}
case TRANSACTION_userPresent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.userPresent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getStrongAuthForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getStrongAuthForUser(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_addEscrowToken:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
long _result = this.addEscrowToken(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_removeEscrowToken:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.removeEscrowToken(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isEscrowTokenActive:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isEscrowTokenActive(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setLockCredentialWithToken:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
byte[] _arg3;
_arg3 = data.createByteArray();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
boolean _result = this.setLockCredentialWithToken(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unlockUserWithToken:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
byte[] _arg1;
_arg1 = data.createByteArray();
int _arg2;
_arg2 = data.readInt();
this.unlockUserWithToken(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.widget.ILockSettings
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
@Override public void setBoolean(java.lang.String key, boolean value, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(((value)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setBoolean, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setLong(java.lang.String key, long value, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeLong(value);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setLong, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setString(java.lang.String key, java.lang.String value, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(value);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setString, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getBoolean(java.lang.String key, boolean defaultValue, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(((defaultValue)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getBoolean, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getLong(java.lang.String key, long defaultValue, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeLong(defaultValue);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getLong, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getString(java.lang.String key, java.lang.String defaultValue, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(defaultValue);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setLockCredential(java.lang.String credential, int type, java.lang.String savedCredential, int requestedQuality, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(credential);
_data.writeInt(type);
_data.writeString(savedCredential);
_data.writeInt(requestedQuality);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setLockCredential, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void resetKeyStore(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_resetKeyStore, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.internal.widget.VerifyCredentialResponse checkCredential(java.lang.String credential, int type, int userId, com.android.internal.widget.ICheckCredentialProgressCallback progressCallback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.widget.VerifyCredentialResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(credential);
_data.writeInt(type);
_data.writeInt(userId);
_data.writeStrongBinder((((progressCallback!=null))?(progressCallback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_checkCredential, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.widget.VerifyCredentialResponse.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.internal.widget.VerifyCredentialResponse verifyCredential(java.lang.String credential, int type, long challenge, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.widget.VerifyCredentialResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(credential);
_data.writeInt(type);
_data.writeLong(challenge);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_verifyCredential, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.widget.VerifyCredentialResponse.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.internal.widget.VerifyCredentialResponse verifyTiedProfileChallenge(java.lang.String credential, int type, long challenge, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.widget.VerifyCredentialResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(credential);
_data.writeInt(type);
_data.writeLong(challenge);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_verifyTiedProfileChallenge, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.widget.VerifyCredentialResponse.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean checkVoldPassword(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_checkVoldPassword, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean havePattern(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_havePattern, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean havePassword(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_havePassword, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setSeparateProfileChallengeEnabled(int userId, boolean enabled, java.lang.String managedUserPassword) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeInt(((enabled)?(1):(0)));
_data.writeString(managedUserPassword);
mRemote.transact(Stub.TRANSACTION_setSeparateProfileChallengeEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getSeparateProfileChallengeEnabled(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getSeparateProfileChallengeEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerStrongAuthTracker(android.app.trust.IStrongAuthTracker tracker) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((tracker!=null))?(tracker.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerStrongAuthTracker, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterStrongAuthTracker(android.app.trust.IStrongAuthTracker tracker) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((tracker!=null))?(tracker.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterStrongAuthTracker, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requireStrongAuth(int strongAuthReason, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(strongAuthReason);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_requireStrongAuth, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void systemReady() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_systemReady, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void userPresent(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_userPresent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getStrongAuthForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getStrongAuthForUser, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long addEscrowToken(byte[] token, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(token);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_addEscrowToken, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeEscrowToken(long handle, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_removeEscrowToken, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isEscrowTokenActive(long handle, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isEscrowTokenActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setLockCredentialWithToken(java.lang.String credential, int type, long tokenHandle, byte[] token, int requestedQuality, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(credential);
_data.writeInt(type);
_data.writeLong(tokenHandle);
_data.writeByteArray(token);
_data.writeInt(requestedQuality);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setLockCredentialWithToken, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void unlockUserWithToken(long tokenHandle, byte[] token, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(tokenHandle);
_data.writeByteArray(token);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_unlockUserWithToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setBoolean = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setLong = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getBoolean = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getLong = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setLockCredential = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_resetKeyStore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_checkCredential = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_verifyCredential = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_verifyTiedProfileChallenge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_checkVoldPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_havePattern = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_havePassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setSeparateProfileChallengeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getSeparateProfileChallengeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_registerStrongAuthTracker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_unregisterStrongAuthTracker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_requireStrongAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_systemReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_userPresent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getStrongAuthForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_addEscrowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_removeEscrowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_isEscrowTokenActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_setLockCredentialWithToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_unlockUserWithToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
}
public void setBoolean(java.lang.String key, boolean value, int userId) throws android.os.RemoteException;
public void setLong(java.lang.String key, long value, int userId) throws android.os.RemoteException;
public void setString(java.lang.String key, java.lang.String value, int userId) throws android.os.RemoteException;
public boolean getBoolean(java.lang.String key, boolean defaultValue, int userId) throws android.os.RemoteException;
public long getLong(java.lang.String key, long defaultValue, int userId) throws android.os.RemoteException;
public java.lang.String getString(java.lang.String key, java.lang.String defaultValue, int userId) throws android.os.RemoteException;
public void setLockCredential(java.lang.String credential, int type, java.lang.String savedCredential, int requestedQuality, int userId) throws android.os.RemoteException;
public void resetKeyStore(int userId) throws android.os.RemoteException;
public com.android.internal.widget.VerifyCredentialResponse checkCredential(java.lang.String credential, int type, int userId, com.android.internal.widget.ICheckCredentialProgressCallback progressCallback) throws android.os.RemoteException;
public com.android.internal.widget.VerifyCredentialResponse verifyCredential(java.lang.String credential, int type, long challenge, int userId) throws android.os.RemoteException;
public com.android.internal.widget.VerifyCredentialResponse verifyTiedProfileChallenge(java.lang.String credential, int type, long challenge, int userId) throws android.os.RemoteException;
public boolean checkVoldPassword(int userId) throws android.os.RemoteException;
public boolean havePattern(int userId) throws android.os.RemoteException;
public boolean havePassword(int userId) throws android.os.RemoteException;
public void setSeparateProfileChallengeEnabled(int userId, boolean enabled, java.lang.String managedUserPassword) throws android.os.RemoteException;
public boolean getSeparateProfileChallengeEnabled(int userId) throws android.os.RemoteException;
public void registerStrongAuthTracker(android.app.trust.IStrongAuthTracker tracker) throws android.os.RemoteException;
public void unregisterStrongAuthTracker(android.app.trust.IStrongAuthTracker tracker) throws android.os.RemoteException;
public void requireStrongAuth(int strongAuthReason, int userId) throws android.os.RemoteException;
public void systemReady() throws android.os.RemoteException;
public void userPresent(int userId) throws android.os.RemoteException;
public int getStrongAuthForUser(int userId) throws android.os.RemoteException;
public long addEscrowToken(byte[] token, int userId) throws android.os.RemoteException;
public boolean removeEscrowToken(long handle, int userId) throws android.os.RemoteException;
public boolean isEscrowTokenActive(long handle, int userId) throws android.os.RemoteException;
public boolean setLockCredentialWithToken(java.lang.String credential, int type, long tokenHandle, byte[] token, int requestedQuality, int userId) throws android.os.RemoteException;
public void unlockUserWithToken(long tokenHandle, byte[] token, int userId) throws android.os.RemoteException;
}
