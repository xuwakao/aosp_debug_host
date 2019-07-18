/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/app/IVoiceInteractionSessionListener.aidl
 */
package com.android.internal.app;
public interface IVoiceInteractionSessionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractionSessionListener
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractionSessionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IVoiceInteractionSessionListener interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IVoiceInteractionSessionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IVoiceInteractionSessionListener))) {
return ((com.android.internal.app.IVoiceInteractionSessionListener)iin);
}
return new com.android.internal.app.IVoiceInteractionSessionListener.Stub.Proxy(obj);
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
case TRANSACTION_onVoiceSessionShown:
{
data.enforceInterface(DESCRIPTOR);
this.onVoiceSessionShown();
return true;
}
case TRANSACTION_onVoiceSessionHidden:
{
data.enforceInterface(DESCRIPTOR);
this.onVoiceSessionHidden();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IVoiceInteractionSessionListener
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
     * Called when a voice session is shown.
     */
@Override public void onVoiceSessionShown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onVoiceSessionShown, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a voice session is hidden.
     */
@Override public void onVoiceSessionHidden() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onVoiceSessionHidden, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onVoiceSessionShown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onVoiceSessionHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Called when a voice session is shown.
     */
public void onVoiceSessionShown() throws android.os.RemoteException;
/**
     * Called when a voice session is hidden.
     */
public void onVoiceSessionHidden() throws android.os.RemoteException;
}
