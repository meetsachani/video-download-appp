package o;

/* renamed from: o.Oo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3855Oo {
    public static final String a = "false";
    public static final String b = "no";
    public static final String c = "off";
    public static final String d = "on";
    public static final String e = "true";
    public static final String f = "yes";

    public static int B(boolean z, int i, int i2) {
        if (z) {
            return i;
        }
        return i2;
    }

    public static Integer C(Boolean bool) {
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue()) {
            return C3482Ks1.e;
        }
        return C3482Ks1.d;
    }

    public static Integer D(Boolean bool, Integer num, Integer num2, Integer num3) {
        if (bool == null) {
            return num3;
        }
        if (bool.booleanValue()) {
            return num;
        }
        return num2;
    }

    public static Integer E(boolean z) {
        if (z) {
            return C3482Ks1.e;
        }
        return C3482Ks1.d;
    }

    public static Integer F(boolean z, Integer num, Integer num2) {
        if (z) {
            return num;
        }
        return num2;
    }

    public static String G(Boolean bool, String str, String str2, String str3) {
        if (bool == null) {
            return str3;
        }
        if (bool.booleanValue()) {
            return str;
        }
        return str2;
    }

    public static String H(boolean z, String str, String str2) {
        if (z) {
            return str;
        }
        return str2;
    }

    public static String I(Boolean bool) {
        return G(bool, "on", "off", null);
    }

    public static String J(boolean z) {
        return H(z, "on", "off");
    }

    public static String K(Boolean bool) {
        return G(bool, "true", a, null);
    }

    public static String L(boolean z) {
        return H(z, "true", a);
    }

    public static String M(Boolean bool) {
        return G(bool, f, b, null);
    }

    public static String N(boolean z) {
        return H(z, f, b);
    }

    public static Boolean O(Boolean... boolArr) {
        C11304zt1.O(boolArr, "array");
        try {
            if (P(C4206Se.Q5(boolArr))) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean P(boolean... zArr) {
        C11304zt1.O(zArr, "array");
        boolean z = false;
        for (boolean z2 : zArr) {
            z ^= z2;
        }
        return z;
    }

    public static Boolean a(Boolean... boolArr) {
        C11304zt1.O(boolArr, "array");
        try {
            if (b(C4206Se.Q5(boolArr))) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean b(boolean... zArr) {
        C11304zt1.O(zArr, "array");
        for (boolean z : zArr) {
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static Boolean[] c() {
        return new Boolean[]{Boolean.FALSE, Boolean.TRUE};
    }

    public static int d(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    public static boolean e(Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }

    public static boolean f(Boolean bool) {
        return !e(bool);
    }

    public static boolean g(Boolean bool) {
        return !h(bool);
    }

    public static boolean h(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static Boolean i(Boolean bool) {
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static Boolean j(Boolean... boolArr) {
        C11304zt1.O(boolArr, "array");
        try {
            if (k(C4206Se.Q5(boolArr))) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean k(boolean... zArr) {
        C11304zt1.O(zArr, "array");
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean[] l() {
        return new boolean[]{false, true};
    }

    public static boolean m(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    public static boolean n(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        if (i == i3) {
            return false;
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean o(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean p(Integer num, Integer num2, Integer num3) {
        if (num == null) {
            if (num2 == null) {
                return true;
            }
            if (num3 == null) {
                return false;
            }
        } else if (num.equals(num2)) {
            return true;
        } else {
            if (num.equals(num3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean q(String str) {
        if (x(str) == Boolean.TRUE) {
            return true;
        }
        return false;
    }

    public static boolean r(String str, String str2, String str3) {
        if (str == str2) {
            return true;
        }
        if (str == str3) {
            return false;
        }
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.equals(str3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The String did not match either specified value");
    }

    public static boolean s(Boolean bool, boolean z) {
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public static Boolean t(int i) {
        if (i == 0) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static Boolean u(int i, int i2, int i3, int i4) {
        if (i == i2) {
            return Boolean.TRUE;
        }
        if (i == i3) {
            return Boolean.FALSE;
        }
        if (i == i4) {
            return null;
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static Boolean v(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static Boolean w(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            if (num2 == null) {
                return Boolean.TRUE;
            }
            if (num3 == null) {
                return Boolean.FALSE;
            }
            if (num4 == null) {
                return null;
            }
        } else if (num.equals(num2)) {
            return Boolean.TRUE;
        } else {
            if (num.equals(num3)) {
                return Boolean.FALSE;
            }
            if (num.equals(num4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static Boolean x(String str) {
        Boolean bool;
        if (str == "true") {
            return Boolean.TRUE;
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length != 1) {
            if (length != 2) {
                bool = null;
                if (length != 3) {
                    if (length != 4) {
                        if (length == 5) {
                            char charAt = str.charAt(0);
                            char charAt2 = str.charAt(1);
                            char charAt3 = str.charAt(2);
                            char charAt4 = str.charAt(3);
                            char charAt5 = str.charAt(4);
                            if ((charAt == 'f' || charAt == 'F') && ((charAt2 == 'a' || charAt2 == 'A') && ((charAt3 == 'l' || charAt3 == 'L') && ((charAt4 == 's' || charAt4 == 'S') && (charAt5 == 'e' || charAt5 == 'E'))))) {
                                return Boolean.FALSE;
                            }
                        }
                    } else {
                        char charAt6 = str.charAt(0);
                        char charAt7 = str.charAt(1);
                        char charAt8 = str.charAt(2);
                        char charAt9 = str.charAt(3);
                        if ((charAt6 == 't' || charAt6 == 'T') && ((charAt7 == 'r' || charAt7 == 'R') && ((charAt8 == 'u' || charAt8 == 'U') && (charAt9 == 'e' || charAt9 == 'E')))) {
                            return Boolean.TRUE;
                        }
                    }
                } else {
                    char charAt10 = str.charAt(0);
                    char charAt11 = str.charAt(1);
                    char charAt12 = str.charAt(2);
                    if ((charAt10 != 'y' && charAt10 != 'Y') || ((charAt11 != 'e' && charAt11 != 'E') || (charAt12 != 's' && charAt12 != 'S'))) {
                        if ((charAt10 == 'o' || charAt10 == 'O') && ((charAt11 == 'f' || charAt11 == 'F') && (charAt12 == 'f' || charAt12 == 'F'))) {
                            return Boolean.FALSE;
                        }
                    } else {
                        return Boolean.TRUE;
                    }
                }
            } else {
                bool = null;
                char charAt13 = str.charAt(0);
                char charAt14 = str.charAt(1);
                if ((charAt13 != 'o' && charAt13 != 'O') || (charAt14 != 'n' && charAt14 != 'N')) {
                    if ((charAt13 == 'n' || charAt13 == 'N') && (charAt14 == 'o' || charAt14 == 'O')) {
                        return Boolean.FALSE;
                    }
                } else {
                    return Boolean.TRUE;
                }
            }
        } else {
            bool = null;
            char charAt15 = str.charAt(0);
            if (charAt15 != 'y' && charAt15 != 'Y' && charAt15 != 't' && charAt15 != 'T' && charAt15 != '1') {
                if (charAt15 == 'n' || charAt15 == 'N' || charAt15 == 'f' || charAt15 == 'F' || charAt15 == '0') {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.TRUE;
            }
        }
        return bool;
    }

    public static Boolean y(String str, String str2, String str3, String str4) {
        if (str == null) {
            if (str2 == null) {
                return Boolean.TRUE;
            }
            if (str3 == null) {
                return Boolean.FALSE;
            }
            if (str4 == null) {
                return null;
            }
        } else if (str.equals(str2)) {
            return Boolean.TRUE;
        } else {
            if (str.equals(str3)) {
                return Boolean.FALSE;
            }
            if (str.equals(str4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The String did not match any specified value");
    }

    public static int z(Boolean bool, int i, int i2, int i3) {
        if (bool == null) {
            return i3;
        }
        if (bool.booleanValue()) {
            return i;
        }
        return i2;
    }

    public static int A(boolean z) {
        return z ? 1 : 0;
    }
}
