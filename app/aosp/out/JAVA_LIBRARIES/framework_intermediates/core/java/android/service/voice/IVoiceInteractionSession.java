/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/voice/IVoiceInteractionSession.aidl
 */
package android.service.voice;
/**
 * @hide
 */
public interface IVoiceInteractionSession extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.voice.IVoiceInteractionSession
{
private static final java.lang.String DESCRIPTOR = "android.service.voice.IVoiceInteractionSession";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.voice.IVoiceInteractionSession interface,
 * generating a proxy if needed.
 */
public static android.service.voice.IVoiceInteractionSession asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.voice.IVoiceInteractionSession))) {
return ((android.service.voice.IVoiceInteractionSession)iin);
}
return new android.service.voice.IVoiceInteractionSession.Stub.Proxy(obj);
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
case TRANSACTION_show:
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
com.android.internal.app.IVoiceInteractionSessionShowCallback _arg2;
_arg2 = com.android.internal.app.IVoiceInteractionSessionShowCallback.Stub.asInterface(data.readStrongBinder());
this.show(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_hide:
{
data.enforceInterface(DESCRIPTOR);
this.hide();
return true;
}
case TRANSACTION_handleAssist:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.assist.AssistStructure _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.assist.AssistStructure.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.app.assist.AssistContent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.assist.AssistContent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.handleAssist(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_handleScreenshot:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.handleScreenshot(_arg0);
return true;
}
case TRANSACTION_taskStarted:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.taskStarted(_arg0, _arg1);
return true;
}
case TRANSACTION_taskFinished:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.taskFinished(_arg0, _arg1);
return true;
}
case TRANSACTION_closeSystemDialogs:
{
data.enforceInterface(DESCRIPTOR);
this.closeSystemDialogs();
return true;
}
case TRANSACTION_onLockscreenShown:
{
data.enforceInterface(DESCRIPTOR);
this.onLockscreenShown();
return true;
}
case TRANSACTION_destroy:
{
data.enforceInterface(DESCRIPTOR);
this.destroy();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.voice.IVoiceInteractionSession
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
@Override public void show(android.os.Bundle sessionArgs, int flags, com.android.internal.app.IVoiceInteractionSessionShowCallback showCallback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((sessionArgs!=null)) {
_data.writeInt(1);
sessionArgs.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
_data.writeStrongBinder((((showCallback!=null))?(showCallback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_show, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void hide() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hide, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleAssist(android.os.Bundle assistData, android.app.assist.AssistStructure structure, android.app.assist.AssistContent content, int index, int count) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((assistData!=null)) {
_data.writeInt(1);
assistData.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((structure!=null)) {
_data.writeInt(1);
structure.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((content!=null)) {
_data.writeInt(1);
content.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(index);
_data.writeInt(count);
mRemote.transact(Stub.TRANSACTION_handleAssist, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleScreenshot(android.graphics.Bitmap screenshot) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((screenshot!=null)) {
_data.writeInt(1);
screenshot.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_handleScreenshot, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void taskStarted(android.content.Intent intent, int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_taskStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void taskFinished(android.content.Intent intent, int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_taskFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void closeSystemDialogs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_closeSystemDialogs, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLockscreenShown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onLockscreenShown, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void destroy() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_destroy, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_show = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_hide = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_handleAssist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_handleScreenshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_taskStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_taskFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_closeSystemDialogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onLockscreenShown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_destroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public void show(android.os.Bundle sessionArgs, int flags, com.android.internal.app.IVoiceInteractionSessionShowCallback showCallback) throws android.os.RemoteException;
public void hide() throws android.os.RemoteException;
public void handleAssist(android.os.Bundle assistData, android.app.assist.AssistStructure structure, android.app.assist.AssistContent content, int index, int count) throws android.os.RemoteException;
public void handleScreenshot(android.graphics.Bitmap screenshot) throws android.os.RemoteException;
public void taskStarted(android.content.Intent intent, int taskId) throws android.os.RemoteException;
public void taskFinished(android.content.Intent intent, int taskId) throws android.os.RemoteException;
public void closeSystemDialogs() throws android.os.RemoteException;
public void onLockscreenShown() throws android.os.RemoteException;
public void destroy() throws android.os.RemoteException;
}
