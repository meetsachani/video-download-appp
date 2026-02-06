package com.google.android.gms.internal.ads;

import android.util.Pair;
import o.C10323vs;
import o.HS1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzuw extends zzxg {
    public final boolean l;
    public final zzbk m;
    public final zzbj n;

    /* renamed from: o  reason: collision with root package name */
    public zzuu f296o;
    @InterfaceC11300zs1
    public zzut p;
    public boolean q;
    public boolean r;
    public boolean s;

    public zzuw(zzvd zzvdVar, boolean z) {
        super(zzvdVar);
        boolean z2;
        if (z) {
            zzvdVar.q();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new zzbk();
        this.n = new zzbj();
        zzvdVar.K();
        this.f296o = zzuu.q(zzvdVar.O());
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    @InterfaceC11300zs1
    public final zzvb E(zzvb zzvbVar) {
        Object obj;
        Object obj2;
        obj = this.f296o.d;
        Object obj3 = zzvbVar.a;
        if (obj != null) {
            obj2 = this.f296o.d;
            if (obj2.equals(obj3)) {
                obj3 = zzuu.e;
            }
        }
        return zzvbVar.a(obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r6 != 0) goto L23;
     */
    @Override // com.google.android.gms.internal.ads.zzxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(zzbl zzblVar) {
        long j;
        zzuu r;
        zzuu r2;
        zzvb zzvbVar = null;
        if (this.r) {
            this.f296o = this.f296o.p(zzblVar);
            zzut zzutVar = this.p;
            if (zzutVar != null) {
                L(zzutVar.k());
            }
        } else if (zzblVar.o()) {
            if (this.s) {
                r2 = this.f296o.p(zzblVar);
            } else {
                r2 = zzuu.r(zzblVar, zzbk.f227o, zzuu.e);
            }
            this.f296o = r2;
        } else {
            zzbk zzbkVar = this.m;
            zzblVar.e(0, zzbkVar, 0L);
            Object obj = zzbkVar.a;
            zzut zzutVar2 = this.p;
            if (zzutVar2 != null) {
                j = zzutVar2.l();
                this.f296o.n(zzutVar2.X.a, this.n);
                this.f296o.e(0, zzbkVar, 0L);
            }
            j = 0;
            Pair l = zzblVar.l(zzbkVar, this.n, 0, j);
            Object obj2 = l.first;
            long longValue = ((Long) l.second).longValue();
            if (this.s) {
                r = this.f296o.p(zzblVar);
            } else {
                r = zzuu.r(zzblVar, obj, obj2);
            }
            this.f296o = r;
            zzut zzutVar3 = this.p;
            if (zzutVar3 != null && L(longValue)) {
                zzvb zzvbVar2 = zzutVar3.X;
                zzvbVar = zzvbVar2.a(J(zzvbVar2.a));
            }
        }
        this.s = true;
        this.r = true;
        v(this.f296o);
        if (zzvbVar != null) {
            zzut zzutVar4 = this.p;
            zzutVar4.getClass();
            zzutVar4.n(zzvbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void G() {
        if (!this.l) {
            this.q = true;
            z(null, this.k);
        }
    }

    public final zzbl H() {
        return this.f296o;
    }

    @Override // com.google.android.gms.internal.ads.zzxg, com.google.android.gms.internal.ads.zzvd
    /* renamed from: I */
    public final zzut k(zzvb zzvbVar, zzzg zzzgVar, long j) {
        zzut zzutVar = new zzut(zzvbVar, zzzgVar, j);
        zzutVar.t(this.k);
        if (this.r) {
            zzutVar.n(zzvbVar.a(J(zzvbVar.a)));
            return zzutVar;
        }
        this.p = zzutVar;
        if (!this.q) {
            this.q = true;
            z(null, this.k);
        }
        return zzutVar;
    }

    public final Object J(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.f296o.d;
        if (obj2 != null && obj.equals(zzuu.e)) {
            obj3 = this.f296o.d;
            return obj3;
        }
        return obj;
    }

    @HS1({"unpreparedMaskingMediaPeriod"})
    public final boolean L(long j) {
        zzut zzutVar = this.p;
        int a = this.f296o.a(zzutVar.X.a);
        if (a == -1) {
            return false;
        }
        zzuu zzuuVar = this.f296o;
        zzbj zzbjVar = this.n;
        zzuuVar.d(a, zzbjVar, false);
        long j2 = zzbjVar.d;
        if (j2 != C10323vs.b && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzutVar.r(j);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxg, com.google.android.gms.internal.ads.zzvd
    public final void c(zzuz zzuzVar) {
        ((zzut) zzuzVar).s();
        if (zzuzVar == this.p) {
            this.p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzua, com.google.android.gms.internal.ads.zzvd
    public final void g(zzap zzapVar) {
        if (this.s) {
            this.f296o = this.f296o.p(new zzxc(this.f296o.b, zzapVar));
        } else {
            this.f296o = zzuu.q(zzapVar);
        }
        this.k.g(zzapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuj, com.google.android.gms.internal.ads.zzua
    public final void w() {
        this.r = false;
        this.q = false;
        super.w();
    }
}
