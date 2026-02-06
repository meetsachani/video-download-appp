package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzevg implements zzetu {
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public final String a;
    @InterfaceC5056aJ2
    public final int b;

    public zzevg(@InterfaceC11300zs1 String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        int i;
        String str = this.a;
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(str) && (i = this.b) != -1) {
            try {
                JSONObject g = com.google.android.gms.ads.internal.util.zzbs.g(jSONObject, "pii");
                g.put("pvid", str);
                g.put("pvid_s", i);
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.l("Failed putting gms core app set ID info.", e);
            }
        }
    }
}
