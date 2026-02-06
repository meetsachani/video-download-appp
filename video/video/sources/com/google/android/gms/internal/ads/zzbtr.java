package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbtr {
    public final boolean a;
    public final String b;
    public final boolean c;

    public zzbtr(boolean z, String str, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    @InterfaceC11300zs1
    public static zzbtr a(JSONObject jSONObject) {
        return new zzbtr(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
