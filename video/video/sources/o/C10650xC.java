package o;

/* renamed from: o.xC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10650xC<E> {
    public E[] a;
    public int b;
    public int c;
    public int d;

    public C10650xC() {
        this(0, 1, null);
    }

    public final void a(E e) {
        int i = (this.b - 1) & this.d;
        this.b = i;
        this.a[i] = e;
        if (i == this.c) {
            d();
        }
    }

    public final void b(E e) {
        E[] eArr = this.a;
        int i = this.c;
        eArr[i] = e;
        int i2 = this.d & (i + 1);
        this.c = i2;
        if (i2 == this.b) {
            d();
        }
    }

    public final void c() {
        l(m());
    }

    public final void d() {
        E[] eArr = this.a;
        int length = eArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = (E[]) new Object[i3];
            C4788Ye.B0(eArr, eArr2, 0, i, length);
            C4788Ye.B0(this.a, eArr2, i2, 0, this.b);
            this.a = eArr2;
            this.b = 0;
            this.c = length;
            this.d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final E e(int i) {
        if (i >= 0 && i < m()) {
            E e = this.a[this.d & (this.b + i)];
            C6562gT0.m(e);
            return e;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E f() {
        int i = this.b;
        if (i != this.c) {
            E e = this.a[i];
            C6562gT0.m(e);
            return e;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E g() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            E e = this.a[(i2 - 1) & this.d];
            C6562gT0.m(e);
            return e;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean h() {
        if (this.b == this.c) {
            return true;
        }
        return false;
    }

    public final E i() {
        int i = this.b;
        if (i != this.c) {
            E[] eArr = this.a;
            E e = eArr[i];
            eArr[i] = null;
            this.b = (i + 1) & this.d;
            return e;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E j() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            int i3 = this.d & (i2 - 1);
            E[] eArr = this.a;
            E e = eArr[i3];
            eArr[i3] = null;
            this.c = i3;
            return e;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void k(int i) {
        int i2;
        if (i > 0) {
            if (i <= m()) {
                int i3 = this.c;
                if (i < i3) {
                    i2 = i3 - i;
                } else {
                    i2 = 0;
                }
                for (int i4 = i2; i4 < i3; i4++) {
                    this.a[i4] = null;
                }
                int i5 = this.c;
                int i6 = i5 - i2;
                int i7 = i - i6;
                this.c = i5 - i6;
                if (i7 > 0) {
                    int length = this.a.length;
                    this.c = length;
                    int i8 = length - i7;
                    for (int i9 = i8; i9 < length; i9++) {
                        this.a[i9] = null;
                    }
                    this.c = i8;
                    return;
                }
                return;
            }
            C5765dF c5765dF = C5765dF.a;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final void l(int i) {
        if (i > 0) {
            if (i <= m()) {
                int length = this.a.length;
                int i2 = this.b;
                if (i < length - i2) {
                    length = i2 + i;
                }
                while (i2 < length) {
                    this.a[i2] = null;
                    i2++;
                }
                int i3 = this.b;
                int i4 = length - i3;
                int i5 = i - i4;
                this.b = this.d & (i3 + i4);
                if (i5 > 0) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        this.a[i6] = null;
                    }
                    this.b = i5;
                    return;
                }
                return;
            }
            C5765dF c5765dF = C5765dF.a;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final int m() {
        return (this.c - this.b) & this.d;
    }

    public C10650xC(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.d = i - 1;
            this.a = (E[]) new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }

    public /* synthetic */ C10650xC(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
