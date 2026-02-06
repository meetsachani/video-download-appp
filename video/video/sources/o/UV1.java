package o;

@Deprecated
/* loaded from: classes2.dex */
public final class UV1 implements PV1 {
    public static final String m = "RtpVp9Reader";
    public static final int n = 90000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f628o = 4;
    public final OV1 a;
    public InterfaceC10568wr2 b;
    public boolean j;
    public boolean k;
    public boolean l;
    public long c = C10323vs.b;
    public int f = -1;
    public long g = C10323vs.b;
    public long d = 0;
    public int e = -1;
    public int h = -1;
    public int i = -1;

    public UV1(OV1 ov1) {
        this.a = ov1;
    }

    private void e() {
        long j = this.g;
        boolean z = this.l;
        ((InterfaceC10568wr2) C9542sf.g(this.b)).b(j, z ? 1 : 0, this.f, 0, null);
        this.f = -1;
        this.g = C10323vs.b;
        this.j = false;
    }

    @Override // o.PV1
    public void a(long j, long j2) {
        this.c = j;
        this.f = -1;
        this.d = j2;
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
        int i2;
        int i3;
        boolean z2;
        C9542sf.k(this.b);
        if (f(c3012Fy1, i)) {
            if (this.f == -1 && this.j) {
                if ((c3012Fy1.k() & 4) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.l = z2;
            }
            if (!this.k && (i2 = this.h) != -1 && (i3 = this.i) != -1) {
                C10833xx0 c10833xx0 = this.a.c;
                if (i2 != c10833xx0.l1 || i3 != c10833xx0.m1) {
                    this.b.a(c10833xx0.b().n0(this.h).S(this.i).G());
                }
                this.k = true;
            }
            int a = c3012Fy1.a();
            this.b.e(c3012Fy1, a);
            int i4 = this.f;
            if (i4 == -1) {
                this.f = a;
            } else {
                this.f = i4 + a;
            }
            this.g = RV1.a(this.d, j, this.c, 90000);
            if (z) {
                e();
            }
            this.e = i;
        }
    }

    public final boolean f(C3012Fy1 c3012Fy1, int i) {
        boolean z;
        int L = c3012Fy1.L();
        if ((L & 8) == 8) {
            if (this.j && this.f > 0) {
                e();
            }
            this.j = true;
        } else if (this.j) {
            int b = LV1.b(this.e);
            if (i < b) {
                I31.n(m, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b), Integer.valueOf(i)));
                return false;
            }
        } else {
            I31.n(m, "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
            return false;
        }
        if ((L & 128) != 0 && (c3012Fy1.L() & 128) != 0 && c3012Fy1.a() < 1) {
            return false;
        }
        int i2 = L & 16;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.b(z, "VP9 flexible mode is not supported.");
        if ((L & 32) != 0) {
            c3012Fy1.Z(1);
            if (c3012Fy1.a() < 1) {
                return false;
            }
            if (i2 == 0) {
                c3012Fy1.Z(1);
            }
        }
        if ((L & 2) != 0) {
            int L2 = c3012Fy1.L();
            int i3 = (L2 >> 5) & 7;
            if ((L2 & 16) != 0) {
                int i4 = i3 + 1;
                if (c3012Fy1.a() < i4 * 4) {
                    return false;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    this.h = c3012Fy1.R();
                    this.i = c3012Fy1.R();
                }
            }
            if ((L2 & 8) != 0) {
                int L3 = c3012Fy1.L();
                if (c3012Fy1.a() < L3) {
                    return false;
                }
                for (int i6 = 0; i6 < L3; i6++) {
                    int R = (c3012Fy1.R() & 12) >> 2;
                    if (c3012Fy1.a() < R) {
                        return false;
                    }
                    c3012Fy1.Z(R);
                }
            }
        }
        return true;
    }
}
