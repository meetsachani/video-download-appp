package com.google.firebase.sessions;

import java.util.List;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AndroidApplicationInfo {
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    @NotNull
    public final String c;
    @NotNull
    public final String d;
    @NotNull
    public final ProcessDetails e;
    @NotNull
    public final List<ProcessDetails> f;

    public AndroidApplicationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ProcessDetails processDetails, @NotNull List<ProcessDetails> list) {
        C6562gT0.p(str, "packageName");
        C6562gT0.p(str2, "versionName");
        C6562gT0.p(str3, "appBuildVersion");
        C6562gT0.p(str4, "deviceManufacturer");
        C6562gT0.p(processDetails, "currentProcessDetails");
        C6562gT0.p(list, "appProcessDetails");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = processDetails;
        this.f = list;
    }

    public static /* synthetic */ AndroidApplicationInfo h(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidApplicationInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = androidApplicationInfo.b;
        }
        if ((i & 4) != 0) {
            str3 = androidApplicationInfo.c;
        }
        if ((i & 8) != 0) {
            str4 = androidApplicationInfo.d;
        }
        if ((i & 16) != 0) {
            processDetails = androidApplicationInfo.e;
        }
        List<ProcessDetails> list2 = list;
        if ((i & 32) != 0) {
            list2 = androidApplicationInfo.f;
        }
        ProcessDetails processDetails2 = processDetails;
        List list3 = list2;
        return androidApplicationInfo.g(str, str2, str3, str4, processDetails2, list3);
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
    public final ProcessDetails e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidApplicationInfo) {
            AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
            return C6562gT0.g(this.a, androidApplicationInfo.a) && C6562gT0.g(this.b, androidApplicationInfo.b) && C6562gT0.g(this.c, androidApplicationInfo.c) && C6562gT0.g(this.d, androidApplicationInfo.d) && C6562gT0.g(this.e, androidApplicationInfo.e) && C6562gT0.g(this.f, androidApplicationInfo.f);
        }
        return false;
    }

    @NotNull
    public final List<ProcessDetails> f() {
        return this.f;
    }

    @NotNull
    public final AndroidApplicationInfo g(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ProcessDetails processDetails, @NotNull List<ProcessDetails> list) {
        C6562gT0.p(str, "packageName");
        C6562gT0.p(str2, "versionName");
        C6562gT0.p(str3, "appBuildVersion");
        C6562gT0.p(str4, "deviceManufacturer");
        C6562gT0.p(processDetails, "currentProcessDetails");
        C6562gT0.p(list, "appProcessDetails");
        return new AndroidApplicationInfo(str, str2, str3, str4, processDetails, list);
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @NotNull
    public final String i() {
        return this.c;
    }

    @NotNull
    public final List<ProcessDetails> j() {
        return this.f;
    }

    @NotNull
    public final ProcessDetails k() {
        return this.e;
    }

    @NotNull
    public final String l() {
        return this.d;
    }

    @NotNull
    public final String m() {
        return this.a;
    }

    @NotNull
    public final String n() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ')';
    }
}
