package o;

import java.lang.reflect.Proxy;
import java.nio.channels.Channel;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class SD {
    public static final Class<?>[] a = new Class[0];

    public static Set<Class<?>> a(Class<?> cls, Set<Class<?>> set) {
        Class<?>[] interfaces;
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (VD.c(cls2) && set.add(cls2)) {
                    a(cls2, set);
                }
            }
            cls = cls.getSuperclass();
        }
        return set;
    }

    public static <T extends Channel> T b(T t) {
        Objects.requireNonNull(t, C5287bG2.q2);
        if (Proxy.isProxyClass(t.getClass()) && (Proxy.getInvocationHandler(t) instanceof VD)) {
            return t;
        }
        Set<Class<?>> a2 = a(t.getClass(), new LinkedHashSet());
        return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), a2.isEmpty() ? new Class[]{Channel.class} : (Class[]) a2.toArray(a), new VD(t));
    }
}
