/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../av/camera/aidl/android/hardware/camera2/ICameraDeviceUser.aidl
 */
package android.hardware.camera2;
/** @hide */
public interface ICameraDeviceUser extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraDeviceUser
{
private static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraDeviceUser";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.camera2.ICameraDeviceUser interface,
 * generating a proxy if needed.
 */
public static android.hardware.camera2.ICameraDeviceUser asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.camera2.ICameraDeviceUser))) {
return ((android.hardware.camera2.ICameraDeviceUser)iin);
}
return new android.hardware.camera2.ICameraDeviceUser.Stub.Proxy(obj);
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
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
this.disconnect();
reply.writeNoException();
return true;
}
case TRANSACTION_submitRequest:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.CaptureRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.camera2.CaptureRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
android.hardware.camera2.utils.SubmitInfo _result = this.submitRequest(_arg0, _arg1);
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
case TRANSACTION_submitRequestList:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.CaptureRequest[] _arg0;
_arg0 = data.createTypedArray(android.hardware.camera2.CaptureRequest.CREATOR);
boolean _arg1;
_arg1 = (0!=data.readInt());
android.hardware.camera2.utils.SubmitInfo _result = this.submitRequestList(_arg0, _arg1);
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
case TRANSACTION_cancelRequest:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _result = this.cancelRequest(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_beginConfigure:
{
data.enforceInterface(DESCRIPTOR);
this.beginConfigure();
reply.writeNoException();
return true;
}
case TRANSACTION_endConfigure:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.endConfigure(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteStream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.deleteStream(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createStream:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.params.OutputConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.camera2.params.OutputConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.createStream(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createInputStream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _result = this.createInputStream(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getInputSurface:
{
data.enforceInterface(DESCRIPTOR);
android.view.Surface _result = this.getInputSurface();
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
case TRANSACTION_createDefaultRequest:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.impl.CameraMetadataNative _result = this.createDefaultRequest(_arg0);
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
case TRANSACTION_getCameraInfo:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.impl.CameraMetadataNative _result = this.getCameraInfo();
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
case TRANSACTION_waitUntilIdle:
{
data.enforceInterface(DESCRIPTOR);
this.waitUntilIdle();
reply.writeNoException();
return true;
}
case TRANSACTION_flush:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.flush();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_prepare:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.prepare(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_tearDown:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.tearDown(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_prepare2:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.prepare2(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_finalizeOutputConfigurations:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.params.OutputConfiguration _arg1;
if ((0!=data.readInt())) {
_arg1 = android.hardware.camera2.params.OutputConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.finalizeOutputConfigurations(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.camera2.ICameraDeviceUser
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
@Override public void disconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.hardware.camera2.utils.SubmitInfo submitRequest(android.hardware.camera2.CaptureRequest request, boolean streaming) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.camera2.utils.SubmitInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((streaming)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_submitRequest, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.camera2.utils.SubmitInfo.CREATOR.createFromParcel(_reply);
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
@Override public android.hardware.camera2.utils.SubmitInfo submitRequestList(android.hardware.camera2.CaptureRequest[] requestList, boolean streaming) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.camera2.utils.SubmitInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(requestList, 0);
_data.writeInt(((streaming)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_submitRequestList, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.camera2.utils.SubmitInfo.CREATOR.createFromParcel(_reply);
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
     * Cancel the repeating request specified by requestId
     * Returns the frame number of the last frame that will be produced from this
     * repeating request, or NO_IN_FLIGHT_REPEATING_FRAMES if no frames were produced
     * by this repeating request.
     *
     * Repeating request may be stopped by camera device due to an error. Canceling a stopped
     * repeating request will trigger ERROR_ILLEGAL_ARGUMENT.
     */
@Override public long cancelRequest(int requestId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(requestId);
mRemote.transact(Stub.TRANSACTION_cancelRequest, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Begin the device configuration.
     *
     * <p>
     * beginConfigure must be called before any call to deleteStream, createStream,
     * or endConfigure.  It is not valid to call this when the device is not idle.
     * <p>
     */
@Override public void beginConfigure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_beginConfigure, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * End the device configuration.
     *
     * <p>
     * endConfigure must be called after stream configuration is complete (i.e. after
     * a call to beginConfigure and subsequent createStream/deleteStream calls).  This
     * must be called before any requests can be submitted.
     * <p>
     * @param operatingMode The kind of session to create; either NORMAL_MODE or
     *     CONSTRAINED_HIGH_SPEED_MODE. Must be a non-negative value.
     */
@Override public void endConfigure(int operatingMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(operatingMode);
mRemote.transact(Stub.TRANSACTION_endConfigure, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteStream(int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_deleteStream, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int createStream(android.hardware.camera2.params.OutputConfiguration outputConfiguration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((outputConfiguration!=null)) {
_data.writeInt(1);
outputConfiguration.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createStream, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int createInputStream(int width, int height, int format) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(format);
mRemote.transact(Stub.TRANSACTION_createInputStream, _data, _reply, 0);
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
     * Get the surface of the input stream.
     *
     * <p>It's valid to call this method only after a stream configuration is completed
     * successfully and the stream configuration includes a input stream.</p>
     *
     * @param surface An output argument for the surface of the input stream buffer queue.
     */
@Override public android.view.Surface getInputSurface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.Surface _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getInputSurface, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.view.Surface.CREATOR.createFromParcel(_reply);
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
@Override public android.hardware.camera2.impl.CameraMetadataNative createDefaultRequest(int templateId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.camera2.impl.CameraMetadataNative _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(templateId);
mRemote.transact(Stub.TRANSACTION_createDefaultRequest, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.camera2.impl.CameraMetadataNative.CREATOR.createFromParcel(_reply);
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
@Override public android.hardware.camera2.impl.CameraMetadataNative getCameraInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.camera2.impl.CameraMetadataNative _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCameraInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.camera2.impl.CameraMetadataNative.CREATOR.createFromParcel(_reply);
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
@Override public void waitUntilIdle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_waitUntilIdle, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long flush() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_flush, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void prepare(int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_prepare, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void tearDown(int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_tearDown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void prepare2(int maxCount, int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(maxCount);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_prepare2, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void finalizeOutputConfigurations(int streamId, android.hardware.camera2.params.OutputConfiguration outputConfiguration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
if ((outputConfiguration!=null)) {
_data.writeInt(1);
outputConfiguration.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_finalizeOutputConfigurations, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_submitRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_submitRequestList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancelRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_beginConfigure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_endConfigure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_deleteStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_createStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_createInputStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getInputSurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_createDefaultRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getCameraInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_waitUntilIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_flush = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_prepare = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_tearDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_prepare2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_finalizeOutputConfigurations = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
public static final int NO_IN_FLIGHT_REPEATING_FRAMES = -1;
public static final int NORMAL_MODE = 0;
public static final int CONSTRAINED_HIGH_SPEED_MODE = 1;
public static final int VENDOR_MODE_START = 32768;
public static final int TEMPLATE_PREVIEW = 1;
public static final int TEMPLATE_STILL_CAPTURE = 2;
public static final int TEMPLATE_RECORD = 3;
public static final int TEMPLATE_VIDEO_SNAPSHOT = 4;
public static final int TEMPLATE_ZERO_SHUTTER_LAG = 5;
public static final int TEMPLATE_MANUAL = 6;
public void disconnect() throws android.os.RemoteException;
public android.hardware.camera2.utils.SubmitInfo submitRequest(android.hardware.camera2.CaptureRequest request, boolean streaming) throws android.os.RemoteException;
public android.hardware.camera2.utils.SubmitInfo submitRequestList(android.hardware.camera2.CaptureRequest[] requestList, boolean streaming) throws android.os.RemoteException;
/**
     * Cancel the repeating request specified by requestId
     * Returns the frame number of the last frame that will be produced from this
     * repeating request, or NO_IN_FLIGHT_REPEATING_FRAMES if no frames were produced
     * by this repeating request.
     *
     * Repeating request may be stopped by camera device due to an error. Canceling a stopped
     * repeating request will trigger ERROR_ILLEGAL_ARGUMENT.
     */
public long cancelRequest(int requestId) throws android.os.RemoteException;
/**
     * Begin the device configuration.
     *
     * <p>
     * beginConfigure must be called before any call to deleteStream, createStream,
     * or endConfigure.  It is not valid to call this when the device is not idle.
     * <p>
     */
public void beginConfigure() throws android.os.RemoteException;
/**
     * End the device configuration.
     *
     * <p>
     * endConfigure must be called after stream configuration is complete (i.e. after
     * a call to beginConfigure and subsequent createStream/deleteStream calls).  This
     * must be called before any requests can be submitted.
     * <p>
     * @param operatingMode The kind of session to create; either NORMAL_MODE or
     *     CONSTRAINED_HIGH_SPEED_MODE. Must be a non-negative value.
     */
public void endConfigure(int operatingMode) throws android.os.RemoteException;
public void deleteStream(int streamId) throws android.os.RemoteException;
public int createStream(android.hardware.camera2.params.OutputConfiguration outputConfiguration) throws android.os.RemoteException;
public int createInputStream(int width, int height, int format) throws android.os.RemoteException;
/**
     * Get the surface of the input stream.
     *
     * <p>It's valid to call this method only after a stream configuration is completed
     * successfully and the stream configuration includes a input stream.</p>
     *
     * @param surface An output argument for the surface of the input stream buffer queue.
     */
public android.view.Surface getInputSurface() throws android.os.RemoteException;
public android.hardware.camera2.impl.CameraMetadataNative createDefaultRequest(int templateId) throws android.os.RemoteException;
public android.hardware.camera2.impl.CameraMetadataNative getCameraInfo() throws android.os.RemoteException;
public void waitUntilIdle() throws android.os.RemoteException;
public long flush() throws android.os.RemoteException;
public void prepare(int streamId) throws android.os.RemoteException;
public void tearDown(int streamId) throws android.os.RemoteException;
public void prepare2(int maxCount, int streamId) throws android.os.RemoteException;
public void finalizeOutputConfigurations(int streamId, android.hardware.camera2.params.OutputConfiguration outputConfiguration) throws android.os.RemoteException;
}
