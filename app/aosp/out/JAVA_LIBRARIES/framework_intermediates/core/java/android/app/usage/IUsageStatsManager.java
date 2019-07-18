/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/usage/IUsageStatsManager.aidl
 */
package android.app.usage;
/**
 * System private API for talking with the UsageStatsManagerService.
 *
 * {@hide}
 */
public interface IUsageStatsManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.usage.IUsageStatsManager
{
private static final java.lang.String DESCRIPTOR = "android.app.usage.IUsageStatsManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.usage.IUsageStatsManager interface,
 * generating a proxy if needed.
 */
public static android.app.usage.IUsageStatsManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.usage.IUsageStatsManager))) {
return ((android.app.usage.IUsageStatsManager)iin);
}
return new android.app.usage.IUsageStatsManager.Stub.Proxy(obj);
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
case TRANSACTION_queryUsageStats:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
java.lang.String _arg3;
_arg3 = data.readString();
android.content.pm.ParceledListSlice _result = this.queryUsageStats(_arg0, _arg1, _arg2, _arg3);
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
case TRANSACTION_queryConfigurationStats:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
java.lang.String _arg3;
_arg3 = data.readString();
android.content.pm.ParceledListSlice _result = this.queryConfigurationStats(_arg0, _arg1, _arg2, _arg3);
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
case TRANSACTION_queryEvents:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
java.lang.String _arg2;
_arg2 = data.readString();
android.app.usage.UsageEvents _result = this.queryEvents(_arg0, _arg1, _arg2);
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
case TRANSACTION_setAppInactive:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.setAppInactive(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isAppInactive:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isAppInactive(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_whitelistAppTemporarily:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.whitelistAppTemporarily(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onCarrierPrivilegedAppsChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onCarrierPrivilegedAppsChanged();
reply.writeNoException();
return true;
}
case TRANSACTION_reportChooserSelection:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
java.lang.String _arg4;
_arg4 = data.readString();
this.reportChooserSelection(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.usage.IUsageStatsManager
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
@Override public android.content.pm.ParceledListSlice queryUsageStats(int bucketType, long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(bucketType);
_data.writeLong(beginTime);
_data.writeLong(endTime);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_queryUsageStats, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public android.content.pm.ParceledListSlice queryConfigurationStats(int bucketType, long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(bucketType);
_data.writeLong(beginTime);
_data.writeLong(endTime);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_queryConfigurationStats, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public android.app.usage.UsageEvents queryEvents(long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.usage.UsageEvents _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(beginTime);
_data.writeLong(endTime);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_queryEvents, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.usage.UsageEvents.CREATOR.createFromParcel(_reply);
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
@Override public void setAppInactive(java.lang.String packageName, boolean inactive, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(((inactive)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setAppInactive, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isAppInactive(java.lang.String packageName, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isAppInactive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void whitelistAppTemporarily(java.lang.String packageName, long duration, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeLong(duration);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_whitelistAppTemporarily, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onCarrierPrivilegedAppsChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onCarrierPrivilegedAppsChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportChooserSelection(java.lang.String packageName, int userId, java.lang.String contentType, java.lang.String[] annotations, java.lang.String action) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeString(contentType);
_data.writeStringArray(annotations);
_data.writeString(action);
mRemote.transact(Stub.TRANSACTION_reportChooserSelection, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_queryUsageStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_queryConfigurationStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_queryEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setAppInactive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isAppInactive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_whitelistAppTemporarily = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onCarrierPrivilegedAppsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_reportChooserSelection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public android.content.pm.ParceledListSlice queryUsageStats(int bucketType, long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice queryConfigurationStats(int bucketType, long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException;
public android.app.usage.UsageEvents queryEvents(long beginTime, long endTime, java.lang.String callingPackage) throws android.os.RemoteException;
public void setAppInactive(java.lang.String packageName, boolean inactive, int userId) throws android.os.RemoteException;
public boolean isAppInactive(java.lang.String packageName, int userId) throws android.os.RemoteException;
public void whitelistAppTemporarily(java.lang.String packageName, long duration, int userId) throws android.os.RemoteException;
public void onCarrierPrivilegedAppsChanged() throws android.os.RemoteException;
public void reportChooserSelection(java.lang.String packageName, int userId, java.lang.String contentType, java.lang.String[] annotations, java.lang.String action) throws android.os.RemoteException;
}
