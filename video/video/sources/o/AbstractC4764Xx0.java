package o;

import java.util.Deque;
import java.util.Iterator;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.Xx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4764Xx0<E> extends AbstractC2706Cy0<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(@InterfaceC7894ly1 E e) {
        Y5().addFirst(e);
    }

    @Override // java.util.Deque
    public void addLast(@InterfaceC7894ly1 E e) {
        Y5().addLast(e);
    }

    @Override // o.AbstractC2706Cy0
    /* renamed from: c6 */
    public abstract Deque<E> Y5();

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return Y5().descendingIterator();
    }

    @Override // java.util.Deque
    @InterfaceC7894ly1
    public E getFirst() {
        return Y5().getFirst();
    }

    @Override // java.util.Deque
    @InterfaceC7894ly1
    public E getLast() {
        return Y5().getLast();
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    public boolean offerFirst(@InterfaceC7894ly1 E e) {
        return Y5().offerFirst(e);
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    public boolean offerLast(@InterfaceC7894ly1 E e) {
        return Y5().offerLast(e);
    }

    @Override // java.util.Deque
    @MB
    public E peekFirst() {
        return Y5().peekFirst();
    }

    @Override // java.util.Deque
    @MB
    public E peekLast() {
        return Y5().peekLast();
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    @MB
    public E pollFirst() {
        return Y5().pollFirst();
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    @MB
    public E pollLast() {
        return Y5().pollLast();
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    @InterfaceC7894ly1
    public E pop() {
        return Y5().pop();
    }

    @Override // java.util.Deque
    public void push(@InterfaceC7894ly1 E e) {
        Y5().push(e);
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    @InterfaceC7894ly1
    public E removeFirst() {
        return Y5().removeFirst();
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    public boolean removeFirstOccurrence(@MB Object obj) {
        return Y5().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    @InterfaceC7894ly1
    public E removeLast() {
        return Y5().removeLast();
    }

    @Override // java.util.Deque
    @InterfaceC6181ey
    public boolean removeLastOccurrence(@MB Object obj) {
        return Y5().removeLastOccurrence(obj);
    }
}
