package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzevw implements zzetu {
    public final List a;

    public zzevw(List list) {
        this.a = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.a));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.k("Failed putting experiment ids.");
        }
    }
}
