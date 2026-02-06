package o;

/* loaded from: classes3.dex */
public final class G20 {
    public static final int[] g = {3808, 476, 2107, 1799};
    public final C2469An a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    /* loaded from: classes3.dex */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public UT1 c() {
            return new UT1(a(), b());
        }

        public String toString() {
            return "<" + this.a + ' ' + this.b + '>';
        }
    }

    public G20(C2469An c2469An) {
        this.a = c2469An;
    }

    public static float c(a aVar, a aVar2) {
        return C9044qd1.b(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    public static float d(UT1 ut1, UT1 ut12) {
        return C9044qd1.a(ut1.c(), ut1.d(), ut12.c(), ut12.d());
    }

    public static UT1[] e(UT1[] ut1Arr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float c = ut1Arr[0].c() - ut1Arr[2].c();
        float d = ut1Arr[0].d() - ut1Arr[2].d();
        float c2 = (ut1Arr[0].c() + ut1Arr[2].c()) / 2.0f;
        float d2 = (ut1Arr[0].d() + ut1Arr[2].d()) / 2.0f;
        float f2 = c * f;
        float f3 = d * f;
        UT1 ut1 = new UT1(c2 + f2, d2 + f3);
        UT1 ut12 = new UT1(c2 - f2, d2 - f3);
        float c3 = ut1Arr[1].c() - ut1Arr[3].c();
        float d3 = ut1Arr[1].d() - ut1Arr[3].d();
        float c4 = (ut1Arr[1].c() + ut1Arr[3].c()) / 2.0f;
        float d4 = (ut1Arr[1].d() + ut1Arr[3].d()) / 2.0f;
        float f4 = c3 * f;
        float f5 = f * d3;
        return new UT1[]{ut1, new UT1(c4 + f4, d4 + f5), ut12, new UT1(c4 - f4, d4 - f5)};
    }

    public static int i(long j, boolean z) throws C9349rr1 {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new KP1(LC0.k).a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (MP1 unused) {
            throw C9349rr1.a();
        }
    }

    public static int n(int[] iArr, int i) throws C9349rr1 {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C9349rr1.a();
    }

    public C5398bk a() throws C9349rr1 {
        return b(false);
    }

    public C5398bk b(boolean z) throws C9349rr1 {
        UT1[] g2 = g(l());
        if (z) {
            UT1 ut1 = g2[0];
            g2[0] = g2[2];
            g2[2] = ut1;
        }
        f(g2);
        C2469An c2469An = this.a;
        int i = this.f;
        return new C5398bk(r(c2469An, g2[i % 4], g2[(i + 1) % 4], g2[(i + 2) % 4], g2[(i + 3) % 4]), m(g2), this.b, this.d, this.c);
    }

    public final void f(UT1[] ut1Arr) throws C9349rr1 {
        long j;
        long j2;
        if (p(ut1Arr[0]) && p(ut1Arr[1]) && p(ut1Arr[2]) && p(ut1Arr[3])) {
            int i = this.e * 2;
            int[] iArr = {s(ut1Arr[0], ut1Arr[1], i), s(ut1Arr[1], ut1Arr[2], i), s(ut1Arr[2], ut1Arr[3], i), s(ut1Arr[3], ut1Arr[0], i)};
            this.f = n(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.f + i2) % 4];
                if (this.b) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int i4 = i(j3, this.b);
            if (this.b) {
                this.c = (i4 >> 6) + 1;
                this.d = (i4 & 63) + 1;
                return;
            }
            this.c = (i4 >> 11) + 1;
            this.d = (i4 & 2047) + 1;
            return;
        }
        throw C9349rr1.a();
    }

    public final UT1[] g(a aVar) throws C9349rr1 {
        int i;
        boolean z = true;
        this.e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        boolean z2 = true;
        while (this.e < 9) {
            a k = k(aVar, z2, 1, -1);
            a k2 = k(aVar2, z2, 1, 1);
            a k3 = k(aVar3, z2, -1, 1);
            a k4 = k(aVar4, z2, -1, -1);
            if (this.e > 2) {
                double c = (c(k4, k) * this.e) / (c(aVar4, aVar) * (this.e + 2));
                if (c < 0.75d || c > 1.25d || !q(k, k2, k3, k4)) {
                    break;
                }
            }
            z2 = !z2;
            this.e++;
            aVar4 = k4;
            aVar = k;
            aVar2 = k2;
            aVar3 = k3;
        }
        int i2 = this.e;
        if (i2 != 5 && i2 != 7) {
            throw C9349rr1.a();
        }
        if (i2 != 5) {
            z = false;
        }
        this.b = z;
        return e(new UT1[]{new UT1(aVar.a() + 0.5f, aVar.b() - 0.5f), new UT1(aVar2.a() + 0.5f, aVar2.b() + 0.5f), new UT1(aVar3.a() - 0.5f, aVar3.b() + 0.5f), new UT1(aVar4.a() - 0.5f, aVar4.b() - 0.5f)}, (i * 2) - 3, this.e * 2);
    }

    public final int h(a aVar, a aVar2) {
        float c = c(aVar, aVar2);
        float a2 = (aVar2.a() - aVar.a()) / c;
        float b = (aVar2.b() - aVar.b()) / c;
        float a3 = aVar.a();
        float b2 = aVar.b();
        boolean f = this.a.f(aVar.a(), aVar.b());
        int ceil = (int) Math.ceil(c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a3 += a2;
            b2 += b;
            if (this.a.f(C9044qd1.c(a3), C9044qd1.c(b2)) != f) {
                i++;
            }
        }
        float f2 = i / c;
        if (f2 > 0.1f && f2 < 0.9f) {
            return 0;
        }
        if (f2 <= 0.1f) {
            z = true;
        }
        if (z == f) {
            return 1;
        }
        return -1;
    }

    public final int j() {
        if (this.b) {
            return (this.c * 4) + 11;
        }
        int i = this.c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    public final a k(a aVar, boolean z, int i, int i2) {
        int a2 = aVar.a() + i;
        int b = aVar.b();
        while (true) {
            b += i2;
            if (!o(a2, b) || this.a.f(a2, b) != z) {
                break;
            }
            a2 += i;
        }
        int i3 = a2 - i;
        int i4 = b - i2;
        while (o(i3, i4) && this.a.f(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (o(i5, i4) && this.a.f(i5, i4) == z) {
            i4 += i2;
        }
        return new a(i5, i4 - i2);
    }

    public final a l() {
        UT1 c;
        UT1 ut1;
        UT1 ut12;
        UT1 ut13;
        UT1 c2;
        UT1 c3;
        UT1 c4;
        UT1 c5;
        try {
            UT1[] c6 = new RK2(this.a).c();
            ut12 = c6[0];
            ut13 = c6[1];
            ut1 = c6[2];
            c = c6[3];
        } catch (C9349rr1 unused) {
            int m = this.a.m() / 2;
            int i = this.a.i() / 2;
            int i2 = m + 7;
            int i3 = i - 7;
            UT1 c7 = k(new a(i2, i3), false, 1, -1).c();
            int i4 = i + 7;
            UT1 c8 = k(new a(i2, i4), false, 1, 1).c();
            int i5 = m - 7;
            UT1 c9 = k(new a(i5, i4), false, -1, 1).c();
            c = k(new a(i5, i3), false, -1, -1).c();
            ut1 = c9;
            ut12 = c7;
            ut13 = c8;
        }
        int c10 = C9044qd1.c((((ut12.c() + c.c()) + ut13.c()) + ut1.c()) / 4.0f);
        int c11 = C9044qd1.c((((ut12.d() + c.d()) + ut13.d()) + ut1.d()) / 4.0f);
        try {
            UT1[] c12 = new RK2(this.a, 15, c10, c11).c();
            c2 = c12[0];
            c3 = c12[1];
            c4 = c12[2];
            c5 = c12[3];
        } catch (C9349rr1 unused2) {
            int i6 = c10 + 7;
            int i7 = c11 - 7;
            c2 = k(new a(i6, i7), false, 1, -1).c();
            int i8 = c11 + 7;
            c3 = k(new a(i6, i8), false, 1, 1).c();
            int i9 = c10 - 7;
            c4 = k(new a(i9, i8), false, -1, 1).c();
            c5 = k(new a(i9, i7), false, -1, -1).c();
        }
        return new a(C9044qd1.c((((c2.c() + c5.c()) + c3.c()) + c4.c()) / 4.0f), C9044qd1.c((((c2.d() + c5.d()) + c3.d()) + c4.d()) / 4.0f));
    }

    public final UT1[] m(UT1[] ut1Arr) {
        return e(ut1Arr, this.e * 2, j());
    }

    public final boolean o(int i, int i2) {
        if (i >= 0 && i < this.a.m() && i2 > 0 && i2 < this.a.i()) {
            return true;
        }
        return false;
    }

    public final boolean p(UT1 ut1) {
        return o(C9044qd1.c(ut1.c()), C9044qd1.c(ut1.d()));
    }

    public final boolean q(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int h = h(aVar8, aVar5);
        if (h == 0 || h(aVar5, aVar6) != h || h(aVar6, aVar7) != h || h(aVar7, aVar8) != h) {
            return false;
        }
        return true;
    }

    public final C2469An r(C2469An c2469An, UT1 ut1, UT1 ut12, UT1 ut13, UT1 ut14) throws C9349rr1 {
        SE0 b = SE0.b();
        int j = j();
        float f = j / 2.0f;
        int i = this.e;
        float f2 = f - i;
        float f3 = f + i;
        return b.c(c2469An, j, j, f2, f2, f3, f2, f3, f3, f2, f3, ut1.c(), ut1.d(), ut12.c(), ut12.d(), ut13.c(), ut13.d(), ut14.c(), ut14.d());
    }

    public final int s(UT1 ut1, UT1 ut12, int i) {
        float d = d(ut1, ut12);
        float f = d / i;
        float c = ut1.c();
        float d2 = ut1.d();
        float c2 = ((ut12.c() - ut1.c()) * f) / d;
        float d3 = (f * (ut12.d() - ut1.d())) / d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.a.f(C9044qd1.c((f2 * c2) + c), C9044qd1.c((f2 * d3) + d2))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
