package o;

import java.util.Queue;

/* loaded from: classes4.dex */
public abstract class J2<E> extends AbstractC8162n0<E> implements Queue<E> {
    private static final long serialVersionUID = -2629815475789577029L;

    public J2() {
    }

    @Override // java.util.Queue
    public E element() {
        return d().element();
    }

    @Override // o.AbstractC8162n0
    /* renamed from: f */
    public Queue<E> d() {
        return (Queue) super.d();
    }

    public boolean offer(E e) {
        return d().offer(e);
    }

    @Override // java.util.Queue
    public E peek() {
        return d().peek();
    }

    public E poll() {
        return d().poll();
    }

    public E remove() {
        return d().remove();
    }

    public J2(Queue<E> queue) {
        super(queue);
    }
}
