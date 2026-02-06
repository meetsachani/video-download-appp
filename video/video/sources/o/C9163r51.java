package o;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.r51  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9163r51 implements PS1 {
    public List X;
    public ListIterator Y;

    public C9163r51(List list) {
        if (list != null) {
            this.X = list;
            reset();
            return;
        }
        throw new NullPointerException("The list must not be null");
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        this.Y.add(obj);
    }

    public int b() {
        return this.X.size();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return !this.X.isEmpty();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return !this.X.isEmpty();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
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

    @Override // java.util.ListIterator
    public Object previous() {
        if (!this.X.isEmpty()) {
            if (!this.Y.hasPrevious()) {
                Object obj = null;
                while (this.Y.hasNext()) {
                    obj = this.Y.next();
                }
                this.Y.previous();
                return obj;
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

    @Override // o.PS1, o.NS1
    public void reset() {
        this.Y = this.X.listIterator();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        this.Y.set(obj);
    }
}
