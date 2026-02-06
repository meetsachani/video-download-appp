package o;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.fp2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6391fp2 {
    public static final int l = 0;
    public static final int m = 1;
    public final ScheduledExecutorService a;
    public final long b;
    public final TimeUnit c;
    public final boolean d;
    public ScheduledFuture<?> e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public boolean k;

    public C6391fp2(long j, TimeUnit timeUnit, int i) {
        this(null, j, timeUnit, i);
    }

    public synchronized void a() throws InterruptedException {
        boolean b;
        m();
        do {
            b = b();
            if (!b) {
                wait();
                continue;
            }
        } while (!b);
    }

    public final boolean b() {
        if (i() > 0 && this.i >= i()) {
            return false;
        }
        this.i++;
        return true;
    }

    public synchronized void c() {
        int i = this.i;
        this.j = i;
        this.f += i;
        this.g++;
        this.i = 0;
        notifyAll();
    }

    public synchronized int d() {
        return this.i;
    }

    public synchronized int e() {
        return i() - d();
    }

    public synchronized double f() {
        double d;
        long j = this.g;
        if (j == 0) {
            d = 0.0d;
        } else {
            d = this.f / j;
        }
        return d;
    }

    public ScheduledExecutorService g() {
        return this.a;
    }

    public synchronized int h() {
        return this.j;
    }

    public final synchronized int i() {
        return this.h;
    }

    public long j() {
        return this.b;
    }

    public TimeUnit k() {
        return this.c;
    }

    public synchronized boolean l() {
        return this.k;
    }

    public final void m() {
        if (!l()) {
            if (this.e == null) {
                this.e = p();
                return;
            }
            return;
        }
        throw new IllegalStateException("TimedSemaphore is shut down!");
    }

    public final synchronized void n(int i) {
        this.h = i;
    }

    public synchronized void o() {
        try {
            if (!this.k) {
                if (this.d) {
                    g().shutdownNow();
                }
                ScheduledFuture<?> scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.k = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public ScheduledFuture<?> p() {
        return g().scheduleAtFixedRate(new Runnable() { // from class: o.ep2
            @Override // java.lang.Runnable
            public final void run() {
                C6391fp2.this.c();
            }
        }, j(), j(), k());
    }

    public synchronized boolean q() {
        m();
        return b();
    }

    public C6391fp2(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        C11147zE2.r(1L, Long.MAX_VALUE, j, "Time period must be greater than 0!");
        this.b = j;
        this.c = timeUnit;
        if (scheduledExecutorService != null) {
            this.a = scheduledExecutorService;
            this.d = false;
        } else {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            this.a = scheduledThreadPoolExecutor;
            this.d = true;
        }
        n(i);
    }
}
