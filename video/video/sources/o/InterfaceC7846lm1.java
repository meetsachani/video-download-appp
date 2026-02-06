package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.lm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7846lm1<K, V> {
    InterfaceC6135em1<K> Q();

    void clear();

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    boolean e0(K k, Iterable<? extends V> iterable);

    boolean f0(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1);

    boolean g0(Object obj, Object obj2);

    Collection<V> get(K k);

    boolean isEmpty();

    Set<K> keySet();

    Map<K, Collection<V>> l();

    U71<K, V> p();

    boolean p0(Object obj, Object obj2);

    boolean put(K k, V v);

    boolean putAll(Map<? extends K, ? extends V> map);

    Collection<Map.Entry<K, V>> r();

    Collection<V> remove(Object obj);

    int size();

    Collection<V> values();
}
