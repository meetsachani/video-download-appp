package o;

@Deprecated
/* loaded from: classes2.dex */
public final class JV1 implements PV1 {
    public static final String h = "RtpMpeg4Reader";
    public static final int i = 90000;
    public static final int j = 0;
    public final OV1 a;
    public InterfaceC10568wr2 b;
    public int c;
    public long d = C10323vs.b;
    public int e = -1;
    public long f;
    public int g;

    public JV1(OV1 ov1) {
        this.a = ov1;
    }

    public static int e(C3012Fy1 c3012Fy1) {
        int j2 = C9351rs.j(c3012Fy1.e(), new byte[]{0, 0, 1, -74});
        if (j2 != -1) {
            c3012Fy1.Y(j2 + 4);
            if ((c3012Fy1.k() >> 6) == 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // o.PV1
    public void a(long j2, long j3) {
        this.d = j2;
        this.f = j3;
        this.g = 0;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i2) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i2, 2);
        this.b = b;
        ((InterfaceC10568wr2) TD2.o(b)).a(this.a.c);
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j2, int i2, boolean z) {
        int b;
        C9542sf.k(this.b);
        int i3 = this.e;
        if (i3 != -1 && i2 != (b = LV1.b(i3))) {
            I31.n(h, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b), Integer.valueOf(i2)));
        }
        int a = c3012Fy1.a();
        this.b.e(c3012Fy1, a);
        if (this.g == 0) {
            this.c = e(c3012Fy1);
        }
        this.g += a;
        if (z) {
            if (this.d == C10323vs.b) {
                this.d = j2;
            }
            this.b.b(RV1.a(this.f, j2, this.d, 90000), this.c, this.g, 0, null);
            this.g = 0;
        }
        this.e = i2;
    }

    @Override // o.PV1
    public void c(long j2, int i2) {
    }
}
