/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/wifi/java/android/net/wifi/aware/IWifiAwareEventCallback.aidl
 */
package android.net.wifi.aware;
/**
 * Callback interface that WifiAwareManager implements
 *
 * {@hide}
 */
public interface IWifiAwareEventCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.aware.IWifiAwareEventCallback
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.aware.IWifiAwareEventCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.aware.IWifiAwareEventCallback interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.aware.IWifiAwareEventCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.aware.IWifiAwareEventCallback))) {
return ((android.net.wifi.aware.IWifiAwareEventCallback)iin);
}
return new android.net.wifi.aware.IWifiAwareEventCallback.Stub.Proxy(obj);
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
case TRANSACTION_onConnectSuccess:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onConnectSuccess(_arg0);
return true;
}
case TRANSACTION_onConnectFail:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onConnectFail(_arg0);
return true;
}
case TRANSACTION_onIdentityChanged:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.onIdentityChanged(_arg0);
return true;
}
case TRANSACTION_onRangingSuccess:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.wifi.RttManager.ParcelableRttResults _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.wifi.RttManager.ParcelableRttResults.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onRangingSuccess(_arg0, _arg1);
return true;
}
case TRANSACTION_onRangingFailure:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.onRangingFailure(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onRangingAborted:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onRangingAborted(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.wifi.aware.IWifiAwareEventCallback
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
@Override public void onConnectSuccess(int clientId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientId);
mRemote.transact(Stub.TRANSACTION_onConnectSuccess, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConnectFail(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onConnectFail, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onIdentityChanged(byte[] mac) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(mac);
mRemote.transact(Stub.TRANSACTION_onIdentityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRangingSuccess(int rangingId, android.net.wifi.RttManager.ParcelableRttResults results) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rangingId);
if ((results!=null)) {
_data.writeInt(1);
results.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onRangingSuccess, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRangingFailure(int rangingId, int reason, java.lang.String description) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rangingId);
_data.writeInt(reason);
_data.writeString(description);
mRemote.transact(Stub.TRANSACTION_onRangingFailure, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRangingAborted(int rangingId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rangingId);
mRemote.transact(Stub.TRANSACTION_onRangingAborted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConnectSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onConnectFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onIdentityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onRangingSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onRangingFailure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onRangingAborted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void onConnectSuccess(int clientId) throws android.os.RemoteException;
public void onConnectFail(int reason) throws android.os.RemoteException;
public void onIdentityChanged(byte[] mac) throws android.os.RemoteException;
public void onRangingSuccess(int rangingId, android.net.wifi.RttManager.ParcelableRttResults results) throws android.os.RemoteException;
public void onRangingFailure(int rangingId, int reason, java.lang.String description) throws android.os.RemoteException;
public void onRangingAborted(int rangingId) throws android.os.RemoteException;
}
