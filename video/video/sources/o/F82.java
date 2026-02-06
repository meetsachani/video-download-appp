package o;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class F82<E> implements OS1<E> {
    public E Y0;
    public boolean X = true;
    public boolean Y = false;
    public boolean Z = false;

    public F82(E e) {
        this.Y0 = e;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("add() is not supported by this iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.X && !this.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public boolean hasPrevious() {
        if (!this.X && !this.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (this.X && !this.Z) {
            this.X = false;
            this.Y = true;
            return this.Y0;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return !this.X ? 1 : 0;
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public E previous() {
        if (!this.X && !this.Z) {
            this.X = true;
            return this.Y0;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        if (this.X) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (this.Y && !this.Z) {
            this.Y0 = null;
            this.Z = true;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // o.MS1
    public void reset() {
        this.X = true;
        this.Y = false;
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        if (this.Y && !this.Z) {
            this.Y0 = e;
            return;
        }
        throw new IllegalStateException();
    }
}
