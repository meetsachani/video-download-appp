package o;

import o.C10833xx0;
import o.M3;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class L3 implements InterfaceC8545oa0 {
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f526o = 1;
    public static final int p = 2;
    public final C2903Ey1 a;
    public final C3012Fy1 b;
    @InterfaceC11300zs1
    public final String c;
    public String d;
    public InterfaceC10568wr2 e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public C10833xx0 k;
    public int l;
    public long m;

    public L3() {
        this(null);
    }

    private boolean f(C3012Fy1 c3012Fy1, byte[] bArr, int i) {
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
    private void g() {
        this.a.q(0);
        M3.b d = M3.d(this.a);
        C10833xx0 c10833xx0 = this.k;
        if (c10833xx0 == null || d.c != c10833xx0.t1 || d.b != c10833xx0.u1 || !C4128Rj1.T.equals(c10833xx0.g1)) {
            C10833xx0 G = new C10833xx0.b().U(this.d).g0(C4128Rj1.T).J(d.c).h0(d.b).X(this.c).G();
            this.k = G;
            this.e.a(G);
        }
        this.l = d.d;
        this.j = (d.e * 1000000) / this.k.u1;
    }

    private boolean h(C3012Fy1 c3012Fy1) {
        boolean z;
        int L;
        boolean z2;
        while (true) {
            z = false;
            if (c3012Fy1.a() <= 0) {
                return false;
            }
            if (!this.h) {
                if (c3012Fy1.L() == 172) {
                    z = true;
                }
                this.h = z;
            } else {
                L = c3012Fy1.L();
                if (L == 172) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.h = z2;
                if (L == 64 || L == 65) {
                    break;
                }
            }
        }
        if (L == 65) {
            z = true;
        }
        this.i = z;
        return true;
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        int i;
        C9542sf.k(this.e);
        while (c3012Fy1.a() > 0) {
            int i2 = this.f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(c3012Fy1.a(), this.l - this.g);
                        this.e.e(c3012Fy1, min);
                        int i3 = this.g + min;
                        this.g = i3;
                        int i4 = this.l;
                        if (i3 == i4) {
                            long j = this.m;
                            if (j != C10323vs.b) {
                                this.e.b(j, 1, i4, 0, null);
                                this.m += this.j;
                            }
                            this.f = 0;
                        }
                    }
                } else if (f(c3012Fy1, this.b.e(), 16)) {
                    g();
                    this.b.Y(0);
                    this.e.e(this.b, 16);
                    this.f = 2;
                }
            } else if (h(c3012Fy1)) {
                this.f = 1;
                this.b.e()[0] = -84;
                byte[] e = this.b.e();
                if (this.i) {
                    i = 65;
                } else {
                    i = 64;
                }
                e[1] = (byte) i;
                this.g = 2;
            }
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = C10323vs.b;
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
            this.m = j;
        }
    }

    public L3(@InterfaceC11300zs1 String str) {
        C2903Ey1 c2903Ey1 = new C2903Ey1(new byte[16]);
        this.a = c2903Ey1;
        this.b = new C3012Fy1(c2903Ey1.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = C10323vs.b;
        this.c = str;
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
