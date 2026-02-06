package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.p22  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8660p22<K, V> extends InterfaceC10058um1<K, V> {
    @Override // 
    boolean equals(@MB Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    /* bridge */ /* synthetic */ default Collection get(@InterfaceC7894ly1 Object obj) {
        return get((InterfaceC8660p22<K, V>) obj);
    }

    @Override // 
    Set<V> get(@InterfaceC7894ly1 K k);

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    Set<V> i(@MB Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    @InterfaceC6181ey
    /* bridge */ /* synthetic */ default Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((InterfaceC8660p22<K, V>) obj, iterable);
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    Set<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable);

    @Override // 
    Map<K, Collection<V>> l();

    @Override // 
    Set<Map.Entry<K, V>> r();
}
