package o;

import java.util.Arrays;
import java.util.Map;

/* renamed from: o.zE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11144zE extends AbstractC9608sv1 {
    public static final float d = 2.0f;
    public static final float e = 1.5f;
    public static final int i = 3;
    public final StringBuilder a = new StringBuilder(20);
    public int[] b = new int[80];
    public int c = 0;
    public static final String f = "0123456789-$:/.+ABCD";
    public static final char[] g = f.toCharArray();
    public static final int[] h = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    public static final char[] j = {'A', 'B', 'C', 'D'};

    public static boolean h(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i2, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1 {
        int i3;
        Arrays.fill(this.b, 0);
        k(c10792xn);
        int j2 = j();
        this.a.setLength(0);
        int i4 = j2;
        while (true) {
            int l = l(i4);
            if (l != -1) {
                this.a.append((char) l);
                i3 = i4 + 8;
                if ((this.a.length() <= 1 || !h(j, g[l])) && i3 < this.c) {
                    i4 = i3;
                }
            } else {
                throw C9349rr1.a();
            }
        }
        int i5 = i4 + 7;
        int i6 = this.b[i5];
        int i7 = 0;
        for (int i8 = -8; i8 < -1; i8++) {
            i7 += this.b[i3 + i8];
        }
        if (i3 < this.c && i6 < i7 / 2) {
            throw C9349rr1.a();
        }
        m(j2);
        for (int i9 = 0; i9 < this.a.length(); i9++) {
            StringBuilder sb = this.a;
            sb.setCharAt(i9, g[sb.charAt(i9)]);
        }
        char charAt = this.a.charAt(0);
        char[] cArr = j;
        if (h(cArr, charAt)) {
            StringBuilder sb2 = this.a;
            if (h(cArr, sb2.charAt(sb2.length() - 1))) {
                if (this.a.length() > 3) {
                    if (map == null || !map.containsKey(XV.RETURN_CODABAR_START_END)) {
                        StringBuilder sb3 = this.a;
                        sb3.deleteCharAt(sb3.length() - 1);
                        this.a.deleteCharAt(0);
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < j2; i11++) {
                        i10 += this.b[i11];
                    }
                    float f2 = i10;
                    while (j2 < i5) {
                        i10 += this.b[j2];
                        j2++;
                    }
                    float f3 = i2;
                    return new QT1(this.a.toString(), null, new UT1[]{new UT1(f2, f3), new UT1(i10, f3)}, EnumC3839Ok.CODABAR);
                }
                throw C9349rr1.a();
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    public final void i(int i2) {
        int[] iArr = this.b;
        int i3 = this.c;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.c = i4;
        if (i4 >= iArr.length) {
            int[] iArr2 = new int[i4 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.b = iArr2;
        }
    }

    public final int j() throws C9349rr1 {
        for (int i2 = 1; i2 < this.c; i2 += 2) {
            int l = l(i2);
            if (l != -1 && h(j, g[l])) {
                int i3 = 0;
                for (int i4 = i2; i4 < i2 + 7; i4++) {
                    i3 += this.b[i4];
                }
                if (i2 == 1 || this.b[i2 - 1] >= i3 / 2) {
                    return i2;
                }
            }
        }
        throw C9349rr1.a();
    }

    public final void k(C10792xn c10792xn) throws C9349rr1 {
        int i2 = 0;
        this.c = 0;
        int l = c10792xn.l(0);
        int m = c10792xn.m();
        if (l < m) {
            boolean z = true;
            while (l < m) {
                if (c10792xn.i(l) != z) {
                    i2++;
                } else {
                    i(i2);
                    z = !z;
                    i2 = 1;
                }
                l++;
            }
            i(i2);
            return;
        }
        throw C9349rr1.a();
    }

    public final int l(int i2) {
        int i3;
        int i4 = i2 + 7;
        if (i4 >= this.c) {
            return -1;
        }
        int[] iArr = this.b;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        for (int i9 = i2; i9 < i4; i9 += 2) {
            int i10 = iArr[i9];
            if (i10 < i7) {
                i7 = i10;
            }
            if (i10 > i8) {
                i8 = i10;
            }
        }
        int i11 = (i7 + i8) / 2;
        int i12 = 0;
        for (int i13 = i2 + 1; i13 < i4; i13 += 2) {
            int i14 = iArr[i13];
            if (i14 < i5) {
                i5 = i14;
            }
            if (i14 > i12) {
                i12 = i14;
            }
        }
        int i15 = (i5 + i12) / 2;
        int i16 = 128;
        int i17 = 0;
        for (int i18 = 0; i18 < 7; i18++) {
            if ((i18 & 1) == 0) {
                i3 = i11;
            } else {
                i3 = i15;
            }
            i16 >>= 1;
            if (iArr[i2 + i18] > i3) {
                i17 |= i16;
            }
        }
        while (true) {
            int[] iArr2 = h;
            if (i6 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i6] == i17) {
                return i6;
            }
            i6++;
        }
    }

    public final void m(int i2) throws C9349rr1 {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.a.length() - 1;
        int i3 = i2;
        int i4 = 0;
        while (true) {
            int i5 = h[this.a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            int i10 = iArr[i9];
            int i11 = iArr2[i9];
            float f2 = ((iArr[i8] / iArr2[i8]) + (i10 / i11)) / 2.0f;
            fArr2[i9] = f2;
            fArr[i8] = f2;
            fArr[i9] = ((i10 * 2.0f) + 1.5f) / i11;
        }
        int i12 = i2;
        int i13 = 0;
        loop3: while (true) {
            int i14 = h[this.a.charAt(i13)];
            for (int i15 = 6; i15 >= 0; i15--) {
                int i16 = (i15 & 1) + ((i14 & 1) << 1);
                float f3 = this.b[i12 + i15];
                if (f3 < fArr2[i16] || f3 > fArr[i16]) {
                    break loop3;
                }
                i14 >>= 1;
            }
            if (i13 < length) {
                i12 += 8;
                i13++;
            } else {
                return;
            }
        }
        throw C9349rr1.a();
    }
}
