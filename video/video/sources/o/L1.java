package o;

import java.util.Map;

/* loaded from: classes4.dex */
public abstract class L1<K, V> extends AbstractC7419k1<K, V> implements Map.Entry<K, V> {
    public L1(K k, V v) {
        super(k, v);
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
        if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
            if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        int i = 0;
        if (getKey() == null) {
            hashCode = 0;
        } else {
            hashCode = getKey().hashCode();
        }
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    @Override // o.AbstractC7419k1, java.util.Map.Entry
    public V setValue(V v) {
        return (V) super.setValue(v);
    }
}
