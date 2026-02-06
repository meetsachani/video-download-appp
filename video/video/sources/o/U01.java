package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class U01 implements PS1 {
    public static final String Z0 = "ListIteratorWrapper does not support optional operations of ListIterator.";
    public final Iterator X;
    public final List Y = new ArrayList();
    public int Z = 0;
    public int Y0 = 0;

    public U01(Iterator it) {
        if (it != null) {
            this.X = it;
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    @Override // java.util.ListIterator
    public void add(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("ListIteratorWrapper does not support optional operations of ListIterator.");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.Z == this.Y0) {
            return this.X.hasNext();
        }
        return true;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.Z == 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() throws NoSuchElementException {
        int i = this.Z;
        if (i < this.Y0) {
            this.Z = i + 1;
            return this.Y.get(i);
        }
        Object next = this.X.next();
        this.Y.add(next);
        this.Z++;
        this.Y0++;
        return next;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.Z;
    }

    @Override // java.util.ListIterator
    public Object previous() throws NoSuchElementException {
        int i = this.Z;
        if (i != 0) {
            int i2 = i - 1;
            this.Z = i2;
            return this.Y.get(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.Z - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("ListIteratorWrapper does not support optional operations of ListIterator.");
    }

    @Override // o.PS1, o.NS1
    public void reset() {
        this.Z = 0;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("ListIteratorWrapper does not support optional operations of ListIterator.");
    }
}
