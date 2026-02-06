package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.oC1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8455oC1<E> implements Iterator<E> {
    public final Iterator<? extends E> X;
    public E Y0;
    public boolean Y = false;
    public boolean Z = false;

    public C8455oC1(Iterator<? extends E> it) {
        this.X = it;
    }

    public static <E> C8455oC1<E> d(Iterator<? extends E> it) {
        if (it != null) {
            if (it instanceof C8455oC1) {
                return (C8455oC1) it;
            }
            return new C8455oC1<>(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public E b() {
        c();
        if (!this.Y) {
            return this.Y0;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        if (!this.Y && !this.Z) {
            if (this.X.hasNext()) {
                this.Y0 = this.X.next();
                this.Z = true;
                return;
            }
            this.Y = true;
            this.Y0 = null;
            this.Z = false;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y) {
            return false;
        }
        if (!this.Z && !this.X.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        E next;
        if (hasNext()) {
            if (this.Z) {
                next = this.Y0;
            } else {
                next = this.X.next();
            }
            this.Y0 = null;
            this.Z = false;
            return next;
        }
        throw new NoSuchElementException();
    }

    public E peek() {
        c();
        if (this.Y) {
            return null;
        }
        return this.Y0;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.Z) {
            this.X.remove();
            return;
        }
        throw new IllegalStateException("peek() or element() called before remove()");
    }
}
