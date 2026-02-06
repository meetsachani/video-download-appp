package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.rp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9339rp<E> implements Iterator<E> {
    public final Iterator<? extends E> X;
    public final long Y;
    public long Y0;
    public final long Z;

    public C9339rp(Iterator<? extends E> it, long j, long j2) {
        if (it != null) {
            if (j >= 0) {
                if (j2 >= 0) {
                    this.X = it;
                    this.Y = j;
                    this.Z = j2;
                    this.Y0 = 0L;
                    c();
                    return;
                }
                throw new IllegalArgumentException("Max parameter must not be negative.");
            }
            throw new IllegalArgumentException("Offset parameter must not be negative.");
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public final boolean b() {
        if ((this.Y0 - this.Y) + 1 > this.Z) {
            return false;
        }
        return true;
    }

    public final void c() {
        while (this.Y0 < this.Y && this.X.hasNext()) {
            this.X.next();
            this.Y0++;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!b()) {
            return false;
        }
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        if (b()) {
            E next = this.X.next();
            this.Y0++;
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.Y0 > this.Y) {
            this.X.remove();
            return;
        }
        throw new IllegalStateException("remove() can not be called before calling next()");
    }
}
