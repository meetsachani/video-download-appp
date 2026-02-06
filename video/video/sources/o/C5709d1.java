package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.d1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5709d1<K, V> implements VT0<K, V> {
    public transient Map<K, V> X;

    public C5709d1(Map<K, V> map) {
        if (map != null) {
            this.X = map;
            return;
        }
        throw new NullPointerException("Map must not be null.");
    }

    public Map<K, V> a() {
        return this.X;
    }

    @Override // o.UC0
    public boolean containsKey(Object obj) {
        return a().containsKey(obj);
    }

    @Override // o.UC0
    public boolean containsValue(Object obj) {
        return a().containsValue(obj);
    }

    @Override // o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return a().entrySet();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return a().equals(obj);
    }

    @Override // o.UC0
    public V get(Object obj) {
        return a().get(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // o.UC0
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // o.UC0
    public Set<K> keySet() {
        return a().keySet();
    }

    @Override // o.VT0
    public U71<K, V> p() {
        return new C2724Dd0(entrySet());
    }

    @Override // o.UC0
    public V remove(Object obj) {
        return a().remove(obj);
    }

    @Override // o.UC0
    public int size() {
        return a().size();
    }

    public String toString() {
        return a().toString();
    }

    @Override // o.UC0
    public Collection<V> values() {
        return a().values();
    }

    public C5709d1() {
    }
}
