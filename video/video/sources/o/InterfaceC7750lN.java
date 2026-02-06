package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: o.lN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7750lN<F, T> {

    /* renamed from: o.lN$a */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public static Type a(int i, ParameterizedType parameterizedType) {
            return C6504gE2.g(i, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return C6504gE2.h(type);
        }

        @InterfaceC10571ws1
        public InterfaceC7750lN<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C8284nU1 c8284nU1) {
            return null;
        }

        @InterfaceC10571ws1
        public InterfaceC7750lN<ResponseBody, ?> d(Type type, Annotation[] annotationArr, C8284nU1 c8284nU1) {
            return null;
        }

        @InterfaceC10571ws1
        public InterfaceC7750lN<?, String> e(Type type, Annotation[] annotationArr, C8284nU1 c8284nU1) {
            return null;
        }
    }

    @InterfaceC10571ws1
    T a(F f) throws IOException;
}
