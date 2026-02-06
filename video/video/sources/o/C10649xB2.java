package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.xB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10649xB2<K, V> extends AbstractC9878u2<K, V> implements QA2, Serializable {
    private static final long serialVersionUID = 8136428161720526266L;

    public C10649xB2(InterfaceC9369rw1<? extends K, ? extends V> interfaceC9369rw1) {
        super(interfaceC9369rw1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> InterfaceC9369rw1<K, V> d(InterfaceC9369rw1<? extends K, ? extends V> interfaceC9369rw1) {
        if (interfaceC9369rw1 instanceof QA2) {
            return interfaceC9369rw1;
        }
        return new C10649xB2(interfaceC9369rw1);
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

    @Override // o.AbstractC9878u2, o.AbstractC5951e1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return C11135zB2.b(b().p());
    }
}
