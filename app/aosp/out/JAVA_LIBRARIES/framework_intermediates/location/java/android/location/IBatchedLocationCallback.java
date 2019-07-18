/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/location/java/android/location/IBatchedLocationCallback.aidl
 */
package android.location;
/**
 * {@hide}
 */
public interface IBatchedLocationCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.IBatchedLocationCallback
{
private static final java.lang.String DESCRIPTOR = "android.location.IBatchedLocationCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.IBatchedLocationCallback interface,
 * generating a proxy if needed.
 */
public static android.location.IBatchedLocationCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.IBatchedLocationCallback))) {
return ((android.location.IBatchedLocationCallback)iin);
}
return new android.location.IBatchedLocationCallback.Stub.Proxy(obj);
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
case TRANSACTION_onLocationBatch:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.location.Location> _arg0;
_arg0 = data.createTypedArrayList(android.location.Location.CREATOR);
this.onLocationBatch(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.IBatchedLocationCallback
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
@Override public void onLocationBatch(java.util.List<android.location.Location> locations) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(locations);
mRemote.transact(Stub.TRANSACTION_onLocationBatch, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onLocationBatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onLocationBatch(java.util.List<android.location.Location> locations) throws android.os.RemoteException;
}
