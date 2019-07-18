/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/radio/ITuner.aidl
 */
package android.hardware.radio;
/** {@hide} */
public interface ITuner extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ITuner
{
private static final java.lang.String DESCRIPTOR = "android.hardware.radio.ITuner";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.radio.ITuner interface,
 * generating a proxy if needed.
 */
public static android.hardware.radio.ITuner asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.radio.ITuner))) {
return ((android.hardware.radio.ITuner)iin);
}
return new android.hardware.radio.ITuner.Stub.Proxy(obj);
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
case TRANSACTION_close:
{
data.enforceInterface(DESCRIPTOR);
this.close();
reply.writeNoException();
return true;
}
case TRANSACTION_isClosed:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isClosed();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.radio.RadioManager.BandConfig _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.radio.RadioManager.BandConfig.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setConfiguration(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.radio.RadioManager.BandConfig _result = this.getConfiguration();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setMuted:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setMuted(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isMuted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isMuted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_step:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.step(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_scan:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.scan(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_tune:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.radio.ProgramSelector _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.radio.ProgramSelector.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.tune(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_cancel:
{
data.enforceInterface(DESCRIPTOR);
this.cancel();
reply.writeNoException();
return true;
}
case TRANSACTION_cancelAnnouncement:
{
data.enforceInterface(DESCRIPTOR);
this.cancelAnnouncement();
reply.writeNoException();
return true;
}
case TRANSACTION_getProgramInformation:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.radio.RadioManager.ProgramInfo _result = this.getProgramInformation();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getImage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Bitmap _result = this.getImage(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_startBackgroundScan:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startBackgroundScan();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProgramList:
{
data.enforceInterface(DESCRIPTOR);
java.util.Map _arg0;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg0 = data.readHashMap(cl);
java.util.List<android.hardware.radio.RadioManager.ProgramInfo> _result = this.getProgramList(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_isAnalogForced:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAnalogForced();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setAnalogForced:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setAnalogForced(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isAntennaConnected:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAntennaConnected();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.radio.ITuner
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
@Override public void close() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isClosed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isClosed, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @throws IllegalArgumentException if config is not valid or null
     */
@Override public void setConfiguration(android.hardware.radio.RadioManager.BandConfig config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setConfiguration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.hardware.radio.RadioManager.BandConfig getConfiguration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.radio.RadioManager.BandConfig _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConfiguration, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.radio.RadioManager.BandConfig.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @throws IllegalStateException if tuner was opened without audio
     */
@Override public void setMuted(boolean mute) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((mute)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMuted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isMuted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isMuted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @throws IllegalStateException if called out of sequence
     */
@Override public void step(boolean directionDown, boolean skipSubChannel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((directionDown)?(1):(0)));
_data.writeInt(((skipSubChannel)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_step, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @throws IllegalStateException if called out of sequence
     */
@Override public void scan(boolean directionDown, boolean skipSubChannel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((directionDown)?(1):(0)));
_data.writeInt(((skipSubChannel)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_scan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @throws IllegalArgumentException if invalid arguments are passed
     * @throws IllegalStateException if called out of sequence
     */
@Override public void tune(android.hardware.radio.ProgramSelector selector) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((selector!=null)) {
_data.writeInt(1);
selector.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_tune, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * @throws IllegalStateException if called out of sequence
     */
@Override public void cancel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelAnnouncement() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelAnnouncement, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.hardware.radio.RadioManager.ProgramInfo getProgramInformation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.radio.RadioManager.ProgramInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProgramInformation, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.radio.RadioManager.ProgramInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.graphics.Bitmap getImage(int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_getImage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @return {@code true} if the scan was properly scheduled,
     *          {@code false} if the scan feature is unavailable
     */
@Override public boolean startBackgroundScan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startBackgroundScan, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @param vendorFilter Vendor-specific filter, must be Map<String, String>
     * @return the list, or null if scan is in progress
     * @throws IllegalArgumentException if invalid arguments are passed
     * @throws IllegalStateException if the scan has not been started, client may
     *         call startBackgroundScan to fix this.
     */
@Override public java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getProgramList(java.util.Map vendorFilter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.hardware.radio.RadioManager.ProgramInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeMap(vendorFilter);
mRemote.transact(Stub.TRANSACTION_getProgramList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.hardware.radio.RadioManager.ProgramInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @throws IllegalStateException if the switch is not supported at current
     *         configuration.
     */
@Override public boolean isAnalogForced() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAnalogForced, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @throws IllegalStateException if the switch is not supported at current
     *         configuration.
     */
@Override public void setAnalogForced(boolean isForced) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isForced)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAnalogForced, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isAntennaConnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAntennaConnected, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_isClosed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setMuted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_isMuted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_step = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_scan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_tune = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_cancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_cancelAnnouncement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getProgramInformation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_startBackgroundScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getProgramList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_isAnalogForced = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setAnalogForced = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_isAntennaConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
public void close() throws android.os.RemoteException;
public boolean isClosed() throws android.os.RemoteException;
/**
     * @throws IllegalArgumentException if config is not valid or null
     */
public void setConfiguration(android.hardware.radio.RadioManager.BandConfig config) throws android.os.RemoteException;
public android.hardware.radio.RadioManager.BandConfig getConfiguration() throws android.os.RemoteException;
/**
     * @throws IllegalStateException if tuner was opened without audio
     */
public void setMuted(boolean mute) throws android.os.RemoteException;
public boolean isMuted() throws android.os.RemoteException;
/**
     * @throws IllegalStateException if called out of sequence
     */
public void step(boolean directionDown, boolean skipSubChannel) throws android.os.RemoteException;
/**
     * @throws IllegalStateException if called out of sequence
     */
public void scan(boolean directionDown, boolean skipSubChannel) throws android.os.RemoteException;
/**
     * @throws IllegalArgumentException if invalid arguments are passed
     * @throws IllegalStateException if called out of sequence
     */
public void tune(android.hardware.radio.ProgramSelector selector) throws android.os.RemoteException;
/**
     * @throws IllegalStateException if called out of sequence
     */
public void cancel() throws android.os.RemoteException;
public void cancelAnnouncement() throws android.os.RemoteException;
public android.hardware.radio.RadioManager.ProgramInfo getProgramInformation() throws android.os.RemoteException;
public android.graphics.Bitmap getImage(int id) throws android.os.RemoteException;
/**
     * @return {@code true} if the scan was properly scheduled,
     *          {@code false} if the scan feature is unavailable
     */
public boolean startBackgroundScan() throws android.os.RemoteException;
/**
     * @param vendorFilter Vendor-specific filter, must be Map<String, String>
     * @return the list, or null if scan is in progress
     * @throws IllegalArgumentException if invalid arguments are passed
     * @throws IllegalStateException if the scan has not been started, client may
     *         call startBackgroundScan to fix this.
     */
public java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getProgramList(java.util.Map vendorFilter) throws android.os.RemoteException;
/**
     * @throws IllegalStateException if the switch is not supported at current
     *         configuration.
     */
public boolean isAnalogForced() throws android.os.RemoteException;
/**
     * @throws IllegalStateException if the switch is not supported at current
     *         configuration.
     */
public void setAnalogForced(boolean isForced) throws android.os.RemoteException;
public boolean isAntennaConnected() throws android.os.RemoteException;
}
