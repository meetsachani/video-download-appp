package o;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public final class L30<N, E> extends AbstractC10359w0<N, E> {
    public L30(Map<E, N> map, Map<E, N> map2, int i) {
        super(map, map2, i);
    }

    public static <N, E> L30<N, E> n() {
        return new L30<>(C8227nG0.i(2), C8227nG0.i(2), 0);
    }

    public static <N, E> L30<N, E> o(Map<E, N> map, Map<E, N> map2, int i) {
        return new L30<>(RN0.K(map), RN0.K(map2), i);
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> a() {
        return Collections.unmodifiableSet(((InterfaceC4626Wm) this.b).values());
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> b() {
        return Collections.unmodifiableSet(((InterfaceC4626Wm) this.a).values());
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> l(N n) {
        return new B90(((InterfaceC4626Wm) this.b).m5(), n);
    }
}
