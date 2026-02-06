package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzclo implements zzcle {
    public final zzdvc a;

    public zzclo(zzdvc zzdvcVar) {
        this.a = zzdvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcle
    public final void a(JSONObject jSONObject) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z9)).booleanValue()) {
            return;
        }
        this.a.o(jSONObject);
    }
}
