package o;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Dd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2724Dd0<K, V> implements U71<K, V>, MS1<K> {
    public Set<Map.Entry<K, V>> X;
    public transient Iterator<Map.Entry<K, V>> Y;
    public transient Map.Entry<K, V> Z;

    public C2724Dd0(Set<Map.Entry<K, V>> set) {
        this.X = set;
        reset();
    }

    public synchronized Map.Entry<K, V> b() {
        Map.Entry<K, V> entry;
        entry = this.Z;
        if (entry == null) {
            throw new IllegalStateException();
        }
        return entry;
    }

    @Override // o.U71
    public K getKey() {
        return b().getKey();
    }

    @Override // o.U71
    public V getValue() {
        return b().getValue();
    }

    @Override // o.U71, java.util.Iterator
    public boolean hasNext() {
        return this.Y.hasNext();
    }

    @Override // o.U71, java.util.Iterator
    public K next() {
        this.Z = this.Y.next();
        return getKey();
    }

    @Override // o.U71, java.util.Iterator
    public void remove() {
        this.Y.remove();
        this.Z = null;
    }

    @Override // o.MS1
    public synchronized void reset() {
        this.Y = this.X.iterator();
    }

    @Override // o.U71
    public V setValue(V v) {
        return b().setValue(v);
    }
}
