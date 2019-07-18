/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/service/media/IMediaBrowserServiceCallbacks.aidl
 */
package android.service.media;
/**
 * Media API allows clients to browse through hierarchy of a user’s media collection,
 * playback a specific media entry and interact with the now playing queue.
 * @hide
 */
public interface IMediaBrowserServiceCallbacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.media.IMediaBrowserServiceCallbacks
{
private static final java.lang.String DESCRIPTOR = "android.service.media.IMediaBrowserServiceCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.media.IMediaBrowserServiceCallbacks interface,
 * generating a proxy if needed.
 */
public static android.service.media.IMediaBrowserServiceCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.media.IMediaBrowserServiceCallbacks))) {
return ((android.service.media.IMediaBrowserServiceCallbacks)iin);
}
return new android.service.media.IMediaBrowserServiceCallbacks.Stub.Proxy(obj);
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
case TRANSACTION_onConnect:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.media.session.MediaSession.Token _arg1;
if ((0!=data.readInt())) {
_arg1 = android.media.session.MediaSession.Token.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onConnect(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onConnectFailed:
{
data.enforceInterface(DESCRIPTOR);
this.onConnectFailed();
return true;
}
case TRANSACTION_onLoadChildren:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.ParceledListSlice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onLoadChildren(_arg0, _arg1);
return true;
}
case TRANSACTION_onLoadChildrenWithOptions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.ParceledListSlice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onLoadChildrenWithOptions(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.media.IMediaBrowserServiceCallbacks
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
     * Invoked when the connected has been established.
     * @param root The root media id for browsing.
     * @param session The {@link MediaSession.Token media session token} that can be used to control
     *         the playback of the media app.
     * @param extra Extras returned by the media service.
     */
@Override public void onConnect(java.lang.String root, android.media.session.MediaSession.Token session, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(root);
if ((session!=null)) {
_data.writeInt(1);
session.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onConnect, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConnectFailed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onConnectFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLoadChildren(java.lang.String mediaId, android.content.pm.ParceledListSlice list) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mediaId);
if ((list!=null)) {
_data.writeInt(1);
list.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onLoadChildren, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLoadChildrenWithOptions(java.lang.String mediaId, android.content.pm.ParceledListSlice list, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(mediaId);
if ((list!=null)) {
_data.writeInt(1);
list.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onLoadChildrenWithOptions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onConnectFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onLoadChildren = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onLoadChildrenWithOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Invoked when the connected has been established.
     * @param root The root media id for browsing.
     * @param session The {@link MediaSession.Token media session token} that can be used to control
     *         the playback of the media app.
     * @param extra Extras returned by the media service.
     */
public void onConnect(java.lang.String root, android.media.session.MediaSession.Token session, android.os.Bundle extras) throws android.os.RemoteException;
public void onConnectFailed() throws android.os.RemoteException;
public void onLoadChildren(java.lang.String mediaId, android.content.pm.ParceledListSlice list) throws android.os.RemoteException;
public void onLoadChildrenWithOptions(java.lang.String mediaId, android.content.pm.ParceledListSlice list, android.os.Bundle options) throws android.os.RemoteException;
}
