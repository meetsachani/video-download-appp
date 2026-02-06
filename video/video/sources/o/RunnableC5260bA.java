package o;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o.bA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC5260bA<I, O> extends YB0<O> implements Runnable {
    public InterfaceC2829Ef<? super I, ? extends O> Z;
    public InterfaceFutureC8411o11<? extends I> a1;
    public volatile InterfaceFutureC8411o11<? extends O> b1;
    public final BlockingQueue<Boolean> Y0 = new LinkedBlockingQueue(1);
    public final CountDownLatch Z0 = new CountDownLatch(1);

    /* renamed from: o.bA$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ InterfaceFutureC8411o11 X;

        public a(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
            this.X = interfaceFutureC8411o11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        RunnableC5260bA.this.c(C7221jC0.e(this.X));
                    } catch (ExecutionException e) {
                        RunnableC5260bA.this.d(e.getCause());
                    }
                } catch (CancellationException unused) {
                    RunnableC5260bA.this.cancel(false);
                }
            } finally {
                RunnableC5260bA.this.b1 = null;
            }
        }
    }

    public RunnableC5260bA(InterfaceC2829Ef<? super I, ? extends O> interfaceC2829Ef, InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11) {
        this.Z = (InterfaceC2829Ef) C10907yF1.l(interfaceC2829Ef);
        this.a1 = (InterfaceFutureC8411o11) C10907yF1.l(interfaceFutureC8411o11);
    }

    @Override // o.YB0, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (super.cancel(z)) {
            h(this.Y0, Boolean.valueOf(z));
            g(this.a1, z);
            g(this.b1, z);
            return true;
        }
        return false;
    }

    public final void g(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override // o.YB0, java.util.concurrent.Future
    public O get() throws InterruptedException, ExecutionException {
        if (!isDone()) {
            InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11 = this.a1;
            if (interfaceFutureC8411o11 != null) {
                interfaceFutureC8411o11.get();
            }
            this.Z0.await();
            InterfaceFutureC8411o11<? extends O> interfaceFutureC8411o112 = this.b1;
            if (interfaceFutureC8411o112 != null) {
                interfaceFutureC8411o112.get();
            }
        }
        return (O) super.get();
    }

    public final <E> void h(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final <E> E i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.Ef<? super I, ? extends O>, o.o11<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.Ef<? super I, ? extends O>, o.o11<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11;
        ?? r0 = (InterfaceC2829Ef<? super I, ? extends O>) false;
        try {
            try {
                try {
                    try {
                        try {
                            InterfaceFutureC8411o11<? extends O> apply = this.Z.apply(C7221jC0.e(this.a1));
                            this.b1 = apply;
                            if (isCancelled()) {
                                apply.cancel(((Boolean) i(this.Y0)).booleanValue());
                                this.b1 = null;
                            } else {
                                apply.h4(new a(apply), C5211ay.b());
                            }
                        } catch (CancellationException unused) {
                            cancel(false);
                        } catch (ExecutionException e) {
                            d(e.getCause());
                        }
                    } catch (Error e2) {
                        d(e2);
                        interfaceFutureC8411o11 = r0;
                    }
                } catch (Exception e3) {
                    d(e3);
                    interfaceFutureC8411o11 = r0;
                }
            } finally {
                this.Z = (InterfaceC2829Ef<? super I, ? extends O>) r0;
                this.a1 = (InterfaceFutureC8411o11<? extends I>) r0;
                this.Z0.countDown();
            }
        } catch (UndeclaredThrowableException e4) {
            d(e4.getCause());
            interfaceFutureC8411o11 = r0;
        }
    }

    @Override // o.YB0, java.util.concurrent.Future
    public O get(long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11 = this.a1;
            if (interfaceFutureC8411o11 != null) {
                long nanoTime = System.nanoTime();
                interfaceFutureC8411o11.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.Z0.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                InterfaceFutureC8411o11<? extends O> interfaceFutureC8411o112 = this.b1;
                if (interfaceFutureC8411o112 != null) {
                    interfaceFutureC8411o112.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j, timeUnit);
    }
}
