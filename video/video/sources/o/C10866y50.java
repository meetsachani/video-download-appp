package o;

import java.math.BigInteger;

@InterfaceC11149zF0
@InterfaceC8058ma0
/* renamed from: o.y50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10866y50 {
    public static final long a = 4503599627370495L;
    public static final long b = 9218868437227405312L;
    public static final long c = Long.MIN_VALUE;
    public static final int d = 52;
    public static final int e = 1023;
    public static final long f = 4503599627370496L;
    @InterfaceC5299bJ2
    public static final long g = 4607182418800017408L;

    public static double a(BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        int bitLength = abs.bitLength();
        int i = bitLength - 1;
        if (i < 63) {
            return bigInteger.longValue();
        }
        if (i > 1023) {
            return bigInteger.signum() * Double.POSITIVE_INFINITY;
        }
        int i2 = bitLength - 54;
        long longValue = abs.shiftRight(i2).longValue();
        long j = longValue >> 1;
        long j2 = a & j;
        if ((longValue & 1) != 0 && ((j & 1) != 0 || abs.getLowestSetBit() < i2)) {
            j2++;
        }
        return Double.longBitsToDouble((((bitLength + J8.b0) << 52) + j2) | (bigInteger.signum() & Long.MIN_VALUE));
    }

    public static double b(double d2) {
        C10664xF1.d(!Double.isNaN(d2));
        return Math.max(d2, 0.0d);
    }

    public static long c(double d2) {
        C10664xF1.e(d(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & a;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | f;
    }

    public static boolean d(double d2) {
        if (Math.getExponent(d2) <= 1023) {
            return true;
        }
        return false;
    }

    public static boolean e(double d2) {
        if (Math.getExponent(d2) >= -1022) {
            return true;
        }
        return false;
    }

    public static double f(double d2) {
        return -Math.nextUp(-d2);
    }

    public static double g(double d2) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d2) & a) | g);
    }
}
