package o;

/* renamed from: o.zB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11135zB2<K, V> implements InterfaceC9855tw1<K, V>, QA2 {
    public final InterfaceC9855tw1<? extends K, ? extends V> X;

    /* JADX WARN: Multi-variable type inference failed */
    public C11135zB2(InterfaceC9855tw1<K, ? extends V> interfaceC9855tw1) {
        this.X = interfaceC9855tw1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> InterfaceC9855tw1<K, V> b(InterfaceC9855tw1<K, ? extends V> interfaceC9855tw1) {
        if (interfaceC9855tw1 != 0) {
            if (interfaceC9855tw1 instanceof QA2) {
                return interfaceC9855tw1;
            }
            return new C11135zB2(interfaceC9855tw1);
        }
        throw new NullPointerException("OrderedMapIterator must not be null");
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
        throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override // o.U71
    public V setValue(V v) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }
}
