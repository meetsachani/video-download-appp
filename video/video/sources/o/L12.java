package o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public abstract class L12<T> {
    public static <T> L12<T> b(C8284nU1 c8284nU1, Class<?> cls, Method method) {
        C6802hS1 b = C6802hS1.b(c8284nU1, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!C6504gE2.j(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return DI0.f(c8284nU1, method, b);
            }
            throw C6504gE2.n(method, "Service methods cannot return void.", new Object[0]);
        }
        throw C6504gE2.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    @InterfaceC10571ws1
    public abstract T a(Object obj, Object[] objArr);
}
