package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@InterfaceC5359ba0
/* renamed from: o.uv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10095uv2<T> {
    public final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C10664xF1.u(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
