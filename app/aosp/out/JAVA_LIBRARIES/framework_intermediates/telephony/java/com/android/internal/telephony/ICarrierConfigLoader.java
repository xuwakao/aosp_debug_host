/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/internal/telephony/ICarrierConfigLoader.aidl
 */
package com.android.internal.telephony;
/**
 * Interface used to interact with the CarrierConfigLoader
 */
public interface ICarrierConfigLoader extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ICarrierConfigLoader
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ICarrierConfigLoader";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ICarrierConfigLoader interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ICarrierConfigLoader asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ICarrierConfigLoader))) {
return ((com.android.internal.telephony.ICarrierConfigLoader)iin);
}
return new com.android.internal.telephony.ICarrierConfigLoader.Stub.Proxy(obj);
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
case TRANSACTION_getConfigForSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.PersistableBundle _result = this.getConfigForSubId(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_notifyConfigChangedForSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.notifyConfigChangedForSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_updateConfigForPhoneId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.updateConfigForPhoneId(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultCarrierServicePackageName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getDefaultCarrierServicePackageName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.ICarrierConfigLoader
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
@Override public android.os.PersistableBundle getConfigForSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.PersistableBundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getConfigForSubId, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.PersistableBundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void notifyConfigChangedForSubId(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_notifyConfigChangedForSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateConfigForPhoneId(int phoneId, java.lang.String simState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(phoneId);
_data.writeString(simState);
mRemote.transact(Stub.TRANSACTION_updateConfigForPhoneId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getDefaultCarrierServicePackageName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultCarrierServicePackageName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getConfigForSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_notifyConfigChangedForSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateConfigForPhoneId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDefaultCarrierServicePackageName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public android.os.PersistableBundle getConfigForSubId(int subId) throws android.os.RemoteException;
public void notifyConfigChangedForSubId(int subId) throws android.os.RemoteException;
public void updateConfigForPhoneId(int phoneId, java.lang.String simState) throws android.os.RemoteException;
public java.lang.String getDefaultCarrierServicePackageName() throws android.os.RemoteException;
}
