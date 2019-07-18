/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/packages/services/PacProcessor/com/android/net/IProxyService.aidl
 */
package com.android.net;
/** @hide */
public interface IProxyService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.net.IProxyService
{
private static final java.lang.String DESCRIPTOR = "com.android.net.IProxyService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.net.IProxyService interface,
 * generating a proxy if needed.
 */
public static com.android.net.IProxyService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.net.IProxyService))) {
return ((com.android.net.IProxyService)iin);
}
return new com.android.net.IProxyService.Stub.Proxy(obj);
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
case TRANSACTION_resolvePacFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.resolvePacFile(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setPacFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setPacFile(_arg0);
return true;
}
case TRANSACTION_startPacSystem:
{
data.enforceInterface(DESCRIPTOR);
this.startPacSystem();
return true;
}
case TRANSACTION_stopPacSystem:
{
data.enforceInterface(DESCRIPTOR);
this.stopPacSystem();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.net.IProxyService
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
@Override public java.lang.String resolvePacFile(java.lang.String host, java.lang.String url) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(host);
_data.writeString(url);
mRemote.transact(Stub.TRANSACTION_resolvePacFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPacFile(java.lang.String scriptContents) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(scriptContents);
mRemote.transact(Stub.TRANSACTION_setPacFile, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void startPacSystem() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startPacSystem, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stopPacSystem() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopPacSystem, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_resolvePacFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setPacFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startPacSystem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopPacSystem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public java.lang.String resolvePacFile(java.lang.String host, java.lang.String url) throws android.os.RemoteException;
public void setPacFile(java.lang.String scriptContents) throws android.os.RemoteException;
public void startPacSystem() throws android.os.RemoteException;
public void stopPacSystem() throws android.os.RemoteException;
}
