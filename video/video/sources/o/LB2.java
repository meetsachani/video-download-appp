package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final class LB2<E> extends AbstractC8417o3<E> implements QA2 {
    private static final long serialVersionUID = -725356885467962424L;

    public LB2(SortedSet<E> sortedSet) {
        super(sortedSet);
    }

    public static <E> SortedSet<E> i(SortedSet<E> sortedSet) {
        if (sortedSet instanceof QA2) {
            return sortedSet;
        }
        return new LB2(sortedSet);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(f());
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

    @Override // o.AbstractC8417o3, java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return i(f().headSet(e));
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return C5994eB2.b(f().iterator());
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
        return i(f().subSet(e, e2));
    }

    @Override // o.AbstractC8417o3, java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return i(f().tailSet(e));
    }
}
