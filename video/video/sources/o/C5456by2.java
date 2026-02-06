package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "UStringsKt")
/* renamed from: o.by2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5456by2 {
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final String a(long j, int i) {
        return ZB2.t(j, BB.a(i));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final String b(byte b, int i) {
        String num = Integer.toString(b & 255, BB.a(i));
        C6562gT0.o(num, "toString(...)");
        return num;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final String c(int i, int i2) {
        return ZB2.t(i & 4294967295L, BB.a(i2));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @NotNull
    public static final String d(short s, int i) {
        String num = Integer.toString(s & Xx2.Y0, BB.a(i));
        C6562gT0.o(num, "toString(...)");
        return num;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte e(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        Vw2 g = g(str);
        if (g != null) {
            return g.n0();
        }
        C9302rf2.m1(str);
        throw new SX0();
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final byte f(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        Vw2 h = h(str, i);
        if (h != null) {
            return h.n0();
        }
        C9302rf2.m1(str);
        throw new SX0();
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @Nullable
    public static final Vw2 g(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return h(str, 10);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @Nullable
    public static final Vw2 h(@NotNull String str, int i) {
        int compare;
        C6562gT0.p(str, "<this>");
        C7162ix2 l = l(str, i);
        if (l == null) {
            return null;
        }
        int p0 = l.p0();
        compare = Integer.compare(p0 ^ Integer.MIN_VALUE, C7162ix2.n(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return Vw2.g(Vw2.n((byte) p0));
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int i(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        C7162ix2 k = k(str);
        if (k != null) {
            return k.p0();
        }
        C9302rf2.m1(str);
        throw new SX0();
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int j(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        C7162ix2 l = l(str, i);
        if (l != null) {
            return l.p0();
        }
        C9302rf2.m1(str);
        throw new SX0();
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @Nullable
    public static final C7162ix2 k(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return l(str, 10);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @Nullable
    public static final C7162ix2 l(@NotNull String str, int i) {
        int i2;
        int compare;
        int compare2;
        int compare3;
        C6562gT0.p(str, "<this>");
        BB.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (C6562gT0.t(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int n = C7162ix2.n(i);
        int i4 = 119304647;
        while (i2 < length) {
            int b = BB.b(str.charAt(i2), i);
            if (b >= 0) {
                compare = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    if (i4 == 119304647) {
                        i4 = Qw2.a(-1, n);
                        compare3 = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                int n2 = C7162ix2.n(i3 * n);
                int n3 = C7162ix2.n(C7162ix2.n(b) + n2);
                compare2 = Integer.compare(n3 ^ Integer.MIN_VALUE, n2 ^ Integer.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i2++;
                i3 = n3;
            } else {
                return null;
            }
        }
        return C7162ix2.g(i3);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long m(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        C9860tx2 o2 = o(str);
        if (o2 != null) {
            return o2.p0();
        }
        C9302rf2.m1(str);
        throw new SX0();
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long n(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        C9860tx2 p = p(str, i);
        if (p != null) {
            return p.p0();
        }
        C9302rf2.m1(str);
        throw new SX0();
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @Nullable
    public static final C9860tx2 o(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return p(str, 10);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @Nullable
    public static final C9860tx2 p(@NotNull String str, int i) {
        int b;
        int compare;
        int compare2;
        int compare3;
        C6562gT0.p(str, "<this>");
        BB.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (C6562gT0.t(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long n = C9860tx2.n(i);
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            if (BB.b(str.charAt(i2), i) >= 0) {
                compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    if (j2 == 512409557603043100L) {
                        j2 = Tw2.a(-1L, n);
                        compare3 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                long n2 = C9860tx2.n(j * n);
                long n3 = C9860tx2.n(C9860tx2.n(C7162ix2.n(b) & 4294967295L) + n2);
                compare2 = Long.compare(n3 ^ Long.MIN_VALUE, n2 ^ Long.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i2++;
                j = n3;
            } else {
                return null;
            }
        }
        return C9860tx2.g(j);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short q(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        Xx2 s = s(str);
        if (s != null) {
            return s.n0();
        }
        C9302rf2.m1(str);
        throw new SX0();
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final short r(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        Xx2 t = t(str, i);
        if (t != null) {
            return t.n0();
        }
        C9302rf2.m1(str);
        throw new SX0();
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @Nullable
    public static final Xx2 s(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return t(str, 10);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    @Nullable
    public static final Xx2 t(@NotNull String str, int i) {
        int compare;
        C6562gT0.p(str, "<this>");
        C7162ix2 l = l(str, i);
        if (l == null) {
            return null;
        }
        int p0 = l.p0();
        compare = Integer.compare(p0 ^ Integer.MIN_VALUE, C7162ix2.n(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return Xx2.g(Xx2.n((short) p0));
    }
}
