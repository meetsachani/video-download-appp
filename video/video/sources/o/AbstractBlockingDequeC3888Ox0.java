package o;

import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.Ox0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBlockingDequeC3888Ox0<E> extends AbstractC4764Xx0<E> implements BlockingDeque<E> {
    @Override // o.AbstractC4764Xx0
    /* renamed from: d6 */
    public abstract BlockingDeque<E> c6();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return c6().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return c6().offer(e, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return c6().offerFirst(e, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return c6().offerLast(e, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @MB
    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return c6().poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @MB
    public E pollFirst(long j, TimeUnit timeUnit) throws InterruptedException {
        return c6().pollFirst(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @MB
    public E pollLast(long j, TimeUnit timeUnit) throws InterruptedException {
        return c6().pollLast(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e) throws InterruptedException {
        c6().put(e);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e) throws InterruptedException {
        c6().putFirst(e);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e) throws InterruptedException {
        c6().putLast(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return c6().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return c6().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return c6().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return c6().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        return c6().drainTo(collection, i);
    }
}
