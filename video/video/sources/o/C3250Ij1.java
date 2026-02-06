package o;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.Ij1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3250Ij1 {
    public static boolean a = false;
    public static boolean b = true;
    public static final Class<?>[] c = new Class[0];
    public static final Object[] d = new Object[0];
    public static final Map<a, Reference<Method>> e = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: o.Ij1$a */
    /* loaded from: classes4.dex */
    public static class a {
        public final Class<?> a;
        public final String b;
        public final Class<?>[] c;
        public final boolean d;
        public final int e;

        public a(Class<?> cls, String str, Class<?>[] clsArr, boolean z) {
            if (cls != null) {
                if (str != null) {
                    clsArr = clsArr == null ? C3250Ij1.c : clsArr;
                    this.a = cls;
                    this.b = str;
                    this.c = clsArr;
                    this.d = z;
                    this.e = str.length();
                    return;
                }
                throw new IllegalArgumentException("Method Name cannot be null");
            }
            throw new IllegalArgumentException("Class cannot be null");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.d != aVar.d || !this.b.equals(aVar.b) || !this.a.equals(aVar.a) || !Arrays.equals(this.c, aVar.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.e;
        }
    }

    public static Object A(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (clsArr == null) {
            clsArr = c;
        }
        if (objArr == null) {
            objArr = d;
        }
        Method k = k(cls, str, clsArr);
        if (k != null) {
            return k.invoke(null, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }

    public static final boolean B(Class<?> cls, Class<?> cls2) {
        Class<?> n;
        if (cls.isAssignableFrom(cls2)) {
            return true;
        }
        if (cls.isPrimitive() && (n = n(cls)) != null) {
            return n.equals(cls2);
        }
        return false;
    }

    public static synchronized void C(boolean z) {
        synchronized (C3250Ij1.class) {
            b = z;
            if (!z) {
                c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r2.charAt(2) == '3') goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void D(Method method) {
        String property;
        try {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
        } catch (SecurityException e2) {
            J31 q = U31.q(C3250Ij1.class);
            if (!a) {
                try {
                    property = System.getProperty("java.specification.version");
                } catch (SecurityException unused) {
                }
                if (property.charAt(0) == '1') {
                    if (property.charAt(2) != '0' && property.charAt(2) != '1' && property.charAt(2) != '2') {
                    }
                    q.q("Current Security Manager restricts use of workarounds for reflection bugs  in pre-1.4 JVMs.");
                }
                a = true;
            }
            q.l("Cannot setAccessible on method. Therefore cannot use jvm access bug workaround.", e2);
        }
    }

    public static Object[] E(Object obj) {
        if (obj != null) {
            return new Object[]{obj};
        }
        return null;
    }

    public static Class<?> F(Class<?> cls) {
        Class<?> n;
        if (cls.isPrimitive() && (n = n(cls)) != null) {
            return n;
        }
        return cls;
    }

    public static void b(a aVar, Method method) {
        if (b && method != null) {
            e.put(aVar, new WeakReference(method));
        }
    }

    public static synchronized int c() {
        int size;
        synchronized (C3250Ij1.class) {
            Map<a, Reference<Method>> map = e;
            size = map.size();
            map.clear();
        }
        return size;
    }

    public static Method d(Class<?> cls, String str, Class<?> cls2) {
        return e(cls, str, new Class[]{cls2});
    }

    public static Method e(Class<?> cls, String str, Class<?>[] clsArr) {
        try {
            a aVar = new a(cls, str, clsArr, true);
            Method j = j(aVar);
            if (j != null) {
                return j;
            }
            Method f = f(cls, cls.getMethod(str, clsArr));
            b(aVar, f);
            return f;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method f(Class<?> cls, Method method) {
        boolean equals;
        if (method == null || !Modifier.isPublic(method.getModifiers())) {
            return null;
        }
        if (cls == null) {
            cls = method.getDeclaringClass();
            equals = true;
        } else {
            equals = cls.equals(method.getDeclaringClass());
            if (!method.getDeclaringClass().isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls.getName() + " is not assignable from " + method.getDeclaringClass().getName());
            }
        }
        if (Modifier.isPublic(cls.getModifiers())) {
            if (!equals && !Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                D(method);
            }
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method h = h(cls, name, parameterTypes);
        if (h == null) {
            return i(cls, name, parameterTypes);
        }
        return h;
    }

    public static Method g(Method method) {
        if (method == null) {
            return null;
        }
        return f(method.getDeclaringClass(), method);
    }

    public static Method h(Class<?> cls, String str, Class<?>[] clsArr) {
        Method method = null;
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        method = interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                    }
                    if (method != null) {
                        return method;
                    }
                    method = h(interfaces[i], str, clsArr);
                    if (method != null) {
                        return method;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static Method i(Class<?> cls, String str, Class<?>[] clsArr) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static Method j(a aVar) {
        Reference<Method> reference;
        if (b && (reference = e.get(aVar)) != null) {
            return reference.get();
        }
        return null;
    }

    public static Method k(Class<?> cls, String str, Class<?>[] clsArr) {
        String str2 = str;
        J31 q = U31.q(C3250Ij1.class);
        if (q.f()) {
            q.r("Matching name=" + str2 + " on " + cls);
        }
        int i = 0;
        a aVar = new a(cls, str2, clsArr, false);
        try {
            Method j = j(aVar);
            if (j != null) {
                return j;
            }
            Method method = cls.getMethod(str, clsArr);
            if (q.f()) {
                q.r("Found straight match: " + method);
                q.r("isPublic:" + Modifier.isPublic(method.getModifiers()));
            }
            D(method);
            b(aVar, method);
            return method;
        } catch (NoSuchMethodException unused) {
            int length = clsArr.length;
            Method[] methods = cls.getMethods();
            int length2 = methods.length;
            Method method2 = null;
            float f = Float.MAX_VALUE;
            int i2 = 0;
            while (i2 < length2) {
                Method method3 = methods[i2];
                if (method3.getName().equals(str2)) {
                    if (q.f()) {
                        q.r("Found matching name:");
                        q.r(method3);
                    }
                    Class<?>[] parameterTypes = method3.getParameterTypes();
                    int length3 = parameterTypes.length;
                    if (length3 == length) {
                        int i3 = i;
                        while (true) {
                            if (i3 < length3) {
                                if (q.f()) {
                                    q.r("Param=" + clsArr[i3].getName());
                                    q.r("Method=" + parameterTypes[i3].getName());
                                }
                                if (!B(parameterTypes[i3], clsArr[i3])) {
                                    if (q.f()) {
                                        q.r(parameterTypes[i3] + " is not assignable from " + clsArr[i3]);
                                    }
                                } else {
                                    i3++;
                                }
                            } else {
                                Method f2 = f(cls, method3);
                                if (f2 != null) {
                                    if (q.f()) {
                                        q.r(f2 + " accessible version of " + method3);
                                    }
                                    D(f2);
                                    float o2 = o(clsArr, f2.getParameterTypes());
                                    if (o2 < f) {
                                        method2 = f2;
                                        f = o2;
                                    }
                                }
                                q.r("Couldn't find accessible method.");
                            }
                        }
                    }
                }
                i2++;
                str2 = str;
                i = 0;
            }
            if (method2 != null) {
                b(aVar, method2);
            } else {
                q.r("No match found.");
            }
            return method2;
        }
    }

    public static float l(Class<?> cls, Class<?> cls2) {
        Class<?> n;
        float f = 0.0f;
        while (cls != null && !cls2.equals(cls)) {
            if ((cls2.isPrimitive() && (n = n(cls2)) != null && n.equals(cls)) || (cls2.isInterface() && B(cls2, cls))) {
                f += 0.25f;
                break;
            }
            f += 1.0f;
            cls = cls.getSuperclass();
        }
        if (cls == null) {
            return f + 1.5f;
        }
        return f;
    }

    public static Class<?> m(Class<?> cls) {
        if (Boolean.class.equals(cls)) {
            return Boolean.TYPE;
        }
        if (Float.class.equals(cls)) {
            return Float.TYPE;
        }
        if (Long.class.equals(cls)) {
            return Long.TYPE;
        }
        if (Integer.class.equals(cls)) {
            return Integer.TYPE;
        }
        if (Short.class.equals(cls)) {
            return Short.TYPE;
        }
        if (Byte.class.equals(cls)) {
            return Byte.TYPE;
        }
        if (Double.class.equals(cls)) {
            return Double.TYPE;
        }
        if (Character.class.equals(cls)) {
            return Character.TYPE;
        }
        J31 q = U31.q(C3250Ij1.class);
        if (q.c()) {
            q.a("Not a known primitive wrapper class: " + cls);
            return null;
        }
        return null;
    }

    public static Class<?> n(Class<?> cls) {
        if (Boolean.TYPE.equals(cls)) {
            return Boolean.class;
        }
        if (Float.TYPE.equals(cls)) {
            return Float.class;
        }
        if (Long.TYPE.equals(cls)) {
            return Long.class;
        }
        if (Integer.TYPE.equals(cls)) {
            return Integer.class;
        }
        if (Short.TYPE.equals(cls)) {
            return Short.class;
        }
        if (Byte.TYPE.equals(cls)) {
            return Byte.class;
        }
        if (Double.TYPE.equals(cls)) {
            return Double.class;
        }
        if (Character.TYPE.equals(cls)) {
            return Character.class;
        }
        return null;
    }

    public static float o(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f = 0.0f;
        for (int i = 0; i < clsArr.length; i++) {
            f += l(clsArr[i], clsArr2[i]);
        }
        return f;
    }

    public static Object p(Object obj, String str, Object obj2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return q(obj, str, E(obj2));
    }

    public static Object q(Object obj, String str, Object[] objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = d;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return r(obj, str, objArr, clsArr);
    }

    public static Object r(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = d;
        }
        if (clsArr == null) {
            clsArr = c;
        }
        Method e2 = e(obj.getClass(), str, clsArr);
        if (e2 != null) {
            return e2.invoke(obj, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    public static Object s(Class<?> cls, String str, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return t(cls, str, E(obj));
    }

    public static Object t(Class<?> cls, String str, Object[] objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = d;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return u(cls, str, objArr, clsArr);
    }

    public static Object u(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = d;
        }
        if (clsArr == null) {
            clsArr = c;
        }
        Method e2 = e(cls, str, clsArr);
        if (e2 != null) {
            return e2.invoke(null, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }

    public static Object v(Object obj, String str, Object obj2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return w(obj, str, E(obj2));
    }

    public static Object w(Object obj, String str, Object[] objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = d;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return x(obj, str, objArr, clsArr);
    }

    public static Object x(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (clsArr == null) {
            clsArr = c;
        }
        if (objArr == null) {
            objArr = d;
        }
        Method k = k(obj.getClass(), str, clsArr);
        if (k != null) {
            return k.invoke(obj, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    public static Object y(Class<?> cls, String str, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return z(cls, str, E(obj));
    }

    public static Object z(Class<?> cls, String str, Object[] objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = d;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return A(cls, str, objArr, clsArr);
    }
}
