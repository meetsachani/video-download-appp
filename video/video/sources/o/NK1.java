package o;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class NK1<E> implements Iterator<E> {
    public final Iterator<? extends E> X;
    public final Deque<E> Y = new ArrayDeque();

    public NK1(Iterator<? extends E> it) {
        this.X = it;
    }

    public static <E> NK1<E> c(Iterator<? extends E> it) {
        if (it != null) {
            if (it instanceof NK1) {
                return (NK1) it;
            }
            return new NK1<>(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public void b(E e) {
        this.Y.push(e);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y.isEmpty() && !this.X.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.Y.isEmpty()) {
            return this.Y.pop();
        }
        return this.X.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
