package o;

import java.util.Arrays;
import java.util.Collections;
import o.C10833xx0;
import o.G;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class M7 implements InterfaceC8545oa0 {
    public static final int A = 4;
    public static final int B = 5;
    public static final int C = 2;
    public static final int D = 8;
    public static final int E = 256;
    public static final int F = 512;
    public static final int G = 768;
    public static final int H = 1024;
    public static final int I = 10;
    public static final int J = 6;
    public static final byte[] K = {73, 68, 51};
    public static final int L = -1;
    public static final String v = "AdtsReader";
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 3;
    public final boolean a;
    public final C2903Ey1 b;
    public final C3012Fy1 c;
    @InterfaceC11300zs1
    public final String d;
    public String e;
    public InterfaceC10568wr2 f;
    public InterfaceC10568wr2 g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f540o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public InterfaceC10568wr2 t;
    public long u;

    public M7(boolean z2) {
        this(z2, null);
    }

    private boolean i(C3012Fy1 c3012Fy1, byte[] bArr, int i) {
        int min = Math.min(c3012Fy1.a(), i - this.i);
        c3012Fy1.n(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public static boolean m(int i) {
        if ((i & 65526) == 65520) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) throws C3989Py1 {
        int i;
        f();
        while (c3012Fy1.a() > 0) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                p(c3012Fy1);
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.k) {
                                i = 7;
                            } else {
                                i = 5;
                            }
                            if (i(c3012Fy1, this.b.a, i)) {
                                n();
                            }
                        }
                    } else if (i(c3012Fy1, this.c.e(), 10)) {
                        o();
                    }
                } else {
                    g(c3012Fy1);
                }
            } else {
                j(c3012Fy1);
            }
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.s = C10323vs.b;
        q();
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.e = eVar.b();
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(eVar.c(), 1);
        this.f = b;
        this.t = b;
        if (this.a) {
            eVar.a();
            InterfaceC10568wr2 b2 = interfaceC4518Vj0.b(eVar.c(), 5);
            this.g = b2;
            b2.a(new C10833xx0.b().U(eVar.b()).g0(C4128Rj1.w0).G());
            return;
        }
        this.g = new W70();
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if (j != C10323vs.b) {
            this.s = j;
        }
    }

    @InterfaceC8557od0({"output", "currentOutput", "id3Output"})
    public final void f() {
        C9542sf.g(this.f);
        TD2.o(this.t);
        TD2.o(this.g);
    }

    public final void g(C3012Fy1 c3012Fy1) {
        if (c3012Fy1.a() == 0) {
            return;
        }
        this.b.a[0] = c3012Fy1.e()[c3012Fy1.f()];
        this.b.q(2);
        int h = this.b.h(4);
        int i = this.n;
        if (i != -1 && h != i) {
            q();
            return;
        }
        if (!this.l) {
            this.l = true;
            this.m = this.f540o;
            this.n = h;
        }
        t();
    }

    public final boolean h(C3012Fy1 c3012Fy1, int i) {
        c3012Fy1.Y(i + 1);
        if (!w(c3012Fy1, this.b.a, 1)) {
            return false;
        }
        this.b.q(4);
        int h = this.b.h(1);
        int i2 = this.m;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.n != -1) {
            if (!w(c3012Fy1, this.b.a, 1)) {
                return true;
            }
            this.b.q(2);
            if (this.b.h(4) != this.n) {
                return false;
            }
            c3012Fy1.Y(i + 2);
        }
        if (!w(c3012Fy1, this.b.a, 4)) {
            return true;
        }
        this.b.q(14);
        int h2 = this.b.h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] e = c3012Fy1.e();
        int g = c3012Fy1.g();
        int i3 = i + h2;
        if (i3 >= g) {
            return true;
        }
        byte b = e[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == g) {
                return true;
            }
            if (l((byte) -1, e[i4]) && ((e[i4] & 8) >> 3) == h) {
                return true;
            }
            return false;
        } else if (b != 73) {
            return false;
        } else {
            int i5 = i3 + 1;
            if (i5 == g) {
                return true;
            }
            if (e[i5] != 68) {
                return false;
            }
            int i6 = i3 + 2;
            if (i6 == g || e[i6] == 51) {
                return true;
            }
            return false;
        }
    }

    public final void j(C3012Fy1 c3012Fy1) {
        byte[] e = c3012Fy1.e();
        int f = c3012Fy1.f();
        int g = c3012Fy1.g();
        while (f < g) {
            int i = f + 1;
            byte b = e[f];
            int i2 = b & 255;
            if (this.j == 512 && l((byte) -1, (byte) i2) && (this.l || h(c3012Fy1, f - 1))) {
                this.f540o = (b & 8) >> 3;
                boolean z2 = true;
                if ((b & 1) != 0) {
                    z2 = false;
                }
                this.k = z2;
                if (!this.l) {
                    r();
                } else {
                    t();
                }
                c3012Fy1.Y(i);
                return;
            }
            int i3 = this.j;
            int i4 = i2 | i3;
            if (i4 != 329) {
                if (i4 != 511) {
                    if (i4 != 836) {
                        if (i4 != 1075) {
                            if (i3 != 256) {
                                this.j = 256;
                            }
                        } else {
                            u();
                            c3012Fy1.Y(i);
                            return;
                        }
                    } else {
                        this.j = 1024;
                    }
                } else {
                    this.j = 512;
                }
            } else {
                this.j = 768;
            }
            f = i;
        }
        c3012Fy1.Y(f);
    }

    public long k() {
        return this.q;
    }

    public final boolean l(byte b, byte b2) {
        return m(((b & 255) << 8) | (b2 & 255));
    }

    @HS1({"output"})
    public final void n() throws C3989Py1 {
        this.b.q(0);
        if (!this.p) {
            int i = 2;
            int h = this.b.h(2) + 1;
            if (h != 2) {
                I31.n(v, "Detected audio object type: " + h + ", but assuming AAC LC.");
            } else {
                i = h;
            }
            this.b.s(5);
            byte[] b = G.b(i, this.n, this.b.h(3));
            G.c f = G.f(b);
            C10833xx0 G2 = new C10833xx0.b().U(this.e).g0("audio/mp4a-latm").K(f.c).J(f.b).h0(f.a).V(Collections.singletonList(b)).X(this.d).G();
            this.q = 1024000000 / G2.u1;
            this.f.a(G2);
            this.p = true;
        } else {
            this.b.s(10);
        }
        this.b.s(4);
        int h2 = this.b.h(13);
        int i2 = h2 - 7;
        if (this.k) {
            i2 = h2 - 9;
        }
        v(this.f, this.q, 0, i2);
    }

    @HS1({"id3Output"})
    public final void o() {
        this.g.e(this.c, 10);
        this.c.Y(6);
        v(this.g, 0L, 10, this.c.K() + 10);
    }

    @HS1({"currentOutput"})
    public final void p(C3012Fy1 c3012Fy1) {
        int min = Math.min(c3012Fy1.a(), this.r - this.i);
        this.t.e(c3012Fy1, min);
        int i = this.i + min;
        this.i = i;
        int i2 = this.r;
        if (i == i2) {
            long j = this.s;
            if (j != C10323vs.b) {
                this.t.b(j, 1, i2, 0, null);
                this.s += this.u;
            }
            s();
        }
    }

    public final void q() {
        this.l = false;
        s();
    }

    public final void r() {
        this.h = 1;
        this.i = 0;
    }

    public final void s() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    public final void t() {
        this.h = 3;
        this.i = 0;
    }

    public final void u() {
        this.h = 2;
        this.i = K.length;
        this.r = 0;
        this.c.Y(0);
    }

    public final void v(InterfaceC10568wr2 interfaceC10568wr2, long j, int i, int i2) {
        this.h = 4;
        this.i = i;
        this.t = interfaceC10568wr2;
        this.u = j;
        this.r = i2;
    }

    public final boolean w(C3012Fy1 c3012Fy1, byte[] bArr, int i) {
        if (c3012Fy1.a() < i) {
            return false;
        }
        c3012Fy1.n(bArr, 0, i);
        return true;
    }

    public M7(boolean z2, @InterfaceC11300zs1 String str) {
        this.b = new C2903Ey1(new byte[7]);
        this.c = new C3012Fy1(Arrays.copyOf(K, 10));
        s();
        this.m = -1;
        this.n = -1;
        this.q = C10323vs.b;
        this.s = C10323vs.b;
        this.a = z2;
        this.d = str;
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
