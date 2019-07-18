/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/net/INetdEventCallback.aidl
 */
package android.net;
/** {@hide} */
public interface INetdEventCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.INetdEventCallback
{
private static final java.lang.String DESCRIPTOR = "android.net.INetdEventCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.INetdEventCallback interface,
 * generating a proxy if needed.
 */
public static android.net.INetdEventCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.INetdEventCallback))) {
return ((android.net.INetdEventCallback)iin);
}
return new android.net.INetdEventCallback.Stub.Proxy(obj);
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
case TRANSACTION_onDnsEvent:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
int _arg2;
_arg2 = data.readInt();
long _arg3;
_arg3 = data.readLong();
int _arg4;
_arg4 = data.readInt();
this.onDnsEvent(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_onConnectEvent:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
int _arg3;
_arg3 = data.readInt();
this.onConnectEvent(_arg0, _arg1, _arg2, _arg3);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.INetdEventCallback
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
     * Reports a single DNS lookup function call.
     * This method must not block or perform long-running operations.
     *
     * @param hostname the name that was looked up.
     * @param ipAddresses (possibly a subset of) the IP addresses returned.
     *        At most {@link #DNS_REPORTED_IP_ADDRESSES_LIMIT} addresses are logged.
     * @param ipAddressesCount the number of IP addresses returned. May be different from the length
     *        of ipAddresses if there were too many addresses to log.
     * @param timestamp the timestamp at which the query was reported by netd.
     * @param uid the UID of the application that performed the query.
     */
@Override public void onDnsEvent(java.lang.String hostname, java.lang.String[] ipAddresses, int ipAddressesCount, long timestamp, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(hostname);
_data.writeStringArray(ipAddresses);
_data.writeInt(ipAddressesCount);
_data.writeLong(timestamp);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_onDnsEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Reports a single connect library call.
     * This method must not block or perform long-running operations.
     *
     * @param ipAddr destination IP address.
     * @param port destination port number.
     * @param timestamp the timestamp at which the call was reported by netd.
     * @param uid the UID of the application that performed the connection.
     */
@Override public void onConnectEvent(java.lang.String ipAddr, int port, long timestamp, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ipAddr);
_data.writeInt(port);
_data.writeLong(timestamp);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_onConnectEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onDnsEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onConnectEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Reports a single DNS lookup function call.
     * This method must not block or perform long-running operations.
     *
     * @param hostname the name that was looked up.
     * @param ipAddresses (possibly a subset of) the IP addresses returned.
     *        At most {@link #DNS_REPORTED_IP_ADDRESSES_LIMIT} addresses are logged.
     * @param ipAddressesCount the number of IP addresses returned. May be different from the length
     *        of ipAddresses if there were too many addresses to log.
     * @param timestamp the timestamp at which the query was reported by netd.
     * @param uid the UID of the application that performed the query.
     */
public void onDnsEvent(java.lang.String hostname, java.lang.String[] ipAddresses, int ipAddressesCount, long timestamp, int uid) throws android.os.RemoteException;
/**
     * Reports a single connect library call.
     * This method must not block or perform long-running operations.
     *
     * @param ipAddr destination IP address.
     * @param port destination port number.
     * @param timestamp the timestamp at which the call was reported by netd.
     * @param uid the UID of the application that performed the connection.
     */
public void onConnectEvent(java.lang.String ipAddr, int port, long timestamp, int uid) throws android.os.RemoteException;
}
