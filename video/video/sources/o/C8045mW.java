package o;

import java.util.Map;

/* renamed from: o.mW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8045mW {
    public final KP1 a = new KP1(LC0.l);

    public final void a(byte[] bArr, int i) throws UB {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (MP1 unused) {
            throw UB.a();
        }
    }

    public C9753tW b(C2469An c2469An) throws UB, C2605Bx0 {
        return c(c2469An, null);
    }

    public C9753tW c(C2469An c2469An, Map<XV, ?> map) throws C2605Bx0, UB {
        C2665Cn c2665Cn = new C2665Cn(c2469An);
        C2605Bx0 c2605Bx0 = null;
        try {
            return d(c2665Cn, map);
        } catch (C2605Bx0 e) {
            e = null;
            c2605Bx0 = e;
            try {
                c2665Cn.f();
                c2665Cn.g(true);
                c2665Cn.e();
                c2665Cn.d();
                c2665Cn.b();
                C9753tW d = d(c2665Cn, map);
                d.o(new UK1(true));
                return d;
            } catch (C2605Bx0 | UB unused) {
                if (c2605Bx0 != null) {
                    throw c2605Bx0;
                }
                throw e;
            }
        } catch (UB e2) {
            e = e2;
            c2665Cn.f();
            c2665Cn.g(true);
            c2665Cn.e();
            c2665Cn.d();
            c2665Cn.b();
            C9753tW d2 = d(c2665Cn, map);
            d2.o(new UK1(true));
            return d2;
        }
    }

    public final C9753tW d(C2665Cn c2665Cn, Map<XV, ?> map) throws C2605Bx0, UB {
        WE2 e = c2665Cn.e();
        EnumC8074me0 d = c2665Cn.d().d();
        C8282nU[] b = C8282nU.b(c2665Cn.c(), e, d);
        int i = 0;
        for (C8282nU c8282nU : b) {
            i += c8282nU.c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C8282nU c8282nU2 : b) {
            byte[] a = c8282nU2.a();
            int c = c8282nU2.c();
            a(a, c);
            int i3 = 0;
            while (i3 < c) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C6073eW.a(bArr, e, d, map);
    }

    public C9753tW e(boolean[][] zArr) throws UB, C2605Bx0 {
        return f(zArr, null);
    }

    public C9753tW f(boolean[][] zArr, Map<XV, ?> map) throws UB, C2605Bx0 {
        return c(C2469An.o(zArr), map);
    }
}
