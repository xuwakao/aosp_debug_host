/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/quicksettings/IQSTileService.aidl
 */
package android.service.quicksettings;
/**
 * @hide
 */
public interface IQSTileService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.quicksettings.IQSTileService
{
private static final java.lang.String DESCRIPTOR = "android.service.quicksettings.IQSTileService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.quicksettings.IQSTileService interface,
 * generating a proxy if needed.
 */
public static android.service.quicksettings.IQSTileService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.quicksettings.IQSTileService))) {
return ((android.service.quicksettings.IQSTileService)iin);
}
return new android.service.quicksettings.IQSTileService.Stub.Proxy(obj);
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
case TRANSACTION_onTileAdded:
{
data.enforceInterface(DESCRIPTOR);
this.onTileAdded();
return true;
}
case TRANSACTION_onTileRemoved:
{
data.enforceInterface(DESCRIPTOR);
this.onTileRemoved();
return true;
}
case TRANSACTION_onStartListening:
{
data.enforceInterface(DESCRIPTOR);
this.onStartListening();
return true;
}
case TRANSACTION_onStopListening:
{
data.enforceInterface(DESCRIPTOR);
this.onStopListening();
return true;
}
case TRANSACTION_onClick:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onClick(_arg0);
return true;
}
case TRANSACTION_onUnlockComplete:
{
data.enforceInterface(DESCRIPTOR);
this.onUnlockComplete();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.quicksettings.IQSTileService
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
@Override public void onTileAdded() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onTileAdded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onTileRemoved() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onTileRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onStartListening() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStartListening, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onStopListening() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStopListening, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onClick(android.os.IBinder wtoken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(wtoken);
mRemote.transact(Stub.TRANSACTION_onClick, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onUnlockComplete() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onUnlockComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onTileAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onTileRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onStartListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onStopListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onClick = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onUnlockComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void onTileAdded() throws android.os.RemoteException;
public void onTileRemoved() throws android.os.RemoteException;
public void onStartListening() throws android.os.RemoteException;
public void onStopListening() throws android.os.RemoteException;
public void onClick(android.os.IBinder wtoken) throws android.os.RemoteException;
public void onUnlockComplete() throws android.os.RemoteException;
}
