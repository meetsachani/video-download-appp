package o;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* renamed from: o.Ve2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4500Ve2 {
    public static final int a = 256;
    public static final String b = " ";
    public static final String c = "";
    public static final String d = "\n";
    public static final String e = "\r";
    public static final int f = -1;
    public static final int g = 8192;
    public static final Pattern h = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    public static boolean A(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            int i = 0;
            while (i <= length2) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (C6489gB.f(charSequence3, true, i, charSequence4, 0, length)) {
                    return true;
                }
                i++;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return false;
    }

    public static boolean A0(CharSequence charSequence) {
        if (I0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int A1(CharSequence charSequence, CharSequence charSequence2, int i) {
        return N1(charSequence, charSequence2, i, true);
    }

    public static String A2(String str, int i) {
        int i2;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (i != 0 && length != 0 && (i2 = i % length) != 0) {
            StringBuilder sb = new StringBuilder(length);
            int i3 = -i2;
            sb.append(g3(str, i3));
            sb.append(h3(str, 0, i3));
            return sb.toString();
        }
        return str;
    }

    public static String A3(String str) {
        if (str == null) {
            return "";
        }
        return str.trim();
    }

    public static boolean B(CharSequence charSequence, String str) {
        if (str == null) {
            return true;
        }
        return C(charSequence, str.toCharArray());
    }

    public static boolean B0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (charAt != ' ' && !Character.isLetter(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String B1(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    public static String[] B2(String str) {
        return E2(str, null, -1);
    }

    public static String B3(String str) {
        String z3 = z3(str);
        if (I0(z3)) {
            return null;
        }
        return z3;
    }

    public static boolean C(CharSequence charSequence, char... cArr) {
        if (charSequence != null && cArr != null) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                            return false;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean C0(CharSequence charSequence) {
        if (I0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String C1(String str, int i) {
        return D1(str, i, ' ');
    }

    public static String[] C2(String str, char c2) {
        return R2(str, c2, false);
    }

    public static String C3(String str, int i) {
        return D3(str, 0, i);
    }

    public static boolean D(CharSequence charSequence, String str) {
        if (charSequence != null && str != null) {
            return E(charSequence, str.toCharArray());
        }
        return false;
    }

    public static boolean D0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (charAt != ' ' && !Character.isLetterOrDigit(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String D1(String str, int i, char c2) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return E1(str, i, String.valueOf(c2));
        }
        return c2(c2, length).concat(str);
    }

    public static String[] D2(String str, String str2) {
        return S2(str, str2, -1, false);
    }

    public static String D3(String str, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (str == null) {
                    return null;
                }
                if (i > str.length()) {
                    return "";
                }
                if (str.length() > i2) {
                    return str.substring(i, Math.min(i2 + i, str.length()));
                }
                return str.substring(i);
            }
            throw new IllegalArgumentException("maxWith cannot be negative");
        }
        throw new IllegalArgumentException("offset cannot be negative");
    }

    public static boolean E(CharSequence charSequence, char... cArr) {
        if (cArr != null && charSequence != null) {
            if (charSequence.length() == 0) {
                return true;
            }
            if (cArr.length != 0 && r0(charSequence, cArr) == -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean E0(CharSequence... charSequenceArr) {
        if (C4206Se.n1(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (H0(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static String E1(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (I0(str2)) {
            str2 = b;
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return D1(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String[] E2(String str, String str2, int i) {
        return S2(str, str2, i, false);
    }

    public static String E3(String str) {
        int F1 = F1(str);
        if (F1 == 0) {
            return str;
        }
        int codePointAt = str.codePointAt(0);
        int lowerCase = Character.toLowerCase(codePointAt);
        if (codePointAt == lowerCase) {
            return str;
        }
        int[] iArr = new int[F1];
        iArr[0] = lowerCase;
        int charCount = Character.charCount(codePointAt);
        int i = 1;
        while (charCount < F1) {
            int codePointAt2 = str.codePointAt(charCount);
            iArr[i] = codePointAt2;
            charCount += Character.charCount(codePointAt2);
            i++;
        }
        return new String(iArr, 0, i);
    }

    public static boolean F(CharSequence charSequence) {
        if (I0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean F0(CharSequence... charSequenceArr) {
        if (C4206Se.n1(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (I0(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static int F1(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String[] F2(String str) {
        return G2(str, false);
    }

    public static String F3(String str, char c2) {
        if (!I0(str) && c2 != 0 && str.length() != 1 && str.charAt(0) == c2 && str.charAt(str.length() - 1) == c2) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public static void G(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 321) {
                sb.setCharAt(i, 'L');
            } else if (sb.charAt(i) == 322) {
                sb.setCharAt(i, 'l');
            }
        }
    }

    public static boolean G0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C8206nB.i(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String G1(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String[] G2(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return C4206Se.u;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int type = Character.getType(charArray[0]);
        for (int i2 = 1; i2 < charArray.length; i2++) {
            int type2 = Character.getType(charArray[i2]);
            if (type2 != type) {
                if (z && type2 == 2 && type == 1) {
                    int i3 = i2 - 1;
                    if (i3 != i) {
                        arrayList.add(new String(charArray, i, i3 - i));
                        i = i3;
                    }
                } else {
                    arrayList.add(new String(charArray, i, i2 - i));
                    i = i2;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(C4206Se.u);
    }

    public static String G3(String str, String str2) {
        if (!I0(str) && !I0(str2) && str.length() >= str2.length() * 2 && T2(str, str2) && P(str, str2)) {
            int indexOf = str.indexOf(str2);
            int lastIndexOf = str.lastIndexOf(str2);
            int length = str2.length();
            if (indexOf != -1 && lastIndexOf != -1) {
                return str.substring(indexOf + length, lastIndexOf);
            }
            return str;
        }
        return str;
    }

    public static int H(CharSequence charSequence, char c2) {
        if (I0(charSequence)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (c2 == charSequence.charAt(i2)) {
                i++;
            }
        }
        return i;
    }

    public static boolean H0(CharSequence charSequence) {
        int F1 = F1(charSequence);
        if (F1 == 0) {
            return true;
        }
        for (int i = 0; i < F1; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String H1(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(G21.m(locale));
    }

    public static String[] H2(String str) {
        return G2(str, true);
    }

    public static String H3(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static int I(CharSequence charSequence, CharSequence charSequence2) {
        int i = 0;
        if (I0(charSequence) || I0(charSequence2)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int c2 = C6489gB.c(charSequence, charSequence2, i);
            if (c2 != -1) {
                i2++;
                i = c2 + charSequence2.length();
            } else {
                return i2;
            }
        }
    }

    public static boolean I0(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    public static int[] I1(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int max = Math.max((charSequence4.length() / 2) - 1, 0);
        int[] iArr = new int[charSequence3.length()];
        Arrays.fill(iArr, -1);
        boolean[] zArr = new boolean[charSequence4.length()];
        int i = 0;
        for (int i2 = 0; i2 < charSequence3.length(); i2++) {
            char charAt = charSequence3.charAt(i2);
            int max2 = Math.max(i2 - max, 0);
            int min = Math.min(i2 + max + 1, charSequence4.length());
            while (true) {
                if (max2 >= min) {
                    break;
                }
                if (!zArr[max2] && charAt == charSequence4.charAt(max2)) {
                    iArr[i2] = max2;
                    zArr[max2] = true;
                    i++;
                    break;
                }
                max2++;
            }
        }
        char[] cArr = new char[i];
        char[] cArr2 = new char[i];
        int i3 = 0;
        for (int i4 = 0; i4 < charSequence3.length(); i4++) {
            if (iArr[i4] != -1) {
                cArr[i3] = charSequence3.charAt(i4);
                i3++;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < charSequence4.length(); i6++) {
            if (zArr[i6]) {
                cArr2[i5] = charSequence4.charAt(i6);
                i5++;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            if (cArr[i8] != cArr2[i8]) {
                i7++;
            }
        }
        int i9 = 0;
        for (int i10 = 0; i10 < charSequence3.length() && charSequence.charAt(i10) == charSequence2.charAt(i10); i10++) {
            i9++;
        }
        return new int[]{i, i7 / 2, i9, charSequence4.length()};
    }

    public static String[] I2(String str, String str2) {
        return M2(str, str2, -1, false);
    }

    public static String I3(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(G21.m(locale));
    }

    public static <T extends CharSequence> T J(T t, T t2) {
        if (H0(t)) {
            return t2;
        }
        return t;
    }

    public static boolean J0(CharSequence charSequence) {
        if (!I0(charSequence) && charSequence.length() != 1) {
            int length = charSequence.length();
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < length; i++) {
                if (z && z2) {
                    return true;
                }
                if (Character.isUpperCase(charSequence.charAt(i))) {
                    z = true;
                } else if (Character.isLowerCase(charSequence.charAt(i))) {
                    z2 = true;
                }
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    public static String J1(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 >= 0 && i <= str.length()) {
            if (i < 0) {
                i = 0;
            }
            int i3 = i2 + i;
            if (str.length() <= i3) {
                return str.substring(i);
            }
            return str.substring(i, i3);
        }
        return "";
    }

    public static String[] J2(String str, String str2, int i) {
        return M2(str, str2, i, false);
    }

    public static String J3(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return String.valueOf(cArr);
    }

    public static <T extends CharSequence> T K(T t, T t2) {
        if (I0(t)) {
            return t2;
        }
        return t;
    }

    public static boolean K0(CharSequence... charSequenceArr) {
        return !E0(charSequenceArr);
    }

    public static StringJoiner K1(char c2) {
        return new StringJoiner(String.valueOf(c2));
    }

    public static String[] K2(String str, String str2) {
        return M2(str, str2, -1, true);
    }

    public static String K3(String str, char c2) {
        if (!I0(str) && c2 != 0) {
            return c2 + str + c2;
        }
        return str;
    }

    public static String L(String str) {
        return M(str, "");
    }

    public static boolean L0(CharSequence... charSequenceArr) {
        return !F0(charSequenceArr);
    }

    public static String L1(String str) {
        if (I0(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 1;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Character.isWhitespace(charAt)) {
                if (i3 == 0 && !z) {
                    cArr[i2] = b.charAt(0);
                    i2++;
                }
                i3++;
            } else {
                int i5 = i2 + 1;
                if (charAt == 160) {
                    charAt = ' ';
                }
                cArr[i2] = charAt;
                i3 = 0;
                i2 = i5;
                z = false;
            }
        }
        if (z) {
            return "";
        }
        if (i3 <= 0) {
            i = 0;
        }
        return new String(cArr, 0, i2 - i).trim();
    }

    public static String[] L2(String str, String str2, int i) {
        return M2(str, str2, i, true);
    }

    public static String L3(String str, String str2) {
        if (!I0(str) && !I0(str2)) {
            return str2.concat(str).concat(str2);
        }
        return str;
    }

    public static String M(String str, String str2) {
        if (str == null) {
            return str2;
        }
        return str;
    }

    public static boolean M0(CharSequence charSequence) {
        return !H0(charSequence);
    }

    public static int M1(CharSequence charSequence, CharSequence charSequence2, int i) {
        return N1(charSequence, charSequence2, i, false);
    }

    public static String[] M2(String str, String str2, int i, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C4206Se.u;
        }
        if (str2 != null && !"".equals(str2)) {
            int length2 = str2.length();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                i2 = str.indexOf(str2, i3);
                if (i2 > -1) {
                    if (i2 > i3) {
                        i4++;
                        if (i4 == i) {
                            arrayList.add(str.substring(i3));
                        } else {
                            arrayList.add(str.substring(i3, i2));
                        }
                    } else if (z) {
                        i4++;
                        if (i4 == i) {
                            arrayList.add(str.substring(i3));
                            i2 = length;
                        } else {
                            arrayList.add("");
                        }
                    }
                    i3 = i2 + length2;
                } else {
                    arrayList.add(str.substring(i3));
                }
                i2 = length;
            }
            return (String[]) arrayList.toArray(C4206Se.u);
        }
        return S2(str, null, i, z);
    }

    public static String M3(String str, char c2) {
        boolean z;
        if (!I0(str) && c2 != 0) {
            boolean z2 = false;
            if (str.charAt(0) != c2) {
                z = true;
            } else {
                z = false;
            }
            if (str.charAt(str.length() - 1) != c2) {
                z2 = true;
            }
            if (!z && !z2) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str.length() + 2);
            if (z) {
                sb.append(c2);
            }
            sb.append(str);
            if (z2) {
                sb.append(c2);
            }
            return sb.toString();
        }
        return str;
    }

    public static String N(String str) {
        if (I0(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        if (i == length) {
            return str;
        }
        if (i == 0) {
            return "";
        }
        return new String(cArr, 0, i);
    }

    public static boolean N0(CharSequence charSequence) {
        return !I0(charSequence);
    }

    public static int N1(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        int i2 = -1;
        if (charSequence != null && charSequence2 != null && i > 0) {
            int i3 = 0;
            if (charSequence2.length() == 0) {
                if (!z) {
                    return 0;
                }
                return charSequence.length();
            }
            if (z) {
                i2 = charSequence.length();
            }
            do {
                if (z) {
                    i2 = C6489gB.e(charSequence, charSequence2, i2 - 1);
                } else {
                    i2 = C6489gB.c(charSequence, charSequence2, i2 + 1);
                }
                if (i2 < 0) {
                    break;
                }
                i3++;
            } while (i3 < i);
        }
        return i2;
    }

    public static String[] N2(String str) {
        return S2(str, null, -1, true);
    }

    public static String N3(String str, String str2) {
        if (!I0(str) && !I0(str2)) {
            boolean startsWith = str.startsWith(str2);
            boolean endsWith = str.endsWith(str2);
            if (startsWith && endsWith) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + str2.length());
            if (!startsWith) {
                sb.append(str2);
            }
            sb.append(str);
            if (!endsWith) {
                sb.append(str2);
            }
            return sb.toString();
        }
        return str;
    }

    public static String O(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int s0 = s0(str, str2);
        if (s0 == -1) {
            return "";
        }
        return str2.substring(s0);
    }

    public static boolean O0(CharSequence charSequence) {
        if (I0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String O1(String str, String str2, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        if (i > length) {
            i = length;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 <= length) {
            length = i2;
        }
        if (i > length) {
            int i3 = length;
            length = i;
            i = i3;
        }
        return str.substring(0, i) + str2 + str.substring(length);
    }

    public static String[] O2(String str, char c2) {
        return R2(str, c2, true);
    }

    public static boolean P(CharSequence charSequence, CharSequence charSequence2) {
        return Q(charSequence, charSequence2, false);
    }

    public static boolean P0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (charAt != ' ' && !Character.isDigit(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String P1(String str, CharSequence charSequence, boolean z, CharSequence... charSequenceArr) {
        if (str != null && !I0(charSequence) && !U2(str, charSequence, z)) {
            if (C4206Se.x1(charSequenceArr)) {
                for (CharSequence charSequence2 : charSequenceArr) {
                    if (U2(str, charSequence2, z)) {
                        return str;
                    }
                }
            }
            return charSequence.toString() + str;
        }
        return str;
    }

    public static String[] P2(String str, String str2) {
        return S2(str, str2, -1, true);
    }

    public static boolean Q(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence != null && charSequence2 != null) {
            if (charSequence2.length() > charSequence.length()) {
                return false;
            }
            return C6489gB.f(charSequence, z, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
        } else if (charSequence != charSequence2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean Q0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String Q1(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return P1(str, charSequence, false, charSequenceArr);
    }

    public static String[] Q2(String str, String str2, int i) {
        return S2(str, str2, i, true);
    }

    public static boolean R(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!I0(charSequence) && !C4206Se.n1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (P(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String R0(Iterable<?> iterable, char c2) {
        if (iterable == null) {
            return null;
        }
        return T0(iterable.iterator(), c2);
    }

    public static String R1(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return P1(str, charSequence, true, charSequenceArr);
    }

    public static String[] R2(String str, char c2, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C4206Se.u;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (i < length) {
            if (str.charAt(i) == c2) {
                if (z2 || z) {
                    arrayList.add(str.substring(i2, i));
                    z2 = false;
                    z3 = true;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                z3 = false;
                z2 = true;
            }
        }
        if (z2 || (z && z3)) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(C4206Se.u);
    }

    public static boolean S(CharSequence charSequence, CharSequence charSequence2) {
        return Q(charSequence, charSequence2, true);
    }

    public static String S0(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return U0(iterable.iterator(), str);
    }

    public static String S1(String str, char c2) {
        if (!I0(str) && str.indexOf(c2) != -1) {
            char[] charArray = str.toCharArray();
            int i = 0;
            for (char c3 : charArray) {
                if (c3 != c2) {
                    charArray[i] = c3;
                    i++;
                }
            }
            return new String(charArray, 0, i);
        }
        return str;
    }

    public static String[] S2(String str, String str2, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C4206Se.u;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i4 = 0;
            z4 = false;
            z5 = false;
            i5 = 0;
            int i6 = 1;
            while (i4 < length) {
                if (Character.isWhitespace(str.charAt(i4))) {
                    if (z4 || z) {
                        int i7 = i6 + 1;
                        if (i6 == i) {
                            i4 = length;
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        arrayList.add(str.substring(i5, i4));
                        i6 = i7;
                        z4 = false;
                    }
                    i5 = i4 + 1;
                    i4 = i5;
                } else {
                    i4++;
                    z5 = false;
                    z4 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char charAt = str2.charAt(0);
                i2 = 0;
                z2 = false;
                z3 = false;
                i3 = 0;
                int i8 = 1;
                while (i2 < length) {
                    if (str.charAt(i2) == charAt) {
                        if (z2 || z) {
                            int i9 = i8 + 1;
                            if (i8 == i) {
                                i2 = length;
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            arrayList.add(str.substring(i3, i2));
                            i8 = i9;
                            z2 = false;
                        }
                        i3 = i2 + 1;
                        i2 = i3;
                    } else {
                        i2++;
                        z3 = false;
                        z2 = true;
                    }
                }
            } else {
                i2 = 0;
                z2 = false;
                z3 = false;
                i3 = 0;
                int i10 = 1;
                while (i2 < length) {
                    if (str2.indexOf(str.charAt(i2)) >= 0) {
                        if (z2 || z) {
                            int i11 = i10 + 1;
                            if (i10 == i) {
                                i2 = length;
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            arrayList.add(str.substring(i3, i2));
                            i10 = i11;
                            z2 = false;
                        }
                        i3 = i2 + 1;
                        i2 = i3;
                    } else {
                        i2++;
                        z3 = false;
                        z2 = true;
                    }
                }
            }
            i4 = i2;
            z4 = z2;
            z5 = z3;
            i5 = i3;
        }
        if (z4 || (z && z5)) {
            arrayList.add(str.substring(i5, i4));
        }
        return (String[]) arrayList.toArray(C4206Se.u);
    }

    public static boolean T(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String T0(Iterator<?> it, char c2) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return y3(next);
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(c2);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String T1(String str, String str2) {
        if (!I0(str) && !I0(str2)) {
            return g2(str, str2, "", -1);
        }
        return str;
    }

    public static boolean T2(CharSequence charSequence, CharSequence charSequence2) {
        return U2(charSequence, charSequence2, false);
    }

    public static boolean U(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (C4206Se.x1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (T(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String U0(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    @Deprecated
    public static String U1(String str, String str2) {
        return C9490sQ1.a(str, str2);
    }

    public static boolean U2(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            if (length > charSequence.length()) {
                return false;
            }
            return C6489gB.f(charSequence, z, 0, charSequence2, 0, length);
        } else if (charSequence != charSequence2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean V(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (C4206Se.x1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (W(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String V0(List<?> list, char c2, int i, int i2) {
        if (list == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        return T0(list.subList(i, i2).iterator(), c2);
    }

    public static String V1(String str, String str2) {
        if (!I0(str) && !I0(str2) && str.endsWith(str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static boolean V2(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!I0(charSequence) && !C4206Se.n1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (T2(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean W(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return C6489gB.f(charSequence, true, 0, charSequence2, 0, charSequence.length());
    }

    public static String W0(List<?> list, String str, int i, int i2) {
        if (list == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        return U0(list.subList(i, i2).iterator(), str);
    }

    public static String W1(String str, String str2) {
        if (!I0(str) && !I0(str2) && S(str, str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static boolean W2(CharSequence charSequence, CharSequence charSequence2) {
        return U2(charSequence, charSequence2, true);
    }

    @SafeVarargs
    public static <T extends CharSequence> T X(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                if (M0(t)) {
                    return t;
                }
            }
            return null;
        }
        return null;
    }

    public static String X0(byte[] bArr, char c2) {
        if (bArr == null) {
            return null;
        }
        return Y0(bArr, c2, 0, bArr.length);
    }

    @Deprecated
    public static String X1(String str, String str2) {
        return o2(str, str2, "");
    }

    public static String X2(String str) {
        return Y2(str, null);
    }

    @SafeVarargs
    public static <T extends CharSequence> T Y(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                if (N0(t)) {
                    return t;
                }
            }
            return null;
        }
        return null;
    }

    public static String Y0(byte[] bArr, char c2, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(String.valueOf((int) bArr[i]));
            i++;
        }
        return K1.toString();
    }

    public static String Y1(String str, String str2) {
        return q2(str, str2, "", -1);
    }

    public static String Y2(String str, String str2) {
        return c3(d3(str, str2), str2);
    }

    public static byte[] Z(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return C4206Se.c;
        }
        return str.getBytes(JB.c(str2));
    }

    public static String Z0(char[] cArr, char c2) {
        if (cArr == null) {
            return null;
        }
        return a1(cArr, c2, 0, cArr.length);
    }

    @Deprecated
    public static String Z1(String str, String str2) {
        return C9490sQ1.e(str, str2);
    }

    public static String Z2(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(Normalizer.normalize(str, Normalizer.Form.NFD));
        G(sb);
        return h.matcher(sb).replaceAll("");
    }

    public static String a(String str, int i) {
        return d(str, "...", 0, i);
    }

    public static byte[] a0(String str, Charset charset) {
        if (str == null) {
            return C4206Se.c;
        }
        return str.getBytes(JB.b(charset));
    }

    public static String a1(char[] cArr, char c2, int i, int i2) {
        if (cArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(String.valueOf(cArr[i]));
            i++;
        }
        return K1.toString();
    }

    public static String a2(String str, String str2) {
        if (!I0(str) && !I0(str2) && str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public static String[] a3(String... strArr) {
        return b3(strArr, null);
    }

    public static String b(String str, int i, int i2) {
        return d(str, "...", i, i2);
    }

    public static String b0(String... strArr) {
        if (C4206Se.n1(strArr)) {
            return "";
        }
        int t0 = t0(strArr);
        if (t0 == -1) {
            String str = strArr[0];
            if (str == null) {
                return "";
            }
            return str;
        } else if (t0 == 0) {
            return "";
        } else {
            return strArr[0].substring(0, t0);
        }
    }

    public static String b1(double[] dArr, char c2) {
        if (dArr == null) {
            return null;
        }
        return c1(dArr, c2, 0, dArr.length);
    }

    public static String b2(String str, String str2) {
        if (str != null && W2(str, str2)) {
            return str.substring(F1(str2));
        }
        return str;
    }

    public static String[] b3(String[] strArr, String str) {
        int h0 = C4206Se.h0(strArr);
        if (h0 == 0) {
            return strArr;
        }
        String[] strArr2 = new String[h0];
        for (int i = 0; i < h0; i++) {
            strArr2[i] = Y2(strArr[i], str);
        }
        return strArr2;
    }

    public static String c(String str, String str2, int i) {
        return d(str, str2, 0, i);
    }

    public static String c0(String str) {
        if (I0(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String c1(double[] dArr, char c2, int i, int i2) {
        if (dArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(String.valueOf(dArr[i]));
            i++;
        }
        return K1.toString();
    }

    public static String c2(char c2, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        Arrays.fill(cArr, c2);
        return new String(cArr);
    }

    public static String c3(String str, String str2) {
        int F1 = F1(str);
        if (F1 != 0) {
            if (str2 == null) {
                while (F1 != 0 && Character.isWhitespace(str.charAt(F1 - 1))) {
                    F1--;
                }
            } else if (!str2.isEmpty()) {
                while (F1 != 0 && str2.indexOf(str.charAt(F1 - 1)) != -1) {
                    F1--;
                }
            }
            return str.substring(0, F1);
        }
        return str;
    }

    public static String d(String str, String str2, int i, int i2) {
        if (N0(str) && "".equals(str2) && i2 > 0) {
            return h3(str, 0, i2);
        }
        if (F0(str, str2)) {
            return str;
        }
        int length = str2.length();
        int i3 = length + 1;
        int i4 = length + length + 1;
        if (i2 >= i3) {
            int length2 = str.length();
            if (length2 <= i2) {
                return str;
            }
            if (i > length2) {
                i = length2;
            }
            int i5 = i2 - length;
            if (length2 - i < i5) {
                i = length2 - i5;
            }
            if (i <= i3) {
                return str.substring(0, i5) + str2;
            } else if (i2 >= i4) {
                if ((i2 + i) - length < length2) {
                    return str2 + c(str.substring(i), str2, i5);
                }
                return str2 + str.substring(length2 - i5);
            } else {
                throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", Integer.valueOf(i4)));
            }
        }
        throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", Integer.valueOf(i3)));
    }

    @Deprecated
    public static int d0(CharSequence charSequence, CharSequence charSequence2, Locale locale) {
        if (charSequence != null && charSequence2 != null) {
            if (locale != null) {
                String lowerCase = charSequence.toString().toLowerCase(locale);
                String lowerCase2 = charSequence2.toString().toLowerCase(locale);
                int i = Integer.MIN_VALUE;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < lowerCase2.length(); i4++) {
                    char charAt = lowerCase2.charAt(i4);
                    boolean z = false;
                    while (i3 < lowerCase.length() && !z) {
                        if (charAt == lowerCase.charAt(i3)) {
                            int i5 = i2 + 1;
                            if (i + 1 == i3) {
                                i5 = i2 + 3;
                            }
                            i2 = i5;
                            z = true;
                            i = i3;
                        }
                        i3++;
                    }
                }
                return i2;
            }
            throw new IllegalArgumentException("Locale must not be null");
        }
        throw new IllegalArgumentException("Strings must not be null");
    }

    public static String d1(float[] fArr, char c2) {
        if (fArr == null) {
            return null;
        }
        return e1(fArr, c2, 0, fArr.length);
    }

    public static String d2(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i <= 0) {
            return "";
        }
        int length = str.length();
        if (i != 1 && length != 0) {
            if (length == 1 && i <= 8192) {
                return c2(str.charAt(0), i);
            }
            int i2 = length * i;
            if (length != 1) {
                if (length != 2) {
                    StringBuilder sb = new StringBuilder(i2);
                    for (int i3 = 0; i3 < i; i3++) {
                        sb.append(str);
                    }
                    return sb.toString();
                }
                char charAt = str.charAt(0);
                char charAt2 = str.charAt(1);
                char[] cArr = new char[i2];
                for (int i4 = (i * 2) - 2; i4 >= 0; i4 -= 2) {
                    cArr[i4] = charAt;
                    cArr[i4 + 1] = charAt2;
                }
                return new String(cArr);
            }
            return c2(str.charAt(0), i);
        }
        return str;
    }

    public static String d3(String str, String str2) {
        int F1 = F1(str);
        if (F1 != 0) {
            int i = 0;
            if (str2 == null) {
                while (i != F1 && Character.isWhitespace(str.charAt(i))) {
                    i++;
                }
            } else if (!str2.isEmpty()) {
                while (i != F1 && str2.indexOf(str.charAt(i)) != -1) {
                    i++;
                }
            }
            return str.substring(i);
        }
        return str;
    }

    public static String e(String str, String str2, int i) {
        if (!F0(str, str2) && i < str.length() && i >= str2.length() + 2) {
            int length = i - str2.length();
            int i2 = length / 2;
            int i3 = (length % 2) + i2;
            int length2 = str.length() - i2;
            return str.substring(0, i3) + str2 + str.substring(length2);
        }
        return str;
    }

    public static <T extends CharSequence> T e0(T t, Supplier<T> supplier) {
        if (H0(t)) {
            if (supplier == null) {
                return null;
            }
            return supplier.get();
        }
        return t;
    }

    public static String e1(float[] fArr, char c2, int i, int i2) {
        if (fArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(String.valueOf(fArr[i]));
            i++;
        }
        return K1.toString();
    }

    public static String e2(String str, String str2, int i) {
        if (str != null && str2 != null) {
            return V1(d2(str + str2, i), str2);
        }
        return d2(str, i);
    }

    public static String e3(String str) {
        if (str == null) {
            return "";
        }
        return Y2(str, null);
    }

    public static String f(String str, CharSequence charSequence, boolean z, CharSequence... charSequenceArr) {
        if (str != null && !I0(charSequence) && !Q(str, charSequence, z)) {
            if (C4206Se.x1(charSequenceArr)) {
                for (CharSequence charSequence2 : charSequenceArr) {
                    if (Q(str, charSequence2, z)) {
                        return str;
                    }
                }
            }
            return str + charSequence.toString();
        }
        return str;
    }

    public static <T extends CharSequence> T f0(T t, Supplier<T> supplier) {
        if (I0(t)) {
            if (supplier == null) {
                return null;
            }
            return supplier.get();
        }
        return t;
    }

    public static String f1(int[] iArr, char c2) {
        if (iArr == null) {
            return null;
        }
        return g1(iArr, c2, 0, iArr.length);
    }

    public static String f2(String str, String str2, String str3) {
        return g2(str, str2, str3, -1);
    }

    public static String f3(String str) {
        if (str == null) {
            return null;
        }
        String Y2 = Y2(str, null);
        if (Y2.isEmpty()) {
            return null;
        }
        return Y2;
    }

    public static String g(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return f(str, charSequence, false, charSequenceArr);
    }

    @Deprecated
    public static double g0(CharSequence charSequence, CharSequence charSequence2) {
        int[] I1;
        if (charSequence != null && charSequence2 != null) {
            double d2 = I1(charSequence, charSequence2)[0];
            if (d2 == 0.0d) {
                return 0.0d;
            }
            double length = (((d2 / charSequence.length()) + (d2 / charSequence2.length())) + ((d2 - I1[1]) / d2)) / 3.0d;
            if (length >= 0.7d) {
                length += Math.min(0.1d, 1.0d / I1[3]) * I1[2] * (1.0d - length);
            }
            return Math.round(length * 100.0d) / 100.0d;
        }
        throw new IllegalArgumentException("Strings must not be null");
    }

    public static String g1(int[] iArr, char c2, int i, int i2) {
        if (iArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(String.valueOf(iArr[i]));
            i++;
        }
        return K1.toString();
    }

    public static String g2(String str, String str2, String str3, int i) {
        return h2(str, str2, str3, i, false);
    }

    public static String g3(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i < 0) {
            i = 0;
        }
        if (i > str.length()) {
            return "";
        }
        return str.substring(i);
    }

    public static String h(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return f(str, charSequence, true, charSequenceArr);
    }

    @Deprecated
    public static int h0(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length == 0) {
                return length2;
            }
            if (length2 == 0) {
                return length;
            }
            if (length > length2) {
                length2 = charSequence.length();
                length = length2;
            } else {
                charSequence2 = charSequence;
                charSequence = charSequence2;
            }
            int[] iArr = new int[length + 1];
            for (int i2 = 0; i2 <= length; i2++) {
                iArr[i2] = i2;
            }
            for (int i3 = 1; i3 <= length2; i3++) {
                int i4 = iArr[0];
                char charAt = charSequence.charAt(i3 - 1);
                iArr[0] = i3;
                int i5 = 1;
                while (i5 <= length) {
                    int i6 = iArr[i5];
                    int i7 = i5 - 1;
                    if (charSequence2.charAt(i7) == charAt) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    iArr[i5] = Math.min(Math.min(iArr[i7] + 1, iArr[i5] + 1), i4 + i);
                    i5++;
                    i4 = i6;
                }
            }
            return iArr[length];
        }
        throw new IllegalArgumentException("Strings must not be null");
    }

    public static String h1(long[] jArr, char c2) {
        if (jArr == null) {
            return null;
        }
        return i1(jArr, c2, 0, jArr.length);
    }

    public static String h2(String str, String str2, String str3, int i, boolean z) {
        int m0;
        int min;
        if (!I0(str) && !I0(str2) && str3 != null && i != 0) {
            if (z) {
                str2 = str2.toLowerCase();
            }
            int i2 = 0;
            if (z) {
                m0 = v0(str, str2, 0);
            } else {
                m0 = m0(str, str2, 0);
            }
            if (m0 != -1) {
                int length = str2.length();
                int max = Math.max(str3.length() - length, 0);
                if (i < 0) {
                    min = 16;
                } else {
                    min = Math.min(i, 64);
                }
                StringBuilder sb = new StringBuilder(str.length() + (max * min));
                while (m0 != -1) {
                    sb.append((CharSequence) str, i2, m0);
                    sb.append(str3);
                    i2 = m0 + length;
                    i--;
                    if (i == 0) {
                        break;
                    } else if (z) {
                        m0 = v0(str, str2, i2);
                    } else {
                        m0 = m0(str, str2, i2);
                    }
                }
                sb.append((CharSequence) str, i2, str.length());
                return sb.toString();
            }
            return str;
        }
        return str;
    }

    public static String h3(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i < 0) {
            i += str.length();
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }

    public static String i(String str) {
        int F1 = F1(str);
        if (F1 == 0) {
            return str;
        }
        int codePointAt = str.codePointAt(0);
        int titleCase = Character.toTitleCase(codePointAt);
        if (codePointAt == titleCase) {
            return str;
        }
        int[] iArr = new int[F1];
        iArr[0] = titleCase;
        int charCount = Character.charCount(codePointAt);
        int i = 1;
        while (charCount < F1) {
            int codePointAt2 = str.codePointAt(charCount);
            iArr[i] = codePointAt2;
            charCount += Character.charCount(codePointAt2);
            i++;
        }
        return new String(iArr, 0, i);
    }

    @Deprecated
    public static int i0(CharSequence charSequence, CharSequence charSequence2, int i) {
        int i2;
        int i3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int min;
        int i4;
        if (charSequence != null && charSequence2 != null) {
            if (i >= 0) {
                int length = charSequence.length();
                int length2 = charSequence2.length();
                int i5 = -1;
                if (length == 0) {
                    if (length2 > i) {
                        return -1;
                    }
                    return length2;
                } else if (length2 == 0) {
                    if (length > i) {
                        return -1;
                    }
                    return length;
                } else if (Math.abs(length - length2) > i) {
                    return -1;
                } else {
                    if (length > length2) {
                        i3 = charSequence.length();
                        i2 = length2;
                        charSequence4 = charSequence;
                        charSequence3 = charSequence2;
                    } else {
                        i2 = length;
                        i3 = length2;
                        charSequence3 = charSequence;
                        charSequence4 = charSequence2;
                    }
                    int i6 = i2 + 1;
                    int[] iArr = new int[i6];
                    int[] iArr2 = new int[i6];
                    int i7 = 1;
                    int min2 = Math.min(i2, i) + 1;
                    for (int i8 = 0; i8 < min2; i8++) {
                        iArr[i8] = i8;
                    }
                    Arrays.fill(iArr, min2, i6, Integer.MAX_VALUE);
                    Arrays.fill(iArr2, Integer.MAX_VALUE);
                    int i9 = 1;
                    while (i9 <= i3) {
                        char charAt = charSequence4.charAt(i9 - 1);
                        iArr2[0] = i9;
                        int max = Math.max(i7, i9 - i);
                        if (i9 > Integer.MAX_VALUE - i) {
                            min = i2;
                        } else {
                            min = Math.min(i2, i9 + i);
                        }
                        if (max > min) {
                            return i5;
                        }
                        if (max > i7) {
                            iArr2[max - 1] = Integer.MAX_VALUE;
                        }
                        while (max <= min) {
                            int i10 = max - 1;
                            int i11 = i5;
                            if (charSequence3.charAt(i10) == charAt) {
                                iArr2[max] = iArr[i10];
                                i4 = i7;
                            } else {
                                i4 = i7;
                                iArr2[max] = Math.min(Math.min(iArr2[i10], iArr[max]), iArr[i10]) + 1;
                            }
                            max++;
                            i7 = i4;
                            i5 = i11;
                        }
                        int i12 = i5;
                        i9++;
                        int[] iArr3 = iArr2;
                        iArr2 = iArr;
                        iArr = iArr3;
                        i5 = i12;
                    }
                    int i13 = i5;
                    int i14 = iArr[i2];
                    if (i14 <= i) {
                        return i14;
                    }
                    return i13;
                }
            }
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        throw new IllegalArgumentException("Strings must not be null");
    }

    public static String i1(long[] jArr, char c2, int i, int i2) {
        if (jArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(String.valueOf(jArr[i]));
            i++;
        }
        return K1.toString();
    }

    @Deprecated
    public static String i2(String str, String str2, String str3) {
        return C9490sQ1.f(str, str2, str3);
    }

    public static String i3(String str, int i) {
        if (I0(str)) {
            return str;
        }
        int indexOf = str.indexOf(i);
        if (indexOf == -1) {
            return "";
        }
        return str.substring(indexOf + 1);
    }

    public static String j(String str, int i) {
        return k(str, i, ' ');
    }

    public static int j0(CharSequence charSequence, int i) {
        if (I0(charSequence)) {
            return -1;
        }
        return C6489gB.b(charSequence, i, 0);
    }

    @SafeVarargs
    public static <T> String j1(T... tArr) {
        return m1(tArr, null);
    }

    public static String j2(String str, char c2, char c3) {
        if (str == null) {
            return null;
        }
        return str.replace(c2, c3);
    }

    public static String j3(String str, String str2) {
        int indexOf;
        if (I0(str)) {
            return str;
        }
        if (str2 == null || (indexOf = str.indexOf(str2)) == -1) {
            return "";
        }
        return str.substring(indexOf + str2.length());
    }

    public static String k(String str, int i, char c2) {
        if (str != null && i > 0) {
            int length = str.length();
            int i2 = i - length;
            if (i2 <= 0) {
                return str;
            }
            return y2(D1(str, length + (i2 / 2), c2), i, c2);
        }
        return str;
    }

    public static int k0(CharSequence charSequence, int i, int i2) {
        if (I0(charSequence)) {
            return -1;
        }
        return C6489gB.b(charSequence, i, i2);
    }

    public static String k1(Object[] objArr, char c2) {
        if (objArr == null) {
            return null;
        }
        return l1(objArr, c2, 0, objArr.length);
    }

    public static String k2(String str, String str2, String str3) {
        if (!I0(str) && !I0(str2)) {
            if (str3 == null) {
                str3 = "";
            }
            int length = str3.length();
            int length2 = str.length();
            StringBuilder sb = new StringBuilder(length2);
            boolean z = false;
            for (int i = 0; i < length2; i++) {
                char charAt = str.charAt(i);
                int indexOf = str2.indexOf(charAt);
                if (indexOf >= 0) {
                    if (indexOf < length) {
                        sb.append(str3.charAt(indexOf));
                    }
                    z = true;
                } else {
                    sb.append(charAt);
                }
            }
            if (z) {
                return sb.toString();
            }
            return str;
        }
        return str;
    }

    public static String k3(String str, int i) {
        if (I0(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(i);
        if (lastIndexOf != -1 && lastIndexOf != str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return "";
    }

    public static String l(String str, int i, String str2) {
        if (str != null && i > 0) {
            if (I0(str2)) {
                str2 = b;
            }
            int length = str.length();
            int i2 = i - length;
            if (i2 <= 0) {
                return str;
            }
            return z2(E1(str, length + (i2 / 2), str2), i, str2);
        }
        return str;
    }

    public static int l0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return C6489gB.c(charSequence, charSequence2, 0);
        }
        return -1;
    }

    public static String l1(Object[] objArr, char c2, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(y3(objArr[i]));
            i++;
        }
        return K1.toString();
    }

    public static String l2(String str, String[] strArr, String[] strArr2) {
        return m2(str, strArr, strArr2, false, 0);
    }

    public static String l3(String str, String str2) {
        int lastIndexOf;
        if (I0(str)) {
            return str;
        }
        if (I0(str2) || (lastIndexOf = str.lastIndexOf(str2)) == -1 || lastIndexOf == str.length() - str2.length()) {
            return "";
        }
        return str.substring(lastIndexOf + str2.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r5 != '\r') goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m(String str) {
        if (I0(str)) {
            return str;
        }
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if (charAt != '\r' && charAt != '\n') {
                return str;
            }
            return "";
        }
        int length = str.length();
        int i = length - 1;
        char charAt2 = str.charAt(i);
        if (charAt2 == '\n') {
            if (str.charAt(length - 2) == '\r') {
                length -= 2;
            }
            length = i;
        }
        return str.substring(0, length);
    }

    public static int m0(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence != null && charSequence2 != null) {
            return C6489gB.c(charSequence, charSequence2, i);
        }
        return -1;
    }

    public static String m1(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return n1(objArr, str, 0, objArr.length);
    }

    public static String m2(String str, String[] strArr, String[] strArr2, boolean z, int i) {
        String str2;
        String str3;
        int length;
        if (i < 0) {
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            hashSet.retainAll(new HashSet(Arrays.asList(strArr2)));
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
            }
        }
        if (!I0(str) && !C4206Se.n1(strArr) && !C4206Se.n1(strArr2) && (!C4206Se.x1(strArr) || i != -1)) {
            int length2 = strArr.length;
            int length3 = strArr2.length;
            if (length2 == length3) {
                boolean[] zArr = new boolean[length2];
                int i2 = -1;
                int i3 = -1;
                for (int i4 = 0; i4 < length2; i4++) {
                    if (!zArr[i4] && !I0(strArr[i4]) && strArr2[i4] != null) {
                        int indexOf = str.indexOf(strArr[i4]);
                        if (indexOf == -1) {
                            zArr[i4] = true;
                        } else if (i2 == -1 || indexOf < i2) {
                            i3 = i4;
                            i2 = indexOf;
                        }
                    }
                }
                if (i2 != -1) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < strArr.length; i6++) {
                        if (strArr[i6] != null && (str3 = strArr2[i6]) != null && (length = str3.length() - strArr[i6].length()) > 0) {
                            i5 += length * 3;
                        }
                    }
                    StringBuilder sb = new StringBuilder(str.length() + Math.min(i5, str.length() / 5));
                    int i7 = 0;
                    while (i2 != -1) {
                        while (i7 < i2) {
                            sb.append(str.charAt(i7));
                            i7++;
                        }
                        sb.append(strArr2[i3]);
                        i7 = strArr[i3].length() + i2;
                        i2 = -1;
                        i3 = -1;
                        for (int i8 = 0; i8 < length2; i8++) {
                            if (!zArr[i8] && (str2 = strArr[i8]) != null && !str2.isEmpty() && strArr2[i8] != null) {
                                int indexOf2 = str.indexOf(strArr[i8], i7);
                                if (indexOf2 == -1) {
                                    zArr[i8] = true;
                                } else if (i2 == -1 || indexOf2 < i2) {
                                    i3 = i8;
                                    i2 = indexOf2;
                                }
                            }
                        }
                    }
                    int length4 = str.length();
                    while (i7 < length4) {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                    String sb2 = sb.toString();
                    if (!z) {
                        return sb2;
                    }
                    return m2(sb2, strArr, strArr2, z, i - 1);
                }
            } else {
                throw new IllegalArgumentException("Search and Replace array lengths don't match: " + length2 + " vs " + length3);
            }
        }
        return str;
    }

    public static String m3(String str, int i) {
        if (I0(str)) {
            return str;
        }
        int indexOf = str.indexOf(i);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    @Deprecated
    public static String n(String str, String str2) {
        return V1(str, str2);
    }

    public static int n0(CharSequence charSequence, String str) {
        if (!I0(charSequence) && !I0(str)) {
            return o0(charSequence, str.toCharArray());
        }
        return -1;
    }

    public static String n1(Object[] objArr, String str, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner stringJoiner = new StringJoiner(y3(str));
        while (i < i2) {
            stringJoiner.add(y3(objArr[i]));
            i++;
        }
        return stringJoiner.toString();
    }

    public static String n2(String str, String[] strArr, String[] strArr2) {
        int length;
        if (strArr == null) {
            length = 0;
        } else {
            length = strArr.length;
        }
        return m2(str, strArr, strArr2, true, length);
    }

    public static String n3(String str, String str2) {
        if (!I0(str) && str2 != null) {
            if (str2.isEmpty()) {
                return "";
            }
            int indexOf = str.indexOf(str2);
            if (indexOf == -1) {
                return str;
            }
            return str.substring(0, indexOf);
        }
        return str;
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return "";
        }
        int i = length - 1;
        String substring = str.substring(0, i);
        if (str.charAt(i) == '\n') {
            int i2 = length - 2;
            if (substring.charAt(i2) == '\r') {
                return substring.substring(0, i2);
            }
        }
        return substring;
    }

    public static int o0(CharSequence charSequence, char... cArr) {
        if (!I0(charSequence) && !C4206Se.i1(cArr)) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt && (i3 >= i || i4 >= i2 || !Character.isHighSurrogate(charAt) || cArr[i4 + 1] == charSequence.charAt(i3 + 1))) {
                        return i3;
                    }
                }
            }
        }
        return -1;
    }

    public static String o1(short[] sArr, char c2) {
        if (sArr == null) {
            return null;
        }
        return p1(sArr, c2, 0, sArr.length);
    }

    @Deprecated
    public static String o2(String str, String str2, String str3) {
        return C9490sQ1.h(str, str2, str3);
    }

    public static String o3(String str, String str2) {
        if (!I0(str) && !I0(str2)) {
            int lastIndexOf = str.lastIndexOf(str2);
            if (lastIndexOf == -1) {
                return str;
            }
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static int p(String str, String str2) {
        return q(str, str2, true);
    }

    public static int p0(CharSequence charSequence, CharSequence... charSequenceArr) {
        int c2;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (c2 = C6489gB.c(charSequence, charSequence2, 0)) != -1 && c2 < i) {
                i = c2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public static String p1(short[] sArr, char c2, int i, int i2) {
        if (sArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(String.valueOf((int) sArr[i]));
            i++;
        }
        return K1.toString();
    }

    public static String p2(String str, String str2, String str3) {
        return q2(str, str2, str3, -1);
    }

    public static String p3(String str, String str2) {
        return q3(str, str2, str2);
    }

    public static int q(String str, String str2, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            if (!z) {
                return 1;
            }
            return -1;
        } else if (str2 == null) {
            if (z) {
                return 1;
            }
            return -1;
        } else {
            return str.compareTo(str2);
        }
    }

    public static int q0(CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        if (!I0(charSequence) && !I0(charSequence2)) {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                if (C6489gB.b(charSequence2, charAt, 0) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = i + 1;
                if (i2 < length && Character.isHighSurrogate(charAt)) {
                    char charAt2 = charSequence.charAt(i2);
                    if (z && C6489gB.b(charSequence2, charAt2, 0) < 0) {
                        return i;
                    }
                    i = i2;
                } else if (!z) {
                    return i;
                } else {
                    i = i2;
                }
            }
        }
        return -1;
    }

    public static String q1(boolean[] zArr, char c2) {
        if (zArr == null) {
            return null;
        }
        return r1(zArr, c2, 0, zArr.length);
    }

    public static String q2(String str, String str2, String str3, int i) {
        return h2(str, str2, str3, i, true);
    }

    public static String q3(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (!C11304zt1.l(str, str2, str3) || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(indexOf + str2.length(), indexOf2);
    }

    public static int r(String str, String str2) {
        return s(str, str2, true);
    }

    public static int r0(CharSequence charSequence, char... cArr) {
        if (!I0(charSequence) && !C4206Se.i1(cArr)) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt && (i3 >= i || i4 >= i2 || !Character.isHighSurrogate(charAt) || cArr[i4 + 1] == charSequence.charAt(i3 + 1))) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    public static String r1(boolean[] zArr, char c2, int i, int i2) {
        if (zArr == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        StringJoiner K1 = K1(c2);
        while (i < i2) {
            K1.add(String.valueOf(zArr[i]));
            i++;
        }
        return K1.toString();
    }

    public static String r2(String str, String str2, String str3) {
        return g2(str, str2, str3, 1);
    }

    public static String[] r3(String str, String str2, String str3) {
        int indexOf;
        int i;
        int indexOf2;
        if (str == null || I0(str2) || I0(str3)) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C4206Se.u;
        }
        int length2 = str3.length();
        int length3 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < length - length2 && (indexOf = str.indexOf(str2, i2)) >= 0 && (indexOf2 = str.indexOf(str3, (i = indexOf + length3))) >= 0) {
            arrayList.add(str.substring(i, indexOf2));
            i2 = indexOf2 + length2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(C4206Se.u);
    }

    public static int s(String str, String str2, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            if (!z) {
                return 1;
            }
            return -1;
        } else if (str2 == null) {
            if (z) {
                return 1;
            }
            return -1;
        } else {
            return str.compareToIgnoreCase(str2);
        }
    }

    public static int s0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i = 0;
        if (charSequence != null && charSequence2 != null) {
            while (i < charSequence.length() && i < charSequence2.length() && charSequence.charAt(i) == charSequence2.charAt(i)) {
                i++;
            }
            if (i >= charSequence2.length() && i >= charSequence.length()) {
                return -1;
            }
        }
        return i;
    }

    public static String s1(String str, Object... objArr) {
        if (objArr != null) {
            return m1(objArr, str);
        }
        throw new IllegalArgumentException("Object varargs must not be null");
    }

    public static String s2(String str, String str2, String str3) {
        return q2(str, str2, str3, 1);
    }

    public static String s3(String str) {
        if (I0(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isUpperCase(codePointAt) && !Character.isTitleCase(codePointAt)) {
                if (Character.isLowerCase(codePointAt)) {
                    codePointAt = Character.toUpperCase(codePointAt);
                }
            } else {
                codePointAt = Character.toLowerCase(codePointAt);
            }
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static boolean t(CharSequence charSequence, int i) {
        if (I0(charSequence) || C6489gB.b(charSequence, i, 0) < 0) {
            return false;
        }
        return true;
    }

    public static int t0(CharSequence... charSequenceArr) {
        if (C4206Se.h0(charSequenceArr) <= 1) {
            return -1;
        }
        int length = charSequenceArr.length;
        int i = Integer.MAX_VALUE;
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence == null) {
                z2 = true;
                i = 0;
            } else {
                i = Math.min(charSequence.length(), i);
                i2 = Math.max(charSequence.length(), i2);
                z = false;
            }
        }
        if (z || (i2 == 0 && !z2)) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            char charAt = charSequenceArr[0].charAt(i4);
            int i5 = 1;
            while (true) {
                if (i5 >= length) {
                    break;
                } else if (charSequenceArr[i5].charAt(i4) != charAt) {
                    i3 = i4;
                    break;
                } else {
                    i5++;
                }
            }
            if (i3 != -1) {
                break;
            }
        }
        if (i3 == -1 && i != i2) {
            return i;
        }
        return i3;
    }

    public static int t1(CharSequence charSequence, int i) {
        if (I0(charSequence)) {
            return -1;
        }
        return C6489gB.d(charSequence, i, charSequence.length());
    }

    @Deprecated
    public static String t2(String str, String str2, String str3) {
        return C9490sQ1.j(str, str2, str3);
    }

    public static int[] t3(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return C4206Se.m;
        }
        String charSequence2 = charSequence.toString();
        int codePointCount = charSequence2.codePointCount(0, charSequence2.length());
        int[] iArr = new int[codePointCount];
        int i = 0;
        for (int i2 = 0; i2 < codePointCount; i2++) {
            int codePointAt = charSequence2.codePointAt(i);
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
        }
        return iArr;
    }

    public static boolean u(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null || C6489gB.c(charSequence, charSequence2, 0) < 0) {
            return false;
        }
        return true;
    }

    public static int u0(CharSequence charSequence, CharSequence charSequence2) {
        return v0(charSequence, charSequence2, 0);
    }

    public static int u1(CharSequence charSequence, int i, int i2) {
        if (I0(charSequence)) {
            return -1;
        }
        return C6489gB.d(charSequence, i, i2);
    }

    public static String u2(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String u3(byte[] bArr, Charset charset) {
        return new String(bArr, JB.b(charset));
    }

    public static boolean v(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return w(charSequence, C6489gB.h(charSequence2));
    }

    public static int v0(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence != null && charSequence2 != null) {
            if (i < 0) {
                i = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i;
            }
            int i2 = i;
            while (i2 < length) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (C6489gB.f(charSequence3, true, i2, charSequence4, 0, charSequence2.length())) {
                    return i2;
                }
                i2++;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return -1;
    }

    public static int v1(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null) {
            return -1;
        }
        return C6489gB.e(charSequence, charSequence2, charSequence.length());
    }

    public static String v2(String str, char c2) {
        if (str == null) {
            return null;
        }
        String[] C2 = C2(str, c2);
        C4206Se.a4(C2);
        return k1(C2, c2);
    }

    public static String v3(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static boolean w(CharSequence charSequence, char... cArr) {
        if (!I0(charSequence) && !C4206Se.i1(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i = length - 1;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                            return true;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean w0(CharSequence... charSequenceArr) {
        if (C4206Se.n1(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (M0(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static int w1(CharSequence charSequence, CharSequence charSequence2, int i) {
        return C6489gB.e(charSequence, charSequence2, i);
    }

    public static String w2(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(str.length() - i);
    }

    public static String w3(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.ROOT);
    }

    public static boolean x(CharSequence charSequence, CharSequence... charSequenceArr) {
        return y(new InterfaceC3471Kp2() { // from class: o.Te2
            @Override // o.InterfaceC3471Kp2
            public final boolean a(Object obj, Object obj2) {
                return C4500Ve2.u((CharSequence) obj, (CharSequence) obj2);
            }
        }, charSequence, charSequenceArr);
    }

    public static boolean x0(CharSequence... charSequenceArr) {
        if (C4206Se.n1(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (N0(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static int x1(CharSequence charSequence, CharSequence... charSequenceArr) {
        int e2;
        int i = -1;
        if (charSequence != null && charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && (e2 = C6489gB.e(charSequence, charSequence2, charSequence.length())) > i) {
                    i = e2;
                }
            }
        }
        return i;
    }

    public static String x2(String str, int i) {
        return y2(str, i, ' ');
    }

    @Deprecated
    public static String x3(byte[] bArr, String str) throws UnsupportedEncodingException {
        return new String(bArr, JB.a(str));
    }

    public static boolean y(InterfaceC3471Kp2<CharSequence, CharSequence> interfaceC3471Kp2, CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!I0(charSequence) && !C4206Se.n1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (interfaceC3471Kp2.a(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean y0(CharSequence charSequence) {
        if (I0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLowerCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int y1(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return z1(charSequence, charSequence2, charSequence.length());
        }
        return -1;
    }

    public static String y2(String str, int i, char c2) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return z2(str, i, String.valueOf(c2));
        }
        return str.concat(c2(c2, length));
    }

    public static String y3(Object obj) {
        return Objects.toString(obj, "");
    }

    public static boolean z(CharSequence charSequence, CharSequence... charSequenceArr) {
        return y(new InterfaceC3471Kp2() { // from class: o.Ue2
            @Override // o.InterfaceC3471Kp2
            public final boolean a(Object obj, Object obj2) {
                return C4500Ve2.A((CharSequence) obj, (CharSequence) obj2);
            }
        }, charSequence, charSequenceArr);
    }

    public static boolean z0(CharSequence charSequence) {
        if (I0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isUpperCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int z1(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            if (i > length2) {
                i = length2;
            }
            if (i < 0) {
                return -1;
            }
            if (length == 0) {
                return i;
            }
            int i2 = i;
            while (i2 >= 0) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (C6489gB.f(charSequence3, true, i2, charSequence4, 0, length)) {
                    return i2;
                }
                i2--;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return -1;
    }

    public static String z2(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (I0(str2)) {
            str2 = b;
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return y2(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str.concat(str2);
        }
        if (length2 < length) {
            return str.concat(str2.substring(0, length2));
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return str.concat(new String(cArr));
    }

    public static String z3(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }
}
