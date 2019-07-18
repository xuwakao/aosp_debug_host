/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/autofill/IAutoFillService.aidl
 */
package android.service.autofill;
/**
 * Interface from the system to an auto fill service.
 *
 * @hide
 */
public interface IAutoFillService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.autofill.IAutoFillService
{
private static final java.lang.String DESCRIPTOR = "android.service.autofill.IAutoFillService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.autofill.IAutoFillService interface,
 * generating a proxy if needed.
 */
public static android.service.autofill.IAutoFillService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.autofill.IAutoFillService))) {
return ((android.service.autofill.IAutoFillService)iin);
}
return new android.service.autofill.IAutoFillService.Stub.Proxy(obj);
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
case TRANSACTION_onConnectedStateChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onConnectedStateChanged(_arg0);
return true;
}
case TRANSACTION_onFillRequest:
{
data.enforceInterface(DESCRIPTOR);
android.service.autofill.FillRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.autofill.FillRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.service.autofill.IFillCallback _arg1;
_arg1 = android.service.autofill.IFillCallback.Stub.asInterface(data.readStrongBinder());
this.onFillRequest(_arg0, _arg1);
return true;
}
case TRANSACTION_onSaveRequest:
{
data.enforceInterface(DESCRIPTOR);
android.service.autofill.SaveRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.autofill.SaveRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.service.autofill.ISaveCallback _arg1;
_arg1 = android.service.autofill.ISaveCallback.Stub.asInterface(data.readStrongBinder());
this.onSaveRequest(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.autofill.IAutoFillService
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
@Override public void onConnectedStateChanged(boolean connected) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((connected)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onConnectedStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onFillRequest(android.service.autofill.FillRequest request, android.service.autofill.IFillCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onFillRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSaveRequest(android.service.autofill.SaveRequest request, android.service.autofill.ISaveCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onSaveRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConnectedStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onFillRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSaveRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onConnectedStateChanged(boolean connected) throws android.os.RemoteException;
public void onFillRequest(android.service.autofill.FillRequest request, android.service.autofill.IFillCallback callback) throws android.os.RemoteException;
public void onSaveRequest(android.service.autofill.SaveRequest request, android.service.autofill.ISaveCallback callback) throws android.os.RemoteException;
}
