/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/backup/IBackupTransport.aidl
 */
package com.android.internal.backup;
/** {@hide} */
public interface IBackupTransport extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.backup.IBackupTransport
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.backup.IBackupTransport";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.backup.IBackupTransport interface,
 * generating a proxy if needed.
 */
public static com.android.internal.backup.IBackupTransport asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.backup.IBackupTransport))) {
return ((com.android.internal.backup.IBackupTransport)iin);
}
return new com.android.internal.backup.IBackupTransport.Stub.Proxy(obj);
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
case TRANSACTION_name:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.name();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_configurationIntent:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _result = this.configurationIntent();
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
case TRANSACTION_currentDestinationString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.currentDestinationString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_dataManagementIntent:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _result = this.dataManagementIntent();
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
case TRANSACTION_dataManagementLabel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.dataManagementLabel();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_transportDirName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.transportDirName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_requestBackupTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.requestBackupTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_initializeDevice:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.initializeDevice();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_performBackup:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.PackageInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.PackageInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.ParcelFileDescriptor _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
int _result = this.performBackup(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_clearBackupData:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.PackageInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.PackageInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.clearBackupData(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finishBackup:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.finishBackup();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAvailableRestoreSets:
{
data.enforceInterface(DESCRIPTOR);
android.app.backup.RestoreSet[] _result = this.getAvailableRestoreSets();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getCurrentRestoreSet:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getCurrentRestoreSet();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_startRestore:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.content.pm.PackageInfo[] _arg1;
_arg1 = data.createTypedArray(android.content.pm.PackageInfo.CREATOR);
int _result = this.startRestore(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_nextRestorePackage:
{
data.enforceInterface(DESCRIPTOR);
android.app.backup.RestoreDescription _result = this.nextRestorePackage();
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
case TRANSACTION_getRestoreData:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getRestoreData(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finishRestore:
{
data.enforceInterface(DESCRIPTOR);
this.finishRestore();
reply.writeNoException();
return true;
}
case TRANSACTION_requestFullBackupTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.requestFullBackupTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_performFullBackup:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.PackageInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.PackageInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.ParcelFileDescriptor _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
int _result = this.performFullBackup(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_checkFullBackupSize:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _result = this.checkFullBackupSize(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_sendBackupData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.sendBackupData(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_cancelFullBackup:
{
data.enforceInterface(DESCRIPTOR);
this.cancelFullBackup();
reply.writeNoException();
return true;
}
case TRANSACTION_isAppEligibleForBackup:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.PackageInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.PackageInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.isAppEligibleForBackup(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBackupQuota:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
long _result = this.getBackupQuota(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getNextFullRestoreDataChunk:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getNextFullRestoreDataChunk(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_abortFullRestore:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.abortFullRestore();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.backup.IBackupTransport
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
@Override public java.lang.String name() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_name, _data, _reply, 0);
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
	 * Ask the transport for an Intent that can be used to launch any internal
	 * configuration Activity that it wishes to present.  For example, the transport
	 * may offer a UI for allowing the user to supply login credentials for the
	 * transport's off-device backend.
	 *
	 * If the transport does not supply any user-facing configuration UI, it should
	 * return null from this method.
	 *
	 * @return An Intent that can be passed to Context.startActivity() in order to
	 *         launch the transport's configuration UI.  This method will return null
	 *         if the transport does not offer any user-facing configuration UI.
	 */
@Override public android.content.Intent configurationIntent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.Intent _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_configurationIntent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.Intent.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String currentDestinationString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_currentDestinationString, _data, _reply, 0);
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
     * Ask the transport for an Intent that can be used to launch a more detailed
     * secondary data management activity.  For example, the configuration intent might
     * be one for allowing the user to select which account they wish to associate
     * their backups with, and the management intent might be one which presents a
     * UI for managing the data on the backend.
     *
     * <p>In the Settings UI, the configuration intent will typically be invoked
     * when the user taps on the preferences item labeled with the current
     * destination string, and the management intent will be placed in an overflow
     * menu labelled with the management label string.
     *
     * <p>If the transport does not supply any user-facing data management
     * UI, then it should return {@code null} from this method.
     *
     * @return An intent that can be passed to Context.startActivity() in order to
     *         launch the transport's data-management UI.  This method will return
     *         {@code null} if the transport does not offer any user-facing data
     *         management UI.
     */
@Override public android.content.Intent dataManagementIntent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.Intent _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dataManagementIntent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.Intent.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String dataManagementLabel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dataManagementLabel, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String transportDirName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_transportDirName, _data, _reply, 0);
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
     * Verify that this is a suitable time for a backup pass.  This should return zero
     * if a backup is reasonable right now, some positive value otherwise.  This method
     * will be called outside of the {@link #startSession}/{@link #endSession} pair.
     *
     * <p>If this is not a suitable time for a backup, the transport should return a
     * backoff delay, in milliseconds, after which the Backup Manager should try again.
     *
     * @return Zero if this is a suitable time for a backup pass, or a positive time delay
     *   in milliseconds to suggest deferring the backup pass for a while.
     */
@Override public long requestBackupTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestBackupTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int initializeDevice() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_initializeDevice, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int performBackup(android.content.pm.PackageInfo packageInfo, android.os.ParcelFileDescriptor inFd, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((packageInfo!=null)) {
_data.writeInt(1);
packageInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((inFd!=null)) {
_data.writeInt(1);
inFd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_performBackup, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int clearBackupData(android.content.pm.PackageInfo packageInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((packageInfo!=null)) {
_data.writeInt(1);
packageInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clearBackupData, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int finishBackup() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_finishBackup, _data, _reply, 0);
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
     * Get the set of all backups currently available over this transport.
     *
     * @return Descriptions of the set of restore images available for this device,
     *   or null if an error occurred (the attempt should be rescheduled).
     **/
@Override public android.app.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.backup.RestoreSet[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAvailableRestoreSets, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.app.backup.RestoreSet.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the identifying token of the backup set currently being stored from
     * this device.  This is used in the case of applications wishing to restore
     * their last-known-good data.
     *
     * @return A token that can be passed to {@link #startRestore}, or 0 if there
     *   is no backup set available corresponding to the current device state.
     */
@Override public long getCurrentRestoreSet() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentRestoreSet, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startRestore(long token, android.content.pm.PackageInfo[] packages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(token);
_data.writeTypedArray(packages, 0);
mRemote.transact(Stub.TRANSACTION_startRestore, _data, _reply, 0);
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
     * Get the package name of the next application with data in the backup store, plus
     * a description of the structure of the restored archive: either TYPE_KEY_VALUE for
     * an original-API key/value dataset, or TYPE_FULL_STREAM for a tarball-type archive stream.
     *
     * <p>If the package name in the returned RestoreDescription object is the singleton
     * {@link RestoreDescription#NO_MORE_PACKAGES}, it indicates that no further data is available
     * in the current restore session: all packages described in startRestore() have been
     * processed.
     *
     * <p>If this method returns {@code null}, it means that a transport-level error has
     * occurred and the entire restore operation should be abandoned.
     *
     * @return A RestoreDescription object containing the name of one of the packages
     *   supplied to {@link #startRestore} plus an indicator of the data type of that
     *   restore data; or {@link RestoreDescription#NO_MORE_PACKAGES} to indicate that
     *   no more packages can be restored in this session; or {@code null} to indicate
     *   a transport-level error.
     */
@Override public android.app.backup.RestoreDescription nextRestorePackage() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.backup.RestoreDescription _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_nextRestorePackage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.backup.RestoreDescription.CREATOR.createFromParcel(_reply);
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
@Override public int getRestoreData(android.os.ParcelFileDescriptor outFd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((outFd!=null)) {
_data.writeInt(1);
outFd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getRestoreData, _data, _reply, 0);
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
     * End a restore session (aborting any in-process data transfer as necessary),
     * freeing any resources and connections used during the restore process.
     */
@Override public void finishRestore() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_finishRestore, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// full backup stuff

@Override public long requestFullBackupTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestFullBackupTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int performFullBackup(android.content.pm.PackageInfo targetPackage, android.os.ParcelFileDescriptor socket, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((targetPackage!=null)) {
_data.writeInt(1);
targetPackage.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((socket!=null)) {
_data.writeInt(1);
socket.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_performFullBackup, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int checkFullBackupSize(long size) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(size);
mRemote.transact(Stub.TRANSACTION_checkFullBackupSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int sendBackupData(int numBytes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(numBytes);
mRemote.transact(Stub.TRANSACTION_sendBackupData, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void cancelFullBackup() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelFullBackup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Ask the transport whether this app is eligible for backup.
     *
     * @param targetPackage The identity of the application.
     * @param isFullBackup If set, transport should check if app is eligible for full data backup,
     *   otherwise to check if eligible for key-value backup.
     * @return Whether this app is eligible for backup.
     */
@Override public boolean isAppEligibleForBackup(android.content.pm.PackageInfo targetPackage, boolean isFullBackup) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((targetPackage!=null)) {
_data.writeInt(1);
targetPackage.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((isFullBackup)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_isAppEligibleForBackup, _data, _reply, 0);
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
     * Ask the transport about current quota for backup size of the package.
     *
     * @param packageName ID of package to provide the quota.
     * @param isFullBackup If set, transport should return limit for full data backup, otherwise
     *                     for key-value backup.
     * @return Current limit on full data backup size in bytes.
     */
@Override public long getBackupQuota(java.lang.String packageName, boolean isFullBackup) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(((isFullBackup)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getBackupQuota, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor socket) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((socket!=null)) {
_data.writeInt(1);
socket.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getNextFullRestoreDataChunk, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int abortFullRestore() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_abortFullRestore, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_name = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_configurationIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_currentDestinationString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_dataManagementIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_dataManagementLabel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_transportDirName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_requestBackupTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_initializeDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_performBackup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_clearBackupData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_finishBackup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getAvailableRestoreSets = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getCurrentRestoreSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_startRestore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_nextRestorePackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getRestoreData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_finishRestore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_requestFullBackupTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_performFullBackup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_checkFullBackupSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_sendBackupData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_cancelFullBackup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_isAppEligibleForBackup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getBackupQuota = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getNextFullRestoreDataChunk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_abortFullRestore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
}
public java.lang.String name() throws android.os.RemoteException;
/**
	 * Ask the transport for an Intent that can be used to launch any internal
	 * configuration Activity that it wishes to present.  For example, the transport
	 * may offer a UI for allowing the user to supply login credentials for the
	 * transport's off-device backend.
	 *
	 * If the transport does not supply any user-facing configuration UI, it should
	 * return null from this method.
	 *
	 * @return An Intent that can be passed to Context.startActivity() in order to
	 *         launch the transport's configuration UI.  This method will return null
	 *         if the transport does not offer any user-facing configuration UI.
	 */
public android.content.Intent configurationIntent() throws android.os.RemoteException;
public java.lang.String currentDestinationString() throws android.os.RemoteException;
/**
     * Ask the transport for an Intent that can be used to launch a more detailed
     * secondary data management activity.  For example, the configuration intent might
     * be one for allowing the user to select which account they wish to associate
     * their backups with, and the management intent might be one which presents a
     * UI for managing the data on the backend.
     *
     * <p>In the Settings UI, the configuration intent will typically be invoked
     * when the user taps on the preferences item labeled with the current
     * destination string, and the management intent will be placed in an overflow
     * menu labelled with the management label string.
     *
     * <p>If the transport does not supply any user-facing data management
     * UI, then it should return {@code null} from this method.
     *
     * @return An intent that can be passed to Context.startActivity() in order to
     *         launch the transport's data-management UI.  This method will return
     *         {@code null} if the transport does not offer any user-facing data
     *         management UI.
     */
public android.content.Intent dataManagementIntent() throws android.os.RemoteException;
public java.lang.String dataManagementLabel() throws android.os.RemoteException;
public java.lang.String transportDirName() throws android.os.RemoteException;
/**
     * Verify that this is a suitable time for a backup pass.  This should return zero
     * if a backup is reasonable right now, some positive value otherwise.  This method
     * will be called outside of the {@link #startSession}/{@link #endSession} pair.
     *
     * <p>If this is not a suitable time for a backup, the transport should return a
     * backoff delay, in milliseconds, after which the Backup Manager should try again.
     *
     * @return Zero if this is a suitable time for a backup pass, or a positive time delay
     *   in milliseconds to suggest deferring the backup pass for a while.
     */
public long requestBackupTime() throws android.os.RemoteException;
public int initializeDevice() throws android.os.RemoteException;
public int performBackup(android.content.pm.PackageInfo packageInfo, android.os.ParcelFileDescriptor inFd, int flags) throws android.os.RemoteException;
public int clearBackupData(android.content.pm.PackageInfo packageInfo) throws android.os.RemoteException;
public int finishBackup() throws android.os.RemoteException;
/**
     * Get the set of all backups currently available over this transport.
     *
     * @return Descriptions of the set of restore images available for this device,
     *   or null if an error occurred (the attempt should be rescheduled).
     **/
public android.app.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException;
/**
     * Get the identifying token of the backup set currently being stored from
     * this device.  This is used in the case of applications wishing to restore
     * their last-known-good data.
     *
     * @return A token that can be passed to {@link #startRestore}, or 0 if there
     *   is no backup set available corresponding to the current device state.
     */
public long getCurrentRestoreSet() throws android.os.RemoteException;
public int startRestore(long token, android.content.pm.PackageInfo[] packages) throws android.os.RemoteException;
/**
     * Get the package name of the next application with data in the backup store, plus
     * a description of the structure of the restored archive: either TYPE_KEY_VALUE for
     * an original-API key/value dataset, or TYPE_FULL_STREAM for a tarball-type archive stream.
     *
     * <p>If the package name in the returned RestoreDescription object is the singleton
     * {@link RestoreDescription#NO_MORE_PACKAGES}, it indicates that no further data is available
     * in the current restore session: all packages described in startRestore() have been
     * processed.
     *
     * <p>If this method returns {@code null}, it means that a transport-level error has
     * occurred and the entire restore operation should be abandoned.
     *
     * @return A RestoreDescription object containing the name of one of the packages
     *   supplied to {@link #startRestore} plus an indicator of the data type of that
     *   restore data; or {@link RestoreDescription#NO_MORE_PACKAGES} to indicate that
     *   no more packages can be restored in this session; or {@code null} to indicate
     *   a transport-level error.
     */
public android.app.backup.RestoreDescription nextRestorePackage() throws android.os.RemoteException;
public int getRestoreData(android.os.ParcelFileDescriptor outFd) throws android.os.RemoteException;
/**
     * End a restore session (aborting any in-process data transfer as necessary),
     * freeing any resources and connections used during the restore process.
     */
public void finishRestore() throws android.os.RemoteException;
// full backup stuff

public long requestFullBackupTime() throws android.os.RemoteException;
public int performFullBackup(android.content.pm.PackageInfo targetPackage, android.os.ParcelFileDescriptor socket, int flags) throws android.os.RemoteException;
public int checkFullBackupSize(long size) throws android.os.RemoteException;
public int sendBackupData(int numBytes) throws android.os.RemoteException;
public void cancelFullBackup() throws android.os.RemoteException;
/**
     * Ask the transport whether this app is eligible for backup.
     *
     * @param targetPackage The identity of the application.
     * @param isFullBackup If set, transport should check if app is eligible for full data backup,
     *   otherwise to check if eligible for key-value backup.
     * @return Whether this app is eligible for backup.
     */
public boolean isAppEligibleForBackup(android.content.pm.PackageInfo targetPackage, boolean isFullBackup) throws android.os.RemoteException;
/**
     * Ask the transport about current quota for backup size of the package.
     *
     * @param packageName ID of package to provide the quota.
     * @param isFullBackup If set, transport should return limit for full data backup, otherwise
     *                     for key-value backup.
     * @return Current limit on full data backup size in bytes.
     */
public long getBackupQuota(java.lang.String packageName, boolean isFullBackup) throws android.os.RemoteException;
public int getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor socket) throws android.os.RemoteException;
public int abortFullRestore() throws android.os.RemoteException;
}
