package o;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/* renamed from: o.ve  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10267ve<E> extends C8560oe<E> implements OS1<E> {
    public int Z0;

    public C10267ve(Object obj) {
        super(obj);
        this.Z0 = -1;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("add() method is not supported");
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public boolean hasPrevious() {
        if (this.Y0 > this.Y) {
            return true;
        }
        return false;
    }

    @Override // o.C8560oe, java.util.Iterator
    public E next() {
        if (hasNext()) {
            int i = this.Y0;
            this.Z0 = i;
            Object obj = this.X;
            this.Y0 = i + 1;
            return (E) Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.Y0 - this.Y;
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public E previous() {
        if (hasPrevious()) {
            int i = this.Y0 - 1;
            this.Y0 = i;
            this.Z0 = i;
            return (E) Array.get(this.X, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return (this.Y0 - this.Y) - 1;
    }

    @Override // o.C8560oe, o.MS1
    public void reset() {
        super.reset();
        this.Z0 = -1;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        int i = this.Z0;
        if (i != -1) {
            Array.set(this.X, i, obj);
            return;
        }
        throw new IllegalStateException("must call next() or previous() before a call to set()");
    }

    public C10267ve(Object obj, int i) {
        super(obj, i);
        this.Z0 = -1;
    }

    public C10267ve(Object obj, int i, int i2) {
        super(obj, i, i2);
        this.Z0 = -1;
    }
}
