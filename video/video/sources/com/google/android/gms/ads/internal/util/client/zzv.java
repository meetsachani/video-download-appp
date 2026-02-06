package com.google.android.gms.ads.internal.util.client;

import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzv {
    public final zzx a;

    public zzv() {
        this.a = new zzn(1, 0, 1.0d, false);
    }

    public static zzv a(@InterfaceC11300zs1 JSONObject jSONObject) {
        zzn zznVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("ping_strategy");
        if (optJSONObject == null) {
            zznVar = new zzn(1, 0, 1.0d, false);
        } else {
            zznVar = new zzn(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false));
        }
        return new zzv(zznVar);
    }

    public final zzx b() {
        return this.a;
    }

    public zzv(zzx zzxVar) {
        this.a = zzxVar;
    }
}
