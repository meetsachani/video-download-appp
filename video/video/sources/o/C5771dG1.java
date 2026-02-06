package o;

import java.util.Queue;

/* renamed from: o.dG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5771dG1<E> extends VF1<E> implements Queue<E> {
    private static final long serialVersionUID = 2307609000539943581L;

    public C5771dG1(Queue<E> queue, KF1<? super E> kf1) {
        super(queue, kf1);
    }

    public static <E> C5771dG1<E> l(Queue<E> queue, KF1<? super E> kf1) {
        return new C5771dG1<>(queue, kf1);
    }

    @Override // java.util.Queue
    public E element() {
        return d().element();
    }

    @Override // o.AbstractC8162n0
    /* renamed from: k */
    public Queue<E> d() {
        return (Queue) super.d();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        j(e);
        return d().offer(e);
    }

    @Override // java.util.Queue
    public E peek() {
        return d().peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return d().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return d().remove();
    }
}
