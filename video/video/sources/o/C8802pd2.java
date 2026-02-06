package o;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Deprecated
/* renamed from: o.pd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8802pd2 {
    public static final char i = '$';
    public static final AbstractC8559od2 j = AbstractC8559od2.m("${");
    public static final AbstractC8559od2 k = AbstractC8559od2.m("}");
    public static final AbstractC8559od2 l = AbstractC8559od2.m(C3427Ke2.k);
    public char a;
    public AbstractC8559od2 b;
    public AbstractC8559od2 c;
    public AbstractC8559od2 d;
    public AbstractC8072md2<?> e;
    public boolean f;
    public boolean g;
    public boolean h;

    public C8802pd2() {
        this((AbstractC8072md2<?>) null, j, k, '$');
    }

    public static String D(Object obj) {
        return new C8802pd2(AbstractC8072md2.e()).l(obj);
    }

    public static <V> String m(Object obj, Map<String, V> map) {
        return new C8802pd2(map).l(obj);
    }

    public static <V> String n(Object obj, Map<String, V> map, String str, String str2) {
        return new C8802pd2(map, str, str2).l(obj);
    }

    public static String o(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap hashMap = new HashMap();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String valueOf = String.valueOf(propertyNames.nextElement());
            hashMap.put(valueOf, properties.getProperty(valueOf));
        }
        return m(obj, hashMap);
    }

    public boolean A(StringBuilder sb, int i2, int i3) {
        if (sb == null) {
            return false;
        }
        C7568kd2 p = new C7568kd2(i3).p(sb, i2, i3);
        if (!U(p, 0, i3)) {
            return false;
        }
        sb.replace(i2, i3 + i2, p.toString());
        return true;
    }

    public boolean B(C7568kd2 c7568kd2) {
        if (c7568kd2 == null) {
            return false;
        }
        return U(c7568kd2, 0, c7568kd2.length());
    }

    public boolean C(C7568kd2 c7568kd2, int i2, int i3) {
        if (c7568kd2 == null) {
            return false;
        }
        return U(c7568kd2, i2, i3);
    }

    public String E(String str, C7568kd2 c7568kd2, int i2, int i3) {
        AbstractC8072md2<?> e = e();
        if (e == null) {
            return null;
        }
        return e.lookup(str);
    }

    public void F(boolean z) {
        this.h = z;
    }

    public void G(boolean z) {
        this.f = z;
    }

    public void H(char c) {
        this.a = c;
    }

    public void I(boolean z) {
        this.g = z;
    }

    public C8802pd2 J(char c) {
        return L(AbstractC8559od2.a(c));
    }

    public C8802pd2 K(String str) {
        if (str != null && !str.isEmpty()) {
            return L(AbstractC8559od2.m(str));
        }
        L(null);
        return this;
    }

    public C8802pd2 L(AbstractC8559od2 abstractC8559od2) {
        this.d = abstractC8559od2;
        return this;
    }

    public C8802pd2 M(char c) {
        return O(AbstractC8559od2.a(c));
    }

    public C8802pd2 N(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Variable prefix must not be null!", new Object[0]);
        return O(AbstractC8559od2.m(str));
    }

    public C8802pd2 O(AbstractC8559od2 abstractC8559od2) {
        boolean z;
        if (abstractC8559od2 != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Variable prefix matcher must not be null!", new Object[0]);
        this.b = abstractC8559od2;
        return this;
    }

    public void P(AbstractC8072md2<?> abstractC8072md2) {
        this.e = abstractC8072md2;
    }

    public C8802pd2 Q(char c) {
        return S(AbstractC8559od2.a(c));
    }

    public C8802pd2 R(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Variable suffix must not be null!", new Object[0]);
        return S(AbstractC8559od2.m(str));
    }

    public C8802pd2 S(AbstractC8559od2 abstractC8559od2) {
        boolean z;
        if (abstractC8559od2 != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Variable suffix matcher must not be null!", new Object[0]);
        this.c = abstractC8559od2;
        return this;
    }

    public final int T(C7568kd2 c7568kd2, int i2, int i3, List<String> list) {
        boolean z;
        AbstractC8559od2 abstractC8559od2;
        char c;
        boolean z2;
        boolean z3;
        int i4;
        String str;
        int i5;
        AbstractC8559od2 d = d();
        AbstractC8559od2 f = f();
        char b = b();
        AbstractC8559od2 c2 = c();
        boolean h = h();
        boolean g = g();
        if (list == null) {
            z = true;
        } else {
            z = false;
        }
        int i6 = i2;
        int i7 = i2 + i3;
        int i8 = 0;
        int i9 = 0;
        char[] cArr = c7568kd2.X;
        List<String> list2 = list;
        while (i6 < i7) {
            int g2 = d.g(cArr, i6, i2, i7);
            if (g2 == 0) {
                i6++;
                abstractC8559od2 = f;
                c = b;
                z2 = h;
                z3 = g;
            } else {
                if (i6 > i2) {
                    int i10 = i6 - 1;
                    z2 = h;
                    if (cArr[i10] == b) {
                        if (this.g) {
                            i6++;
                            h = z2;
                        } else {
                            c7568kd2.w0(i10);
                            i8--;
                            i7--;
                            abstractC8559od2 = f;
                            c = b;
                            cArr = c7568kd2.X;
                            z3 = g;
                            i9 = 1;
                        }
                    }
                } else {
                    z2 = h;
                }
                int i11 = i6 + g2;
                int i12 = i11;
                int i13 = 0;
                while (true) {
                    if (i12 < i7) {
                        if (z2 && d.g(cArr, i12, i2, i7) != 0) {
                            i13++;
                            i12 += d.g(cArr, i12, i2, i7);
                        } else {
                            int g3 = f.g(cArr, i12, i2, i7);
                            if (g3 == 0) {
                                i12++;
                            } else if (i13 == 0) {
                                abstractC8559od2 = f;
                                c = b;
                                String str2 = new String(cArr, i11, (i12 - i6) - g2);
                                if (z2) {
                                    C7568kd2 c7568kd22 = new C7568kd2(str2);
                                    U(c7568kd22, 0, c7568kd22.length());
                                    str2 = c7568kd22.toString();
                                }
                                int i14 = i12 + g3;
                                if (c2 != null) {
                                    char[] charArray = str2.toCharArray();
                                    z3 = g;
                                    for (int i15 = 0; i15 < charArray.length && (z2 || d.g(charArray, i15, i15, charArray.length) == 0); i15++) {
                                        if (c2.f(charArray, i15) != 0) {
                                            int f2 = c2.f(charArray, i15);
                                            i4 = 0;
                                            String substring = str2.substring(0, i15);
                                            str = str2.substring(i15 + f2);
                                            str2 = substring;
                                            break;
                                        }
                                    }
                                } else {
                                    z3 = g;
                                }
                                i4 = 0;
                                str = null;
                                if (list2 == null) {
                                    list2 = new ArrayList<>();
                                    list2.add(new String(cArr, i2, i3));
                                }
                                a(str2, list2);
                                list2.add(str2);
                                String E = E(str2, c7568kd2, i6, i14);
                                if (E != null) {
                                    str = E;
                                }
                                if (str != null) {
                                    int length = str.length();
                                    c7568kd2.l1(i6, i14, str);
                                    if (!z3) {
                                        i5 = T(c7568kd2, i6, length, list2);
                                    } else {
                                        i5 = i4;
                                    }
                                    int i16 = (i5 + length) - (i14 - i6);
                                    i14 += i16;
                                    i7 += i16;
                                    i8 += i16;
                                    cArr = c7568kd2.X;
                                    i9 = 1;
                                }
                                i6 = i14;
                                list2.remove(list2.size() - 1);
                            } else {
                                i13--;
                                i12 += g3;
                                g = g;
                            }
                        }
                    } else {
                        abstractC8559od2 = f;
                        c = b;
                        z3 = g;
                        i6 = i12;
                        break;
                    }
                }
                h = z2;
                f = abstractC8559od2;
                b = c;
                g = z3;
            }
            h = z2;
            f = abstractC8559od2;
            b = c;
            g = z3;
        }
        if (z) {
            return i9;
        }
        return i8;
    }

    public boolean U(C7568kd2 c7568kd2, int i2, int i3) {
        if (T(c7568kd2, i2, i3, null) > 0) {
            return true;
        }
        return false;
    }

    public final void a(String str, List<String> list) {
        if (!list.contains(str)) {
            return;
        }
        C7568kd2 c7568kd2 = new C7568kd2(256);
        c7568kd2.j("Infinite loop in property interpolation of ");
        c7568kd2.j(list.remove(0));
        c7568kd2.j(": ");
        c7568kd2.O(list, "->");
        throw new IllegalStateException(c7568kd2.toString());
    }

    public char b() {
        return this.a;
    }

    public AbstractC8559od2 c() {
        return this.d;
    }

    public AbstractC8559od2 d() {
        return this.b;
    }

    public AbstractC8072md2<?> e() {
        return this.e;
    }

    public AbstractC8559od2 f() {
        return this.c;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public String j(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return k(charSequence, 0, charSequence.length());
    }

    public String k(CharSequence charSequence, int i2, int i3) {
        if (charSequence == null) {
            return null;
        }
        C7568kd2 append = new C7568kd2(i3).append(charSequence, i2, i3);
        U(append, 0, i3);
        return append.toString();
    }

    public String l(Object obj) {
        if (obj == null) {
            return null;
        }
        C7568kd2 i2 = new C7568kd2().i(obj);
        U(i2, 0, i2.length());
        return i2.toString();
    }

    public String p(String str) {
        if (str == null) {
            return null;
        }
        C7568kd2 c7568kd2 = new C7568kd2(str);
        if (!U(c7568kd2, 0, str.length())) {
            return str;
        }
        return c7568kd2.toString();
    }

    public String q(String str, int i2, int i3) {
        if (str == null) {
            return null;
        }
        C7568kd2 k2 = new C7568kd2(i3).k(str, i2, i3);
        if (!U(k2, 0, i3)) {
            return str.substring(i2, i3 + i2);
        }
        return k2.toString();
    }

    public String r(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        C7568kd2 m = new C7568kd2(stringBuffer.length()).m(stringBuffer);
        U(m, 0, m.length());
        return m.toString();
    }

    public String s(StringBuffer stringBuffer, int i2, int i3) {
        if (stringBuffer == null) {
            return null;
        }
        C7568kd2 n = new C7568kd2(i3).n(stringBuffer, i2, i3);
        U(n, 0, i3);
        return n.toString();
    }

    public String t(C7568kd2 c7568kd2) {
        if (c7568kd2 == null) {
            return null;
        }
        C7568kd2 s = new C7568kd2(c7568kd2.length()).s(c7568kd2);
        U(s, 0, s.length());
        return s.toString();
    }

    public String u(C7568kd2 c7568kd2, int i2, int i3) {
        if (c7568kd2 == null) {
            return null;
        }
        C7568kd2 t = new C7568kd2(i3).t(c7568kd2, i2, i3);
        U(t, 0, i3);
        return t.toString();
    }

    public String v(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        C7568kd2 v = new C7568kd2(cArr.length).v(cArr);
        U(v, 0, cArr.length);
        return v.toString();
    }

    public String w(char[] cArr, int i2, int i3) {
        if (cArr == null) {
            return null;
        }
        C7568kd2 w = new C7568kd2(i3).w(cArr, i2, i3);
        U(w, 0, i3);
        return w.toString();
    }

    public boolean x(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return y(stringBuffer, 0, stringBuffer.length());
    }

    public boolean y(StringBuffer stringBuffer, int i2, int i3) {
        if (stringBuffer == null) {
            return false;
        }
        C7568kd2 n = new C7568kd2(i3).n(stringBuffer, i2, i3);
        if (!U(n, 0, i3)) {
            return false;
        }
        stringBuffer.replace(i2, i3 + i2, n.toString());
        return true;
    }

    public boolean z(StringBuilder sb) {
        if (sb == null) {
            return false;
        }
        return A(sb, 0, sb.length());
    }

    public <V> C8802pd2(Map<String, V> map) {
        this((AbstractC8072md2<?>) AbstractC8072md2.b(map), j, k, '$');
    }

    public <V> C8802pd2(Map<String, V> map, String str, String str2) {
        this((AbstractC8072md2<?>) AbstractC8072md2.b(map), str, str2, '$');
    }

    public <V> C8802pd2(Map<String, V> map, String str, String str2, char c) {
        this(AbstractC8072md2.b(map), str, str2, c);
    }

    public <V> C8802pd2(Map<String, V> map, String str, String str2, char c, String str3) {
        this(AbstractC8072md2.b(map), str, str2, c, str3);
    }

    public C8802pd2(AbstractC8072md2<?> abstractC8072md2) {
        this(abstractC8072md2, j, k, '$');
    }

    public C8802pd2(AbstractC8072md2<?> abstractC8072md2, String str, String str2, char c) {
        P(abstractC8072md2);
        N(str);
        R(str2);
        H(c);
        L(l);
    }

    public C8802pd2(AbstractC8072md2<?> abstractC8072md2, String str, String str2, char c, String str3) {
        P(abstractC8072md2);
        N(str);
        R(str2);
        H(c);
        K(str3);
    }

    public C8802pd2(AbstractC8072md2<?> abstractC8072md2, AbstractC8559od2 abstractC8559od2, AbstractC8559od2 abstractC8559od22, char c) {
        this(abstractC8072md2, abstractC8559od2, abstractC8559od22, c, l);
    }

    public C8802pd2(AbstractC8072md2<?> abstractC8072md2, AbstractC8559od2 abstractC8559od2, AbstractC8559od2 abstractC8559od22, char c, AbstractC8559od2 abstractC8559od23) {
        P(abstractC8072md2);
        O(abstractC8559od2);
        S(abstractC8559od22);
        H(c);
        L(abstractC8559od23);
    }
}
