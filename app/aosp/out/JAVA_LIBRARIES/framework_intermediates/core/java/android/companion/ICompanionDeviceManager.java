/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/companion/ICompanionDeviceManager.aidl
 */
package android.companion;
/**
 * Interface for communication with the core companion device manager service.
 *
 * @hide
 */
public interface ICompanionDeviceManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceManager
{
private static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.companion.ICompanionDeviceManager interface,
 * generating a proxy if needed.
 */
public static android.companion.ICompanionDeviceManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.companion.ICompanionDeviceManager))) {
return ((android.companion.ICompanionDeviceManager)iin);
}
return new android.companion.ICompanionDeviceManager.Stub.Proxy(obj);
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
case TRANSACTION_associate:
{
data.enforceInterface(DESCRIPTOR);
android.companion.AssociationRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.companion.AssociationRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.companion.IFindDeviceCallback _arg1;
_arg1 = android.companion.IFindDeviceCallback.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg2;
_arg2 = data.readString();
this.associate(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_stopScan:
{
data.enforceInterface(DESCRIPTOR);
android.companion.AssociationRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.companion.AssociationRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.companion.IFindDeviceCallback _arg1;
_arg1 = android.companion.IFindDeviceCallback.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg2;
_arg2 = data.readString();
this.stopScan(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAssociations:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.util.List<java.lang.String> _result = this.getAssociations(_arg0, _arg1);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_disassociate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.disassociate(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_hasNotificationAccess:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.hasNotificationAccess(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_requestNotificationAccess:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.PendingIntent _result = this.requestNotificationAccess(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.companion.ICompanionDeviceManager
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
@Override public void associate(android.companion.AssociationRequest request, android.companion.IFindDeviceCallback callback, java.lang.String callingPackage) throws android.os.RemoteException
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
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_associate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopScan(android.companion.AssociationRequest request, android.companion.IFindDeviceCallback callback, java.lang.String callingPackage) throws android.os.RemoteException
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
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_stopScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<java.lang.String> getAssociations(java.lang.String callingPackage, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getAssociations, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void disassociate(java.lang.String deviceMacAddress, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(deviceMacAddress);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_disassociate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean hasNotificationAccess(android.content.ComponentName component) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_hasNotificationAccess, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName component) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.PendingIntent _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestNotificationAccess, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.PendingIntent.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_associate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getAssociations = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_disassociate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_hasNotificationAccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_requestNotificationAccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void associate(android.companion.AssociationRequest request, android.companion.IFindDeviceCallback callback, java.lang.String callingPackage) throws android.os.RemoteException;
public void stopScan(android.companion.AssociationRequest request, android.companion.IFindDeviceCallback callback, java.lang.String callingPackage) throws android.os.RemoteException;
public java.util.List<java.lang.String> getAssociations(java.lang.String callingPackage, int userId) throws android.os.RemoteException;
public void disassociate(java.lang.String deviceMacAddress, java.lang.String callingPackage) throws android.os.RemoteException;
public boolean hasNotificationAccess(android.content.ComponentName component) throws android.os.RemoteException;
public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName component) throws android.os.RemoteException;
}
