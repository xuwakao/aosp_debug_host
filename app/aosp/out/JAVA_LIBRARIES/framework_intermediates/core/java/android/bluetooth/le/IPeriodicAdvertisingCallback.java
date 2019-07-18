/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/le/IPeriodicAdvertisingCallback.aidl
 */
package android.bluetooth.le;
/**
 * Callback definitions for interacting with Periodic Advertising
 * @hide
 */
public interface IPeriodicAdvertisingCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.le.IPeriodicAdvertisingCallback
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.le.IPeriodicAdvertisingCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.le.IPeriodicAdvertisingCallback interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.le.IPeriodicAdvertisingCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.le.IPeriodicAdvertisingCallback))) {
return ((android.bluetooth.le.IPeriodicAdvertisingCallback)iin);
}
return new android.bluetooth.le.IPeriodicAdvertisingCallback.Stub.Proxy(obj);
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
case TRANSACTION_onSyncEstablished:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.BluetoothDevice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
this.onSyncEstablished(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
return true;
}
case TRANSACTION_onPeriodicAdvertisingReport:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.le.PeriodicAdvertisingReport _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.le.PeriodicAdvertisingReport.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onPeriodicAdvertisingReport(_arg0);
return true;
}
case TRANSACTION_onSyncLost:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSyncLost(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.le.IPeriodicAdvertisingCallback
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
@Override public void onSyncEstablished(int syncHandle, android.bluetooth.BluetoothDevice device, int advertisingSid, int skip, int timeout, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(syncHandle);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(advertisingSid);
_data.writeInt(skip);
_data.writeInt(timeout);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onSyncEstablished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPeriodicAdvertisingReport(android.bluetooth.le.PeriodicAdvertisingReport report) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((report!=null)) {
_data.writeInt(1);
report.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onPeriodicAdvertisingReport, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSyncLost(int syncHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(syncHandle);
mRemote.transact(Stub.TRANSACTION_onSyncLost, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onSyncEstablished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onPeriodicAdvertisingReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSyncLost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onSyncEstablished(int syncHandle, android.bluetooth.BluetoothDevice device, int advertisingSid, int skip, int timeout, int status) throws android.os.RemoteException;
public void onPeriodicAdvertisingReport(android.bluetooth.le.PeriodicAdvertisingReport report) throws android.os.RemoteException;
public void onSyncLost(int syncHandle) throws android.os.RemoteException;
}
