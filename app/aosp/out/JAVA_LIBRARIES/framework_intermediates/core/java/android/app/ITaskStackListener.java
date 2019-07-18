/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/ITaskStackListener.aidl
 */
package android.app;
/** @hide */
public interface ITaskStackListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.ITaskStackListener
{
private static final java.lang.String DESCRIPTOR = "android.app.ITaskStackListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.ITaskStackListener interface,
 * generating a proxy if needed.
 */
public static android.app.ITaskStackListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.ITaskStackListener))) {
return ((android.app.ITaskStackListener)iin);
}
return new android.app.ITaskStackListener.Stub.Proxy(obj);
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
case TRANSACTION_onTaskStackChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onTaskStackChanged();
return true;
}
case TRANSACTION_onActivityPinned:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onActivityPinned(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onActivityUnpinned:
{
data.enforceInterface(DESCRIPTOR);
this.onActivityUnpinned();
return true;
}
case TRANSACTION_onPinnedActivityRestartAttempt:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onPinnedActivityRestartAttempt(_arg0);
return true;
}
case TRANSACTION_onPinnedStackAnimationStarted:
{
data.enforceInterface(DESCRIPTOR);
this.onPinnedStackAnimationStarted();
return true;
}
case TRANSACTION_onPinnedStackAnimationEnded:
{
data.enforceInterface(DESCRIPTOR);
this.onPinnedStackAnimationEnded();
return true;
}
case TRANSACTION_onActivityForcedResizable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onActivityForcedResizable(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onActivityDismissingDockedStack:
{
data.enforceInterface(DESCRIPTOR);
this.onActivityDismissingDockedStack();
return true;
}
case TRANSACTION_onActivityLaunchOnSecondaryDisplayFailed:
{
data.enforceInterface(DESCRIPTOR);
this.onActivityLaunchOnSecondaryDisplayFailed();
return true;
}
case TRANSACTION_onTaskCreated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onTaskCreated(_arg0, _arg1);
return true;
}
case TRANSACTION_onTaskRemoved:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onTaskRemoved(_arg0);
return true;
}
case TRANSACTION_onTaskMovedToFront:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onTaskMovedToFront(_arg0);
return true;
}
case TRANSACTION_onTaskDescriptionChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.app.ActivityManager.TaskDescription _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.ActivityManager.TaskDescription.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onTaskDescriptionChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onActivityRequestedOrientationChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onActivityRequestedOrientationChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onTaskRemovalStarted:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onTaskRemovalStarted(_arg0);
return true;
}
case TRANSACTION_onTaskProfileLocked:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onTaskProfileLocked(_arg0, _arg1);
return true;
}
case TRANSACTION_onTaskSnapshotChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.app.ActivityManager.TaskSnapshot _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.ActivityManager.TaskSnapshot.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onTaskSnapshotChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.ITaskStackListener
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
/** Called whenever there are changes to the state of tasks in a stack. */
@Override public void onTaskStackChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onTaskStackChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/** Called whenever an Activity is moved to the pinned stack from another stack. */
@Override public void onActivityPinned(java.lang.String packageName, int userId, int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(userId);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_onActivityPinned, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/** Called whenever an Activity is moved from the pinned stack to another stack. */
@Override public void onActivityUnpinned() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onActivityUnpinned, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called whenever IActivityManager.startActivity is called on an activity that is already
     * running in the pinned stack and the activity is not actually started, but the task is either
     * brought to the front or a new Intent is delivered to it.
     *
     * @param clearedTask whether or not the launch activity also cleared the task as a part of
     * starting
     */
@Override public void onPinnedActivityRestartAttempt(boolean clearedTask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((clearedTask)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onPinnedActivityRestartAttempt, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called whenever the pinned stack is starting animating a resize.
     */
@Override public void onPinnedStackAnimationStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onPinnedStackAnimationStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called whenever the pinned stack is done animating a resize.
     */
@Override public void onPinnedStackAnimationEnded() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onPinnedStackAnimationEnded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when we launched an activity that we forced to be resizable.
     *
     * @param packageName Package name of the top activity in the task.
     * @param taskId Id of the task.
     * @param reason {@link #FORCED_RESIZEABLE_REASON_SPLIT_SCREEN} or
      *              {@link #FORCED_RESIZEABLE_REASON_SECONDARY_DISPLAY}.
     */
@Override public void onActivityForcedResizable(java.lang.String packageName, int taskId, int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(taskId);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onActivityForcedResizable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when we launched an activity that dismissed the docked stack.
     */
@Override public void onActivityDismissingDockedStack() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onActivityDismissingDockedStack, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when an activity was requested to be launched on a secondary display but was not
     * allowed there.
     */
@Override public void onActivityLaunchOnSecondaryDisplayFailed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onActivityLaunchOnSecondaryDisplayFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a task is added.
     *
     * @param taskId id of the task.
     * @param componentName of the activity that the task is being started with.
    */
@Override public void onTaskCreated(int taskId, android.content.ComponentName componentName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
if ((componentName!=null)) {
_data.writeInt(1);
componentName.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onTaskCreated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a task is removed.
     *
     * @param taskId id of the task.
    */
@Override public void onTaskRemoved(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_onTaskRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a task is moved to the front of its stack.
     *
     * @param taskId id of the task.
    */
@Override public void onTaskMovedToFront(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_onTaskMovedToFront, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a task’s description is changed due to an activity calling
     * ActivityManagerService.setTaskDescription
     *
     * @param taskId id of the task.
     * @param td the new TaskDescription.
    */
@Override public void onTaskDescriptionChanged(int taskId, android.app.ActivityManager.TaskDescription td) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
if ((td!=null)) {
_data.writeInt(1);
td.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onTaskDescriptionChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a activity’s orientation is changed due to it calling
     * ActivityManagerService.setRequestedOrientation
     *
     * @param taskId id of the task that the activity is in.
     * @param requestedOrientation the new requested orientation.
    */
@Override public void onActivityRequestedOrientationChanged(int taskId, int requestedOrientation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
_data.writeInt(requestedOrientation);
mRemote.transact(Stub.TRANSACTION_onActivityRequestedOrientationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the task is about to be finished but before its surfaces are
     * removed from the window manager. This allows interested parties to
     * perform relevant animations before the window disappears.
     */
@Override public void onTaskRemovalStarted(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_onTaskRemovalStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the task has been put in a locked state because one or more of the
     * activities inside it belong to a managed profile user, and that user has just
     * been locked.
     */
@Override public void onTaskProfileLocked(int taskId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_onTaskProfileLocked, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a task snapshot got updated.
     */
@Override public void onTaskSnapshotChanged(int taskId, android.app.ActivityManager.TaskSnapshot snapshot) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
if ((snapshot!=null)) {
_data.writeInt(1);
snapshot.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onTaskSnapshotChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onTaskStackChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onActivityPinned = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onActivityUnpinned = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onPinnedActivityRestartAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onPinnedStackAnimationStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onPinnedStackAnimationEnded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onActivityForcedResizable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onActivityDismissingDockedStack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onActivityLaunchOnSecondaryDisplayFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onTaskCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onTaskRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onTaskMovedToFront = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_onTaskDescriptionChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onActivityRequestedOrientationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_onTaskRemovalStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_onTaskProfileLocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_onTaskSnapshotChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
}
public static final int FORCED_RESIZEABLE_REASON_SPLIT_SCREEN = 1;
public static final int FORCED_RESIZEABLE_REASON_SECONDARY_DISPLAY = 2;
/** Called whenever there are changes to the state of tasks in a stack. */
public void onTaskStackChanged() throws android.os.RemoteException;
/** Called whenever an Activity is moved to the pinned stack from another stack. */
public void onActivityPinned(java.lang.String packageName, int userId, int taskId) throws android.os.RemoteException;
/** Called whenever an Activity is moved from the pinned stack to another stack. */
public void onActivityUnpinned() throws android.os.RemoteException;
/**
     * Called whenever IActivityManager.startActivity is called on an activity that is already
     * running in the pinned stack and the activity is not actually started, but the task is either
     * brought to the front or a new Intent is delivered to it.
     *
     * @param clearedTask whether or not the launch activity also cleared the task as a part of
     * starting
     */
public void onPinnedActivityRestartAttempt(boolean clearedTask) throws android.os.RemoteException;
/**
     * Called whenever the pinned stack is starting animating a resize.
     */
public void onPinnedStackAnimationStarted() throws android.os.RemoteException;
/**
     * Called whenever the pinned stack is done animating a resize.
     */
public void onPinnedStackAnimationEnded() throws android.os.RemoteException;
/**
     * Called when we launched an activity that we forced to be resizable.
     *
     * @param packageName Package name of the top activity in the task.
     * @param taskId Id of the task.
     * @param reason {@link #FORCED_RESIZEABLE_REASON_SPLIT_SCREEN} or
      *              {@link #FORCED_RESIZEABLE_REASON_SECONDARY_DISPLAY}.
     */
public void onActivityForcedResizable(java.lang.String packageName, int taskId, int reason) throws android.os.RemoteException;
/**
     * Called when we launched an activity that dismissed the docked stack.
     */
public void onActivityDismissingDockedStack() throws android.os.RemoteException;
/**
     * Called when an activity was requested to be launched on a secondary display but was not
     * allowed there.
     */
public void onActivityLaunchOnSecondaryDisplayFailed() throws android.os.RemoteException;
/**
     * Called when a task is added.
     *
     * @param taskId id of the task.
     * @param componentName of the activity that the task is being started with.
    */
public void onTaskCreated(int taskId, android.content.ComponentName componentName) throws android.os.RemoteException;
/**
     * Called when a task is removed.
     *
     * @param taskId id of the task.
    */
public void onTaskRemoved(int taskId) throws android.os.RemoteException;
/**
     * Called when a task is moved to the front of its stack.
     *
     * @param taskId id of the task.
    */
public void onTaskMovedToFront(int taskId) throws android.os.RemoteException;
/**
     * Called when a task’s description is changed due to an activity calling
     * ActivityManagerService.setTaskDescription
     *
     * @param taskId id of the task.
     * @param td the new TaskDescription.
    */
public void onTaskDescriptionChanged(int taskId, android.app.ActivityManager.TaskDescription td) throws android.os.RemoteException;
/**
     * Called when a activity’s orientation is changed due to it calling
     * ActivityManagerService.setRequestedOrientation
     *
     * @param taskId id of the task that the activity is in.
     * @param requestedOrientation the new requested orientation.
    */
public void onActivityRequestedOrientationChanged(int taskId, int requestedOrientation) throws android.os.RemoteException;
/**
     * Called when the task is about to be finished but before its surfaces are
     * removed from the window manager. This allows interested parties to
     * perform relevant animations before the window disappears.
     */
public void onTaskRemovalStarted(int taskId) throws android.os.RemoteException;
/**
     * Called when the task has been put in a locked state because one or more of the
     * activities inside it belong to a managed profile user, and that user has just
     * been locked.
     */
public void onTaskProfileLocked(int taskId, int userId) throws android.os.RemoteException;
/**
     * Called when a task snapshot got updated.
     */
public void onTaskSnapshotChanged(int taskId, android.app.ActivityManager.TaskSnapshot snapshot) throws android.os.RemoteException;
}
