package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: o.er1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6155er1<E> extends AbstractList<E> implements RandomAccess {
    public final ArrayList<E> X;

    public C6155er1(ArrayList<E> arrayList) {
        Objects.requireNonNull(arrayList);
        this.X = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        this.X.add(i, d(e));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.X.contains(obj);
    }

    public final E d(E e) {
        if (e != null) {
            return e;
        }
        throw new NullPointerException("Element must be non-null");
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return this.X.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        return this.X.get(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.X.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.X.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        return this.X.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return this.X.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        return this.X.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        return this.X.set(i, d(e));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.X.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.X.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.X.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.X.toArray(tArr);
    }
}
