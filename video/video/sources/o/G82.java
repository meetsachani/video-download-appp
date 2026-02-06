package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class G82 implements ListIterator, PS1 {
    public Object Y0;
    public boolean X = true;
    public boolean Y = false;
    public boolean Z = false;

    public G82(Object obj) {
        this.Y0 = obj;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("add() is not supported by this iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.X && !this.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (!this.X && !this.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
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

    @Override // java.util.ListIterator
    public Object previous() {
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

    @Override // o.PS1, o.NS1
    public void reset() {
        this.X = true;
        this.Y = false;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        if (this.Y && !this.Z) {
            this.Y0 = obj;
            return;
        }
        throw new IllegalStateException();
    }
}
