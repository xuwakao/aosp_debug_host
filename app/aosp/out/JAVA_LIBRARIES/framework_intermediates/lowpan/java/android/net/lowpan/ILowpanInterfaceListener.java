/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/lowpan/java/android/net/lowpan/ILowpanInterfaceListener.aidl
 */
package android.net.lowpan;
/** {@hide} */
public interface ILowpanInterfaceListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanInterfaceListener
{
private static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanInterfaceListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.lowpan.ILowpanInterfaceListener interface,
 * generating a proxy if needed.
 */
public static android.net.lowpan.ILowpanInterfaceListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.lowpan.ILowpanInterfaceListener))) {
return ((android.net.lowpan.ILowpanInterfaceListener)iin);
}
return new android.net.lowpan.ILowpanInterfaceListener.Stub.Proxy(obj);
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
case TRANSACTION_onEnabledChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onEnabledChanged(_arg0);
return true;
}
case TRANSACTION_onConnectedChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onConnectedChanged(_arg0);
return true;
}
case TRANSACTION_onUpChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onUpChanged(_arg0);
return true;
}
case TRANSACTION_onRoleChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onRoleChanged(_arg0);
return true;
}
case TRANSACTION_onStateChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onStateChanged(_arg0);
return true;
}
case TRANSACTION_onLowpanIdentityChanged:
{
data.enforceInterface(DESCRIPTOR);
android.net.lowpan.LowpanIdentity _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.lowpan.LowpanIdentity.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onLowpanIdentityChanged(_arg0);
return true;
}
case TRANSACTION_onLinkNetworkAdded:
{
data.enforceInterface(DESCRIPTOR);
android.net.IpPrefix _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.IpPrefix.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onLinkNetworkAdded(_arg0);
return true;
}
case TRANSACTION_onLinkNetworkRemoved:
{
data.enforceInterface(DESCRIPTOR);
android.net.IpPrefix _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.IpPrefix.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onLinkNetworkRemoved(_arg0);
return true;
}
case TRANSACTION_onLinkAddressAdded:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onLinkAddressAdded(_arg0);
return true;
}
case TRANSACTION_onLinkAddressRemoved:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onLinkAddressRemoved(_arg0);
return true;
}
case TRANSACTION_onReceiveFromCommissioner:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.onReceiveFromCommissioner(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.lowpan.ILowpanInterfaceListener
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
@Override public void onEnabledChanged(boolean value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((value)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onEnabledChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConnectedChanged(boolean value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((value)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onConnectedChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onUpChanged(boolean value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((value)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onUpChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRoleChanged(java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_onRoleChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onStateChanged(java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_onStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLowpanIdentityChanged(android.net.lowpan.LowpanIdentity value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((value!=null)) {
_data.writeInt(1);
value.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onLowpanIdentityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLinkNetworkAdded(android.net.IpPrefix value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((value!=null)) {
_data.writeInt(1);
value.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onLinkNetworkAdded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLinkNetworkRemoved(android.net.IpPrefix value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((value!=null)) {
_data.writeInt(1);
value.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onLinkNetworkRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLinkAddressAdded(java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_onLinkAddressAdded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLinkAddressRemoved(java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_onLinkAddressRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onReceiveFromCommissioner(byte[] packet) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(packet);
mRemote.transact(Stub.TRANSACTION_onReceiveFromCommissioner, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onEnabledChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onConnectedChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onUpChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onRoleChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onLowpanIdentityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onLinkNetworkAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onLinkNetworkRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onLinkAddressAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onLinkAddressRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onReceiveFromCommissioner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void onEnabledChanged(boolean value) throws android.os.RemoteException;
public void onConnectedChanged(boolean value) throws android.os.RemoteException;
public void onUpChanged(boolean value) throws android.os.RemoteException;
public void onRoleChanged(java.lang.String value) throws android.os.RemoteException;
public void onStateChanged(java.lang.String value) throws android.os.RemoteException;
public void onLowpanIdentityChanged(android.net.lowpan.LowpanIdentity value) throws android.os.RemoteException;
public void onLinkNetworkAdded(android.net.IpPrefix value) throws android.os.RemoteException;
public void onLinkNetworkRemoved(android.net.IpPrefix value) throws android.os.RemoteException;
public void onLinkAddressAdded(java.lang.String value) throws android.os.RemoteException;
public void onLinkAddressRemoved(java.lang.String value) throws android.os.RemoteException;
public void onReceiveFromCommissioner(byte[] packet) throws android.os.RemoteException;
}
