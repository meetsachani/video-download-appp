package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzevc implements zzetu {
    public final String a;

    public zzevc(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.a);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.l("Failed putting Ad ID.", e);
        }
    }
}
