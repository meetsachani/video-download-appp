package o;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public final class JI0 extends C5762dE0 {
    public static final int i = 3;
    public static final int j = 8;
    public static final int k = 7;
    public static final int l = 40;
    public static final int m = 24;
    public C2469An h;

    public JI0(AbstractC6220f71 abstractC6220f71) {
        super(abstractC6220f71);
    }

    public static int[][] i(byte[] bArr, int i2, int i3, int i4, int i5) {
        int i6 = 8;
        int i7 = i5 - 8;
        int i8 = i4 - 8;
        char c = 2;
        boolean z = true;
        int i9 = 0;
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i3, i2);
        int i10 = 0;
        while (i10 < i3) {
            int i11 = i10 << 3;
            if (i11 > i7) {
                i11 = i7;
            }
            int i12 = i9;
            while (i12 < i2) {
                int i13 = i12 << 3;
                if (i13 > i8) {
                    i13 = i8;
                }
                int i14 = (i11 * i4) + i13;
                char c2 = c;
                boolean z2 = z;
                int i15 = i9;
                int i16 = i15;
                int i17 = i16;
                int i18 = 255;
                while (i15 < i6) {
                    int i19 = i9;
                    int i20 = i17;
                    while (i19 < i6) {
                        int i21 = bArr[i14 + i19] & 255;
                        i16 += i21;
                        if (i21 < i18) {
                            i18 = i21;
                        }
                        if (i21 > i20) {
                            i20 = i21;
                        }
                        i19++;
                        i6 = 8;
                    }
                    if (i20 - i18 <= 24) {
                        i15++;
                        i14 += i4;
                        i17 = i20;
                        i6 = 8;
                        i9 = 0;
                    }
                    while (true) {
                        i15++;
                        i14 += i4;
                        if (i15 < 8) {
                            int i22 = 0;
                            for (int i23 = 8; i22 < i23; i23 = 8) {
                                i16 += bArr[i14 + i22] & 255;
                                i22++;
                            }
                        }
                    }
                    i15++;
                    i14 += i4;
                    i17 = i20;
                    i6 = 8;
                    i9 = 0;
                }
                int i24 = i16 >> 6;
                if (i17 - i18 <= 24) {
                    i24 = i18 / 2;
                    if (i10 > 0 && i12 > 0) {
                        int[] iArr2 = iArr[i10 - 1];
                        int i25 = i12 - 1;
                        int i26 = ((iArr2[i12] + (iArr[i10][i25] * 2)) + iArr2[i25]) / 4;
                        if (i18 < i26) {
                            i24 = i26;
                        }
                    }
                }
                iArr[i10][i12] = i24;
                i12++;
                c = c2;
                z = z2;
                i6 = 8;
                i9 = 0;
            }
            i10++;
            i6 = 8;
            i9 = 0;
        }
        return iArr;
    }

    public static void j(byte[] bArr, int i2, int i3, int i4, int i5, int[][] iArr, C2469An c2469An) {
        int i6;
        int i7;
        int i8 = i5 - 8;
        int i9 = i4 - 8;
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = i10 << 3;
            if (i11 > i8) {
                i6 = i8;
            } else {
                i6 = i11;
            }
            int k2 = k(i10, 2, i3 - 3);
            for (int i12 = 0; i12 < i2; i12++) {
                int i13 = i12 << 3;
                if (i13 > i9) {
                    i7 = i9;
                } else {
                    i7 = i13;
                }
                int k3 = k(i12, 2, i2 - 3);
                int i14 = 0;
                for (int i15 = -2; i15 <= 2; i15++) {
                    int[] iArr2 = iArr[k2 + i15];
                    i14 += iArr2[k3 - 2] + iArr2[k3 - 1] + iArr2[k3] + iArr2[k3 + 1] + iArr2[k3 + 2];
                }
                l(bArr, i7, i6, i14 / 25, i4, c2469An);
            }
        }
    }

    public static int k(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        if (i2 > i4) {
            return i4;
        }
        return i2;
    }

    public static void l(byte[] bArr, int i2, int i3, int i4, int i5, C2469An c2469An) {
        int i6 = (i3 * i5) + i2;
        int i7 = 0;
        while (i7 < 8) {
            for (int i8 = 0; i8 < 8; i8++) {
                if ((bArr[i6 + i8] & 255) <= i4) {
                    c2469An.q(i2 + i8, i3 + i7);
                }
            }
            i7++;
            i6 += i5;
        }
    }

    @Override // o.C5762dE0, o.AbstractC6878hn
    public AbstractC6878hn a(AbstractC6220f71 abstractC6220f71) {
        return new JI0(abstractC6220f71);
    }

    @Override // o.C5762dE0, o.AbstractC6878hn
    public C2469An b() throws C9349rr1 {
        C2469An c2469An = this.h;
        if (c2469An != null) {
            return c2469An;
        }
        AbstractC6220f71 e = e();
        int e2 = e.e();
        int b = e.b();
        if (e2 >= 40 && b >= 40) {
            byte[] c = e.c();
            int i2 = e2 >> 3;
            if ((e2 & 7) != 0) {
                i2++;
            }
            int i3 = i2;
            int i4 = b >> 3;
            if ((b & 7) != 0) {
                i4++;
            }
            int i5 = i4;
            int[][] i6 = i(c, i3, i5, e2, b);
            C2469An c2469An2 = new C2469An(e2, b);
            j(c, i3, i5, e2, b, i6, c2469An2);
            this.h = c2469An2;
        } else {
            this.h = super.b();
        }
        return this.h;
    }
}
