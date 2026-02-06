package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class zzuv extends zzbl {
    public final zzap b;

    public zzuv(zzap zzapVar) {
        this.b = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int a(Object obj) {
        if (obj == zzuu.e) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbj d(int i, zzbj zzbjVar, boolean z) {
        Integer num;
        Object obj = null;
        if (z) {
            num = 0;
        } else {
            num = null;
        }
        if (z) {
            obj = zzuu.e;
        }
        zzbjVar.i(num, obj, 0, C10323vs.b, 0L, zzb.e, true);
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbk e(int i, zzbk zzbkVar, long j) {
        zzbkVar.a(zzbk.f227o, this.b, null, C10323vs.b, C10323vs.b, C10323vs.b, false, true, null, 0L, C10323vs.b, 0, 0, 0L);
        zzbkVar.j = true;
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final Object f(int i) {
        return zzuu.e;
    }
}
