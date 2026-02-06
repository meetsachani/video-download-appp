package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzla {
    public final zzmj c;
    public final zzdq d;
    public long e;
    public int f;
    public boolean g;
    public zziu h;
    @InterfaceC11300zs1
    public zzkx i;
    @InterfaceC11300zs1
    public zzkx j;
    @InterfaceC11300zs1
    public zzkx k;
    @InterfaceC11300zs1
    public zzkx l;
    @InterfaceC11300zs1
    public zzkx m;
    public int n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public Object f289o;
    public long p;
    public final zzkf r;
    public final zzbj a = new zzbj();
    public final zzbk b = new zzbk();
    public List q = new ArrayList();

    public zzla(zzmj zzmjVar, zzdq zzdqVar, zzkf zzkfVar, zziu zziuVar) {
        this.c = zzmjVar;
        this.d = zzdqVar;
        this.r = zzkfVar;
        this.h = zziuVar;
    }

    public static zzvb h(zzbl zzblVar, Object obj, long j, long j2, zzbk zzbkVar, zzbj zzbjVar) {
        zzblVar.n(obj, zzbjVar);
        zzblVar.e(zzbjVar.c, zzbkVar, 0L);
        zzblVar.a(obj);
        zzbjVar.b();
        zzblVar.n(obj, zzbjVar);
        int d = zzbjVar.d(j);
        if (d == -1) {
            return new zzvb(obj, j2, zzbjVar.c(j));
        }
        return new zzvb(obj, d, zzbjVar.e(d), j2);
    }

    public static final boolean l(zzvb zzvbVar) {
        return !zzvbVar.b() && zzvbVar.e == -1;
    }

    @InterfaceC11300zs1
    public final zzky A(long j, zzln zzlnVar) {
        zzkx zzkxVar = this.l;
        if (zzkxVar == null) {
            return e(zzlnVar.a, zzlnVar.b, zzlnVar.c, zzlnVar.s);
        }
        return d(zzlnVar.a, zzkxVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzky B(zzbl zzblVar, zzky zzkyVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzvb zzvbVar = zzkyVar.a;
        boolean l = l(zzvbVar);
        boolean k = k(zzblVar, zzvbVar);
        boolean j5 = j(zzblVar, zzvbVar, l);
        Object obj = zzvbVar.a;
        zzbj zzbjVar = this.a;
        zzblVar.n(obj, zzbjVar);
        if (zzvbVar.b() || (i = zzvbVar.e) == -1) {
            j = -9223372036854775807L;
        } else {
            zzbjVar.g(i);
            j = 0;
        }
        if (zzvbVar.b()) {
            j2 = zzbjVar.f(zzvbVar.b, zzvbVar.c);
        } else if (j != C10323vs.b) {
            j3 = 0;
            j4 = 0;
            if (!zzvbVar.b()) {
                zzbjVar.k(zzvbVar.b);
            } else {
                int i2 = zzvbVar.e;
                if (i2 != -1) {
                    zzbjVar.k(i2);
                }
            }
            return new zzky(zzvbVar, zzkyVar.b, zzkyVar.c, j4, j3, false, false, l, k, j5);
        } else {
            j2 = zzbjVar.d;
        }
        j3 = j2;
        j4 = j;
        if (!zzvbVar.b()) {
        }
        return new zzky(zzvbVar, zzkyVar.b, zzkyVar.c, j4, j3, false, false, l, k, j5);
    }

    public final zzvb C(zzbl zzblVar, Object obj, long j) {
        long c;
        int a;
        zzbj zzbjVar = this.a;
        int i = zzblVar.n(obj, zzbjVar).c;
        Object obj2 = this.f289o;
        if (obj2 != null && (a = zzblVar.a(obj2)) != -1 && zzblVar.d(a, zzbjVar, false).c == i) {
            c = this.p;
        } else {
            zzkx zzkxVar = this.i;
            while (true) {
                if (zzkxVar != null) {
                    if (zzkxVar.b.equals(obj)) {
                        c = zzkxVar.g.a.d;
                        break;
                    }
                    zzkxVar = zzkxVar.g();
                } else {
                    zzkx zzkxVar2 = this.i;
                    while (true) {
                        if (zzkxVar2 != null) {
                            int a2 = zzblVar.a(zzkxVar2.b);
                            if (a2 != -1 && zzblVar.d(a2, zzbjVar, false).c == i) {
                                c = zzkxVar2.g.a.d;
                                break;
                            }
                            zzkxVar2 = zzkxVar2.g();
                        } else {
                            c = c(obj);
                            if (c == -1) {
                                c = this.e;
                                this.e = 1 + c;
                                if (this.i == null) {
                                    this.f289o = obj;
                                    this.p = c;
                                }
                            }
                        }
                    }
                }
            }
        }
        long j2 = c;
        zzblVar.n(obj, zzbjVar);
        int i2 = zzbjVar.c;
        zzbk zzbkVar = this.b;
        zzblVar.e(i2, zzbkVar, 0L);
        Object obj3 = obj;
        for (int a3 = zzblVar.a(obj); a3 >= zzbkVar.m; a3--) {
            zzblVar.d(a3, zzbjVar, true);
            zzbjVar.b();
            if (zzbjVar.d(zzbjVar.d) != -1) {
                Object obj4 = zzbjVar.b;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return h(zzblVar, obj3, j, j2, zzbkVar, zzbjVar);
    }

    public final void E() {
        if (this.n == 0) {
            return;
        }
        zzkx zzkxVar = this.i;
        zzdc.b(zzkxVar);
        this.f289o = zzkxVar.b;
        this.p = zzkxVar.g.a.d;
        while (zzkxVar != null) {
            zzkxVar.o();
            zzkxVar = zzkxVar.g();
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        i();
    }

    public final void F() {
        zzkx zzkxVar = this.m;
        if (zzkxVar == null || zzkxVar.t()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                zzkx zzkxVar2 = (zzkx) this.q.get(i);
                if (!zzkxVar2.t()) {
                    this.m = zzkxVar2;
                    return;
                }
            }
        }
    }

    public final void G(long j) {
        zzkx zzkxVar = this.l;
        if (zzkxVar != null) {
            zzkxVar.n(j);
        }
    }

    public final void H() {
        if (!this.q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.q.size(); i++) {
                ((zzkx) this.q.get(i)).o();
            }
            this.q = arrayList;
            this.m = null;
            F();
        }
    }

    public final void I(zzbl zzblVar, zziu zziuVar) {
        this.h = zziuVar;
        long j = zziuVar.a;
        H();
    }

    public final boolean J(zzuz zzuzVar) {
        zzkx zzkxVar = this.l;
        return zzkxVar != null && zzkxVar.a == zzuzVar;
    }

    public final boolean K(zzuz zzuzVar) {
        zzkx zzkxVar = this.m;
        return zzkxVar != null && zzkxVar.a == zzuzVar;
    }

    public final boolean L() {
        zzkx zzkxVar = this.l;
        if (zzkxVar == null) {
            return true;
        }
        if (!zzkxVar.g.j && zzkxVar.s() && this.l.g.e != C10323vs.b && this.n < 100) {
            return true;
        }
        return false;
    }

    public final int a(zzbl zzblVar) {
        zzbl zzblVar2;
        zzkx zzkxVar = this.i;
        if (zzkxVar == null) {
            return 0;
        }
        int a = zzblVar.a(zzkxVar.b);
        while (true) {
            zzblVar2 = zzblVar;
            a = zzblVar2.i(a, this.a, this.b, this.f, this.g);
            while (true) {
                zzkxVar.getClass();
                if (zzkxVar.g() == null || zzkxVar.g.h) {
                    break;
                }
                zzkxVar = zzkxVar.g();
            }
            zzkx g = zzkxVar.g();
            if (a == -1 || g == null || zzblVar2.a(g.b) != a) {
                break;
            }
            zzkxVar = g;
            zzblVar = zzblVar2;
        }
        int m = m(zzkxVar);
        zzkxVar.g = B(zzblVar2, zzkxVar.g);
        return m;
    }

    public final long b(zzbl zzblVar, Object obj, int i) {
        zzbj zzbjVar = this.a;
        zzblVar.n(obj, zzbjVar);
        zzbjVar.g(i);
        long j = zzbjVar.g.a(i).h;
        return 0L;
    }

    public final long c(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            zzkx zzkxVar = (zzkx) this.q.get(i);
            if (zzkxVar.b.equals(obj)) {
                return zzkxVar.g.a.d;
            }
        }
        return -1L;
    }

    @InterfaceC11300zs1
    public final zzky d(zzbl zzblVar, zzkx zzkxVar, long j) {
        zzbl zzblVar2;
        long j2;
        zzbl zzblVar3;
        zzbj zzbjVar;
        zzbk zzbkVar;
        Object obj;
        long j3;
        long j4;
        long j5;
        zzky zzkyVar = zzkxVar.g;
        long e = zzkxVar.e();
        long j6 = zzkyVar.e;
        long j7 = (e + j6) - j;
        if (zzkyVar.h) {
            zzvb zzvbVar = zzkyVar.a;
            Object obj2 = zzvbVar.a;
            int a = zzblVar.a(obj2);
            int i = this.f;
            boolean z = this.g;
            zzbk zzbkVar2 = this.b;
            zzbj zzbjVar2 = this.a;
            long j8 = 0;
            int i2 = zzblVar.i(a, zzbjVar2, zzbkVar2, i, z);
            if (i2 == -1) {
                return null;
            }
            int i3 = zzblVar.d(i2, zzbjVar2, true).c;
            Object obj3 = zzbjVar2.b;
            obj3.getClass();
            long j9 = zzvbVar.d;
            if (zzblVar.e(i3, zzbkVar2, 0L).m == i2) {
                Pair m = zzblVar.m(zzbkVar2, zzbjVar2, i3, C10323vs.b, Math.max(0L, j7));
                if (m == null) {
                    return null;
                }
                Object obj4 = m.first;
                long longValue = ((Long) m.second).longValue();
                zzkx g = zzkxVar.g();
                if (g != null && g.b.equals(obj4)) {
                    j5 = g.g.a.d;
                } else {
                    long c = c(obj4);
                    if (c == -1) {
                        c = this.e;
                        this.e = 1 + c;
                    }
                    j5 = c;
                }
                zzblVar3 = zzblVar;
                zzbkVar = zzbkVar2;
                zzbjVar = zzbjVar2;
                j3 = longValue;
                obj = obj4;
                j4 = j5;
                j8 = -9223372036854775807L;
            } else {
                zzblVar3 = zzblVar;
                zzbjVar = zzbjVar2;
                zzbkVar = zzbkVar2;
                obj = obj3;
                j3 = 0;
                j4 = j9;
            }
            zzvb h = h(zzblVar3, obj, j3, j4, zzbkVar, zzbjVar);
            long j10 = j3;
            zzbj zzbjVar3 = zzbjVar;
            if (j8 != C10323vs.b && zzkyVar.c != C10323vs.b) {
                zzblVar3.n(obj2, zzbjVar3).b();
                int i4 = zzbjVar3.g.c;
            }
            return e(zzblVar3, h, j8, j10);
        }
        zzvb zzvbVar2 = zzkyVar.a;
        Object obj5 = zzvbVar2.a;
        zzbj zzbjVar4 = this.a;
        zzblVar.n(obj5, zzbjVar4);
        if (zzvbVar2.b()) {
            int i5 = zzvbVar2.b;
            if (zzbjVar4.a(i5) == -1) {
                return null;
            }
            int a2 = zzbjVar4.g.a(i5).a(zzvbVar2.c);
            if (a2 < 0) {
                return f(zzblVar, obj5, i5, a2, zzkyVar.c, zzvbVar2.d, false);
            }
            long j11 = zzkyVar.c;
            if (j11 == C10323vs.b) {
                Pair m2 = zzblVar.m(this.b, zzbjVar4, zzbjVar4.c, C10323vs.b, Math.max(0L, j7));
                zzblVar2 = zzblVar;
                if (m2 == null) {
                    return null;
                }
                j11 = ((Long) m2.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                zzblVar2 = zzblVar;
                j2 = j11;
            }
            b(zzblVar2, obj5, i5);
            return g(zzblVar2, obj5, Math.max(0L, j11), j2, zzvbVar2.d, false);
        }
        int i6 = zzvbVar2.e;
        if (i6 != -1) {
            zzbjVar4.j(i6);
        }
        int e2 = zzbjVar4.e(i6);
        zzbjVar4.k(i6);
        if (e2 != zzbjVar4.a(i6)) {
            return f(zzblVar, obj5, i6, e2, j6, zzvbVar2.d, false);
        }
        b(zzblVar, obj5, i6);
        return g(zzblVar, obj5, 0L, j6, zzvbVar2.d, false);
    }

    public final zzky e(zzbl zzblVar, zzvb zzvbVar, long j, long j2) {
        Object obj = zzvbVar.a;
        zzblVar.n(obj, this.a);
        if (zzvbVar.b()) {
            return f(zzblVar, obj, zzvbVar.b, zzvbVar.c, j, zzvbVar.d, false);
        }
        return g(zzblVar, obj, j2, j, zzvbVar.d, false);
    }

    public final zzky f(zzbl zzblVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        zzvb zzvbVar = new zzvb(obj, i, i2, j2);
        Object obj2 = zzvbVar.a;
        int i3 = zzvbVar.b;
        int i4 = zzvbVar.c;
        zzbj zzbjVar = this.a;
        long f = zzblVar.n(obj2, zzbjVar).f(i3, i4);
        if (i2 == zzbjVar.e(i)) {
            zzbjVar.h();
        }
        zzbjVar.k(i3);
        long j3 = 0;
        if (f != C10323vs.b && f <= 0) {
            j3 = Math.max(0L, (-1) + f);
        }
        return new zzky(zzvbVar, j3, j, C10323vs.b, f, false, false, false, false, false);
    }

    public final zzky g(zzbl zzblVar, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzbj zzbjVar = this.a;
        zzblVar.n(obj, zzbjVar);
        int c = zzbjVar.c(j7);
        if (c == -1) {
            zzbjVar.b();
        } else {
            zzbjVar.k(c);
        }
        zzvb zzvbVar = new zzvb(obj, j3, c);
        boolean l = l(zzvbVar);
        boolean k = k(zzblVar, zzvbVar);
        boolean j8 = j(zzblVar, zzvbVar, l);
        if (c != -1) {
            zzbjVar.k(c);
        }
        if (c != -1) {
            zzbjVar.j(c);
        }
        if (c != -1) {
            zzbjVar.g(c);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != C10323vs.b) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = zzbjVar.d;
            j6 = -9223372036854775807L;
        }
        if (j5 != C10323vs.b && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new zzky(zzvbVar, j7, j2, j6, j5, false, false, l, k, j8);
    }

    public final void i() {
        final zzvb zzvbVar;
        int i = zzfyc.Z;
        final zzfxz zzfxzVar = new zzfxz();
        for (zzkx zzkxVar = this.i; zzkxVar != null; zzkxVar = zzkxVar.g()) {
            zzfxzVar.g(zzkxVar.g.a);
        }
        zzkx zzkxVar2 = this.j;
        if (zzkxVar2 == null) {
            zzvbVar = null;
        } else {
            zzvbVar = zzkxVar2.g.a;
        }
        this.d.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkz
            @Override // java.lang.Runnable
            public final void run() {
                zzla.this.c.g(zzfxzVar.j(), zzvbVar);
            }
        });
    }

    public final boolean j(zzbl zzblVar, zzvb zzvbVar, boolean z) {
        int a = zzblVar.a(zzvbVar.a);
        zzbj zzbjVar = this.a;
        int i = zzblVar.d(a, zzbjVar, false).c;
        zzbk zzbkVar = this.b;
        if (zzblVar.e(i, zzbkVar, 0L).h || zzblVar.i(a, zzbjVar, zzbkVar, this.f, this.g) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final boolean k(zzbl zzblVar, zzvb zzvbVar) {
        if (!l(zzvbVar)) {
            return false;
        }
        Object obj = zzvbVar.a;
        int i = zzblVar.n(obj, this.a).c;
        if (zzblVar.e(i, this.b, 0L).n != zzblVar.a(obj)) {
            return false;
        }
        return true;
    }

    public final int m(zzkx zzkxVar) {
        zzdc.b(zzkxVar);
        int i = 0;
        if (zzkxVar.equals(this.l)) {
            return 0;
        }
        this.l = zzkxVar;
        while (zzkxVar.g() != null) {
            zzkxVar = zzkxVar.g();
            zzkxVar.getClass();
            if (zzkxVar == this.j) {
                zzkx zzkxVar2 = this.i;
                this.j = zzkxVar2;
                this.k = zzkxVar2;
                i = 3;
            }
            if (zzkxVar == this.k) {
                this.k = this.j;
                i |= 2;
            }
            zzkxVar.o();
            this.n--;
        }
        zzkx zzkxVar3 = this.l;
        zzkxVar3.getClass();
        zzkxVar3.p(null);
        i();
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(zzbl zzblVar, long j, long j2, long j3) {
        zzky zzkyVar;
        long e;
        boolean z;
        boolean z2;
        int m;
        zzkx zzkxVar = this.i;
        zzkx zzkxVar2 = null;
        while (true) {
            int i = 0;
            if (zzkxVar == null) {
                return 0;
            }
            zzky zzkyVar2 = zzkxVar.g;
            if (zzkxVar2 == null) {
                zzkyVar = B(zzblVar, zzkyVar2);
            } else {
                zzky d = d(zzblVar, zzkxVar2, j);
                if (d == null || zzkyVar2.b != d.b || !zzkyVar2.a.equals(d.a)) {
                    break;
                }
                zzkyVar = d;
            }
            zzkxVar.g = zzkyVar.a(zzkyVar2.c);
            long j4 = zzkyVar2.e;
            long j5 = zzkyVar.e;
            if (j4 != j5) {
                zzkxVar.r();
                if (j5 == C10323vs.b) {
                    e = Long.MAX_VALUE;
                } else {
                    e = j5 + zzkxVar.e();
                }
                if (zzkxVar == this.j) {
                    boolean z3 = zzkxVar.g.g;
                    if (j2 == Long.MIN_VALUE || j2 >= e) {
                        z = true;
                        if (zzkxVar != this.k && (j3 == Long.MIN_VALUE || j3 >= e)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        m = m(zzkxVar);
                        if (m == 0) {
                            return m;
                        }
                        if (j4 == C10323vs.b) {
                            j4 = -9223372036854775807L;
                        }
                        if (z && j4 != C10323vs.b) {
                            i = 1;
                        }
                        if (z2) {
                            return i | 2;
                        }
                        return i;
                    }
                }
                z = false;
                if (zzkxVar != this.k) {
                }
                z2 = false;
                m = m(zzkxVar);
                if (m == 0) {
                }
            } else {
                zzkxVar2 = zzkxVar;
                zzkxVar = zzkxVar.g();
            }
        }
        return m(zzkxVar2);
    }

    public final int o(zzbl zzblVar, int i) {
        this.f = i;
        return a(zzblVar);
    }

    public final int p(zzbl zzblVar, boolean z) {
        this.g = z;
        return a(zzblVar);
    }

    @InterfaceC11300zs1
    public final zzkx q() {
        zzkx zzkxVar = this.i;
        if (zzkxVar == null) {
            return null;
        }
        if (zzkxVar == this.j) {
            this.j = zzkxVar.g();
        }
        if (zzkxVar == this.k) {
            this.k = zzkxVar.g();
        }
        zzkxVar.o();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            zzkx zzkxVar2 = this.i;
            this.f289o = zzkxVar2.b;
            this.p = zzkxVar2.g.a.d;
        }
        this.i = this.i.g();
        i();
        return this.i;
    }

    public final zzkx r() {
        zzkx zzkxVar = this.k;
        zzdc.b(zzkxVar);
        this.k = zzkxVar.g();
        i();
        zzkx zzkxVar2 = this.k;
        zzdc.b(zzkxVar2);
        return zzkxVar2;
    }

    public final zzkx s() {
        zzkx zzkxVar = this.k;
        zzkx zzkxVar2 = this.j;
        if (zzkxVar == zzkxVar2) {
            zzdc.b(zzkxVar2);
            this.k = zzkxVar2.g();
        }
        zzkx zzkxVar3 = this.j;
        zzdc.b(zzkxVar3);
        this.j = zzkxVar3.g();
        i();
        zzkx zzkxVar4 = this.j;
        zzdc.b(zzkxVar4);
        return zzkxVar4;
    }

    public final zzkx t(zzky zzkyVar) {
        long e;
        zzkx zzkxVar;
        zzkx zzkxVar2 = this.l;
        if (zzkxVar2 == null) {
            e = 1000000000000L;
        } else {
            e = (zzkxVar2.e() + zzkxVar2.g.e) - zzkyVar.b;
        }
        int i = 0;
        while (true) {
            if (i < this.q.size()) {
                zzky zzkyVar2 = ((zzkx) this.q.get(i)).g;
                long j = zzkyVar2.e;
                long j2 = zzkyVar.e;
                if ((j == C10323vs.b || j == j2) && zzkyVar2.b == zzkyVar.b && zzkyVar2.a.equals(zzkyVar.a)) {
                    zzkxVar = (zzkx) this.q.remove(i);
                    break;
                }
                i++;
            } else {
                zzkxVar = null;
                break;
            }
        }
        if (zzkxVar == null) {
            zzkxVar = zzko.k0(this.r.a, zzkyVar, e);
        } else {
            zzkxVar.g = zzkyVar;
            zzkxVar.q(e);
        }
        zzkx zzkxVar3 = this.l;
        if (zzkxVar3 != null) {
            zzkxVar3.p(zzkxVar);
        } else {
            this.i = zzkxVar;
            this.j = zzkxVar;
            this.k = zzkxVar;
        }
        this.f289o = null;
        this.l = zzkxVar;
        this.n++;
        i();
        return zzkxVar;
    }

    @InterfaceC11300zs1
    public final zzkx u() {
        return this.l;
    }

    @InterfaceC11300zs1
    public final zzkx v() {
        return this.i;
    }

    @InterfaceC11300zs1
    public final zzkx w(zzuz zzuzVar) {
        for (int i = 0; i < this.q.size(); i++) {
            zzkx zzkxVar = (zzkx) this.q.get(i);
            if (zzkxVar.a == zzuzVar) {
                return zzkxVar;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public final zzkx x() {
        return this.m;
    }

    @InterfaceC11300zs1
    public final zzkx y() {
        return this.k;
    }

    @InterfaceC11300zs1
    public final zzkx z() {
        return this.j;
    }
}
