/* This file is auto-generated.  DO NOT MODIFY.
 * Source file: frameworks/base/core/java/android/app/admin/SecurityLogTags.logtags
 */

package android.app.admin;

/**
 * @hide
 */
public class SecurityLogTags {
  private SecurityLogTags() { }  // don't instantiate

  /** 210001 security_adb_shell_interactive */
  public static final int SECURITY_ADB_SHELL_INTERACTIVE = 210001;

  /** 210002 security_adb_shell_command (command|3) */
  public static final int SECURITY_ADB_SHELL_COMMAND = 210002;

  /** 210003 security_adb_sync_recv (path|3) */
  public static final int SECURITY_ADB_SYNC_RECV = 210003;

  /** 210004 security_adb_sync_send (path|3) */
  public static final int SECURITY_ADB_SYNC_SEND = 210004;

  /** 210005 security_app_process_start (process|3),(start_time|2|3),(uid|1),(pid|1),(seinfo|3),(sha256|3) */
  public static final int SECURITY_APP_PROCESS_START = 210005;

  /** 210006 security_keyguard_dismissed */
  public static final int SECURITY_KEYGUARD_DISMISSED = 210006;

  /** 210007 security_keyguard_dismiss_auth_attempt (success|1),(method_strength|1) */
  public static final int SECURITY_KEYGUARD_DISMISS_AUTH_ATTEMPT = 210007;

  /** 210008 security_keyguard_secured */
  public static final int SECURITY_KEYGUARD_SECURED = 210008;

  public static void writeSecurityAdbShellInteractive() {
    android.util.EventLog.writeEvent(SECURITY_ADB_SHELL_INTERACTIVE);
  }

  public static void writeSecurityAdbShellCommand(String command) {
    android.util.EventLog.writeEvent(SECURITY_ADB_SHELL_COMMAND, command);
  }

  public static void writeSecurityAdbSyncRecv(String path) {
    android.util.EventLog.writeEvent(SECURITY_ADB_SYNC_RECV, path);
  }

  public static void writeSecurityAdbSyncSend(String path) {
    android.util.EventLog.writeEvent(SECURITY_ADB_SYNC_SEND, path);
  }

  public static void writeSecurityAppProcessStart(String process, long startTime, int uid, int pid, String seinfo, String sha256) {
    android.util.EventLog.writeEvent(SECURITY_APP_PROCESS_START, process, startTime, uid, pid, seinfo, sha256);
  }

  public static void writeSecurityKeyguardDismissed() {
    android.util.EventLog.writeEvent(SECURITY_KEYGUARD_DISMISSED);
  }

  public static void writeSecurityKeyguardDismissAuthAttempt(int success, int methodStrength) {
    android.util.EventLog.writeEvent(SECURITY_KEYGUARD_DISMISS_AUTH_ATTEMPT, success, methodStrength);
  }

  public static void writeSecurityKeyguardSecured() {
    android.util.EventLog.writeEvent(SECURITY_KEYGUARD_SECURED);
  }
}
