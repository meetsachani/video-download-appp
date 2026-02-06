package o;

/* renamed from: o.qB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8939qB2<K, V> implements U71<K, V>, QA2 {
    public final U71<? extends K, ? extends V> X;

    public C8939qB2(U71<? extends K, ? extends V> u71) {
        this.X = u71;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> U71<K, V> b(U71<? extends K, ? extends V> u71) {
        if (u71 != 0) {
            if (u71 instanceof QA2) {
                return u71;
            }
            return new C8939qB2(u71);
        }
        throw new NullPointerException("MapIterator must not be null");
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

    @Override // o.U71, java.util.Iterator
    public K next() {
        return this.X.next();
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
