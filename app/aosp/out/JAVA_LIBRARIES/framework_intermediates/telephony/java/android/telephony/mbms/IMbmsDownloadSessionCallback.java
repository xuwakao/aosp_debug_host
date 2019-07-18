/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/android/telephony/mbms/IMbmsDownloadSessionCallback.aidl
 */
package android.telephony.mbms;
/**
 * The interface the clients top-level file download listener will satisfy.
 * @hide
 */
public interface IMbmsDownloadSessionCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IMbmsDownloadSessionCallback
{
private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IMbmsDownloadSessionCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.telephony.mbms.IMbmsDownloadSessionCallback interface,
 * generating a proxy if needed.
 */
public static android.telephony.mbms.IMbmsDownloadSessionCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.telephony.mbms.IMbmsDownloadSessionCallback))) {
return ((android.telephony.mbms.IMbmsDownloadSessionCallback)iin);
}
return new android.telephony.mbms.IMbmsDownloadSessionCallback.Stub.Proxy(obj);
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
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.onError(_arg0, _arg1);
return true;
}
case TRANSACTION_onFileServicesUpdated:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.mbms.FileServiceInfo> _arg0;
_arg0 = data.createTypedArrayList(android.telephony.mbms.FileServiceInfo.CREATOR);
this.onFileServicesUpdated(_arg0);
return true;
}
case TRANSACTION_onMiddlewareReady:
{
data.enforceInterface(DESCRIPTOR);
this.onMiddlewareReady();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.telephony.mbms.IMbmsDownloadSessionCallback
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
@Override public void onError(int errorCode, java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorCode);
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onFileServicesUpdated(java.util.List<android.telephony.mbms.FileServiceInfo> services) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(services);
mRemote.transact(Stub.TRANSACTION_onFileServicesUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMiddlewareReady() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onMiddlewareReady, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onFileServicesUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onMiddlewareReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onError(int errorCode, java.lang.String message) throws android.os.RemoteException;
public void onFileServicesUpdated(java.util.List<android.telephony.mbms.FileServiceInfo> services) throws android.os.RemoteException;
public void onMiddlewareReady() throws android.os.RemoteException;
}
