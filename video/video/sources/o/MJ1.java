package o;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes4.dex */
public class MJ1 {
    @Deprecated
    public static final char a = '[';
    @Deprecated
    public static final char b = ']';
    @Deprecated
    public static final char c = '(';
    @Deprecated
    public static final char d = ')';
    @Deprecated
    public static final char e = '.';
    @Deprecated
    public static int f;

    public static void A(Object obj, String str, int i, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        NJ1.h().G(obj, str, i, obj2);
    }

    public static void B(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        NJ1.h().H(obj, str, obj2);
    }

    public static void C(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        NJ1.h().I(obj, str, obj2);
    }

    public static void D(Object obj, String str, String str2, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        NJ1.h().J(obj, str, str2, obj2);
    }

    public static void E(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        NJ1.h().K(obj, str, obj2);
    }

    public static void F(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        NJ1.h().L(obj, str, obj2);
    }

    public static void G(Object obj, String str, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        NJ1.h().O(obj, str, obj2);
    }

    public static void a(InterfaceC10056um interfaceC10056um) {
        NJ1.h().a(interfaceC10056um);
    }

    public static void b() {
        NJ1.h().b();
    }

    public static void c(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        NJ1.h().c(obj, obj2);
    }

    public static Map<String, Object> d(Object obj) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().d(obj);
    }

    @Deprecated
    public static int e() {
        return f;
    }

    public static Object f(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().f(obj, str);
    }

    public static Object g(Object obj, String str, int i) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().g(obj, str, i);
    }

    public static Object h(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().j(obj, str);
    }

    public static Object i(Object obj, String str, String str2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().k(obj, str, str2);
    }

    @Deprecated
    public static C9818tn0 j(Class<?> cls) {
        return NJ1.h().l(cls);
    }

    @Deprecated
    public static C9818tn0 k(Object obj) {
        return NJ1.h().m(obj);
    }

    public static Object l(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().n(obj, str);
    }

    public static Object m(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().o(obj, str);
    }

    public static PropertyDescriptor n(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().p(obj, str);
    }

    public static PropertyDescriptor[] o(Class<?> cls) {
        return NJ1.h().q(cls);
    }

    public static PropertyDescriptor[] p(Object obj) {
        return NJ1.h().r(obj);
    }

    public static Class<?> q(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().s(obj, str);
    }

    public static Class<?> r(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().u(obj, str);
    }

    public static Method s(PropertyDescriptor propertyDescriptor) {
        return NJ1.h().v(propertyDescriptor);
    }

    public static Object t(Object obj, String str) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return NJ1.h().y(obj, str);
    }

    public static Method u(PropertyDescriptor propertyDescriptor) {
        return NJ1.h().z(propertyDescriptor);
    }

    public static boolean v(Object obj, String str) {
        return NJ1.h().C(obj, str);
    }

    public static boolean w(Object obj, String str) {
        return NJ1.h().D(obj, str);
    }

    public static boolean x(InterfaceC10056um interfaceC10056um) {
        return NJ1.h().E(interfaceC10056um);
    }

    public static void y() {
        NJ1.h().F();
    }

    @Deprecated
    public static void z(int i) {
        f = i;
    }
}
