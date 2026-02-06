package o;

import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class PC1 implements Yu2 {
    public static final String p = "PesReader";
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 3;
    public static final int u = 9;
    public static final int v = 10;
    public static final int w = 10;
    public final InterfaceC8545oa0 d;
    public final C2903Ey1 e = new C2903Ey1(new byte[10]);
    public int f = 0;
    public int g;
    public C10071up2 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public long f581o;

    public PC1(InterfaceC8545oa0 interfaceC8545oa0) {
        this.d = interfaceC8545oa0;
    }

    @Override // o.Yu2
    public final void a(C3012Fy1 c3012Fy1, int i) throws C3989Py1 {
        C9542sf.k(this.h);
        if ((i & 1) != 0) {
            int i2 = this.f;
            if (i2 != 0 && i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.m != -1) {
                            I31.n(p, "Unexpected start indicator: expected " + this.m + " more bytes");
                        }
                        this.d.c();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    I31.n(p, "Unexpected start indicator reading extended header");
                }
            }
            g(1);
        }
        while (c3012Fy1.a() > 0) {
            int i3 = this.f;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            int a = c3012Fy1.a();
                            int i5 = this.m;
                            if (i5 != -1) {
                                i4 = a - i5;
                            }
                            if (i4 > 0) {
                                a -= i4;
                                c3012Fy1.X(c3012Fy1.f() + a);
                            }
                            this.d.a(c3012Fy1);
                            int i6 = this.m;
                            if (i6 != -1) {
                                int i7 = i6 - a;
                                this.m = i7;
                                if (i7 == 0) {
                                    this.d.c();
                                    g(1);
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(c3012Fy1, this.e.a, Math.min(10, this.l)) && d(c3012Fy1, null, this.l)) {
                            f();
                            if (this.n) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.d.e(this.f581o, i);
                            g(3);
                        }
                    }
                } else if (d(c3012Fy1, this.e.a, 9)) {
                    if (e()) {
                        i4 = 2;
                    }
                    g(i4);
                }
            } else {
                c3012Fy1.Z(c3012Fy1.a());
            }
        }
    }

    @Override // o.Yu2
    public final void b() {
        this.f = 0;
        this.g = 0;
        this.k = false;
        this.d.b();
    }

    @Override // o.Yu2
    public void c(C10071up2 c10071up2, InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        this.h = c10071up2;
        this.d.d(interfaceC4518Vj0, eVar);
    }

    public final boolean d(C3012Fy1 c3012Fy1, @InterfaceC11300zs1 byte[] bArr, int i) {
        int min = Math.min(c3012Fy1.a(), i - this.g);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c3012Fy1.Z(min);
        } else {
            c3012Fy1.n(bArr, this.g, min);
        }
        int i2 = this.g + min;
        this.g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        this.e.q(0);
        int h = this.e.h(24);
        if (h != 1) {
            I31.n(p, "Unexpected start code prefix: " + h);
            this.m = -1;
            return false;
        }
        this.e.s(8);
        int h2 = this.e.h(16);
        this.e.s(5);
        this.n = this.e.g();
        this.e.s(2);
        this.i = this.e.g();
        this.j = this.e.g();
        this.e.s(6);
        int h3 = this.e.h(8);
        this.l = h3;
        if (h2 == 0) {
            this.m = -1;
        } else {
            int i = (h2 - 3) - h3;
            this.m = i;
            if (i < 0) {
                I31.n(p, "Found negative packet payload size: " + this.m);
                this.m = -1;
            }
        }
        return true;
    }

    @HS1({"timestampAdjuster"})
    public final void f() {
        this.e.q(0);
        this.f581o = C10323vs.b;
        if (this.i) {
            this.e.s(4);
            this.e.s(1);
            this.e.s(1);
            long h = (this.e.h(3) << 30) | (this.e.h(15) << 15) | this.e.h(15);
            this.e.s(1);
            if (!this.k && this.j) {
                this.e.s(4);
                this.e.s(1);
                this.e.s(1);
                this.e.s(1);
                this.h.b((this.e.h(3) << 30) | (this.e.h(15) << 15) | this.e.h(15));
                this.k = true;
            }
            this.f581o = this.h.b(h);
        }
    }

    public final void g(int i) {
        this.f = i;
        this.g = 0;
    }
}
