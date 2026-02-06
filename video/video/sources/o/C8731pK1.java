package o;

import java.util.ListIterator;

/* renamed from: o.pK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8731pK1 implements ListIterator {
    public ListIterator X;

    public C8731pK1() {
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        b().add(obj);
    }

    public ListIterator b() {
        return this.X;
    }

    public void c(ListIterator listIterator) {
        this.X = listIterator;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return b().hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        return b().next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b().remove();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        b().set(obj);
    }

    public C8731pK1(ListIterator listIterator) {
        this.X = listIterator;
    }
}
