/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/view/IInputMethodClient.aidl
 */
package com.android.internal.view;
/**
 * Interface a client of the IInputMethodManager implements, to identify
 * itself and receive information about changes to the global manager state.
 */
public interface IInputMethodClient extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputMethodClient
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputMethodClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.view.IInputMethodClient interface,
 * generating a proxy if needed.
 */
public static com.android.internal.view.IInputMethodClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.view.IInputMethodClient))) {
return ((com.android.internal.view.IInputMethodClient)iin);
}
return new com.android.internal.view.IInputMethodClient.Stub.Proxy(obj);
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
case TRANSACTION_setUsingInputMethod:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setUsingInputMethod(_arg0);
return true;
}
case TRANSACTION_onBindMethod:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.view.InputBindResult _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.internal.view.InputBindResult.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onBindMethod(_arg0);
return true;
}
case TRANSACTION_onUnbindMethod:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onUnbindMethod(_arg0, _arg1);
return true;
}
case TRANSACTION_setActive:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setActive(_arg0, _arg1);
return true;
}
case TRANSACTION_setUserActionNotificationSequenceNumber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setUserActionNotificationSequenceNumber(_arg0);
return true;
}
case TRANSACTION_reportFullscreenMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.reportFullscreenMode(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.view.IInputMethodClient
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
@Override public void setUsingInputMethod(boolean state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((state)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUsingInputMethod, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBindMethod(com.android.internal.view.InputBindResult res) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((res!=null)) {
_data.writeInt(1);
res.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onBindMethod, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// unbindReason corresponds to InputMethodClient.UnbindReason.

@Override public void onUnbindMethod(int sequence, int unbindReason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sequence);
_data.writeInt(unbindReason);
mRemote.transact(Stub.TRANSACTION_onUnbindMethod, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setActive(boolean active, boolean fullscreen) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((active)?(1):(0)));
_data.writeInt(((fullscreen)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setActive, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setUserActionNotificationSequenceNumber(int sequenceNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sequenceNumber);
mRemote.transact(Stub.TRANSACTION_setUserActionNotificationSequenceNumber, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void reportFullscreenMode(boolean fullscreen) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((fullscreen)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_reportFullscreenMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setUsingInputMethod = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onBindMethod = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onUnbindMethod = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setUserActionNotificationSequenceNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_reportFullscreenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void setUsingInputMethod(boolean state) throws android.os.RemoteException;
public void onBindMethod(com.android.internal.view.InputBindResult res) throws android.os.RemoteException;
// unbindReason corresponds to InputMethodClient.UnbindReason.

public void onUnbindMethod(int sequence, int unbindReason) throws android.os.RemoteException;
public void setActive(boolean active, boolean fullscreen) throws android.os.RemoteException;
public void setUserActionNotificationSequenceNumber(int sequenceNumber) throws android.os.RemoteException;
public void reportFullscreenMode(boolean fullscreen) throws android.os.RemoteException;
}
