package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes4.dex */
public class LM2 {
    public static String a(String str) {
        return b(str, null);
    }

    public static String b(String str, char... cArr) {
        int length;
        if (cArr == null) {
            length = -1;
        } else {
            length = cArr.length;
        }
        if (!C4500Ve2.I0(str) && length != 0) {
            char[] charArray = str.toCharArray();
            boolean z = true;
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                if (h(c, cArr)) {
                    z = true;
                } else if (z) {
                    charArray[i] = Character.toTitleCase(c);
                    z = false;
                }
            }
            return new String(charArray);
        }
        return str;
    }

    public static String c(String str) {
        return d(str, null);
    }

    public static String d(String str, char... cArr) {
        int length;
        if (cArr == null) {
            length = -1;
        } else {
            length = cArr.length;
        }
        if (!C4500Ve2.I0(str) && length != 0) {
            return b(str.toLowerCase(), cArr);
        }
        return str;
    }

    public static boolean e(CharSequence charSequence, CharSequence... charSequenceArr) {
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

    public static String f(String str) {
        return g(str, null);
    }

    public static String g(String str, char... cArr) {
        if (C4500Ve2.I0(str)) {
            return str;
        }
        if (cArr != null && cArr.length == 0) {
            return "";
        }
        int length = str.length();
        char[] cArr2 = new char[(length / 2) + 1];
        boolean z = true;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (h(charAt, cArr)) {
                z = true;
            } else if (z) {
                cArr2[i] = charAt;
                i++;
                z = false;
            }
        }
        return new String(cArr2, 0, i);
    }

    public static boolean h(char c, char[] cArr) {
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

    public static String i(String str) {
        if (C4500Ve2.I0(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z = true;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!Character.isUpperCase(c) && !Character.isTitleCase(c)) {
                if (Character.isLowerCase(c)) {
                    if (z) {
                        charArray[i] = Character.toTitleCase(c);
                    } else {
                        charArray[i] = Character.toUpperCase(c);
                    }
                } else {
                    z = Character.isWhitespace(c);
                }
            } else {
                charArray[i] = Character.toLowerCase(c);
            }
            z = false;
        }
        return new String(charArray);
    }

    public static String j(String str) {
        return k(str, null);
    }

    public static String k(String str, char... cArr) {
        int length;
        if (cArr == null) {
            length = -1;
        } else {
            length = cArr.length;
        }
        if (!C4500Ve2.I0(str) && length != 0) {
            char[] charArray = str.toCharArray();
            boolean z = true;
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                if (h(c, cArr)) {
                    z = true;
                } else if (z) {
                    charArray[i] = Character.toLowerCase(c);
                    z = false;
                }
            }
            return new String(charArray);
        }
        return str;
    }

    public static String l(String str, int i) {
        return m(str, i, null, false);
    }

    public static String m(String str, int i, String str2, boolean z) {
        return n(str, i, str2, z, C4500Ve2.b);
    }

    public static String n(String str, int i, String str2, boolean z, String str3) {
        int i2;
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
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + i;
            Matcher matcher = compile.matcher(str.substring(i3, Math.min((int) Math.min(2147483647L, i4 + 1), length)));
            if (matcher.find()) {
                if (matcher.start() == 0) {
                    i3 += matcher.end();
                } else {
                    i2 = matcher.start() + i3;
                }
            } else {
                i2 = -1;
            }
            if (length - i3 <= i) {
                break;
            }
            while (matcher.find()) {
                i2 = matcher.start() + i3;
            }
            if (i2 >= i3) {
                sb.append((CharSequence) str, i3, i2);
                sb.append(str2);
            } else if (z) {
                sb.append((CharSequence) str, i3, i4);
                sb.append(str2);
                i3 = i4;
            } else {
                Matcher matcher2 = compile.matcher(str.substring(i4));
                if (matcher2.find()) {
                    i2 = matcher2.start() + i3 + i;
                }
                if (i2 >= 0) {
                    sb.append((CharSequence) str, i3, i2);
                    sb.append(str2);
                } else {
                    sb.append((CharSequence) str, i3, str.length());
                    i3 = length;
                }
            }
            i3 = i2 + 1;
        }
        sb.append((CharSequence) str, i3, str.length());
        return sb.toString();
    }
}
