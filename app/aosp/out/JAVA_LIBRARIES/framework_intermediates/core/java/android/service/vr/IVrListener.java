/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/vr/IVrListener.aidl
 */
package android.service.vr;
/** @hide */
public interface IVrListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.vr.IVrListener
{
private static final java.lang.String DESCRIPTOR = "android.service.vr.IVrListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.vr.IVrListener interface,
 * generating a proxy if needed.
 */
public static android.service.vr.IVrListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.vr.IVrListener))) {
return ((android.service.vr.IVrListener)iin);
}
return new android.service.vr.IVrListener.Stub.Proxy(obj);
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
case TRANSACTION_focusedActivityChanged:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.focusedActivityChanged(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.vr.IVrListener
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
@Override public void focusedActivityChanged(android.content.ComponentName component, boolean running2dInVr, int pid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((running2dInVr)?(1):(0)));
_data.writeInt(pid);
mRemote.transact(Stub.TRANSACTION_focusedActivityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_focusedActivityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void focusedActivityChanged(android.content.ComponentName component, boolean running2dInVr, int pid) throws android.os.RemoteException;
}
