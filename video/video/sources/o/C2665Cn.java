package o;

/* renamed from: o.Cn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2665Cn {
    public final C2469An a;
    public WE2 b;
    public C3008Fx0 c;
    public boolean d;

    public C2665Cn(C2469An c2469An) throws C2605Bx0 {
        int i = c2469An.i();
        if (i >= 21 && (i & 3) == 1) {
            this.a = c2469An;
            return;
        }
        throw C2605Bx0.a();
    }

    public final int a(int i, int i2, int i3) {
        boolean f;
        if (this.d) {
            f = this.a.f(i2, i);
        } else {
            f = this.a.f(i, i2);
        }
        if (f) {
            return (i3 << 1) | 1;
        }
        return i3 << 1;
    }

    public void b() {
        int i = 0;
        while (i < this.a.m()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.a.i(); i3++) {
                if (this.a.f(i, i3) != this.a.f(i3, i)) {
                    this.a.e(i3, i);
                    this.a.e(i, i3);
                }
            }
            i = i2;
        }
    }

    public byte[] c() throws C2605Bx0 {
        int i;
        C3008Fx0 d = d();
        WE2 e = e();
        EnumC10479wU enumC10479wU = EnumC10479wU.values()[d.c()];
        int i2 = this.a.i();
        enumC10479wU.g(this.a, i2);
        C2469An a = e.a();
        byte[] bArr = new byte[e.h()];
        int i3 = i2 - 1;
        boolean z = true;
        int i4 = i3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 > 0) {
            if (i4 == 6) {
                i4--;
            }
            for (int i8 = 0; i8 < i2; i8++) {
                if (z) {
                    i = i3 - i8;
                } else {
                    i = i8;
                }
                for (int i9 = 0; i9 < 2; i9++) {
                    int i10 = i4 - i9;
                    if (!a.f(i10, i)) {
                        i6++;
                        i7 <<= 1;
                        if (this.a.f(i10, i)) {
                            i7 |= 1;
                        }
                        if (i6 == 8) {
                            bArr[i5] = (byte) i7;
                            i5++;
                            i6 = 0;
                            i7 = 0;
                        }
                    }
                }
            }
            z = !z;
            i4 -= 2;
        }
        if (i5 == e.h()) {
            return bArr;
        }
        throw C2605Bx0.a();
    }

    public C3008Fx0 d() throws C2605Bx0 {
        C3008Fx0 c3008Fx0 = this.c;
        if (c3008Fx0 != null) {
            return c3008Fx0;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = a(i3, 8, i2);
        }
        int a = a(8, 7, a(8, 8, a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = a(8, i4, a);
        }
        int i5 = this.a.i();
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = a(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = a(i8, 8, i);
        }
        C3008Fx0 a2 = C3008Fx0.a(a, i);
        this.c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C2605Bx0.a();
    }

    public WE2 e() throws C2605Bx0 {
        WE2 we2 = this.b;
        if (we2 != null) {
            return we2;
        }
        int i = this.a.i();
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return WE2.i(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = a(i7, i6, i5);
            }
        }
        WE2 c = WE2.c(i5);
        if (c != null && c.e() == i) {
            this.b = c;
            return c;
        }
        for (int i8 = 5; i8 >= 0; i8--) {
            for (int i9 = i - 9; i9 >= i3; i9--) {
                i4 = a(i8, i9, i4);
            }
        }
        WE2 c2 = WE2.c(i4);
        if (c2 != null && c2.e() == i) {
            this.b = c2;
            return c2;
        }
        throw C2605Bx0.a();
    }

    public void f() {
        if (this.c == null) {
            return;
        }
        EnumC10479wU.values()[this.c.c()].g(this.a, this.a.i());
    }

    public void g(boolean z) {
        this.b = null;
        this.c = null;
        this.d = z;
    }
}
