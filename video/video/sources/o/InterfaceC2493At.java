package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: o.At  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2493At<R, T> {

    /* renamed from: o.At$a */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public static Type b(int i, ParameterizedType parameterizedType) {
            return C6504gE2.g(i, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return C6504gE2.h(type);
        }

        @InterfaceC10571ws1
        public abstract InterfaceC2493At<?, ?> a(Type type, Annotation[] annotationArr, C8284nU1 c8284nU1);
    }

    T a(InterfaceC11302zt<R> interfaceC11302zt);

    Type b();
}
