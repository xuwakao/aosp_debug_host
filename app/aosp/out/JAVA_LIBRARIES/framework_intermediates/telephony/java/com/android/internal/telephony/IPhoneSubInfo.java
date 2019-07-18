/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/internal/telephony/IPhoneSubInfo.aidl
 */
package com.android.internal.telephony;
/**
 * Interface used to retrieve various phone-related subscriber information.
 *
 */
public interface IPhoneSubInfo extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IPhoneSubInfo
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IPhoneSubInfo";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.IPhoneSubInfo interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.IPhoneSubInfo asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.IPhoneSubInfo))) {
return ((com.android.internal.telephony.IPhoneSubInfo)iin);
}
return new com.android.internal.telephony.IPhoneSubInfo.Stub.Proxy(obj);
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
case TRANSACTION_getDeviceId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getDeviceId(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getNaiForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getNaiForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDeviceIdForPhone:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getDeviceIdForPhone(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getImeiForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getImeiForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDeviceSvn:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getDeviceSvn(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDeviceSvnUsingSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getDeviceSvnUsingSubId(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSubscriberId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getSubscriberId(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSubscriberIdForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getSubscriberIdForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getGroupIdLevel1:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getGroupIdLevel1(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getGroupIdLevel1ForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getGroupIdLevel1ForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getIccSerialNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getIccSerialNumber(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getIccSerialNumberForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getIccSerialNumberForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getLine1Number:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getLine1Number(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getLine1NumberForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getLine1NumberForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getLine1AlphaTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getLine1AlphaTag(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getLine1AlphaTagForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getLine1AlphaTagForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getMsisdn:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getMsisdn(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getMsisdnForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getMsisdnForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getVoiceMailNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getVoiceMailNumber(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getVoiceMailNumberForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getVoiceMailNumberForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCompleteVoiceMailNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getCompleteVoiceMailNumber();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCompleteVoiceMailNumberForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getCompleteVoiceMailNumberForSubscriber(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCarrierInfoForImsiEncryption:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
android.telephony.ImsiEncryptionInfo _result = this.getCarrierInfoForImsiEncryption(_arg0, _arg1, _arg2);
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
case TRANSACTION_setCarrierInfoForImsiEncryption:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.telephony.ImsiEncryptionInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = android.telephony.ImsiEncryptionInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.setCarrierInfoForImsiEncryption(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getVoiceMailAlphaTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getVoiceMailAlphaTag(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getVoiceMailAlphaTagForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getVoiceMailAlphaTagForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getIsimImpi:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getIsimImpi();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getIsimDomain:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getIsimDomain();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getIsimImpu:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getIsimImpu();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getIsimIst:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getIsimIst();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getIsimPcscf:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getIsimPcscf();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getIsimChallengeResponse:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getIsimChallengeResponse(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getIccSimChallengeResponse:
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
java.lang.String _result = this.getIccSimChallengeResponse(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.IPhoneSubInfo
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
@Override public java.lang.String getDeviceId(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getDeviceId, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getNaiForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getNaiForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDeviceIdForPhone(int phoneId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(phoneId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getDeviceIdForPhone, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getImeiForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getImeiForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDeviceSvn(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getDeviceSvn, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDeviceSvnUsingSubId(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getDeviceSvnUsingSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSubscriberId(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getSubscriberId, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSubscriberIdForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getSubscriberIdForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getGroupIdLevel1(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getGroupIdLevel1, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getGroupIdLevel1ForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getGroupIdLevel1ForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getIccSerialNumber(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getIccSerialNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getIccSerialNumberForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getIccSerialNumberForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getLine1Number(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getLine1Number, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getLine1NumberForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getLine1NumberForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getLine1AlphaTag(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getLine1AlphaTag, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getLine1AlphaTagForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getLine1AlphaTagForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getMsisdn(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getMsisdn, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getMsisdnForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getMsisdnForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getVoiceMailNumber(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getVoiceMailNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getVoiceMailNumberForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getVoiceMailNumberForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getCompleteVoiceMailNumber() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCompleteVoiceMailNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getCompleteVoiceMailNumberForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getCompleteVoiceMailNumberForSubscriber, _data, _reply, 0);
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
     * Retrieves the Carrier information used to encrypt IMSI and IMPI.
     */
@Override public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int subId, int keyType, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.ImsiEncryptionInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(keyType);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCarrierInfoForImsiEncryption, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.ImsiEncryptionInfo.CREATOR.createFromParcel(_reply);
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
/**
     * Stores the Carrier information used to encrypt IMSI and IMPI.
     */
@Override public void setCarrierInfoForImsiEncryption(int subId, java.lang.String callingPackage, android.telephony.ImsiEncryptionInfo imsiEncryptionInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
if ((imsiEncryptionInfo!=null)) {
_data.writeInt(1);
imsiEncryptionInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCarrierInfoForImsiEncryption, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getVoiceMailAlphaTag(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getVoiceMailAlphaTag, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getVoiceMailAlphaTagForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getVoiceMailAlphaTagForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getIsimImpi() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIsimImpi, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getIsimDomain() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIsimDomain, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getIsimImpu() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIsimImpu, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getIsimIst() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIsimIst, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getIsimPcscf() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIsimPcscf, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getIsimChallengeResponse(java.lang.String nonce) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(nonce);
mRemote.transact(Stub.TRANSACTION_getIsimChallengeResponse, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getIccSimChallengeResponse(int subId, int appType, int authType, java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(appType);
_data.writeInt(authType);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_getIccSimChallengeResponse, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getDeviceId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getNaiForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getDeviceIdForPhone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getImeiForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getDeviceSvn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getDeviceSvnUsingSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getSubscriberId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getSubscriberIdForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getGroupIdLevel1 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getGroupIdLevel1ForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getIccSerialNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getIccSerialNumberForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getLine1Number = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getLine1NumberForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getLine1AlphaTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getLine1AlphaTagForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getMsisdn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getMsisdnForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getVoiceMailNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getVoiceMailNumberForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getCompleteVoiceMailNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getCompleteVoiceMailNumberForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getCarrierInfoForImsiEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setCarrierInfoForImsiEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getVoiceMailAlphaTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getVoiceMailAlphaTagForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getIsimImpi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getIsimDomain = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getIsimImpu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getIsimIst = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getIsimPcscf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getIsimChallengeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getIccSimChallengeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
}
public java.lang.String getDeviceId(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getNaiForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getDeviceIdForPhone(int phoneId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getImeiForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getDeviceSvn(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getDeviceSvnUsingSubId(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getSubscriberId(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getSubscriberIdForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getGroupIdLevel1(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getGroupIdLevel1ForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getIccSerialNumber(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getIccSerialNumberForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getLine1Number(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getLine1NumberForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getLine1AlphaTag(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getLine1AlphaTagForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getMsisdn(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getMsisdnForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getVoiceMailNumber(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getVoiceMailNumberForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getCompleteVoiceMailNumber() throws android.os.RemoteException;
public java.lang.String getCompleteVoiceMailNumberForSubscriber(int subId) throws android.os.RemoteException;
/**
     * Retrieves the Carrier information used to encrypt IMSI and IMPI.
     */
public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int subId, int keyType, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Stores the Carrier information used to encrypt IMSI and IMPI.
     */
public void setCarrierInfoForImsiEncryption(int subId, java.lang.String callingPackage, android.telephony.ImsiEncryptionInfo imsiEncryptionInfo) throws android.os.RemoteException;
public java.lang.String getVoiceMailAlphaTag(java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getVoiceMailAlphaTagForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getIsimImpi() throws android.os.RemoteException;
public java.lang.String getIsimDomain() throws android.os.RemoteException;
public java.lang.String[] getIsimImpu() throws android.os.RemoteException;
public java.lang.String getIsimIst() throws android.os.RemoteException;
public java.lang.String[] getIsimPcscf() throws android.os.RemoteException;
public java.lang.String getIsimChallengeResponse(java.lang.String nonce) throws android.os.RemoteException;
public java.lang.String getIccSimChallengeResponse(int subId, int appType, int authType, java.lang.String data) throws android.os.RemoteException;
}
