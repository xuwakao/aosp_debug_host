/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../../system/update_engine/binder_bindings/android/os/IUpdateEngine.aidl
 */
package android.os;
/** @hide */
public interface IUpdateEngine extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IUpdateEngine
{
private static final java.lang.String DESCRIPTOR = "android.os.IUpdateEngine";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IUpdateEngine interface,
 * generating a proxy if needed.
 */
public static android.os.IUpdateEngine asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IUpdateEngine))) {
return ((android.os.IUpdateEngine)iin);
}
return new android.os.IUpdateEngine.Stub.Proxy(obj);
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
case TRANSACTION_applyPayload:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
this.applyPayload(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_bind:
{
data.enforceInterface(DESCRIPTOR);
android.os.IUpdateEngineCallback _arg0;
_arg0 = android.os.IUpdateEngineCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.bind(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unbind:
{
data.enforceInterface(DESCRIPTOR);
android.os.IUpdateEngineCallback _arg0;
_arg0 = android.os.IUpdateEngineCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.unbind(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_suspend:
{
data.enforceInterface(DESCRIPTOR);
this.suspend();
reply.writeNoException();
return true;
}
case TRANSACTION_resume:
{
data.enforceInterface(DESCRIPTOR);
this.resume();
reply.writeNoException();
return true;
}
case TRANSACTION_cancel:
{
data.enforceInterface(DESCRIPTOR);
this.cancel();
reply.writeNoException();
return true;
}
case TRANSACTION_resetStatus:
{
data.enforceInterface(DESCRIPTOR);
this.resetStatus();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IUpdateEngine
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
/** @hide */
@Override public void applyPayload(java.lang.String url, long payload_offset, long payload_size, java.lang.String[] headerKeyValuePairs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(url);
_data.writeLong(payload_offset);
_data.writeLong(payload_size);
_data.writeStringArray(headerKeyValuePairs);
mRemote.transact(Stub.TRANSACTION_applyPayload, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** @hide */
@Override public boolean bind(android.os.IUpdateEngineCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_bind, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** @hide */
@Override public boolean unbind(android.os.IUpdateEngineCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unbind, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** @hide */
@Override public void suspend() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_suspend, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** @hide */
@Override public void resume() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** @hide */
@Override public void cancel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** @hide */
@Override public void resetStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resetStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_applyPayload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_bind = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_unbind = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_suspend = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_resume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_cancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_resetStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
/** @hide */
public void applyPayload(java.lang.String url, long payload_offset, long payload_size, java.lang.String[] headerKeyValuePairs) throws android.os.RemoteException;
/** @hide */
public boolean bind(android.os.IUpdateEngineCallback callback) throws android.os.RemoteException;
/** @hide */
public boolean unbind(android.os.IUpdateEngineCallback callback) throws android.os.RemoteException;
/** @hide */
public void suspend() throws android.os.RemoteException;
/** @hide */
public void resume() throws android.os.RemoteException;
/** @hide */
public void cancel() throws android.os.RemoteException;
/** @hide */
public void resetStatus() throws android.os.RemoteException;
}
