package o;

/* renamed from: o.w2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10367w2<K, V> implements InterfaceC9855tw1<K, V> {
    public final InterfaceC9855tw1<K, V> X;

    public C10367w2(InterfaceC9855tw1<K, V> interfaceC9855tw1) {
        if (interfaceC9855tw1 != null) {
            this.X = interfaceC9855tw1;
            return;
        }
        throw new NullPointerException("OrderedMapIterator must not be null");
    }

    public InterfaceC9855tw1<K, V> b() {
        return this.X;
    }

    @Override // o.U71
    public K getKey() {
        return this.X.getKey();
    }

    @Override // o.U71
    public V getValue() {
        return this.X.getValue();
    }

    @Override // o.U71, java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
    public boolean hasPrevious() {
        return this.X.hasPrevious();
    }

    @Override // o.U71, java.util.Iterator
    public K next() {
        return this.X.next();
    }

    @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
    public K previous() {
        return this.X.previous();
    }

    @Override // o.U71, java.util.Iterator
    public void remove() {
        this.X.remove();
    }

    @Override // o.U71
    public V setValue(V v) {
        return this.X.setValue(v);
    }
}
