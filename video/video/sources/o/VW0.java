package o;

import o.TW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface VW0<T, V> extends TW0<V>, HA0<T, V> {

    /* loaded from: classes3.dex */
    public interface a<T, V> extends TW0.c<V>, HA0<T, V> {
    }

    @Override // o.TW0
    @NotNull
    a<T, V> a();

    V get(T t);

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    Object k(T t);
}
