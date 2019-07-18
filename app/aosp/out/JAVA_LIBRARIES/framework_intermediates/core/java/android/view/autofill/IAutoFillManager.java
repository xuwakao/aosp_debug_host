/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/autofill/IAutoFillManager.aidl
 */
package android.view.autofill;
/**
 * Mediator between apps being auto-filled and auto-fill service implementations.
 *
 * {@hide}
 */
public interface IAutoFillManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.autofill.IAutoFillManager
{
private static final java.lang.String DESCRIPTOR = "android.view.autofill.IAutoFillManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.autofill.IAutoFillManager interface,
 * generating a proxy if needed.
 */
public static android.view.autofill.IAutoFillManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.autofill.IAutoFillManager))) {
return ((android.view.autofill.IAutoFillManager)iin);
}
return new android.view.autofill.IAutoFillManager.Stub.Proxy(obj);
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
case TRANSACTION_addClient:
{
data.enforceInterface(DESCRIPTOR);
android.view.autofill.IAutoFillManagerClient _arg0;
_arg0 = android.view.autofill.IAutoFillManagerClient.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _result = this.addClient(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startSession:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.view.autofill.AutofillId _arg2;
if ((0!=data.readInt())) {
_arg2 = android.view.autofill.AutofillId.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.graphics.Rect _arg3;
if ((0!=data.readInt())) {
_arg3 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.view.autofill.AutofillValue _arg4;
if ((0!=data.readInt())) {
_arg4 = android.view.autofill.AutofillValue.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
boolean _arg6;
_arg6 = (0!=data.readInt());
int _arg7;
_arg7 = data.readInt();
java.lang.String _arg8;
_arg8 = data.readString();
int _result = this.startSession(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getFillEventHistory:
{
data.enforceInterface(DESCRIPTOR);
android.service.autofill.FillEventHistory _result = this.getFillEventHistory();
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
case TRANSACTION_restoreSession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
boolean _result = this.restoreSession(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateSession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.view.autofill.AutofillId _arg1;
if ((0!=data.readInt())) {
_arg1 = android.view.autofill.AutofillId.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.graphics.Rect _arg2;
if ((0!=data.readInt())) {
_arg2 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.view.autofill.AutofillValue _arg3;
if ((0!=data.readInt())) {
_arg3 = android.view.autofill.AutofillValue.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
this.updateSession(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_updateOrRestartSession:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.view.autofill.AutofillId _arg2;
if ((0!=data.readInt())) {
_arg2 = android.view.autofill.AutofillId.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.graphics.Rect _arg3;
if ((0!=data.readInt())) {
_arg3 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.view.autofill.AutofillValue _arg4;
if ((0!=data.readInt())) {
_arg4 = android.view.autofill.AutofillValue.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
boolean _arg6;
_arg6 = (0!=data.readInt());
int _arg7;
_arg7 = data.readInt();
java.lang.String _arg8;
_arg8 = data.readString();
int _arg9;
_arg9 = data.readInt();
int _arg10;
_arg10 = data.readInt();
int _result = this.updateOrRestartSession(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finishSession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.finishSession(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelSession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.cancelSession(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAuthenticationResult:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.setAuthenticationResult(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setHasCallback:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setHasCallback(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_disableOwnedAutofillServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.disableOwnedAutofillServices(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isServiceSupported:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isServiceSupported(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isServiceEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isServiceEnabled(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_onPendingSaveUi:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.onPendingSaveUi(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.autofill.IAutoFillManager
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
@Override public int addClient(android.view.autofill.IAutoFillManagerClient client, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_addClient, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startSession(android.os.IBinder activityToken, android.os.IBinder appCallback, android.view.autofill.AutofillId autoFillId, android.graphics.Rect bounds, android.view.autofill.AutofillValue value, int userId, boolean hasCallback, int flags, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(activityToken);
_data.writeStrongBinder(appCallback);
if ((autoFillId!=null)) {
_data.writeInt(1);
autoFillId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((bounds!=null)) {
_data.writeInt(1);
bounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((value!=null)) {
_data.writeInt(1);
value.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
_data.writeInt(((hasCallback)?(1):(0)));
_data.writeInt(flags);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_startSession, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.service.autofill.FillEventHistory getFillEventHistory() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.autofill.FillEventHistory _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFillEventHistory, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.service.autofill.FillEventHistory.CREATOR.createFromParcel(_reply);
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
@Override public boolean restoreSession(int sessionId, android.os.IBinder activityToken, android.os.IBinder appCallback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeStrongBinder(activityToken);
_data.writeStrongBinder(appCallback);
mRemote.transact(Stub.TRANSACTION_restoreSession, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void updateSession(int sessionId, android.view.autofill.AutofillId id, android.graphics.Rect bounds, android.view.autofill.AutofillValue value, int action, int flags, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
if ((id!=null)) {
_data.writeInt(1);
id.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((bounds!=null)) {
_data.writeInt(1);
bounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((value!=null)) {
_data.writeInt(1);
value.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(action);
_data.writeInt(flags);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_updateSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int updateOrRestartSession(android.os.IBinder activityToken, android.os.IBinder appCallback, android.view.autofill.AutofillId autoFillId, android.graphics.Rect bounds, android.view.autofill.AutofillValue value, int userId, boolean hasCallback, int flags, java.lang.String packageName, int sessionId, int action) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(activityToken);
_data.writeStrongBinder(appCallback);
if ((autoFillId!=null)) {
_data.writeInt(1);
autoFillId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((bounds!=null)) {
_data.writeInt(1);
bounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((value!=null)) {
_data.writeInt(1);
value.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userId);
_data.writeInt(((hasCallback)?(1):(0)));
_data.writeInt(flags);
_data.writeString(packageName);
_data.writeInt(sessionId);
_data.writeInt(action);
mRemote.transact(Stub.TRANSACTION_updateOrRestartSession, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void finishSession(int sessionId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_finishSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelSession(int sessionId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAuthenticationResult(android.os.Bundle data, int sessionId, int authenticationId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(sessionId);
_data.writeInt(authenticationId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setAuthenticationResult, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setHasCallback(int sessionId, int userId, boolean hasIt) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeInt(userId);
_data.writeInt(((hasIt)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setHasCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disableOwnedAutofillServices(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_disableOwnedAutofillServices, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isServiceSupported(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isServiceSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isServiceEnabled(int userId, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isServiceEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void onPendingSaveUi(int operation, android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(operation);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_onPendingSaveUi, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_addClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_startSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getFillEventHistory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_restoreSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_updateSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateOrRestartSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_finishSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_cancelSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setAuthenticationResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setHasCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_disableOwnedAutofillServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_isServiceSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_isServiceEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onPendingSaveUi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
public int addClient(android.view.autofill.IAutoFillManagerClient client, int userId) throws android.os.RemoteException;
public int startSession(android.os.IBinder activityToken, android.os.IBinder appCallback, android.view.autofill.AutofillId autoFillId, android.graphics.Rect bounds, android.view.autofill.AutofillValue value, int userId, boolean hasCallback, int flags, java.lang.String packageName) throws android.os.RemoteException;
public android.service.autofill.FillEventHistory getFillEventHistory() throws android.os.RemoteException;
public boolean restoreSession(int sessionId, android.os.IBinder activityToken, android.os.IBinder appCallback) throws android.os.RemoteException;
public void updateSession(int sessionId, android.view.autofill.AutofillId id, android.graphics.Rect bounds, android.view.autofill.AutofillValue value, int action, int flags, int userId) throws android.os.RemoteException;
public int updateOrRestartSession(android.os.IBinder activityToken, android.os.IBinder appCallback, android.view.autofill.AutofillId autoFillId, android.graphics.Rect bounds, android.view.autofill.AutofillValue value, int userId, boolean hasCallback, int flags, java.lang.String packageName, int sessionId, int action) throws android.os.RemoteException;
public void finishSession(int sessionId, int userId) throws android.os.RemoteException;
public void cancelSession(int sessionId, int userId) throws android.os.RemoteException;
public void setAuthenticationResult(android.os.Bundle data, int sessionId, int authenticationId, int userId) throws android.os.RemoteException;
public void setHasCallback(int sessionId, int userId, boolean hasIt) throws android.os.RemoteException;
public void disableOwnedAutofillServices(int userId) throws android.os.RemoteException;
public boolean isServiceSupported(int userId) throws android.os.RemoteException;
public boolean isServiceEnabled(int userId, java.lang.String packageName) throws android.os.RemoteException;
public void onPendingSaveUi(int operation, android.os.IBinder token) throws android.os.RemoteException;
}
