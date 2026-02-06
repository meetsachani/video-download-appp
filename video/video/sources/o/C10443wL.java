package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* renamed from: o.wL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10443wL {
    public static final Class<?>[] a = new Class[0];
    public static final Object[] b = new Object[0];

    public static <T> Constructor<T> a(Class<T> cls, Class<?> cls2) {
        return b(cls, new Class[]{cls2});
    }

    public static <T> Constructor<T> b(Class<T> cls, Class<?>[] clsArr) {
        try {
            return c(cls.getConstructor(clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static <T> Constructor<T> c(Constructor<T> constructor) {
        if (constructor == null || !Modifier.isPublic(constructor.getModifiers()) || !Modifier.isPublic(constructor.getDeclaringClass().getModifiers())) {
            return null;
        }
        return constructor;
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        Constructor<?>[] constructors;
        try {
            Constructor<T> constructor = cls.getConstructor(clsArr);
            try {
                constructor.setAccessible(true);
            } catch (SecurityException unused) {
            }
            return constructor;
        } catch (NoSuchMethodException unused2) {
            int length = clsArr.length;
            for (Constructor<?> constructor2 : cls.getConstructors()) {
                Class<?>[] parameterTypes = constructor2.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == length) {
                    int i = 0;
                    while (true) {
                        if (i < length2) {
                            if (!C3250Ij1.B(parameterTypes[i], clsArr[i])) {
                                break;
                            }
                            i++;
                        } else {
                            Constructor<T> c = c(constructor2);
                            if (c != null) {
                                try {
                                    c.setAccessible(true);
                                } catch (SecurityException unused3) {
                                }
                                return c;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public static <T> T e(Class<T> cls, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return (T) f(cls, k(obj));
    }

    public static <T> T f(Class<T> cls, Object[] objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (objArr == null) {
            objArr = b;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return (T) g(cls, objArr, clsArr);
    }

    public static <T> T g(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (clsArr == null) {
            clsArr = a;
        }
        if (objArr == null) {
            objArr = b;
        }
        Constructor d = d(cls, clsArr);
        if (d != null) {
            return (T) d.newInstance(objArr);
        }
        throw new NoSuchMethodException("No such accessible constructor on object: " + cls.getName());
    }

    public static <T> T h(Class<T> cls, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return (T) i(cls, k(obj));
    }

    public static <T> T i(Class<T> cls, Object[] objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (objArr == null) {
            objArr = b;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return (T) j(cls, objArr, clsArr);
    }

    public static <T> T j(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (objArr == null) {
            objArr = b;
        }
        if (clsArr == null) {
            clsArr = a;
        }
        Constructor b2 = b(cls, clsArr);
        if (b2 != null) {
            return (T) b2.newInstance(objArr);
        }
        throw new NoSuchMethodException("No such accessible constructor on object: " + cls.getName());
    }

    public static Object[] k(Object obj) {
        if (obj != null) {
            return new Object[]{obj};
        }
        return null;
    }
}
