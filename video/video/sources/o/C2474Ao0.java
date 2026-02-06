package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Ao0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2474Ao0 {
    public static void A(Object obj, String str, Object obj2) throws IllegalAccessException {
        B(obj, str, obj2, false);
    }

    public static void B(Object obj, String str, Object obj2, boolean z) throws IllegalAccessException {
        boolean z2;
        C11147zE2.V(obj, "target", new Object[0]);
        Class<?> cls = obj.getClass();
        Field f = f(cls, str, z);
        if (f != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C11147zE2.B(z2, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(f, obj, obj2, false);
    }

    public static void C(Field field, Object obj, Object obj2) throws IllegalAccessException {
        D(field, obj, obj2, false);
    }

    public static void D(Field field, Object obj, Object obj2, boolean z) throws IllegalAccessException {
        C11147zE2.V(field, "field", new Object[0]);
        if (z && !field.isAccessible()) {
            field.setAccessible(true);
        } else {
            AbstractC4608Wh1.l(field);
        }
        field.set(obj, obj2);
    }

    public static void E(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        F(cls, str, obj, false);
    }

    public static void F(Class<?> cls, String str, Object obj, boolean z) throws IllegalAccessException {
        Field f = f(cls, str, z);
        C11147zE2.V(f, "Cannot locate field %s on %s", str, cls);
        H(f, obj, false);
    }

    public static void G(Field field, Object obj) throws IllegalAccessException {
        H(field, obj, false);
    }

    public static void H(Field field, Object obj, boolean z) throws IllegalAccessException {
        C11147zE2.V(field, "field", new Object[0]);
        C11147zE2.B(Modifier.isStatic(field.getModifiers()), "The field %s.%s is not static", field.getDeclaringClass().getName(), field.getName());
        D(field, null, obj, z);
    }

    public static Field[] a(Class<?> cls) {
        return (Field[]) b(cls).toArray(C4206Se.j);
    }

    public static List<Field> b(Class<?> cls) {
        C11147zE2.V(cls, "cls", new Object[0]);
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            Collections.addAll(arrayList, cls.getDeclaredFields());
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static Field c(Class<?> cls, String str) {
        return d(cls, str, false);
    }

    public static Field d(Class<?> cls, String str, boolean z) {
        C11147zE2.V(cls, "cls", new Object[0]);
        C11147zE2.B(C4500Ve2.M0(str), "The field name must not be blank/empty", new Object[0]);
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!AbstractC4608Wh1.g(declaredField)) {
                if (!z) {
                    return null;
                }
                declaredField.setAccessible(true);
                return declaredField;
            }
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static Field e(Class<?> cls, String str) {
        Field f = f(cls, str, false);
        AbstractC4608Wh1.l(f);
        return f;
    }

    public static Field f(Class<?> cls, String str, boolean z) {
        boolean z2;
        Field declaredField;
        C11147zE2.V(cls, "cls", new Object[0]);
        C11147zE2.B(C4500Ve2.M0(str), "The field name must not be blank/empty", new Object[0]);
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                declaredField = cls2.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
            if (!Modifier.isPublic(declaredField.getModifiers())) {
                if (z) {
                    declaredField.setAccessible(true);
                } else {
                    continue;
                }
            }
            return declaredField;
        }
        Field field = null;
        for (Class<?> cls3 : C8457oD.g(cls)) {
            try {
                Field field2 = cls3.getField(str);
                if (field == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C11147zE2.B(z2, "Reference to field %s is ambiguous relative to %s; a matching field exists on two or more implemented interfaces.", str, cls);
                field = field2;
            } catch (NoSuchFieldException unused2) {
            }
        }
        return field;
    }

    public static List<Field> g(Class<?> cls, Class<? extends Annotation> cls2) {
        C11147zE2.V(cls2, "annotationCls", new Object[0]);
        List<Field> b = b(cls);
        ArrayList arrayList = new ArrayList();
        for (Field field : b) {
            if (field.getAnnotation(cls2) != null) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    public static Field[] h(Class<?> cls, Class<? extends Annotation> cls2) {
        return (Field[]) g(cls, cls2).toArray(C4206Se.j);
    }

    public static Object i(Object obj, String str) throws IllegalAccessException {
        return j(obj, str, false);
    }

    public static Object j(Object obj, String str, boolean z) throws IllegalAccessException {
        boolean z2;
        C11147zE2.V(obj, "target", new Object[0]);
        Class<?> cls = obj.getClass();
        Field d = d(cls, str, z);
        if (d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C11147zE2.B(z2, "Cannot locate declared field %s.%s", cls, str);
        return p(d, obj, false);
    }

    public static Object k(Class<?> cls, String str) throws IllegalAccessException {
        return l(cls, str, false);
    }

    public static Object l(Class<?> cls, String str, boolean z) throws IllegalAccessException {
        Field d = d(cls, str, z);
        C11147zE2.V(d, "Cannot locate declared field %s.%s", cls.getName(), str);
        return t(d, false);
    }

    public static Object m(Object obj, String str) throws IllegalAccessException {
        return n(obj, str, false);
    }

    public static Object n(Object obj, String str, boolean z) throws IllegalAccessException {
        boolean z2;
        C11147zE2.V(obj, "target", new Object[0]);
        Class<?> cls = obj.getClass();
        Field f = f(cls, str, z);
        if (f != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C11147zE2.B(z2, "Cannot locate field %s on %s", str, cls);
        return p(f, obj, false);
    }

    public static Object o(Field field, Object obj) throws IllegalAccessException {
        return p(field, obj, false);
    }

    public static Object p(Field field, Object obj, boolean z) throws IllegalAccessException {
        C11147zE2.V(field, "field", new Object[0]);
        if (z && !field.isAccessible()) {
            field.setAccessible(true);
        } else {
            AbstractC4608Wh1.l(field);
        }
        return field.get(obj);
    }

    public static Object q(Class<?> cls, String str) throws IllegalAccessException {
        return r(cls, str, false);
    }

    public static Object r(Class<?> cls, String str, boolean z) throws IllegalAccessException {
        Field f = f(cls, str, z);
        C11147zE2.V(f, "Cannot locate field '%s' on %s", str, cls);
        return t(f, false);
    }

    public static Object s(Field field) throws IllegalAccessException {
        return t(field, false);
    }

    public static Object t(Field field, boolean z) throws IllegalAccessException {
        C11147zE2.V(field, "field", new Object[0]);
        C11147zE2.B(Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", field.getName());
        return p(field, null, z);
    }

    public static void u(Field field) {
        v(field, true);
    }

    @Deprecated
    public static void v(Field field, boolean z) {
        boolean z2;
        C11147zE2.V(field, "field", new Object[0]);
        try {
            if (Modifier.isFinal(field.getModifiers())) {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                if (z && !declaredField.isAccessible()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    declaredField.setAccessible(true);
                }
                declaredField.setInt(field, field.getModifiers() & (-17));
                if (z2) {
                    declaredField.setAccessible(false);
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            if (!C3451Kk2.n(HU0.JAVA_12)) {
                return;
            }
            throw new UnsupportedOperationException("In java 12+ final cannot be removed.", e);
        }
    }

    public static void w(Object obj, String str, Object obj2) throws IllegalAccessException {
        x(obj, str, obj2, false);
    }

    public static void x(Object obj, String str, Object obj2, boolean z) throws IllegalAccessException {
        boolean z2;
        C11147zE2.V(obj, "target", new Object[0]);
        Class<?> cls = obj.getClass();
        Field d = d(cls, str, z);
        if (d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C11147zE2.B(z2, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(d, obj, obj2, false);
    }

    public static void y(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        z(cls, str, obj, false);
    }

    public static void z(Class<?> cls, String str, Object obj, boolean z) throws IllegalAccessException {
        Field d = d(cls, str, z);
        C11147zE2.V(d, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(d, null, obj, false);
    }
}
