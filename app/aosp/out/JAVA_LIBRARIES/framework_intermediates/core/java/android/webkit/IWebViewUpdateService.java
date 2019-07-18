/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/webkit/IWebViewUpdateService.aidl
 */
package android.webkit;
/**
 * Private service to wait for the updatable WebView to be ready for use.
 * @hide
 */
public interface IWebViewUpdateService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.webkit.IWebViewUpdateService
{
private static final java.lang.String DESCRIPTOR = "android.webkit.IWebViewUpdateService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.webkit.IWebViewUpdateService interface,
 * generating a proxy if needed.
 */
public static android.webkit.IWebViewUpdateService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.webkit.IWebViewUpdateService))) {
return ((android.webkit.IWebViewUpdateService)iin);
}
return new android.webkit.IWebViewUpdateService.Stub.Proxy(obj);
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
case TRANSACTION_notifyRelroCreationCompleted:
{
data.enforceInterface(DESCRIPTOR);
this.notifyRelroCreationCompleted();
reply.writeNoException();
return true;
}
case TRANSACTION_waitForAndGetProvider:
{
data.enforceInterface(DESCRIPTOR);
android.webkit.WebViewProviderResponse _result = this.waitForAndGetProvider();
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
case TRANSACTION_changeProviderAndSetting:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.changeProviderAndSetting(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getValidWebViewPackages:
{
data.enforceInterface(DESCRIPTOR);
android.webkit.WebViewProviderInfo[] _result = this.getValidWebViewPackages();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getAllWebViewPackages:
{
data.enforceInterface(DESCRIPTOR);
android.webkit.WebViewProviderInfo[] _result = this.getAllWebViewPackages();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getCurrentWebViewPackageName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getCurrentWebViewPackageName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCurrentWebViewPackage:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.PackageInfo _result = this.getCurrentWebViewPackage();
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
case TRANSACTION_isFallbackPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isFallbackPackage(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableFallbackLogic:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.enableFallbackLogic(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isMultiProcessEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isMultiProcessEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableMultiProcess:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.enableMultiProcess(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.webkit.IWebViewUpdateService
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
     * Used by the relro file creator to notify the service that it's done.
     */
@Override public void notifyRelroCreationCompleted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_notifyRelroCreationCompleted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Used by WebViewFactory to block loading of WebView code until
     * preparations are complete. Returns the package used as WebView provider.
     */
@Override public android.webkit.WebViewProviderResponse waitForAndGetProvider() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.webkit.WebViewProviderResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_waitForAndGetProvider, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.webkit.WebViewProviderResponse.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String changeProviderAndSetting(java.lang.String newProvider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(newProvider);
mRemote.transact(Stub.TRANSACTION_changeProviderAndSetting, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * DevelopmentSettings uses this to get the current available WebView
     * providers (to display as choices to the user).
     */
@Override public android.webkit.WebViewProviderInfo[] getValidWebViewPackages() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.webkit.WebViewProviderInfo[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getValidWebViewPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.webkit.WebViewProviderInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Fetch all packages that could potentially implement WebView.
     */
@Override public android.webkit.WebViewProviderInfo[] getAllWebViewPackages() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.webkit.WebViewProviderInfo[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllWebViewPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.webkit.WebViewProviderInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getCurrentWebViewPackageName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentWebViewPackageName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Used by public API for debugging purposes.
     */
@Override public android.content.pm.PackageInfo getCurrentWebViewPackage() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.PackageInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentWebViewPackage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.PackageInfo.CREATOR.createFromParcel(_reply);
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
     * Used by Settings to determine whether a certain package can be enabled/disabled by the user -
     * the package should not be modifiable in this way if it is a fallback package.
     */
@Override public boolean isFallbackPackage(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isFallbackPackage, _data, _reply, 0);
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
     * Enable or disable the WebView package fallback mechanism.
     */
@Override public void enableFallbackLogic(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enableFallbackLogic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Used by Settings to determine whether multiprocess is enabled.
     */
@Override public boolean isMultiProcessEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isMultiProcessEnabled, _data, _reply, 0);
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
     * Used by Settings to enable/disable multiprocess.
     */
@Override public void enableMultiProcess(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enableMultiProcess, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_notifyRelroCreationCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_waitForAndGetProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_changeProviderAndSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getValidWebViewPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getAllWebViewPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getCurrentWebViewPackageName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getCurrentWebViewPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isFallbackPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_enableFallbackLogic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_isMultiProcessEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_enableMultiProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
/**
     * Used by the relro file creator to notify the service that it's done.
     */
public void notifyRelroCreationCompleted() throws android.os.RemoteException;
/**
     * Used by WebViewFactory to block loading of WebView code until
     * preparations are complete. Returns the package used as WebView provider.
     */
public android.webkit.WebViewProviderResponse waitForAndGetProvider() throws android.os.RemoteException;
public java.lang.String changeProviderAndSetting(java.lang.String newProvider) throws android.os.RemoteException;
/**
     * DevelopmentSettings uses this to get the current available WebView
     * providers (to display as choices to the user).
     */
public android.webkit.WebViewProviderInfo[] getValidWebViewPackages() throws android.os.RemoteException;
/**
     * Fetch all packages that could potentially implement WebView.
     */
public android.webkit.WebViewProviderInfo[] getAllWebViewPackages() throws android.os.RemoteException;
public java.lang.String getCurrentWebViewPackageName() throws android.os.RemoteException;
/**
     * Used by public API for debugging purposes.
     */
public android.content.pm.PackageInfo getCurrentWebViewPackage() throws android.os.RemoteException;
/**
     * Used by Settings to determine whether a certain package can be enabled/disabled by the user -
     * the package should not be modifiable in this way if it is a fallback package.
     */
public boolean isFallbackPackage(java.lang.String packageName) throws android.os.RemoteException;
/**
     * Enable or disable the WebView package fallback mechanism.
     */
public void enableFallbackLogic(boolean enable) throws android.os.RemoteException;
/**
     * Used by Settings to determine whether multiprocess is enabled.
     */
public boolean isMultiProcessEnabled() throws android.os.RemoteException;
/**
     * Used by Settings to enable/disable multiprocess.
     */
public void enableMultiProcess(boolean enable) throws android.os.RemoteException;
}
