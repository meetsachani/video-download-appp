package o;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class TT1 {
    public static final TT1[] a = {new C2571Bo(), new C9412s7(), new C10498wa0(), new C9169r7(), new C8221nE2(), new C7609ko(), new C8708pE2(), new C10252va0(), new BW1(), new C5894dm2(), new C10973yW1(), new AW1(), new RC0(), new ZK2(), new Qx2(), new Ox2(), new C9469sL0(), new DI1(), new C9063qi0(), new C9443sE2()};
    public static final Pattern b = Pattern.compile("\\d+");
    public static final Pattern c = Pattern.compile("&");
    public static final Pattern d = Pattern.compile("=");
    public static final String e = "\ufeff";

    public static void a(CharSequence charSequence, Map<String, String> map) {
        String[] split = d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], p(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static int b(CharSequence charSequence, int i) {
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0 && charSequence.charAt(i3) == '\\'; i3--) {
            i2++;
        }
        return i2;
    }

    public static String c(QT1 qt1) {
        String g = qt1.g();
        if (g.startsWith(e)) {
            return g.substring(1);
        }
        return g;
    }

    public static boolean d(CharSequence charSequence, int i) {
        if (charSequence != null && i > 0 && i == charSequence.length() && b.matcher(charSequence).matches()) {
            return true;
        }
        return false;
    }

    public static boolean e(CharSequence charSequence, int i, int i2) {
        int i3;
        if (charSequence == null || i2 <= 0 || charSequence.length() < (i3 = i2 + i) || !b.matcher(charSequence.subSequence(i, i3)).matches()) {
            return false;
        }
        return true;
    }

    public static String[] f(String str, String str2, char c2, boolean z) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            boolean z2 = true;
            ArrayList arrayList2 = arrayList;
            int i2 = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c2, i2);
                if (indexOf2 < 0) {
                    i2 = str2.length();
                } else if (b(str2, indexOf2) % 2 != 0) {
                    i2 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String o2 = o(str2.substring(length2, indexOf2));
                    if (z) {
                        o2 = o2.trim();
                    }
                    if (!o2.isEmpty()) {
                        arrayList2.add(o2);
                    }
                    i2 = indexOf2 + 1;
                }
                z2 = false;
            }
            i = i2;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String g(String str, String str2, char c2, boolean z) {
        String[] f = f(str, str2, c2, z);
        if (f == null) {
            return null;
        }
        return f[0];
    }

    public static void h(String str, StringBuilder sb) {
        if (str != null) {
            sb.append('\n');
            sb.append(str);
        }
    }

    public static void i(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                sb.append('\n');
                sb.append(str);
            }
        }
    }

    public static String[] j(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    public static int l(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - C3599Ly1.j;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        return -1;
    }

    public static Map<String, String> m(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String str2 : c.split(str.substring(indexOf + 1))) {
            a(str2, hashMap);
        }
        return hashMap;
    }

    public static AbstractC3697My1 n(QT1 qt1) {
        for (TT1 tt1 : a) {
            AbstractC3697My1 k = tt1.k(qt1);
            if (k != null) {
                return k;
            }
        }
        return new C3947Pm2(qt1.g(), null);
    }

    public static String o(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (!z && charAt == '\\') {
                z = true;
            } else {
                sb.append(charAt);
                z = false;
            }
            indexOf++;
        }
        return sb.toString();
    }

    public static String p(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public abstract AbstractC3697My1 k(QT1 qt1);
}
