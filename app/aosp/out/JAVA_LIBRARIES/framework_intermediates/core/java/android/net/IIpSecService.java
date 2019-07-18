/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/net/IIpSecService.aidl
 */
package android.net;
/**
 * @hide
 */
public interface IIpSecService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.IIpSecService
{
private static final java.lang.String DESCRIPTOR = "android.net.IIpSecService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.IIpSecService interface,
 * generating a proxy if needed.
 */
public static android.net.IIpSecService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.IIpSecService))) {
return ((android.net.IIpSecService)iin);
}
return new android.net.IIpSecService.Stub.Proxy(obj);
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
case TRANSACTION_reserveSecurityParameterIndex:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
android.os.IBinder _arg3;
_arg3 = data.readStrongBinder();
android.net.IpSecSpiResponse _result = this.reserveSecurityParameterIndex(_arg0, _arg1, _arg2, _arg3);
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
case TRANSACTION_releaseSecurityParameterIndex:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.releaseSecurityParameterIndex(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_openUdpEncapsulationSocket:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.net.IpSecUdpEncapResponse _result = this.openUdpEncapsulationSocket(_arg0, _arg1);
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
case TRANSACTION_closeUdpEncapsulationSocket:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.closeUdpEncapsulationSocket(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createTransportModeTransform:
{
data.enforceInterface(DESCRIPTOR);
android.net.IpSecConfig _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.IpSecConfig.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.net.IpSecTransformResponse _result = this.createTransportModeTransform(_arg0, _arg1);
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
case TRANSACTION_deleteTransportModeTransform:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.deleteTransportModeTransform(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_applyTransportModeTransform:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.applyTransportModeTransform(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeTransportModeTransform:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.removeTransportModeTransform(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.IIpSecService
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
@Override public android.net.IpSecSpiResponse reserveSecurityParameterIndex(int direction, java.lang.String remoteAddress, int requestedSpi, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.IpSecSpiResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(direction);
_data.writeString(remoteAddress);
_data.writeInt(requestedSpi);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_reserveSecurityParameterIndex, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.IpSecSpiResponse.CREATOR.createFromParcel(_reply);
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
@Override public void releaseSecurityParameterIndex(int resourceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(resourceId);
mRemote.transact(Stub.TRANSACTION_releaseSecurityParameterIndex, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.net.IpSecUdpEncapResponse openUdpEncapsulationSocket(int port, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.IpSecUdpEncapResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(port);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_openUdpEncapsulationSocket, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.IpSecUdpEncapResponse.CREATOR.createFromParcel(_reply);
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
@Override public void closeUdpEncapsulationSocket(int resourceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(resourceId);
mRemote.transact(Stub.TRANSACTION_closeUdpEncapsulationSocket, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.net.IpSecTransformResponse createTransportModeTransform(android.net.IpSecConfig c, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.IpSecTransformResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((c!=null)) {
_data.writeInt(1);
c.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_createTransportModeTransform, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.IpSecTransformResponse.CREATOR.createFromParcel(_reply);
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
@Override public void deleteTransportModeTransform(int transformId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(transformId);
mRemote.transact(Stub.TRANSACTION_deleteTransportModeTransform, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void applyTransportModeTransform(android.os.ParcelFileDescriptor socket, int transformId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((socket!=null)) {
_data.writeInt(1);
socket.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(transformId);
mRemote.transact(Stub.TRANSACTION_applyTransportModeTransform, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeTransportModeTransform(android.os.ParcelFileDescriptor socket, int transformId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((socket!=null)) {
_data.writeInt(1);
socket.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(transformId);
mRemote.transact(Stub.TRANSACTION_removeTransportModeTransform, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_reserveSecurityParameterIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_releaseSecurityParameterIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_openUdpEncapsulationSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_closeUdpEncapsulationSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_createTransportModeTransform = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_deleteTransportModeTransform = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_applyTransportModeTransform = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_removeTransportModeTransform = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public android.net.IpSecSpiResponse reserveSecurityParameterIndex(int direction, java.lang.String remoteAddress, int requestedSpi, android.os.IBinder binder) throws android.os.RemoteException;
public void releaseSecurityParameterIndex(int resourceId) throws android.os.RemoteException;
public android.net.IpSecUdpEncapResponse openUdpEncapsulationSocket(int port, android.os.IBinder binder) throws android.os.RemoteException;
public void closeUdpEncapsulationSocket(int resourceId) throws android.os.RemoteException;
public android.net.IpSecTransformResponse createTransportModeTransform(android.net.IpSecConfig c, android.os.IBinder binder) throws android.os.RemoteException;
public void deleteTransportModeTransform(int transformId) throws android.os.RemoteException;
public void applyTransportModeTransform(android.os.ParcelFileDescriptor socket, int transformId) throws android.os.RemoteException;
public void removeTransportModeTransform(android.os.ParcelFileDescriptor socket, int transformId) throws android.os.RemoteException;
}
