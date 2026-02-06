package o;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class Ix2 extends AbstractC9608sv1 {
    public static final float d = 0.48f;
    public static final float e = 0.7f;
    public static final int[] f = {1, 1, 1};
    public static final int[] g = {1, 1, 1, 1, 1};
    public static final int[] h = {1, 1, 1, 1, 1, 1};
    public static final int[][] i;
    public static final int[][] j;
    public final StringBuilder a = new StringBuilder(20);
    public final Hx2 b = new Hx2();
    public final C6227f90 c = new C6227f90();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        i = iArr;
        int[][] iArr2 = new int[20];
        j = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i2 = 10; i2 < 20; i2++) {
            int[] iArr3 = i[i2 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                iArr4[i3] = iArr3[(iArr3.length - i3) - 1];
            }
            j[i2] = iArr4;
        }
    }

    public static boolean i(CharSequence charSequence) throws C2605Bx0 {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i2 = length - 1;
        if (r(charSequence.subSequence(0, i2)) != Character.digit(charSequence.charAt(i2), 10)) {
            return false;
        }
        return true;
    }

    public static int j(C10792xn c10792xn, int[] iArr, int i2, int[][] iArr2) throws C9349rr1 {
        AbstractC9608sv1.f(c10792xn, i2, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            float e2 = AbstractC9608sv1.e(iArr, iArr2[i4], 0.7f);
            if (e2 < f2) {
                i3 = i4;
                f2 = e2;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        throw C9349rr1.a();
    }

    public static int[] n(C10792xn c10792xn, int i2, boolean z, int[] iArr) throws C9349rr1 {
        return o(c10792xn, i2, z, iArr, new int[iArr.length]);
    }

    public static int[] o(C10792xn c10792xn, int i2, boolean z, int[] iArr, int[] iArr2) throws C9349rr1 {
        int k;
        int m = c10792xn.m();
        if (z) {
            k = c10792xn.l(i2);
        } else {
            k = c10792xn.k(i2);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = k;
        while (k < m) {
            if (c10792xn.i(k) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 == length - 1) {
                    if (AbstractC9608sv1.e(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i4, k};
                    }
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            k++;
        }
        throw C9349rr1.a();
    }

    public static int[] p(C10792xn c10792xn) throws C9349rr1 {
        int[] iArr = new int[f.length];
        int[] iArr2 = null;
        boolean z = false;
        int i2 = 0;
        while (!z) {
            int[] iArr3 = f;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = o(c10792xn, i2, false, iArr3, iArr);
            int i3 = iArr2[0];
            int i4 = iArr2[1];
            int i5 = i3 - (i4 - i3);
            if (i5 >= 0) {
                z = c10792xn.o(i5, i3, false);
            }
            i2 = i4;
        }
        return iArr2;
    }

    public static int r(CharSequence charSequence) throws C2605Bx0 {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            int charAt = charSequence.charAt(i3) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i2 += charAt;
            } else {
                throw C2605Bx0.a();
            }
        }
        int i4 = i2 * 3;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int charAt2 = charSequence.charAt(i5) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i4 += charAt2;
            } else {
                throw C2605Bx0.a();
            }
        }
        return (1000 - i4) % 10;
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i2, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0 {
        return m(i2, c10792xn, p(c10792xn), map);
    }

    public boolean h(String str) throws C2605Bx0 {
        return i(str);
    }

    public int[] k(C10792xn c10792xn, int i2) throws C9349rr1 {
        return n(c10792xn, i2, false, f);
    }

    public abstract int l(C10792xn c10792xn, int[] iArr, StringBuilder sb) throws C9349rr1;

    public QT1 m(int i2, C10792xn c10792xn, int[] iArr, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0 {
        VT1 vt1;
        int i3;
        String c;
        int[] iArr2 = null;
        if (map == null) {
            vt1 = null;
        } else {
            vt1 = (VT1) map.get(XV.NEED_RESULT_POINT_CALLBACK);
        }
        if (vt1 != null) {
            vt1.a(new UT1((iArr[0] + iArr[1]) / 2.0f, i2));
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        int l = l(c10792xn, iArr, sb);
        if (vt1 != null) {
            vt1.a(new UT1(l, i2));
        }
        int[] k = k(c10792xn, l);
        if (vt1 != null) {
            vt1.a(new UT1((k[0] + k[1]) / 2.0f, i2));
        }
        int i4 = k[1];
        int i5 = (i4 - k[0]) + i4;
        if (i5 < c10792xn.m() && c10792xn.o(i4, i5, false)) {
            String sb2 = sb.toString();
            if (sb2.length() >= 8) {
                if (h(sb2)) {
                    EnumC3839Ok q = q();
                    float f2 = i2;
                    QT1 qt1 = new QT1(sb2, null, new UT1[]{new UT1((iArr[1] + iArr[0]) / 2.0f, f2), new UT1((k[1] + k[0]) / 2.0f, f2)}, q);
                    try {
                        QT1 a = this.b.a(i2, c10792xn, k[1]);
                        qt1.j(ST1.UPC_EAN_EXTENSION, a.g());
                        qt1.i(a.e());
                        qt1.a(a.f());
                        i3 = a.g().length();
                    } catch (FO1 unused) {
                        i3 = 0;
                    }
                    if (map != null) {
                        iArr2 = (int[]) map.get(XV.ALLOWED_EAN_EXTENSIONS);
                    }
                    if (iArr2 != null) {
                        for (int i6 : iArr2) {
                            if (i3 != i6) {
                            }
                        }
                        throw C9349rr1.a();
                    }
                    if ((q == EnumC3839Ok.EAN_13 || q == EnumC3839Ok.UPC_A) && (c = this.c.c(sb2)) != null) {
                        qt1.j(ST1.POSSIBLE_COUNTRY, c);
                    }
                    return qt1;
                }
                throw UB.a();
            }
            throw C2605Bx0.a();
        }
        throw C9349rr1.a();
    }

    public abstract EnumC3839Ok q();
}
