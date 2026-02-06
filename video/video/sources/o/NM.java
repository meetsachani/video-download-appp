package o;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import o.PT1;

/* loaded from: classes.dex */
public final class NM<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    public final HM<R> X;

    /* JADX WARN: Multi-variable type inference failed */
    public NM(HM<? super R> hm) {
        super(false);
        this.X = hm;
    }

    public void onError(E e) {
        if (compareAndSet(false, true)) {
            HM<R> hm = this.X;
            PT1.a aVar = PT1.Y;
            hm.q(PT1.b(RT1.a(e)));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            HM<R> hm = this.X;
            PT1.a aVar = PT1.Y;
            hm.q(PT1.b(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
