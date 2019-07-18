/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/location/IFusedLocationHardwareSink.aidl
 */
package android.hardware.location;
/**
 * Fused Location hardware event sink interface.
 * This interface defines the set of events that the FusedLocationHardware provides.
 *
 * @hide
 */
public interface IFusedLocationHardwareSink extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IFusedLocationHardwareSink
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IFusedLocationHardwareSink";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IFusedLocationHardwareSink interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IFusedLocationHardwareSink asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IFusedLocationHardwareSink))) {
return ((android.hardware.location.IFusedLocationHardwareSink)iin);
}
return new android.hardware.location.IFusedLocationHardwareSink.Stub.Proxy(obj);
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
case TRANSACTION_onLocationAvailable:
{
data.enforceInterface(DESCRIPTOR);
android.location.Location[] _arg0;
_arg0 = data.createTypedArray(android.location.Location.CREATOR);
this.onLocationAvailable(_arg0);
return true;
}
case TRANSACTION_onDiagnosticDataAvailable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onDiagnosticDataAvailable(_arg0);
return true;
}
case TRANSACTION_onCapabilities:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onCapabilities(_arg0);
return true;
}
case TRANSACTION_onStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onStatusChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IFusedLocationHardwareSink
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
     * Event generated when a batch of location information is available.
     *
     * @param locations     The batch of location information available.
     */
@Override public void onLocationAvailable(android.location.Location[] locations) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(locations, 0);
mRemote.transact(Stub.TRANSACTION_onLocationAvailable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Event generated from FLP HAL to provide diagnostic data to the platform.
     *
     * @param data      The diagnostic data provided by FLP HAL.
     */
@Override public void onDiagnosticDataAvailable(java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_onDiagnosticDataAvailable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Event generated from FLP HAL to provide a mask of supported
     * capabilities.  Should be called immediatly after init.
     */
@Override public void onCapabilities(int capabilities) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(capabilities);
mRemote.transact(Stub.TRANSACTION_onCapabilities, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Event generated from FLP HAL when the status of location batching
     * changes (location is successful/unsuccessful).
     */
@Override public void onStatusChanged(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onLocationAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onDiagnosticDataAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onCapabilities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Event generated when a batch of location information is available.
     *
     * @param locations     The batch of location information available.
     */
public void onLocationAvailable(android.location.Location[] locations) throws android.os.RemoteException;
/**
     * Event generated from FLP HAL to provide diagnostic data to the platform.
     *
     * @param data      The diagnostic data provided by FLP HAL.
     */
public void onDiagnosticDataAvailable(java.lang.String data) throws android.os.RemoteException;
/**
     * Event generated from FLP HAL to provide a mask of supported
     * capabilities.  Should be called immediatly after init.
     */
public void onCapabilities(int capabilities) throws android.os.RemoteException;
/**
     * Event generated from FLP HAL when the status of location batching
     * changes (location is successful/unsuccessful).
     */
public void onStatusChanged(int status) throws android.os.RemoteException;
}
