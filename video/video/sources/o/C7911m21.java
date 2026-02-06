package o;

import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import o.C8172n21;

/* renamed from: o.m21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7911m21 extends C3651Mm {

    @Deprecated
    /* renamed from: o.m21$a */
    /* loaded from: classes4.dex */
    public static class a {
        public int a = -1;
        public String b;
        public String c;
        public String d;
        public Object e;

        public a(Object obj, String str, String str2, String str3, int i) {
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

    public static String A(Object obj, String str, int i, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().D(obj, str, i, str2);
    }

    public static String B(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().E(obj, str, str2);
    }

    public static String C(Object obj, String str, String str2, String str3) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().H(obj, str, str2, str3);
    }

    public static String D(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().I(obj, str, str2);
    }

    public static String E(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().J(obj, str, str2);
    }

    public static String F(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().K(obj, str, str2);
    }

    public static String G(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().L(obj, str, str2);
    }

    public static void H(Object obj, String str, String str2, int i, Object obj2) throws IllegalAccessException, InvocationTargetException {
        C8172n21.F().M(obj, str, str2, i, obj2);
    }

    public static void I(boolean z) {
        C8172n21.F().N(z);
    }

    public static void J(Locale locale) {
        C8172n21.F().O(locale);
    }

    public static void K(Object obj, String str, Object obj2, String str2) throws IllegalAccessException, InvocationTargetException {
        C8172n21.F().Q(obj, str, obj2, str2);
    }

    public static String i(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().j(obj, str);
    }

    public static String j(Object obj, String str, int i) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().k(obj, str, i);
    }

    public static String k(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().n(obj, str);
    }

    public static String l(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().o(obj, str, str2);
    }

    public static String m(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().p(obj, str);
    }

    public static String n(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().q(obj, str);
    }

    public static String o(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C8172n21.F().s(obj, str);
    }

    public static void t(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException {
        C8172n21.F().w(obj, str, obj2);
    }

    @Deprecated
    public static a u(Object obj, String str) throws IllegalAccessException, InvocationTargetException {
        C8172n21.b x = C8172n21.F().x(obj, str);
        return new a(x.e(), x.c(), x.d(), x.b(), x.a());
    }

    public static Object v(Class<?> cls, int i, Object obj) {
        return C8172n21.F().y(cls, i, obj);
    }

    public static Object w(Class<?> cls, int i, Object obj, String str) {
        return C8172n21.F().z(cls, i, obj, str);
    }

    public static Class<?> x(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException {
        return C8172n21.F().A(obj, str, str2);
    }

    public static boolean y() {
        return C8172n21.F().B();
    }

    public static Locale z() {
        return C8172n21.F().C();
    }
}
