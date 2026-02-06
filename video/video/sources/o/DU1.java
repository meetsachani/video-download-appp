package o;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class DU1 implements PS1 {
    public final List X;
    public ListIterator Y;
    public boolean Z = true;

    public DU1(List list) {
        this.X = list;
        this.Y = list.listIterator(list.size());
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        if (this.Z) {
            this.Z = false;
            this.Y.add(obj);
            this.Y.previous();
            return;
        }
        throw new IllegalStateException("Cannot add to list until next() or previous() called");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.Y.hasPrevious();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.Y.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        Object previous = this.Y.previous();
        this.Z = true;
        return previous;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.Y.previousIndex();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        Object next = this.Y.next();
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

    @Override // o.PS1, o.NS1
    public void reset() {
        List list = this.X;
        this.Y = list.listIterator(list.size());
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        if (this.Z) {
            this.Y.set(obj);
            return;
        }
        throw new IllegalStateException("Cannot set to list until next() or previous() called");
    }
}
