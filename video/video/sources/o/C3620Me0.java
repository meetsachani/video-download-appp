package o;

import o.ExecutorC9488sQ;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Me0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3620Me0 {
    @NotNull
    public static final AbstractC3327Je0 a() {
        return new C10064uo(Thread.currentThread());
    }

    @HK1
    @InterfaceC10472wS0
    @InterfaceC6442g20
    public static final boolean b(@NotNull Thread thread) {
        if (!(thread instanceof ExecutorC9488sQ.c)) {
            return false;
        }
        return ((ExecutorC9488sQ.c) thread).m();
    }

    public static final void c(@NotNull FA0<C7458kA2> fa0) {
        fa0.invoke();
    }

    @InterfaceC10472wS0
    public static final long d() {
        AbstractC3327Je0 a = C2472An2.a.a();
        if (a != null) {
            return a.y0();
        }
        return Long.MAX_VALUE;
    }

    @HK1
    @InterfaceC10472wS0
    @InterfaceC6442g20
    public static final long e() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof ExecutorC9488sQ.c) {
            return ((ExecutorC9488sQ.c) currentThread).q();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + currentThread);
    }
}
