package o;

@Deprecated
/* loaded from: classes2.dex */
public final class IV1 implements PV1 {
    public static final String i = "RtpMp4aReader";
    public static final String j = "config";
    public final OV1 a;
    public final int b;
    public InterfaceC10568wr2 c;
    public long d;
    public int e;
    public int f;
    public long g;
    public long h;

    public IV1(OV1 ov1) {
        this.a = ov1;
        try {
            this.b = e(ov1.d);
            this.d = C10323vs.b;
            this.e = -1;
            this.f = 0;
            this.g = 0L;
            this.h = C10323vs.b;
        } catch (C3989Py1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int e(AbstractC6044eO0<String, String> abstractC6044eO0) throws C3989Py1 {
        boolean z;
        boolean z2;
        String str = abstractC6044eO0.get("config");
        int i2 = 0;
        boolean z3 = false;
        i2 = 0;
        if (str != null && str.length() % 2 == 0) {
            C2903Ey1 c2903Ey1 = new C2903Ey1(TD2.W(str));
            int h = c2903Ey1.h(1);
            if (h == 0) {
                if (c2903Ey1.h(1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.b(z, "Only supports allStreamsSameTimeFraming.");
                int h2 = c2903Ey1.h(6);
                if (c2903Ey1.h(4) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9542sf.b(z2, "Only suppors one program.");
                if (c2903Ey1.h(3) == 0) {
                    z3 = true;
                }
                C9542sf.b(z3, "Only suppors one layer.");
                i2 = h2;
            } else {
                throw C3989Py1.b("unsupported audio mux version: " + h, null);
            }
        }
        return i2 + 1;
    }

    private void f() {
        ((InterfaceC10568wr2) C9542sf.g(this.c)).b(this.h, 1, this.f, 0, null);
        this.f = 0;
        this.h = C10323vs.b;
    }

    @Override // o.PV1
    public void a(long j2, long j3) {
        this.d = j2;
        this.f = 0;
        this.g = j3;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i2) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i2, 2);
        this.c = b;
        ((InterfaceC10568wr2) TD2.o(b)).a(this.a.c);
    }

    @Override // o.PV1
    public void c(long j2, int i2) {
        boolean z;
        if (this.d == C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.d = j2;
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j2, int i2, boolean z) {
        C9542sf.k(this.c);
        int b = LV1.b(this.e);
        if (this.f > 0 && b < i2) {
            f();
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = 0;
            while (c3012Fy1.f() < c3012Fy1.g()) {
                int L = c3012Fy1.L();
                i4 += L;
                if (L != 255) {
                    break;
                }
            }
            this.c.e(c3012Fy1, i4);
            this.f += i4;
        }
        this.h = RV1.a(this.g, j2, this.d, this.a.b);
        if (z) {
            f();
        }
        this.e = i2;
    }
}
