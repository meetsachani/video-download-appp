package o;

/* loaded from: classes3.dex */
public final class KP1 {
    public final LC0 a;

    public KP1(LC0 lc0) {
        this.a = lc0;
    }

    public void a(int[] iArr, int i) throws MP1 {
        MC0 mc0 = new MC0(this.a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            LC0 lc0 = this.a;
            int c = mc0.c(lc0.c(lc0.d() + i2));
            iArr2[(i - 1) - i2] = c;
            if (c != 0) {
                z = false;
            }
        }
        if (!z) {
            MC0[] d = d(this.a.b(i, 1), new MC0(this.a, iArr2), i);
            MC0 mc02 = d[0];
            MC0 mc03 = d[1];
            int[] b = b(mc02);
            int[] c2 = c(mc03, b);
            for (int i3 = 0; i3 < b.length; i3++) {
                int length = (iArr.length - 1) - this.a.i(b[i3]);
                if (length >= 0) {
                    iArr[length] = LC0.a(iArr[length], c2[i3]);
                } else {
                    throw new MP1("Bad error location");
                }
            }
        }
    }

    public final int[] b(MC0 mc0) throws MP1 {
        int f = mc0.f();
        if (f == 1) {
            return new int[]{mc0.d(1)};
        }
        int[] iArr = new int[f];
        int i = 0;
        for (int i2 = 1; i2 < this.a.f() && i < f; i2++) {
            if (mc0.c(i2) == 0) {
                iArr[i] = this.a.h(i2);
                i++;
            }
        }
        if (i == f) {
            return iArr;
        }
        throw new MP1("Error locator degree does not match number of roots");
    }

    public final int[] c(MC0 mc0, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int h = this.a.h(iArr[i2]);
            int i3 = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i2 != i4) {
                    int j = this.a.j(iArr[i4], h);
                    if ((j & 1) == 0) {
                        i = j | 1;
                    } else {
                        i = j & (-2);
                    }
                    i3 = this.a.j(i3, i);
                }
            }
            iArr2[i2] = this.a.j(mc0.c(h), this.a.h(i3));
            if (this.a.d() != 0) {
                iArr2[i2] = this.a.j(iArr2[i2], h);
            }
        }
        return iArr2;
    }

    public final MC0[] d(MC0 mc0, MC0 mc02, int i) throws MP1 {
        if (mc0.f() < mc02.f()) {
            mc02 = mc0;
            mc0 = mc02;
        }
        MC0 g = this.a.g();
        MC0 e = this.a.e();
        do {
            MC0 mc03 = mc02;
            mc02 = mc0;
            mc0 = mc03;
            MC0 mc04 = e;
            MC0 mc05 = g;
            g = mc04;
            if (mc0.f() >= i / 2) {
                if (!mc0.g()) {
                    MC0 g2 = this.a.g();
                    int h = this.a.h(mc0.d(mc0.f()));
                    while (mc02.f() >= mc0.f() && !mc02.g()) {
                        int f = mc02.f() - mc0.f();
                        int j = this.a.j(mc02.d(mc02.f()), h);
                        g2 = g2.a(this.a.b(f, j));
                        mc02 = mc02.a(mc0.j(f, j));
                    }
                    e = g2.i(g).a(mc05);
                } else {
                    throw new MP1("r_{i-1} was zero");
                }
            } else {
                int d = g.d(0);
                if (d != 0) {
                    int h2 = this.a.h(d);
                    return new MC0[]{g.h(h2), mc0.h(h2)};
                }
                throw new MP1("sigmaTilde(0) was zero");
            }
        } while (mc02.f() < mc0.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
