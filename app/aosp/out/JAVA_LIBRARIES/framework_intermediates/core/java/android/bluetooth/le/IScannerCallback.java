/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/le/IScannerCallback.aidl
 */
package android.bluetooth.le;
/**
 * Callback definitions for interacting with Advertiser
 * @hide
 */
public interface IScannerCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.le.IScannerCallback
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.le.IScannerCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.le.IScannerCallback interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.le.IScannerCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.le.IScannerCallback))) {
return ((android.bluetooth.le.IScannerCallback)iin);
}
return new android.bluetooth.le.IScannerCallback.Stub.Proxy(obj);
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
case TRANSACTION_onScannerRegistered:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onScannerRegistered(_arg0, _arg1);
return true;
}
case TRANSACTION_onScanResult:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.le.ScanResult _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.le.ScanResult.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onScanResult(_arg0);
return true;
}
case TRANSACTION_onBatchScanResults:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bluetooth.le.ScanResult> _arg0;
_arg0 = data.createTypedArrayList(android.bluetooth.le.ScanResult.CREATOR);
this.onBatchScanResults(_arg0);
return true;
}
case TRANSACTION_onFoundOrLost:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.bluetooth.le.ScanResult _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.ScanResult.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onFoundOrLost(_arg0, _arg1);
return true;
}
case TRANSACTION_onScanManagerErrorCallback:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onScanManagerErrorCallback(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.le.IScannerCallback
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
@Override public void onScannerRegistered(int status, int scannerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(scannerId);
mRemote.transact(Stub.TRANSACTION_onScannerRegistered, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScanResult(android.bluetooth.le.ScanResult scanResult) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((scanResult!=null)) {
_data.writeInt(1);
scanResult.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onScanResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> batchResults) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(batchResults);
mRemote.transact(Stub.TRANSACTION_onBatchScanResults, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onFoundOrLost(boolean onFound, android.bluetooth.le.ScanResult scanResult) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((onFound)?(1):(0)));
if ((scanResult!=null)) {
_data.writeInt(1);
scanResult.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onFoundOrLost, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScanManagerErrorCallback(int errorCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorCode);
mRemote.transact(Stub.TRANSACTION_onScanManagerErrorCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onScannerRegistered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onScanResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onBatchScanResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onFoundOrLost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onScanManagerErrorCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onScannerRegistered(int status, int scannerId) throws android.os.RemoteException;
public void onScanResult(android.bluetooth.le.ScanResult scanResult) throws android.os.RemoteException;
public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> batchResults) throws android.os.RemoteException;
public void onFoundOrLost(boolean onFound, android.bluetooth.le.ScanResult scanResult) throws android.os.RemoteException;
public void onScanManagerErrorCallback(int errorCode) throws android.os.RemoteException;
}
