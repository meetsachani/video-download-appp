package o;

/* renamed from: o.Dn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2763Dn {
    public final C2469An a;
    public final C2469An b;
    public final VE2 c;

    public C2763Dn(C2469An c2469An) throws C2605Bx0 {
        int i = c2469An.i();
        if (i >= 8 && i <= 144 && (i & 1) == 0) {
            this.c = j(c2469An);
            C2469An a = a(c2469An);
            this.a = a;
            this.b = new C2469An(a.m(), a.i());
            return;
        }
        throw C2605Bx0.a();
    }

    public static VE2 j(C2469An c2469An) throws C2605Bx0 {
        return VE2.h(c2469An.i(), c2469An.m());
    }

    public final C2469An a(C2469An c2469An) {
        int f = this.c.f();
        int e = this.c.e();
        if (c2469An.i() == f) {
            int c = this.c.c();
            int b = this.c.b();
            int i = f / c;
            int i2 = e / b;
            C2469An c2469An2 = new C2469An(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (c2469An.f(((b + 2) * i5) + 1 + i10, i8)) {
                                c2469An2.q(i6 + i10, i9);
                            }
                        }
                    }
                }
            }
            return c2469An2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    public VE2 b() {
        return this.c;
    }

    public byte[] c() throws C2605Bx0 {
        byte[] bArr = new byte[this.c.g()];
        int i = this.a.i();
        int m = this.a.m();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 4;
        while (true) {
            if (i4 == i && i2 == 0 && !z) {
                bArr[i3] = (byte) d(i, m);
                i4 -= 2;
                i2 += 2;
                i3++;
                z = true;
            } else {
                int i5 = i - 2;
                if (i4 == i5 && i2 == 0 && (m & 3) != 0 && !z2) {
                    bArr[i3] = (byte) e(i, m);
                    i4 -= 2;
                    i2 += 2;
                    i3++;
                    z2 = true;
                } else if (i4 == i + 4 && i2 == 2 && (m & 7) == 0 && !z3) {
                    bArr[i3] = (byte) f(i, m);
                    i4 -= 2;
                    i2 += 2;
                    i3++;
                    z3 = true;
                } else if (i4 == i5 && i2 == 0 && (m & 7) == 4 && !z4) {
                    bArr[i3] = (byte) g(i, m);
                    i4 -= 2;
                    i2 += 2;
                    i3++;
                    z4 = true;
                } else {
                    while (true) {
                        if (i4 < i && i2 >= 0 && !this.b.f(i2, i4)) {
                            bArr[i3] = (byte) i(i4, i2, i, m);
                            i3++;
                        }
                        int i6 = i4 - 2;
                        int i7 = i2 + 2;
                        if (i6 < 0 || i7 >= m) {
                            break;
                        }
                        i4 = i6;
                        i2 = i7;
                    }
                    int i8 = i4 - 1;
                    int i9 = i2 + 5;
                    while (true) {
                        if (i8 >= 0 && i9 < m && !this.b.f(i9, i8)) {
                            bArr[i3] = (byte) i(i8, i9, i, m);
                            i3++;
                        }
                        int i10 = i8 + 2;
                        int i11 = i9 - 2;
                        if (i10 >= i || i11 < 0) {
                            break;
                        }
                        i8 = i10;
                        i9 = i11;
                    }
                    i4 = i8 + 5;
                    i2 = i9 - 1;
                }
            }
            if (i4 >= i && i2 >= m) {
                break;
            }
        }
        if (i3 == this.c.g()) {
            return bArr;
        }
        throw C2605Bx0.a();
    }

    public final int d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(3, i8, i, i2)) {
            return i11 | 1;
        }
        return i11;
    }

    public final int e(int i, int i2) {
        int i3 = (h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (h(1, i9, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    public final int f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(1, i5, i, i2)) {
            return i13 | 1;
        }
        return i13;
    }

    public final int g(int i, int i2) {
        int i3 = (h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (h(3, i7, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    public final boolean h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.b.q(i2, i);
        return this.a.f(i2, i);
    }

    public final int i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(i, i2, i3, i4)) {
            return i15 | 1;
        }
        return i15;
    }
}
