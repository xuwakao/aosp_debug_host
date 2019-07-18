/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/wifi/java/android/net/wifi/aware/IWifiAwareDiscoverySessionCallback.aidl
 */
package android.net.wifi.aware;
/**
 * Callback interface that WifiAwareManager implements
 *
 * {@hide}
 */
public interface IWifiAwareDiscoverySessionCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.aware.IWifiAwareDiscoverySessionCallback
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.aware.IWifiAwareDiscoverySessionCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.aware.IWifiAwareDiscoverySessionCallback interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.aware.IWifiAwareDiscoverySessionCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.aware.IWifiAwareDiscoverySessionCallback))) {
return ((android.net.wifi.aware.IWifiAwareDiscoverySessionCallback)iin);
}
return new android.net.wifi.aware.IWifiAwareDiscoverySessionCallback.Stub.Proxy(obj);
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
case TRANSACTION_onSessionStarted:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSessionStarted(_arg0);
return true;
}
case TRANSACTION_onSessionConfigSuccess:
{
data.enforceInterface(DESCRIPTOR);
this.onSessionConfigSuccess();
return true;
}
case TRANSACTION_onSessionConfigFail:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSessionConfigFail(_arg0);
return true;
}
case TRANSACTION_onSessionTerminated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSessionTerminated(_arg0);
return true;
}
case TRANSACTION_onMatch:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
byte[] _arg2;
_arg2 = data.createByteArray();
this.onMatch(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onMessageSendSuccess:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onMessageSendSuccess(_arg0);
return true;
}
case TRANSACTION_onMessageSendFail:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onMessageSendFail(_arg0, _arg1);
return true;
}
case TRANSACTION_onMessageReceived:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
this.onMessageReceived(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.wifi.aware.IWifiAwareDiscoverySessionCallback
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
@Override public void onSessionStarted(int discoverySessionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(discoverySessionId);
mRemote.transact(Stub.TRANSACTION_onSessionStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSessionConfigSuccess() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onSessionConfigSuccess, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSessionConfigFail(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onSessionConfigFail, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSessionTerminated(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onSessionTerminated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMatch(int peerId, byte[] serviceSpecificInfo, byte[] matchFilter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(peerId);
_data.writeByteArray(serviceSpecificInfo);
_data.writeByteArray(matchFilter);
mRemote.transact(Stub.TRANSACTION_onMatch, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMessageSendSuccess(int messageId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageId);
mRemote.transact(Stub.TRANSACTION_onMessageSendSuccess, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMessageSendFail(int messageId, int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageId);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onMessageSendFail, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMessageReceived(int peerId, byte[] message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(peerId);
_data.writeByteArray(message);
mRemote.transact(Stub.TRANSACTION_onMessageReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onSessionStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSessionConfigSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSessionConfigFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onSessionTerminated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onMatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onMessageSendSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onMessageSendFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onMessageReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void onSessionStarted(int discoverySessionId) throws android.os.RemoteException;
public void onSessionConfigSuccess() throws android.os.RemoteException;
public void onSessionConfigFail(int reason) throws android.os.RemoteException;
public void onSessionTerminated(int reason) throws android.os.RemoteException;
public void onMatch(int peerId, byte[] serviceSpecificInfo, byte[] matchFilter) throws android.os.RemoteException;
public void onMessageSendSuccess(int messageId) throws android.os.RemoteException;
public void onMessageSendFail(int messageId, int reason) throws android.os.RemoteException;
public void onMessageReceived(int peerId, byte[] message) throws android.os.RemoteException;
}
