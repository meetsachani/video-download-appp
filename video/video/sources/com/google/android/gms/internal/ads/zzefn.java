package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzefn implements zzedh {
    public final zzdpt a;

    public zzefn(zzdpt zzdptVar) {
        this.a = zzdptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    @InterfaceC11300zs1
    public final zzedi a(String str, JSONObject jSONObject) throws zzfcw {
        return new zzedi(this.a.c(str, jSONObject), new zzeew(), str);
    }
}
