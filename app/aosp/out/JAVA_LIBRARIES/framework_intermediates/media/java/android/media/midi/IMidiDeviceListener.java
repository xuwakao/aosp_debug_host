/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/midi/IMidiDeviceListener.aidl
 */
package android.media.midi;
/** @hide */
public interface IMidiDeviceListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.midi.IMidiDeviceListener
{
private static final java.lang.String DESCRIPTOR = "android.media.midi.IMidiDeviceListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.midi.IMidiDeviceListener interface,
 * generating a proxy if needed.
 */
public static android.media.midi.IMidiDeviceListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.midi.IMidiDeviceListener))) {
return ((android.media.midi.IMidiDeviceListener)iin);
}
return new android.media.midi.IMidiDeviceListener.Stub.Proxy(obj);
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
case TRANSACTION_onDeviceAdded:
{
data.enforceInterface(DESCRIPTOR);
android.media.midi.MidiDeviceInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.media.midi.MidiDeviceInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onDeviceAdded(_arg0);
return true;
}
case TRANSACTION_onDeviceRemoved:
{
data.enforceInterface(DESCRIPTOR);
android.media.midi.MidiDeviceInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.media.midi.MidiDeviceInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onDeviceRemoved(_arg0);
return true;
}
case TRANSACTION_onDeviceStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
android.media.midi.MidiDeviceStatus _arg0;
if ((0!=data.readInt())) {
_arg0 = android.media.midi.MidiDeviceStatus.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onDeviceStatusChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.midi.IMidiDeviceListener
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
@Override public void onDeviceAdded(android.media.midi.MidiDeviceInfo device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onDeviceAdded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDeviceRemoved(android.media.midi.MidiDeviceInfo device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onDeviceRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((status!=null)) {
_data.writeInt(1);
status.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onDeviceStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onDeviceAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onDeviceRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onDeviceStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onDeviceAdded(android.media.midi.MidiDeviceInfo device) throws android.os.RemoteException;
public void onDeviceRemoved(android.media.midi.MidiDeviceInfo device) throws android.os.RemoteException;
public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus status) throws android.os.RemoteException;
}
