package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.mB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7966mB2<K, V> extends I1<K, V> implements QA2, Serializable {
    private static final long serialVersionUID = 2737023427269031941L;

    public C7966mB2(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        if (map instanceof QA2) {
            return map;
        }
        return new C7966mB2(map);
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
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return C5509cB2.i(super.entrySet());
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<K> keySet() {
        return CB2.h(super.keySet());
    }

    @Override // o.AbstractC5951e1, o.VT0
    public U71<K, V> p() {
        Map<K, V> map = this.X;
        if (map instanceof WT0) {
            return C8939qB2.b(((WT0) map).p());
        }
        return C8939qB2.b(new C2528Bd0(map));
    }

    @Override // o.I1, java.util.Map, o.OK1
    public V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Collection<V> values() {
        return ZA2.f(super.values());
    }
}
