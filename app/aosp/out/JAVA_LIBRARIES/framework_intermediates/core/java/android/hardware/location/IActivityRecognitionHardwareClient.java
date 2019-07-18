/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/location/IActivityRecognitionHardwareClient.aidl
 */
package android.hardware.location;
/**
 * Activity Recognition Hardware client interface.
 * This interface can be used to receive interfaces to implementations of
 * {@link IActivityRecognitionHardware}.
 *
 * @hide
 */
public interface IActivityRecognitionHardwareClient extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IActivityRecognitionHardwareClient
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IActivityRecognitionHardwareClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IActivityRecognitionHardwareClient interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IActivityRecognitionHardwareClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IActivityRecognitionHardwareClient))) {
return ((android.hardware.location.IActivityRecognitionHardwareClient)iin);
}
return new android.hardware.location.IActivityRecognitionHardwareClient.Stub.Proxy(obj);
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
case TRANSACTION_onAvailabilityChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.hardware.location.IActivityRecognitionHardware _arg1;
_arg1 = android.hardware.location.IActivityRecognitionHardware.Stub.asInterface(data.readStrongBinder());
this.onAvailabilityChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IActivityRecognitionHardwareClient
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
     * Hardware Activity-Recognition availability event.
     *
     * @param isSupported whether the platform has hardware support for the feature
     * @param instance the available instance to provide access to the feature
     */
@Override public void onAvailabilityChanged(boolean isSupported, android.hardware.location.IActivityRecognitionHardware instance) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isSupported)?(1):(0)));
_data.writeStrongBinder((((instance!=null))?(instance.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onAvailabilityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onAvailabilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Hardware Activity-Recognition availability event.
     *
     * @param isSupported whether the platform has hardware support for the feature
     * @param instance the available instance to provide access to the feature
     */
public void onAvailabilityChanged(boolean isSupported, android.hardware.location.IActivityRecognitionHardware instance) throws android.os.RemoteException;
}
