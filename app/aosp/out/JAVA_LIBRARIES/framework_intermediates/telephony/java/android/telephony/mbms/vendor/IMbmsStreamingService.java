/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/android/telephony/mbms/vendor/IMbmsStreamingService.aidl
 */
package android.telephony.mbms.vendor;
/**
 * @hide
 */
public interface IMbmsStreamingService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.vendor.IMbmsStreamingService
{
private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.vendor.IMbmsStreamingService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.telephony.mbms.vendor.IMbmsStreamingService interface,
 * generating a proxy if needed.
 */
public static android.telephony.mbms.vendor.IMbmsStreamingService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.telephony.mbms.vendor.IMbmsStreamingService))) {
return ((android.telephony.mbms.vendor.IMbmsStreamingService)iin);
}
return new android.telephony.mbms.vendor.IMbmsStreamingService.Stub.Proxy(obj);
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
case TRANSACTION_initialize:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.mbms.IMbmsStreamingSessionCallback _arg0;
_arg0 = android.telephony.mbms.IMbmsStreamingSessionCallback.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _result = this.initialize(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_requestUpdateStreamingServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<java.lang.String> _arg1;
_arg1 = data.createStringArrayList();
int _result = this.requestUpdateStreamingServices(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startStreaming:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.telephony.mbms.IStreamingServiceCallback _arg2;
_arg2 = android.telephony.mbms.IStreamingServiceCallback.Stub.asInterface(data.readStrongBinder());
int _result = this.startStreaming(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPlaybackUri:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.net.Uri _result = this.getPlaybackUri(_arg0, _arg1);
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
case TRANSACTION_stopStreaming:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.stopStreaming(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_dispose:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.dispose(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.telephony.mbms.vendor.IMbmsStreamingService
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
@Override public int initialize(android.telephony.mbms.IMbmsStreamingSessionCallback callback, int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_initialize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int requestUpdateStreamingServices(int subId, java.util.List<java.lang.String> serviceClasses) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeStringList(serviceClasses);
mRemote.transact(Stub.TRANSACTION_requestUpdateStreamingServices, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startStreaming(int subId, java.lang.String serviceId, android.telephony.mbms.IStreamingServiceCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(serviceId);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startStreaming, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.Uri getPlaybackUri(int subId, java.lang.String serviceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.Uri _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(serviceId);
mRemote.transact(Stub.TRANSACTION_getPlaybackUri, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.Uri.CREATOR.createFromParcel(_reply);
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
@Override public void stopStreaming(int subId, java.lang.String serviceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(serviceId);
mRemote.transact(Stub.TRANSACTION_stopStreaming, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void dispose(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_dispose, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_initialize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_requestUpdateStreamingServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startStreaming = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getPlaybackUri = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopStreaming = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_dispose = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public int initialize(android.telephony.mbms.IMbmsStreamingSessionCallback callback, int subId) throws android.os.RemoteException;
public int requestUpdateStreamingServices(int subId, java.util.List<java.lang.String> serviceClasses) throws android.os.RemoteException;
public int startStreaming(int subId, java.lang.String serviceId, android.telephony.mbms.IStreamingServiceCallback callback) throws android.os.RemoteException;
public android.net.Uri getPlaybackUri(int subId, java.lang.String serviceId) throws android.os.RemoteException;
public void stopStreaming(int subId, java.lang.String serviceId) throws android.os.RemoteException;
public void dispose(int subId) throws android.os.RemoteException;
}
