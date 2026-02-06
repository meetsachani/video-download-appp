package o;

import java.util.Iterator;

/* renamed from: o.a92  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5016a92<E> extends AbstractC6935i1<E> {
    public final long Y;
    public long Z;

    public C5016a92(Iterator<E> it, long j) {
        super(it);
        if (j >= 0) {
            this.Y = j;
            this.Z = 0L;
            c();
            return;
        }
        throw new IllegalArgumentException("Offset parameter must not be negative.");
    }

    private void c() {
        while (this.Z < this.Y && hasNext()) {
            next();
        }
    }

    @Override // o.AbstractC6935i1, java.util.Iterator
    public E next() {
        E e = (E) super.next();
        this.Z++;
        return e;
    }

    @Override // o.C3, java.util.Iterator
    public void remove() {
        if (this.Z > this.Y) {
            super.remove();
            return;
        }
        throw new IllegalStateException("remove() can not be called before calling next()");
    }
}
