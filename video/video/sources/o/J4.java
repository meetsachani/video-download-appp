package o;

import java.lang.reflect.InvocationTargetException;

@FunctionalInterface
/* loaded from: classes3.dex */
public interface J4<T, R> {
    R invoke(T t) throws IllegalAccessException, InvocationTargetException;
}
