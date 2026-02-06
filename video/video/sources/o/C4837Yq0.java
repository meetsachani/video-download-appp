package o;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/* renamed from: o.Yq0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4837Yq0 {
    public static final String b = "";
    public static final int c = -1;
    public static final char d = '.';
    public static final char f = '/';
    public static final char g = '\\';
    public static final char h;
    public static final char i;
    public static final Pattern j;
    public static final int k = 255;
    public static final int l = 8;
    public static final int m = 4;
    public static final int n = 65535;

    /* renamed from: o  reason: collision with root package name */
    public static final int f676o = 16;
    public static final Pattern p;
    public static final String[] a = new String[0];
    public static final String e = Character.toString('.');

    static {
        char c2 = File.separatorChar;
        h = c2;
        i = k(c2);
        j = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        p = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    public static boolean A(String str, String... strArr) {
        if (str == null) {
            return false;
        }
        M(str);
        if (strArr != null && strArr.length != 0) {
            final String n2 = n(str);
            Stream of = Stream.of((Object[]) strArr);
            Objects.requireNonNull(n2);
            return of.anyMatch(new Predicate() { // from class: o.Xq0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return n2.equals((String) obj);
                }
            });
        } else if (v(str) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean B(String str) {
        Matcher matcher = j.matcher(str);
        if (!matcher.matches() || matcher.groupCount() != 4) {
            return false;
        }
        for (int i2 = 1; i2 <= 4; i2++) {
            String group = matcher.group(i2);
            if (Integer.parseInt(group) > 255) {
                return false;
            }
            if (group.length() > 1 && group.startsWith("0")) {
                return false;
            }
        }
        return true;
    }

    public static boolean C(String str) {
        boolean contains = str.contains(C10923yJ1.d);
        if (contains && str.indexOf(C10923yJ1.d) != str.lastIndexOf(C10923yJ1.d)) {
            return false;
        }
        if ((str.startsWith(":") && !str.startsWith(C10923yJ1.d)) || (str.endsWith(":") && !str.endsWith(C10923yJ1.d))) {
            return false;
        }
        String[] split = str.split(":");
        if (contains) {
            ArrayList arrayList = new ArrayList(Arrays.asList(split));
            if (str.endsWith(C10923yJ1.d)) {
                arrayList.add("");
            } else if (str.startsWith(C10923yJ1.d) && !arrayList.isEmpty()) {
                arrayList.remove(0);
            }
            split = (String[]) arrayList.toArray(a);
        }
        if (split.length > 8) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < split.length; i4++) {
            String str2 = split[i4];
            if (str2.isEmpty()) {
                if (i3 + 1 > 1) {
                    return false;
                }
            } else if (i4 == split.length - 1 && str2.contains(UE.h)) {
                if (!B(str2)) {
                    return false;
                }
                i2 += 2;
                i3 = 0;
            } else if (str2.length() > 4) {
                return false;
            } else {
                try {
                    int parseInt = Integer.parseInt(str2, 16);
                    i3 = (parseInt >= 0 && parseInt <= 65535) ? 0 : 0;
                } catch (NumberFormatException unused) {
                }
                return false;
            }
            i2++;
        }
        if (i2 > 8 || (i2 < 8 && !contains)) {
            return false;
        }
        return true;
    }

    public static boolean D(String str) {
        String[] split = str.split("\\.", -1);
        for (int i2 = 0; i2 < split.length; i2++) {
            if (split[i2].isEmpty()) {
                if (i2 != split.length - 1) {
                    return false;
                }
                return true;
            } else if (!p.matcher(split[i2]).matches()) {
                return false;
            }
        }
        return true;
    }

    public static boolean E(char c2) {
        if (c2 != '/' && c2 != '\\') {
            return false;
        }
        return true;
    }

    public static boolean F() {
        if (h == '\\') {
            return true;
        }
        return false;
    }

    public static boolean G(String str) {
        if (!C(str) && !D(str)) {
            return false;
        }
        return true;
    }

    public static String H(String str) {
        return e(str, h, true);
    }

    public static String I(String str, boolean z) {
        return e(str, R(z), true);
    }

    public static String J(String str) {
        return e(str, h, false);
    }

    public static String K(String str, boolean z) {
        return e(str, R(z), false);
    }

    public static String L(String str) {
        if (str == null) {
            return null;
        }
        M(str);
        int v = v(str);
        if (v == -1) {
            return str;
        }
        return str.substring(0, v);
    }

    public static String M(String str) {
        if (str.indexOf(0) < 0) {
            return str;
        }
        throw new IllegalArgumentException("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
    }

    public static String N(String str) {
        return EnumC2674Cp0.m().E(str);
    }

    public static String O(String str) {
        return EnumC2674Cp0.i1.E(str);
    }

    public static String P(String str) {
        return EnumC2674Cp0.k1.E(str);
    }

    public static String[] Q(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i2 = 0;
        char c2 = 0;
        while (i2 < length) {
            char c3 = charArray[i2];
            if (c3 != '?' && c3 != '*') {
                sb.append(c3);
            } else {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c3 == '?') {
                    arrayList.add("?");
                } else if (c2 != '*') {
                    arrayList.add("*");
                }
            }
            i2++;
            c2 = c3;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(a);
    }

    public static char R(boolean z) {
        if (z) {
            return '/';
        }
        return '\\';
    }

    public static boolean S(String str, String str2) {
        return T(str, str2, EnumC10679xJ0.SENSITIVE);
    }

    public static boolean T(String str, String str2, EnumC10679xJ0 enumC10679xJ0) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        EnumC10679xJ0 t = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
        String[] Q = Q(str2);
        ArrayDeque arrayDeque = new ArrayDeque(Q.length);
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        do {
            if (!arrayDeque.isEmpty()) {
                int[] iArr = (int[]) arrayDeque.pop();
                i3 = iArr[0];
                i2 = iArr[1];
                z = true;
            }
            while (i3 < Q.length) {
                if (Q[i3].equals("?")) {
                    i2++;
                    if (i2 > str.length()) {
                        break;
                    }
                    z = false;
                    i3++;
                } else if (Q[i3].equals("*")) {
                    if (i3 == Q.length - 1) {
                        i2 = str.length();
                    }
                    z = true;
                    i3++;
                } else {
                    if (z) {
                        i2 = t.m(str, i2, Q[i3]);
                        if (i2 == -1) {
                            break;
                        }
                        int m2 = t.m(str, i2 + 1, Q[i3]);
                        if (m2 >= 0) {
                            arrayDeque.push(new int[]{i3, m2});
                        }
                        i2 += Q[i3].length();
                        z = false;
                    } else {
                        if (!t.n(str, i2, Q[i3])) {
                            break;
                        }
                        i2 += Q[i3].length();
                        z = false;
                    }
                    i3++;
                }
            }
            if (i3 == Q.length && i2 == str.length()) {
                return true;
            }
        } while (!arrayDeque.isEmpty());
        return false;
    }

    public static boolean U(String str, String str2) {
        return T(str, str2, EnumC10679xJ0.SYSTEM);
    }

    public static String a(String str, String str2) {
        int u = u(str2);
        if (u < 0) {
            return null;
        }
        if (u > 0) {
            return H(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return H(str2);
        }
        if (E(str.charAt(length - 1))) {
            return H(str + str2);
        }
        return H(str + '/' + str2);
    }

    public static boolean b(String str, String str2) {
        boolean z = false;
        if (x(str) || x(str2)) {
            return false;
        }
        EnumC10679xJ0 enumC10679xJ0 = EnumC10679xJ0.SYSTEM;
        if (enumC10679xJ0.l(str, str2)) {
            return false;
        }
        if (str.charAt(0) == '/') {
            z = true;
        }
        char R = R(z);
        if (str.charAt(str.length() - 1) != R) {
            str = str + R;
        }
        return enumC10679xJ0.o(str2, str);
    }

    public static String c(String str, boolean z) {
        int u;
        if (str == null || (u = u(str)) < 0) {
            return null;
        }
        if (u >= str.length()) {
            if (z) {
                return t(str);
            }
            return str;
        }
        int w = w(str);
        if (w < 0) {
            return str.substring(0, u);
        }
        int i2 = w + (z ? 1 : 0);
        if (i2 == 0) {
            i2++;
        }
        return str.substring(0, i2);
    }

    public static String d(String str, int i2) {
        int u;
        if (str == null || (u = u(str)) < 0) {
            return null;
        }
        int w = w(str);
        int i3 = i2 + w;
        if (u < str.length() && w >= 0 && u < i3) {
            return M(str.substring(u, i3));
        }
        return "";
    }

    public static String e(String str, char c2, boolean z) {
        boolean z2;
        int i2;
        if (str == null) {
            return null;
        }
        M(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int u = u(str);
        if (u < 0) {
            return null;
        }
        int i3 = length + 2;
        char[] cArr = new char[i3];
        str.getChars(0, str.length(), cArr, 0);
        char k2 = k(c2);
        for (int i4 = 0; i4 < i3; i4++) {
            if (cArr[i4] == k2) {
                cArr[i4] = c2;
            }
        }
        if (cArr[length - 1] != c2) {
            cArr[length] = c2;
            length++;
            z2 = false;
        } else {
            z2 = true;
        }
        if (u != 0) {
            i2 = u;
        } else {
            i2 = 1;
        }
        while (i2 < length) {
            if (cArr[i2] == c2) {
                int i5 = i2 - 1;
                if (cArr[i5] == c2) {
                    System.arraycopy(cArr, i2, cArr, i5, length - i2);
                    length--;
                    i2--;
                }
            }
            i2++;
        }
        int i6 = u + 1;
        int i7 = i6;
        while (i7 < length) {
            if (cArr[i7] == c2) {
                int i8 = i7 - 1;
                if (cArr[i8] == '.' && (i7 == i6 || cArr[i7 - 2] == c2)) {
                    if (i7 == length - 1) {
                        z2 = true;
                    }
                    System.arraycopy(cArr, i7 + 1, cArr, i8, length - i7);
                    length -= 2;
                    i7--;
                }
            }
            i7++;
        }
        int i9 = u + 2;
        int i10 = i9;
        while (i10 < length) {
            if (cArr[i10] == c2 && cArr[i10 - 1] == '.' && cArr[i10 - 2] == '.' && (i10 == i9 || cArr[i10 - 3] == c2)) {
                if (i10 == i9) {
                    return null;
                }
                if (i10 == length - 1) {
                    z2 = true;
                }
                int i11 = i10 - 4;
                while (true) {
                    if (i11 >= u) {
                        if (cArr[i11] == c2) {
                            int i12 = i11 + 1;
                            System.arraycopy(cArr, i10 + 1, cArr, i12, length - i10);
                            length -= i10 - i11;
                            i10 = i12;
                            break;
                        }
                        i11--;
                    } else {
                        int i13 = i10 + 1;
                        System.arraycopy(cArr, i13, cArr, u, length - i10);
                        length -= i13 - u;
                        i10 = i6;
                        break;
                    }
                }
            }
            i10++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= u) {
            return new String(cArr, 0, length);
        }
        if (z2 && z) {
            return new String(cArr, 0, length);
        }
        return new String(cArr, 0, length - 1);
    }

    public static boolean f(String str, String str2) {
        return g(str, str2, false, EnumC10679xJ0.SENSITIVE);
    }

    public static boolean g(String str, String str2, boolean z, EnumC10679xJ0 enumC10679xJ0) {
        if (str != null && str2 != null) {
            if (z && ((str = H(str)) == null || (str2 = H(str2)) == null)) {
                return false;
            }
            return EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE).l(str, str2);
        } else if (str != null || str2 != null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean h(String str, String str2) {
        return g(str, str2, true, EnumC10679xJ0.SENSITIVE);
    }

    public static boolean i(String str, String str2) {
        return g(str, str2, true, EnumC10679xJ0.SYSTEM);
    }

    public static boolean j(String str, String str2) {
        return g(str, str2, false, EnumC10679xJ0.SYSTEM);
    }

    public static char k(char c2) {
        if (c2 == '/') {
            return '\\';
        }
        if (c2 == '\\') {
            return '/';
        }
        throw new IllegalArgumentException(String.valueOf(c2));
    }

    public static int l(String str) {
        int lastIndexOf = str.lastIndexOf(h);
        int lastIndexOf2 = str.lastIndexOf(i);
        if (lastIndexOf == -1) {
            if (lastIndexOf2 == -1) {
                return 0;
            }
            return lastIndexOf2 + 1;
        } else if (lastIndexOf2 == -1) {
            return lastIndexOf + 1;
        } else {
            return Math.max(lastIndexOf, lastIndexOf2) + 1;
        }
    }

    public static String m(String str) {
        return L(q(str));
    }

    public static String n(String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        int v = v(str);
        if (v == -1) {
            return "";
        }
        return str.substring(v + 1);
    }

    public static String o(String str) {
        return c(str, true);
    }

    public static String p(String str) {
        return c(str, false);
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        return M(str).substring(w(str) + 1);
    }

    public static String r(String str) {
        return d(str, 1);
    }

    public static String s(String str) {
        return d(str, 0);
    }

    public static String t(String str) {
        int u;
        if (str == null || (u = u(str)) < 0) {
            return null;
        }
        if (u > str.length()) {
            M(str);
            return str + '/';
        }
        return M(str.substring(0, u));
    }

    public static int u(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return E(charAt) ? 1 : 0;
        } else if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            return Math.min(indexOf, indexOf2) + 1;
        } else {
            char charAt2 = str.charAt(1);
            if (charAt2 == ':') {
                char upperCase = Character.toUpperCase(charAt);
                if (upperCase >= 'A' && upperCase <= 'Z') {
                    if (length == 2 && !EnumC2674Cp0.m().I()) {
                        return 0;
                    }
                    if (length == 2 || !E(str.charAt(2))) {
                        return 2;
                    }
                    return 3;
                } else if (upperCase != '/') {
                    return -1;
                } else {
                    return 1;
                }
            } else if (E(charAt) && E(charAt2)) {
                int indexOf3 = str.indexOf(47, 2);
                int indexOf4 = str.indexOf(92, 2);
                if ((indexOf3 != -1 || indexOf4 != -1) && indexOf3 != 2 && indexOf4 != 2) {
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    }
                    if (indexOf4 == -1) {
                        indexOf4 = indexOf3;
                    }
                    int min = Math.min(indexOf3, indexOf4);
                    int i2 = min + 1;
                    if (G(str.substring(2, min))) {
                        return i2;
                    }
                }
                return -1;
            } else {
                return E(charAt) ? 1 : 0;
            }
        }
    }

    public static int v(String str) throws IllegalArgumentException {
        if (str == null) {
            return -1;
        }
        if (F() && str.indexOf(58, l(str)) != -1) {
            throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (w(str) > lastIndexOf) {
            return -1;
        }
        return lastIndexOf;
    }

    public static int w(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean x(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean y(String str, String str2) {
        if (str == null) {
            return false;
        }
        M(str);
        if (x(str2)) {
            if (v(str) != -1) {
                return false;
            }
            return true;
        }
        return n(str).equals(str2);
    }

    public static boolean z(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        M(str);
        if (collection != null && !collection.isEmpty()) {
            return collection.contains(n(str));
        }
        if (v(str) != -1) {
            return false;
        }
        return true;
    }
}
