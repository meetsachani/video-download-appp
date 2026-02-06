package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class I20 {
    public static final float c = 0.42f;
    public static final float d = 0.8f;
    public static final int g = 3;
    public static final int h = 5;
    public static final int i = 25;
    public static final int j = 5;
    public static final int k = 10;
    public static final int[] a = {0, 4, 1, 5};
    public static final int[] b = {6, 2, 7, 3};
    public static final int[] e = {8, 1, 1, 1, 1, 1, 1, 3};
    public static final int[] f = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static void a(UT1[] ut1Arr, UT1[] ut1Arr2, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            ut1Arr[iArr[i2]] = ut1Arr2[i2];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r4 = (o.UT1[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = (int) java.lang.Math.max(r2, r7.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = java.lang.Math.max(r2, (int) r4.d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<UT1[]> b(boolean z, C2469An c2469An) {
        int c2;
        float d2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            int i4 = i3;
            while (true) {
                if (i2 >= c2469An.i()) {
                    break loop0;
                }
                UT1[] f2 = f(c2469An, i2, i3);
                if (f2[0] != null || f2[3] != null) {
                    arrayList.add(f2);
                    if (!z) {
                        break loop0;
                    }
                    UT1 ut1 = f2[2];
                    if (ut1 != null) {
                        c2 = (int) ut1.c();
                        d2 = f2[2].d();
                    } else {
                        c2 = (int) f2[4].c();
                        d2 = f2[4].d();
                    }
                    i2 = (int) d2;
                    i3 = c2;
                    i4 = 1;
                } else {
                    break;
                }
            }
            i2 += 5;
            i3 = 0;
        }
        return arrayList;
    }

    public static C9131qx1 c(C7120in c7120in, Map<XV, ?> map, boolean z) throws C9349rr1 {
        C2469An b2 = c7120in.b();
        List<UT1[]> b3 = b(z, b2);
        if (b3.isEmpty()) {
            b2 = b2.clone();
            b2.p();
            b3 = b(z, b2);
        }
        return new C9131qx1(b2, b3);
    }

    public static int[] d(C2469An c2469An, int i2, int i3, int i4, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (c2469An.f(i2, i3) && i2 > 0) {
            int i6 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i2--;
            i5 = i6;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i7 = 0;
        int i8 = i2;
        while (i2 < i4) {
            if (c2469An.f(i2, i3) != z2) {
                iArr2[i7] = iArr2[i7] + 1;
            } else {
                if (i7 == length - 1) {
                    if (g(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i8, i2};
                    }
                    i8 += iArr2[0] + iArr2[1];
                    int i9 = i7 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i7] = 0;
                    i7--;
                } else {
                    i7++;
                }
                iArr2[i7] = 1;
                z2 = !z2;
            }
            i2++;
        }
        if (i7 == length - 1 && g(iArr2, iArr, 0.8f) < 0.42f) {
            return new int[]{i8, i2 - 1};
        }
        return null;
    }

    public static UT1[] e(C2469An c2469An, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        boolean z;
        int[] iArr2;
        UT1[] ut1Arr = new UT1[4];
        int[] iArr3 = iArr;
        int[] iArr4 = new int[iArr3.length];
        int i7 = i4;
        while (true) {
            if (i7 < i2) {
                int[] d2 = d(c2469An, i5, i7, i3, false, iArr3, iArr4);
                if (d2 != null) {
                    do {
                        i6 = i7;
                        iArr2 = d2;
                        if (i6 <= 0) {
                            break;
                        }
                        i7 = i6 - 1;
                        d2 = d(c2469An, i5, i7, i3, false, iArr, iArr4);
                    } while (d2 != null);
                    float f2 = i6;
                    ut1Arr[0] = new UT1(iArr2[0], f2);
                    ut1Arr[1] = new UT1(iArr2[1], f2);
                    z = true;
                } else {
                    i7 += 5;
                    iArr3 = iArr;
                }
            } else {
                i6 = i7;
                z = false;
                break;
            }
        }
        int i8 = i6 + 1;
        if (z) {
            int[] iArr5 = {(int) ut1Arr[0].c(), (int) ut1Arr[1].c()};
            int i9 = i8;
            int i10 = 0;
            while (i9 < i2) {
                int[] d3 = d(c2469An, iArr5[0], i9, i3, false, iArr, iArr4);
                if (d3 != null && Math.abs(iArr5[0] - d3[0]) < 5 && Math.abs(iArr5[1] - d3[1]) < 5) {
                    iArr5 = d3;
                    i10 = 0;
                } else if (i10 > 25) {
                    break;
                } else {
                    i10++;
                }
                i9++;
            }
            i8 = i9 - (i10 + 1);
            float f3 = i8;
            ut1Arr[2] = new UT1(iArr5[0], f3);
            ut1Arr[3] = new UT1(iArr5[1], f3);
        }
        if (i8 - i6 < 10) {
            Arrays.fill(ut1Arr, (Object) null);
        }
        return ut1Arr;
    }

    public static UT1[] f(C2469An c2469An, int i2, int i3) {
        int i4 = c2469An.i();
        int m = c2469An.m();
        UT1[] ut1Arr = new UT1[8];
        int i5 = i2;
        int i6 = i3;
        a(ut1Arr, e(c2469An, i4, m, i5, i6, e), a);
        UT1 ut1 = ut1Arr[4];
        if (ut1 != null) {
            int c2 = (int) ut1.c();
            i5 = (int) ut1Arr[4].d();
            i6 = c2;
        }
        a(ut1Arr, e(c2469An, i4, m, i5, i6, f), b);
        return ut1Arr;
    }

    public static float g(int[] iArr, int[] iArr2, float f2) {
        float f3;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f4 = i2;
        float f5 = f4 / i3;
        float f6 = f2 * f5;
        float f7 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            float f8 = iArr2[i5] * f5;
            float f9 = iArr[i5];
            if (f9 > f8) {
                f3 = f9 - f8;
            } else {
                f3 = f8 - f9;
            }
            if (f3 > f6) {
                return Float.POSITIVE_INFINITY;
            }
            f7 += f3;
        }
        return f7 / f4;
    }
}
