package o;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.wL1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10445wL1 {
    @InterfaceC6181ey
    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static <E> int a(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i, long j, TimeUnit timeUnit) throws InterruptedException {
        C10664xF1.E(collection);
        long nanoTime = System.nanoTime() + timeUnit.toNanos(j);
        int i2 = 0;
        while (i2 < i) {
            i2 += blockingQueue.drainTo(collection, i - i2);
            if (i2 < i) {
                E poll = blockingQueue.poll(nanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (poll == null) {
                    return i2;
                }
                collection.add(poll);
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static <E> int b(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i, long j, TimeUnit timeUnit) {
        E poll;
        C10664xF1.E(collection);
        long nanoTime = System.nanoTime() + timeUnit.toNanos(j);
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            try {
                i2 += blockingQueue.drainTo(collection, i - i2);
                if (i2 < i) {
                    while (true) {
                        try {
                            poll = blockingQueue.poll(nanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    }
                    if (poll == null) {
                        break;
                    }
                    collection.add(poll);
                    i2++;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return i2;
    }

    @InterfaceC11149zF0
    public static <E> ArrayBlockingQueue<E> c(int i) {
        return new ArrayBlockingQueue<>(i);
    }

    public static <E> ArrayDeque<E> d() {
        return new ArrayDeque<>();
    }

    public static <E> ArrayDeque<E> e(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayDeque<>((Collection) iterable);
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        C5098aU0.a(arrayDeque, iterable);
        return arrayDeque;
    }

    @InterfaceC11149zF0
    public static <E> ConcurrentLinkedQueue<E> f() {
        return new ConcurrentLinkedQueue<>();
    }

    @InterfaceC11149zF0
    public static <E> ConcurrentLinkedQueue<E> g(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ConcurrentLinkedQueue<>((Collection) iterable);
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        C5098aU0.a(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    @InterfaceC11149zF0
    public static <E> LinkedBlockingDeque<E> h() {
        return new LinkedBlockingDeque<>();
    }

    @InterfaceC11149zF0
    public static <E> LinkedBlockingDeque<E> i(int i) {
        return new LinkedBlockingDeque<>(i);
    }

    @InterfaceC11149zF0
    public static <E> LinkedBlockingDeque<E> j(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingDeque<>((Collection) iterable);
        }
        LinkedBlockingDeque<E> linkedBlockingDeque = new LinkedBlockingDeque<>();
        C5098aU0.a(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    @InterfaceC11149zF0
    public static <E> LinkedBlockingQueue<E> k() {
        return new LinkedBlockingQueue<>();
    }

    @InterfaceC11149zF0
    public static <E> LinkedBlockingQueue<E> l(int i) {
        return new LinkedBlockingQueue<>(i);
    }

    @InterfaceC11149zF0
    public static <E> LinkedBlockingQueue<E> m(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingQueue<>((Collection) iterable);
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        C5098aU0.a(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    @InterfaceC11149zF0
    public static <E extends Comparable> PriorityBlockingQueue<E> n() {
        return new PriorityBlockingQueue<>();
    }

    @InterfaceC11149zF0
    public static <E extends Comparable> PriorityBlockingQueue<E> o(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityBlockingQueue<>((Collection) iterable);
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        C5098aU0.a(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    public static <E extends Comparable> PriorityQueue<E> p() {
        return new PriorityQueue<>();
    }

    public static <E extends Comparable> PriorityQueue<E> q(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityQueue<>((Collection) iterable);
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        C5098aU0.a(priorityQueue, iterable);
        return priorityQueue;
    }

    @InterfaceC11149zF0
    public static <E> SynchronousQueue<E> r() {
        return new SynchronousQueue<>();
    }

    public static <E> Deque<E> s(Deque<E> deque) {
        return C9069qj2.i(deque, null);
    }

    public static <E> Queue<E> t(Queue<E> queue) {
        return C9069qj2.t(queue, null);
    }
}
