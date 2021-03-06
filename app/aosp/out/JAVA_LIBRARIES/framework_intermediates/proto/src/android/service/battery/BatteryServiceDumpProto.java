// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/battery.proto

package android.service.battery;

/** @hide */
// message BatteryServiceDumpProto
public final class BatteryServiceDumpProto {

    // enum BatteryPlugged
    public static final int BATTERY_PLUGGED_NONE = 0;
    public static final int BATTERY_PLUGGED_AC = 1;
    public static final int BATTERY_PLUGGED_USB = 2;
    public static final int BATTERY_PLUGGED_WIRELESS = 4;

    // enum BatteryStatus
    public static final int BATTERY_STATUS_INVALID = 0;
    public static final int BATTERY_STATUS_UNKNOWN = 1;
    public static final int BATTERY_STATUS_CHARGING = 2;
    public static final int BATTERY_STATUS_DISCHARGING = 3;
    public static final int BATTERY_STATUS_NOT_CHARGING = 4;
    public static final int BATTERY_STATUS_FULL = 5;

    // enum BatteryHealth
    public static final int BATTERY_HEALTH_INVALID = 0;
    public static final int BATTERY_HEALTH_UNKNOWN = 1;
    public static final int BATTERY_HEALTH_GOOD = 2;
    public static final int BATTERY_HEALTH_OVERHEAT = 3;
    public static final int BATTERY_HEALTH_DEAD = 4;
    public static final int BATTERY_HEALTH_OVER_VOLTAGE = 5;
    public static final int BATTERY_HEALTH_UNSPECIFIED_FAILURE = 6;
    public static final int BATTERY_HEALTH_COLD = 7;

    // optional bool are_updates_stopped = 1;
    public static final long ARE_UPDATES_STOPPED = 0x0000010d00000001L;

    // optional .android.service.battery.BatteryServiceDumpProto.BatteryPlugged plugged = 2;
    public static final long PLUGGED = 0x0000011000000002L;

    // optional int32 max_charging_current = 3;
    public static final long MAX_CHARGING_CURRENT = 0x0000010300000003L;

    // optional int32 max_charging_voltage = 4;
    public static final long MAX_CHARGING_VOLTAGE = 0x0000010300000004L;

    // optional int32 charge_counter = 5;
    public static final long CHARGE_COUNTER = 0x0000010300000005L;

    // optional .android.service.battery.BatteryServiceDumpProto.BatteryStatus status = 6;
    public static final long STATUS = 0x0000011000000006L;

    // optional .android.service.battery.BatteryServiceDumpProto.BatteryHealth health = 7;
    public static final long HEALTH = 0x0000011000000007L;

    // optional bool is_present = 8;
    public static final long IS_PRESENT = 0x0000010d00000008L;

    // optional int32 level = 9;
    public static final long LEVEL = 0x0000010300000009L;

    // optional int32 scale = 10;
    public static final long SCALE = 0x000001030000000aL;

    // optional int32 voltage = 11;
    public static final long VOLTAGE = 0x000001030000000bL;

    // optional int32 temperature = 12;
    public static final long TEMPERATURE = 0x000001030000000cL;

    // optional string technology = 13;
    public static final long TECHNOLOGY = 0x0000010e0000000dL;

}

