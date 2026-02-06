package o;

import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Wm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4626Wm<K, V> extends Map<K, V> {
    @InterfaceC6181ey
    @MB
    V J3(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v);

    InterfaceC4626Wm<V, K> m5();

    @Override // java.util.Map
    @InterfaceC6181ey
    @MB
    V put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v);

    @Override // java.util.Map
    void putAll(Map<? extends K, ? extends V> map);

    @Override // o.InterfaceC4626Wm
    Set<V> values();
}
