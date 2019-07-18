/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/IIncidentReportCompletedListener.aidl
 */
package android.os;
/**
  * Listener for incident report status
  *
  * {@hide}
  */
public interface IIncidentReportCompletedListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IIncidentReportCompletedListener
{
private static final java.lang.String DESCRIPTOR = "android.os.IIncidentReportCompletedListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IIncidentReportCompletedListener interface,
 * generating a proxy if needed.
 */
public static android.os.IIncidentReportCompletedListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IIncidentReportCompletedListener))) {
return ((android.os.IIncidentReportCompletedListener)iin);
}
return new android.os.IIncidentReportCompletedListener.Stub.Proxy(obj);
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
case TRANSACTION_onIncidentReport:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onIncidentReport(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IIncidentReportCompletedListener
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
     * Called when there has been an incident report.
     *
     * The system service implementing this method should delete or move the file
     * after it is finished with it.
     */
@Override public void onIncidentReport(java.lang.String filename) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(filename);
mRemote.transact(Stub.TRANSACTION_onIncidentReport, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onIncidentReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Called when there has been an incident report.
     *
     * The system service implementing this method should delete or move the file
     * after it is finished with it.
     */
public void onIncidentReport(java.lang.String filename) throws android.os.RemoteException;
}
