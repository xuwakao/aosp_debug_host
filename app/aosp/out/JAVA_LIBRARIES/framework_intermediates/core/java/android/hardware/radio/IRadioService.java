/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/radio/IRadioService.aidl
 */
package android.hardware.radio;
/**
 * API to the broadcast radio service.
 *
 * {@hide}
 */
public interface IRadioService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.radio.IRadioService
{
private static final java.lang.String DESCRIPTOR = "android.hardware.radio.IRadioService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.radio.IRadioService interface,
 * generating a proxy if needed.
 */
public static android.hardware.radio.IRadioService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.radio.IRadioService))) {
return ((android.hardware.radio.IRadioService)iin);
}
return new android.hardware.radio.IRadioService.Stub.Proxy(obj);
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
case TRANSACTION_listModules:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.hardware.radio.RadioManager.ModuleProperties> _result = this.listModules();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_openTuner:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.radio.RadioManager.BandConfig _arg1;
if ((0!=data.readInt())) {
_arg1 = android.hardware.radio.RadioManager.BandConfig.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
android.hardware.radio.ITunerCallback _arg3;
_arg3 = android.hardware.radio.ITunerCallback.Stub.asInterface(data.readStrongBinder());
android.hardware.radio.ITuner _result = this.openTuner(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.radio.IRadioService
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
@Override public java.util.List<android.hardware.radio.RadioManager.ModuleProperties> listModules() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.hardware.radio.RadioManager.ModuleProperties> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listModules, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.hardware.radio.RadioManager.ModuleProperties.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.hardware.radio.ITuner openTuner(int moduleId, android.hardware.radio.RadioManager.BandConfig bandConfig, boolean withAudio, android.hardware.radio.ITunerCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.radio.ITuner _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(moduleId);
if ((bandConfig!=null)) {
_data.writeInt(1);
bandConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((withAudio)?(1):(0)));
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_openTuner, _data, _reply, 0);
_reply.readException();
_result = android.hardware.radio.ITuner.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_listModules = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_openTuner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public java.util.List<android.hardware.radio.RadioManager.ModuleProperties> listModules() throws android.os.RemoteException;
public android.hardware.radio.ITuner openTuner(int moduleId, android.hardware.radio.RadioManager.BandConfig bandConfig, boolean withAudio, android.hardware.radio.ITunerCallback callback) throws android.os.RemoteException;
}
