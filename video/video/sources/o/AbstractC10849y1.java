package o;

import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

@InterfaceC11149zF0
@InterfaceC6086ea0
/* renamed from: o.y1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10849y1<K, V> extends AbstractC6433g0<K, V> implements Y11<K, V> {
    @Override // o.Y11
    public V C0(K k) {
        try {
            return get(k);
        } catch (ExecutionException e) {
            throw new Gy2(e.getCause());
        }
    }

    @Override // o.Y11
    public void R4(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // o.Y11, o.YA0
    public final V apply(K k) {
        return C0(k);
    }

    @Override // o.Y11
    public AbstractC6044eO0<K, V> x1(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap c0 = C7935m81.c0();
        for (K k : iterable) {
            if (!c0.containsKey(k)) {
                c0.put(k, get(k));
            }
        }
        return AbstractC6044eO0.g(c0);
    }
}
