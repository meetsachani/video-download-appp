package o;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.mf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8077mf {
    public static final byte A = 23;
    public static final byte B = 24;
    public static final byte C = 25;
    public static final byte D = 26;
    public static final byte E = 27;
    public static final byte F = 28;
    public static final byte G = 29;
    public static final byte H = 30;
    public static final byte I = 31;
    public static final byte J = 32;
    public static final byte K = 32;
    public static final byte L = Byte.MAX_VALUE;
    public static final char M = 0;
    public static final char N = 127;
    public static final char O = ' ';
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    public static final byte h = 7;
    public static final byte i = 8;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 10;
    public static final byte m = 11;
    public static final byte n = 12;

    /* renamed from: o  reason: collision with root package name */
    public static final byte f806o = 13;
    public static final byte p = 14;
    public static final byte q = 15;
    public static final byte r = 16;
    public static final byte s = 17;
    public static final byte t = 17;
    public static final byte u = 18;
    public static final byte v = 19;
    public static final byte w = 19;
    public static final byte x = 20;
    public static final byte y = 21;
    public static final byte z = 22;

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int b2;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence2.charAt(i2);
            if (charAt != charAt2 && ((b2 = b(charAt)) >= 26 || b2 != b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static int b(char c2) {
        return (char) ((c2 | ' ') - 97);
    }

    public static boolean c(char c2) {
        if (c2 >= 'a' && c2 <= 'z') {
            return true;
        }
        return false;
    }

    public static boolean d(char c2) {
        if (c2 >= 'A' && c2 <= 'Z') {
            return true;
        }
        return false;
    }

    public static char e(char c2) {
        if (d(c2)) {
            return (char) (c2 ^ ' ');
        }
        return c2;
    }

    public static String f(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return g((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = e(charSequence.charAt(i2));
        }
        return String.valueOf(cArr);
    }

    public static String g(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (d(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (d(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static char h(char c2) {
        if (c(c2)) {
            return (char) (c2 ^ ' ');
        }
        return c2;
    }

    public static String i(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return j((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = h(charSequence.charAt(i2));
        }
        return String.valueOf(cArr);
    }

    public static String j(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (c(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String k(CharSequence charSequence, int i2, String str) {
        boolean z2;
        C10664xF1.E(charSequence);
        int length = i2 - str.length();
        if (length >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.m(z2, "maxLength (%s) must be >= length of the truncation indicator (%s)", i2, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i2) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i2) {
                return charSequence2;
            }
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append((CharSequence) str2, 0, length);
        sb.append(str);
        return sb.toString();
    }
}
