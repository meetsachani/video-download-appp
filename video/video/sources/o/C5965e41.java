package o;

import android.os.SystemClock;

/* renamed from: o.e41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5965e41 {
    public static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        return (b() - j) * a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
