package o;

import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.Vg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4507Vg1 {
    public static final String p = "MediaPeriodHolder";
    public final InterfaceC4410Ug1 a;
    public final Object b;
    public final IX1[] c;
    public boolean d;
    public boolean e;
    public C4701Xg1 f;
    public boolean g;
    public final boolean[] h;
    public final InterfaceC10712xR1[] i;
    public final AbstractC3283Ir2 j;
    public final C3144Hh1 k;
    @InterfaceC11300zs1
    public C4507Vg1 l;
    public C10079ur2 m;
    public C3381Jr2 n;

    /* renamed from: o  reason: collision with root package name */
    public long f647o;

    public C4507Vg1(InterfaceC10712xR1[] interfaceC10712xR1Arr, long j, AbstractC3283Ir2 abstractC3283Ir2, InterfaceC10877y8 interfaceC10877y8, C3144Hh1 c3144Hh1, C4701Xg1 c4701Xg1, C3381Jr2 c3381Jr2) {
        this.i = interfaceC10712xR1Arr;
        this.f647o = j;
        this.j = abstractC3283Ir2;
        this.k = c3144Hh1;
        InterfaceC7583kh1.b bVar = c4701Xg1.a;
        this.b = bVar.a;
        this.f = c4701Xg1;
        this.m = C10079ur2.Z0;
        this.n = c3381Jr2;
        this.c = new IX1[interfaceC10712xR1Arr.length];
        this.h = new boolean[interfaceC10712xR1Arr.length];
        this.a = e(bVar, c3144Hh1, interfaceC10877y8, c4701Xg1.b, c4701Xg1.d);
    }

    public static InterfaceC4410Ug1 e(InterfaceC7583kh1.b bVar, C3144Hh1 c3144Hh1, InterfaceC10877y8 interfaceC10877y8, long j, long j2) {
        InterfaceC4410Ug1 i = c3144Hh1.i(bVar, interfaceC10877y8, j);
        if (j2 != C10323vs.b) {
            return new JD(i, true, 0L, j2);
        }
        return i;
    }

    public static void u(C3144Hh1 c3144Hh1, InterfaceC4410Ug1 interfaceC4410Ug1) {
        try {
            if (interfaceC4410Ug1 instanceof JD) {
                c3144Hh1.B(((JD) interfaceC4410Ug1).X);
            } else {
                c3144Hh1.B(interfaceC4410Ug1);
            }
        } catch (RuntimeException e) {
            I31.e(p, "Period release failed.", e);
        }
    }

    public void A() {
        InterfaceC4410Ug1 interfaceC4410Ug1 = this.a;
        if (interfaceC4410Ug1 instanceof JD) {
            long j = this.f.d;
            if (j == C10323vs.b) {
                j = Long.MIN_VALUE;
            }
            ((JD) interfaceC4410Ug1).w(0L, j);
        }
    }

    public long a(C3381Jr2 c3381Jr2, long j, boolean z) {
        return b(c3381Jr2, j, z, new boolean[this.i.length]);
    }

    public long b(C3381Jr2 c3381Jr2, long j, boolean z, boolean[] zArr) {
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= c3381Jr2.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !c3381Jr2.b(this.n, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        g(this.c);
        f();
        this.n = c3381Jr2;
        h();
        long s = this.a.s(c3381Jr2.c, this.h, this.c, zArr, j);
        c(this.c);
        this.e = false;
        int i2 = 0;
        while (true) {
            IX1[] ix1Arr = this.c;
            if (i2 < ix1Arr.length) {
                if (ix1Arr[i2] != null) {
                    C9542sf.i(c3381Jr2.c(i2));
                    if (this.i[i2].d() != -2) {
                        this.e = true;
                    }
                } else {
                    if (c3381Jr2.c[i2] == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C9542sf.i(z2);
                }
                i2++;
            } else {
                return s;
            }
        }
    }

    public final void c(IX1[] ix1Arr) {
        int i = 0;
        while (true) {
            InterfaceC10712xR1[] interfaceC10712xR1Arr = this.i;
            if (i < interfaceC10712xR1Arr.length) {
                if (interfaceC10712xR1Arr[i].d() == -2 && this.n.c(i)) {
                    ix1Arr[i] = new C7801lb0();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void d(long j) {
        C9542sf.i(r());
        this.a.d(y(j));
    }

    public final void f() {
        if (r()) {
            int i = 0;
            while (true) {
                C3381Jr2 c3381Jr2 = this.n;
                if (i < c3381Jr2.a) {
                    boolean c = c3381Jr2.c(i);
                    InterfaceC6859hi0 interfaceC6859hi0 = this.n.c[i];
                    if (c && interfaceC6859hi0 != null) {
                        interfaceC6859hi0.b();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(IX1[] ix1Arr) {
        int i = 0;
        while (true) {
            InterfaceC10712xR1[] interfaceC10712xR1Arr = this.i;
            if (i < interfaceC10712xR1Arr.length) {
                if (interfaceC10712xR1Arr[i].d() == -2) {
                    ix1Arr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void h() {
        if (r()) {
            int i = 0;
            while (true) {
                C3381Jr2 c3381Jr2 = this.n;
                if (i < c3381Jr2.a) {
                    boolean c = c3381Jr2.c(i);
                    InterfaceC6859hi0 interfaceC6859hi0 = this.n.c[i];
                    if (c && interfaceC6859hi0 != null) {
                        interfaceC6859hi0.q();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public long i() {
        long j;
        if (!this.d) {
            return this.f.b;
        }
        if (this.e) {
            j = this.a.f();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f.e;
        }
        return j;
    }

    @InterfaceC11300zs1
    public C4507Vg1 j() {
        return this.l;
    }

    public long k() {
        if (!this.d) {
            return 0L;
        }
        return this.a.c();
    }

    public long l() {
        return this.f647o;
    }

    public long m() {
        return this.f.b + this.f647o;
    }

    public C10079ur2 n() {
        return this.m;
    }

    public C3381Jr2 o() {
        return this.n;
    }

    public void p(float f, AbstractC7373jp2 abstractC7373jp2) throws C3824Og0 {
        this.d = true;
        this.m = this.a.q();
        C3381Jr2 v = v(f, abstractC7373jp2);
        C4701Xg1 c4701Xg1 = this.f;
        long j = c4701Xg1.b;
        long j2 = c4701Xg1.e;
        if (j2 != C10323vs.b && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a = a(v, j, false);
        long j3 = this.f647o;
        C4701Xg1 c4701Xg12 = this.f;
        this.f647o = j3 + (c4701Xg12.b - a);
        this.f = c4701Xg12.b(a);
    }

    public boolean q() {
        if (this.d) {
            if (!this.e || this.a.f() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r() {
        if (this.l == null) {
            return true;
        }
        return false;
    }

    public void s(long j) {
        C9542sf.i(r());
        if (this.d) {
            this.a.g(y(j));
        }
    }

    public void t() {
        f();
        u(this.k, this.a);
    }

    public C3381Jr2 v(float f, AbstractC7373jp2 abstractC7373jp2) throws C3824Og0 {
        InterfaceC6859hi0[] interfaceC6859hi0Arr;
        C3381Jr2 k = this.j.k(this.i, n(), this.f.a, abstractC7373jp2);
        for (InterfaceC6859hi0 interfaceC6859hi0 : k.c) {
            if (interfaceC6859hi0 != null) {
                interfaceC6859hi0.i(f);
            }
        }
        return k;
    }

    public void w(@InterfaceC11300zs1 C4507Vg1 c4507Vg1) {
        if (c4507Vg1 == this.l) {
            return;
        }
        f();
        this.l = c4507Vg1;
        h();
    }

    public void x(long j) {
        this.f647o = j;
    }

    public long y(long j) {
        return j - l();
    }

    public long z(long j) {
        return j + l();
    }
}
