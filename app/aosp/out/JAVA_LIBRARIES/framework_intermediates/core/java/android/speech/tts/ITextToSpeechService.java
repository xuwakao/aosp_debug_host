/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/speech/tts/ITextToSpeechService.aidl
 */
package android.speech.tts;
/**
 * Interface for TextToSpeech to talk to TextToSpeechService.
 *
 * {@hide}
 */
public interface ITextToSpeechService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.speech.tts.ITextToSpeechService
{
private static final java.lang.String DESCRIPTOR = "android.speech.tts.ITextToSpeechService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.speech.tts.ITextToSpeechService interface,
 * generating a proxy if needed.
 */
public static android.speech.tts.ITextToSpeechService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.speech.tts.ITextToSpeechService))) {
return ((android.speech.tts.ITextToSpeechService)iin);
}
return new android.speech.tts.ITextToSpeechService.Stub.Proxy(obj);
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
case TRANSACTION_speak:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.CharSequence _arg1;
if ((0!=data.readInt())) {
_arg1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
java.lang.String _arg4;
_arg4 = data.readString();
int _result = this.speak(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_synthesizeToFileDescriptor:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.CharSequence _arg1;
if ((0!=data.readInt())) {
_arg1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.ParcelFileDescriptor _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
java.lang.String _arg4;
_arg4 = data.readString();
int _result = this.synthesizeToFileDescriptor(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_playAudio:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
java.lang.String _arg4;
_arg4 = data.readString();
int _result = this.playAudio(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_playSilence:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
int _result = this.playSilence(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isSpeaking:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSpeaking();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _result = this.stop(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLanguage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getLanguage();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getClientDefaultLanguage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getClientDefaultLanguage();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_isLanguageAvailable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.isLanguageAvailable(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getFeaturesForLanguage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String[] _result = this.getFeaturesForLanguage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_loadLanguage:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _result = this.loadLanguage(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setCallback:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.speech.tts.ITextToSpeechCallback _arg1;
_arg1 = android.speech.tts.ITextToSpeechCallback.Stub.asInterface(data.readStrongBinder());
this.setCallback(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getVoices:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.speech.tts.Voice> _result = this.getVoices();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_loadVoice:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.loadVoice(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDefaultVoiceNameFor:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _result = this.getDefaultVoiceNameFor(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.speech.tts.ITextToSpeechService
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
@Override public int speak(android.os.IBinder callingInstance, java.lang.CharSequence text, int queueMode, android.os.Bundle params, java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
if ((text!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(text, _data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(queueMode);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_speak, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int synthesizeToFileDescriptor(android.os.IBinder callingInstance, java.lang.CharSequence text, android.os.ParcelFileDescriptor fileDescriptor, android.os.Bundle params, java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
if ((text!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(text, _data, 0);
}
else {
_data.writeInt(0);
}
if ((fileDescriptor!=null)) {
_data.writeInt(1);
fileDescriptor.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_synthesizeToFileDescriptor, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int playAudio(android.os.IBinder callingInstance, android.net.Uri audioUri, int queueMode, android.os.Bundle params, java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
if ((audioUri!=null)) {
_data.writeInt(1);
audioUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(queueMode);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_playAudio, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int playSilence(android.os.IBinder callingInstance, long duration, int queueMode, java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
_data.writeLong(duration);
_data.writeInt(queueMode);
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_playSilence, _data, _reply, 0);
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
     * Checks whether the service is currently playing some audio.
     */
@Override public boolean isSpeaking() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSpeaking, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int stop(android.os.IBinder callingInstance) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getLanguage() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLanguage, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getClientDefaultLanguage() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getClientDefaultLanguage, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int isLanguageAvailable(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(lang);
_data.writeString(country);
_data.writeString(variant);
mRemote.transact(Stub.TRANSACTION_isLanguageAvailable, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getFeaturesForLanguage(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(lang);
_data.writeString(country);
_data.writeString(variant);
mRemote.transact(Stub.TRANSACTION_getFeaturesForLanguage, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int loadLanguage(android.os.IBinder caller, java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(caller);
_data.writeString(lang);
_data.writeString(country);
_data.writeString(variant);
mRemote.transact(Stub.TRANSACTION_loadLanguage, _data, _reply, 0);
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
     * Sets the callback that will be notified when playback of utterance from the
     * given app are completed.
     *
     * @param caller Instance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param cb The callback.
     */
@Override public void setCallback(android.os.IBinder caller, android.speech.tts.ITextToSpeechCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(caller);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get the array of available voices.
     */
@Override public java.util.List<android.speech.tts.Voice> getVoices() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.speech.tts.Voice> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVoices, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.speech.tts.Voice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int loadVoice(android.os.IBinder caller, java.lang.String voiceName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(caller);
_data.writeString(voiceName);
mRemote.transact(Stub.TRANSACTION_loadVoice, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDefaultVoiceNameFor(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(lang);
_data.writeString(country);
_data.writeString(variant);
mRemote.transact(Stub.TRANSACTION_getDefaultVoiceNameFor, _data, _reply, 0);
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
static final int TRANSACTION_speak = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_synthesizeToFileDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_playAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_playSilence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isSpeaking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getLanguage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getClientDefaultLanguage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_isLanguageAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getFeaturesForLanguage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_loadLanguage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getVoices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_loadVoice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getDefaultVoiceNameFor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
}
public int speak(android.os.IBinder callingInstance, java.lang.CharSequence text, int queueMode, android.os.Bundle params, java.lang.String utteranceId) throws android.os.RemoteException;
public int synthesizeToFileDescriptor(android.os.IBinder callingInstance, java.lang.CharSequence text, android.os.ParcelFileDescriptor fileDescriptor, android.os.Bundle params, java.lang.String utteranceId) throws android.os.RemoteException;
public int playAudio(android.os.IBinder callingInstance, android.net.Uri audioUri, int queueMode, android.os.Bundle params, java.lang.String utteranceId) throws android.os.RemoteException;
public int playSilence(android.os.IBinder callingInstance, long duration, int queueMode, java.lang.String utteranceId) throws android.os.RemoteException;
/**
     * Checks whether the service is currently playing some audio.
     */
public boolean isSpeaking() throws android.os.RemoteException;
public int stop(android.os.IBinder callingInstance) throws android.os.RemoteException;
public java.lang.String[] getLanguage() throws android.os.RemoteException;
public java.lang.String[] getClientDefaultLanguage() throws android.os.RemoteException;
public int isLanguageAvailable(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException;
public java.lang.String[] getFeaturesForLanguage(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException;
public int loadLanguage(android.os.IBinder caller, java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException;
/**
     * Sets the callback that will be notified when playback of utterance from the
     * given app are completed.
     *
     * @param caller Instance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param cb The callback.
     */
public void setCallback(android.os.IBinder caller, android.speech.tts.ITextToSpeechCallback cb) throws android.os.RemoteException;
/**
     * Get the array of available voices.
     */
public java.util.List<android.speech.tts.Voice> getVoices() throws android.os.RemoteException;
public int loadVoice(android.os.IBinder caller, java.lang.String voiceName) throws android.os.RemoteException;
public java.lang.String getDefaultVoiceNameFor(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException;
}
