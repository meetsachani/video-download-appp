package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdhk {
    public final JSONObject a;
    public final zzdns b;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.zzb c;
    @InterfaceC11300zs1
    public final zzbxv d;

    public zzdhk(JSONObject jSONObject, zzdns zzdnsVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 zzbxv zzbxvVar) {
        this.a = jSONObject;
        this.b = zzdnsVar;
        this.c = zzbVar;
        this.d = zzbxvVar;
    }

    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.zzb a() {
        return this.c;
    }

    @InterfaceC11300zs1
    public final zzbxv b() {
        return this.d;
    }

    public final zzdns c() {
        return this.b;
    }

    public final JSONObject d() {
        return this.a;
    }
}
