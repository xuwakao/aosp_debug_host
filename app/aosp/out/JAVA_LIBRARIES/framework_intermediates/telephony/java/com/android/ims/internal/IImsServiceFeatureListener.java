/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/IImsServiceFeatureListener.aidl
 */
package com.android.ims.internal;
/**
 *  Interface from ImsResolver to ImsServiceProxy in ImsManager.
 * Callback to ImsManager when a feature changes in the ImsServiceController.
 * {@hide}
 */
public interface IImsServiceFeatureListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsServiceFeatureListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsServiceFeatureListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsServiceFeatureListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsServiceFeatureListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsServiceFeatureListener))) {
return ((com.android.ims.internal.IImsServiceFeatureListener)iin);
}
return new com.android.ims.internal.IImsServiceFeatureListener.Stub.Proxy(obj);
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
case TRANSACTION_imsFeatureCreated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.imsFeatureCreated(_arg0, _arg1);
return true;
}
case TRANSACTION_imsFeatureRemoved:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.imsFeatureRemoved(_arg0, _arg1);
return true;
}
case TRANSACTION_imsStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.imsStatusChanged(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsServiceFeatureListener
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
@Override public void imsFeatureCreated(int slotId, int feature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(feature);
mRemote.transact(Stub.TRANSACTION_imsFeatureCreated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void imsFeatureRemoved(int slotId, int feature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(feature);
mRemote.transact(Stub.TRANSACTION_imsFeatureRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void imsStatusChanged(int slotId, int feature, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
_data.writeInt(feature);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_imsStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_imsFeatureCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_imsFeatureRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_imsStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void imsFeatureCreated(int slotId, int feature) throws android.os.RemoteException;
public void imsFeatureRemoved(int slotId, int feature) throws android.os.RemoteException;
public void imsStatusChanged(int slotId, int feature, int status) throws android.os.RemoteException;
}
