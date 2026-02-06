package o;

import java.io.PrintWriter;

/* renamed from: o.ap2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5178ap2 {
    public static final int a = 19;
    public static final int b = 60;
    public static final int c = 3600;
    public static final int d = 86400;
    public static final Object e = new Object();
    public static char[] f = new char[24];

    public static int a(int i, int i2, boolean z, int i3) {
        if (i <= 99 && (!z || i3 < 3)) {
            if (i <= 9 && (!z || i3 < 2)) {
                if (!z && i <= 0) {
                    return 0;
                }
                return i2 + 1;
            }
            return i2 + 2;
        }
        return i2 + 3;
    }

    public static void b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            d(j - j2, printWriter, 0);
        }
    }

    public static void c(long j, PrintWriter printWriter) {
        d(j, printWriter, 0);
    }

    public static void d(long j, PrintWriter printWriter, int i) {
        synchronized (e) {
            printWriter.print(new String(f, 0, f(j, i)));
        }
    }

    public static void e(long j, StringBuilder sb) {
        synchronized (e) {
            sb.append(f, 0, f(j, 0));
        }
    }

    public static int f(long j, int i) {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        boolean z7;
        int i10;
        long j2 = j;
        if (f.length < i) {
            f = new char[i];
        }
        char[] cArr = f;
        int i11 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i11 == 0) {
            int i12 = i - 1;
            while (i12 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = C3599Ly1.j;
            return 1;
        }
        if (i11 > 0) {
            c2 = '+';
        } else {
            j2 = -j2;
            c2 = '-';
        }
        int i13 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i14 = floor / 60;
            floor -= i14 * 60;
            i4 = i14;
        } else {
            i4 = 0;
        }
        if (i != 0) {
            int a2 = a(i2, 1, false, 0);
            if (a2 > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int a3 = a2 + a(i3, 1, z5, 2);
            if (a3 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int a4 = a3 + a(i4, 1, z6, 2);
            if (a4 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int a5 = a4 + a(floor, 1, z7, 2);
            if (a5 > 0) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            i5 = 0;
            for (int a6 = a5 + a(i13, 2, true, i10) + 1; a6 < i; a6++) {
                cArr[i5] = ' ';
                i5++;
            }
        } else {
            i5 = 0;
        }
        cArr[i5] = c2;
        int i15 = i5 + 1;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        int g = g(cArr, i2, 'd', i15, false, 0);
        if (g != i15) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i6 = 2;
        } else {
            i6 = 0;
        }
        int g2 = g(cArr, i3, 'h', g, z2, i6);
        if (g2 != i15) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int g3 = g(cArr, i4, 'm', g2, z3, i7);
        if (g3 != i15) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int g4 = g(cArr, floor, 's', g3, z4, i8);
        if (z && g4 != i15) {
            i9 = 3;
        } else {
            i9 = 0;
        }
        int g5 = g(cArr, i13, 'm', g4, true, i9);
        cArr[g5] = 's';
        return g5 + 1;
    }

    public static int g(char[] cArr, int i, char c2, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((z && i3 >= 3) || i > 99) {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        } else {
            i4 = i2;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[i4 + 1] = c2;
        return i4 + 2;
    }
}
