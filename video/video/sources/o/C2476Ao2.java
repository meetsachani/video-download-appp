package o;

import java.io.Serializable;
import java.util.Map;

/* renamed from: o.Ao2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2476Ao2<K, V> implements Map.Entry<K, V>, JX0<K, V>, Serializable {
    private static final long serialVersionUID = -8453869361373831205L;
    public final Map<K, V> X;
    public final K Y;

    public C2476Ao2(Map<K, V> map, K k) {
        this.X = map;
        this.Y = k;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V value = getValue();
        K k = this.Y;
        if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
            if (value != null ? value.equals(entry.getValue()) : entry.getValue() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry, o.JX0
    public K getKey() {
        return this.Y;
    }

    @Override // java.util.Map.Entry, o.JX0
    public V getValue() {
        return this.X.get(this.Y);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        V value = getValue();
        int i = 0;
        if (getKey() == null) {
            hashCode = 0;
        } else {
            hashCode = getKey().hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        if (v != this) {
            return this.X.put(this.Y, v);
        }
        throw new IllegalArgumentException("Cannot set value to this map entry");
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
