package o;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class KM2 {
    public static String a(String str, int i, int i2, String str2) {
        boolean z;
        boolean z2 = true;
        if (i2 >= -1) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "upper value cannot be less than -1", new Object[0]);
        if (i2 < i && i2 != -1) {
            z2 = false;
        }
        C11147zE2.B(z2, "upper value is less than lower value", new Object[0]);
        if (C4500Ve2.I0(str)) {
            return str;
        }
        if (i > str.length()) {
            i = str.length();
        }
        if (i2 == -1 || i2 > str.length()) {
            i2 = str.length();
        }
        StringBuilder sb = new StringBuilder();
        int m0 = C4500Ve2.m0(str, C4500Ve2.b, i);
        if (m0 == -1) {
            sb.append((CharSequence) str, 0, i2);
            if (i2 != str.length()) {
                sb.append(C4500Ve2.L(str2));
            }
        } else {
            sb.append((CharSequence) str, 0, Math.min(m0, i2));
            sb.append(C4500Ve2.L(str2));
        }
        return sb.toString();
    }

    public static String b(String str) {
        return c(str, null);
    }

    public static String c(String str, char... cArr) {
        int codePointAt;
        if (C4500Ve2.I0(str)) {
            return str;
        }
        Set<Integer> g = g(cArr);
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            while (i < length) {
                codePointAt = str.codePointAt(i);
                if (g.contains(Integer.valueOf(codePointAt))) {
                    break;
                } else if (z) {
                    int titleCase = Character.toTitleCase(codePointAt);
                    iArr[i2] = titleCase;
                    i += Character.charCount(titleCase);
                    z = false;
                    i2++;
                } else {
                    iArr[i2] = codePointAt;
                    i += Character.charCount(codePointAt);
                    i2++;
                }
            }
            return new String(iArr, 0, i2);
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
    }

    public static String d(String str) {
        return e(str, null);
    }

    public static String e(String str, char... cArr) {
        if (C4500Ve2.I0(str)) {
            return str;
        }
        return c(str.toLowerCase(), cArr);
    }

    public static boolean f(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (C4500Ve2.I0(charSequence) || C4206Se.n1(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (C4500Ve2.H0(charSequence2)) {
                return false;
            }
            if (!Pattern.compile(".*\\b" + ((Object) charSequence2) + "\\b.*").matcher(charSequence).matches()) {
                return false;
            }
        }
        return true;
    }

    public static Set<Integer> g(char[] cArr) {
        HashSet hashSet = new HashSet();
        if (cArr != null && cArr.length != 0) {
            for (int i = 0; i < cArr.length; i++) {
                hashSet.add(Integer.valueOf(Character.codePointAt(cArr, i)));
            }
            return hashSet;
        }
        if (cArr == null) {
            hashSet.add(Integer.valueOf(Character.codePointAt(new char[]{' '}, 0)));
        }
        return hashSet;
    }

    public static String h(String str) {
        return i(str, null);
    }

    public static String i(String str, char... cArr) {
        if (C4500Ve2.I0(str)) {
            return str;
        }
        if (cArr != null && cArr.length == 0) {
            return "";
        }
        Set<Integer> g = g(cArr);
        int length = str.length();
        int[] iArr = new int[(length / 2) + 1];
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!g.contains(Integer.valueOf(codePointAt)) && (cArr != null || !Character.isWhitespace(codePointAt))) {
                if (z) {
                    iArr[i2] = codePointAt;
                    i2++;
                    z = false;
                }
            } else {
                z = true;
            }
            i += Character.charCount(codePointAt);
        }
        return new String(iArr, 0, i2);
    }

    @Deprecated
    public static boolean j(char c, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(c);
        }
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static boolean k(int i, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(i);
        }
        for (int i2 = 0; i2 < cArr.length; i2++) {
            if (Character.codePointAt(cArr, i2) == i) {
                return true;
            }
        }
        return false;
    }

    public static String l(String str) {
        if (C4500Ve2.I0(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isUpperCase(codePointAt) && !Character.isTitleCase(codePointAt)) {
                if (Character.isLowerCase(codePointAt)) {
                    if (z) {
                        codePointAt = Character.toTitleCase(codePointAt);
                    } else {
                        codePointAt = Character.toUpperCase(codePointAt);
                    }
                } else {
                    z = Character.isWhitespace(codePointAt);
                }
                iArr[i2] = codePointAt;
                i += Character.charCount(codePointAt);
                i2++;
            } else {
                codePointAt = Character.toLowerCase(codePointAt);
            }
            z = false;
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String m(String str) {
        return n(str, null);
    }

    public static String n(String str, char... cArr) {
        int codePointAt;
        if (C4500Ve2.I0(str)) {
            return str;
        }
        Set<Integer> g = g(cArr);
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            while (i < length) {
                codePointAt = str.codePointAt(i);
                if (g.contains(Integer.valueOf(codePointAt))) {
                    break;
                } else if (z) {
                    int lowerCase = Character.toLowerCase(codePointAt);
                    iArr[i2] = lowerCase;
                    i += Character.charCount(lowerCase);
                    z = false;
                    i2++;
                } else {
                    iArr[i2] = codePointAt;
                    i += Character.charCount(codePointAt);
                    i2++;
                }
            }
            return new String(iArr, 0, i2);
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
    }

    public static String o(String str, int i) {
        return p(str, i, null, false);
    }

    public static String p(String str, int i, String str2, boolean z) {
        return q(str, i, str2, z, C4500Ve2.b);
    }

    public static String q(String str, int i, String str2, boolean z, String str3) {
        int i2;
        int i3;
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = System.lineSeparator();
        }
        if (i < 1) {
            i = 1;
        }
        if (C4500Ve2.H0(str3)) {
            str3 = C4500Ve2.b;
        }
        Pattern compile = Pattern.compile(str3);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 32);
        int i4 = 0;
        loop0: while (true) {
            i2 = -1;
            while (i4 < length) {
                Matcher matcher = compile.matcher(str.substring(i4, Math.min((int) Math.min(2147483647L, i4 + i + 1), length)));
                if (matcher.find()) {
                    if (matcher.start() == 0) {
                        i2 = matcher.end();
                        if (i2 != 0) {
                            i4 += matcher.end();
                        } else {
                            i4++;
                        }
                    }
                    i3 = matcher.start() + i4;
                } else {
                    i3 = -1;
                }
                if (length - i4 <= i) {
                    break loop0;
                }
                while (matcher.find()) {
                    i3 = matcher.start() + i4;
                }
                if (i3 >= i4) {
                    sb.append((CharSequence) str, i4, i3);
                    sb.append(str2);
                } else if (z) {
                    if (i2 == 0) {
                        i4--;
                    }
                    int i5 = i + i4;
                    sb.append((CharSequence) str, i4, i5);
                    sb.append(str2);
                    i4 = i5;
                } else {
                    Matcher matcher2 = compile.matcher(str.substring(i4 + i));
                    if (matcher2.find()) {
                        i2 = matcher2.end() - matcher2.start();
                        i3 = matcher2.start() + i4 + i;
                    }
                    if (i3 >= 0) {
                        if (i2 == 0 && i4 != 0) {
                            i4--;
                        }
                        sb.append((CharSequence) str, i4, i3);
                        sb.append(str2);
                    } else {
                        if (i2 == 0 && i4 != 0) {
                            i4--;
                        }
                        sb.append((CharSequence) str, i4, str.length());
                        i4 = length;
                    }
                }
                i4 = i3 + 1;
            }
            break loop0;
        }
        if (i2 == 0 && i4 < length) {
            i4--;
        }
        sb.append((CharSequence) str, i4, str.length());
        return sb.toString();
    }
}
