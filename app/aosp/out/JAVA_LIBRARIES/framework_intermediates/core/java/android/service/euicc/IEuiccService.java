/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/euicc/IEuiccService.aidl
 */
package android.service.euicc;
/** @hide */
public interface IEuiccService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.euicc.IEuiccService
{
private static final java.lang.String DESCRIPTOR = "android.service.euicc.IEuiccService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.euicc.IEuiccService interface,
 * generating a proxy if needed.
 */
public static android.service.euicc.IEuiccService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.euicc.IEuiccService))) {
return ((android.service.euicc.IEuiccService)iin);
}
return new android.service.euicc.IEuiccService.Stub.Proxy(obj);
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
case TRANSACTION_downloadSubscription:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.telephony.euicc.DownloadableSubscription _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telephony.euicc.DownloadableSubscription.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _arg3;
_arg3 = (0!=data.readInt());
android.service.euicc.IDownloadSubscriptionCallback _arg4;
_arg4 = android.service.euicc.IDownloadSubscriptionCallback.Stub.asInterface(data.readStrongBinder());
this.downloadSubscription(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_getDownloadableSubscriptionMetadata:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.telephony.euicc.DownloadableSubscription _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telephony.euicc.DownloadableSubscription.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
android.service.euicc.IGetDownloadableSubscriptionMetadataCallback _arg3;
_arg3 = android.service.euicc.IGetDownloadableSubscriptionMetadataCallback.Stub.asInterface(data.readStrongBinder());
this.getDownloadableSubscriptionMetadata(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_getEid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.service.euicc.IGetEidCallback _arg1;
_arg1 = android.service.euicc.IGetEidCallback.Stub.asInterface(data.readStrongBinder());
this.getEid(_arg0, _arg1);
return true;
}
case TRANSACTION_getEuiccProfileInfoList:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.service.euicc.IGetEuiccProfileInfoListCallback _arg1;
_arg1 = android.service.euicc.IGetEuiccProfileInfoListCallback.Stub.asInterface(data.readStrongBinder());
this.getEuiccProfileInfoList(_arg0, _arg1);
return true;
}
case TRANSACTION_getDefaultDownloadableSubscriptionList:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback _arg2;
_arg2 = android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback.Stub.asInterface(data.readStrongBinder());
this.getDefaultDownloadableSubscriptionList(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_getEuiccInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.service.euicc.IGetEuiccInfoCallback _arg1;
_arg1 = android.service.euicc.IGetEuiccInfoCallback.Stub.asInterface(data.readStrongBinder());
this.getEuiccInfo(_arg0, _arg1);
return true;
}
case TRANSACTION_deleteSubscription:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.service.euicc.IDeleteSubscriptionCallback _arg2;
_arg2 = android.service.euicc.IDeleteSubscriptionCallback.Stub.asInterface(data.readStrongBinder());
this.deleteSubscription(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_switchToSubscription:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
android.service.euicc.ISwitchToSubscriptionCallback _arg3;
_arg3 = android.service.euicc.ISwitchToSubscriptionCallback.Stub.asInterface(data.readStrongBinder());
this.switchToSubscription(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_updateSubscriptionNickname:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.service.euicc.IUpdateSubscriptionNicknameCallback _arg3;
_arg3 = android.service.euicc.IUpdateSubscriptionNicknameCallback.Stub.asInterface(data.readStrongBinder());
this.updateSubscriptionNickname(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_eraseSubscriptions:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.service.euicc.IEraseSubscriptionsCallback _arg1;
_arg1 = android.service.euicc.IEraseSubscriptionsCallback.Stub.asInterface(data.readStrongBinder());
this.eraseSubscriptions(_arg0, _arg1);
return true;
}
case TRANSACTION_retainSubscriptionsForFactoryReset:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.service.euicc.IRetainSubscriptionsForFactoryResetCallback _arg1;
_arg1 = android.service.euicc.IRetainSubscriptionsForFactoryResetCallback.Stub.asInterface(data.readStrongBinder());
this.retainSubscriptionsForFactoryReset(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.euicc.IEuiccService
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
@Override public void downloadSubscription(int slotId, android.telephony.euicc.DownloadableSubscription subscription, boolean switchAfterDownload, boolean forceDeactivateSim, android.service.euicc.IDownloadSubscriptionCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
if ((subscription!=null)) {
_data.writeInt(1);
subscription.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((switchAfterDownload)?(1):(0)));
_data.writeInt(((forceDeactivateSim)?(1):(0)));
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_downloadSubscription, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getDownloadableSubscriptionMetadata(int slotId, android.telephony.euicc.DownloadableSubscription subscription, boolean forceDeactivateSim, android.service.euicc.IGetDownloadableSubscriptionMetadataCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
if ((subscription!=null)) {
_data.writeInt(1);
subscription.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((forceDeactivateSim)?(1):(0)));
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getDownloadableSubscriptionMetadata, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getEid(int slotId, android.service.euicc.IGetEidCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getEid, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getEuiccProfileInfoList(int slotId, android.service.euicc.IGetEuiccProfileInfoListCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getEuiccProfileInfoList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getDefaultDownloadableSubscriptionList(int slotId, boolean forceDeactivateSim, android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(((forceDeactivateSim)?(1):(0)));
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getDefaultDownloadableSubscriptionList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getEuiccInfo(int slotId, android.service.euicc.IGetEuiccInfoCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getEuiccInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void deleteSubscription(int slotId, java.lang.String iccid, android.service.euicc.IDeleteSubscriptionCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeString(iccid);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_deleteSubscription, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void switchToSubscription(int slotId, java.lang.String iccid, boolean forceDeactivateSim, android.service.euicc.ISwitchToSubscriptionCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeString(iccid);
_data.writeInt(((forceDeactivateSim)?(1):(0)));
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_switchToSubscription, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateSubscriptionNickname(int slotId, java.lang.String iccid, java.lang.String nickname, android.service.euicc.IUpdateSubscriptionNicknameCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeString(iccid);
_data.writeString(nickname);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_updateSubscriptionNickname, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void eraseSubscriptions(int slotId, android.service.euicc.IEraseSubscriptionsCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_eraseSubscriptions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void retainSubscriptionsForFactoryReset(int slotId, android.service.euicc.IRetainSubscriptionsForFactoryResetCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_retainSubscriptionsForFactoryReset, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_downloadSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getDownloadableSubscriptionMetadata = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getEid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getEuiccProfileInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getDefaultDownloadableSubscriptionList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getEuiccInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_deleteSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_switchToSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_updateSubscriptionNickname = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_eraseSubscriptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_retainSubscriptionsForFactoryReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void downloadSubscription(int slotId, android.telephony.euicc.DownloadableSubscription subscription, boolean switchAfterDownload, boolean forceDeactivateSim, android.service.euicc.IDownloadSubscriptionCallback callback) throws android.os.RemoteException;
public void getDownloadableSubscriptionMetadata(int slotId, android.telephony.euicc.DownloadableSubscription subscription, boolean forceDeactivateSim, android.service.euicc.IGetDownloadableSubscriptionMetadataCallback callback) throws android.os.RemoteException;
public void getEid(int slotId, android.service.euicc.IGetEidCallback callback) throws android.os.RemoteException;
public void getEuiccProfileInfoList(int slotId, android.service.euicc.IGetEuiccProfileInfoListCallback callback) throws android.os.RemoteException;
public void getDefaultDownloadableSubscriptionList(int slotId, boolean forceDeactivateSim, android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback callback) throws android.os.RemoteException;
public void getEuiccInfo(int slotId, android.service.euicc.IGetEuiccInfoCallback callback) throws android.os.RemoteException;
public void deleteSubscription(int slotId, java.lang.String iccid, android.service.euicc.IDeleteSubscriptionCallback callback) throws android.os.RemoteException;
public void switchToSubscription(int slotId, java.lang.String iccid, boolean forceDeactivateSim, android.service.euicc.ISwitchToSubscriptionCallback callback) throws android.os.RemoteException;
public void updateSubscriptionNickname(int slotId, java.lang.String iccid, java.lang.String nickname, android.service.euicc.IUpdateSubscriptionNicknameCallback callback) throws android.os.RemoteException;
public void eraseSubscriptions(int slotId, android.service.euicc.IEraseSubscriptionsCallback callback) throws android.os.RemoteException;
public void retainSubscriptionsForFactoryReset(int slotId, android.service.euicc.IRetainSubscriptionsForFactoryResetCallback callback) throws android.os.RemoteException;
}
