package o;

@Deprecated
/* loaded from: classes2.dex */
public final class HV1 implements PV1 {
    public static final String j = "RtpH265Reader";
    public static final int k = 90000;
    public static final int l = 3;
    public static final int m = 48;
    public static final int n = 49;

    /* renamed from: o  reason: collision with root package name */
    public static final int f487o = 19;
    public static final int p = 20;
    public final OV1 c;
    public InterfaceC10568wr2 d;
    public int e;
    public int h;
    public long i;
    public final C3012Fy1 a = new C3012Fy1();
    public final C3012Fy1 b = new C3012Fy1(C9337ro1.i);
    public long f = C10323vs.b;
    public int g = -1;

    public HV1(OV1 ov1) {
        this.c = ov1;
    }

    private static int e(int i) {
        if (i != 19 && i != 20) {
            return 0;
        }
        return 1;
    }

    @HS1({"trackOutput"})
    private void f(C3012Fy1 c3012Fy1, int i) throws C3989Py1 {
        boolean z;
        if (c3012Fy1.e().length >= 3) {
            int i2 = c3012Fy1.e()[1] & 7;
            byte b = c3012Fy1.e()[2];
            int i3 = b & ED2.a;
            boolean z2 = false;
            if ((b & 128) > 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 64) > 0) {
                z2 = true;
            }
            if (z) {
                this.h += h();
                c3012Fy1.e()[1] = (byte) ((i3 << 1) & 127);
                c3012Fy1.e()[2] = (byte) i2;
                this.a.V(c3012Fy1.e());
                this.a.Y(1);
            } else {
                int i4 = (this.g + 1) % 65535;
                if (i != i4) {
                    I31.n(j, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i4), Integer.valueOf(i)));
                    return;
                } else {
                    this.a.V(c3012Fy1.e());
                    this.a.Y(3);
                }
            }
            int a = this.a.a();
            this.d.e(this.a, a);
            this.h += a;
            if (z2) {
                this.e = e(i3);
                return;
            }
            return;
        }
        throw C3989Py1.c("Malformed FU header.", null);
    }

    @HS1({"trackOutput"})
    private void g(C3012Fy1 c3012Fy1) {
        int a = c3012Fy1.a();
        this.h += h();
        this.d.e(c3012Fy1, a);
        this.h += a;
        this.e = e((c3012Fy1.e()[0] >> 1) & 63);
    }

    private int h() {
        this.b.Y(0);
        int a = this.b.a();
        ((InterfaceC10568wr2) C9542sf.g(this.d)).e(this.b, a);
        return a;
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
        b.a(this.c.c);
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j2, int i, boolean z) throws C3989Py1 {
        if (c3012Fy1.e().length != 0) {
            int i2 = (c3012Fy1.e()[0] >> 1) & 63;
            C9542sf.k(this.d);
            if (i2 >= 0 && i2 < 48) {
                g(c3012Fy1);
            } else if (i2 != 48) {
                if (i2 == 49) {
                    f(c3012Fy1, i);
                } else {
                    throw C3989Py1.c(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i2)), null);
                }
            } else {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (z) {
                if (this.f == C10323vs.b) {
                    this.f = j2;
                }
                this.d.b(RV1.a(this.i, j2, this.f, 90000), this.e, this.h, 0, null);
                this.h = 0;
            }
            this.g = i;
            return;
        }
        throw C3989Py1.c("Empty RTP data packet.", null);
    }

    @Override // o.PV1
    public void c(long j2, int i) {
    }
}
