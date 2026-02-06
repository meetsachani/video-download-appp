package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzuu extends zzup {
    public static final Object e = new Object();
    @InterfaceC11300zs1
    public final Object c;
    @InterfaceC11300zs1
    public final Object d;

    public zzuu(zzbl zzblVar, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
        super(zzblVar);
        this.c = obj;
        this.d = obj2;
    }

    public static zzuu q(zzap zzapVar) {
        return new zzuu(new zzuv(zzapVar), zzbk.f227o, e);
    }

    public static zzuu r(zzbl zzblVar, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
        return new zzuu(zzblVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzbl
    public final int a(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzbl
    public final zzbj d(int i, zzbj zzbjVar, boolean z) {
        this.b.d(i, zzbjVar, z);
        if (Objects.equals(zzbjVar.b, this.d) && z) {
            zzbjVar.b = e;
        }
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzbl
    public final zzbk e(int i, zzbk zzbkVar, long j) {
        this.b.e(i, zzbkVar, j);
        if (Objects.equals(zzbkVar.a, this.c)) {
            zzbkVar.a = zzbk.f227o;
        }
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzbl
    public final Object f(int i) {
        Object f = this.b.f(i);
        if (Objects.equals(f, this.d)) {
            return e;
        }
        return f;
    }

    public final zzuu p(zzbl zzblVar) {
        return new zzuu(zzblVar, this.c, this.d);
    }
}
