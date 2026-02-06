package o;

import java.util.ListIterator;

/* renamed from: o.jB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7219jB2 implements ListIterator, RA2 {
    public ListIterator X;

    public C7219jB2(ListIterator listIterator) {
        this.X = listIterator;
    }

    public static ListIterator b(ListIterator listIterator) {
        if (listIterator != null) {
            if (listIterator instanceof RA2) {
                return listIterator;
            }
            return new C7219jB2(listIterator);
        }
        throw new IllegalArgumentException("ListIterator must not be null");
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
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
    public Object next() {
        return this.X.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.X.nextIndex();
    }

    @Override // java.util.ListIterator
    public Object previous() {
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
    public void set(Object obj) {
        throw new UnsupportedOperationException("set() is not supported");
    }
}
