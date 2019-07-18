/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/android/telephony/mbms/IMbmsStreamingSessionCallback.aidl
 */
package android.telephony.mbms;
/**
 * The interface the clients top-level streaming listener will satisfy.
 * @hide
 */
public interface IMbmsStreamingSessionCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IMbmsStreamingSessionCallback
{
private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IMbmsStreamingSessionCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.telephony.mbms.IMbmsStreamingSessionCallback interface,
 * generating a proxy if needed.
 */
public static android.telephony.mbms.IMbmsStreamingSessionCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.telephony.mbms.IMbmsStreamingSessionCallback))) {
return ((android.telephony.mbms.IMbmsStreamingSessionCallback)iin);
}
return new android.telephony.mbms.IMbmsStreamingSessionCallback.Stub.Proxy(obj);
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
case TRANSACTION_onStreamingServicesUpdated:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.mbms.StreamingServiceInfo> _arg0;
_arg0 = data.createTypedArrayList(android.telephony.mbms.StreamingServiceInfo.CREATOR);
this.onStreamingServicesUpdated(_arg0);
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
private static class Proxy implements android.telephony.mbms.IMbmsStreamingSessionCallback
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
@Override public void onStreamingServicesUpdated(java.util.List<android.telephony.mbms.StreamingServiceInfo> services) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(services);
mRemote.transact(Stub.TRANSACTION_onStreamingServicesUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
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
static final int TRANSACTION_onStreamingServicesUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onMiddlewareReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onError(int errorCode, java.lang.String message) throws android.os.RemoteException;
public void onStreamingServicesUpdated(java.util.List<android.telephony.mbms.StreamingServiceInfo> services) throws android.os.RemoteException;
public void onMiddlewareReady() throws android.os.RemoteException;
}
