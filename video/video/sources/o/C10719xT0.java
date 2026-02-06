package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: o.xT0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10719xT0 {
    public final Class<?> a;
    @InterfaceC10571ws1
    public final Object b;
    public final Method c;
    public final List<?> d;

    public C10719xT0(Class<?> cls, @InterfaceC10571ws1 Object obj, Method method, List<?> list) {
        this.a = cls;
        this.b = obj;
        this.c = method;
        this.d = Collections.unmodifiableList(list);
    }

    public static <T> C10719xT0 d(Class<T> cls, T t, Method method, List<?> list) {
        Objects.requireNonNull(cls, "service == null");
        Objects.requireNonNull(t, "instance == null");
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new C10719xT0(cls, t, method, new ArrayList(list));
    }

    @Deprecated
    public static C10719xT0 e(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new C10719xT0(method.getDeclaringClass(), null, method, new ArrayList(list));
    }

    public List<?> a() {
        return this.d;
    }

    @InterfaceC10571ws1
    public Object b() {
        return this.b;
    }

    public Method c() {
        return this.c;
    }

    public Class<?> f() {
        return this.a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getName(), this.c.getName(), this.d);
    }
}
