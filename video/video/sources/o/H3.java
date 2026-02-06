package o;

import o.C10833xx0;
import o.I3;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class H3 implements InterfaceC8545oa0 {
    public static final int m = 0;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f477o = 2;
    public static final int p = 128;
    public final C2903Ey1 a;
    public final C3012Fy1 b;
    @InterfaceC11300zs1
    public final String c;
    public String d;
    public InterfaceC10568wr2 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public C10833xx0 j;
    public int k;
    public long l;

    public H3() {
        this(null);
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        C9542sf.k(this.e);
        while (c3012Fy1.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c3012Fy1.a(), this.k - this.g);
                        this.e.e(c3012Fy1, min);
                        int i2 = this.g + min;
                        this.g = i2;
                        int i3 = this.k;
                        if (i2 == i3) {
                            long j = this.l;
                            if (j != C10323vs.b) {
                                this.e.b(j, 1, i3, 0, null);
                                this.l += this.i;
                            }
                            this.f = 0;
                        }
                    }
                } else if (f(c3012Fy1, this.b.e(), 128)) {
                    g();
                    this.b.Y(0);
                    this.e.e(this.b, 128);
                    this.f = 2;
                }
            } else if (h(c3012Fy1)) {
                this.f = 1;
                this.b.e()[0] = C8077mf.m;
                this.b.e()[1] = 119;
                this.g = 2;
            }
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = C10323vs.b;
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.d = eVar.b();
        this.e = interfaceC4518Vj0.b(eVar.c(), 1);
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if (j != C10323vs.b) {
            this.l = j;
        }
    }

    public final boolean f(C3012Fy1 c3012Fy1, byte[] bArr, int i) {
        int min = Math.min(c3012Fy1.a(), i - this.g);
        c3012Fy1.n(bArr, this.g, min);
        int i2 = this.g + min;
        this.g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @HS1({"output"})
    public final void g() {
        this.a.q(0);
        I3.b f = I3.f(this.a);
        C10833xx0 c10833xx0 = this.j;
        if (c10833xx0 == null || f.d != c10833xx0.t1 || f.c != c10833xx0.u1 || !TD2.g(f.a, c10833xx0.g1)) {
            C10833xx0.b b0 = new C10833xx0.b().U(this.d).g0(f.a).J(f.d).h0(f.c).X(this.c).b0(f.g);
            if (C4128Rj1.Q.equals(f.a)) {
                b0.I(f.g);
            }
            C10833xx0 G = b0.G();
            this.j = G;
            this.e.a(G);
        }
        this.k = f.e;
        this.i = (f.f * 1000000) / this.j.u1;
    }

    public final boolean h(C3012Fy1 c3012Fy1) {
        while (true) {
            boolean z = false;
            if (c3012Fy1.a() <= 0) {
                return false;
            }
            if (!this.h) {
                if (c3012Fy1.L() == 11) {
                    z = true;
                }
                this.h = z;
            } else {
                int L = c3012Fy1.L();
                if (L == 119) {
                    this.h = false;
                    return true;
                }
                if (L == 11) {
                    z = true;
                }
                this.h = z;
            }
        }
    }

    public H3(@InterfaceC11300zs1 String str) {
        C2903Ey1 c2903Ey1 = new C2903Ey1(new byte[128]);
        this.a = c2903Ey1;
        this.b = new C3012Fy1(c2903Ey1.a);
        this.f = 0;
        this.l = C10323vs.b;
        this.c = str;
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
