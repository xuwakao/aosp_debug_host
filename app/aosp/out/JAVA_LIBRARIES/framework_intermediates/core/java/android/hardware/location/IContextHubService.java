/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/location/IContextHubService.aidl
 */
package android.hardware.location;
/**
 * @hide
 */
public interface IContextHubService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IContextHubService
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IContextHubService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IContextHubService interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IContextHubService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IContextHubService))) {
return ((android.hardware.location.IContextHubService)iin);
}
return new android.hardware.location.IContextHubService.Stub.Proxy(obj);
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
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.location.IContextHubCallback _arg0;
_arg0 = android.hardware.location.IContextHubCallback.Stub.asInterface(data.readStrongBinder());
int _result = this.registerCallback(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getContextHubHandles:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getContextHubHandles();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getContextHubInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.location.ContextHubInfo _result = this.getContextHubInfo(_arg0);
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
case TRANSACTION_loadNanoApp:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.location.NanoApp _arg1;
if ((0!=data.readInt())) {
_arg1 = android.hardware.location.NanoApp.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _result = this.loadNanoApp(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_unloadNanoApp:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.unloadNanoApp(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getNanoAppInstanceInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.location.NanoAppInstanceInfo _result = this.getNanoAppInstanceInfo(_arg0);
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
case TRANSACTION_findNanoAppOnHub:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.location.NanoAppFilter _arg1;
if ((0!=data.readInt())) {
_arg1 = android.hardware.location.NanoAppFilter.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int[] _result = this.findNanoAppOnHub(_arg0, _arg1);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_sendMessage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.hardware.location.ContextHubMessage _arg2;
if ((0!=data.readInt())) {
_arg2 = android.hardware.location.ContextHubMessage.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _result = this.sendMessage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IContextHubService
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
@Override public int registerCallback(android.hardware.location.IContextHubCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getContextHubHandles() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getContextHubHandles, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get the properties of a hub

@Override public android.hardware.location.ContextHubInfo getContextHubInfo(int contextHubHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.location.ContextHubInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(contextHubHandle);
mRemote.transact(Stub.TRANSACTION_getContextHubInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.location.ContextHubInfo.CREATOR.createFromParcel(_reply);
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
@Override public int loadNanoApp(int hubHandle, android.hardware.location.NanoApp app) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(hubHandle);
if ((app!=null)) {
_data.writeInt(1);
app.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_loadNanoApp, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int unloadNanoApp(int nanoAppInstanceHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nanoAppInstanceHandle);
mRemote.transact(Stub.TRANSACTION_unloadNanoApp, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// get information about a nanoAppInstance

@Override public android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int nanoAppInstanceHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.location.NanoAppInstanceInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nanoAppInstanceHandle);
mRemote.transact(Stub.TRANSACTION_getNanoAppInstanceInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.location.NanoAppInstanceInfo.CREATOR.createFromParcel(_reply);
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
@Override public int[] findNanoAppOnHub(int hubHandle, android.hardware.location.NanoAppFilter filter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(hubHandle);
if ((filter!=null)) {
_data.writeInt(1);
filter.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_findNanoAppOnHub, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int sendMessage(int hubHandle, int nanoAppHandle, android.hardware.location.ContextHubMessage msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(hubHandle);
_data.writeInt(nanoAppHandle);
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendMessage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getContextHubHandles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getContextHubInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_loadNanoApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_unloadNanoApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getNanoAppInstanceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_findNanoAppOnHub = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_sendMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public int registerCallback(android.hardware.location.IContextHubCallback callback) throws android.os.RemoteException;
public int[] getContextHubHandles() throws android.os.RemoteException;
// Get the properties of a hub

public android.hardware.location.ContextHubInfo getContextHubInfo(int contextHubHandle) throws android.os.RemoteException;
public int loadNanoApp(int hubHandle, android.hardware.location.NanoApp app) throws android.os.RemoteException;
public int unloadNanoApp(int nanoAppInstanceHandle) throws android.os.RemoteException;
// get information about a nanoAppInstance

public android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int nanoAppInstanceHandle) throws android.os.RemoteException;
public int[] findNanoAppOnHub(int hubHandle, android.hardware.location.NanoAppFilter filter) throws android.os.RemoteException;
public int sendMessage(int hubHandle, int nanoAppHandle, android.hardware.location.ContextHubMessage msg) throws android.os.RemoteException;
}
