package o;

/* renamed from: o.vd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10265vd1 {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, C3503Kz.f0, -1}, new int[]{6, 34, 62, 90, 118, C3503Kz.j0, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, C3503Kz.n0}, new int[]{6, 28, 54, 80, 106, C3503Kz.V, C3503Kz.r0}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, C10997yd1.t1}, new int[]{6, 30, 58, 86, 114, C3503Kz.f0, C7193j50.f}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final int e = 7973;
    public static final int f = 1335;
    public static final int g = 21522;

    public static void a(C10792xn c10792xn, EnumC8074me0 enumC8074me0, WE2 we2, int i, C5672cs c5672cs) throws PN2 {
        c(c5672cs);
        d(we2, c5672cs);
        l(enumC8074me0, i, c5672cs);
        s(we2, c5672cs);
        f(c10792xn, i, c5672cs);
    }

    public static int b(int i, int i2) {
        if (i2 != 0) {
            int n = n(i2);
            int i3 = i << (n - 1);
            while (n(i3) >= n) {
                i3 ^= i2 << (n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void c(C5672cs c5672cs) {
        c5672cs.a((byte) -1);
    }

    public static void d(WE2 we2, C5672cs c5672cs) throws PN2 {
        j(c5672cs);
        e(c5672cs);
        r(we2, c5672cs);
        k(c5672cs);
    }

    public static void e(C5672cs c5672cs) throws PN2 {
        if (c5672cs.b(8, c5672cs.d() - 8) != 0) {
            c5672cs.g(8, c5672cs.d() - 8, 1);
            return;
        }
        throw new PN2();
    }

    public static void f(C10792xn c10792xn, int i, C5672cs c5672cs) throws PN2 {
        boolean z;
        int e2 = c5672cs.e() - 1;
        int d2 = c5672cs.d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e2 > 0) {
            if (e2 == 6) {
                e2--;
            }
            while (d2 >= 0 && d2 < c5672cs.d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e2 - i4;
                    if (o(c5672cs.b(i5, d2))) {
                        if (i2 < c10792xn.m()) {
                            z = c10792xn.i(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && E81.f(i, i5, d2)) {
                            z = !z;
                        }
                        c5672cs.h(i5, d2, z);
                    }
                }
                d2 += i3;
            }
            i3 = -i3;
            d2 += i3;
            e2 -= 2;
        }
        if (i2 == c10792xn.m()) {
            return;
        }
        throw new PN2("Not all bits consumed: " + i2 + '/' + c10792xn.m());
    }

    public static void g(int i, int i2, C5672cs c5672cs) throws PN2 {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (o(c5672cs.b(i4, i2))) {
                c5672cs.g(i4, i2, 0);
            } else {
                throw new PN2();
            }
        }
    }

    public static void h(int i, int i2, C5672cs c5672cs) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                c5672cs.g(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void i(int i, int i2, C5672cs c5672cs) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                c5672cs.g(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void j(C5672cs c5672cs) throws PN2 {
        int length = a[0].length;
        i(0, 0, c5672cs);
        i(c5672cs.e() - length, 0, c5672cs);
        i(0, c5672cs.e() - length, c5672cs);
        g(0, 7, c5672cs);
        g(c5672cs.e() - 8, 7, c5672cs);
        g(0, c5672cs.e() - 8, c5672cs);
        m(7, 0, c5672cs);
        m(c5672cs.d() - 8, 0, c5672cs);
        m(7, c5672cs.d() - 7, c5672cs);
    }

    public static void k(C5672cs c5672cs) {
        int i = 8;
        while (i < c5672cs.e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (o(c5672cs.b(i, 6))) {
                c5672cs.g(i, 6, i3);
            }
            if (o(c5672cs.b(6, i))) {
                c5672cs.g(6, i, i3);
            }
            i = i2;
        }
    }

    public static void l(EnumC8074me0 enumC8074me0, int i, C5672cs c5672cs) throws PN2 {
        C10792xn c10792xn = new C10792xn();
        p(enumC8074me0, i, c10792xn);
        for (int i2 = 0; i2 < c10792xn.m(); i2++) {
            boolean i3 = c10792xn.i((c10792xn.m() - 1) - i2);
            int[] iArr = d[i2];
            c5672cs.h(iArr[0], iArr[1], i3);
            if (i2 < 8) {
                c5672cs.h((c5672cs.e() - i2) - 1, 8, i3);
            } else {
                c5672cs.h(8, (c5672cs.d() - 7) + (i2 - 8), i3);
            }
        }
    }

    public static void m(int i, int i2, C5672cs c5672cs) throws PN2 {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (o(c5672cs.b(i, i4))) {
                c5672cs.g(i, i4, 0);
            } else {
                throw new PN2();
            }
        }
    }

    public static int n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    public static boolean o(int i) {
        if (i == -1) {
            return true;
        }
        return false;
    }

    public static void p(EnumC8074me0 enumC8074me0, int i, C10792xn c10792xn) throws PN2 {
        if (TK1.f(i)) {
            int g2 = (enumC8074me0.g() << 3) | i;
            c10792xn.d(g2, 5);
            c10792xn.d(b(g2, f), 10);
            C10792xn c10792xn2 = new C10792xn();
            c10792xn2.d(21522, 15);
            c10792xn.v(c10792xn2);
            if (c10792xn.m() == 15) {
                return;
            }
            throw new PN2("should not happen but we got: " + c10792xn.m());
        }
        throw new PN2("Invalid mask pattern");
    }

    public static void q(WE2 we2, C10792xn c10792xn) throws PN2 {
        c10792xn.d(we2.j(), 6);
        c10792xn.d(b(we2.j(), e), 12);
        if (c10792xn.m() == 18) {
            return;
        }
        throw new PN2("should not happen but we got: " + c10792xn.m());
    }

    public static void r(WE2 we2, C5672cs c5672cs) {
        if (we2.j() >= 2) {
            int[] iArr = c[we2.j() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && o(c5672cs.b(i2, i))) {
                            h(i2 - 2, i - 2, c5672cs);
                        }
                    }
                }
            }
        }
    }

    public static void s(WE2 we2, C5672cs c5672cs) throws PN2 {
        if (we2.j() >= 7) {
            C10792xn c10792xn = new C10792xn();
            q(we2, c10792xn);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean i4 = c10792xn.i(i);
                    i--;
                    c5672cs.h(i2, (c5672cs.d() - 11) + i3, i4);
                    c5672cs.h((c5672cs.d() - 11) + i3, i2, i4);
                }
            }
        }
    }
}
