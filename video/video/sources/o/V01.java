package o;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public interface V01<K, V> extends InterfaceC10058um1<K, V> {
    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    boolean equals(@MB Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    /* bridge */ /* synthetic */ default Collection get(@InterfaceC7894ly1 Object obj) {
        return get((V01<K, V>) obj);
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    List<V> get(@InterfaceC7894ly1 K k);

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    List<V> i(@MB Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    /* bridge */ /* synthetic */ default Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((V01<K, V>) obj, iterable);
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    List<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable);

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    Map<K, Collection<V>> l();
}
