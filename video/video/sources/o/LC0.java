package o;

/* loaded from: classes3.dex */
public final class LC0 {
    public static final LC0 h = new LC0(4201, 4096, 1);
    public static final LC0 i = new LC0(1033, 1024, 1);
    public static final LC0 j;
    public static final LC0 k;
    public static final LC0 l;
    public static final LC0 m;
    public static final LC0 n;

    /* renamed from: o  reason: collision with root package name */
    public static final LC0 f529o;
    public final int[] a;
    public final int[] b;
    public final MC0 c;
    public final MC0 d;
    public final int e;
    public final int f;
    public final int g;

    static {
        LC0 lc0 = new LC0(67, 64, 1);
        j = lc0;
        k = new LC0(19, 16, 1);
        l = new LC0(285, 256, 0);
        LC0 lc02 = new LC0(301, 256, 1);
        m = lc02;
        n = lc02;
        f529o = lc0;
    }

    public LC0(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new MC0(this, new int[]{0});
        this.d = new MC0(this, new int[]{1});
    }

    public static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    public MC0 b(int i2, int i3) {
        if (i2 >= 0) {
            if (i3 == 0) {
                return this.c;
            }
            int[] iArr = new int[i2 + 1];
            iArr[0] = i3;
            return new MC0(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public int c(int i2) {
        return this.a[i2];
    }

    public int d() {
        return this.g;
    }

    public MC0 e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public MC0 g() {
        return this.c;
    }

    public int h(int i2) {
        if (i2 != 0) {
            return this.a[(this.e - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i2, int i3) {
        if (i2 != 0 && i3 != 0) {
            int[] iArr = this.a;
            int[] iArr2 = this.b;
            return iArr[(iArr2[i2] + iArr2[i3]) % (this.e - 1)];
        }
        return 0;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
