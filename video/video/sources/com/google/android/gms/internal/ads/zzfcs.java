package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfcs {
    public final JSONObject a;

    public zzfcs(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @InterfaceC11300zs1
    public final String a() {
        if (c() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean b() {
        zzbcm zzbcmVar = zzbcv.B5;
        return this.a.optBoolean((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar), true);
    }

    public final int c() {
        int optInt = this.a.optInt("media_type", -1);
        if (optInt != 0) {
            if (optInt == 1) {
                return 1;
            }
            return 3;
        }
        return 2;
    }
}
