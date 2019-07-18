/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/uce/uceservice/IUceListener.aidl
 */
package com.android.ims.internal.uce.uceservice;
/** IUceListener
 * {@hide}  */
public interface IUceListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.uce.uceservice.IUceListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.uce.uceservice.IUceListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.uce.uceservice.IUceListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.uce.uceservice.IUceListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.uce.uceservice.IUceListener))) {
return ((com.android.ims.internal.uce.uceservice.IUceListener)iin);
}
return new com.android.ims.internal.uce.uceservice.IUceListener.Stub.Proxy(obj);
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
case TRANSACTION_setStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setStatus(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.uce.uceservice.IUceListener
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
     * Get UCE Status
     * @param serviceStatusValue defined in ImsUceManager
     * @hide
     */
@Override public void setStatus(int serviceStatusValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serviceStatusValue);
mRemote.transact(Stub.TRANSACTION_setStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Get UCE Status
     * @param serviceStatusValue defined in ImsUceManager
     * @hide
     */
public void setStatus(int serviceStatusValue) throws android.os.RemoteException;
}
