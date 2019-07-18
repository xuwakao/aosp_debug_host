/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/android/telephony/mbms/IStreamingServiceCallback.aidl
 */
package android.telephony.mbms;
/**
 * @hide
 */
public interface IStreamingServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IStreamingServiceCallback
{
private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IStreamingServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.telephony.mbms.IStreamingServiceCallback interface,
 * generating a proxy if needed.
 */
public static android.telephony.mbms.IStreamingServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.telephony.mbms.IStreamingServiceCallback))) {
return ((android.telephony.mbms.IStreamingServiceCallback)iin);
}
return new android.telephony.mbms.IStreamingServiceCallback.Stub.Proxy(obj);
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
case TRANSACTION_onStreamStateUpdated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onStreamStateUpdated(_arg0, _arg1);
return true;
}
case TRANSACTION_onMediaDescriptionUpdated:
{
data.enforceInterface(DESCRIPTOR);
this.onMediaDescriptionUpdated();
return true;
}
case TRANSACTION_onBroadcastSignalStrengthUpdated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onBroadcastSignalStrengthUpdated(_arg0);
return true;
}
case TRANSACTION_onStreamMethodUpdated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onStreamMethodUpdated(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.telephony.mbms.IStreamingServiceCallback
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
@Override public void onStreamStateUpdated(int state, int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onStreamStateUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMediaDescriptionUpdated() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onMediaDescriptionUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBroadcastSignalStrengthUpdated(int signalStrength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(signalStrength);
mRemote.transact(Stub.TRANSACTION_onBroadcastSignalStrengthUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onStreamMethodUpdated(int methodType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(methodType);
mRemote.transact(Stub.TRANSACTION_onStreamMethodUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onStreamStateUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onMediaDescriptionUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onBroadcastSignalStrengthUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onStreamMethodUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onError(int errorCode, java.lang.String message) throws android.os.RemoteException;
public void onStreamStateUpdated(int state, int reason) throws android.os.RemoteException;
public void onMediaDescriptionUpdated() throws android.os.RemoteException;
public void onBroadcastSignalStrengthUpdated(int signalStrength) throws android.os.RemoteException;
public void onStreamMethodUpdated(int methodType) throws android.os.RemoteException;
}
