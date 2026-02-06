package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.Bd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2528Bd0<K, V> implements U71<K, V>, MS1<K> {
    public final Map<K, V> X;
    public Iterator<Map.Entry<K, V>> Y;
    public boolean Y0 = false;
    public Map.Entry<K, V> Z;

    public C2528Bd0(Map<K, V> map) {
        this.X = map;
        this.Y = map.entrySet().iterator();
    }

    @Override // o.U71
    public K getKey() {
        Map.Entry<K, V> entry = this.Z;
        if (entry != null) {
            return entry.getKey();
        }
        throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
    }

    @Override // o.U71
    public V getValue() {
        Map.Entry<K, V> entry = this.Z;
        if (entry != null) {
            return entry.getValue();
        }
        throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
    }

    @Override // o.U71, java.util.Iterator
    public boolean hasNext() {
        return this.Y.hasNext();
    }

    @Override // o.U71, java.util.Iterator
    public K next() {
        Map.Entry<K, V> next = this.Y.next();
        this.Z = next;
        this.Y0 = true;
        return next.getKey();
    }

    @Override // o.U71, java.util.Iterator
    public void remove() {
        if (this.Y0) {
            this.Y.remove();
            this.Z = null;
            this.Y0 = false;
            return;
        }
        throw new IllegalStateException("Iterator remove() can only be called once after next()");
    }

    @Override // o.MS1
    public void reset() {
        this.Y = this.X.entrySet().iterator();
        this.Z = null;
        this.Y0 = false;
    }

    @Override // o.U71
    public V setValue(V v) {
        Map.Entry<K, V> entry = this.Z;
        if (entry != null) {
            return entry.setValue(v);
        }
        throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
    }

    public String toString() {
        if (this.Z != null) {
            return "MapIterator[" + getKey() + "=" + getValue() + C6566gU0.g;
        }
        return "MapIterator[]";
    }
}
