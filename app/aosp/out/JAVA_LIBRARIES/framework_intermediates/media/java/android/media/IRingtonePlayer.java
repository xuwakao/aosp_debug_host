/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/IRingtonePlayer.aidl
 */
package android.media;
/**
 * @hide
 */
public interface IRingtonePlayer extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.IRingtonePlayer
{
private static final java.lang.String DESCRIPTOR = "android.media.IRingtonePlayer";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.IRingtonePlayer interface,
 * generating a proxy if needed.
 */
public static android.media.IRingtonePlayer asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.IRingtonePlayer))) {
return ((android.media.IRingtonePlayer)iin);
}
return new android.media.IRingtonePlayer.Stub.Proxy(obj);
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
case TRANSACTION_play:
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
android.media.AudioAttributes _arg2;
if ((0!=data.readInt())) {
_arg2 = android.media.AudioAttributes.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
float _arg3;
_arg3 = data.readFloat();
boolean _arg4;
_arg4 = (0!=data.readInt());
this.play(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.stop(_arg0);
return true;
}
case TRANSACTION_isPlaying:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _result = this.isPlaying(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPlaybackProperties:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
float _arg1;
_arg1 = data.readFloat();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPlaybackProperties(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_playAsync:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.UserHandle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.UserHandle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
android.media.AudioAttributes _arg3;
if ((0!=data.readInt())) {
_arg3 = android.media.AudioAttributes.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.playAsync(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_stopAsync:
{
data.enforceInterface(DESCRIPTOR);
this.stopAsync();
return true;
}
case TRANSACTION_getTitle:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.getTitle(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_openRingtone:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.ParcelFileDescriptor _result = this.openRingtone(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.IRingtonePlayer
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
/** Used for Ringtone.java playback */
@Override public void play(android.os.IBinder token, android.net.Uri uri, android.media.AudioAttributes aa, float volume, boolean looping) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((uri!=null)) {
_data.writeInt(1);
uri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((aa!=null)) {
_data.writeInt(1);
aa.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeFloat(volume);
_data.writeInt(((looping)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_play, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stop(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_stop, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public boolean isPlaying(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_isPlaying, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPlaybackProperties(android.os.IBinder token, float volume, boolean looping) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeFloat(volume);
_data.writeInt(((looping)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPlaybackProperties, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/** Used for Notification sound playback. */
@Override public void playAsync(android.net.Uri uri, android.os.UserHandle user, boolean looping, android.media.AudioAttributes aa) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((uri!=null)) {
_data.writeInt(1);
uri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((looping)?(1):(0)));
if ((aa!=null)) {
_data.writeInt(1);
aa.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_playAsync, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stopAsync() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopAsync, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public java.lang.String getTitle(android.net.Uri uri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((uri!=null)) {
_data.writeInt(1);
uri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getTitle, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.ParcelFileDescriptor openRingtone(android.net.Uri uri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((uri!=null)) {
_data.writeInt(1);
uri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_openRingtone, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_play = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isPlaying = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setPlaybackProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_playAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_stopAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getTitle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_openRingtone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
/** Used for Ringtone.java playback */
public void play(android.os.IBinder token, android.net.Uri uri, android.media.AudioAttributes aa, float volume, boolean looping) throws android.os.RemoteException;
public void stop(android.os.IBinder token) throws android.os.RemoteException;
public boolean isPlaying(android.os.IBinder token) throws android.os.RemoteException;
public void setPlaybackProperties(android.os.IBinder token, float volume, boolean looping) throws android.os.RemoteException;
/** Used for Notification sound playback. */
public void playAsync(android.net.Uri uri, android.os.UserHandle user, boolean looping, android.media.AudioAttributes aa) throws android.os.RemoteException;
public void stopAsync() throws android.os.RemoteException;
public java.lang.String getTitle(android.net.Uri uri) throws android.os.RemoteException;
public android.os.ParcelFileDescriptor openRingtone(android.net.Uri uri) throws android.os.RemoteException;
}
