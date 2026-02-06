package o;

import java.beans.IndexedPropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* renamed from: o.n21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8172n21 extends C3749Nm {
    public static final C9715tM<C8172n21> h = new a();
    public final J31 f;
    public final C8659p21 g;

    /* renamed from: o.n21$a */
    /* loaded from: classes4.dex */
    public static class a extends C9715tM<C8172n21> {
        @Override // o.C9715tM
        /* renamed from: f */
        public C8172n21 b() {
            return new C8172n21();
        }
    }

    @Deprecated
    /* renamed from: o.n21$b */
    /* loaded from: classes4.dex */
    public class b {
        public int a = -1;
        public String b;
        public String c;
        public String d;
        public Object e;

        public b(Object obj, String str, String str2, String str3, int i) {
            j(obj);
            h(str);
            i(str2);
            g(str3);
            f(i);
        }

        public int a() {
            return this.a;
        }

        public String b() {
            return this.d;
        }

        public String c() {
            return this.b;
        }

        public String d() {
            return this.c;
        }

        public Object e() {
            return this.e;
        }

        public void f(int i) {
            this.a = i;
        }

        public void g(String str) {
            this.d = str;
        }

        public void h(String str) {
            this.b = str;
        }

        public void i(String str) {
            this.c = str;
        }

        public void j(Object obj) {
            this.e = obj;
        }
    }

    public C8172n21() {
        this.f = U31.q(C8172n21.class);
        this.g = new C8659p21();
    }

    public static C8172n21 F() {
        return h.a();
    }

    public static void P(C8172n21 c8172n21) {
        h.c(c8172n21);
    }

    public Class<?> A(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException {
        if (obj instanceof InterfaceC10878y80) {
            C80 p = ((InterfaceC10878y80) obj).d().p(str2);
            if (p == null) {
                return null;
            }
            return p.c();
        }
        try {
            IndexedPropertyDescriptor p2 = r().p(obj, str);
            if (p2 == null) {
                return null;
            }
            if (p2 instanceof C7206j81) {
                return ((C7206j81) p2).d();
            }
            if (p2 instanceof IndexedPropertyDescriptor) {
                return p2.getIndexedPropertyType();
            }
            return p2.getPropertyType();
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public boolean B() {
        return G().n();
    }

    public Locale C() {
        return G().o();
    }

    public String D(Object obj, String str, int i, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return G().h(r().g(obj, str, i), str2);
    }

    public String E(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return G().h(r().f(obj, str), str2);
    }

    public C8659p21 G() {
        return this.g;
    }

    public String H(Object obj, String str, String str2, String str3) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return G().h(r().k(obj, str, str2), str3);
    }

    public String I(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return G().h(r().j(obj, str), str2);
    }

    public String J(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return G().h(r().n(obj, str), str2);
    }

    public String K(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return J(obj, str, str2);
    }

    public String L(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return G().h(r().y(obj, str), str2);
    }

    public void M(Object obj, String str, String str2, int i, Object obj2) throws IllegalAccessException, InvocationTargetException {
        try {
            if (i >= 0) {
                r().G(obj, str, i, obj2);
            } else if (str2 != null) {
                r().J(obj, str, str2, obj2);
            } else {
                r().L(obj, str, obj2);
            }
        } catch (NoSuchMethodException e) {
            throw new InvocationTargetException(e, "Cannot set " + str);
        }
    }

    public void N(boolean z) {
        G().t(z);
    }

    public void O(Locale locale) {
        G().u(locale);
    }

    public void Q(Object obj, String str, Object obj2, String str2) throws IllegalAccessException, InvocationTargetException {
        if (this.f.f()) {
            StringBuilder sb = new StringBuilder("  setProperty(");
            sb.append(obj);
            sb.append(C6566gU0.h);
            sb.append(str);
            sb.append(C6566gU0.h);
            if (obj2 == null) {
                sb.append("<NULL>");
            } else if (obj2 instanceof String) {
                sb.append((String) obj2);
            } else if (obj2 instanceof String[]) {
                String[] strArr = (String[]) obj2;
                sb.append('[');
                for (int i = 0; i < strArr.length; i++) {
                    if (i > 0) {
                        sb.append(',');
                    }
                    sb.append(strArr[i]);
                }
                sb.append(']');
            } else {
                sb.append(obj2.toString());
            }
            sb.append(')');
            this.f.r(sb.toString());
        }
        InterfaceC5095aT1 x = r().x();
        Object obj3 = obj;
        while (x.c(str)) {
            try {
                obj3 = r().o(obj3, x.d(str));
                str = x.remove(str);
            } catch (NoSuchMethodException unused) {
                return;
            }
        }
        if (this.f.f()) {
            J31 j31 = this.f;
            j31.r("    Target bean = " + obj3);
            J31 j312 = this.f;
            j312.r("    Target name = " + str);
        }
        String property = x.getProperty(str);
        int index = x.getIndex(str);
        String a2 = x.a(str);
        Class<?> A = A(obj3, str, property);
        if (A != null) {
            M(obj3, property, a2, index, z(A, index, obj2, str2));
        }
    }

    @Override // o.C3749Nm
    public String j(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return E(obj, str, null);
    }

    @Override // o.C3749Nm
    public String k(Object obj, String str, int i) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return D(obj, str, i, null);
    }

    @Override // o.C3749Nm
    public String n(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return I(obj, str, null);
    }

    @Override // o.C3749Nm
    public String o(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return H(obj, str, str2, null);
    }

    @Override // o.C3749Nm
    public String p(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return J(obj, str, null);
    }

    @Override // o.C3749Nm
    public String q(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return p(obj, str);
    }

    @Override // o.C3749Nm
    public String s(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return L(obj, str, null);
    }

    @Override // o.C3749Nm
    public void w(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Q(obj, str, obj2, null);
    }

    @Deprecated
    public b x(Object obj, String str) throws IllegalAccessException, InvocationTargetException {
        InterfaceC5095aT1 x = r().x();
        Object obj2 = obj;
        String str2 = str;
        while (x.c(str2)) {
            try {
                obj2 = r().o(obj2, x.d(str2));
                str2 = x.remove(str2);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
        if (this.f.f()) {
            J31 j31 = this.f;
            j31.r("    Target bean = " + obj2);
            J31 j312 = this.f;
            j312.r("    Target name = " + str2);
        }
        return new b(obj2, str2, x.getProperty(str2), x.a(str2), x.getIndex(str2));
    }

    public Object y(Class<?> cls, int i, Object obj) {
        if (cls.isArray() && i < 0) {
            if (obj instanceof String) {
                return C6282fN.c(new String[]{(String) obj}, cls);
            }
            if (obj instanceof String[]) {
                return C6282fN.c((String[]) obj, cls);
            }
        } else if (cls.isArray()) {
            if (obj instanceof String) {
                return C6282fN.b((String) obj, cls.getComponentType());
            }
            if (obj instanceof String[]) {
                return C6282fN.b(((String[]) obj)[0], cls.getComponentType());
            }
        } else if (obj instanceof String) {
            return C6282fN.b((String) obj, cls);
        } else {
            if (obj instanceof String[]) {
                return C6282fN.b(((String[]) obj)[0], cls);
            }
        }
        return obj;
    }

    public Object z(Class<?> cls, int i, Object obj, String str) {
        if (this.f.f()) {
            J31 j31 = this.f;
            j31.r("Converting value '" + obj + "' to type:" + cls);
        }
        if (cls.isArray() && i < 0) {
            if (obj instanceof String) {
                return G().e(new String[]{(String) obj}, cls, str);
            } else if (obj instanceof String[]) {
                return G().e((String[]) obj, cls, str);
            }
        } else if (cls.isArray()) {
            if (obj instanceof String) {
                return G().b((String) obj, cls.getComponentType(), str);
            }
            if (obj instanceof String[]) {
                return G().b(((String[]) obj)[0], cls.getComponentType(), str);
            }
        } else if (obj instanceof String) {
            return G().b((String) obj, cls, str);
        } else {
            if (obj instanceof String[]) {
                return G().b(((String[]) obj)[0], cls, str);
            }
        }
        return obj;
    }

    public C8172n21(C8659p21 c8659p21, C6780hN c6780hN, NJ1 nj1) {
        super(c6780hN, nj1);
        this.f = U31.q(C8172n21.class);
        this.g = c8659p21;
    }

    public C8172n21(C8659p21 c8659p21) {
        this.f = U31.q(C8172n21.class);
        this.g = c8659p21;
    }
}
