package o;

import java.util.concurrent.atomic.AtomicBoolean;
import o.PT1;

/* renamed from: o.j9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7208j9<T> extends AtomicBoolean implements InterfaceC10929yL<T> {
    public final HM<T> X;

    /* JADX WARN: Multi-variable type inference failed */
    public C7208j9(HM<? super T> hm) {
        super(false);
        this.X = hm;
    }

    @Override // o.InterfaceC10929yL
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
