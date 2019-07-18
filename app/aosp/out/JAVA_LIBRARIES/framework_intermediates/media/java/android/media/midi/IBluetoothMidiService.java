/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/midi/IBluetoothMidiService.aidl
 */
package android.media.midi;
/** @hide */
public interface IBluetoothMidiService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.midi.IBluetoothMidiService
{
private static final java.lang.String DESCRIPTOR = "android.media.midi.IBluetoothMidiService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.midi.IBluetoothMidiService interface,
 * generating a proxy if needed.
 */
public static android.media.midi.IBluetoothMidiService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.midi.IBluetoothMidiService))) {
return ((android.media.midi.IBluetoothMidiService)iin);
}
return new android.media.midi.IBluetoothMidiService.Stub.Proxy(obj);
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
case TRANSACTION_addBluetoothDevice:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _result = this.addBluetoothDevice(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.midi.IBluetoothMidiService
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
@Override public android.os.IBinder addBluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((bluetoothDevice!=null)) {
_data.writeInt(1);
bluetoothDevice.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addBluetoothDevice, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_addBluetoothDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public android.os.IBinder addBluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice) throws android.os.RemoteException;
}
