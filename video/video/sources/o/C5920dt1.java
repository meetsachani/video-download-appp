package o;

import java.util.Arrays;
import o.C2565Bm1;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.dt1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5920dt1<K> {
    public static final int i = 1073741824;
    public static final float j = 1.0f;
    public static final long k = 4294967295L;
    public static final long l = -4294967296L;
    public static final int m = 3;
    public static final int n = -1;
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int d;
    public transient int[] e;
    @InterfaceC5299bJ2
    public transient long[] f;
    public transient float g;
    public transient int h;

    /* renamed from: o.dt1$a */
    /* loaded from: classes3.dex */
    public class a extends C2565Bm1.f<K> {
        @InterfaceC7894ly1
        public final K X;
        public int Y;

        public a(int i) {
            this.X = (K) C5920dt1.this.a[i];
            this.Y = i;
        }

        @Override // o.InterfaceC2467Am1.a
        @InterfaceC7894ly1
        public K a() {
            return this.X;
        }

        @InterfaceC6181ey
        public int b(int i) {
            c();
            int i2 = this.Y;
            if (i2 == -1) {
                C5920dt1.this.v(this.X, i);
                return 0;
            }
            int[] iArr = C5920dt1.this.b;
            int i3 = iArr[i2];
            iArr[i2] = i;
            return i3;
        }

        public void c() {
            int i = this.Y;
            if (i != -1 && i < C5920dt1.this.D() && C2593Bt1.a(this.X, C5920dt1.this.a[this.Y])) {
                return;
            }
            this.Y = C5920dt1.this.n(this.X);
        }

        @Override // o.InterfaceC2467Am1.a
        public int getCount() {
            c();
            int i = this.Y;
            if (i == -1) {
                return 0;
            }
            return C5920dt1.this.b[i];
        }
    }

    public C5920dt1() {
        o(3, 1.0f);
    }

    public static long E(long j2, int i2) {
        return (j2 & l) | (4294967295L & i2);
    }

    public static <K> C5920dt1<K> c() {
        return new C5920dt1<>();
    }

    public static <K> C5920dt1<K> d(int i2) {
        return new C5920dt1<>(i2);
    }

    public static int i(long j2) {
        return (int) (j2 >>> 32);
    }

    public static int k(long j2) {
        return (int) j2;
    }

    public static long[] r(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] s(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final void A(int i2) {
        int length = this.f.length;
        if (i2 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                z(max);
            }
        }
    }

    public final void B(int i2) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.g)) + 1;
        int[] s = s(i2);
        long[] jArr = this.f;
        int length = s.length - 1;
        for (int i4 = 0; i4 < this.c; i4++) {
            int i5 = i(jArr[i4]);
            int i6 = i5 & length;
            int i7 = s[i6];
            s[i6] = i4;
            jArr[i4] = (i5 << 32) | (i7 & 4294967295L);
        }
        this.h = i3;
        this.e = s;
    }

    public void C(int i2, int i3) {
        C10664xF1.C(i2, this.c);
        this.b[i2] = i3;
    }

    public int D() {
        return this.c;
    }

    public void a() {
        this.d++;
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, 0);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1L);
        this.c = 0;
    }

    public boolean b(@MB Object obj) {
        if (n(obj) != -1) {
            return true;
        }
        return false;
    }

    public void e(int i2) {
        if (i2 > this.f.length) {
            z(i2);
        }
        if (i2 >= this.h) {
            B(Math.max(2, Integer.highestOneBit(i2 - 1) << 1));
        }
    }

    public int f() {
        if (this.c == 0) {
            return -1;
        }
        return 0;
    }

    public int g(@MB Object obj) {
        int n2 = n(obj);
        if (n2 == -1) {
            return 0;
        }
        return this.b[n2];
    }

    public InterfaceC2467Am1.a<K> h(int i2) {
        C10664xF1.C(i2, this.c);
        return new a(i2);
    }

    @InterfaceC7894ly1
    public K j(int i2) {
        C10664xF1.C(i2, this.c);
        return (K) this.a[i2];
    }

    public int l(int i2) {
        C10664xF1.C(i2, this.c);
        return this.b[i2];
    }

    public final int m() {
        return this.e.length - 1;
    }

    public int n(@MB Object obj) {
        int d = EG0.d(obj);
        int i2 = this.e[m() & d];
        while (i2 != -1) {
            long j2 = this.f[i2];
            if (i(j2) == d && C2593Bt1.a(obj, this.a[i2])) {
                return i2;
            }
            i2 = k(j2);
        }
        return -1;
    }

    public void o(int i2, float f) {
        boolean z;
        boolean z2 = false;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        C10664xF1.e(z2, "Illegal load factor");
        int a2 = EG0.a(i2, f);
        this.e = s(a2);
        this.g = f;
        this.a = new Object[i2];
        this.b = new int[i2];
        this.f = r(i2);
        this.h = Math.max(1, (int) (a2 * f));
    }

    public void p(int i2, @InterfaceC7894ly1 K k2, int i3, int i4) {
        this.f[i2] = (i4 << 32) | 4294967295L;
        this.a[i2] = k2;
        this.b[i2] = i3;
    }

    public void q(int i2) {
        int D = D() - 1;
        if (i2 < D) {
            Object[] objArr = this.a;
            objArr[i2] = objArr[D];
            int[] iArr = this.b;
            iArr[i2] = iArr[D];
            objArr[D] = null;
            iArr[D] = 0;
            long[] jArr = this.f;
            long j2 = jArr[D];
            jArr[i2] = j2;
            jArr[D] = -1;
            int i3 = i(j2) & m();
            int[] iArr2 = this.e;
            int i4 = iArr2[i3];
            if (i4 == D) {
                iArr2[i3] = i2;
                return;
            }
            while (true) {
                long j3 = this.f[i4];
                int k2 = k(j3);
                if (k2 == D) {
                    this.f[i4] = E(j3, i2);
                    return;
                }
                i4 = k2;
            }
        } else {
            this.a[i2] = null;
            this.b[i2] = 0;
            this.f[i2] = -1;
        }
    }

    public int t(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.c) {
            return i3;
        }
        return -1;
    }

    public int u(int i2, int i3) {
        return i2 - 1;
    }

    @InterfaceC6181ey
    public int v(@InterfaceC7894ly1 K k2, int i2) {
        C5037aF.d(i2, "count");
        long[] jArr = this.f;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int d = EG0.d(k2);
        int m2 = m() & d;
        int i3 = this.c;
        int[] iArr2 = this.e;
        int i4 = iArr2[m2];
        if (i4 == -1) {
            iArr2[m2] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (i(j2) == d && C2593Bt1.a(k2, objArr[i4])) {
                    int i5 = iArr[i4];
                    iArr[i4] = i2;
                    return i5;
                }
                int k3 = k(j2);
                if (k3 == -1) {
                    jArr[i4] = E(j2, i3);
                    break;
                }
                i4 = k3;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            int i6 = i3 + 1;
            A(i6);
            p(i3, k2, i2, d);
            this.c = i6;
            if (i3 >= this.h) {
                B(this.e.length * 2);
            }
            this.d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @InterfaceC6181ey
    public int w(@MB Object obj) {
        return x(obj, EG0.d(obj));
    }

    public final int x(@MB Object obj, int i2) {
        int m2 = m() & i2;
        int i3 = this.e[m2];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (i(this.f[i3]) == i2 && C2593Bt1.a(obj, this.a[i3])) {
                int i5 = this.b[i3];
                if (i4 == -1) {
                    this.e[m2] = k(this.f[i3]);
                } else {
                    long[] jArr = this.f;
                    jArr[i4] = E(jArr[i4], k(jArr[i3]));
                }
                q(i3);
                this.c--;
                this.d++;
                return i5;
            }
            int k2 = k(this.f[i3]);
            if (k2 == -1) {
                return 0;
            }
            i4 = i3;
            i3 = k2;
        }
    }

    @InterfaceC6181ey
    public int y(int i2) {
        return x(this.a[i2], i(this.f[i2]));
    }

    public void z(int i2) {
        this.a = Arrays.copyOf(this.a, i2);
        this.b = Arrays.copyOf(this.b, i2);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1L);
        }
        this.f = copyOf;
    }

    public C5920dt1(C5920dt1<? extends K> c5920dt1) {
        o(c5920dt1.D(), 1.0f);
        int f = c5920dt1.f();
        while (f != -1) {
            v(c5920dt1.j(f), c5920dt1.l(f));
            f = c5920dt1.t(f);
        }
    }

    public C5920dt1(int i2) {
        this(i2, 1.0f);
    }

    public C5920dt1(int i2, float f) {
        o(i2, f);
    }
}
