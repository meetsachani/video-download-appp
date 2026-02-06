package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8058ma0
/* loaded from: classes3.dex */
public final class R41 {
    @InterfaceC5299bJ2
    public static final long a = 4611686018427387904L;
    @InterfaceC5299bJ2
    public static final long b = -5402926248376769404L;
    @InterfaceC5299bJ2
    public static final long f = 3037000499L;
    public static final int j = -545925251;
    @InterfaceC5299bJ2
    public static final byte[] c = {19, C8077mf.u, C8077mf.u, C8077mf.u, C8077mf.u, 17, 17, 17, C8077mf.r, C8077mf.r, C8077mf.r, C8077mf.q, C8077mf.q, C8077mf.q, C8077mf.q, C8077mf.p, C8077mf.p, C8077mf.p, 13, 13, 13, C8077mf.n, C8077mf.n, C8077mf.n, C8077mf.n, C8077mf.m, C8077mf.m, C8077mf.m, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    @InterfaceC11149zF0
    @InterfaceC5299bJ2
    public static final long[] d = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, C10323vs.k, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    @InterfaceC11149zF0
    @InterfaceC5299bJ2
    public static final long[] e = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    public static final long[] g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    public static final int[] h = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, C7834lj1.G, C3503Kz.g0, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    @InterfaceC5299bJ2
    public static final int[] i = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, C7834lj1.G, C3503Kz.c0, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    public static final long[][] k = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public static final b X = new a("SMALL", 0);
        public static final b Y = new C0226b("LARGE", 1);
        public static final /* synthetic */ b[] Z = e();

        /* loaded from: classes3.dex */
        public enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.R41.b
            public long g(long j, long j2, long j3) {
                return (j * j2) % j3;
            }

            @Override // o.R41.b
            public long i(long j, long j2) {
                return (j * j) % j2;
            }
        }

        /* renamed from: o.R41$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum C0226b extends b {
            public C0226b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.R41.b
            public long g(long j, long j2, long j3) {
                long j4 = j >>> 32;
                long j5 = j2 >>> 32;
                long j6 = j & 4294967295L;
                long j7 = j2 & 4294967295L;
                long n = n(j4 * j5, j3) + (j4 * j7);
                if (n < 0) {
                    n = C5271bC2.k(n, j3);
                }
                return m(n(n + (j5 * j6), j3), C5271bC2.k(j6 * j7, j3), j3);
            }

            @Override // o.R41.b
            public long i(long j, long j2) {
                long j3 = j >>> 32;
                long j4 = j & 4294967295L;
                long n = n(j3 * j3, j2);
                long j5 = j3 * j4 * 2;
                if (j5 < 0) {
                    j5 = C5271bC2.k(j5, j2);
                }
                return m(n(n + j5, j2), C5271bC2.k(j4 * j4, j2), j2);
            }

            public final long m(long j, long j2, long j3) {
                int i = (j > (j3 - j2) ? 1 : (j == (j3 - j2) ? 0 : -1));
                long j4 = j + j2;
                if (i >= 0) {
                    return j4 - j3;
                }
                return j4;
            }

            public final long n(long j, long j2) {
                int i = 32;
                do {
                    int min = Math.min(i, Long.numberOfLeadingZeros(j));
                    j = C5271bC2.k(j << min, j2);
                    i -= min;
                } while (i > 0);
                return j;
            }
        }

        public b(String str, int i) {
        }

        public static /* synthetic */ b[] e() {
            return new b[]{X, Y};
        }

        public static boolean j(long j, long j2) {
            b bVar;
            if (j2 <= R41.f) {
                bVar = X;
            } else {
                bVar = Y;
            }
            return bVar.l(j, j2);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Z.clone();
        }

        public abstract long g(long j, long j2, long j3);

        public final long h(long j, long j2, long j3) {
            long j4 = j;
            long j5 = 1;
            while (j2 != 0) {
                long j6 = j3;
                if ((j2 & 1) != 0) {
                    j5 = g(j5, j4, j6);
                }
                j4 = i(j4, j6);
                j2 >>= 1;
                j3 = j6;
            }
            return j5;
        }

        public abstract long i(long j, long j2);

        public final boolean l(long j, long j2) {
            long j3 = j2 - 1;
            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> numberOfTrailingZeros;
            long j5 = j % j2;
            if (j5 == 0) {
                return true;
            }
            long h = h(j5, j4, j2);
            if (h == 1) {
                return true;
            }
            int i = 0;
            while (h != j3) {
                i++;
                if (i == numberOfTrailingZeros) {
                    return false;
                }
                h = i(h, j2);
            }
            return true;
        }

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }
    }

    @InterfaceC4238Sm
    public static long A(long j2, long j3) {
        boolean z;
        long j4 = j2 - j3;
        boolean z2 = false;
        if ((j3 ^ j2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 ^ j4) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j4;
        }
        return ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @InterfaceC11149zF0
    public static long B(long j2, RoundingMode roundingMode) {
        long j3;
        C8314nd1.f("x", j2);
        if (i(j2)) {
            return C9979uR0.x((int) j2, roundingMode);
        }
        long sqrt = (long) Math.sqrt(j2);
        long j4 = sqrt * sqrt;
        boolean z = false;
        int i2 = 0;
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                if (j4 == j2) {
                    z = true;
                }
                C8314nd1.k(z);
                return sqrt;
            case 2:
            case 3:
                if (j2 < j4) {
                    return sqrt - 1;
                }
                return sqrt;
            case 4:
            case 5:
                if (j2 > j4) {
                    return sqrt + 1;
                }
                return sqrt;
            case 6:
            case 7:
            case 8:
                if (j2 < j4) {
                    i2 = 1;
                }
                return (sqrt - i2) + n((j3 * j3) + j3, j2);
            default:
                throw new AssertionError();
        }
    }

    public static long a(int i2, int i3) {
        boolean z;
        C8314nd1.e(GoogleApiAvailabilityLight.e, i2);
        C8314nd1.e("k", i3);
        if (i3 <= i2) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "k (%s) > n (%s)", i3, i2);
        if (i3 > (i2 >> 1)) {
            i3 = i2 - i3;
        }
        long j2 = 1;
        if (i3 == 0) {
            return 1L;
        }
        if (i3 != 1) {
            long[] jArr = g;
            if (i2 < jArr.length) {
                return jArr[i2] / (jArr[i3] * jArr[i2 - i3]);
            }
            int[] iArr = h;
            if (i3 < iArr.length && i2 <= iArr[i3]) {
                int[] iArr2 = i;
                if (i3 < iArr2.length && i2 <= iArr2[i3]) {
                    int i4 = i2 - 1;
                    long j3 = i2;
                    for (int i5 = 2; i5 <= i3; i5++) {
                        j3 = (j3 * i4) / i5;
                        i4--;
                    }
                    return j3;
                }
                long j4 = i2;
                int q = q(j4, RoundingMode.CEILING);
                int i6 = i2 - 1;
                int i7 = q;
                int i8 = 2;
                long j5 = j4;
                long j6 = 1;
                while (i8 <= i3) {
                    i7 += q;
                    if (i7 < 63) {
                        j5 *= i6;
                        j6 *= i8;
                    } else {
                        j2 = u(j2, j5, j6);
                        j5 = i6;
                        j6 = i8;
                        i7 = q;
                    }
                    i8++;
                    i6--;
                }
                return u(j2, j5, j6);
            }
            return Long.MAX_VALUE;
        }
        return i2;
    }

    @InterfaceC4238Sm
    public static long b(long j2) {
        C8314nd1.i("x", j2);
        if (j2 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j2 - 1));
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("ceilingPowerOfTwo(");
        sb.append(j2);
        sb.append(") is not representable as a long");
        throw new ArithmeticException(sb.toString());
    }

    @InterfaceC11149zF0
    public static long c(long j2, long j3) {
        boolean z;
        long j4 = j2 + j3;
        boolean z2 = false;
        if ((j2 ^ j3) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 ^ j4) >= 0) {
            z2 = true;
        }
        C8314nd1.c(z | z2, "checkedAdd", j2, j3);
        return j4;
    }

    public static long d(long j2, long j3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j3);
        if (numberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        if (numberOfLeadingZeros >= 64) {
            z = true;
        } else {
            z = false;
        }
        C8314nd1.c(z, "checkedMultiply", j2, j3);
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j3 != Long.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        C8314nd1.c(z2 | z3, "checkedMultiply", j2, j3);
        long j4 = j2 * j3;
        if (i2 != 0 && j4 / j2 != j3) {
            z4 = false;
        } else {
            z4 = true;
        }
        C8314nd1.c(z4, "checkedMultiply", j2, j3);
        return j4;
    }

    @InterfaceC11149zF0
    public static long e(long j2, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3 = i2;
        C8314nd1.e("exponent", i3);
        if (j2 >= -2) {
            z = true;
        } else {
            z = false;
        }
        if (j2 <= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j3 = 1;
        if (z & z2) {
            int i4 = (int) j2;
            if (i4 != -2) {
                if (i4 != -1) {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            return 1L;
                        }
                        if (i4 == 2) {
                            if (i3 < 63) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            C8314nd1.c(z5, "checkedPow", j2, i3);
                            return 1 << i3;
                        }
                        throw new AssertionError();
                    } else if (i3 == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i3 & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            }
            if (i3 < 64) {
                z4 = true;
            } else {
                z4 = false;
            }
            C8314nd1.c(z4, "checkedPow", j2, i3);
            if ((i3 & 1) == 0) {
                return 1 << i3;
            }
            return (-1) << i3;
        }
        long j4 = j2;
        while (i3 != 0) {
            if (i3 != 1) {
                if ((i3 & 1) != 0) {
                    j3 = d(j3, j4);
                }
                i3 >>= 1;
                if (i3 > 0) {
                    if (-3037000499L <= j4 && j4 <= f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C8314nd1.c(z3, "checkedPow", j4, i3);
                    j4 *= j4;
                }
            } else {
                return d(j3, j4);
            }
        }
        return j3;
    }

    @InterfaceC11149zF0
    public static long f(long j2, long j3) {
        boolean z;
        long j4 = j2 - j3;
        boolean z2 = false;
        if ((j2 ^ j3) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 ^ j4) >= 0) {
            z2 = true;
        }
        C8314nd1.c(z | z2, "checkedSubtract", j2, j3);
        return j4;
    }

    @InterfaceC11149zF0
    public static long g(long j2, long j3, RoundingMode roundingMode) {
        C10664xF1.E(roundingMode);
        long j4 = j2 / j3;
        long j5 = j2 - (j3 * j4);
        int i2 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
        if (i2 == 0) {
            return j4;
        }
        boolean z = true;
        int i3 = ((int) ((j2 ^ j3) >> 63)) | 1;
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                if (i2 != 0) {
                    z = false;
                }
                C8314nd1.k(z);
                return j4;
            case 2:
                return j4;
            case 3:
                if (i3 >= 0) {
                    return j4;
                }
                return j4 + i3;
            case 4:
                return j4 + i3;
            case 5:
                if (i3 <= 0) {
                    return j4;
                }
                return j4 + i3;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j5);
                int i4 = ((abs - (Math.abs(j3) - abs)) > 0L ? 1 : ((abs - (Math.abs(j3) - abs)) == 0L ? 0 : -1));
                if (i4 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j4) == 0)) {
                        return j4;
                    }
                } else if (i4 <= 0) {
                    return j4;
                }
                return j4 + i3;
            default:
                throw new AssertionError();
        }
    }

    @InterfaceC11149zF0
    public static long h(int i2) {
        C8314nd1.e(GoogleApiAvailabilityLight.e, i2);
        long[] jArr = g;
        if (i2 < jArr.length) {
            return jArr[i2];
        }
        return Long.MAX_VALUE;
    }

    public static boolean i(long j2) {
        if (((int) j2) == j2) {
            return true;
        }
        return false;
    }

    @InterfaceC4238Sm
    public static long j(long j2) {
        C8314nd1.i("x", j2);
        return 1 << (63 - Long.numberOfLeadingZeros(j2));
    }

    public static long k(long j2, long j3) {
        C8314nd1.f("a", j2);
        C8314nd1.f("b", j3);
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j5 = j3 >> numberOfTrailingZeros2;
        while (j4 != j5) {
            long j6 = j4 - j5;
            long j7 = (j6 >> 63) & j6;
            long j8 = (j6 - j7) - j7;
            j5 += j7;
            j4 = j8 >> Long.numberOfTrailingZeros(j8);
        }
        return j4 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean l(long j2) {
        boolean z;
        boolean z2 = false;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 & (j2 - 1)) == 0) {
            z2 = true;
        }
        return z & z2;
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static boolean m(long j2) {
        long[][] jArr;
        if (j2 < 2) {
            C8314nd1.f(GoogleApiAvailabilityLight.e, j2);
            return false;
        } else if (j2 < 66) {
            if (((722865708377213483 >> (((int) j2) - 2)) & 1) == 0) {
                return false;
            }
            return true;
        } else if (((1 << ((int) (j2 % 30))) & j) != 0 || j2 % 7 == 0 || j2 % 11 == 0 || j2 % 13 == 0) {
            return false;
        } else {
            if (j2 < 289) {
                return true;
            }
            for (long[] jArr2 : k) {
                if (j2 <= jArr2[0]) {
                    for (int i2 = 1; i2 < jArr2.length; i2++) {
                        if (!b.j(jArr2[i2], j2)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            throw new AssertionError();
        }
    }

    @InterfaceC5299bJ2
    public static int n(long j2, long j3) {
        return (int) ((~(~(j2 - j3))) >>> 63);
    }

    @InterfaceC11149zF0
    public static int o(long j2, RoundingMode roundingMode) {
        boolean z;
        int n;
        C8314nd1.i("x", j2);
        int p = p(j2);
        long j3 = d[p];
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                if (j2 == j3) {
                    z = true;
                } else {
                    z = false;
                }
                C8314nd1.k(z);
                return p;
            case 2:
            case 3:
                return p;
            case 4:
            case 5:
                n = n(j3, j2);
                break;
            case 6:
            case 7:
            case 8:
                n = n(e[p], j2);
                break;
            default:
                throw new AssertionError();
        }
        return p + n;
    }

    @InterfaceC11149zF0
    public static int p(long j2) {
        byte b2 = c[Long.numberOfLeadingZeros(j2)];
        return b2 - n(j2, d[b2]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int q(long j2, RoundingMode roundingMode) {
        C8314nd1.i("x", j2);
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                C8314nd1.k(l(j2));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j2 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                return (63 - numberOfLeadingZeros) + n(b >>> numberOfLeadingZeros, j2);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j2);
    }

    public static long r(long j2, long j3) {
        return (j2 & j3) + ((j2 ^ j3) >> 1);
    }

    @InterfaceC11149zF0
    public static int s(long j2, int i2) {
        return (int) t(j2, i2);
    }

    @InterfaceC11149zF0
    public static long t(long j2, long j3) {
        if (j3 > 0) {
            long j4 = j2 % j3;
            if (j4 >= 0) {
                return j4;
            }
            return j4 + j3;
        }
        throw new ArithmeticException("Modulus must be positive");
    }

    public static long u(long j2, long j3, long j4) {
        if (j2 == 1) {
            return j3 / j4;
        }
        long k2 = k(j2, j4);
        return (j2 / k2) * (j3 / (j4 / k2));
    }

    @InterfaceC11149zF0
    public static long v(long j2, int i2) {
        long j3;
        C8314nd1.e("exponent", i2);
        if (-2 <= j2 && j2 <= 2) {
            int i3 = (int) j2;
            if (i3 != -2) {
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            return 1L;
                        }
                        if (i3 == 2) {
                            if (i2 >= 64) {
                                return 0L;
                            }
                            return 1 << i2;
                        }
                        throw new AssertionError();
                    } else if (i2 == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i2 & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            } else if (i2 >= 64) {
                return 0L;
            } else {
                if ((i2 & 1) == 0) {
                    return 1 << i2;
                }
                return -(1 << i2);
            }
        }
        long j4 = 1;
        while (i2 != 0) {
            if (i2 != 1) {
                if ((i2 & 1) == 0) {
                    j3 = 1;
                } else {
                    j3 = j2;
                }
                j4 *= j3;
                j2 *= j2;
                i2 >>= 1;
            } else {
                return j4 * j2;
            }
        }
        return j4;
    }

    @InterfaceC11149zF0
    public static double w(long j2, RoundingMode roundingMode) {
        int d2;
        boolean z;
        long j3;
        double d3;
        long j4;
        double d4 = j2;
        long j5 = (long) d4;
        if (j5 == Long.MAX_VALUE) {
            d2 = -1;
        } else {
            d2 = C7194j51.d(j2, j5);
        }
        int[] iArr = a.a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                if (d2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C8314nd1.k(z);
                return d4;
            case 2:
                if (j2 >= 0) {
                    if (d2 < 0) {
                        return C10866y50.f(d4);
                    }
                } else if (d2 > 0) {
                    return Math.nextUp(d4);
                }
                break;
            case 3:
                if (d2 < 0) {
                    return C10866y50.f(d4);
                }
                break;
            case 4:
                if (j2 >= 0) {
                    if (d2 > 0) {
                        return Math.nextUp(d4);
                    }
                } else if (d2 < 0) {
                    return C10866y50.f(d4);
                }
                break;
            case 5:
                if (d2 > 0) {
                    return Math.nextUp(d4);
                }
                break;
            case 6:
            case 7:
            case 8:
                if (d2 >= 0) {
                    d3 = Math.nextUp(d4);
                    j3 = Long.MAX_VALUE;
                    j4 = (long) Math.ceil(d3);
                } else {
                    j3 = Long.MAX_VALUE;
                    double f2 = C10866y50.f(d4);
                    long floor = (long) Math.floor(f2);
                    d3 = d4;
                    d4 = f2;
                    j4 = j5;
                    j5 = floor;
                }
                long j6 = j2 - j5;
                long j7 = j4 - j2;
                if (j4 == j3) {
                    j7++;
                }
                int d5 = C7194j51.d(j6, j7);
                if (d5 >= 0) {
                    if (d5 <= 0) {
                        int i2 = iArr[roundingMode.ordinal()];
                        if (i2 != 6) {
                            if (i2 != 7) {
                                if (i2 == 8) {
                                    if ((C10866y50.c(d4) & 1) == 0) {
                                    }
                                } else {
                                    throw new AssertionError("impossible");
                                }
                            } else if (j2 >= 0) {
                            }
                        } else if (j2 >= 0) {
                        }
                    }
                    return d3;
                }
                return d4;
            default:
                throw new AssertionError("impossible");
        }
        return d4;
    }

    @InterfaceC4238Sm
    public static long x(long j2, long j3) {
        boolean z;
        long j4 = j2 + j3;
        boolean z2 = false;
        if ((j3 ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 ^ j4) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j4;
        }
        return ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @InterfaceC4238Sm
    public static long y(long j2, long j3) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j3);
        if (numberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = ((j2 ^ j3) >>> 63) + Long.MAX_VALUE;
        boolean z3 = false;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j3 == Long.MIN_VALUE) {
            z3 = true;
        }
        if (!(z | (z3 & z2))) {
            long j5 = j2 * j3;
            if (i2 == 0 || j5 / j2 == j3) {
                return j5;
            }
        }
        return j4;
    }

    @InterfaceC4238Sm
    public static long z(long j2, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C8314nd1.e("exponent", i2);
        if (j2 >= -2) {
            z = true;
        } else {
            z = false;
        }
        if (j2 <= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j3 = 1;
        if (z & z2) {
            int i3 = (int) j2;
            if (i3 != -2) {
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            return 1L;
                        }
                        if (i3 == 2) {
                            if (i2 >= 63) {
                                return Long.MAX_VALUE;
                            }
                            return 1 << i2;
                        }
                        throw new AssertionError();
                    } else if (i2 == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i2 & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            } else if (i2 >= 64) {
                return (i2 & 1) + Long.MAX_VALUE;
            } else {
                if ((i2 & 1) == 0) {
                    return 1 << i2;
                }
                return (-1) << i2;
            }
        }
        long j4 = ((j2 >>> 63) & i2 & 1) + Long.MAX_VALUE;
        while (i2 != 0) {
            if (i2 != 1) {
                if ((i2 & 1) != 0) {
                    j3 = y(j3, j2);
                }
                i2 >>= 1;
                if (i2 > 0) {
                    if (-3037000499L > j2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (j2 > f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3 | z4) {
                        return j4;
                    }
                    j2 *= j2;
                }
            } else {
                return y(j3, j2);
            }
        }
        return j3;
    }
}
