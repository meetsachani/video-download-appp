package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class J1 implements Map {
    public transient Map X;

    public J1() {
    }

    public Map V() {
        return this.X;
    }

    @Override // java.util.Map
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.X.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.X.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.X.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.X.keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.X.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.X.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.X.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.X.size();
    }

    public String toString() {
        return this.X.toString();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.X.values();
    }

    public J1(Map map) {
        if (map != null) {
            this.X = map;
            return;
        }
        throw new IllegalArgumentException("Map must not be null");
    }
}
