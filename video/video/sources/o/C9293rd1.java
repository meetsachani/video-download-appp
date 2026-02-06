package o;

/* renamed from: o.rd1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9293rd1 {
    public static int a(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i + i2;
        boolean z4 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i3 >= 0) {
                z4 = true;
            }
            if (z3 != z4) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i3;
    }

    public static long b(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        long j3 = j + j2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z4 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (j3 >= 0) {
                z4 = true;
            }
            if (z3 != z4) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j3;
    }

    public static double c(double d, double d2, double d3) {
        if (d < d2) {
            return d2;
        }
        if (d > d3) {
            return d3;
        }
        return d;
    }

    public static float d(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public static int e(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static long f(long j, long j2, long j3) {
        if (j < j2) {
            return j2;
        }
        if (j > j3) {
            return j3;
        }
        return j;
    }

    public static int g(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long h(long j) {
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int i(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long j(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int k(int i, int i2) {
        int i3 = i * i2;
        if (i != 0 && i2 != 0 && (i3 / i != i2 || i3 / i2 != i)) {
            throw new ArithmeticException("integer overflow");
        }
        return i3;
    }

    public static long l(long j, long j2) {
        long j3 = j * j2;
        if (j != 0 && j2 != 0 && (j3 / j != j2 || j3 / j2 != j)) {
            throw new ArithmeticException("integer overflow");
        }
        return j3;
    }

    public static int m(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long n(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int o(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i - i2;
        boolean z4 = false;
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            if (i < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i3 < 0) {
                z4 = true;
            }
            if (z3 != z4) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i3;
    }

    public static long p(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        long j3 = j - j2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z4 = false;
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        if (j2 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            if (i < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (j3 < 0) {
                z4 = true;
            }
            if (z3 != z4) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j3;
    }

    public static int q(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        throw new ArithmeticException("integer overflow");
    }
}
