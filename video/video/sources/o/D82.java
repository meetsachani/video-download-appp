package o;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class D82<E> implements MS1<E> {
    public final boolean X;
    public boolean Y;
    public E Y0;
    public boolean Z;

    public D82(E e) {
        this(e, true);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y && !this.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        if (this.Y && !this.Z) {
            this.Y = false;
            return this.Y0;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.X) {
            if (!this.Z && !this.Y) {
                this.Y0 = null;
                this.Z = true;
                return;
            }
            throw new IllegalStateException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // o.MS1
    public void reset() {
        this.Y = true;
    }

    public D82(E e, boolean z) {
        this.Y = true;
        this.Z = false;
        this.Y0 = e;
        this.X = z;
    }
}
