/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/lowpan/java/android/net/lowpan/ILowpanEnergyScanCallback.aidl
 */
package android.net.lowpan;
/** {@hide} */
public interface ILowpanEnergyScanCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanEnergyScanCallback
{
private static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanEnergyScanCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.lowpan.ILowpanEnergyScanCallback interface,
 * generating a proxy if needed.
 */
public static android.net.lowpan.ILowpanEnergyScanCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.lowpan.ILowpanEnergyScanCallback))) {
return ((android.net.lowpan.ILowpanEnergyScanCallback)iin);
}
return new android.net.lowpan.ILowpanEnergyScanCallback.Stub.Proxy(obj);
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
case TRANSACTION_onEnergyScanResult:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onEnergyScanResult(_arg0, _arg1);
return true;
}
case TRANSACTION_onEnergyScanFinished:
{
data.enforceInterface(DESCRIPTOR);
this.onEnergyScanFinished();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.lowpan.ILowpanEnergyScanCallback
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
@Override public void onEnergyScanResult(int channel, int rssi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(rssi);
mRemote.transact(Stub.TRANSACTION_onEnergyScanResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onEnergyScanFinished() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onEnergyScanFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onEnergyScanResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onEnergyScanFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onEnergyScanResult(int channel, int rssi) throws android.os.RemoteException;
public void onEnergyScanFinished() throws android.os.RemoteException;
}
