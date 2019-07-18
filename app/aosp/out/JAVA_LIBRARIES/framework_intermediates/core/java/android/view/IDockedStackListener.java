/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/IDockedStackListener.aidl
 */
package android.view;
/**
  * Listener for showing/hiding of the dock divider. Will fire when an app is shown in side by side
  * mode and a divider should be shown.
  *
  * @hide
  */
public interface IDockedStackListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IDockedStackListener
{
private static final java.lang.String DESCRIPTOR = "android.view.IDockedStackListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IDockedStackListener interface,
 * generating a proxy if needed.
 */
public static android.view.IDockedStackListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IDockedStackListener))) {
return ((android.view.IDockedStackListener)iin);
}
return new android.view.IDockedStackListener.Stub.Proxy(obj);
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
case TRANSACTION_onDividerVisibilityChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onDividerVisibilityChanged(_arg0);
return true;
}
case TRANSACTION_onDockedStackExistsChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onDockedStackExistsChanged(_arg0);
return true;
}
case TRANSACTION_onDockedStackMinimizedChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
long _arg1;
_arg1 = data.readLong();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onDockedStackMinimizedChanged(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onAdjustedForImeChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
long _arg1;
_arg1 = data.readLong();
this.onAdjustedForImeChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onDockSideChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onDockSideChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IDockedStackListener
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
     * Will fire when an app is shown in side by side mode and a divider should be shown.
     */
@Override public void onDividerVisibilityChanged(boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onDividerVisibilityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the docked stack gets created or removed.
     */
@Override public void onDockedStackExistsChanged(boolean exists) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((exists)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onDockedStackExistsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when window manager decides to minimize the docked stack. The divider should make
     * itself not interactable and shrink a bit in this state.
     *
     * @param minimized Whether the docked stack is currently minimized.
     * @param animDuration The duration of the animation for changing the minimized state.
     * @param isHomeStackResizable If the home stack is resizable, a portion of the docked stack
     *        will be shown with the divider
     */
@Override public void onDockedStackMinimizedChanged(boolean minimized, long animDuration, boolean isHomeStackResizable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((minimized)?(1):(0)));
_data.writeLong(animDuration);
_data.writeInt(((isHomeStackResizable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onDockedStackMinimizedChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when window manager decides to adjust the divider for IME. Like the minimized state,
     * the divider should make itself not interactable and shrink a bit, but in a different way.s
     *
     * @param minimized Whether the stacks are currently adjusted for the IME
     * @param animDuration The duration of the animation for changing the adjusted state.
     */
@Override public void onAdjustedForImeChanged(boolean adjustedForIme, long animDuration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((adjustedForIme)?(1):(0)));
_data.writeLong(animDuration);
mRemote.transact(Stub.TRANSACTION_onAdjustedForImeChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when window manager repositioned the docked stack after a screen rotation change.
     */
@Override public void onDockSideChanged(int newDockSide) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(newDockSide);
mRemote.transact(Stub.TRANSACTION_onDockSideChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onDividerVisibilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onDockedStackExistsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onDockedStackMinimizedChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onAdjustedForImeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onDockSideChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
/**
     * Will fire when an app is shown in side by side mode and a divider should be shown.
     */
public void onDividerVisibilityChanged(boolean visible) throws android.os.RemoteException;
/**
     * Called when the docked stack gets created or removed.
     */
public void onDockedStackExistsChanged(boolean exists) throws android.os.RemoteException;
/**
     * Called when window manager decides to minimize the docked stack. The divider should make
     * itself not interactable and shrink a bit in this state.
     *
     * @param minimized Whether the docked stack is currently minimized.
     * @param animDuration The duration of the animation for changing the minimized state.
     * @param isHomeStackResizable If the home stack is resizable, a portion of the docked stack
     *        will be shown with the divider
     */
public void onDockedStackMinimizedChanged(boolean minimized, long animDuration, boolean isHomeStackResizable) throws android.os.RemoteException;
/**
     * Called when window manager decides to adjust the divider for IME. Like the minimized state,
     * the divider should make itself not interactable and shrink a bit, but in a different way.s
     *
     * @param minimized Whether the stacks are currently adjusted for the IME
     * @param animDuration The duration of the animation for changing the adjusted state.
     */
public void onAdjustedForImeChanged(boolean adjustedForIme, long animDuration) throws android.os.RemoteException;
/**
     * Called when window manager repositioned the docked stack after a screen rotation change.
     */
public void onDockSideChanged(int newDockSide) throws android.os.RemoteException;
}
