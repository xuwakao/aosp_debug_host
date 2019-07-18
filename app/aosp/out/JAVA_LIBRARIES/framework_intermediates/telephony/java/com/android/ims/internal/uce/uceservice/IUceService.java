/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/uce/uceservice/IUceService.aidl
 */
package com.android.ims.internal.uce.uceservice;
/** IUceService
 *  UCE service interface class.
 * {@hide} */
public interface IUceService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.uce.uceservice.IUceService
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.uce.uceservice.IUceService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.uce.uceservice.IUceService interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.uce.uceservice.IUceService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.uce.uceservice.IUceService))) {
return ((com.android.ims.internal.uce.uceservice.IUceService)iin);
}
return new com.android.ims.internal.uce.uceservice.IUceService.Stub.Proxy(obj);
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
case TRANSACTION_startService:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.uce.uceservice.IUceListener _arg0;
_arg0 = com.android.ims.internal.uce.uceservice.IUceListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.startService(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopService:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopService();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isServiceStarted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isServiceStarted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_createOptionsService:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.uce.options.IOptionsListener _arg0;
_arg0 = com.android.ims.internal.uce.options.IOptionsListener.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.uce.common.UceLong _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.internal.uce.common.UceLong.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _result = this.createOptionsService(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_destroyOptionsService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.destroyOptionsService(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createPresenceService:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.uce.presence.IPresenceListener _arg0;
_arg0 = com.android.ims.internal.uce.presence.IPresenceListener.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.uce.common.UceLong _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.internal.uce.common.UceLong.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _result = this.createPresenceService(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_destroyPresenceService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.destroyPresenceService(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getServiceStatus:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getServiceStatus();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPresenceService:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.uce.presence.IPresenceService _result = this.getPresenceService();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getOptionsService:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.uce.options.IOptionsService _result = this.getOptionsService();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.uce.uceservice.IUceService
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
     * Starts the Uce service.
     * @param uceListener IUceListener object
     * @return boolean true if the service stop start is processed successfully, FALSE otherwise.
     *
     * Service status is returned in setStatus callback in IUceListener.
     * @hide
     */
@Override public boolean startService(com.android.ims.internal.uce.uceservice.IUceListener uceListener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((uceListener!=null))?(uceListener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startService, _data, _reply, 0);
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
     * Stops the UCE service.
     * @return boolean true if the service stop request is processed successfully, FALSE otherwise.
     * @hide
     */
@Override public boolean stopService() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopService, _data, _reply, 0);
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
     * Requests the UCE service start status.
     * @return boolean true if service started else false.
     * @hide
     */
@Override public boolean isServiceStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isServiceStarted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int createOptionsService(com.android.ims.internal.uce.options.IOptionsListener optionsListener, com.android.ims.internal.uce.common.UceLong optionsServiceListenerHdl) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((optionsListener!=null))?(optionsListener.asBinder()):(null)));
if ((optionsServiceListenerHdl!=null)) {
_data.writeInt(1);
optionsServiceListenerHdl.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createOptionsService, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
optionsServiceListenerHdl.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Destroys a Options service.
     * @param optionsServiceHandle this is received in serviceCreated() callback
     *        in IOptionsListener
     * @hide
     */
@Override public void destroyOptionsService(int optionsServiceHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(optionsServiceHandle);
mRemote.transact(Stub.TRANSACTION_destroyOptionsService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int createPresenceService(com.android.ims.internal.uce.presence.IPresenceListener presenceServiceListener, com.android.ims.internal.uce.common.UceLong presenceServiceListenerHdl) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((presenceServiceListener!=null))?(presenceServiceListener.asBinder()):(null)));
if ((presenceServiceListenerHdl!=null)) {
_data.writeInt(1);
presenceServiceListenerHdl.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createPresenceService, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
presenceServiceListenerHdl.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Destroys a presence service.
     * @param presenceServiceHdl handle returned during createPresenceService()
     * @hide
     */
@Override public void destroyPresenceService(int presenceServiceHdl) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(presenceServiceHdl);
mRemote.transact(Stub.TRANSACTION_destroyPresenceService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Query the UCE Service for information to know whether the is registered.
     * @return boolean, true if Registered to for network events else false.
     * @hide
     */
@Override public boolean getServiceStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getServiceStatus, _data, _reply, 0);
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
     * Query the UCE Service for presence Service.
     * @return IPresenceService object.
     * @hide
     */
@Override public com.android.ims.internal.uce.presence.IPresenceService getPresenceService() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.uce.presence.IPresenceService _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPresenceService, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.uce.presence.IPresenceService.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Query the UCE Service for options service object.
     * @return IOptionsService object.
     * @hide
     */
@Override public com.android.ims.internal.uce.options.IOptionsService getOptionsService() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.uce.options.IOptionsService _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getOptionsService, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.uce.options.IOptionsService.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_startService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isServiceStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_createOptionsService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_destroyOptionsService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_createPresenceService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_destroyPresenceService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getServiceStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getPresenceService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getOptionsService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
/**
     * Starts the Uce service.
     * @param uceListener IUceListener object
     * @return boolean true if the service stop start is processed successfully, FALSE otherwise.
     *
     * Service status is returned in setStatus callback in IUceListener.
     * @hide
     */
public boolean startService(com.android.ims.internal.uce.uceservice.IUceListener uceListener) throws android.os.RemoteException;
/**
     * Stops the UCE service.
     * @return boolean true if the service stop request is processed successfully, FALSE otherwise.
     * @hide
     */
public boolean stopService() throws android.os.RemoteException;
/**
     * Requests the UCE service start status.
     * @return boolean true if service started else false.
     * @hide
     */
public boolean isServiceStarted() throws android.os.RemoteException;
public int createOptionsService(com.android.ims.internal.uce.options.IOptionsListener optionsListener, com.android.ims.internal.uce.common.UceLong optionsServiceListenerHdl) throws android.os.RemoteException;
/**
     * Destroys a Options service.
     * @param optionsServiceHandle this is received in serviceCreated() callback
     *        in IOptionsListener
     * @hide
     */
public void destroyOptionsService(int optionsServiceHandle) throws android.os.RemoteException;
public int createPresenceService(com.android.ims.internal.uce.presence.IPresenceListener presenceServiceListener, com.android.ims.internal.uce.common.UceLong presenceServiceListenerHdl) throws android.os.RemoteException;
/**
     * Destroys a presence service.
     * @param presenceServiceHdl handle returned during createPresenceService()
     * @hide
     */
public void destroyPresenceService(int presenceServiceHdl) throws android.os.RemoteException;
/**
     * Query the UCE Service for information to know whether the is registered.
     * @return boolean, true if Registered to for network events else false.
     * @hide
     */
public boolean getServiceStatus() throws android.os.RemoteException;
/**
     * Query the UCE Service for presence Service.
     * @return IPresenceService object.
     * @hide
     */
public com.android.ims.internal.uce.presence.IPresenceService getPresenceService() throws android.os.RemoteException;
/**
     * Query the UCE Service for options service object.
     * @return IOptionsService object.
     * @hide
     */
public com.android.ims.internal.uce.options.IOptionsService getOptionsService() throws android.os.RemoteException;
}
