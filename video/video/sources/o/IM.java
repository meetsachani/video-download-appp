package o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import o.PT1;

/* loaded from: classes.dex */
public final class IM<T> extends AtomicBoolean implements Consumer<T> {
    public final HM<T> X;

    /* JADX WARN: Multi-variable type inference failed */
    public IM(HM<? super T> hm) {
        super(false);
        this.X = hm;
    }

    @Override // java.util.function.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            HM<T> hm = this.X;
            PT1.a aVar = PT1.Y;
            hm.q(PT1.b(t));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
