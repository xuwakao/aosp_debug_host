/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/companion/ICompanionDeviceDiscoveryService.aidl
 */
package android.companion;
/** @hide */
public interface ICompanionDeviceDiscoveryService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceDiscoveryService
{
private static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceDiscoveryService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.companion.ICompanionDeviceDiscoveryService interface,
 * generating a proxy if needed.
 */
public static android.companion.ICompanionDeviceDiscoveryService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.companion.ICompanionDeviceDiscoveryService))) {
return ((android.companion.ICompanionDeviceDiscoveryService)iin);
}
return new android.companion.ICompanionDeviceDiscoveryService.Stub.Proxy(obj);
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
case TRANSACTION_startDiscovery:
{
data.enforceInterface(DESCRIPTOR);
android.companion.AssociationRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.companion.AssociationRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
android.companion.IFindDeviceCallback _arg2;
_arg2 = android.companion.IFindDeviceCallback.Stub.asInterface(data.readStrongBinder());
android.companion.ICompanionDeviceDiscoveryServiceCallback _arg3;
_arg3 = android.companion.ICompanionDeviceDiscoveryServiceCallback.Stub.asInterface(data.readStrongBinder());
this.startDiscovery(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.companion.ICompanionDeviceDiscoveryService
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
@Override public void startDiscovery(android.companion.AssociationRequest request, java.lang.String callingPackage, android.companion.IFindDeviceCallback findCallback, android.companion.ICompanionDeviceDiscoveryServiceCallback serviceCallback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callingPackage);
_data.writeStrongBinder((((findCallback!=null))?(findCallback.asBinder()):(null)));
_data.writeStrongBinder((((serviceCallback!=null))?(serviceCallback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startDiscovery, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_startDiscovery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void startDiscovery(android.companion.AssociationRequest request, java.lang.String callingPackage, android.companion.IFindDeviceCallback findCallback, android.companion.ICompanionDeviceDiscoveryServiceCallback serviceCallback) throws android.os.RemoteException;
}
