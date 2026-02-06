package o;

import java.util.ListIterator;

/* renamed from: o.kB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7462kB2<E> implements ListIterator<E>, QA2 {
    public final ListIterator<? extends E> X;

    public C7462kB2(ListIterator<? extends E> listIterator) {
        this.X = listIterator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ListIterator<E> b(ListIterator<? extends E> listIterator) {
        if (listIterator != 0) {
            if (listIterator instanceof QA2) {
                return listIterator;
            }
            return new C7462kB2(listIterator);
        }
        throw new NullPointerException("ListIterator must not be null");
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("add() is not supported");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.X.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        return this.X.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.X.nextIndex();
    }

    @Override // java.util.ListIterator
    public E previous() {
        return this.X.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.X.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("set() is not supported");
    }
}
