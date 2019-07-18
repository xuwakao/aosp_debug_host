/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/printservice/recommendation/IRecommendationServiceCallbacks.aidl
 */
package android.printservice.recommendation;
/**
 * Callbacks for communication with the print service recommendation service.
 *
 * @see android.print.IPrintServiceRecommendationService
 *
 * @hide
 */
public interface IRecommendationServiceCallbacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.printservice.recommendation.IRecommendationServiceCallbacks
{
private static final java.lang.String DESCRIPTOR = "android.printservice.recommendation.IRecommendationServiceCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.printservice.recommendation.IRecommendationServiceCallbacks interface,
 * generating a proxy if needed.
 */
public static android.printservice.recommendation.IRecommendationServiceCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.printservice.recommendation.IRecommendationServiceCallbacks))) {
return ((android.printservice.recommendation.IRecommendationServiceCallbacks)iin);
}
return new android.printservice.recommendation.IRecommendationServiceCallbacks.Stub.Proxy(obj);
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
case TRANSACTION_onRecommendationsUpdated:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.printservice.recommendation.RecommendationInfo> _arg0;
_arg0 = data.createTypedArrayList(android.printservice.recommendation.RecommendationInfo.CREATOR);
this.onRecommendationsUpdated(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.printservice.recommendation.IRecommendationServiceCallbacks
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
     * Update the print service recommendations.
     *
     * @param recommendations the new print service recommendations
     */
@Override public void onRecommendationsUpdated(java.util.List<android.printservice.recommendation.RecommendationInfo> recommendations) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(recommendations);
mRemote.transact(Stub.TRANSACTION_onRecommendationsUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onRecommendationsUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Update the print service recommendations.
     *
     * @param recommendations the new print service recommendations
     */
public void onRecommendationsUpdated(java.util.List<android.printservice.recommendation.RecommendationInfo> recommendations) throws android.os.RemoteException;
}
