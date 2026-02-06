package o;

import java.util.ListIterator;

/* renamed from: o.u1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9874u1 implements ListIterator {
    public final ListIterator X;

    public C9874u1(ListIterator listIterator) {
        if (listIterator != null) {
            this.X = listIterator;
            return;
        }
        throw new IllegalArgumentException("ListIterator must not be null");
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        this.X.add(obj);
    }

    public ListIterator b() {
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
        this.X.remove();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        this.X.set(obj);
    }
}
