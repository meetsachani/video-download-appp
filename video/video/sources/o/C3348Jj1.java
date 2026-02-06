package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import o.C8457oD;

/* renamed from: o.Jj1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3348Jj1 {
    public static final Comparator<Method> a = Comparator.comparing(new C3054Gj1());

    public static Object A(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = C4206Se.D2(objArr);
        return B(obj, str, D2, C8457oD.Z(D2));
    }

    public static Object B(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return E(obj, false, str, objArr, clsArr);
    }

    public static Object C(Object obj, boolean z, String str) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return E(obj, z, str, C4206Se.r, null);
    }

    public static Object D(Object obj, boolean z, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = C4206Se.D2(objArr);
        return E(obj, z, str, D2, C8457oD.Z(D2));
    }

    public static Object E(Object obj, boolean z, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method m;
        String str2;
        Class<?>[] y2 = C4206Se.y2(clsArr);
        Object[] D2 = C4206Se.D2(objArr);
        if (z) {
            m = n(obj.getClass(), str, y2);
            if (m != null && !m.isAccessible()) {
                m.setAccessible(true);
            }
            str2 = "No such method: ";
        } else {
            m = m(obj.getClass(), str, y2);
            str2 = "No such accessible method: ";
        }
        if (m != null) {
            return m.invoke(obj, H(m, D2));
        }
        throw new NoSuchMethodException(str2 + str + "() on object: " + obj.getClass().getName());
    }

    public static Object F(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = C4206Se.D2(objArr);
        return G(cls, str, D2, C8457oD.Z(D2));
    }

    public static Object G(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = C4206Se.D2(objArr);
        Method m = m(cls, str, C4206Se.y2(clsArr));
        if (m != null) {
            return m.invoke(null, H(m, D2));
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }

    public static Object[] H(Method method, Object[] objArr) {
        if (method.isVarArgs()) {
            return t(objArr, method.getParameterTypes());
        }
        return objArr;
    }

    public static /* synthetic */ List a(Integer num) {
        return new ArrayList();
    }

    public static int f(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (!C8457oD.S(clsArr, clsArr2, true)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class<?> cls = clsArr[i2];
            Class<?> cls2 = clsArr2[i2];
            if (cls != null && !cls.equals(cls2)) {
                if (C8457oD.Q(cls, cls2, true) && !C8457oD.Q(cls, cls2, false)) {
                    i++;
                } else {
                    i += 2;
                }
            }
        }
        return i;
    }

    public static Method g(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return h(cls.getMethod(str, clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method h(Method method) {
        if (!AbstractC4608Wh1.g(method)) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method i = i(declaringClass, name, parameterTypes);
        if (i == null) {
            return j(declaringClass, name, parameterTypes);
        }
        return i;
    }

    public static Method i(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?>[] interfaces;
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (Modifier.isPublic(cls2.getModifiers())) {
                    try {
                        return cls2.getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method i = i(cls2, str, clsArr);
                        if (i != null) {
                            return i;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static Method j(Class<?> cls, String str, Class<?>... clsArr) {
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

    public static List<Class<?>> k(Class<?> cls) {
        Class<?> cls2;
        int i;
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<Class<?>> i2 = C8457oD.i(cls);
        List<Class<?>> g = C8457oD.g(cls);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= g.size() && i4 >= i2.size()) {
                return arrayList;
            }
            if (i3 >= g.size()) {
                i = i4 + 1;
                cls2 = i2.get(i4);
            } else if (i4 < i2.size() && i3 >= i4 && i4 < i3) {
                i = i4 + 1;
                cls2 = i2.get(i4);
            } else {
                int i5 = i4;
                cls2 = g.get(i3);
                i3++;
                i = i5;
            }
            arrayList.add(cls2);
            i4 = i;
        }
    }

    public static <A extends Annotation> A l(Method method, Class<A> cls, boolean z, boolean z2) {
        Method m;
        C11147zE2.V(method, "method", new Object[0]);
        C11147zE2.V(cls, "annotationCls", new Object[0]);
        if (!z2 && !AbstractC4608Wh1.g(method)) {
            return null;
        }
        A a2 = (A) method.getAnnotation(cls);
        if (a2 == null && z) {
            for (Class<?> cls2 : k(method.getDeclaringClass())) {
                if (z2) {
                    m = n(cls2, method.getName(), method.getParameterTypes());
                } else {
                    m = m(cls2, method.getName(), method.getParameterTypes());
                }
                if (m != null && (a2 = (A) m.getAnnotation(cls)) != null) {
                    break;
                }
            }
        }
        return a2;
    }

    public static Method m(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?>[] parameterTypes;
        String name;
        String name2;
        try {
            Method method = cls.getMethod(str, clsArr);
            AbstractC4608Wh1.l(method);
            return method;
        } catch (NoSuchMethodException unused) {
            Method[] methods = cls.getMethods();
            ArrayList<Method> arrayList = new ArrayList();
            for (Method method2 : methods) {
                if (method2.getName().equals(str) && AbstractC4608Wh1.j(method2, clsArr)) {
                    arrayList.add(method2);
                }
            }
            arrayList.sort(a);
            Method method3 = null;
            for (Method method4 : arrayList) {
                Method h = h(method4);
                if (h != null && (method3 == null || AbstractC4608Wh1.b(h, method3, clsArr) < 0)) {
                    method3 = h;
                }
            }
            if (method3 != null) {
                AbstractC4608Wh1.l(method3);
            }
            if (method3 != null && method3.isVarArgs() && method3.getParameterTypes().length > 0 && clsArr.length > 0) {
                String name3 = C8457oD.W(method3.getParameterTypes()[parameterTypes.length - 1].getComponentType()).getName();
                Class<?> cls2 = clsArr[clsArr.length - 1];
                if (cls2 == null) {
                    name = null;
                } else {
                    name = cls2.getName();
                }
                if (cls2 == null) {
                    name2 = null;
                } else {
                    name2 = cls2.getSuperclass().getName();
                }
                if (name != null && name2 != null && !name3.equals(name) && !name3.equals(name2)) {
                    return null;
                }
            }
            return method3;
        }
    }

    public static Method n(Class<?> cls, final String str, final Class<?>... clsArr) {
        C11147zE2.V(cls, "cls", new Object[0]);
        C11147zE2.L(str, "methodName", new Object[0]);
        final List<Method> list = (List) Arrays.stream(cls.getDeclaredMethods()).filter(new Predicate() { // from class: o.yj1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean equals;
                equals = ((Method) obj).getName().equals(str);
                return equals;
            }
        }).collect(Collectors.toList());
        Stream filter = C8457oD.i(cls).stream().map(new Function() { // from class: o.zj1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Class) obj).getDeclaredMethods();
            }
        }).flatMap(new Function() { // from class: o.Aj1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Arrays.stream((Method[]) obj);
            }
        }).filter(new Predicate() { // from class: o.Bj1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean equals;
                equals = ((Method) obj).getName().equals(str);
                return equals;
            }
        });
        list.getClass();
        filter.forEach(new Consumer() { // from class: o.Cj1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                list.add((Method) obj);
            }
        });
        for (Method method : list) {
            if (Arrays.deepEquals(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        final TreeMap treeMap = new TreeMap();
        list.stream().filter(new Predicate() { // from class: o.Dj1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean S;
                S = C8457oD.S(clsArr, ((Method) obj).getParameterTypes(), true);
                return S;
            }
        }).forEach(new Consumer() { // from class: o.Ej1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((List) treeMap.computeIfAbsent(Integer.valueOf(C3348Jj1.f(clsArr, r3.getParameterTypes())), new Function() { // from class: o.Hj1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return C3348Jj1.a((Integer) obj2);
                    }
                })).add((Method) obj);
            }
        });
        if (treeMap.isEmpty()) {
            return null;
        }
        List list2 = (List) treeMap.values().iterator().next();
        if (list2.size() == 1) {
            return (Method) list2.get(0);
        }
        throw new IllegalStateException(String.format("Found multiple candidates for method %s on class %s : %s", str + ((String) Arrays.stream(clsArr).map(new Function() { // from class: o.Fj1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Class) obj);
            }
        }).collect(Collectors.joining(",", C9811tl1.c, C9811tl1.d))), cls.getName(), list2.stream().map(new C3054Gj1()).collect(Collectors.joining(",", C6566gU0.f, C6566gU0.g))));
    }

    public static List<Method> o(Class<?> cls, Class<? extends Annotation> cls2) {
        return p(cls, cls2, false, false);
    }

    public static List<Method> p(Class<?> cls, Class<? extends Annotation> cls2, boolean z, boolean z2) {
        List<Class> arrayList;
        Method[] methods;
        C11147zE2.V(cls, "cls", new Object[0]);
        C11147zE2.V(cls2, "annotationCls", new Object[0]);
        if (z) {
            arrayList = k(cls);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(0, cls);
        ArrayList arrayList2 = new ArrayList();
        for (Class cls3 : arrayList) {
            if (z2) {
                methods = cls3.getDeclaredMethods();
            } else {
                methods = cls3.getMethods();
            }
            for (Method method : methods) {
                if (method.getAnnotation(cls2) != null) {
                    arrayList2.add(method);
                }
            }
        }
        return arrayList2;
    }

    public static Method[] q(Class<?> cls, Class<? extends Annotation> cls2) {
        return r(cls, cls2, false, false);
    }

    public static Method[] r(Class<?> cls, Class<? extends Annotation> cls2, boolean z, boolean z2) {
        return (Method[]) p(cls, cls2, z, z2).toArray(C4206Se.q);
    }

    public static Set<Method> s(Method method, C8457oD.a aVar) {
        C11147zE2.U(method);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> declaringClass = method.getDeclaringClass();
        Iterator<Class<?>> it = C8457oD.O(declaringClass, aVar).iterator();
        it.next();
        while (it.hasNext()) {
            Method m = m(it.next(), method.getName(), parameterTypes);
            if (m != null) {
                if (Arrays.equals(m.getParameterTypes(), parameterTypes)) {
                    linkedHashSet.add(m);
                } else {
                    Map<TypeVariable<?>, Type> D = Uv2.D(declaringClass, m.getDeclaringClass());
                    int i = 0;
                    while (true) {
                        if (i < parameterTypes.length) {
                            if (!Uv2.m(Uv2.d0(D, method.getGenericParameterTypes()[i]), Uv2.d0(D, m.getGenericParameterTypes()[i]))) {
                                break;
                            }
                            i++;
                        } else {
                            linkedHashSet.add(m);
                            break;
                        }
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static Object[] t(Object[] objArr, Class<?>[] clsArr) {
        if (objArr.length == clsArr.length && (objArr[objArr.length - 1] == null || objArr[objArr.length - 1].getClass().equals(clsArr[clsArr.length - 1]))) {
            return objArr;
        }
        Object[] objArr2 = new Object[clsArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, clsArr.length - 1);
        Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
        int length = (objArr.length - clsArr.length) + 1;
        Object newInstance = Array.newInstance(C8457oD.W(componentType), length);
        System.arraycopy(objArr, clsArr.length - 1, newInstance, 0, length);
        if (componentType.isPrimitive()) {
            newInstance = C4206Se.B5(newInstance);
        }
        objArr2[clsArr.length - 1] = newInstance;
        return objArr2;
    }

    public static Object u(Object obj, String str) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return w(obj, str, C4206Se.r, null);
    }

    public static Object v(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = C4206Se.D2(objArr);
        return w(obj, str, D2, C8457oD.Z(D2));
    }

    public static Object w(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = C4206Se.D2(objArr);
        Method g = g(obj.getClass(), str, C4206Se.y2(clsArr));
        if (g != null) {
            return g.invoke(obj, D2);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    public static Object x(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = C4206Se.D2(objArr);
        return y(cls, str, D2, C8457oD.Z(D2));
    }

    public static Object y(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = C4206Se.D2(objArr);
        Method g = g(cls, str, C4206Se.y2(clsArr));
        if (g != null) {
            return g.invoke(null, D2);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }

    public static Object z(Object obj, String str) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return B(obj, str, C4206Se.r, null);
    }
}
