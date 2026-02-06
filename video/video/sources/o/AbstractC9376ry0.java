package o;

import java.util.concurrent.ExecutionException;

@InterfaceC11149zF0
@InterfaceC6086ea0
/* renamed from: o.ry0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9376ry0<K, V> extends AbstractC4179Rx0<K, V> implements Y11<K, V> {

    /* renamed from: o.ry0$a */
    /* loaded from: classes3.dex */
    public static abstract class a<K, V> extends AbstractC9376ry0<K, V> {
        public final Y11<K, V> X;

        public a(Y11<K, V> y11) {
            this.X = (Y11) C10664xF1.E(y11);
        }

        @Override // o.AbstractC9376ry0, o.AbstractC4179Rx0
        /* renamed from: N5 */
        public final Y11<K, V> M5() {
            return this.X;
        }
    }

    @Override // o.Y11
    public V C0(K k) {
        return M5().C0(k);
    }

    @Override // o.AbstractC4179Rx0
    /* renamed from: N5 */
    public abstract Y11<K, V> M5();

    @Override // o.Y11
    public void R4(K k) {
        M5().R4(k);
    }

    @Override // o.Y11, o.YA0
    public V apply(K k) {
        return M5().apply(k);
    }

    @Override // o.Y11
    public V get(K k) throws ExecutionException {
        return M5().get(k);
    }

    @Override // o.Y11
    public AbstractC6044eO0<K, V> x1(Iterable<? extends K> iterable) throws ExecutionException {
        return M5().x1(iterable);
    }
}
