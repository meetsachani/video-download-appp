package o;

import o.Y70;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes3.dex */
public final class Y41 {
    public static final long a(long j, long j2, long j3) {
        if (Y70.R(j2) && (j ^ j3) < 0) {
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        return j;
    }

    public static final long b(long j) {
        if (j < 0) {
            return Y70.Y.G();
        }
        return Y70.Y.n();
    }

    public static final boolean c(long j) {
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public static final long d(long j, @NotNull EnumC6964i80 enumC6964i80, long j2) {
        C6562gT0.p(enumC6964i80, "unit");
        long g0 = Y70.g0(j2, enumC6964i80);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return a(j, j2, g0);
        }
        if (((g0 - 1) | 1) == Long.MAX_VALUE) {
            return e(j, enumC6964i80, j2);
        }
        long j3 = j + g0;
        if (((j ^ j3) & (g0 ^ j3)) < 0) {
            if (j >= 0) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
        return j3;
    }

    public static final long e(long j, EnumC6964i80 enumC6964i80, long j2) {
        long r = Y70.r(j2, 2);
        long g0 = Y70.g0(r, enumC6964i80);
        if ((1 | (g0 - 1)) == Long.MAX_VALUE) {
            return g0;
        }
        return d(d(j, enumC6964i80, r), enumC6964i80, Y70.U(j2, r));
    }

    public static final long f(long j, long j2, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return Y70.l0(b(j2));
        }
        return g(j, j2, enumC6964i80);
    }

    public static final long g(long j, long j2, EnumC6964i80 enumC6964i80) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            EnumC6964i80 enumC6964i802 = EnumC6964i80.Y0;
            if (enumC6964i80.compareTo(enumC6964i802) < 0) {
                long b = C7448k80.b(1L, enumC6964i802, enumC6964i80);
                long j4 = (j % b) - (j2 % b);
                Y70.a aVar = Y70.Y;
                return Y70.V(C6223f80.x((j / b) - (j2 / b), enumC6964i802), C6223f80.x(j4, enumC6964i80));
            }
            return Y70.l0(b(j3));
        }
        return C6223f80.x(j3, enumC6964i80);
    }

    public static final long h(long j, long j2, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return Y70.Y.T();
            }
            return Y70.l0(b(j2));
        } else if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return b(j);
        } else {
            return g(j, j2, enumC6964i80);
        }
    }
}
