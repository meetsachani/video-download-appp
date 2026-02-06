package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcnv implements zzhfv {
    public final zzhge a;

    public zzcnv(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            return new JSONObject(((zzcro) this.a).a().z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
