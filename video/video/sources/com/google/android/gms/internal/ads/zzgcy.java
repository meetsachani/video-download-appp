package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzgcy extends zzgda {
    public static zzgcw a(Iterable iterable) {
        return new zzgcw(false, zzfyc.w(iterable), null);
    }

    public static zzgcw b(Iterable iterable) {
        return new zzgcw(true, zzfyc.w(iterable), null);
    }

    @SafeVarargs
    public static zzgcw c(InterfaceFutureC8411o11... interfaceFutureC8411o11Arr) {
        return new zzgcw(true, zzfyc.D(interfaceFutureC8411o11Arr), null);
    }

    public static InterfaceFutureC8411o11 d(Iterable iterable) {
        return new zzgcg(zzfyc.w(iterable), true);
    }

    public static InterfaceFutureC8411o11 e(InterfaceFutureC8411o11 interfaceFutureC8411o11, Class cls, zzfur zzfurVar, Executor executor) {
        int i = zzgbl.f1;
        zzgbk zzgbkVar = new zzgbk(interfaceFutureC8411o11, cls, zzfurVar);
        interfaceFutureC8411o11.h4(zzgbkVar, zzgdq.d(executor, zzgbkVar));
        return zzgbkVar;
    }

    public static InterfaceFutureC8411o11 f(InterfaceFutureC8411o11 interfaceFutureC8411o11, Class cls, zzgcf zzgcfVar, Executor executor) {
        int i = zzgbl.f1;
        zzgbj zzgbjVar = new zzgbj(interfaceFutureC8411o11, cls, zzgcfVar);
        interfaceFutureC8411o11.h4(zzgbjVar, zzgdq.d(executor, zzgbjVar));
        return zzgbjVar;
    }

    public static InterfaceFutureC8411o11 g(Throwable th) {
        th.getClass();
        return new zzgdb(th);
    }

    public static InterfaceFutureC8411o11 h(Object obj) {
        if (obj == null) {
            return zzgdc.Y;
        }
        return new zzgdc(obj);
    }

    public static InterfaceFutureC8411o11 i() {
        return zzgdc.Y;
    }

    public static InterfaceFutureC8411o11 j(Callable callable, Executor executor) {
        zzgdz zzgdzVar = new zzgdz(callable);
        executor.execute(zzgdzVar);
        return zzgdzVar;
    }

    public static InterfaceFutureC8411o11 k(zzgce zzgceVar, Executor executor) {
        zzgdz zzgdzVar = new zzgdz(zzgceVar);
        executor.execute(zzgdzVar);
        return zzgdzVar;
    }

    @SafeVarargs
    public static InterfaceFutureC8411o11 l(InterfaceFutureC8411o11... interfaceFutureC8411o11Arr) {
        return new zzgcg(zzfyc.D(interfaceFutureC8411o11Arr), false);
    }

    public static InterfaceFutureC8411o11 m(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfur zzfurVar, Executor executor) {
        int i = zzgbv.e1;
        zzgbu zzgbuVar = new zzgbu(interfaceFutureC8411o11, zzfurVar);
        interfaceFutureC8411o11.h4(zzgbuVar, zzgdq.d(executor, zzgbuVar));
        return zzgbuVar;
    }

    public static InterfaceFutureC8411o11 n(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzgcf zzgcfVar, Executor executor) {
        int i = zzgbv.e1;
        zzgbt zzgbtVar = new zzgbt(interfaceFutureC8411o11, zzgcfVar);
        interfaceFutureC8411o11.h4(zzgbtVar, zzgdq.d(executor, zzgbtVar));
        return zzgbtVar;
    }

    public static InterfaceFutureC8411o11 o(InterfaceFutureC8411o11 interfaceFutureC8411o11, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (interfaceFutureC8411o11.isDone()) {
            return interfaceFutureC8411o11;
        }
        return zzgdw.C(interfaceFutureC8411o11, j, timeUnit, scheduledExecutorService);
    }

    public static Object p(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgeb.a(future);
        }
        throw new IllegalStateException(zzfvt.b("Future was expected to be done: %s", future));
    }

    public static Object q(Future future) {
        try {
            return zzgeb.a(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgcn((Error) e.getCause());
            }
            throw new zzgea(e.getCause());
        }
    }

    public static void r(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzgcu zzgcuVar, Executor executor) {
        zzgcuVar.getClass();
        interfaceFutureC8411o11.h4(new zzgcv(interfaceFutureC8411o11, zzgcuVar), executor);
    }
}
