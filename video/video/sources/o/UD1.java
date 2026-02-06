package o;

/* loaded from: classes.dex */
public final class UD1 {
    public static final boolean a(long j, long j2) {
        if ((j(j) * k(j2)) - (k(j) * j(j2)) > 0.0f) {
            return true;
        }
        return false;
    }

    public static final long b(long j, float f, float f2) {
        return C7638kv0.d(f, f2);
    }

    public static /* synthetic */ long c(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return b(j, f, f2);
    }

    public static final long d(long j, float f) {
        return C7638kv0.d(j(j) / f, k(j) / f);
    }

    public static final float e(long j, float f, float f2) {
        return (j(j) * f) + (k(j) * f2);
    }

    public static final float f(long j, long j2) {
        return (j(j) * j(j2)) + (k(j) * k(j2));
    }

    public static final long g(long j) {
        float h = h(j);
        if (h > 0.0f) {
            return d(j, h);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final float h(long j) {
        return (float) Math.sqrt((j(j) * j(j)) + (k(j) * k(j)));
    }

    public static final float i(long j) {
        return (j(j) * j(j)) + (k(j) * k(j));
    }

    public static final float j(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float k(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long l(long j, long j2, float f) {
        return C7638kv0.d(C5764dE2.l(j(j), j(j2), f), C5764dE2.l(k(j), k(j2), f));
    }

    public static final long m(long j, long j2) {
        return C7638kv0.d(j(j) - j(j2), k(j) - k(j2));
    }

    public static final long n(long j, long j2) {
        return C7638kv0.d(j(j) + j(j2), k(j) + k(j2));
    }

    public static final long o(long j, float f) {
        return C7638kv0.d(j(j) % f, k(j) % f);
    }

    public static final long p(long j, float f) {
        return C7638kv0.d(j(j) * f, k(j) * f);
    }

    public static final long q(long j, YD1 yd1) {
        C6562gT0.p(yd1, "f");
        long a = yd1.a(j(j), k(j));
        return C7638kv0.d(Float.intBitsToFloat((int) (a >> 32)), Float.intBitsToFloat((int) (a & 4294967295L)));
    }

    public static final long r(long j) {
        return C7638kv0.d(-j(j), -k(j));
    }
}
