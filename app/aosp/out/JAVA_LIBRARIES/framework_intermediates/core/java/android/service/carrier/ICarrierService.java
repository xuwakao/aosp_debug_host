/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/carrier/ICarrierService.aidl
 */
package android.service.carrier;
/**
 * Service used to expose carrier-specific functionality to the system.
 *
 * @see android.service.carrier.CarrierService
 * @hide
 */
public interface ICarrierService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.carrier.ICarrierService
{
private static final java.lang.String DESCRIPTOR = "android.service.carrier.ICarrierService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.carrier.ICarrierService interface,
 * generating a proxy if needed.
 */
public static android.service.carrier.ICarrierService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.carrier.ICarrierService))) {
return ((android.service.carrier.ICarrierService)iin);
}
return new android.service.carrier.ICarrierService.Stub.Proxy(obj);
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
case TRANSACTION_getCarrierConfig:
{
data.enforceInterface(DESCRIPTOR);
android.service.carrier.CarrierIdentifier _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.carrier.CarrierIdentifier.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.PersistableBundle _result = this.getCarrierConfig(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.carrier.ICarrierService
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
/** @see android.service.carrier.CarrierService#onLoadConfig */
@Override public android.os.PersistableBundle getCarrierConfig(android.service.carrier.CarrierIdentifier id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.PersistableBundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((id!=null)) {
_data.writeInt(1);
id.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getCarrierConfig, _data, _reply, 0);
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
}
static final int TRANSACTION_getCarrierConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/** @see android.service.carrier.CarrierService#onLoadConfig */
public android.os.PersistableBundle getCarrierConfig(android.service.carrier.CarrierIdentifier id) throws android.os.RemoteException;
}
