/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/wifi/java/android/net/wifi/IRttManager.aidl
 */
package android.net.wifi;
/**
 * {@hide}
 */
public interface IRttManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IRttManager
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IRttManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IRttManager interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IRttManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IRttManager))) {
return ((android.net.wifi.IRttManager)iin);
}
return new android.net.wifi.IRttManager.Stub.Proxy(obj);
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
case TRANSACTION_getMessenger:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new int[_arg1_length];
}
android.os.Messenger _result = this.getMessenger(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
reply.writeIntArray(_arg1);
return true;
}
case TRANSACTION_getRttCapabilities:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.RttManager.RttCapabilities _result = this.getRttCapabilities();
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.wifi.IRttManager
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
@Override public android.os.Messenger getMessenger(android.os.IBinder binder, int[] key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Messenger _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(binder);
if ((key==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(key.length);
}
mRemote.transact(Stub.TRANSACTION_getMessenger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Messenger.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
_reply.readIntArray(key);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.wifi.RttManager.RttCapabilities getRttCapabilities() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.wifi.RttManager.RttCapabilities _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRttCapabilities, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.wifi.RttManager.RttCapabilities.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_getMessenger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getRttCapabilities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public android.os.Messenger getMessenger(android.os.IBinder binder, int[] key) throws android.os.RemoteException;
public android.net.wifi.RttManager.RttCapabilities getRttCapabilities() throws android.os.RemoteException;
}
