package o;

import java.util.regex.Pattern;

/* renamed from: o.sQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9490sQ1 {
    public static String a(String str, String str2) {
        return f(str, str2, "");
    }

    public static String b(String str, Pattern pattern) {
        return g(str, pattern, "");
    }

    public static String c(String str, String str2) {
        return h(str, str2, "");
    }

    public static String d(String str, Pattern pattern) {
        return i(str, pattern, "");
    }

    public static String e(String str, String str2) {
        return j(str, str2, "");
    }

    public static String f(String str, String str2, String str3) {
        if (C11304zt1.o(str, str2, str3)) {
            return str;
        }
        return str.replaceAll(str2, str3);
    }

    public static String g(String str, Pattern pattern, String str2) {
        if (C11304zt1.o(str, pattern, str2)) {
            return str;
        }
        return pattern.matcher(str).replaceAll(str2);
    }

    public static String h(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            return str.replaceFirst(str2, str3);
        }
        return str;
    }

    public static String i(String str, Pattern pattern, String str2) {
        if (str != null && pattern != null && str2 != null) {
            return pattern.matcher(str).replaceFirst(str2);
        }
        return str;
    }

    public static String j(String str, String str2, String str3) {
        if (C11304zt1.o(str, str2, str3)) {
            return str;
        }
        return Pattern.compile(str2, 32).matcher(str).replaceAll(str3);
    }
}
