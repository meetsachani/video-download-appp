package o;

import o.AbstractC7373jp2;
import o.J6;

@Deprecated
/* loaded from: classes2.dex */
public final class F12 {
    @OB
    public static J6 a(J6 j6, long j, long j2, long... jArr) {
        long f = f(j, -1, j6);
        int i = j6.Z0;
        while (i < j6.Y && j6.g(i).X != Long.MIN_VALUE && j6.g(i).X <= f) {
            i++;
        }
        J6 v = j6.z(i, f).w(i, true).m(i, jArr.length).n(i, jArr).v(i, j2);
        for (int i2 = 0; i2 < jArr.length && jArr[i2] == 0; i2++) {
            v = v.E(i, i2);
        }
        return b(v, i, TD2.O1(jArr), j2);
    }

    public static J6 b(J6 j6, int i, long j, long j2) {
        long j3 = (-j) + j2;
        while (true) {
            i++;
            if (i < j6.Y) {
                long j4 = j6.g(i).X;
                if (j4 != Long.MIN_VALUE) {
                    j6 = j6.p(i, j4 + j3);
                }
            } else {
                return j6;
            }
        }
    }

    public static int c(J6 j6, int i) {
        int i2 = j6.g(i).Y;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static long d(long j, C4604Wg1 c4604Wg1, J6 j6) {
        if (c4604Wg1.c()) {
            return e(j, c4604Wg1.b, c4604Wg1.c, j6);
        }
        return f(j, c4604Wg1.e, j6);
    }

    public static long e(long j, int i, int i2, J6 j6) {
        int i3;
        J6.b g = j6.g(i);
        long j2 = j - g.X;
        int i4 = j6.Z0;
        while (true) {
            i3 = 0;
            if (i4 >= i) {
                break;
            }
            J6.b g2 = j6.g(i4);
            while (i3 < c(j6, i4)) {
                j2 -= g2.a1[i3];
                i3++;
            }
            j2 += g2.b1;
            i4++;
        }
        if (i2 < c(j6, i)) {
            while (i3 < i2) {
                j2 -= g.a1[i3];
                i3++;
            }
        }
        return j2;
    }

    public static long f(long j, int i, J6 j6) {
        if (i == -1) {
            i = j6.Y;
        }
        long j2 = 0;
        for (int i2 = j6.Z0; i2 < i; i2++) {
            J6.b g = j6.g(i2);
            long j3 = g.X;
            if (j3 == Long.MIN_VALUE || j3 > j - j2) {
                break;
            }
            for (int i3 = 0; i3 < c(j6, i2); i3++) {
                j2 += g.a1[i3];
            }
            long j4 = g.b1;
            j2 -= j4;
            long j5 = g.X;
            long j7 = j - j2;
            if (j4 + j5 > j7) {
                return Math.max(j5, j7);
            }
        }
        return j - j2;
    }

    public static long g(long j, C4604Wg1 c4604Wg1, J6 j6) {
        if (c4604Wg1.c()) {
            return i(j, c4604Wg1.b, c4604Wg1.c, j6);
        }
        return j(j, c4604Wg1.e, j6);
    }

    public static long h(HD1 hd1, J6 j6) {
        AbstractC7373jp2 e1 = hd1.e1();
        if (e1.x()) {
            return C10323vs.b;
        }
        AbstractC7373jp2.b k = e1.k(hd1.C1(), new AbstractC7373jp2.b());
        if (!TD2.g(k.m(), j6.X)) {
            return C10323vs.b;
        }
        if (hd1.O()) {
            return i(TD2.j1(hd1.getCurrentPosition()), hd1.R0(), hd1.G1(), j6);
        }
        return j(TD2.j1(hd1.getCurrentPosition()) - k.t(), -1, j6);
    }

    public static long i(long j, int i, int i2, J6 j6) {
        int i3;
        J6.b g = j6.g(i);
        long j2 = j + g.X;
        int i4 = j6.Z0;
        while (true) {
            i3 = 0;
            if (i4 >= i) {
                break;
            }
            J6.b g2 = j6.g(i4);
            while (i3 < c(j6, i4)) {
                j2 += g2.a1[i3];
                i3++;
            }
            j2 -= g2.b1;
            i4++;
        }
        if (i2 < c(j6, i)) {
            while (i3 < i2) {
                j2 += g.a1[i3];
                i3++;
            }
        }
        return j2;
    }

    public static long j(long j, int i, J6 j6) {
        if (i == -1) {
            i = j6.Y;
        }
        long j2 = 0;
        for (int i2 = j6.Z0; i2 < i; i2++) {
            J6.b g = j6.g(i2);
            long j3 = g.X;
            if (j3 == Long.MIN_VALUE || j3 > j) {
                break;
            }
            long j4 = j3 + j2;
            for (int i3 = 0; i3 < c(j6, i2); i3++) {
                j2 += g.a1[i3];
            }
            long j5 = g.b1;
            j2 -= j5;
            if (g.X + j5 > j) {
                return Math.max(j4, j + j2);
            }
        }
        return j + j2;
    }
}
