package o;

/* loaded from: classes3.dex */
public final class Mx2 {
    public static final int a(int i, int i2, int i3) {
        int a = Rw2.a(i, i3);
        int a2 = Rw2.a(i2, i3);
        int a3 = Uw2.a(a, a2);
        int n = C7162ix2.n(a - a2);
        if (a3 >= 0) {
            return n;
        }
        return C7162ix2.n(n + i3);
    }

    public static final long b(long j, long j2, long j3) {
        int compare;
        long a = Sw2.a(j, j3);
        long a2 = Sw2.a(j2, j3);
        compare = Long.compare(a ^ Long.MIN_VALUE, a2 ^ Long.MIN_VALUE);
        long n = C9860tx2.n(a - a2);
        if (compare >= 0) {
            return n;
        }
        return C9860tx2.n(n + j3);
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final long c(long j, long j2, long j3) {
        int compare;
        int compare2;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 >= 0) {
                return j2;
            }
            return C9860tx2.n(j2 - b(j2, j, C9860tx2.n(j3)));
        } else if (i < 0) {
            compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare <= 0) {
                return j2;
            }
            return C9860tx2.n(j2 + b(j, j2, C9860tx2.n(-j3)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final int d(int i, int i2, int i3) {
        if (i3 > 0) {
            if (Uw2.a(i, i2) < 0) {
                return C7162ix2.n(i2 - a(i2, i, C7162ix2.n(i3)));
            }
        } else if (i3 < 0) {
            if (Uw2.a(i, i2) > 0) {
                return C7162ix2.n(i2 + a(i, i2, C7162ix2.n(-i3)));
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i2;
    }
}
