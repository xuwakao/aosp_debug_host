/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/vr/IVrManager.aidl
 */
package android.service.vr;
/** @hide */
public interface IVrManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.vr.IVrManager
{
private static final java.lang.String DESCRIPTOR = "android.service.vr.IVrManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.vr.IVrManager interface,
 * generating a proxy if needed.
 */
public static android.service.vr.IVrManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.vr.IVrManager))) {
return ((android.service.vr.IVrManager)iin);
}
return new android.service.vr.IVrManager.Stub.Proxy(obj);
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
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.vr.IVrStateCallbacks _arg0;
_arg0 = android.service.vr.IVrStateCallbacks.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.vr.IVrStateCallbacks _arg0;
_arg0 = android.service.vr.IVrStateCallbacks.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerPersistentVrStateListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.vr.IPersistentVrStateCallbacks _arg0;
_arg0 = android.service.vr.IPersistentVrStateCallbacks.Stub.asInterface(data.readStrongBinder());
this.registerPersistentVrStateListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterPersistentVrStateListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.vr.IPersistentVrStateCallbacks _arg0;
_arg0 = android.service.vr.IPersistentVrStateCallbacks.Stub.asInterface(data.readStrongBinder());
this.unregisterPersistentVrStateListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getVrModeState:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getVrModeState();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPersistentVrModeEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getPersistentVrModeEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPersistentVrModeEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setPersistentVrModeEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setVr2dDisplayProperties:
{
data.enforceInterface(DESCRIPTOR);
android.app.Vr2dDisplayProperties _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.Vr2dDisplayProperties.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setVr2dDisplayProperties(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getVr2dDisplayId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getVr2dDisplayId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAndBindCompositor:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setAndBindCompositor(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.vr.IVrManager
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
     * Add a callback to be notified when VR mode state changes.
     *
     * @param cb the callback instance to add.
     */
@Override public void registerListener(android.service.vr.IVrStateCallbacks cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Remove the callack from the current set of registered callbacks.
     *
     * @param cb the callback to remove.
     */
@Override public void unregisterListener(android.service.vr.IVrStateCallbacks cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Add a callback to be notified when persistent VR mode state changes.
     *
     * @param cb the callback instance to add.
     */
@Override public void registerPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerPersistentVrStateListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Remove the callack from the current set of registered callbacks.
     *
     * @param cb the callback to remove.
     */
@Override public void unregisterPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterPersistentVrStateListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Return current VR mode state.
     *
     * @return {@code true} if VR mode is enabled.
     */
@Override public boolean getVrModeState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVrModeState, _data, _reply, 0);
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
     * Returns the current Persistent VR mode state.
     *
     * @return {@code true} if Persistent VR mode is enabled.
     */
@Override public boolean getPersistentVrModeEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPersistentVrModeEnabled, _data, _reply, 0);
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
     * Sets the persistent VR mode state of a device. When a device is in persistent VR mode it will
     * remain in VR mode even if the foreground does not specify VR mode being enabled. Mainly used
     * by VR viewers to indicate that a device is placed in a VR viewer.
     *
     * @param enabled true if the device should be placed in persistent VR mode.
     */
@Override public void setPersistentVrModeEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPersistentVrModeEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sets the resolution and DPI of the vr2d virtual display used to display
     * 2D applications in VR mode.
     *
     * <p>Requires {@link android.Manifest.permission#ACCESS_VR_MANAGER} permission.</p>
     *
     * @param vr2dDisplayProperties Vr2d display properties to be set for
     * the VR virtual display
     */
@Override public void setVr2dDisplayProperties(android.app.Vr2dDisplayProperties vr2dDisplayProperties) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((vr2dDisplayProperties!=null)) {
_data.writeInt(1);
vr2dDisplayProperties.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setVr2dDisplayProperties, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getVr2dDisplayId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVr2dDisplayId, _data, _reply, 0);
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
     * Set the component name of the compositor service to bind.
     *
     * @param componentName flattened string representing a ComponentName of a Service in the
     * application's compositor process to bind to, or null to clear the current binding.
     */
@Override public void setAndBindCompositor(java.lang.String componentName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(componentName);
mRemote.transact(Stub.TRANSACTION_setAndBindCompositor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerPersistentVrStateListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_unregisterPersistentVrStateListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getVrModeState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPersistentVrModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setPersistentVrModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setVr2dDisplayProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getVr2dDisplayId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setAndBindCompositor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
/**
     * Add a callback to be notified when VR mode state changes.
     *
     * @param cb the callback instance to add.
     */
public void registerListener(android.service.vr.IVrStateCallbacks cb) throws android.os.RemoteException;
/**
     * Remove the callack from the current set of registered callbacks.
     *
     * @param cb the callback to remove.
     */
public void unregisterListener(android.service.vr.IVrStateCallbacks cb) throws android.os.RemoteException;
/**
     * Add a callback to be notified when persistent VR mode state changes.
     *
     * @param cb the callback instance to add.
     */
public void registerPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks cb) throws android.os.RemoteException;
/**
     * Remove the callack from the current set of registered callbacks.
     *
     * @param cb the callback to remove.
     */
public void unregisterPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks cb) throws android.os.RemoteException;
/**
     * Return current VR mode state.
     *
     * @return {@code true} if VR mode is enabled.
     */
public boolean getVrModeState() throws android.os.RemoteException;
/**
     * Returns the current Persistent VR mode state.
     *
     * @return {@code true} if Persistent VR mode is enabled.
     */
public boolean getPersistentVrModeEnabled() throws android.os.RemoteException;
/**
     * Sets the persistent VR mode state of a device. When a device is in persistent VR mode it will
     * remain in VR mode even if the foreground does not specify VR mode being enabled. Mainly used
     * by VR viewers to indicate that a device is placed in a VR viewer.
     *
     * @param enabled true if the device should be placed in persistent VR mode.
     */
public void setPersistentVrModeEnabled(boolean enabled) throws android.os.RemoteException;
/**
     * Sets the resolution and DPI of the vr2d virtual display used to display
     * 2D applications in VR mode.
     *
     * <p>Requires {@link android.Manifest.permission#ACCESS_VR_MANAGER} permission.</p>
     *
     * @param vr2dDisplayProperties Vr2d display properties to be set for
     * the VR virtual display
     */
public void setVr2dDisplayProperties(android.app.Vr2dDisplayProperties vr2dDisplayProperties) throws android.os.RemoteException;
public int getVr2dDisplayId() throws android.os.RemoteException;
/**
     * Set the component name of the compositor service to bind.
     *
     * @param componentName flattened string representing a ComponentName of a Service in the
     * application's compositor process to bind to, or null to clear the current binding.
     */
public void setAndBindCompositor(java.lang.String componentName) throws android.os.RemoteException;
}
