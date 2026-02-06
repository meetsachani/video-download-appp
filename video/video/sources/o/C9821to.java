package o;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* renamed from: o.to  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9821to<T> extends AbstractC9384s0<T> {
    @NotNull
    public final Thread Y0;
    @Nullable
    public final AbstractC3327Je0 Z0;

    public C9821to(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Thread thread, @Nullable AbstractC3327Je0 abstractC3327Je0) {
        super(interfaceC5809dQ, true, true);
        this.Y0 = thread;
        this.Z0 = abstractC3327Je0;
    }

    public final T T1() {
        long j;
        AbstractC10857y3 abstractC10857y3 = C11100z3.a;
        if (abstractC10857y3 != null) {
            abstractC10857y3.d();
        }
        try {
            AbstractC3327Je0 abstractC3327Je0 = this.Z0;
            QH qh = null;
            if (abstractC3327Je0 != null) {
                AbstractC3327Je0.n0(abstractC3327Je0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                AbstractC3327Je0 abstractC3327Je02 = this.Z0;
                if (abstractC3327Je02 != null) {
                    j = abstractC3327Je02.y0();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!l()) {
                    AbstractC10857y3 abstractC10857y32 = C11100z3.a;
                    if (abstractC10857y32 != null) {
                        abstractC10857y32.c(this, j);
                    } else {
                        LockSupport.parkNanos(this, j);
                    }
                } else {
                    AbstractC3327Je0 abstractC3327Je03 = this.Z0;
                    if (abstractC3327Je03 != null) {
                        AbstractC3327Je0.g0(abstractC3327Je03, false, 1, null);
                    }
                    T t = (T) C7055iV0.h(U0());
                    if (t instanceof QH) {
                        qh = (QH) t;
                    }
                    if (qh == null) {
                        return t;
                    }
                    throw qh.a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            v0(interruptedException);
            throw interruptedException;
        } finally {
            AbstractC10857y3 abstractC10857y33 = C11100z3.a;
            if (abstractC10857y33 != null) {
                abstractC10857y33.h();
            }
        }
    }

    @Override // o.C6812hV0
    public boolean f1() {
        return true;
    }

    @Override // o.C6812hV0
    public void s0(@Nullable Object obj) {
        if (!C6562gT0.g(Thread.currentThread(), this.Y0)) {
            Thread thread = this.Y0;
            AbstractC10857y3 abstractC10857y3 = C11100z3.a;
            if (abstractC10857y3 != null) {
                abstractC10857y3.g(thread);
            } else {
                LockSupport.unpark(thread);
            }
        }
    }
}
