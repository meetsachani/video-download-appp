package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.at1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5193at1 extends C4846Ys1 implements ListIterator, PS1 {
    public int Z0;

    public C5193at1() {
        this.Z0 = -1;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("add() method is not supported");
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.Y0 > this.Y) {
            return true;
        }
        return false;
    }

    @Override // o.C4846Ys1, java.util.Iterator
    public Object next() {
        if (hasNext()) {
            int i = this.Y0;
            this.Z0 = i;
            Object[] objArr = this.X;
            this.Y0 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.Y0 - this.Y;
    }

    @Override // java.util.ListIterator
    public Object previous() {
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
        return (this.Y0 - this.Y) - 1;
    }

    @Override // o.C4846Ys1, o.NS1
    public void reset() {
        super.reset();
        this.Z0 = -1;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        int i = this.Z0;
        if (i != -1) {
            this.X[i] = obj;
            return;
        }
        throw new IllegalStateException("must call next() or previous() before a call to set()");
    }

    public C5193at1(Object[] objArr) {
        super(objArr);
        this.Z0 = -1;
    }

    public C5193at1(Object[] objArr, int i) {
        super(objArr, i);
        this.Z0 = -1;
    }

    public C5193at1(Object[] objArr, int i, int i2) {
        super(objArr, i, i2);
        this.Z0 = -1;
    }
}
