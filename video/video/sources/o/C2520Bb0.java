package o;

/* renamed from: o.Bb0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2520Bb0 {
    public static final int a = 33;
    public static final int b = 0;
    public static final int c = 32;
    public static final int d = 4;
    public static final int[] e = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(C10792xn c10792xn, int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        int m = c10792xn.m() / i;
        for (int i4 = 0; i4 < m; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                if (c10792xn.i((i4 * i) + i6)) {
                    i3 = 1 << ((i - i6) - 1);
                } else {
                    i3 = 0;
                }
                i5 |= i3;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    public static void b(C2469An c2469An, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    c2469An.q(i5, i4);
                    c2469An.q(i5, i6);
                    c2469An.q(i4, i5);
                    c2469An.q(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        c2469An.q(i7, i7);
        int i8 = i7 + 1;
        c2469An.q(i8, i7);
        c2469An.q(i7, i8);
        int i9 = i + i2;
        c2469An.q(i9, i7);
        c2469An.q(i9, i8);
        c2469An.q(i9, i9 - 1);
    }

    public static void c(C2469An c2469An, boolean z, int i, C10792xn c10792xn) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (c10792xn.i(i3)) {
                    c2469An.q(i4, i2 - 5);
                }
                if (c10792xn.i(i3 + 7)) {
                    c2469An.q(i2 + 5, i4);
                }
                if (c10792xn.i(20 - i3)) {
                    c2469An.q(i4, i2 + 5);
                }
                if (c10792xn.i(27 - i3)) {
                    c2469An.q(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (c10792xn.i(i3)) {
                c2469An.q(i5, i2 - 7);
            }
            if (c10792xn.i(i3 + 10)) {
                c2469An.q(i2 + 7, i5);
            }
            if (c10792xn.i(29 - i3)) {
                c2469An.q(i5, i2 + 7);
            }
            if (c10792xn.i(39 - i3)) {
                c2469An.q(i2 - 7, i5);
            }
            i3++;
        }
    }

    public static C5155ak d(byte[] bArr) {
        return e(bArr, 33, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5155ak e(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        C10792xn c10792xn;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C10792xn a2 = new JH0(bArr).a();
        int i11 = 11;
        int m = ((a2.m() * i) / 100) + 11;
        int m2 = a2.m() + m;
        int i12 = 32;
        int i13 = 1;
        if (i2 != 0) {
            if (i2 < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            i5 = Math.abs(i2);
            if (z2) {
                i12 = 4;
            }
            if (i5 <= i12) {
                i6 = j(i5, z2);
                i4 = e[i5];
                int i14 = i6 - (i6 % i4);
                c10792xn = i(a2, i4);
                if (c10792xn.m() + m <= i14) {
                    if (z2 && c10792xn.m() > (i4 << 6)) {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    }
                } else {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
        } else {
            C10792xn c10792xn2 = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 <= 32) {
                if (i15 <= 3) {
                    z = i13;
                } else {
                    z = false;
                }
                if (z) {
                    i3 = i15 + 1;
                } else {
                    i3 = i15;
                }
                int j = j(i3, z);
                if (m2 <= j) {
                    if (c10792xn2 == null || i16 != e[i3]) {
                        int i17 = e[i3];
                        i16 = i17;
                        c10792xn2 = i(a2, i17);
                    }
                    int i18 = j - (j % i16);
                    if ((!z || c10792xn2.m() <= (i16 << 6)) && c10792xn2.m() + m <= i18) {
                        c10792xn = c10792xn2;
                        i4 = i16;
                        z2 = z;
                        i5 = i3;
                        i6 = j;
                    }
                }
                i15++;
                i13 = i13;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C10792xn f = f(c10792xn, i6, i4);
        int m3 = c10792xn.m() / i4;
        C10792xn g = g(z2, i5, m3);
        if (!z2) {
            i11 = 14;
        }
        int i19 = i11 + (i5 << 2);
        int[] iArr = new int[i19];
        int i20 = 2;
        if (z2) {
            for (int i21 = 0; i21 < i19; i21++) {
                iArr[i21] = i21;
            }
            i7 = i19;
        } else {
            int i22 = i19 / 2;
            i7 = i19 + 1 + (((i22 - 1) / 15) * 2);
            int i23 = i7 / 2;
            for (int i24 = 0; i24 < i22; i24++) {
                iArr[(i22 - i24) - i13] = (i23 - i8) - 1;
                iArr[i22 + i24] = (i24 / 15) + i24 + i23 + i13;
            }
        }
        C2469An c2469An = new C2469An(i7);
        int i25 = 0;
        for (int i26 = 0; i26 < i5; i26++) {
            int i27 = (i5 - i26) << i20;
            if (z2) {
                i9 = 9;
            } else {
                i9 = 12;
            }
            int i28 = i27 + i9;
            for (int i29 = 0; i29 < i28; i29++) {
                int i30 = i29 << 1;
                int i31 = 0;
                while (i31 < i20) {
                    int i32 = i13;
                    if (f.i(i25 + i30 + i31)) {
                        int i33 = i26 << 1;
                        i10 = i20;
                        c2469An.q(iArr[i33 + i31], iArr[i33 + i29]);
                    } else {
                        i10 = i20;
                    }
                    if (f.i((i28 << 1) + i25 + i30 + i31)) {
                        int i34 = i26 << 1;
                        c2469An.q(iArr[i34 + i29], iArr[((i19 - 1) - i34) - i31]);
                    }
                    if (f.i((i28 << 2) + i25 + i30 + i31)) {
                        int i35 = (i19 - 1) - (i26 << 1);
                        c2469An.q(iArr[i35 - i31], iArr[i35 - i29]);
                    }
                    if (f.i((i28 * 6) + i25 + i30 + i31)) {
                        int i36 = i26 << 1;
                        c2469An.q(iArr[((i19 - 1) - i36) - i29], iArr[i36 + i31]);
                    }
                    i31++;
                    i13 = i32;
                    i20 = i10;
                }
            }
            i25 += i28 << 3;
        }
        c(c2469An, z2, i7, g);
        if (z2) {
            b(c2469An, i7 / 2, 5);
        } else {
            int i37 = i7 / 2;
            b(c2469An, i37, 7);
            int i38 = 0;
            int i39 = 0;
            while (i39 < (i19 / 2) - 1) {
                for (int i40 = i37 & 1; i40 < i7; i40 += 2) {
                    int i41 = i37 - i38;
                    c2469An.q(i41, i40);
                    int i42 = i37 + i38;
                    c2469An.q(i42, i40);
                    c2469An.q(i40, i41);
                    c2469An.q(i40, i42);
                }
                i39 += 15;
                i38 += 16;
            }
        }
        C5155ak c5155ak = new C5155ak();
        c5155ak.g(z2);
        c5155ak.j(i7);
        c5155ak.h(i5);
        c5155ak.f(m3);
        c5155ak.i(c2469An);
        return c5155ak;
    }

    public static C10792xn f(C10792xn c10792xn, int i, int i2) {
        LP1 lp1 = new LP1(h(i2));
        int i3 = i / i2;
        int[] a2 = a(c10792xn, i2, i3);
        lp1.b(a2, i3 - (c10792xn.m() / i2));
        C10792xn c10792xn2 = new C10792xn();
        c10792xn2.d(0, i % i2);
        for (int i4 : a2) {
            c10792xn2.d(i4, i2);
        }
        return c10792xn2;
    }

    public static C10792xn g(boolean z, int i, int i2) {
        C10792xn c10792xn = new C10792xn();
        if (z) {
            c10792xn.d(i - 1, 2);
            c10792xn.d(i2 - 1, 6);
            return f(c10792xn, 28, 4);
        }
        c10792xn.d(i - 1, 5);
        c10792xn.d(i2 - 1, 11);
        return f(c10792xn, 40, 4);
    }

    public static LC0 h(int i) {
        if (i != 4) {
            if (i != 6) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 12) {
                            return LC0.h;
                        }
                        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
                    }
                    return LC0.i;
                }
                return LC0.n;
            }
            return LC0.j;
        }
        return LC0.k;
    }

    public static C10792xn i(C10792xn c10792xn, int i) {
        C10792xn c10792xn2 = new C10792xn();
        int m = c10792xn.m();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < m) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= m || c10792xn.i(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                c10792xn2.d(i7, i);
            } else if (i7 == 0) {
                c10792xn2.d(i4 | 1, i);
            } else {
                c10792xn2.d(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return c10792xn2;
    }

    public static int j(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 88;
        } else {
            i2 = 112;
        }
        return (i2 + (i << 4)) * i;
    }
}
