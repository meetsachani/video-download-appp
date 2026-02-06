package o;

import java.util.Collections;
import o.AbstractC4233Sk2;
import o.C10833xx0;
import o.G;

@Deprecated
/* renamed from: o.Mh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3631Mh extends AbstractC4233Sk2 {
    public static final int e = 2;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 10;
    public static final int i = 0;
    public static final int j = 1;
    public static final int[] k = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public C3631Mh(InterfaceC10568wr2 interfaceC10568wr2) {
        super(interfaceC10568wr2);
    }

    @Override // o.AbstractC4233Sk2
    public boolean b(C3012Fy1 c3012Fy1) throws AbstractC4233Sk2.a {
        String str;
        if (!this.b) {
            int L = c3012Fy1.L();
            int i2 = (L >> 4) & 15;
            this.d = i2;
            if (i2 == 2) {
                this.a.a(new C10833xx0.b().g0(C4128Rj1.I).J(1).h0(k[(L >> 2) & 3]).G());
                this.c = true;
            } else if (i2 != 7 && i2 != 8) {
                if (i2 != 10) {
                    throw new AbstractC4233Sk2.a("Audio format not supported: " + this.d);
                }
            } else {
                if (i2 == 7) {
                    str = C4128Rj1.O;
                } else {
                    str = C4128Rj1.P;
                }
                this.a.a(new C10833xx0.b().g0(str).J(1).h0(8000).G());
                this.c = true;
            }
            this.b = true;
        } else {
            c3012Fy1.Z(1);
        }
        return true;
    }

    @Override // o.AbstractC4233Sk2
    public boolean c(C3012Fy1 c3012Fy1, long j2) throws C3989Py1 {
        if (this.d == 2) {
            int a = c3012Fy1.a();
            this.a.e(c3012Fy1, a);
            this.a.b(j2, 1, a, 0, null);
            return true;
        }
        int L = c3012Fy1.L();
        if (L == 0 && !this.c) {
            int a2 = c3012Fy1.a();
            byte[] bArr = new byte[a2];
            c3012Fy1.n(bArr, 0, a2);
            G.c f2 = G.f(bArr);
            this.a.a(new C10833xx0.b().g0("audio/mp4a-latm").K(f2.c).J(f2.b).h0(f2.a).V(Collections.singletonList(bArr)).G());
            this.c = true;
            return false;
        } else if (this.d == 10 && L != 1) {
            return false;
        } else {
            int a3 = c3012Fy1.a();
            this.a.e(c3012Fy1, a3);
            this.a.b(j2, 1, a3, 0, null);
            return true;
        }
    }

    @Override // o.AbstractC4233Sk2
    public void d() {
    }
}
