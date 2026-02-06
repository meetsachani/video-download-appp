package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@InterfaceC5116aa0
@InterfaceC11149zF0
/* renamed from: o.rH1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9211rH1 {
    public static final Map<Class<?>, Class<?>> a;
    public static final Map<Class<?>, Class<?>> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        a = Collections.unmodifiableMap(linkedHashMap);
        b = Collections.unmodifiableMap(linkedHashMap2);
    }

    public static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static Set<Class<?>> b() {
        return a.keySet();
    }

    public static Set<Class<?>> c() {
        return b.keySet();
    }

    public static boolean d(Class<?> cls) {
        return b.containsKey(C10664xF1.E(cls));
    }

    public static <T> Class<T> e(Class<T> cls) {
        C10664xF1.E(cls);
        Class<T> cls2 = (Class<T>) b.get(cls);
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }

    public static <T> Class<T> f(Class<T> cls) {
        C10664xF1.E(cls);
        Class<T> cls2 = (Class<T>) a.get(cls);
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }
}
