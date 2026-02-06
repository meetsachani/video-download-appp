package o;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.q51  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8914q51<E> implements OS1<E> {
    public final List<E> X;
    public ListIterator<E> Y;

    public C8914q51(List<E> list) {
        if (list != null) {
            this.X = list;
            b();
            return;
        }
        throw new NullPointerException("The list must not be null");
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        this.Y.add(e);
    }

    public final void b() {
        this.Y = this.X.listIterator();
    }

    public int c() {
        return this.X.size();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return !this.X.isEmpty();
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public boolean hasPrevious() {
        return !this.X.isEmpty();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!this.X.isEmpty()) {
            if (!this.Y.hasNext()) {
                reset();
            }
            return this.Y.next();
        }
        throw new NoSuchElementException("There are no elements for this iterator to loop on");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        if (!this.X.isEmpty()) {
            if (!this.Y.hasNext()) {
                return 0;
            }
            return this.Y.nextIndex();
        }
        throw new NoSuchElementException("There are no elements for this iterator to loop on");
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public E previous() {
        if (!this.X.isEmpty()) {
            if (!this.Y.hasPrevious()) {
                E e = null;
                while (this.Y.hasNext()) {
                    e = this.Y.next();
                }
                this.Y.previous();
                return e;
            }
            return this.Y.previous();
        }
        throw new NoSuchElementException("There are no elements for this iterator to loop on");
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        if (!this.X.isEmpty()) {
            if (!this.Y.hasPrevious()) {
                return this.X.size() - 1;
            }
            return this.Y.previousIndex();
        }
        throw new NoSuchElementException("There are no elements for this iterator to loop on");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        this.Y.remove();
    }

    @Override // o.MS1
    public void reset() {
        b();
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        this.Y.set(e);
    }
}
