package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class N71<K, V> implements Map.Entry<K, V>, GW0 {
    public final K X;
    public final V Y;

    public N71(K k, V v) {
        this.X = k;
        this.Y = v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.X;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.Y;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
