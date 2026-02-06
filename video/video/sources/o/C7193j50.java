package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8058ma0
/* renamed from: o.j50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7193j50 {
    public static final double a = -2.147483648E9d;
    public static final double b = 2.147483647E9d;
    public static final double c = -9.223372036854776E18d;
    public static final double d = 9.223372036854776E18d;
    @InterfaceC5299bJ2
    public static final int f = 170;
    public static final double e = Math.log(2.0d);
    @InterfaceC5299bJ2
    public static final double[] g = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: o.j50$a */
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
                a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    public static double a(double d2) {
        C10664xF1.d(C10866y50.d(d2));
        return d2;
    }

    public static double b(int i) {
        C8314nd1.e(GoogleApiAvailabilityLight.e, i);
        if (i > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d2 = 1.0d;
        for (int i2 = (i & (-16)) + 1; i2 <= i; i2++) {
            d2 *= i2;
        }
        return d2 * g[i >> 4];
    }

    public static int c(double d2, double d3, double d4) {
        if (d(d2, d3, d4)) {
            return 0;
        }
        if (d2 < d3) {
            return -1;
        }
        if (d2 > d3) {
            return 1;
        }
        return C4049Qo.d(Double.isNaN(d2), Double.isNaN(d3));
    }

    public static boolean d(double d2, double d3, double d4) {
        C8314nd1.d("tolerance", d4);
        if (Math.copySign(d2 - d3, 1.0d) > d4 && d2 != d3) {
            if (!Double.isNaN(d2) || !Double.isNaN(d3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @InterfaceC11149zF0
    public static boolean e(double d2) {
        if (C10866y50.d(d2)) {
            if (d2 == 0.0d || 52 - Long.numberOfTrailingZeros(C10866y50.c(d2)) <= Math.getExponent(d2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @InterfaceC11149zF0
    public static boolean f(double d2) {
        if (d2 > 0.0d && C10866y50.d(d2)) {
            long c2 = C10866y50.c(d2);
            if ((c2 & (c2 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static double g(double d2) {
        return Math.log(d2) / e;
    }

    @InterfaceC11149zF0
    public static int h(double d2, RoundingMode roundingMode) {
        boolean z;
        boolean f2;
        boolean z2 = false;
        if (d2 > 0.0d && C10866y50.d(d2)) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "x must be positive and finite");
        int exponent = Math.getExponent(d2);
        if (!C10866y50.e(d2)) {
            return h(d2 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                C8314nd1.k(f(d2));
                break;
            case 2:
                break;
            case 3:
                z2 = !f(d2);
                break;
            case 4:
                if (exponent < 0) {
                    z2 = true;
                }
                f2 = f(d2);
                z2 &= !f2;
                break;
            case 5:
                if (exponent >= 0) {
                    z2 = true;
                }
                f2 = f(d2);
                z2 &= !f2;
                break;
            case 6:
            case 7:
            case 8:
                double g2 = C10866y50.g(d2);
                if (g2 * g2 > 2.0d) {
                    z2 = true;
                    break;
                }
                break;
            default:
                throw new AssertionError();
        }
        if (z2) {
            return exponent + 1;
        }
        return exponent;
    }

    @InterfaceC11149zF0
    @Deprecated
    public static double i(Iterable<? extends Number> iterable) {
        return j(iterable.iterator());
    }

    @InterfaceC11149zF0
    @Deprecated
    public static double j(Iterator<? extends Number> it) {
        C10664xF1.e(it.hasNext(), "Cannot take mean of 0 values");
        double a2 = a(it.next().doubleValue());
        long j = 1;
        while (it.hasNext()) {
            j++;
            a2 += (a(it.next().doubleValue()) - a2) / j;
        }
        return a2;
    }

    @InterfaceC11149zF0
    @Deprecated
    public static double k(double... dArr) {
        boolean z;
        if (dArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "Cannot take mean of 0 values");
        double a2 = a(dArr[0]);
        long j = 1;
        for (int i = 1; i < dArr.length; i++) {
            a(dArr[i]);
            j++;
            a2 += (dArr[i] - a2) / j;
        }
        return a2;
    }

    @Deprecated
    public static double l(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : iArr) {
            j += i;
        }
        return j / iArr.length;
    }

    @Deprecated
    public static double m(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "Cannot take mean of 0 values");
        double d2 = jArr[0];
        long j = 1;
        for (int i = 1; i < jArr.length; i++) {
            j++;
            d2 += (jArr[i] - d2) / j;
        }
        return d2;
    }

    @InterfaceC11149zF0
    public static double n(double d2, RoundingMode roundingMode) {
        int i;
        if (C10866y50.d(d2)) {
            switch (a.a[roundingMode.ordinal()]) {
                case 1:
                    C8314nd1.k(e(d2));
                    return d2;
                case 2:
                    if (d2 < 0.0d && !e(d2)) {
                        return ((long) d2) - 1;
                    }
                    return d2;
                case 3:
                    if (d2 > 0.0d && !e(d2)) {
                        return ((long) d2) + 1;
                    }
                    return d2;
                case 4:
                    return d2;
                case 5:
                    if (!e(d2)) {
                        long j = (long) d2;
                        if (d2 > 0.0d) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        return j + i;
                    }
                    return d2;
                case 6:
                    return Math.rint(d2);
                case 7:
                    double rint = Math.rint(d2);
                    if (Math.abs(d2 - rint) == 0.5d) {
                        return d2 + Math.copySign(0.5d, d2);
                    }
                    return rint;
                case 8:
                    double rint2 = Math.rint(d2);
                    if (Math.abs(d2 - rint2) != 0.5d) {
                        return rint2;
                    }
                    return d2;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    @InterfaceC11149zF0
    public static BigInteger o(double d2, RoundingMode roundingMode) {
        boolean z;
        double n = n(d2, roundingMode);
        boolean z2 = false;
        if ((-9.223372036854776E18d) - n < 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (n < 9.223372036854776E18d) {
            z2 = true;
        }
        if (z & z2) {
            return BigInteger.valueOf((long) n);
        }
        BigInteger shiftLeft = BigInteger.valueOf(C10866y50.c(n)).shiftLeft(Math.getExponent(n) - 52);
        if (n < 0.0d) {
            return shiftLeft.negate();
        }
        return shiftLeft;
    }

    @InterfaceC11149zF0
    public static int p(double d2, RoundingMode roundingMode) {
        boolean z;
        double n = n(d2, roundingMode);
        boolean z2 = false;
        if (n > -2.147483649E9d) {
            z = true;
        } else {
            z = false;
        }
        if (n < 2.147483648E9d) {
            z2 = true;
        }
        C8314nd1.a(z & z2, d2, roundingMode);
        return (int) n;
    }

    @InterfaceC11149zF0
    public static long q(double d2, RoundingMode roundingMode) {
        boolean z;
        double n = n(d2, roundingMode);
        boolean z2 = false;
        if ((-9.223372036854776E18d) - n < 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (n < 9.223372036854776E18d) {
            z2 = true;
        }
        C8314nd1.a(z & z2, d2, roundingMode);
        return (long) n;
    }
}
