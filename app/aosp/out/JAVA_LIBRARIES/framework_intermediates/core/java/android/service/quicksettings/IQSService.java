/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/quicksettings/IQSService.aidl
 */
package android.service.quicksettings;
/**
 * @hide
 */
public interface IQSService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.quicksettings.IQSService
{
private static final java.lang.String DESCRIPTOR = "android.service.quicksettings.IQSService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.quicksettings.IQSService interface,
 * generating a proxy if needed.
 */
public static android.service.quicksettings.IQSService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.quicksettings.IQSService))) {
return ((android.service.quicksettings.IQSService)iin);
}
return new android.service.quicksettings.IQSService.Stub.Proxy(obj);
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
case TRANSACTION_getTile:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.service.quicksettings.Tile _result = this.getTile(_arg0);
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
case TRANSACTION_updateQsTile:
{
data.enforceInterface(DESCRIPTOR);
android.service.quicksettings.Tile _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.quicksettings.Tile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.updateQsTile(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_updateStatusIcon:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.graphics.drawable.Icon _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.drawable.Icon.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.updateStatusIcon(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onShowDialog:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onShowDialog(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onStartActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onStartActivity(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isLocked:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isLocked();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSecure:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSecure();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startUnlockAndRun:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.startUnlockAndRun(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onDialogHidden:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onDialogHidden(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onStartSuccessful:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onStartSuccessful(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.quicksettings.IQSService
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
@Override public android.service.quicksettings.Tile getTile(android.os.IBinder tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.quicksettings.Tile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(tile);
mRemote.transact(Stub.TRANSACTION_getTile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.service.quicksettings.Tile.CREATOR.createFromParcel(_reply);
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
@Override public void updateQsTile(android.service.quicksettings.Tile tile, android.os.IBinder service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tile!=null)) {
_data.writeInt(1);
tile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(service);
mRemote.transact(Stub.TRANSACTION_updateQsTile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateStatusIcon(android.os.IBinder tile, android.graphics.drawable.Icon icon, java.lang.String contentDescription) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(tile);
if ((icon!=null)) {
_data.writeInt(1);
icon.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(contentDescription);
mRemote.transact(Stub.TRANSACTION_updateStatusIcon, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onShowDialog(android.os.IBinder tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(tile);
mRemote.transact(Stub.TRANSACTION_onShowDialog, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onStartActivity(android.os.IBinder tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(tile);
mRemote.transact(Stub.TRANSACTION_onStartActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isLocked() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isLocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isSecure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSecure, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void startUnlockAndRun(android.os.IBinder tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(tile);
mRemote.transact(Stub.TRANSACTION_startUnlockAndRun, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onDialogHidden(android.os.IBinder tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(tile);
mRemote.transact(Stub.TRANSACTION_onDialogHidden, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onStartSuccessful(android.os.IBinder tile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(tile);
mRemote.transact(Stub.TRANSACTION_onStartSuccessful, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_updateQsTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateStatusIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onShowDialog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onStartActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_isLocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isSecure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_startUnlockAndRun = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onDialogHidden = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onStartSuccessful = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public android.service.quicksettings.Tile getTile(android.os.IBinder tile) throws android.os.RemoteException;
public void updateQsTile(android.service.quicksettings.Tile tile, android.os.IBinder service) throws android.os.RemoteException;
public void updateStatusIcon(android.os.IBinder tile, android.graphics.drawable.Icon icon, java.lang.String contentDescription) throws android.os.RemoteException;
public void onShowDialog(android.os.IBinder tile) throws android.os.RemoteException;
public void onStartActivity(android.os.IBinder tile) throws android.os.RemoteException;
public boolean isLocked() throws android.os.RemoteException;
public boolean isSecure() throws android.os.RemoteException;
public void startUnlockAndRun(android.os.IBinder tile) throws android.os.RemoteException;
public void onDialogHidden(android.os.IBinder tile) throws android.os.RemoteException;
public void onStartSuccessful(android.os.IBinder tile) throws android.os.RemoteException;
}
