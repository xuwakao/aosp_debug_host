/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/accounts/IAccountAuthenticator.aidl
 */
package android.accounts;
/**
 * Service that allows the interaction with an authentication server.
 * @hide
 */
public interface IAccountAuthenticator extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.accounts.IAccountAuthenticator
{
private static final java.lang.String DESCRIPTOR = "android.accounts.IAccountAuthenticator";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.accounts.IAccountAuthenticator interface,
 * generating a proxy if needed.
 */
public static android.accounts.IAccountAuthenticator asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.accounts.IAccountAuthenticator))) {
return ((android.accounts.IAccountAuthenticator)iin);
}
return new android.accounts.IAccountAuthenticator.Stub.Proxy(obj);
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
case TRANSACTION_addAccount:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
this.addAccount(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_confirmCredentials:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.confirmCredentials(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_getAuthToken:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.getAuthToken(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_getAuthTokenLabel:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
this.getAuthTokenLabel(_arg0, _arg1);
return true;
}
case TRANSACTION_updateCredentials:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.updateCredentials(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_editProperties:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
this.editProperties(_arg0, _arg1);
return true;
}
case TRANSACTION_hasFeatures:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
this.hasFeatures(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_getAccountRemovalAllowed:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.getAccountRemovalAllowed(_arg0, _arg1);
return true;
}
case TRANSACTION_getAccountCredentialsForCloning:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.getAccountCredentialsForCloning(_arg0, _arg1);
return true;
}
case TRANSACTION_addAccountFromCredentials:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.addAccountFromCredentials(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_startAddAccountSession:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String[] _arg3;
_arg3 = data.createStringArray();
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
this.startAddAccountSession(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_startUpdateCredentialsSession:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.startUpdateCredentialsSession(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_finishSession:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
android.os.Bundle _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.finishSession(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_isCredentialsUpdateSuggested:
{
data.enforceInterface(DESCRIPTOR);
android.accounts.IAccountAuthenticatorResponse _arg0;
_arg0 = android.accounts.IAccountAuthenticatorResponse.Stub.asInterface(data.readStrongBinder());
android.accounts.Account _arg1;
if ((0!=data.readInt())) {
_arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.isCredentialsUpdateSuggested(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.accounts.IAccountAuthenticator
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
     * prompts the user for account information and adds the result to the IAccountManager
     */
@Override public void addAccount(android.accounts.IAccountAuthenticatorResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
_data.writeString(authTokenType);
_data.writeStringArray(requiredFeatures);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addAccount, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * prompts the user for the credentials of the account
     */
@Override public void confirmCredentials(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_confirmCredentials, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * gets the password by either prompting the user or querying the IAccountManager
     */
@Override public void getAuthToken(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(authTokenType);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAuthToken, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Gets the user-visible label of the given authtoken type.
     */
@Override public void getAuthTokenLabel(android.accounts.IAccountAuthenticatorResponse response, java.lang.String authTokenType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(authTokenType);
mRemote.transact(Stub.TRANSACTION_getAuthTokenLabel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * prompts the user for a new password and writes it to the IAccountManager
     */
@Override public void updateCredentials(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(authTokenType);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateCredentials, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * launches an activity that lets the user edit and set the properties for an authenticator
     */
@Override public void editProperties(android.accounts.IAccountAuthenticatorResponse response, java.lang.String accountType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
mRemote.transact(Stub.TRANSACTION_editProperties, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * returns a Bundle where the boolean value BOOLEAN_RESULT_KEY is set if the account has the
     * specified features
     */
@Override public void hasFeatures(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String[] features) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStringArray(features);
mRemote.transact(Stub.TRANSACTION_hasFeatures, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Gets whether or not the account is allowed to be removed.
     */
@Override public void getAccountRemovalAllowed(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAccountRemovalAllowed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Returns a Bundle containing the required credentials to copy the account across users.
     */
@Override public void getAccountCredentialsForCloning(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getAccountCredentialsForCloning, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Uses the Bundle containing credentials from another instance of the authenticator to create
     * a copy of the account on this user.
     */
@Override public void addAccountFromCredentials(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, android.os.Bundle accountCredentials) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((accountCredentials!=null)) {
_data.writeInt(1);
accountCredentials.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addAccountFromCredentials, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Starts the add account session by prompting the user for account information
     * and return a Bundle containing data to finish the session later.
     */
@Override public void startAddAccountSession(android.accounts.IAccountAuthenticatorResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
_data.writeString(authTokenType);
_data.writeStringArray(requiredFeatures);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startAddAccountSession, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Prompts the user for a new password but does not write it to the IAccountManager.
     */
@Override public void startUpdateCredentialsSession(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(authTokenType);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startUpdateCredentialsSession, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Finishes the session started by startAddAccountSession(...) or
     * startUpdateCredentialsSession(...) by adding account to or updating local credentials
     * in the IAccountManager.
     */
@Override public void finishSession(android.accounts.IAccountAuthenticatorResponse response, java.lang.String accountType, android.os.Bundle sessionBundle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
_data.writeString(accountType);
if ((sessionBundle!=null)) {
_data.writeInt(1);
sessionBundle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_finishSession, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Checks if the credentials of the provided account should be updated.
     */
@Override public void isCredentialsUpdateSuggested(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String statusToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
if ((account!=null)) {
_data.writeInt(1);
account.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(statusToken);
mRemote.transact(Stub.TRANSACTION_isCredentialsUpdateSuggested, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_addAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_confirmCredentials = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getAuthTokenLabel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_updateCredentials = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_editProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_hasFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getAccountRemovalAllowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAccountCredentialsForCloning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_addAccountFromCredentials = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_startAddAccountSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_startUpdateCredentialsSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_finishSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_isCredentialsUpdateSuggested = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
/**
     * prompts the user for account information and adds the result to the IAccountManager
     */
public void addAccount(android.accounts.IAccountAuthenticatorResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, android.os.Bundle options) throws android.os.RemoteException;
/**
     * prompts the user for the credentials of the account
     */
public void confirmCredentials(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, android.os.Bundle options) throws android.os.RemoteException;
/**
     * gets the password by either prompting the user or querying the IAccountManager
     */
public void getAuthToken(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.os.RemoteException;
/**
     * Gets the user-visible label of the given authtoken type.
     */
public void getAuthTokenLabel(android.accounts.IAccountAuthenticatorResponse response, java.lang.String authTokenType) throws android.os.RemoteException;
/**
     * prompts the user for a new password and writes it to the IAccountManager
     */
public void updateCredentials(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.os.RemoteException;
/**
     * launches an activity that lets the user edit and set the properties for an authenticator
     */
public void editProperties(android.accounts.IAccountAuthenticatorResponse response, java.lang.String accountType) throws android.os.RemoteException;
/**
     * returns a Bundle where the boolean value BOOLEAN_RESULT_KEY is set if the account has the
     * specified features
     */
public void hasFeatures(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String[] features) throws android.os.RemoteException;
/**
     * Gets whether or not the account is allowed to be removed.
     */
public void getAccountRemovalAllowed(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account) throws android.os.RemoteException;
/**
     * Returns a Bundle containing the required credentials to copy the account across users.
     */
public void getAccountCredentialsForCloning(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account) throws android.os.RemoteException;
/**
     * Uses the Bundle containing credentials from another instance of the authenticator to create
     * a copy of the account on this user.
     */
public void addAccountFromCredentials(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, android.os.Bundle accountCredentials) throws android.os.RemoteException;
/**
     * Starts the add account session by prompting the user for account information
     * and return a Bundle containing data to finish the session later.
     */
public void startAddAccountSession(android.accounts.IAccountAuthenticatorResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, android.os.Bundle options) throws android.os.RemoteException;
/**
     * Prompts the user for a new password but does not write it to the IAccountManager.
     */
public void startUpdateCredentialsSession(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.os.RemoteException;
/**
     * Finishes the session started by startAddAccountSession(...) or
     * startUpdateCredentialsSession(...) by adding account to or updating local credentials
     * in the IAccountManager.
     */
public void finishSession(android.accounts.IAccountAuthenticatorResponse response, java.lang.String accountType, android.os.Bundle sessionBundle) throws android.os.RemoteException;
/**
     * Checks if the credentials of the provided account should be updated.
     */
public void isCredentialsUpdateSuggested(android.accounts.IAccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String statusToken) throws android.os.RemoteException;
}
