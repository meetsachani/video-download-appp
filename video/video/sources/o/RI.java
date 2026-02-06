package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class RI<K, V> extends AbstractC5951e1<K, V> implements Serializable {
    private static final long serialVersionUID = -6096931280583808322L;
    public Map<K, V>[] X;
    public a<K, V> Y;

    /* loaded from: classes4.dex */
    public interface a<K, V> extends Serializable {
        void A3(RI<K, V> ri, Map<K, V> map, Map<K, V> map2, Collection<K> collection);

        void R3(RI<K, V> ri, Map<K, V>[] mapArr, Map<? extends K, ? extends V> map);

        V U4(RI<K, V> ri, Map<K, V>[] mapArr, K k, V v);
    }

    public RI() {
        this(new Map[0], (a) null);
    }

    public synchronized void b(Map<K, V> map) throws IllegalArgumentException {
        if (map != null) {
            try {
                for (int length = this.X.length - 1; length >= 0; length--) {
                    Collection<K> K = C6748hF.K(this.X[length].keySet(), map.keySet());
                    if (K.size() != 0) {
                        a<K, V> aVar = this.Y;
                        if (aVar != null) {
                            aVar.A3(this, this.X[length], map, K);
                        } else {
                            throw new IllegalArgumentException("Key collision adding Map to CompositeMap");
                        }
                    }
                }
                Map<K, V>[] mapArr = this.X;
                int length2 = mapArr.length;
                Map<K, V>[] mapArr2 = new Map[length2 + 1];
                System.arraycopy(mapArr, 0, mapArr2, 0, mapArr.length);
                mapArr2[length2] = map;
                this.X = mapArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized Map<K, V> c(Map<K, V> map) {
        int length = this.X.length;
        for (int i = 0; i < length; i++) {
            if (this.X[i].equals(map)) {
                Map<K, V>[] mapArr = new Map[length - 1];
                System.arraycopy(this.X, 0, mapArr, 0, i);
                System.arraycopy(this.X, i + 1, mapArr, i, (length - i) - 1);
                this.X = mapArr;
                return map;
            }
        }
        return null;
    }

    @Override // java.util.Map, o.OK1
    public void clear() {
        for (int length = this.X.length - 1; length >= 0; length--) {
            this.X[length].clear();
        }
    }

    @Override // java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (this.X[length].containsKey(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (this.X[length].containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public void d(a<K, V> aVar) {
        this.Y = aVar;
    }

    @Override // java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        XI xi = new XI();
        for (int length = this.X.length - 1; length >= 0; length--) {
            xi.d(this.X[length].entrySet());
        }
        return xi;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, o.UC0
    public V get(Object obj) {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (this.X[length].containsKey(obj)) {
                return this.X[length].get(obj);
            }
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += entry.hashCode();
        }
        return i;
    }

    @Override // java.util.Map, o.UC0
    public boolean isEmpty() {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (!this.X[length].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map, o.UC0
    public Set<K> keySet() {
        XI xi = new XI();
        for (int length = this.X.length - 1; length >= 0; length--) {
            xi.d(this.X[length].keySet());
        }
        return xi;
    }

    @Override // java.util.Map, o.OK1
    public V put(K k, V v) {
        a<K, V> aVar = this.Y;
        if (aVar != null) {
            return aVar.U4(this, this.X, k, v);
        }
        throw new UnsupportedOperationException("No mutator specified");
    }

    @Override // java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        a<K, V> aVar = this.Y;
        if (aVar != null) {
            aVar.R3(this, this.X, map);
            return;
        }
        throw new UnsupportedOperationException("No mutator specified");
    }

    @Override // java.util.Map, o.UC0
    public V remove(Object obj) {
        for (int length = this.X.length - 1; length >= 0; length--) {
            if (this.X[length].containsKey(obj)) {
                return this.X[length].remove(obj);
            }
        }
        return null;
    }

    @Override // java.util.Map, o.UC0
    public int size() {
        int i = 0;
        for (int length = this.X.length - 1; length >= 0; length--) {
            i += this.X[length].size();
        }
        return i;
    }

    @Override // java.util.Map, o.UC0
    public Collection<V> values() {
        JI ji = new JI();
        for (int length = this.X.length - 1; length >= 0; length--) {
            ji.d(this.X[length].values());
        }
        return ji;
    }

    public RI(Map<K, V> map, Map<K, V> map2) {
        this(new Map[]{map, map2}, (a) null);
    }

    public RI(Map<K, V> map, Map<K, V> map2, a<K, V> aVar) {
        this(new Map[]{map, map2}, aVar);
    }

    public RI(Map<K, V>... mapArr) {
        this(mapArr, (a) null);
    }

    public RI(Map<K, V>[] mapArr, a<K, V> aVar) {
        this.Y = aVar;
        this.X = new Map[0];
        for (int length = mapArr.length - 1; length >= 0; length--) {
            b(mapArr[length]);
        }
    }
}
