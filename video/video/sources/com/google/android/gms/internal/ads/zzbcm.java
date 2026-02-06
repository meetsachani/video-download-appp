package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzbcm {
    public final int a;
    public final String b;
    public final Object c;
    public final Object d;

    public /* synthetic */ zzbcm(int i, String str, Object obj, Object obj2, zzbcl zzbclVar) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        com.google.android.gms.ads.internal.client.zzbd.a().d(this);
    }

    public static zzbcm f(int i, String str, float f, float f2) {
        return new zzbcj(1, str, Float.valueOf(f), Float.valueOf(f2));
    }

    public static zzbcm g(int i, String str, int i2, int i3) {
        return new zzbch(1, str, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static zzbcm h(int i, String str, long j, long j2) {
        return new zzbci(1, str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static zzbcm i(int i, String str) {
        zzbck zzbckVar = new zzbck(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.a().c(zzbckVar);
        return zzbckVar;
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    public abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.a;
    }

    public final Object j() {
        return com.google.android.gms.ads.internal.client.zzbd.c().b(this);
    }

    public final Object k() {
        if (com.google.android.gms.ads.internal.client.zzbd.c().f()) {
            return this.d;
        }
        return this.c;
    }

    public final String l() {
        return this.b;
    }
}
