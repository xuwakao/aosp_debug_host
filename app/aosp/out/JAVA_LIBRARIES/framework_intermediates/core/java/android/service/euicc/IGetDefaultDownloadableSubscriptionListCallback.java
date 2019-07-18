/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/euicc/IGetDefaultDownloadableSubscriptionListCallback.aidl
 */
package android.service.euicc;
/** @hide */
public interface IGetDefaultDownloadableSubscriptionListCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback
{
private static final java.lang.String DESCRIPTOR = "android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback interface,
 * generating a proxy if needed.
 */
public static android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback))) {
return ((android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback)iin);
}
return new android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback.Stub.Proxy(obj);
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
case TRANSACTION_onComplete:
{
data.enforceInterface(DESCRIPTOR);
android.service.euicc.GetDefaultDownloadableSubscriptionListResult _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.euicc.GetDefaultDownloadableSubscriptionListResult.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onComplete(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback
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
@Override public void onComplete(android.service.euicc.GetDefaultDownloadableSubscriptionListResult result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onComplete(android.service.euicc.GetDefaultDownloadableSubscriptionListResult result) throws android.os.RemoteException;
}
