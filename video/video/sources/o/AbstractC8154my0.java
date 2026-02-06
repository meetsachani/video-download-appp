package o;

import java.util.concurrent.Executor;

@InterfaceC6181ey
@InterfaceC5601ca0
@InterfaceC10420wF0
/* renamed from: o.my0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8154my0<V> extends AbstractFutureC5697cy0<V> implements InterfaceFutureC8411o11<V> {

    /* renamed from: o.my0$a */
    /* loaded from: classes3.dex */
    public static abstract class a<V> extends AbstractC8154my0<V> {
        public final InterfaceFutureC8411o11<V> X;

        public a(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
            this.X = (InterfaceFutureC8411o11) C10664xF1.E(interfaceFutureC8411o11);
        }

        @Override // o.AbstractC8154my0, o.AbstractFutureC5697cy0
        /* renamed from: N5 */
        public final InterfaceFutureC8411o11<V> M5() {
            return this.X;
        }
    }

    @Override // o.AbstractFutureC5697cy0
    /* renamed from: N5 */
    public abstract InterfaceFutureC8411o11<? extends V> M5();

    @Override // o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        M5().h4(runnable, executor);
    }
}
