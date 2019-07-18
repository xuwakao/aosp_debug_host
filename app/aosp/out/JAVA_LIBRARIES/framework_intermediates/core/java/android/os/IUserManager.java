/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IUserManager.aidl
 */
package android.os;
/**
 *  {@hide}
 */
public interface IUserManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IUserManager
{
private static final java.lang.String DESCRIPTOR = "android.os.IUserManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IUserManager interface,
 * generating a proxy if needed.
 */
public static android.os.IUserManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IUserManager))) {
return ((android.os.IUserManager)iin);
}
return new android.os.IUserManager.Stub.Proxy(obj);
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
case TRANSACTION_getCredentialOwnerProfile:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getCredentialOwnerProfile(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.UserInfo _result = this.createUser(_arg0, _arg1);
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
case TRANSACTION_createProfileForUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
android.content.pm.UserInfo _result = this.createProfileForUser(_arg0, _arg1, _arg2, _arg3);
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
case TRANSACTION_createRestrictedProfile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.UserInfo _result = this.createRestrictedProfile(_arg0, _arg1);
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
case TRANSACTION_setUserEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setUserEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_evictCredentialEncryptionKey:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.evictCredentialEncryptionKey(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.removeUser(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeUserEvenWhenDisallowed:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.removeUserEvenWhenDisallowed(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUserName:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.setUserName(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setUserIcon:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Bitmap _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setUserIcon(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getUserIcon:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.ParcelFileDescriptor _result = this.getUserIcon(_arg0);
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
case TRANSACTION_getPrimaryUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.UserInfo _result = this.getPrimaryUser();
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
case TRANSACTION_getUsers:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
java.util.List<android.content.pm.UserInfo> _result = this.getUsers(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getProfiles:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
java.util.List<android.content.pm.UserInfo> _result = this.getProfiles(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getProfileIds:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int[] _result = this.getProfileIds(_arg0, _arg1);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_canAddMoreManagedProfiles:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.canAddMoreManagedProfiles(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProfileParent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.pm.UserInfo _result = this.getProfileParent(_arg0);
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
case TRANSACTION_isSameProfileGroup:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isSameProfileGroup(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getUserInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.pm.UserInfo _result = this.getUserInfo(_arg0);
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
case TRANSACTION_getUserAccount:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getUserAccount(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setUserAccount:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.setUserAccount(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getUserCreationTime:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _result = this.getUserCreationTime(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_isRestricted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isRestricted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_canHaveRestrictedProfile:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.canHaveRestrictedProfile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getUserSerialNumber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getUserSerialNumber(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getUserHandle:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getUserHandle(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getUserRestrictionSource:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.getUserRestrictionSource(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getUserRestrictionSources:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.util.List<android.os.UserManager.EnforcingUser> _result = this.getUserRestrictionSources(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getUserRestrictions:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.Bundle _result = this.getUserRestrictions(_arg0);
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
case TRANSACTION_hasBaseUserRestriction:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.hasBaseUserRestriction(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hasUserRestriction:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.hasUserRestriction(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUserRestriction:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.setUserRestriction(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.setApplicationRestrictions(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _result = this.getApplicationRestrictions(_arg0);
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
case TRANSACTION_getApplicationRestrictionsForUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _result = this.getApplicationRestrictionsForUser(_arg0, _arg1);
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
case TRANSACTION_setDefaultGuestRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setDefaultGuestRestrictions(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultGuestRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _result = this.getDefaultGuestRestrictions();
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
case TRANSACTION_markGuestForDeletion:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.markGuestForDeletion(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setQuietModeEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setQuietModeEnabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isQuietModeEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isQuietModeEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_trySetQuietModeDisabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.IntentSender _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.IntentSender.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.trySetQuietModeDisabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setSeedAccountData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.PersistableBundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.PersistableBundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
boolean _arg4;
_arg4 = (0!=data.readInt());
this.setSeedAccountData(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_getSeedAccountName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getSeedAccountName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSeedAccountType:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getSeedAccountType();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSeedAccountOptions:
{
data.enforceInterface(DESCRIPTOR);
android.os.PersistableBundle _result = this.getSeedAccountOptions();
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
case TRANSACTION_clearSeedAccountData:
{
data.enforceInterface(DESCRIPTOR);
this.clearSeedAccountData();
reply.writeNoException();
return true;
}
case TRANSACTION_someUserHasSeedAccount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.someUserHasSeedAccount(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isManagedProfile:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isManagedProfile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDemoUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isDemoUser(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_createProfileForUserEvenWhenDisallowed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
android.content.pm.UserInfo _result = this.createProfileForUserEvenWhenDisallowed(_arg0, _arg1, _arg2, _arg3);
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
case TRANSACTION_isUserUnlockingOrUnlocked:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isUserUnlockingOrUnlocked(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getManagedProfileBadge:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getManagedProfileBadge(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isUserUnlocked:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isUserUnlocked(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isUserRunning:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isUserRunning(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isUserNameSet:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isUserNameSet(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IUserManager
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
@Override public int getCredentialOwnerProfile(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getCredentialOwnerProfile, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.UserInfo createUser(java.lang.String name, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_createUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public android.content.pm.UserInfo createProfileForUser(java.lang.String name, int flags, int userHandle, java.lang.String[] disallowedPackages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(flags);
_data.writeInt(userHandle);
_data.writeStringArray(disallowedPackages);
mRemote.transact(Stub.TRANSACTION_createProfileForUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public android.content.pm.UserInfo createRestrictedProfile(java.lang.String name, int parentUserHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(parentUserHandle);
mRemote.transact(Stub.TRANSACTION_createRestrictedProfile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public void setUserEnabled(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setUserEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void evictCredentialEncryptionKey(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_evictCredentialEncryptionKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean removeUser(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_removeUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeUserEvenWhenDisallowed(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_removeUserEvenWhenDisallowed, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUserName(int userHandle, java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_setUserName, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setUserIcon(int userHandle, android.graphics.Bitmap icon) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
if ((icon!=null)) {
_data.writeInt(1);
icon.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setUserIcon, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.ParcelFileDescriptor getUserIcon(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserIcon, _data, _reply, 0);
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
@Override public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrimaryUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public java.util.List<android.content.pm.UserInfo> getUsers(boolean excludeDying) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.UserInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((excludeDying)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getUsers, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.UserInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.content.pm.UserInfo> getProfiles(int userHandle, boolean enabledOnly) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.UserInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeInt(((enabledOnly)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getProfiles, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.UserInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getProfileIds(int userId, boolean enabledOnly) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeInt(((enabledOnly)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getProfileIds, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean canAddMoreManagedProfiles(int userHandle, boolean allowedToRemoveOne) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeInt(((allowedToRemoveOne)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_canAddMoreManagedProfiles, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.UserInfo getProfileParent(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getProfileParent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public boolean isSameProfileGroup(int userHandle, int otherUserHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeInt(otherUserHandle);
mRemote.transact(Stub.TRANSACTION_isSameProfileGroup, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.UserInfo getUserInfo(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String getUserAccount(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserAccount, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUserAccount(int userHandle, java.lang.String accountName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeString(accountName);
mRemote.transact(Stub.TRANSACTION_setUserAccount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getUserCreationTime(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserCreationTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isRestricted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isRestricted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean canHaveRestrictedProfile(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_canHaveRestrictedProfile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getUserSerialNumber(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserSerialNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getUserHandle(int userSerialNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userSerialNumber);
mRemote.transact(Stub.TRANSACTION_getUserHandle, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getUserRestrictionSource(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(restrictionKey);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserRestrictionSource, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.os.UserManager.EnforcingUser> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(restrictionKey);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserRestrictionSources, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.os.UserManager.EnforcingUser.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.Bundle getUserRestrictions(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getUserRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public boolean hasBaseUserRestriction(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(restrictionKey);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_hasBaseUserRestriction, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean hasUserRestriction(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(restrictionKey);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_hasUserRestriction, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUserRestriction(java.lang.String key, boolean value, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(((value)?(1):(0)));
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setUserRestriction, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setApplicationRestrictions(java.lang.String packageName, android.os.Bundle restrictions, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((restrictions!=null)) {
_data.writeInt(1);
restrictions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setApplicationRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getApplicationRestrictions(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getApplicationRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String packageName, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getApplicationRestrictionsForUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public void setDefaultGuestRestrictions(android.os.Bundle restrictions) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_setDefaultGuestRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultGuestRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public boolean markGuestForDeletion(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_markGuestForDeletion, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setQuietModeEnabled(int userHandle, boolean enableQuietMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeInt(((enableQuietMode)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setQuietModeEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isQuietModeEnabled(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isQuietModeEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean trySetQuietModeDisabled(int userHandle, android.content.IntentSender target) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
if ((target!=null)) {
_data.writeInt(1);
target.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_trySetQuietModeDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setSeedAccountData(int userHandle, java.lang.String accountName, java.lang.String accountType, android.os.PersistableBundle accountOptions, boolean persist) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeString(accountName);
_data.writeString(accountType);
if ((accountOptions!=null)) {
_data.writeInt(1);
accountOptions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((persist)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setSeedAccountData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getSeedAccountName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSeedAccountName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSeedAccountType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSeedAccountType, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.PersistableBundle getSeedAccountOptions() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.PersistableBundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSeedAccountOptions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.PersistableBundle.CREATOR.createFromParcel(_reply);
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
@Override public void clearSeedAccountData() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearSeedAccountData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean someUserHasSeedAccount(java.lang.String accountName, java.lang.String accountType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(accountName);
_data.writeString(accountType);
mRemote.transact(Stub.TRANSACTION_someUserHasSeedAccount, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isManagedProfile(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isManagedProfile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDemoUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isDemoUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowed(java.lang.String name, int flags, int userHandle, java.lang.String[] disallowedPackages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.UserInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(flags);
_data.writeInt(userHandle);
_data.writeStringArray(disallowedPackages);
mRemote.transact(Stub.TRANSACTION_createProfileForUserEvenWhenDisallowed, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.UserInfo.CREATOR.createFromParcel(_reply);
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
@Override public boolean isUserUnlockingOrUnlocked(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isUserUnlockingOrUnlocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getManagedProfileBadge(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getManagedProfileBadge, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isUserUnlocked(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isUserUnlocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isUserRunning(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isUserRunning, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isUserNameSet(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isUserNameSet, _data, _reply, 0);
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
static final int TRANSACTION_getCredentialOwnerProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_createUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_createProfileForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_createRestrictedProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setUserEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_evictCredentialEncryptionKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_removeUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_removeUserEvenWhenDisallowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setUserName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setUserIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getUserIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getPrimaryUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getProfileIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_canAddMoreManagedProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getProfileParent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_isSameProfileGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getUserInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getUserAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setUserAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getUserCreationTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_isRestricted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_canHaveRestrictedProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getUserSerialNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getUserHandle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getUserRestrictionSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getUserRestrictionSources = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getUserRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_hasBaseUserRestriction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_hasUserRestriction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_setUserRestriction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_setApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_getApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_getApplicationRestrictionsForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_setDefaultGuestRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_getDefaultGuestRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_markGuestForDeletion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_setQuietModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_isQuietModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_trySetQuietModeDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_setSeedAccountData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getSeedAccountName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_getSeedAccountType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_getSeedAccountOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_clearSeedAccountData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_someUserHasSeedAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_isManagedProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_isDemoUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_createProfileForUserEvenWhenDisallowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_isUserUnlockingOrUnlocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_getManagedProfileBadge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_isUserUnlocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_isUserRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_isUserNameSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
}
public int getCredentialOwnerProfile(int userHandle) throws android.os.RemoteException;
public android.content.pm.UserInfo createUser(java.lang.String name, int flags) throws android.os.RemoteException;
public android.content.pm.UserInfo createProfileForUser(java.lang.String name, int flags, int userHandle, java.lang.String[] disallowedPackages) throws android.os.RemoteException;
public android.content.pm.UserInfo createRestrictedProfile(java.lang.String name, int parentUserHandle) throws android.os.RemoteException;
public void setUserEnabled(int userHandle) throws android.os.RemoteException;
public void evictCredentialEncryptionKey(int userHandle) throws android.os.RemoteException;
public boolean removeUser(int userHandle) throws android.os.RemoteException;
public boolean removeUserEvenWhenDisallowed(int userHandle) throws android.os.RemoteException;
public void setUserName(int userHandle, java.lang.String name) throws android.os.RemoteException;
public void setUserIcon(int userHandle, android.graphics.Bitmap icon) throws android.os.RemoteException;
public android.os.ParcelFileDescriptor getUserIcon(int userHandle) throws android.os.RemoteException;
public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException;
public java.util.List<android.content.pm.UserInfo> getUsers(boolean excludeDying) throws android.os.RemoteException;
public java.util.List<android.content.pm.UserInfo> getProfiles(int userHandle, boolean enabledOnly) throws android.os.RemoteException;
public int[] getProfileIds(int userId, boolean enabledOnly) throws android.os.RemoteException;
public boolean canAddMoreManagedProfiles(int userHandle, boolean allowedToRemoveOne) throws android.os.RemoteException;
public android.content.pm.UserInfo getProfileParent(int userHandle) throws android.os.RemoteException;
public boolean isSameProfileGroup(int userHandle, int otherUserHandle) throws android.os.RemoteException;
public android.content.pm.UserInfo getUserInfo(int userHandle) throws android.os.RemoteException;
public java.lang.String getUserAccount(int userHandle) throws android.os.RemoteException;
public void setUserAccount(int userHandle, java.lang.String accountName) throws android.os.RemoteException;
public long getUserCreationTime(int userHandle) throws android.os.RemoteException;
public boolean isRestricted() throws android.os.RemoteException;
public boolean canHaveRestrictedProfile(int userHandle) throws android.os.RemoteException;
public int getUserSerialNumber(int userHandle) throws android.os.RemoteException;
public int getUserHandle(int userSerialNumber) throws android.os.RemoteException;
public int getUserRestrictionSource(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException;
public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException;
public android.os.Bundle getUserRestrictions(int userHandle) throws android.os.RemoteException;
public boolean hasBaseUserRestriction(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException;
public boolean hasUserRestriction(java.lang.String restrictionKey, int userHandle) throws android.os.RemoteException;
public void setUserRestriction(java.lang.String key, boolean value, int userHandle) throws android.os.RemoteException;
public void setApplicationRestrictions(java.lang.String packageName, android.os.Bundle restrictions, int userHandle) throws android.os.RemoteException;
public android.os.Bundle getApplicationRestrictions(java.lang.String packageName) throws android.os.RemoteException;
public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String packageName, int userHandle) throws android.os.RemoteException;
public void setDefaultGuestRestrictions(android.os.Bundle restrictions) throws android.os.RemoteException;
public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException;
public boolean markGuestForDeletion(int userHandle) throws android.os.RemoteException;
public void setQuietModeEnabled(int userHandle, boolean enableQuietMode) throws android.os.RemoteException;
public boolean isQuietModeEnabled(int userHandle) throws android.os.RemoteException;
public boolean trySetQuietModeDisabled(int userHandle, android.content.IntentSender target) throws android.os.RemoteException;
public void setSeedAccountData(int userHandle, java.lang.String accountName, java.lang.String accountType, android.os.PersistableBundle accountOptions, boolean persist) throws android.os.RemoteException;
public java.lang.String getSeedAccountName() throws android.os.RemoteException;
public java.lang.String getSeedAccountType() throws android.os.RemoteException;
public android.os.PersistableBundle getSeedAccountOptions() throws android.os.RemoteException;
public void clearSeedAccountData() throws android.os.RemoteException;
public boolean someUserHasSeedAccount(java.lang.String accountName, java.lang.String accountType) throws android.os.RemoteException;
public boolean isManagedProfile(int userId) throws android.os.RemoteException;
public boolean isDemoUser(int userId) throws android.os.RemoteException;
public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowed(java.lang.String name, int flags, int userHandle, java.lang.String[] disallowedPackages) throws android.os.RemoteException;
public boolean isUserUnlockingOrUnlocked(int userId) throws android.os.RemoteException;
public int getManagedProfileBadge(int userId) throws android.os.RemoteException;
public boolean isUserUnlocked(int userId) throws android.os.RemoteException;
public boolean isUserRunning(int userId) throws android.os.RemoteException;
public boolean isUserNameSet(int userHandle) throws android.os.RemoteException;
}
