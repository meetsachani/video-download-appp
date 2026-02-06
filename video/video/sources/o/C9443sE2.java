package o;

import java.util.regex.Pattern;

/* renamed from: o.sE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9443sE2 extends TT1 {
    public static final Pattern f = Pattern.compile("[IOQ]");
    public static final Pattern g = Pattern.compile("[A-Z0-9]{17}");

    public static char q(int i) {
        if (i < 10) {
            return (char) (i + 48);
        }
        if (i == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    public static boolean r(CharSequence charSequence) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i + 1;
            i2 += w(i3) * v(charSequence.charAt(i));
            i = i3;
        }
        if (charSequence.charAt(8) != q(i2 % 11)) {
            return false;
        }
        return true;
    }

    public static String s(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        char charAt2 = charSequence.charAt(1);
        if (charAt != '9') {
            if (charAt != 'S') {
                if (charAt != 'Z') {
                    switch (charAt) {
                        case '1':
                        case '4':
                        case '5':
                            return "US";
                        case '2':
                            return "CA";
                        case '3':
                            if (charAt2 >= 'A' && charAt2 <= 'W') {
                                return "MX";
                            }
                            return null;
                        default:
                            switch (charAt) {
                                case 'J':
                                    if (charAt2 >= 'A' && charAt2 <= 'T') {
                                        return "JP";
                                    }
                                    return null;
                                case 'K':
                                    if (charAt2 >= 'L' && charAt2 <= 'R') {
                                        return "KO";
                                    }
                                    return null;
                                case 'L':
                                    return "CN";
                                case 'M':
                                    if (charAt2 >= 'A' && charAt2 <= 'E') {
                                        return "IN";
                                    }
                                    return null;
                                default:
                                    switch (charAt) {
                                        case 'V':
                                            if (charAt2 >= 'F' && charAt2 <= 'R') {
                                                return "FR";
                                            }
                                            if (charAt2 >= 'S' && charAt2 <= 'W') {
                                                return "ES";
                                            }
                                            return null;
                                        case 'W':
                                            return "DE";
                                        case 'X':
                                            if (charAt2 != '0') {
                                                if (charAt2 >= '3' && charAt2 <= '9') {
                                                    return "RU";
                                                }
                                                return null;
                                            }
                                            return "RU";
                                        default:
                                            return null;
                                    }
                            }
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'R') {
                    return "IT";
                } else {
                    return null;
                }
            } else if (charAt2 >= 'A' && charAt2 <= 'M') {
                return "UK";
            } else {
                if (charAt2 >= 'N' && charAt2 <= 'T') {
                    return "DE";
                }
                return null;
            }
        } else if (charAt2 < 'A' || charAt2 > 'E') {
            if (charAt2 >= '3' && charAt2 <= '9') {
                return "BR";
            }
            return null;
        } else {
            return "BR";
        }
    }

    public static int t(char c) {
        if (c >= 'E' && c <= 'H') {
            return c + 1915;
        }
        if (c >= 'J' && c <= 'N') {
            return c + 1914;
        }
        if (c == 'P') {
            return 1993;
        }
        if (c >= 'R' && c <= 'T') {
            return c + 1912;
        }
        if (c >= 'V' && c <= 'Y') {
            return c + 1911;
        }
        if (c >= '1' && c <= '9') {
            return c + 1952;
        }
        if (c >= 'A' && c <= 'D') {
            return c + 1945;
        }
        throw new IllegalArgumentException();
    }

    public static int v(char c) {
        if (c >= 'A' && c <= 'I') {
            return c - '@';
        }
        if (c >= 'J' && c <= 'R') {
            return c - 'I';
        }
        if (c >= 'S' && c <= 'Z') {
            return c - 'Q';
        }
        if (c >= '0' && c <= '9') {
            return c - C3599Ly1.j;
        }
        throw new IllegalArgumentException();
    }

    public static int w(int i) {
        if (i > 0 && i <= 7) {
            return 9 - i;
        }
        if (i == 8) {
            return 10;
        }
        if (i == 9) {
            return 0;
        }
        if (i >= 10 && i <= 17) {
            return 19 - i;
        }
        throw new IllegalArgumentException();
    }

    @Override // o.TT1
    /* renamed from: u */
    public C9200rE2 k(QT1 qt1) {
        if (qt1.b() != EnumC3839Ok.CODE_39) {
            return null;
        }
        String trim = f.matcher(qt1.g()).replaceAll("").trim();
        if (!g.matcher(trim).matches()) {
            return null;
        }
        try {
            if (!r(trim)) {
                return null;
            }
            String substring = trim.substring(0, 3);
            return new C9200rE2(trim, substring, trim.substring(3, 9), trim.substring(9, 17), s(substring), trim.substring(3, 8), t(trim.charAt(9)), trim.charAt(10), trim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
