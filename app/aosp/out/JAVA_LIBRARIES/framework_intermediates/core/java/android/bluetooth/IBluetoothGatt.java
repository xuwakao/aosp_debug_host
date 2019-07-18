/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothGatt.aidl
 */
package android.bluetooth;
/**
 * API for interacting with BLE / GATT
 * @hide
 */
public interface IBluetoothGatt extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGatt
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGatt";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothGatt interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothGatt asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothGatt))) {
return ((android.bluetooth.IBluetoothGatt)iin);
}
return new android.bluetooth.IBluetoothGatt.Stub.Proxy(obj);
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
case TRANSACTION_getDevicesMatchingConnectionStates:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.util.List<android.bluetooth.BluetoothDevice> _result = this.getDevicesMatchingConnectionStates(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_registerScanner:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.le.IScannerCallback _arg0;
_arg0 = android.bluetooth.le.IScannerCallback.Stub.asInterface(data.readStrongBinder());
android.os.WorkSource _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.WorkSource.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.registerScanner(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterScanner:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.unregisterScanner(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startScan:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.le.ScanSettings _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.ScanSettings.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.util.List<android.bluetooth.le.ScanFilter> _arg2;
_arg2 = data.createTypedArrayList(android.bluetooth.le.ScanFilter.CREATOR);
java.util.List _arg3;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg3 = data.readArrayList(cl);
java.lang.String _arg4;
_arg4 = data.readString();
this.startScan(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_startScanForIntent:
{
data.enforceInterface(DESCRIPTOR);
android.app.PendingIntent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.le.ScanSettings _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.ScanSettings.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.util.List<android.bluetooth.le.ScanFilter> _arg2;
_arg2 = data.createTypedArrayList(android.bluetooth.le.ScanFilter.CREATOR);
java.lang.String _arg3;
_arg3 = data.readString();
this.startScanForIntent(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_stopScanForIntent:
{
data.enforceInterface(DESCRIPTOR);
android.app.PendingIntent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.stopScanForIntent(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopScan:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.stopScan(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_flushPendingBatchResults:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.flushPendingBatchResults(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startAdvertisingSet:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.le.AdvertisingSetParameters _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.le.AdvertisingSetParameters.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.le.AdvertiseData _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.AdvertiseData.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.bluetooth.le.AdvertiseData _arg2;
if ((0!=data.readInt())) {
_arg2 = android.bluetooth.le.AdvertiseData.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.bluetooth.le.PeriodicAdvertisingParameters _arg3;
if ((0!=data.readInt())) {
_arg3 = android.bluetooth.le.PeriodicAdvertisingParameters.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.bluetooth.le.AdvertiseData _arg4;
if ((0!=data.readInt())) {
_arg4 = android.bluetooth.le.AdvertiseData.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
android.bluetooth.le.IAdvertisingSetCallback _arg7;
_arg7 = android.bluetooth.le.IAdvertisingSetCallback.Stub.asInterface(data.readStrongBinder());
this.startAdvertisingSet(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
return true;
}
case TRANSACTION_stopAdvertisingSet:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.le.IAdvertisingSetCallback _arg0;
_arg0 = android.bluetooth.le.IAdvertisingSetCallback.Stub.asInterface(data.readStrongBinder());
this.stopAdvertisingSet(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getOwnAddress:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.getOwnAddress(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_enableAdvertisingSet:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.enableAdvertisingSet(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setAdvertisingData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.le.AdvertiseData _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.AdvertiseData.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setAdvertisingData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setScanResponseData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.le.AdvertiseData _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.AdvertiseData.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setScanResponseData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAdvertisingParameters:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.le.AdvertisingSetParameters _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.AdvertisingSetParameters.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setAdvertisingParameters(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setPeriodicAdvertisingParameters:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.le.PeriodicAdvertisingParameters _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.PeriodicAdvertisingParameters.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setPeriodicAdvertisingParameters(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setPeriodicAdvertisingData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.le.AdvertiseData _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.AdvertiseData.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setPeriodicAdvertisingData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setPeriodicAdvertisingEnable:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setPeriodicAdvertisingEnable(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_registerSync:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.le.ScanResult _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.le.ScanResult.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.bluetooth.le.IPeriodicAdvertisingCallback _arg3;
_arg3 = android.bluetooth.le.IPeriodicAdvertisingCallback.Stub.asInterface(data.readStrongBinder());
this.registerSync(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterSync:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.le.IPeriodicAdvertisingCallback _arg0;
_arg0 = android.bluetooth.le.IPeriodicAdvertisingCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterSync(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerClient:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.IBluetoothGattCallback _arg1;
_arg1 = android.bluetooth.IBluetoothGattCallback.Stub.asInterface(data.readStrongBinder());
this.registerClient(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterClient:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.unregisterClient(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clientConnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
int _arg5;
_arg5 = data.readInt();
this.clientConnect(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_clientDisconnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.clientDisconnect(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clientSetPreferredPhy:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.clientSetPreferredPhy(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_clientReadPhy:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.clientReadPhy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_refreshDevice:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.refreshDevice(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_discoverServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.discoverServices(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_discoverServiceByUuid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.ParcelUuid _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.discoverServiceByUuid(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_readCharacteristic:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.readCharacteristic(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_readUsingCharacteristicUuid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.ParcelUuid _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
this.readUsingCharacteristicUuid(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_writeCharacteristic:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
byte[] _arg5;
_arg5 = data.createByteArray();
this.writeCharacteristic(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_readDescriptor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.readDescriptor(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_writeDescriptor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
byte[] _arg4;
_arg4 = data.createByteArray();
this.writeDescriptor(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_registerForNotification:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
this.registerForNotification(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_beginReliableWrite:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.beginReliableWrite(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_endReliableWrite:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.endReliableWrite(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_readRemoteRssi:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.readRemoteRssi(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_configureMTU:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.configureMTU(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_connectionParameterUpdate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.connectionParameterUpdate(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_registerServer:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.IBluetoothGattServerCallback _arg1;
_arg1 = android.bluetooth.IBluetoothGattServerCallback.Stub.asInterface(data.readStrongBinder());
this.registerServer(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterServer:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.unregisterServer(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_serverConnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _arg3;
_arg3 = data.readInt();
this.serverConnect(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_serverDisconnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.serverDisconnect(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_serverSetPreferredPhy:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.serverSetPreferredPhy(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_serverReadPhy:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.serverReadPhy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_addService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.BluetoothGattService _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothGattService.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.addService(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.removeService(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.clearServices(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendResponse:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
byte[] _arg5;
_arg5 = data.createByteArray();
this.sendResponse(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_sendNotification:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
boolean _arg3;
_arg3 = (0!=data.readInt());
byte[] _arg4;
_arg4 = data.createByteArray();
this.sendNotification(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_disconnectAll:
{
data.enforceInterface(DESCRIPTOR);
this.disconnectAll();
reply.writeNoException();
return true;
}
case TRANSACTION_unregAll:
{
data.enforceInterface(DESCRIPTOR);
this.unregAll();
reply.writeNoException();
return true;
}
case TRANSACTION_numHwTrackFiltersAvailable:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.numHwTrackFiltersAvailable();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothGatt
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
@Override public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.bluetooth.BluetoothDevice> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(states);
mRemote.transact(Stub.TRANSACTION_getDevicesMatchingConnectionStates, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerScanner(android.bluetooth.le.IScannerCallback callback, android.os.WorkSource workSource) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((workSource!=null)) {
_data.writeInt(1);
workSource.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_registerScanner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterScanner(int scannerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(scannerId);
mRemote.transact(Stub.TRANSACTION_unregisterScanner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startScan(int scannerId, android.bluetooth.le.ScanSettings settings, java.util.List<android.bluetooth.le.ScanFilter> filters, java.util.List scanStorages, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(scannerId);
if ((settings!=null)) {
_data.writeInt(1);
settings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeTypedList(filters);
_data.writeList(scanStorages);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_startScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startScanForIntent(android.app.PendingIntent intent, android.bluetooth.le.ScanSettings settings, java.util.List<android.bluetooth.le.ScanFilter> filters, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((settings!=null)) {
_data.writeInt(1);
settings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeTypedList(filters);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_startScanForIntent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopScanForIntent(android.app.PendingIntent intent, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_stopScanForIntent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopScan(int scannerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(scannerId);
mRemote.transact(Stub.TRANSACTION_stopScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void flushPendingBatchResults(int scannerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(scannerId);
mRemote.transact(Stub.TRANSACTION_flushPendingBatchResults, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters parameters, android.bluetooth.le.AdvertiseData advertiseData, android.bluetooth.le.AdvertiseData scanResponse, android.bluetooth.le.PeriodicAdvertisingParameters periodicParameters, android.bluetooth.le.AdvertiseData periodicData, int duration, int maxExtAdvEvents, android.bluetooth.le.IAdvertisingSetCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((parameters!=null)) {
_data.writeInt(1);
parameters.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((advertiseData!=null)) {
_data.writeInt(1);
advertiseData.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((scanResponse!=null)) {
_data.writeInt(1);
scanResponse.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((periodicParameters!=null)) {
_data.writeInt(1);
periodicParameters.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((periodicData!=null)) {
_data.writeInt(1);
periodicData.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(duration);
_data.writeInt(maxExtAdvEvents);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startAdvertisingSet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopAdvertisingSet(android.bluetooth.le.IAdvertisingSetCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopAdvertisingSet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getOwnAddress(int advertiserId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
mRemote.transact(Stub.TRANSACTION_getOwnAddress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enableAdvertisingSet(int advertiserId, boolean enable, int duration, int maxExtAdvEvents) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(((enable)?(1):(0)));
_data.writeInt(duration);
_data.writeInt(maxExtAdvEvents);
mRemote.transact(Stub.TRANSACTION_enableAdvertisingSet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAdvertisingData(int advertiserId, android.bluetooth.le.AdvertiseData data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setAdvertisingData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setScanResponseData(int advertiserId, android.bluetooth.le.AdvertiseData data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setScanResponseData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAdvertisingParameters(int advertiserId, android.bluetooth.le.AdvertisingSetParameters parameters) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
if ((parameters!=null)) {
_data.writeInt(1);
parameters.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setAdvertisingParameters, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setPeriodicAdvertisingParameters(int advertiserId, android.bluetooth.le.PeriodicAdvertisingParameters parameters) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
if ((parameters!=null)) {
_data.writeInt(1);
parameters.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setPeriodicAdvertisingParameters, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setPeriodicAdvertisingData(int advertiserId, android.bluetooth.le.AdvertiseData data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setPeriodicAdvertisingData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setPeriodicAdvertisingEnable(int advertiserId, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPeriodicAdvertisingEnable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerSync(android.bluetooth.le.ScanResult scanResult, int skip, int timeout, android.bluetooth.le.IPeriodicAdvertisingCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((scanResult!=null)) {
_data.writeInt(1);
scanResult.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(skip);
_data.writeInt(timeout);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterSync(android.bluetooth.le.IPeriodicAdvertisingCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerClient(android.os.ParcelUuid appId, android.bluetooth.IBluetoothGattCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((appId!=null)) {
_data.writeInt(1);
appId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerClient, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterClient(int clientIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
mRemote.transact(Stub.TRANSACTION_unregisterClient, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clientConnect(int clientIf, java.lang.String address, boolean isDirect, int transport, boolean opportunistic, int phy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(((isDirect)?(1):(0)));
_data.writeInt(transport);
_data.writeInt(((opportunistic)?(1):(0)));
_data.writeInt(phy);
mRemote.transact(Stub.TRANSACTION_clientConnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clientDisconnect(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_clientDisconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clientSetPreferredPhy(int clientIf, java.lang.String address, int txPhy, int rxPhy, int phyOptions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(txPhy);
_data.writeInt(rxPhy);
_data.writeInt(phyOptions);
mRemote.transact(Stub.TRANSACTION_clientSetPreferredPhy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clientReadPhy(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_clientReadPhy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void refreshDevice(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_refreshDevice, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void discoverServices(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_discoverServices, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void discoverServiceByUuid(int clientIf, java.lang.String address, android.os.ParcelUuid uuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
if ((uuid!=null)) {
_data.writeInt(1);
uuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_discoverServiceByUuid, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void readCharacteristic(int clientIf, java.lang.String address, int handle, int authReq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(handle);
_data.writeInt(authReq);
mRemote.transact(Stub.TRANSACTION_readCharacteristic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void readUsingCharacteristicUuid(int clientIf, java.lang.String address, android.os.ParcelUuid uuid, int startHandle, int endHandle, int authReq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
if ((uuid!=null)) {
_data.writeInt(1);
uuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(startHandle);
_data.writeInt(endHandle);
_data.writeInt(authReq);
mRemote.transact(Stub.TRANSACTION_readUsingCharacteristicUuid, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void writeCharacteristic(int clientIf, java.lang.String address, int handle, int writeType, int authReq, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(handle);
_data.writeInt(writeType);
_data.writeInt(authReq);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_writeCharacteristic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void readDescriptor(int clientIf, java.lang.String address, int handle, int authReq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(handle);
_data.writeInt(authReq);
mRemote.transact(Stub.TRANSACTION_readDescriptor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void writeDescriptor(int clientIf, java.lang.String address, int handle, int authReq, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(handle);
_data.writeInt(authReq);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_writeDescriptor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerForNotification(int clientIf, java.lang.String address, int handle, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(handle);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_registerForNotification, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void beginReliableWrite(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_beginReliableWrite, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void endReliableWrite(int clientIf, java.lang.String address, boolean execute) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(((execute)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_endReliableWrite, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void readRemoteRssi(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_readRemoteRssi, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void configureMTU(int clientIf, java.lang.String address, int mtu) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(mtu);
mRemote.transact(Stub.TRANSACTION_configureMTU, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void connectionParameterUpdate(int clientIf, java.lang.String address, int connectionPriority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(connectionPriority);
mRemote.transact(Stub.TRANSACTION_connectionParameterUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerServer(android.os.ParcelUuid appId, android.bluetooth.IBluetoothGattServerCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((appId!=null)) {
_data.writeInt(1);
appId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerServer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterServer(int serverIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
mRemote.transact(Stub.TRANSACTION_unregisterServer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void serverConnect(int serverIf, java.lang.String address, boolean isDirect, int transport) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeString(address);
_data.writeInt(((isDirect)?(1):(0)));
_data.writeInt(transport);
mRemote.transact(Stub.TRANSACTION_serverConnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void serverDisconnect(int serverIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_serverDisconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void serverSetPreferredPhy(int clientIf, java.lang.String address, int txPhy, int rxPhy, int phyOptions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(txPhy);
_data.writeInt(rxPhy);
_data.writeInt(phyOptions);
mRemote.transact(Stub.TRANSACTION_serverSetPreferredPhy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void serverReadPhy(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_serverReadPhy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addService(int serverIf, android.bluetooth.BluetoothGattService service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
if ((service!=null)) {
_data.writeInt(1);
service.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeService(int serverIf, int handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeInt(handle);
mRemote.transact(Stub.TRANSACTION_removeService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearServices(int serverIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
mRemote.transact(Stub.TRANSACTION_clearServices, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendResponse(int serverIf, java.lang.String address, int requestId, int status, int offset, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeString(address);
_data.writeInt(requestId);
_data.writeInt(status);
_data.writeInt(offset);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_sendResponse, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendNotification(int serverIf, java.lang.String address, int handle, boolean confirm, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeString(address);
_data.writeInt(handle);
_data.writeInt(((confirm)?(1):(0)));
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_sendNotification, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disconnectAll() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnectAll, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregAll() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_unregAll, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int numHwTrackFiltersAvailable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_numHwTrackFiltersAvailable, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getDevicesMatchingConnectionStates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_registerScanner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_unregisterScanner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_startScanForIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_stopScanForIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_stopScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_flushPendingBatchResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_startAdvertisingSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_stopAdvertisingSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getOwnAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_enableAdvertisingSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setAdvertisingData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setScanResponseData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setAdvertisingParameters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_setPeriodicAdvertisingParameters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setPeriodicAdvertisingData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setPeriodicAdvertisingEnable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_registerSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_unregisterSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_registerClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_unregisterClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_clientConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_clientDisconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_clientSetPreferredPhy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_clientReadPhy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_refreshDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_discoverServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_discoverServiceByUuid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_readCharacteristic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_readUsingCharacteristicUuid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_writeCharacteristic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_readDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_writeDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_registerForNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_beginReliableWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_endReliableWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_readRemoteRssi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_configureMTU = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_connectionParameterUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_registerServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_unregisterServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_serverConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_serverDisconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_serverSetPreferredPhy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_serverReadPhy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_addService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_removeService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_clearServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_sendResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_sendNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_disconnectAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_unregAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_numHwTrackFiltersAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
}
public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) throws android.os.RemoteException;
public void registerScanner(android.bluetooth.le.IScannerCallback callback, android.os.WorkSource workSource) throws android.os.RemoteException;
public void unregisterScanner(int scannerId) throws android.os.RemoteException;
public void startScan(int scannerId, android.bluetooth.le.ScanSettings settings, java.util.List<android.bluetooth.le.ScanFilter> filters, java.util.List scanStorages, java.lang.String callingPackage) throws android.os.RemoteException;
public void startScanForIntent(android.app.PendingIntent intent, android.bluetooth.le.ScanSettings settings, java.util.List<android.bluetooth.le.ScanFilter> filters, java.lang.String callingPackage) throws android.os.RemoteException;
public void stopScanForIntent(android.app.PendingIntent intent, java.lang.String callingPackage) throws android.os.RemoteException;
public void stopScan(int scannerId) throws android.os.RemoteException;
public void flushPendingBatchResults(int scannerId) throws android.os.RemoteException;
public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters parameters, android.bluetooth.le.AdvertiseData advertiseData, android.bluetooth.le.AdvertiseData scanResponse, android.bluetooth.le.PeriodicAdvertisingParameters periodicParameters, android.bluetooth.le.AdvertiseData periodicData, int duration, int maxExtAdvEvents, android.bluetooth.le.IAdvertisingSetCallback callback) throws android.os.RemoteException;
public void stopAdvertisingSet(android.bluetooth.le.IAdvertisingSetCallback callback) throws android.os.RemoteException;
public void getOwnAddress(int advertiserId) throws android.os.RemoteException;
public void enableAdvertisingSet(int advertiserId, boolean enable, int duration, int maxExtAdvEvents) throws android.os.RemoteException;
public void setAdvertisingData(int advertiserId, android.bluetooth.le.AdvertiseData data) throws android.os.RemoteException;
public void setScanResponseData(int advertiserId, android.bluetooth.le.AdvertiseData data) throws android.os.RemoteException;
public void setAdvertisingParameters(int advertiserId, android.bluetooth.le.AdvertisingSetParameters parameters) throws android.os.RemoteException;
public void setPeriodicAdvertisingParameters(int advertiserId, android.bluetooth.le.PeriodicAdvertisingParameters parameters) throws android.os.RemoteException;
public void setPeriodicAdvertisingData(int advertiserId, android.bluetooth.le.AdvertiseData data) throws android.os.RemoteException;
public void setPeriodicAdvertisingEnable(int advertiserId, boolean enable) throws android.os.RemoteException;
public void registerSync(android.bluetooth.le.ScanResult scanResult, int skip, int timeout, android.bluetooth.le.IPeriodicAdvertisingCallback callback) throws android.os.RemoteException;
public void unregisterSync(android.bluetooth.le.IPeriodicAdvertisingCallback callback) throws android.os.RemoteException;
public void registerClient(android.os.ParcelUuid appId, android.bluetooth.IBluetoothGattCallback callback) throws android.os.RemoteException;
public void unregisterClient(int clientIf) throws android.os.RemoteException;
public void clientConnect(int clientIf, java.lang.String address, boolean isDirect, int transport, boolean opportunistic, int phy) throws android.os.RemoteException;
public void clientDisconnect(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void clientSetPreferredPhy(int clientIf, java.lang.String address, int txPhy, int rxPhy, int phyOptions) throws android.os.RemoteException;
public void clientReadPhy(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void refreshDevice(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void discoverServices(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void discoverServiceByUuid(int clientIf, java.lang.String address, android.os.ParcelUuid uuid) throws android.os.RemoteException;
public void readCharacteristic(int clientIf, java.lang.String address, int handle, int authReq) throws android.os.RemoteException;
public void readUsingCharacteristicUuid(int clientIf, java.lang.String address, android.os.ParcelUuid uuid, int startHandle, int endHandle, int authReq) throws android.os.RemoteException;
public void writeCharacteristic(int clientIf, java.lang.String address, int handle, int writeType, int authReq, byte[] value) throws android.os.RemoteException;
public void readDescriptor(int clientIf, java.lang.String address, int handle, int authReq) throws android.os.RemoteException;
public void writeDescriptor(int clientIf, java.lang.String address, int handle, int authReq, byte[] value) throws android.os.RemoteException;
public void registerForNotification(int clientIf, java.lang.String address, int handle, boolean enable) throws android.os.RemoteException;
public void beginReliableWrite(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void endReliableWrite(int clientIf, java.lang.String address, boolean execute) throws android.os.RemoteException;
public void readRemoteRssi(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void configureMTU(int clientIf, java.lang.String address, int mtu) throws android.os.RemoteException;
public void connectionParameterUpdate(int clientIf, java.lang.String address, int connectionPriority) throws android.os.RemoteException;
public void registerServer(android.os.ParcelUuid appId, android.bluetooth.IBluetoothGattServerCallback callback) throws android.os.RemoteException;
public void unregisterServer(int serverIf) throws android.os.RemoteException;
public void serverConnect(int serverIf, java.lang.String address, boolean isDirect, int transport) throws android.os.RemoteException;
public void serverDisconnect(int serverIf, java.lang.String address) throws android.os.RemoteException;
public void serverSetPreferredPhy(int clientIf, java.lang.String address, int txPhy, int rxPhy, int phyOptions) throws android.os.RemoteException;
public void serverReadPhy(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void addService(int serverIf, android.bluetooth.BluetoothGattService service) throws android.os.RemoteException;
public void removeService(int serverIf, int handle) throws android.os.RemoteException;
public void clearServices(int serverIf) throws android.os.RemoteException;
public void sendResponse(int serverIf, java.lang.String address, int requestId, int status, int offset, byte[] value) throws android.os.RemoteException;
public void sendNotification(int serverIf, java.lang.String address, int handle, boolean confirm, byte[] value) throws android.os.RemoteException;
public void disconnectAll() throws android.os.RemoteException;
public void unregAll() throws android.os.RemoteException;
public int numHwTrackFiltersAvailable() throws android.os.RemoteException;
}
