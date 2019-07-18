/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/internal/telephony/euicc/IEuiccController.aidl
 */
package com.android.internal.telephony.euicc;
/** @hide */
public interface IEuiccController extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.euicc.IEuiccController
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.euicc.IEuiccController";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.euicc.IEuiccController interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.euicc.IEuiccController asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.euicc.IEuiccController))) {
return ((com.android.internal.telephony.euicc.IEuiccController)iin);
}
return new com.android.internal.telephony.euicc.IEuiccController.Stub.Proxy(obj);
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
case TRANSACTION_continueOperation:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.continueOperation(_arg0, _arg1);
return true;
}
case TRANSACTION_getDownloadableSubscriptionMetadata:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.euicc.DownloadableSubscription _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.euicc.DownloadableSubscription.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.getDownloadableSubscriptionMetadata(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_getDefaultDownloadableSubscriptionList:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.PendingIntent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.getDefaultDownloadableSubscriptionList(_arg0, _arg1);
return true;
}
case TRANSACTION_getEid:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getEid();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_downloadSubscription:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.euicc.DownloadableSubscription _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.euicc.DownloadableSubscription.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
java.lang.String _arg2;
_arg2 = data.readString();
android.app.PendingIntent _arg3;
if ((0!=data.readInt())) {
_arg3 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.downloadSubscription(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_getEuiccInfo:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.euicc.EuiccInfo _result = this.getEuiccInfo();
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
case TRANSACTION_deleteSubscription:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
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
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.switchToSubscription(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_updateSubscriptionNickname:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.updateSubscriptionNickname(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_eraseSubscriptions:
{
data.enforceInterface(DESCRIPTOR);
android.app.PendingIntent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.eraseSubscriptions(_arg0);
return true;
}
case TRANSACTION_retainSubscriptionsForFactoryReset:
{
data.enforceInterface(DESCRIPTOR);
android.app.PendingIntent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.retainSubscriptionsForFactoryReset(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.euicc.IEuiccController
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
@Override public void continueOperation(android.content.Intent resolutionIntent, android.os.Bundle resolutionExtras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((resolutionIntent!=null)) {
_data.writeInt(1);
resolutionIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((resolutionExtras!=null)) {
_data.writeInt(1);
resolutionExtras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_continueOperation, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getDownloadableSubscriptionMetadata(android.telephony.euicc.DownloadableSubscription subscription, java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((subscription!=null)) {
_data.writeInt(1);
subscription.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callingPackage);
if ((callbackIntent!=null)) {
_data.writeInt(1);
callbackIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getDownloadableSubscriptionMetadata, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getDefaultDownloadableSubscriptionList(java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
if ((callbackIntent!=null)) {
_data.writeInt(1);
callbackIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getDefaultDownloadableSubscriptionList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public java.lang.String getEid() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEid, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void downloadSubscription(android.telephony.euicc.DownloadableSubscription subscription, boolean switchAfterDownload, java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((subscription!=null)) {
_data.writeInt(1);
subscription.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((switchAfterDownload)?(1):(0)));
_data.writeString(callingPackage);
if ((callbackIntent!=null)) {
_data.writeInt(1);
callbackIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_downloadSubscription, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public android.telephony.euicc.EuiccInfo getEuiccInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.euicc.EuiccInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEuiccInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.euicc.EuiccInfo.CREATOR.createFromParcel(_reply);
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
@Override public void deleteSubscription(int subscriptionId, java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subscriptionId);
_data.writeString(callingPackage);
if ((callbackIntent!=null)) {
_data.writeInt(1);
callbackIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_deleteSubscription, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void switchToSubscription(int subscriptionId, java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subscriptionId);
_data.writeString(callingPackage);
if ((callbackIntent!=null)) {
_data.writeInt(1);
callbackIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_switchToSubscription, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateSubscriptionNickname(int subscriptionId, java.lang.String nickname, android.app.PendingIntent callbackIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subscriptionId);
_data.writeString(nickname);
if ((callbackIntent!=null)) {
_data.writeInt(1);
callbackIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateSubscriptionNickname, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void eraseSubscriptions(android.app.PendingIntent callbackIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((callbackIntent!=null)) {
_data.writeInt(1);
callbackIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_eraseSubscriptions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void retainSubscriptionsForFactoryReset(android.app.PendingIntent callbackIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((callbackIntent!=null)) {
_data.writeInt(1);
callbackIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_retainSubscriptionsForFactoryReset, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_continueOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getDownloadableSubscriptionMetadata = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getDefaultDownloadableSubscriptionList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getEid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_downloadSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getEuiccInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_deleteSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_switchToSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_updateSubscriptionNickname = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_eraseSubscriptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_retainSubscriptionsForFactoryReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void continueOperation(android.content.Intent resolutionIntent, android.os.Bundle resolutionExtras) throws android.os.RemoteException;
public void getDownloadableSubscriptionMetadata(android.telephony.euicc.DownloadableSubscription subscription, java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException;
public void getDefaultDownloadableSubscriptionList(java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException;
public java.lang.String getEid() throws android.os.RemoteException;
public void downloadSubscription(android.telephony.euicc.DownloadableSubscription subscription, boolean switchAfterDownload, java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException;
public android.telephony.euicc.EuiccInfo getEuiccInfo() throws android.os.RemoteException;
public void deleteSubscription(int subscriptionId, java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException;
public void switchToSubscription(int subscriptionId, java.lang.String callingPackage, android.app.PendingIntent callbackIntent) throws android.os.RemoteException;
public void updateSubscriptionNickname(int subscriptionId, java.lang.String nickname, android.app.PendingIntent callbackIntent) throws android.os.RemoteException;
public void eraseSubscriptions(android.app.PendingIntent callbackIntent) throws android.os.RemoteException;
public void retainSubscriptionsForFactoryReset(android.app.PendingIntent callbackIntent) throws android.os.RemoteException;
}
