package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public interface UC0<K, V> {
    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Set<Map.Entry<K, V>> entrySet();

    V get(Object obj);

    boolean isEmpty();

    Set<K> keySet();

    V remove(Object obj);

    int size();

    Collection<V> values();
}
