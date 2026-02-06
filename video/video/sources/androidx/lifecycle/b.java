package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.KZ0;

@Deprecated
/* loaded from: classes.dex */
public final class b {
    public static b c = new b();
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public final Map<Class<?>, a> a = new HashMap();
    public final Map<Class<?>, Boolean> b = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
        public final Map<f.a, List<C0028b>> a = new HashMap();
        public final Map<C0028b, f.a> b;

        public a(Map<C0028b, f.a> map) {
            this.b = map;
            for (Map.Entry<C0028b, f.a> entry : map.entrySet()) {
                f.a value = entry.getValue();
                List<C0028b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void b(List<C0028b> list, KZ0 kz0, f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(kz0, aVar, obj);
                }
            }
        }

        public void a(KZ0 kz0, f.a aVar, Object obj) {
            b(this.a.get(aVar), kz0, aVar, obj);
            b(this.a.get(f.a.ON_ANY), kz0, aVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0028b {
        public final int a;
        public final Method b;

        public C0028b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public void a(KZ0 kz0, f.a aVar, Object obj) {
            try {
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        this.b.invoke(obj, kz0, aVar);
                        return;
                    }
                    this.b.invoke(obj, kz0);
                    return;
                }
                this.b.invoke(obj, null);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0028b)) {
                return false;
            }
            C0028b c0028b = (C0028b) obj;
            if (this.a == c0028b.a && this.b.getName().equals(c0028b.b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i;
        a c2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c2 = c(superclass)) != null) {
            hashMap.putAll(c2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0028b, f.a> entry : c(cls2).b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            l lVar = (l) method.getAnnotation(l.class);
            if (lVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (KZ0.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                f.a value = lVar.value();
                if (parameterTypes.length > 1) {
                    if (f.a.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == f.a.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0028b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = b(cls);
        for (Method method : b) {
            if (((l) method.getAnnotation(l.class)) != null) {
                a(cls, b);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<C0028b, f.a> map, C0028b c0028b, f.a aVar, Class<?> cls) {
        f.a aVar2 = map.get(c0028b);
        if (aVar2 != null && aVar != aVar2) {
            Method method = c0028b.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(c0028b, aVar);
        }
    }
}
