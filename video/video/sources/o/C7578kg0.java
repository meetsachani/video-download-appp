package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.O10;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.kg0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7578kg0 extends AbstractC7335jg0 implements O10 {
    @NotNull
    public final Executor Y0;

    public C7578kg0(@NotNull Executor executor) {
        this.Y0 = executor;
        if (b0() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) b0()).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // o.O10
    public void E(long j, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        ScheduledExecutorService scheduledExecutorService;
        long j2;
        Executor b0 = b0();
        ScheduledFuture<?> scheduledFuture = null;
        if (b0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) b0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            j2 = j;
            scheduledFuture = j0(scheduledExecutorService, new RunnableC6810hU1(this, interfaceC8396ny), interfaceC8396ny.getContext(), j2);
        } else {
            j2 = j;
        }
        if (scheduledFuture != null) {
            C9375ry.c(interfaceC8396ny, new C6922hy(scheduledFuture));
        } else {
            TY.d1.E(j2, interfaceC8396ny);
        }
    }

    @Override // o.AbstractC7762lQ
    public void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        Runnable runnable2;
        try {
            Executor b0 = b0();
            AbstractC10857y3 abstractC10857y3 = C11100z3.a;
            if (abstractC10857y3 != null) {
                runnable2 = abstractC10857y3.i(runnable);
                if (runnable2 == null) {
                }
                b0.execute(runnable2);
            }
            runnable2 = runnable;
            b0.execute(runnable2);
        } catch (RejectedExecutionException e) {
            AbstractC10857y3 abstractC10857y32 = C11100z3.a;
            if (abstractC10857y32 != null) {
                abstractC10857y32.f();
            }
            g0(interfaceC5809dQ, e);
            C8909q40.c().I(interfaceC5809dQ, runnable);
        }
    }

    @Override // o.AbstractC7335jg0
    @NotNull
    public Executor b0() {
        return this.Y0;
    }

    @Override // o.AbstractC7335jg0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor b0 = b0();
        if (b0 instanceof ExecutorService) {
            executorService = (ExecutorService) b0;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof C7578kg0) && ((C7578kg0) obj).b0() == b0()) {
            return true;
        }
        return false;
    }

    public final void g0(InterfaceC5809dQ interfaceC5809dQ, RejectedExecutionException rejectedExecutionException) {
        C5829dV0.f(interfaceC5809dQ, C3722Nf0.a("The task was rejected", rejectedExecutionException));
    }

    public int hashCode() {
        return System.identityHashCode(b0());
    }

    public final ScheduledFuture<?> j0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC5809dQ interfaceC5809dQ, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            g0(interfaceC5809dQ, e);
            return null;
        }
    }

    @Override // o.O10
    @NotNull
    public B40 o(long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        ScheduledExecutorService scheduledExecutorService;
        long j2;
        Runnable runnable2;
        InterfaceC5809dQ interfaceC5809dQ2;
        Executor b0 = b0();
        ScheduledFuture<?> scheduledFuture = null;
        if (b0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) b0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            j2 = j;
            runnable2 = runnable;
            interfaceC5809dQ2 = interfaceC5809dQ;
            scheduledFuture = j0(scheduledExecutorService, runnable2, interfaceC5809dQ2, j2);
        } else {
            j2 = j;
            runnable2 = runnable;
            interfaceC5809dQ2 = interfaceC5809dQ;
        }
        if (scheduledFuture != null) {
            return new A40(scheduledFuture);
        }
        return TY.d1.o(j2, runnable2, interfaceC5809dQ2);
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        return b0().toString();
    }

    @Override // o.O10
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object z(long j, @NotNull HM<? super C7458kA2> hm) {
        return O10.a.a(this, j, hm);
    }
}
