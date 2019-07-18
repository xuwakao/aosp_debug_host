/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/internal/telephony/ISub.aidl
 */
package com.android.internal.telephony;
public interface ISub extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ISub
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ISub";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ISub interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ISub asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ISub))) {
return ((com.android.internal.telephony.ISub)iin);
}
return new com.android.internal.telephony.ISub.Stub.Proxy(obj);
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
case TRANSACTION_getAllSubInfoList:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telephony.SubscriptionInfo> _result = this.getAllSubInfoList(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getAllSubInfoCount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getAllSubInfoCount(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveSubscriptionInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.telephony.SubscriptionInfo _result = this.getActiveSubscriptionInfo(_arg0, _arg1);
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
case TRANSACTION_getActiveSubscriptionInfoForIccId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.telephony.SubscriptionInfo _result = this.getActiveSubscriptionInfoForIccId(_arg0, _arg1);
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
case TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.telephony.SubscriptionInfo _result = this.getActiveSubscriptionInfoForSimSlotIndex(_arg0, _arg1);
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
case TRANSACTION_getActiveSubscriptionInfoList:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telephony.SubscriptionInfo> _result = this.getActiveSubscriptionInfoList(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getActiveSubInfoCount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getActiveSubInfoCount(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveSubInfoCountMax:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getActiveSubInfoCountMax();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAvailableSubscriptionInfoList:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telephony.SubscriptionInfo> _result = this.getAvailableSubscriptionInfoList(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getAccessibleSubscriptionInfoList:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telephony.SubscriptionInfo> _result = this.getAccessibleSubscriptionInfoList(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_requestEmbeddedSubscriptionInfoListRefresh:
{
data.enforceInterface(DESCRIPTOR);
this.requestEmbeddedSubscriptionInfoListRefresh();
return true;
}
case TRANSACTION_addSubInfoRecord:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.addSubInfoRecord(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setIconTint:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.setIconTint(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.setDisplayName(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayNameUsingSrc:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
int _result = this.setDisplayNameUsingSrc(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.setDisplayNumber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDataRoaming:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.setDataRoaming(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSlotIndex:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getSlotIndex(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _result = this.getSubId(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getDefaultSubId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultSubId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_clearSubInfo:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.clearSubInfo();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPhoneId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getPhoneId(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDefaultDataSubId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultDataSubId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDefaultDataSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDefaultDataSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultVoiceSubId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultVoiceSubId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDefaultVoiceSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDefaultVoiceSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultSmsSubId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultSmsSubId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDefaultSmsSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDefaultSmsSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearDefaultsForInactiveSubIds:
{
data.enforceInterface(DESCRIPTOR);
this.clearDefaultsForInactiveSubIds();
reply.writeNoException();
return true;
}
case TRANSACTION_getActiveSubIdList:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getActiveSubIdList();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_setSubscriptionProperty:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.setSubscriptionProperty(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getSubscriptionProperty:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _result = this.getSubscriptionProperty(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSimStateForSlotIndex:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getSimStateForSlotIndex(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isActiveSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isActiveSubId(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.ISub
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
     * @param callingPackage The package maing the call.
     * @return a list of all subscriptions in the database, this includes
     * all subscriptions that have been seen.
     */
@Override public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubscriptionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getAllSubInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getAllSubInfoCount(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getAllSubInfoCount, _data, _reply, 0);
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
     * Get the active SubscriptionInfo with the subId key
     * @param subId The unique SubscriptionInfo key in database
     * @param callingPackage The package maing the call.
     * @return SubscriptionInfo, maybe null if its not active
     */
@Override public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.SubscriptionInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.SubscriptionInfo.CREATOR.createFromParcel(_reply);
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
     * Get the active SubscriptionInfo associated with the iccId
     * @param iccId the IccId of SIM card
     * @param callingPackage The package maing the call.
     * @return SubscriptionInfo, maybe null if its not active
     */
@Override public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String iccId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.SubscriptionInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iccId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfoForIccId, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.SubscriptionInfo.CREATOR.createFromParcel(_reply);
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
     * Get the active SubscriptionInfo associated with the slotIndex
     * @param slotIndex the slot which the subscription is inserted
     * @param callingPackage The package maing the call.
     * @return SubscriptionInfo, maybe null if its not active
     */
@Override public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int slotIndex, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.SubscriptionInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotIndex);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.SubscriptionInfo.CREATOR.createFromParcel(_reply);
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
     * Get the SubscriptionInfo(s) of the active subscriptions. The records will be sorted
     * by {@link SubscriptionInfo#getSimSlotIndex} then by {@link SubscriptionInfo#getSubscriptionId}.
     *
     * @param callingPackage The package maing the call.
     * @return Sorted list of the currently {@link SubscriptionInfo} records available on the device.
     * <ul>
     * <li>
     * If null is returned the current state is unknown but if a {@link OnSubscriptionsChangedListener}
     * has been registered {@link OnSubscriptionsChangedListener#onSubscriptionsChanged} will be
     * invoked in the future.
     * </li>
     * <li>
     * If the list is empty then there are no {@link SubscriptionInfo} records currently available.
     * </li>
     * <li>
     * if the list is non-empty the list is sorted by {@link SubscriptionInfo#getSimSlotIndex}
     * then by {@link SubscriptionInfo#getSubscriptionId}.
     * </li>
     * </ul>
     */
@Override public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubscriptionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getActiveSubInfoCount(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getActiveSubInfoCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getActiveSubInfoCountMax() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubInfoCountMax, _data, _reply, 0);
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
     * @see android.telephony.SubscriptionManager#getAvailableSubscriptionInfoList
     */
@Override public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubscriptionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getAvailableSubscriptionInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see android.telephony.SubscriptionManager#getAccessibleSubscriptionInfoList
     */
@Override public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubscriptionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getAccessibleSubscriptionInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @see android.telephony.SubscriptionManager#requestEmbeddedSubscriptionInfoListRefresh
     */
@Override public void requestEmbeddedSubscriptionInfoListRefresh() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestEmbeddedSubscriptionInfoListRefresh, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public int addSubInfoRecord(java.lang.String iccId, int slotIndex) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iccId);
_data.writeInt(slotIndex);
mRemote.transact(Stub.TRANSACTION_addSubInfoRecord, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setIconTint(int tint, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(tint);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setIconTint, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setDisplayName(java.lang.String displayName, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(displayName);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDisplayName, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setDisplayNameUsingSrc(java.lang.String displayName, int subId, long nameSource) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(displayName);
_data.writeInt(subId);
_data.writeLong(nameSource);
mRemote.transact(Stub.TRANSACTION_setDisplayNameUsingSrc, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setDisplayNumber(java.lang.String number, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(number);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDisplayNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setDataRoaming(int roaming, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(roaming);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDataRoaming, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getSlotIndex(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getSlotIndex, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getSubId(int slotIndex) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotIndex);
mRemote.transact(Stub.TRANSACTION_getSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDefaultSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int clearSubInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearSubInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPhoneId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getPhoneId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDefaultDataSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultDataSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultDataSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultDataSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDefaultVoiceSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultVoiceSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultVoiceSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultVoiceSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDefaultSmsSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultSmsSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultSmsSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultSmsSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearDefaultsForInactiveSubIds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearDefaultsForInactiveSubIds, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int[] getActiveSubIdList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubIdList, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setSubscriptionProperty(int subId, java.lang.String propKey, java.lang.String propValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(propKey);
_data.writeString(propValue);
mRemote.transact(Stub.TRANSACTION_setSubscriptionProperty, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getSubscriptionProperty(int subId, java.lang.String propKey, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(propKey);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getSubscriptionProperty, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getSimStateForSlotIndex(int slotIndex) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotIndex);
mRemote.transact(Stub.TRANSACTION_getSimStateForSlotIndex, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isActiveSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_isActiveSubId, _data, _reply, 0);
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
static final int TRANSACTION_getAllSubInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getAllSubInfoCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getActiveSubscriptionInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getActiveSubscriptionInfoForIccId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getActiveSubscriptionInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getActiveSubInfoCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getActiveSubInfoCountMax = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAvailableSubscriptionInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getAccessibleSubscriptionInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_requestEmbeddedSubscriptionInfoListRefresh = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_addSubInfoRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setIconTint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setDisplayName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setDisplayNameUsingSrc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_setDisplayNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setDataRoaming = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getSlotIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getDefaultSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_clearSubInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getPhoneId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getDefaultDataSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setDefaultDataSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getDefaultVoiceSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_setDefaultVoiceSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getDefaultSmsSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_setDefaultSmsSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_clearDefaultsForInactiveSubIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getActiveSubIdList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_setSubscriptionProperty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getSubscriptionProperty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getSimStateForSlotIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_isActiveSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
}
/**
     * @param callingPackage The package maing the call.
     * @return a list of all subscriptions in the database, this includes
     * all subscriptions that have been seen.
     */
public java.util.List<android.telephony.SubscriptionInfo> getAllSubInfoList(java.lang.String callingPackage) throws android.os.RemoteException;
public int getAllSubInfoCount(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Get the active SubscriptionInfo with the subId key
     * @param subId The unique SubscriptionInfo key in database
     * @param callingPackage The package maing the call.
     * @return SubscriptionInfo, maybe null if its not active
     */
public android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Get the active SubscriptionInfo associated with the iccId
     * @param iccId the IccId of SIM card
     * @param callingPackage The package maing the call.
     * @return SubscriptionInfo, maybe null if its not active
     */
public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForIccId(java.lang.String iccId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Get the active SubscriptionInfo associated with the slotIndex
     * @param slotIndex the slot which the subscription is inserted
     * @param callingPackage The package maing the call.
     * @return SubscriptionInfo, maybe null if its not active
     */
public android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int slotIndex, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Get the SubscriptionInfo(s) of the active subscriptions. The records will be sorted
     * by {@link SubscriptionInfo#getSimSlotIndex} then by {@link SubscriptionInfo#getSubscriptionId}.
     *
     * @param callingPackage The package maing the call.
     * @return Sorted list of the currently {@link SubscriptionInfo} records available on the device.
     * <ul>
     * <li>
     * If null is returned the current state is unknown but if a {@link OnSubscriptionsChangedListener}
     * has been registered {@link OnSubscriptionsChangedListener#onSubscriptionsChanged} will be
     * invoked in the future.
     * </li>
     * <li>
     * If the list is empty then there are no {@link SubscriptionInfo} records currently available.
     * </li>
     * <li>
     * if the list is non-empty the list is sorted by {@link SubscriptionInfo#getSimSlotIndex}
     * then by {@link SubscriptionInfo#getSubscriptionId}.
     * </li>
     * </ul>
     */
public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String callingPackage) throws android.os.RemoteException;
public int getActiveSubInfoCount(java.lang.String callingPackage) throws android.os.RemoteException;
public int getActiveSubInfoCountMax() throws android.os.RemoteException;
/**
     * @see android.telephony.SubscriptionManager#getAvailableSubscriptionInfoList
     */
public java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * @see android.telephony.SubscriptionManager#getAccessibleSubscriptionInfoList
     */
public java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * @see android.telephony.SubscriptionManager#requestEmbeddedSubscriptionInfoListRefresh
     */
public void requestEmbeddedSubscriptionInfoListRefresh() throws android.os.RemoteException;
public int addSubInfoRecord(java.lang.String iccId, int slotIndex) throws android.os.RemoteException;
public int setIconTint(int tint, int subId) throws android.os.RemoteException;
public int setDisplayName(java.lang.String displayName, int subId) throws android.os.RemoteException;
public int setDisplayNameUsingSrc(java.lang.String displayName, int subId, long nameSource) throws android.os.RemoteException;
public int setDisplayNumber(java.lang.String number, int subId) throws android.os.RemoteException;
public int setDataRoaming(int roaming, int subId) throws android.os.RemoteException;
public int getSlotIndex(int subId) throws android.os.RemoteException;
public int[] getSubId(int slotIndex) throws android.os.RemoteException;
public int getDefaultSubId() throws android.os.RemoteException;
public int clearSubInfo() throws android.os.RemoteException;
public int getPhoneId(int subId) throws android.os.RemoteException;
public int getDefaultDataSubId() throws android.os.RemoteException;
public void setDefaultDataSubId(int subId) throws android.os.RemoteException;
public int getDefaultVoiceSubId() throws android.os.RemoteException;
public void setDefaultVoiceSubId(int subId) throws android.os.RemoteException;
public int getDefaultSmsSubId() throws android.os.RemoteException;
public void setDefaultSmsSubId(int subId) throws android.os.RemoteException;
public void clearDefaultsForInactiveSubIds() throws android.os.RemoteException;
public int[] getActiveSubIdList() throws android.os.RemoteException;
public void setSubscriptionProperty(int subId, java.lang.String propKey, java.lang.String propValue) throws android.os.RemoteException;
public java.lang.String getSubscriptionProperty(int subId, java.lang.String propKey, java.lang.String callingPackage) throws android.os.RemoteException;
public int getSimStateForSlotIndex(int slotIndex) throws android.os.RemoteException;
public boolean isActiveSubId(int subId) throws android.os.RemoteException;
}
