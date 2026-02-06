package o;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class C3<I, O> implements Iterator<O> {
    public final Iterator<I> X;

    public C3(Iterator<I> it) {
        if (it != null) {
            this.X = it;
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public Iterator<I> b() {
        return this.X;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.X.remove();
    }
}
