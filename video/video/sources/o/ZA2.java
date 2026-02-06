package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final class ZA2<E> extends AbstractC8162n0<E> implements QA2 {
    private static final long serialVersionUID = -239892006883819945L;

    public ZA2(Collection<? extends E> collection) {
        super(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Collection<T> f(Collection<? extends T> collection) {
        if (collection instanceof QA2) {
            return collection;
        }
        return new ZA2(collection);
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

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return C5994eB2.b(d().iterator());
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
}
