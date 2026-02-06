package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: o.Wh1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4608Wh1 {
    public static final int a = 7;
    public static final Class<?>[] b = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    public static int a(Constructor<?> constructor, Constructor<?> constructor2, Class<?>[] clsArr) {
        return c(a.e(constructor), a.e(constructor2), clsArr);
    }

    public static int b(Method method, Method method2, Class<?>[] clsArr) {
        return c(a.f(method), a.f(method2), clsArr);
    }

    public static int c(a aVar, a aVar2, Class<?>[] clsArr) {
        return Float.compare(f(clsArr, aVar), f(clsArr, aVar2));
    }

    public static float d(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return e(cls, cls2);
        }
        float f = 0.0f;
        while (true) {
            if (cls != null && !cls2.equals(cls)) {
                if (cls2.isInterface() && C8457oD.P(cls, cls2)) {
                    f += 0.25f;
                    break;
                }
                f += 1.0f;
                cls = cls.getSuperclass();
            } else {
                break;
            }
        }
        if (cls == null) {
            return f + 1.5f;
        }
        return f;
    }

    public static float e(Class<?> cls, Class<?> cls2) {
        float f;
        if (cls == null) {
            return 1.5f;
        }
        if (!cls.isPrimitive()) {
            cls = C8457oD.b0(cls);
            f = 0.1f;
        } else {
            f = 0.0f;
        }
        int i = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = b;
            if (i >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i]) {
                f += 0.1f;
                if (i < clsArr.length - 1) {
                    cls = clsArr[i + 1];
                }
            }
            i++;
        }
        return f;
    }

    public static float f(Class<?>[] clsArr, a aVar) {
        boolean z;
        float d;
        Class<?>[] c = aVar.c();
        boolean d2 = aVar.d();
        int length = c.length;
        if (d2) {
            length--;
        }
        long j = length;
        if (clsArr.length < j) {
            return Float.MAX_VALUE;
        }
        boolean z2 = false;
        float f = 0.0f;
        for (int i = 0; i < j; i++) {
            f += d(clsArr[i], c[i]);
        }
        if (d2) {
            if (clsArr.length < c.length) {
                z = true;
            } else {
                z = false;
            }
            if (clsArr.length == c.length && clsArr[clsArr.length - 1] != null && clsArr[clsArr.length - 1].isArray()) {
                z2 = true;
            }
            Class<?> componentType = c[c.length - 1].getComponentType();
            if (z) {
                d = d(componentType, Object.class);
            } else if (z2) {
                d = d(clsArr[clsArr.length - 1].getComponentType(), componentType);
            } else {
                for (int length2 = c.length - 1; length2 < clsArr.length; length2++) {
                    f += d(clsArr[length2], componentType) + 0.001f;
                }
            }
            return f + d + 0.001f;
        }
        return f;
    }

    public static boolean g(Member member) {
        if (member != null && Modifier.isPublic(member.getModifiers()) && !member.isSynthetic()) {
            return true;
        }
        return false;
    }

    public static boolean h(Constructor<?> constructor, Class<?>[] clsArr) {
        return i(a.e(constructor), clsArr);
    }

    public static boolean i(a aVar, Class<?>[] clsArr) {
        Class<?>[] c = aVar.c();
        if (C8457oD.S(clsArr, c, true)) {
            return true;
        }
        if (!aVar.d()) {
            return false;
        }
        int i = 0;
        while (i < c.length - 1 && i < clsArr.length) {
            if (!C8457oD.Q(clsArr[i], c[i], true)) {
                return false;
            }
            i++;
        }
        Class<?> componentType = c[c.length - 1].getComponentType();
        while (i < clsArr.length) {
            if (!C8457oD.Q(clsArr[i], componentType, true)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean j(Method method, Class<?>[] clsArr) {
        return i(a.f(method), clsArr);
    }

    public static boolean k(int i) {
        if ((i & 7) == 0) {
            return true;
        }
        return false;
    }

    public static boolean l(AccessibleObject accessibleObject) {
        if (accessibleObject != null && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && k(member.getDeclaringClass().getModifiers())) {
                try {
                    accessibleObject.setAccessible(true);
                    return true;
                } catch (SecurityException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: o.Wh1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public final Class<?>[] a;
        public final boolean b;

        public a(Method method) {
            this.a = method.getParameterTypes();
            this.b = method.isVarArgs();
        }

        public static a e(Constructor<?> constructor) {
            return new a(constructor);
        }

        public static a f(Method method) {
            return new a(method);
        }

        public Class<?>[] c() {
            return this.a;
        }

        public boolean d() {
            return this.b;
        }

        public a(Constructor<?> constructor) {
            this.a = constructor.getParameterTypes();
            this.b = constructor.isVarArgs();
        }
    }
}
