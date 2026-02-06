package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

/* renamed from: o.hB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6735hB2<E> extends T2<E> implements QA2 {
    private static final long serialVersionUID = 6595182819922443652L;

    public C6735hB2(List<? extends E> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> List<E> h(List<? extends E> list) {
        if (list instanceof QA2) {
            return list;
        }
        return new C6735hB2(list);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(Object obj) {
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

    @Override // o.AbstractC9145r1, java.util.List
    public ListIterator<E> listIterator() {
        return C7462kB2.b(d().listIterator());
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

    @Override // o.AbstractC9145r1, java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9145r1, java.util.List
    public List<E> subList(int i, int i2) {
        return new C6735hB2(d().subList(i, i2));
    }

    @Override // o.AbstractC9145r1, java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9145r1, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9145r1, java.util.List
    public ListIterator<E> listIterator(int i) {
        return C7462kB2.b(d().listIterator(i));
    }

    @Override // o.AbstractC9145r1, java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException();
    }
}
