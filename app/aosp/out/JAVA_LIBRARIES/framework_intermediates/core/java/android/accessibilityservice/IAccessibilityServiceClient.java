/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/accessibilityservice/IAccessibilityServiceClient.aidl
 */
package android.accessibilityservice;
/**
 * Top-level interface to an accessibility service component.
 *
 * @hide
 */
public interface IAccessibilityServiceClient extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.accessibilityservice.IAccessibilityServiceClient
{
private static final java.lang.String DESCRIPTOR = "android.accessibilityservice.IAccessibilityServiceClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.accessibilityservice.IAccessibilityServiceClient interface,
 * generating a proxy if needed.
 */
public static android.accessibilityservice.IAccessibilityServiceClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.accessibilityservice.IAccessibilityServiceClient))) {
return ((android.accessibilityservice.IAccessibilityServiceClient)iin);
}
return new android.accessibilityservice.IAccessibilityServiceClient.Stub.Proxy(obj);
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
case TRANSACTION_init:
{
data.enforceInterface(DESCRIPTOR);
android.accessibilityservice.IAccessibilityServiceConnection _arg0;
_arg0 = android.accessibilityservice.IAccessibilityServiceConnection.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
this.init(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onAccessibilityEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.accessibility.AccessibilityEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.accessibility.AccessibilityEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onAccessibilityEvent(_arg0, _arg1);
return true;
}
case TRANSACTION_onInterrupt:
{
data.enforceInterface(DESCRIPTOR);
this.onInterrupt();
return true;
}
case TRANSACTION_onGesture:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onGesture(_arg0);
return true;
}
case TRANSACTION_clearAccessibilityCache:
{
data.enforceInterface(DESCRIPTOR);
this.clearAccessibilityCache();
return true;
}
case TRANSACTION_onKeyEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.onKeyEvent(_arg0, _arg1);
return true;
}
case TRANSACTION_onMagnificationChanged:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Region _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Region.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
float _arg1;
_arg1 = data.readFloat();
float _arg2;
_arg2 = data.readFloat();
float _arg3;
_arg3 = data.readFloat();
this.onMagnificationChanged(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onSoftKeyboardShowModeChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSoftKeyboardShowModeChanged(_arg0);
return true;
}
case TRANSACTION_onPerformGestureResult:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onPerformGestureResult(_arg0, _arg1);
return true;
}
case TRANSACTION_onFingerprintCapturingGesturesChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onFingerprintCapturingGesturesChanged(_arg0);
return true;
}
case TRANSACTION_onFingerprintGesture:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onFingerprintGesture(_arg0);
return true;
}
case TRANSACTION_onAccessibilityButtonClicked:
{
data.enforceInterface(DESCRIPTOR);
this.onAccessibilityButtonClicked();
return true;
}
case TRANSACTION_onAccessibilityButtonAvailabilityChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onAccessibilityButtonAvailabilityChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.accessibilityservice.IAccessibilityServiceClient
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
@Override public void init(android.accessibilityservice.IAccessibilityServiceConnection connection, int connectionId, android.os.IBinder windowToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((connection!=null))?(connection.asBinder()):(null)));
_data.writeInt(connectionId);
_data.writeStrongBinder(windowToken);
mRemote.transact(Stub.TRANSACTION_init, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event, boolean serviceWantsEvent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((serviceWantsEvent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onAccessibilityEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onInterrupt() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onInterrupt, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onGesture(int gesture) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(gesture);
mRemote.transact(Stub.TRANSACTION_onGesture, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void clearAccessibilityCache() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearAccessibilityCache, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onKeyEvent(android.view.KeyEvent event, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_onKeyEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMagnificationChanged(android.graphics.Region region, float scale, float centerX, float centerY) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((region!=null)) {
_data.writeInt(1);
region.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeFloat(scale);
_data.writeFloat(centerX);
_data.writeFloat(centerY);
mRemote.transact(Stub.TRANSACTION_onMagnificationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSoftKeyboardShowModeChanged(int showMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(showMode);
mRemote.transact(Stub.TRANSACTION_onSoftKeyboardShowModeChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPerformGestureResult(int sequence, boolean completedSuccessfully) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sequence);
_data.writeInt(((completedSuccessfully)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onPerformGestureResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onFingerprintCapturingGesturesChanged(boolean capturing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((capturing)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onFingerprintCapturingGesturesChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onFingerprintGesture(int gesture) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(gesture);
mRemote.transact(Stub.TRANSACTION_onFingerprintGesture, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAccessibilityButtonClicked() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onAccessibilityButtonClicked, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAccessibilityButtonAvailabilityChanged(boolean available) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((available)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onAccessibilityButtonAvailabilityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_init = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onAccessibilityEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onInterrupt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onGesture = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_clearAccessibilityCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onKeyEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onMagnificationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onSoftKeyboardShowModeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onPerformGestureResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onFingerprintCapturingGesturesChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onFingerprintGesture = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onAccessibilityButtonClicked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_onAccessibilityButtonAvailabilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
}
public void init(android.accessibilityservice.IAccessibilityServiceConnection connection, int connectionId, android.os.IBinder windowToken) throws android.os.RemoteException;
public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event, boolean serviceWantsEvent) throws android.os.RemoteException;
public void onInterrupt() throws android.os.RemoteException;
public void onGesture(int gesture) throws android.os.RemoteException;
public void clearAccessibilityCache() throws android.os.RemoteException;
public void onKeyEvent(android.view.KeyEvent event, int sequence) throws android.os.RemoteException;
public void onMagnificationChanged(android.graphics.Region region, float scale, float centerX, float centerY) throws android.os.RemoteException;
public void onSoftKeyboardShowModeChanged(int showMode) throws android.os.RemoteException;
public void onPerformGestureResult(int sequence, boolean completedSuccessfully) throws android.os.RemoteException;
public void onFingerprintCapturingGesturesChanged(boolean capturing) throws android.os.RemoteException;
public void onFingerprintGesture(int gesture) throws android.os.RemoteException;
public void onAccessibilityButtonClicked() throws android.os.RemoteException;
public void onAccessibilityButtonAvailabilityChanged(boolean available) throws android.os.RemoteException;
}
