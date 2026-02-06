package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes3.dex */
public final class JN1 {
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final AbstractC10696xN1 a(int i) {
        return new C6289fO2(i, i >> 31);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final AbstractC10696xN1 b(long j) {
        return new C6289fO2((int) j, (int) (j >> 32));
    }

    @NotNull
    public static final String c(@NotNull Object obj, @NotNull Object obj2) {
        C6562gT0.p(obj, "from");
        C6562gT0.p(obj2, "until");
        return "Random range is empty: [" + obj + C6566gU0.h + obj2 + ").";
    }

    public static final void d(double d, double d2) {
        if (d2 > d) {
            return;
        }
        throw new IllegalArgumentException(c(Double.valueOf(d), Double.valueOf(d2)).toString());
    }

    public static final void e(int i, int i2) {
        if (i2 > i) {
            return;
        }
        throw new IllegalArgumentException(c(Integer.valueOf(i), Integer.valueOf(i2)).toString());
    }

    public static final void f(long j, long j2) {
        if (j2 > j) {
            return;
        }
        throw new IllegalArgumentException(c(Long.valueOf(j), Long.valueOf(j2)).toString());
    }

    public static final int g(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @InterfaceC6480g82(version = "1.3")
    public static final int h(@NotNull AbstractC10696xN1 abstractC10696xN1, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(abstractC10696xN1, "<this>");
        C6562gT0.p(c11197zR0, V12.q);
        if (!c11197zR0.isEmpty()) {
            if (c11197zR0.k() < Integer.MAX_VALUE) {
                return abstractC10696xN1.n(c11197zR0.j(), c11197zR0.k() + 1);
            }
            if (c11197zR0.j() > Integer.MIN_VALUE) {
                return abstractC10696xN1.n(c11197zR0.j() - 1, c11197zR0.k()) + 1;
            }
            return abstractC10696xN1.l();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c11197zR0);
    }

    @InterfaceC6480g82(version = "1.3")
    public static final long i(@NotNull AbstractC10696xN1 abstractC10696xN1, @NotNull W41 w41) {
        C6562gT0.p(abstractC10696xN1, "<this>");
        C6562gT0.p(w41, V12.q);
        if (!w41.isEmpty()) {
            if (w41.k() < Long.MAX_VALUE) {
                return abstractC10696xN1.q(w41.j(), w41.k() + 1);
            }
            if (w41.j() > Long.MIN_VALUE) {
                return abstractC10696xN1.q(w41.j() - 1, w41.k()) + 1;
            }
            return abstractC10696xN1.o();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + w41);
    }

    public static final int j(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
