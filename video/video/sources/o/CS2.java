package o;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class CS2 {
    public static String a = "^(https?:\\/\\/)?(www\\.)?(facebook|fb)\\.com\\/[^\\s]*$";
    public static String b = "^(https?:\\/\\/)?(www\\.)?threads\\.net\\/[^\\s]*$";
    public static String c = "^(https?:\\/\\/)?(www\\.)?(instagram|insta)\\.com\\/[^\\s]*$";
    public static String d = "^(https?:\\/\\/)?(www\\.)?likee\\.video\\/[^\\s]*$";
    public static String e = "^(https?:\\/\\/)?(www\\.)?linkedin\\.com\\/.*$";
    public static String f = "^(https?:\\/\\/)?(www\\.)?(pinterest\\.com|pin\\.it)\\/[^\\s]*$";
    public static String g = "^(https?:\\/\\/)?(www\\.)?snackvideo\\.com\\/[^\\s]*$";
    public static String h = "^(https?:\\/\\/)?(www\\.)?tiktok\\.com\\/[^\\s]*$";
    public static String i = "^(https?:\\/\\/)?(www\\.)?(twitter|x)\\.com\\/[^\\s]*$";

    public static EnumC3047Gh2 a(String str) {
        if (b(str)) {
            return EnumC3047Gh2.FB;
        }
        if (c(str)) {
            return EnumC3047Gh2.INSTA;
        }
        if (i(str)) {
            return EnumC3047Gh2.TIKTOK;
        }
        if (j(str)) {
            return EnumC3047Gh2.TWITTER;
        }
        if (d(str)) {
            return EnumC3047Gh2.LIKEE;
        }
        if (g(str)) {
            return EnumC3047Gh2.SNACK;
        }
        if (e(str)) {
            return EnumC3047Gh2.LINKEDIN;
        }
        if (f(str)) {
            return EnumC3047Gh2.PINTEREST;
        }
        if (h(str)) {
            return EnumC3047Gh2.THREADS;
        }
        return EnumC3047Gh2.UNSUPPORTED_SITE;
    }

    public static boolean b(String str) {
        return k(str, a);
    }

    public static boolean c(String str) {
        return k(str, c);
    }

    public static boolean d(String str) {
        return k(str, d);
    }

    public static boolean e(String str) {
        return k(str, e);
    }

    public static boolean f(String str) {
        return k(str, f);
    }

    public static boolean g(String str) {
        return k(str, g);
    }

    public static boolean h(String str) {
        return k(str, b);
    }

    public static boolean i(String str) {
        return k(str, h);
    }

    public static boolean j(String str) {
        return k(str, i);
    }

    public static boolean k(String str, String str2) {
        return Pattern.compile(str2).matcher(str).matches();
    }
}
