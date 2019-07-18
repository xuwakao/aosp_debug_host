/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../av/camera/aidl/android/hardware/camera2/ICameraDeviceCallbacks.aidl
 */
package android.hardware.camera2;
/** @hide */
public interface ICameraDeviceCallbacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraDeviceCallbacks
{
private static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraDeviceCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.camera2.ICameraDeviceCallbacks interface,
 * generating a proxy if needed.
 */
public static android.hardware.camera2.ICameraDeviceCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.camera2.ICameraDeviceCallbacks))) {
return ((android.hardware.camera2.ICameraDeviceCallbacks)iin);
}
return new android.hardware.camera2.ICameraDeviceCallbacks.Stub.Proxy(obj);
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
case TRANSACTION_onDeviceError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.impl.CaptureResultExtras _arg1;
if ((0!=data.readInt())) {
_arg1 = android.hardware.camera2.impl.CaptureResultExtras.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onDeviceError(_arg0, _arg1);
return true;
}
case TRANSACTION_onDeviceIdle:
{
data.enforceInterface(DESCRIPTOR);
this.onDeviceIdle();
return true;
}
case TRANSACTION_onCaptureStarted:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.impl.CaptureResultExtras _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.camera2.impl.CaptureResultExtras.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
this.onCaptureStarted(_arg0, _arg1);
return true;
}
case TRANSACTION_onResultReceived:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.impl.CameraMetadataNative _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.camera2.impl.CameraMetadataNative.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.hardware.camera2.impl.CaptureResultExtras _arg1;
if ((0!=data.readInt())) {
_arg1 = android.hardware.camera2.impl.CaptureResultExtras.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onResultReceived(_arg0, _arg1);
return true;
}
case TRANSACTION_onPrepared:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onPrepared(_arg0);
return true;
}
case TRANSACTION_onRepeatingRequestError:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.onRepeatingRequestError(_arg0, _arg1);
return true;
}
case TRANSACTION_onRequestQueueEmpty:
{
data.enforceInterface(DESCRIPTOR);
this.onRequestQueueEmpty();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.camera2.ICameraDeviceCallbacks
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
@Override public void onDeviceError(int errorCode, android.hardware.camera2.impl.CaptureResultExtras resultExtras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorCode);
if ((resultExtras!=null)) {
_data.writeInt(1);
resultExtras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onDeviceError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDeviceIdle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDeviceIdle, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras resultExtras, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((resultExtras!=null)) {
_data.writeInt(1);
resultExtras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_onCaptureStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onResultReceived(android.hardware.camera2.impl.CameraMetadataNative result, android.hardware.camera2.impl.CaptureResultExtras resultExtras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((resultExtras!=null)) {
_data.writeInt(1);
resultExtras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onResultReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPrepared(int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_onPrepared, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Repeating request encountered an error and was stopped.
     *
     * @param lastFrameNumber Frame number of the last frame of the streaming request.
     * @param repeatingRequestId the ID of the repeating request being stopped
     */
@Override public void onRepeatingRequestError(long lastFrameNumber, int repeatingRequestId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(lastFrameNumber);
_data.writeInt(repeatingRequestId);
mRemote.transact(Stub.TRANSACTION_onRepeatingRequestError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRequestQueueEmpty() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onRequestQueueEmpty, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onDeviceError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onDeviceIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onCaptureStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onResultReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onPrepared = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onRepeatingRequestError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onRequestQueueEmpty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public static final int ERROR_CAMERA_INVALID_ERROR = -1;
public static final int ERROR_CAMERA_DISCONNECTED = 0;
public static final int ERROR_CAMERA_DEVICE = 1;
public static final int ERROR_CAMERA_SERVICE = 2;
public static final int ERROR_CAMERA_REQUEST = 3;
public static final int ERROR_CAMERA_RESULT = 4;
public static final int ERROR_CAMERA_BUFFER = 5;
public void onDeviceError(int errorCode, android.hardware.camera2.impl.CaptureResultExtras resultExtras) throws android.os.RemoteException;
public void onDeviceIdle() throws android.os.RemoteException;
public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras resultExtras, long timestamp) throws android.os.RemoteException;
public void onResultReceived(android.hardware.camera2.impl.CameraMetadataNative result, android.hardware.camera2.impl.CaptureResultExtras resultExtras) throws android.os.RemoteException;
public void onPrepared(int streamId) throws android.os.RemoteException;
/**
     * Repeating request encountered an error and was stopped.
     *
     * @param lastFrameNumber Frame number of the last frame of the streaming request.
     * @param repeatingRequestId the ID of the repeating request being stopped
     */
public void onRepeatingRequestError(long lastFrameNumber, int repeatingRequestId) throws android.os.RemoteException;
public void onRequestQueueEmpty() throws android.os.RemoteException;
}
