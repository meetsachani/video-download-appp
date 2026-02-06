package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ne0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3718Ne0 {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final long e = 1000000;
    public static final long f = 9223372036854L;
    public static final long g = 4611686018427387903L;
    @NotNull
    public static final C7592kj2 a = new C7592kj2("REMOVED_TASK");
    @NotNull
    public static final C7592kj2 h = new C7592kj2("CLOSED_EMPTY");

    public static final long c(long j) {
        return j / 1000000;
    }

    public static final long d(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= f) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
