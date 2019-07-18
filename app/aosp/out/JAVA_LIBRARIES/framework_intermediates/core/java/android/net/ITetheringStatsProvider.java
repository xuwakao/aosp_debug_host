/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/net/ITetheringStatsProvider.aidl
 */
package android.net;
/**
 * Interface for NetworkManagementService to query tethering statistics and set data limits.
 *
 * TODO: this does not really need to be an interface since Tethering runs in the same process
 * as NetworkManagementService. Consider refactoring Tethering to use direct access to
 * NetworkManagementService instead of using INetworkManagementService, and then deleting this
 * interface.
 *
 * @hide
 */
public interface ITetheringStatsProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.ITetheringStatsProvider
{
private static final java.lang.String DESCRIPTOR = "android.net.ITetheringStatsProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.ITetheringStatsProvider interface,
 * generating a proxy if needed.
 */
public static android.net.ITetheringStatsProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.ITetheringStatsProvider))) {
return ((android.net.ITetheringStatsProvider)iin);
}
return new android.net.ITetheringStatsProvider.Stub.Proxy(obj);
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
case TRANSACTION_getTetherStats:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.NetworkStats _result = this.getTetherStats(_arg0);
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
case TRANSACTION_setInterfaceQuota:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
this.setInterfaceQuota(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.ITetheringStatsProvider
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
// Returns cumulative statistics for all tethering sessions since boot, on all upstreams.
// @code {how} is one of the NetworkStats.STATS_PER_* constants. If {@code how} is
// {@code STATS_PER_IFACE}, the provider should not include any traffic that is already
// counted by kernel interface counters.

@Override public android.net.NetworkStats getTetherStats(int how) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkStats _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(how);
mRemote.transact(Stub.TRANSACTION_getTetherStats, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkStats.CREATOR.createFromParcel(_reply);
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
// Sets the interface quota for the specified upstream interface. This is defined as the number
// of bytes, starting from zero and counting from now, after which data should stop being
// forwarded to/from the specified upstream. A value of QUOTA_UNLIMITED means there is no limit.

@Override public void setInterfaceQuota(java.lang.String iface, long quotaBytes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
_data.writeLong(quotaBytes);
mRemote.transact(Stub.TRANSACTION_setInterfaceQuota, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getTetherStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setInterfaceQuota = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public static final int QUOTA_UNLIMITED = -1;
// Returns cumulative statistics for all tethering sessions since boot, on all upstreams.
// @code {how} is one of the NetworkStats.STATS_PER_* constants. If {@code how} is
// {@code STATS_PER_IFACE}, the provider should not include any traffic that is already
// counted by kernel interface counters.

public android.net.NetworkStats getTetherStats(int how) throws android.os.RemoteException;
// Sets the interface quota for the specified upstream interface. This is defined as the number
// of bytes, starting from zero and counting from now, after which data should stop being
// forwarded to/from the specified upstream. A value of QUOTA_UNLIMITED means there is no limit.

public void setInterfaceQuota(java.lang.String iface, long quotaBytes) throws android.os.RemoteException;
}
