package o;

import java.util.Collections;
import o.C10833xx0;
import o.C9337ro1;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class HF0 implements InterfaceC8545oa0 {

    /* renamed from: o  reason: collision with root package name */
    public static final String f479o = "H265Reader";
    public static final int p = 9;
    public static final int q = 16;
    public static final int r = 21;
    public static final int s = 32;
    public static final int t = 33;
    public static final int u = 34;
    public static final int v = 35;
    public static final int w = 39;
    public static final int x = 40;
    public final WZ1 a;
    public String b;
    public InterfaceC10568wr2 c;
    public a d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final C9088qo1 g = new C9088qo1(32, 128);
    public final C9088qo1 h = new C9088qo1(33, 128);
    public final C9088qo1 i = new C9088qo1(34, 128);
    public final C9088qo1 j = new C9088qo1(39, 128);
    public final C9088qo1 k = new C9088qo1(40, 128);
    public long m = C10323vs.b;
    public final C3012Fy1 n = new C3012Fy1();

    /* loaded from: classes2.dex */
    public static final class a {
        public static final int n = 2;
        public final InterfaceC10568wr2 a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(InterfaceC10568wr2 interfaceC10568wr2) {
            this.a = interfaceC10568wr2;
        }

        public static boolean b(int i) {
            if ((32 <= i && i <= 35) || i == 39) {
                return true;
            }
            return false;
        }

        public static boolean c(int i) {
            if (i >= 32 && i != 40) {
                return false;
            }
            return true;
        }

        public void a(long j, int i, boolean z) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (!this.h && !this.g) {
            } else {
                if (z && this.i) {
                    d(i + ((int) (j - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        public final void d(int i) {
            long j = this.l;
            if (j == C10323vs.b) {
                return;
            }
            boolean z = this.m;
            this.a.b(j, z ? 1 : 0, (int) (this.b - this.k), i, null);
        }

        public void e(byte[] bArr, int i, int i2) {
            boolean z;
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    if ((bArr[i4] & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.g = z;
                    this.f = false;
                    return;
                }
                this.d = i3 + (i2 - i);
            }
        }

        public void f() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void g(long j, int i, int i2, long j2, boolean z) {
            boolean z2;
            boolean z3 = false;
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.b = j;
            if (!c(i2)) {
                if (this.i && !this.j) {
                    if (z) {
                        d(i);
                    }
                    this.i = false;
                }
                if (b(i2)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            if (i2 >= 16 && i2 <= 21) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.c = z2;
            if (z2 || i2 <= 9) {
                z3 = true;
            }
            this.f = z3;
        }
    }

    public HF0(WZ1 wz1) {
        this.a = wz1;
    }

    @InterfaceC8557od0({"output", "sampleReader"})
    private void f() {
        C9542sf.k(this.c);
        TD2.o(this.d);
    }

    @HS1({"output", "sampleReader"})
    private void g(long j, int i, int i2, long j2) {
        this.d.a(j, i, this.e);
        if (!this.e) {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.a(i(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i2)) {
            C9088qo1 c9088qo1 = this.j;
            this.n.W(this.j.d, C9337ro1.q(c9088qo1.d, c9088qo1.e));
            this.n.Z(5);
            this.a.a(j2, this.n);
        }
        if (this.k.b(i2)) {
            C9088qo1 c9088qo12 = this.k;
            this.n.W(this.k.d, C9337ro1.q(c9088qo12.d, c9088qo12.e));
            this.n.Z(5);
            this.a.a(j2, this.n);
        }
    }

    @HS1({"sampleReader"})
    private void h(byte[] bArr, int i, int i2) {
        this.d.e(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public static C10833xx0 i(@InterfaceC11300zs1 String str, C9088qo1 c9088qo1, C9088qo1 c9088qo12, C9088qo1 c9088qo13) {
        int i = c9088qo1.e;
        byte[] bArr = new byte[c9088qo12.e + i + c9088qo13.e];
        System.arraycopy(c9088qo1.d, 0, bArr, 0, i);
        System.arraycopy(c9088qo12.d, 0, bArr, c9088qo1.e, c9088qo12.e);
        System.arraycopy(c9088qo13.d, 0, bArr, c9088qo1.e + c9088qo12.e, c9088qo13.e);
        C9337ro1.a h = C9337ro1.h(c9088qo12.d, 3, c9088qo12.e);
        return new C10833xx0.b().U(str).g0(C4128Rj1.k).K(JE.c(h.a, h.b, h.c, h.d, h.h, h.i)).n0(h.k).S(h.l).c0(h.m).V(Collections.singletonList(bArr)).G();
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        int i;
        f();
        while (c3012Fy1.a() > 0) {
            int f = c3012Fy1.f();
            int g = c3012Fy1.g();
            byte[] e = c3012Fy1.e();
            this.l += c3012Fy1.a();
            this.c.e(c3012Fy1, c3012Fy1.a());
            while (f < g) {
                int c = C9337ro1.c(e, f, g, this.f);
                if (c == g) {
                    h(e, f, g);
                    return;
                }
                int e2 = C9337ro1.e(e, c);
                int i2 = c - f;
                if (i2 > 0) {
                    h(e, f, c);
                }
                int i3 = g - c;
                long j = this.l - i3;
                if (i2 < 0) {
                    i = -i2;
                } else {
                    i = 0;
                }
                g(j, i3, i, this.m);
                j(j, i3, e2, this.m);
                f = c + 3;
            }
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.l = 0L;
        this.m = C10323vs.b;
        C9337ro1.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        a aVar = this.d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.b = eVar.b();
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(eVar.c(), 2);
        this.c = b;
        this.d = new a(b);
        this.a.b(interfaceC4518Vj0, eVar);
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if (j != C10323vs.b) {
            this.m = j;
        }
    }

    @HS1({"sampleReader"})
    public final void j(long j, int i, int i2, long j2) {
        this.d.g(j, i, i2, j2, this.e);
        if (!this.e) {
            this.g.e(i2);
            this.h.e(i2);
            this.i.e(i2);
        }
        this.j.e(i2);
        this.k.e(i2);
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
