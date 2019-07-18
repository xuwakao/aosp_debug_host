/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/IMediaResourceMonitor.aidl
 */
package android.media;
/** {@hide} */
public interface IMediaResourceMonitor extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.IMediaResourceMonitor
{
private static final java.lang.String DESCRIPTOR = "android.media.IMediaResourceMonitor";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.IMediaResourceMonitor interface,
 * generating a proxy if needed.
 */
public static android.media.IMediaResourceMonitor asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.IMediaResourceMonitor))) {
return ((android.media.IMediaResourceMonitor)iin);
}
return new android.media.IMediaResourceMonitor.Stub.Proxy(obj);
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
case TRANSACTION_notifyResourceGranted:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.notifyResourceGranted(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.IMediaResourceMonitor
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
@Override public void notifyResourceGranted(int pid, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pid);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_notifyResourceGranted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_notifyResourceGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void notifyResourceGranted(int pid, int type) throws android.os.RemoteException;
}
