/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/radio/ITunerCallback.aidl
 */
package android.hardware.radio;
/** {@hide} */
public interface ITunerCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ITunerCallback
{
private static final java.lang.String DESCRIPTOR = "android.hardware.radio.ITunerCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.radio.ITunerCallback interface,
 * generating a proxy if needed.
 */
public static android.hardware.radio.ITunerCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.radio.ITunerCallback))) {
return ((android.hardware.radio.ITunerCallback)iin);
}
return new android.hardware.radio.ITunerCallback.Stub.Proxy(obj);
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
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onError(_arg0);
return true;
}
case TRANSACTION_onConfigurationChanged:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.radio.RadioManager.BandConfig _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.radio.RadioManager.BandConfig.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onConfigurationChanged(_arg0);
return true;
}
case TRANSACTION_onCurrentProgramInfoChanged:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.radio.RadioManager.ProgramInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.radio.RadioManager.ProgramInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onCurrentProgramInfoChanged(_arg0);
return true;
}
case TRANSACTION_onTrafficAnnouncement:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onTrafficAnnouncement(_arg0);
return true;
}
case TRANSACTION_onEmergencyAnnouncement:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onEmergencyAnnouncement(_arg0);
return true;
}
case TRANSACTION_onAntennaState:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onAntennaState(_arg0);
return true;
}
case TRANSACTION_onBackgroundScanAvailabilityChange:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onBackgroundScanAvailabilityChange(_arg0);
return true;
}
case TRANSACTION_onBackgroundScanComplete:
{
data.enforceInterface(DESCRIPTOR);
this.onBackgroundScanComplete();
return true;
}
case TRANSACTION_onProgramListChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onProgramListChanged();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.radio.ITunerCallback
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
@Override public void onError(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onConfigurationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCurrentProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onCurrentProgramInfoChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onTrafficAnnouncement(boolean active) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((active)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onTrafficAnnouncement, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onEmergencyAnnouncement(boolean active) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((active)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onEmergencyAnnouncement, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAntennaState(boolean connected) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((connected)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onAntennaState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBackgroundScanAvailabilityChange(boolean isAvailable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isAvailable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onBackgroundScanAvailabilityChange, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBackgroundScanComplete() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onBackgroundScanComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onProgramListChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onProgramListChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onConfigurationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onCurrentProgramInfoChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onTrafficAnnouncement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onEmergencyAnnouncement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onAntennaState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onBackgroundScanAvailabilityChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onBackgroundScanComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onProgramListChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public void onError(int status) throws android.os.RemoteException;
public void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig config) throws android.os.RemoteException;
public void onCurrentProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo info) throws android.os.RemoteException;
public void onTrafficAnnouncement(boolean active) throws android.os.RemoteException;
public void onEmergencyAnnouncement(boolean active) throws android.os.RemoteException;
public void onAntennaState(boolean connected) throws android.os.RemoteException;
public void onBackgroundScanAvailabilityChange(boolean isAvailable) throws android.os.RemoteException;
public void onBackgroundScanComplete() throws android.os.RemoteException;
public void onProgramListChanged() throws android.os.RemoteException;
}
