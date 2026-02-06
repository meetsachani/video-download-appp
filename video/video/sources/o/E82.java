package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class E82 implements Iterator, NS1 {
    public final boolean X;
    public boolean Y;
    public Object Y0;
    public boolean Z;

    public E82(Object obj) {
        this(obj, true);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y && !this.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
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

    @Override // o.NS1
    public void reset() {
        this.Y = true;
    }

    public E82(Object obj, boolean z) {
        this.Y = true;
        this.Z = false;
        this.Y0 = obj;
        this.X = z;
    }
}
