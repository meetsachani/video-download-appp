package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.h1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6692h1<T> implements Iterator<T>, GW0 {
    public int X;
    @Nullable
    public T Y;

    public abstract void b();

    public final void c() {
        this.X = 2;
    }

    public final void d(T t) {
        this.Y = t;
        this.X = 1;
    }

    public final boolean e() {
        this.X = 3;
        b();
        if (this.X == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return e();
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.X;
        if (i == 1) {
            this.X = 0;
            return this.Y;
        } else if (i != 2 && e()) {
            this.X = 0;
            return this.Y;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
