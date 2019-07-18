/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IIncidentManager.aidl
 */
package android.os;
/**
  * Binder interface to report system health incidents.
  * {@hide}
  */
public interface IIncidentManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IIncidentManager
{
private static final java.lang.String DESCRIPTOR = "android.os.IIncidentManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IIncidentManager interface,
 * generating a proxy if needed.
 */
public static android.os.IIncidentManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IIncidentManager))) {
return ((android.os.IIncidentManager)iin);
}
return new android.os.IIncidentManager.Stub.Proxy(obj);
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
case TRANSACTION_reportIncident:
{
data.enforceInterface(DESCRIPTOR);
android.os.IncidentReportArgs _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.IncidentReportArgs.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.reportIncident(_arg0);
return true;
}
case TRANSACTION_reportIncidentToStream:
{
data.enforceInterface(DESCRIPTOR);
android.os.IncidentReportArgs _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.IncidentReportArgs.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IIncidentReportStatusListener _arg1;
_arg1 = android.os.IIncidentReportStatusListener.Stub.asInterface(data.readStrongBinder());
java.io.FileDescriptor _arg2;
_arg2 = data.readRawFileDescriptor();
this.reportIncidentToStream(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_systemRunning:
{
data.enforceInterface(DESCRIPTOR);
this.systemRunning();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IIncidentManager
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
     * Takes a report with the given args, reporting status to the optional listener.
     *
     * When the report is completed, the system report listener will be notified.
     */
@Override public void reportIncident(android.os.IncidentReportArgs args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_reportIncident, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Takes a report with the given args, reporting status to the optional listener.
     *
     * When the report is completed, the system report listener will be notified.
     */
@Override public void reportIncidentToStream(android.os.IncidentReportArgs args, android.os.IIncidentReportStatusListener listener, java.io.FileDescriptor stream) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeRawFileDescriptor(stream);
mRemote.transact(Stub.TRANSACTION_reportIncidentToStream, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tell the incident daemon that the android system server is up and running.
     */
@Override public void systemRunning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_systemRunning, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_reportIncident = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_reportIncidentToStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_systemRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Takes a report with the given args, reporting status to the optional listener.
     *
     * When the report is completed, the system report listener will be notified.
     */
public void reportIncident(android.os.IncidentReportArgs args) throws android.os.RemoteException;
/**
     * Takes a report with the given args, reporting status to the optional listener.
     *
     * When the report is completed, the system report listener will be notified.
     */
public void reportIncidentToStream(android.os.IncidentReportArgs args, android.os.IIncidentReportStatusListener listener, java.io.FileDescriptor stream) throws android.os.RemoteException;
/**
     * Tell the incident daemon that the android system server is up and running.
     */
public void systemRunning() throws android.os.RemoteException;
}
