/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/android/telephony/mbms/IDownloadStateCallback.aidl
 */
package android.telephony.mbms;
/**
 * The optional interface used by download clients to track progress.
 * @hide
 */
public interface IDownloadStateCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.IDownloadStateCallback
{
private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.IDownloadStateCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.telephony.mbms.IDownloadStateCallback interface,
 * generating a proxy if needed.
 */
public static android.telephony.mbms.IDownloadStateCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.telephony.mbms.IDownloadStateCallback))) {
return ((android.telephony.mbms.IDownloadStateCallback)iin);
}
return new android.telephony.mbms.IDownloadStateCallback.Stub.Proxy(obj);
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
case TRANSACTION_onProgressUpdated:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.mbms.DownloadRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.mbms.DownloadRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.telephony.mbms.FileInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telephony.mbms.FileInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
this.onProgressUpdated(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_onStateUpdated:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.mbms.DownloadRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telephony.mbms.DownloadRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.telephony.mbms.FileInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telephony.mbms.FileInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.onStateUpdated(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.telephony.mbms.IDownloadStateCallback
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
/**
     * Gives progress callbacks for a given DownloadRequest.  Includes a FileInfo
     * as the list of files may not have been known at request-time.
     */
@Override public void onProgressUpdated(android.telephony.mbms.DownloadRequest request, android.telephony.mbms.FileInfo fileInfo, int currentDownloadSize, int fullDownloadSize, int currentDecodedSize, int fullDecodedSize) throws android.os.RemoteException
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
if ((fileInfo!=null)) {
_data.writeInt(1);
fileInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(currentDownloadSize);
_data.writeInt(fullDownloadSize);
_data.writeInt(currentDecodedSize);
_data.writeInt(fullDecodedSize);
mRemote.transact(Stub.TRANSACTION_onProgressUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onStateUpdated(android.telephony.mbms.DownloadRequest request, android.telephony.mbms.FileInfo fileInfo, int state) throws android.os.RemoteException
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
if ((fileInfo!=null)) {
_data.writeInt(1);
fileInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_onStateUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onProgressUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onStateUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Gives progress callbacks for a given DownloadRequest.  Includes a FileInfo
     * as the list of files may not have been known at request-time.
     */
public void onProgressUpdated(android.telephony.mbms.DownloadRequest request, android.telephony.mbms.FileInfo fileInfo, int currentDownloadSize, int fullDownloadSize, int currentDecodedSize, int fullDecodedSize) throws android.os.RemoteException;
public void onStateUpdated(android.telephony.mbms.DownloadRequest request, android.telephony.mbms.FileInfo fileInfo, int state) throws android.os.RemoteException;
}
