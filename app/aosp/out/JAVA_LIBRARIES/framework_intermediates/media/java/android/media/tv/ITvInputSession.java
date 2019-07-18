/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/tv/ITvInputSession.aidl
 */
package android.media.tv;
/**
 * Sub-interface of ITvInputService which is created per session and has its own context.
 * @hide
 */
public interface ITvInputSession extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputSession
{
private static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputSession";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.tv.ITvInputSession interface,
 * generating a proxy if needed.
 */
public static android.media.tv.ITvInputSession asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.tv.ITvInputSession))) {
return ((android.media.tv.ITvInputSession)iin);
}
return new android.media.tv.ITvInputSession.Stub.Proxy(obj);
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
case TRANSACTION_release:
{
data.enforceInterface(DESCRIPTOR);
this.release();
return true;
}
case TRANSACTION_setMain:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setMain(_arg0);
return true;
}
case TRANSACTION_setSurface:
{
data.enforceInterface(DESCRIPTOR);
android.view.Surface _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.Surface.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setSurface(_arg0);
return true;
}
case TRANSACTION_dispatchSurfaceChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.dispatchSurfaceChanged(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_setVolume:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.setVolume(_arg0);
return true;
}
case TRANSACTION_tune:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
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
this.tune(_arg0, _arg1);
return true;
}
case TRANSACTION_setCaptionEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setCaptionEnabled(_arg0);
return true;
}
case TRANSACTION_selectTrack:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.selectTrack(_arg0, _arg1);
return true;
}
case TRANSACTION_appPrivateCommand:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.appPrivateCommand(_arg0, _arg1);
return true;
}
case TRANSACTION_createOverlayView:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.graphics.Rect _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.createOverlayView(_arg0, _arg1);
return true;
}
case TRANSACTION_relayoutOverlayView:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Rect _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.relayoutOverlayView(_arg0);
return true;
}
case TRANSACTION_removeOverlayView:
{
data.enforceInterface(DESCRIPTOR);
this.removeOverlayView();
return true;
}
case TRANSACTION_unblockContent:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.unblockContent(_arg0);
return true;
}
case TRANSACTION_timeShiftPlay:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.timeShiftPlay(_arg0);
return true;
}
case TRANSACTION_timeShiftPause:
{
data.enforceInterface(DESCRIPTOR);
this.timeShiftPause();
return true;
}
case TRANSACTION_timeShiftResume:
{
data.enforceInterface(DESCRIPTOR);
this.timeShiftResume();
return true;
}
case TRANSACTION_timeShiftSeekTo:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.timeShiftSeekTo(_arg0);
return true;
}
case TRANSACTION_timeShiftSetPlaybackParams:
{
data.enforceInterface(DESCRIPTOR);
android.media.PlaybackParams _arg0;
if ((0!=data.readInt())) {
_arg0 = android.media.PlaybackParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.timeShiftSetPlaybackParams(_arg0);
return true;
}
case TRANSACTION_timeShiftEnablePositionTracking:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.timeShiftEnablePositionTracking(_arg0);
return true;
}
case TRANSACTION_startRecording:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.startRecording(_arg0);
return true;
}
case TRANSACTION_stopRecording:
{
data.enforceInterface(DESCRIPTOR);
this.stopRecording();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.tv.ITvInputSession
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
@Override public void release() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_release, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setMain(boolean isMain) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isMain)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMain, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setSurface(android.view.Surface surface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((surface!=null)) {
_data.writeInt(1);
surface.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setSurface, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dispatchSurfaceChanged(int format, int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(format);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_dispatchSurfaceChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// TODO: Remove this once it becomes irrelevant for applications to handle audio focus. The plan
// is to introduce some new concepts that will solve a number of problems in audio policy today.

@Override public void setVolume(float volume) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(volume);
mRemote.transact(Stub.TRANSACTION_setVolume, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void tune(android.net.Uri channelUri, android.os.Bundle params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((channelUri!=null)) {
_data.writeInt(1);
channelUri.writeToParcel(_data, 0);
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
mRemote.transact(Stub.TRANSACTION_tune, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setCaptionEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setCaptionEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void selectTrack(int type, java.lang.String trackId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeString(trackId);
mRemote.transact(Stub.TRANSACTION_selectTrack, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void appPrivateCommand(java.lang.String action, android.os.Bundle data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(action);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_appPrivateCommand, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void createOverlayView(android.os.IBinder windowToken, android.graphics.Rect frame) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(windowToken);
if ((frame!=null)) {
_data.writeInt(1);
frame.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createOverlayView, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void relayoutOverlayView(android.graphics.Rect frame) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((frame!=null)) {
_data.writeInt(1);
frame.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_relayoutOverlayView, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void removeOverlayView() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_removeOverlayView, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void unblockContent(java.lang.String unblockedRating) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(unblockedRating);
mRemote.transact(Stub.TRANSACTION_unblockContent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void timeShiftPlay(android.net.Uri recordedProgramUri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((recordedProgramUri!=null)) {
_data.writeInt(1);
recordedProgramUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_timeShiftPlay, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void timeShiftPause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_timeShiftPause, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void timeShiftResume() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_timeShiftResume, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void timeShiftSeekTo(long timeMs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(timeMs);
mRemote.transact(Stub.TRANSACTION_timeShiftSeekTo, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void timeShiftSetPlaybackParams(android.media.PlaybackParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_timeShiftSetPlaybackParams, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void timeShiftEnablePositionTracking(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_timeShiftEnablePositionTracking, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// For the recording session

@Override public void startRecording(android.net.Uri programUri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((programUri!=null)) {
_data.writeInt(1);
programUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startRecording, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stopRecording() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopRecording, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_release = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setMain = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setSurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_dispatchSurfaceChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_tune = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setCaptionEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_selectTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_appPrivateCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_createOverlayView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_relayoutOverlayView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_removeOverlayView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_unblockContent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_timeShiftPlay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_timeShiftPause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_timeShiftResume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_timeShiftSeekTo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_timeShiftSetPlaybackParams = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_timeShiftEnablePositionTracking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_startRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_stopRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
}
public void release() throws android.os.RemoteException;
public void setMain(boolean isMain) throws android.os.RemoteException;
public void setSurface(android.view.Surface surface) throws android.os.RemoteException;
public void dispatchSurfaceChanged(int format, int width, int height) throws android.os.RemoteException;
// TODO: Remove this once it becomes irrelevant for applications to handle audio focus. The plan
// is to introduce some new concepts that will solve a number of problems in audio policy today.

public void setVolume(float volume) throws android.os.RemoteException;
public void tune(android.net.Uri channelUri, android.os.Bundle params) throws android.os.RemoteException;
public void setCaptionEnabled(boolean enabled) throws android.os.RemoteException;
public void selectTrack(int type, java.lang.String trackId) throws android.os.RemoteException;
public void appPrivateCommand(java.lang.String action, android.os.Bundle data) throws android.os.RemoteException;
public void createOverlayView(android.os.IBinder windowToken, android.graphics.Rect frame) throws android.os.RemoteException;
public void relayoutOverlayView(android.graphics.Rect frame) throws android.os.RemoteException;
public void removeOverlayView() throws android.os.RemoteException;
public void unblockContent(java.lang.String unblockedRating) throws android.os.RemoteException;
public void timeShiftPlay(android.net.Uri recordedProgramUri) throws android.os.RemoteException;
public void timeShiftPause() throws android.os.RemoteException;
public void timeShiftResume() throws android.os.RemoteException;
public void timeShiftSeekTo(long timeMs) throws android.os.RemoteException;
public void timeShiftSetPlaybackParams(android.media.PlaybackParams params) throws android.os.RemoteException;
public void timeShiftEnablePositionTracking(boolean enable) throws android.os.RemoteException;
// For the recording session

public void startRecording(android.net.Uri programUri) throws android.os.RemoteException;
public void stopRecording() throws android.os.RemoteException;
}
