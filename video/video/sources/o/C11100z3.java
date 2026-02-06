package o;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.z3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11100z3 {
    @Nullable
    public static AbstractC10857y3 a;

    @XP0
    public static final long c() {
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null) {
            return abstractC10857y3.a();
        }
        return System.currentTimeMillis();
    }

    public static final void d(@Nullable AbstractC10857y3 abstractC10857y3) {
        a = abstractC10857y3;
    }

    @XP0
    public static final long e() {
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null) {
            return abstractC10857y3.b();
        }
        return System.nanoTime();
    }

    @XP0
    public static final void f(Object obj, long j) {
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null) {
            abstractC10857y3.c(obj, j);
        } else {
            LockSupport.parkNanos(obj, j);
        }
    }

    @XP0
    public static final void g() {
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null) {
            abstractC10857y3.d();
        }
    }

    @XP0
    public static final void h() {
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null) {
            abstractC10857y3.e();
        }
    }

    @XP0
    public static final void i() {
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null) {
            abstractC10857y3.f();
        }
    }

    @XP0
    public static final void j(Thread thread) {
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null) {
            abstractC10857y3.g(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    @XP0
    public static final void k() {
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null) {
            abstractC10857y3.h();
        }
    }

    @XP0
    public static final Runnable l(Runnable runnable) {
        Runnable i;
        AbstractC10857y3 abstractC10857y3 = a;
        if (abstractC10857y3 != null && (i = abstractC10857y3.i(runnable)) != null) {
            return i;
        }
        return runnable;
    }
}
