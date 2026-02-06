package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* renamed from: o.n0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8162n0<E> implements Collection<E>, Serializable {
    private static final long serialVersionUID = 6249888059822088500L;
    public Collection<E> X;

    public AbstractC8162n0() {
    }

    @Override // java.util.Collection, java.util.List
    public boolean add(E e) {
        return d().add(e);
    }

    @Override // java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        return d().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        d().clear();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return d().contains(obj);
    }

    @Override // java.util.Collection, o.InterfaceC2958Fk
    public boolean containsAll(Collection<?> collection) {
        return d().containsAll(collection);
    }

    public Collection<E> d() {
        return this.X;
    }

    public void e(Collection<E> collection) {
        this.X = collection;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return d().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return d().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return d().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        return d().removeIf(predicate);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return d().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return d().size();
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        return d().toArray();
    }

    public String toString() {
        return d().toString();
    }

    public AbstractC8162n0(Collection<E> collection) {
        if (collection != null) {
            this.X = collection;
            return;
        }
        throw new NullPointerException("Collection must not be null.");
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d().toArray(tArr);
    }
}
