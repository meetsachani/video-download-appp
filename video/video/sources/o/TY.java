package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import o.AbstractC3425Ke0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
/* loaded from: classes3.dex */
public final class TY extends AbstractC3425Ke0 implements Runnable {
    @Nullable
    private static volatile Thread _thread = null;
    @NotNull
    public static final TY d1;
    private static volatile int debugStatus = 0;
    @NotNull
    public static final String e1 = "kotlinx.coroutines.DefaultExecutor";
    public static final long f1 = 1000;
    public static final long g1;
    public static final int h1 = 0;
    public static final int i1 = 1;
    public static final int j1 = 2;
    public static final int k1 = 3;
    public static final int l1 = 4;

    static {
        Long l;
        TY ty = new TY();
        d1 = ty;
        AbstractC3327Je0.n0(ty, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        g1 = timeUnit.toNanos(l.longValue());
    }

    public final synchronized void A2() {
        debugStatus = 0;
        u2();
        while (debugStatus == 0) {
            C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // o.AbstractC3523Le0
    @NotNull
    public Thread C0() {
        Thread thread = _thread;
        if (thread == null) {
            return u2();
        }
        return thread;
    }

    @Override // o.AbstractC3523Le0
    public void D0(long j, @NotNull AbstractC3425Ke0.c cVar) {
        i3();
    }

    @Override // o.AbstractC3425Ke0
    public void M0(@NotNull Runnable runnable) {
        if (P2()) {
            i3();
        }
        super.M0(runnable);
    }

    public final boolean P2() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    public final boolean X2() {
        int i = debugStatus;
        if (i != 2 && i != 3) {
            return false;
        }
        return true;
    }

    public final boolean d3() {
        if (_thread != null) {
            return true;
        }
        return false;
    }

    public final synchronized boolean g3() {
        if (X2()) {
            return false;
        }
        debugStatus = 1;
        C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void i3() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void m3(long j) {
        try {
            long currentTimeMillis = System.currentTimeMillis() + j;
            if (!X2()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    AbstractC10857y3 a = C11100z3.a();
                    if (a != null) {
                        a.g(thread);
                    } else {
                        LockSupport.unpark(thread);
                    }
                }
                if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                }
                C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
                wait(j);
            }
            debugStatus = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.AbstractC3425Ke0, o.O10
    @NotNull
    public B40 o(long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return O1(j, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        long nanoTime;
        C2472An2.a.d(this);
        AbstractC10857y3 a = C11100z3.a();
        if (a != null) {
            a.d();
        }
        try {
            if (!g3()) {
                _thread = null;
                t2();
                AbstractC10857y3 a2 = C11100z3.a();
                if (a2 != null) {
                    a2.h();
                }
                if (!p0()) {
                    C0();
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long y0 = y0();
                if (y0 == Long.MAX_VALUE) {
                    AbstractC10857y3 a3 = C11100z3.a();
                    if (a3 != null) {
                        nanoTime = a3.b();
                    } else {
                        nanoTime = System.nanoTime();
                    }
                    if (j == Long.MAX_VALUE) {
                        j = g1 + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        t2();
                        AbstractC10857y3 a4 = C11100z3.a();
                        if (a4 != null) {
                            a4.h();
                        }
                        if (!p0()) {
                            C0();
                            return;
                        }
                        return;
                    }
                    y0 = C5075aO1.C(y0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (y0 > 0) {
                    if (X2()) {
                        _thread = null;
                        t2();
                        AbstractC10857y3 a5 = C11100z3.a();
                        if (a5 != null) {
                            a5.h();
                        }
                        if (!p0()) {
                            C0();
                            return;
                        }
                        return;
                    }
                    AbstractC10857y3 a6 = C11100z3.a();
                    if (a6 != null) {
                        a6.c(this, y0);
                    } else {
                        LockSupport.parkNanos(this, y0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            t2();
            AbstractC10857y3 a7 = C11100z3.a();
            if (a7 != null) {
                a7.h();
            }
            if (!p0()) {
                C0();
            }
            throw th;
        }
    }

    @Override // o.AbstractC3425Ke0, o.AbstractC3327Je0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void t2() {
        if (!X2()) {
            return;
        }
        debugStatus = 3;
        C1();
        C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        return "DefaultExecutor";
    }

    public final synchronized Thread u2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, e1);
            _thread = thread;
            thread.setContextClassLoader(d1.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public static /* synthetic */ void G2() {
    }
}
