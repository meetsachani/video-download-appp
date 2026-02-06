package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class I1<K, V> extends AbstractC5951e1<K, V> {
    public transient Map<K, V> X;

    public I1() {
    }

    public Map<K, V> b() {
        return this.X;
    }

    @Override // java.util.Map, o.OK1
    public void clear() {
        b().clear();
    }

    @Override // java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    @Override // java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return b().equals(obj);
    }

    @Override // java.util.Map, o.UC0
    public V get(Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map, o.UC0
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map, o.UC0
    public Set<K> keySet() {
        return b().keySet();
    }

    @Override // java.util.Map, o.OK1
    public V put(K k, V v) {
        return b().put(k, v);
    }

    @Override // java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    @Override // java.util.Map, o.UC0
    public V remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map, o.UC0
    public int size() {
        return b().size();
    }

    public String toString() {
        return b().toString();
    }

    @Override // java.util.Map, o.UC0
    public Collection<V> values() {
        return b().values();
    }

    public I1(Map<K, V> map) {
        if (map != null) {
            this.X = map;
            return;
        }
        throw new NullPointerException("Map must not be null.");
    }
}
