package o;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Vl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4528Vl2 {
    @InterfaceC7058iW0
    @NotNull
    public static final String a = C2852Ek2.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    @InterfaceC7058iW0
    public static final long b;
    @InterfaceC7058iW0
    public static final int c;
    @InterfaceC7058iW0
    public static final int d;
    @InterfaceC7058iW0
    public static final long e;
    @InterfaceC7058iW0
    @NotNull
    public static AbstractC7549kY1 f = null;
    public static final boolean g = false;
    public static final boolean h = true;

    static {
        long f2;
        int e2;
        int e3;
        long f3;
        f2 = C3059Gk2.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        b = f2;
        e2 = C3059Gk2.e("kotlinx.coroutines.scheduler.core.pool.size", C5075aO1.u(C2852Ek2.a(), 2), 1, 0, 8, null);
        c = e2;
        e3 = C3059Gk2.e("kotlinx.coroutines.scheduler.max.pool.size", ExecutorC9488sQ.q1, 0, ExecutorC9488sQ.q1, 4, null);
        d = e3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3 = C3059Gk2.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        e = timeUnit.toNanos(f3);
        f = C10798xo1.a;
    }

    @NotNull
    public static final AbstractRunnableC3650Ml2 b(@NotNull Runnable runnable, long j, boolean z) {
        return new C3943Pl2(runnable, j, z);
    }

    public static final boolean c(@NotNull AbstractRunnableC3650Ml2 abstractRunnableC3650Ml2) {
        return abstractRunnableC3650Ml2.Y;
    }

    public static final String d(boolean z) {
        if (z) {
            return "Blocking";
        }
        return "Non-blocking";
    }
}
