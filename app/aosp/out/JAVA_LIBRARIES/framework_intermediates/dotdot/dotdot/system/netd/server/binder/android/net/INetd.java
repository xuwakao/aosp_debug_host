/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../../system/netd/server/binder/android/net/INetd.aidl
 */
package android.net;
/** {@hide} */
public interface INetd extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.INetd
{
private static final java.lang.String DESCRIPTOR = "android.net.INetd";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.INetd interface,
 * generating a proxy if needed.
 */
public static android.net.INetd asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.INetd))) {
return ((android.net.INetd)iin);
}
return new android.net.INetd.Stub.Proxy(obj);
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
case TRANSACTION_isAlive:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAlive();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_firewallReplaceUidChain:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int[] _arg2;
_arg2 = data.createIntArray();
boolean _result = this.firewallReplaceUidChain(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_bandwidthEnableDataSaver:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.bandwidthEnableDataSaver(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_networkRejectNonSecureVpn:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.net.UidRange[] _arg1;
_arg1 = data.createTypedArray(android.net.UidRange.CREATOR);
this.networkRejectNonSecureVpn(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_socketDestroy:
{
data.enforceInterface(DESCRIPTOR);
android.net.UidRange[] _arg0;
_arg0 = data.createTypedArray(android.net.UidRange.CREATOR);
int[] _arg1;
_arg1 = data.createIntArray();
this.socketDestroy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setResolverConfiguration:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
int[] _arg3;
_arg3 = data.createIntArray();
this.setResolverConfiguration(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getResolverInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new java.lang.String[_arg1_length];
}
java.lang.String[] _arg2;
int _arg2_length = data.readInt();
if ((_arg2_length<0)) {
_arg2 = null;
}
else {
_arg2 = new java.lang.String[_arg2_length];
}
int[] _arg3;
int _arg3_length = data.readInt();
if ((_arg3_length<0)) {
_arg3 = null;
}
else {
_arg3 = new int[_arg3_length];
}
int[] _arg4;
int _arg4_length = data.readInt();
if ((_arg4_length<0)) {
_arg4 = null;
}
else {
_arg4 = new int[_arg4_length];
}
this.getResolverInfo(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeStringArray(_arg1);
reply.writeStringArray(_arg2);
reply.writeIntArray(_arg3);
reply.writeIntArray(_arg4);
return true;
}
case TRANSACTION_addPrivateDnsServer:
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
this.addPrivateDnsServer(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_removePrivateDnsServer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removePrivateDnsServer(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_tetherApplyDnsInterfaces:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.tetherApplyDnsInterfaces();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_interfaceAddAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.interfaceAddAddress(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_interfaceDelAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.interfaceDelAddress(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setProcSysNet:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
this.setProcSysNet(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_getMetricsReportingLevel:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getMetricsReportingLevel();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setMetricsReportingLevel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setMetricsReportingLevel(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_ipSecAllocateSpi:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
int _result = this.ipSecAllocateSpi(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_ipSecAddSecurityAssociation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
long _arg5;
_arg5 = data.readLong();
int _arg6;
_arg6 = data.readInt();
java.lang.String _arg7;
_arg7 = data.readString();
byte[] _arg8;
_arg8 = data.createByteArray();
int _arg9;
_arg9 = data.readInt();
java.lang.String _arg10;
_arg10 = data.readString();
byte[] _arg11;
_arg11 = data.createByteArray();
int _arg12;
_arg12 = data.readInt();
int _arg13;
_arg13 = data.readInt();
int _arg14;
_arg14 = data.readInt();
int _arg15;
_arg15 = data.readInt();
this.ipSecAddSecurityAssociation(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11, _arg12, _arg13, _arg14, _arg15);
reply.writeNoException();
return true;
}
case TRANSACTION_ipSecDeleteSecurityAssociation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
this.ipSecDeleteSecurityAssociation(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_ipSecApplyTransportModeTransform:
{
data.enforceInterface(DESCRIPTOR);
java.io.FileDescriptor _arg0;
_arg0 = data.readRawFileDescriptor();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
int _arg5;
_arg5 = data.readInt();
this.ipSecApplyTransportModeTransform(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_ipSecRemoveTransportModeTransform:
{
data.enforceInterface(DESCRIPTOR);
java.io.FileDescriptor _arg0;
_arg0 = data.readRawFileDescriptor();
this.ipSecRemoveTransportModeTransform(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_wakeupAddInterface:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.wakeupAddInterface(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_wakeupDelInterface:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.wakeupDelInterface(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setIPv6AddrGenMode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.setIPv6AddrGenMode(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.INetd
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
     * Returns true if the service is responding.
     */
@Override public boolean isAlive() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAlive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Replaces the contents of the specified UID-based firewall chain.
     *
     * The chain may be a whitelist chain or a blacklist chain. A blacklist chain contains DROP
     * rules for the specified UIDs and a RETURN rule at the end. A whitelist chain contains RETURN
     * rules for the system UID range (0 to {@code UID_APP} - 1), RETURN rules for for the specified
     * UIDs, and a DROP rule at the end. The chain will be created if it does not exist.
     *
     * @param chainName The name of the chain to replace.
     * @param isWhitelist Whether this is a whitelist or blacklist chain.
     * @param uids The list of UIDs to allow/deny.
     * @return true if the chain was successfully replaced, false otherwise.
     */
@Override public boolean firewallReplaceUidChain(java.lang.String chainName, boolean isWhitelist, int[] uids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(chainName);
_data.writeInt(((isWhitelist)?(1):(0)));
_data.writeIntArray(uids);
mRemote.transact(Stub.TRANSACTION_firewallReplaceUidChain, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Enables or disables data saver mode on costly network interfaces.
     *
     * - When disabled, all packets to/from apps in the penalty box chain are rejected on costly
     *   interfaces. Traffic to/from other apps or on other network interfaces is allowed.
     * - When enabled, only apps that are in the happy box chain and not in the penalty box chain
     *   are allowed network connectivity on costly interfaces. All other packets on these
     *   interfaces are rejected. The happy box chain always contains all system UIDs; to disallow
     *   traffic from system UIDs, place them in the penalty box chain.
     *
     * By default, data saver mode is disabled. This command has no effect but might still return an
     * error) if {@code enable} is the same as the current value.
     *
     * @param enable whether to enable or disable data saver mode.
     * @return true if the if the operation was successful, false otherwise.
     */
@Override public boolean bandwidthEnableDataSaver(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_bandwidthEnableDataSaver, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Adds or removes one rule for each supplied UID range to prohibit all network activity outside
     * of secure VPN.
     *
     * When a UID is covered by one of these rules, traffic sent through any socket that is not
     * protected or explicitly overriden by the system will be rejected. The kernel will respond
     * with an ICMP prohibit message.
     *
     * Initially, there are no such rules. Any rules that are added will only last until the next
     * restart of netd or the device.
     *
     * @param add {@code true} if the specified UID ranges should be denied access to any network
     *        which is not secure VPN by adding rules, {@code false} to remove existing rules.
     * @param uidRanges a set of non-overlapping, contiguous ranges of UIDs to which to apply or
     *        remove this restriction.
     *        <p> Added rules should not overlap with existing rules. Likewise, removed rules should
     *        each correspond to an existing rule.
     *
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
@Override public void networkRejectNonSecureVpn(boolean add, android.net.UidRange[] uidRanges) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((add)?(1):(0)));
_data.writeTypedArray(uidRanges, 0);
mRemote.transact(Stub.TRANSACTION_networkRejectNonSecureVpn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Administratively closes sockets belonging to the specified UIDs.
     */
@Override public void socketDestroy(android.net.UidRange[] uidRanges, int[] exemptUids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(uidRanges, 0);
_data.writeIntArray(exemptUids);
mRemote.transact(Stub.TRANSACTION_socketDestroy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sets the name servers, search domains and resolver params for the given network. Flushes the
     * cache as needed (i.e. when the servers or the number of samples to store changes).
     *
     * @param netId the network ID of the network for which information should be configured.
     * @param servers the DNS servers to configure for the network.
     * @param domains the search domains to configure.
     * @param params the params to set. This array contains RESOLVER_PARAMS_COUNT integers that
     *   encode the contents of Bionic's __res_params struct, i.e. sample_validity is stored at
     *   position RESOLVER_PARAMS_SAMPLE_VALIDITY, etc.
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
@Override public void setResolverConfiguration(int netId, java.lang.String[] servers, java.lang.String[] domains, int[] params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(netId);
_data.writeStringArray(servers);
_data.writeStringArray(domains);
_data.writeIntArray(params);
mRemote.transact(Stub.TRANSACTION_setResolverConfiguration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Retrieves the name servers, search domains and resolver stats associated with the given
     * network ID.
     *
     * @param netId the network ID of the network for which information should be retrieved.
     * @param servers the DNS servers that are currently configured for the network.
     * @param domains the search domains currently configured.
     * @param params the resolver parameters configured, i.e. the contents of __res_params in order.
     * @param stats the stats for each server in the order specified by RESOLVER_STATS_XXX
     *         constants, serialized as an int array. The contents of this array are the number of
     *         <ul>
     *           <li> successes,
     *           <li> errors,
     *           <li> timeouts,
     *           <li> internal errors,
     *           <li> the RTT average,
     *           <li> the time of the last recorded sample,
     *           <li> and an integer indicating whether the server is usable (1) or broken (0).
     *         </ul>
     *         in this order. For example, the timeout counter for server N is stored at position
     *         RESOLVER_STATS_COUNT*N + RESOLVER_STATS_TIMEOUTS
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
@Override public void getResolverInfo(int netId, java.lang.String[] servers, java.lang.String[] domains, int[] params, int[] stats) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(netId);
if ((servers==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(servers.length);
}
if ((domains==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(domains.length);
}
if ((params==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(params.length);
}
if ((stats==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(stats.length);
}
mRemote.transact(Stub.TRANSACTION_getResolverInfo, _data, _reply, 0);
_reply.readException();
_reply.readStringArray(servers);
_reply.readStringArray(domains);
_reply.readIntArray(params);
_reply.readIntArray(stats);
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Adds a server to the list of DNS resolvers that support DNS over TLS.  After this action
     * succeeds, any subsequent call to setResolverConfiguration will opportunistically use DNS
     * over TLS if the specified server is on this list and is reachable on that network.
     *
     * @param server the DNS server's IP address.  If a private DNS server is already configured
     *        with this IP address, it will be overwritten.
     * @param port the port on which the server is listening, typically 853.
     * @param fingerprintAlgorithm the hash algorithm used to compute the fingerprints.  This should
     *        be a name in MessageDigest's format.  Currently "SHA-256" is the only supported
     *        algorithm. Set this to the empty string to disable fingerprint validation.
     * @param fingerprints the server's public key fingerprints as Base64 strings.
     *        These can be generated using MessageDigest and android.util.Base64.encodeToString.
     *        Currently "SHA-256" is the only supported algorithm. Set this to empty to disable
     *        fingerprint validation.
     * @throws ServiceSpecificException in case of failure, with an error code indicating the
     *         cause of the the failure.
     */
@Override public void addPrivateDnsServer(java.lang.String server, int port, java.lang.String fingerprintAlgorithm, java.lang.String[] fingerprints) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(server);
_data.writeInt(port);
_data.writeString(fingerprintAlgorithm);
_data.writeStringArray(fingerprints);
mRemote.transact(Stub.TRANSACTION_addPrivateDnsServer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Remove a server from the list of DNS resolvers that support DNS over TLS.
     *
     * @param server the DNS server's IP address.
     * @throws ServiceSpecificException in case of failure, with an error code indicating the
     *         cause of the the failure.
     */
@Override public void removePrivateDnsServer(java.lang.String server) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(server);
mRemote.transact(Stub.TRANSACTION_removePrivateDnsServer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Instruct the tethering DNS server to reevaluated serving interfaces.
     * This is needed to for the DNS server to observe changes in the set
     * of potential listening IP addresses. (Listening on wildcard addresses
     * can turn the device into an open resolver; b/7530468)
     *
     * TODO: Return something richer than just a boolean.
     */
@Override public boolean tetherApplyDnsInterfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_tetherApplyDnsInterfaces, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add/Remove and IP address from an interface.
     *
     * @param ifName the interface name
     * @param addrString the IP address to add/remove as a string literal
     * @param prefixLength the prefix length associated with this IP address
     *
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
@Override public void interfaceAddAddress(java.lang.String ifName, java.lang.String addrString, int prefixLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ifName);
_data.writeString(addrString);
_data.writeInt(prefixLength);
mRemote.transact(Stub.TRANSACTION_interfaceAddAddress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void interfaceDelAddress(java.lang.String ifName, java.lang.String addrString, int prefixLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ifName);
_data.writeString(addrString);
_data.writeInt(prefixLength);
mRemote.transact(Stub.TRANSACTION_interfaceDelAddress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setProcSysNet(int family, int which, java.lang.String ifname, java.lang.String parameter, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(family);
_data.writeInt(which);
_data.writeString(ifname);
_data.writeString(parameter);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setProcSysNet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getMetricsReportingLevel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMetricsReportingLevel, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setMetricsReportingLevel(int level) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(level);
mRemote.transact(Stub.TRANSACTION_setMetricsReportingLevel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int ipSecAllocateSpi(int transformId, int direction, java.lang.String localAddress, java.lang.String remoteAddress, int spi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(transformId);
_data.writeInt(direction);
_data.writeString(localAddress);
_data.writeString(remoteAddress);
_data.writeInt(spi);
mRemote.transact(Stub.TRANSACTION_ipSecAllocateSpi, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    * Create an IpSec Security Association describing how ip(v6) traffic will be encrypted
    * or decrypted.
    *
    * @param transformId a unique identifier for allocated resources
    * @param mode either Transport or Tunnel mode
    * @param direction DIRECTION_IN or DIRECTION_OUT
    * @param localAddress InetAddress as string for the local endpoint
    * @param remoteAddress InetAddress as string for the remote endpoint
    * @param underlyingNetworkHandle the networkHandle of the network to which the SA is applied
    * @param spi a 32-bit unique ID allocated to the user
    * @param authAlgo a string identifying the authentication algorithm to be used
    * @param authKey a byte array containing the authentication key
    * @param authTruncBits the truncation length of the MAC produced by the authentication algorithm
    * @param cryptAlgo a string identifying the encryption algorithm to be used
    * @param cryptKey a byte arrray containing the encryption key
    * @param cryptTruncBits unused parameter
    * @param encapType encapsulation type used (if any) for the udp encap socket
    * @param encapLocalPort the port number on the host to be used in encap packets
    * @param encapRemotePort the port number of the remote to be used for encap packets
    */
@Override public void ipSecAddSecurityAssociation(int transformId, int mode, int direction, java.lang.String localAddress, java.lang.String remoteAddress, long underlyingNetworkHandle, int spi, java.lang.String authAlgo, byte[] authKey, int authTruncBits, java.lang.String cryptAlgo, byte[] cryptKey, int cryptTruncBits, int encapType, int encapLocalPort, int encapRemotePort) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(transformId);
_data.writeInt(mode);
_data.writeInt(direction);
_data.writeString(localAddress);
_data.writeString(remoteAddress);
_data.writeLong(underlyingNetworkHandle);
_data.writeInt(spi);
_data.writeString(authAlgo);
_data.writeByteArray(authKey);
_data.writeInt(authTruncBits);
_data.writeString(cryptAlgo);
_data.writeByteArray(cryptKey);
_data.writeInt(cryptTruncBits);
_data.writeInt(encapType);
_data.writeInt(encapLocalPort);
_data.writeInt(encapRemotePort);
mRemote.transact(Stub.TRANSACTION_ipSecAddSecurityAssociation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Delete a previously created security association identified by the provided parameters
    *
    * @param transformId a unique identifier for allocated resources
    * @param direction DIRECTION_IN or DIRECTION_OUT
    * @param localAddress InetAddress as string for the local endpoint
    * @param remoteAddress InetAddress as string for the remote endpoint
    * @param spi a requested 32-bit unique ID allocated to the user
    */
@Override public void ipSecDeleteSecurityAssociation(int transformId, int direction, java.lang.String localAddress, java.lang.String remoteAddress, int spi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(transformId);
_data.writeInt(direction);
_data.writeString(localAddress);
_data.writeString(remoteAddress);
_data.writeInt(spi);
mRemote.transact(Stub.TRANSACTION_ipSecDeleteSecurityAssociation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Apply a previously created SA to a specified socket, starting IPsec on that socket
    *
    * @param socket a user-provided socket that will have IPsec applied
    * @param transformId a unique identifier for allocated resources
    * @param direction DIRECTION_IN or DIRECTION_OUT
    * @param localAddress InetAddress as string for the local endpoint
    * @param remoteAddress InetAddress as string for the remote endpoint
    * @param spi a 32-bit unique ID allocated to the user (socket owner)
    */
@Override public void ipSecApplyTransportModeTransform(java.io.FileDescriptor socket, int transformId, int direction, java.lang.String localAddress, java.lang.String remoteAddress, int spi) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeRawFileDescriptor(socket);
_data.writeInt(transformId);
_data.writeInt(direction);
_data.writeString(localAddress);
_data.writeString(remoteAddress);
_data.writeInt(spi);
mRemote.transact(Stub.TRANSACTION_ipSecApplyTransportModeTransform, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Remove an IPsec SA from a given socket. This will allow unencrypted traffic to flow
    * on that socket if a transform had been previously applied.
    *
    * @param socket a user-provided socket from which to remove any IPsec configuration
    */
@Override public void ipSecRemoveTransportModeTransform(java.io.FileDescriptor socket) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeRawFileDescriptor(socket);
mRemote.transact(Stub.TRANSACTION_ipSecRemoveTransportModeTransform, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Request notification of wakeup packets arriving on an interface. Notifications will be
    * delivered to INetdEventListener.onWakeupEvent().
    *
    * @param ifName the interface
    * @param prefix arbitrary string used to identify wakeup sources in onWakeupEvent
    */
@Override public void wakeupAddInterface(java.lang.String ifName, java.lang.String prefix, int mark, int mask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ifName);
_data.writeString(prefix);
_data.writeInt(mark);
_data.writeInt(mask);
mRemote.transact(Stub.TRANSACTION_wakeupAddInterface, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Stop notification of wakeup packets arriving on an interface.
    *
    * @param ifName the interface
    * @param prefix arbitrary string used to identify wakeup sources in onWakeupEvent
    */
@Override public void wakeupDelInterface(java.lang.String ifName, java.lang.String prefix, int mark, int mask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ifName);
_data.writeString(prefix);
_data.writeInt(mark);
_data.writeInt(mask);
mRemote.transact(Stub.TRANSACTION_wakeupDelInterface, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Set IPv6 address generation mode. IPv6 should be disabled before changing mode.
    *
    * @param mode SLAAC address generation mechanism to use
    */
@Override public void setIPv6AddrGenMode(java.lang.String ifName, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ifName);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setIPv6AddrGenMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_isAlive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_firewallReplaceUidChain = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_bandwidthEnableDataSaver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_networkRejectNonSecureVpn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_socketDestroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setResolverConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getResolverInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_addPrivateDnsServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_removePrivateDnsServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_tetherApplyDnsInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_interfaceAddAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_interfaceDelAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setProcSysNet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getMetricsReportingLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setMetricsReportingLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_ipSecAllocateSpi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_ipSecAddSecurityAssociation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_ipSecDeleteSecurityAssociation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_ipSecApplyTransportModeTransform = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_ipSecRemoveTransportModeTransform = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_wakeupAddInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_wakeupDelInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_setIPv6AddrGenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
}
public static final int RESOLVER_PARAMS_SAMPLE_VALIDITY = 0;
public static final int RESOLVER_PARAMS_SUCCESS_THRESHOLD = 1;
public static final int RESOLVER_PARAMS_MIN_SAMPLES = 2;
public static final int RESOLVER_PARAMS_MAX_SAMPLES = 3;
public static final int RESOLVER_PARAMS_COUNT = 4;
public static final int RESOLVER_STATS_SUCCESSES = 0;
public static final int RESOLVER_STATS_ERRORS = 1;
public static final int RESOLVER_STATS_TIMEOUTS = 2;
public static final int RESOLVER_STATS_INTERNAL_ERRORS = 3;
public static final int RESOLVER_STATS_RTT_AVG = 4;
public static final int RESOLVER_STATS_LAST_SAMPLE_TIME = 5;
public static final int RESOLVER_STATS_USABLE = 6;
public static final int RESOLVER_STATS_COUNT = 7;
public static final int PRIVATE_DNS_SUCCESS = 0;
public static final int PRIVATE_DNS_BAD_ADDRESS = 1;
public static final int PRIVATE_DNS_BAD_PORT = 2;
public static final int PRIVATE_DNS_UNKNOWN_ALGORITHM = 3;
public static final int PRIVATE_DNS_BAD_FINGERPRINT = 4;
public static final int IPV4 = 4;
public static final int IPV6 = 6;
public static final int CONF = 1;
public static final int NEIGH = 2;
public static final int IPV6_ADDR_GEN_MODE_EUI64 = 0;
public static final int IPV6_ADDR_GEN_MODE_NONE = 1;
public static final int IPV6_ADDR_GEN_MODE_STABLE_PRIVACY = 2;
public static final int IPV6_ADDR_GEN_MODE_RANDOM = 3;
public static final int IPV6_ADDR_GEN_MODE_DEFAULT = 0;
/**
     * Returns true if the service is responding.
     */
public boolean isAlive() throws android.os.RemoteException;
/**
     * Replaces the contents of the specified UID-based firewall chain.
     *
     * The chain may be a whitelist chain or a blacklist chain. A blacklist chain contains DROP
     * rules for the specified UIDs and a RETURN rule at the end. A whitelist chain contains RETURN
     * rules for the system UID range (0 to {@code UID_APP} - 1), RETURN rules for for the specified
     * UIDs, and a DROP rule at the end. The chain will be created if it does not exist.
     *
     * @param chainName The name of the chain to replace.
     * @param isWhitelist Whether this is a whitelist or blacklist chain.
     * @param uids The list of UIDs to allow/deny.
     * @return true if the chain was successfully replaced, false otherwise.
     */
public boolean firewallReplaceUidChain(java.lang.String chainName, boolean isWhitelist, int[] uids) throws android.os.RemoteException;
/**
     * Enables or disables data saver mode on costly network interfaces.
     *
     * - When disabled, all packets to/from apps in the penalty box chain are rejected on costly
     *   interfaces. Traffic to/from other apps or on other network interfaces is allowed.
     * - When enabled, only apps that are in the happy box chain and not in the penalty box chain
     *   are allowed network connectivity on costly interfaces. All other packets on these
     *   interfaces are rejected. The happy box chain always contains all system UIDs; to disallow
     *   traffic from system UIDs, place them in the penalty box chain.
     *
     * By default, data saver mode is disabled. This command has no effect but might still return an
     * error) if {@code enable} is the same as the current value.
     *
     * @param enable whether to enable or disable data saver mode.
     * @return true if the if the operation was successful, false otherwise.
     */
public boolean bandwidthEnableDataSaver(boolean enable) throws android.os.RemoteException;
/**
     * Adds or removes one rule for each supplied UID range to prohibit all network activity outside
     * of secure VPN.
     *
     * When a UID is covered by one of these rules, traffic sent through any socket that is not
     * protected or explicitly overriden by the system will be rejected. The kernel will respond
     * with an ICMP prohibit message.
     *
     * Initially, there are no such rules. Any rules that are added will only last until the next
     * restart of netd or the device.
     *
     * @param add {@code true} if the specified UID ranges should be denied access to any network
     *        which is not secure VPN by adding rules, {@code false} to remove existing rules.
     * @param uidRanges a set of non-overlapping, contiguous ranges of UIDs to which to apply or
     *        remove this restriction.
     *        <p> Added rules should not overlap with existing rules. Likewise, removed rules should
     *        each correspond to an existing rule.
     *
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
public void networkRejectNonSecureVpn(boolean add, android.net.UidRange[] uidRanges) throws android.os.RemoteException;
/**
     * Administratively closes sockets belonging to the specified UIDs.
     */
public void socketDestroy(android.net.UidRange[] uidRanges, int[] exemptUids) throws android.os.RemoteException;
/**
     * Sets the name servers, search domains and resolver params for the given network. Flushes the
     * cache as needed (i.e. when the servers or the number of samples to store changes).
     *
     * @param netId the network ID of the network for which information should be configured.
     * @param servers the DNS servers to configure for the network.
     * @param domains the search domains to configure.
     * @param params the params to set. This array contains RESOLVER_PARAMS_COUNT integers that
     *   encode the contents of Bionic's __res_params struct, i.e. sample_validity is stored at
     *   position RESOLVER_PARAMS_SAMPLE_VALIDITY, etc.
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
public void setResolverConfiguration(int netId, java.lang.String[] servers, java.lang.String[] domains, int[] params) throws android.os.RemoteException;
/**
     * Retrieves the name servers, search domains and resolver stats associated with the given
     * network ID.
     *
     * @param netId the network ID of the network for which information should be retrieved.
     * @param servers the DNS servers that are currently configured for the network.
     * @param domains the search domains currently configured.
     * @param params the resolver parameters configured, i.e. the contents of __res_params in order.
     * @param stats the stats for each server in the order specified by RESOLVER_STATS_XXX
     *         constants, serialized as an int array. The contents of this array are the number of
     *         <ul>
     *           <li> successes,
     *           <li> errors,
     *           <li> timeouts,
     *           <li> internal errors,
     *           <li> the RTT average,
     *           <li> the time of the last recorded sample,
     *           <li> and an integer indicating whether the server is usable (1) or broken (0).
     *         </ul>
     *         in this order. For example, the timeout counter for server N is stored at position
     *         RESOLVER_STATS_COUNT*N + RESOLVER_STATS_TIMEOUTS
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
public void getResolverInfo(int netId, java.lang.String[] servers, java.lang.String[] domains, int[] params, int[] stats) throws android.os.RemoteException;
/**
     * Adds a server to the list of DNS resolvers that support DNS over TLS.  After this action
     * succeeds, any subsequent call to setResolverConfiguration will opportunistically use DNS
     * over TLS if the specified server is on this list and is reachable on that network.
     *
     * @param server the DNS server's IP address.  If a private DNS server is already configured
     *        with this IP address, it will be overwritten.
     * @param port the port on which the server is listening, typically 853.
     * @param fingerprintAlgorithm the hash algorithm used to compute the fingerprints.  This should
     *        be a name in MessageDigest's format.  Currently "SHA-256" is the only supported
     *        algorithm. Set this to the empty string to disable fingerprint validation.
     * @param fingerprints the server's public key fingerprints as Base64 strings.
     *        These can be generated using MessageDigest and android.util.Base64.encodeToString.
     *        Currently "SHA-256" is the only supported algorithm. Set this to empty to disable
     *        fingerprint validation.
     * @throws ServiceSpecificException in case of failure, with an error code indicating the
     *         cause of the the failure.
     */
public void addPrivateDnsServer(java.lang.String server, int port, java.lang.String fingerprintAlgorithm, java.lang.String[] fingerprints) throws android.os.RemoteException;
/**
     * Remove a server from the list of DNS resolvers that support DNS over TLS.
     *
     * @param server the DNS server's IP address.
     * @throws ServiceSpecificException in case of failure, with an error code indicating the
     *         cause of the the failure.
     */
public void removePrivateDnsServer(java.lang.String server) throws android.os.RemoteException;
/**
     * Instruct the tethering DNS server to reevaluated serving interfaces.
     * This is needed to for the DNS server to observe changes in the set
     * of potential listening IP addresses. (Listening on wildcard addresses
     * can turn the device into an open resolver; b/7530468)
     *
     * TODO: Return something richer than just a boolean.
     */
public boolean tetherApplyDnsInterfaces() throws android.os.RemoteException;
/**
     * Add/Remove and IP address from an interface.
     *
     * @param ifName the interface name
     * @param addrString the IP address to add/remove as a string literal
     * @param prefixLength the prefix length associated with this IP address
     *
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
public void interfaceAddAddress(java.lang.String ifName, java.lang.String addrString, int prefixLength) throws android.os.RemoteException;
public void interfaceDelAddress(java.lang.String ifName, java.lang.String addrString, int prefixLength) throws android.os.RemoteException;
public void setProcSysNet(int family, int which, java.lang.String ifname, java.lang.String parameter, java.lang.String value) throws android.os.RemoteException;
public int getMetricsReportingLevel() throws android.os.RemoteException;
public void setMetricsReportingLevel(int level) throws android.os.RemoteException;
public int ipSecAllocateSpi(int transformId, int direction, java.lang.String localAddress, java.lang.String remoteAddress, int spi) throws android.os.RemoteException;
/**
    * Create an IpSec Security Association describing how ip(v6) traffic will be encrypted
    * or decrypted.
    *
    * @param transformId a unique identifier for allocated resources
    * @param mode either Transport or Tunnel mode
    * @param direction DIRECTION_IN or DIRECTION_OUT
    * @param localAddress InetAddress as string for the local endpoint
    * @param remoteAddress InetAddress as string for the remote endpoint
    * @param underlyingNetworkHandle the networkHandle of the network to which the SA is applied
    * @param spi a 32-bit unique ID allocated to the user
    * @param authAlgo a string identifying the authentication algorithm to be used
    * @param authKey a byte array containing the authentication key
    * @param authTruncBits the truncation length of the MAC produced by the authentication algorithm
    * @param cryptAlgo a string identifying the encryption algorithm to be used
    * @param cryptKey a byte arrray containing the encryption key
    * @param cryptTruncBits unused parameter
    * @param encapType encapsulation type used (if any) for the udp encap socket
    * @param encapLocalPort the port number on the host to be used in encap packets
    * @param encapRemotePort the port number of the remote to be used for encap packets
    */
public void ipSecAddSecurityAssociation(int transformId, int mode, int direction, java.lang.String localAddress, java.lang.String remoteAddress, long underlyingNetworkHandle, int spi, java.lang.String authAlgo, byte[] authKey, int authTruncBits, java.lang.String cryptAlgo, byte[] cryptKey, int cryptTruncBits, int encapType, int encapLocalPort, int encapRemotePort) throws android.os.RemoteException;
/**
    * Delete a previously created security association identified by the provided parameters
    *
    * @param transformId a unique identifier for allocated resources
    * @param direction DIRECTION_IN or DIRECTION_OUT
    * @param localAddress InetAddress as string for the local endpoint
    * @param remoteAddress InetAddress as string for the remote endpoint
    * @param spi a requested 32-bit unique ID allocated to the user
    */
public void ipSecDeleteSecurityAssociation(int transformId, int direction, java.lang.String localAddress, java.lang.String remoteAddress, int spi) throws android.os.RemoteException;
/**
    * Apply a previously created SA to a specified socket, starting IPsec on that socket
    *
    * @param socket a user-provided socket that will have IPsec applied
    * @param transformId a unique identifier for allocated resources
    * @param direction DIRECTION_IN or DIRECTION_OUT
    * @param localAddress InetAddress as string for the local endpoint
    * @param remoteAddress InetAddress as string for the remote endpoint
    * @param spi a 32-bit unique ID allocated to the user (socket owner)
    */
public void ipSecApplyTransportModeTransform(java.io.FileDescriptor socket, int transformId, int direction, java.lang.String localAddress, java.lang.String remoteAddress, int spi) throws android.os.RemoteException;
/**
    * Remove an IPsec SA from a given socket. This will allow unencrypted traffic to flow
    * on that socket if a transform had been previously applied.
    *
    * @param socket a user-provided socket from which to remove any IPsec configuration
    */
public void ipSecRemoveTransportModeTransform(java.io.FileDescriptor socket) throws android.os.RemoteException;
/**
    * Request notification of wakeup packets arriving on an interface. Notifications will be
    * delivered to INetdEventListener.onWakeupEvent().
    *
    * @param ifName the interface
    * @param prefix arbitrary string used to identify wakeup sources in onWakeupEvent
    */
public void wakeupAddInterface(java.lang.String ifName, java.lang.String prefix, int mark, int mask) throws android.os.RemoteException;
/**
    * Stop notification of wakeup packets arriving on an interface.
    *
    * @param ifName the interface
    * @param prefix arbitrary string used to identify wakeup sources in onWakeupEvent
    */
public void wakeupDelInterface(java.lang.String ifName, java.lang.String prefix, int mark, int mask) throws android.os.RemoteException;
/**
    * Set IPv6 address generation mode. IPv6 should be disabled before changing mode.
    *
    * @param mode SLAAC address generation mechanism to use
    */
public void setIPv6AddrGenMode(java.lang.String ifName, int mode) throws android.os.RemoteException;
}
