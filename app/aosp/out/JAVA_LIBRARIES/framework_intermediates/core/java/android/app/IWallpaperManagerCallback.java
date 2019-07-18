/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IWallpaperManagerCallback.aidl
 */
package android.app;
/**
 * Callback interface used by IWallpaperManager to send asynchronous 
 * notifications back to its clients.  Note that this is a
 * one-way interface so the server does not block waiting for the client.
 *
 * @hide
 */
public interface IWallpaperManagerCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IWallpaperManagerCallback
{
private static final java.lang.String DESCRIPTOR = "android.app.IWallpaperManagerCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IWallpaperManagerCallback interface,
 * generating a proxy if needed.
 */
public static android.app.IWallpaperManagerCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IWallpaperManagerCallback))) {
return ((android.app.IWallpaperManagerCallback)iin);
}
return new android.app.IWallpaperManagerCallback.Stub.Proxy(obj);
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
case TRANSACTION_onWallpaperChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onWallpaperChanged();
return true;
}
case TRANSACTION_onWallpaperColorsChanged:
{
data.enforceInterface(DESCRIPTOR);
android.app.WallpaperColors _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.WallpaperColors.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onWallpaperColorsChanged(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IWallpaperManagerCallback
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
     * Called when the wallpaper has changed
     */
@Override public void onWallpaperChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onWallpaperChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when wallpaper colors change
     */
@Override public void onWallpaperColorsChanged(android.app.WallpaperColors colors, int which, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((colors!=null)) {
_data.writeInt(1);
colors.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(which);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_onWallpaperColorsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onWallpaperChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onWallpaperColorsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Called when the wallpaper has changed
     */
public void onWallpaperChanged() throws android.os.RemoteException;
/**
     * Called when wallpaper colors change
     */
public void onWallpaperColorsChanged(android.app.WallpaperColors colors, int which, int userId) throws android.os.RemoteException;
}
