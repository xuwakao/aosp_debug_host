/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/autofill/IAutoFillManagerClient.aidl
 */
package android.view.autofill;
/**
 * Object running in the application process and responsible for autofilling it.
 *
 * @hide
 */
public interface IAutoFillManagerClient extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.autofill.IAutoFillManagerClient
{
private static final java.lang.String DESCRIPTOR = "android.view.autofill.IAutoFillManagerClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.autofill.IAutoFillManagerClient interface,
 * generating a proxy if needed.
 */
public static android.view.autofill.IAutoFillManagerClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.autofill.IAutoFillManagerClient))) {
return ((android.view.autofill.IAutoFillManagerClient)iin);
}
return new android.view.autofill.IAutoFillManagerClient.Stub.Proxy(obj);
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
case TRANSACTION_setState:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setState(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_autofill:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.view.autofill.AutofillId> _arg1;
_arg1 = data.createTypedArrayList(android.view.autofill.AutofillId.CREATOR);
java.util.List<android.view.autofill.AutofillValue> _arg2;
_arg2 = data.createTypedArrayList(android.view.autofill.AutofillValue.CREATOR);
this.autofill(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_authenticate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.content.IntentSender _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.IntentSender.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.content.Intent _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.authenticate(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_setTrackedViews:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.view.autofill.AutofillId[] _arg1;
_arg1 = data.createTypedArray(android.view.autofill.AutofillId.CREATOR);
boolean _arg2;
_arg2 = (0!=data.readInt());
android.view.autofill.AutofillId[] _arg3;
_arg3 = data.createTypedArray(android.view.autofill.AutofillId.CREATOR);
this.setTrackedViews(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_requestShowFillUi:
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
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.graphics.Rect _arg4;
if ((0!=data.readInt())) {
_arg4 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.view.autofill.IAutofillWindowPresenter _arg5;
_arg5 = android.view.autofill.IAutofillWindowPresenter.Stub.asInterface(data.readStrongBinder());
this.requestShowFillUi(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
return true;
}
case TRANSACTION_requestHideFillUi:
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
this.requestHideFillUi(_arg0, _arg1);
return true;
}
case TRANSACTION_notifyNoFillUi:
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
boolean _arg2;
_arg2 = (0!=data.readInt());
this.notifyNoFillUi(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_startIntentSender:
{
data.enforceInterface(DESCRIPTOR);
android.content.IntentSender _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.IntentSender.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.startIntentSender(_arg0, _arg1);
return true;
}
case TRANSACTION_setSaveUiState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setSaveUiState(_arg0, _arg1);
return true;
}
case TRANSACTION_setSessionFinished:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setSessionFinished(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.autofill.IAutoFillManagerClient
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
     * Notifies the client when the autofill enabled state changed.
     */
@Override public void setState(boolean enabled, boolean resetSession, boolean resetClient) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
_data.writeInt(((resetSession)?(1):(0)));
_data.writeInt(((resetClient)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
      * Autofills the activity with the contents of a dataset.
      */
@Override public void autofill(int sessionId, java.util.List<android.view.autofill.AutofillId> ids, java.util.List<android.view.autofill.AutofillValue> values) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeTypedList(ids);
_data.writeTypedList(values);
mRemote.transact(Stub.TRANSACTION_autofill, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
      * Authenticates a fill response or a data set.
      */
@Override public void authenticate(int sessionId, int authenticationId, android.content.IntentSender intent, android.content.Intent fillInIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeInt(authenticationId);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((fillInIntent!=null)) {
_data.writeInt(1);
fillInIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_authenticate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
      * Sets the views to track. If saveOnAllViewsInvisible is set and all these view are invisible
      * the session is finished automatically.
      */
@Override public void setTrackedViews(int sessionId, android.view.autofill.AutofillId[] savableIds, boolean saveOnAllViewsInvisible, android.view.autofill.AutofillId[] fillableIds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeTypedArray(savableIds, 0);
_data.writeInt(((saveOnAllViewsInvisible)?(1):(0)));
_data.writeTypedArray(fillableIds, 0);
mRemote.transact(Stub.TRANSACTION_setTrackedViews, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Requests showing the fill UI.
     */
@Override public void requestShowFillUi(int sessionId, android.view.autofill.AutofillId id, int width, int height, android.graphics.Rect anchorBounds, android.view.autofill.IAutofillWindowPresenter presenter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
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
_data.writeInt(width);
_data.writeInt(height);
if ((anchorBounds!=null)) {
_data.writeInt(1);
anchorBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((presenter!=null))?(presenter.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_requestShowFillUi, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Requests hiding the fill UI.
     */
@Override public void requestHideFillUi(int sessionId, android.view.autofill.AutofillId id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
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
mRemote.transact(Stub.TRANSACTION_requestHideFillUi, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies no fill UI will be shown, and also mark the state as finished if necessary.
     */
@Override public void notifyNoFillUi(int sessionId, android.view.autofill.AutofillId id, boolean sessionFinished) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
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
_data.writeInt(((sessionFinished)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyNoFillUi, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Starts the provided intent sender.
     */
@Override public void startIntentSender(android.content.IntentSender intentSender, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intentSender!=null)) {
_data.writeInt(1);
intentSender.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startIntentSender, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets the state of the Autofill Save UI for a given session.
     */
@Override public void setSaveUiState(int sessionId, boolean shown) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeInt(((shown)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setSaveUiState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Marks the state of the session as finished.
     * @param newState STATE_FINISHED (because the autofill service returned a null
     * FillResponse) or STATE_UNKNOWN (because the session was removed).
     */
@Override public void setSessionFinished(int newState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(newState);
mRemote.transact(Stub.TRANSACTION_setSessionFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_autofill = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_authenticate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setTrackedViews = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_requestShowFillUi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_requestHideFillUi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_notifyNoFillUi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_startIntentSender = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setSaveUiState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setSessionFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
/**
     * Notifies the client when the autofill enabled state changed.
     */
public void setState(boolean enabled, boolean resetSession, boolean resetClient) throws android.os.RemoteException;
/**
      * Autofills the activity with the contents of a dataset.
      */
public void autofill(int sessionId, java.util.List<android.view.autofill.AutofillId> ids, java.util.List<android.view.autofill.AutofillValue> values) throws android.os.RemoteException;
/**
      * Authenticates a fill response or a data set.
      */
public void authenticate(int sessionId, int authenticationId, android.content.IntentSender intent, android.content.Intent fillInIntent) throws android.os.RemoteException;
/**
      * Sets the views to track. If saveOnAllViewsInvisible is set and all these view are invisible
      * the session is finished automatically.
      */
public void setTrackedViews(int sessionId, android.view.autofill.AutofillId[] savableIds, boolean saveOnAllViewsInvisible, android.view.autofill.AutofillId[] fillableIds) throws android.os.RemoteException;
/**
     * Requests showing the fill UI.
     */
public void requestShowFillUi(int sessionId, android.view.autofill.AutofillId id, int width, int height, android.graphics.Rect anchorBounds, android.view.autofill.IAutofillWindowPresenter presenter) throws android.os.RemoteException;
/**
     * Requests hiding the fill UI.
     */
public void requestHideFillUi(int sessionId, android.view.autofill.AutofillId id) throws android.os.RemoteException;
/**
     * Notifies no fill UI will be shown, and also mark the state as finished if necessary.
     */
public void notifyNoFillUi(int sessionId, android.view.autofill.AutofillId id, boolean sessionFinished) throws android.os.RemoteException;
/**
     * Starts the provided intent sender.
     */
public void startIntentSender(android.content.IntentSender intentSender, android.content.Intent intent) throws android.os.RemoteException;
/**
     * Sets the state of the Autofill Save UI for a given session.
     */
public void setSaveUiState(int sessionId, boolean shown) throws android.os.RemoteException;
/**
     * Marks the state of the session as finished.
     * @param newState STATE_FINISHED (because the autofill service returned a null
     * FillResponse) or STATE_UNKNOWN (because the session was removed).
     */
public void setSessionFinished(int newState) throws android.os.RemoteException;
}
