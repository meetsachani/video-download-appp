package o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.AbstractC2437Af;
import o.AbstractC3232If;
import o.InterfaceC4747Xs;

/* renamed from: o.Jf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3330Jf extends C9006qS1 {
    public static final int w = 4;
    public final AbstractC2437Af m;
    public final AbstractC3232If n;

    /* renamed from: o  reason: collision with root package name */
    public ExecutorService f505o;
    public ScheduledExecutorService p;
    public ExecutorService q;
    public h r;
    public final C9706tJ2 s;
    public final List<AbstractC5091aS1<?>> t;
    public volatile boolean u;
    public final Object v;

    /* renamed from: o.Jf$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: o.Jf$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0195a implements AbstractC2437Af.b {
            public C0195a() {
            }

            @Override // o.AbstractC2437Af.b
            public void a() {
                C3330Jf.this.B();
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3330Jf.this.m.c(new C0195a());
        }
    }

    /* renamed from: o.Jf$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: o.Jf$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3330Jf.this.B();
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3330Jf.this.h().initialize();
            C3330Jf.this.f505o.execute(new a());
        }
    }

    /* renamed from: o.Jf$c */
    /* loaded from: classes.dex */
    public class c implements Comparator<Runnable> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Runnable runnable, Runnable runnable2) {
            if (runnable instanceof AbstractRunnableC9255rS1) {
                if (runnable2 instanceof AbstractRunnableC9255rS1) {
                    return ((AbstractRunnableC9255rS1) runnable).a((AbstractRunnableC9255rS1) runnable2);
                }
                return 1;
            } else if (runnable2 instanceof AbstractRunnableC9255rS1) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    /* renamed from: o.Jf$d */
    /* loaded from: classes.dex */
    public static class d {
        public final AbstractC3232If b;
        public AbstractC2437Af a = null;
        public InterfaceC4747Xs c = null;
        public h d = null;
        public GT1 e = null;

        /* renamed from: o.Jf$d$a */
        /* loaded from: classes.dex */
        public class a extends h {

            /* renamed from: o.Jf$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class ThreadFactoryC0196a implements ThreadFactory {
                public final /* synthetic */ String a;

                public ThreadFactoryC0196a(String str) {
                    this.a = str;
                }

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("Volley-" + this.a);
                    return newThread;
                }
            }

            public a() {
            }

            @Override // o.C3330Jf.h
            public ExecutorService a(BlockingQueue<Runnable> blockingQueue) {
                return d(4, "BlockingExecutor", blockingQueue);
            }

            @Override // o.C3330Jf.h
            public ExecutorService b(BlockingQueue<Runnable> blockingQueue) {
                return d(1, "Non-BlockingExecutor", blockingQueue);
            }

            @Override // o.C3330Jf.h
            public ScheduledExecutorService c() {
                return new ScheduledThreadPoolExecutor(0, e("ScheduledExecutor"));
            }

            public final ThreadPoolExecutor d(int i, String str, BlockingQueue<Runnable> blockingQueue) {
                return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, blockingQueue, e(str));
            }

            public final ThreadFactory e(String str) {
                return new ThreadFactoryC0196a(str);
            }
        }

        public d(AbstractC3232If abstractC3232If) {
            if (abstractC3232If != null) {
                this.b = abstractC3232If;
                return;
            }
            throw new IllegalArgumentException("Network cannot be null");
        }

        public C3330Jf a() {
            InterfaceC4747Xs interfaceC4747Xs = this.c;
            if (interfaceC4747Xs == null && this.a == null) {
                throw new IllegalArgumentException("You must set one of the cache objects");
            }
            if (interfaceC4747Xs == null) {
                this.c = new l(null);
            }
            if (this.e == null) {
                this.e = new C7821lg0(new Handler(Looper.getMainLooper()));
            }
            if (this.d == null) {
                this.d = b();
            }
            return new C3330Jf(this.c, this.b, this.a, this.e, this.d, null);
        }

        public final h b() {
            return new a();
        }

        public d c(AbstractC2437Af abstractC2437Af) {
            this.a = abstractC2437Af;
            return this;
        }

        public d d(InterfaceC4747Xs interfaceC4747Xs) {
            this.c = interfaceC4747Xs;
            return this;
        }

        public d e(h hVar) {
            this.d = hVar;
            return this;
        }

        public d f(GT1 gt1) {
            this.e = gt1;
            return this;
        }
    }

    /* renamed from: o.Jf$e */
    /* loaded from: classes.dex */
    public class e<T> extends AbstractRunnableC9255rS1<T> {
        public InterfaceC4747Xs.a Y;
        public long Z;

        /* renamed from: o.Jf$e$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                C3330Jf.this.n(eVar.X);
            }
        }

        public e(AbstractC5091aS1<T> abstractC5091aS1, InterfaceC4747Xs.a aVar, long j) {
            super(abstractC5091aS1);
            this.Y = aVar;
            this.Z = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.g("cache-hit");
            AbstractC5091aS1<T> abstractC5091aS1 = this.X;
            InterfaceC4747Xs.a aVar = this.Y;
            DT1<T> P = abstractC5091aS1.P(new C3470Kp1(200, aVar.a, false, 0L, aVar.h));
            this.X.g("cache-hit-parsed");
            if (!this.Y.d(this.Z)) {
                C3330Jf.this.i().c(this.X, P);
                return;
            }
            this.X.g("cache-hit-refresh-needed");
            this.X.R(this.Y);
            P.d = true;
            if (!C3330Jf.this.s.c(this.X)) {
                C3330Jf.this.i().a(this.X, P, new a());
            } else {
                C3330Jf.this.i().c(this.X, P);
            }
        }
    }

    /* renamed from: o.Jf$f */
    /* loaded from: classes.dex */
    public class f<T> extends AbstractRunnableC9255rS1<T> {
        public DT1<?> Y;

        /* renamed from: o.Jf$f$a */
        /* loaded from: classes.dex */
        public class a implements AbstractC2437Af.b {
            public a() {
            }

            @Override // o.AbstractC2437Af.b
            public void a() {
                f fVar = f.this;
                C3330Jf.this.y(fVar.X, fVar.Y, true);
            }
        }

        public f(AbstractC5091aS1<T> abstractC5091aS1, DT1<?> dt1) {
            super(abstractC5091aS1);
            this.Y = dt1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3330Jf.this.m != null) {
                C3330Jf.this.m.e(this.X.s(), this.Y.b, new a());
                return;
            }
            C3330Jf.this.h().b(this.X.s(), this.Y.b);
            C3330Jf.this.y(this.X, this.Y, true);
        }
    }

    /* renamed from: o.Jf$g */
    /* loaded from: classes.dex */
    public class g<T> extends AbstractRunnableC9255rS1<T> {

        /* renamed from: o.Jf$g$a */
        /* loaded from: classes.dex */
        public class a implements AbstractC2437Af.a {
            public a() {
            }

            @Override // o.AbstractC2437Af.a
            public void a(InterfaceC4747Xs.a aVar) {
                g gVar = g.this;
                C3330Jf.this.A(aVar, gVar.X);
            }
        }

        public g(AbstractC5091aS1<T> abstractC5091aS1) {
            super(abstractC5091aS1);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X.K()) {
                this.X.o("cache-discard-canceled");
                return;
            }
            this.X.g("cache-queue-take");
            if (C3330Jf.this.m != null) {
                C3330Jf.this.m.b(this.X.s(), new a());
                return;
            }
            C3330Jf.this.A(C3330Jf.this.h().m(this.X.s()), this.X);
        }
    }

    /* renamed from: o.Jf$h */
    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract ExecutorService a(BlockingQueue<Runnable> blockingQueue);

        public abstract ExecutorService b(BlockingQueue<Runnable> blockingQueue);

        public abstract ScheduledExecutorService c();
    }

    /* renamed from: o.Jf$i */
    /* loaded from: classes.dex */
    public class i<T> extends AbstractRunnableC9255rS1<T> {
        public C3470Kp1 Y;

        public i(AbstractC5091aS1<T> abstractC5091aS1, C3470Kp1 c3470Kp1) {
            super(abstractC5091aS1);
            this.Y = c3470Kp1;
        }

        @Override // java.lang.Runnable
        public void run() {
            DT1<T> P = this.X.P(this.Y);
            this.X.g("network-parse-complete");
            if (!this.X.b0() || P.b == null) {
                C3330Jf.this.y(this.X, P, false);
            } else if (C3330Jf.this.m != null) {
                C3330Jf.this.f505o.execute(new f(this.X, P));
            } else {
                C3330Jf.this.q.execute(new f(this.X, P));
            }
        }
    }

    /* renamed from: o.Jf$j */
    /* loaded from: classes.dex */
    public class j<T> extends AbstractRunnableC9255rS1<T> {

        /* renamed from: o.Jf$j$a */
        /* loaded from: classes.dex */
        public class a implements AbstractC3232If.b {
            public final /* synthetic */ long a;

            public a(long j) {
                this.a = j;
            }

            @Override // o.AbstractC3232If.b
            public void a(C6524gJ2 c6524gJ2) {
                c6524gJ2.b(SystemClock.elapsedRealtime() - this.a);
                ExecutorService executorService = C3330Jf.this.q;
                j jVar = j.this;
                executorService.execute(new k(jVar.X, c6524gJ2));
            }

            @Override // o.AbstractC3232If.b
            public void b(C3470Kp1 c3470Kp1) {
                j.this.X.g("network-http-complete");
                if (!c3470Kp1.e || !j.this.X.J()) {
                    ExecutorService executorService = C3330Jf.this.q;
                    j jVar = j.this;
                    executorService.execute(new i(jVar.X, c3470Kp1));
                    return;
                }
                j.this.X.o("not-modified");
                j.this.X.M();
            }
        }

        public j(AbstractC5091aS1<T> abstractC5091aS1) {
            super(abstractC5091aS1);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X.K()) {
                this.X.o("network-discard-cancelled");
                this.X.M();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.X.g("network-queue-take");
            C3330Jf.this.n.e(this.X, new a(elapsedRealtime));
        }
    }

    /* renamed from: o.Jf$k */
    /* loaded from: classes.dex */
    public class k<T> extends AbstractRunnableC9255rS1<T> {
        public C6524gJ2 Y;

        public k(AbstractC5091aS1<T> abstractC5091aS1, C6524gJ2 c6524gJ2) {
            super(abstractC5091aS1);
            this.Y = c6524gJ2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3330Jf.this.i().b(this.X, this.X.O(this.Y));
            this.X.M();
        }
    }

    /* renamed from: o.Jf$l */
    /* loaded from: classes.dex */
    public static class l implements InterfaceC4747Xs {
        public l() {
        }

        @Override // o.InterfaceC4747Xs
        public void a(String str, boolean z) {
            throw new UnsupportedOperationException();
        }

        @Override // o.InterfaceC4747Xs
        public void b(String str, InterfaceC4747Xs.a aVar) {
            throw new UnsupportedOperationException();
        }

        @Override // o.InterfaceC4747Xs
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // o.InterfaceC4747Xs
        public void initialize() {
            throw new UnsupportedOperationException();
        }

        @Override // o.InterfaceC4747Xs
        public InterfaceC4747Xs.a m(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // o.InterfaceC4747Xs
        public void remove(String str) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ l(a aVar) {
            this();
        }
    }

    public /* synthetic */ C3330Jf(InterfaceC4747Xs interfaceC4747Xs, AbstractC3232If abstractC3232If, AbstractC2437Af abstractC2437Af, GT1 gt1, h hVar, a aVar) {
        this(interfaceC4747Xs, abstractC3232If, abstractC2437Af, gt1, hVar);
    }

    public static PriorityBlockingQueue<Runnable> z() {
        return new PriorityBlockingQueue<>(11, new c());
    }

    public final void A(InterfaceC4747Xs.a aVar, AbstractC5091aS1<?> abstractC5091aS1) {
        if (aVar == null) {
            abstractC5091aS1.g("cache-miss");
            if (!this.s.c(abstractC5091aS1)) {
                n(abstractC5091aS1);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar.b(currentTimeMillis)) {
            abstractC5091aS1.g("cache-hit-expired");
            abstractC5091aS1.R(aVar);
            if (!this.s.c(abstractC5091aS1)) {
                n(abstractC5091aS1);
                return;
            }
            return;
        }
        this.q.execute(new e(abstractC5091aS1, aVar, currentTimeMillis));
    }

    public final void B() {
        ArrayList<AbstractC5091aS1> arrayList;
        synchronized (this.v) {
            arrayList = new ArrayList(this.t);
            this.t.clear();
            this.u = true;
        }
        for (AbstractC5091aS1 abstractC5091aS1 : arrayList) {
            d(abstractC5091aS1);
        }
    }

    @Override // o.C9006qS1
    public <T> void d(AbstractC5091aS1<T> abstractC5091aS1) {
        if (!this.u) {
            synchronized (this.v) {
                try {
                    if (!this.u) {
                        this.t.add(abstractC5091aS1);
                        return;
                    }
                } finally {
                }
            }
        }
        if (abstractC5091aS1.b0()) {
            if (this.m != null) {
                this.f505o.execute(new g(abstractC5091aS1));
                return;
            } else {
                this.q.execute(new g(abstractC5091aS1));
                return;
            }
        }
        n(abstractC5091aS1);
    }

    @Override // o.C9006qS1
    public <T> void n(AbstractC5091aS1<T> abstractC5091aS1) {
        this.f505o.execute(new j(abstractC5091aS1));
    }

    @Override // o.C9006qS1
    public void o() {
        p();
        this.f505o = this.r.b(z());
        this.q = this.r.a(z());
        this.p = this.r.c();
        this.n.f(this.q);
        this.n.g(this.f505o);
        this.n.h(this.p);
        if (this.m != null) {
            this.f505o.execute(new a());
        } else {
            this.q.execute(new b());
        }
    }

    @Override // o.C9006qS1
    public void p() {
        ExecutorService executorService = this.f505o;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f505o = null;
        }
        ExecutorService executorService2 = this.q;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.q = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.p;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.p = null;
        }
    }

    public final void y(AbstractC5091aS1<?> abstractC5091aS1, DT1<?> dt1, boolean z) {
        if (z) {
            abstractC5091aS1.g("network-cache-written");
        }
        abstractC5091aS1.L();
        i().c(abstractC5091aS1, dt1);
        abstractC5091aS1.N(dt1);
    }

    public C3330Jf(InterfaceC4747Xs interfaceC4747Xs, AbstractC3232If abstractC3232If, AbstractC2437Af abstractC2437Af, GT1 gt1, h hVar) {
        super(interfaceC4747Xs, abstractC3232If, 0, gt1);
        this.s = new C9706tJ2(this);
        this.t = new ArrayList();
        this.u = false;
        this.v = new Object[0];
        this.m = abstractC2437Af;
        this.n = abstractC3232If;
        this.r = hVar;
    }
}
