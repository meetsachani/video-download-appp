package o;

import java.util.Random;

/* loaded from: classes4.dex */
public class ON1 {
    public static final Random a = new Random();

    public static boolean a() {
        return a.nextBoolean();
    }

    public static byte[] b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Count cannot be negative.", new Object[0]);
        byte[] bArr = new byte[i];
        a.nextBytes(bArr);
        return bArr;
    }

    public static double c() {
        return d(0.0d, Double.MAX_VALUE);
    }

    public static double d(double d, double d2) {
        boolean z;
        boolean z2 = true;
        if (d2 >= d) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Start value must be smaller or equal to end value.", new Object[0]);
        if (d < 0.0d) {
            z2 = false;
        }
        C11147zE2.B(z2, "Both range values must be non-negative.", new Object[0]);
        if (d == d2) {
            return d;
        }
        return d + ((d2 - d) * a.nextDouble());
    }

    public static float e() {
        return f(0.0f, Float.MAX_VALUE);
    }

    public static float f(float f, float f2) {
        boolean z;
        boolean z2 = true;
        if (f2 >= f) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Start value must be smaller or equal to end value.", new Object[0]);
        if (f < 0.0f) {
            z2 = false;
        }
        C11147zE2.B(z2, "Both range values must be non-negative.", new Object[0]);
        if (f == f2) {
            return f;
        }
        return f + ((f2 - f) * a.nextFloat());
    }

    public static int g() {
        return h(0, Integer.MAX_VALUE);
    }

    public static int h(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Start value must be smaller or equal to end value.", new Object[0]);
        if (i < 0) {
            z2 = false;
        }
        C11147zE2.B(z2, "Both range values must be non-negative.", new Object[0]);
        if (i == i2) {
            return i;
        }
        return i + a.nextInt(i2 - i);
    }

    public static long i() {
        return j(Long.MAX_VALUE);
    }

    public static long j(long j) {
        long nextLong;
        long j2;
        do {
            nextLong = a.nextLong() >>> 1;
            j2 = nextLong % j;
        } while ((nextLong - j2) + (j - 1) < 0);
        return j2;
    }

    public static long k(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Start value must be smaller or equal to end value.", new Object[0]);
        if (j < 0) {
            z2 = false;
        }
        C11147zE2.B(z2, "Both range values must be non-negative.", new Object[0]);
        if (j == j2) {
            return j;
        }
        return j + j(j2 - j);
    }
}
