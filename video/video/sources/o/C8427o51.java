package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.o51  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8427o51<E> implements MS1<E> {
    public final Collection<? extends E> X;
    public Iterator<? extends E> Y;

    public C8427o51(Collection<? extends E> collection) {
        if (collection != null) {
            this.X = collection;
            reset();
            return;
        }
        throw new NullPointerException("The collection must not be null");
    }

    public int b() {
        return this.X.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.X.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        if (this.X.size() != 0) {
            if (!this.Y.hasNext()) {
                reset();
            }
            return this.Y.next();
        }
        throw new NoSuchElementException("There are no elements for this iterator to loop on");
    }

    @Override // java.util.Iterator
    public void remove() {
        this.Y.remove();
    }

    @Override // o.MS1
    public void reset() {
        this.Y = this.X.iterator();
    }
}
