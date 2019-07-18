/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/IPinnedStackListener.aidl
 */
package android.view;
/**
 * Listener for changes to the pinned stack made by the WindowManager.
 *
 * @hide
 */
public interface IPinnedStackListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IPinnedStackListener
{
private static final java.lang.String DESCRIPTOR = "android.view.IPinnedStackListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IPinnedStackListener interface,
 * generating a proxy if needed.
 */
public static android.view.IPinnedStackListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IPinnedStackListener))) {
return ((android.view.IPinnedStackListener)iin);
}
return new android.view.IPinnedStackListener.Stub.Proxy(obj);
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
case TRANSACTION_onListenerRegistered:
{
data.enforceInterface(DESCRIPTOR);
android.view.IPinnedStackController _arg0;
_arg0 = android.view.IPinnedStackController.Stub.asInterface(data.readStrongBinder());
this.onListenerRegistered(_arg0);
return true;
}
case TRANSACTION_onMovementBoundsChanged:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Rect _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.graphics.Rect _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.graphics.Rect _arg2;
if ((0!=data.readInt())) {
_arg2 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
boolean _arg3;
_arg3 = (0!=data.readInt());
int _arg4;
_arg4 = data.readInt();
this.onMovementBoundsChanged(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_onImeVisibilityChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
this.onImeVisibilityChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onMinimizedStateChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onMinimizedStateChanged(_arg0);
return true;
}
case TRANSACTION_onActionsChanged:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ParceledListSlice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onActionsChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IPinnedStackListener
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
     * Called when the listener is registered and provides an interface to call back to the pinned
     * stack controller to update the controller of the pinned stack state.
     */
@Override public void onListenerRegistered(android.view.IPinnedStackController controller) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((controller!=null))?(controller.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onListenerRegistered, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the window manager has detected a change that would cause the movement bounds
     * to be changed (ie. after configuration change, aspect ratio change, etc). It then provides
     * the components that allow the listener to calculate the movement bounds itself. The
     * {@param normalBounds} are also the default bounds that the PiP would be entered in its
     * current state with the aspect ratio applied.  The {@param animatingBounds} are provided
     * to indicate the current target bounds of the pinned stack (the final bounds if animating,
     * the current bounds if not), which may be helpful in calculating dependent animation bounds.
     *
     * The {@param displayRotation} is provided so that the client can verify when making certain
     * calls that it will not provide stale information based on an old display rotation (ie. if
     * the WM has changed in the mean time but the client has not received onMovementBoundsChanged).
     */
@Override public void onMovementBoundsChanged(android.graphics.Rect insetBounds, android.graphics.Rect normalBounds, android.graphics.Rect animatingBounds, boolean fromImeAdjustement, int displayRotation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((insetBounds!=null)) {
_data.writeInt(1);
insetBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((normalBounds!=null)) {
_data.writeInt(1);
normalBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((animatingBounds!=null)) {
_data.writeInt(1);
animatingBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((fromImeAdjustement)?(1):(0)));
_data.writeInt(displayRotation);
mRemote.transact(Stub.TRANSACTION_onMovementBoundsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when window manager decides to adjust the pinned stack bounds because of the IME, or
     * when the listener is first registered to allow the listener to synchronized its state with
     * the controller.  This call will always be followed by a onMovementBoundsChanged() call
     * with fromImeAdjustement set to true.
     */
@Override public void onImeVisibilityChanged(boolean imeVisible, int imeHeight) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((imeVisible)?(1):(0)));
_data.writeInt(imeHeight);
mRemote.transact(Stub.TRANSACTION_onImeVisibilityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when window manager decides to adjust the minimized state, or when the listener
     * is first registered to allow the listener to synchronized its state with the controller.
     */
@Override public void onMinimizedStateChanged(boolean isMinimized) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isMinimized)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onMinimizedStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the set of actions for the current PiP activity changes, or when the listener
     * is first registered to allow the listener to synchronized its state with the controller.
     */
@Override public void onActionsChanged(android.content.pm.ParceledListSlice actions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((actions!=null)) {
_data.writeInt(1);
actions.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onActionsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onListenerRegistered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onMovementBoundsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onImeVisibilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onMinimizedStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onActionsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
/**
     * Called when the listener is registered and provides an interface to call back to the pinned
     * stack controller to update the controller of the pinned stack state.
     */
public void onListenerRegistered(android.view.IPinnedStackController controller) throws android.os.RemoteException;
/**
     * Called when the window manager has detected a change that would cause the movement bounds
     * to be changed (ie. after configuration change, aspect ratio change, etc). It then provides
     * the components that allow the listener to calculate the movement bounds itself. The
     * {@param normalBounds} are also the default bounds that the PiP would be entered in its
     * current state with the aspect ratio applied.  The {@param animatingBounds} are provided
     * to indicate the current target bounds of the pinned stack (the final bounds if animating,
     * the current bounds if not), which may be helpful in calculating dependent animation bounds.
     *
     * The {@param displayRotation} is provided so that the client can verify when making certain
     * calls that it will not provide stale information based on an old display rotation (ie. if
     * the WM has changed in the mean time but the client has not received onMovementBoundsChanged).
     */
public void onMovementBoundsChanged(android.graphics.Rect insetBounds, android.graphics.Rect normalBounds, android.graphics.Rect animatingBounds, boolean fromImeAdjustement, int displayRotation) throws android.os.RemoteException;
/**
     * Called when window manager decides to adjust the pinned stack bounds because of the IME, or
     * when the listener is first registered to allow the listener to synchronized its state with
     * the controller.  This call will always be followed by a onMovementBoundsChanged() call
     * with fromImeAdjustement set to true.
     */
public void onImeVisibilityChanged(boolean imeVisible, int imeHeight) throws android.os.RemoteException;
/**
     * Called when window manager decides to adjust the minimized state, or when the listener
     * is first registered to allow the listener to synchronized its state with the controller.
     */
public void onMinimizedStateChanged(boolean isMinimized) throws android.os.RemoteException;
/**
     * Called when the set of actions for the current PiP activity changes, or when the listener
     * is first registered to allow the listener to synchronized its state with the controller.
     */
public void onActionsChanged(android.content.pm.ParceledListSlice actions) throws android.os.RemoteException;
}
