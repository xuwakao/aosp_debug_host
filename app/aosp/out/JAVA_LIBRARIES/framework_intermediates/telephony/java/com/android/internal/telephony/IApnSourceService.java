/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/internal/telephony/IApnSourceService.aidl
 */
package com.android.internal.telephony;
public interface IApnSourceService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IApnSourceService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IApnSourceService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.IApnSourceService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.IApnSourceService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.IApnSourceService))) {
return ((com.android.internal.telephony.IApnSourceService)iin);
}
return new com.android.internal.telephony.IApnSourceService.Stub.Proxy(obj);
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
case TRANSACTION_getApns:
{
data.enforceInterface(DESCRIPTOR);
android.content.ContentValues[] _result = this.getApns();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.IApnSourceService
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
/** Retreive APNs. */
@Override public android.content.ContentValues[] getApns() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ContentValues[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getApns, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.content.ContentValues.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getApns = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/** Retreive APNs. */
public android.content.ContentValues[] getApns() throws android.os.RemoteException;
}
