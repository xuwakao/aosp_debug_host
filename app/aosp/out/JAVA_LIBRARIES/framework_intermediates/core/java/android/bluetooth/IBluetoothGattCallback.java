/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothGattCallback.aidl
 */
package android.bluetooth;
/**
 * Callback definitions for interacting with BLE / GATT
 * @hide
 */
public interface IBluetoothGattCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGattCallback
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGattCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothGattCallback interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothGattCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothGattCallback))) {
return ((android.bluetooth.IBluetoothGattCallback)iin);
}
return new android.bluetooth.IBluetoothGattCallback.Stub.Proxy(obj);
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
case TRANSACTION_onClientRegistered:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onClientRegistered(_arg0, _arg1);
return true;
}
case TRANSACTION_onClientConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
java.lang.String _arg3;
_arg3 = data.readString();
this.onClientConnectionState(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onPhyUpdate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onPhyUpdate(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onPhyRead:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onPhyRead(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onSearchComplete:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.bluetooth.BluetoothGattService> _arg1;
_arg1 = data.createTypedArrayList(android.bluetooth.BluetoothGattService.CREATOR);
int _arg2;
_arg2 = data.readInt();
this.onSearchComplete(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onCharacteristicRead:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
this.onCharacteristicRead(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onCharacteristicWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onCharacteristicWrite(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onExecuteWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onExecuteWrite(_arg0, _arg1);
return true;
}
case TRANSACTION_onDescriptorRead:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
this.onDescriptorRead(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onDescriptorWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onDescriptorWrite(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onNotify:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
this.onNotify(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onReadRemoteRssi:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onReadRemoteRssi(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onConfigureMTU:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onConfigureMTU(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onConnectionUpdated:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.onConnectionUpdated(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothGattCallback
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
@Override public void onClientRegistered(int status, int clientIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(clientIf);
mRemote.transact(Stub.TRANSACTION_onClientRegistered, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onClientConnectionState(int status, int clientIf, boolean connected, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(clientIf);
_data.writeInt(((connected)?(1):(0)));
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_onClientConnectionState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPhyUpdate(java.lang.String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(txPhy);
_data.writeInt(rxPhy);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onPhyUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPhyRead(java.lang.String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(txPhy);
_data.writeInt(rxPhy);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onPhyRead, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSearchComplete(java.lang.String address, java.util.List<android.bluetooth.BluetoothGattService> services, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeTypedList(services);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onSearchComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCharacteristicRead(java.lang.String address, int status, int handle, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(handle);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onCharacteristicRead, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCharacteristicWrite(java.lang.String address, int status, int handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(handle);
mRemote.transact(Stub.TRANSACTION_onCharacteristicWrite, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onExecuteWrite(java.lang.String address, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onExecuteWrite, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDescriptorRead(java.lang.String address, int status, int handle, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(handle);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onDescriptorRead, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDescriptorWrite(java.lang.String address, int status, int handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(handle);
mRemote.transact(Stub.TRANSACTION_onDescriptorWrite, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotify(java.lang.String address, int handle, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(handle);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onNotify, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onReadRemoteRssi(java.lang.String address, int rssi, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(rssi);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onReadRemoteRssi, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConfigureMTU(java.lang.String address, int mtu, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(mtu);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onConfigureMTU, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConnectionUpdated(java.lang.String address, int interval, int latency, int timeout, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(interval);
_data.writeInt(latency);
_data.writeInt(timeout);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onConnectionUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onClientRegistered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onClientConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onPhyUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onPhyRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onSearchComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onCharacteristicRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onCharacteristicWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onExecuteWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onDescriptorRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onDescriptorWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onNotify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onReadRemoteRssi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_onConfigureMTU = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onConnectionUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
public void onClientRegistered(int status, int clientIf) throws android.os.RemoteException;
public void onClientConnectionState(int status, int clientIf, boolean connected, java.lang.String address) throws android.os.RemoteException;
public void onPhyUpdate(java.lang.String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException;
public void onPhyRead(java.lang.String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException;
public void onSearchComplete(java.lang.String address, java.util.List<android.bluetooth.BluetoothGattService> services, int status) throws android.os.RemoteException;
public void onCharacteristicRead(java.lang.String address, int status, int handle, byte[] value) throws android.os.RemoteException;
public void onCharacteristicWrite(java.lang.String address, int status, int handle) throws android.os.RemoteException;
public void onExecuteWrite(java.lang.String address, int status) throws android.os.RemoteException;
public void onDescriptorRead(java.lang.String address, int status, int handle, byte[] value) throws android.os.RemoteException;
public void onDescriptorWrite(java.lang.String address, int status, int handle) throws android.os.RemoteException;
public void onNotify(java.lang.String address, int handle, byte[] value) throws android.os.RemoteException;
public void onReadRemoteRssi(java.lang.String address, int rssi, int status) throws android.os.RemoteException;
public void onConfigureMTU(java.lang.String address, int mtu, int status) throws android.os.RemoteException;
public void onConnectionUpdated(java.lang.String address, int interval, int latency, int timeout, int status) throws android.os.RemoteException;
}
