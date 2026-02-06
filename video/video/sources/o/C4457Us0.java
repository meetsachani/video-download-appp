package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.Us0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4457Us0<E> implements ListIterator<E> {
    public ListIterator<? extends E> X;
    public KF1<? super E> Y;
    public E Z;
    public E Z0;
    public boolean Y0 = false;
    public boolean a1 = false;
    public int b1 = 0;

    public C4457Us0() {
    }

    @Override // java.util.ListIterator
    public void add(E e) {
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

    public ListIterator<? extends E> d() {
        return this.X;
    }

    public KF1<? super E> e() {
        return this.Y;
    }

    public void f(ListIterator<? extends E> listIterator) {
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
        if (this.X == null) {
            return false;
        }
        while (this.X.hasNext()) {
            E next = this.X.next();
            if (this.Y.evaluate(next)) {
                this.Z = next;
                this.Y0 = true;
                return true;
            }
        }
        return false;
    }

    public void h(KF1<? super E> kf1) {
        this.Y = kf1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (!this.Y0 && !g()) {
            return false;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (!this.a1 && !i()) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        if (this.Y0) {
            b();
            if (!i()) {
                return false;
            }
            c();
        }
        if (this.X == null) {
            return false;
        }
        while (this.X.hasPrevious()) {
            E previous = this.X.previous();
            if (this.Y.evaluate(previous)) {
                this.Z0 = previous;
                this.a1 = true;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!this.Y0 && !g()) {
            throw new NoSuchElementException();
        }
        this.b1++;
        E e = this.Z;
        b();
        return e;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.b1;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!this.a1 && !i()) {
            throw new NoSuchElementException();
        }
        this.b1--;
        E e = this.Z0;
        c();
        return e;
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
    public void set(E e) {
        throw new UnsupportedOperationException("FilterListIterator.set(Object) is not supported.");
    }

    public C4457Us0(ListIterator<? extends E> listIterator) {
        this.X = listIterator;
    }

    public C4457Us0(ListIterator<? extends E> listIterator, KF1<? super E> kf1) {
        this.X = listIterator;
        this.Y = kf1;
    }

    public C4457Us0(KF1<? super E> kf1) {
        this.Y = kf1;
    }
}
