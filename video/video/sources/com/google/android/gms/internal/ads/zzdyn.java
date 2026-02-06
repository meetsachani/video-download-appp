package com.google.android.gms.internal.ads;

import java.util.Map;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdyn implements zzdyp {
    public final Map a;
    public final zzgdj b;
    public final zzcyt c;

    public zzdyn(Map map, zzgdj zzgdjVar, zzcyt zzcytVar) {
        this.a = map;
        this.b = zzgdjVar;
        this.c = zzcytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final InterfaceFutureC8411o11 a(final zzbvl zzbvlVar) {
        this.c.D0(zzbvlVar);
        InterfaceFutureC8411o11 g = zzgcy.g(new zzdwf(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y8)).split(",")) {
            final zzhgk zzhgkVar = (zzhgk) this.a.get(str.trim());
            if (zzhgkVar != null) {
                g = zzgcy.f(g, zzdwf.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdyl
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        zzdwf zzdwfVar = (zzdwf) obj;
                        return ((zzdyp) zzhgk.this.b()).a(zzbvlVar);
                    }
                }, this.b);
            }
        }
        zzgcy.r(g, new zzdym(this), zzcaa.g);
        return g;
    }
}
