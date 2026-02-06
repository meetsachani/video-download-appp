package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.kP0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7516kP0<T> implements Iterator<T>, JW0 {
    public int X;
    public int Y;
    public boolean Z;

    public AbstractC7516kP0(int i) {
        this.X = i;
    }

    public abstract T b(int i);

    public abstract void c(int i);

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y < this.X) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T b = b(this.Y);
            this.Y++;
            this.Z = true;
            return b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.Z) {
            int i = this.Y - 1;
            this.Y = i;
            c(i);
            this.X--;
            this.Z = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }
}
