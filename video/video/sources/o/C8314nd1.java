package o;

import java.math.BigInteger;
import java.math.RoundingMode;

@InterfaceC6181ey
@InterfaceC10420wF0
@InterfaceC8058ma0
/* renamed from: o.nd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8314nd1 {
    public static void a(boolean z, double d, RoundingMode roundingMode) {
        if (z) {
            return;
        }
        String valueOf = String.valueOf(roundingMode);
        StringBuilder sb = new StringBuilder(valueOf.length() + 83);
        sb.append("rounded value is out of range for input ");
        sb.append(d);
        sb.append(" and rounding mode ");
        sb.append(valueOf);
        throw new ArithmeticException(sb.toString());
    }

    public static void b(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("overflow: ");
        sb.append(str);
        sb.append(C9811tl1.c);
        sb.append(i);
        sb.append(C6566gU0.h);
        sb.append(i2);
        sb.append(C9811tl1.d);
        throw new ArithmeticException(sb.toString());
    }

    public static void c(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("overflow: ");
        sb.append(str);
        sb.append(C9811tl1.c);
        sb.append(j);
        sb.append(C6566gU0.h);
        sb.append(j2);
        sb.append(C9811tl1.d);
        throw new ArithmeticException(sb.toString());
    }

    public static double d(String str, double d) {
        if (d >= 0.0d) {
            return d;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" (");
        sb.append(d);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int e(String str, int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static long f(String str, long j) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static BigInteger g(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + valueOf.length());
        sb.append(str);
        sb.append(" (");
        sb.append(valueOf);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int h(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static long i(String str, long j) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static BigInteger j(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15 + valueOf.length());
        sb.append(str);
        sb.append(" (");
        sb.append(valueOf);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void k(boolean z) {
        if (z) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
