package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.Qh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4021Qh {
    public static int a(int i) {
        if (i == 1) {
            return 16;
        }
        return 12;
    }

    public static int b(int i) {
        if (i == 1) {
            return 16;
        }
        return 12;
    }

    public static long c(long j, int i) {
        boolean z;
        long j2 = i;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j) / j2;
    }

    public static long d(long j, int i) {
        boolean z;
        long j2 = i;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "bytesPerFrame must be greater than 0.");
        return j * j2;
    }

    public static int e(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Invalid channel count: " + i2);
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 21) {
                        if (i != 22) {
                            throw new IllegalArgumentException("Invalid audio encoding: " + i);
                        }
                    } else {
                        return i2 * 3;
                    }
                }
                return i2 * 4;
            }
            return i2;
        }
        return i2 * 2;
    }

    public static long f(long j, int i) {
        boolean z;
        long j2 = i;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "bytesPerFrame must be greater than 0.");
        return j / j2;
    }
}
