package o;

import o.C3062Gl1;
import o.KZ1;

@Deprecated
/* loaded from: classes2.dex */
public final class UN2 implements NZ1 {
    public static final String j = "XingSeeker";
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    @InterfaceC11300zs1
    public final long[] i;

    public UN2(long j2, int i, long j3) {
        this(j2, i, j3, -1L, null);
    }

    @InterfaceC11300zs1
    public static UN2 a(long j2, long j3, C3062Gl1.a aVar, C3012Fy1 c3012Fy1) {
        int P;
        int i = aVar.g;
        int i2 = aVar.d;
        int s = c3012Fy1.s();
        if ((s & 1) == 1 && (P = c3012Fy1.P()) != 0) {
            long C1 = TD2.C1(P, i * 1000000, i2);
            if ((s & 6) != 6) {
                return new UN2(j3, aVar.c, C1);
            }
            long N = c3012Fy1.N();
            long[] jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = c3012Fy1.L();
            }
            if (j2 != -1) {
                long j4 = j3 + N;
                if (j2 != j4) {
                    I31.n(j, "XING data size mismatch: " + j2 + C6566gU0.h + j4);
                }
            }
            return new UN2(j3, aVar.c, C1, N, jArr);
        }
        return null;
    }

    public final long b(int i) {
        return (this.f * i) / 100;
    }

    @Override // o.NZ1
    public long c(long j2) {
        long j3;
        double d;
        long j4 = j2 - this.d;
        if (h() && j4 > this.e) {
            long[] jArr = (long[]) C9542sf.k(this.i);
            double d2 = (j4 * 256.0d) / this.g;
            int n = TD2.n(jArr, (long) d2, true, true);
            long b = b(n);
            long j5 = jArr[n];
            int i = n + 1;
            long b2 = b(i);
            if (n == 99) {
                j3 = 256;
            } else {
                j3 = jArr[i];
            }
            if (j5 == j3) {
                d = 0.0d;
            } else {
                d = (d2 - j5) / (j3 - j5);
            }
            return b + Math.round(d * (b2 - b));
        }
        return 0L;
    }

    @Override // o.KZ1
    public KZ1.a e(long j2) {
        double d;
        if (!h()) {
            return new KZ1.a(new MZ1(0L, this.d + this.e));
        }
        long x = TD2.x(j2, 0L, this.f);
        double d2 = (x * 100.0d) / this.f;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) C9542sf.k(this.i);
                double d4 = jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = jArr[i + 1];
                }
                d3 = d4 + ((d2 - i) * (d - d4));
            }
        }
        return new KZ1.a(new MZ1(x, this.d + TD2.x(Math.round((d3 / 256.0d) * this.g), this.e, this.g - 1)));
    }

    @Override // o.NZ1
    public long f() {
        return this.h;
    }

    @Override // o.KZ1
    public boolean h() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    @Override // o.KZ1
    public long i() {
        return this.f;
    }

    public UN2(long j2, int i, long j3, long j4, @InterfaceC11300zs1 long[] jArr) {
        this.d = j2;
        this.e = i;
        this.f = j3;
        this.i = jArr;
        this.g = j4;
        this.h = j4 != -1 ? j2 + j4 : -1L;
    }
}
