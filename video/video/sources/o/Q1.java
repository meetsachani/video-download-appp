package o;

/* loaded from: classes4.dex */
public class Q1<K, V> implements U71<K, V> {
    public final U71<K, V> X;

    public Q1(U71<K, V> u71) {
        if (u71 != null) {
            this.X = u71;
            return;
        }
        throw new NullPointerException("MapIterator must not be null");
    }

    public U71<K, V> b() {
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

    @Override // o.U71, java.util.Iterator
    public K next() {
        return this.X.next();
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
