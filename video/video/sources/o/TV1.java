package o;

@Deprecated
/* loaded from: classes2.dex */
public final class TV1 implements PV1 {
    public static final String k = "RtpVP8Reader";
    public static final int l = 90000;
    public final OV1 a;
    public InterfaceC10568wr2 b;
    public long c = C10323vs.b;
    public int d = -1;
    public int e = -1;
    public long f = C10323vs.b;
    public long g = 0;
    public boolean h;
    public boolean i;
    public boolean j;

    public TV1(OV1 ov1) {
        this.a = ov1;
    }

    private void e() {
        long j = this.f;
        boolean z = this.i;
        ((InterfaceC10568wr2) C9542sf.g(this.b)).b(j, z ? 1 : 0, this.e, 0, null);
        this.e = -1;
        this.f = C10323vs.b;
        this.h = false;
    }

    @Override // o.PV1
    public void a(long j, long j2) {
        this.c = j;
        this.e = -1;
        this.g = j2;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i, 2);
        this.b = b;
        b.a(this.a.c);
    }

    @Override // o.PV1
    public void c(long j, int i) {
        boolean z;
        if (this.c == C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.c = j;
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j, int i, boolean z) {
        boolean z2;
        C9542sf.k(this.b);
        if (f(c3012Fy1, i)) {
            if (this.e == -1 && this.h) {
                if ((c3012Fy1.k() & 1) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.i = z2;
            }
            if (!this.j) {
                int f = c3012Fy1.f();
                c3012Fy1.Y(f + 6);
                int D = c3012Fy1.D() & 16383;
                int D2 = c3012Fy1.D() & 16383;
                c3012Fy1.Y(f);
                C10833xx0 c10833xx0 = this.a.c;
                if (D != c10833xx0.l1 || D2 != c10833xx0.m1) {
                    this.b.a(c10833xx0.b().n0(D).S(D2).G());
                }
                this.j = true;
            }
            int a = c3012Fy1.a();
            this.b.e(c3012Fy1, a);
            int i2 = this.e;
            if (i2 == -1) {
                this.e = a;
            } else {
                this.e = i2 + a;
            }
            this.f = RV1.a(this.g, j, this.c, 90000);
            if (z) {
                e();
            }
            this.d = i;
        }
    }

    public final boolean f(C3012Fy1 c3012Fy1, int i) {
        int L = c3012Fy1.L();
        if ((L & 16) == 16 && (L & 7) == 0) {
            if (this.h && this.e > 0) {
                e();
            }
            this.h = true;
        } else if (this.h) {
            int b = LV1.b(this.d);
            if (i < b) {
                I31.n(k, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b), Integer.valueOf(i)));
                return false;
            }
        } else {
            I31.n(k, "RTP packet is not the start of a new VP8 partition, skipping.");
            return false;
        }
        if ((L & 128) != 0) {
            int L2 = c3012Fy1.L();
            if ((L2 & 128) != 0 && (c3012Fy1.L() & 128) != 0) {
                c3012Fy1.Z(1);
            }
            if ((L2 & 64) != 0) {
                c3012Fy1.Z(1);
            }
            if ((L2 & 32) != 0 || (L2 & 16) != 0) {
                c3012Fy1.Z(1);
            }
        }
        return true;
    }
}
