package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.hu2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6909hu2<T> implements Iterator<T>, GW0 {
    public final HA0<T, Iterator<T>> X;
    public final List<Iterator<T>> Y = new ArrayList();
    public Iterator<? extends T> Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C6909hu2(Iterator<? extends T> it, HA0<? super T, ? extends Iterator<? extends T>> ha0) {
        this.X = ha0;
        this.Z = it;
    }

    public final void b(T t) {
        Iterator it = (Iterator<T>) this.X.invoke(t);
        if (it != null && it.hasNext()) {
            this.Y.add(this.Z);
            this.Z = it;
            return;
        }
        while (!this.Z.hasNext() && !this.Y.isEmpty()) {
            this.Z = (Iterator) C10662xF.s3(this.Y);
            C9444sF.O0(this.Y);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Z.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.Z.next();
        b(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
