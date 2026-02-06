package o;

import java.util.concurrent.atomic.AtomicBoolean;
import o.PT1;

/* loaded from: classes.dex */
public final class OM extends AtomicBoolean implements Runnable {
    public final HM<C7458kA2> X;

    /* JADX WARN: Multi-variable type inference failed */
    public OM(HM<? super C7458kA2> hm) {
        super(false);
        this.X = hm;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            HM<C7458kA2> hm = this.X;
            PT1.a aVar = PT1.Y;
            hm.q(PT1.b(C7458kA2.a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
