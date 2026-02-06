package o;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@InterfaceC6181ey
@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.Qx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBlockingQueueC4082Qx0<E> extends AbstractC2706Cy0<E> implements BlockingQueue<E> {
    @Override // o.AbstractC2706Cy0
    /* renamed from: c6 */
    public abstract BlockingQueue<E> Y5();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        return Y5().drainTo(collection, i);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return Y5().offer(e, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @MB
    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return Y5().poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) throws InterruptedException {
        Y5().put(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Y5().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return Y5().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return Y5().drainTo(collection);
    }
}
