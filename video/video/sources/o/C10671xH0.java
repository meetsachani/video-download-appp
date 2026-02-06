package o;

import java.util.Arrays;
import o.C10914yH0;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1249:1\n1198#1,7:1251\n1198#1,7:1258\n1198#1,7:1265\n1198#1,7:1272\n1198#1,7:1279\n1198#1,7:1286\n1198#1,7:1293\n1198#1,7:1300\n1209#1,5:1307\n1209#1,5:1312\n1198#1,7:1317\n1198#1,7:1324\n1209#1,5:1331\n1218#1,5:1336\n1#2:1250\n1188#3,3:1341\n1188#3,3:1344\n1188#3,3:1347\n1188#3,3:1350\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n457#1:1251,7\n490#1:1258,7\n494#1:1265,7\n497#1:1272,7\n538#1:1279,7\n541#1:1286,7\n546#1:1293,7\n551#1:1300,7\n558#1:1307,5\n559#1:1312,5\n1153#1:1317,7\n1155#1:1324,7\n1183#1:1331,5\n1191#1:1336,5\n43#1:1341,3\n44#1:1344,3\n55#1:1347,3\n56#1:1350,3\n*E\n"})
/* renamed from: o.xH0 */
/* loaded from: classes3.dex */
public final class C10671xH0 {
    @NotNull
    public static final String a = "0123456789abcdef";
    @NotNull
    public static final String b = "0123456789ABCDEF";
    @NotNull
    public static final int[] c;
    @NotNull
    public static final int[] d;
    @NotNull
    public static final int[] e;
    @NotNull
    public static final long[] f;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = a.charAt(i2 & 15) | (a.charAt(i2 >> 4) << '\b');
        }
        c = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = b.charAt(i3 & 15) | (b.charAt(i3 >> 4) << '\b');
        }
        d = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < a.length()) {
            iArr3[a.charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < b.length()) {
            iArr3[b.charAt(i7)] = i8;
            i7++;
            i8++;
        }
        e = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < a.length()) {
            jArr[a.charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < b.length()) {
            jArr[b.charAt(i)] = i12;
            i++;
            i12++;
        }
        f = jArr;
    }

    @InterfaceC4912Zi0
    public static final int A(@NotNull String str, int i, int i2, @NotNull C10914yH0 c10914yH0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        return E(str, i, i2, c10914yH0, 8);
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    public static final int B(@NotNull String str, @NotNull C10914yH0 c10914yH0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        return A(str, 0, str.length(), c10914yH0);
    }

    public static /* synthetic */ int C(String str, int i, int i2, C10914yH0 c10914yH0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return A(str, i, i2, c10914yH0);
    }

    public static /* synthetic */ int D(String str, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return B(str, c10914yH0);
    }

    @InterfaceC4912Zi0
    public static final int E(String str, int i, int i2, C10914yH0 c10914yH0, int i3) {
        AbstractC8896q1.X.a(i, i2, str.length());
        C10914yH0.d d2 = c10914yH0.d();
        if (d2.i()) {
            e(str, i, i2, i3);
            return Q(str, i, i2);
        }
        String f2 = d2.f();
        String h = d2.h();
        f(str, i, i2, f2, h, d2.c(), i3);
        return Q(str, i + f2.length(), i2 - h.length());
    }

    @InterfaceC4912Zi0
    public static final long F(@NotNull String str, int i, int i2, @NotNull C10914yH0 c10914yH0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        return J(str, i, i2, c10914yH0, 16);
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    public static final long G(@NotNull String str, @NotNull C10914yH0 c10914yH0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        return F(str, 0, str.length(), c10914yH0);
    }

    public static /* synthetic */ long H(String str, int i, int i2, C10914yH0 c10914yH0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return F(str, i, i2, c10914yH0);
    }

    public static /* synthetic */ long I(String str, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return G(str, c10914yH0);
    }

    @InterfaceC4912Zi0
    public static final long J(String str, int i, int i2, C10914yH0 c10914yH0, int i3) {
        AbstractC8896q1.X.a(i, i2, str.length());
        C10914yH0.d d2 = c10914yH0.d();
        if (d2.i()) {
            e(str, i, i2, i3);
            return R(str, i, i2);
        }
        String f2 = d2.f();
        String h = d2.h();
        f(str, i, i2, f2, h, d2.c(), i3);
        return R(str, i + f2.length(), i2 - h.length());
    }

    @InterfaceC4912Zi0
    public static final short K(String str, int i, int i2, C10914yH0 c10914yH0) {
        return (short) E(str, i, i2, c10914yH0, 4);
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    public static final short L(@NotNull String str, @NotNull C10914yH0 c10914yH0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        return K(str, 0, str.length(), c10914yH0);
    }

    public static /* synthetic */ short M(String str, int i, int i2, C10914yH0 c10914yH0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return K(str, i, i2, c10914yH0);
    }

    public static /* synthetic */ short N(String str, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return L(str, c10914yH0);
    }

    public static final long O(String str, int i) {
        char charAt = str.charAt(i);
        if ((charAt >>> '\b') == 0) {
            long j = f[charAt];
            if (j >= 0) {
                return j;
            }
        }
        T(str, i);
        throw new SX0();
    }

    public static final byte P(String str, int i) {
        int[] iArr;
        int i2;
        int i3;
        char charAt = str.charAt(i);
        if ((charAt >>> '\b') == 0 && (i2 = (iArr = e)[charAt]) >= 0) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i4);
            if ((charAt2 >>> '\b') == 0 && (i3 = iArr[charAt2]) >= 0) {
                return (byte) ((i2 << 4) | i3);
            }
            T(str, i4);
            throw new SX0();
        }
        T(str, i);
        throw new SX0();
    }

    public static final int Q(String str, int i, int i2) {
        int i3;
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 << 4;
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0 && (i3 = e[charAt]) >= 0) {
                i4 = i5 | i3;
                i++;
            } else {
                T(str, i);
                throw new SX0();
            }
        }
        return i4;
    }

    public static final long R(String str, int i, int i2) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0) {
                long j3 = f[charAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            T(str, i);
            throw new SX0();
        }
        return j;
    }

    public static final int S(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long a2;
        int i8;
        if (i > 0) {
            long j = i6 + 2 + i7;
            long a3 = a(j, i3, i5);
            if (i2 <= i3) {
                a2 = a(j, i2, i5);
            } else {
                a2 = a(a3, i2 / i3, i4);
                int i9 = i2 % i3;
                if (i9 != 0) {
                    a2 = a2 + i4 + a(j, i9, i5);
                }
            }
            long j2 = i;
            long p0 = p0(j2, a2, 1);
            long j3 = j2 - ((a2 + 1) * p0);
            long p02 = p0(j3, a3, i4);
            long j4 = j3 - ((a3 + i4) * p02);
            long p03 = p0(j4, j, i5);
            if (j4 - ((j + i5) * p03) > 0) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            return (int) ((p0 * i2) + (p02 * i3) + p03 + i8);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final Void T(String str, int i) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i + ", but was " + str.charAt(i));
    }

    public static final void U(String str, int i, int i2, String str2, int i3) {
        C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        C6562gT0.o(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + substring + "\" of length " + (i2 - i));
    }

    public static final void V(String str, int i, int i2, String str2, String str3) {
        C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        C6562gT0.o(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + substring);
    }

    public static final void W(String str, int i, int i2, String str2, String str3) {
        int B = C5075aO1.B(str2.length() + i, i2);
        C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, B);
        C6562gT0.o(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i + ", but was " + substring);
    }

    public static final int X(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return i + str.length();
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    @NotNull
    public static final String Y(byte b2, @NotNull C10914yH0 c10914yH0) {
        String str;
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        if (c10914yH0.e()) {
            str = b;
        } else {
            str = a;
        }
        C10914yH0.d d2 = c10914yH0.d();
        if (d2.j()) {
            char[] cArr = {str.charAt((b2 >> 4) & 15), str.charAt(b2 & C8077mf.q)};
            if (d2.g()) {
                return C9545sf2.N1(cArr, C5075aO1.B((Integer.numberOfLeadingZeros(b2 & 255) - 24) >> 2, 1), 0, 2, null);
            }
            return C9545sf2.L1(cArr);
        }
        return k0(b2, d2, str, 8);
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    @NotNull
    public static final String Z(int i, @NotNull C10914yH0 c10914yH0) {
        String str;
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        if (c10914yH0.e()) {
            str = b;
        } else {
            str = a;
        }
        C10914yH0.d d2 = c10914yH0.d();
        if (d2.j()) {
            char[] cArr = {str.charAt((i >> 28) & 15), str.charAt((i >> 24) & 15), str.charAt((i >> 20) & 15), str.charAt((i >> 16) & 15), str.charAt((i >> 12) & 15), str.charAt((i >> 8) & 15), str.charAt((i >> 4) & 15), str.charAt(i & 15)};
            if (d2.g()) {
                return C9545sf2.N1(cArr, C5075aO1.B(Integer.numberOfLeadingZeros(i) >> 2, 7), 0, 2, null);
            }
            return C9545sf2.L1(cArr);
        }
        return k0(i, d2, str, 32);
    }

    public static final long a(long j, int i, int i2) {
        if (i > 0) {
            long j2 = i;
            return (j * j2) + (i2 * (j2 - 1));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    @NotNull
    public static final String a0(long j, @NotNull C10914yH0 c10914yH0) {
        String str;
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        if (c10914yH0.e()) {
            str = b;
        } else {
            str = a;
        }
        C10914yH0.d d2 = c10914yH0.d();
        if (d2.j()) {
            char[] cArr = {str.charAt((int) ((j >> 60) & 15)), str.charAt((int) ((j >> 56) & 15)), str.charAt((int) ((j >> 52) & 15)), str.charAt((int) ((j >> 48) & 15)), str.charAt((int) ((j >> 44) & 15)), str.charAt((int) ((j >> 40) & 15)), str.charAt((int) ((j >> 36) & 15)), str.charAt((int) ((j >> 32) & 15)), str.charAt((int) ((j >> 28) & 15)), str.charAt((int) ((j >> 24) & 15)), str.charAt((int) ((j >> 20) & 15)), str.charAt((int) ((j >> 16) & 15)), str.charAt((int) ((j >> 12) & 15)), str.charAt((int) ((j >> 8) & 15)), str.charAt((int) ((j >> 4) & 15)), str.charAt((int) (j & 15))};
            if (d2.g()) {
                return C9545sf2.N1(cArr, C5075aO1.B(Long.numberOfLeadingZeros(j) >> 2, 15), 0, 2, null);
            }
            return C9545sf2.L1(cArr);
        }
        return k0(j, d2, str, 64);
    }

    public static final int b(String str, int i, int i2, String str2, boolean z, String str3) {
        if (str2.length() == 0) {
            return i;
        }
        int length = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!CB.J(str2.charAt(i3), str.charAt(i + i3), z)) {
                W(str, i, i2, str2, str3);
            }
        }
        return i + str2.length();
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    @NotNull
    public static final String b0(short s, @NotNull C10914yH0 c10914yH0) {
        String str;
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        if (c10914yH0.e()) {
            str = b;
        } else {
            str = a;
        }
        C10914yH0.d d2 = c10914yH0.d();
        if (d2.j()) {
            char[] cArr = {str.charAt((s >> 12) & 15), str.charAt((s >> 8) & 15), str.charAt((s >> 4) & 15), str.charAt(s & 15)};
            if (d2.g()) {
                return C9545sf2.N1(cArr, C5075aO1.B((Integer.numberOfLeadingZeros(s & Xx2.Y0) - 16) >> 2, 3), 0, 2, null);
            }
            return C9545sf2.L1(cArr);
        }
        return k0(s, d2, str, 16);
    }

    public static final int c(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) C9860tx2.j0(C9860tx2.n(j))));
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    @NotNull
    public static final String c0(@NotNull byte[] bArr, int i, int i2, @NotNull C10914yH0 c10914yH0) {
        int[] iArr;
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        AbstractC8896q1.X.a(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        if (c10914yH0.e()) {
            iArr = d;
        } else {
            iArr = c;
        }
        C10914yH0.b c2 = c10914yH0.c();
        if (c2.j()) {
            return l0(bArr, i, i2, c2, iArr);
        }
        return o0(bArr, i, i2, c2, iArr);
    }

    public static final int d(String str, int i, int i2) {
        if (str.charAt(i) == '\r') {
            int i3 = i + 1;
            if (i3 < i2 && str.charAt(i3) == '\n') {
                return i + 2;
            }
            return i3;
        } else if (str.charAt(i) == '\n') {
            return i + 1;
        } else {
            throw new NumberFormatException("Expected a new line at index " + i + ", but was " + str.charAt(i));
        }
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    @NotNull
    public static final String d0(@NotNull byte[] bArr, @NotNull C10914yH0 c10914yH0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        return c0(bArr, 0, bArr.length, c10914yH0);
    }

    public static final void e(String str, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 1) {
            U(str, i, i2, "at least", 1);
        } else if (i4 > i3) {
            g(str, i, (i4 + i) - i3);
        }
    }

    public static /* synthetic */ String e0(byte b2, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return Y(b2, c10914yH0);
    }

    public static final void f(String str, int i, int i2, String str2, String str3, boolean z, int i3) {
        if ((i2 - i) - str2.length() <= str3.length()) {
            V(str, i, i2, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!CB.J(str2.charAt(i4), str.charAt(i + i4), z)) {
                    W(str, i, i2, str2, "prefix");
                }
            }
            i += str2.length();
        }
        int length2 = i2 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i5 = 0; i5 < length3; i5++) {
                if (!CB.J(str3.charAt(i5), str.charAt(length2 + i5), z)) {
                    W(str, length2, i2, str3, "suffix");
                }
            }
        }
        e(str, i, length2, i3);
    }

    public static /* synthetic */ String f0(int i, C10914yH0 c10914yH0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return Z(i, c10914yH0);
    }

    public static final void g(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == '0') {
                i++;
            } else {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i + ", but was '" + str.charAt(i) + "'.\nThe result won't fit the type being parsed.");
            }
        }
    }

    public static /* synthetic */ String g0(long j, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return a0(j, c10914yH0);
    }

    public static final int h(String str, int i) {
        int i2;
        char charAt = str.charAt(i);
        if ((charAt >>> '\b') == 0 && (i2 = e[charAt]) >= 0) {
            return i2;
        }
        T(str, i);
        throw new SX0();
    }

    public static /* synthetic */ String h0(short s, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return b0(s, c10914yH0);
    }

    public static final int i(byte[] bArr, int i, String str, String str2, int[] iArr, char[] cArr, int i2) {
        return X(str2, cArr, j(bArr, i, iArr, cArr, X(str, cArr, i2)));
    }

    public static /* synthetic */ String i0(byte[] bArr, int i, int i2, C10914yH0 c10914yH0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return c0(bArr, i, i2, c10914yH0);
    }

    public static final int j(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static /* synthetic */ String j0(byte[] bArr, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return d0(bArr, c10914yH0);
    }

    public static final int k(int i, int i2, int i3, int i4) {
        if (i > 0) {
            long j = i2;
            return c((i * (((i3 + 2) + i4) + j)) - j);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @InterfaceC4912Zi0
    public static final String k0(long j, C10914yH0.d dVar, String str, int i) {
        if ((i & 3) == 0) {
            int i2 = i >> 2;
            int d2 = dVar.d();
            int u = C5075aO1.u(d2 - i2, 0);
            String f2 = dVar.f();
            String h = dVar.h();
            boolean g = dVar.g();
            int c2 = c(f2.length() + u + i2 + h.length());
            char[] cArr = new char[c2];
            int X = X(f2, cArr, 0);
            if (u > 0) {
                int i3 = u + X;
                C4788Ye.H1(cArr, str.charAt(0), X, i3);
                X = i3;
            }
            int i4 = i;
            for (int i5 = 0; i5 < i2; i5++) {
                i4 -= 4;
                int i6 = (int) ((j >> i4) & 15);
                if (g && i6 == 0 && (i4 >> 2) >= d2) {
                    g = true;
                } else {
                    g = false;
                }
                if (!g) {
                    cArr[X] = str.charAt(i6);
                    X++;
                }
            }
            int X2 = X(h, cArr, X);
            if (X2 == c2) {
                return C9545sf2.L1(cArr);
            }
            return C9545sf2.N1(cArr, 0, X2, 1, null);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int l(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (i > 0) {
            int i10 = (i - 1) / i2;
            int i11 = (i2 - 1) / i3;
            int i12 = i % i2;
            if (i12 != 0) {
                i2 = i12;
            }
            return c(i10 + (((i11 * i10) + ((i2 - 1) / i3)) * i4) + (((i8 - i10) - i9) * i5) + (i * (i6 + 2 + i7)));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @InterfaceC4912Zi0
    public static final String l0(byte[] bArr, int i, int i2, C10914yH0.b bVar, int[] iArr) {
        if (bVar.k()) {
            return n0(bArr, i, i2, bVar, iArr);
        }
        return m0(bArr, i, i2, bVar, iArr);
    }

    @NotNull
    public static final int[] m() {
        return c;
    }

    @InterfaceC4912Zi0
    public static final String m0(byte[] bArr, int i, int i2, C10914yH0.b bVar, int[] iArr) {
        String c2 = bVar.c();
        String e2 = bVar.e();
        String d2 = bVar.d();
        char[] cArr = new char[k(i2 - i, d2.length(), c2.length(), e2.length())];
        int i3 = i(bArr, i, c2, e2, iArr, cArr, 0);
        for (int i4 = i + 1; i4 < i2; i4++) {
            i3 = i(bArr, i4, c2, e2, iArr, cArr, X(d2, cArr, i3));
        }
        return C9545sf2.L1(cArr);
    }

    @InterfaceC4912Zi0
    public static final String n0(byte[] bArr, int i, int i2, C10914yH0.b bVar, int[] iArr) {
        int length = bVar.d().length();
        if (length <= 1) {
            int i3 = i2 - i;
            int i4 = 0;
            if (length == 0) {
                char[] cArr = new char[c(i3 * 2)];
                while (i < i2) {
                    i4 = j(bArr, i, iArr, cArr, i4);
                    i++;
                }
                return C9545sf2.L1(cArr);
            }
            char[] cArr2 = new char[c((i3 * 3) - 1)];
            char charAt = bVar.d().charAt(0);
            int j = j(bArr, i, iArr, cArr2, 0);
            for (int i5 = i + 1; i5 < i2; i5++) {
                cArr2[j] = charAt;
                j = j(bArr, i5, iArr, cArr2, j + 1);
            }
            return C9545sf2.L1(cArr2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @InterfaceC4912Zi0
    public static final byte o(String str, int i, int i2, C10914yH0 c10914yH0) {
        return (byte) E(str, i, i2, c10914yH0, 2);
    }

    @InterfaceC4912Zi0
    public static final String o0(byte[] bArr, int i, int i2, C10914yH0.b bVar, int[] iArr) {
        int i3;
        int i4;
        int g = bVar.g();
        int f2 = bVar.f();
        String c2 = bVar.c();
        String e2 = bVar.e();
        String d2 = bVar.d();
        String h = bVar.h();
        int l = l(i2 - i, g, f2, h.length(), d2.length(), c2.length(), e2.length());
        char[] cArr = new char[l];
        int i5 = i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < i2) {
            if (i7 == g) {
                cArr[i6] = '\n';
                i6++;
                i3 = 0;
                i4 = 0;
            } else if (i8 == f2) {
                i6 = X(h, cArr, i6);
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = i8;
            }
            if (i4 != 0) {
                i6 = X(d2, cArr, i6);
            }
            String str = c2;
            int i9 = i(bArr, i5, str, e2, iArr, cArr, i6);
            i5++;
            i8 = i4 + 1;
            i6 = i9;
            c2 = str;
            i7 = i3 + 1;
        }
        if (i6 == l) {
            return C9545sf2.L1(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    public static final byte p(@NotNull String str, @NotNull C10914yH0 c10914yH0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        return o(str, 0, str.length(), c10914yH0);
    }

    public static final long p0(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    public static /* synthetic */ byte q(String str, int i, int i2, C10914yH0 c10914yH0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return o(str, i, i2, c10914yH0);
    }

    public static /* synthetic */ byte r(String str, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return p(str, c10914yH0);
    }

    @InterfaceC4912Zi0
    public static final byte[] s(String str, int i, int i2, C10914yH0 c10914yH0) {
        byte[] w;
        AbstractC8896q1.X.a(i, i2, str.length());
        if (i == i2) {
            return new byte[0];
        }
        C10914yH0.b c2 = c10914yH0.c();
        if (c2.j() && (w = w(str, i, i2, c2)) != null) {
            return w;
        }
        return z(str, i, i2, c2);
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.9")
    @NotNull
    public static final byte[] t(@NotNull String str, @NotNull C10914yH0 c10914yH0) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(c10914yH0, com.facebook.S.A);
        return s(str, 0, str.length(), c10914yH0);
    }

    public static /* synthetic */ byte[] u(String str, int i, int i2, C10914yH0 c10914yH0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return s(str, i, i2, c10914yH0);
    }

    public static /* synthetic */ byte[] v(String str, C10914yH0 c10914yH0, int i, Object obj) {
        if ((i & 1) != 0) {
            c10914yH0 = C10914yH0.d.a();
        }
        return t(str, c10914yH0);
    }

    @InterfaceC4912Zi0
    public static final byte[] w(String str, int i, int i2, C10914yH0.b bVar) {
        if (bVar.k()) {
            return y(str, i, i2, bVar);
        }
        return x(str, i, i2, bVar);
    }

    @InterfaceC4912Zi0
    public static final byte[] x(String str, int i, int i2, C10914yH0.b bVar) {
        String c2 = bVar.c();
        String e2 = bVar.e();
        String d2 = bVar.d();
        long length = d2.length();
        long length2 = c2.length() + 2 + e2.length() + length;
        long j = i2 - i;
        int i3 = (int) ((j + length) / length2);
        if ((i3 * length2) - length != j) {
            return null;
        }
        boolean i4 = bVar.i();
        byte[] bArr = new byte[i3];
        if (c2.length() != 0) {
            int length3 = c2.length();
            for (int i5 = 0; i5 < length3; i5++) {
                if (!CB.J(c2.charAt(i5), str.charAt(i + i5), i4)) {
                    W(str, i, i2, c2, "byte prefix");
                }
            }
            i += c2.length();
        }
        String str2 = e2 + d2 + c2;
        int i6 = i3 - 1;
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i7] = P(str, i);
            i += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i8 = 0; i8 < length4; i8++) {
                    if (!CB.J(str2.charAt(i8), str.charAt(i + i8), i4)) {
                        W(str, i, i2, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i += str2.length();
            }
        }
        bArr[i6] = P(str, i);
        int i9 = i + 2;
        if (e2.length() == 0) {
            return bArr;
        }
        int length5 = e2.length();
        for (int i10 = 0; i10 < length5; i10++) {
            if (!CB.J(e2.charAt(i10), str.charAt(i9 + i10), i4)) {
                W(str, i9, i2, e2, "byte suffix");
            }
        }
        return bArr;
    }

    @InterfaceC4912Zi0
    public static final byte[] y(String str, int i, int i2, C10914yH0.b bVar) {
        int length = bVar.d().length();
        if (length <= 1) {
            int i3 = i2 - i;
            int i4 = 2;
            if (length == 0) {
                if ((i3 & 1) != 0) {
                    return null;
                }
                int i5 = i3 >> 1;
                byte[] bArr = new byte[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr[i7] = P(str, i6);
                    i6 += 2;
                }
                return bArr;
            } else if (i3 % 3 != 2) {
                return null;
            } else {
                int i8 = (i3 / 3) + 1;
                byte[] bArr2 = new byte[i8];
                char charAt = bVar.d().charAt(0);
                bArr2[0] = P(str, 0);
                for (int i9 = 1; i9 < i8; i9++) {
                    if (str.charAt(i4) != charAt) {
                        String d2 = bVar.d();
                        boolean i10 = bVar.i();
                        if (d2.length() != 0) {
                            int length2 = d2.length();
                            for (int i11 = 0; i11 < length2; i11++) {
                                if (!CB.J(d2.charAt(i11), str.charAt(i4 + i11), i10)) {
                                    W(str, i4, i2, d2, "byte separator");
                                }
                            }
                            d2.length();
                        }
                    }
                    bArr2[i9] = P(str, i4 + 1);
                    i4 += 3;
                }
                return bArr2;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0110  */
    @InterfaceC4912Zi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] z(String str, int i, int i2, C10914yH0.b bVar) {
        int i3;
        int i4;
        int i5;
        int g = bVar.g();
        int f2 = bVar.f();
        String c2 = bVar.c();
        String e2 = bVar.e();
        String d2 = bVar.d();
        String h = bVar.h();
        boolean i6 = bVar.i();
        int S = S(i2 - i, g, f2, h.length(), d2.length(), c2.length(), e2.length());
        byte[] bArr = new byte[S];
        int i7 = i;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < i2) {
            if (i9 == g) {
                i7 = d(str, i7, i2);
                i3 = g;
                i4 = f2;
                i9 = 0;
            } else if (i10 == f2) {
                if (h.length() == 0) {
                    i3 = g;
                    i4 = f2;
                } else {
                    int length = h.length();
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = g;
                        int i13 = f2;
                        if (!CB.J(h.charAt(i11), str.charAt(i7 + i11), i6)) {
                            W(str, i7, i2, h, "group separator");
                        }
                        i11++;
                        g = i12;
                        f2 = i13;
                    }
                    i3 = g;
                    i4 = f2;
                    i7 += h.length();
                }
            } else {
                i3 = g;
                i4 = f2;
                if (i10 != 0 && d2.length() != 0) {
                    int length2 = d2.length();
                    int i14 = 0;
                    while (i14 < length2) {
                        int i15 = length2;
                        if (!CB.J(d2.charAt(i14), str.charAt(i7 + i14), i6)) {
                            W(str, i7, i2, d2, "byte separator");
                        }
                        i14++;
                        length2 = i15;
                    }
                    i7 += d2.length();
                }
                i9++;
                i10++;
                if (c2.length() != 0) {
                    int length3 = c2.length();
                    int i16 = 0;
                    while (i16 < length3) {
                        int i17 = length3;
                        if (!CB.J(c2.charAt(i16), str.charAt(i7 + i16), i6)) {
                            W(str, i7, i2, c2, "byte prefix");
                        }
                        i16++;
                        length3 = i17;
                    }
                    i7 += c2.length();
                }
                if (i2 - 2 < i7) {
                    U(str, i7, i2, "exactly", 2);
                }
                int i18 = i8 + 1;
                bArr[i8] = P(str, i7);
                i7 += 2;
                if (e2.length() != 0) {
                    i5 = i18;
                } else {
                    int length4 = e2.length();
                    int i19 = 0;
                    while (i19 < length4) {
                        int i20 = i18;
                        if (!CB.J(e2.charAt(i19), str.charAt(i7 + i19), i6)) {
                            W(str, i7, i2, e2, "byte suffix");
                        }
                        i19++;
                        i18 = i20;
                    }
                    i5 = i18;
                    i7 += e2.length();
                }
                i8 = i5;
                g = i3;
                f2 = i4;
            }
            i10 = 0;
            i9++;
            i10++;
            if (c2.length() != 0) {
            }
            if (i2 - 2 < i7) {
            }
            int i182 = i8 + 1;
            bArr[i8] = P(str, i7);
            i7 += 2;
            if (e2.length() != 0) {
            }
            i8 = i5;
            g = i3;
            f2 = i4;
        }
        if (i8 == S) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i8);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC4912Zi0
    public static /* synthetic */ void n() {
    }
}
