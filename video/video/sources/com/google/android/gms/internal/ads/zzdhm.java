package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdhm implements zzhfv {
    public final zzdhk a;

    public zzdhm(zzdhk zzdhkVar) {
        this.a = zzdhkVar;
    }

    public static JSONObject a(zzdhk zzdhkVar) {
        JSONObject d = zzdhkVar.d();
        zzhgd.b(d);
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        return a(this.a);
    }

    public final JSONObject c() {
        return a(this.a);
    }
}
