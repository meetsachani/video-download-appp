package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n267#1,7:513\n267#1,7:520\n267#1,7:527\n267#1,7:534\n1#2:541\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n166#1:513,7\n173#1:520,7\n253#1:527,7\n264#1:534,7\n*E\n"})
/* renamed from: o.qf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9053qf2 extends C8810pf2 {
    @XP0
    public static final int E0(String str, int i, int i2, boolean z, HA0<? super Character, Boolean> ha0) {
        boolean z2;
        boolean z3;
        String str2;
        int i3 = i;
        while (i3 <= i2 && ha0.invoke(Character.valueOf(str.charAt(i3))).booleanValue()) {
            i3++;
        }
        if (i != i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 > i2) {
            if (z) {
                return -1;
            }
            return i3;
        }
        if (str.charAt(i3) == '.') {
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 <= i2 && ha0.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
                i5++;
            }
            if (i4 != i5) {
                z3 = true;
            } else {
                z3 = false;
            }
            i3 = i5;
        } else {
            z3 = false;
        }
        if (!z2 && !z3) {
            if (z) {
                return -1;
            }
            if (i2 == i3 + 2) {
                str2 = "NaN";
            } else if (i2 == i3 + 7) {
                str2 = "Infinity";
            } else {
                str2 = null;
            }
            if (str2 == null || C10763xf2.F3(str, str2, i3, false) != i3) {
                return -1;
            }
            return i2 + 1;
        }
        return i3;
    }

    @XP0
    public static final int F0(String str, int i, int i2, HA0<? super Character, Boolean> ha0) {
        while (i <= i2 && ha0.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    @XP0
    public static final int G0(char c) {
        return c | ' ';
    }

    @XP0
    public static final int H0(String str, int i, int i2, HA0<? super Character, Boolean> ha0) {
        while (i2 > i && ha0.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2--;
        }
        return i2;
    }

    @XP0
    public static final String I0(int i, int i2) {
        if (i2 == i + 2) {
            return "NaN";
        }
        if (i2 == i + 7) {
            return "Infinity";
        }
        return null;
    }

    @XP0
    public static final boolean J0(char c) {
        if (((c - '0') & 65535) < 10) {
            return true;
        }
        return false;
    }

    @XP0
    public static final boolean K0(char c) {
        if ((((c | ' ') - 97) & 65535) < 6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean L0(String str) {
        char c;
        boolean z;
        boolean z2;
        int charAt;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        String str2;
        boolean z5;
        boolean z6;
        char charAt2;
        char charAt3;
        boolean z7 = true;
        int length = str.length() - 1;
        int i3 = 0;
        while (true) {
            c = ' ';
            if (i3 > length || str.charAt(i3) > ' ') {
                break;
            }
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        while (length > i3 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i3) == '+' || str.charAt(i3) == '-') {
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        if (str.charAt(i3) == '0') {
            int i4 = i3 + 1;
            if (i4 > length) {
                return true;
            }
            if ((str.charAt(i4) | ' ') == 120) {
                int i5 = i3 + 2;
                int i6 = i5;
                while (true) {
                    if (i6 <= length) {
                        z = z7;
                        if (((str.charAt(i6) - '0') & 65535) >= 10 && (((charAt3 | ' ') - 97) & 65535) >= 6) {
                            break;
                        }
                        i6++;
                        z7 = z;
                    } else {
                        z = z7;
                        break;
                    }
                }
                if (i5 != i6) {
                    z5 = z;
                } else {
                    z5 = false;
                }
                if (i6 <= length) {
                    if (str.charAt(i6) == '.') {
                        int i7 = i6 + 1;
                        int i8 = i7;
                        while (i8 <= length) {
                            char c2 = c;
                            if (((str.charAt(i8) - '0') & 65535) >= 10 && (((charAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i8++;
                            c = c2;
                        }
                        if (i7 != i8) {
                            z6 = z;
                        } else {
                            z6 = false;
                        }
                        i6 = i8;
                    } else {
                        z6 = false;
                    }
                    if (z5 || z6) {
                        i3 = i6;
                        if (i3 != -1 || i3 > length) {
                            return false;
                        }
                        z2 = z;
                        if (!z2) {
                            int i9 = i3;
                            while (i9 <= length && ((str.charAt(i9) - C3599Ly1.j) & 65535) < 10) {
                                i9++;
                            }
                            if (i3 != i9) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                            if (i9 > length) {
                                i3 = i9;
                            } else {
                                if (str.charAt(i9) == '.') {
                                    int i10 = i9 + 1;
                                    i2 = i10;
                                    while (i2 <= length && ((str.charAt(i2) - C3599Ly1.j) & 65535) < 10) {
                                        i2++;
                                    }
                                    if (i10 != i2) {
                                        z4 = z;
                                        if (z3 && !z4) {
                                            if (length == i2 + 2) {
                                                str2 = "NaN";
                                            } else if (length == i2 + 7) {
                                                str2 = "Infinity";
                                            } else {
                                                str2 = null;
                                            }
                                            if (str2 == null || C10763xf2.F3(str, str2, i2, false) != i2) {
                                                i3 = -1;
                                            } else {
                                                i3 = length + 1;
                                            }
                                        } else {
                                            i3 = i2;
                                        }
                                    }
                                } else {
                                    i2 = i9;
                                }
                                z4 = false;
                                if (z3) {
                                }
                                i3 = i2;
                            }
                            if (i3 == -1) {
                                return false;
                            }
                            if (i3 > length) {
                                return z;
                            }
                        }
                        int i11 = i3 + 1;
                        charAt = str.charAt(i3) | ' ';
                        if (!z2) {
                            i = 112;
                        } else {
                            i = 101;
                        }
                        if (charAt == i) {
                            if (z2 || ((charAt != 102 && charAt != 100) || i11 <= length)) {
                                return false;
                            }
                            return z;
                        } else if (i11 > length) {
                            return false;
                        } else {
                            if ((str.charAt(i11) == '+' || str.charAt(i11) == '-') && (i11 = i3 + 2) > length) {
                                return false;
                            }
                            while (i11 <= length && ((str.charAt(i11) - C3599Ly1.j) & 65535) < 10) {
                                i11++;
                            }
                            if (i11 > length) {
                                return z;
                            }
                            if (i11 != length) {
                                return false;
                            }
                            int charAt4 = str.charAt(i11) | ' ';
                            if (charAt4 != 102 && charAt4 != 100) {
                                return false;
                            }
                            return z;
                        }
                    }
                }
                i3 = -1;
                if (i3 != -1) {
                }
                return false;
            }
        }
        z = true;
        z2 = false;
        if (!z2) {
        }
        int i112 = i3 + 1;
        charAt = str.charAt(i3) | ' ';
        if (!z2) {
        }
        if (charAt == i) {
        }
    }

    public static final <T> T M0(String str, HA0<? super String, ? extends T> ha0) {
        try {
            if (L0(str)) {
                return ha0.invoke(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal N0(String str) {
        C6562gT0.p(str, "<this>");
        return new BigDecimal(str);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigDecimal O0(String str, MathContext mathContext) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @InterfaceC6480g82(version = "1.2")
    @Nullable
    public static final BigDecimal P0(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        try {
            if (L0(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @InterfaceC6480g82(version = "1.2")
    @Nullable
    public static final BigDecimal Q0(@NotNull String str, @NotNull MathContext mathContext) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(mathContext, "mathContext");
        try {
            if (L0(str)) {
                return new BigDecimal(str, mathContext);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger R0(String str) {
        C6562gT0.p(str, "<this>");
        return new BigInteger(str);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final BigInteger S0(String str, int i) {
        C6562gT0.p(str, "<this>");
        return new BigInteger(str, BB.a(i));
    }

    @InterfaceC6480g82(version = "1.2")
    @Nullable
    public static final BigInteger T0(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return U0(str, 10);
    }

    @InterfaceC6480g82(version = "1.2")
    @Nullable
    public static final BigInteger U0(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        BB.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                if (BB.b(str.charAt(i2), i) < 0) {
                    return null;
                }
                i2++;
            }
        } else if (BB.b(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, BB.a(i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean V0(String str) {
        return Boolean.parseBoolean(str);
    }

    @XP0
    public static final byte W0(String str) {
        C6562gT0.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final byte X0(String str, int i) {
        C6562gT0.p(str, "<this>");
        return Byte.parseByte(str, BB.a(i));
    }

    @XP0
    public static final double Y0(String str) {
        C6562gT0.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static final Double Z0(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        try {
            if (L0(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @XP0
    public static final float a1(String str) {
        C6562gT0.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static final Float b1(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        try {
            if (L0(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @XP0
    public static final int c1(String str) {
        C6562gT0.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final int d1(String str, int i) {
        C6562gT0.p(str, "<this>");
        return Integer.parseInt(str, BB.a(i));
    }

    @XP0
    public static final long e1(String str) {
        C6562gT0.p(str, "<this>");
        return Long.parseLong(str);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final long f1(String str, int i) {
        C6562gT0.p(str, "<this>");
        return Long.parseLong(str, BB.a(i));
    }

    @XP0
    public static final short g1(String str) {
        C6562gT0.p(str, "<this>");
        return Short.parseShort(str);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final short h1(String str, int i) {
        C6562gT0.p(str, "<this>");
        return Short.parseShort(str, BB.a(i));
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final String i1(byte b, int i) {
        String num = Integer.toString(b, BB.a(i));
        C6562gT0.o(num, "toString(...)");
        return num;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final String j1(int i, int i2) {
        String num = Integer.toString(i, BB.a(i2));
        C6562gT0.o(num, "toString(...)");
        return num;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final String k1(long j, int i) {
        String l = Long.toString(j, BB.a(i));
        C6562gT0.o(l, "toString(...)");
        return l;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final String l1(short s, int i) {
        String num = Integer.toString(s, BB.a(i));
        C6562gT0.o(num, "toString(...)");
        return num;
    }
}
