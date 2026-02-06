package o;

import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.util.Collections;
import java.util.List;
import o.J8;

@Deprecated
/* loaded from: classes2.dex */
public final class FD1 {
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;
    public static final int V = 7;
    public static final int W = 9;
    public static final int X = 10;
    public static final int Y = 11;
    public static final int Z = 12;
    public static final int a0 = 13;
    public static final int b0 = 14;
    public static final int c0 = 15;
    public static final int d0 = 16;
    public static final FD1 e0 = W(new FD1[0]);
    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;
    public final int J;
    public final int K;
    public final List<a> L;
    public final List<a> M;
    public final long[] N;
    public final int a;
    public final List<c> b;
    public final List<long[]> c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final long f452o;
    public final int p;
    public final List<b> q;
    public final List<b> r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    /* loaded from: classes2.dex */
    public static final class a {
        public final J8.b a;
        public final Exception b;

        public a(J8.b bVar, Exception exc) {
            this.a = bVar;
            this.b = exc;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a)) {
                return false;
            }
            return this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final J8.b a;
        @InterfaceC11300zs1
        public final C10833xx0 b;

        public b(J8.b bVar, @InterfaceC11300zs1 C10833xx0 c10833xx0) {
            this.a = bVar;
            this.b = c10833xx0;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (!this.a.equals(bVar.a)) {
                    return false;
                }
                C10833xx0 c10833xx0 = this.b;
                C10833xx0 c10833xx02 = bVar.b;
                if (c10833xx0 != null) {
                    return c10833xx0.equals(c10833xx02);
                }
                if (c10833xx02 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.a.hashCode() * 31;
            C10833xx0 c10833xx0 = this.b;
            if (c10833xx0 != null) {
                i = c10833xx0.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final J8.b a;
        public final int b;

        public c(J8.b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.b != cVar.b) {
                return false;
            }
            return this.a.equals(cVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }
    }

    public FD1(int i, long[] jArr, List<c> list, List<long[]> list2, long j, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, List<b> list3, List<b> list4, long j4, long j5, long j6, long j7, long j8, long j9, int i12, int i13, int i14, long j10, int i15, long j11, long j12, long j13, long j14, long j15, int i16, int i17, int i18, List<a> list5, List<a> list6) {
        this.a = i;
        this.N = jArr;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = j;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = j2;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.f452o = j3;
        this.p = i11;
        this.q = Collections.unmodifiableList(list3);
        this.r = Collections.unmodifiableList(list4);
        this.s = j4;
        this.t = j5;
        this.u = j6;
        this.v = j7;
        this.w = j8;
        this.x = j9;
        this.y = i12;
        this.z = i13;
        this.A = i14;
        this.B = j10;
        this.C = i15;
        this.D = j11;
        this.E = j12;
        this.F = j13;
        this.G = j14;
        this.H = j15;
        this.I = i16;
        this.J = i17;
        this.K = i18;
        this.L = Collections.unmodifiableList(list5);
        this.M = Collections.unmodifiableList(list6);
    }

    public static FD1 W(FD1... fd1Arr) {
        int i;
        FD1[] fd1Arr2 = fd1Arr;
        long[] jArr = new long[16];
        int length = fd1Arr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = -1;
        long j12 = -1;
        long j13 = C10323vs.b;
        long j14 = C10323vs.b;
        long j15 = C10323vs.b;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i17 < length) {
            FD1 fd1 = fd1Arr2[i17];
            i2 += fd1.a;
            for (int i21 = 0; i21 < 16; i21++) {
                jArr[i21] = jArr[i21] + fd1.N[i21];
            }
            if (j14 == C10323vs.b) {
                j14 = fd1.d;
            } else {
                long j16 = fd1.d;
                if (j16 != C10323vs.b) {
                    j14 = Math.min(j14, j16);
                }
            }
            i18 += fd1.e;
            i19 += fd1.f;
            i20 += fd1.g;
            i3 += fd1.h;
            if (j15 == C10323vs.b) {
                j15 = fd1.i;
            } else {
                long j17 = fd1.i;
                if (j17 != C10323vs.b) {
                    j15 += j17;
                }
            }
            i4 += fd1.j;
            i5 += fd1.k;
            i6 += fd1.l;
            i7 += fd1.m;
            i8 += fd1.n;
            if (j13 == C10323vs.b) {
                j13 = fd1.f452o;
            } else {
                long j18 = fd1.f452o;
                if (j18 != C10323vs.b) {
                    j13 = Math.max(j13, j18);
                }
            }
            i9 += fd1.p;
            j += fd1.s;
            j2 += fd1.t;
            j3 += fd1.u;
            j4 += fd1.v;
            j5 += fd1.w;
            j6 += fd1.x;
            i10 += fd1.y;
            i11 += fd1.z;
            int i22 = i16;
            if (i22 == -1) {
                i16 = fd1.A;
            } else {
                i16 = i22;
                int i23 = fd1.A;
                if (i23 != -1) {
                    i16 += i23;
                }
            }
            if (j11 == -1) {
                i = length;
                j11 = fd1.B;
            } else {
                i = length;
                long j19 = fd1.B;
                if (j19 != -1) {
                    j11 += j19;
                }
            }
            i12 += fd1.C;
            if (j12 == -1) {
                j12 = fd1.D;
            } else {
                long j20 = fd1.D;
                if (j20 != -1) {
                    j12 += j20;
                }
            }
            j7 += fd1.E;
            j8 += fd1.F;
            j9 += fd1.G;
            j10 += fd1.H;
            i13 += fd1.I;
            i14 += fd1.J;
            i15 += fd1.K;
            i17++;
            length = i;
            fd1Arr2 = fd1Arr;
        }
        long j21 = j14;
        long j22 = j13;
        List list = Collections.EMPTY_LIST;
        return new FD1(i2, jArr, list, list, j21, i18, i19, i20, i3, j15, i4, i5, i6, i7, i8, j22, i9, list, list, j, j2, j3, j4, j5, j6, i10, i11, i16, j11, i12, j12, j7, j8, j9, j10, i13, i14, i15, list, list);
    }

    public float A() {
        return 1.0f / e();
    }

    public float B() {
        return 1.0f / H();
    }

    public float C() {
        return 1.0f / K();
    }

    public int D() {
        long j = this.u;
        if (j == 0) {
            return -1;
        }
        return (int) (this.v / j);
    }

    public int E() {
        long j = this.s;
        if (j == 0) {
            return -1;
        }
        return (int) (this.t / j);
    }

    public long F() {
        if (this.e == 0) {
            return C10323vs.b;
        }
        return U() / this.e;
    }

    public long G(long j) {
        long j2;
        if (this.c.isEmpty()) {
            return C10323vs.b;
        }
        int i = 0;
        while (i < this.c.size() && this.c.get(i)[0] <= j) {
            i++;
        }
        if (i == 0) {
            return this.c.get(0)[1];
        }
        if (i == this.c.size()) {
            List<long[]> list = this.c;
            return list.get(list.size() - 1)[1];
        }
        int i2 = i - 1;
        long j3 = this.c.get(i2)[0];
        long j4 = this.c.get(i2)[1];
        long j5 = this.c.get(i)[0];
        long j6 = this.c.get(i)[1];
        if (j5 - j3 == 0) {
            return j4;
        }
        return j4 + (((float) (j6 - j4)) * (((float) (j - j3)) / ((float) j2)));
    }

    public float H() {
        long R2 = R();
        if (R2 == 0) {
            return 0.0f;
        }
        return (this.K * 1000.0f) / ((float) R2);
    }

    public int I(long j) {
        int i = 0;
        for (c cVar : this.b) {
            if (cVar.a.a > j) {
                break;
            }
            i = cVar.b;
        }
        return i;
    }

    public long J(int i) {
        return this.N[i];
    }

    public float K() {
        long R2 = R();
        if (R2 == 0) {
            return 0.0f;
        }
        return (this.n * 1000.0f) / ((float) R2);
    }

    public float L() {
        long Q2 = Q();
        if (Q2 == 0) {
            return 0.0f;
        }
        return ((float) S()) / ((float) Q2);
    }

    public float M() {
        long Q2 = Q();
        if (Q2 == 0) {
            return 0.0f;
        }
        return ((float) T()) / ((float) Q2);
    }

    public long N() {
        long j = 0;
        for (int i = 0; i < 16; i++) {
            j += this.N[i];
        }
        return j;
    }

    public long O() {
        return J(2);
    }

    public long P() {
        return J(4) + J(7);
    }

    public long Q() {
        return R() + U();
    }

    public long R() {
        return J(3);
    }

    public long S() {
        return J(6);
    }

    public long T() {
        return J(5);
    }

    public long U() {
        return J(2) + J(6) + J(5);
    }

    public float V() {
        long Q2 = Q();
        if (Q2 == 0) {
            return 0.0f;
        }
        return ((float) U()) / ((float) Q2);
    }

    public float a() {
        int i = this.f;
        int i2 = this.a;
        int i3 = this.e;
        int i4 = i - (i2 - i3);
        if (i3 == 0) {
            return 0.0f;
        }
        return i4 / i3;
    }

    public float b() {
        long R2 = R();
        if (R2 == 0) {
            return 0.0f;
        }
        return (((float) this.H) * 1000.0f) / ((float) R2);
    }

    public float c() {
        long R2 = R();
        if (R2 == 0) {
            return 0.0f;
        }
        return (((float) this.G) * 1000.0f) / ((float) R2);
    }

    public float d() {
        int i = this.e;
        if (i == 0) {
            return 0.0f;
        }
        return this.g / i;
    }

    public float e() {
        long R2 = R();
        if (R2 == 0) {
            return 0.0f;
        }
        return (this.J * 1000.0f) / ((float) R2);
    }

    public float f() {
        int i = this.e;
        if (i == 0) {
            return 0.0f;
        }
        return this.I / i;
    }

    public float g() {
        long Q2 = Q();
        if (Q2 == 0) {
            return 0.0f;
        }
        return ((float) O()) / ((float) Q2);
    }

    public int h() {
        long j = this.w;
        if (j == 0) {
            return -1;
        }
        return (int) (this.x / j);
    }

    public int i() {
        long j = this.E;
        if (j == 0) {
            return -1;
        }
        return (int) ((this.F * RtspMediaSource.m1) / j);
    }

    public long j() {
        if (this.a == 0) {
            return C10323vs.b;
        }
        return N() / this.a;
    }

    public int k() {
        int i = this.C;
        if (i == 0) {
            return -1;
        }
        return (int) (this.D / i);
    }

    public int l() {
        int i = this.z;
        if (i == 0) {
            return -1;
        }
        return (int) (this.B / i);
    }

    public int m() {
        int i = this.y;
        if (i == 0) {
            return -1;
        }
        return this.A / i;
    }

    public long n() {
        int i = this.j;
        if (i == 0) {
            return C10323vs.b;
        }
        return this.i / i;
    }

    public float o() {
        int i = this.e;
        if (i == 0) {
            return 0.0f;
        }
        return this.K / i;
    }

    public float p() {
        int i = this.e;
        if (i == 0) {
            return 0.0f;
        }
        return this.l / i;
    }

    public float q() {
        int i = this.e;
        if (i == 0) {
            return 0.0f;
        }
        return this.k / i;
    }

    public long r() {
        if (this.e == 0) {
            return C10323vs.b;
        }
        return P() / this.e;
    }

    public long s() {
        if (this.e == 0) {
            return C10323vs.b;
        }
        return Q() / this.e;
    }

    public long t() {
        if (this.e == 0) {
            return C10323vs.b;
        }
        return R() / this.e;
    }

    public float u() {
        int i = this.e;
        if (i == 0) {
            return 0.0f;
        }
        return this.n / i;
    }

    public long v() {
        if (this.e == 0) {
            return C10323vs.b;
        }
        return S() / this.e;
    }

    public float w() {
        int i = this.e;
        if (i == 0) {
            return 0.0f;
        }
        return this.m / i;
    }

    public long x() {
        if (this.e == 0) {
            return C10323vs.b;
        }
        return T() / this.e;
    }

    public long y() {
        if (this.n == 0) {
            return C10323vs.b;
        }
        return (J(6) + J(7)) / this.n;
    }

    public long z() {
        if (this.m == 0) {
            return C10323vs.b;
        }
        return T() / this.m;
    }
}
