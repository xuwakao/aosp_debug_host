/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../native/cmds/installd/binder/android/os/IInstalld.aidl
 */
package android.os;
/** {@hide} */
public interface IInstalld extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IInstalld
{
private static final java.lang.String DESCRIPTOR = "android.os.IInstalld";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IInstalld interface,
 * generating a proxy if needed.
 */
public static android.os.IInstalld asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IInstalld))) {
return ((android.os.IInstalld)iin);
}
return new android.os.IInstalld.Stub.Proxy(obj);
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
case TRANSACTION_createUserData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.createUserData(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_destroyUserData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.destroyUserData(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_createAppData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
int _arg6;
_arg6 = data.readInt();
long _result = this.createAppData(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_restoreconAppData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
this.restoreconAppData(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_migrateAppData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.migrateAppData(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_clearAppData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
long _arg4;
_arg4 = data.readLong();
this.clearAppData(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_destroyAppData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
long _arg4;
_arg4 = data.readLong();
this.destroyAppData(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_fixupAppData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.fixupAppData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAppSize:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
long[] _arg5;
_arg5 = data.createLongArray();
java.lang.String[] _arg6;
_arg6 = data.createStringArray();
long[] _result = this.getAppSize(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
case TRANSACTION_getUserSize:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int[] _arg3;
_arg3 = data.createIntArray();
long[] _result = this.getUserSize(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
case TRANSACTION_getExternalSize:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int[] _arg3;
_arg3 = data.createIntArray();
long[] _result = this.getExternalSize(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
case TRANSACTION_setAppQuota:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
long _arg3;
_arg3 = data.readLong();
this.setAppQuota(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_moveCompleteApp:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
int _arg6;
_arg6 = data.readInt();
this.moveCompleteApp(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_dexopt:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
int _arg6;
_arg6 = data.readInt();
java.lang.String _arg7;
_arg7 = data.readString();
java.lang.String _arg8;
_arg8 = data.readString();
java.lang.String _arg9;
_arg9 = data.readString();
java.lang.String _arg10;
_arg10 = data.readString();
boolean _arg11;
_arg11 = (0!=data.readInt());
this.dexopt(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11);
reply.writeNoException();
return true;
}
case TRANSACTION_rmdex:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.rmdex(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_mergeProfiles:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.mergeProfiles(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_dumpProfiles:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.dumpProfiles(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_copySystemProfile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.copySystemProfile(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_clearAppProfiles:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearAppProfiles(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_destroyAppProfiles:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.destroyAppProfiles(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_idmap:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.idmap(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_removeIdmap:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removeIdmap(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_rmPackageDir:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.rmPackageDir(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_markBootComplete:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.markBootComplete(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_freeCache:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
this.freeCache(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_linkNativeLibraryDirectory:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.linkNativeLibraryDirectory(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_createOatDir:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.createOatDir(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_linkFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.linkFile(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_moveAb:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.moveAb(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteOdex:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.deleteOdex(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_reconcileSecondaryDexFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
java.lang.String _arg4;
_arg4 = data.readString();
int _arg5;
_arg5 = data.readInt();
boolean _result = this.reconcileSecondaryDexFile(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_invalidateMounts:
{
data.enforceInterface(DESCRIPTOR);
this.invalidateMounts();
reply.writeNoException();
return true;
}
case TRANSACTION_isQuotaSupported:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isQuotaSupported(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IInstalld
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
@Override public void createUserData(java.lang.String uuid, int userId, int userSerial, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeInt(userId);
_data.writeInt(userSerial);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_createUserData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void destroyUserData(java.lang.String uuid, int userId, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeInt(userId);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_destroyUserData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long createAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, int appId, java.lang.String seInfo, int targetSdkVersion) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeInt(flags);
_data.writeInt(appId);
_data.writeString(seInfo);
_data.writeInt(targetSdkVersion);
mRemote.transact(Stub.TRANSACTION_createAppData, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void restoreconAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, int appId, java.lang.String seInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeInt(flags);
_data.writeInt(appId);
_data.writeString(seInfo);
mRemote.transact(Stub.TRANSACTION_restoreconAppData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void migrateAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_migrateAppData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeInt(flags);
_data.writeLong(ceDataInode);
mRemote.transact(Stub.TRANSACTION_clearAppData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void destroyAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeInt(flags);
_data.writeLong(ceDataInode);
mRemote.transact(Stub.TRANSACTION_destroyAppData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void fixupAppData(java.lang.String uuid, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_fixupAppData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long[] getAppSize(java.lang.String uuid, java.lang.String[] packageNames, int userId, int flags, int appId, long[] ceDataInodes, java.lang.String[] codePaths) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeStringArray(packageNames);
_data.writeInt(userId);
_data.writeInt(flags);
_data.writeInt(appId);
_data.writeLongArray(ceDataInodes);
_data.writeStringArray(codePaths);
mRemote.transact(Stub.TRANSACTION_getAppSize, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long[] getUserSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeInt(userId);
_data.writeInt(flags);
_data.writeIntArray(appIds);
mRemote.transact(Stub.TRANSACTION_getUserSize, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long[] getExternalSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeInt(userId);
_data.writeInt(flags);
_data.writeIntArray(appIds);
mRemote.transact(Stub.TRANSACTION_getExternalSize, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAppQuota(java.lang.String uuid, int userId, int appId, long cacheQuota) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeInt(userId);
_data.writeInt(appId);
_data.writeLong(cacheQuota);
mRemote.transact(Stub.TRANSACTION_setAppQuota, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void moveCompleteApp(java.lang.String fromUuid, java.lang.String toUuid, java.lang.String packageName, java.lang.String dataAppName, int appId, java.lang.String seInfo, int targetSdkVersion) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(fromUuid);
_data.writeString(toUuid);
_data.writeString(packageName);
_data.writeString(dataAppName);
_data.writeInt(appId);
_data.writeString(seInfo);
_data.writeInt(targetSdkVersion);
mRemote.transact(Stub.TRANSACTION_moveCompleteApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void dexopt(java.lang.String apkPath, int uid, java.lang.String packageName, java.lang.String instructionSet, int dexoptNeeded, java.lang.String outputPath, int dexFlags, java.lang.String compilerFilter, java.lang.String uuid, java.lang.String sharedLibraries, java.lang.String seInfo, boolean downgrade) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(apkPath);
_data.writeInt(uid);
_data.writeString(packageName);
_data.writeString(instructionSet);
_data.writeInt(dexoptNeeded);
_data.writeString(outputPath);
_data.writeInt(dexFlags);
_data.writeString(compilerFilter);
_data.writeString(uuid);
_data.writeString(sharedLibraries);
_data.writeString(seInfo);
_data.writeInt(((downgrade)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_dexopt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void rmdex(java.lang.String codePath, java.lang.String instructionSet) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(codePath);
_data.writeString(instructionSet);
mRemote.transact(Stub.TRANSACTION_rmdex, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean mergeProfiles(int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_mergeProfiles, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean dumpProfiles(int uid, java.lang.String packageName, java.lang.String codePaths) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(packageName);
_data.writeString(codePaths);
mRemote.transact(Stub.TRANSACTION_dumpProfiles, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean copySystemProfile(java.lang.String systemProfile, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(systemProfile);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_copySystemProfile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void clearAppProfiles(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_clearAppProfiles, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void destroyAppProfiles(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_destroyAppProfiles, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void idmap(java.lang.String targetApkPath, java.lang.String overlayApkPath, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(targetApkPath);
_data.writeString(overlayApkPath);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_idmap, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeIdmap(java.lang.String overlayApkPath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(overlayApkPath);
mRemote.transact(Stub.TRANSACTION_removeIdmap, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void rmPackageDir(java.lang.String packageDir) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageDir);
mRemote.transact(Stub.TRANSACTION_rmPackageDir, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void markBootComplete(java.lang.String instructionSet) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(instructionSet);
mRemote.transact(Stub.TRANSACTION_markBootComplete, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void freeCache(java.lang.String uuid, long targetFreeBytes, long cacheReservedBytes, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeLong(targetFreeBytes);
_data.writeLong(cacheReservedBytes);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_freeCache, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void linkNativeLibraryDirectory(java.lang.String uuid, java.lang.String packageName, java.lang.String nativeLibPath32, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
_data.writeString(packageName);
_data.writeString(nativeLibPath32);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_linkNativeLibraryDirectory, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void createOatDir(java.lang.String oatDir, java.lang.String instructionSet) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(oatDir);
_data.writeString(instructionSet);
mRemote.transact(Stub.TRANSACTION_createOatDir, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void linkFile(java.lang.String relativePath, java.lang.String fromBase, java.lang.String toBase) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(relativePath);
_data.writeString(fromBase);
_data.writeString(toBase);
mRemote.transact(Stub.TRANSACTION_linkFile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void moveAb(java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(apkPath);
_data.writeString(instructionSet);
_data.writeString(outputPath);
mRemote.transact(Stub.TRANSACTION_moveAb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteOdex(java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(apkPath);
_data.writeString(instructionSet);
_data.writeString(outputPath);
mRemote.transact(Stub.TRANSACTION_deleteOdex, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean reconcileSecondaryDexFile(java.lang.String dexPath, java.lang.String pkgName, int uid, java.lang.String[] isas, java.lang.String volume_uuid, int storage_flag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(dexPath);
_data.writeString(pkgName);
_data.writeInt(uid);
_data.writeStringArray(isas);
_data.writeString(volume_uuid);
_data.writeInt(storage_flag);
mRemote.transact(Stub.TRANSACTION_reconcileSecondaryDexFile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void invalidateMounts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_invalidateMounts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isQuotaSupported(java.lang.String uuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uuid);
mRemote.transact(Stub.TRANSACTION_isQuotaSupported, _data, _reply, 0);
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
static final int TRANSACTION_createUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_destroyUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_createAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_restoreconAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_migrateAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_clearAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_destroyAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_fixupAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAppSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getUserSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getExternalSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setAppQuota = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_moveCompleteApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_dexopt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_rmdex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_mergeProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_dumpProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_copySystemProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_clearAppProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_destroyAppProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_idmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_removeIdmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_rmPackageDir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_markBootComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_freeCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_linkNativeLibraryDirectory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_createOatDir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_linkFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_moveAb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_deleteOdex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_reconcileSecondaryDexFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_invalidateMounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_isQuotaSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
}
public void createUserData(java.lang.String uuid, int userId, int userSerial, int flags) throws android.os.RemoteException;
public void destroyUserData(java.lang.String uuid, int userId, int flags) throws android.os.RemoteException;
public long createAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, int appId, java.lang.String seInfo, int targetSdkVersion) throws android.os.RemoteException;
public void restoreconAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, int appId, java.lang.String seInfo) throws android.os.RemoteException;
public void migrateAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags) throws android.os.RemoteException;
public void clearAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException;
public void destroyAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException;
public void fixupAppData(java.lang.String uuid, int flags) throws android.os.RemoteException;
public long[] getAppSize(java.lang.String uuid, java.lang.String[] packageNames, int userId, int flags, int appId, long[] ceDataInodes, java.lang.String[] codePaths) throws android.os.RemoteException;
public long[] getUserSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException;
public long[] getExternalSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException;
public void setAppQuota(java.lang.String uuid, int userId, int appId, long cacheQuota) throws android.os.RemoteException;
public void moveCompleteApp(java.lang.String fromUuid, java.lang.String toUuid, java.lang.String packageName, java.lang.String dataAppName, int appId, java.lang.String seInfo, int targetSdkVersion) throws android.os.RemoteException;
public void dexopt(java.lang.String apkPath, int uid, java.lang.String packageName, java.lang.String instructionSet, int dexoptNeeded, java.lang.String outputPath, int dexFlags, java.lang.String compilerFilter, java.lang.String uuid, java.lang.String sharedLibraries, java.lang.String seInfo, boolean downgrade) throws android.os.RemoteException;
public void rmdex(java.lang.String codePath, java.lang.String instructionSet) throws android.os.RemoteException;
public boolean mergeProfiles(int uid, java.lang.String packageName) throws android.os.RemoteException;
public boolean dumpProfiles(int uid, java.lang.String packageName, java.lang.String codePaths) throws android.os.RemoteException;
public boolean copySystemProfile(java.lang.String systemProfile, int uid, java.lang.String packageName) throws android.os.RemoteException;
public void clearAppProfiles(java.lang.String packageName) throws android.os.RemoteException;
public void destroyAppProfiles(java.lang.String packageName) throws android.os.RemoteException;
public void idmap(java.lang.String targetApkPath, java.lang.String overlayApkPath, int uid) throws android.os.RemoteException;
public void removeIdmap(java.lang.String overlayApkPath) throws android.os.RemoteException;
public void rmPackageDir(java.lang.String packageDir) throws android.os.RemoteException;
public void markBootComplete(java.lang.String instructionSet) throws android.os.RemoteException;
public void freeCache(java.lang.String uuid, long targetFreeBytes, long cacheReservedBytes, int flags) throws android.os.RemoteException;
public void linkNativeLibraryDirectory(java.lang.String uuid, java.lang.String packageName, java.lang.String nativeLibPath32, int userId) throws android.os.RemoteException;
public void createOatDir(java.lang.String oatDir, java.lang.String instructionSet) throws android.os.RemoteException;
public void linkFile(java.lang.String relativePath, java.lang.String fromBase, java.lang.String toBase) throws android.os.RemoteException;
public void moveAb(java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException;
public void deleteOdex(java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException;
public boolean reconcileSecondaryDexFile(java.lang.String dexPath, java.lang.String pkgName, int uid, java.lang.String[] isas, java.lang.String volume_uuid, int storage_flag) throws android.os.RemoteException;
public void invalidateMounts() throws android.os.RemoteException;
public boolean isQuotaSupported(java.lang.String uuid) throws android.os.RemoteException;
}
