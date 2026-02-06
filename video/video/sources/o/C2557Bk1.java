package o;

/* renamed from: o.Bk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2557Bk1 {
    public final C2459Ak1 a;
    public final int[] b;

    public C2557Bk1(C2459Ak1 c2459Ak1, int[] iArr) {
        if (iArr.length != 0) {
            this.a = c2459Ak1;
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

    public C2557Bk1 a(C2557Bk1 c2557Bk1) {
        if (this.a.equals(c2557Bk1.a)) {
            if (f()) {
                return c2557Bk1;
            }
            if (c2557Bk1.f()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = c2557Bk1.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.a.a(iArr2[i - length], iArr[i]);
            }
            return new C2557Bk1(this.a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public int b(int i) {
        if (i == 0) {
            return c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.b) {
                i2 = this.a.a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            C2459Ak1 c2459Ak1 = this.a;
            i4 = c2459Ak1.a(c2459Ak1.i(i, i4), this.b[i5]);
        }
        return i4;
    }

    public int c(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public int[] d() {
        return this.b;
    }

    public int e() {
        return this.b.length - 1;
    }

    public boolean f() {
        if (this.b[0] != 0) {
            return false;
        }
        return true;
    }

    public C2557Bk1 g(int i) {
        if (i == 0) {
            return this.a.f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.i(this.b[i2], i);
        }
        return new C2557Bk1(this.a, iArr);
    }

    public C2557Bk1 h(C2557Bk1 c2557Bk1) {
        if (this.a.equals(c2557Bk1.a)) {
            if (!f() && !c2557Bk1.f()) {
                int[] iArr = this.b;
                int length = iArr.length;
                int[] iArr2 = c2557Bk1.b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        C2459Ak1 c2459Ak1 = this.a;
                        iArr3[i4] = c2459Ak1.a(iArr3[i4], c2459Ak1.i(i2, iArr2[i3]));
                    }
                }
                return new C2557Bk1(this.a, iArr3);
            }
            return this.a.f();
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public C2557Bk1 i(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.a.f();
            }
            int length = this.b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.i(this.b[i3], i2);
            }
            return new C2557Bk1(this.a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public C2557Bk1 j() {
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.a.j(0, this.b[i]);
        }
        return new C2557Bk1(this.a, iArr);
    }

    public C2557Bk1 k(C2557Bk1 c2557Bk1) {
        if (this.a.equals(c2557Bk1.a)) {
            if (c2557Bk1.f()) {
                return this;
            }
            return a(c2557Bk1.j());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(e() * 8);
        for (int e = e(); e >= 0; e--) {
            int c = c(e);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (e == 0 || c != 1) {
                    sb.append(c);
                }
                if (e != 0) {
                    if (e == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(e);
                    }
                }
            }
        }
        return sb.toString();
    }
}
