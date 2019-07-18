/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/tv/ITvRemoteServiceInput.aidl
 */
package android.media.tv;
/**
 * {@hide}
 */
public interface ITvRemoteServiceInput extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvRemoteServiceInput
{
private static final java.lang.String DESCRIPTOR = "android.media.tv.ITvRemoteServiceInput";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.tv.ITvRemoteServiceInput interface,
 * generating a proxy if needed.
 */
public static android.media.tv.ITvRemoteServiceInput asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.tv.ITvRemoteServiceInput))) {
return ((android.media.tv.ITvRemoteServiceInput)iin);
}
return new android.media.tv.ITvRemoteServiceInput.Stub.Proxy(obj);
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
case TRANSACTION_openInputBridge:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.openInputBridge(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_closeInputBridge:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.closeInputBridge(_arg0);
return true;
}
case TRANSACTION_clearInputBridge:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.clearInputBridge(_arg0);
return true;
}
case TRANSACTION_sendTimestamp:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
long _arg1;
_arg1 = data.readLong();
this.sendTimestamp(_arg0, _arg1);
return true;
}
case TRANSACTION_sendKeyDown:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.sendKeyDown(_arg0, _arg1);
return true;
}
case TRANSACTION_sendKeyUp:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.sendKeyUp(_arg0, _arg1);
return true;
}
case TRANSACTION_sendPointerDown:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.sendPointerDown(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_sendPointerUp:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.sendPointerUp(_arg0, _arg1);
return true;
}
case TRANSACTION_sendPointerSync:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.sendPointerSync(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.tv.ITvRemoteServiceInput
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
// InputBridge related

@Override public void openInputBridge(android.os.IBinder token, java.lang.String name, int width, int height, int maxPointers) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeString(name);
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(maxPointers);
mRemote.transact(Stub.TRANSACTION_openInputBridge, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void closeInputBridge(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_closeInputBridge, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void clearInputBridge(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_clearInputBridge, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendTimestamp(android.os.IBinder token, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_sendTimestamp, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendKeyDown(android.os.IBinder token, int keyCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(keyCode);
mRemote.transact(Stub.TRANSACTION_sendKeyDown, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendKeyUp(android.os.IBinder token, int keyCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(keyCode);
mRemote.transact(Stub.TRANSACTION_sendKeyUp, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendPointerDown(android.os.IBinder token, int pointerId, int x, int y) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(pointerId);
_data.writeInt(x);
_data.writeInt(y);
mRemote.transact(Stub.TRANSACTION_sendPointerDown, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendPointerUp(android.os.IBinder token, int pointerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(pointerId);
mRemote.transact(Stub.TRANSACTION_sendPointerUp, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendPointerSync(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_sendPointerSync, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_openInputBridge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_closeInputBridge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_clearInputBridge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sendTimestamp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_sendKeyDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_sendKeyUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_sendPointerDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_sendPointerUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_sendPointerSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
// InputBridge related

public void openInputBridge(android.os.IBinder token, java.lang.String name, int width, int height, int maxPointers) throws android.os.RemoteException;
public void closeInputBridge(android.os.IBinder token) throws android.os.RemoteException;
public void clearInputBridge(android.os.IBinder token) throws android.os.RemoteException;
public void sendTimestamp(android.os.IBinder token, long timestamp) throws android.os.RemoteException;
public void sendKeyDown(android.os.IBinder token, int keyCode) throws android.os.RemoteException;
public void sendKeyUp(android.os.IBinder token, int keyCode) throws android.os.RemoteException;
public void sendPointerDown(android.os.IBinder token, int pointerId, int x, int y) throws android.os.RemoteException;
public void sendPointerUp(android.os.IBinder token, int pointerId) throws android.os.RemoteException;
public void sendPointerSync(android.os.IBinder token) throws android.os.RemoteException;
}
