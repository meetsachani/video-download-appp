package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C4477Uy1;
import o.Q0;

@L40("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
@InterfaceC5601ca0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.uw0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10097uw0<V> extends AbstractC10663xF0<V> {

    /* renamed from: o.uw0$a */
    /* loaded from: classes3.dex */
    public static abstract class a<V> extends AbstractC10097uw0<V> implements Q0.i<V> {
        @Override // o.Q0, java.util.concurrent.Future
        @InterfaceC6181ey
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // o.Q0, java.util.concurrent.Future
        @InterfaceC6181ey
        @InterfaceC7165iy1
        public final V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // o.Q0, o.InterfaceFutureC8411o11
        public final void h4(Runnable runnable, Executor executor) {
            super.h4(runnable, executor);
        }

        @Override // o.Q0, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // o.Q0, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // o.Q0, java.util.concurrent.Future
        @InterfaceC6181ey
        @InterfaceC7165iy1
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    @Deprecated
    public static <V> AbstractC10097uw0<V> I(AbstractC10097uw0<V> abstractC10097uw0) {
        return (AbstractC10097uw0) C10664xF1.E(abstractC10097uw0);
    }

    public static <V> AbstractC10097uw0<V> J(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        if (interfaceFutureC8411o11 instanceof AbstractC10097uw0) {
            return (AbstractC10097uw0) interfaceFutureC8411o11;
        }
        return new C5454by0(interfaceFutureC8411o11);
    }

    public final void F(WB0<? super V> wb0, Executor executor) {
        C6980iC0.a(this, wb0, executor);
    }

    @C4477Uy1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    @InterfaceC4238Sm
    public final <X extends Throwable> AbstractC10097uw0<V> G(Class<X> cls, YA0<? super X, ? extends V> ya0, Executor executor) {
        return (AbstractC10097uw0) C6980iC0.d(this, cls, ya0, executor);
    }

    @C4477Uy1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    @InterfaceC4238Sm
    public final <X extends Throwable> AbstractC10097uw0<V> H(Class<X> cls, InterfaceC2731Df<? super X, ? extends V> interfaceC2731Df, Executor executor) {
        return (AbstractC10097uw0) C6980iC0.e(this, cls, interfaceC2731Df, executor);
    }

    @InterfaceC4238Sm
    public final <T> AbstractC10097uw0<T> K(YA0<? super V, T> ya0, Executor executor) {
        return (AbstractC10097uw0) C6980iC0.x(this, ya0, executor);
    }

    @InterfaceC4238Sm
    public final <T> AbstractC10097uw0<T> L(InterfaceC2731Df<? super V, T> interfaceC2731Df, Executor executor) {
        return (AbstractC10097uw0) C6980iC0.y(this, interfaceC2731Df, executor);
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public final AbstractC10097uw0<V> M(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (AbstractC10097uw0) C6980iC0.D(this, j, timeUnit, scheduledExecutorService);
    }
}
