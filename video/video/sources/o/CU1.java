package o;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class CU1<E> implements OS1<E> {
    public final List<E> X;
    public ListIterator<E> Y;
    public boolean Z = true;

    public CU1(List<E> list) {
        if (list != null) {
            this.X = list;
            this.Y = list.listIterator(list.size());
            return;
        }
        throw new NullPointerException("List must not be null.");
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        if (this.Z) {
            this.Z = false;
            this.Y.add(e);
            this.Y.previous();
            return;
        }
        throw new IllegalStateException("Cannot add to list until next() or previous() called");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.Y.hasPrevious();
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public boolean hasPrevious() {
        return this.Y.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        E previous = this.Y.previous();
        this.Z = true;
        return previous;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.Y.previousIndex();
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public E previous() {
        E next = this.Y.next();
        this.Z = true;
        return next;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.Y.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (this.Z) {
            this.Y.remove();
            return;
        }
        throw new IllegalStateException("Cannot remove from list until next() or previous() called");
    }

    @Override // o.MS1
    public void reset() {
        List<E> list = this.X;
        this.Y = list.listIterator(list.size());
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        if (this.Z) {
            this.Y.set(e);
            return;
        }
        throw new IllegalStateException("Cannot set to list until next() or previous() called");
    }
}
