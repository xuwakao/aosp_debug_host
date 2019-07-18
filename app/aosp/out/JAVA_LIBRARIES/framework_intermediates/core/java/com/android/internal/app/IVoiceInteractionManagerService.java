/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/app/IVoiceInteractionManagerService.aidl
 */
package com.android.internal.app;
public interface IVoiceInteractionManagerService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractionManagerService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractionManagerService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IVoiceInteractionManagerService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IVoiceInteractionManagerService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IVoiceInteractionManagerService))) {
return ((com.android.internal.app.IVoiceInteractionManagerService)iin);
}
return new com.android.internal.app.IVoiceInteractionManagerService.Stub.Proxy(obj);
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
case TRANSACTION_showSession:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.showSession(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_deliverNewSession:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.service.voice.IVoiceInteractionSession _arg1;
_arg1 = android.service.voice.IVoiceInteractionSession.Stub.asInterface(data.readStrongBinder());
com.android.internal.app.IVoiceInteractor _arg2;
_arg2 = com.android.internal.app.IVoiceInteractor.Stub.asInterface(data.readStrongBinder());
boolean _result = this.deliverNewSession(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_showSessionFromSession:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
boolean _result = this.showSessionFromSession(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hideSessionFromSession:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _result = this.hideSessionFromSession(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startVoiceActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.startVoiceActivity(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startAssistantActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.startAssistantActivity(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setKeepAwake:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setKeepAwake(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_closeSystemDialogs:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.closeSystemDialogs(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_finish:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.finish(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setDisabledShowContext:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDisabledShowContext(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDisabledShowContext:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDisabledShowContext();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getUserDisabledShowContext:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getUserDisabledShowContext();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getKeyphraseSoundModel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel _result = this.getKeyphraseSoundModel(_arg0, _arg1);
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
case TRANSACTION_updateKeyphraseSoundModel:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.updateKeyphraseSoundModel(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deleteKeyphraseSoundModel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.deleteKeyphraseSoundModel(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDspModuleProperties:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
android.hardware.soundtrigger.SoundTrigger.ModuleProperties _result = this.getDspModuleProperties(_arg0);
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
case TRANSACTION_isEnrolledForKeyphrase:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.isEnrolledForKeyphrase(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startRecognition:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
android.hardware.soundtrigger.IRecognitionStatusCallback _arg3;
_arg3 = android.hardware.soundtrigger.IRecognitionStatusCallback.Stub.asInterface(data.readStrongBinder());
android.hardware.soundtrigger.SoundTrigger.RecognitionConfig _arg4;
if ((0!=data.readInt())) {
_arg4 = android.hardware.soundtrigger.SoundTrigger.RecognitionConfig.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _result = this.startRecognition(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_stopRecognition:
{
data.enforceInterface(DESCRIPTOR);
android.service.voice.IVoiceInteractionService _arg0;
_arg0 = android.service.voice.IVoiceInteractionService.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
android.hardware.soundtrigger.IRecognitionStatusCallback _arg2;
_arg2 = android.hardware.soundtrigger.IRecognitionStatusCallback.Stub.asInterface(data.readStrongBinder());
int _result = this.stopRecognition(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveServiceComponentName:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _result = this.getActiveServiceComponentName();
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
case TRANSACTION_showSessionForActiveService:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
com.android.internal.app.IVoiceInteractionSessionShowCallback _arg2;
_arg2 = com.android.internal.app.IVoiceInteractionSessionShowCallback.Stub.asInterface(data.readStrongBinder());
android.os.IBinder _arg3;
_arg3 = data.readStrongBinder();
boolean _result = this.showSessionForActiveService(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hideCurrentSession:
{
data.enforceInterface(DESCRIPTOR);
this.hideCurrentSession();
reply.writeNoException();
return true;
}
case TRANSACTION_launchVoiceAssistFromKeyguard:
{
data.enforceInterface(DESCRIPTOR);
this.launchVoiceAssistFromKeyguard();
reply.writeNoException();
return true;
}
case TRANSACTION_isSessionRunning:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSessionRunning();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_activeServiceSupportsAssist:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.activeServiceSupportsAssist();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_activeServiceSupportsLaunchFromKeyguard:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.activeServiceSupportsLaunchFromKeyguard();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_onLockscreenShown:
{
data.enforceInterface(DESCRIPTOR);
this.onLockscreenShown();
reply.writeNoException();
return true;
}
case TRANSACTION_registerVoiceInteractionSessionListener:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.app.IVoiceInteractionSessionListener _arg0;
_arg0 = com.android.internal.app.IVoiceInteractionSessionListener.Stub.asInterface(data.readStrongBinder());
this.registerVoiceInteractionSessionListener(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IVoiceInteractionManagerService
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
@Override public void showSession(android.service.voice.IVoiceInteractionService service, android.os.Bundle sessionArgs, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
if ((sessionArgs!=null)) {
_data.writeInt(1);
sessionArgs.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_showSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean deliverNewSession(android.os.IBinder token, android.service.voice.IVoiceInteractionSession session, com.android.internal.app.IVoiceInteractor interactor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
_data.writeStrongBinder((((interactor!=null))?(interactor.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_deliverNewSession, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean showSessionFromSession(android.os.IBinder token, android.os.Bundle sessionArgs, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((sessionArgs!=null)) {
_data.writeInt(1);
sessionArgs.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_showSessionFromSession, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean hideSessionFromSession(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_hideSessionFromSession, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startVoiceActivity(android.os.IBinder token, android.content.Intent intent, java.lang.String resolvedType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
mRemote.transact(Stub.TRANSACTION_startVoiceActivity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startAssistantActivity(android.os.IBinder token, android.content.Intent intent, java.lang.String resolvedType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
mRemote.transact(Stub.TRANSACTION_startAssistantActivity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setKeepAwake(android.os.IBinder token, boolean keepAwake) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((keepAwake)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setKeepAwake, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void closeSystemDialogs(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_closeSystemDialogs, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void finish(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_finish, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDisabledShowContext(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_setDisabledShowContext, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDisabledShowContext() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDisabledShowContext, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getUserDisabledShowContext() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUserDisabledShowContext, _data, _reply, 0);
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
     * Gets the registered Sound model for keyphrase detection for the current user.
     * May be null if no matching sound model exists.
     *
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
@Override public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(keyphraseId);
_data.writeString(bcp47Locale);
mRemote.transact(Stub.TRANSACTION_getKeyphraseSoundModel, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel.CREATOR.createFromParcel(_reply);
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
@Override public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel model) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((model!=null)) {
_data.writeInt(1);
model.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateKeyphraseSoundModel, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int deleteKeyphraseSoundModel(int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(keyphraseId);
_data.writeString(bcp47Locale);
mRemote.transact(Stub.TRANSACTION_deleteKeyphraseSoundModel, _data, _reply, 0);
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
     * Gets the properties of the DSP hardware on this device, null if not present.
     */
@Override public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties(android.service.voice.IVoiceInteractionService service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.soundtrigger.SoundTrigger.ModuleProperties _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getDspModuleProperties, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.soundtrigger.SoundTrigger.ModuleProperties.CREATOR.createFromParcel(_reply);
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
     * Indicates if there's a keyphrase sound model available for the given keyphrase ID.
     * This performs the check for the current user.
     *
     * @param service The current VoiceInteractionService.
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
@Override public boolean isEnrolledForKeyphrase(android.service.voice.IVoiceInteractionService service, int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
_data.writeInt(keyphraseId);
_data.writeString(bcp47Locale);
mRemote.transact(Stub.TRANSACTION_isEnrolledForKeyphrase, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startRecognition(android.service.voice.IVoiceInteractionService service, int keyphraseId, java.lang.String bcp47Locale, android.hardware.soundtrigger.IRecognitionStatusCallback callback, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig recognitionConfig) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
_data.writeInt(keyphraseId);
_data.writeString(bcp47Locale);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((recognitionConfig!=null)) {
_data.writeInt(1);
recognitionConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startRecognition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int stopRecognition(android.service.voice.IVoiceInteractionService service, int keyphraseId, android.hardware.soundtrigger.IRecognitionStatusCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((service!=null))?(service.asBinder()):(null)));
_data.writeInt(keyphraseId);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopRecognition, _data, _reply, 0);
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
     * @return the component name for the currently active voice interaction service
     */
@Override public android.content.ComponentName getActiveServiceComponentName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveServiceComponentName, _data, _reply, 0);
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
/**
     * Shows the session for the currently active service. Used to start a new session from system
     * affordances.
     *
     * @param args the bundle to pass as arguments to the voice interaction session
     * @param sourceFlags flags indicating the source of this show
     * @param showCallback optional callback to be notified when the session was shown
     * @param activityToken optional token of activity that needs to be on top
     */
@Override public boolean showSessionForActiveService(android.os.Bundle args, int sourceFlags, com.android.internal.app.IVoiceInteractionSessionShowCallback showCallback, android.os.IBinder activityToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(sourceFlags);
_data.writeStrongBinder((((showCallback!=null))?(showCallback.asBinder()):(null)));
_data.writeStrongBinder(activityToken);
mRemote.transact(Stub.TRANSACTION_showSessionForActiveService, _data, _reply, 0);
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
     * Hides the session from the active service, if it is showing.
     */
@Override public void hideCurrentSession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hideCurrentSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the active service that a launch was requested from the Keyguard. This will only
     * be called if {@link #activeServiceSupportsLaunchFromKeyguard()} returns true.
     */
@Override public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_launchVoiceAssistFromKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Indicates whether there is a voice session running (but not necessarily showing).
     */
@Override public boolean isSessionRunning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSessionRunning, _data, _reply, 0);
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
     * Indicates whether the currently active voice interaction service is capable of handling the
     * assist gesture.
     */
@Override public boolean activeServiceSupportsAssist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_activeServiceSupportsAssist, _data, _reply, 0);
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
     * Indicates whether the currently active voice interaction service is capable of being launched
     * from the lockscreen.
     */
@Override public boolean activeServiceSupportsLaunchFromKeyguard() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_activeServiceSupportsLaunchFromKeyguard, _data, _reply, 0);
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
     * Called when the lockscreen got shown.
     */
@Override public void onLockscreenShown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onLockscreenShown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Register a voice interaction listener.
     */
@Override public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerVoiceInteractionSessionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_showSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_deliverNewSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_showSessionFromSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_hideSessionFromSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_startVoiceActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_startAssistantActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setKeepAwake = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_closeSystemDialogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_finish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setDisabledShowContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getDisabledShowContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getUserDisabledShowContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getKeyphraseSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_updateKeyphraseSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_deleteKeyphraseSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getDspModuleProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_isEnrolledForKeyphrase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_startRecognition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_stopRecognition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getActiveServiceComponentName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_showSessionForActiveService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_hideCurrentSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_launchVoiceAssistFromKeyguard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_isSessionRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_activeServiceSupportsAssist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_activeServiceSupportsLaunchFromKeyguard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_onLockscreenShown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_registerVoiceInteractionSessionListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
}
public void showSession(android.service.voice.IVoiceInteractionService service, android.os.Bundle sessionArgs, int flags) throws android.os.RemoteException;
public boolean deliverNewSession(android.os.IBinder token, android.service.voice.IVoiceInteractionSession session, com.android.internal.app.IVoiceInteractor interactor) throws android.os.RemoteException;
public boolean showSessionFromSession(android.os.IBinder token, android.os.Bundle sessionArgs, int flags) throws android.os.RemoteException;
public boolean hideSessionFromSession(android.os.IBinder token) throws android.os.RemoteException;
public int startVoiceActivity(android.os.IBinder token, android.content.Intent intent, java.lang.String resolvedType) throws android.os.RemoteException;
public int startAssistantActivity(android.os.IBinder token, android.content.Intent intent, java.lang.String resolvedType) throws android.os.RemoteException;
public void setKeepAwake(android.os.IBinder token, boolean keepAwake) throws android.os.RemoteException;
public void closeSystemDialogs(android.os.IBinder token) throws android.os.RemoteException;
public void finish(android.os.IBinder token) throws android.os.RemoteException;
public void setDisabledShowContext(int flags) throws android.os.RemoteException;
public int getDisabledShowContext() throws android.os.RemoteException;
public int getUserDisabledShowContext() throws android.os.RemoteException;
/**
     * Gets the registered Sound model for keyphrase detection for the current user.
     * May be null if no matching sound model exists.
     *
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException;
public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel model) throws android.os.RemoteException;
public int deleteKeyphraseSoundModel(int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException;
/**
     * Gets the properties of the DSP hardware on this device, null if not present.
     */
public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties(android.service.voice.IVoiceInteractionService service) throws android.os.RemoteException;
/**
     * Indicates if there's a keyphrase sound model available for the given keyphrase ID.
     * This performs the check for the current user.
     *
     * @param service The current VoiceInteractionService.
     * @param keyphraseId The unique identifier for the keyphrase.
     * @param bcp47Locale The BCP47 language tag  for the keyphrase's locale.
     */
public boolean isEnrolledForKeyphrase(android.service.voice.IVoiceInteractionService service, int keyphraseId, java.lang.String bcp47Locale) throws android.os.RemoteException;
public int startRecognition(android.service.voice.IVoiceInteractionService service, int keyphraseId, java.lang.String bcp47Locale, android.hardware.soundtrigger.IRecognitionStatusCallback callback, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig recognitionConfig) throws android.os.RemoteException;
public int stopRecognition(android.service.voice.IVoiceInteractionService service, int keyphraseId, android.hardware.soundtrigger.IRecognitionStatusCallback callback) throws android.os.RemoteException;
/**
     * @return the component name for the currently active voice interaction service
     */
public android.content.ComponentName getActiveServiceComponentName() throws android.os.RemoteException;
/**
     * Shows the session for the currently active service. Used to start a new session from system
     * affordances.
     *
     * @param args the bundle to pass as arguments to the voice interaction session
     * @param sourceFlags flags indicating the source of this show
     * @param showCallback optional callback to be notified when the session was shown
     * @param activityToken optional token of activity that needs to be on top
     */
public boolean showSessionForActiveService(android.os.Bundle args, int sourceFlags, com.android.internal.app.IVoiceInteractionSessionShowCallback showCallback, android.os.IBinder activityToken) throws android.os.RemoteException;
/**
     * Hides the session from the active service, if it is showing.
     */
public void hideCurrentSession() throws android.os.RemoteException;
/**
     * Notifies the active service that a launch was requested from the Keyguard. This will only
     * be called if {@link #activeServiceSupportsLaunchFromKeyguard()} returns true.
     */
public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException;
/**
     * Indicates whether there is a voice session running (but not necessarily showing).
     */
public boolean isSessionRunning() throws android.os.RemoteException;
/**
     * Indicates whether the currently active voice interaction service is capable of handling the
     * assist gesture.
     */
public boolean activeServiceSupportsAssist() throws android.os.RemoteException;
/**
     * Indicates whether the currently active voice interaction service is capable of being launched
     * from the lockscreen.
     */
public boolean activeServiceSupportsLaunchFromKeyguard() throws android.os.RemoteException;
/**
     * Called when the lockscreen got shown.
     */
public void onLockscreenShown() throws android.os.RemoteException;
/**
     * Register a voice interaction listener.
     */
public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener listener) throws android.os.RemoteException;
}
