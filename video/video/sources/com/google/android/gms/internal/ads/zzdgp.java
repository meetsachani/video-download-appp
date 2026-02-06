package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzdgp implements zzcra {
    public final Map a;
    public final Map b;
    public final Map c;
    public final zzhgk d;
    public final zzdiz e;

    public zzdgp(Map map, Map map2, Map map3, zzhgk zzhgkVar, zzdiz zzdizVar) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = zzhgkVar;
        this.e = zzdizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcra
    @InterfaceC11300zs1
    public final zzedf g(int i, String str) {
        zzedf g;
        zzedf zzedfVar = (zzedf) this.a.get(str);
        if (zzedfVar != null) {
            return zzedfVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzefo zzefoVar = (zzefo) this.c.get(str);
            if (zzefoVar != null) {
                return new zzedg(zzefoVar, new zzfur() { // from class: com.google.android.gms.internal.ads.zzcrc
                    @Override // com.google.android.gms.internal.ads.zzfur
                    public final Object apply(Object obj) {
                        return new zzcrf((List) obj);
                    }
                });
            }
            g = (zzedf) this.b.get(str);
            if (g == null) {
                return null;
            }
        } else if (this.e.e() == null || (g = ((zzcra) this.d.b()).g(i, str)) == null) {
            return null;
        }
        return new zzedg(g, new zzfur() { // from class: com.google.android.gms.internal.ads.zzcrd
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return new zzcrf((zzcqx) obj);
            }
        });
    }
}
