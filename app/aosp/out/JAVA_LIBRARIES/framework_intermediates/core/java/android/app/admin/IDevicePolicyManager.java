/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/admin/IDevicePolicyManager.aidl
 */
package android.app.admin;
/**
 * Internal IPC interface to the device policy service.
 * {@hide}
 */
public interface IDevicePolicyManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.admin.IDevicePolicyManager
{
private static final java.lang.String DESCRIPTOR = "android.app.admin.IDevicePolicyManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.admin.IDevicePolicyManager interface,
 * generating a proxy if needed.
 */
public static android.app.admin.IDevicePolicyManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.admin.IDevicePolicyManager))) {
return ((android.app.admin.IDevicePolicyManager)iin);
}
return new android.app.admin.IDevicePolicyManager.Stub.Proxy(obj);
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
case TRANSACTION_setPasswordQuality:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordQuality(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordQuality:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordQuality(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordMinimumLength(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordMinimumLength(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumUpperCase:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordMinimumUpperCase(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumUpperCase:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordMinimumUpperCase(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumLowerCase:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordMinimumLowerCase(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumLowerCase:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordMinimumLowerCase(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumLetters:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordMinimumLetters(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumLetters:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordMinimumLetters(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumNumeric:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordMinimumNumeric(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumNumeric:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordMinimumNumeric(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumSymbols:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordMinimumSymbols(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumSymbols:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordMinimumSymbols(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordMinimumNonLetter:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordMinimumNonLetter(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordMinimumNonLetter:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordMinimumNonLetter(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordHistoryLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordHistoryLength(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordHistoryLength:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getPasswordHistoryLength(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPasswordExpirationTimeout:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPasswordExpirationTimeout(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPasswordExpirationTimeout:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
long _result = this.getPasswordExpirationTimeout(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getPasswordExpiration:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
long _result = this.getPasswordExpiration(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_isActivePasswordSufficient:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.isActivePasswordSufficient(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isProfileActivePasswordSufficientForParent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isProfileActivePasswordSufficientForParent(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCurrentFailedPasswordAttempts:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.getCurrentFailedPasswordAttempts(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.getProfileWithMinimumFailedPasswordsForWipe(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setMaximumFailedPasswordsForWipe:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setMaximumFailedPasswordsForWipe(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getMaximumFailedPasswordsForWipe:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getMaximumFailedPasswordsForWipe(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_resetPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.resetPassword(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setMaximumTimeToLock:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setMaximumTimeToLock(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getMaximumTimeToLock:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
long _result = this.getMaximumTimeToLock(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getMaximumTimeToLockForUserAndProfiles:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _result = this.getMaximumTimeToLockForUserAndProfiles(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setRequiredStrongAuthTimeout:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setRequiredStrongAuthTimeout(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getRequiredStrongAuthTimeout:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
long _result = this.getRequiredStrongAuthTimeout(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_lockNow:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.lockNow(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_wipeData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.wipeData(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setGlobalProxy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.content.ComponentName _result = this.setGlobalProxy(_arg0, _arg1, _arg2);
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
case TRANSACTION_getGlobalProxyAdmin:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _result = this.getGlobalProxyAdmin(_arg0);
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
case TRANSACTION_setRecommendedGlobalProxy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.net.ProxyInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.ProxyInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setRecommendedGlobalProxy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setStorageEncryption:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.setStorageEncryption(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getStorageEncryption:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.getStorageEncryption(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getStorageEncryptionStatus:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.getStorageEncryptionStatus(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_requestBugreport:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.requestBugreport(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCameraDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setCameraDisabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getCameraDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.getCameraDisabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setScreenCaptureDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setScreenCaptureDisabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getScreenCaptureDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.getScreenCaptureDisabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setKeyguardDisabledFeatures:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setKeyguardDisabledFeatures(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getKeyguardDisabledFeatures:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _result = this.getKeyguardDisabledFeatures(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setActiveAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.setActiveAdmin(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isAdminActive:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isAdminActive(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveAdmins:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.ComponentName> _result = this.getActiveAdmins(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_packageHasActiveAdmins:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.packageHasActiveAdmins(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRemoveWarning:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.RemoteCallback _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.RemoteCallback.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.getRemoveWarning(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_removeActiveAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.removeActiveAdmin(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_forceRemoveActiveAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.forceRemoveActiveAdmin(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_hasGrantedPolicy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.hasGrantedPolicy(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setActivePasswordState:
{
data.enforceInterface(DESCRIPTOR);
android.app.admin.PasswordMetrics _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.admin.PasswordMetrics.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setActivePasswordState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reportPasswordChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportPasswordChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportFailedPasswordAttempt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportFailedPasswordAttempt(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportSuccessfulPasswordAttempt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportSuccessfulPasswordAttempt(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportFailedFingerprintAttempt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportFailedFingerprintAttempt(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportSuccessfulFingerprintAttempt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportSuccessfulFingerprintAttempt(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportKeyguardDismissed:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportKeyguardDismissed(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_reportKeyguardSecured:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reportKeyguardSecured(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setDeviceOwner:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.setDeviceOwner(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDeviceOwnerComponent:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.content.ComponentName _result = this.getDeviceOwnerComponent(_arg0);
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
case TRANSACTION_hasDeviceOwner:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasDeviceOwner();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDeviceOwnerName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getDeviceOwnerName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_clearDeviceOwner:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearDeviceOwner(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDeviceOwnerUserId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDeviceOwnerUserId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setProfileOwner:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.setProfileOwner(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProfileOwner:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _result = this.getProfileOwner(_arg0);
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
case TRANSACTION_getProfileOwnerName:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getProfileOwnerName(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setProfileEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setProfileEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setProfileName:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.setProfileName(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearProfileOwner:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.clearProfileOwner(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_hasUserSetupCompleted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasUserSetupCompleted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setDeviceOwnerLockScreenInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.CharSequence _arg1;
if ((0!=data.readInt())) {
_arg1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setDeviceOwnerLockScreenInfo(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getDeviceOwnerLockScreenInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _result = this.getDeviceOwnerLockScreenInfo();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setPackagesSuspended:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
boolean _arg3;
_arg3 = (0!=data.readInt());
java.lang.String[] _result = this.setPackagesSuspended(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_isPackageSuspended:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.isPackageSuspended(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_installCaCert:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
byte[] _arg2;
_arg2 = data.createByteArray();
boolean _result = this.installCaCert(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_uninstallCaCerts:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
this.uninstallCaCerts(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_enforceCanManageCaCerts:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.enforceCanManageCaCerts(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_approveCaCert:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _result = this.approveCaCert(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isCaCertApproved:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isCaCertApproved(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_installKeyPair:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
byte[] _arg2;
_arg2 = data.createByteArray();
byte[] _arg3;
_arg3 = data.createByteArray();
byte[] _arg4;
_arg4 = data.createByteArray();
java.lang.String _arg5;
_arg5 = data.readString();
boolean _arg6;
_arg6 = (0!=data.readInt());
boolean _result = this.installKeyPair(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeKeyPair:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.removeKeyPair(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_choosePrivateKeyAlias:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
android.os.IBinder _arg3;
_arg3 = data.readStrongBinder();
this.choosePrivateKeyAlias(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setDelegatedScopes:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<java.lang.String> _arg2;
_arg2 = data.createStringArrayList();
this.setDelegatedScopes(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getDelegatedScopes:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<java.lang.String> _result = this.getDelegatedScopes(_arg0, _arg1);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_getDelegatePackages:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<java.lang.String> _result = this.getDelegatePackages(_arg0, _arg1);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_setCertInstallerPackage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.setCertInstallerPackage(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getCertInstallerPackage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getCertInstallerPackage(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setAlwaysOnVpnPackage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _result = this.setAlwaysOnVpnPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAlwaysOnVpnPackage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getAlwaysOnVpnPackage(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_addPersistentPreferredActivity:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.IntentFilter _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.IntentFilter.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.content.ComponentName _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.addPersistentPreferredActivity(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clearPackagePersistentPreferredActivities:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.clearPackagePersistentPreferredActivities(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.setApplicationRestrictions(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.Bundle _result = this.getApplicationRestrictions(_arg0, _arg1, _arg2);
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
case TRANSACTION_setApplicationRestrictionsManagingPackage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.setApplicationRestrictionsManagingPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getApplicationRestrictionsManagingPackage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getApplicationRestrictionsManagingPackage(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_isCallerApplicationRestrictionsManagingPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isCallerApplicationRestrictionsManagingPackage(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setRestrictionsProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setRestrictionsProvider(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getRestrictionsProvider:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _result = this.getRestrictionsProvider(_arg0);
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
case TRANSACTION_setUserRestriction:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setUserRestriction(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getUserRestrictions:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
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
case TRANSACTION_addCrossProfileIntentFilter:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.IntentFilter _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.IntentFilter.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.addCrossProfileIntentFilter(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clearCrossProfileIntentFilters:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.clearCrossProfileIntentFilters(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setPermittedAccessibilityServices:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _arg1;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg1 = data.readArrayList(cl);
boolean _result = this.setPermittedAccessibilityServices(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPermittedAccessibilityServices:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _result = this.getPermittedAccessibilityServices(_arg0);
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_getPermittedAccessibilityServicesForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List _result = this.getPermittedAccessibilityServicesForUser(_arg0);
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_isAccessibilityServicePermittedByAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.isAccessibilityServicePermittedByAdmin(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPermittedInputMethods:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _arg1;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg1 = data.readArrayList(cl);
boolean _result = this.setPermittedInputMethods(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPermittedInputMethods:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _result = this.getPermittedInputMethods(_arg0);
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_getPermittedInputMethodsForCurrentUser:
{
data.enforceInterface(DESCRIPTOR);
java.util.List _result = this.getPermittedInputMethodsForCurrentUser();
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_isInputMethodPermittedByAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.isInputMethodPermittedByAdmin(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPermittedCrossProfileNotificationListeners:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<java.lang.String> _arg1;
_arg1 = data.createStringArrayList();
boolean _result = this.setPermittedCrossProfileNotificationListeners(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPermittedCrossProfileNotificationListeners:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<java.lang.String> _result = this.getPermittedCrossProfileNotificationListeners(_arg0);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_isNotificationListenerServicePermitted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isNotificationListenerServicePermitted(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_createAdminSupportIntent:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _result = this.createAdminSupportIntent(_arg0);
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
case TRANSACTION_setApplicationHidden:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _arg3;
_arg3 = (0!=data.readInt());
boolean _result = this.setApplicationHidden(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isApplicationHidden:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.isApplicationHidden(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_createAndManageUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.content.ComponentName _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.PersistableBundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.PersistableBundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _arg4;
_arg4 = data.readInt();
android.os.UserHandle _result = this.createAndManageUser(_arg0, _arg1, _arg2, _arg3, _arg4);
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
case TRANSACTION_removeUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.removeUser(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_switchUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.switchUser(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableSystemApp:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.enableSystemApp(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_enableSystemAppWithIntent:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.content.Intent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _result = this.enableSystemAppWithIntent(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAccountManagementDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setAccountManagementDisabled(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAccountTypesWithManagementDisabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getAccountTypesWithManagementDisabled();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getAccountTypesWithManagementDisabledAsUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _result = this.getAccountTypesWithManagementDisabledAsUser(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_setLockTaskPackages:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.setLockTaskPackages(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getLockTaskPackages:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String[] _result = this.getLockTaskPackages(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_isLockTaskPermitted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isLockTaskPermitted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setGlobalSetting:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setGlobalSetting(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setSecureSetting:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setSecureSetting(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setMasterVolumeMuted:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setMasterVolumeMuted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isMasterVolumeMuted:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isMasterVolumeMuted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_notifyLockTaskModeChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.notifyLockTaskModeChanged(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setUninstallBlocked:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _arg3;
_arg3 = (0!=data.readInt());
this.setUninstallBlocked(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_isUninstallBlocked:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isUninstallBlocked(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCrossProfileCallerIdDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setCrossProfileCallerIdDisabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getCrossProfileCallerIdDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.getCrossProfileCallerIdDisabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCrossProfileCallerIdDisabledForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.getCrossProfileCallerIdDisabledForUser(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCrossProfileContactsSearchDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setCrossProfileContactsSearchDisabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getCrossProfileContactsSearchDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.getCrossProfileContactsSearchDisabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCrossProfileContactsSearchDisabledForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.getCrossProfileContactsSearchDisabledForUser(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startManagedQuickContact:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
boolean _arg2;
_arg2 = (0!=data.readInt());
long _arg3;
_arg3 = data.readLong();
android.content.Intent _arg4;
if ((0!=data.readInt())) {
_arg4 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
this.startManagedQuickContact(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_setBluetoothContactSharingDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setBluetoothContactSharingDisabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getBluetoothContactSharingDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.getBluetoothContactSharingDisabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBluetoothContactSharingDisabledForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.getBluetoothContactSharingDisabledForUser(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setTrustAgentConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.PersistableBundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.PersistableBundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
boolean _arg3;
_arg3 = (0!=data.readInt());
this.setTrustAgentConfiguration(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getTrustAgentConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
java.util.List<android.os.PersistableBundle> _result = this.getTrustAgentConfiguration(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_addCrossProfileWidgetProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.addCrossProfileWidgetProvider(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeCrossProfileWidgetProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.removeCrossProfileWidgetProvider(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCrossProfileWidgetProviders:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<java.lang.String> _result = this.getCrossProfileWidgetProviders(_arg0);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_setAutoTimeRequired:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setAutoTimeRequired(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAutoTimeRequired:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getAutoTimeRequired();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setForceEphemeralUsers:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setForceEphemeralUsers(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getForceEphemeralUsers:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.getForceEphemeralUsers(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isRemovingAdmin:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isRemovingAdmin(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUserIcon:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
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
case TRANSACTION_setSystemUpdatePolicy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.admin.SystemUpdatePolicy _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.admin.SystemUpdatePolicy.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setSystemUpdatePolicy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getSystemUpdatePolicy:
{
data.enforceInterface(DESCRIPTOR);
android.app.admin.SystemUpdatePolicy _result = this.getSystemUpdatePolicy();
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
case TRANSACTION_setKeyguardDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.setKeyguardDisabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setStatusBarDisabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.setStatusBarDisabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDoNotAskCredentialsOnBoot:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getDoNotAskCredentialsOnBoot();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_notifyPendingSystemUpdate:
{
data.enforceInterface(DESCRIPTOR);
android.app.admin.SystemUpdateInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.admin.SystemUpdateInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.notifyPendingSystemUpdate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPendingSystemUpdate:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.admin.SystemUpdateInfo _result = this.getPendingSystemUpdate(_arg0);
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
case TRANSACTION_setPermissionPolicy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.setPermissionPolicy(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPermissionPolicy:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getPermissionPolicy(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPermissionGrantState:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
boolean _result = this.setPermissionGrantState(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPermissionGrantState:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _result = this.getPermissionGrantState(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isProvisioningAllowed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isProvisioningAllowed(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_checkProvisioningPreCondition:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.checkProvisioningPreCondition(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setKeepUninstalledPackages:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<java.lang.String> _arg2;
_arg2 = data.createStringArrayList();
this.setKeepUninstalledPackages(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getKeepUninstalledPackages:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<java.lang.String> _result = this.getKeepUninstalledPackages(_arg0, _arg1);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_isManagedProfile:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isManagedProfile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSystemOnlyUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isSystemOnlyUser(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getWifiMacAddress:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getWifiMacAddress(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_reboot:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.reboot(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setShortSupportMessage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.CharSequence _arg1;
if ((0!=data.readInt())) {
_arg1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setShortSupportMessage(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getShortSupportMessage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.CharSequence _result = this.getShortSupportMessage(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setLongSupportMessage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.CharSequence _arg1;
if ((0!=data.readInt())) {
_arg1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setLongSupportMessage(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getLongSupportMessage:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.CharSequence _result = this.getLongSupportMessage(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getShortSupportMessageForUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
java.lang.CharSequence _result = this.getShortSupportMessageForUser(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getLongSupportMessageForUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
java.lang.CharSequence _result = this.getLongSupportMessageForUser(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_isSeparateProfileChallengeAllowed:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isSeparateProfileChallengeAllowed(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setOrganizationColor:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.setOrganizationColor(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setOrganizationColorForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setOrganizationColorForUser(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getOrganizationColor:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getOrganizationColor(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getOrganizationColorForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getOrganizationColorForUser(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setOrganizationName:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.CharSequence _arg1;
if ((0!=data.readInt())) {
_arg1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setOrganizationName(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getOrganizationName:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.CharSequence _result = this.getOrganizationName(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getDeviceOwnerOrganizationName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _result = this.getDeviceOwnerOrganizationName();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getOrganizationNameForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.CharSequence _result = this.getOrganizationNameForUser(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
android.text.TextUtils.writeToParcel(_result, reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getUserProvisioningState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getUserProvisioningState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setUserProvisioningState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setUserProvisioningState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAffiliationIds:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<java.lang.String> _arg1;
_arg1 = data.createStringArrayList();
this.setAffiliationIds(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAffiliationIds:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<java.lang.String> _result = this.getAffiliationIds(_arg0);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_isAffiliatedUser:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAffiliatedUser();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setSecurityLoggingEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setSecurityLoggingEnabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isSecurityLoggingEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isSecurityLoggingEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_retrieveSecurityLogs:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.ParceledListSlice _result = this.retrieveSecurityLogs(_arg0);
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
case TRANSACTION_retrievePreRebootSecurityLogs:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.ParceledListSlice _result = this.retrievePreRebootSecurityLogs(_arg0);
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
case TRANSACTION_isUninstallInQueue:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isUninstallInQueue(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_uninstallPackageWithActiveAdmins:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.uninstallPackageWithActiveAdmins(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isDeviceProvisioned:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDeviceProvisioned();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDeviceProvisioningConfigApplied:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDeviceProvisioningConfigApplied();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setDeviceProvisioningConfigApplied:
{
data.enforceInterface(DESCRIPTOR);
this.setDeviceProvisioningConfigApplied();
reply.writeNoException();
return true;
}
case TRANSACTION_forceUpdateUserSetupComplete:
{
data.enforceInterface(DESCRIPTOR);
this.forceUpdateUserSetupComplete();
reply.writeNoException();
return true;
}
case TRANSACTION_setBackupServiceEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setBackupServiceEnabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isBackupServiceEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isBackupServiceEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNetworkLoggingEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setNetworkLoggingEnabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isNetworkLoggingEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isNetworkLoggingEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_retrieveNetworkLogs:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
java.util.List<android.app.admin.NetworkEvent> _result = this.retrieveNetworkLogs(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_bindDeviceAdminServiceAsUser:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.IApplicationThread _arg1;
_arg1 = android.app.IApplicationThread.Stub.asInterface(data.readStrongBinder());
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
android.content.Intent _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.app.IServiceConnection _arg4;
_arg4 = android.app.IServiceConnection.Stub.asInterface(data.readStrongBinder());
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
boolean _result = this.bindDeviceAdminServiceAsUser(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBindDeviceAdminTargetUsers:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<android.os.UserHandle> _result = this.getBindDeviceAdminTargetUsers(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getLastSecurityLogRetrievalTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getLastSecurityLogRetrievalTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getLastBugReportRequestTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getLastBugReportRequestTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getLastNetworkLogRetrievalTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getLastNetworkLogRetrievalTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setResetPasswordToken:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.setResetPasswordToken(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_clearResetPasswordToken:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.clearResetPasswordToken(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isResetPasswordTokenActive:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isResetPasswordTokenActive(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_resetPasswordWithToken:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
byte[] _arg2;
_arg2 = data.createByteArray();
int _arg3;
_arg3 = data.readInt();
boolean _result = this.resetPasswordWithToken(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isCurrentInputMethodSetByOwner:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isCurrentInputMethodSetByOwner();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getOwnerInstalledCaCerts:
{
data.enforceInterface(DESCRIPTOR);
android.os.UserHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.StringParceledListSlice _result = this.getOwnerInstalledCaCerts(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.admin.IDevicePolicyManager
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
@Override public void setPasswordQuality(android.content.ComponentName who, int quality, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(quality);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordQuality, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordQuality(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordQuality, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumLength(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumLength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumLength(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumLength, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumUpperCase(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumUpperCase, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumUpperCase(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumUpperCase, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumLowerCase(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumLowerCase, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumLowerCase(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumLowerCase, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumLetters(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumLetters, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumLetters(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumLetters, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumNumeric(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumNumeric, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumNumeric(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumNumeric, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumSymbols(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumSymbols, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumSymbols(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumSymbols, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordMinimumNonLetter(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordMinimumNonLetter, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordMinimumNonLetter(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordMinimumNonLetter, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordHistoryLength(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(length);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordHistoryLength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPasswordHistoryLength(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordHistoryLength, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPasswordExpirationTimeout(android.content.ComponentName who, long expiration, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(expiration);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPasswordExpirationTimeout, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getPasswordExpirationTimeout(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordExpirationTimeout, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getPasswordExpiration(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getPasswordExpiration, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isActivePasswordSufficient(int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_isActivePasswordSufficient, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isProfileActivePasswordSufficientForParent(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isProfileActivePasswordSufficientForParent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCurrentFailedPasswordAttempts(int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getCurrentFailedPasswordAttempts, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getProfileWithMinimumFailedPasswordsForWipe(int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int num, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(num);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMaximumFailedPasswordsForWipe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getMaximumFailedPasswordsForWipe, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean resetPassword(java.lang.String password, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_resetPassword, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setMaximumTimeToLock(android.content.ComponentName who, long timeMs, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(timeMs);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMaximumTimeToLock, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getMaximumTimeToLock(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getMaximumTimeToLock, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getMaximumTimeToLockForUserAndProfiles(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getMaximumTimeToLockForUserAndProfiles, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setRequiredStrongAuthTimeout(android.content.ComponentName who, long timeMs, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(timeMs);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRequiredStrongAuthTimeout, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getRequiredStrongAuthTimeout(android.content.ComponentName who, int userId, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getRequiredStrongAuthTimeout, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void lockNow(int flags, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_lockNow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void wipeData(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_wipeData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.ComponentName setGlobalProxy(android.content.ComponentName admin, java.lang.String proxySpec, java.lang.String exclusionList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(proxySpec);
_data.writeString(exclusionList);
mRemote.transact(Stub.TRANSACTION_setGlobalProxy, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
@Override public android.content.ComponentName getGlobalProxyAdmin(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getGlobalProxyAdmin, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
@Override public void setRecommendedGlobalProxy(android.content.ComponentName admin, android.net.ProxyInfo proxyInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((proxyInfo!=null)) {
_data.writeInt(1);
proxyInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setRecommendedGlobalProxy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int setStorageEncryption(android.content.ComponentName who, boolean encrypt) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((encrypt)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setStorageEncryption, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getStorageEncryption(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getStorageEncryption, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getStorageEncryptionStatus(java.lang.String callerPackage, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callerPackage);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getStorageEncryptionStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean requestBugreport(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestBugreport, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCameraDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setCameraDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getCameraDisabled(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getCameraDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setScreenCaptureDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setScreenCaptureDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getScreenCaptureDisabled(android.content.ComponentName who, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getScreenCaptureDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setKeyguardDisabledFeatures(android.content.ComponentName who, int which, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(which);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setKeyguardDisabledFeatures, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getKeyguardDisabledFeatures(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getKeyguardDisabledFeatures, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setActiveAdmin(android.content.ComponentName policyReceiver, boolean refreshing, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((refreshing)?(1):(0)));
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setActiveAdmin, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isAdminActive(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isAdminActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.content.ComponentName> getActiveAdmins(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.ComponentName> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getActiveAdmins, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.ComponentName.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean packageHasActiveAdmins(java.lang.String packageName, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_packageHasActiveAdmins, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void getRemoveWarning(android.content.ComponentName policyReceiver, android.os.RemoteCallback result, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getRemoveWarning, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeActiveAdmin(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_removeActiveAdmin, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void forceRemoveActiveAdmin(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_forceRemoveActiveAdmin, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean hasGrantedPolicy(android.content.ComponentName policyReceiver, int usesPolicy, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policyReceiver!=null)) {
_data.writeInt(1);
policyReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(usesPolicy);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_hasGrantedPolicy, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setActivePasswordState(android.app.admin.PasswordMetrics metrics, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((metrics!=null)) {
_data.writeInt(1);
metrics.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setActivePasswordState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportPasswordChanged(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_reportPasswordChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportFailedPasswordAttempt(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_reportFailedPasswordAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportSuccessfulPasswordAttempt(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_reportSuccessfulPasswordAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportFailedFingerprintAttempt(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_reportFailedFingerprintAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportSuccessfulFingerprintAttempt(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_reportSuccessfulFingerprintAttempt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportKeyguardDismissed(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_reportKeyguardDismissed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportKeyguardSecured(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_reportKeyguardSecured, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean setDeviceOwner(android.content.ComponentName who, java.lang.String ownerName, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(ownerName);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setDeviceOwner, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.ComponentName getDeviceOwnerComponent(boolean callingUserOnly) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((callingUserOnly)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getDeviceOwnerComponent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
@Override public boolean hasDeviceOwner() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasDeviceOwner, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDeviceOwnerName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDeviceOwnerName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void clearDeviceOwner(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_clearDeviceOwner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDeviceOwnerUserId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDeviceOwnerUserId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setProfileOwner(android.content.ComponentName who, java.lang.String ownerName, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(ownerName);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setProfileOwner, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.ComponentName getProfileOwner(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getProfileOwner, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String getProfileOwnerName(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getProfileOwnerName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setProfileEnabled(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setProfileEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setProfileName(android.content.ComponentName who, java.lang.String profileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(profileName);
mRemote.transact(Stub.TRANSACTION_setProfileName, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearProfileOwner(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clearProfileOwner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean hasUserSetupCompleted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasUserSetupCompleted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDeviceOwnerLockScreenInfo(android.content.ComponentName who, java.lang.CharSequence deviceOwnerInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((deviceOwnerInfo!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(deviceOwnerInfo, _data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setDeviceOwnerLockScreenInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDeviceOwnerLockScreenInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String[] setPackagesSuspended(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String[] packageNames, boolean suspended) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeStringArray(packageNames);
_data.writeInt(((suspended)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPackagesSuspended, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isPackageSuspended(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isPackageSuspended, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean installCaCert(android.content.ComponentName admin, java.lang.String callerPackage, byte[] certBuffer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeByteArray(certBuffer);
mRemote.transact(Stub.TRANSACTION_installCaCert, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void uninstallCaCerts(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String[] aliases) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeStringArray(aliases);
mRemote.transact(Stub.TRANSACTION_uninstallCaCerts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enforceCanManageCaCerts(android.content.ComponentName admin, java.lang.String callerPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
mRemote.transact(Stub.TRANSACTION_enforceCanManageCaCerts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean approveCaCert(java.lang.String alias, int userHandle, boolean approval) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(alias);
_data.writeInt(userHandle);
_data.writeInt(((approval)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_approveCaCert, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isCaCertApproved(java.lang.String alias, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(alias);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isCaCertApproved, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean installKeyPair(android.content.ComponentName who, java.lang.String callerPackage, byte[] privKeyBuffer, byte[] certBuffer, byte[] certChainBuffer, java.lang.String alias, boolean requestAccess) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeByteArray(privKeyBuffer);
_data.writeByteArray(certBuffer);
_data.writeByteArray(certChainBuffer);
_data.writeString(alias);
_data.writeInt(((requestAccess)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_installKeyPair, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeKeyPair(android.content.ComponentName who, java.lang.String callerPackage, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_removeKeyPair, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void choosePrivateKeyAlias(int uid, android.net.Uri uri, java.lang.String alias, android.os.IBinder aliasCallback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
if ((uri!=null)) {
_data.writeInt(1);
uri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(alias);
_data.writeStrongBinder(aliasCallback);
mRemote.transact(Stub.TRANSACTION_choosePrivateKeyAlias, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDelegatedScopes(android.content.ComponentName who, java.lang.String delegatePackage, java.util.List<java.lang.String> scopes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(delegatePackage);
_data.writeStringList(scopes);
mRemote.transact(Stub.TRANSACTION_setDelegatedScopes, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName who, java.lang.String delegatePackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(delegatePackage);
mRemote.transact(Stub.TRANSACTION_getDelegatedScopes, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName who, java.lang.String scope) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(scope);
mRemote.transact(Stub.TRANSACTION_getDelegatePackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCertInstallerPackage(android.content.ComponentName who, java.lang.String installerPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(installerPackage);
mRemote.transact(Stub.TRANSACTION_setCertInstallerPackage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getCertInstallerPackage(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getCertInstallerPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setAlwaysOnVpnPackage(android.content.ComponentName who, java.lang.String vpnPackage, boolean lockdown) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(vpnPackage);
_data.writeInt(((lockdown)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAlwaysOnVpnPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAlwaysOnVpnPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addPersistentPreferredActivity(android.content.ComponentName admin, android.content.IntentFilter filter, android.content.ComponentName activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((filter!=null)) {
_data.writeInt(1);
filter.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((activity!=null)) {
_data.writeInt(1);
activity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addPersistentPreferredActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearPackagePersistentPreferredActivities(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_clearPackagePersistentPreferredActivities, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setApplicationRestrictions(android.content.ComponentName who, java.lang.String callerPackage, java.lang.String packageName, android.os.Bundle settings) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(packageName);
if ((settings!=null)) {
_data.writeInt(1);
settings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setApplicationRestrictions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getApplicationRestrictions(android.content.ComponentName who, java.lang.String callerPackage, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
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
@Override public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_setApplicationRestrictionsManagingPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getApplicationRestrictionsManagingPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String callerPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callerPackage);
mRemote.transact(Stub.TRANSACTION_isCallerApplicationRestrictionsManagingPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setRestrictionsProvider(android.content.ComponentName who, android.content.ComponentName provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((provider!=null)) {
_data.writeInt(1);
provider.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setRestrictionsProvider, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.ComponentName getRestrictionsProvider(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getRestrictionsProvider, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
@Override public void setUserRestriction(android.content.ComponentName who, java.lang.String key, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(key);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUserRestriction, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getUserRestrictions(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
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
@Override public void addCrossProfileIntentFilter(android.content.ComponentName admin, android.content.IntentFilter filter, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((filter!=null)) {
_data.writeInt(1);
filter.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_addCrossProfileIntentFilter, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearCrossProfileIntentFilters(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clearCrossProfileIntentFilters, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean setPermittedAccessibilityServices(android.content.ComponentName admin, java.util.List packageList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeList(packageList);
mRemote.transact(Stub.TRANSACTION_setPermittedAccessibilityServices, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List getPermittedAccessibilityServices(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPermittedAccessibilityServices, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List getPermittedAccessibilityServicesForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getPermittedAccessibilityServicesForUser, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName admin, java.lang.String packageName, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isAccessibilityServicePermittedByAdmin, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPermittedInputMethods(android.content.ComponentName admin, java.util.List packageList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeList(packageList);
mRemote.transact(Stub.TRANSACTION_setPermittedInputMethods, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List getPermittedInputMethods(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPermittedInputMethods, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPermittedInputMethodsForCurrentUser, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isInputMethodPermittedByAdmin(android.content.ComponentName admin, java.lang.String packageName, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isInputMethodPermittedByAdmin, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName admin, java.util.List<java.lang.String> packageList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringList(packageList);
mRemote.transact(Stub.TRANSACTION_setPermittedCrossProfileNotificationListeners, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPermittedCrossProfileNotificationListeners, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isNotificationListenerServicePermitted(java.lang.String packageName, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isNotificationListenerServicePermitted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.Intent createAdminSupportIntent(java.lang.String restriction) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.Intent _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(restriction);
mRemote.transact(Stub.TRANSACTION_createAdminSupportIntent, _data, _reply, 0);
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
@Override public boolean setApplicationHidden(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName, boolean hidden) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(packageName);
_data.writeInt(((hidden)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setApplicationHidden, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isApplicationHidden(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isApplicationHidden, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.UserHandle createAndManageUser(android.content.ComponentName who, java.lang.String name, android.content.ComponentName profileOwner, android.os.PersistableBundle adminExtras, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.UserHandle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(name);
if ((profileOwner!=null)) {
_data.writeInt(1);
profileOwner.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((adminExtras!=null)) {
_data.writeInt(1);
adminExtras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_createAndManageUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.UserHandle.CREATOR.createFromParcel(_reply);
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
@Override public boolean removeUser(android.content.ComponentName who, android.os.UserHandle userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((userHandle!=null)) {
_data.writeInt(1);
userHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
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
@Override public boolean switchUser(android.content.ComponentName who, android.os.UserHandle userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((userHandle!=null)) {
_data.writeInt(1);
userHandle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_switchUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void enableSystemApp(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_enableSystemApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int enableSystemAppWithIntent(android.content.ComponentName admin, java.lang.String callerPackage, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_enableSystemAppWithIntent, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAccountManagementDisabled(android.content.ComponentName who, java.lang.String accountType, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(accountType);
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAccountManagementDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAccountTypesWithManagementDisabled, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getAccountTypesWithManagementDisabledAsUser, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setLockTaskPackages(android.content.ComponentName who, java.lang.String[] packages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringArray(packages);
mRemote.transact(Stub.TRANSACTION_setLockTaskPackages, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getLockTaskPackages(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getLockTaskPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isLockTaskPermitted(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_isLockTaskPermitted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setGlobalSetting(android.content.ComponentName who, java.lang.String setting, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(setting);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setGlobalSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setSecureSetting(android.content.ComponentName who, java.lang.String setting, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(setting);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setSecureSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setMasterVolumeMuted(android.content.ComponentName admin, boolean on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((on)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMasterVolumeMuted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isMasterVolumeMuted(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isMasterVolumeMuted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void notifyLockTaskModeChanged(boolean isEnabled, java.lang.String pkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isEnabled)?(1):(0)));
_data.writeString(pkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_notifyLockTaskModeChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setUninstallBlocked(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName, boolean uninstallBlocked) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(packageName);
_data.writeInt(((uninstallBlocked)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUninstallBlocked, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isUninstallBlocked(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isUninstallBlocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCrossProfileCallerIdDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setCrossProfileCallerIdDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getCrossProfileCallerIdDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getCrossProfileCallerIdDisabledForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getCrossProfileCallerIdDisabledForUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setCrossProfileContactsSearchDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setCrossProfileContactsSearchDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getCrossProfileContactsSearchDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getCrossProfileContactsSearchDisabledForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getCrossProfileContactsSearchDisabledForUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void startManagedQuickContact(java.lang.String lookupKey, long contactId, boolean isContactIdIgnored, long directoryId, android.content.Intent originalIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(lookupKey);
_data.writeLong(contactId);
_data.writeInt(((isContactIdIgnored)?(1):(0)));
_data.writeLong(directoryId);
if ((originalIntent!=null)) {
_data.writeInt(1);
originalIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startManagedQuickContact, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setBluetoothContactSharingDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBluetoothContactSharingDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getBluetoothContactSharingDisabled(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getBluetoothContactSharingDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getBluetoothContactSharingDisabledForUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getBluetoothContactSharingDisabledForUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent, android.os.PersistableBundle args, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((agent!=null)) {
_data.writeInt(1);
agent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setTrustAgentConfiguration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent, int userId, boolean parent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.os.PersistableBundle> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((agent!=null)) {
_data.writeInt(1);
agent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
_data.writeInt(((parent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getTrustAgentConfiguration, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.os.PersistableBundle.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean addCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_addCrossProfileWidgetProvider, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_removeCrossProfileWidgetProvider, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getCrossProfileWidgetProviders, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAutoTimeRequired(android.content.ComponentName who, boolean required) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((required)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutoTimeRequired, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getAutoTimeRequired() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAutoTimeRequired, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setForceEphemeralUsers(android.content.ComponentName who, boolean forceEpehemeralUsers) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((forceEpehemeralUsers)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setForceEphemeralUsers, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getForceEphemeralUsers(android.content.ComponentName who) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getForceEphemeralUsers, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isRemovingAdmin(android.content.ComponentName adminReceiver, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((adminReceiver!=null)) {
_data.writeInt(1);
adminReceiver.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isRemovingAdmin, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUserIcon(android.content.ComponentName admin, android.graphics.Bitmap icon) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
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
@Override public void setSystemUpdatePolicy(android.content.ComponentName who, android.app.admin.SystemUpdatePolicy policy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((policy!=null)) {
_data.writeInt(1);
policy.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setSystemUpdatePolicy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.admin.SystemUpdatePolicy _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSystemUpdatePolicy, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.admin.SystemUpdatePolicy.CREATOR.createFromParcel(_reply);
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
@Override public boolean setKeyguardDisabled(android.content.ComponentName admin, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setKeyguardDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setStatusBarDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((who!=null)) {
_data.writeInt(1);
who.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setStatusBarDisabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDoNotAskCredentialsOnBoot, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyPendingSystemUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.admin.SystemUpdateInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPendingSystemUpdate, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.admin.SystemUpdateInfo.CREATOR.createFromParcel(_reply);
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
@Override public void setPermissionPolicy(android.content.ComponentName admin, java.lang.String callerPackage, int policy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeInt(policy);
mRemote.transact(Stub.TRANSACTION_setPermissionPolicy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPermissionPolicy(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPermissionPolicy, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPermissionGrantState(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName, java.lang.String permission, int grantState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(packageName);
_data.writeString(permission);
_data.writeInt(grantState);
mRemote.transact(Stub.TRANSACTION_setPermissionGrantState, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPermissionGrantState(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName, java.lang.String permission) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeString(packageName);
_data.writeString(permission);
mRemote.transact(Stub.TRANSACTION_getPermissionGrantState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isProvisioningAllowed(java.lang.String action, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(action);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isProvisioningAllowed, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int checkProvisioningPreCondition(java.lang.String action, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(action);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_checkProvisioningPreCondition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setKeepUninstalledPackages(android.content.ComponentName admin, java.lang.String callerPackage, java.util.List<java.lang.String> packageList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
_data.writeStringList(packageList);
mRemote.transact(Stub.TRANSACTION_setKeepUninstalledPackages, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName admin, java.lang.String callerPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callerPackage);
mRemote.transact(Stub.TRANSACTION_getKeepUninstalledPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isManagedProfile(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
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
@Override public boolean isSystemOnlyUser(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isSystemOnlyUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getWifiMacAddress(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getWifiMacAddress, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void reboot(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_reboot, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setShortSupportMessage(android.content.ComponentName admin, java.lang.CharSequence message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((message!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(message, _data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setShortSupportMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getShortSupportMessage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
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
@Override public void setLongSupportMessage(android.content.ComponentName admin, java.lang.CharSequence message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((message!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(message, _data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setLongSupportMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getLongSupportMessage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
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
@Override public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName admin, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getShortSupportMessageForUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
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
@Override public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName admin, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getLongSupportMessageForUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
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
@Override public boolean isSeparateProfileChallengeAllowed(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_isSeparateProfileChallengeAllowed, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setOrganizationColor(android.content.ComponentName admin, int color) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(color);
mRemote.transact(Stub.TRANSACTION_setOrganizationColor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setOrganizationColorForUser(int color, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(color);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setOrganizationColorForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getOrganizationColor(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getOrganizationColor, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getOrganizationColorForUser(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getOrganizationColorForUser, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setOrganizationName(android.content.ComponentName admin, java.lang.CharSequence title) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((title!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(title, _data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setOrganizationName, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.CharSequence getOrganizationName(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getOrganizationName, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
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
@Override public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDeviceOwnerOrganizationName, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
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
@Override public java.lang.CharSequence getOrganizationNameForUser(int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.CharSequence _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_getOrganizationNameForUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(_reply);
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
@Override public int getUserProvisioningState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUserProvisioningState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUserProvisioningState(int state, int userHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeInt(userHandle);
mRemote.transact(Stub.TRANSACTION_setUserProvisioningState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAffiliationIds(android.content.ComponentName admin, java.util.List<java.lang.String> ids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringList(ids);
mRemote.transact(Stub.TRANSACTION_setAffiliationIds, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<java.lang.String> getAffiliationIds(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAffiliationIds, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isAffiliatedUser() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAffiliatedUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setSecurityLoggingEnabled(android.content.ComponentName admin, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setSecurityLoggingEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isSecurityLoggingEnabled(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isSecurityLoggingEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_retrieveSecurityLogs, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_retrievePreRebootSecurityLogs, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public boolean isUninstallInQueue(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isUninstallInQueue, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void uninstallPackageWithActiveAdmins(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_uninstallPackageWithActiveAdmins, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isDeviceProvisioned() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDeviceProvisioned, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDeviceProvisioningConfigApplied, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setDeviceProvisioningConfigApplied, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void forceUpdateUserSetupComplete() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_forceUpdateUserSetupComplete, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setBackupServiceEnabled(android.content.ComponentName admin, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBackupServiceEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isBackupServiceEnabled(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isBackupServiceEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setNetworkLoggingEnabled(android.content.ComponentName admin, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNetworkLoggingEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isNetworkLoggingEnabled(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isNetworkLoggingEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName admin, long batchToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.app.admin.NetworkEvent> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(batchToken);
mRemote.transact(Stub.TRANSACTION_retrieveNetworkLogs, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.app.admin.NetworkEvent.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName admin, android.app.IApplicationThread caller, android.os.IBinder token, android.content.Intent service, android.app.IServiceConnection connection, int flags, int targetUserId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
_data.writeStrongBinder(token);
if ((service!=null)) {
_data.writeInt(1);
service.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((connection!=null))?(connection.asBinder()):(null)));
_data.writeInt(flags);
_data.writeInt(targetUserId);
mRemote.transact(Stub.TRANSACTION_bindDeviceAdminServiceAsUser, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.os.UserHandle> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getBindDeviceAdminTargetUsers, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.os.UserHandle.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastSecurityLogRetrievalTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getLastBugReportRequestTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastBugReportRequestTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastNetworkLogRetrievalTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setResetPasswordToken(android.content.ComponentName admin, byte[] token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(token);
mRemote.transact(Stub.TRANSACTION_setResetPasswordToken, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean clearResetPasswordToken(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_clearResetPasswordToken, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isResetPasswordTokenActive(android.content.ComponentName admin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isResetPasswordTokenActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean resetPasswordWithToken(android.content.ComponentName admin, java.lang.String password, byte[] token, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((admin!=null)) {
_data.writeInt(1);
admin.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(password);
_data.writeByteArray(token);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_resetPasswordWithToken, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isCurrentInputMethodSetByOwner() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isCurrentInputMethodSetByOwner, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.StringParceledListSlice getOwnerInstalledCaCerts(android.os.UserHandle user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.StringParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getOwnerInstalledCaCerts, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.StringParceledListSlice.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_setPasswordQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPasswordQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setPasswordMinimumLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getPasswordMinimumLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setPasswordMinimumUpperCase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPasswordMinimumUpperCase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setPasswordMinimumLowerCase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getPasswordMinimumLowerCase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setPasswordMinimumLetters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getPasswordMinimumLetters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setPasswordMinimumNumeric = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getPasswordMinimumNumeric = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setPasswordMinimumSymbols = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getPasswordMinimumSymbols = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setPasswordMinimumNonLetter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getPasswordMinimumNonLetter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setPasswordHistoryLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getPasswordHistoryLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setPasswordExpirationTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getPasswordExpirationTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getPasswordExpiration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_isActivePasswordSufficient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_isProfileActivePasswordSufficientForParent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getCurrentFailedPasswordAttempts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_setMaximumFailedPasswordsForWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getMaximumFailedPasswordsForWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_resetPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_setMaximumTimeToLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getMaximumTimeToLock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getMaximumTimeToLockForUserAndProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_setRequiredStrongAuthTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getRequiredStrongAuthTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_lockNow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_wipeData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_setGlobalProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_getGlobalProxyAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_setRecommendedGlobalProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_setStorageEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_getStorageEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_getStorageEncryptionStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_requestBugreport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_setCameraDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_getCameraDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_setScreenCaptureDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_getScreenCaptureDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_setKeyguardDisabledFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_getKeyguardDisabledFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_setActiveAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_isAdminActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_getActiveAdmins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_packageHasActiveAdmins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_getRemoveWarning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_removeActiveAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_forceRemoveActiveAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_hasGrantedPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_setActivePasswordState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_reportPasswordChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_reportFailedPasswordAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_reportSuccessfulPasswordAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_reportFailedFingerprintAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_reportSuccessfulFingerprintAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_reportKeyguardDismissed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_reportKeyguardSecured = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_setDeviceOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_getDeviceOwnerComponent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_hasDeviceOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_getDeviceOwnerName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_clearDeviceOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
static final int TRANSACTION_getDeviceOwnerUserId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
static final int TRANSACTION_setProfileOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
static final int TRANSACTION_getProfileOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
static final int TRANSACTION_getProfileOwnerName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
static final int TRANSACTION_setProfileEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
static final int TRANSACTION_setProfileName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
static final int TRANSACTION_clearProfileOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
static final int TRANSACTION_hasUserSetupCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
static final int TRANSACTION_setDeviceOwnerLockScreenInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
static final int TRANSACTION_getDeviceOwnerLockScreenInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
static final int TRANSACTION_setPackagesSuspended = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
static final int TRANSACTION_isPackageSuspended = (android.os.IBinder.FIRST_CALL_TRANSACTION + 80);
static final int TRANSACTION_installCaCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 81);
static final int TRANSACTION_uninstallCaCerts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 82);
static final int TRANSACTION_enforceCanManageCaCerts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 83);
static final int TRANSACTION_approveCaCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 84);
static final int TRANSACTION_isCaCertApproved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 85);
static final int TRANSACTION_installKeyPair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 86);
static final int TRANSACTION_removeKeyPair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 87);
static final int TRANSACTION_choosePrivateKeyAlias = (android.os.IBinder.FIRST_CALL_TRANSACTION + 88);
static final int TRANSACTION_setDelegatedScopes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 89);
static final int TRANSACTION_getDelegatedScopes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 90);
static final int TRANSACTION_getDelegatePackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 91);
static final int TRANSACTION_setCertInstallerPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 92);
static final int TRANSACTION_getCertInstallerPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 93);
static final int TRANSACTION_setAlwaysOnVpnPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 94);
static final int TRANSACTION_getAlwaysOnVpnPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 95);
static final int TRANSACTION_addPersistentPreferredActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 96);
static final int TRANSACTION_clearPackagePersistentPreferredActivities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 97);
static final int TRANSACTION_setApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 98);
static final int TRANSACTION_getApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 99);
static final int TRANSACTION_setApplicationRestrictionsManagingPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 100);
static final int TRANSACTION_getApplicationRestrictionsManagingPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 101);
static final int TRANSACTION_isCallerApplicationRestrictionsManagingPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 102);
static final int TRANSACTION_setRestrictionsProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 103);
static final int TRANSACTION_getRestrictionsProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 104);
static final int TRANSACTION_setUserRestriction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 105);
static final int TRANSACTION_getUserRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 106);
static final int TRANSACTION_addCrossProfileIntentFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 107);
static final int TRANSACTION_clearCrossProfileIntentFilters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 108);
static final int TRANSACTION_setPermittedAccessibilityServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 109);
static final int TRANSACTION_getPermittedAccessibilityServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 110);
static final int TRANSACTION_getPermittedAccessibilityServicesForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 111);
static final int TRANSACTION_isAccessibilityServicePermittedByAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 112);
static final int TRANSACTION_setPermittedInputMethods = (android.os.IBinder.FIRST_CALL_TRANSACTION + 113);
static final int TRANSACTION_getPermittedInputMethods = (android.os.IBinder.FIRST_CALL_TRANSACTION + 114);
static final int TRANSACTION_getPermittedInputMethodsForCurrentUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 115);
static final int TRANSACTION_isInputMethodPermittedByAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 116);
static final int TRANSACTION_setPermittedCrossProfileNotificationListeners = (android.os.IBinder.FIRST_CALL_TRANSACTION + 117);
static final int TRANSACTION_getPermittedCrossProfileNotificationListeners = (android.os.IBinder.FIRST_CALL_TRANSACTION + 118);
static final int TRANSACTION_isNotificationListenerServicePermitted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 119);
static final int TRANSACTION_createAdminSupportIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 120);
static final int TRANSACTION_setApplicationHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 121);
static final int TRANSACTION_isApplicationHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 122);
static final int TRANSACTION_createAndManageUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 123);
static final int TRANSACTION_removeUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 124);
static final int TRANSACTION_switchUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 125);
static final int TRANSACTION_enableSystemApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 126);
static final int TRANSACTION_enableSystemAppWithIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 127);
static final int TRANSACTION_setAccountManagementDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 128);
static final int TRANSACTION_getAccountTypesWithManagementDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 129);
static final int TRANSACTION_getAccountTypesWithManagementDisabledAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 130);
static final int TRANSACTION_setLockTaskPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 131);
static final int TRANSACTION_getLockTaskPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 132);
static final int TRANSACTION_isLockTaskPermitted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 133);
static final int TRANSACTION_setGlobalSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 134);
static final int TRANSACTION_setSecureSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 135);
static final int TRANSACTION_setMasterVolumeMuted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 136);
static final int TRANSACTION_isMasterVolumeMuted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 137);
static final int TRANSACTION_notifyLockTaskModeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 138);
static final int TRANSACTION_setUninstallBlocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 139);
static final int TRANSACTION_isUninstallBlocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 140);
static final int TRANSACTION_setCrossProfileCallerIdDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 141);
static final int TRANSACTION_getCrossProfileCallerIdDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 142);
static final int TRANSACTION_getCrossProfileCallerIdDisabledForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 143);
static final int TRANSACTION_setCrossProfileContactsSearchDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 144);
static final int TRANSACTION_getCrossProfileContactsSearchDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 145);
static final int TRANSACTION_getCrossProfileContactsSearchDisabledForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 146);
static final int TRANSACTION_startManagedQuickContact = (android.os.IBinder.FIRST_CALL_TRANSACTION + 147);
static final int TRANSACTION_setBluetoothContactSharingDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 148);
static final int TRANSACTION_getBluetoothContactSharingDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 149);
static final int TRANSACTION_getBluetoothContactSharingDisabledForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 150);
static final int TRANSACTION_setTrustAgentConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 151);
static final int TRANSACTION_getTrustAgentConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 152);
static final int TRANSACTION_addCrossProfileWidgetProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 153);
static final int TRANSACTION_removeCrossProfileWidgetProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 154);
static final int TRANSACTION_getCrossProfileWidgetProviders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 155);
static final int TRANSACTION_setAutoTimeRequired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 156);
static final int TRANSACTION_getAutoTimeRequired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 157);
static final int TRANSACTION_setForceEphemeralUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 158);
static final int TRANSACTION_getForceEphemeralUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 159);
static final int TRANSACTION_isRemovingAdmin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 160);
static final int TRANSACTION_setUserIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 161);
static final int TRANSACTION_setSystemUpdatePolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 162);
static final int TRANSACTION_getSystemUpdatePolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 163);
static final int TRANSACTION_setKeyguardDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 164);
static final int TRANSACTION_setStatusBarDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 165);
static final int TRANSACTION_getDoNotAskCredentialsOnBoot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 166);
static final int TRANSACTION_notifyPendingSystemUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 167);
static final int TRANSACTION_getPendingSystemUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 168);
static final int TRANSACTION_setPermissionPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 169);
static final int TRANSACTION_getPermissionPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 170);
static final int TRANSACTION_setPermissionGrantState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 171);
static final int TRANSACTION_getPermissionGrantState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 172);
static final int TRANSACTION_isProvisioningAllowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 173);
static final int TRANSACTION_checkProvisioningPreCondition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 174);
static final int TRANSACTION_setKeepUninstalledPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 175);
static final int TRANSACTION_getKeepUninstalledPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 176);
static final int TRANSACTION_isManagedProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 177);
static final int TRANSACTION_isSystemOnlyUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 178);
static final int TRANSACTION_getWifiMacAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 179);
static final int TRANSACTION_reboot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 180);
static final int TRANSACTION_setShortSupportMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 181);
static final int TRANSACTION_getShortSupportMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 182);
static final int TRANSACTION_setLongSupportMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 183);
static final int TRANSACTION_getLongSupportMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 184);
static final int TRANSACTION_getShortSupportMessageForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 185);
static final int TRANSACTION_getLongSupportMessageForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 186);
static final int TRANSACTION_isSeparateProfileChallengeAllowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 187);
static final int TRANSACTION_setOrganizationColor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 188);
static final int TRANSACTION_setOrganizationColorForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 189);
static final int TRANSACTION_getOrganizationColor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 190);
static final int TRANSACTION_getOrganizationColorForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 191);
static final int TRANSACTION_setOrganizationName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 192);
static final int TRANSACTION_getOrganizationName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 193);
static final int TRANSACTION_getDeviceOwnerOrganizationName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 194);
static final int TRANSACTION_getOrganizationNameForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 195);
static final int TRANSACTION_getUserProvisioningState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 196);
static final int TRANSACTION_setUserProvisioningState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 197);
static final int TRANSACTION_setAffiliationIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 198);
static final int TRANSACTION_getAffiliationIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 199);
static final int TRANSACTION_isAffiliatedUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 200);
static final int TRANSACTION_setSecurityLoggingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 201);
static final int TRANSACTION_isSecurityLoggingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 202);
static final int TRANSACTION_retrieveSecurityLogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 203);
static final int TRANSACTION_retrievePreRebootSecurityLogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 204);
static final int TRANSACTION_isUninstallInQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 205);
static final int TRANSACTION_uninstallPackageWithActiveAdmins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 206);
static final int TRANSACTION_isDeviceProvisioned = (android.os.IBinder.FIRST_CALL_TRANSACTION + 207);
static final int TRANSACTION_isDeviceProvisioningConfigApplied = (android.os.IBinder.FIRST_CALL_TRANSACTION + 208);
static final int TRANSACTION_setDeviceProvisioningConfigApplied = (android.os.IBinder.FIRST_CALL_TRANSACTION + 209);
static final int TRANSACTION_forceUpdateUserSetupComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 210);
static final int TRANSACTION_setBackupServiceEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 211);
static final int TRANSACTION_isBackupServiceEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 212);
static final int TRANSACTION_setNetworkLoggingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 213);
static final int TRANSACTION_isNetworkLoggingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 214);
static final int TRANSACTION_retrieveNetworkLogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 215);
static final int TRANSACTION_bindDeviceAdminServiceAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 216);
static final int TRANSACTION_getBindDeviceAdminTargetUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 217);
static final int TRANSACTION_getLastSecurityLogRetrievalTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 218);
static final int TRANSACTION_getLastBugReportRequestTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 219);
static final int TRANSACTION_getLastNetworkLogRetrievalTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 220);
static final int TRANSACTION_setResetPasswordToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 221);
static final int TRANSACTION_clearResetPasswordToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 222);
static final int TRANSACTION_isResetPasswordTokenActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 223);
static final int TRANSACTION_resetPasswordWithToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 224);
static final int TRANSACTION_isCurrentInputMethodSetByOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 225);
static final int TRANSACTION_getOwnerInstalledCaCerts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 226);
}
public void setPasswordQuality(android.content.ComponentName who, int quality, boolean parent) throws android.os.RemoteException;
public int getPasswordQuality(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordMinimumLength(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException;
public int getPasswordMinimumLength(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordMinimumUpperCase(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException;
public int getPasswordMinimumUpperCase(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordMinimumLowerCase(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException;
public int getPasswordMinimumLowerCase(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordMinimumLetters(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException;
public int getPasswordMinimumLetters(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordMinimumNumeric(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException;
public int getPasswordMinimumNumeric(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordMinimumSymbols(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException;
public int getPasswordMinimumSymbols(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordMinimumNonLetter(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException;
public int getPasswordMinimumNonLetter(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordHistoryLength(android.content.ComponentName who, int length, boolean parent) throws android.os.RemoteException;
public int getPasswordHistoryLength(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setPasswordExpirationTimeout(android.content.ComponentName who, long expiration, boolean parent) throws android.os.RemoteException;
public long getPasswordExpirationTimeout(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public long getPasswordExpiration(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public boolean isActivePasswordSufficient(int userHandle, boolean parent) throws android.os.RemoteException;
public boolean isProfileActivePasswordSufficientForParent(int userHandle) throws android.os.RemoteException;
public int getCurrentFailedPasswordAttempts(int userHandle, boolean parent) throws android.os.RemoteException;
public int getProfileWithMinimumFailedPasswordsForWipe(int userHandle, boolean parent) throws android.os.RemoteException;
public void setMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int num, boolean parent) throws android.os.RemoteException;
public int getMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int userHandle, boolean parent) throws android.os.RemoteException;
public boolean resetPassword(java.lang.String password, int flags) throws android.os.RemoteException;
public void setMaximumTimeToLock(android.content.ComponentName who, long timeMs, boolean parent) throws android.os.RemoteException;
public long getMaximumTimeToLock(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public long getMaximumTimeToLockForUserAndProfiles(int userHandle) throws android.os.RemoteException;
public void setRequiredStrongAuthTimeout(android.content.ComponentName who, long timeMs, boolean parent) throws android.os.RemoteException;
public long getRequiredStrongAuthTimeout(android.content.ComponentName who, int userId, boolean parent) throws android.os.RemoteException;
public void lockNow(int flags, boolean parent) throws android.os.RemoteException;
public void wipeData(int flags) throws android.os.RemoteException;
public android.content.ComponentName setGlobalProxy(android.content.ComponentName admin, java.lang.String proxySpec, java.lang.String exclusionList) throws android.os.RemoteException;
public android.content.ComponentName getGlobalProxyAdmin(int userHandle) throws android.os.RemoteException;
public void setRecommendedGlobalProxy(android.content.ComponentName admin, android.net.ProxyInfo proxyInfo) throws android.os.RemoteException;
public int setStorageEncryption(android.content.ComponentName who, boolean encrypt) throws android.os.RemoteException;
public boolean getStorageEncryption(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public int getStorageEncryptionStatus(java.lang.String callerPackage, int userHandle) throws android.os.RemoteException;
public boolean requestBugreport(android.content.ComponentName who) throws android.os.RemoteException;
public void setCameraDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException;
public boolean getCameraDisabled(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setScreenCaptureDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException;
public boolean getScreenCaptureDisabled(android.content.ComponentName who, int userHandle) throws android.os.RemoteException;
public void setKeyguardDisabledFeatures(android.content.ComponentName who, int which, boolean parent) throws android.os.RemoteException;
public int getKeyguardDisabledFeatures(android.content.ComponentName who, int userHandle, boolean parent) throws android.os.RemoteException;
public void setActiveAdmin(android.content.ComponentName policyReceiver, boolean refreshing, int userHandle) throws android.os.RemoteException;
public boolean isAdminActive(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException;
public java.util.List<android.content.ComponentName> getActiveAdmins(int userHandle) throws android.os.RemoteException;
public boolean packageHasActiveAdmins(java.lang.String packageName, int userHandle) throws android.os.RemoteException;
public void getRemoveWarning(android.content.ComponentName policyReceiver, android.os.RemoteCallback result, int userHandle) throws android.os.RemoteException;
public void removeActiveAdmin(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException;
public void forceRemoveActiveAdmin(android.content.ComponentName policyReceiver, int userHandle) throws android.os.RemoteException;
public boolean hasGrantedPolicy(android.content.ComponentName policyReceiver, int usesPolicy, int userHandle) throws android.os.RemoteException;
public void setActivePasswordState(android.app.admin.PasswordMetrics metrics, int userHandle) throws android.os.RemoteException;
public void reportPasswordChanged(int userId) throws android.os.RemoteException;
public void reportFailedPasswordAttempt(int userHandle) throws android.os.RemoteException;
public void reportSuccessfulPasswordAttempt(int userHandle) throws android.os.RemoteException;
public void reportFailedFingerprintAttempt(int userHandle) throws android.os.RemoteException;
public void reportSuccessfulFingerprintAttempt(int userHandle) throws android.os.RemoteException;
public void reportKeyguardDismissed(int userHandle) throws android.os.RemoteException;
public void reportKeyguardSecured(int userHandle) throws android.os.RemoteException;
public boolean setDeviceOwner(android.content.ComponentName who, java.lang.String ownerName, int userId) throws android.os.RemoteException;
public android.content.ComponentName getDeviceOwnerComponent(boolean callingUserOnly) throws android.os.RemoteException;
public boolean hasDeviceOwner() throws android.os.RemoteException;
public java.lang.String getDeviceOwnerName() throws android.os.RemoteException;
public void clearDeviceOwner(java.lang.String packageName) throws android.os.RemoteException;
public int getDeviceOwnerUserId() throws android.os.RemoteException;
public boolean setProfileOwner(android.content.ComponentName who, java.lang.String ownerName, int userHandle) throws android.os.RemoteException;
public android.content.ComponentName getProfileOwner(int userHandle) throws android.os.RemoteException;
public java.lang.String getProfileOwnerName(int userHandle) throws android.os.RemoteException;
public void setProfileEnabled(android.content.ComponentName who) throws android.os.RemoteException;
public void setProfileName(android.content.ComponentName who, java.lang.String profileName) throws android.os.RemoteException;
public void clearProfileOwner(android.content.ComponentName who) throws android.os.RemoteException;
public boolean hasUserSetupCompleted() throws android.os.RemoteException;
public void setDeviceOwnerLockScreenInfo(android.content.ComponentName who, java.lang.CharSequence deviceOwnerInfo) throws android.os.RemoteException;
public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException;
public java.lang.String[] setPackagesSuspended(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String[] packageNames, boolean suspended) throws android.os.RemoteException;
public boolean isPackageSuspended(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName) throws android.os.RemoteException;
public boolean installCaCert(android.content.ComponentName admin, java.lang.String callerPackage, byte[] certBuffer) throws android.os.RemoteException;
public void uninstallCaCerts(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String[] aliases) throws android.os.RemoteException;
public void enforceCanManageCaCerts(android.content.ComponentName admin, java.lang.String callerPackage) throws android.os.RemoteException;
public boolean approveCaCert(java.lang.String alias, int userHandle, boolean approval) throws android.os.RemoteException;
public boolean isCaCertApproved(java.lang.String alias, int userHandle) throws android.os.RemoteException;
public boolean installKeyPair(android.content.ComponentName who, java.lang.String callerPackage, byte[] privKeyBuffer, byte[] certBuffer, byte[] certChainBuffer, java.lang.String alias, boolean requestAccess) throws android.os.RemoteException;
public boolean removeKeyPair(android.content.ComponentName who, java.lang.String callerPackage, java.lang.String alias) throws android.os.RemoteException;
public void choosePrivateKeyAlias(int uid, android.net.Uri uri, java.lang.String alias, android.os.IBinder aliasCallback) throws android.os.RemoteException;
public void setDelegatedScopes(android.content.ComponentName who, java.lang.String delegatePackage, java.util.List<java.lang.String> scopes) throws android.os.RemoteException;
public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName who, java.lang.String delegatePackage) throws android.os.RemoteException;
public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName who, java.lang.String scope) throws android.os.RemoteException;
public void setCertInstallerPackage(android.content.ComponentName who, java.lang.String installerPackage) throws android.os.RemoteException;
public java.lang.String getCertInstallerPackage(android.content.ComponentName who) throws android.os.RemoteException;
public boolean setAlwaysOnVpnPackage(android.content.ComponentName who, java.lang.String vpnPackage, boolean lockdown) throws android.os.RemoteException;
public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName who) throws android.os.RemoteException;
public void addPersistentPreferredActivity(android.content.ComponentName admin, android.content.IntentFilter filter, android.content.ComponentName activity) throws android.os.RemoteException;
public void clearPackagePersistentPreferredActivities(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public void setApplicationRestrictions(android.content.ComponentName who, java.lang.String callerPackage, java.lang.String packageName, android.os.Bundle settings) throws android.os.RemoteException;
public android.os.Bundle getApplicationRestrictions(android.content.ComponentName who, java.lang.String callerPackage, java.lang.String packageName) throws android.os.RemoteException;
public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String callerPackage) throws android.os.RemoteException;
public void setRestrictionsProvider(android.content.ComponentName who, android.content.ComponentName provider) throws android.os.RemoteException;
public android.content.ComponentName getRestrictionsProvider(int userHandle) throws android.os.RemoteException;
public void setUserRestriction(android.content.ComponentName who, java.lang.String key, boolean enable) throws android.os.RemoteException;
public android.os.Bundle getUserRestrictions(android.content.ComponentName who) throws android.os.RemoteException;
public void addCrossProfileIntentFilter(android.content.ComponentName admin, android.content.IntentFilter filter, int flags) throws android.os.RemoteException;
public void clearCrossProfileIntentFilters(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean setPermittedAccessibilityServices(android.content.ComponentName admin, java.util.List packageList) throws android.os.RemoteException;
public java.util.List getPermittedAccessibilityServices(android.content.ComponentName admin) throws android.os.RemoteException;
public java.util.List getPermittedAccessibilityServicesForUser(int userId) throws android.os.RemoteException;
public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName admin, java.lang.String packageName, int userId) throws android.os.RemoteException;
public boolean setPermittedInputMethods(android.content.ComponentName admin, java.util.List packageList) throws android.os.RemoteException;
public java.util.List getPermittedInputMethods(android.content.ComponentName admin) throws android.os.RemoteException;
public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException;
public boolean isInputMethodPermittedByAdmin(android.content.ComponentName admin, java.lang.String packageName, int userId) throws android.os.RemoteException;
public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName admin, java.util.List<java.lang.String> packageList) throws android.os.RemoteException;
public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean isNotificationListenerServicePermitted(java.lang.String packageName, int userId) throws android.os.RemoteException;
public android.content.Intent createAdminSupportIntent(java.lang.String restriction) throws android.os.RemoteException;
public boolean setApplicationHidden(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName, boolean hidden) throws android.os.RemoteException;
public boolean isApplicationHidden(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName) throws android.os.RemoteException;
public android.os.UserHandle createAndManageUser(android.content.ComponentName who, java.lang.String name, android.content.ComponentName profileOwner, android.os.PersistableBundle adminExtras, int flags) throws android.os.RemoteException;
public boolean removeUser(android.content.ComponentName who, android.os.UserHandle userHandle) throws android.os.RemoteException;
public boolean switchUser(android.content.ComponentName who, android.os.UserHandle userHandle) throws android.os.RemoteException;
public void enableSystemApp(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName) throws android.os.RemoteException;
public int enableSystemAppWithIntent(android.content.ComponentName admin, java.lang.String callerPackage, android.content.Intent intent) throws android.os.RemoteException;
public void setAccountManagementDisabled(android.content.ComponentName who, java.lang.String accountType, boolean disabled) throws android.os.RemoteException;
public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException;
public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int userId) throws android.os.RemoteException;
public void setLockTaskPackages(android.content.ComponentName who, java.lang.String[] packages) throws android.os.RemoteException;
public java.lang.String[] getLockTaskPackages(android.content.ComponentName who) throws android.os.RemoteException;
public boolean isLockTaskPermitted(java.lang.String pkg) throws android.os.RemoteException;
public void setGlobalSetting(android.content.ComponentName who, java.lang.String setting, java.lang.String value) throws android.os.RemoteException;
public void setSecureSetting(android.content.ComponentName who, java.lang.String setting, java.lang.String value) throws android.os.RemoteException;
public void setMasterVolumeMuted(android.content.ComponentName admin, boolean on) throws android.os.RemoteException;
public boolean isMasterVolumeMuted(android.content.ComponentName admin) throws android.os.RemoteException;
public void notifyLockTaskModeChanged(boolean isEnabled, java.lang.String pkg, int userId) throws android.os.RemoteException;
public void setUninstallBlocked(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName, boolean uninstallBlocked) throws android.os.RemoteException;
public boolean isUninstallBlocked(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public void setCrossProfileCallerIdDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException;
public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName who) throws android.os.RemoteException;
public boolean getCrossProfileCallerIdDisabledForUser(int userId) throws android.os.RemoteException;
public void setCrossProfileContactsSearchDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException;
public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName who) throws android.os.RemoteException;
public boolean getCrossProfileContactsSearchDisabledForUser(int userId) throws android.os.RemoteException;
public void startManagedQuickContact(java.lang.String lookupKey, long contactId, boolean isContactIdIgnored, long directoryId, android.content.Intent originalIntent) throws android.os.RemoteException;
public void setBluetoothContactSharingDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException;
public boolean getBluetoothContactSharingDisabled(android.content.ComponentName who) throws android.os.RemoteException;
public boolean getBluetoothContactSharingDisabledForUser(int userId) throws android.os.RemoteException;
public void setTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent, android.os.PersistableBundle args, boolean parent) throws android.os.RemoteException;
public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent, int userId, boolean parent) throws android.os.RemoteException;
public boolean addCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public boolean removeCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) throws android.os.RemoteException;
public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName admin) throws android.os.RemoteException;
public void setAutoTimeRequired(android.content.ComponentName who, boolean required) throws android.os.RemoteException;
public boolean getAutoTimeRequired() throws android.os.RemoteException;
public void setForceEphemeralUsers(android.content.ComponentName who, boolean forceEpehemeralUsers) throws android.os.RemoteException;
public boolean getForceEphemeralUsers(android.content.ComponentName who) throws android.os.RemoteException;
public boolean isRemovingAdmin(android.content.ComponentName adminReceiver, int userHandle) throws android.os.RemoteException;
public void setUserIcon(android.content.ComponentName admin, android.graphics.Bitmap icon) throws android.os.RemoteException;
public void setSystemUpdatePolicy(android.content.ComponentName who, android.app.admin.SystemUpdatePolicy policy) throws android.os.RemoteException;
public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException;
public boolean setKeyguardDisabled(android.content.ComponentName admin, boolean disabled) throws android.os.RemoteException;
public boolean setStatusBarDisabled(android.content.ComponentName who, boolean disabled) throws android.os.RemoteException;
public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException;
public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo info) throws android.os.RemoteException;
public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName admin) throws android.os.RemoteException;
public void setPermissionPolicy(android.content.ComponentName admin, java.lang.String callerPackage, int policy) throws android.os.RemoteException;
public int getPermissionPolicy(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean setPermissionGrantState(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName, java.lang.String permission, int grantState) throws android.os.RemoteException;
public int getPermissionGrantState(android.content.ComponentName admin, java.lang.String callerPackage, java.lang.String packageName, java.lang.String permission) throws android.os.RemoteException;
public boolean isProvisioningAllowed(java.lang.String action, java.lang.String packageName) throws android.os.RemoteException;
public int checkProvisioningPreCondition(java.lang.String action, java.lang.String packageName) throws android.os.RemoteException;
public void setKeepUninstalledPackages(android.content.ComponentName admin, java.lang.String callerPackage, java.util.List<java.lang.String> packageList) throws android.os.RemoteException;
public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName admin, java.lang.String callerPackage) throws android.os.RemoteException;
public boolean isManagedProfile(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean isSystemOnlyUser(android.content.ComponentName admin) throws android.os.RemoteException;
public java.lang.String getWifiMacAddress(android.content.ComponentName admin) throws android.os.RemoteException;
public void reboot(android.content.ComponentName admin) throws android.os.RemoteException;
public void setShortSupportMessage(android.content.ComponentName admin, java.lang.CharSequence message) throws android.os.RemoteException;
public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName admin) throws android.os.RemoteException;
public void setLongSupportMessage(android.content.ComponentName admin, java.lang.CharSequence message) throws android.os.RemoteException;
public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName admin) throws android.os.RemoteException;
public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName admin, int userHandle) throws android.os.RemoteException;
public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName admin, int userHandle) throws android.os.RemoteException;
public boolean isSeparateProfileChallengeAllowed(int userHandle) throws android.os.RemoteException;
public void setOrganizationColor(android.content.ComponentName admin, int color) throws android.os.RemoteException;
public void setOrganizationColorForUser(int color, int userId) throws android.os.RemoteException;
public int getOrganizationColor(android.content.ComponentName admin) throws android.os.RemoteException;
public int getOrganizationColorForUser(int userHandle) throws android.os.RemoteException;
public void setOrganizationName(android.content.ComponentName admin, java.lang.CharSequence title) throws android.os.RemoteException;
public java.lang.CharSequence getOrganizationName(android.content.ComponentName admin) throws android.os.RemoteException;
public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException;
public java.lang.CharSequence getOrganizationNameForUser(int userHandle) throws android.os.RemoteException;
public int getUserProvisioningState() throws android.os.RemoteException;
public void setUserProvisioningState(int state, int userHandle) throws android.os.RemoteException;
public void setAffiliationIds(android.content.ComponentName admin, java.util.List<java.lang.String> ids) throws android.os.RemoteException;
public java.util.List<java.lang.String> getAffiliationIds(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean isAffiliatedUser() throws android.os.RemoteException;
public void setSecurityLoggingEnabled(android.content.ComponentName admin, boolean enabled) throws android.os.RemoteException;
public boolean isSecurityLoggingEnabled(android.content.ComponentName admin) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName admin) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean isUninstallInQueue(java.lang.String packageName) throws android.os.RemoteException;
public void uninstallPackageWithActiveAdmins(java.lang.String packageName) throws android.os.RemoteException;
public boolean isDeviceProvisioned() throws android.os.RemoteException;
public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException;
public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException;
public void forceUpdateUserSetupComplete() throws android.os.RemoteException;
public void setBackupServiceEnabled(android.content.ComponentName admin, boolean enabled) throws android.os.RemoteException;
public boolean isBackupServiceEnabled(android.content.ComponentName admin) throws android.os.RemoteException;
public void setNetworkLoggingEnabled(android.content.ComponentName admin, boolean enabled) throws android.os.RemoteException;
public boolean isNetworkLoggingEnabled(android.content.ComponentName admin) throws android.os.RemoteException;
public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName admin, long batchToken) throws android.os.RemoteException;
public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName admin, android.app.IApplicationThread caller, android.os.IBinder token, android.content.Intent service, android.app.IServiceConnection connection, int flags, int targetUserId) throws android.os.RemoteException;
public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName admin) throws android.os.RemoteException;
public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException;
public long getLastBugReportRequestTime() throws android.os.RemoteException;
public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException;
public boolean setResetPasswordToken(android.content.ComponentName admin, byte[] token) throws android.os.RemoteException;
public boolean clearResetPasswordToken(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean isResetPasswordTokenActive(android.content.ComponentName admin) throws android.os.RemoteException;
public boolean resetPasswordWithToken(android.content.ComponentName admin, java.lang.String password, byte[] token, int flags) throws android.os.RemoteException;
public boolean isCurrentInputMethodSetByOwner() throws android.os.RemoteException;
public android.content.pm.StringParceledListSlice getOwnerInstalledCaCerts(android.os.UserHandle user) throws android.os.RemoteException;
}
