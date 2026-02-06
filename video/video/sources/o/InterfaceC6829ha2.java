package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.ha2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6829ha2<K, V> extends InterfaceC8660p22<K, V> {
    @MB
    Comparator<? super V> U();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8660p22, o.InterfaceC10058um1, o.InterfaceC8660p22
    /* bridge */ /* synthetic */ default Collection get(@InterfaceC7894ly1 Object obj) {
        return get((InterfaceC6829ha2<K, V>) obj);
    }

    @Override // o.InterfaceC8660p22, o.InterfaceC10058um1, o.InterfaceC8660p22
    SortedSet<V> get(@InterfaceC7894ly1 K k);

    @Override // o.InterfaceC8660p22
    @InterfaceC6181ey
    SortedSet<V> i(@MB Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8660p22
    @InterfaceC6181ey
    /* bridge */ /* synthetic */ default Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((InterfaceC6829ha2<K, V>) obj, iterable);
    }

    @Override // o.InterfaceC8660p22
    @InterfaceC6181ey
    SortedSet<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable);

    @Override // o.InterfaceC8660p22
    Map<K, Collection<V>> l();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8660p22
    /* bridge */ /* synthetic */ default Set get(@InterfaceC7894ly1 Object obj) {
        return get((InterfaceC6829ha2<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8660p22, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    /* bridge */ /* synthetic */ default Set j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((InterfaceC6829ha2<K, V>) obj, iterable);
    }
}
