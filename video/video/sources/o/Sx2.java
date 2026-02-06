package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes3.dex */
public final class Sx2 {
    public static final void a(int i, int i2) {
        int compare;
        compare = Integer.compare(i2 ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return;
        }
        throw new IllegalArgumentException(JN1.c(C7162ix2.g(i), C7162ix2.g(i2)).toString());
    }

    public static final void b(long j, long j2) {
        int compare;
        compare = Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        if (compare > 0) {
            return;
        }
        throw new IllegalArgumentException(JN1.c(C9860tx2.g(j), C9860tx2.g(j2)).toString());
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final byte[] c(@NotNull AbstractC10696xN1 abstractC10696xN1, int i) {
        C6562gT0.p(abstractC10696xN1, "<this>");
        return Ww2.h(abstractC10696xN1.d(i));
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final byte[] d(@NotNull AbstractC10696xN1 abstractC10696xN1, @NotNull byte[] bArr) {
        C6562gT0.p(abstractC10696xN1, "$this$nextUBytes");
        C6562gT0.p(bArr, "array");
        abstractC10696xN1.e(bArr);
        return bArr;
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final byte[] e(@NotNull AbstractC10696xN1 abstractC10696xN1, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(abstractC10696xN1, "$this$nextUBytes");
        C6562gT0.p(bArr, "array");
        abstractC10696xN1.f(bArr, i, i2);
        return bArr;
    }

    public static /* synthetic */ byte[] f(AbstractC10696xN1 abstractC10696xN1, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = Ww2.B(bArr);
        }
        return e(abstractC10696xN1, bArr, i, i2);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int g(@NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(abstractC10696xN1, "<this>");
        return C7162ix2.n(abstractC10696xN1.l());
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int h(@NotNull AbstractC10696xN1 abstractC10696xN1, @NotNull C9617sx2 c9617sx2) {
        int compare;
        int compare2;
        C6562gT0.p(abstractC10696xN1, "<this>");
        C6562gT0.p(c9617sx2, V12.q);
        if (!c9617sx2.isEmpty()) {
            compare = Integer.compare(c9617sx2.k() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE);
            if (compare >= 0) {
                compare2 = Integer.compare(c9617sx2.j() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
                if (compare2 > 0) {
                    return C7162ix2.n(i(abstractC10696xN1, C7162ix2.n(c9617sx2.j() - 1), c9617sx2.k()) + 1);
                }
                return g(abstractC10696xN1);
            }
            return i(abstractC10696xN1, c9617sx2.j(), C7162ix2.n(c9617sx2.k() + 1));
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c9617sx2);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int i(@NotNull AbstractC10696xN1 abstractC10696xN1, int i, int i2) {
        C6562gT0.p(abstractC10696xN1, "$this$nextUInt");
        a(i, i2);
        return C7162ix2.n(abstractC10696xN1.n(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int j(@NotNull AbstractC10696xN1 abstractC10696xN1, int i) {
        C6562gT0.p(abstractC10696xN1, "$this$nextUInt");
        return i(abstractC10696xN1, 0, i);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long k(@NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(abstractC10696xN1, "<this>");
        return C9860tx2.n(abstractC10696xN1.o());
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long l(@NotNull AbstractC10696xN1 abstractC10696xN1, @NotNull C11321zx2 c11321zx2) {
        int compare;
        int compare2;
        C6562gT0.p(abstractC10696xN1, "<this>");
        C6562gT0.p(c11321zx2, V12.q);
        if (!c11321zx2.isEmpty()) {
            compare = Long.compare(c11321zx2.k() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE);
            if (compare >= 0) {
                compare2 = Long.compare(c11321zx2.j() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
                if (compare2 > 0) {
                    long j = 1 & 4294967295L;
                    return C9860tx2.n(n(abstractC10696xN1, C9860tx2.n(c11321zx2.j() - C9860tx2.n(j)), c11321zx2.k()) + C9860tx2.n(j));
                }
                return k(abstractC10696xN1);
            }
            return n(abstractC10696xN1, c11321zx2.j(), C9860tx2.n(c11321zx2.k() + C9860tx2.n(1 & 4294967295L)));
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c11321zx2);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long m(@NotNull AbstractC10696xN1 abstractC10696xN1, long j) {
        C6562gT0.p(abstractC10696xN1, "$this$nextULong");
        return n(abstractC10696xN1, 0L, j);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long n(@NotNull AbstractC10696xN1 abstractC10696xN1, long j, long j2) {
        C6562gT0.p(abstractC10696xN1, "$this$nextULong");
        b(j, j2);
        return C9860tx2.n(abstractC10696xN1.q(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
