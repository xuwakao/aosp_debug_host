/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/le/IAdvertisingSetCallback.aidl
 */
package android.bluetooth.le;
/**
 * Callback definitions for interacting with Advertiser
 * @hide
 */
public interface IAdvertisingSetCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.le.IAdvertisingSetCallback
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.le.IAdvertisingSetCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.le.IAdvertisingSetCallback interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.le.IAdvertisingSetCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.le.IAdvertisingSetCallback))) {
return ((android.bluetooth.le.IAdvertisingSetCallback)iin);
}
return new android.bluetooth.le.IAdvertisingSetCallback.Stub.Proxy(obj);
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
case TRANSACTION_onAdvertisingSetStarted:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onAdvertisingSetStarted(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onOwnAddressRead:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.onOwnAddressRead(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onAdvertisingSetStopped:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onAdvertisingSetStopped(_arg0);
return true;
}
case TRANSACTION_onAdvertisingEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.onAdvertisingEnabled(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onAdvertisingDataSet:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onAdvertisingDataSet(_arg0, _arg1);
return true;
}
case TRANSACTION_onScanResponseDataSet:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onScanResponseDataSet(_arg0, _arg1);
return true;
}
case TRANSACTION_onAdvertisingParametersUpdated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onAdvertisingParametersUpdated(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onPeriodicAdvertisingParametersUpdated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onPeriodicAdvertisingParametersUpdated(_arg0, _arg1);
return true;
}
case TRANSACTION_onPeriodicAdvertisingDataSet:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onPeriodicAdvertisingDataSet(_arg0, _arg1);
return true;
}
case TRANSACTION_onPeriodicAdvertisingEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.onPeriodicAdvertisingEnabled(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.le.IAdvertisingSetCallback
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
@Override public void onAdvertisingSetStarted(int advertiserId, int tx_power, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(tx_power);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onAdvertisingSetStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onOwnAddressRead(int advertiserId, int addressType, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(addressType);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_onOwnAddressRead, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAdvertisingSetStopped(int advertiserId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
mRemote.transact(Stub.TRANSACTION_onAdvertisingSetStopped, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAdvertisingEnabled(int advertiserId, boolean enable, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(((enable)?(1):(0)));
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onAdvertisingEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAdvertisingDataSet(int advertiserId, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onAdvertisingDataSet, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScanResponseDataSet(int advertiserId, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onScanResponseDataSet, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAdvertisingParametersUpdated(int advertiserId, int tx_power, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(tx_power);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onAdvertisingParametersUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPeriodicAdvertisingParametersUpdated(int advertiserId, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onPeriodicAdvertisingParametersUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPeriodicAdvertisingDataSet(int advertiserId, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onPeriodicAdvertisingDataSet, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPeriodicAdvertisingEnabled(int advertiserId, boolean enable, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiserId);
_data.writeInt(((enable)?(1):(0)));
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onPeriodicAdvertisingEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onAdvertisingSetStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onOwnAddressRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onAdvertisingSetStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onAdvertisingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onAdvertisingDataSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onScanResponseDataSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onAdvertisingParametersUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onPeriodicAdvertisingParametersUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onPeriodicAdvertisingDataSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onPeriodicAdvertisingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public void onAdvertisingSetStarted(int advertiserId, int tx_power, int status) throws android.os.RemoteException;
public void onOwnAddressRead(int advertiserId, int addressType, java.lang.String address) throws android.os.RemoteException;
public void onAdvertisingSetStopped(int advertiserId) throws android.os.RemoteException;
public void onAdvertisingEnabled(int advertiserId, boolean enable, int status) throws android.os.RemoteException;
public void onAdvertisingDataSet(int advertiserId, int status) throws android.os.RemoteException;
public void onScanResponseDataSet(int advertiserId, int status) throws android.os.RemoteException;
public void onAdvertisingParametersUpdated(int advertiserId, int tx_power, int status) throws android.os.RemoteException;
public void onPeriodicAdvertisingParametersUpdated(int advertiserId, int status) throws android.os.RemoteException;
public void onPeriodicAdvertisingDataSet(int advertiserId, int status) throws android.os.RemoteException;
public void onPeriodicAdvertisingEnabled(int advertiserId, boolean enable, int status) throws android.os.RemoteException;
}
