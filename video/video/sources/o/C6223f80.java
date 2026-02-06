package o;

import o.Y70;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1068:1\n1021#1,6:1070\n1024#1,3:1076\n1021#1,6:1079\n1021#1,6:1085\n1024#1,3:1091\n1#2:1069\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n936#1:1070,6\n970#1:1076,3\n973#1:1079,6\n976#1:1085,6\n1021#1:1091,3\n*E\n"})
/* renamed from: o.f80  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6223f80 {
    public static final int a = 1000000;
    public static final long b = 4611686018426999999L;
    public static final long c = 4611686018427387903L;
    public static final long d = 4611686018426L;

    public static final long i(long j, int i) {
        return Y70.o((j << 1) + i);
    }

    public static final long j(long j) {
        return Y70.o((j << 1) + 1);
    }

    public static final long k(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return l(n(j));
        }
        return j(C5075aO1.K(j, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long l(long j) {
        return Y70.o(j << 1);
    }

    public static final long m(long j) {
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            return l(j);
        }
        return j(o(j));
    }

    public static final long n(long j) {
        return j * 1000000;
    }

    public static final long o(long j) {
        return j / 1000000;
    }

    public static final long p(String str, boolean z) {
        int i;
        char charAt;
        char charAt2;
        int i2;
        boolean z2;
        int length = str.length();
        if (length != 0) {
            Y70.a aVar = Y70.Y;
            long T = aVar.T();
            char charAt3 = str.charAt(0);
            int i3 = (charAt3 == '+' || charAt3 == '-') ? 1 : 0;
            boolean z3 = i3 > 0;
            boolean z4 = z3 && C10763xf2.A5(str, '-', false, 2, null);
            if (length > i3) {
                char charAt4 = str.charAt(i3);
                char c2 = ':';
                char c3 = C3599Ly1.j;
                if (charAt4 == 'P') {
                    int i4 = i3 + 1;
                    if (i4 == length) {
                        throw new IllegalArgumentException();
                    }
                    boolean z5 = false;
                    EnumC6964i80 enumC6964i80 = null;
                    while (i4 < length) {
                        if (str.charAt(i4) != 'T') {
                            int i5 = i4;
                            while (true) {
                                if (i5 >= str.length()) {
                                    i2 = length;
                                    break;
                                }
                                char charAt5 = str.charAt(i5);
                                if (c3 > charAt5 || charAt5 >= c2) {
                                    i2 = length;
                                    if (!C10763xf2.m3("+-.", charAt5, false, 2, null)) {
                                        break;
                                    }
                                } else {
                                    i2 = length;
                                }
                                i5++;
                                length = i2;
                                c3 = C3599Ly1.j;
                                c2 = ':';
                            }
                            C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
                            String substring = str.substring(i4, i5);
                            C6562gT0.o(substring, "substring(...)");
                            if (substring.length() != 0) {
                                int length2 = i4 + substring.length();
                                if (length2 >= 0 && length2 < str.length()) {
                                    char charAt6 = str.charAt(length2);
                                    i4 = length2 + 1;
                                    EnumC6964i80 f = C7691l80.f(charAt6, z5);
                                    if (enumC6964i80 != null && enumC6964i80.compareTo(f) <= 0) {
                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                    }
                                    int I3 = C10763xf2.I3(substring, '.', 0, false, 6, null);
                                    if (f == EnumC6964i80.Z0 && I3 > 0) {
                                        C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
                                        String substring2 = substring.substring(0, I3);
                                        C6562gT0.o(substring2, "substring(...)");
                                        z2 = z5;
                                        long V = Y70.V(T, x(q(substring2), f));
                                        C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
                                        String substring3 = substring.substring(I3);
                                        C6562gT0.o(substring3, "substring(...)");
                                        T = Y70.V(V, v(Double.parseDouble(substring3), f));
                                    } else {
                                        z2 = z5;
                                        T = Y70.V(T, x(q(substring), f));
                                    }
                                    z5 = z2;
                                    enumC6964i80 = f;
                                    length = i2;
                                    c3 = C3599Ly1.j;
                                    c2 = ':';
                                } else {
                                    throw new IllegalArgumentException("Missing unit for value " + substring);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else if (z5 || (i4 = i4 + 1) == length) {
                            throw new IllegalArgumentException();
                        } else {
                            z5 = true;
                        }
                    }
                } else if (!z) {
                    int max = Math.max(length - i3, 8);
                    char c4 = C3599Ly1.j;
                    if (C9545sf2.s2(str, i3, "Infinity", 0, max, true)) {
                        T = aVar.n();
                    } else {
                        boolean z6 = !z3;
                        if (z3 && str.charAt(i3) == '(' && C2832Ef2.W7(str) == ')') {
                            i3++;
                            int i6 = length - 1;
                            if (i3 == i6) {
                                throw new IllegalArgumentException("No components");
                            }
                            i = i6;
                            z6 = true;
                        } else {
                            i = length;
                        }
                        boolean z7 = false;
                        EnumC6964i80 enumC6964i802 = null;
                        while (i3 < i) {
                            if (z7 && z6) {
                                while (i3 < str.length() && str.charAt(i3) == ' ') {
                                    i3++;
                                }
                            }
                            int i7 = i3;
                            while (i7 < str.length() && ((c4 <= (charAt2 = str.charAt(i7)) && charAt2 < ':') || charAt2 == '.')) {
                                i7++;
                            }
                            C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str.substring(i3, i7);
                            C6562gT0.o(substring4, "substring(...)");
                            if (substring4.length() != 0) {
                                int length3 = i3 + substring4.length();
                                int i8 = length3;
                                while (i8 < str.length() && 'a' <= (charAt = str.charAt(i8)) && charAt < '{') {
                                    i8++;
                                }
                                C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str.substring(length3, i8);
                                C6562gT0.o(substring5, "substring(...)");
                                i3 = length3 + substring5.length();
                                EnumC6964i80 g = C7691l80.g(substring5);
                                if (enumC6964i802 != null && enumC6964i802.compareTo(g) <= 0) {
                                    throw new IllegalArgumentException("Unexpected order of duration components");
                                }
                                int I32 = C10763xf2.I3(substring4, '.', 0, false, 6, null);
                                if (I32 > 0) {
                                    C6562gT0.n(substring4, "null cannot be cast to non-null type java.lang.String");
                                    String substring6 = substring4.substring(0, I32);
                                    C6562gT0.o(substring6, "substring(...)");
                                    long V2 = Y70.V(T, x(Long.parseLong(substring6), g));
                                    C6562gT0.n(substring4, "null cannot be cast to non-null type java.lang.String");
                                    String substring7 = substring4.substring(I32);
                                    C6562gT0.o(substring7, "substring(...)");
                                    T = Y70.V(V2, v(Double.parseDouble(substring7), g));
                                    if (i3 < i) {
                                        throw new IllegalArgumentException("Fractional component must be last");
                                    }
                                } else {
                                    T = Y70.V(T, x(Long.parseLong(substring4), g));
                                }
                                enumC6964i802 = g;
                                z7 = true;
                                c4 = C3599Ly1.j;
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                return z4 ? Y70.l0(T) : T;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    public static final long q(String str) {
        int i;
        char charAt;
        int length = str.length();
        if (length > 0 && C10763xf2.m3("+-", str.charAt(0), false, 2, null)) {
            i = 1;
        } else {
            i = 0;
        }
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 == '0') {
                        if (i2 == i) {
                            i2++;
                        }
                    } else if ('1' > charAt2 || charAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
            }
        }
        if (C9545sf2.J2(str, C2555Bk.p1, false, 2, null) && length > 1 && '0' <= (charAt = str.charAt(1)) && charAt < ':') {
            return Long.parseLong(C2832Ef2.d7(str, 1));
        }
        return Long.parseLong(str);
    }

    public static final int r(String str, int i, HA0<? super Character, Boolean> ha0) {
        while (i < str.length() && ha0.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    public static final String s(String str, int i, HA0<? super Character, Boolean> ha0) {
        int i2 = i;
        while (i2 < str.length() && ha0.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    public static final long t(double d2, long j) {
        return Y70.W(j, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    public static final long u(int i, long j) {
        return Y70.X(j, i);
    }

    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    public static final long v(double d2, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        double a2 = C7448k80.a(d2, enumC6964i80, EnumC6964i80.Y);
        if (!Double.isNaN(a2)) {
            long M0 = C8071md1.M0(a2);
            if (-4611686018426999999L <= M0 && M0 < 4611686018427000000L) {
                return l(M0);
            }
            return k(C8071md1.M0(C7448k80.a(d2, enumC6964i80, EnumC6964i80.Y0)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    public static final long w(int i, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        if (enumC6964i80.compareTo(EnumC6964i80.Z0) <= 0) {
            return l(C7448k80.c(i, enumC6964i80, EnumC6964i80.Y));
        }
        return x(i, enumC6964i80);
    }

    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    public static final long x(long j, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        EnumC6964i80 enumC6964i802 = EnumC6964i80.Y;
        long c2 = C7448k80.c(b, enumC6964i802, enumC6964i80);
        if ((-c2) <= j && j <= c2) {
            return l(C7448k80.c(j, enumC6964i80, enumC6964i802));
        }
        return j(C5075aO1.K(C7448k80.b(j, enumC6964i80, EnumC6964i80.Y0), -4611686018427387903L, 4611686018427387903L));
    }
}
