/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IDeviceIdleController.aidl
 */
package android.os;
/** @hide */
public interface IDeviceIdleController extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IDeviceIdleController
{
private static final java.lang.String DESCRIPTOR = "android.os.IDeviceIdleController";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IDeviceIdleController interface,
 * generating a proxy if needed.
 */
public static android.os.IDeviceIdleController asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IDeviceIdleController))) {
return ((android.os.IDeviceIdleController)iin);
}
return new android.os.IDeviceIdleController.Stub.Proxy(obj);
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
case TRANSACTION_addPowerSaveWhitelistApp:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.addPowerSaveWhitelistApp(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removePowerSaveWhitelistApp:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removePowerSaveWhitelistApp(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getSystemPowerWhitelistExceptIdle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getSystemPowerWhitelistExceptIdle();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getSystemPowerWhitelist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getSystemPowerWhitelist();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getUserPowerWhitelist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getUserPowerWhitelist();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getFullPowerWhitelistExceptIdle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getFullPowerWhitelistExceptIdle();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getFullPowerWhitelist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getFullPowerWhitelist();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getAppIdWhitelistExceptIdle:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getAppIdWhitelistExceptIdle();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getAppIdWhitelist:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getAppIdWhitelist();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getAppIdUserWhitelist:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getAppIdUserWhitelist();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getAppIdTempWhitelist:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getAppIdTempWhitelist();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_isPowerSaveWhitelistExceptIdleApp:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isPowerSaveWhitelistExceptIdleApp(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isPowerSaveWhitelistApp:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isPowerSaveWhitelistApp(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addPowerSaveTempWhitelistApp:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
this.addPowerSaveTempWhitelistApp(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_addPowerSaveTempWhitelistAppForMms:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
long _result = this.addPowerSaveTempWhitelistAppForMms(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_addPowerSaveTempWhitelistAppForSms:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
long _result = this.addPowerSaveTempWhitelistAppForSms(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_exitIdle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.exitIdle(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerMaintenanceActivityListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.IMaintenanceActivityListener _arg0;
_arg0 = android.os.IMaintenanceActivityListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerMaintenanceActivityListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregisterMaintenanceActivityListener:
{
data.enforceInterface(DESCRIPTOR);
android.os.IMaintenanceActivityListener _arg0;
_arg0 = android.os.IMaintenanceActivityListener.Stub.asInterface(data.readStrongBinder());
this.unregisterMaintenanceActivityListener(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IDeviceIdleController
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
@Override public void addPowerSaveWhitelistApp(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_addPowerSaveWhitelistApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removePowerSaveWhitelistApp(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_removePowerSaveWhitelistApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getSystemPowerWhitelistExceptIdle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSystemPowerWhitelistExceptIdle, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getSystemPowerWhitelist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSystemPowerWhitelist, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getUserPowerWhitelist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUserPowerWhitelist, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getFullPowerWhitelistExceptIdle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFullPowerWhitelistExceptIdle, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getFullPowerWhitelist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFullPowerWhitelist, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getAppIdWhitelistExceptIdle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAppIdWhitelistExceptIdle, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getAppIdWhitelist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAppIdWhitelist, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getAppIdUserWhitelist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAppIdUserWhitelist, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getAppIdTempWhitelist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAppIdTempWhitelist, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isPowerSaveWhitelistExceptIdleApp(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_isPowerSaveWhitelistExceptIdleApp, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isPowerSaveWhitelistApp(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_isPowerSaveWhitelistApp, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addPowerSaveTempWhitelistApp(java.lang.String name, long duration, int userId, java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeLong(duration);
_data.writeInt(userId);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_addPowerSaveTempWhitelistApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long addPowerSaveTempWhitelistAppForMms(java.lang.String name, int userId, java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(userId);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_addPowerSaveTempWhitelistAppForMms, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long addPowerSaveTempWhitelistAppForSms(java.lang.String name, int userId, java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(userId);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_addPowerSaveTempWhitelistAppForSms, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void exitIdle(java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_exitIdle, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean registerMaintenanceActivityListener(android.os.IMaintenanceActivityListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerMaintenanceActivityListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void unregisterMaintenanceActivityListener(android.os.IMaintenanceActivityListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterMaintenanceActivityListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_addPowerSaveWhitelistApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removePowerSaveWhitelistApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getSystemPowerWhitelistExceptIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getSystemPowerWhitelist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getUserPowerWhitelist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getFullPowerWhitelistExceptIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getFullPowerWhitelist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getAppIdWhitelistExceptIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAppIdWhitelist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getAppIdUserWhitelist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getAppIdTempWhitelist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_isPowerSaveWhitelistExceptIdleApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_isPowerSaveWhitelistApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_addPowerSaveTempWhitelistApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_addPowerSaveTempWhitelistAppForMms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_addPowerSaveTempWhitelistAppForSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_exitIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_registerMaintenanceActivityListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_unregisterMaintenanceActivityListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
}
public void addPowerSaveWhitelistApp(java.lang.String name) throws android.os.RemoteException;
public void removePowerSaveWhitelistApp(java.lang.String name) throws android.os.RemoteException;
public java.lang.String[] getSystemPowerWhitelistExceptIdle() throws android.os.RemoteException;
public java.lang.String[] getSystemPowerWhitelist() throws android.os.RemoteException;
public java.lang.String[] getUserPowerWhitelist() throws android.os.RemoteException;
public java.lang.String[] getFullPowerWhitelistExceptIdle() throws android.os.RemoteException;
public java.lang.String[] getFullPowerWhitelist() throws android.os.RemoteException;
public int[] getAppIdWhitelistExceptIdle() throws android.os.RemoteException;
public int[] getAppIdWhitelist() throws android.os.RemoteException;
public int[] getAppIdUserWhitelist() throws android.os.RemoteException;
public int[] getAppIdTempWhitelist() throws android.os.RemoteException;
public boolean isPowerSaveWhitelistExceptIdleApp(java.lang.String name) throws android.os.RemoteException;
public boolean isPowerSaveWhitelistApp(java.lang.String name) throws android.os.RemoteException;
public void addPowerSaveTempWhitelistApp(java.lang.String name, long duration, int userId, java.lang.String reason) throws android.os.RemoteException;
public long addPowerSaveTempWhitelistAppForMms(java.lang.String name, int userId, java.lang.String reason) throws android.os.RemoteException;
public long addPowerSaveTempWhitelistAppForSms(java.lang.String name, int userId, java.lang.String reason) throws android.os.RemoteException;
public void exitIdle(java.lang.String reason) throws android.os.RemoteException;
public boolean registerMaintenanceActivityListener(android.os.IMaintenanceActivityListener listener) throws android.os.RemoteException;
public void unregisterMaintenanceActivityListener(android.os.IMaintenanceActivityListener listener) throws android.os.RemoteException;
}
