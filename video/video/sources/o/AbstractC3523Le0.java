package o;

import java.util.concurrent.locks.LockSupport;
import o.AbstractC3425Ke0;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Le0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3523Le0 extends AbstractC3327Je0 {
    @NotNull
    public abstract Thread C0();

    public void D0(long j, @NotNull AbstractC3425Ke0.c cVar) {
        TY.d1.D1(j, cVar);
    }

    public final void E0() {
        Thread C0 = C0();
        if (Thread.currentThread() != C0) {
            AbstractC10857y3 abstractC10857y3 = C11100z3.a;
            if (abstractC10857y3 != null) {
                abstractC10857y3.g(C0);
            } else {
                LockSupport.unpark(C0);
            }
        }
    }
}
