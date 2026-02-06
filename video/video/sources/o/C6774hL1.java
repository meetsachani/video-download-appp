package o;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@InterfaceC11149zF0
@InterfaceC4238Sm
@InterfaceC8058ma0
/* renamed from: o.hL1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6774hL1 {

    /* renamed from: o.hL1$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public final int a;

        public c a(int i) {
            return new c(this.a, i);
        }

        public d b(Collection<Integer> collection) {
            return new d(this.a, C7775lT0.B(collection));
        }

        public d c(int... iArr) {
            return new d(this.a, (int[]) iArr.clone());
        }

        public b(int i) {
            C10664xF1.e(i > 0, "Quantile scale must be positive");
            this.a = i;
        }
    }

    /* renamed from: o.hL1$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public final int a;
        public final int b;

        public double a(Collection<? extends Number> collection) {
            return e(D50.z(collection));
        }

        public double b(double... dArr) {
            return e((double[]) dArr.clone());
        }

        public double c(int... iArr) {
            return e(C6774hL1.l(iArr));
        }

        public double d(long... jArr) {
            return e(C6774hL1.m(jArr));
        }

        public double e(double... dArr) {
            boolean z;
            if (dArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "Cannot calculate quantiles of an empty dataset");
            if (C6774hL1.j(dArr)) {
                return Double.NaN;
            }
            long length = this.b * (dArr.length - 1);
            int g = (int) R41.g(length, this.a, RoundingMode.DOWN);
            int i = (int) (length - (g * this.a));
            C6774hL1.u(g, dArr, 0, dArr.length - 1);
            if (i == 0) {
                return dArr[g];
            }
            int i2 = g + 1;
            C6774hL1.u(i2, dArr, i2, dArr.length - 1);
            return C6774hL1.k(dArr[g], dArr[i2], i, this.a);
        }

        public c(int i, int i2) {
            C6774hL1.h(i2, i);
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: o.hL1$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public final int a;
        public final int[] b;

        public Map<Integer, Double> a(Collection<? extends Number> collection) {
            return e(D50.z(collection));
        }

        public Map<Integer, Double> b(double... dArr) {
            return e((double[]) dArr.clone());
        }

        public Map<Integer, Double> c(int... iArr) {
            return e(C6774hL1.l(iArr));
        }

        public Map<Integer, Double> d(long... jArr) {
            return e(C6774hL1.m(jArr));
        }

        public Map<Integer, Double> e(double... dArr) {
            boolean z;
            int[] iArr;
            int i = 0;
            if (dArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "Cannot calculate quantiles of an empty dataset");
            if (C6774hL1.j(dArr)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr2 = this.b;
                int length = iArr2.length;
                while (i < length) {
                    linkedHashMap.put(Integer.valueOf(iArr2[i]), Double.valueOf(Double.NaN));
                    i++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr3 = this.b;
            int[] iArr4 = new int[iArr3.length];
            int[] iArr5 = new int[iArr3.length];
            int[] iArr6 = new int[iArr3.length * 2];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= this.b.length) {
                    break;
                }
                long length2 = iArr[i2] * (dArr.length - 1);
                int g = (int) R41.g(length2, this.a, RoundingMode.DOWN);
                int i4 = (int) (length2 - (g * this.a));
                iArr4[i2] = g;
                iArr5[i2] = i4;
                iArr6[i3] = g;
                int i5 = i3 + 1;
                if (i4 != 0) {
                    iArr6[i5] = g + 1;
                    i3 += 2;
                } else {
                    i3 = i5;
                }
                i2++;
            }
            Arrays.sort(iArr6, 0, i3);
            C6774hL1.t(iArr6, 0, i3 - 1, dArr, 0, dArr.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr7 = this.b;
                if (i < iArr7.length) {
                    int i6 = iArr4[i];
                    int i7 = iArr5[i];
                    if (i7 == 0) {
                        linkedHashMap2.put(Integer.valueOf(iArr7[i]), Double.valueOf(dArr[i6]));
                    } else {
                        linkedHashMap2.put(Integer.valueOf(iArr7[i]), Double.valueOf(C6774hL1.k(dArr[i6], dArr[i6 + 1], i7, this.a)));
                    }
                    i++;
                } else {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
            }
        }

        public d(int i, int[] iArr) {
            for (int i2 : iArr) {
                C6774hL1.h(i2, i);
            }
            C10664xF1.e(iArr.length > 0, "Indexes must be a non empty array");
            this.a = i;
            this.b = iArr;
        }
    }

    public static void h(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("Quantile indexes must be between 0 and the scale, which is ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int i(int[] iArr, int i, int i2, int i3, int i4) {
        if (i == i2) {
            return i;
        }
        int i5 = i3 + i4;
        int i6 = i5 >>> 1;
        while (i2 > i + 1) {
            int i7 = (i + i2) >>> 1;
            int i8 = iArr[i7];
            if (i8 > i6) {
                i2 = i7;
            } else if (i8 < i6) {
                i = i7;
            } else {
                return i7;
            }
        }
        if ((i5 - iArr[i]) - iArr[i2] > 0) {
            return i2;
        }
        return i;
    }

    public static boolean j(double... dArr) {
        for (double d2 : dArr) {
            if (Double.isNaN(d2)) {
                return true;
            }
        }
        return false;
    }

    public static double k(double d2, double d3, double d4, double d5) {
        if (d2 == Double.NEGATIVE_INFINITY) {
            if (d3 != Double.POSITIVE_INFINITY) {
                return Double.NEGATIVE_INFINITY;
            }
            return Double.NaN;
        } else if (d3 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else {
            return d2 + (((d3 - d2) * d4) / d5);
        }
    }

    public static double[] l(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = iArr[i];
        }
        return dArr;
    }

    public static double[] m(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = jArr[i];
        }
        return dArr;
    }

    public static c n() {
        return s(2).a(1);
    }

    public static void o(double[] dArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i3 = (i + i2) >>> 1;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        if (d2 < d3) {
            z = true;
        } else {
            z = false;
        }
        double d4 = dArr[i];
        if (d3 < d4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (d2 >= d4) {
            z3 = false;
        }
        if (z == z2) {
            v(dArr, i3, i);
        } else if (z != z3) {
            v(dArr, i, i2);
        }
    }

    public static int p(double[] dArr, int i, int i2) {
        o(dArr, i, i2);
        double d2 = dArr[i];
        int i3 = i2;
        while (i2 > i) {
            if (dArr[i2] > d2) {
                v(dArr, i3, i2);
                i3--;
            }
            i2--;
        }
        v(dArr, i, i3);
        return i3;
    }

    public static b q() {
        return s(100);
    }

    public static b r() {
        return s(4);
    }

    public static b s(int i) {
        return new b(i);
    }

    public static void t(int[] iArr, int i, int i2, double[] dArr, int i3, int i4) {
        int i5 = i(iArr, i, i2, i3, i4);
        int i6 = iArr[i5];
        u(i6, dArr, i3, i4);
        int i7 = i5 - 1;
        while (i7 >= i && iArr[i7] == i6) {
            i7--;
        }
        if (i7 >= i) {
            t(iArr, i, i7, dArr, i3, i6 - 1);
        }
        int i8 = i5 + 1;
        while (i8 <= i2 && iArr[i8] == i6) {
            i8++;
        }
        if (i8 <= i2) {
            t(iArr, i8, i2, dArr, i6 + 1, i4);
        }
    }

    public static void u(int i, double[] dArr, int i2, int i3) {
        if (i == i2) {
            int i4 = i2;
            for (int i5 = i2 + 1; i5 <= i3; i5++) {
                if (dArr[i4] > dArr[i5]) {
                    i4 = i5;
                }
            }
            if (i4 != i2) {
                v(dArr, i4, i2);
                return;
            }
            return;
        }
        while (i3 > i2) {
            int p = p(dArr, i2, i3);
            if (p >= i) {
                i3 = p - 1;
            }
            if (p <= i) {
                i2 = p + 1;
            }
        }
    }

    public static void v(double[] dArr, int i, int i2) {
        double d2 = dArr[i];
        dArr[i] = dArr[i2];
        dArr[i2] = d2;
    }
}
