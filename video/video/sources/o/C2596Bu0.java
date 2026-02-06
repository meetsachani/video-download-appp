package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Bu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2596Bu0<K, V> extends I1<K, V> implements InterfaceC9582sp<K, V>, Serializable {
    private static final long serialVersionUID = 7450927208116179316L;

    public C2596Bu0(Map<K, V> map) {
        super(map);
    }

    public static <K, V> C2596Bu0<K, V> c(Map<K, V> map) {
        return new C2596Bu0<>(map);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void clear() {
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return CB2.h(this.X.entrySet());
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<K> keySet() {
        return CB2.h(this.X.keySet());
    }

    @Override // o.I1, java.util.Map, o.OK1
    public V put(K k, V v) {
        if (this.X.containsKey(k)) {
            return this.X.put(k, v);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        for (K k : map.keySet()) {
            if (!containsKey(k)) {
                throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
            }
        }
        this.X.putAll(map);
    }

    @Override // o.InterfaceC9582sp
    public int q() {
        return size();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // o.InterfaceC9582sp
    public boolean s() {
        return true;
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Collection<V> values() {
        return ZA2.f(this.X.values());
    }
}
