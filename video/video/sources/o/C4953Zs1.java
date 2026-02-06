package o;

import java.util.NoSuchElementException;

/* renamed from: o.Zs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4953Zs1<E> extends C4749Xs1<E> implements OS1<E> {
    public int Z0;

    public C4953Zs1(E... eArr) {
        super(eArr);
        this.Z0 = -1;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("add() method is not supported");
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public boolean hasPrevious() {
        if (this.Y0 > d()) {
            return true;
        }
        return false;
    }

    @Override // o.C4749Xs1, java.util.Iterator
    public E next() {
        if (hasNext()) {
            int i = this.Y0;
            this.Z0 = i;
            E[] eArr = this.X;
            this.Y0 = i + 1;
            return eArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.Y0 - d();
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public E previous() {
        if (hasPrevious()) {
            int i = this.Y0 - 1;
            this.Y0 = i;
            this.Z0 = i;
            return this.X[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return (this.Y0 - d()) - 1;
    }

    @Override // o.C4749Xs1, o.MS1
    public void reset() {
        super.reset();
        this.Z0 = -1;
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        int i = this.Z0;
        if (i != -1) {
            this.X[i] = e;
            return;
        }
        throw new IllegalStateException("must call next() or previous() before a call to set()");
    }

    public C4953Zs1(E[] eArr, int i) {
        super(eArr, i);
        this.Z0 = -1;
    }

    public C4953Zs1(E[] eArr, int i, int i2) {
        super(eArr, i, i2);
        this.Z0 = -1;
    }
}
