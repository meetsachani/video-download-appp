package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@InterfaceC11149zF0
@L40("Use FakeTimeLimiter")
@InterfaceC5601ca0
@InterfaceC4238Sm
/* renamed from: o.Mo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3662Mo2 {
    void a(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException;

    <T> T b(T t, Class<T> cls, long j, TimeUnit timeUnit);

    void c(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException;

    @InterfaceC6181ey
    <T> T d(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException;

    @InterfaceC6181ey
    <T> T e(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException;
}
