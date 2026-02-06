package o;

import o.AbstractC4233Sk2;
import o.C10833xx0;

@Deprecated
/* loaded from: classes2.dex */
public final class RG2 extends AbstractC4233Sk2 {
    public static final int h = 7;
    public static final int i = 1;
    public static final int j = 5;
    public static final int k = 0;
    public static final int l = 1;
    public final C3012Fy1 b;
    public final C3012Fy1 c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public RG2(InterfaceC10568wr2 interfaceC10568wr2) {
        super(interfaceC10568wr2);
        this.b = new C3012Fy1(C9337ro1.i);
        this.c = new C3012Fy1(4);
    }

    @Override // o.AbstractC4233Sk2
    public boolean b(C3012Fy1 c3012Fy1) throws AbstractC4233Sk2.a {
        int L = c3012Fy1.L();
        int i2 = (L >> 4) & 15;
        int i3 = L & 15;
        if (i3 == 7) {
            this.g = i2;
            if (i2 != 5) {
                return true;
            }
            return false;
        }
        throw new AbstractC4233Sk2.a("Video format not supported: " + i3);
    }

    @Override // o.AbstractC4233Sk2
    public boolean c(C3012Fy1 c3012Fy1, long j2) throws C3989Py1 {
        int i2;
        int L = c3012Fy1.L();
        long t = j2 + (c3012Fy1.t() * 1000);
        if (L == 0 && !this.e) {
            C3012Fy1 c3012Fy12 = new C3012Fy1(new byte[c3012Fy1.a()]);
            c3012Fy1.n(c3012Fy12.e(), 0, c3012Fy1.a());
            C3932Pj b = C3932Pj.b(c3012Fy12);
            this.d = b.b;
            this.a.a(new C10833xx0.b().g0("video/avc").K(b.i).n0(b.c).S(b.d).c0(b.h).V(b.a).G());
            this.e = true;
            return false;
        } else if (L != 1 || !this.e) {
            return false;
        } else {
            if (this.g == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!this.f && i2 == 0) {
                return false;
            }
            byte[] e = this.c.e();
            e[0] = 0;
            e[1] = 0;
            e[2] = 0;
            int i3 = 4 - this.d;
            int i4 = 0;
            while (c3012Fy1.a() > 0) {
                c3012Fy1.n(this.c.e(), i3, this.d);
                this.c.Y(0);
                int P = this.c.P();
                this.b.Y(0);
                this.a.e(this.b, 4);
                this.a.e(c3012Fy1, P);
                i4 = i4 + 4 + P;
            }
            this.a.b(t, i2, i4, 0, null);
            this.f = true;
            return true;
        }
    }

    @Override // o.AbstractC4233Sk2
    public void d() {
        this.f = false;
    }
}
