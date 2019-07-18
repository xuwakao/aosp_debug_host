/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../av/camera/aidl/android/hardware/ICameraService.aidl
 */
package android.hardware;
/**
 * Binder interface for the native camera service running in mediaserver.
 *
 * @hide
 */
public interface ICameraService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.ICameraService
{
private static final java.lang.String DESCRIPTOR = "android.hardware.ICameraService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.ICameraService interface,
 * generating a proxy if needed.
 */
public static android.hardware.ICameraService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.ICameraService))) {
return ((android.hardware.ICameraService)iin);
}
return new android.hardware.ICameraService.Stub.Proxy(obj);
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
case TRANSACTION_getNumberOfCameras:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getNumberOfCameras(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCameraInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.CameraInfo _result = this.getCameraInfo(_arg0);
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
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.ICameraClient _arg0;
_arg0 = android.hardware.ICameraClient.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
android.hardware.ICamera _result = this.connect(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_connectDevice:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.ICameraDeviceCallbacks _arg0;
_arg0 = android.hardware.camera2.ICameraDeviceCallbacks.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
android.hardware.camera2.ICameraDeviceUser _result = this.connectDevice(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_connectLegacy:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.ICameraClient _arg0;
_arg0 = android.hardware.ICameraClient.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
android.hardware.ICamera _result = this.connectLegacy(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_addListener:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.ICameraServiceListener _arg0;
_arg0 = android.hardware.ICameraServiceListener.Stub.asInterface(data.readStrongBinder());
android.hardware.CameraStatus[] _result = this.addListener(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_removeListener:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.ICameraServiceListener _arg0;
_arg0 = android.hardware.ICameraServiceListener.Stub.asInterface(data.readStrongBinder());
this.removeListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCameraCharacteristics:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.hardware.camera2.impl.CameraMetadataNative _result = this.getCameraCharacteristics(_arg0);
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
case TRANSACTION_getCameraVendorTagDescriptor:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.params.VendorTagDescriptor _result = this.getCameraVendorTagDescriptor();
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
case TRANSACTION_getCameraVendorTagCache:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.params.VendorTagDescriptorCache _result = this.getCameraVendorTagCache();
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
case TRANSACTION_getLegacyParameters:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getLegacyParameters(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_supportsCameraApi:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.supportsCameraApi(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setTorchMode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
this.setTorchMode(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_notifySystemEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
this.notifySystemEvent(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.ICameraService
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
@Override public int getNumberOfCameras(int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_getNumberOfCameras, _data, _reply, 0);
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
     * Fetch basic camera information for a camera device
     */
@Override public android.hardware.CameraInfo getCameraInfo(int cameraId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.CameraInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraId);
mRemote.transact(Stub.TRANSACTION_getCameraInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.CameraInfo.CREATOR.createFromParcel(_reply);
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
     * Open a camera device through the old camera API
     */
@Override public android.hardware.ICamera connect(android.hardware.ICameraClient client, int cameraId, java.lang.String opPackageName, int clientUid, int clientPid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.ICamera _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
_data.writeInt(cameraId);
_data.writeString(opPackageName);
_data.writeInt(clientUid);
_data.writeInt(clientPid);
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
_result = android.hardware.ICamera.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Open a camera device through the new camera API
     * Only supported for device HAL versions >= 3.2
     */
@Override public android.hardware.camera2.ICameraDeviceUser connectDevice(android.hardware.camera2.ICameraDeviceCallbacks callbacks, java.lang.String cameraId, java.lang.String opPackageName, int clientUid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.camera2.ICameraDeviceUser _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callbacks!=null))?(callbacks.asBinder()):(null)));
_data.writeString(cameraId);
_data.writeString(opPackageName);
_data.writeInt(clientUid);
mRemote.transact(Stub.TRANSACTION_connectDevice, _data, _reply, 0);
_reply.readException();
_result = android.hardware.camera2.ICameraDeviceUser.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Open a camera device in legacy mode, if supported by the camera module HAL.
     */
@Override public android.hardware.ICamera connectLegacy(android.hardware.ICameraClient client, int cameraId, int halVersion, java.lang.String opPackageName, int clientUid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.ICamera _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
_data.writeInt(cameraId);
_data.writeInt(halVersion);
_data.writeString(opPackageName);
_data.writeInt(clientUid);
mRemote.transact(Stub.TRANSACTION_connectLegacy, _data, _reply, 0);
_reply.readException();
_result = android.hardware.ICamera.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add listener for changes to camera device and flashlight state.
     *
     * Also returns the set of currently-known camera IDs and state of each device.
     * Adding a listener will trigger the torch status listener to fire for all
     * devices that have a flash unit
     */
@Override public android.hardware.CameraStatus[] addListener(android.hardware.ICameraServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.CameraStatus[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addListener, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.hardware.CameraStatus.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Remove listener for changes to camera device and flashlight state.
     */
@Override public void removeListener(android.hardware.ICameraServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Read the static camera metadata for a camera device.
     * Only supported for device HAL versions >= 3.2
     */
@Override public android.hardware.camera2.impl.CameraMetadataNative getCameraCharacteristics(java.lang.String cameraId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.camera2.impl.CameraMetadataNative _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(cameraId);
mRemote.transact(Stub.TRANSACTION_getCameraCharacteristics, _data, _reply, 0);
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
/**
     * Read in the vendor tag descriptors from the camera module HAL.
     * Intended to be used by the native code of CameraMetadataNative to correctly
     * interpret camera metadata with vendor tags.
     */
@Override public android.hardware.camera2.params.VendorTagDescriptor getCameraVendorTagDescriptor() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.camera2.params.VendorTagDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCameraVendorTagDescriptor, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.camera2.params.VendorTagDescriptor.CREATOR.createFromParcel(_reply);
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
     * Retrieve the vendor tag descriptor cache which can have multiple vendor
     * providers.
     * Intended to be used by the native code of CameraMetadataNative to correctly
     * interpret camera metadata with vendor tags.
     */
@Override public android.hardware.camera2.params.VendorTagDescriptorCache getCameraVendorTagCache() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.camera2.params.VendorTagDescriptorCache _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCameraVendorTagCache, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.camera2.params.VendorTagDescriptorCache.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String getLegacyParameters(int cameraId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraId);
mRemote.transact(Stub.TRANSACTION_getLegacyParameters, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Determines if a particular API version is supported directly

@Override public boolean supportsCameraApi(java.lang.String cameraId, int apiVersion) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(cameraId);
_data.writeInt(apiVersion);
mRemote.transact(Stub.TRANSACTION_supportsCameraApi, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setTorchMode(java.lang.String cameraId, boolean enabled, android.os.IBinder clientBinder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(cameraId);
_data.writeInt(((enabled)?(1):(0)));
_data.writeStrongBinder(clientBinder);
mRemote.transact(Stub.TRANSACTION_setTorchMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifySystemEvent(int eventId, int[] args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(eventId);
_data.writeIntArray(args);
mRemote.transact(Stub.TRANSACTION_notifySystemEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getNumberOfCameras = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCameraInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_connectDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_connectLegacy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_addListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_removeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getCameraCharacteristics = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getCameraVendorTagDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getCameraVendorTagCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getLegacyParameters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_supportsCameraApi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setTorchMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_notifySystemEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
public static final int ERROR_PERMISSION_DENIED = 1;
public static final int ERROR_ALREADY_EXISTS = 2;
public static final int ERROR_ILLEGAL_ARGUMENT = 3;
public static final int ERROR_DISCONNECTED = 4;
public static final int ERROR_TIMED_OUT = 5;
public static final int ERROR_DISABLED = 6;
public static final int ERROR_CAMERA_IN_USE = 7;
public static final int ERROR_MAX_CAMERAS_IN_USE = 8;
public static final int ERROR_DEPRECATED_HAL = 9;
public static final int ERROR_INVALID_OPERATION = 10;
public static final int CAMERA_TYPE_BACKWARD_COMPATIBLE = 0;
public static final int CAMERA_TYPE_ALL = 1;
public static final int USE_CALLING_UID = -1;
public static final int USE_CALLING_PID = -1;
public static final int CAMERA_HAL_API_VERSION_UNSPECIFIED = -1;
public static final int API_VERSION_1 = 1;
public static final int API_VERSION_2 = 2;
public static final int EVENT_NONE = 0;
public static final int EVENT_USER_SWITCHED = 1;
public int getNumberOfCameras(int type) throws android.os.RemoteException;
/**
     * Fetch basic camera information for a camera device
     */
public android.hardware.CameraInfo getCameraInfo(int cameraId) throws android.os.RemoteException;
/**
     * Open a camera device through the old camera API
     */
public android.hardware.ICamera connect(android.hardware.ICameraClient client, int cameraId, java.lang.String opPackageName, int clientUid, int clientPid) throws android.os.RemoteException;
/**
     * Open a camera device through the new camera API
     * Only supported for device HAL versions >= 3.2
     */
public android.hardware.camera2.ICameraDeviceUser connectDevice(android.hardware.camera2.ICameraDeviceCallbacks callbacks, java.lang.String cameraId, java.lang.String opPackageName, int clientUid) throws android.os.RemoteException;
/**
     * Open a camera device in legacy mode, if supported by the camera module HAL.
     */
public android.hardware.ICamera connectLegacy(android.hardware.ICameraClient client, int cameraId, int halVersion, java.lang.String opPackageName, int clientUid) throws android.os.RemoteException;
/**
     * Add listener for changes to camera device and flashlight state.
     *
     * Also returns the set of currently-known camera IDs and state of each device.
     * Adding a listener will trigger the torch status listener to fire for all
     * devices that have a flash unit
     */
public android.hardware.CameraStatus[] addListener(android.hardware.ICameraServiceListener listener) throws android.os.RemoteException;
/**
     * Remove listener for changes to camera device and flashlight state.
     */
public void removeListener(android.hardware.ICameraServiceListener listener) throws android.os.RemoteException;
/**
     * Read the static camera metadata for a camera device.
     * Only supported for device HAL versions >= 3.2
     */
public android.hardware.camera2.impl.CameraMetadataNative getCameraCharacteristics(java.lang.String cameraId) throws android.os.RemoteException;
/**
     * Read in the vendor tag descriptors from the camera module HAL.
     * Intended to be used by the native code of CameraMetadataNative to correctly
     * interpret camera metadata with vendor tags.
     */
public android.hardware.camera2.params.VendorTagDescriptor getCameraVendorTagDescriptor() throws android.os.RemoteException;
/**
     * Retrieve the vendor tag descriptor cache which can have multiple vendor
     * providers.
     * Intended to be used by the native code of CameraMetadataNative to correctly
     * interpret camera metadata with vendor tags.
     */
public android.hardware.camera2.params.VendorTagDescriptorCache getCameraVendorTagCache() throws android.os.RemoteException;
public java.lang.String getLegacyParameters(int cameraId) throws android.os.RemoteException;
// Determines if a particular API version is supported directly

public boolean supportsCameraApi(java.lang.String cameraId, int apiVersion) throws android.os.RemoteException;
public void setTorchMode(java.lang.String cameraId, boolean enabled, android.os.IBinder clientBinder) throws android.os.RemoteException;
public void notifySystemEvent(int eventId, int[] args) throws android.os.RemoteException;
}
