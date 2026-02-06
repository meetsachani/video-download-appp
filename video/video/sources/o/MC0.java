package o;

/* loaded from: classes3.dex */
public final class MC0 {
    public final LC0 a;
    public final int[] b;

    public MC0(LC0 lc0, int[] iArr) {
        if (iArr.length != 0) {
            this.a = lc0;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public MC0 a(MC0 mc0) {
        if (this.a.equals(mc0.a)) {
            if (g()) {
                return mc0;
            }
            if (mc0.g()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = mc0.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = LC0.a(iArr2[i - length], iArr[i]);
            }
            return new MC0(this.a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public MC0[] b(MC0 mc0) {
        if (this.a.equals(mc0.a)) {
            if (!mc0.g()) {
                MC0 g = this.a.g();
                int h = this.a.h(mc0.d(mc0.f()));
                MC0 mc02 = this;
                while (mc02.f() >= mc0.f() && !mc02.g()) {
                    int f = mc02.f() - mc0.f();
                    int j = this.a.j(mc02.d(mc02.f()), h);
                    MC0 j2 = mc0.j(f, j);
                    g = g.a(this.a.b(f, j));
                    mc02 = mc02.a(j2);
                }
                return new MC0[]{g, mc02};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public int c(int i) {
        if (i == 0) {
            return d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.b) {
                i2 = LC0.a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = LC0.a(this.a.j(i, i4), this.b[i5]);
        }
        return i4;
    }

    public int d(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public int[] e() {
        return this.b;
    }

    public int f() {
        return this.b.length - 1;
    }

    public boolean g() {
        if (this.b[0] != 0) {
            return false;
        }
        return true;
    }

    public MC0 h(int i) {
        if (i == 0) {
            return this.a.g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.j(this.b[i2], i);
        }
        return new MC0(this.a, iArr);
    }

    public MC0 i(MC0 mc0) {
        if (this.a.equals(mc0.a)) {
            if (!g() && !mc0.g()) {
                int[] iArr = this.b;
                int length = iArr.length;
                int[] iArr2 = mc0.b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = LC0.a(iArr3[i4], this.a.j(i2, iArr2[i3]));
                    }
                }
                return new MC0(this.a, iArr3);
            }
            return this.a.g();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public MC0 j(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.a.g();
            }
            int length = this.b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.j(this.b[i3], i2);
            }
            return new MC0(this.a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(f() * 8);
        for (int f = f(); f >= 0; f--) {
            int d = d(f);
            if (d != 0) {
                if (d < 0) {
                    sb.append(" - ");
                    d = -d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (f == 0 || d != 1) {
                    int i = this.a.i(d);
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (f != 0) {
                    if (f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
