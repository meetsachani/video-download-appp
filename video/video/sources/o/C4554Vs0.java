package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.Vs0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4554Vs0 implements ListIterator {
    public ListIterator X;
    public JF1 Y;
    public Object Z;
    public Object Z0;
    public boolean Y0 = false;
    public boolean a1 = false;
    public int b1 = 0;

    public C4554Vs0() {
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("FilterListIterator.add(Object) is not supported.");
    }

    public final void b() {
        this.Z = null;
        this.Y0 = false;
    }

    public final void c() {
        this.Z0 = null;
        this.a1 = false;
    }

    public ListIterator d() {
        return this.X;
    }

    public JF1 e() {
        return this.Y;
    }

    public void f(ListIterator listIterator) {
        this.X = listIterator;
    }

    public final boolean g() {
        if (this.a1) {
            c();
            if (!g()) {
                return false;
            }
            b();
        }
        while (this.X.hasNext()) {
            Object next = this.X.next();
            if (this.Y.evaluate(next)) {
                this.Z = next;
                this.Y0 = true;
                return true;
            }
        }
        return false;
    }

    public void h(JF1 jf1) {
        this.Y = jf1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.Y0) {
            return true;
        }
        return g();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.a1) {
            return true;
        }
        return i();
    }

    public final boolean i() {
        if (this.Y0) {
            b();
            if (!i()) {
                return false;
            }
            c();
        }
        while (this.X.hasPrevious()) {
            Object previous = this.X.previous();
            if (this.Y.evaluate(previous)) {
                this.Z0 = previous;
                this.a1 = true;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!this.Y0 && !g()) {
            throw new NoSuchElementException();
        }
        this.b1++;
        Object obj = this.Z;
        b();
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.b1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!this.a1 && !i()) {
            throw new NoSuchElementException();
        }
        this.b1--;
        Object obj = this.Z0;
        c();
        return obj;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.b1 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("FilterListIterator.remove() is not supported.");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("FilterListIterator.set(Object) is not supported.");
    }

    public C4554Vs0(ListIterator listIterator) {
        this.X = listIterator;
    }

    public C4554Vs0(ListIterator listIterator, JF1 jf1) {
        this.X = listIterator;
        this.Y = jf1;
    }

    public C4554Vs0(JF1 jf1) {
        this.Y = jf1;
    }
}
