package o;

import java.util.Map;

/* renamed from: o.uL0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9955uL0 extends AbstractC9608sv1 {
    public static final float b = 0.38f;
    public static final float c = 0.5f;
    public static final int d = 3;
    public static final int e = 2;
    public static final int f = 1;
    public static final int[] g = {6, 8, 10, 12, 14};
    public static final int[] h = {1, 1, 1, 1};
    public static final int[][] i = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] j = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public int a = -1;

    public static int h(int[] iArr) throws C9349rr1 {
        int length = j.length;
        float f2 = 0.38f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float e2 = AbstractC9608sv1.e(iArr, j[i3], 0.5f);
            if (e2 < f2) {
                i2 = i3;
                f2 = e2;
            } else if (e2 == f2) {
                i2 = -1;
            }
        }
        if (i2 >= 0) {
            return i2 % 10;
        }
        throw C9349rr1.a();
    }

    public static void j(C10792xn c10792xn, int i2, int i3, StringBuilder sb) throws C9349rr1 {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i2 < i3) {
            AbstractC9608sv1.f(c10792xn, i2, iArr);
            for (int i4 = 0; i4 < 5; i4++) {
                int i5 = i4 * 2;
                iArr2[i4] = iArr[i5];
                iArr3[i4] = iArr[i5 + 1];
            }
            sb.append((char) (h(iArr2) + 48));
            sb.append((char) (h(iArr3) + 48));
            for (int i6 = 0; i6 < 10; i6++) {
                i2 += iArr[i6];
            }
        }
    }

    public static int[] l(C10792xn c10792xn, int i2, int[] iArr) throws C9349rr1 {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m = c10792xn.m();
        int i3 = i2;
        boolean z = false;
        int i4 = 0;
        while (i2 < m) {
            if (c10792xn.i(i2) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 == length - 1) {
                    if (AbstractC9608sv1.e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i3, i2};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4--;
                } else {
                    i4++;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i2++;
        }
        throw C9349rr1.a();
    }

    public static int m(C10792xn c10792xn) throws C9349rr1 {
        int m = c10792xn.m();
        int k = c10792xn.k(0);
        if (k != m) {
            return k;
        }
        throw C9349rr1.a();
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i2, C10792xn c10792xn, Map<XV, ?> map) throws C2605Bx0, C9349rr1 {
        int[] iArr;
        boolean z;
        int[] k = k(c10792xn);
        int[] i3 = i(c10792xn);
        StringBuilder sb = new StringBuilder(20);
        j(c10792xn, k[1], i3[0], sb);
        String sb2 = sb.toString();
        if (map != null) {
            iArr = (int[]) map.get(XV.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = g;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 < length2) {
                int i6 = iArr[i4];
                if (length == i6) {
                    z = true;
                    break;
                }
                if (i6 > i5) {
                    i5 = i6;
                }
                i4++;
            } else {
                z = false;
                break;
            }
        }
        if (!z && length > i5) {
            z = true;
        }
        if (z) {
            float f2 = i2;
            return new QT1(sb2, null, new UT1[]{new UT1(k[1], f2), new UT1(i3[0], f2)}, EnumC3839Ok.ITF);
        }
        throw C2605Bx0.a();
    }

    public final int[] i(C10792xn c10792xn) throws C9349rr1 {
        int i2;
        int[] l;
        c10792xn.q();
        try {
            try {
                l = l(c10792xn, m(c10792xn), i[0]);
            } catch (C9349rr1 unused) {
                l = l(c10792xn, i2, i[1]);
            }
            n(c10792xn, l[0]);
            int i3 = l[0];
            l[0] = c10792xn.m() - l[1];
            l[1] = c10792xn.m() - i3;
            return l;
        } finally {
            c10792xn.q();
        }
    }

    public final int[] k(C10792xn c10792xn) throws C9349rr1 {
        int[] l = l(c10792xn, m(c10792xn), h);
        int i2 = l[1];
        int i3 = l[0];
        this.a = (i2 - i3) / 4;
        n(c10792xn, i3);
        return l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(C10792xn c10792xn, int i2) throws C9349rr1 {
        int i3 = this.a * 10;
        if (i3 >= i2) {
            i3 = i2;
        }
        for (int i4 = i2 - 1; i3 > 0 && i4 >= 0 && !c10792xn.i(i4); i4--) {
            i3--;
        }
        throw C9349rr1.a();
    }
}
