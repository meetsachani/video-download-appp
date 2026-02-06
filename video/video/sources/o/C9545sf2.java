package o;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,817:1\n1179#2,2:818\n1#3:820\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:818,2\n*E\n"})
/* renamed from: o.sf2 */
/* loaded from: classes3.dex */
public class C9545sf2 extends C9302rf2 {
    @XP0
    public static final String A1(byte[] bArr, Charset charset) {
        C6562gT0.p(bArr, "bytes");
        C6562gT0.p(charset, C4317Th1.g);
        return new String(bArr, charset);
    }

    @NotNull
    public static final String A2(@NotNull String str, char c, char c2, boolean z) {
        C6562gT0.p(str, "<this>");
        int I3 = C10763xf2.I3(str, c, 0, z, 2, null);
        if (I3 < 0) {
            return str;
        }
        return C10763xf2.d5(str, I3, I3 + 1, String.valueOf(c2)).toString();
    }

    @XP0
    public static final String B1(char[] cArr) {
        C6562gT0.p(cArr, "chars");
        return new String(cArr);
    }

    @NotNull
    public static final String B2(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "oldValue");
        C6562gT0.p(str3, "newValue");
        int J3 = C10763xf2.J3(str, str2, 0, z, 2, null);
        if (J3 < 0) {
            return str;
        }
        return C10763xf2.d5(str, J3, str2.length() + J3, str3).toString();
    }

    @XP0
    public static final String C1(char[] cArr, int i, int i2) {
        C6562gT0.p(cArr, "chars");
        return new String(cArr, i, i2);
    }

    public static /* synthetic */ String C2(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return A2(str, c, c2, z);
    }

    @XP0
    public static final String D1(int[] iArr, int i, int i2) {
        C6562gT0.p(iArr, "codePoints");
        return new String(iArr, i, i2);
    }

    public static /* synthetic */ String D2(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return B2(str, str2, str3, z);
    }

    @InterfaceC9150r20(message = "Use replaceFirstChar instead.", replaceWith = @IR1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @InterfaceC9636t20(warningSince = "1.5")
    @NotNull
    public static final String E1(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        Locale locale = Locale.getDefault();
        C6562gT0.o(locale, "getDefault(...)");
        return F1(str, locale);
    }

    @NotNull
    public static final List<String> E2(@NotNull CharSequence charSequence, @NotNull Pattern pattern, int i) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(pattern, "regex");
        C10763xf2.h5(i);
        if (i == 0) {
            i = -1;
        }
        String[] split = pattern.split(charSequence, i);
        C6562gT0.o(split, "split(...)");
        return C4788Ye.t(split);
    }

    @InterfaceC9150r20(message = "Use replaceFirstChar instead.", replaceWith = @IR1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    @NotNull
    @R61
    @InterfaceC6480g82(version = "1.4")
    public static final String F1(@NotNull String str, @NotNull Locale locale) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(locale, "locale");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    C6562gT0.o(substring, "substring(...)");
                    C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = substring.toUpperCase(locale);
                    C6562gT0.o(upperCase, "toUpperCase(...)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                C6562gT0.o(substring2, "substring(...)");
                sb.append(substring2);
                return sb.toString();
            }
            return str;
        }
        return str;
    }

    public static /* synthetic */ List F2(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return E2(charSequence, pattern, i);
    }

    @XP0
    public static final int G1(String str, int i) {
        C6562gT0.p(str, "<this>");
        return str.codePointAt(i);
    }

    public static boolean G2(@NotNull String str, @NotNull String str2, int i, boolean z) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return s2(str, i, str2, 0, str2.length(), z);
    }

    @XP0
    public static final int H1(String str, int i) {
        C6562gT0.p(str, "<this>");
        return str.codePointBefore(i);
    }

    public static boolean H2(@NotNull String str, @NotNull String str2, boolean z) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return s2(str, 0, str2, 0, str2.length(), z);
    }

    @XP0
    public static final int I1(String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        return str.codePointCount(i, i2);
    }

    public static /* synthetic */ boolean I2(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return G2(str, str2, i, z);
    }

    public static final int J1(@NotNull String str, @NotNull String str2, boolean z) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "other");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    public static /* synthetic */ boolean J2(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return H2(str, str2, z);
    }

    public static /* synthetic */ int K1(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return J1(str, str2, z);
    }

    @XP0
    public static final String K2(String str, int i) {
        C6562gT0.p(str, "<this>");
        String substring = str.substring(i);
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static String L1(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return new String(cArr);
    }

    @XP0
    public static final String L2(String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        String substring = str.substring(i, i2);
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static String M1(@NotNull char[] cArr, int i, int i2) {
        C6562gT0.p(cArr, "<this>");
        AbstractC8896q1.X.a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    @XP0
    public static final byte[] M2(String str, Charset charset) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        byte[] bytes = str.getBytes(charset);
        C6562gT0.o(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ String N1(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return M1(cArr, i, i2);
    }

    public static /* synthetic */ byte[] N2(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        byte[] bytes = str.getBytes(charset);
        C6562gT0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @InterfaceC6480g82(version = "1.5")
    public static final boolean O1(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return C10763xf2.p3(charSequence, charSequence2);
    }

    @XP0
    public static final char[] O2(String str) {
        C6562gT0.p(str, "<this>");
        char[] charArray = str.toCharArray();
        C6562gT0.o(charArray, "toCharArray(...)");
        return charArray;
    }

    @InterfaceC6480g82(version = "1.5")
    public static final boolean P1(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z) {
        if (z) {
            return C10763xf2.o3(charSequence, charSequence2);
        }
        return O1(charSequence, charSequence2);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final char[] P2(@NotNull String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        AbstractC8896q1.X.a(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    @XP0
    public static final boolean Q1(String str, CharSequence charSequence) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @XP0
    public static final char[] Q2(String str, char[] cArr, int i, int i2, int i3) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(cArr, "destination");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @XP0
    public static final boolean R1(String str, StringBuffer stringBuffer) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    public static /* synthetic */ char[] R2(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return P2(str, i, i2);
    }

    @InterfaceC9150r20(message = "Use replaceFirstChar instead.", replaceWith = @IR1(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @InterfaceC9636t20(warningSince = "1.5")
    @NotNull
    public static final String S1(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        if (str.length() > 0 && !Character.isLowerCase(str.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 1);
            C6562gT0.o(substring, "substring(...)");
            Locale locale = Locale.getDefault();
            C6562gT0.o(locale, "getDefault(...)");
            C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            C6562gT0.o(lowerCase, "toLowerCase(...)");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            C6562gT0.o(substring2, "substring(...)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }

    public static /* synthetic */ char[] S2(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        C6562gT0.p(str, "<this>");
        C6562gT0.p(cArr, "destination");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @InterfaceC9150r20(message = "Use replaceFirstChar instead.", replaceWith = @IR1(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    @NotNull
    @R61
    @InterfaceC6480g82(version = "1.4")
    public static final String T1(@NotNull String str, @NotNull Locale locale) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(locale, "locale");
        if (str.length() > 0 && !Character.isLowerCase(str.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 1);
            C6562gT0.o(substring, "substring(...)");
            C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            C6562gT0.o(lowerCase, "toLowerCase(...)");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            C6562gT0.o(substring2, "substring(...)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }

    @XP0
    @InterfaceC9150r20(message = "Use lowercase() instead.", replaceWith = @IR1(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.5")
    public static final String T2(String str) {
        C6562gT0.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        C6562gT0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static String U1(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return new String(bArr, HB.b);
    }

    @XP0
    @InterfaceC9150r20(message = "Use lowercase() instead.", replaceWith = @IR1(expression = "lowercase(locale)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.5")
    public static final String U2(String str, Locale locale) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        C6562gT0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final String V1(@NotNull byte[] bArr, int i, int i2, boolean z) {
        C6562gT0.p(bArr, "<this>");
        AbstractC8896q1.X.a(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, HB.b);
        }
        CharsetDecoder newDecoder = HB.b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String charBuffer = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        C6562gT0.o(charBuffer, "toString(...)");
        return charBuffer;
    }

    @XP0
    public static final Pattern V2(String str, int i) {
        C6562gT0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        C6562gT0.o(compile, "compile(...)");
        return compile;
    }

    public static /* synthetic */ String W1(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return V1(bArr, i, i2, z);
    }

    public static /* synthetic */ Pattern W2(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        C6562gT0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        C6562gT0.o(compile, "compile(...)");
        return compile;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static byte[] X1(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        byte[] bytes = str.getBytes(HB.b);
        C6562gT0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @XP0
    @InterfaceC9150r20(message = "Use uppercase() instead.", replaceWith = @IR1(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.5")
    public static final String X2(String str) {
        C6562gT0.p(str, "<this>");
        String upperCase = str.toUpperCase();
        C6562gT0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final byte[] Y1(@NotNull String str, int i, int i2, boolean z) {
        C6562gT0.p(str, "<this>");
        AbstractC8896q1.X.a(i, i2, str.length());
        if (!z) {
            String substring = str.substring(i, i2);
            C6562gT0.o(substring, "substring(...)");
            Charset charset = HB.b;
            C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            C6562gT0.o(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder newEncoder = HB.b.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i, i2));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            C6562gT0.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                C6562gT0.m(array2);
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @XP0
    @InterfaceC9150r20(message = "Use uppercase() instead.", replaceWith = @IR1(expression = "uppercase(locale)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.5")
    public static final String Y2(String str, Locale locale) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        C6562gT0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ byte[] Z1(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return Y1(str, i, i2, z);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final String Z2(String str) {
        C6562gT0.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        C6562gT0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static boolean a2(@NotNull String str, @NotNull String str2, boolean z) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return s2(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final String a3(String str, Locale locale) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        C6562gT0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ boolean b2(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a2(str, str2, z);
    }

    public static boolean c2(@Nullable String str, @Nullable String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static /* synthetic */ boolean d2(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c2(str, str2, z);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String e2(String str, Locale locale, Object... objArr) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        C6562gT0.o(format, "format(...)");
        return format;
    }

    @XP0
    public static final String f2(String str, Object... objArr) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        C6562gT0.o(format, "format(...)");
        return format;
    }

    @XP0
    public static final String g2(C8319ne2 c8319ne2, String str, Object... objArr) {
        C6562gT0.p(c8319ne2, "<this>");
        C6562gT0.p(str, com.facebook.S.A);
        C6562gT0.p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        C6562gT0.o(format, "format(...)");
        return format;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final String h2(C8319ne2 c8319ne2, Locale locale, String str, Object... objArr) {
        C6562gT0.p(c8319ne2, "<this>");
        C6562gT0.p(str, com.facebook.S.A);
        C6562gT0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        C6562gT0.o(format, "format(...)");
        return format;
    }

    @NotNull
    public static Comparator<String> i2(@NotNull C8319ne2 c8319ne2) {
        C6562gT0.p(c8319ne2, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C6562gT0.o(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @XP0
    public static final String j2(String str) {
        C6562gT0.p(str, "<this>");
        String intern = str.intern();
        C6562gT0.o(intern, "intern(...)");
        return intern;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final String k2(String str) {
        C6562gT0.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C6562gT0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final String l2(String str, Locale locale) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        C6562gT0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @XP0
    public static final int m2(String str, char c, int i) {
        C6562gT0.p(str, "<this>");
        return str.indexOf(c, i);
    }

    @XP0
    public static final int n2(String str, String str2, int i) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "str");
        return str.indexOf(str2, i);
    }

    @XP0
    public static final int o2(String str, char c, int i) {
        C6562gT0.p(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    @XP0
    public static final int p2(String str, String str2, int i) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "str");
        return str.lastIndexOf(str2, i);
    }

    @XP0
    public static final int q2(String str, int i, int i2) {
        C6562gT0.p(str, "<this>");
        return str.offsetByCodePoints(i, i2);
    }

    public static final boolean r2(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        C6562gT0.p(charSequence, "<this>");
        C6562gT0.p(charSequence2, "other");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return s2((String) charSequence, i, (String) charSequence2, i2, i3, z);
        }
        return C10763xf2.v4(charSequence, i, charSequence2, i2, i3, z);
    }

    public static boolean s2(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static /* synthetic */ boolean t2(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return r2(charSequence, i, charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean u2(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return s2(str, i, str2, i2, i3, z);
    }

    @XP0
    public static final String v1(StringBuffer stringBuffer) {
        C6562gT0.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @NotNull
    public static String v2(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return "";
            }
            int i2 = 1;
            if (i != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i);
                    if (1 <= i) {
                        while (true) {
                            sb.append(charSequence);
                            if (i2 == i) {
                                break;
                            }
                            i2++;
                        }
                    }
                    String sb2 = sb.toString();
                    C6562gT0.m(sb2);
                    return sb2;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i];
                for (int i3 = 0; i3 < i; i3++) {
                    cArr[i3] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
    }

    @XP0
    public static final String w1(StringBuilder sb) {
        C6562gT0.p(sb, "stringBuilder");
        return new String(sb);
    }

    @NotNull
    public static final String w2(@NotNull String str, char c, char c2, boolean z) {
        C6562gT0.p(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            C6562gT0.o(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (CB.J(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    @XP0
    public static final String x1(byte[] bArr) {
        C6562gT0.p(bArr, "bytes");
        return new String(bArr, HB.b);
    }

    @NotNull
    public static final String x2(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "oldValue");
        C6562gT0.p(str3, "newValue");
        int i = 0;
        int F3 = C10763xf2.F3(str, str2, 0, z);
        if (F3 < 0) {
            return str;
        }
        int length = str2.length();
        int u = C5075aO1.u(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, F3);
                sb.append(str3);
                i = F3 + length;
                if (F3 >= str.length()) {
                    break;
                }
                F3 = C10763xf2.F3(str, str2, F3 + u, z);
            } while (F3 > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    @XP0
    public static final String y1(byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "bytes");
        return new String(bArr, i, i2, HB.b);
    }

    public static /* synthetic */ String y2(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return w2(str, c, c2, z);
    }

    @XP0
    public static final String z1(byte[] bArr, int i, int i2, Charset charset) {
        C6562gT0.p(bArr, "bytes");
        C6562gT0.p(charset, C4317Th1.g);
        return new String(bArr, i, i2, charset);
    }

    public static /* synthetic */ String z2(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return x2(str, str2, str3, z);
    }
}
