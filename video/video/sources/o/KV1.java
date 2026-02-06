package o;

import java.util.List;
import o.C10833xx0;

@Deprecated
/* loaded from: classes2.dex */
public final class KV1 implements PV1 {
    public static final String h = "RtpOpusReader";
    public static final int i = 48000;
    public final OV1 a;
    public InterfaceC10568wr2 b;
    public long d;
    public boolean f;
    public boolean g;
    public long c = -1;
    public int e = -1;

    public KV1(OV1 ov1) {
        this.a = ov1;
    }

    public static void e(C3012Fy1 c3012Fy1) {
        boolean z;
        int f = c3012Fy1.f();
        boolean z2 = false;
        if (c3012Fy1.g() > 18) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.b(z, "ID Header has insufficient data");
        C9542sf.b(c3012Fy1.I(8).equals("OpusHead"), "ID Header missing");
        if (c3012Fy1.L() == 1) {
            z2 = true;
        }
        C9542sf.b(z2, "version number must always be 1");
        c3012Fy1.Y(f);
    }

    @Override // o.PV1
    public void a(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i2) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i2, 1);
        this.b = b;
        b.a(this.a.c);
    }

    @Override // o.PV1
    public void c(long j, int i2) {
        this.c = j;
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j, int i2, boolean z) {
        boolean z2;
        C9542sf.k(this.b);
        if (!this.f) {
            e(c3012Fy1);
            List<byte[]> a = C6418fw1.a(c3012Fy1.e());
            C10833xx0.b b = this.a.c.b();
            b.V(a);
            this.b.a(b.G());
            this.f = true;
        } else if (!this.g) {
            if (c3012Fy1.g() >= 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.b(z2, "Comment Header has insufficient data");
            C9542sf.b(c3012Fy1.I(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.g = true;
        } else {
            int b2 = LV1.b(this.e);
            if (i2 != b2) {
                I31.n(h, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b2), Integer.valueOf(i2)));
            }
            int a2 = c3012Fy1.a();
            this.b.e(c3012Fy1, a2);
            this.b.b(RV1.a(this.d, j, this.c, 48000), 1, a2, 0, null);
        }
        this.e = i2;
    }
}
