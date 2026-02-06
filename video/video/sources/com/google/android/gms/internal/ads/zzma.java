package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzma {
    public final zzlv a;
    public final int b;
    @InterfaceC11300zs1
    public final zzlv c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public zzma(zzlv zzlvVar, @InterfaceC11300zs1 zzlv zzlvVar2, int i) {
        this.a = zzlvVar;
        this.b = i;
        this.c = zzlvVar2;
    }

    public static boolean s(zzlv zzlvVar) {
        if (zzlvVar.n() != 0) {
            return true;
        }
        return false;
    }

    public static zzz[] u(@InterfaceC11300zs1 zzyq zzyqVar) {
        int i;
        if (zzyqVar != null) {
            i = zzyqVar.h();
        } else {
            i = 0;
        }
        zzz[] zzzVarArr = new zzz[i];
        for (int i2 = 0; i2 < i; i2++) {
            zzyqVar.getClass();
            zzzVarArr[i2] = zzyqVar.u(i2);
        }
        return zzzVarArr;
    }

    public static final void v(zzlv zzlvVar) {
        if (zzlvVar.n() == 2) {
            zzlvVar.T();
        }
    }

    public static final void w(zzlv zzlvVar, long j) {
        zzlvVar.G();
        if (!(zzlvVar instanceof zzxi)) {
            return;
        }
        zzxi zzxiVar = (zzxi) zzlvVar;
        throw null;
    }

    public final long A(@InterfaceC11300zs1 zzkx zzkxVar) {
        zzlv l = l(zzkxVar);
        Objects.requireNonNull(l);
        return l.y();
    }

    public final void B(zzii zziiVar) throws zzik {
        boolean z;
        m(this.a, zziiVar);
        zzlv zzlvVar = this.c;
        if (zzlvVar != null) {
            if (s(zzlvVar) && this.d != 3) {
                z = true;
            } else {
                z = false;
            }
            m(zzlvVar, zziiVar);
            o(false);
            if (z) {
                p(true);
            }
        }
        this.d = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(zzii zziiVar) {
        boolean z;
        zzlv zzlvVar;
        if (!g()) {
            return;
        }
        int i = this.d;
        int i2 = 0;
        if (i != 4) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
                if (!z) {
                    zzlvVar = this.a;
                } else {
                    zzlvVar = this.c;
                    zzlvVar.getClass();
                }
                m(zzlvVar, zziiVar);
                o(z);
                if (i == 4) {
                    i2 = 1;
                }
                this.d = i2;
            }
        }
        z = true;
        if (!z) {
        }
        m(zzlvVar, zziiVar);
        o(z);
        if (i == 4) {
        }
        this.d = i2;
    }

    public final void D(zzlz zzlzVar, zzyq zzyqVar, zzwt zzwtVar, long j, boolean z, boolean z2, long j2, long j3, zzvb zzvbVar, zzii zziiVar) throws zzik {
        zzz[] u = u(zzyqVar);
        int i = this.d;
        if (i != 0 && i != 2 && i != 4) {
            this.f = true;
            zzlv zzlvVar = this.c;
            zzlvVar.getClass();
            zzlvVar.s(zzlzVar, u, zzwtVar, j, z, z2, j2, j3, zzvbVar);
            zziiVar.e(zzlvVar);
            return;
        }
        this.e = true;
        zzlv zzlvVar2 = this.a;
        zzlvVar2.s(zzlzVar, u, zzwtVar, j, z, z2, j2, j3, zzvbVar);
        zziiVar.e(zzlvVar2);
    }

    public final void E() {
        zzlv zzlvVar = this.a;
        if (s(zzlvVar)) {
            zzlvVar.v();
            return;
        }
        zzlv zzlvVar2 = this.c;
        if (zzlvVar2 != null && s(zzlvVar2)) {
            zzlvVar2.v();
        }
    }

    public final void F(int i, @InterfaceC11300zs1 Object obj, zzkx zzkxVar) throws zzik {
        zzlv l = l(zzkxVar);
        l.getClass();
        l.w(11, obj);
    }

    public final void G(zzwt zzwtVar, zzii zziiVar, long j, boolean z) throws zzik {
        n(this.a, zzwtVar, zziiVar, j, z);
        zzlv zzlvVar = this.c;
        if (zzlvVar != null) {
            n(zzlvVar, zzwtVar, zziiVar, j, z);
        }
    }

    public final void H() throws zzik {
        boolean z;
        int i = this.d;
        int i2 = 0;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.d = 0;
                return;
            }
            return;
        }
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        p(z);
        if (this.d != 4) {
            i2 = 1;
        }
        this.d = i2;
    }

    public final void I(zzyy zzyyVar, zzyy zzyyVar2, long j) {
        int i;
        int i2 = this.b;
        boolean b = zzyyVar.b(i2);
        boolean b2 = zzyyVar2.b(i2);
        zzlv zzlvVar = this.c;
        if (zzlvVar == null || (i = this.d) == 3 || (i == 0 && s(this.a))) {
            zzlvVar = this.a;
        }
        if (b && !zzlvVar.I()) {
            y();
            zzlz zzlzVar = zzyyVar.b[i2];
            zzlz zzlzVar2 = zzyyVar2.b[i2];
            if (!b2 || !Objects.equals(zzlzVar2, zzlzVar) || g()) {
                w(zzlvVar, j);
            }
        }
    }

    public final void J(zzkx zzkxVar) throws IOException {
        zzlv l = l(zzkxVar);
        l.getClass();
        l.B();
    }

    public final void K() {
        this.a.N();
        this.e = false;
        zzlv zzlvVar = this.c;
        if (zzlvVar != null) {
            zzlvVar.N();
            this.f = false;
        }
    }

    public final void L(long j, long j2) throws zzik {
        zzlv zzlvVar = this.a;
        if (s(zzlvVar)) {
            zzlvVar.p(j, j2);
        }
        zzlv zzlvVar2 = this.c;
        if (zzlvVar2 != null && s(zzlvVar2)) {
            zzlvVar2.p(j, j2);
        }
    }

    public final void M() {
        if (!s(this.a)) {
            o(true);
        }
        zzlv zzlvVar = this.c;
        if (zzlvVar != null && !s(zzlvVar)) {
            o(false);
        }
    }

    public final void N(zzkx zzkxVar, long j) throws zzik {
        zzlv l = l(zzkxVar);
        if (l != null) {
            l.q(j);
        }
    }

    public final void O(long j) {
        int i;
        zzlv zzlvVar = this.a;
        if (s(zzlvVar) && (i = this.d) != 4 && i != 2) {
            w(zzlvVar, j);
        }
        zzlv zzlvVar2 = this.c;
        if (zzlvVar2 != null && s(zzlvVar2) && this.d != 3) {
            w(zzlvVar2, j);
        }
    }

    public final void P(zzkx zzkxVar, long j) {
        zzlv l = l(zzkxVar);
        l.getClass();
        w(l, j);
    }

    public final void Q(float f, float f2) throws zzik {
        this.a.u(f, f2);
        zzlv zzlvVar = this.c;
        if (zzlvVar != null) {
            zzlvVar.u(f, f2);
        }
    }

    public final void R(zzbl zzblVar) {
        this.a.t(zzblVar);
        zzlv zzlvVar = this.c;
        if (zzlvVar != null) {
            zzlvVar.t(zzblVar);
        }
    }

    public final void S(zzabi zzabiVar) throws zzik {
        if (y() == 2) {
            this.a.w(7, zzabiVar);
            zzlv zzlvVar = this.c;
            if (zzlvVar != null) {
                zzlvVar.w(7, zzabiVar);
            }
        }
    }

    public final void T(@InterfaceC11300zs1 Object obj) throws zzik {
        if (y() != 2) {
            return;
        }
        int i = this.d;
        if (i != 4 && i != 1) {
            this.a.w(1, obj);
            return;
        }
        zzlv zzlvVar = this.c;
        zzlvVar.getClass();
        zzlvVar.w(1, obj);
    }

    public final void U(float f) throws zzik {
        if (y() == 1) {
            zzlv zzlvVar = this.a;
            Float valueOf = Float.valueOf(f);
            zzlvVar.w(2, valueOf);
            zzlv zzlvVar2 = this.c;
            if (zzlvVar2 != null) {
                zzlvVar2.w(2, valueOf);
            }
        }
    }

    public final void V() throws zzik {
        zzlv zzlvVar = this.a;
        if (zzlvVar.n() == 1 && this.d != 4) {
            zzlvVar.H();
            return;
        }
        zzlv zzlvVar2 = this.c;
        if (zzlvVar2 != null && zzlvVar2.n() == 1 && this.d != 3) {
            zzlvVar2.H();
        }
    }

    public final void W() {
        int i;
        zzdc.f(!g());
        if (s(this.a)) {
            i = 3;
        } else {
            zzlv zzlvVar = this.c;
            if (zzlvVar != null && s(zzlvVar)) {
                i = 4;
            } else {
                i = 2;
            }
        }
        this.d = i;
    }

    public final void a() {
        zzlv zzlvVar = this.a;
        if (s(zzlvVar)) {
            v(zzlvVar);
        }
        zzlv zzlvVar2 = this.c;
        if (zzlvVar2 != null && s(zzlvVar2)) {
            v(zzlvVar2);
        }
    }

    public final boolean b(zzkx zzkxVar) {
        zzlv l = l(zzkxVar);
        if (l != null && !l.d0() && !l.V() && !l.x0()) {
            return false;
        }
        return true;
    }

    public final boolean c(zzkx zzkxVar) {
        if (q(zzkxVar, this.a) && q(zzkxVar, this.c)) {
            return true;
        }
        return false;
    }

    public final boolean d(zzkx zzkxVar) {
        zzlv l = l(zzkxVar);
        l.getClass();
        return l.d0();
    }

    public final boolean e() {
        return this.c != null;
    }

    public final boolean f() {
        boolean z;
        zzlv zzlvVar = this.a;
        if (s(zzlvVar)) {
            z = zzlvVar.x0();
        } else {
            z = true;
        }
        zzlv zzlvVar2 = this.c;
        if (zzlvVar2 != null && s(zzlvVar2)) {
            return z & zzlvVar2.x0();
        }
        return z;
    }

    public final boolean g() {
        return r() || t();
    }

    public final boolean h(zzkx zzkxVar) {
        boolean z;
        boolean z2;
        if (r() && l(zzkxVar) == this.a) {
            z = true;
        } else {
            z = false;
        }
        if (t() && l(zzkxVar) == this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public final boolean i(@InterfaceC11300zs1 zzkx zzkxVar) {
        if (l(zzkxVar) != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        int i = this.d;
        if (i != 0 && i != 2 && i != 4) {
            zzlv zzlvVar = this.c;
            zzlvVar.getClass();
            return s(zzlvVar);
        }
        return s(this.a);
    }

    public final int k(@InterfaceC11300zs1 zzlv zzlvVar, zzkx zzkxVar, zzyy zzyyVar, zzii zziiVar) throws zzik {
        boolean z;
        if (zzlvVar != null && s(zzlvVar)) {
            zzlv zzlvVar2 = this.a;
            if (zzlvVar == zzlvVar2) {
                z = false;
            } else {
                z = true;
            }
            if ((zzlvVar != zzlvVar2 || !r()) && (zzlvVar != this.c || !t())) {
                zzwt o2 = zzlvVar.o();
                zzwt[] zzwtVarArr = zzkxVar.c;
                int i = this.b;
                zzwt zzwtVar = zzwtVarArr[i];
                boolean b = zzyyVar.b(i);
                if (b && o2 == zzwtVar) {
                    return 1;
                }
                if (!zzlvVar.I()) {
                    zzz[] u = u(zzyyVar.c[i]);
                    zzwt zzwtVar2 = zzwtVarArr[i];
                    zzwtVar2.getClass();
                    zzlvVar.f(u, zzwtVar2, zzkxVar.f(), zzkxVar.e(), zzkxVar.g.a);
                    return 3;
                } else if (!zzlvVar.x0()) {
                    return 0;
                } else {
                    m(zzlvVar, zziiVar);
                    if (!b || g()) {
                        o(!z);
                    }
                    return 1;
                }
            }
        }
        return 1;
    }

    @InterfaceC11300zs1
    public final zzlv l(@InterfaceC11300zs1 zzkx zzkxVar) {
        if (zzkxVar != null) {
            int i = this.b;
            zzwt[] zzwtVarArr = zzkxVar.c;
            if (zzwtVarArr[i] != null) {
                zzlv zzlvVar = this.a;
                zzwt o2 = zzlvVar.o();
                zzwt zzwtVar = zzwtVarArr[i];
                if (o2 == zzwtVar) {
                    return zzlvVar;
                }
                zzlv zzlvVar2 = this.c;
                if (zzlvVar2 != null && zzlvVar2.o() == zzwtVar) {
                    return zzlvVar2;
                }
            }
        }
        return null;
    }

    public final void m(zzlv zzlvVar, zzii zziiVar) {
        boolean z = true;
        if (this.a != zzlvVar && this.c != zzlvVar) {
            z = false;
        }
        zzdc.f(z);
        if (!s(zzlvVar)) {
            return;
        }
        zziiVar.d(zzlvVar);
        v(zzlvVar);
        zzlvVar.x();
    }

    public final void n(zzlv zzlvVar, zzwt zzwtVar, zzii zziiVar, long j, boolean z) throws zzik {
        if (s(zzlvVar)) {
            if (zzwtVar != zzlvVar.o()) {
                m(zzlvVar, zziiVar);
            } else if (z) {
                zzlvVar.q(j);
            }
        }
    }

    public final void o(boolean z) {
        if (z) {
            if (this.e) {
                this.a.D();
                this.e = false;
            }
        } else if (this.f) {
            zzlv zzlvVar = this.c;
            zzlvVar.getClass();
            zzlvVar.D();
            this.f = false;
        }
    }

    public final void p(boolean z) throws zzik {
        if (z) {
            zzlv zzlvVar = this.c;
            zzlvVar.getClass();
            zzlvVar.w(17, this.a);
            return;
        }
        zzlv zzlvVar2 = this.a;
        zzlv zzlvVar3 = this.c;
        zzlvVar3.getClass();
        zzlvVar2.w(17, zzlvVar3);
    }

    public final boolean q(zzkx zzkxVar, @InterfaceC11300zs1 zzlv zzlvVar) {
        if (zzlvVar == null) {
            return true;
        }
        zzwt[] zzwtVarArr = zzkxVar.c;
        int i = this.b;
        zzwt zzwtVar = zzwtVarArr[i];
        if (zzlvVar.o() != null) {
            if (zzlvVar.o() == zzwtVar) {
                if (zzwtVar != null && !zzlvVar.d0()) {
                    zzkxVar.g();
                    boolean z = zzkxVar.g.g;
                }
            }
            zzkx g = zzkxVar.g();
            if (g != null && g.c[i] == zzlvVar.o()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean r() {
        int i = this.d;
        return i == 2 || i == 4;
    }

    public final boolean t() {
        return this.d == 3;
    }

    public final int x() {
        zzlv zzlvVar = this.c;
        boolean s = s(this.a);
        int i = 0;
        if (zzlvVar != null && s(zzlvVar)) {
            i = 1;
        }
        return (s ? 1 : 0) + i;
    }

    public final int y() {
        return this.a.b();
    }

    public final int z(zzkx zzkxVar, zzyy zzyyVar, zzii zziiVar) throws zzik {
        int k = k(this.a, zzkxVar, zzyyVar, zziiVar);
        int k2 = k(this.c, zzkxVar, zzyyVar, zziiVar);
        if (k == 1) {
            return k2;
        }
        return k;
    }
}
