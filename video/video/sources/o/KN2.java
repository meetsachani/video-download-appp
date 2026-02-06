package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@InterfaceC6181ey
@InterfaceC5601ca0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public abstract class KN2 extends IN2 implements ScheduledExecutorService, AutoCloseable {
    public final ScheduledExecutorService Y;

    public KN2(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.Y = scheduledExecutorService;
    }

    @Override // o.IN2, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.Y.schedule(f(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.Y.scheduleAtFixedRate(f(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.Y.scheduleWithFixedDelay(f(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.Y.schedule(h(callable), j, timeUnit);
    }
}
