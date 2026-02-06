package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.C4507Vg1;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkx {
    public final zzuz a;
    public final Object b;
    public final zzwt[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public zzky g;
    public boolean h;
    public final boolean[] i;
    public final zzly[] j;
    public final zzyx k;
    public final zzlm l;
    @InterfaceC11300zs1
    public zzkx m;
    public zzxe n;

    /* renamed from: o  reason: collision with root package name */
    public zzyy f288o;
    public long p;

    public zzkx(zzly[] zzlyVarArr, long j, zzyx zzyxVar, zzzg zzzgVar, zzlm zzlmVar, zzky zzkyVar, zzyy zzyyVar, long j2) {
        this.j = zzlyVarArr;
        this.p = j;
        this.k = zzyxVar;
        this.l = zzlmVar;
        zzvb zzvbVar = zzkyVar.a;
        this.b = zzvbVar.a;
        this.g = zzkyVar;
        this.n = zzxe.d;
        this.f288o = zzyyVar;
        this.c = new zzwt[2];
        this.i = new boolean[2];
        long j3 = zzkyVar.b;
        long j4 = zzkyVar.d;
        zzuz p = zzlmVar.p(zzvbVar, zzzgVar, j3);
        this.a = j4 != C10323vs.b ? new zzuf(p, true, 0L, j4) : p;
    }

    public final long a(zzyy zzyyVar, long j, boolean z) {
        return b(zzyyVar, j, false, new boolean[2]);
    }

    public final long b(zzyy zzyyVar, long j, boolean z, boolean[] zArr) {
        zzly[] zzlyVarArr;
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= zzyyVar.a) {
                break;
            }
            boolean[] zArr2 = this.i;
            if (z || !zzyyVar.a(this.f288o, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzlyVarArr = this.j;
            if (i2 >= 2) {
                break;
            }
            zzlyVarArr[i2].b();
            i2++;
        }
        u();
        this.f288o = zzyyVar;
        v();
        zzuz zzuzVar = this.a;
        zzyq[] zzyqVarArr = zzyyVar.c;
        boolean[] zArr3 = this.i;
        zzwt[] zzwtVarArr = this.c;
        long q = zzuzVar.q(zzyqVarArr, zArr3, zzwtVarArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzlyVarArr[i3].b();
        }
        this.f = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzwtVarArr[i4] != null) {
                zzdc.f(zzyyVar.b(i4));
                zzlyVarArr[i4].b();
                this.f = true;
            } else {
                if (zzyqVarArr[i4] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzdc.f(z2);
            }
        }
        return q;
    }

    public final long c() {
        long j;
        if (!this.e) {
            return this.g.b;
        }
        if (this.f) {
            j = this.a.b();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.g.e;
        }
        return j;
    }

    public final long d() {
        if (!this.e) {
            return 0L;
        }
        return this.a.c();
    }

    public final long e() {
        return this.p;
    }

    public final long f() {
        return this.g.b + this.p;
    }

    @InterfaceC11300zs1
    public final zzkx g() {
        return this.m;
    }

    public final zzxe h() {
        return this.n;
    }

    public final zzyy i() {
        return this.f288o;
    }

    public final zzyy j(float f, zzbl zzblVar, boolean z) throws zzik {
        zzyq[] zzyqVarArr;
        zzxe zzxeVar = this.n;
        zzvb zzvbVar = this.g.a;
        zzyx zzyxVar = this.k;
        zzly[] zzlyVarArr = this.j;
        zzyy f2 = zzyxVar.f(zzlyVarArr, zzxeVar, zzvbVar, zzblVar);
        for (int i = 0; i < f2.a; i++) {
            boolean z2 = true;
            if (f2.b(i)) {
                if (f2.c[i] == null) {
                    zzlyVarArr[i].b();
                    z2 = false;
                }
                zzdc.f(z2);
            } else {
                if (f2.c[i] != null) {
                    z2 = false;
                }
                zzdc.f(z2);
            }
        }
        for (zzyq zzyqVar : f2.c) {
        }
        return f2;
    }

    public final void k(zzkv zzkvVar) {
        zzdc.f(w());
        this.a.a(zzkvVar);
    }

    public final void l(float f, zzbl zzblVar, boolean z) throws zzik {
        this.e = true;
        this.n = this.a.g();
        zzyy j = j(f, zzblVar, z);
        zzky zzkyVar = this.g;
        long j2 = zzkyVar.b;
        long j3 = zzkyVar.e;
        if (j3 != C10323vs.b && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false);
        long j4 = this.p;
        zzky zzkyVar2 = this.g;
        this.p = j4 + (zzkyVar2.b - a);
        this.g = zzkyVar2.b(a);
    }

    public final void m(zzuy zzuyVar, long j) {
        this.d = true;
        this.a.m(zzuyVar, j);
    }

    public final void n(long j) {
        zzdc.f(w());
        if (this.e) {
            this.a.d(j - this.p);
        }
    }

    public final void o() {
        u();
        zzuz zzuzVar = this.a;
        try {
            boolean z = zzuzVar instanceof zzuf;
            zzlm zzlmVar = this.l;
            if (z) {
                zzlmVar.i(((zzuf) zzuzVar).X);
            } else {
                zzlmVar.i(zzuzVar);
            }
        } catch (RuntimeException e) {
            zzdx.d(C4507Vg1.p, "Period release failed.", e);
        }
    }

    public final void p(@InterfaceC11300zs1 zzkx zzkxVar) {
        if (zzkxVar == this.m) {
            return;
        }
        u();
        this.m = zzkxVar;
        v();
    }

    public final void q(long j) {
        this.p = j;
    }

    public final void r() {
        zzuz zzuzVar = this.a;
        if (zzuzVar instanceof zzuf) {
            long j = this.g.d;
            if (j == C10323vs.b) {
                j = Long.MIN_VALUE;
            }
            ((zzuf) zzuzVar).k(0L, j);
        }
    }

    public final boolean s() {
        if (!this.e) {
            return false;
        }
        if (this.f && this.a.b() != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean t() {
        if (!this.e) {
            return false;
        }
        if (!s() && c() - this.g.b < C10323vs.b) {
            return false;
        }
        return true;
    }

    public final void u() {
        if (w()) {
            int i = 0;
            while (true) {
                zzyy zzyyVar = this.f288o;
                if (i < zzyyVar.a) {
                    zzyyVar.b(i);
                    zzyq zzyqVar = this.f288o.c[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v() {
        if (w()) {
            int i = 0;
            while (true) {
                zzyy zzyyVar = this.f288o;
                if (i < zzyyVar.a) {
                    zzyyVar.b(i);
                    zzyq zzyqVar = this.f288o.c[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean w() {
        return this.m == null;
    }
}
