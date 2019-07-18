/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/IImsCallSessionListener.aidl
 */
package com.android.ims.internal;
/**
 * A listener type for receiving notification on IMS call session events.
 * When an event is generated for an {@link IImsCallSession}, the application is notified
 * by having one of the methods called on the {@link IImsCallSessionListener}.
 * {@hide}
 */
public interface IImsCallSessionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsCallSessionListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsCallSessionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsCallSessionListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsCallSessionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsCallSessionListener))) {
return ((com.android.ims.internal.IImsCallSessionListener)iin);
}
return new com.android.ims.internal.IImsCallSessionListener.Stub.Proxy(obj);
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
case TRANSACTION_callSessionProgressing:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsStreamMediaProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsStreamMediaProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionProgressing(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionStarted:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionStarted(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionStartFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionStartFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionTerminated:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionTerminated(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionHeld:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionHeld(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionHoldFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionHoldFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionHoldReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionHoldReceived(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionResumed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionResumed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionResumeFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionResumeFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionResumeReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionResumeReceived(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionMergeStarted:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.IImsCallSession _arg1;
_arg1 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.callSessionMergeStarted(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_callSessionMergeComplete:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
this.callSessionMergeComplete(_arg0);
return true;
}
case TRANSACTION_callSessionMergeFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionMergeFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionUpdated:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionUpdated(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionUpdateFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionUpdateFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionUpdateReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionUpdateReceived(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionConferenceExtended:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.IImsCallSession _arg1;
_arg1 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.callSessionConferenceExtended(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_callSessionConferenceExtendFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionConferenceExtendFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionConferenceExtendReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.internal.IImsCallSession _arg1;
_arg1 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.callSessionConferenceExtendReceived(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_callSessionInviteParticipantsRequestDelivered:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
this.callSessionInviteParticipantsRequestDelivered(_arg0);
return true;
}
case TRANSACTION_callSessionInviteParticipantsRequestFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionInviteParticipantsRequestFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionRemoveParticipantsRequestDelivered:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
this.callSessionRemoveParticipantsRequestDelivered(_arg0);
return true;
}
case TRANSACTION_callSessionRemoveParticipantsRequestFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsReasonInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionRemoveParticipantsRequestFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionConferenceStateUpdated:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsConferenceState _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsConferenceState.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionConferenceStateUpdated(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionUssdMessageReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.callSessionUssdMessageReceived(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_callSessionHandover:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
com.android.ims.ImsReasonInfo _arg3;
if ((0!=data.readInt())) {
_arg3 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.callSessionHandover(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_callSessionHandoverFailed:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
com.android.ims.ImsReasonInfo _arg3;
if ((0!=data.readInt())) {
_arg3 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.callSessionHandoverFailed(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_callSessionMayHandover:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.callSessionMayHandover(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_callSessionTtyModeReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.callSessionTtyModeReceived(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionMultipartyStateChanged:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.callSessionMultipartyStateChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionSuppServiceReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsSuppServiceNotification _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsSuppServiceNotification.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionSuppServiceReceived(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionRttModifyRequestReceived:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSession _arg0;
_arg0 = com.android.ims.internal.IImsCallSession.Stub.asInterface(data.readStrongBinder());
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.callSessionRttModifyRequestReceived(_arg0, _arg1);
return true;
}
case TRANSACTION_callSessionRttModifyResponseReceived:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.callSessionRttModifyResponseReceived(_arg0);
return true;
}
case TRANSACTION_callSessionRttMessageReceived:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.callSessionRttMessageReceived(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsCallSessionListener
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
     * Notifies the result of the basic session operation (setup / terminate).
     */
@Override public void callSessionProgressing(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionProgressing, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionStarted(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionStartFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionStartFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionTerminated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionTerminated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the result of the call hold/resume operation.
     */
@Override public void callSessionHeld(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHeld, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionHoldFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHoldFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionHoldReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHoldReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionResumed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionResumed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionResumeFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionResumeFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionResumeReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionResumeReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the result of call merge operation.
     */
@Override public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeStrongBinder((((newSession!=null))?(newSession.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionMergeStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_callSessionMergeComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionMergeFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionMergeFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the result of call upgrade / downgrade or any other call updates.
     */
@Override public void callSessionUpdated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionUpdateFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionUpdateFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionUpdateReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionUpdateReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the result of conference extension.
     */
@Override public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeStrongBinder((((newSession!=null))?(newSession.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionConferenceExtended, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionConferenceExtendFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionConferenceExtendFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeStrongBinder((((newSession!=null))?(newSession.asBinder()):(null)));
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionConferenceExtendReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the result of the participant invitation / removal to/from the conference session.
     */
@Override public void callSessionInviteParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_callSessionInviteParticipantsRequestDelivered, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionInviteParticipantsRequestFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionInviteParticipantsRequestFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionRemoveParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_callSessionRemoveParticipantsRequestDelivered, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionRemoveParticipantsRequestFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionRemoveParticipantsRequestFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the changes of the conference info. in the conference session.
     */
@Override public void callSessionConferenceStateUpdated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsConferenceState state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((state!=null)) {
_data.writeInt(1);
state.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionConferenceStateUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the incoming USSD message.
     */
@Override public void callSessionUssdMessageReceived(com.android.ims.internal.IImsCallSession session, int mode, java.lang.String ussdMessage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(mode);
_data.writeString(ussdMessage);
mRemote.transact(Stub.TRANSACTION_callSessionUssdMessageReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies of handover information for this call
     */
@Override public void callSessionHandover(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(srcAccessTech);
_data.writeInt(targetAccessTech);
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHandover, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionHandoverFailed(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(srcAccessTech);
_data.writeInt(targetAccessTech);
if ((reasonInfo!=null)) {
_data.writeInt(1);
reasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionHandoverFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void callSessionMayHandover(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(srcAccessTech);
_data.writeInt(targetAccessTech);
mRemote.transact(Stub.TRANSACTION_callSessionMayHandover, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the TTY mode change by remote party.
     * @param mode one of the following:
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_OFF}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_FULL}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_HCO}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_VCO}
     */
@Override public void callSessionTtyModeReceived(com.android.ims.internal.IImsCallSession session, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_callSessionTtyModeReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies of a change to the multiparty state for this {@code ImsCallSession}.
     *
     * @param session The call session.
     * @param isMultiParty {@code true} if the session became multiparty, {@code false} otherwise.
     */
@Override public void callSessionMultipartyStateChanged(com.android.ims.internal.IImsCallSession session, boolean isMultiParty) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeInt(((isMultiParty)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_callSessionMultipartyStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the supplementary service information for the current session.
     */
@Override public void callSessionSuppServiceReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsSuppServiceNotification suppSrvNotification) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((suppSrvNotification!=null)) {
_data.writeInt(1);
suppSrvNotification.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionSuppServiceReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Device received RTT modify request from Remote UE
     * @param session ImsCallProfile with updated attribute
     */
@Override public void callSessionRttModifyRequestReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile callProfile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
if ((callProfile!=null)) {
_data.writeInt(1);
callProfile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_callSessionRttModifyRequestReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/* Device issued RTT modify request and inturn received response
     * from Remote UE
     * @param status Will be one of the following values from:
     * - {@link Connection.RttModifyStatus}
     */
@Override public void callSessionRttModifyResponseReceived(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_callSessionRttModifyResponseReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/*
     * While in call, device received RTT message from Remote UE
     * @param rttMessage Received RTT message
     */
@Override public void callSessionRttMessageReceived(java.lang.String rttMessage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(rttMessage);
mRemote.transact(Stub.TRANSACTION_callSessionRttMessageReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_callSessionProgressing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_callSessionStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_callSessionStartFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_callSessionTerminated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_callSessionHeld = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_callSessionHoldFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_callSessionHoldReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_callSessionResumed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_callSessionResumeFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_callSessionResumeReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_callSessionMergeStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_callSessionMergeComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_callSessionMergeFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_callSessionUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_callSessionUpdateFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_callSessionUpdateReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_callSessionConferenceExtended = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_callSessionConferenceExtendFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_callSessionConferenceExtendReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_callSessionInviteParticipantsRequestDelivered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_callSessionInviteParticipantsRequestFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_callSessionRemoveParticipantsRequestDelivered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_callSessionRemoveParticipantsRequestFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_callSessionConferenceStateUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_callSessionUssdMessageReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_callSessionHandover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_callSessionHandoverFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_callSessionMayHandover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_callSessionTtyModeReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_callSessionMultipartyStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_callSessionSuppServiceReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_callSessionRttModifyRequestReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_callSessionRttModifyResponseReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_callSessionRttMessageReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
}
/**
     * Notifies the result of the basic session operation (setup / terminate).
     */
public void callSessionProgressing(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException;
public void callSessionStarted(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionStartFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionTerminated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
/**
     * Notifies the result of the call hold/resume operation.
     */
public void callSessionHeld(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionHoldFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionHoldReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionResumed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionResumeFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionResumeReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
/**
     * Notifies the result of call merge operation.
     */
public void callSessionMergeStarted(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionMergeComplete(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException;
public void callSessionMergeFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
/**
     * Notifies the result of call upgrade / downgrade or any other call updates.
     */
public void callSessionUpdated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionUpdateFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionUpdateReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
/**
     * Notifies the result of conference extension.
     */
public void callSessionConferenceExtended(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
public void callSessionConferenceExtendFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionConferenceExtendReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.internal.IImsCallSession newSession, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
/**
     * Notifies the result of the participant invitation / removal to/from the conference session.
     */
public void callSessionInviteParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException;
public void callSessionInviteParticipantsRequestFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionRemoveParticipantsRequestDelivered(com.android.ims.internal.IImsCallSession session) throws android.os.RemoteException;
public void callSessionRemoveParticipantsRequestFailed(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
/**
     * Notifies the changes of the conference info. in the conference session.
     */
public void callSessionConferenceStateUpdated(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsConferenceState state) throws android.os.RemoteException;
/**
     * Notifies the incoming USSD message.
     */
public void callSessionUssdMessageReceived(com.android.ims.internal.IImsCallSession session, int mode, java.lang.String ussdMessage) throws android.os.RemoteException;
/**
     * Notifies of handover information for this call
     */
public void callSessionHandover(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionHandoverFailed(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech, com.android.ims.ImsReasonInfo reasonInfo) throws android.os.RemoteException;
public void callSessionMayHandover(com.android.ims.internal.IImsCallSession session, int srcAccessTech, int targetAccessTech) throws android.os.RemoteException;
/**
     * Notifies the TTY mode change by remote party.
     * @param mode one of the following:
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_OFF}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_FULL}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_HCO}
     * - {@link com.android.internal.telephony.Phone#TTY_MODE_VCO}
     */
public void callSessionTtyModeReceived(com.android.ims.internal.IImsCallSession session, int mode) throws android.os.RemoteException;
/**
     * Notifies of a change to the multiparty state for this {@code ImsCallSession}.
     *
     * @param session The call session.
     * @param isMultiParty {@code true} if the session became multiparty, {@code false} otherwise.
     */
public void callSessionMultipartyStateChanged(com.android.ims.internal.IImsCallSession session, boolean isMultiParty) throws android.os.RemoteException;
/**
     * Notifies the supplementary service information for the current session.
     */
public void callSessionSuppServiceReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsSuppServiceNotification suppSrvNotification) throws android.os.RemoteException;
/**
     * Device received RTT modify request from Remote UE
     * @param session ImsCallProfile with updated attribute
     */
public void callSessionRttModifyRequestReceived(com.android.ims.internal.IImsCallSession session, com.android.ims.ImsCallProfile callProfile) throws android.os.RemoteException;
/* Device issued RTT modify request and inturn received response
     * from Remote UE
     * @param status Will be one of the following values from:
     * - {@link Connection.RttModifyStatus}
     */
public void callSessionRttModifyResponseReceived(int status) throws android.os.RemoteException;
/*
     * While in call, device received RTT message from Remote UE
     * @param rttMessage Received RTT message
     */
public void callSessionRttMessageReceived(java.lang.String rttMessage) throws android.os.RemoteException;
}
