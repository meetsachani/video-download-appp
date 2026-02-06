package o;

/* renamed from: o.dE0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5762dE0 extends AbstractC6878hn {
    public static final int d = 5;
    public static final int e = 3;
    public static final int f = 32;
    public static final byte[] g = new byte[0];
    public byte[] b;
    public final int[] c;

    public C5762dE0(AbstractC6220f71 abstractC6220f71) {
        super(abstractC6220f71);
        this.b = g;
        this.c = new int[32];
    }

    public static int g(int[] iArr) throws C9349rr1 {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 > length / 16) {
            int i12 = i3 - 1;
            int i13 = -1;
            int i14 = i12;
            while (i12 > i6) {
                int i15 = i12 - i6;
                int i16 = i15 * i15 * (i3 - i12) * (i2 - iArr[i12]);
                if (i16 > i13) {
                    i14 = i12;
                    i13 = i16;
                }
                i12--;
            }
            return i14 << 3;
        }
        throw C9349rr1.a();
    }

    @Override // o.AbstractC6878hn
    public AbstractC6878hn a(AbstractC6220f71 abstractC6220f71) {
        return new C5762dE0(abstractC6220f71);
    }

    @Override // o.AbstractC6878hn
    public C2469An b() throws C9349rr1 {
        AbstractC6220f71 e2 = e();
        int e3 = e2.e();
        int b = e2.b();
        C2469An c2469An = new C2469An(e3, b);
        h(e3);
        int[] iArr = this.c;
        for (int i = 1; i < 5; i++) {
            byte[] d2 = e2.d((b * i) / 5, this.b);
            int i2 = (e3 << 2) / 5;
            for (int i3 = e3 / 5; i3 < i2; i3++) {
                int i4 = (d2[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g2 = g(iArr);
        byte[] c = e2.c();
        for (int i5 = 0; i5 < b; i5++) {
            int i6 = i5 * e3;
            for (int i7 = 0; i7 < e3; i7++) {
                if ((c[i6 + i7] & 255) < g2) {
                    c2469An.q(i7, i5);
                }
            }
        }
        return c2469An;
    }

    @Override // o.AbstractC6878hn
    public C10792xn c(int i, C10792xn c10792xn) throws C9349rr1 {
        AbstractC6220f71 e2 = e();
        int e3 = e2.e();
        if (c10792xn != null && c10792xn.m() >= e3) {
            c10792xn.e();
        } else {
            c10792xn = new C10792xn(e3);
        }
        h(e3);
        byte[] d2 = e2.d(i, this.b);
        int[] iArr = this.c;
        for (int i2 = 0; i2 < e3; i2++) {
            int i3 = (d2[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g2 = g(iArr);
        if (e3 < 3) {
            for (int i4 = 0; i4 < e3; i4++) {
                if ((d2[i4] & 255) < g2) {
                    c10792xn.r(i4);
                }
            }
        } else {
            int i5 = d2[1] & 255;
            int i6 = d2[0] & 255;
            int i7 = i5;
            int i8 = 1;
            while (i8 < e3 - 1) {
                int i9 = i8 + 1;
                int i10 = d2[i9] & 255;
                if ((((i7 << 2) - i6) - i10) / 2 < g2) {
                    c10792xn.r(i8);
                }
                i6 = i7;
                i8 = i9;
                i7 = i10;
            }
        }
        return c10792xn;
    }

    public final void h(int i) {
        if (this.b.length < i) {
            this.b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.c[i2] = 0;
        }
    }
}
