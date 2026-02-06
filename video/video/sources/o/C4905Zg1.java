package o;

import android.util.Pair;
import o.AbstractC5317bO0;
import o.AbstractC7373jp2;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.Zg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4905Zg1 {
    public static final long n = 1000000000000L;

    /* renamed from: o  reason: collision with root package name */
    public static final int f686o = 100;
    public final AbstractC7373jp2.b a = new AbstractC7373jp2.b();
    public final AbstractC7373jp2.d b = new AbstractC7373jp2.d();
    public final F8 c;
    public final InterfaceC5285bG0 d;
    public long e;
    public int f;
    public boolean g;
    @InterfaceC11300zs1
    public C4507Vg1 h;
    @InterfaceC11300zs1
    public C4507Vg1 i;
    @InterfaceC11300zs1
    public C4507Vg1 j;
    public int k;
    @InterfaceC11300zs1
    public Object l;
    public long m;

    public C4905Zg1(F8 f8, InterfaceC5285bG0 interfaceC5285bG0) {
        this.c = f8;
        this.d = interfaceC5285bG0;
    }

    public static InterfaceC7583kh1.b E(AbstractC7373jp2 abstractC7373jp2, Object obj, long j, long j2, AbstractC7373jp2.d dVar, AbstractC7373jp2.b bVar) {
        abstractC7373jp2.m(obj, bVar);
        abstractC7373jp2.u(bVar.Z, dVar);
        for (int g = abstractC7373jp2.g(obj); z(bVar) && g <= dVar.k1; g++) {
            abstractC7373jp2.l(g, bVar, true);
            obj = C9542sf.g(bVar.Y);
        }
        abstractC7373jp2.m(obj, bVar);
        int i = bVar.i(j);
        if (i == -1) {
            return new InterfaceC7583kh1.b(obj, j2, bVar.h(j));
        }
        return new InterfaceC7583kh1.b(obj, i, bVar.q(i), j2);
    }

    public static boolean z(AbstractC7373jp2.b bVar) {
        int i;
        int g = bVar.g();
        if (g != 0 && ((g != 1 || !bVar.w(0)) && bVar.x(bVar.u()))) {
            long j = 0;
            if (bVar.i(0L) == -1) {
                if (bVar.Y0 == 0) {
                    return true;
                }
                if (bVar.w(g - 1)) {
                    i = 2;
                } else {
                    i = 1;
                }
                int i2 = g - i;
                for (int i3 = 0; i3 <= i2; i3++) {
                    j += bVar.n(i3);
                }
                if (bVar.Y0 <= j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A() {
        final InterfaceC7583kh1.b bVar;
        final AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (C4507Vg1 c4507Vg1 = this.h; c4507Vg1 != null; c4507Vg1 = c4507Vg1.j()) {
            r.g(c4507Vg1.f.a);
        }
        C4507Vg1 c4507Vg12 = this.i;
        if (c4507Vg12 == null) {
            bVar = null;
        } else {
            bVar = c4507Vg12.f.a;
        }
        this.d.k(new Runnable() { // from class: o.Yg1
            @Override // java.lang.Runnable
            public final void run() {
                C4905Zg1.this.c.s0(r.e(), bVar);
            }
        });
    }

    public void B(long j) {
        C4507Vg1 c4507Vg1 = this.j;
        if (c4507Vg1 != null) {
            c4507Vg1.s(j);
        }
    }

    public boolean C(C4507Vg1 c4507Vg1) {
        boolean z;
        boolean z2 = false;
        if (c4507Vg1 != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (c4507Vg1.equals(this.j)) {
            return false;
        }
        this.j = c4507Vg1;
        while (c4507Vg1.j() != null) {
            c4507Vg1 = c4507Vg1.j();
            if (c4507Vg1 == this.i) {
                this.i = this.h;
                z2 = true;
            }
            c4507Vg1.t();
            this.k--;
        }
        this.j.w(null);
        A();
        return z2;
    }

    public InterfaceC7583kh1.b D(AbstractC7373jp2 abstractC7373jp2, Object obj, long j) {
        return E(abstractC7373jp2, obj, j, G(abstractC7373jp2, obj), this.b, this.a);
    }

    public InterfaceC7583kh1.b F(AbstractC7373jp2 abstractC7373jp2, Object obj, long j) {
        long G = G(abstractC7373jp2, obj);
        abstractC7373jp2.m(obj, this.a);
        abstractC7373jp2.u(this.a.Z, this.b);
        boolean z = false;
        for (int g = abstractC7373jp2.g(obj); g >= this.b.j1; g--) {
            boolean z2 = true;
            abstractC7373jp2.l(g, this.a, true);
            if (this.a.g() <= 0) {
                z2 = false;
            }
            z |= z2;
            AbstractC7373jp2.b bVar = this.a;
            if (bVar.i(bVar.Y0) != -1) {
                obj = C9542sf.g(this.a.Y);
            }
            if (z && (!z2 || this.a.Y0 != 0)) {
                break;
            }
        }
        return E(abstractC7373jp2, obj, j, G, this.b, this.a);
    }

    public final long G(AbstractC7373jp2 abstractC7373jp2, Object obj) {
        int g;
        int i = abstractC7373jp2.m(obj, this.a).Z;
        Object obj2 = this.l;
        if (obj2 != null && (g = abstractC7373jp2.g(obj2)) != -1 && abstractC7373jp2.k(g, this.a).Z == i) {
            return this.m;
        }
        for (C4507Vg1 c4507Vg1 = this.h; c4507Vg1 != null; c4507Vg1 = c4507Vg1.j()) {
            if (c4507Vg1.b.equals(obj)) {
                return c4507Vg1.f.a.d;
            }
        }
        for (C4507Vg1 c4507Vg12 = this.h; c4507Vg12 != null; c4507Vg12 = c4507Vg12.j()) {
            int g2 = abstractC7373jp2.g(c4507Vg12.b);
            if (g2 != -1 && abstractC7373jp2.k(g2, this.a).Z == i) {
                return c4507Vg12.f.a.d;
            }
        }
        long j = this.e;
        this.e = 1 + j;
        if (this.h == null) {
            this.l = obj;
            this.m = j;
        }
        return j;
    }

    public boolean H() {
        C4507Vg1 c4507Vg1 = this.j;
        if (c4507Vg1 != null) {
            if (c4507Vg1.f.i || !c4507Vg1.q() || this.j.f.e == C10323vs.b || this.k >= 100) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean I(AbstractC7373jp2 abstractC7373jp2) {
        AbstractC7373jp2 abstractC7373jp22;
        C4507Vg1 c4507Vg1 = this.h;
        if (c4507Vg1 == null) {
            return true;
        }
        int g = abstractC7373jp2.g(c4507Vg1.b);
        while (true) {
            abstractC7373jp22 = abstractC7373jp2;
            g = abstractC7373jp22.i(g, this.a, this.b, this.f, this.g);
            while (c4507Vg1.j() != null && !c4507Vg1.f.g) {
                c4507Vg1 = c4507Vg1.j();
            }
            C4507Vg1 j = c4507Vg1.j();
            if (g == -1 || j == null || abstractC7373jp22.g(j.b) != g) {
                break;
            }
            c4507Vg1 = j;
            abstractC7373jp2 = abstractC7373jp22;
        }
        boolean C = C(c4507Vg1);
        c4507Vg1.f = t(abstractC7373jp22, c4507Vg1.f);
        return !C;
    }

    public boolean J(AbstractC7373jp2 abstractC7373jp2, long j, long j2) {
        boolean C;
        C4701Xg1 c4701Xg1;
        long z;
        boolean z2;
        C4507Vg1 c4507Vg1 = null;
        for (C4507Vg1 c4507Vg12 = this.h; c4507Vg12 != null; c4507Vg12 = c4507Vg12.j()) {
            C4701Xg1 c4701Xg12 = c4507Vg12.f;
            if (c4507Vg1 == null) {
                c4701Xg1 = t(abstractC7373jp2, c4701Xg12);
            } else {
                C4701Xg1 j3 = j(abstractC7373jp2, c4507Vg1, j);
                if (j3 == null) {
                    C = C(c4507Vg1);
                } else if (!e(c4701Xg12, j3)) {
                    C = C(c4507Vg1);
                } else {
                    c4701Xg1 = j3;
                }
                return !C;
            }
            c4507Vg12.f = c4701Xg1.a(c4701Xg12.c);
            if (!d(c4701Xg12.e, c4701Xg1.e)) {
                c4507Vg12.A();
                long j4 = c4701Xg1.e;
                if (j4 == C10323vs.b) {
                    z = Long.MAX_VALUE;
                } else {
                    z = c4507Vg12.z(j4);
                }
                if (c4507Vg12 == this.i && !c4507Vg12.f.f && (j2 == Long.MIN_VALUE || j2 >= z)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!C(c4507Vg12) && !z2) {
                    return true;
                }
                return false;
            }
            c4507Vg1 = c4507Vg12;
        }
        return true;
    }

    public boolean K(AbstractC7373jp2 abstractC7373jp2, int i) {
        this.f = i;
        return I(abstractC7373jp2);
    }

    public boolean L(AbstractC7373jp2 abstractC7373jp2, boolean z) {
        this.g = z;
        return I(abstractC7373jp2);
    }

    @InterfaceC11300zs1
    public C4507Vg1 b() {
        C4507Vg1 c4507Vg1 = this.h;
        if (c4507Vg1 == null) {
            return null;
        }
        if (c4507Vg1 == this.i) {
            this.i = c4507Vg1.j();
        }
        this.h.t();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            C4507Vg1 c4507Vg12 = this.h;
            this.l = c4507Vg12.b;
            this.m = c4507Vg12.f.a.d;
        }
        this.h = this.h.j();
        A();
        return this.h;
    }

    public C4507Vg1 c() {
        boolean z;
        C4507Vg1 c4507Vg1 = this.i;
        if (c4507Vg1 != null && c4507Vg1.j() != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.i = this.i.j();
        A();
        return this.i;
    }

    public final boolean d(long j, long j2) {
        if (j != C10323vs.b && j != j2) {
            return false;
        }
        return true;
    }

    public final boolean e(C4701Xg1 c4701Xg1, C4701Xg1 c4701Xg12) {
        if (c4701Xg1.b == c4701Xg12.b && c4701Xg1.a.equals(c4701Xg12.a)) {
            return true;
        }
        return false;
    }

    public void f() {
        if (this.k == 0) {
            return;
        }
        C4507Vg1 c4507Vg1 = (C4507Vg1) C9542sf.k(this.h);
        this.l = c4507Vg1.b;
        this.m = c4507Vg1.f.a.d;
        while (c4507Vg1 != null) {
            c4507Vg1.t();
            c4507Vg1 = c4507Vg1.j();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        A();
    }

    public C4507Vg1 g(InterfaceC10712xR1[] interfaceC10712xR1Arr, AbstractC3283Ir2 abstractC3283Ir2, InterfaceC10877y8 interfaceC10877y8, C3144Hh1 c3144Hh1, C4701Xg1 c4701Xg1, C3381Jr2 c3381Jr2) {
        C4701Xg1 c4701Xg12;
        long l;
        C4507Vg1 c4507Vg1 = this.j;
        if (c4507Vg1 == null) {
            l = 1000000000000L;
            c4701Xg12 = c4701Xg1;
        } else {
            c4701Xg12 = c4701Xg1;
            l = (c4507Vg1.l() + this.j.f.e) - c4701Xg12.b;
        }
        C4507Vg1 c4507Vg12 = new C4507Vg1(interfaceC10712xR1Arr, l, abstractC3283Ir2, interfaceC10877y8, c3144Hh1, c4701Xg12, c3381Jr2);
        C4507Vg1 c4507Vg13 = this.j;
        if (c4507Vg13 != null) {
            c4507Vg13.w(c4507Vg12);
        } else {
            this.h = c4507Vg12;
            this.i = c4507Vg12;
        }
        this.l = null;
        this.j = c4507Vg12;
        this.k++;
        A();
        return c4507Vg12;
    }

    @InterfaceC11300zs1
    public final C4701Xg1 h(BD1 bd1) {
        return m(bd1.a, bd1.b, bd1.c, bd1.r);
    }

    @InterfaceC11300zs1
    public final C4701Xg1 i(AbstractC7373jp2 abstractC7373jp2, C4507Vg1 c4507Vg1, long j) {
        Object obj;
        long j2;
        C4701Xg1 c4701Xg1 = c4507Vg1.f;
        int i = abstractC7373jp2.i(abstractC7373jp2.g(c4701Xg1.a.a), this.a, this.b, this.f, this.g);
        if (i == -1) {
            return null;
        }
        int i2 = abstractC7373jp2.l(i, this.a, true).Z;
        Object g = C9542sf.g(this.a.Y);
        long j3 = c4701Xg1.a.d;
        long j4 = 0;
        if (abstractC7373jp2.u(i2, this.b).j1 == i) {
            Pair<Object, Long> r = abstractC7373jp2.r(this.b, this.a, i2, C10323vs.b, Math.max(0L, j));
            if (r == null) {
                return null;
            }
            Object obj2 = r.first;
            long longValue = ((Long) r.second).longValue();
            C4507Vg1 j5 = c4507Vg1.j();
            if (j5 != null && j5.b.equals(obj2)) {
                j3 = j5.f.a.d;
            } else {
                j3 = this.e;
                this.e = 1 + j3;
            }
            obj = obj2;
            j2 = longValue;
            j4 = -9223372036854775807L;
        } else {
            obj = g;
            j2 = 0;
        }
        InterfaceC7583kh1.b E = E(abstractC7373jp2, obj, j2, j3, this.b, this.a);
        if (j4 != C10323vs.b && c4701Xg1.c != C10323vs.b) {
            boolean u = u(c4701Xg1.a.a, abstractC7373jp2);
            if (E.c() && u) {
                j4 = c4701Xg1.c;
            } else if (u) {
                j2 = c4701Xg1.c;
            }
        }
        return m(abstractC7373jp2, E, j4, j2);
    }

    @InterfaceC11300zs1
    public final C4701Xg1 j(AbstractC7373jp2 abstractC7373jp2, C4507Vg1 c4507Vg1, long j) {
        C4701Xg1 c4701Xg1 = c4507Vg1.f;
        long l = (c4507Vg1.l() + c4701Xg1.e) - j;
        if (c4701Xg1.g) {
            return i(abstractC7373jp2, c4507Vg1, l);
        }
        return k(abstractC7373jp2, c4507Vg1, l);
    }

    @InterfaceC11300zs1
    public final C4701Xg1 k(AbstractC7373jp2 abstractC7373jp2, C4507Vg1 c4507Vg1, long j) {
        boolean z;
        C4701Xg1 c4701Xg1 = c4507Vg1.f;
        InterfaceC7583kh1.b bVar = c4701Xg1.a;
        abstractC7373jp2.m(bVar.a, this.a);
        if (bVar.c()) {
            int i = bVar.b;
            int d = this.a.d(i);
            if (d == -1) {
                return null;
            }
            int r = this.a.r(i, bVar.c);
            if (r < d) {
                return n(abstractC7373jp2, bVar.a, i, r, c4701Xg1.c, bVar.d);
            }
            long j2 = c4701Xg1.c;
            if (j2 == C10323vs.b) {
                AbstractC7373jp2.d dVar = this.b;
                AbstractC7373jp2.b bVar2 = this.a;
                Pair<Object, Long> r2 = abstractC7373jp2.r(dVar, bVar2, bVar2.Z, C10323vs.b, Math.max(0L, j));
                if (r2 == null) {
                    return null;
                }
                j2 = ((Long) r2.second).longValue();
            }
            return o(abstractC7373jp2, bVar.a, Math.max(p(abstractC7373jp2, bVar.a, bVar.b), j2), c4701Xg1.c, bVar.d);
        }
        int i2 = bVar.e;
        if (i2 != -1 && this.a.w(i2)) {
            return i(abstractC7373jp2, c4507Vg1, j);
        }
        int q = this.a.q(bVar.e);
        if (this.a.x(bVar.e) && this.a.l(bVar.e, q) == 3) {
            z = true;
        } else {
            z = false;
        }
        if (q != this.a.d(bVar.e) && !z) {
            return n(abstractC7373jp2, bVar.a, bVar.e, q, c4701Xg1.e, bVar.d);
        }
        return o(abstractC7373jp2, bVar.a, p(abstractC7373jp2, bVar.a, bVar.e), c4701Xg1.e, bVar.d);
    }

    @InterfaceC11300zs1
    public C4507Vg1 l() {
        return this.j;
    }

    @InterfaceC11300zs1
    public final C4701Xg1 m(AbstractC7373jp2 abstractC7373jp2, InterfaceC7583kh1.b bVar, long j, long j2) {
        abstractC7373jp2.m(bVar.a, this.a);
        if (bVar.c()) {
            return n(abstractC7373jp2, bVar.a, bVar.b, bVar.c, j, bVar.d);
        }
        return o(abstractC7373jp2, bVar.a, j2, j, bVar.d);
    }

    public final C4701Xg1 n(AbstractC7373jp2 abstractC7373jp2, Object obj, int i, int i2, long j, long j2) {
        long j3;
        InterfaceC7583kh1.b bVar = new InterfaceC7583kh1.b(obj, i, i2, j2);
        long f = abstractC7373jp2.m(bVar.a, this.a).f(bVar.b, bVar.c);
        if (i2 == this.a.q(i)) {
            j3 = this.a.k();
        } else {
            j3 = 0;
        }
        boolean x = this.a.x(bVar.b);
        if (f != C10323vs.b && j3 >= f) {
            j3 = Math.max(0L, f - 1);
        }
        return new C4701Xg1(bVar, j3, j, C10323vs.b, f, x, false, false, false);
    }

    public final C4701Xg1 o(AbstractC7373jp2 abstractC7373jp2, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        boolean z3;
        long j4;
        long j5;
        long j6;
        long j7 = j;
        abstractC7373jp2.m(obj, this.a);
        int h = this.a.h(j7);
        int i = 0;
        if (h != -1 && this.a.w(h)) {
            z = true;
        } else {
            z = false;
        }
        if (h == -1) {
            if (this.a.g() > 0) {
                AbstractC7373jp2.b bVar = this.a;
                if (bVar.x(bVar.u())) {
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            if (this.a.x(h)) {
                long j8 = this.a.j(h);
                AbstractC7373jp2.b bVar2 = this.a;
                if (j8 == bVar2.Y0 && bVar2.v(h)) {
                    z2 = true;
                    h = -1;
                }
            }
            z2 = false;
        }
        InterfaceC7583kh1.b bVar3 = new InterfaceC7583kh1.b(obj, j3, h);
        boolean v = v(bVar3);
        boolean x = x(abstractC7373jp2, bVar3);
        boolean w = w(abstractC7373jp2, bVar3, v);
        if (h != -1 && this.a.x(h) && !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h != -1 && !z) {
            j5 = this.a.j(h);
        } else if (z2) {
            j5 = this.a.Y0;
        } else {
            j4 = -9223372036854775807L;
            if (j4 == C10323vs.b && j4 != Long.MIN_VALUE) {
                j6 = j4;
            } else {
                j6 = this.a.Y0;
            }
            if (j6 != C10323vs.b && j7 >= j6) {
                if (!w || !z2) {
                    i = 1;
                }
                j7 = Math.max(0L, j6 - i);
            }
            return new C4701Xg1(bVar3, j7, j2, j4, j6, z3, v, x, w);
        }
        j4 = j5;
        if (j4 == C10323vs.b) {
        }
        j6 = this.a.Y0;
        if (j6 != C10323vs.b) {
            if (!w) {
            }
            i = 1;
            j7 = Math.max(0L, j6 - i);
        }
        return new C4701Xg1(bVar3, j7, j2, j4, j6, z3, v, x, w);
    }

    public final long p(AbstractC7373jp2 abstractC7373jp2, Object obj, int i) {
        abstractC7373jp2.m(obj, this.a);
        long j = this.a.j(i);
        if (j == Long.MIN_VALUE) {
            return this.a.Y0;
        }
        return j + this.a.n(i);
    }

    @InterfaceC11300zs1
    public C4701Xg1 q(long j, BD1 bd1) {
        C4507Vg1 c4507Vg1 = this.j;
        if (c4507Vg1 == null) {
            return h(bd1);
        }
        return j(bd1.a, c4507Vg1, j);
    }

    @InterfaceC11300zs1
    public C4507Vg1 r() {
        return this.h;
    }

    @InterfaceC11300zs1
    public C4507Vg1 s() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4701Xg1 t(AbstractC7373jp2 abstractC7373jp2, C4701Xg1 c4701Xg1) {
        long j;
        long p;
        long j2;
        boolean z;
        int i;
        InterfaceC7583kh1.b bVar = c4701Xg1.a;
        boolean v = v(bVar);
        boolean x = x(abstractC7373jp2, bVar);
        boolean w = w(abstractC7373jp2, bVar, v);
        abstractC7373jp2.m(c4701Xg1.a.a, this.a);
        if (!bVar.c() && (i = bVar.e) != -1) {
            j = this.a.j(i);
        } else {
            j = -9223372036854775807L;
        }
        if (bVar.c()) {
            p = this.a.f(bVar.b, bVar.c);
        } else if (j != C10323vs.b && j != Long.MIN_VALUE) {
            j2 = j;
            if (!bVar.c()) {
                z = this.a.x(bVar.b);
            } else {
                int i2 = bVar.e;
                if (i2 != -1 && this.a.x(i2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return new C4701Xg1(bVar, c4701Xg1.b, c4701Xg1.c, j, j2, z, v, x, w);
        } else {
            p = this.a.p();
        }
        j2 = p;
        if (!bVar.c()) {
        }
        return new C4701Xg1(bVar, c4701Xg1.b, c4701Xg1.c, j, j2, z, v, x, w);
    }

    public final boolean u(Object obj, AbstractC7373jp2 abstractC7373jp2) {
        int g = abstractC7373jp2.m(obj, this.a).g();
        int u = this.a.u();
        if (g > 0 && this.a.x(u)) {
            if (g > 1 || this.a.j(u) != Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean v(InterfaceC7583kh1.b bVar) {
        if (!bVar.c() && bVar.e == -1) {
            return true;
        }
        return false;
    }

    public final boolean w(AbstractC7373jp2 abstractC7373jp2, InterfaceC7583kh1.b bVar, boolean z) {
        int g = abstractC7373jp2.g(bVar.a);
        if (!abstractC7373jp2.u(abstractC7373jp2.k(g, this.a).Z, this.b).d1 && abstractC7373jp2.y(g, this.a, this.b, this.f, this.g) && z) {
            return true;
        }
        return false;
    }

    public final boolean x(AbstractC7373jp2 abstractC7373jp2, InterfaceC7583kh1.b bVar) {
        if (!v(bVar)) {
            return false;
        }
        int i = abstractC7373jp2.m(bVar.a, this.a).Z;
        if (abstractC7373jp2.u(i, this.b).k1 != abstractC7373jp2.g(bVar.a)) {
            return false;
        }
        return true;
    }

    public boolean y(InterfaceC4410Ug1 interfaceC4410Ug1) {
        C4507Vg1 c4507Vg1 = this.j;
        if (c4507Vg1 != null && c4507Vg1.a == interfaceC4410Ug1) {
            return true;
        }
        return false;
    }
}
