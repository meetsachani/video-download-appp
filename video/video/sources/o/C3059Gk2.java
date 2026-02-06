package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.Gk2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3059Gk2 {
    public static final int a(@NotNull String str, int i, int i2, int i3) {
        return (int) C2852Ek2.c(str, i, i2, i3);
    }

    public static final long b(@NotNull String str, long j, long j2, long j3) {
        String d = C2852Ek2.d(str);
        if (d == null) {
            return j;
        }
        Long r1 = C9302rf2.r1(d);
        if (r1 != null) {
            long longValue = r1.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    @NotNull
    public static final String c(@NotNull String str, @NotNull String str2) {
        String d = C2852Ek2.d(str);
        if (d == null) {
            return str2;
        }
        return d;
    }

    public static final boolean d(@NotNull String str, boolean z) {
        String d = C2852Ek2.d(str);
        if (d != null) {
            return Boolean.parseBoolean(d);
        }
        return z;
    }

    public static /* synthetic */ int e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C2852Ek2.b(str, i, i2, i3);
    }

    public static /* synthetic */ long f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C2852Ek2.c(str, j, j4, j3);
    }
}
