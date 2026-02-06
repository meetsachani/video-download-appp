package o;

/* renamed from: o.ke0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7570ke0 {
    public final C2459Ak1 a = C2459Ak1.f;

    public int a(int[] iArr, int i, int[] iArr2) throws UB {
        C2557Bk1 c2557Bk1 = new C2557Bk1(this.a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int b = c2557Bk1.b(this.a.c(i2));
            iArr3[i - i2] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C2557Bk1 d = this.a.d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int c = this.a.c((iArr.length - 1) - i3);
                C2459Ak1 c2459Ak1 = this.a;
                d = d.h(new C2557Bk1(c2459Ak1, new int[]{c2459Ak1.j(0, c), 1}));
            }
        }
        C2557Bk1[] d2 = d(this.a.b(i, 1), new C2557Bk1(this.a, iArr3), i);
        C2557Bk1 c2557Bk12 = d2[0];
        C2557Bk1 c2557Bk13 = d2[1];
        int[] b2 = b(c2557Bk12);
        int[] c2 = c(c2557Bk13, c2557Bk12, b2);
        for (int i4 = 0; i4 < b2.length; i4++) {
            int length = (iArr.length - 1) - this.a.h(b2[i4]);
            if (length >= 0) {
                iArr[length] = this.a.j(iArr[length], c2[i4]);
            } else {
                throw UB.a();
            }
        }
        return b2.length;
    }

    public final int[] b(C2557Bk1 c2557Bk1) throws UB {
        int e = c2557Bk1.e();
        int[] iArr = new int[e];
        int i = 0;
        for (int i2 = 1; i2 < this.a.e() && i < e; i2++) {
            if (c2557Bk1.b(i2) == 0) {
                iArr[i] = this.a.g(i2);
                i++;
            }
        }
        if (i == e) {
            return iArr;
        }
        throw UB.a();
    }

    public final int[] c(C2557Bk1 c2557Bk1, C2557Bk1 c2557Bk12, int[] iArr) {
        int e = c2557Bk12.e();
        int[] iArr2 = new int[e];
        for (int i = 1; i <= e; i++) {
            iArr2[e - i] = this.a.i(i, c2557Bk12.c(i));
        }
        C2557Bk1 c2557Bk13 = new C2557Bk1(this.a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.a.g(iArr[i2]);
            iArr3[i2] = this.a.i(this.a.j(0, c2557Bk1.b(g)), this.a.g(c2557Bk13.b(g)));
        }
        return iArr3;
    }

    public final C2557Bk1[] d(C2557Bk1 c2557Bk1, C2557Bk1 c2557Bk12, int i) throws UB {
        if (c2557Bk1.e() < c2557Bk12.e()) {
            c2557Bk12 = c2557Bk1;
            c2557Bk1 = c2557Bk12;
        }
        C2557Bk1 f = this.a.f();
        C2557Bk1 d = this.a.d();
        while (true) {
            C2557Bk1 c2557Bk13 = c2557Bk12;
            c2557Bk12 = c2557Bk1;
            c2557Bk1 = c2557Bk13;
            C2557Bk1 c2557Bk14 = d;
            C2557Bk1 c2557Bk15 = f;
            f = c2557Bk14;
            if (c2557Bk1.e() >= i / 2) {
                if (!c2557Bk1.f()) {
                    C2557Bk1 f2 = this.a.f();
                    int g = this.a.g(c2557Bk1.c(c2557Bk1.e()));
                    while (c2557Bk12.e() >= c2557Bk1.e() && !c2557Bk12.f()) {
                        int e = c2557Bk12.e() - c2557Bk1.e();
                        int i2 = this.a.i(c2557Bk12.c(c2557Bk12.e()), g);
                        f2 = f2.a(this.a.b(e, i2));
                        c2557Bk12 = c2557Bk12.k(c2557Bk1.i(e, i2));
                    }
                    d = f2.h(f).k(c2557Bk15).j();
                } else {
                    throw UB.a();
                }
            } else {
                int c = f.c(0);
                if (c != 0) {
                    int g2 = this.a.g(c);
                    return new C2557Bk1[]{f.g(g2), c2557Bk1.g(g2)};
                }
                throw UB.a();
            }
        }
    }
}
