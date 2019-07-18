/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/IPlayer.aidl
 */
package android.media;
/**
 * @hide
 */
public interface IPlayer extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.IPlayer
{
private static final java.lang.String DESCRIPTOR = "android.media.IPlayer";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.IPlayer interface,
 * generating a proxy if needed.
 */
public static android.media.IPlayer asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.IPlayer))) {
return ((android.media.IPlayer)iin);
}
return new android.media.IPlayer.Stub.Proxy(obj);
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
case TRANSACTION_start:
{
data.enforceInterface(DESCRIPTOR);
this.start();
return true;
}
case TRANSACTION_pause:
{
data.enforceInterface(DESCRIPTOR);
this.pause();
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
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
case TRANSACTION_setPan:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.setPan(_arg0);
return true;
}
case TRANSACTION_setStartDelayMs:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setStartDelayMs(_arg0);
return true;
}
case TRANSACTION_applyVolumeShaper:
{
data.enforceInterface(DESCRIPTOR);
android.media.VolumeShaper.Configuration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.media.VolumeShaper.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.media.VolumeShaper.Operation _arg1;
if ((0!=data.readInt())) {
_arg1 = android.media.VolumeShaper.Operation.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.applyVolumeShaper(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.IPlayer
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
@Override public void start() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_start, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void pause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pause, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setVolume(float vol) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(vol);
mRemote.transact(Stub.TRANSACTION_setVolume, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setPan(float pan) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(pan);
mRemote.transact(Stub.TRANSACTION_setPan, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setStartDelayMs(int delayMs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(delayMs);
mRemote.transact(Stub.TRANSACTION_setStartDelayMs, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void applyVolumeShaper(android.media.VolumeShaper.Configuration configuration, android.media.VolumeShaper.Operation operation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((configuration!=null)) {
_data.writeInt(1);
configuration.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((operation!=null)) {
_data.writeInt(1);
operation.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_applyVolumeShaper, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setPan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setStartDelayMs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_applyVolumeShaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void start() throws android.os.RemoteException;
public void pause() throws android.os.RemoteException;
public void stop() throws android.os.RemoteException;
public void setVolume(float vol) throws android.os.RemoteException;
public void setPan(float pan) throws android.os.RemoteException;
public void setStartDelayMs(int delayMs) throws android.os.RemoteException;
public void applyVolumeShaper(android.media.VolumeShaper.Configuration configuration, android.media.VolumeShaper.Operation operation) throws android.os.RemoteException;
}
