package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final class CB2<E> extends V2<E> implements QA2 {
    private static final long serialVersionUID = 6499119872185240161L;

    public CB2(Set<? extends E> set) {
        super(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Set<E> h(Set<? extends E> set) {
        if (set instanceof QA2) {
            return set;
        }
        return new CB2(set);
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
