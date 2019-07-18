/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/IImsConfig.aidl
 */
package com.android.ims.internal;
/**
 * Provides APIs to get/set the IMS service feature/capability/parameters.
 * The config items include:
 * 1) Items provisioned by the operator.
 * 2) Items configured by user. Mainly service feature class.
 *
 * {@hide}
 */
public interface IImsConfig extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsConfig
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsConfig";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsConfig interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsConfig asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsConfig))) {
return ((com.android.ims.internal.IImsConfig)iin);
}
return new com.android.ims.internal.IImsConfig.Stub.Proxy(obj);
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
case TRANSACTION_getProvisionedValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getProvisionedValue(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getProvisionedStringValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getProvisionedStringValue(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setProvisionedValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.setProvisionedValue(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setProvisionedStringValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.setProvisionedStringValue(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getFeatureValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.android.ims.ImsConfigListener _arg2;
_arg2 = com.android.ims.ImsConfigListener.Stub.asInterface(data.readStrongBinder());
this.getFeatureValue(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_setFeatureValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
com.android.ims.ImsConfigListener _arg3;
_arg3 = com.android.ims.ImsConfigListener.Stub.asInterface(data.readStrongBinder());
this.setFeatureValue(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_getVolteProvisioned:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getVolteProvisioned();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getVideoQuality:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.ImsConfigListener _arg0;
_arg0 = com.android.ims.ImsConfigListener.Stub.asInterface(data.readStrongBinder());
this.getVideoQuality(_arg0);
return true;
}
case TRANSACTION_setVideoQuality:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.ims.ImsConfigListener _arg1;
_arg1 = com.android.ims.ImsConfigListener.Stub.asInterface(data.readStrongBinder());
this.setVideoQuality(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsConfig
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
@Override public int getProvisionedValue(int item) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(item);
mRemote.transact(Stub.TRANSACTION_getProvisionedValue, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getProvisionedStringValue(int item) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(item);
mRemote.transact(Stub.TRANSACTION_getProvisionedStringValue, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setProvisionedValue(int item, int value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(item);
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_setProvisionedValue, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setProvisionedStringValue(int item, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(item);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setProvisionedStringValue, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets the value of the specified IMS feature item for specified network type.
     * This operation gets the feature config value from the master storage (i.e. final
     * value). Asynchronous non-blocking call.
     *
     * @param feature. as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param network. as defined in android.telephony.TelephonyManager#NETWORK_TYPE_XXX.
     * @param listener. feature value returned asynchronously through listener.
     * @return void
     */
@Override public void getFeatureValue(int feature, int network, com.android.ims.ImsConfigListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feature);
_data.writeInt(network);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getFeatureValue, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets the value for IMS feature item for specified network type.
     * This operation stores the user setting in setting db from which master db
     * is dervied.
     *
     * @param feature. as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param network. as defined in android.telephony.TelephonyManager#NETWORK_TYPE_XXX.
     * @param value. as defined in com.android.ims.ImsConfig#FeatureValueConstants.
     * @param listener, provided if caller needs to be notified for set result.
     * @return void
     */
@Override public void setFeatureValue(int feature, int network, int value, com.android.ims.ImsConfigListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feature);
_data.writeInt(network);
_data.writeInt(value);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setFeatureValue, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Gets the value for IMS volte provisioned.
     * This should be the same as the operator provisioned value if applies.
     *
     * @return void
     */
@Override public boolean getVolteProvisioned() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVolteProvisioned, _data, _reply, 0);
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
     *
     * Gets the value for ims fature item video quality.
     *
     * @param listener. Video quality value returned asynchronously through listener.
     * @return void
     */
@Override public void getVideoQuality(com.android.ims.ImsConfigListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getVideoQuality, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets the value for IMS feature item video quality.
     *
     * @param quality, defines the value of video quality.
     * @param listener, provided if caller needs to be notified for set result.
     * @return void
     *
     * @throws ImsException if calling the IMS service results in an error.
     */
@Override public void setVideoQuality(int quality, com.android.ims.ImsConfigListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(quality);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setVideoQuality, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getProvisionedValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getProvisionedStringValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setProvisionedValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setProvisionedStringValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getFeatureValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setFeatureValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getVolteProvisioned = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getVideoQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setVideoQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public int getProvisionedValue(int item) throws android.os.RemoteException;
public java.lang.String getProvisionedStringValue(int item) throws android.os.RemoteException;
public int setProvisionedValue(int item, int value) throws android.os.RemoteException;
public int setProvisionedStringValue(int item, java.lang.String value) throws android.os.RemoteException;
/**
     * Gets the value of the specified IMS feature item for specified network type.
     * This operation gets the feature config value from the master storage (i.e. final
     * value). Asynchronous non-blocking call.
     *
     * @param feature. as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param network. as defined in android.telephony.TelephonyManager#NETWORK_TYPE_XXX.
     * @param listener. feature value returned asynchronously through listener.
     * @return void
     */
public void getFeatureValue(int feature, int network, com.android.ims.ImsConfigListener listener) throws android.os.RemoteException;
/**
     * Sets the value for IMS feature item for specified network type.
     * This operation stores the user setting in setting db from which master db
     * is dervied.
     *
     * @param feature. as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param network. as defined in android.telephony.TelephonyManager#NETWORK_TYPE_XXX.
     * @param value. as defined in com.android.ims.ImsConfig#FeatureValueConstants.
     * @param listener, provided if caller needs to be notified for set result.
     * @return void
     */
public void setFeatureValue(int feature, int network, int value, com.android.ims.ImsConfigListener listener) throws android.os.RemoteException;
/**
     * Gets the value for IMS volte provisioned.
     * This should be the same as the operator provisioned value if applies.
     *
     * @return void
     */
public boolean getVolteProvisioned() throws android.os.RemoteException;
/**
     *
     * Gets the value for ims fature item video quality.
     *
     * @param listener. Video quality value returned asynchronously through listener.
     * @return void
     */
public void getVideoQuality(com.android.ims.ImsConfigListener listener) throws android.os.RemoteException;
/**
     * Sets the value for IMS feature item video quality.
     *
     * @param quality, defines the value of video quality.
     * @param listener, provided if caller needs to be notified for set result.
     * @return void
     *
     * @throws ImsException if calling the IMS service results in an error.
     */
public void setVideoQuality(int quality, com.android.ims.ImsConfigListener listener) throws android.os.RemoteException;
}
