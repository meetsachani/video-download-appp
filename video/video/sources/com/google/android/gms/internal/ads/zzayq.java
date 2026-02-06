package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzayq {
    public final String a;
    @InterfaceC11300zs1
    public final JSONObject b;
    public final String c;
    public final String d;
    public final boolean e;

    public zzayq(String str, VersionInfoParcel versionInfoParcel, String str2, @InterfaceC11300zs1 JSONObject jSONObject, boolean z, boolean z2) {
        this.d = versionInfoParcel.X;
        this.b = jSONObject;
        this.c = str;
        this.a = str2;
        this.e = z2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    @InterfaceC11300zs1
    public final JSONObject d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }
}
