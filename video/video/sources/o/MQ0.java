package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,799:1\n1#2:800\n*E\n"})
/* loaded from: classes3.dex */
public final class MQ0 {
    public static final long a = -3217862419201L;
    public static final long b = 3093527980800L;
    public static final long c = -31557014167219200L;
    public static final long d = 31556889864403199L;
    public static final int e = 146097;
    public static final int f = 719528;
    public static final int g = 3600;
    public static final int h = 60;
    public static final int i = 24;
    public static final int j = 86400;
    public static final int k = 1000000000;
    public static final int l = 1000000;
    public static final int m = 1000;
    @NotNull
    public static final int[] n = {1, 10, 100, 1000, 10000, 100000, 1000000, C3827Oh.m, 100000000, 1000000000};
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f544o = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    @NotNull
    public static final int[] p = {3, 6};
    @NotNull
    public static final int[] q = {1, 2, 4, 5, 7, 8};

    public static final long A(long j2, long j3, FA0 fa0) {
        long j4 = j2 + j3;
        if ((j2 ^ j4) < 0 && (j2 ^ j3) >= 0) {
            fa0.invoke();
            throw new SX0();
        }
        return j4;
    }

    public static final long B(long j2, long j3, FA0 fa0) {
        if (j3 == 1) {
            return j2;
        }
        if (j2 == 1) {
            return j3;
        }
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        long j4 = j2 * j3;
        if (j4 / j3 == j2 && ((j2 != Long.MIN_VALUE || j3 != -1) && (j3 != Long.MIN_VALUE || j2 != -1))) {
            return j4;
        }
        fa0.invoke();
        throw new SX0();
    }

    public static final String C(CharSequence charSequence, int i2) {
        if (charSequence.length() <= i2) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i2).toString() + "...";
    }

    @InterfaceC5395bj0
    public static final String i(C11193zQ0 c11193zQ0) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        C7166iy2 a2 = C7166iy2.h.a(c11193zQ0);
        int g2 = a2.g();
        int i2 = 0;
        if (Math.abs(g2) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (g2 >= 0) {
                sb2.append(g2 + 10000);
                C6562gT0.o(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(g2 - 10000);
                C6562gT0.o(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (g2 >= 10000) {
                sb.append('+');
            }
            sb.append(g2);
        }
        sb.append('-');
        j(sb, sb, a2.d());
        sb.append('-');
        j(sb, sb, a2.a());
        sb.append('T');
        j(sb, sb, a2.b());
        sb.append(':');
        j(sb, sb, a2.c());
        sb.append(':');
        j(sb, sb, a2.f());
        if (a2.e() != 0) {
            sb.append('.');
            while (true) {
                int e2 = a2.e();
                iArr = n;
                int i3 = i2 + 1;
                if (e2 % iArr[i3] != 0) {
                    break;
                }
                i2 = i3;
            }
            int i4 = i2 - (i2 % 3);
            String valueOf = String.valueOf((a2.e() / iArr[i4]) + iArr[9 - i4]);
            C6562gT0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            C6562gT0.o(substring, "substring(...)");
            sb.append(substring);
        }
        sb.append('Z');
        return sb.toString();
    }

    public static final void j(Appendable appendable, StringBuilder sb, int i2) {
        if (i2 < 10) {
            appendable.append(C3599Ly1.j);
        }
        sb.append(i2);
    }

    public static final boolean k(C11193zQ0 c11193zQ0) {
        C6562gT0.p(c11193zQ0, "<this>");
        if (c11193zQ0.compareTo(C11193zQ0.Z.e()) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean m(C11193zQ0 c11193zQ0) {
        C6562gT0.p(c11193zQ0, "<this>");
        if (c11193zQ0.compareTo(C11193zQ0.Z.f()) <= 0) {
            return true;
        }
        return false;
    }

    public static final boolean o(int i2) {
        if ((i2 & 3) == 0) {
            if (i2 % 100 != 0 || i2 % 400 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final int p(int i2, boolean z) {
        if (i2 != 2) {
            if (i2 != 4 && i2 != 6 && i2 != 9 && i2 != 11) {
                return 31;
            }
            return 30;
        } else if (z) {
            return 29;
        } else {
            return 28;
        }
    }

    @InterfaceC5395bj0
    public static final C11193zQ0 q(CharSequence charSequence) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt;
        char charAt2;
        if (charSequence.length() > 0) {
            char charAt3 = charSequence.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i2 = 0;
                charAt3 = ' ';
            } else {
                i2 = 1;
            }
            int i9 = 0;
            int i10 = i2;
            while (i10 < charSequence.length() && '0' <= (charAt2 = charSequence.charAt(i10)) && charAt2 < ':') {
                i9 = (i9 * 10) + (charSequence.charAt(i10) - C3599Ly1.j);
                i10++;
            }
            int i11 = i10 - i2;
            if (i11 <= 10) {
                if (i11 == 10 && C6562gT0.t(charSequence.charAt(i2), 50) >= 0) {
                    y(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i11 + " digits");
                    throw new SX0();
                } else if (i11 >= 4) {
                    if (charAt3 == '+' && i11 == 4) {
                        y(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
                        throw new SX0();
                    } else if (charAt3 == ' ' && i11 != 4) {
                        y(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
                        throw new SX0();
                    } else {
                        if (charAt3 == '-') {
                            i9 = -i9;
                        }
                        int i12 = i9;
                        int i13 = i10 + 16;
                        if (charSequence.length() >= i13) {
                            r(charSequence, "'-'", i10, new HA0() { // from class: o.GQ0
                                @Override // o.HA0
                                public final Object invoke(Object obj) {
                                    boolean s;
                                    s = MQ0.s(((Character) obj).charValue());
                                    return Boolean.valueOf(s);
                                }
                            });
                            r(charSequence, "'-'", i10 + 3, new HA0() { // from class: o.HQ0
                                @Override // o.HA0
                                public final Object invoke(Object obj) {
                                    boolean t;
                                    t = MQ0.t(((Character) obj).charValue());
                                    return Boolean.valueOf(t);
                                }
                            });
                            r(charSequence, "'T' or 't'", i10 + 6, new HA0() { // from class: o.IQ0
                                @Override // o.HA0
                                public final Object invoke(Object obj) {
                                    boolean u;
                                    u = MQ0.u(((Character) obj).charValue());
                                    return Boolean.valueOf(u);
                                }
                            });
                            r(charSequence, "':'", i10 + 9, new HA0() { // from class: o.JQ0
                                @Override // o.HA0
                                public final Object invoke(Object obj) {
                                    boolean v;
                                    v = MQ0.v(((Character) obj).charValue());
                                    return Boolean.valueOf(v);
                                }
                            });
                            r(charSequence, "':'", i10 + 12, new HA0() { // from class: o.KQ0
                                @Override // o.HA0
                                public final Object invoke(Object obj) {
                                    boolean w;
                                    w = MQ0.w(((Character) obj).charValue());
                                    return Boolean.valueOf(w);
                                }
                            });
                            for (int i14 : f544o) {
                                r(charSequence, "an ASCII digit", i14 + i10, new HA0() { // from class: o.LQ0
                                    @Override // o.HA0
                                    public final Object invoke(Object obj) {
                                        boolean x;
                                        x = MQ0.x(((Character) obj).charValue());
                                        return Boolean.valueOf(x);
                                    }
                                });
                            }
                            int z = z(charSequence, i10 + 1);
                            int z2 = z(charSequence, i10 + 4);
                            int z3 = z(charSequence, i10 + 7);
                            int z4 = z(charSequence, i10 + 10);
                            int z5 = z(charSequence, i10 + 13);
                            int i15 = i10 + 15;
                            if (charSequence.charAt(i15) == '.') {
                                i15 = i13;
                                int i16 = 0;
                                while (i15 < charSequence.length() && '0' <= (charAt = charSequence.charAt(i15)) && charAt < ':') {
                                    i16 = (i16 * 10) + (charSequence.charAt(i15) - C3599Ly1.j);
                                    i15++;
                                }
                                int i17 = i15 - i13;
                                if (1 <= i17 && i17 < 10) {
                                    i3 = i16 * n[9 - i17];
                                } else {
                                    y(charSequence, "1..9 digits are supported for the fraction of the second, got " + i17 + " digits");
                                    throw new SX0();
                                }
                            } else {
                                i3 = 0;
                            }
                            if (i15 < charSequence.length()) {
                                char charAt4 = charSequence.charAt(i15);
                                if (charAt4 != '+' && charAt4 != '-') {
                                    if (charAt4 != 'Z' && charAt4 != 'z') {
                                        y(charSequence, "Expected the UTC offset at position " + i15 + ", got '" + charAt4 + '\'');
                                        throw new SX0();
                                    }
                                    int i18 = i15 + 1;
                                    if (charSequence.length() == i18) {
                                        i8 = 1;
                                        i7 = 0;
                                    } else {
                                        y(charSequence, "Extra text after the instant at position " + i18);
                                        throw new SX0();
                                    }
                                } else {
                                    int length = charSequence.length() - i15;
                                    if (length <= 9) {
                                        if (length % 3 == 0) {
                                            for (int i19 : p) {
                                                int i20 = i15 + i19;
                                                if (i20 >= charSequence.length()) {
                                                    break;
                                                } else if (charSequence.charAt(i20) != ':') {
                                                    y(charSequence, "Expected ':' at index " + i20 + ", got '" + charSequence.charAt(i20) + '\'');
                                                    throw new SX0();
                                                }
                                            }
                                            int[] iArr = q;
                                            int length2 = iArr.length;
                                            int i21 = 0;
                                            while (i21 < length2) {
                                                int i22 = iArr[i21] + i15;
                                                if (i22 >= charSequence.length()) {
                                                    break;
                                                }
                                                char charAt5 = charSequence.charAt(i22);
                                                int[] iArr2 = iArr;
                                                if ('0' <= charAt5 && charAt5 < ':') {
                                                    i21++;
                                                    iArr = iArr2;
                                                } else {
                                                    y(charSequence, "Expected an ASCII digit at index " + i22 + ", got '" + charSequence.charAt(i22) + '\'');
                                                    throw new SX0();
                                                }
                                            }
                                            int z6 = z(charSequence, i15 + 1);
                                            if (length > 3) {
                                                i4 = z(charSequence, i15 + 4);
                                            } else {
                                                i4 = 0;
                                            }
                                            if (length > 6) {
                                                i5 = z(charSequence, i15 + 7);
                                            } else {
                                                i5 = 0;
                                            }
                                            if (i4 <= 59) {
                                                if (i5 <= 59) {
                                                    if (z6 > 17 && (z6 != 18 || i4 != 0 || i5 != 0)) {
                                                        y(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i15, charSequence.length()).toString());
                                                        throw new SX0();
                                                    }
                                                    int i23 = (z6 * 3600) + (i4 * 60) + i5;
                                                    if (charAt4 == '-') {
                                                        i6 = -1;
                                                    } else {
                                                        i6 = 1;
                                                    }
                                                    i7 = i6 * i23;
                                                    i8 = 1;
                                                } else {
                                                    y(charSequence, "Expected offset-second-of-minute in 0..59, got " + i5);
                                                    throw new SX0();
                                                }
                                            } else {
                                                y(charSequence, "Expected offset-minute-of-hour in 0..59, got " + i4);
                                                throw new SX0();
                                            }
                                        } else {
                                            y(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i15, charSequence.length()).toString() + '\"');
                                            throw new SX0();
                                        }
                                    } else {
                                        y(charSequence, "The UTC offset string \"" + C(charSequence.subSequence(i15, charSequence.length()).toString(), 16) + "\" is too long");
                                        throw new SX0();
                                    }
                                }
                                if (i8 <= z && z < 13) {
                                    if (i8 <= z2 && z2 <= p(z, o(i12))) {
                                        if (z3 <= 23) {
                                            if (z4 <= 59) {
                                                if (z5 <= 59) {
                                                    return new C7166iy2(i12, z, z2, z3, z4, z5, i3).h(i7);
                                                }
                                                y(charSequence, "Expected second-of-minute in 0..59, got " + z5);
                                                throw new SX0();
                                            }
                                            y(charSequence, "Expected minute-of-hour in 0..59, got " + z4);
                                            throw new SX0();
                                        }
                                        y(charSequence, "Expected hour in 0..23, got " + z3);
                                        throw new SX0();
                                    }
                                    y(charSequence, "Expected a valid day-of-month for month " + z + " of year " + i12 + ", got " + z2);
                                    throw new SX0();
                                }
                                y(charSequence, "Expected a month number in 1..12, got " + z);
                                throw new SX0();
                            }
                            y(charSequence, "The UTC offset at the end of the string is missing");
                            throw new SX0();
                        }
                        y(charSequence, "The input string is too short");
                        throw new SX0();
                    }
                } else {
                    y(charSequence, "The year number must be padded to 4 digits, got " + i11 + " digits");
                    throw new SX0();
                }
            }
            y(charSequence, "Expected at most 10 digits for the year number, got " + i11 + " digits");
            throw new SX0();
        }
        throw new IllegalArgumentException("An empty string is not a valid Instant");
    }

    public static final void r(CharSequence charSequence, String str, int i2, HA0<? super Character, Boolean> ha0) {
        char charAt = charSequence.charAt(i2);
        if (ha0.invoke(Character.valueOf(charAt)).booleanValue()) {
            return;
        }
        y(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i2);
        throw new SX0();
    }

    public static final boolean s(char c2) {
        if (c2 == '-') {
            return true;
        }
        return false;
    }

    public static final boolean t(char c2) {
        if (c2 == '-') {
            return true;
        }
        return false;
    }

    public static final boolean u(char c2) {
        if (c2 != 'T' && c2 != 't') {
            return false;
        }
        return true;
    }

    public static final boolean v(char c2) {
        if (c2 == ':') {
            return true;
        }
        return false;
    }

    public static final boolean w(char c2) {
        if (c2 == ':') {
            return true;
        }
        return false;
    }

    public static final boolean x(char c2) {
        if ('0' > c2 || c2 >= ':') {
            return false;
        }
        return true;
    }

    public static final Void y(CharSequence charSequence, String str) {
        throw new EQ0(str + " when parsing an Instant from \"" + C(charSequence, 64) + '\"');
    }

    public static final int z(CharSequence charSequence, int i2) {
        return ((charSequence.charAt(i2) - '0') * 10) + (charSequence.charAt(i2 + 1) - '0');
    }

    @XP0
    @InterfaceC5395bj0
    @InterfaceC6480g82(version = "2.1")
    public static /* synthetic */ void l(C11193zQ0 c11193zQ0) {
    }

    @XP0
    @InterfaceC5395bj0
    @InterfaceC6480g82(version = "2.1")
    public static /* synthetic */ void n(C11193zQ0 c11193zQ0) {
    }
}
