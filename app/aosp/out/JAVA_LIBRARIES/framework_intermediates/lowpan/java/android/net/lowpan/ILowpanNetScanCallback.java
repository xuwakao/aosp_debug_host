/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/lowpan/java/android/net/lowpan/ILowpanNetScanCallback.aidl
 */
package android.net.lowpan;
/** {@hide} */
public interface ILowpanNetScanCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanNetScanCallback
{
private static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanNetScanCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.lowpan.ILowpanNetScanCallback interface,
 * generating a proxy if needed.
 */
public static android.net.lowpan.ILowpanNetScanCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.lowpan.ILowpanNetScanCallback))) {
return ((android.net.lowpan.ILowpanNetScanCallback)iin);
}
return new android.net.lowpan.ILowpanNetScanCallback.Stub.Proxy(obj);
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
case TRANSACTION_onNetScanBeacon:
{
data.enforceInterface(DESCRIPTOR);
android.net.lowpan.LowpanBeaconInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.lowpan.LowpanBeaconInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onNetScanBeacon(_arg0);
return true;
}
case TRANSACTION_onNetScanFinished:
{
data.enforceInterface(DESCRIPTOR);
this.onNetScanFinished();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.lowpan.ILowpanNetScanCallback
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
@Override public void onNetScanBeacon(android.net.lowpan.LowpanBeaconInfo beacon) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((beacon!=null)) {
_data.writeInt(1);
beacon.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onNetScanBeacon, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNetScanFinished() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onNetScanFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onNetScanBeacon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onNetScanFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onNetScanBeacon(android.net.lowpan.LowpanBeaconInfo beacon) throws android.os.RemoteException;
public void onNetScanFinished() throws android.os.RemoteException;
}
