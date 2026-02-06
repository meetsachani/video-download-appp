package o;

import java.util.Map;

/* loaded from: classes4.dex */
public abstract class N1<K, V> implements Map.Entry<K, V>, JX0<K, V> {
    public final Map.Entry<K, V> X;

    public N1(Map.Entry<K, V> entry) {
        if (entry != null) {
            this.X = entry;
            return;
        }
        throw new NullPointerException("Map Entry must not be null.");
    }

    public Map.Entry<K, V> a() {
        return this.X;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.X.equals(obj);
    }

    @Override // java.util.Map.Entry, o.JX0
    public K getKey() {
        return this.X.getKey();
    }

    @Override // java.util.Map.Entry, o.JX0
    public V getValue() {
        return this.X.getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        return this.X.setValue(v);
    }

    public String toString() {
        return this.X.toString();
    }
}
