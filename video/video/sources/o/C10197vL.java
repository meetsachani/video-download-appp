package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* renamed from: o.vL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10197vL {
    public static <T> Constructor<T> a(Class<T> cls, Class<?>... clsArr) {
        C11147zE2.V(cls, "cls", new Object[0]);
        try {
            return b(cls.getConstructor(clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static <T> Constructor<T> b(Constructor<T> constructor) {
        C11147zE2.V(constructor, "ctor", new Object[0]);
        if (AbstractC4608Wh1.g(constructor) && h(constructor.getDeclaringClass())) {
            return constructor;
        }
        return null;
    }

    public static <T> Constructor<T> c(Class<T> cls, Class<?>... clsArr) {
        Constructor<?>[] constructors;
        Constructor<T> b;
        C11147zE2.V(cls, "cls", new Object[0]);
        try {
            Constructor<T> constructor = cls.getConstructor(clsArr);
            AbstractC4608Wh1.l(constructor);
            return constructor;
        } catch (NoSuchMethodException unused) {
            Constructor<T> constructor2 = null;
            for (Constructor<?> constructor3 : cls.getConstructors()) {
                if (AbstractC4608Wh1.h(constructor3, clsArr) && (b = b(constructor3)) != null) {
                    AbstractC4608Wh1.l(b);
                    if (constructor2 == null || AbstractC4608Wh1.a(b, constructor2, clsArr) < 0) {
                        constructor2 = b;
                    }
                }
            }
            return constructor2;
        }
    }

    public static <T> T d(Class<T> cls, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] D2 = C4206Se.D2(objArr);
        return (T) e(cls, D2, C8457oD.Z(D2));
    }

    public static <T> T e(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] D2 = C4206Se.D2(objArr);
        Constructor c = c(cls, C4206Se.y2(clsArr));
        if (c != null) {
            if (c.isVarArgs()) {
                D2 = C3348Jj1.t(D2, c.getParameterTypes());
            }
            return (T) c.newInstance(D2);
        }
        throw new NoSuchMethodException("No such accessible constructor on object: " + cls.getName());
    }

    public static <T> T f(Class<T> cls, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] D2 = C4206Se.D2(objArr);
        return (T) g(cls, D2, C8457oD.Z(D2));
    }

    public static <T> T g(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] D2 = C4206Se.D2(objArr);
        Constructor a = a(cls, C4206Se.y2(clsArr));
        if (a != null) {
            return (T) a.newInstance(D2);
        }
        throw new NoSuchMethodException("No such accessible constructor on object: " + cls.getName());
    }

    public static boolean h(Class<?> cls) {
        while (cls != null) {
            if (!Modifier.isPublic(cls.getModifiers())) {
                return false;
            }
            cls = cls.getEnclosingClass();
        }
        return true;
    }
}
