package o;

@Deprecated
/* loaded from: classes2.dex */
public final class GV1 implements PV1 {
    public static final String j = "RtpH264Reader";
    public static final int k = 90000;
    public static final int l = 2;
    public static final int m = 24;
    public static final int n = 28;

    /* renamed from: o  reason: collision with root package name */
    public static final int f474o = 5;
    public final OV1 c;
    public InterfaceC10568wr2 d;
    public int e;
    public int h;
    public long i;
    public final C3012Fy1 b = new C3012Fy1(C9337ro1.i);
    public final C3012Fy1 a = new C3012Fy1();
    public long f = C10323vs.b;
    public int g = -1;

    public GV1(OV1 ov1) {
        this.c = ov1;
    }

    public static int e(int i) {
        if (i == 5) {
            return 1;
        }
        return 0;
    }

    @Override // o.PV1
    public void a(long j2, long j3) {
        this.f = j2;
        this.h = 0;
        this.i = j3;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i, 2);
        this.d = b;
        ((InterfaceC10568wr2) TD2.o(b)).a(this.c.c);
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j2, int i, boolean z) throws C3989Py1 {
        try {
            int i2 = c3012Fy1.e()[0] & 31;
            C9542sf.k(this.d);
            if (i2 > 0 && i2 < 24) {
                g(c3012Fy1);
            } else if (i2 == 24) {
                h(c3012Fy1);
            } else if (i2 == 28) {
                f(c3012Fy1, i);
            } else {
                throw C3989Py1.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i2)), null);
            }
            if (z) {
                if (this.f == C10323vs.b) {
                    this.f = j2;
                }
                this.d.b(RV1.a(this.i, j2, this.f, 90000), this.e, this.h, 0, null);
                this.h = 0;
            }
            this.g = i;
        } catch (IndexOutOfBoundsException e) {
            throw C3989Py1.c(null, e);
        }
    }

    @HS1({"trackOutput"})
    public final void f(C3012Fy1 c3012Fy1, int i) {
        boolean z;
        boolean z2 = false;
        byte b = c3012Fy1.e()[0];
        byte b2 = c3012Fy1.e()[1];
        int i2 = (b & 224) | (b2 & 31);
        if ((b2 & 128) > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((b2 & 64) > 0) {
            z2 = true;
        }
        if (z) {
            this.h += i();
            c3012Fy1.e()[1] = (byte) i2;
            this.a.V(c3012Fy1.e());
            this.a.Y(1);
        } else {
            int b3 = LV1.b(this.g);
            if (i != b3) {
                I31.n(j, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b3), Integer.valueOf(i)));
                return;
            } else {
                this.a.V(c3012Fy1.e());
                this.a.Y(2);
            }
        }
        int a = this.a.a();
        this.d.e(this.a, a);
        this.h += a;
        if (z2) {
            this.e = e(i2 & 31);
        }
    }

    @HS1({"trackOutput"})
    public final void g(C3012Fy1 c3012Fy1) {
        int a = c3012Fy1.a();
        this.h += i();
        this.d.e(c3012Fy1, a);
        this.h += a;
        this.e = e(c3012Fy1.e()[0] & 31);
    }

    @HS1({"trackOutput"})
    public final void h(C3012Fy1 c3012Fy1) {
        c3012Fy1.L();
        while (c3012Fy1.a() > 4) {
            int R = c3012Fy1.R();
            this.h += i();
            this.d.e(c3012Fy1, R);
            this.h += R;
        }
        this.e = 0;
    }

    public final int i() {
        this.b.Y(0);
        int a = this.b.a();
        ((InterfaceC10568wr2) C9542sf.g(this.d)).e(this.b, a);
        return a;
    }

    @Override // o.PV1
    public void c(long j2, int i) {
    }
}
