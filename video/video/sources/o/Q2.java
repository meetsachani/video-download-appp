package o;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import o.G12;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public abstract class Q2 implements G12 {
    public static final Logger b = Logger.getLogger(Q2.class.getName());
    public final X2 a = new g(this, null);

    /* loaded from: classes3.dex */
    public class a extends G12.a {
        public final /* synthetic */ ScheduledExecutorService a;

        public a(Q2 q2, ScheduledExecutorService scheduledExecutorService) {
            this.a = scheduledExecutorService;
        }

        @Override // o.G12.a
        public void a(G12.b bVar, Throwable th) {
            this.a.shutdown();
        }

        @Override // o.G12.a
        public void e(G12.b bVar) {
            this.a.shutdown();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return C3645Mk1.n(Q2.this.n(), runnable);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void cancel(boolean z);

        boolean isCancelled();
    }

    /* loaded from: classes3.dex */
    public static abstract class d extends f {

        /* loaded from: classes3.dex */
        public final class a implements Callable<Void> {
            public final Runnable a;
            public final ScheduledExecutorService b;
            public final X2 c;
            public final ReentrantLock d = new ReentrantLock();
            @InterfaceC7980mF0("lock")
            @MB
            public c e;

            public a(X2 x2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.a = runnable;
                this.b = scheduledExecutorService;
                this.c = x2;
            }

            @Override // java.util.concurrent.Callable
            @MB
            /* renamed from: a */
            public Void call() throws Exception {
                this.a.run();
                c();
                return null;
            }

            @InterfaceC7980mF0("lock")
            public final c b(b bVar) {
                c cVar = this.e;
                if (cVar == null) {
                    c cVar2 = new c(this.d, d(bVar));
                    this.e = cVar2;
                    return cVar2;
                }
                if (!cVar.b.isCancelled()) {
                    this.e.b = d(bVar);
                }
                return this.e;
            }

            @InterfaceC6181ey
            public c c() {
                c eVar;
                try {
                    b d = d.this.d();
                    this.d.lock();
                    try {
                        eVar = b(d);
                        this.d.unlock();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            eVar = new e(C6980iC0.k());
                        } finally {
                            this.d.unlock();
                        }
                    }
                    if (th != null) {
                        this.c.t(th);
                    }
                    return eVar;
                } catch (Throwable th2) {
                    this.c.t(th2);
                    return new e(C6980iC0.k());
                }
            }

            public final ScheduledFuture<Void> d(b bVar) {
                return this.b.schedule(this, bVar.a, bVar.b);
            }
        }

        /* loaded from: classes3.dex */
        public static final class b {
            public final long a;
            public final TimeUnit b;

            public b(long j, TimeUnit timeUnit) {
                this.a = j;
                this.b = (TimeUnit) C10664xF1.E(timeUnit);
            }
        }

        /* loaded from: classes3.dex */
        public static final class c implements c {
            public final ReentrantLock a;
            @InterfaceC7980mF0("lock")
            public Future<Void> b;

            public c(ReentrantLock reentrantLock, Future<Void> future) {
                this.a = reentrantLock;
                this.b = future;
            }

            @Override // o.Q2.c
            public void cancel(boolean z) {
                this.a.lock();
                try {
                    this.b.cancel(z);
                } finally {
                    this.a.unlock();
                }
            }

            @Override // o.Q2.c
            public boolean isCancelled() {
                this.a.lock();
                try {
                    return this.b.isCancelled();
                } finally {
                    this.a.unlock();
                }
            }
        }

        public d() {
            super(null);
        }

        @Override // o.Q2.f
        public final c c(X2 x2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new a(x2, scheduledExecutorService, runnable).c();
        }

        public abstract b d() throws Exception;
    }

    /* loaded from: classes3.dex */
    public static final class e implements c {
        public final Future<?> a;

        public e(Future<?> future) {
            this.a = future;
        }

        @Override // o.Q2.c
        public void cancel(boolean z) {
            this.a.cancel(z);
        }

        @Override // o.Q2.c
        public boolean isCancelled() {
            return this.a.isCancelled();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f {

        /* loaded from: classes3.dex */
        public class a extends f {
            public final /* synthetic */ long a;
            public final /* synthetic */ long b;
            public final /* synthetic */ TimeUnit c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, long j2, TimeUnit timeUnit) {
                super(null);
                this.a = j;
                this.b = j2;
                this.c = timeUnit;
            }

            @Override // o.Q2.f
            public c c(X2 x2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new e(scheduledExecutorService.scheduleWithFixedDelay(runnable, this.a, this.b, this.c));
            }
        }

        /* loaded from: classes3.dex */
        public class b extends f {
            public final /* synthetic */ long a;
            public final /* synthetic */ long b;
            public final /* synthetic */ TimeUnit c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, long j2, TimeUnit timeUnit) {
                super(null);
                this.a = j;
                this.b = j2;
                this.c = timeUnit;
            }

            @Override // o.Q2.f
            public c c(X2 x2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new e(scheduledExecutorService.scheduleAtFixedRate(runnable, this.a, this.b, this.c));
            }
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        public static f a(long j, long j2, TimeUnit timeUnit) {
            boolean z;
            C10664xF1.E(timeUnit);
            if (j2 > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.p(z, "delay must be > 0, found %s", j2);
            return new a(j, j2, timeUnit);
        }

        public static f b(long j, long j2, TimeUnit timeUnit) {
            boolean z;
            C10664xF1.E(timeUnit);
            if (j2 > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.p(z, "period must be > 0, found %s", j2);
            return new b(j, j2, timeUnit);
        }

        public abstract c c(X2 x2, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        public f() {
        }
    }

    @Override // o.G12
    public final void a(G12.a aVar, Executor executor) {
        this.a.a(aVar, executor);
    }

    @Override // o.G12
    public final void b(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.b(j, timeUnit);
    }

    @Override // o.G12
    public final void c(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.c(j, timeUnit);
    }

    @Override // o.G12
    public final void d() {
        this.a.d();
    }

    @Override // o.G12
    @InterfaceC6181ey
    public final G12 e() {
        this.a.e();
        return this;
    }

    @Override // o.G12
    public final void f() {
        this.a.f();
    }

    @Override // o.G12
    public final Throwable g() {
        return this.a.g();
    }

    @Override // o.G12
    @InterfaceC6181ey
    public final G12 h() {
        this.a.h();
        return this;
    }

    @Override // o.G12
    public final boolean isRunning() {
        return this.a.isRunning();
    }

    public ScheduledExecutorService k() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
        a(new a(this, newSingleThreadScheduledExecutor), C3645Mk1.c());
        return newSingleThreadScheduledExecutor;
    }

    public abstract void l() throws Exception;

    public abstract f m();

    public String n() {
        return getClass().getSimpleName();
    }

    @Override // o.G12
    public final G12.b state() {
        return this.a.state();
    }

    public String toString() {
        String n = n();
        String valueOf = String.valueOf(state());
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 3 + valueOf.length());
        sb.append(n);
        sb.append(" [");
        sb.append(valueOf);
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    /* loaded from: classes3.dex */
    public final class g extends X2 {
        @MB
        public volatile c p;
        @MB
        public volatile ScheduledExecutorService q;
        public final ReentrantLock r;
        public final Runnable s;

        /* loaded from: classes3.dex */
        public class a implements InterfaceC8331nh2<String> {
            public a() {
            }

            @Override // o.InterfaceC8331nh2
            /* renamed from: a */
            public String get() {
                String n = Q2.this.n();
                String valueOf = String.valueOf(g.this.state());
                StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 1 + valueOf.length());
                sb.append(n);
                sb.append(C4500Ve2.b);
                sb.append(valueOf);
                return sb.toString();
            }
        }

        /* loaded from: classes3.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.r.lock();
                try {
                    Q2.this.p();
                    g gVar = g.this;
                    gVar.p = Q2.this.m().c(Q2.this.a, g.this.q, g.this.s);
                    g.this.u();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* loaded from: classes3.dex */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    g.this.r.lock();
                    if (g.this.state() != G12.b.STOPPING) {
                        g.this.r.unlock();
                        return;
                    }
                    Q2.this.o();
                    g.this.r.unlock();
                    g.this.v();
                } catch (Throwable th) {
                    g.this.t(th);
                }
            }
        }

        /* loaded from: classes3.dex */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.r.lock();
                try {
                    c cVar = g.this.p;
                    Objects.requireNonNull(cVar);
                    if (!cVar.isCancelled()) {
                        Q2.this.l();
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        public g() {
            this.r = new ReentrantLock();
            this.s = new d();
        }

        @Override // o.X2
        public final void m() {
            this.q = C3645Mk1.s(Q2.this.k(), new a());
            this.q.execute(new b());
        }

        @Override // o.X2
        public final void n() {
            Objects.requireNonNull(this.p);
            Objects.requireNonNull(this.q);
            this.p.cancel(false);
            this.q.execute(new c());
        }

        @Override // o.X2
        public String toString() {
            return Q2.this.toString();
        }

        public /* synthetic */ g(Q2 q2, a aVar) {
            this();
        }
    }

    public void o() throws Exception {
    }

    public void p() throws Exception {
    }
}
