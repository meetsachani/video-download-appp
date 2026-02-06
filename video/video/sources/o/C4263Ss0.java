package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.Ss0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4263Ss0<E> implements Iterator<E> {
    public Iterator<? extends E> X;
    public KF1<? super E> Y;
    public boolean Y0 = false;
    public E Z;

    public C4263Ss0() {
    }

    public Iterator<? extends E> b() {
        return this.X;
    }

    public KF1<? super E> c() {
        return this.Y;
    }

    public void d(Iterator<? extends E> it) {
        this.X = it;
        this.Z = null;
        this.Y0 = false;
    }

    public final boolean e() {
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

    public void f(KF1<? super E> kf1) {
        this.Y = kf1;
        this.Z = null;
        this.Y0 = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.Y0 && !e()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.Y0 && !e()) {
            throw new NoSuchElementException();
        }
        this.Y0 = false;
        return this.Z;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.Y0) {
            this.X.remove();
            return;
        }
        throw new IllegalStateException("remove() cannot be called");
    }

    public C4263Ss0(Iterator<? extends E> it) {
        this.X = it;
    }

    public C4263Ss0(Iterator<? extends E> it, KF1<? super E> kf1) {
        this.X = it;
        this.Y = kf1;
    }
}
