package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final class BB2<E> extends J2<E> implements QA2 {
    private static final long serialVersionUID = 1832948656215393357L;

    public BB2(Queue<? extends E> queue) {
        super(queue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Queue<E> h(Queue<? extends E> queue) {
        if (queue instanceof QA2) {
            return queue;
        }
        return new BB2(queue);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(d());
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return C5994eB2.b(d().iterator());
    }

    @Override // o.J2, java.util.Queue
    public boolean offer(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // o.J2, java.util.Queue
    public E poll() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8162n0, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.J2, java.util.Queue
    public E remove() {
        throw new UnsupportedOperationException();
    }
}
