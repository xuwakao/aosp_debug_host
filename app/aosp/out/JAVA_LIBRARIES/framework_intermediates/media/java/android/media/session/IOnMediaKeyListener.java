/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/session/IOnMediaKeyListener.aidl
 */
package android.media.session;
/**
 * Listener to handle media key.
 * @hide
 */
public interface IOnMediaKeyListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.session.IOnMediaKeyListener
{
private static final java.lang.String DESCRIPTOR = "android.media.session.IOnMediaKeyListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.session.IOnMediaKeyListener interface,
 * generating a proxy if needed.
 */
public static android.media.session.IOnMediaKeyListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.session.IOnMediaKeyListener))) {
return ((android.media.session.IOnMediaKeyListener)iin);
}
return new android.media.session.IOnMediaKeyListener.Stub.Proxy(obj);
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
case TRANSACTION_onMediaKey:
{
data.enforceInterface(DESCRIPTOR);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.ResultReceiver _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ResultReceiver.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onMediaKey(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.session.IOnMediaKeyListener
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
@Override public void onMediaKey(android.view.KeyEvent event, android.os.ResultReceiver result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onMediaKey, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onMediaKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onMediaKey(android.view.KeyEvent event, android.os.ResultReceiver result) throws android.os.RemoteException;
}
