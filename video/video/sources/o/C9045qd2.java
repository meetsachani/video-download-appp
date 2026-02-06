package o;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Deprecated
/* renamed from: o.qd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9045qd2 {
    public static final char h = '$';
    public static final AbstractC8315nd2 i = AbstractC8315nd2.m("${");
    public static final AbstractC8315nd2 j = AbstractC8315nd2.m("}");
    public static final AbstractC8315nd2 k = AbstractC8315nd2.m(C3427Ke2.k);
    public char a;
    public AbstractC8315nd2 b;
    public AbstractC8315nd2 c;
    public AbstractC8315nd2 d;
    public AbstractC7811ld2<?> e;
    public boolean f;
    public boolean g;

    public C9045qd2() {
        this((AbstractC7811ld2<?>) null, i, j, '$');
    }

    public static String C(Object obj) {
        return new C9045qd2(AbstractC7811ld2.d()).k(obj);
    }

    public static <V> String l(Object obj, Map<String, V> map) {
        return new C9045qd2(map).k(obj);
    }

    public static <V> String m(Object obj, Map<String, V> map, String str, String str2) {
        return new C9045qd2(map, str, str2).k(obj);
    }

    public static String n(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap hashMap = new HashMap();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            hashMap.put(str, properties.getProperty(str));
        }
        return l(obj, hashMap);
    }

    public boolean A(C7325jd2 c7325jd2) {
        if (c7325jd2 == null) {
            return false;
        }
        return S(c7325jd2, 0, c7325jd2.length());
    }

    public boolean B(C7325jd2 c7325jd2, int i2, int i3) {
        if (c7325jd2 == null) {
            return false;
        }
        return S(c7325jd2, i2, i3);
    }

    public String D(String str, C7325jd2 c7325jd2, int i2, int i3) {
        AbstractC7811ld2<?> e = e();
        if (e == null) {
            return null;
        }
        return e.a(str);
    }

    public void E(boolean z) {
        this.f = z;
    }

    public void F(char c) {
        this.a = c;
    }

    public void G(boolean z) {
        this.g = z;
    }

    public C9045qd2 H(char c) {
        return J(AbstractC8315nd2.a(c));
    }

    public C9045qd2 I(String str) {
        if (C4500Ve2.I0(str)) {
            J(null);
            return this;
        }
        return J(AbstractC8315nd2.m(str));
    }

    public C9045qd2 J(AbstractC8315nd2 abstractC8315nd2) {
        this.d = abstractC8315nd2;
        return this;
    }

    public C9045qd2 K(char c) {
        return M(AbstractC8315nd2.a(c));
    }

    public C9045qd2 L(String str) {
        if (str != null) {
            return M(AbstractC8315nd2.m(str));
        }
        throw new IllegalArgumentException("Variable prefix must not be null.");
    }

    public C9045qd2 M(AbstractC8315nd2 abstractC8315nd2) {
        if (abstractC8315nd2 != null) {
            this.b = abstractC8315nd2;
            return this;
        }
        throw new IllegalArgumentException("Variable prefix matcher must not be null.");
    }

    public void N(AbstractC7811ld2<?> abstractC7811ld2) {
        this.e = abstractC7811ld2;
    }

    public C9045qd2 O(char c) {
        return Q(AbstractC8315nd2.a(c));
    }

    public C9045qd2 P(String str) {
        if (str != null) {
            return Q(AbstractC8315nd2.m(str));
        }
        throw new IllegalArgumentException("Variable suffix must not be null.");
    }

    public C9045qd2 Q(AbstractC8315nd2 abstractC8315nd2) {
        if (abstractC8315nd2 != null) {
            this.c = abstractC8315nd2;
            return this;
        }
        throw new IllegalArgumentException("Variable suffix matcher must not be null.");
    }

    public final int R(C7325jd2 c7325jd2, int i2, int i3, List<String> list) {
        boolean z;
        AbstractC8315nd2 abstractC8315nd2;
        AbstractC8315nd2 abstractC8315nd22;
        char c;
        boolean z2;
        int i4;
        String str;
        int g;
        AbstractC8315nd2 d = d();
        AbstractC8315nd2 f = f();
        char b = b();
        AbstractC8315nd2 c2 = c();
        boolean g2 = g();
        if (list == null) {
            z = true;
        } else {
            z = false;
        }
        int i5 = i2;
        int i6 = i2 + i3;
        int i7 = 0;
        int i8 = 0;
        char[] cArr = c7325jd2.X;
        List<String> list2 = list;
        while (i5 < i6) {
            int g3 = d.g(cArr, i5, i2, i6);
            if (g3 == 0) {
                i5++;
                abstractC8315nd2 = d;
                abstractC8315nd22 = f;
                c = b;
                z2 = g2;
            } else {
                if (i5 > i2) {
                    i4 = 1;
                    int i9 = i5 - 1;
                    if (cArr[i9] == b) {
                        if (this.g) {
                            i5++;
                        } else {
                            c7325jd2.w0(i9);
                            i7--;
                            i6--;
                            abstractC8315nd2 = d;
                            abstractC8315nd22 = f;
                            c = b;
                            z2 = g2;
                            cArr = c7325jd2.X;
                            i8 = 1;
                        }
                    }
                } else {
                    i4 = 1;
                }
                int i10 = i5 + g3;
                int i11 = i10;
                int i12 = 0;
                while (true) {
                    if (i11 < i6) {
                        if (g2 && (g = d.g(cArr, i11, i2, i6)) != 0) {
                            i12++;
                            i11 += g;
                        } else {
                            int g4 = f.g(cArr, i11, i2, i6);
                            if (g4 == 0) {
                                i11++;
                            } else if (i12 == 0) {
                                abstractC8315nd22 = f;
                                c = b;
                                String str2 = new String(cArr, i10, (i11 - i5) - g3);
                                if (g2) {
                                    C7325jd2 c7325jd22 = new C7325jd2(str2);
                                    S(c7325jd22, 0, c7325jd22.length());
                                    str2 = c7325jd22.toString();
                                }
                                int i13 = i11 + g4;
                                if (c2 != null) {
                                    char[] charArray = str2.toCharArray();
                                    z2 = g2;
                                    int i14 = 0;
                                    while (i14 < charArray.length && (z2 || d.g(charArray, i14, i14, charArray.length) == 0)) {
                                        int f2 = c2.f(charArray, i14);
                                        if (f2 != 0) {
                                            abstractC8315nd2 = d;
                                            String substring = str2.substring(0, i14);
                                            str = str2.substring(i14 + f2);
                                            str2 = substring;
                                            break;
                                        }
                                        i14++;
                                        d = d;
                                    }
                                    abstractC8315nd2 = d;
                                } else {
                                    abstractC8315nd2 = d;
                                    z2 = g2;
                                }
                                str = null;
                                if (list2 == null) {
                                    list2 = new ArrayList<>();
                                    list2.add(new String(cArr, i2, i3));
                                }
                                a(str2, list2);
                                list2.add(str2);
                                String D = D(str2, c7325jd2, i5, i13);
                                if (D != null) {
                                    str = D;
                                }
                                if (str != null) {
                                    int length = str.length();
                                    c7325jd2.l1(i5, i13, str);
                                    int R = (R(c7325jd2, i5, length, list2) + length) - (i13 - i5);
                                    i13 += R;
                                    i6 += R;
                                    i7 += R;
                                    cArr = c7325jd2.X;
                                    i8 = i4;
                                }
                                i5 = i13;
                                list2.remove(list2.size() - 1);
                            } else {
                                i12--;
                                i11 += g4;
                                d = d;
                            }
                        }
                    } else {
                        abstractC8315nd2 = d;
                        abstractC8315nd22 = f;
                        c = b;
                        z2 = g2;
                        i5 = i11;
                        break;
                    }
                }
            }
            f = abstractC8315nd22;
            b = c;
            g2 = z2;
            d = abstractC8315nd2;
        }
        if (z) {
            return i8;
        }
        return i7;
    }

    public boolean S(C7325jd2 c7325jd2, int i2, int i3) {
        if (R(c7325jd2, i2, i3, null) > 0) {
            return true;
        }
        return false;
    }

    public final void a(String str, List<String> list) {
        if (!list.contains(str)) {
            return;
        }
        C7325jd2 c7325jd2 = new C7325jd2(256);
        c7325jd2.j("Infinite loop in property interpolation of ");
        c7325jd2.j(list.remove(0));
        c7325jd2.j(": ");
        c7325jd2.O(list, "->");
        throw new IllegalStateException(c7325jd2.toString());
    }

    public char b() {
        return this.a;
    }

    public AbstractC8315nd2 c() {
        return this.d;
    }

    public AbstractC8315nd2 d() {
        return this.b;
    }

    public AbstractC7811ld2<?> e() {
        return this.e;
    }

    public AbstractC8315nd2 f() {
        return this.c;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public String i(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return j(charSequence, 0, charSequence.length());
    }

    public String j(CharSequence charSequence, int i2, int i3) {
        if (charSequence == null) {
            return null;
        }
        C7325jd2 append = new C7325jd2(i3).append(charSequence, i2, i3);
        S(append, 0, i3);
        return append.toString();
    }

    public String k(Object obj) {
        if (obj == null) {
            return null;
        }
        C7325jd2 i2 = new C7325jd2().i(obj);
        S(i2, 0, i2.length());
        return i2.toString();
    }

    public String o(String str) {
        if (str == null) {
            return null;
        }
        C7325jd2 c7325jd2 = new C7325jd2(str);
        if (!S(c7325jd2, 0, str.length())) {
            return str;
        }
        return c7325jd2.toString();
    }

    public String p(String str, int i2, int i3) {
        if (str == null) {
            return null;
        }
        C7325jd2 k2 = new C7325jd2(i3).k(str, i2, i3);
        if (!S(k2, 0, i3)) {
            return str.substring(i2, i3 + i2);
        }
        return k2.toString();
    }

    public String q(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        C7325jd2 m = new C7325jd2(stringBuffer.length()).m(stringBuffer);
        S(m, 0, m.length());
        return m.toString();
    }

    public String r(StringBuffer stringBuffer, int i2, int i3) {
        if (stringBuffer == null) {
            return null;
        }
        C7325jd2 n = new C7325jd2(i3).n(stringBuffer, i2, i3);
        S(n, 0, i3);
        return n.toString();
    }

    public String s(C7325jd2 c7325jd2) {
        if (c7325jd2 == null) {
            return null;
        }
        C7325jd2 s = new C7325jd2(c7325jd2.length()).s(c7325jd2);
        S(s, 0, s.length());
        return s.toString();
    }

    public String t(C7325jd2 c7325jd2, int i2, int i3) {
        if (c7325jd2 == null) {
            return null;
        }
        C7325jd2 t = new C7325jd2(i3).t(c7325jd2, i2, i3);
        S(t, 0, i3);
        return t.toString();
    }

    public String u(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        C7325jd2 v = new C7325jd2(cArr.length).v(cArr);
        S(v, 0, cArr.length);
        return v.toString();
    }

    public String v(char[] cArr, int i2, int i3) {
        if (cArr == null) {
            return null;
        }
        C7325jd2 w = new C7325jd2(i3).w(cArr, i2, i3);
        S(w, 0, i3);
        return w.toString();
    }

    public boolean w(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return x(stringBuffer, 0, stringBuffer.length());
    }

    public boolean x(StringBuffer stringBuffer, int i2, int i3) {
        if (stringBuffer == null) {
            return false;
        }
        C7325jd2 n = new C7325jd2(i3).n(stringBuffer, i2, i3);
        if (!S(n, 0, i3)) {
            return false;
        }
        stringBuffer.replace(i2, i3 + i2, n.toString());
        return true;
    }

    public boolean y(StringBuilder sb) {
        if (sb == null) {
            return false;
        }
        return z(sb, 0, sb.length());
    }

    public boolean z(StringBuilder sb, int i2, int i3) {
        if (sb == null) {
            return false;
        }
        C7325jd2 p = new C7325jd2(i3).p(sb, i2, i3);
        if (!S(p, 0, i3)) {
            return false;
        }
        sb.replace(i2, i3 + i2, p.toString());
        return true;
    }

    public <V> C9045qd2(Map<String, V> map) {
        this((AbstractC7811ld2<?>) AbstractC7811ld2.b(map), i, j, '$');
    }

    public <V> C9045qd2(Map<String, V> map, String str, String str2) {
        this((AbstractC7811ld2<?>) AbstractC7811ld2.b(map), str, str2, '$');
    }

    public <V> C9045qd2(Map<String, V> map, String str, String str2, char c) {
        this(AbstractC7811ld2.b(map), str, str2, c);
    }

    public <V> C9045qd2(Map<String, V> map, String str, String str2, char c, String str3) {
        this(AbstractC7811ld2.b(map), str, str2, c, str3);
    }

    public C9045qd2(AbstractC7811ld2<?> abstractC7811ld2) {
        this(abstractC7811ld2, i, j, '$');
    }

    public C9045qd2(AbstractC7811ld2<?> abstractC7811ld2, String str, String str2, char c) {
        N(abstractC7811ld2);
        L(str);
        P(str2);
        F(c);
        J(k);
    }

    public C9045qd2(AbstractC7811ld2<?> abstractC7811ld2, String str, String str2, char c, String str3) {
        N(abstractC7811ld2);
        L(str);
        P(str2);
        F(c);
        I(str3);
    }

    public C9045qd2(AbstractC7811ld2<?> abstractC7811ld2, AbstractC8315nd2 abstractC8315nd2, AbstractC8315nd2 abstractC8315nd22, char c) {
        this(abstractC7811ld2, abstractC8315nd2, abstractC8315nd22, c, k);
    }

    public C9045qd2(AbstractC7811ld2<?> abstractC7811ld2, AbstractC8315nd2 abstractC8315nd2, AbstractC8315nd2 abstractC8315nd22, char c, AbstractC8315nd2 abstractC8315nd23) {
        N(abstractC7811ld2);
        M(abstractC8315nd2);
        Q(abstractC8315nd22);
        F(c);
        J(abstractC8315nd23);
    }
}
