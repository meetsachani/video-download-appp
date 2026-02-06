package o;

/* renamed from: o.iB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6975iB {
    public static boolean a(String str, String... strArr) {
        if (!C4500Ve2.I0(str) && !c(strArr)) {
            C6732hB d = C6732hB.d(strArr);
            for (char c : str.toCharArray()) {
                if (d.b(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int b(String str, String... strArr) {
        if (C4500Ve2.I0(str) || c(strArr)) {
            return 0;
        }
        C6732hB d = C6732hB.d(strArr);
        int i = 0;
        for (char c : str.toCharArray()) {
            if (d.b(c)) {
                i++;
            }
        }
        return i;
    }

    public static boolean c(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (C4500Ve2.N0(str)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static String d(String str, String... strArr) {
        if (!C4500Ve2.I0(str) && !c(strArr)) {
            return f(str, strArr, false);
        }
        return str;
    }

    public static String e(String str, String... strArr) {
        if (str == null) {
            return null;
        }
        if (!str.isEmpty() && !c(strArr)) {
            return f(str, strArr, true);
        }
        return "";
    }

    public static String f(String str, String[] strArr, boolean z) {
        char[] charArray;
        C6732hB d = C6732hB.d(strArr);
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            if (d.b(c) == z) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String g(String str, String... strArr) {
        if (!C4500Ve2.I0(str) && !c(strArr)) {
            C6732hB d = C6732hB.d(strArr);
            StringBuilder sb = new StringBuilder(str.length());
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            char c = charArray[0];
            sb.append(c);
            Character ch = null;
            Character ch2 = null;
            for (int i = 1; i < length; i++) {
                char c2 = charArray[i];
                if (c2 == c) {
                    if (ch == null || c2 != ch.charValue()) {
                        if (ch2 == null || c2 != ch2.charValue()) {
                            if (d.b(c2)) {
                                ch = Character.valueOf(c2);
                            } else {
                                ch2 = Character.valueOf(c2);
                            }
                        }
                    }
                }
                sb.append(c2);
                c = c2;
            }
            return sb.toString();
        }
        return str;
    }
}
