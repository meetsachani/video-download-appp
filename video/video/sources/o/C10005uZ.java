package o;

import java.util.Map;

/* renamed from: o.uZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10005uZ<K, V> extends AbstractC7419k1<K, V> {
    public C10005uZ() {
        super(null, null);
    }

    @Override // o.AbstractC7419k1
    public K a(K k) {
        if (k != this) {
            return (K) super.a(k);
        }
        throw new IllegalArgumentException("DefaultKeyValue may not contain itself as a key.");
    }

    public Map.Entry<K, V> b() {
        return new EZ(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10005uZ)) {
            return false;
        }
        C10005uZ c10005uZ = (C10005uZ) obj;
        if (getKey() != null ? getKey().equals(c10005uZ.getKey()) : c10005uZ.getKey() == null) {
            if (getValue() != null ? getValue().equals(c10005uZ.getValue()) : c10005uZ.getValue() == null) {
                return true;
            }
        }
        return false;
    }

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
        if (v != this) {
            return (V) super.setValue(v);
        }
        throw new IllegalArgumentException("DefaultKeyValue may not contain itself as a value.");
    }

    public C10005uZ(K k, V v) {
        super(k, v);
    }

    public C10005uZ(JX0<? extends K, ? extends V> jx0) {
        super(jx0.getKey(), jx0.getValue());
    }

    public C10005uZ(Map.Entry<? extends K, ? extends V> entry) {
        super(entry.getKey(), entry.getValue());
    }
}
