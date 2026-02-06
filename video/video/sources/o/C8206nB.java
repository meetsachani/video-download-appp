package o;

/* renamed from: o.nB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8206nB {
    public static final String[] a = new String[128];
    public static final char[] b = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char c = '\n';
    public static final char d = '\r';
    public static final char e = 0;

    static {
        char c2 = 0;
        while (true) {
            String[] strArr = a;
            if (c2 < strArr.length) {
                strArr[c2] = String.valueOf(c2);
                c2 = (char) (c2 + 1);
            } else {
                return;
            }
        }
    }

    public static int a(char c2, char c3) {
        return c2 - c3;
    }

    public static boolean b(char c2) {
        if (c2 < 128) {
            return true;
        }
        return false;
    }

    public static boolean c(char c2) {
        if (!e(c2) && !d(c2)) {
            return false;
        }
        return true;
    }

    public static boolean d(char c2) {
        if (c2 >= 'a' && c2 <= 'z') {
            return true;
        }
        return false;
    }

    public static boolean e(char c2) {
        if (c2 >= 'A' && c2 <= 'Z') {
            return true;
        }
        return false;
    }

    public static boolean f(char c2) {
        if (!c(c2) && !h(c2)) {
            return false;
        }
        return true;
    }

    public static boolean g(char c2) {
        if (c2 >= ' ' && c2 != 127) {
            return false;
        }
        return true;
    }

    public static boolean h(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return true;
        }
        return false;
    }

    public static boolean i(char c2) {
        if (c2 >= ' ' && c2 < 127) {
            return true;
        }
        return false;
    }

    public static char j(Character ch) {
        C11147zE2.V(ch, "ch", new Object[0]);
        return ch.charValue();
    }

    public static char k(Character ch, char c2) {
        if (ch == null) {
            return c2;
        }
        return ch.charValue();
    }

    public static char l(String str) {
        C11147zE2.L(str, "The String must not be empty", new Object[0]);
        return str.charAt(0);
    }

    public static char m(String str, char c2) {
        if (C4500Ve2.I0(str)) {
            return c2;
        }
        return str.charAt(0);
    }

    @Deprecated
    public static Character n(char c2) {
        return Character.valueOf(c2);
    }

    public static Character o(String str) {
        if (C4500Ve2.I0(str)) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static int p(char c2) {
        if (h(c2)) {
            return c2 - '0';
        }
        throw new IllegalArgumentException("The character " + c2 + " is not in the range '0' - '9'");
    }

    public static int q(char c2, int i) {
        if (!h(c2)) {
            return i;
        }
        return c2 - '0';
    }

    public static int r(Character ch) {
        C11147zE2.V(ch, "ch", new Object[0]);
        return p(ch.charValue());
    }

    public static int s(Character ch, int i) {
        if (ch == null) {
            return i;
        }
        return q(ch.charValue(), i);
    }

    public static String t(char c2) {
        if (c2 < 128) {
            return a[c2];
        }
        return new String(new char[]{c2});
    }

    public static String u(Character ch) {
        if (ch == null) {
            return null;
        }
        return t(ch.charValue());
    }

    public static String v(char c2) {
        StringBuilder sb = new StringBuilder();
        sb.append("\\u");
        char[] cArr = b;
        sb.append(cArr[(c2 >> '\f') & 15]);
        sb.append(cArr[(c2 >> '\b') & 15]);
        sb.append(cArr[(c2 >> 4) & 15]);
        sb.append(cArr[c2 & 15]);
        return sb.toString();
    }

    public static String w(Character ch) {
        if (ch == null) {
            return null;
        }
        return v(ch.charValue());
    }
}
