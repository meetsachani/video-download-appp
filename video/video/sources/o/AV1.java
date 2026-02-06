package o;

@Deprecated
/* loaded from: classes2.dex */
public final class AV1 implements PV1 {
    public static final String j = "AAC-lbr";
    public static final String k = "AAC-hbr";
    public static final String l = "RtpAacReader";
    public final OV1 a;
    public final C2903Ey1 b = new C2903Ey1();
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public InterfaceC10568wr2 h;
    public long i;

    public AV1(OV1 ov1) {
        this.a = ov1;
        this.c = ov1.b;
        String str = (String) C9542sf.g(ov1.d.get("mode"));
        if (C8077mf.a(str, k)) {
            this.d = 13;
            this.e = 3;
        } else if (C8077mf.a(str, j)) {
            this.d = 6;
            this.e = 2;
        } else {
            throw new UnsupportedOperationException("AAC mode not supported");
        }
        this.f = this.e + this.d;
    }

    public static void e(InterfaceC10568wr2 interfaceC10568wr2, long j2, int i) {
        interfaceC10568wr2.b(j2, 1, i, 0, null);
    }

    @Override // o.PV1
    public void a(long j2, long j3) {
        this.g = j2;
        this.i = j3;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i, 1);
        this.h = b;
        b.a(this.a.c);
    }

    @Override // o.PV1
    public void c(long j2, int i) {
        this.g = j2;
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j2, int i, boolean z) {
        C9542sf.g(this.h);
        short H = c3012Fy1.H();
        int i2 = H / this.f;
        long a = RV1.a(this.i, j2, this.g, this.c);
        this.b.n(c3012Fy1);
        if (i2 == 1) {
            int h = this.b.h(this.d);
            this.b.s(this.e);
            this.h.e(c3012Fy1, c3012Fy1.a());
            if (z) {
                e(this.h, a, h);
                return;
            }
            return;
        }
        c3012Fy1.Z((H + 7) / 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int h2 = this.b.h(this.d);
            this.b.s(this.e);
            this.h.e(c3012Fy1, h2);
            e(this.h, a, h2);
            a += TD2.C1(i2, 1000000L, this.c);
        }
    }
}
