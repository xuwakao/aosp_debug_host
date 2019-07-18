/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/IImsServiceController.aidl
 */
package com.android.ims.internal;
/**
 * See ImsService and IMMTelFeature for more information.
 * {@hide}
 */
public interface IImsServiceController extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsServiceController
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsServiceController";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsServiceController interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsServiceController asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsServiceController))) {
return ((com.android.ims.internal.IImsServiceController)iin);
}
return new com.android.ims.internal.IImsServiceController.Stub.Proxy(obj);
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
case TRANSACTION_createImsFeature:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.internal.IImsFeatureStatusCallback _arg2;
_arg2 = com.android.ims.internal.IImsFeatureStatusCallback.Stub.asInterface(data.readStrongBinder());
this.createImsFeature(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_removeImsFeature:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.internal.IImsFeatureStatusCallback _arg2;
_arg2 = com.android.ims.internal.IImsFeatureStatusCallback.Stub.asInterface(data.readStrongBinder());
this.removeImsFeature(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_startSession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
com.android.ims.internal.IImsRegistrationListener _arg3;
_arg3 = com.android.ims.internal.IImsRegistrationListener.Stub.asInterface(data.readStrongBinder());
int _result = this.startSession(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_endSession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.endSession(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isConnected:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
boolean _result = this.isConnected(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isOpened:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isOpened(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getFeatureStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.getFeatureStatus(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_addRegistrationListener:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.internal.IImsRegistrationListener _arg2;
_arg2 = com.android.ims.internal.IImsRegistrationListener.Stub.asInterface(data.readStrongBinder());
this.addRegistrationListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_removeRegistrationListener:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.internal.IImsRegistrationListener _arg2;
_arg2 = com.android.ims.internal.IImsRegistrationListener.Stub.asInterface(data.readStrongBinder());
this.removeRegistrationListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_createCallProfile:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
com.android.ims.ImsCallProfile _result = this.createCallProfile(_arg0, _arg1, _arg2, _arg3, _arg4);
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
case TRANSACTION_createCallSession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
com.android.ims.ImsCallProfile _arg3;
if ((0!=data.readInt())) {
_arg3 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
com.android.ims.internal.IImsCallSessionListener _arg4;
_arg4 = com.android.ims.internal.IImsCallSessionListener.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.IImsCallSession _result = this.createCallSession(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getPendingCallSession:
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
com.android.ims.internal.IImsCallSession _result = this.getPendingCallSession(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getUtInterface:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.internal.IImsUt _result = this.getUtInterface(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getConfigInterface:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.internal.IImsConfig _result = this.getConfigInterface(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_turnOnIms:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.turnOnIms(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_turnOffIms:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.turnOffIms(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getEcbmInterface:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.internal.IImsEcbm _result = this.getEcbmInterface(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_setUiTTYMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.Message _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Message.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.setUiTTYMode(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getMultiEndpointInterface:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.internal.IImsMultiEndpoint _result = this.getMultiEndpointInterface(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsServiceController
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
// ImsService Control

@Override public void createImsFeature(int slotId, int feature, com.android.ims.internal.IImsFeatureStatusCallback c) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(feature);
_data.writeStrongBinder((((c!=null))?(c.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_createImsFeature, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeImsFeature(int slotId, int feature, com.android.ims.internal.IImsFeatureStatusCallback c) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(feature);
_data.writeStrongBinder((((c!=null))?(c.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeImsFeature, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int startSession(int slotId, int featureType, android.app.PendingIntent incomingCallIntent, com.android.ims.internal.IImsRegistrationListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
if ((incomingCallIntent!=null)) {
_data.writeInt(1);
incomingCallIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startSession, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void endSession(int slotId, int featureType, int sessionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
_data.writeInt(sessionId);
mRemote.transact(Stub.TRANSACTION_endSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isConnected(int slotId, int featureType, int callSessionType, int callType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
_data.writeInt(callSessionType);
_data.writeInt(callType);
mRemote.transact(Stub.TRANSACTION_isConnected, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isOpened(int slotId, int featureType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
mRemote.transact(Stub.TRANSACTION_isOpened, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getFeatureStatus(int slotId, int featureType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
mRemote.transact(Stub.TRANSACTION_getFeatureStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addRegistrationListener(int slotId, int featureType, com.android.ims.internal.IImsRegistrationListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addRegistrationListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeRegistrationListener(int slotId, int featureType, com.android.ims.internal.IImsRegistrationListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeRegistrationListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.ims.ImsCallProfile createCallProfile(int slotId, int featureType, int sessionId, int callSessionType, int callType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.ImsCallProfile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
_data.writeInt(sessionId);
_data.writeInt(callSessionType);
_data.writeInt(callType);
mRemote.transact(Stub.TRANSACTION_createCallProfile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(_reply);
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
@Override public com.android.ims.internal.IImsCallSession createCallSession(int slotId, int featureType, int sessionId, com.android.ims.ImsCallProfile profile, com.android.ims.internal.IImsCallSessionListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.IImsCallSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
_data.writeInt(sessionId);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_createCallSession, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.IImsCallSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.ims.internal.IImsCallSession getPendingCallSession(int slotId, int featureType, int sessionId, java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.IImsCallSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
_data.writeInt(sessionId);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_getPendingCallSession, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.IImsCallSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.ims.internal.IImsUt getUtInterface(int slotId, int featureType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.IImsUt _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
mRemote.transact(Stub.TRANSACTION_getUtInterface, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.IImsUt.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.android.ims.internal.IImsConfig getConfigInterface(int slotId, int featureType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.IImsConfig _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
mRemote.transact(Stub.TRANSACTION_getConfigInterface, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.IImsConfig.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void turnOnIms(int slotId, int featureType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
mRemote.transact(Stub.TRANSACTION_turnOnIms, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void turnOffIms(int slotId, int featureType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
mRemote.transact(Stub.TRANSACTION_turnOffIms, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.ims.internal.IImsEcbm getEcbmInterface(int slotId, int featureType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.IImsEcbm _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
mRemote.transact(Stub.TRANSACTION_getEcbmInterface, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.IImsEcbm.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUiTTYMode(int slotId, int featureType, int uiTtyMode, android.os.Message onComplete) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
_data.writeInt(uiTtyMode);
if ((onComplete!=null)) {
_data.writeInt(1);
onComplete.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setUiTTYMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface(int slotId, int featureType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.IImsMultiEndpoint _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(featureType);
mRemote.transact(Stub.TRANSACTION_getMultiEndpointInterface, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.IImsMultiEndpoint.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_createImsFeature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeImsFeature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_endSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_isOpened = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getFeatureStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_addRegistrationListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_removeRegistrationListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_createCallProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_createCallSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getPendingCallSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getUtInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getConfigInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_turnOnIms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_turnOffIms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getEcbmInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setUiTTYMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getMultiEndpointInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
}
// ImsService Control

public void createImsFeature(int slotId, int feature, com.android.ims.internal.IImsFeatureStatusCallback c) throws android.os.RemoteException;
public void removeImsFeature(int slotId, int feature, com.android.ims.internal.IImsFeatureStatusCallback c) throws android.os.RemoteException;
public int startSession(int slotId, int featureType, android.app.PendingIntent incomingCallIntent, com.android.ims.internal.IImsRegistrationListener listener) throws android.os.RemoteException;
public void endSession(int slotId, int featureType, int sessionId) throws android.os.RemoteException;
public boolean isConnected(int slotId, int featureType, int callSessionType, int callType) throws android.os.RemoteException;
public boolean isOpened(int slotId, int featureType) throws android.os.RemoteException;
public int getFeatureStatus(int slotId, int featureType) throws android.os.RemoteException;
public void addRegistrationListener(int slotId, int featureType, com.android.ims.internal.IImsRegistrationListener listener) throws android.os.RemoteException;
public void removeRegistrationListener(int slotId, int featureType, com.android.ims.internal.IImsRegistrationListener listener) throws android.os.RemoteException;
public com.android.ims.ImsCallProfile createCallProfile(int slotId, int featureType, int sessionId, int callSessionType, int callType) throws android.os.RemoteException;
public com.android.ims.internal.IImsCallSession createCallSession(int slotId, int featureType, int sessionId, com.android.ims.ImsCallProfile profile, com.android.ims.internal.IImsCallSessionListener listener) throws android.os.RemoteException;
public com.android.ims.internal.IImsCallSession getPendingCallSession(int slotId, int featureType, int sessionId, java.lang.String callId) throws android.os.RemoteException;
public com.android.ims.internal.IImsUt getUtInterface(int slotId, int featureType) throws android.os.RemoteException;
public com.android.ims.internal.IImsConfig getConfigInterface(int slotId, int featureType) throws android.os.RemoteException;
public void turnOnIms(int slotId, int featureType) throws android.os.RemoteException;
public void turnOffIms(int slotId, int featureType) throws android.os.RemoteException;
public com.android.ims.internal.IImsEcbm getEcbmInterface(int slotId, int featureType) throws android.os.RemoteException;
public void setUiTTYMode(int slotId, int featureType, int uiTtyMode, android.os.Message onComplete) throws android.os.RemoteException;
public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface(int slotId, int featureType) throws android.os.RemoteException;
}
