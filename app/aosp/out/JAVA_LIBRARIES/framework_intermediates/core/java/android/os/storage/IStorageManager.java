/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/storage/IStorageManager.aidl
 */
package android.os.storage;
/**
 * WARNING! Update IMountService.h and IMountService.cpp if you change this
 * file. In particular, the transaction ids below must match the
 * _TRANSACTION enum in IMountService.cpp
 *
 * @hide - Applications should use android.os.storage.StorageManager to access
 *       storage functions.
 */
public interface IStorageManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.storage.IStorageManager
{
private static final java.lang.String DESCRIPTOR = "android.os.storage.IStorageManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.storage.IStorageManager interface,
 * generating a proxy if needed.
 */
public static android.os.storage.IStorageManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.storage.IStorageManager))) {
return ((android.os.storage.IStorageManager)iin);
}
return new android.os.storage.IStorageManager.Stub.Proxy(obj);
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
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.storage.IStorageEventListener _arg0;
_arg0 = android.os.storage.IStorageEventListener.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.storage.IStorageEventListener _arg0;
_arg0 = android.os.storage.IStorageEventListener.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isUsbMassStorageConnected:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isUsbMassStorageConnected();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUsbMassStorageEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setUsbMassStorageEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isUsbMassStorageEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isUsbMassStorageEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_mountVolume:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.mountVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_unmountVolume:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
this.unmountVolume(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_formatVolume:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.formatVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getStorageUsers:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _result = this.getStorageUsers(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getVolumeState:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getVolumeState(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_createSecureContainer:
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
boolean _arg5;
_arg5 = (0!=data.readInt());
int _result = this.createSecureContainer(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finalizeSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.finalizeSecureContainer(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_destroySecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.destroySecureContainer(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_mountSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
int _result = this.mountSecureContainer(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_unmountSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.unmountSecureContainer(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isSecureContainerMounted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isSecureContainerMounted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_renameSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.renameSecureContainer(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSecureContainerPath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getSecureContainerPath(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSecureContainerList:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getSecureContainerList();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
android.os.storage.IStorageShutdownObserver _arg0;
_arg0 = android.os.storage.IStorageShutdownObserver.Stub.asInterface(data.readStrongBinder());
this.shutdown(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_finishMediaUpdate:
{
data.enforceInterface(DESCRIPTOR);
this.finishMediaUpdate();
reply.writeNoException();
return true;
}
case TRANSACTION_mountObb:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.storage.IObbActionListener _arg3;
_arg3 = android.os.storage.IObbActionListener.Stub.asInterface(data.readStrongBinder());
int _arg4;
_arg4 = data.readInt();
this.mountObb(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_unmountObb:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.os.storage.IObbActionListener _arg2;
_arg2 = android.os.storage.IObbActionListener.Stub.asInterface(data.readStrongBinder());
int _arg3;
_arg3 = data.readInt();
this.unmountObb(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_isObbMounted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isObbMounted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getMountedObbPath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getMountedObbPath(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_isExternalStorageEmulated:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isExternalStorageEmulated();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_decryptStorage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.decryptStorage(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_encryptStorage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.encryptStorage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_changeEncryptionPassword:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.changeEncryptionPassword(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getVolumeList:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
android.os.storage.StorageVolume[] _result = this.getVolumeList(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getSecureContainerFilesystemPath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getSecureContainerFilesystemPath(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getEncryptionState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getEncryptionState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_verifyEncryptionPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.verifyEncryptionPassword(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_fixPermissionsSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.fixPermissionsSecureContainer(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_mkdirs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.mkdirs(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPasswordType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPasswordType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPassword();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_clearPassword:
{
data.enforceInterface(DESCRIPTOR);
this.clearPassword();
return true;
}
case TRANSACTION_setField:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setField(_arg0, _arg1);
return true;
}
case TRANSACTION_getField:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getField(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_resizeSecureContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.resizeSecureContainer(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_lastMaintenance:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.lastMaintenance();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_runMaintenance:
{
data.enforceInterface(DESCRIPTOR);
this.runMaintenance();
reply.writeNoException();
return true;
}
case TRANSACTION_waitForAsecScan:
{
data.enforceInterface(DESCRIPTOR);
this.waitForAsecScan();
reply.writeNoException();
return true;
}
case TRANSACTION_getDisks:
{
data.enforceInterface(DESCRIPTOR);
android.os.storage.DiskInfo[] _result = this.getDisks();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getVolumes:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.storage.VolumeInfo[] _result = this.getVolumes(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getVolumeRecords:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.storage.VolumeRecord[] _result = this.getVolumeRecords(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_mount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.mount(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unmount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.unmount(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_format:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.format(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_partitionPublic:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.partitionPublic(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_partitionPrivate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.partitionPrivate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_partitionMixed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.partitionMixed(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setVolumeNickname:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setVolumeNickname(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setVolumeUserFlags:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setVolumeUserFlags(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_forgetVolume:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.forgetVolume(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_forgetAllVolumes:
{
data.enforceInterface(DESCRIPTOR);
this.forgetAllVolumes();
reply.writeNoException();
return true;
}
case TRANSACTION_getPrimaryStorageUuid:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPrimaryStorageUuid();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setPrimaryStorageUuid:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.IPackageMoveObserver _arg1;
_arg1 = android.content.pm.IPackageMoveObserver.Stub.asInterface(data.readStrongBinder());
this.setPrimaryStorageUuid(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_benchmark:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _result = this.benchmark(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setDebugFlags:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setDebugFlags(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_createUserKey:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.createUserKey(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_destroyUserKey:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.destroyUserKey(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unlockUserKey:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
byte[] _arg3;
_arg3 = data.createByteArray();
this.unlockUserKey(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_lockUserKey:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.lockUserKey(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isUserKeyUnlocked:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isUserKeyUnlocked(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_prepareUserStorage:
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
this.prepareUserStorage(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_destroyUserStorage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.destroyUserStorage(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isConvertibleToFBE:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isConvertibleToFBE();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addUserKeyAuth:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
byte[] _arg3;
_arg3 = data.createByteArray();
this.addUserKeyAuth(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_fixateNewestUserKeyAuth:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.fixateNewestUserKeyAuth(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_fstrim:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.fstrim(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_mountProxyFileDescriptorBridge:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.os.AppFuseMount _result = this.mountProxyFileDescriptorBridge();
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
case TRANSACTION_openProxyFileDescriptor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.ParcelFileDescriptor _result = this.openProxyFileDescriptor(_arg0, _arg1, _arg2);
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
case TRANSACTION_getCacheQuotaBytes:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _result = this.getCacheQuotaBytes(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getCacheSizeBytes:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _result = this.getCacheSizeBytes(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getAllocatableBytes:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
long _result = this.getAllocatableBytes(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_allocateBytes:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
this.allocateBytes(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_secdiscard:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.secdiscard(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.storage.IStorageManager
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
     * Registers an IStorageEventListener for receiving async notifications.
     */
@Override public void registerListener(android.os.storage.IStorageEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Unregisters an IStorageEventListener
     */
@Override public void unregisterListener(android.os.storage.IStorageEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns true if a USB mass storage host is connected
     */
@Override public boolean isUsbMassStorageConnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isUsbMassStorageConnected, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Enables / disables USB mass storage. The caller should check actual
     * status of enabling/disabling USB mass storage via StorageEventListener.
     */
@Override public void setUsbMassStorageEnabled(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUsbMassStorageEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns true if a USB mass storage host is enabled (media is shared)
     */
@Override public boolean isUsbMassStorageEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isUsbMassStorageEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int mountVolume(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_mountVolume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Safely unmount external storage at given mount point. The unmount is an
     * asynchronous operation. Applications should register StorageEventListener
     * for storage related status changes.
     * @param mountPoint the mount point
     * @param force whether or not to forcefully unmount it (e.g. even if programs are using this
     *     data currently)
     * @param removeEncryption whether or not encryption mapping should be removed from the volume.
     *     This value implies {@code force}.
     */
@Override public void unmountVolume(java.lang.String mountPoint, boolean force, boolean removeEncryption) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
_data.writeInt(((force)?(1):(0)));
_data.writeInt(((removeEncryption)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_unmountVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int formatVolume(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_formatVolume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getStorageUsers(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_getStorageUsers, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getVolumeState(java.lang.String mountPoint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mountPoint);
mRemote.transact(Stub.TRANSACTION_getVolumeState, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int createSecureContainer(java.lang.String id, int sizeMb, java.lang.String fstype, java.lang.String key, int ownerUid, boolean external) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeInt(sizeMb);
_data.writeString(fstype);
_data.writeString(key);
_data.writeInt(ownerUid);
_data.writeInt(((external)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_createSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int finalizeSecureContainer(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_finalizeSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int destroySecureContainer(java.lang.String id, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_destroySecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int mountSecureContainer(java.lang.String id, java.lang.String key, int ownerUid, boolean readOnly) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeString(key);
_data.writeInt(ownerUid);
_data.writeInt(((readOnly)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_mountSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int unmountSecureContainer(java.lang.String id, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_unmountSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Returns true if the specified container is mounted
     */
@Override public boolean isSecureContainerMounted(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_isSecureContainerMounted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int renameSecureContainer(java.lang.String oldId, java.lang.String newId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(oldId);
_data.writeString(newId);
mRemote.transact(Stub.TRANSACTION_renameSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSecureContainerPath(java.lang.String id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
mRemote.transact(Stub.TRANSACTION_getSecureContainerPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getSecureContainerList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSecureContainerList, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Shuts down the StorageManagerService and gracefully unmounts all external media.
     * Invokes call back once the shutdown is complete.
     */
@Override public void shutdown(android.os.storage.IStorageShutdownObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Call into StorageManagerService by PackageManager to notify that its done
     * processing the media status update request.
     */
@Override public void finishMediaUpdate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_finishMediaUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Mounts an Opaque Binary Blob (OBB) with the specified decryption key and
     * only allows the calling process's UID access to the contents.
     * StorageManagerService will call back to the supplied IObbActionListener to inform
     * it of the terminal state of the call.
     */
@Override public void mountObb(java.lang.String rawPath, java.lang.String canonicalPath, java.lang.String key, android.os.storage.IObbActionListener token, int nonce) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(rawPath);
_data.writeString(canonicalPath);
_data.writeString(key);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(nonce);
mRemote.transact(Stub.TRANSACTION_mountObb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Unmounts an Opaque Binary Blob (OBB). When the force flag is specified,
     * any program using it will be forcibly killed to unmount the image.
     * StorageManagerService will call back to the supplied IObbActionListener to inform
     * it of the terminal state of the call.
     */
@Override public void unmountObb(java.lang.String rawPath, boolean force, android.os.storage.IObbActionListener token, int nonce) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(rawPath);
_data.writeInt(((force)?(1):(0)));
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(nonce);
mRemote.transact(Stub.TRANSACTION_unmountObb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Checks whether the specified Opaque Binary Blob (OBB) is mounted
     * somewhere.
     */
@Override public boolean isObbMounted(java.lang.String rawPath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(rawPath);
mRemote.transact(Stub.TRANSACTION_isObbMounted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getMountedObbPath(java.lang.String rawPath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(rawPath);
mRemote.transact(Stub.TRANSACTION_getMountedObbPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns whether or not the external storage is emulated.
     */
@Override public boolean isExternalStorageEmulated() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isExternalStorageEmulated, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int decryptStorage(java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_decryptStorage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int encryptStorage(int type, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_encryptStorage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int changeEncryptionPassword(int type, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_changeEncryptionPassword, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns list of all mountable volumes.
     */
@Override public android.os.storage.StorageVolume[] getVolumeList(int uid, java.lang.String packageName, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.storage.StorageVolume[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(packageName);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getVolumeList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.os.storage.StorageVolume.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSecureContainerFilesystemPath(java.lang.String cid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(cid);
mRemote.transact(Stub.TRANSACTION_getSecureContainerFilesystemPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getEncryptionState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEncryptionState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int verifyEncryptionPassword(java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_verifyEncryptionPassword, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int fixPermissionsSecureContainer(java.lang.String id, int gid, java.lang.String filename) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeInt(gid);
_data.writeString(filename);
mRemote.transact(Stub.TRANSACTION_fixPermissionsSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int mkdirs(java.lang.String callingPkg, java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_mkdirs, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPasswordType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPasswordType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getPassword() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPassword, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Securely clear password from vold
     */
@Override public void clearPassword() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearPassword, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Set a field in the crypto header.
     * @param field field to set
     * @param contents contents to set in field
     */
@Override public void setField(java.lang.String field, java.lang.String contents) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(field);
_data.writeString(contents);
mRemote.transact(Stub.TRANSACTION_setField, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public java.lang.String getField(java.lang.String field) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(field);
mRemote.transact(Stub.TRANSACTION_getField, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int resizeSecureContainer(java.lang.String id, int sizeMb, java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(id);
_data.writeInt(sizeMb);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_resizeSecureContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Report the time of the last maintenance operation such as fstrim.
     * @return Timestamp of the last maintenance operation, in the
     *     System.currentTimeMillis() time base
     * @throws RemoteException
     */
@Override public long lastMaintenance() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_lastMaintenance, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Kick off an immediate maintenance operation
     * @throws RemoteException
     */
@Override public void runMaintenance() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_runMaintenance, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void waitForAsecScan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_waitForAsecScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.storage.DiskInfo[] getDisks() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.storage.DiskInfo[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDisks, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.os.storage.DiskInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.storage.VolumeInfo[] getVolumes(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.storage.VolumeInfo[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getVolumes, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.os.storage.VolumeInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.storage.VolumeRecord[] getVolumeRecords(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.storage.VolumeRecord[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getVolumeRecords, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.os.storage.VolumeRecord.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void mount(java.lang.String volId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volId);
mRemote.transact(Stub.TRANSACTION_mount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unmount(java.lang.String volId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volId);
mRemote.transact(Stub.TRANSACTION_unmount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void format(java.lang.String volId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volId);
mRemote.transact(Stub.TRANSACTION_format, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void partitionPublic(java.lang.String diskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(diskId);
mRemote.transact(Stub.TRANSACTION_partitionPublic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void partitionPrivate(java.lang.String diskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(diskId);
mRemote.transact(Stub.TRANSACTION_partitionPrivate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void partitionMixed(java.lang.String diskId, int ratio) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(diskId);
_data.writeInt(ratio);
mRemote.transact(Stub.TRANSACTION_partitionMixed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setVolumeNickname(java.lang.String fsUuid, java.lang.String nickname) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(fsUuid);
_data.writeString(nickname);
mRemote.transact(Stub.TRANSACTION_setVolumeNickname, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setVolumeUserFlags(java.lang.String fsUuid, int flags, int mask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(fsUuid);
_data.writeInt(flags);
_data.writeInt(mask);
mRemote.transact(Stub.TRANSACTION_setVolumeUserFlags, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void forgetVolume(java.lang.String fsUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(fsUuid);
mRemote.transact(Stub.TRANSACTION_forgetVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void forgetAllVolumes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_forgetAllVolumes, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getPrimaryStorageUuid() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrimaryStorageUuid, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPrimaryStorageUuid(java.lang.String volumeUuid, android.content.pm.IPackageMoveObserver callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volumeUuid);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setPrimaryStorageUuid, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long benchmark(java.lang.String volId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volId);
mRemote.transact(Stub.TRANSACTION_benchmark, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDebugFlags(int flags, int mask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
_data.writeInt(mask);
mRemote.transact(Stub.TRANSACTION_setDebugFlags, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void createUserKey(int userId, int serialNumber, boolean ephemeral) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeInt(serialNumber);
_data.writeInt(((ephemeral)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_createUserKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void destroyUserKey(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_destroyUserKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unlockUserKey(int userId, int serialNumber, byte[] token, byte[] secret) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeInt(serialNumber);
_data.writeByteArray(token);
_data.writeByteArray(secret);
mRemote.transact(Stub.TRANSACTION_unlockUserKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void lockUserKey(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_lockUserKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isUserKeyUnlocked(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isUserKeyUnlocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void prepareUserStorage(java.lang.String volumeUuid, int userId, int serialNumber, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volumeUuid);
_data.writeInt(userId);
_data.writeInt(serialNumber);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_prepareUserStorage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void destroyUserStorage(java.lang.String volumeUuid, int userId, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volumeUuid);
_data.writeInt(userId);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_destroyUserStorage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isConvertibleToFBE() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isConvertibleToFBE, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addUserKeyAuth(int userId, int serialNumber, byte[] token, byte[] secret) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeInt(serialNumber);
_data.writeByteArray(token);
_data.writeByteArray(secret);
mRemote.transact(Stub.TRANSACTION_addUserKeyAuth, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void fixateNewestUserKeyAuth(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_fixateNewestUserKeyAuth, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void fstrim(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_fstrim, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.internal.os.AppFuseMount mountProxyFileDescriptorBridge() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.os.AppFuseMount _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_mountProxyFileDescriptorBridge, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.os.AppFuseMount.CREATOR.createFromParcel(_reply);
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
@Override public android.os.ParcelFileDescriptor openProxyFileDescriptor(int mountPointId, int fileId, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mountPointId);
_data.writeInt(fileId);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_openProxyFileDescriptor, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
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
@Override public long getCacheQuotaBytes(java.lang.String volumeUuid, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volumeUuid);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getCacheQuotaBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getCacheSizeBytes(java.lang.String volumeUuid, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volumeUuid);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getCacheSizeBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getAllocatableBytes(java.lang.String volumeUuid, int flags, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volumeUuid);
_data.writeInt(flags);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getAllocatableBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void allocateBytes(java.lang.String volumeUuid, long bytes, int flags, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(volumeUuid);
_data.writeLong(bytes);
_data.writeInt(flags);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_allocateBytes, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void secdiscard(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_secdiscard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isUsbMassStorageConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setUsbMassStorageEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isUsbMassStorageEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_mountVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_unmountVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_formatVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getStorageUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getVolumeState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_createSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_finalizeSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_destroySecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_mountSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_unmountSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_isSecureContainerMounted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_renameSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getSecureContainerPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getSecureContainerList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_finishMediaUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_mountObb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_unmountObb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_isObbMounted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getMountedObbPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_isExternalStorageEmulated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_decryptStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_encryptStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_changeEncryptionPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getVolumeList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getSecureContainerFilesystemPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getEncryptionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_verifyEncryptionPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_fixPermissionsSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_mkdirs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_getPasswordType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_getPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_clearPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_setField = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_getField = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_resizeSecureContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_lastMaintenance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_runMaintenance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_waitForAsecScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_getDisks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_getVolumes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_getVolumeRecords = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_mount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_unmount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_format = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_partitionPublic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_partitionPrivate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_partitionMixed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_setVolumeNickname = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_setVolumeUserFlags = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_forgetVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_forgetAllVolumes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_getPrimaryStorageUuid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_setPrimaryStorageUuid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_benchmark = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_setDebugFlags = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_createUserKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_destroyUserKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_unlockUserKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_lockUserKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_isUserKeyUnlocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_prepareUserStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_destroyUserStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_isConvertibleToFBE = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
static final int TRANSACTION_addUserKeyAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
static final int TRANSACTION_fixateNewestUserKeyAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
static final int TRANSACTION_fstrim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
static final int TRANSACTION_mountProxyFileDescriptorBridge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
static final int TRANSACTION_openProxyFileDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
static final int TRANSACTION_getCacheQuotaBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
static final int TRANSACTION_getCacheSizeBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
static final int TRANSACTION_getAllocatableBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
static final int TRANSACTION_allocateBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
static final int TRANSACTION_secdiscard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
}
/**
     * Registers an IStorageEventListener for receiving async notifications.
     */
public void registerListener(android.os.storage.IStorageEventListener listener) throws android.os.RemoteException;
/**
     * Unregisters an IStorageEventListener
     */
public void unregisterListener(android.os.storage.IStorageEventListener listener) throws android.os.RemoteException;
/**
     * Returns true if a USB mass storage host is connected
     */
public boolean isUsbMassStorageConnected() throws android.os.RemoteException;
/**
     * Enables / disables USB mass storage. The caller should check actual
     * status of enabling/disabling USB mass storage via StorageEventListener.
     */
public void setUsbMassStorageEnabled(boolean enable) throws android.os.RemoteException;
/**
     * Returns true if a USB mass storage host is enabled (media is shared)
     */
public boolean isUsbMassStorageEnabled() throws android.os.RemoteException;
public int mountVolume(java.lang.String mountPoint) throws android.os.RemoteException;
/**
     * Safely unmount external storage at given mount point. The unmount is an
     * asynchronous operation. Applications should register StorageEventListener
     * for storage related status changes.
     * @param mountPoint the mount point
     * @param force whether or not to forcefully unmount it (e.g. even if programs are using this
     *     data currently)
     * @param removeEncryption whether or not encryption mapping should be removed from the volume.
     *     This value implies {@code force}.
     */
public void unmountVolume(java.lang.String mountPoint, boolean force, boolean removeEncryption) throws android.os.RemoteException;
public int formatVolume(java.lang.String mountPoint) throws android.os.RemoteException;
public int[] getStorageUsers(java.lang.String path) throws android.os.RemoteException;
public java.lang.String getVolumeState(java.lang.String mountPoint) throws android.os.RemoteException;
public int createSecureContainer(java.lang.String id, int sizeMb, java.lang.String fstype, java.lang.String key, int ownerUid, boolean external) throws android.os.RemoteException;
public int finalizeSecureContainer(java.lang.String id) throws android.os.RemoteException;
public int destroySecureContainer(java.lang.String id, boolean force) throws android.os.RemoteException;
public int mountSecureContainer(java.lang.String id, java.lang.String key, int ownerUid, boolean readOnly) throws android.os.RemoteException;
public int unmountSecureContainer(java.lang.String id, boolean force) throws android.os.RemoteException;
/*
     * Returns true if the specified container is mounted
     */
public boolean isSecureContainerMounted(java.lang.String id) throws android.os.RemoteException;
public int renameSecureContainer(java.lang.String oldId, java.lang.String newId) throws android.os.RemoteException;
public java.lang.String getSecureContainerPath(java.lang.String id) throws android.os.RemoteException;
public java.lang.String[] getSecureContainerList() throws android.os.RemoteException;
/**
     * Shuts down the StorageManagerService and gracefully unmounts all external media.
     * Invokes call back once the shutdown is complete.
     */
public void shutdown(android.os.storage.IStorageShutdownObserver observer) throws android.os.RemoteException;
/**
     * Call into StorageManagerService by PackageManager to notify that its done
     * processing the media status update request.
     */
public void finishMediaUpdate() throws android.os.RemoteException;
/**
     * Mounts an Opaque Binary Blob (OBB) with the specified decryption key and
     * only allows the calling process's UID access to the contents.
     * StorageManagerService will call back to the supplied IObbActionListener to inform
     * it of the terminal state of the call.
     */
public void mountObb(java.lang.String rawPath, java.lang.String canonicalPath, java.lang.String key, android.os.storage.IObbActionListener token, int nonce) throws android.os.RemoteException;
/**
     * Unmounts an Opaque Binary Blob (OBB). When the force flag is specified,
     * any program using it will be forcibly killed to unmount the image.
     * StorageManagerService will call back to the supplied IObbActionListener to inform
     * it of the terminal state of the call.
     */
public void unmountObb(java.lang.String rawPath, boolean force, android.os.storage.IObbActionListener token, int nonce) throws android.os.RemoteException;
/**
     * Checks whether the specified Opaque Binary Blob (OBB) is mounted
     * somewhere.
     */
public boolean isObbMounted(java.lang.String rawPath) throws android.os.RemoteException;
public java.lang.String getMountedObbPath(java.lang.String rawPath) throws android.os.RemoteException;
/**
     * Returns whether or not the external storage is emulated.
     */
public boolean isExternalStorageEmulated() throws android.os.RemoteException;
public int decryptStorage(java.lang.String password) throws android.os.RemoteException;
public int encryptStorage(int type, java.lang.String password) throws android.os.RemoteException;
public int changeEncryptionPassword(int type, java.lang.String password) throws android.os.RemoteException;
/**
     * Returns list of all mountable volumes.
     */
public android.os.storage.StorageVolume[] getVolumeList(int uid, java.lang.String packageName, int flags) throws android.os.RemoteException;
public java.lang.String getSecureContainerFilesystemPath(java.lang.String cid) throws android.os.RemoteException;
public int getEncryptionState() throws android.os.RemoteException;
public int verifyEncryptionPassword(java.lang.String password) throws android.os.RemoteException;
public int fixPermissionsSecureContainer(java.lang.String id, int gid, java.lang.String filename) throws android.os.RemoteException;
public int mkdirs(java.lang.String callingPkg, java.lang.String path) throws android.os.RemoteException;
public int getPasswordType() throws android.os.RemoteException;
public java.lang.String getPassword() throws android.os.RemoteException;
/**
     * Securely clear password from vold
     */
public void clearPassword() throws android.os.RemoteException;
/**
     * Set a field in the crypto header.
     * @param field field to set
     * @param contents contents to set in field
     */
public void setField(java.lang.String field, java.lang.String contents) throws android.os.RemoteException;
public java.lang.String getField(java.lang.String field) throws android.os.RemoteException;
public int resizeSecureContainer(java.lang.String id, int sizeMb, java.lang.String key) throws android.os.RemoteException;
/**
     * Report the time of the last maintenance operation such as fstrim.
     * @return Timestamp of the last maintenance operation, in the
     *     System.currentTimeMillis() time base
     * @throws RemoteException
     */
public long lastMaintenance() throws android.os.RemoteException;
/**
     * Kick off an immediate maintenance operation
     * @throws RemoteException
     */
public void runMaintenance() throws android.os.RemoteException;
public void waitForAsecScan() throws android.os.RemoteException;
public android.os.storage.DiskInfo[] getDisks() throws android.os.RemoteException;
public android.os.storage.VolumeInfo[] getVolumes(int flags) throws android.os.RemoteException;
public android.os.storage.VolumeRecord[] getVolumeRecords(int flags) throws android.os.RemoteException;
public void mount(java.lang.String volId) throws android.os.RemoteException;
public void unmount(java.lang.String volId) throws android.os.RemoteException;
public void format(java.lang.String volId) throws android.os.RemoteException;
public void partitionPublic(java.lang.String diskId) throws android.os.RemoteException;
public void partitionPrivate(java.lang.String diskId) throws android.os.RemoteException;
public void partitionMixed(java.lang.String diskId, int ratio) throws android.os.RemoteException;
public void setVolumeNickname(java.lang.String fsUuid, java.lang.String nickname) throws android.os.RemoteException;
public void setVolumeUserFlags(java.lang.String fsUuid, int flags, int mask) throws android.os.RemoteException;
public void forgetVolume(java.lang.String fsUuid) throws android.os.RemoteException;
public void forgetAllVolumes() throws android.os.RemoteException;
public java.lang.String getPrimaryStorageUuid() throws android.os.RemoteException;
public void setPrimaryStorageUuid(java.lang.String volumeUuid, android.content.pm.IPackageMoveObserver callback) throws android.os.RemoteException;
public long benchmark(java.lang.String volId) throws android.os.RemoteException;
public void setDebugFlags(int flags, int mask) throws android.os.RemoteException;
public void createUserKey(int userId, int serialNumber, boolean ephemeral) throws android.os.RemoteException;
public void destroyUserKey(int userId) throws android.os.RemoteException;
public void unlockUserKey(int userId, int serialNumber, byte[] token, byte[] secret) throws android.os.RemoteException;
public void lockUserKey(int userId) throws android.os.RemoteException;
public boolean isUserKeyUnlocked(int userId) throws android.os.RemoteException;
public void prepareUserStorage(java.lang.String volumeUuid, int userId, int serialNumber, int flags) throws android.os.RemoteException;
public void destroyUserStorage(java.lang.String volumeUuid, int userId, int flags) throws android.os.RemoteException;
public boolean isConvertibleToFBE() throws android.os.RemoteException;
public void addUserKeyAuth(int userId, int serialNumber, byte[] token, byte[] secret) throws android.os.RemoteException;
public void fixateNewestUserKeyAuth(int userId) throws android.os.RemoteException;
public void fstrim(int flags) throws android.os.RemoteException;
public com.android.internal.os.AppFuseMount mountProxyFileDescriptorBridge() throws android.os.RemoteException;
public android.os.ParcelFileDescriptor openProxyFileDescriptor(int mountPointId, int fileId, int mode) throws android.os.RemoteException;
public long getCacheQuotaBytes(java.lang.String volumeUuid, int uid) throws android.os.RemoteException;
public long getCacheSizeBytes(java.lang.String volumeUuid, int uid) throws android.os.RemoteException;
public long getAllocatableBytes(java.lang.String volumeUuid, int flags, java.lang.String callingPackage) throws android.os.RemoteException;
public void allocateBytes(java.lang.String volumeUuid, long bytes, int flags, java.lang.String callingPackage) throws android.os.RemoteException;
public void secdiscard(java.lang.String path) throws android.os.RemoteException;
}
