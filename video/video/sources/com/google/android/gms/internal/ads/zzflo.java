package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzflo {
    public final String a;
    public final String b;

    public zzflo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static zzflo a(String str, String str2) {
        zzfmx.b(str, "Name is null or empty");
        zzfmx.b(str2, "Version is null or empty");
        return new zzflo(str, str2);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}
