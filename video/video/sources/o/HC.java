package o;

/* loaded from: classes.dex */
public final class HC {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public HC() {
        this(0, 1, null);
    }

    public final void a(int i) {
        int i2 = (this.b - 1) & this.d;
        this.b = i2;
        this.a[i2] = i;
        if (i2 == this.c) {
            d();
        }
    }

    public final void b(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        if (i3 == this.b) {
            d();
        }
    }

    public final void c() {
        this.c = this.b;
    }

    public final void d() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            C4788Ye.z0(iArr, iArr2, 0, i, length);
            C4788Ye.z0(this.a, iArr2, i2, 0, this.b);
            this.a = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final int e(int i) {
        if (i >= 0 && i < m()) {
            return this.a[this.d & (this.b + i)];
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int f() {
        int i = this.b;
        if (i != this.c) {
            return this.a[i];
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int g() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            return this.a[(i2 - 1) & this.d];
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

    public final int i() {
        int i = this.b;
        if (i != this.c) {
            int i2 = this.a[i];
            this.b = (i + 1) & this.d;
            return i2;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int j() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            int i3 = this.d & (i2 - 1);
            int i4 = this.a[i3];
            this.c = i3;
            return i4;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void k(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= m()) {
            this.c = this.d & (this.c - i);
            return;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void l(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= m()) {
            this.b = this.d & (this.b + i);
            return;
        }
        C5765dF c5765dF = C5765dF.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int m() {
        return (this.c - this.b) & this.d;
    }

    public HC(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.d = i - 1;
            this.a = new int[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }

    public /* synthetic */ HC(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
