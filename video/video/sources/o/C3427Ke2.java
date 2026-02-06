package o;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/* renamed from: o.Ke2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3427Ke2 {
    public static final char j = '$';
    public static final String k = ":-";
    public static final String l = "}";
    public static final String m = "${";
    public static final InterfaceC2828Ee2 n;

    /* renamed from: o  reason: collision with root package name */
    public static final InterfaceC2828Ee2 f519o;
    public static final InterfaceC2828Ee2 p;
    public boolean a;
    public boolean b;
    public boolean c;
    public char d;
    public InterfaceC2828Ee2 e;
    public boolean f;
    public InterfaceC2828Ee2 g;
    public InterfaceC2828Ee2 h;
    public InterfaceC10759xe2 i;

    /* renamed from: o.Ke2$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public final boolean a;
        public final int b;

        public String toString() {
            return "Result [altered=" + this.a + ", lengthChange=" + this.b + C6566gU0.g;
        }

        public b(boolean z, int i) {
            this.a = z;
            this.b = i;
        }
    }

    static {
        C2937Fe2 c2937Fe2 = C2937Fe2.c;
        n = c2937Fe2.l("${");
        f519o = c2937Fe2.l("}");
        p = c2937Fe2.l(k);
    }

    public C3427Ke2() {
        this((InterfaceC10759xe2) null, n, f519o, '$');
    }

    public static String F(Object obj) {
        return new C3427Ke2(C2730De2.a.B()).n(obj);
    }

    public static C3427Ke2 b() {
        return new C3427Ke2(C2730De2.a.p());
    }

    public static <V> String o(Object obj, Map<String, V> map) {
        return new C3427Ke2(map).n(obj);
    }

    public static <V> String p(Object obj, Map<String, V> map, String str, String str2) {
        return new C3427Ke2(map, str, str2).n(obj);
    }

    public static String q(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap hashMap = new HashMap();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String valueOf = String.valueOf(propertyNames.nextElement());
            hashMap.put(valueOf, properties.getProperty(valueOf));
        }
        return o(obj, hashMap);
    }

    public boolean A(StringBuffer stringBuffer, int i, int i2) {
        if (stringBuffer == null) {
            return false;
        }
        C4726Xm2 n2 = new C4726Xm2(i2).n(stringBuffer, i, i2);
        if (!X(n2, 0, i2)) {
            return false;
        }
        stringBuffer.replace(i, i2 + i, n2.toString());
        return true;
    }

    public boolean B(StringBuilder sb) {
        if (sb == null) {
            return false;
        }
        return C(sb, 0, sb.length());
    }

    public boolean C(StringBuilder sb, int i, int i2) {
        if (sb == null) {
            return false;
        }
        C4726Xm2 p2 = new C4726Xm2(i2).p(sb, i, i2);
        if (!X(p2, 0, i2)) {
            return false;
        }
        sb.replace(i, i2 + i, p2.toString());
        return true;
    }

    public boolean D(C4726Xm2 c4726Xm2) {
        if (c4726Xm2 == null) {
            return false;
        }
        return X(c4726Xm2, 0, c4726Xm2.length());
    }

    public boolean E(C4726Xm2 c4726Xm2, int i, int i2) {
        if (c4726Xm2 == null) {
            return false;
        }
        return X(c4726Xm2, i, i2);
    }

    public String G(String str, C4726Xm2 c4726Xm2, int i, int i2) {
        InterfaceC10759xe2 d = d();
        if (d == null) {
            return null;
        }
        return d.lookup(str);
    }

    public C3427Ke2 H(boolean z) {
        this.a = z;
        return this;
    }

    public C3427Ke2 I(boolean z) {
        this.b = z;
        return this;
    }

    public C3427Ke2 J(boolean z) {
        this.c = z;
        return this;
    }

    public C3427Ke2 K(char c) {
        this.d = c;
        return this;
    }

    public C3427Ke2 L(boolean z) {
        this.f = z;
        return this;
    }

    public C3427Ke2 M(char c) {
        return O(C2937Fe2.c.b(c));
    }

    public C3427Ke2 N(String str) {
        if (str != null && !str.isEmpty()) {
            return O(C2937Fe2.c.l(str));
        }
        O(null);
        return this;
    }

    public C3427Ke2 O(InterfaceC2828Ee2 interfaceC2828Ee2) {
        this.h = interfaceC2828Ee2;
        return this;
    }

    public C3427Ke2 P(char c) {
        return R(C2937Fe2.c.b(c));
    }

    public C3427Ke2 Q(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Variable prefix must not be null!", new Object[0]);
        return R(C2937Fe2.c.l(str));
    }

    public C3427Ke2 R(InterfaceC2828Ee2 interfaceC2828Ee2) {
        boolean z;
        if (interfaceC2828Ee2 != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Variable prefix matcher must not be null!", new Object[0]);
        this.e = interfaceC2828Ee2;
        return this;
    }

    public C3427Ke2 S(InterfaceC10759xe2 interfaceC10759xe2) {
        this.i = interfaceC10759xe2;
        return this;
    }

    public C3427Ke2 T(char c) {
        return V(C2937Fe2.c.b(c));
    }

    public C3427Ke2 U(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Variable suffix must not be null!", new Object[0]);
        return V(C2937Fe2.c.l(str));
    }

    public C3427Ke2 V(InterfaceC2828Ee2 interfaceC2828Ee2) {
        boolean z;
        if (interfaceC2828Ee2 != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Variable suffix matcher must not be null!", new Object[0]);
        this.g = interfaceC2828Ee2;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b W(C4726Xm2 c4726Xm2, int i, int i2, List<String> list) {
        InterfaceC2828Ee2 interfaceC2828Ee2;
        InterfaceC2828Ee2 interfaceC2828Ee22;
        boolean z;
        int i3;
        char c;
        int i4;
        int i5;
        String str;
        int i6;
        int i7 = i;
        Objects.requireNonNull(c4726Xm2, "builder");
        InterfaceC2828Ee2 f = f();
        InterfaceC2828Ee2 g = g();
        char c2 = c();
        InterfaceC2828Ee2 e = e();
        boolean i8 = i();
        boolean h = h();
        boolean j2 = j();
        boolean k2 = k();
        int i9 = i7;
        int i10 = i7 + i2;
        int i11 = 0;
        boolean z2 = false;
        int i12 = -1;
        List<String> list2 = list;
        while (i9 < i10) {
            int c3 = f.c(c4726Xm2, i9, i7, i10);
            if (c3 == 0) {
                i9++;
                interfaceC2828Ee2 = f;
                interfaceC2828Ee22 = g;
                z = h;
                i3 = i12;
                c = c2;
            } else {
                if (i9 > i7) {
                    i4 = i9 - 1;
                    z = h;
                    if (c4726Xm2.charAt(i4) == c2) {
                        if (k2) {
                            i9++;
                            h = z;
                        } else {
                            int i13 = i9 + c3;
                            c = c2;
                            i5 = i13;
                            int i14 = 0;
                            while (true) {
                                if (i5 < i10) {
                                    interfaceC2828Ee2 = f;
                                    interfaceC2828Ee22 = g;
                                    i3 = i4;
                                    break;
                                } else if (i8 && f.c(c4726Xm2, i5, i7, i10) != 0) {
                                    i14++;
                                    i5 += f.c(c4726Xm2, i5, i7, i10);
                                } else {
                                    int c4 = g.c(c4726Xm2, i5, i7, i10);
                                    if (c4 == 0) {
                                        i5++;
                                    } else if (i14 != 0) {
                                        i14--;
                                        i5 += c4;
                                        i7 = i;
                                        f = f;
                                    } else if (i4 >= 0) {
                                        c4726Xm2.y0(i4);
                                        i11--;
                                        i10--;
                                        i9++;
                                        c2 = c;
                                        h = z;
                                        z2 = true;
                                        i12 = -1;
                                    } else {
                                        String o1 = c4726Xm2.o1(i13, (i5 - i9) - c3);
                                        if (i8) {
                                            C4726Xm2 c4726Xm22 = new C4726Xm2(o1);
                                            interfaceC2828Ee22 = g;
                                            X(c4726Xm22, 0, c4726Xm22.length());
                                            o1 = c4726Xm22.toString();
                                        } else {
                                            interfaceC2828Ee22 = g;
                                        }
                                        i5 += c4;
                                        if (e != null) {
                                            char[] charArray = o1.toCharArray();
                                            i3 = i4;
                                            int i15 = 0;
                                            while (i15 < charArray.length && (i8 || f.b(charArray, i15, i15, charArray.length) == 0)) {
                                                interfaceC2828Ee2 = f;
                                                i6 = 0;
                                                if (e.b(charArray, i15, 0, charArray.length) != 0) {
                                                    int b2 = e.b(charArray, i15, 0, charArray.length);
                                                    String substring = o1.substring(0, i15);
                                                    str = o1.substring(i15 + b2);
                                                    o1 = substring;
                                                    break;
                                                }
                                                i15++;
                                                f = interfaceC2828Ee2;
                                            }
                                            interfaceC2828Ee2 = f;
                                        } else {
                                            interfaceC2828Ee2 = f;
                                            i3 = i4;
                                        }
                                        i6 = 0;
                                        str = null;
                                        if (list2 == null) {
                                            list2 = new ArrayList<>();
                                            list2.add(c4726Xm2.o1(i, i2));
                                        }
                                        a(o1, list2);
                                        list2.add(o1);
                                        String G = G(o1, c4726Xm2, i9, i5);
                                        if (G != null) {
                                            str = G;
                                        }
                                        if (str != null) {
                                            int length = str.length();
                                            c4726Xm2.v1(i9, i5, str);
                                            int i16 = ((!z ? W(c4726Xm2, i9, length, list2).b : i6) + length) - (i5 - i9);
                                            i5 += i16;
                                            i10 += i16;
                                            i11 += i16;
                                            z2 = true;
                                        } else if (j2) {
                                            throw new IllegalArgumentException(String.format("Cannot resolve variable '%s' (enableSubstitutionInVariables=%s).", o1, Boolean.valueOf(i8)));
                                        }
                                        list2.remove(list2.size() - 1);
                                    }
                                }
                            }
                            i9 = i5;
                        }
                    }
                } else {
                    z = h;
                }
                i4 = i12;
                int i132 = i9 + c3;
                c = c2;
                i5 = i132;
                int i142 = 0;
                while (true) {
                    if (i5 < i10) {
                    }
                }
                i9 = i5;
            }
            i7 = i;
            c2 = c;
            h = z;
            g = interfaceC2828Ee22;
            i12 = i3;
            f = interfaceC2828Ee2;
        }
        return new b(z2, i11);
    }

    public boolean X(C4726Xm2 c4726Xm2, int i, int i2) {
        return W(c4726Xm2, i, i2, null).a;
    }

    public final void a(String str, List<String> list) {
        if (!list.contains(str)) {
            return;
        }
        C4726Xm2 c4726Xm2 = new C4726Xm2(256);
        c4726Xm2.j("Infinite loop in property interpolation of ");
        c4726Xm2.j(list.remove(0));
        c4726Xm2.j(": ");
        c4726Xm2.Q(list, "->");
        throw new IllegalStateException(c4726Xm2.toString());
    }

    public char c() {
        return this.d;
    }

    public InterfaceC10759xe2 d() {
        return this.i;
    }

    public InterfaceC2828Ee2 e() {
        return this.h;
    }

    public InterfaceC2828Ee2 f() {
        return this.e;
    }

    public InterfaceC2828Ee2 g() {
        return this.g;
    }

    public boolean h() {
        return this.a;
    }

    public boolean i() {
        return this.b;
    }

    public boolean j() {
        return this.c;
    }

    public boolean k() {
        return this.f;
    }

    public String l(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return m(charSequence, 0, charSequence.length());
    }

    public String m(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return null;
        }
        C4726Xm2 k2 = new C4726Xm2(i2).k(charSequence.toString(), i, i2);
        X(k2, 0, i2);
        return k2.toString();
    }

    public String n(Object obj) {
        if (obj == null) {
            return null;
        }
        C4726Xm2 i = new C4726Xm2().i(obj);
        X(i, 0, i.length());
        return i.toString();
    }

    public String r(String str) {
        if (str == null) {
            return null;
        }
        C4726Xm2 c4726Xm2 = new C4726Xm2(str);
        if (!X(c4726Xm2, 0, str.length())) {
            return str;
        }
        return c4726Xm2.toString();
    }

    public String s(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        C4726Xm2 k2 = new C4726Xm2(i2).k(str, i, i2);
        if (!X(k2, 0, i2)) {
            return str.substring(i, i2 + i);
        }
        return k2.toString();
    }

    public String t(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        C4726Xm2 m2 = new C4726Xm2(stringBuffer.length()).m(stringBuffer);
        X(m2, 0, m2.length());
        return m2.toString();
    }

    public String u(StringBuffer stringBuffer, int i, int i2) {
        if (stringBuffer == null) {
            return null;
        }
        C4726Xm2 n2 = new C4726Xm2(i2).n(stringBuffer, i, i2);
        X(n2, 0, i2);
        return n2.toString();
    }

    public String v(C4726Xm2 c4726Xm2) {
        if (c4726Xm2 == null) {
            return null;
        }
        C4726Xm2 s = new C4726Xm2(c4726Xm2.length()).s(c4726Xm2);
        X(s, 0, s.length());
        return s.toString();
    }

    public String w(C4726Xm2 c4726Xm2, int i, int i2) {
        if (c4726Xm2 == null) {
            return null;
        }
        C4726Xm2 t = new C4726Xm2(i2).t(c4726Xm2, i, i2);
        X(t, 0, i2);
        return t.toString();
    }

    public String x(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        C4726Xm2 v = new C4726Xm2(cArr.length).v(cArr);
        X(v, 0, cArr.length);
        return v.toString();
    }

    public String y(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return null;
        }
        C4726Xm2 w = new C4726Xm2(i2).w(cArr, i, i2);
        X(w, 0, i2);
        return w.toString();
    }

    public boolean z(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return A(stringBuffer, 0, stringBuffer.length());
    }

    public <V> C3427Ke2(Map<String, V> map) {
        this(C2730De2.a.v(map), n, f519o, '$');
    }

    public <V> C3427Ke2(Map<String, V> map, String str, String str2) {
        this(C2730De2.a.v(map), str, str2, '$');
    }

    public <V> C3427Ke2(Map<String, V> map, String str, String str2, char c) {
        this(C2730De2.a.v(map), str, str2, c);
    }

    public <V> C3427Ke2(Map<String, V> map, String str, String str2, char c, String str3) {
        this(C2730De2.a.v(map), str, str2, c, str3);
    }

    public C3427Ke2(InterfaceC10759xe2 interfaceC10759xe2) {
        this(interfaceC10759xe2, n, f519o, '$');
    }

    public C3427Ke2(InterfaceC10759xe2 interfaceC10759xe2, String str, String str2, char c) {
        S(interfaceC10759xe2);
        Q(str);
        U(str2);
        K(c);
        O(p);
    }

    public C3427Ke2(InterfaceC10759xe2 interfaceC10759xe2, String str, String str2, char c, String str3) {
        S(interfaceC10759xe2);
        Q(str);
        U(str2);
        K(c);
        N(str3);
    }

    public C3427Ke2(InterfaceC10759xe2 interfaceC10759xe2, InterfaceC2828Ee2 interfaceC2828Ee2, InterfaceC2828Ee2 interfaceC2828Ee22, char c) {
        this(interfaceC10759xe2, interfaceC2828Ee2, interfaceC2828Ee22, c, p);
    }

    public C3427Ke2(InterfaceC10759xe2 interfaceC10759xe2, InterfaceC2828Ee2 interfaceC2828Ee2, InterfaceC2828Ee2 interfaceC2828Ee22, char c, InterfaceC2828Ee2 interfaceC2828Ee23) {
        S(interfaceC10759xe2);
        R(interfaceC2828Ee2);
        V(interfaceC2828Ee22);
        K(c);
        O(interfaceC2828Ee23);
    }

    public C3427Ke2(C3427Ke2 c3427Ke2) {
        this.a = c3427Ke2.h();
        this.b = c3427Ke2.i();
        this.c = c3427Ke2.j();
        this.d = c3427Ke2.c();
        this.e = c3427Ke2.f();
        this.f = c3427Ke2.k();
        this.g = c3427Ke2.g();
        this.h = c3427Ke2.e();
        this.i = c3427Ke2.d();
    }
}
