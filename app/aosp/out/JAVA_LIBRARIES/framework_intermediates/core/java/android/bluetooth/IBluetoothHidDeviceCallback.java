/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothHidDeviceCallback.aidl
 */
package android.bluetooth;
/** @hide */
public interface IBluetoothHidDeviceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHidDeviceCallback
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHidDeviceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothHidDeviceCallback interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothHidDeviceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothHidDeviceCallback))) {
return ((android.bluetooth.IBluetoothHidDeviceCallback)iin);
}
return new android.bluetooth.IBluetoothHidDeviceCallback.Stub.Proxy(obj);
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
case TRANSACTION_onAppStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.BluetoothHidDeviceAppConfiguration _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothHidDeviceAppConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onAppStatusChanged(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onConnectionStateChanged:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.onConnectionStateChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onGetReport:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
byte _arg1;
_arg1 = data.readByte();
byte _arg2;
_arg2 = data.readByte();
int _arg3;
_arg3 = data.readInt();
this.onGetReport(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_onSetReport:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
byte _arg1;
_arg1 = data.readByte();
byte _arg2;
_arg2 = data.readByte();
byte[] _arg3;
_arg3 = data.createByteArray();
this.onSetReport(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_onSetProtocol:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
byte _arg1;
_arg1 = data.readByte();
this.onSetProtocol(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onIntrData:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
byte _arg1;
_arg1 = data.readByte();
byte[] _arg2;
_arg2 = data.createByteArray();
this.onIntrData(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onVirtualCableUnplug:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onVirtualCableUnplug(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothHidDeviceCallback
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
@Override public void onAppStatusChanged(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHidDeviceAppConfiguration config, boolean registered) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((registered)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onAppStatusChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onConnectionStateChanged(android.bluetooth.BluetoothDevice device, int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_onConnectionStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onGetReport(android.bluetooth.BluetoothDevice device, byte type, byte id, int bufferSize) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByte(type);
_data.writeByte(id);
_data.writeInt(bufferSize);
mRemote.transact(Stub.TRANSACTION_onGetReport, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onSetReport(android.bluetooth.BluetoothDevice device, byte type, byte id, byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByte(type);
_data.writeByte(id);
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_onSetReport, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onSetProtocol(android.bluetooth.BluetoothDevice device, byte protocol) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByte(protocol);
mRemote.transact(Stub.TRANSACTION_onSetProtocol, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onIntrData(android.bluetooth.BluetoothDevice device, byte reportId, byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByte(reportId);
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_onIntrData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onVirtualCableUnplug(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onVirtualCableUnplug, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onAppStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onConnectionStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onGetReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onSetReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onSetProtocol = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onIntrData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onVirtualCableUnplug = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void onAppStatusChanged(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHidDeviceAppConfiguration config, boolean registered) throws android.os.RemoteException;
public void onConnectionStateChanged(android.bluetooth.BluetoothDevice device, int state) throws android.os.RemoteException;
public void onGetReport(android.bluetooth.BluetoothDevice device, byte type, byte id, int bufferSize) throws android.os.RemoteException;
public void onSetReport(android.bluetooth.BluetoothDevice device, byte type, byte id, byte[] data) throws android.os.RemoteException;
public void onSetProtocol(android.bluetooth.BluetoothDevice device, byte protocol) throws android.os.RemoteException;
public void onIntrData(android.bluetooth.BluetoothDevice device, byte reportId, byte[] data) throws android.os.RemoteException;
public void onVirtualCableUnplug(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
}
