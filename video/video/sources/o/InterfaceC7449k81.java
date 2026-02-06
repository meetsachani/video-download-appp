package o;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: o.k81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC7449k81<T> {
    default void a(InterfaceC7846lm1<Class<?>, Field> interfaceC7846lm1) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    default boolean b() {
        return false;
    }

    void c(C3968Ps c3968Ps) throws IOException, XR;

    void e(Class<? extends T> cls) throws C8027mR;

    String[] f(T t) throws XR;

    T g(String[] strArr) throws C8270nR, PR, CR;

    String[] h(T t) throws PR, CR;

    default void setProfile(String str) {
        throw new UnsupportedOperationException();
    }

    default void d(Locale locale) {
    }
}
