package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.w11  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceScheduledExecutorServiceC10365w11 extends ScheduledExecutorService, InterfaceExecutorServiceC10119v11, AutoCloseable {
    @Override // o.InterfaceExecutorServiceC10119v11, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    InterfaceScheduledFutureC8898q11<?> schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> InterfaceScheduledFutureC8898q11<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    InterfaceScheduledFutureC8898q11<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    InterfaceScheduledFutureC8898q11<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
