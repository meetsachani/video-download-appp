package com.google.firebase.sessions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ApplicationInfo {
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    @NotNull
    public final String c;
    @NotNull
    public final String d;
    @NotNull
    public final LogEnvironment e;
    @NotNull
    public final AndroidApplicationInfo f;

    public ApplicationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidApplicationInfo) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        C6562gT0.p(str2, "deviceModel");
        C6562gT0.p(str3, "sessionSdkVersion");
        C6562gT0.p(str4, "osVersion");
        C6562gT0.p(logEnvironment, "logEnvironment");
        C6562gT0.p(androidApplicationInfo, "androidAppInfo");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = logEnvironment;
        this.f = androidApplicationInfo;
    }

    public static /* synthetic */ ApplicationInfo h(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = applicationInfo.b;
        }
        if ((i & 4) != 0) {
            str3 = applicationInfo.c;
        }
        if ((i & 8) != 0) {
            str4 = applicationInfo.d;
        }
        if ((i & 16) != 0) {
            logEnvironment = applicationInfo.e;
        }
        if ((i & 32) != 0) {
            androidApplicationInfo = applicationInfo.f;
        }
        LogEnvironment logEnvironment2 = logEnvironment;
        AndroidApplicationInfo androidApplicationInfo2 = androidApplicationInfo;
        return applicationInfo.g(str, str2, str3, str4, logEnvironment2, androidApplicationInfo2);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    @NotNull
    public final LogEnvironment e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApplicationInfo) {
            ApplicationInfo applicationInfo = (ApplicationInfo) obj;
            return C6562gT0.g(this.a, applicationInfo.a) && C6562gT0.g(this.b, applicationInfo.b) && C6562gT0.g(this.c, applicationInfo.c) && C6562gT0.g(this.d, applicationInfo.d) && this.e == applicationInfo.e && C6562gT0.g(this.f, applicationInfo.f);
        }
        return false;
    }

    @NotNull
    public final AndroidApplicationInfo f() {
        return this.f;
    }

    @NotNull
    public final ApplicationInfo g(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidApplicationInfo) {
        C6562gT0.p(str, RemoteConfigConstants.RequestFieldKey.W);
        C6562gT0.p(str2, "deviceModel");
        C6562gT0.p(str3, "sessionSdkVersion");
        C6562gT0.p(str4, "osVersion");
        C6562gT0.p(logEnvironment, "logEnvironment");
        C6562gT0.p(androidApplicationInfo, "androidAppInfo");
        return new ApplicationInfo(str, str2, str3, str4, logEnvironment, androidApplicationInfo);
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @NotNull
    public final AndroidApplicationInfo i() {
        return this.f;
    }

    @NotNull
    public final String j() {
        return this.a;
    }

    @NotNull
    public final String k() {
        return this.b;
    }

    @NotNull
    public final LogEnvironment l() {
        return this.e;
    }

    @NotNull
    public final String m() {
        return this.d;
    }

    @NotNull
    public final String n() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.b + ", sessionSdkVersion=" + this.c + ", osVersion=" + this.d + ", logEnvironment=" + this.e + ", androidAppInfo=" + this.f + ')';
    }
}
