package o;

import java.util.Iterator;

/* renamed from: o.eB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5994eB2<E> implements Iterator<E>, QA2 {
    public final Iterator<? extends E> X;

    public C5994eB2(Iterator<? extends E> it) {
        this.X = it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Iterator<E> b(Iterator<? extends E> it) {
        if (it != 0) {
            if (it instanceof QA2) {
                return it;
            }
            return new C5994eB2(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.X.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
