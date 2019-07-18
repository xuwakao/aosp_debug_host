/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/autofill/IFillCallback.aidl
 */
package android.service.autofill;
/**
 * Interface to receive the result of a save request.
 *
 * @hide
 */
public interface IFillCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.autofill.IFillCallback
{
private static final java.lang.String DESCRIPTOR = "android.service.autofill.IFillCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.autofill.IFillCallback interface,
 * generating a proxy if needed.
 */
public static android.service.autofill.IFillCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.autofill.IFillCallback))) {
return ((android.service.autofill.IFillCallback)iin);
}
return new android.service.autofill.IFillCallback.Stub.Proxy(obj);
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
case TRANSACTION_onCancellable:
{
data.enforceInterface(DESCRIPTOR);
android.os.ICancellationSignal _arg0;
_arg0 = android.os.ICancellationSignal.Stub.asInterface(data.readStrongBinder());
this.onCancellable(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onSuccess:
{
data.enforceInterface(DESCRIPTOR);
android.service.autofill.FillResponse _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.autofill.FillResponse.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onSuccess(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onFailure:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _arg0;
if ((0!=data.readInt())) {
_arg0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onFailure(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.autofill.IFillCallback
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
@Override public void onCancellable(android.os.ICancellationSignal cancellation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cancellation!=null))?(cancellation.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onCancellable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onSuccess(android.service.autofill.FillResponse response) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((response!=null)) {
_data.writeInt(1);
response.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onSuccess, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onFailure(java.lang.CharSequence message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((message!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(message, _data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onFailure, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onCancellable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onFailure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onCancellable(android.os.ICancellationSignal cancellation) throws android.os.RemoteException;
public void onSuccess(android.service.autofill.FillResponse response) throws android.os.RemoteException;
public void onFailure(java.lang.CharSequence message) throws android.os.RemoteException;
}
