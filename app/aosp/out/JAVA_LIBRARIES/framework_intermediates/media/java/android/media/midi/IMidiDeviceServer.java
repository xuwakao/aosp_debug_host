/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/midi/IMidiDeviceServer.aidl
 */
package android.media.midi;
/** @hide */
public interface IMidiDeviceServer extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.midi.IMidiDeviceServer
{
private static final java.lang.String DESCRIPTOR = "android.media.midi.IMidiDeviceServer";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.midi.IMidiDeviceServer interface,
 * generating a proxy if needed.
 */
public static android.media.midi.IMidiDeviceServer asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.midi.IMidiDeviceServer))) {
return ((android.media.midi.IMidiDeviceServer)iin);
}
return new android.media.midi.IMidiDeviceServer.Stub.Proxy(obj);
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
case TRANSACTION_openInputPort:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
java.io.FileDescriptor _result = this.openInputPort(_arg0, _arg1);
reply.writeNoException();
reply.writeRawFileDescriptor(_result);
return true;
}
case TRANSACTION_openOutputPort:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
java.io.FileDescriptor _result = this.openOutputPort(_arg0, _arg1);
reply.writeNoException();
reply.writeRawFileDescriptor(_result);
return true;
}
case TRANSACTION_closePort:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.closePort(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_closeDevice:
{
data.enforceInterface(DESCRIPTOR);
this.closeDevice();
return true;
}
case TRANSACTION_connectPorts:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.io.FileDescriptor _arg1;
_arg1 = data.readRawFileDescriptor();
int _arg2;
_arg2 = data.readInt();
int _result = this.connectPorts(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDeviceInfo:
{
data.enforceInterface(DESCRIPTOR);
android.media.midi.MidiDeviceInfo _result = this.getDeviceInfo();
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
case TRANSACTION_setDeviceInfo:
{
data.enforceInterface(DESCRIPTOR);
android.media.midi.MidiDeviceInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.media.midi.MidiDeviceInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setDeviceInfo(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.midi.IMidiDeviceServer
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
@Override public java.io.FileDescriptor openInputPort(android.os.IBinder token, int portNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.io.FileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(portNumber);
mRemote.transact(Stub.TRANSACTION_openInputPort, _data, _reply, 0);
_reply.readException();
_result = _reply.readRawFileDescriptor();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.io.FileDescriptor openOutputPort(android.os.IBinder token, int portNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.io.FileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(portNumber);
mRemote.transact(Stub.TRANSACTION_openOutputPort, _data, _reply, 0);
_reply.readException();
_result = _reply.readRawFileDescriptor();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void closePort(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_closePort, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void closeDevice() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_closeDevice, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public int connectPorts(android.os.IBinder token, java.io.FileDescriptor fd, int outputPortNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeRawFileDescriptor(fd);
_data.writeInt(outputPortNumber);
mRemote.transact(Stub.TRANSACTION_connectPorts, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.media.midi.MidiDeviceInfo getDeviceInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.media.midi.MidiDeviceInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDeviceInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.media.midi.MidiDeviceInfo.CREATOR.createFromParcel(_reply);
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
// For use by MidiService.

@Override public void setDeviceInfo(android.media.midi.MidiDeviceInfo deviceInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((deviceInfo!=null)) {
_data.writeInt(1);
deviceInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setDeviceInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_openInputPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_openOutputPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_closePort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_closeDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_connectPorts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getDeviceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setDeviceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public java.io.FileDescriptor openInputPort(android.os.IBinder token, int portNumber) throws android.os.RemoteException;
public java.io.FileDescriptor openOutputPort(android.os.IBinder token, int portNumber) throws android.os.RemoteException;
public void closePort(android.os.IBinder token) throws android.os.RemoteException;
public void closeDevice() throws android.os.RemoteException;
public int connectPorts(android.os.IBinder token, java.io.FileDescriptor fd, int outputPortNumber) throws android.os.RemoteException;
public android.media.midi.MidiDeviceInfo getDeviceInfo() throws android.os.RemoteException;
// For use by MidiService.

public void setDeviceInfo(android.media.midi.MidiDeviceInfo deviceInfo) throws android.os.RemoteException;
}
