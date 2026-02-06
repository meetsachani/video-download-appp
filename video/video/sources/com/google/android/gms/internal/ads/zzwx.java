package com.google.android.gms.internal.ads;

import android.net.Uri;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzwx extends zzbl {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    @InterfaceC11300zs1
    public final zzap e;
    @InterfaceC11300zs1
    public final zzaj f;

    static {
        zzad zzadVar = new zzad();
        zzadVar.a("SinglePeriodTimeline");
        zzadVar.b(Uri.EMPTY);
        zzadVar.c();
    }

    public zzwx(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @InterfaceC11300zs1 Object obj, zzap zzapVar, @InterfaceC11300zs1 zzaj zzajVar) {
        this.b = j4;
        this.c = j5;
        this.d = z;
        zzapVar.getClass();
        this.e = zzapVar;
        this.f = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int a(Object obj) {
        if (g.equals(obj)) {
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
        Object obj;
        zzdc.a(i, 0, 1);
        if (z) {
            obj = g;
        } else {
            obj = null;
        }
        zzbjVar.i(null, obj, 0, this.b, 0L, zzb.e, false);
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbk e(int i, zzbk zzbkVar, long j) {
        zzdc.a(i, 0, 1);
        Object obj = zzbk.f227o;
        zzap zzapVar = this.e;
        long j2 = this.c;
        zzbkVar.a(obj, zzapVar, null, C10323vs.b, C10323vs.b, C10323vs.b, this.d, false, this.f, 0L, j2, 0, 0, 0L);
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final Object f(int i) {
        zzdc.a(i, 0, 1);
        return g;
    }
}
