package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbjy implements zzbjw {
    public final zzbjz a;

    public zzbjy(zzbjz zzbjzVar) {
        this.a = zzbjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Fail to parse float", e);
        }
        zzbjz zzbjzVar = this.a;
        zzbjzVar.c(equals);
        zzbjzVar.b(equals2, f);
        zzcfbVar.n0(equals);
    }
}
