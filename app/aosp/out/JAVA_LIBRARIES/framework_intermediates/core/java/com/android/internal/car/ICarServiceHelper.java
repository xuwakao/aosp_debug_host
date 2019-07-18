/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/car/ICarServiceHelper.aidl
 */
package com.android.internal.car;
/**
 * Helper API for car service. Only for itneraction between system server and car service.
 * @hide
 */
public interface ICarServiceHelper extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.car.ICarServiceHelper
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.car.ICarServiceHelper";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.car.ICarServiceHelper interface,
 * generating a proxy if needed.
 */
public static com.android.internal.car.ICarServiceHelper asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.car.ICarServiceHelper))) {
return ((com.android.internal.car.ICarServiceHelper)iin);
}
return new com.android.internal.car.ICarServiceHelper.Stub.Proxy(obj);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.car.ICarServiceHelper
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
}
}
}
