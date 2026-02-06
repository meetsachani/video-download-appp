package o;

import java.util.NoSuchElementException;
import java.util.Queue;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Cy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2706Cy0<E> extends AbstractC4473Ux0<E> implements Queue<E> {
    @Override // o.AbstractC4473Ux0
    /* renamed from: Y5 */
    public abstract Queue<E> M5();

    public boolean Z5(@InterfaceC7894ly1 E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @MB
    public E a6() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @MB
    public E b6() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @Override // java.util.Queue
    @InterfaceC7894ly1
    public E element() {
        return M5().element();
    }

    @Override // java.util.Queue
    @InterfaceC6181ey
    public boolean offer(@InterfaceC7894ly1 E e) {
        return M5().offer(e);
    }

    @Override // java.util.Queue
    @MB
    public E peek() {
        return M5().peek();
    }

    @Override // java.util.Queue
    @InterfaceC6181ey
    @MB
    public E poll() {
        return M5().poll();
    }

    @Override // java.util.Queue
    @InterfaceC6181ey
    @InterfaceC7894ly1
    public E remove() {
        return M5().remove();
    }
}
