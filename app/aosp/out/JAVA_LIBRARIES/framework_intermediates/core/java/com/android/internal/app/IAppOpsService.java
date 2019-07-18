/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/app/IAppOpsService.aidl
 */
package com.android.internal.app;
public interface IAppOpsService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAppOpsService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAppOpsService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IAppOpsService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IAppOpsService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IAppOpsService))) {
return ((com.android.internal.app.IAppOpsService)iin);
}
return new com.android.internal.app.IAppOpsService.Stub.Proxy(obj);
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
case TRANSACTION_checkOperation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.checkOperation(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_noteOperation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.noteOperation(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startOperation:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
int _result = this.startOperation(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finishOperation:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
this.finishOperation(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_startWatchingMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
com.android.internal.app.IAppOpsCallback _arg2;
_arg2 = com.android.internal.app.IAppOpsCallback.Stub.asInterface(data.readStrongBinder());
this.startWatchingMode(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_stopWatchingMode:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.app.IAppOpsCallback _arg0;
_arg0 = com.android.internal.app.IAppOpsCallback.Stub.asInterface(data.readStrongBinder());
this.stopWatchingMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.IBinder _result = this.getToken(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_permissionToOpCode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.permissionToOpCode(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_noteProxyOperation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
int _result = this.noteProxyOperation(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_checkPackage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.checkPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPackagesForOps:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.util.List<android.app.AppOpsManager.PackageOps> _result = this.getPackagesForOps(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getOpsForPackage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int[] _arg2;
_arg2 = data.createIntArray();
java.util.List<android.app.AppOpsManager.PackageOps> _result = this.getOpsForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getUidOps:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.util.List<android.app.AppOpsManager.PackageOps> _result = this.getUidOps(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_setUidMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setUidMode(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.setMode(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_resetAllModes:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.resetAllModes(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_checkAudioOperation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
int _result = this.checkAudioOperation(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAudioRestriction:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
java.lang.String[] _arg4;
_arg4 = data.createStringArray();
this.setAudioRestriction(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_setUserRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
int _arg2;
_arg2 = data.readInt();
this.setUserRestrictions(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setUserRestriction:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
int _arg3;
_arg3 = data.readInt();
java.lang.String[] _arg4;
_arg4 = data.createStringArray();
this.setUserRestriction(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_removeUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.removeUser(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isOperationActive:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.isOperationActive(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IAppOpsService
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
@Override public int checkOperation(int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_checkOperation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int noteOperation(int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_noteOperation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startOperation(android.os.IBinder token, int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_startOperation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void finishOperation(android.os.IBinder token, int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_finishOperation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startWatchingMode(int op, java.lang.String packageName, com.android.internal.app.IAppOpsCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(op);
_data.writeString(packageName);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startWatchingMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopWatchingMode(com.android.internal.app.IAppOpsCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopWatchingMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.IBinder getToken(android.os.IBinder clientToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(clientToken);
mRemote.transact(Stub.TRANSACTION_getToken, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int permissionToOpCode(java.lang.String permission) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(permission);
mRemote.transact(Stub.TRANSACTION_permissionToOpCode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int noteProxyOperation(int code, java.lang.String proxyPackageName, int callingUid, java.lang.String callingPackageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeString(proxyPackageName);
_data.writeInt(callingUid);
_data.writeString(callingPackageName);
mRemote.transact(Stub.TRANSACTION_noteProxyOperation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int checkPackage(int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_checkPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] ops) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.app.AppOpsManager.PackageOps> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(ops);
mRemote.transact(Stub.TRANSACTION_getPackagesForOps, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.app.AppOpsManager.PackageOps.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int uid, java.lang.String packageName, int[] ops) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.app.AppOpsManager.PackageOps> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(packageName);
_data.writeIntArray(ops);
mRemote.transact(Stub.TRANSACTION_getOpsForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.app.AppOpsManager.PackageOps.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int uid, int[] ops) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.app.AppOpsManager.PackageOps> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeIntArray(ops);
mRemote.transact(Stub.TRANSACTION_getUidOps, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.app.AppOpsManager.PackageOps.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUidMode(int code, int uid, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setUidMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setMode(int code, int uid, java.lang.String packageName, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void resetAllModes(int reqUserId, java.lang.String reqPackageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reqUserId);
_data.writeString(reqPackageName);
mRemote.transact(Stub.TRANSACTION_resetAllModes, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int checkAudioOperation(int code, int usage, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(usage);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_checkAudioOperation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAudioRestriction(int code, int usage, int uid, int mode, java.lang.String[] exceptionPackages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(usage);
_data.writeInt(uid);
_data.writeInt(mode);
_data.writeStringArray(exceptionPackages);
mRemote.transact(Stub.TRANSACTION_setAudioRestriction, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setUserRestrictions(android.os.Bundle restrictions, android.os.IBinder token, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((restrictions!=null)) {
_data.writeInt(1);
restrictions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(token);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setUserRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setUserRestriction(int code, boolean restricted, android.os.IBinder token, int userHandle, java.lang.String[] exceptionPackages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(((restricted)?(1):(0)));
_data.writeStrongBinder(token);
_data.writeInt(userHandle);
_data.writeStringArray(exceptionPackages);
mRemote.transact(Stub.TRANSACTION_setUserRestriction, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeUser(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_removeUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isOperationActive(int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isOperationActive, _data, _reply, 0);
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
static final int TRANSACTION_checkOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_noteOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_finishOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_startWatchingMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_stopWatchingMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_permissionToOpCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_noteProxyOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_checkPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getPackagesForOps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getOpsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getUidOps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setUidMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_resetAllModes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_checkAudioOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setAudioRestriction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setUserRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_setUserRestriction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_removeUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_isOperationActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
}
public int checkOperation(int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
public int noteOperation(int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
public int startOperation(android.os.IBinder token, int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
public void finishOperation(android.os.IBinder token, int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
public void startWatchingMode(int op, java.lang.String packageName, com.android.internal.app.IAppOpsCallback callback) throws android.os.RemoteException;
public void stopWatchingMode(com.android.internal.app.IAppOpsCallback callback) throws android.os.RemoteException;
public android.os.IBinder getToken(android.os.IBinder clientToken) throws android.os.RemoteException;
public int permissionToOpCode(java.lang.String permission) throws android.os.RemoteException;
public int noteProxyOperation(int code, java.lang.String proxyPackageName, int callingUid, java.lang.String callingPackageName) throws android.os.RemoteException;
public int checkPackage(int uid, java.lang.String packageName) throws android.os.RemoteException;
public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] ops) throws android.os.RemoteException;
public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int uid, java.lang.String packageName, int[] ops) throws android.os.RemoteException;
public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int uid, int[] ops) throws android.os.RemoteException;
public void setUidMode(int code, int uid, int mode) throws android.os.RemoteException;
public void setMode(int code, int uid, java.lang.String packageName, int mode) throws android.os.RemoteException;
public void resetAllModes(int reqUserId, java.lang.String reqPackageName) throws android.os.RemoteException;
public int checkAudioOperation(int code, int usage, int uid, java.lang.String packageName) throws android.os.RemoteException;
public void setAudioRestriction(int code, int usage, int uid, int mode, java.lang.String[] exceptionPackages) throws android.os.RemoteException;
public void setUserRestrictions(android.os.Bundle restrictions, android.os.IBinder token, int userHandle) throws android.os.RemoteException;
public void setUserRestriction(int code, boolean restricted, android.os.IBinder token, int userHandle, java.lang.String[] exceptionPackages) throws android.os.RemoteException;
public void removeUser(int userHandle) throws android.os.RemoteException;
public boolean isOperationActive(int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
}
