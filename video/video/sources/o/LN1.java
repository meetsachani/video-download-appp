package o;

import java.util.Random;
import o.KN1;

/* loaded from: classes4.dex */
public class LN1 {
    public static final Random a = new Random();

    public static String a(int i) {
        return f(i, false, false);
    }

    public static String b(int i, int i2, int i3, boolean z, boolean z2) {
        return d(i, i2, i3, z, z2, null, a);
    }

    public static String c(int i, int i2, int i3, boolean z, boolean z2, char... cArr) {
        return d(i, i2, i3, z, z2, cArr, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(int i, int i2, int i3, boolean z, boolean z2, char[] cArr, Random random) {
        char c;
        if (i == 0) {
            return "";
        }
        if (i >= 0) {
            if (cArr != 0 && cArr.length == 0) {
                throw new IllegalArgumentException("The chars array must not be empty");
            }
            if (i2 == 0 && i3 == 0) {
                if (cArr != 0) {
                    i3 = cArr.length;
                } else if (!z && !z2) {
                    i3 = KN1.b.a1;
                } else {
                    i3 = 123;
                    i2 = 32;
                }
            } else if (i3 <= i2) {
                throw new IllegalArgumentException("Parameter end (" + i3 + ") must be greater than start (" + i2 + C9811tl1.d);
            }
            if (cArr == 0 && ((z2 && i3 <= 48) || (z && i3 <= 65))) {
                throw new IllegalArgumentException("Parameter end (" + i3 + ") must be greater then (48) for generating digits or greater then (65) for generating letters.");
            }
            StringBuilder sb = new StringBuilder(i);
            int i4 = i3 - i2;
            while (true) {
                int i5 = i - 1;
                if (i != 0) {
                    if (cArr == 0) {
                        c = random.nextInt(i4) + i2;
                        int type = Character.getType(c);
                        if (type != 0 && type != 18 && type != 19) {
                        }
                    } else {
                        c = cArr[random.nextInt(i4) + i2];
                    }
                    int charCount = Character.charCount(c);
                    if (i5 != 0 || charCount <= 1) {
                        if ((z && Character.isLetter(c)) || ((z2 && Character.isDigit(c)) || (!z && !z2))) {
                            sb.appendCodePoint(c);
                            if (charCount == 2) {
                                i -= 2;
                            } else {
                                i = i5;
                            }
                        }
                    }
                } else {
                    return sb.toString();
                }
            }
        } else {
            throw new IllegalArgumentException("Requested random string length " + i + " is less than 0.");
        }
    }

    public static String e(int i, String str) {
        if (str == null) {
            return d(i, 0, 0, false, false, null, a);
        }
        return g(i, str.toCharArray());
    }

    public static String f(int i, boolean z, boolean z2) {
        return b(i, 0, 0, z, z2);
    }

    public static String g(int i, char... cArr) {
        if (cArr == null) {
            return d(i, 0, 0, false, false, null, a);
        }
        return d(i, 0, cArr.length, false, false, cArr, a);
    }

    public static String h(int i) {
        return f(i, true, false);
    }

    public static String i(int i, int i2) {
        return h(ON1.h(i, i2));
    }

    public static String j(int i) {
        return f(i, true, true);
    }

    public static String k(int i, int i2) {
        return j(ON1.h(i, i2));
    }

    public static String l(int i) {
        return b(i, 32, 127, false, false);
    }

    public static String m(int i, int i2) {
        return l(ON1.h(i, i2));
    }

    public static String n(int i) {
        return b(i, 33, 126, false, false);
    }

    public static String o(int i, int i2) {
        return n(ON1.h(i, i2));
    }

    public static String p(int i) {
        return f(i, false, true);
    }

    public static String q(int i, int i2) {
        return p(ON1.h(i, i2));
    }

    public static String r(int i) {
        return b(i, 32, 126, false, false);
    }

    public static String s(int i, int i2) {
        return r(ON1.h(i, i2));
    }
}
