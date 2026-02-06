package o;

@Deprecated
/* loaded from: classes2.dex */
public final class CV1 implements PV1 {
    public static final String h = "RtpAmrReader";
    public static final int[] i = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] j = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public final OV1 a;
    public final boolean b;
    public final int c;
    public InterfaceC10568wr2 d;
    public long e = C10323vs.b;
    public int g = -1;
    public long f = 0;

    public CV1(OV1 ov1) {
        this.a = ov1;
        this.b = C4128Rj1.d0.equals(C9542sf.g(ov1.c.g1));
        this.c = ov1.b;
    }

    public static int e(int i2, boolean z) {
        boolean z2;
        String str;
        if ((i2 >= 0 && i2 <= 8) || i2 == 15) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        if (z) {
            str = "WB";
        } else {
            str = "NB";
        }
        sb.append(str);
        sb.append(" frame type ");
        sb.append(i2);
        C9542sf.b(z2, sb.toString());
        if (z) {
            return j[i2];
        }
        return i[i2];
    }

    @Override // o.PV1
    public void a(long j2, long j3) {
        this.e = j2;
        this.f = j3;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i2) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i2, 1);
        this.d = b;
        b.a(this.a.c);
    }

    @Override // o.PV1
    public void c(long j2, int i2) {
        this.e = j2;
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j2, int i2, boolean z) {
        int b;
        C9542sf.k(this.d);
        int i3 = this.g;
        if (i3 != -1 && i2 != (b = LV1.b(i3))) {
            I31.n(h, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b), Integer.valueOf(i2)));
        }
        boolean z2 = true;
        c3012Fy1.Z(1);
        int e = e((c3012Fy1.k() >> 3) & 15, this.b);
        int a = c3012Fy1.a();
        if (a != e) {
            z2 = false;
        }
        C9542sf.b(z2, "compound payload not supported currently");
        this.d.e(c3012Fy1, a);
        this.d.b(RV1.a(this.f, j2, this.e, this.c), 1, a, 0, null);
        this.g = i2;
    }
}
