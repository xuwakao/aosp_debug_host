/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/location/IContextHubCallback.aidl
 */
package android.hardware.location;
/**
 * @hide
 */
public interface IContextHubCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IContextHubCallback
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IContextHubCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IContextHubCallback interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IContextHubCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IContextHubCallback))) {
return ((android.hardware.location.IContextHubCallback)iin);
}
return new android.hardware.location.IContextHubCallback.Stub.Proxy(obj);
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
case TRANSACTION_onMessageReceipt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.hardware.location.ContextHubMessage _arg2;
if ((0!=data.readInt())) {
_arg2 = android.hardware.location.ContextHubMessage.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onMessageReceipt(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IContextHubCallback
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
@Override public void onMessageReceipt(int hubId, int nanoAppId, android.hardware.location.ContextHubMessage msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(hubId);
_data.writeInt(nanoAppId);
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onMessageReceipt, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onMessageReceipt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onMessageReceipt(int hubId, int nanoAppId, android.hardware.location.ContextHubMessage msg) throws android.os.RemoteException;
}
