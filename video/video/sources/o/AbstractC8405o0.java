package o;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.o0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8405o0 implements Collection {
    public Collection X;

    public AbstractC8405o0() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.X.add(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        return this.X.addAll(collection);
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.X.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.X.containsAll(collection);
    }

    public Collection d() {
        return this.X;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.X.equals(obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.X.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.X.remove(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return this.X.removeAll(collection);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        return this.X.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return this.X.size();
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        return this.X.toArray();
    }

    public String toString() {
        return this.X.toString();
    }

    public AbstractC8405o0(Collection collection) {
        if (collection != null) {
            this.X = collection;
            return;
        }
        throw new IllegalArgumentException("Collection must not be null");
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        return this.X.toArray(objArr);
    }
}
