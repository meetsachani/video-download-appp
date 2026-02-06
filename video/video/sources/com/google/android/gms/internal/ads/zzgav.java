package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import o.C10866y50;

/* loaded from: classes2.dex */
public final class zzgav {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static int a(double d, RoundingMode roundingMode) {
        boolean z;
        boolean d2;
        boolean z2 = false;
        if (d > 0.0d && zzgaw.b(d)) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.f(z, "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) >= -1022) {
            switch (zzgau.a[roundingMode.ordinal()]) {
                case 1:
                    zzgbb.b(d(d));
                    return exponent;
                case 2:
                    return exponent;
                case 3:
                    z2 = !d(d);
                    break;
                case 4:
                    if (exponent < 0) {
                        z2 = true;
                    }
                    d2 = d(d);
                    z2 &= !d2;
                    break;
                case 5:
                    if (exponent >= 0) {
                        z2 = true;
                    }
                    d2 = d(d);
                    z2 &= !d2;
                    break;
                case 6:
                case 7:
                case 8:
                    double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & C10866y50.a) | C10866y50.g);
                    if (longBitsToDouble * longBitsToDouble > 2.0d) {
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
        return a(d * 4.503599627370496E15d, roundingMode) - 52;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (java.lang.Math.abs(r8 - r2) == 0.5d) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(double d, RoundingMode roundingMode) {
        double d2;
        long j;
        long j2;
        int i;
        boolean z;
        if (zzgaw.b(d)) {
            boolean z2 = true;
            switch (zzgau.a[roundingMode.ordinal()]) {
                case 1:
                    zzgbb.b(c(d));
                    d2 = d;
                    break;
                case 2:
                    if (d < 0.0d && !c(d)) {
                        j = (long) d;
                        j2 = -1;
                        d2 = j + j2;
                        break;
                    }
                    d2 = d;
                    break;
                case 3:
                    if (d > 0.0d && !c(d)) {
                        j = (long) d;
                        j2 = 1;
                        d2 = j + j2;
                        break;
                    }
                    d2 = d;
                    break;
                case 4:
                    d2 = d;
                    break;
                case 5:
                    if (!c(d)) {
                        long j3 = (long) d;
                        if (d > 0.0d) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        d2 = j3 + i;
                        break;
                    }
                    d2 = d;
                    break;
                case 6:
                    d2 = Math.rint(d);
                    break;
                case 7:
                    d2 = Math.rint(d);
                    if (Math.abs(d - d2) == 0.5d) {
                        d2 = Math.copySign(0.5d, d) + d;
                        break;
                    }
                    break;
                case 8:
                    d2 = Math.rint(d);
                    break;
                default:
                    throw new AssertionError();
            }
            if ((-9.223372036854776E18d) - d2 < 1.0d) {
                z = true;
            } else {
                z = false;
            }
            if (d2 >= 9.223372036854776E18d) {
                z2 = false;
            }
            if (z & z2) {
                return (long) d2;
            }
            throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    public static boolean c(double d) {
        if (!zzgaw.b(d)) {
            return false;
        }
        if (d != 0.0d && 52 - Long.numberOfTrailingZeros(zzgaw.a(d)) > Math.getExponent(d)) {
            return false;
        }
        return true;
    }

    public static boolean d(double d) {
        if (d > 0.0d && zzgaw.b(d)) {
            long a2 = zzgaw.a(d);
            if ((a2 & ((-1) + a2)) == 0) {
                return true;
            }
        }
        return false;
    }
}
