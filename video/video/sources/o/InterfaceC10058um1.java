package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@L40("Use ImmutableMultimap, HashMultimap, or another implementation")
@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.um1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10058um1<K, V> {
    @InterfaceC6181ey
    boolean B0(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1);

    InterfaceC2467Am1<K> Q();

    void clear();

    boolean containsKey(@DH("K") @MB Object obj);

    boolean containsValue(@DH("V") @MB Object obj);

    @InterfaceC6181ey
    boolean e0(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable);

    boolean equals(@MB Object obj);

    Collection<V> get(@InterfaceC7894ly1 K k);

    int hashCode();

    @InterfaceC6181ey
    Collection<V> i(@DH("K") @MB Object obj);

    boolean isEmpty();

    @InterfaceC6181ey
    Collection<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable);

    Set<K> keySet();

    Map<K, Collection<V>> l();

    @InterfaceC6181ey
    boolean put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v);

    boolean q5(@DH("K") @MB Object obj, @DH("V") @MB Object obj2);

    Collection<Map.Entry<K, V>> r();

    @InterfaceC6181ey
    boolean remove(@DH("K") @MB Object obj, @DH("V") @MB Object obj2);

    int size();

    Collection<V> values();
}
