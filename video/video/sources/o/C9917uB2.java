package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.function.Predicate;

/* renamed from: o.uB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9917uB2<E> extends AbstractC8657p2<E> implements QA2 {
    private static final long serialVersionUID = 20150528;

    public C9917uB2(NavigableSet<E> navigableSet) {
        super(navigableSet);
    }

    public static <E> NavigableSet<E> j(NavigableSet<E> navigableSet) {
        if (navigableSet instanceof QA2) {
            return navigableSet;
        }
        return new C9917uB2(navigableSet);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(h());
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8657p2, java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return C5994eB2.b(h().descendingIterator());
    }

    @Override // o.AbstractC8657p2, java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return j(h().descendingSet());
    }

    @Override // o.AbstractC8417o3, java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return LB2.i(h().headSet(e));
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return C5994eB2.b(h().iterator());
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8417o3, java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return LB2.i(h().subSet(e, e2));
    }

    @Override // o.AbstractC8417o3, java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return LB2.i(h().tailSet(e));
    }

    @Override // o.AbstractC8657p2, java.util.NavigableSet
    public NavigableSet<E> headSet(E e, boolean z) {
        return j(h().headSet(e, z));
    }

    @Override // o.AbstractC8657p2, java.util.NavigableSet
    public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return j(h().subSet(e, z, e2, z2));
    }

    @Override // o.AbstractC8657p2, java.util.NavigableSet
    public NavigableSet<E> tailSet(E e, boolean z) {
        return j(h().tailSet(e, z));
    }
}
