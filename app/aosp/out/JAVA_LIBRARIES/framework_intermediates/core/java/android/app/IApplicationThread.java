/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IApplicationThread.aidl
 */
package android.app;
/**
 * System private API for communicating with the application.  This is given to
 * the activity manager by an application  when it starts up, for the activity
 * manager to tell the application about things it needs to do.
 *
 * {@hide}
 */
public interface IApplicationThread extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IApplicationThread
{
private static final java.lang.String DESCRIPTOR = "android.app.IApplicationThread";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IApplicationThread interface,
 * generating a proxy if needed.
 */
public static android.app.IApplicationThread asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IApplicationThread))) {
return ((android.app.IApplicationThread)iin);
}
return new android.app.IApplicationThread.Stub.Proxy(obj);
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
case TRANSACTION_schedulePauseActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
this.schedulePauseActivity(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_scheduleStopActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.scheduleStopActivity(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_scheduleWindowVisibility:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.scheduleWindowVisibility(_arg0, _arg1);
return true;
}
case TRANSACTION_scheduleResumeActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.scheduleResumeActivity(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_scheduleSendResult:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.util.List<android.app.ResultInfo> _arg1;
_arg1 = data.createTypedArrayList(android.app.ResultInfo.CREATOR);
this.scheduleSendResult(_arg0, _arg1);
return true;
}
case TRANSACTION_scheduleLaunchActivity:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
int _arg2;
_arg2 = data.readInt();
android.content.pm.ActivityInfo _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.content.res.Configuration _arg4;
if ((0!=data.readInt())) {
_arg4 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.content.res.Configuration _arg5;
if ((0!=data.readInt())) {
_arg5 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
android.content.res.CompatibilityInfo _arg6;
if ((0!=data.readInt())) {
_arg6 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
java.lang.String _arg7;
_arg7 = data.readString();
com.android.internal.app.IVoiceInteractor _arg8;
_arg8 = com.android.internal.app.IVoiceInteractor.Stub.asInterface(data.readStrongBinder());
int _arg9;
_arg9 = data.readInt();
android.os.Bundle _arg10;
if ((0!=data.readInt())) {
_arg10 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg10 = null;
}
android.os.PersistableBundle _arg11;
if ((0!=data.readInt())) {
_arg11 = android.os.PersistableBundle.CREATOR.createFromParcel(data);
}
else {
_arg11 = null;
}
java.util.List<android.app.ResultInfo> _arg12;
_arg12 = data.createTypedArrayList(android.app.ResultInfo.CREATOR);
java.util.List<com.android.internal.content.ReferrerIntent> _arg13;
_arg13 = data.createTypedArrayList(com.android.internal.content.ReferrerIntent.CREATOR);
boolean _arg14;
_arg14 = (0!=data.readInt());
boolean _arg15;
_arg15 = (0!=data.readInt());
android.app.ProfilerInfo _arg16;
if ((0!=data.readInt())) {
_arg16 = android.app.ProfilerInfo.CREATOR.createFromParcel(data);
}
else {
_arg16 = null;
}
this.scheduleLaunchActivity(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11, _arg12, _arg13, _arg14, _arg15, _arg16);
return true;
}
case TRANSACTION_scheduleNewIntent:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<com.android.internal.content.ReferrerIntent> _arg0;
_arg0 = data.createTypedArrayList(com.android.internal.content.ReferrerIntent.CREATOR);
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.scheduleNewIntent(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_scheduleDestroyActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.scheduleDestroyActivity(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_scheduleReceiver:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.ActivityInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.content.res.CompatibilityInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
java.lang.String _arg4;
_arg4 = data.readString();
android.os.Bundle _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
boolean _arg6;
_arg6 = (0!=data.readInt());
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
this.scheduleReceiver(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
return true;
}
case TRANSACTION_scheduleCreateService:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.content.pm.ServiceInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.content.res.CompatibilityInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _arg3;
_arg3 = data.readInt();
this.scheduleCreateService(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_scheduleStopService:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.scheduleStopService(_arg0);
return true;
}
case TRANSACTION_bindApplication:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.ApplicationInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ApplicationInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.util.List<android.content.pm.ProviderInfo> _arg2;
_arg2 = data.createTypedArrayList(android.content.pm.ProviderInfo.CREATOR);
android.content.ComponentName _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.app.ProfilerInfo _arg4;
if ((0!=data.readInt())) {
_arg4 = android.app.ProfilerInfo.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.os.Bundle _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
android.app.IInstrumentationWatcher _arg6;
_arg6 = android.app.IInstrumentationWatcher.Stub.asInterface(data.readStrongBinder());
android.app.IUiAutomationConnection _arg7;
_arg7 = android.app.IUiAutomationConnection.Stub.asInterface(data.readStrongBinder());
int _arg8;
_arg8 = data.readInt();
boolean _arg9;
_arg9 = (0!=data.readInt());
boolean _arg10;
_arg10 = (0!=data.readInt());
boolean _arg11;
_arg11 = (0!=data.readInt());
boolean _arg12;
_arg12 = (0!=data.readInt());
android.content.res.Configuration _arg13;
if ((0!=data.readInt())) {
_arg13 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg13 = null;
}
android.content.res.CompatibilityInfo _arg14;
if ((0!=data.readInt())) {
_arg14 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg14 = null;
}
java.util.Map _arg15;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg15 = data.readHashMap(cl);
android.os.Bundle _arg16;
if ((0!=data.readInt())) {
_arg16 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg16 = null;
}
java.lang.String _arg17;
_arg17 = data.readString();
this.bindApplication(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11, _arg12, _arg13, _arg14, _arg15, _arg16, _arg17);
return true;
}
case TRANSACTION_scheduleExit:
{
data.enforceInterface(DESCRIPTOR);
this.scheduleExit();
return true;
}
case TRANSACTION_scheduleConfigurationChanged:
{
data.enforceInterface(DESCRIPTOR);
android.content.res.Configuration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.scheduleConfigurationChanged(_arg0);
return true;
}
case TRANSACTION_scheduleServiceArgs:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.content.pm.ParceledListSlice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.scheduleServiceArgs(_arg0, _arg1);
return true;
}
case TRANSACTION_updateTimeZone:
{
data.enforceInterface(DESCRIPTOR);
this.updateTimeZone();
return true;
}
case TRANSACTION_processInBackground:
{
data.enforceInterface(DESCRIPTOR);
this.processInBackground();
return true;
}
case TRANSACTION_scheduleBindService:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
int _arg3;
_arg3 = data.readInt();
this.scheduleBindService(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_scheduleUnbindService:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.scheduleUnbindService(_arg0, _arg1);
return true;
}
case TRANSACTION_dumpService:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
this.dumpService(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_scheduleRegisteredReceiver:
{
data.enforceInterface(DESCRIPTOR);
android.content.IIntentReceiver _arg0;
_arg0 = android.content.IIntentReceiver.Stub.asInterface(data.readStrongBinder());
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
boolean _arg5;
_arg5 = (0!=data.readInt());
boolean _arg6;
_arg6 = (0!=data.readInt());
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
this.scheduleRegisteredReceiver(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
return true;
}
case TRANSACTION_scheduleLowMemory:
{
data.enforceInterface(DESCRIPTOR);
this.scheduleLowMemory();
return true;
}
case TRANSACTION_scheduleActivityConfigurationChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.content.res.Configuration _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.scheduleActivityConfigurationChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_scheduleActivityMovedToDisplay:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
android.content.res.Configuration _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.scheduleActivityMovedToDisplay(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_scheduleRelaunchActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.util.List<android.app.ResultInfo> _arg1;
_arg1 = data.createTypedArrayList(android.app.ResultInfo.CREATOR);
java.util.List<com.android.internal.content.ReferrerIntent> _arg2;
_arg2 = data.createTypedArrayList(com.android.internal.content.ReferrerIntent.CREATOR);
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
android.content.res.Configuration _arg5;
if ((0!=data.readInt())) {
_arg5 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
android.content.res.Configuration _arg6;
if ((0!=data.readInt())) {
_arg6 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
boolean _arg7;
_arg7 = (0!=data.readInt());
this.scheduleRelaunchActivity(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
return true;
}
case TRANSACTION_scheduleSleeping:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.scheduleSleeping(_arg0, _arg1);
return true;
}
case TRANSACTION_profilerControl:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.app.ProfilerInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.ProfilerInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.profilerControl(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_setSchedulingGroup:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setSchedulingGroup(_arg0);
return true;
}
case TRANSACTION_scheduleCreateBackupAgent:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ApplicationInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ApplicationInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.res.CompatibilityInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.scheduleCreateBackupAgent(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_scheduleDestroyBackupAgent:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ApplicationInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ApplicationInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.res.CompatibilityInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.scheduleDestroyBackupAgent(_arg0, _arg1);
return true;
}
case TRANSACTION_scheduleOnNewActivityOptions:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.scheduleOnNewActivityOptions(_arg0, _arg1);
return true;
}
case TRANSACTION_scheduleSuicide:
{
data.enforceInterface(DESCRIPTOR);
this.scheduleSuicide();
return true;
}
case TRANSACTION_dispatchPackageBroadcast:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.dispatchPackageBroadcast(_arg0, _arg1);
return true;
}
case TRANSACTION_scheduleCrash:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.scheduleCrash(_arg0);
return true;
}
case TRANSACTION_dumpHeap:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
java.lang.String _arg3;
_arg3 = data.readString();
android.os.ParcelFileDescriptor _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
this.dumpHeap(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_dumpActivity:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
this.dumpActivity(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_clearDnsCache:
{
data.enforceInterface(DESCRIPTOR);
this.clearDnsCache();
return true;
}
case TRANSACTION_setHttpProxy:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.net.Uri _arg3;
if ((0!=data.readInt())) {
_arg3 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.setHttpProxy(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_setCoreSettings:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setCoreSettings(_arg0);
return true;
}
case TRANSACTION_updatePackageCompatibilityInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.res.CompatibilityInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.updatePackageCompatibilityInfo(_arg0, _arg1);
return true;
}
case TRANSACTION_scheduleTrimMemory:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.scheduleTrimMemory(_arg0);
return true;
}
case TRANSACTION_dumpMemInfo:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Debug.MemoryInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Debug.MemoryInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _arg3;
_arg3 = (0!=data.readInt());
boolean _arg4;
_arg4 = (0!=data.readInt());
boolean _arg5;
_arg5 = (0!=data.readInt());
boolean _arg6;
_arg6 = (0!=data.readInt());
java.lang.String[] _arg7;
_arg7 = data.createStringArray();
this.dumpMemInfo(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
return true;
}
case TRANSACTION_dumpGfxInfo:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.dumpGfxInfo(_arg0, _arg1);
return true;
}
case TRANSACTION_dumpProvider:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
this.dumpProvider(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_dumpDbInfo:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.dumpDbInfo(_arg0, _arg1);
return true;
}
case TRANSACTION_unstableProviderDied:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.unstableProviderDied(_arg0);
return true;
}
case TRANSACTION_requestAssistContextExtras:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.requestAssistContextExtras(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_scheduleTranslucentConversionComplete:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.scheduleTranslucentConversionComplete(_arg0, _arg1);
return true;
}
case TRANSACTION_setProcessState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setProcessState(_arg0);
return true;
}
case TRANSACTION_scheduleInstallProvider:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ProviderInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ProviderInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.scheduleInstallProvider(_arg0);
return true;
}
case TRANSACTION_updateTimePrefs:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.updateTimePrefs(_arg0);
return true;
}
case TRANSACTION_scheduleEnterAnimationComplete:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.scheduleEnterAnimationComplete(_arg0);
return true;
}
case TRANSACTION_notifyCleartextNetwork:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.notifyCleartextNetwork(_arg0);
return true;
}
case TRANSACTION_startBinderTracking:
{
data.enforceInterface(DESCRIPTOR);
this.startBinderTracking();
return true;
}
case TRANSACTION_stopBinderTrackingAndDump:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.stopBinderTrackingAndDump(_arg0);
return true;
}
case TRANSACTION_scheduleMultiWindowModeChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.content.res.Configuration _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.scheduleMultiWindowModeChanged(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_schedulePictureInPictureModeChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.content.res.Configuration _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.schedulePictureInPictureModeChanged(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_scheduleLocalVoiceInteractionStarted:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
com.android.internal.app.IVoiceInteractor _arg1;
_arg1 = com.android.internal.app.IVoiceInteractor.Stub.asInterface(data.readStrongBinder());
this.scheduleLocalVoiceInteractionStarted(_arg0, _arg1);
return true;
}
case TRANSACTION_handleTrustStorageUpdate:
{
data.enforceInterface(DESCRIPTOR);
this.handleTrustStorageUpdate();
return true;
}
case TRANSACTION_attachAgent:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.attachAgent(_arg0);
return true;
}
case TRANSACTION_scheduleApplicationInfoChanged:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ApplicationInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ApplicationInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.scheduleApplicationInfoChanged(_arg0);
return true;
}
case TRANSACTION_setNetworkBlockSeq:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.setNetworkBlockSeq(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IApplicationThread
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
@Override public void schedulePauseActivity(android.os.IBinder token, boolean finished, boolean userLeaving, int configChanges, boolean dontReport) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((finished)?(1):(0)));
_data.writeInt(((userLeaving)?(1):(0)));
_data.writeInt(configChanges);
_data.writeInt(((dontReport)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_schedulePauseActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleStopActivity(android.os.IBinder token, boolean showWindow, int configChanges) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((showWindow)?(1):(0)));
_data.writeInt(configChanges);
mRemote.transact(Stub.TRANSACTION_scheduleStopActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleWindowVisibility(android.os.IBinder token, boolean showWindow) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((showWindow)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_scheduleWindowVisibility, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleResumeActivity(android.os.IBinder token, int procState, boolean isForward, android.os.Bundle resumeArgs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(procState);
_data.writeInt(((isForward)?(1):(0)));
if ((resumeArgs!=null)) {
_data.writeInt(1);
resumeArgs.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleResumeActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleSendResult(android.os.IBinder token, java.util.List<android.app.ResultInfo> results) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeTypedList(results);
mRemote.transact(Stub.TRANSACTION_scheduleSendResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleLaunchActivity(android.content.Intent intent, android.os.IBinder token, int ident, android.content.pm.ActivityInfo info, android.content.res.Configuration curConfig, android.content.res.Configuration overrideConfig, android.content.res.CompatibilityInfo compatInfo, java.lang.String referrer, com.android.internal.app.IVoiceInteractor voiceInteractor, int procState, android.os.Bundle state, android.os.PersistableBundle persistentState, java.util.List<android.app.ResultInfo> pendingResults, java.util.List<com.android.internal.content.ReferrerIntent> pendingNewIntents, boolean notResumed, boolean isForward, android.app.ProfilerInfo profilerInfo) throws android.os.RemoteException
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
_data.writeStrongBinder(token);
_data.writeInt(ident);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((curConfig!=null)) {
_data.writeInt(1);
curConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((overrideConfig!=null)) {
_data.writeInt(1);
overrideConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((compatInfo!=null)) {
_data.writeInt(1);
compatInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(referrer);
_data.writeStrongBinder((((voiceInteractor!=null))?(voiceInteractor.asBinder()):(null)));
_data.writeInt(procState);
if ((state!=null)) {
_data.writeInt(1);
state.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((persistentState!=null)) {
_data.writeInt(1);
persistentState.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeTypedList(pendingResults);
_data.writeTypedList(pendingNewIntents);
_data.writeInt(((notResumed)?(1):(0)));
_data.writeInt(((isForward)?(1):(0)));
if ((profilerInfo!=null)) {
_data.writeInt(1);
profilerInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleLaunchActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleNewIntent(java.util.List<com.android.internal.content.ReferrerIntent> intent, android.os.IBinder token, boolean andPause) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(intent);
_data.writeStrongBinder(token);
_data.writeInt(((andPause)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_scheduleNewIntent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleDestroyActivity(android.os.IBinder token, boolean finished, int configChanges) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((finished)?(1):(0)));
_data.writeInt(configChanges);
mRemote.transact(Stub.TRANSACTION_scheduleDestroyActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleReceiver(android.content.Intent intent, android.content.pm.ActivityInfo info, android.content.res.CompatibilityInfo compatInfo, int resultCode, java.lang.String data, android.os.Bundle extras, boolean sync, int sendingUser, int processState) throws android.os.RemoteException
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
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((compatInfo!=null)) {
_data.writeInt(1);
compatInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(resultCode);
_data.writeString(data);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((sync)?(1):(0)));
_data.writeInt(sendingUser);
_data.writeInt(processState);
mRemote.transact(Stub.TRANSACTION_scheduleReceiver, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleCreateService(android.os.IBinder token, android.content.pm.ServiceInfo info, android.content.res.CompatibilityInfo compatInfo, int processState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((compatInfo!=null)) {
_data.writeInt(1);
compatInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(processState);
mRemote.transact(Stub.TRANSACTION_scheduleCreateService, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleStopService(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_scheduleStopService, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void bindApplication(java.lang.String packageName, android.content.pm.ApplicationInfo info, java.util.List<android.content.pm.ProviderInfo> providers, android.content.ComponentName testName, android.app.ProfilerInfo profilerInfo, android.os.Bundle testArguments, android.app.IInstrumentationWatcher testWatcher, android.app.IUiAutomationConnection uiAutomationConnection, int debugMode, boolean enableBinderTracking, boolean trackAllocation, boolean restrictedBackupMode, boolean persistent, android.content.res.Configuration config, android.content.res.CompatibilityInfo compatInfo, java.util.Map services, android.os.Bundle coreSettings, java.lang.String buildSerial) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeTypedList(providers);
if ((testName!=null)) {
_data.writeInt(1);
testName.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((profilerInfo!=null)) {
_data.writeInt(1);
profilerInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((testArguments!=null)) {
_data.writeInt(1);
testArguments.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((testWatcher!=null))?(testWatcher.asBinder()):(null)));
_data.writeStrongBinder((((uiAutomationConnection!=null))?(uiAutomationConnection.asBinder()):(null)));
_data.writeInt(debugMode);
_data.writeInt(((enableBinderTracking)?(1):(0)));
_data.writeInt(((trackAllocation)?(1):(0)));
_data.writeInt(((restrictedBackupMode)?(1):(0)));
_data.writeInt(((persistent)?(1):(0)));
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((compatInfo!=null)) {
_data.writeInt(1);
compatInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeMap(services);
if ((coreSettings!=null)) {
_data.writeInt(1);
coreSettings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(buildSerial);
mRemote.transact(Stub.TRANSACTION_bindApplication, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleExit() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_scheduleExit, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleConfigurationChanged(android.content.res.Configuration config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleConfigurationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleServiceArgs(android.os.IBinder token, android.content.pm.ParceledListSlice args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((args!=null)) {
_data.writeInt(1);
args.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleServiceArgs, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateTimeZone() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateTimeZone, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void processInBackground() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_processInBackground, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleBindService(android.os.IBinder token, android.content.Intent intent, boolean rebind, int processState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((rebind)?(1):(0)));
_data.writeInt(processState);
mRemote.transact(Stub.TRANSACTION_scheduleBindService, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleUnbindService(android.os.IBinder token, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleUnbindService, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dumpService(android.os.ParcelFileDescriptor fd, android.os.IBinder servicetoken, java.lang.String[] args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(servicetoken);
_data.writeStringArray(args);
mRemote.transact(Stub.TRANSACTION_dumpService, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleRegisteredReceiver(android.content.IIntentReceiver receiver, android.content.Intent intent, int resultCode, java.lang.String data, android.os.Bundle extras, boolean ordered, boolean sticky, int sendingUser, int processState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((receiver!=null))?(receiver.asBinder()):(null)));
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(resultCode);
_data.writeString(data);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((ordered)?(1):(0)));
_data.writeInt(((sticky)?(1):(0)));
_data.writeInt(sendingUser);
_data.writeInt(processState);
mRemote.transact(Stub.TRANSACTION_scheduleRegisteredReceiver, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleLowMemory() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_scheduleLowMemory, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleActivityConfigurationChanged(android.os.IBinder token, android.content.res.Configuration overrideConfig) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((overrideConfig!=null)) {
_data.writeInt(1);
overrideConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleActivityConfigurationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleActivityMovedToDisplay(android.os.IBinder token, int displayId, android.content.res.Configuration overrideConfig) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(displayId);
if ((overrideConfig!=null)) {
_data.writeInt(1);
overrideConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleActivityMovedToDisplay, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleRelaunchActivity(android.os.IBinder token, java.util.List<android.app.ResultInfo> pendingResults, java.util.List<com.android.internal.content.ReferrerIntent> pendingNewIntents, int configChanges, boolean notResumed, android.content.res.Configuration config, android.content.res.Configuration overrideConfig, boolean preserveWindow) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeTypedList(pendingResults);
_data.writeTypedList(pendingNewIntents);
_data.writeInt(configChanges);
_data.writeInt(((notResumed)?(1):(0)));
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((overrideConfig!=null)) {
_data.writeInt(1);
overrideConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((preserveWindow)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_scheduleRelaunchActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleSleeping(android.os.IBinder token, boolean sleeping) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((sleeping)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_scheduleSleeping, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void profilerControl(boolean start, android.app.ProfilerInfo profilerInfo, int profileType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((start)?(1):(0)));
if ((profilerInfo!=null)) {
_data.writeInt(1);
profilerInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(profileType);
mRemote.transact(Stub.TRANSACTION_profilerControl, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setSchedulingGroup(int group) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(group);
mRemote.transact(Stub.TRANSACTION_setSchedulingGroup, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo app, android.content.res.CompatibilityInfo compatInfo, int backupMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((app!=null)) {
_data.writeInt(1);
app.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((compatInfo!=null)) {
_data.writeInt(1);
compatInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(backupMode);
mRemote.transact(Stub.TRANSACTION_scheduleCreateBackupAgent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo app, android.content.res.CompatibilityInfo compatInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((app!=null)) {
_data.writeInt(1);
app.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((compatInfo!=null)) {
_data.writeInt(1);
compatInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleDestroyBackupAgent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleOnNewActivityOptions(android.os.IBinder token, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleOnNewActivityOptions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleSuicide() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_scheduleSuicide, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dispatchPackageBroadcast(int cmd, java.lang.String[] packages) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cmd);
_data.writeStringArray(packages);
mRemote.transact(Stub.TRANSACTION_dispatchPackageBroadcast, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleCrash(java.lang.String msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(msg);
mRemote.transact(Stub.TRANSACTION_scheduleCrash, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dumpHeap(boolean managed, boolean mallocInfo, boolean runGc, java.lang.String path, android.os.ParcelFileDescriptor fd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((managed)?(1):(0)));
_data.writeInt(((mallocInfo)?(1):(0)));
_data.writeInt(((runGc)?(1):(0)));
_data.writeString(path);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_dumpHeap, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dumpActivity(android.os.ParcelFileDescriptor fd, android.os.IBinder servicetoken, java.lang.String prefix, java.lang.String[] args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(servicetoken);
_data.writeString(prefix);
_data.writeStringArray(args);
mRemote.transact(Stub.TRANSACTION_dumpActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void clearDnsCache() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearDnsCache, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setHttpProxy(java.lang.String proxy, java.lang.String port, java.lang.String exclList, android.net.Uri pacFileUrl) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(proxy);
_data.writeString(port);
_data.writeString(exclList);
if ((pacFileUrl!=null)) {
_data.writeInt(1);
pacFileUrl.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setHttpProxy, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setCoreSettings(android.os.Bundle coreSettings) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((coreSettings!=null)) {
_data.writeInt(1);
coreSettings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCoreSettings, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updatePackageCompatibilityInfo(java.lang.String pkg, android.content.res.CompatibilityInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updatePackageCompatibilityInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleTrimMemory(int level) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(level);
mRemote.transact(Stub.TRANSACTION_scheduleTrimMemory, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dumpMemInfo(android.os.ParcelFileDescriptor fd, android.os.Debug.MemoryInfo mem, boolean checkin, boolean dumpInfo, boolean dumpDalvik, boolean dumpSummaryOnly, boolean dumpUnreachable, java.lang.String[] args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((mem!=null)) {
_data.writeInt(1);
mem.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((checkin)?(1):(0)));
_data.writeInt(((dumpInfo)?(1):(0)));
_data.writeInt(((dumpDalvik)?(1):(0)));
_data.writeInt(((dumpSummaryOnly)?(1):(0)));
_data.writeInt(((dumpUnreachable)?(1):(0)));
_data.writeStringArray(args);
mRemote.transact(Stub.TRANSACTION_dumpMemInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dumpGfxInfo(android.os.ParcelFileDescriptor fd, java.lang.String[] args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringArray(args);
mRemote.transact(Stub.TRANSACTION_dumpGfxInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dumpProvider(android.os.ParcelFileDescriptor fd, android.os.IBinder servicetoken, java.lang.String[] args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(servicetoken);
_data.writeStringArray(args);
mRemote.transact(Stub.TRANSACTION_dumpProvider, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dumpDbInfo(android.os.ParcelFileDescriptor fd, java.lang.String[] args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringArray(args);
mRemote.transact(Stub.TRANSACTION_dumpDbInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void unstableProviderDied(android.os.IBinder provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(provider);
mRemote.transact(Stub.TRANSACTION_unstableProviderDied, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void requestAssistContextExtras(android.os.IBinder activityToken, android.os.IBinder requestToken, int requestType, int sessionId, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(activityToken);
_data.writeStrongBinder(requestToken);
_data.writeInt(requestType);
_data.writeInt(sessionId);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_requestAssistContextExtras, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleTranslucentConversionComplete(android.os.IBinder token, boolean timeout) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((timeout)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_scheduleTranslucentConversionComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setProcessState(int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_setProcessState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleInstallProvider(android.content.pm.ProviderInfo provider) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((provider!=null)) {
_data.writeInt(1);
provider.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleInstallProvider, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateTimePrefs(int timeFormatPreference) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(timeFormatPreference);
mRemote.transact(Stub.TRANSACTION_updateTimePrefs, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleEnterAnimationComplete(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_scheduleEnterAnimationComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void notifyCleartextNetwork(byte[] firstPacket) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(firstPacket);
mRemote.transact(Stub.TRANSACTION_notifyCleartextNetwork, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void startBinderTracking() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startBinderTracking, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor fd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fd!=null)) {
_data.writeInt(1);
fd.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_stopBinderTrackingAndDump, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleMultiWindowModeChanged(android.os.IBinder token, boolean isInMultiWindowMode, android.content.res.Configuration newConfig) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((isInMultiWindowMode)?(1):(0)));
if ((newConfig!=null)) {
_data.writeInt(1);
newConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleMultiWindowModeChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void schedulePictureInPictureModeChanged(android.os.IBinder token, boolean isInPictureInPictureMode, android.content.res.Configuration newConfig) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((isInPictureInPictureMode)?(1):(0)));
if ((newConfig!=null)) {
_data.writeInt(1);
newConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_schedulePictureInPictureModeChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleLocalVoiceInteractionStarted(android.os.IBinder token, com.android.internal.app.IVoiceInteractor voiceInteractor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeStrongBinder((((voiceInteractor!=null))?(voiceInteractor.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_scheduleLocalVoiceInteractionStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleTrustStorageUpdate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleTrustStorageUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void attachAgent(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_attachAgent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo ai) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((ai!=null)) {
_data.writeInt(1);
ai.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scheduleApplicationInfoChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setNetworkBlockSeq(long procStateSeq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(procStateSeq);
mRemote.transact(Stub.TRANSACTION_setNetworkBlockSeq, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_schedulePauseActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_scheduleStopActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_scheduleWindowVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_scheduleResumeActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_scheduleSendResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_scheduleLaunchActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_scheduleNewIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_scheduleDestroyActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_scheduleReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_scheduleCreateService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_scheduleStopService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_bindApplication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_scheduleExit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_scheduleConfigurationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_scheduleServiceArgs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_updateTimeZone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_processInBackground = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_scheduleBindService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_scheduleUnbindService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_dumpService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_scheduleRegisteredReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_scheduleLowMemory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_scheduleActivityConfigurationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_scheduleActivityMovedToDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_scheduleRelaunchActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_scheduleSleeping = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_profilerControl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_setSchedulingGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_scheduleCreateBackupAgent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_scheduleDestroyBackupAgent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_scheduleOnNewActivityOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_scheduleSuicide = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_dispatchPackageBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_scheduleCrash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_dumpHeap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_dumpActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_clearDnsCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_setHttpProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_setCoreSettings = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_updatePackageCompatibilityInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_scheduleTrimMemory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_dumpMemInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_dumpGfxInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_dumpProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_dumpDbInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_unstableProviderDied = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_requestAssistContextExtras = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_scheduleTranslucentConversionComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_setProcessState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_scheduleInstallProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_updateTimePrefs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_scheduleEnterAnimationComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_notifyCleartextNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_startBinderTracking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_stopBinderTrackingAndDump = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_scheduleMultiWindowModeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_schedulePictureInPictureModeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_scheduleLocalVoiceInteractionStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_handleTrustStorageUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_attachAgent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_scheduleApplicationInfoChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_setNetworkBlockSeq = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
}
public void schedulePauseActivity(android.os.IBinder token, boolean finished, boolean userLeaving, int configChanges, boolean dontReport) throws android.os.RemoteException;
public void scheduleStopActivity(android.os.IBinder token, boolean showWindow, int configChanges) throws android.os.RemoteException;
public void scheduleWindowVisibility(android.os.IBinder token, boolean showWindow) throws android.os.RemoteException;
public void scheduleResumeActivity(android.os.IBinder token, int procState, boolean isForward, android.os.Bundle resumeArgs) throws android.os.RemoteException;
public void scheduleSendResult(android.os.IBinder token, java.util.List<android.app.ResultInfo> results) throws android.os.RemoteException;
public void scheduleLaunchActivity(android.content.Intent intent, android.os.IBinder token, int ident, android.content.pm.ActivityInfo info, android.content.res.Configuration curConfig, android.content.res.Configuration overrideConfig, android.content.res.CompatibilityInfo compatInfo, java.lang.String referrer, com.android.internal.app.IVoiceInteractor voiceInteractor, int procState, android.os.Bundle state, android.os.PersistableBundle persistentState, java.util.List<android.app.ResultInfo> pendingResults, java.util.List<com.android.internal.content.ReferrerIntent> pendingNewIntents, boolean notResumed, boolean isForward, android.app.ProfilerInfo profilerInfo) throws android.os.RemoteException;
public void scheduleNewIntent(java.util.List<com.android.internal.content.ReferrerIntent> intent, android.os.IBinder token, boolean andPause) throws android.os.RemoteException;
public void scheduleDestroyActivity(android.os.IBinder token, boolean finished, int configChanges) throws android.os.RemoteException;
public void scheduleReceiver(android.content.Intent intent, android.content.pm.ActivityInfo info, android.content.res.CompatibilityInfo compatInfo, int resultCode, java.lang.String data, android.os.Bundle extras, boolean sync, int sendingUser, int processState) throws android.os.RemoteException;
public void scheduleCreateService(android.os.IBinder token, android.content.pm.ServiceInfo info, android.content.res.CompatibilityInfo compatInfo, int processState) throws android.os.RemoteException;
public void scheduleStopService(android.os.IBinder token) throws android.os.RemoteException;
public void bindApplication(java.lang.String packageName, android.content.pm.ApplicationInfo info, java.util.List<android.content.pm.ProviderInfo> providers, android.content.ComponentName testName, android.app.ProfilerInfo profilerInfo, android.os.Bundle testArguments, android.app.IInstrumentationWatcher testWatcher, android.app.IUiAutomationConnection uiAutomationConnection, int debugMode, boolean enableBinderTracking, boolean trackAllocation, boolean restrictedBackupMode, boolean persistent, android.content.res.Configuration config, android.content.res.CompatibilityInfo compatInfo, java.util.Map services, android.os.Bundle coreSettings, java.lang.String buildSerial) throws android.os.RemoteException;
public void scheduleExit() throws android.os.RemoteException;
public void scheduleConfigurationChanged(android.content.res.Configuration config) throws android.os.RemoteException;
public void scheduleServiceArgs(android.os.IBinder token, android.content.pm.ParceledListSlice args) throws android.os.RemoteException;
public void updateTimeZone() throws android.os.RemoteException;
public void processInBackground() throws android.os.RemoteException;
public void scheduleBindService(android.os.IBinder token, android.content.Intent intent, boolean rebind, int processState) throws android.os.RemoteException;
public void scheduleUnbindService(android.os.IBinder token, android.content.Intent intent) throws android.os.RemoteException;
public void dumpService(android.os.ParcelFileDescriptor fd, android.os.IBinder servicetoken, java.lang.String[] args) throws android.os.RemoteException;
public void scheduleRegisteredReceiver(android.content.IIntentReceiver receiver, android.content.Intent intent, int resultCode, java.lang.String data, android.os.Bundle extras, boolean ordered, boolean sticky, int sendingUser, int processState) throws android.os.RemoteException;
public void scheduleLowMemory() throws android.os.RemoteException;
public void scheduleActivityConfigurationChanged(android.os.IBinder token, android.content.res.Configuration overrideConfig) throws android.os.RemoteException;
public void scheduleActivityMovedToDisplay(android.os.IBinder token, int displayId, android.content.res.Configuration overrideConfig) throws android.os.RemoteException;
public void scheduleRelaunchActivity(android.os.IBinder token, java.util.List<android.app.ResultInfo> pendingResults, java.util.List<com.android.internal.content.ReferrerIntent> pendingNewIntents, int configChanges, boolean notResumed, android.content.res.Configuration config, android.content.res.Configuration overrideConfig, boolean preserveWindow) throws android.os.RemoteException;
public void scheduleSleeping(android.os.IBinder token, boolean sleeping) throws android.os.RemoteException;
public void profilerControl(boolean start, android.app.ProfilerInfo profilerInfo, int profileType) throws android.os.RemoteException;
public void setSchedulingGroup(int group) throws android.os.RemoteException;
public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo app, android.content.res.CompatibilityInfo compatInfo, int backupMode) throws android.os.RemoteException;
public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo app, android.content.res.CompatibilityInfo compatInfo) throws android.os.RemoteException;
public void scheduleOnNewActivityOptions(android.os.IBinder token, android.os.Bundle options) throws android.os.RemoteException;
public void scheduleSuicide() throws android.os.RemoteException;
public void dispatchPackageBroadcast(int cmd, java.lang.String[] packages) throws android.os.RemoteException;
public void scheduleCrash(java.lang.String msg) throws android.os.RemoteException;
public void dumpHeap(boolean managed, boolean mallocInfo, boolean runGc, java.lang.String path, android.os.ParcelFileDescriptor fd) throws android.os.RemoteException;
public void dumpActivity(android.os.ParcelFileDescriptor fd, android.os.IBinder servicetoken, java.lang.String prefix, java.lang.String[] args) throws android.os.RemoteException;
public void clearDnsCache() throws android.os.RemoteException;
public void setHttpProxy(java.lang.String proxy, java.lang.String port, java.lang.String exclList, android.net.Uri pacFileUrl) throws android.os.RemoteException;
public void setCoreSettings(android.os.Bundle coreSettings) throws android.os.RemoteException;
public void updatePackageCompatibilityInfo(java.lang.String pkg, android.content.res.CompatibilityInfo info) throws android.os.RemoteException;
public void scheduleTrimMemory(int level) throws android.os.RemoteException;
public void dumpMemInfo(android.os.ParcelFileDescriptor fd, android.os.Debug.MemoryInfo mem, boolean checkin, boolean dumpInfo, boolean dumpDalvik, boolean dumpSummaryOnly, boolean dumpUnreachable, java.lang.String[] args) throws android.os.RemoteException;
public void dumpGfxInfo(android.os.ParcelFileDescriptor fd, java.lang.String[] args) throws android.os.RemoteException;
public void dumpProvider(android.os.ParcelFileDescriptor fd, android.os.IBinder servicetoken, java.lang.String[] args) throws android.os.RemoteException;
public void dumpDbInfo(android.os.ParcelFileDescriptor fd, java.lang.String[] args) throws android.os.RemoteException;
public void unstableProviderDied(android.os.IBinder provider) throws android.os.RemoteException;
public void requestAssistContextExtras(android.os.IBinder activityToken, android.os.IBinder requestToken, int requestType, int sessionId, int flags) throws android.os.RemoteException;
public void scheduleTranslucentConversionComplete(android.os.IBinder token, boolean timeout) throws android.os.RemoteException;
public void setProcessState(int state) throws android.os.RemoteException;
public void scheduleInstallProvider(android.content.pm.ProviderInfo provider) throws android.os.RemoteException;
public void updateTimePrefs(int timeFormatPreference) throws android.os.RemoteException;
public void scheduleEnterAnimationComplete(android.os.IBinder token) throws android.os.RemoteException;
public void notifyCleartextNetwork(byte[] firstPacket) throws android.os.RemoteException;
public void startBinderTracking() throws android.os.RemoteException;
public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor fd) throws android.os.RemoteException;
public void scheduleMultiWindowModeChanged(android.os.IBinder token, boolean isInMultiWindowMode, android.content.res.Configuration newConfig) throws android.os.RemoteException;
public void schedulePictureInPictureModeChanged(android.os.IBinder token, boolean isInPictureInPictureMode, android.content.res.Configuration newConfig) throws android.os.RemoteException;
public void scheduleLocalVoiceInteractionStarted(android.os.IBinder token, com.android.internal.app.IVoiceInteractor voiceInteractor) throws android.os.RemoteException;
public void handleTrustStorageUpdate() throws android.os.RemoteException;
public void attachAgent(java.lang.String path) throws android.os.RemoteException;
public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo ai) throws android.os.RemoteException;
public void setNetworkBlockSeq(long procStateSeq) throws android.os.RemoteException;
}
