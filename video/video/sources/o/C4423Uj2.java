package o;

import java.util.Queue;

/* renamed from: o.Uj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4423Uj2<E> extends C3447Kj2<E> implements Queue<E> {
    private static final long serialVersionUID = 1;

    public C4423Uj2(Queue<E> queue) {
        super(queue);
    }

    public static <E> C4423Uj2<E> h(Queue<E> queue) {
        return new C4423Uj2<>(queue);
    }

    @Override // java.util.Queue
    public E element() {
        E element;
        synchronized (this.Y) {
            element = d().element();
        }
        return element;
    }

    @Override // o.C3447Kj2, java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.Y) {
            equals = d().equals(obj);
        }
        return equals;
    }

    @Override // o.C3447Kj2
    /* renamed from: f */
    public Queue<E> d() {
        return (Queue) super.d();
    }

    @Override // o.C3447Kj2, java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.Y) {
            hashCode = d().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        boolean offer;
        synchronized (this.Y) {
            offer = d().offer(e);
        }
        return offer;
    }

    @Override // java.util.Queue
    public E peek() {
        E peek;
        synchronized (this.Y) {
            peek = d().peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public E poll() {
        E poll;
        synchronized (this.Y) {
            poll = d().poll();
        }
        return poll;
    }

    @Override // java.util.Queue
    public E remove() {
        E remove;
        synchronized (this.Y) {
            remove = d().remove();
        }
        return remove;
    }

    public C4423Uj2(Queue<E> queue, Object obj) {
        super(queue, obj);
    }
}
