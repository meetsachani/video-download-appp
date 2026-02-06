package o;

import java.util.Collections;
import o.C10833xx0;
import o.G;
import o.Yu2;

@Deprecated
/* renamed from: o.sY0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9517sY0 implements InterfaceC8545oa0 {
    public static final int A = 86;
    public static final int B = 224;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 1024;
    @InterfaceC11300zs1
    public final String a;
    public final C3012Fy1 b;
    public final C2903Ey1 c;
    public InterfaceC10568wr2 d;
    public String e;
    public C10833xx0 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f861o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    @InterfaceC11300zs1
    public String u;

    public C9517sY0(@InterfaceC11300zs1 String str) {
        this.a = str;
        C3012Fy1 c3012Fy1 = new C3012Fy1(1024);
        this.b = c3012Fy1;
        this.c = new C2903Ey1(c3012Fy1.e());
        this.k = C10323vs.b;
    }

    public static long f(C2903Ey1 c2903Ey1) {
        return c2903Ey1.h((c2903Ey1.h(2) + 1) * 8);
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) throws C3989Py1 {
        C9542sf.k(this.d);
        while (c3012Fy1.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            int min = Math.min(c3012Fy1.a(), this.i - this.h);
                            c3012Fy1.n(this.c.a, this.h, min);
                            int i2 = this.h + min;
                            this.h = i2;
                            if (i2 == this.i) {
                                this.c.q(0);
                                g(this.c);
                                this.g = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int L = ((this.j & (-225)) << 8) | c3012Fy1.L();
                        this.i = L;
                        if (L > this.b.e().length) {
                            m(this.i);
                        }
                        this.h = 0;
                        this.g = 3;
                    }
                } else {
                    int L2 = c3012Fy1.L();
                    if ((L2 & 224) == 224) {
                        this.j = L2;
                        this.g = 2;
                    } else if (L2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (c3012Fy1.L() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.g = 0;
        this.k = C10323vs.b;
        this.l = false;
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.d = interfaceC4518Vj0.b(eVar.c(), 1);
        this.e = eVar.b();
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if (j != C10323vs.b) {
            this.k = j;
        }
    }

    @HS1({"output"})
    public final void g(C2903Ey1 c2903Ey1) throws C3989Py1 {
        if (!c2903Ey1.g()) {
            this.l = true;
            l(c2903Ey1);
        } else if (!this.l) {
            return;
        }
        if (this.m == 0) {
            if (this.n == 0) {
                k(c2903Ey1, j(c2903Ey1));
                if (this.p) {
                    c2903Ey1.s((int) this.q);
                    return;
                }
                return;
            }
            throw C3989Py1.a(null, null);
        }
        throw C3989Py1.a(null, null);
    }

    public final int h(C2903Ey1 c2903Ey1) throws C3989Py1 {
        int b = c2903Ey1.b();
        G.c e = G.e(c2903Ey1, true);
        this.u = e.c;
        this.r = e.a;
        this.t = e.b;
        return b - c2903Ey1.b();
    }

    public final void i(C2903Ey1 c2903Ey1) {
        int h = c2903Ey1.h(3);
        this.f861o = h;
        if (h != 0) {
            if (h != 1) {
                if (h != 3 && h != 4 && h != 5) {
                    if (h != 6 && h != 7) {
                        throw new IllegalStateException();
                    }
                    c2903Ey1.s(1);
                    return;
                }
                c2903Ey1.s(6);
                return;
            }
            c2903Ey1.s(9);
            return;
        }
        c2903Ey1.s(8);
    }

    public final int j(C2903Ey1 c2903Ey1) throws C3989Py1 {
        int h;
        if (this.f861o == 0) {
            int i = 0;
            do {
                h = c2903Ey1.h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw C3989Py1.a(null, null);
    }

    @HS1({"output"})
    public final void k(C2903Ey1 c2903Ey1, int i) {
        int e = c2903Ey1.e();
        if ((e & 7) == 0) {
            this.b.Y(e >> 3);
        } else {
            c2903Ey1.i(this.b.e(), 0, i * 8);
            this.b.Y(0);
        }
        this.d.e(this.b, i);
        long j = this.k;
        if (j != C10323vs.b) {
            this.d.b(j, 1, i, 0, null);
            this.k += this.s;
        }
    }

    @HS1({"output"})
    public final void l(C2903Ey1 c2903Ey1) throws C3989Py1 {
        int i;
        boolean g;
        int h = c2903Ey1.h(1);
        if (h == 1) {
            i = c2903Ey1.h(1);
        } else {
            i = 0;
        }
        this.m = i;
        if (i == 0) {
            if (h == 1) {
                f(c2903Ey1);
            }
            if (c2903Ey1.g()) {
                this.n = c2903Ey1.h(6);
                int h2 = c2903Ey1.h(4);
                int h3 = c2903Ey1.h(3);
                if (h2 == 0 && h3 == 0) {
                    if (h == 0) {
                        int e = c2903Ey1.e();
                        int h4 = h(c2903Ey1);
                        c2903Ey1.q(e);
                        byte[] bArr = new byte[(h4 + 7) / 8];
                        c2903Ey1.i(bArr, 0, h4);
                        C10833xx0 G = new C10833xx0.b().U(this.e).g0("audio/mp4a-latm").K(this.u).J(this.t).h0(this.r).V(Collections.singletonList(bArr)).X(this.a).G();
                        if (!G.equals(this.f)) {
                            this.f = G;
                            this.s = 1024000000 / G.u1;
                            this.d.a(G);
                        }
                    } else {
                        c2903Ey1.s(((int) f(c2903Ey1)) - h(c2903Ey1));
                    }
                    i(c2903Ey1);
                    boolean g2 = c2903Ey1.g();
                    this.p = g2;
                    this.q = 0L;
                    if (g2) {
                        if (h == 1) {
                            this.q = f(c2903Ey1);
                        } else {
                            do {
                                g = c2903Ey1.g();
                                this.q = (this.q << 8) + c2903Ey1.h(8);
                            } while (g);
                        }
                    }
                    if (c2903Ey1.g()) {
                        c2903Ey1.s(8);
                        return;
                    }
                    return;
                }
                throw C3989Py1.a(null, null);
            }
            throw C3989Py1.a(null, null);
        }
        throw C3989Py1.a(null, null);
    }

    public final void m(int i) {
        this.b.U(i);
        this.c.o(this.b.e());
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
