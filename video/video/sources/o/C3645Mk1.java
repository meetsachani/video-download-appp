package o;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.AbstractC8154my0;
import o.Q0;

@InterfaceC5601ca0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.Mk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3645Mk1 {

    /* renamed from: o.Mk1$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ BlockingQueue X;
        public final /* synthetic */ InterfaceFutureC8411o11 Y;

        public a(BlockingQueue blockingQueue, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
            this.X = blockingQueue;
            this.Y = interfaceFutureC8411o11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.add(this.Y);
        }
    }

    /* renamed from: o.Mk1$b */
    /* loaded from: classes3.dex */
    public class b implements Executor {
        public final /* synthetic */ Executor X;
        public final /* synthetic */ InterfaceC8331nh2 Y;

        public b(Executor executor, InterfaceC8331nh2 interfaceC8331nh2) {
            this.X = executor;
            this.Y = interfaceC8331nh2;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.X.execute(C3288It.g(runnable, this.Y));
        }
    }

    /* renamed from: o.Mk1$c */
    /* loaded from: classes3.dex */
    public class c extends IN2 {
        public final /* synthetic */ InterfaceC8331nh2 Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExecutorService executorService, InterfaceC8331nh2 interfaceC8331nh2) {
            super(executorService);
            this.Y = interfaceC8331nh2;
        }

        @Override // o.IN2
        public Runnable f(Runnable runnable) {
            return C3288It.g(runnable, this.Y);
        }

        @Override // o.IN2
        public <T> Callable<T> h(Callable<T> callable) {
            return C3288It.h(callable, this.Y);
        }
    }

    /* renamed from: o.Mk1$d */
    /* loaded from: classes3.dex */
    public class d extends KN2 {
        public final /* synthetic */ InterfaceC8331nh2 Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ScheduledExecutorService scheduledExecutorService, InterfaceC8331nh2 interfaceC8331nh2) {
            super(scheduledExecutorService);
            this.Z = interfaceC8331nh2;
        }

        @Override // o.IN2
        public Runnable f(Runnable runnable) {
            return C3288It.g(runnable, this.Z);
        }

        @Override // o.IN2
        public <T> Callable<T> h(Callable<T> callable) {
            return C3288It.h(callable, this.Z);
        }
    }

    /* renamed from: o.Mk1$e */
    /* loaded from: classes3.dex */
    public class e implements Executor {
        public final /* synthetic */ Executor X;
        public final /* synthetic */ Q0 Y;

        public e(Executor executor, Q0 q0) {
            this.X = executor;
            this.Y = q0;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.X.execute(runnable);
            } catch (RejectedExecutionException e) {
                this.Y.C(e);
            }
        }
    }

    @InterfaceC11149zF0
    @InterfaceC5299bJ2
    /* renamed from: o.Mk1$f */
    /* loaded from: classes3.dex */
    public static class f {

        /* renamed from: o.Mk1$f$a */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public final /* synthetic */ ExecutorService X;
            public final /* synthetic */ long Y;
            public final /* synthetic */ TimeUnit Z;

            public a(f fVar, ExecutorService executorService, long j, TimeUnit timeUnit) {
                this.X = executorService;
                this.Y = j;
                this.Z = timeUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.X.shutdown();
                    this.X.awaitTermination(this.Y, this.Z);
                } catch (InterruptedException unused) {
                }
            }
        }

        public final void a(ExecutorService executorService, long j, TimeUnit timeUnit) {
            C10664xF1.E(executorService);
            C10664xF1.E(timeUnit);
            String valueOf = String.valueOf(executorService);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("DelayedShutdownHook-for-");
            sb.append(valueOf);
            b(C3645Mk1.n(sb.toString(), new a(this, executorService, j, timeUnit)));
        }

        @InterfaceC5299bJ2
        public void b(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        public final ExecutorService c(ThreadPoolExecutor threadPoolExecutor) {
            return d(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        public final ExecutorService d(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
            C3645Mk1.v(threadPoolExecutor);
            ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            a(threadPoolExecutor, j, timeUnit);
            return unconfigurableExecutorService;
        }

        public final ScheduledExecutorService e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return f(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        public final ScheduledExecutorService f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
            C3645Mk1.v(scheduledThreadPoolExecutor);
            ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            a(scheduledThreadPoolExecutor, j, timeUnit);
            return unconfigurableScheduledExecutorService;
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.Mk1$h */
    /* loaded from: classes3.dex */
    public static class h extends AbstractC10606x1 {
        public final ExecutorService X;

        public h(ExecutorService executorService) {
            this.X = (ExecutorService) C10664xF1.E(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.X.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.X.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.X.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.X.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.X.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.X.shutdownNow();
        }

        public final String toString() {
            String obj = super.toString();
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
            sb.append(obj);
            sb.append(C6566gU0.f);
            sb.append(valueOf);
            sb.append(C6566gU0.g);
            return sb.toString();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.Mk1$i */
    /* loaded from: classes3.dex */
    public static final class i extends h implements InterfaceScheduledExecutorServiceC10365w11 {
        public final ScheduledExecutorService Y;

        /* renamed from: o.Mk1$i$a */
        /* loaded from: classes3.dex */
        public static final class a<V> extends AbstractC8154my0.a<V> implements InterfaceScheduledFutureC8898q11<V> {
            public final ScheduledFuture<?> Y;

            public a(InterfaceFutureC8411o11<V> interfaceFutureC8411o11, ScheduledFuture<?> scheduledFuture) {
                super(interfaceFutureC8411o11);
                this.Y = scheduledFuture;
            }

            @Override // java.lang.Comparable
            /* renamed from: O5 */
            public int compareTo(Delayed delayed) {
                return this.Y.compareTo(delayed);
            }

            @Override // o.AbstractFutureC5697cy0, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.Y.cancel(z);
                }
                return cancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.Y.getDelay(timeUnit);
            }
        }

        @InterfaceC11149zF0
        /* renamed from: o.Mk1$i$b */
        /* loaded from: classes3.dex */
        public static final class b extends Q0.j<Void> implements Runnable {
            public final Runnable d1;

            public b(Runnable runnable) {
                this.d1 = (Runnable) C10664xF1.E(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.d1.run();
                } catch (Throwable th) {
                    C(th);
                    throw C7855lo2.q(th);
                }
            }

            @Override // o.Q0
            public String y() {
                String valueOf = String.valueOf(this.d1);
                StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                sb.append("task=[");
                sb.append(valueOf);
                sb.append(C6566gU0.g);
                return sb.toString();
            }
        }

        public i(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.Y = (ScheduledExecutorService) C10664xF1.E(scheduledExecutorService);
        }

        @Override // o.InterfaceScheduledExecutorServiceC10365w11, java.util.concurrent.ScheduledExecutorService
        public InterfaceScheduledFutureC8898q11<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.Y.scheduleAtFixedRate(bVar, j, j2, timeUnit));
        }

        @Override // o.InterfaceScheduledExecutorServiceC10365w11, java.util.concurrent.ScheduledExecutorService
        public InterfaceScheduledFutureC8898q11<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.Y.scheduleWithFixedDelay(bVar, j, j2, timeUnit));
        }

        @Override // o.InterfaceScheduledExecutorServiceC10365w11, java.util.concurrent.ScheduledExecutorService
        public InterfaceScheduledFutureC8898q11<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            Iu2 N = Iu2.N(runnable, null);
            return new a(N, this.Y.schedule(N, j, timeUnit));
        }

        @Override // o.InterfaceScheduledExecutorServiceC10365w11, java.util.concurrent.ScheduledExecutorService
        public <V> InterfaceScheduledFutureC8898q11<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            Iu2 O = Iu2.O(callable);
            return new a(O, this.Y.schedule(O, j, timeUnit));
        }
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static void b(ExecutorService executorService, long j, TimeUnit timeUnit) {
        new f().a(executorService, j, timeUnit);
    }

    public static Executor c() {
        return A30.INSTANCE;
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static ExecutorService d(ThreadPoolExecutor threadPoolExecutor) {
        return new f().c(threadPoolExecutor);
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static ExecutorService e(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
        return new f().d(threadPoolExecutor, j, timeUnit);
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static ScheduledExecutorService f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new f().e(scheduledThreadPoolExecutor);
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static ScheduledExecutorService g(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
        return new f().f(scheduledThreadPoolExecutor, j, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7 A[SYNTHETIC] */
    @InterfaceC7165iy1
    @InterfaceC11149zF0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T h(InterfaceExecutorServiceC10119v11 interfaceExecutorServiceC10119v11, Collection<? extends Callable<T>> collection, boolean z, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        boolean z2;
        long nanoTime;
        long j2;
        C10664xF1.E(interfaceExecutorServiceC10119v11);
        C10664xF1.E(timeUnit);
        int size = collection.size();
        if (size > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.d(z2);
        ArrayList<Future> u = C10608x11.u(size);
        LinkedBlockingQueue k = C10445wL1.k();
        long nanos = timeUnit.toNanos(j);
        if (z) {
            try {
                nanoTime = System.nanoTime();
            } catch (Throwable th) {
                for (Future future : u) {
                    future.cancel(true);
                }
                throw th;
            }
        } else {
            nanoTime = 0;
        }
        Iterator<? extends Callable<T>> it = collection.iterator();
        u.add(u(interfaceExecutorServiceC10119v11, it.next(), k));
        int i2 = size - 1;
        int i3 = 1;
        ExecutionException executionException = null;
        while (true) {
            Future future2 = (Future) k.poll();
            if (future2 == null) {
                if (i2 > 0) {
                    i2--;
                    u.add(u(interfaceExecutorServiceC10119v11, it.next(), k));
                    i3++;
                } else if (i3 == 0) {
                    if (executionException == null) {
                        throw new ExecutionException((Throwable) null);
                    }
                    throw executionException;
                } else if (z) {
                    future2 = (Future) k.poll(nanos, TimeUnit.NANOSECONDS);
                    if (future2 != null) {
                        j2 = System.nanoTime();
                        nanos -= j2 - nanoTime;
                        long j3 = nanos;
                        int i4 = i2;
                        if (future2 == null) {
                            i3--;
                            try {
                                T t = (T) future2.get();
                                for (Future future3 : u) {
                                    future3.cancel(true);
                                }
                                return t;
                            } catch (RuntimeException e2) {
                                executionException = new ExecutionException(e2);
                            } catch (ExecutionException e3) {
                                executionException = e3;
                            }
                        }
                        i2 = i4;
                        nanos = j3;
                        nanoTime = j2;
                    } else {
                        throw new TimeoutException();
                    }
                } else {
                    future2 = (Future) k.take();
                }
            }
            j2 = nanoTime;
            long j32 = nanos;
            int i42 = i2;
            if (future2 == null) {
            }
            i2 = i42;
            nanos = j32;
            nanoTime = j2;
        }
    }

    @InterfaceC11149zF0
    public static boolean i() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) == null) {
            return false;
        }
        return true;
    }

    @InterfaceC11149zF0
    public static InterfaceExecutorServiceC10119v11 j(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC10119v11) {
            return (InterfaceExecutorServiceC10119v11) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new i((ScheduledExecutorService) executorService);
        }
        return new h(executorService);
    }

    @InterfaceC11149zF0
    public static InterfaceScheduledExecutorServiceC10365w11 k(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof InterfaceScheduledExecutorServiceC10365w11) {
            return (InterfaceScheduledExecutorServiceC10365w11) scheduledExecutorService;
        }
        return new i(scheduledExecutorService);
    }

    @InterfaceC11149zF0
    public static InterfaceExecutorServiceC10119v11 l() {
        return new g(null);
    }

    @InterfaceC11149zF0
    public static Executor m(Executor executor) {
        return new ExecutorC7908m12(executor);
    }

    @InterfaceC11149zF0
    public static Thread n(String str, Runnable runnable) {
        C10664xF1.E(str);
        C10664xF1.E(runnable);
        Thread newThread = o().newThread(runnable);
        try {
            newThread.setName(str);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static ThreadFactory o() {
        if (!i()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", null).invoke(null, null);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e4);
        } catch (InvocationTargetException e5) {
            throw C7855lo2.q(e5.getCause());
        }
    }

    public static Executor p(Executor executor, Q0<?> q0) {
        C10664xF1.E(executor);
        C10664xF1.E(q0);
        if (executor == c()) {
            return executor;
        }
        return new e(executor, q0);
    }

    @InterfaceC11149zF0
    public static Executor q(Executor executor, InterfaceC8331nh2<String> interfaceC8331nh2) {
        C10664xF1.E(executor);
        C10664xF1.E(interfaceC8331nh2);
        return new b(executor, interfaceC8331nh2);
    }

    @InterfaceC11149zF0
    public static ExecutorService r(ExecutorService executorService, InterfaceC8331nh2<String> interfaceC8331nh2) {
        C10664xF1.E(executorService);
        C10664xF1.E(interfaceC8331nh2);
        return new c(executorService, interfaceC8331nh2);
    }

    @InterfaceC11149zF0
    public static ScheduledExecutorService s(ScheduledExecutorService scheduledExecutorService, InterfaceC8331nh2<String> interfaceC8331nh2) {
        C10664xF1.E(scheduledExecutorService);
        C10664xF1.E(interfaceC8331nh2);
        return new d(scheduledExecutorService, interfaceC8331nh2);
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static boolean t(ExecutorService executorService, long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    @InterfaceC11149zF0
    public static <T> InterfaceFutureC8411o11<T> u(InterfaceExecutorServiceC10119v11 interfaceExecutorServiceC10119v11, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
        InterfaceFutureC8411o11<T> submit = interfaceExecutorServiceC10119v11.submit((Callable) callable);
        submit.h4(new a(blockingQueue, submit), c());
        return submit;
    }

    @InterfaceC11149zF0
    public static void v(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new C11038yn2().e(true).h(threadPoolExecutor.getThreadFactory()).b());
    }

    @InterfaceC11149zF0
    /* renamed from: o.Mk1$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC10606x1 {
        public final Object X;
        @InterfaceC7980mF0("lock")
        public int Y;
        @InterfaceC7980mF0("lock")
        public boolean Z;

        public g() {
            this.X = new Object();
            this.Y = 0;
            this.Z = false;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            long nanos = timeUnit.toNanos(j);
            synchronized (this.X) {
                while (true) {
                    try {
                        if (this.Z && this.Y == 0) {
                            return true;
                        }
                        if (nanos <= 0) {
                            return false;
                        }
                        long nanoTime = System.nanoTime();
                        TimeUnit.NANOSECONDS.timedWait(this.X, nanos);
                        nanos -= System.nanoTime() - nanoTime;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final void d() {
            synchronized (this.X) {
                try {
                    int i = this.Y - 1;
                    this.Y = i;
                    if (i == 0) {
                        this.X.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f();
            try {
                runnable.run();
            } finally {
                d();
            }
        }

        public final void f() {
            synchronized (this.X) {
                try {
                    if (!this.Z) {
                        this.Y++;
                    } else {
                        throw new RejectedExecutionException("Executor already shutdown");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z;
            synchronized (this.X) {
                z = this.Z;
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z;
            synchronized (this.X) {
                try {
                    if (this.Z && this.Y == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } finally {
                }
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.X) {
                try {
                    this.Z = true;
                    if (this.Y == 0) {
                        this.X.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.EMPTY_LIST;
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }
}
