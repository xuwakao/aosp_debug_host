/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telecomm/java/com/android/internal/telecom/ICallScreeningAdapter.aidl
 */
package com.android.internal.telecom;
/**
 * Internal remote callback interface for call screening services.
 *
 * @see android.telecom.CallScreeningService
 *
 * {@hide}
 */
public interface ICallScreeningAdapter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallScreeningAdapter
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallScreeningAdapter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telecom.ICallScreeningAdapter interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telecom.ICallScreeningAdapter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telecom.ICallScreeningAdapter))) {
return ((com.android.internal.telecom.ICallScreeningAdapter)iin);
}
return new com.android.internal.telecom.ICallScreeningAdapter.Stub.Proxy(obj);
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
case TRANSACTION_allowCall:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.allowCall(_arg0);
return true;
}
case TRANSACTION_disallowCall:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _arg3;
_arg3 = (0!=data.readInt());
this.disallowCall(_arg0, _arg1, _arg2, _arg3);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telecom.ICallScreeningAdapter
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
@Override public void allowCall(java.lang.String callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
mRemote.transact(Stub.TRANSACTION_allowCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void disallowCall(java.lang.String callId, boolean shouldReject, boolean shouldAddToCallLog, boolean shouldShowNotification) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callId);
_data.writeInt(((shouldReject)?(1):(0)));
_data.writeInt(((shouldAddToCallLog)?(1):(0)));
_data.writeInt(((shouldShowNotification)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_disallowCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_allowCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disallowCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void allowCall(java.lang.String callId) throws android.os.RemoteException;
public void disallowCall(java.lang.String callId, boolean shouldReject, boolean shouldAddToCallLog, boolean shouldShowNotification) throws android.os.RemoteException;
}
