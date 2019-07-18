/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/uce/options/IOptionsListener.aidl
 */
package com.android.ims.internal.uce.options;
/** {@hide} */
public interface IOptionsListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.uce.options.IOptionsListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.uce.options.IOptionsListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.uce.options.IOptionsListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.uce.options.IOptionsListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.uce.options.IOptionsListener))) {
return ((com.android.ims.internal.uce.options.IOptionsListener)iin);
}
return new com.android.ims.internal.uce.options.IOptionsListener.Stub.Proxy(obj);
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
case TRANSACTION_getVersionCb:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.getVersionCb(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_serviceAvailable:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.uce.common.StatusCode _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.ims.internal.uce.common.StatusCode.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.serviceAvailable(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_serviceUnavailable:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.uce.common.StatusCode _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.ims.internal.uce.common.StatusCode.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.serviceUnavailable(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sipResponseReceived:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.ims.internal.uce.options.OptionsSipResponse _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.internal.uce.options.OptionsSipResponse.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
com.android.ims.internal.uce.options.OptionsCapInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.internal.uce.options.OptionsCapInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.sipResponseReceived(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_cmdStatus:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.uce.options.OptionsCmdStatus _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.ims.internal.uce.options.OptionsCmdStatus.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.cmdStatus(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_incomingOptions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.ims.internal.uce.options.OptionsCapInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.internal.uce.options.OptionsCapInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.incomingOptions(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.uce.options.IOptionsListener
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
     * Callback invoked with the version information of Options service implementation.
     * @param version, version information of the service.
     * @hide
     */
@Override public void getVersionCb(java.lang.String version) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(version);
mRemote.transact(Stub.TRANSACTION_getVersionCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback function to be invoked by the Options service to notify the listener of service
     * availability.
     * @param statusCode, UCE_SUCCESS as service availability.
     * @hide
     */
@Override public void serviceAvailable(com.android.ims.internal.uce.common.StatusCode statusCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((statusCode!=null)) {
_data.writeInt(1);
statusCode.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_serviceAvailable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback function to be invoked by the Options service to notify the listener of service
     * unavailability.
     * @param statusCode, UCE_SUCCESS as service unavailability.
     * @hide
     */
@Override public void serviceUnavailable(com.android.ims.internal.uce.common.StatusCode statusCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((statusCode!=null)) {
_data.writeInt(1);
statusCode.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_serviceUnavailable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback function to be invoked to inform the client when the response for a SIP OPTIONS
     * has been received.
     * @param uri, URI of the remote entity received in network response.
     * @param sipResponse, data of the network response received.
     * @param capInfo, capabilities of the remote entity received.
     * @hide
     */
@Override public void sipResponseReceived(java.lang.String uri, com.android.ims.internal.uce.options.OptionsSipResponse sipResponse, com.android.ims.internal.uce.options.OptionsCapInfo capInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uri);
if ((sipResponse!=null)) {
_data.writeInt(1);
sipResponse.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((capInfo!=null)) {
_data.writeInt(1);
capInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sipResponseReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback function to be invoked to inform the client of the status of an asynchronous call.
     * @param cmdStatus, command status of the request placed.
     * @hide
     */
@Override public void cmdStatus(com.android.ims.internal.uce.options.OptionsCmdStatus cmdStatus) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((cmdStatus!=null)) {
_data.writeInt(1);
cmdStatus.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_cmdStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Callback function to be invoked to inform the client of an incoming OPTIONS request
     * from the network.
     * @param uri, URI of the remote entity received.
     * @param capInfo, capabilities of the remote entity.
     * @param tID, transation of the request received from network.
     * @hide
     */
@Override public void incomingOptions(java.lang.String uri, com.android.ims.internal.uce.options.OptionsCapInfo capInfo, int tID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(uri);
if ((capInfo!=null)) {
_data.writeInt(1);
capInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(tID);
mRemote.transact(Stub.TRANSACTION_incomingOptions, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getVersionCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_serviceAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_serviceUnavailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sipResponseReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_cmdStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_incomingOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
/**
     * Callback invoked with the version information of Options service implementation.
     * @param version, version information of the service.
     * @hide
     */
public void getVersionCb(java.lang.String version) throws android.os.RemoteException;
/**
     * Callback function to be invoked by the Options service to notify the listener of service
     * availability.
     * @param statusCode, UCE_SUCCESS as service availability.
     * @hide
     */
public void serviceAvailable(com.android.ims.internal.uce.common.StatusCode statusCode) throws android.os.RemoteException;
/**
     * Callback function to be invoked by the Options service to notify the listener of service
     * unavailability.
     * @param statusCode, UCE_SUCCESS as service unavailability.
     * @hide
     */
public void serviceUnavailable(com.android.ims.internal.uce.common.StatusCode statusCode) throws android.os.RemoteException;
/**
     * Callback function to be invoked to inform the client when the response for a SIP OPTIONS
     * has been received.
     * @param uri, URI of the remote entity received in network response.
     * @param sipResponse, data of the network response received.
     * @param capInfo, capabilities of the remote entity received.
     * @hide
     */
public void sipResponseReceived(java.lang.String uri, com.android.ims.internal.uce.options.OptionsSipResponse sipResponse, com.android.ims.internal.uce.options.OptionsCapInfo capInfo) throws android.os.RemoteException;
/**
     * Callback function to be invoked to inform the client of the status of an asynchronous call.
     * @param cmdStatus, command status of the request placed.
     * @hide
     */
public void cmdStatus(com.android.ims.internal.uce.options.OptionsCmdStatus cmdStatus) throws android.os.RemoteException;
/**
     * Callback function to be invoked to inform the client of an incoming OPTIONS request
     * from the network.
     * @param uri, URI of the remote entity received.
     * @param capInfo, capabilities of the remote entity.
     * @param tID, transation of the request received from network.
     * @hide
     */
public void incomingOptions(java.lang.String uri, com.android.ims.internal.uce.options.OptionsCapInfo capInfo, int tID) throws android.os.RemoteException;
}
