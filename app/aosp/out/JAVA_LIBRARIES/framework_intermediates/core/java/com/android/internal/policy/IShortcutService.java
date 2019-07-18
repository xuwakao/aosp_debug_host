/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/policy/IShortcutService.aidl
 */
package com.android.internal.policy;
/**
 * An interface to notify the shortcut service that a shortcut key is pressed
 * @hide
 */
public interface IShortcutService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IShortcutService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IShortcutService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.policy.IShortcutService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.policy.IShortcutService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.policy.IShortcutService))) {
return ((com.android.internal.policy.IShortcutService)iin);
}
return new com.android.internal.policy.IShortcutService.Stub.Proxy(obj);
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
case TRANSACTION_notifyShortcutKeyPressed:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.notifyShortcutKeyPressed(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.policy.IShortcutService
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
     * @param shortcutCode the keycode packed with meta information
     */
@Override public void notifyShortcutKeyPressed(long shortcutCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(shortcutCode);
mRemote.transact(Stub.TRANSACTION_notifyShortcutKeyPressed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_notifyShortcutKeyPressed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * @param shortcutCode the keycode packed with meta information
     */
public void notifyShortcutKeyPressed(long shortcutCode) throws android.os.RemoteException;
}
