package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "UnsignedKt")
/* loaded from: classes3.dex */
public final class ZB2 {
    @HK1
    public static final int a(double d) {
        if (Double.isNaN(d) || d <= h(0)) {
            return 0;
        }
        if (d >= h(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return C7162ix2.n((int) d);
        }
        return C7162ix2.n(C7162ix2.n((int) (d - Integer.MAX_VALUE)) + C7162ix2.n(Integer.MAX_VALUE));
    }

    @HK1
    public static final long b(double d) {
        if (Double.isNaN(d) || d <= q(0L)) {
            return 0L;
        }
        if (d >= q(-1L)) {
            return -1L;
        }
        if (d < 9.223372036854776E18d) {
            return C9860tx2.n((long) d);
        }
        return C9860tx2.n(C9860tx2.n((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @XP0
    @HK1
    public static final int c(float f) {
        return a(f);
    }

    @XP0
    @HK1
    public static final long d(float f) {
        return b(f);
    }

    @HK1
    public static final int e(int i, int i2) {
        return C6562gT0.t(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @HK1
    public static final int f(int i, int i2) {
        return C7162ix2.n((int) ((i & 4294967295L) / (i2 & 4294967295L)));
    }

    @HK1
    public static final int g(int i, int i2) {
        return C7162ix2.n((int) ((i & 4294967295L) % (i2 & 4294967295L)));
    }

    @HK1
    public static final double h(int i) {
        return (Integer.MAX_VALUE & i) + (((i >>> 31) << 30) * 2);
    }

    @XP0
    @HK1
    public static final float i(int i) {
        return (float) h(i);
    }

    @XP0
    @HK1
    public static final long j(int i) {
        return i & 4294967295L;
    }

    @XP0
    public static final String k(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @XP0
    public static final String l(int i, int i2) {
        return t(i & 4294967295L, i2);
    }

    @XP0
    @HK1
    public static final long m(int i) {
        return C9860tx2.n(i & 4294967295L);
    }

    @HK1
    public static final int n(long j, long j2) {
        return C6562gT0.u(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @HK1
    public static final long o(long j, long j2) {
        int compare;
        int compare2;
        if (j2 < 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return C9860tx2.n(0L);
            }
            return C9860tx2.n(1L);
        } else if (j >= 0) {
            return C9860tx2.n(j / j2);
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            compare = Long.compare(C9860tx2.n(j - (j3 * j2)) ^ Long.MIN_VALUE, C9860tx2.n(j2) ^ Long.MIN_VALUE);
            if (compare < 0) {
                i = 0;
            }
            return C9860tx2.n(j3 + i);
        }
    }

    @HK1
    public static final long p(long j, long j2) {
        int compare;
        int compare2;
        if (j2 < 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return j;
            }
            return C9860tx2.n(j - j2);
        } else if (j >= 0) {
            return C9860tx2.n(j % j2);
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            compare = Long.compare(C9860tx2.n(j3) ^ Long.MIN_VALUE, C9860tx2.n(j2) ^ Long.MIN_VALUE);
            if (compare < 0) {
                j2 = 0;
            }
            return C9860tx2.n(j3 - j2);
        }
    }

    @HK1
    public static final double q(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    @XP0
    @HK1
    public static final float r(long j) {
        return (float) q(j);
    }

    @XP0
    public static final String s(long j) {
        return t(j, 10);
    }

    @NotNull
    public static final String t(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, BB.a(i));
            C6562gT0.o(l, "toString(...)");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, BB.a(i));
        C6562gT0.o(l2, "toString(...)");
        sb.append(l2);
        String l3 = Long.toString(j4, BB.a(i));
        C6562gT0.o(l3, "toString(...)");
        sb.append(l3);
        return sb.toString();
    }
}
