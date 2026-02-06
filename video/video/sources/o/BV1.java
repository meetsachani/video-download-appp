package o;

import o.I3;

/* loaded from: classes2.dex */
public final class BV1 implements PV1 {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 2;
    public final OV1 a;
    public InterfaceC10568wr2 c;
    public int d;
    public long f;
    public long g;
    public final C2903Ey1 b = new C2903Ey1();
    public long e = C10323vs.b;

    public BV1(OV1 ov1) {
        this.a = ov1;
    }

    @Override // o.PV1
    public void a(long j2, long j3) {
        this.e = j2;
        this.g = j3;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i2) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i2, 1);
        this.c = b;
        b.a(this.a.c);
    }

    @Override // o.PV1
    public void c(long j2, int i2) {
        boolean z;
        if (this.e == C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.e = j2;
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j2, int i2, boolean z) {
        int L = c3012Fy1.L() & 3;
        int L2 = c3012Fy1.L() & 255;
        long a = RV1.a(this.g, j2, this.e, this.a.b);
        if (L != 0) {
            if (L != 1 && L != 2) {
                if (L != 3) {
                    throw new IllegalArgumentException(String.valueOf(L));
                }
            } else {
                e();
            }
            g(c3012Fy1, z, L, a);
            return;
        }
        e();
        if (L2 == 1) {
            i(c3012Fy1, a);
        } else {
            h(c3012Fy1, L2, a);
        }
    }

    public final void e() {
        if (this.d > 0) {
            f();
        }
    }

    public final void f() {
        ((InterfaceC10568wr2) TD2.o(this.c)).b(this.f, 1, this.d, 0, null);
        this.d = 0;
    }

    public final void g(C3012Fy1 c3012Fy1, boolean z, int i2, long j2) {
        int a = c3012Fy1.a();
        ((InterfaceC10568wr2) C9542sf.g(this.c)).e(c3012Fy1, a);
        this.d += a;
        this.f = j2;
        if (z && i2 == 3) {
            f();
        }
    }

    public final void h(C3012Fy1 c3012Fy1, int i2, long j2) {
        this.b.o(c3012Fy1.e());
        this.b.t(2);
        long j3 = j2;
        for (int i3 = 0; i3 < i2; i3++) {
            I3.b f = I3.f(this.b);
            ((InterfaceC10568wr2) C9542sf.g(this.c)).e(c3012Fy1, f.e);
            ((InterfaceC10568wr2) TD2.o(this.c)).b(j3, 1, f.e, 0, null);
            j3 += (f.f / f.c) * 1000000;
            this.b.t(f.e);
        }
    }

    public final void i(C3012Fy1 c3012Fy1, long j2) {
        int a = c3012Fy1.a();
        ((InterfaceC10568wr2) C9542sf.g(this.c)).e(c3012Fy1, a);
        ((InterfaceC10568wr2) TD2.o(this.c)).b(j2, 1, a, 0, null);
    }
}
