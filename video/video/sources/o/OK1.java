package o;

import java.util.Map;

/* loaded from: classes4.dex */
public interface OK1<K, V> {
    void clear();

    Object put(K k, V v);

    void putAll(Map<? extends K, ? extends V> map);
}
