package o;

import java.lang.reflect.Array;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.we  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10513we extends C8316ne implements ListIterator, PS1 {
    public int Z0;

    public C10513we() {
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

    @Override // o.C8316ne, java.util.Iterator
    public Object next() {
        if (hasNext()) {
            int i = this.Y0;
            this.Z0 = i;
            Object obj = this.X;
            this.Y0 = i + 1;
            return Array.get(obj, i);
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
            return Array.get(this.X, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return (this.Y0 - this.Y) - 1;
    }

    @Override // o.C8316ne, o.NS1
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

    public C10513we(Object obj) {
        super(obj);
        this.Z0 = -1;
    }

    public C10513we(Object obj, int i) {
        super(obj, i);
        this.Z0 = -1;
        this.Y = i;
    }

    public C10513we(Object obj, int i, int i2) {
        super(obj, i, i2);
        this.Z0 = -1;
        this.Y = i;
    }
}
