package o;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* renamed from: o.Mm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3651Mm {
    @Deprecated
    public static int a;

    public static Object a(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().a(obj);
    }

    public static void b(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        C3749Nm.m().d(obj, obj2);
    }

    public static void c(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException {
        C3749Nm.m().e(obj, str, obj2);
    }

    public static <K, V> Map<K, V> d() {
        return new HJ2();
    }

    public static Map<String, String> e(Object obj) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().f(obj);
    }

    public static String[] f(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().h(obj, str);
    }

    public static boolean g(Map<?, ?> map) {
        if (map instanceof HJ2) {
            return ((HJ2) map).k();
        }
        return false;
    }

    @Deprecated
    public static int h() {
        return a;
    }

    public static String i(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().j(obj, str);
    }

    public static String j(Object obj, String str, int i) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().k(obj, str, i);
    }

    public static String k(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().n(obj, str);
    }

    public static String l(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().o(obj, str, str2);
    }

    public static String m(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().p(obj, str);
    }

    public static String n(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().q(obj, str);
    }

    public static String o(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return C3749Nm.m().s(obj, str);
    }

    public static boolean p(Throwable th, Throwable th2) {
        return C3749Nm.m().t(th, th2);
    }

    public static void q(Object obj, Map<String, ? extends Object> map) throws IllegalAccessException, InvocationTargetException {
        C3749Nm.m().u(obj, map);
    }

    public static void r(Map<?, ?> map, boolean z) {
        if (map instanceof HJ2) {
            ((HJ2) map).l(z);
        }
    }

    @Deprecated
    public static void s(int i) {
        a = i;
    }

    public static void t(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException {
        C3749Nm.m().w(obj, str, obj2);
    }
}
