package com.google.android.gms.ads.internal.util.client;

import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzw {
    public static zzw d(@InterfaceC11300zs1 JSONObject jSONObject) {
        return new zzm(jSONObject.optInt("impression_prerequisite", 0), jSONObject.optInt("click_prerequisite", 0), jSONObject.optBoolean("notification_flow_enabled", false));
    }

    public abstract int a();

    public abstract int b();

    public abstract boolean c();
}
