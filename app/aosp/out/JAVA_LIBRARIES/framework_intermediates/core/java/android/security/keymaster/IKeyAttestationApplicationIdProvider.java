/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/security/keymaster/IKeyAttestationApplicationIdProvider.aidl
 */
package android.security.keymaster;
/**
 * This must be kept manually in sync with system/security/keystore until AIDL
 * can generate both Java and C++ bindings.
 *
 * @hide
 */
public interface IKeyAttestationApplicationIdProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.security.keymaster.IKeyAttestationApplicationIdProvider
{
private static final java.lang.String DESCRIPTOR = "android.security.keymaster.IKeyAttestationApplicationIdProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.security.keymaster.IKeyAttestationApplicationIdProvider interface,
 * generating a proxy if needed.
 */
public static android.security.keymaster.IKeyAttestationApplicationIdProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.security.keymaster.IKeyAttestationApplicationIdProvider))) {
return ((android.security.keymaster.IKeyAttestationApplicationIdProvider)iin);
}
return new android.security.keymaster.IKeyAttestationApplicationIdProvider.Stub.Proxy(obj);
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
case TRANSACTION_getKeyAttestationApplicationId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.security.keymaster.KeyAttestationApplicationId _result = this.getKeyAttestationApplicationId(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.security.keymaster.IKeyAttestationApplicationIdProvider
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
/* keep in sync with /system/security/keystore/keystore_attestation_id.cpp */
@Override public android.security.keymaster.KeyAttestationApplicationId getKeyAttestationApplicationId(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.security.keymaster.KeyAttestationApplicationId _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getKeyAttestationApplicationId, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.security.keymaster.KeyAttestationApplicationId.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_getKeyAttestationApplicationId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/* keep in sync with /system/security/keystore/keystore_attestation_id.cpp */
public android.security.keymaster.KeyAttestationApplicationId getKeyAttestationApplicationId(int uid) throws android.os.RemoteException;
}
