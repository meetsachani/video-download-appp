package o;

import java.util.Queue;

/* renamed from: o.xs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10815xs2<E> extends C7871ls2<E> implements Queue<E> {
    private static final long serialVersionUID = -7901091318986132033L;

    public C10815xs2(Queue<E> queue, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        super(queue, interfaceC3287Is2);
    }

    public static <E> C10815xs2<E> l(Queue<E> queue, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        C10815xs2<E> c10815xs2 = new C10815xs2<>(queue, interfaceC3287Is2);
        if (queue.size() > 0) {
            Object[] array = queue.toArray();
            queue.clear();
            for (Object obj : array) {
                c10815xs2.d().add(interfaceC3287Is2.a(obj));
            }
        }
        return c10815xs2;
    }

    public static <E> C10815xs2<E> p(Queue<E> queue, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        return new C10815xs2<>(queue, interfaceC3287Is2);
    }

    @Override // java.util.Queue
    public E element() {
        return k().element();
    }

    public Queue<E> k() {
        return (Queue) d();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        return k().offer(f(e));
    }

    @Override // java.util.Queue
    public E peek() {
        return k().peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return k().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return k().remove();
    }
}
