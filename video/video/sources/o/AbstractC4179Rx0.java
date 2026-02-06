package o;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@InterfaceC11149zF0
@InterfaceC6086ea0
/* renamed from: o.Rx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4179Rx0<K, V> extends AbstractC2510Ay0 implements InterfaceC4951Zs<K, V> {

    /* renamed from: o.Rx0$a */
    /* loaded from: classes3.dex */
    public static abstract class a<K, V> extends AbstractC4179Rx0<K, V> {
        public final InterfaceC4951Zs<K, V> X;

        public a(InterfaceC4951Zs<K, V> interfaceC4951Zs) {
            this.X = (InterfaceC4951Zs) C10664xF1.E(interfaceC4951Zs);
        }

        @Override // o.AbstractC4179Rx0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public final InterfaceC4951Zs<K, V> L5() {
            return this.X;
        }
    }

    @Override // o.InterfaceC4951Zs
    @MB
    public V B3(Object obj) {
        return L5().B3(obj);
    }

    @Override // o.InterfaceC4951Zs
    public V G0(K k, Callable<? extends V> callable) throws ExecutionException {
        return L5().G0(k, callable);
    }

    @Override // o.InterfaceC4951Zs
    public void J() {
        L5().J();
    }

    @Override // o.InterfaceC4951Zs
    public C8620ot J5() {
        return L5().J5();
    }

    @Override // o.InterfaceC4951Zs
    public void K5() {
        L5().K5();
    }

    @Override // o.AbstractC2510Ay0
    /* renamed from: M5 */
    public abstract InterfaceC4951Zs<K, V> L5();

    @Override // o.InterfaceC4951Zs
    public void P3(Iterable<? extends Object> iterable) {
        L5().P3(iterable);
    }

    @Override // o.InterfaceC4951Zs
    public ConcurrentMap<K, V> l() {
        return L5().l();
    }

    @Override // o.InterfaceC4951Zs
    public void l2(Object obj) {
        L5().l2(obj);
    }

    @Override // o.InterfaceC4951Zs
    public void put(K k, V v) {
        L5().put(k, v);
    }

    @Override // o.InterfaceC4951Zs
    public void putAll(Map<? extends K, ? extends V> map) {
        L5().putAll(map);
    }

    @Override // o.InterfaceC4951Zs
    public long size() {
        return L5().size();
    }

    @Override // o.InterfaceC4951Zs
    public AbstractC6044eO0<K, V> y5(Iterable<? extends Object> iterable) {
        return L5().y5(iterable);
    }
}
