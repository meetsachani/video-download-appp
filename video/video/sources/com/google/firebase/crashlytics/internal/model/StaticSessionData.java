package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class StaticSessionData {

    @InterfaceC6615gi
    /* loaded from: classes3.dex */
    public static abstract class AppData {
        public static AppData b(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
            return new AutoValue_StaticSessionData_AppData(str, str2, str3, str4, i, developmentPlatformProvider);
        }

        public abstract String a();

        public abstract int c();

        public abstract DevelopmentPlatformProvider d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    @InterfaceC6615gi
    /* loaded from: classes3.dex */
    public static abstract class DeviceData {
        public static DeviceData c(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            return new AutoValue_StaticSessionData_DeviceData(i, str, i2, j, j2, z, i3, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    @InterfaceC6615gi
    /* loaded from: classes3.dex */
    public static abstract class OsData {
        public static OsData a(String str, String str2, boolean z) {
            return new AutoValue_StaticSessionData_OsData(str, str2, z);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static StaticSessionData b(AppData appData, OsData osData, DeviceData deviceData) {
        return new AutoValue_StaticSessionData(appData, osData, deviceData);
    }

    public abstract AppData a();

    public abstract DeviceData c();

    public abstract OsData d();
}
