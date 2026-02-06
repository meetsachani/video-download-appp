package o;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@InterfaceC6086ea0
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public interface Y11<K, V> extends InterfaceC4951Zs<K, V>, YA0<K, V> {
    V C0(K k);

    void R4(K k);

    @Override // o.YA0
    @Deprecated
    V apply(K k);

    V get(K k) throws ExecutionException;

    @Override // o.InterfaceC4951Zs
    ConcurrentMap<K, V> l();

    AbstractC6044eO0<K, V> x1(Iterable<? extends K> iterable) throws ExecutionException;
}
