/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/companion/ICompanionDeviceDiscoveryServiceCallback.aidl
 */
package android.companion;
/** @hide */
public interface ICompanionDeviceDiscoveryServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceDiscoveryServiceCallback
{
private static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceDiscoveryServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.companion.ICompanionDeviceDiscoveryServiceCallback interface,
 * generating a proxy if needed.
 */
public static android.companion.ICompanionDeviceDiscoveryServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.companion.ICompanionDeviceDiscoveryServiceCallback))) {
return ((android.companion.ICompanionDeviceDiscoveryServiceCallback)iin);
}
return new android.companion.ICompanionDeviceDiscoveryServiceCallback.Stub.Proxy(obj);
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
case TRANSACTION_onDeviceSelected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.onDeviceSelected(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onDeviceSelectionCancel:
{
data.enforceInterface(DESCRIPTOR);
this.onDeviceSelectionCancel();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.companion.ICompanionDeviceDiscoveryServiceCallback
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
@Override public void onDeviceSelected(java.lang.String packageName, int userId, java.lang.String deviceAddress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeString(deviceAddress);
mRemote.transact(Stub.TRANSACTION_onDeviceSelected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDeviceSelectionCancel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDeviceSelectionCancel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onDeviceSelected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onDeviceSelectionCancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onDeviceSelected(java.lang.String packageName, int userId, java.lang.String deviceAddress) throws android.os.RemoteException;
public void onDeviceSelectionCancel() throws android.os.RemoteException;
}
