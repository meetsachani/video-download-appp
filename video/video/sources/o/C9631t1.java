package o;

import java.util.ListIterator;

/* renamed from: o.t1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9631t1<E> implements ListIterator<E> {
    public final ListIterator<E> X;

    public C9631t1(ListIterator<E> listIterator) {
        if (listIterator != null) {
            this.X = listIterator;
            return;
        }
        throw new NullPointerException("ListIterator must not be null");
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        this.X.add(e);
    }

    public ListIterator<E> b() {
        return this.X;
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
        this.X.remove();
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        this.X.set(e);
    }
}
