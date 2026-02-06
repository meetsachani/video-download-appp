package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdrf implements zzfgu {
    public final Map X;
    public final zzbbt Y;

    public zzdrf(zzbbt zzbbtVar, Map map) {
        this.X = map;
        this.Y = zzbbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void g(zzfgn zzfgnVar, String str) {
        Map map = this.X;
        if (map.containsKey(zzfgnVar)) {
            this.Y.c(((zzdre) map.get(zzfgnVar)).a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void h(zzfgn zzfgnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void n(zzfgn zzfgnVar, String str) {
        Map map = this.X;
        if (map.containsKey(zzfgnVar)) {
            this.Y.c(((zzdre) map.get(zzfgnVar)).b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void q(zzfgn zzfgnVar, String str, Throwable th) {
        Map map = this.X;
        if (map.containsKey(zzfgnVar)) {
            this.Y.c(((zzdre) map.get(zzfgnVar)).c);
        }
    }
}
