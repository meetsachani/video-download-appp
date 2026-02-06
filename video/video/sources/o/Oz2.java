package o;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public final class Oz2<N, E> extends B3<N, E> {
    public Oz2(Map<E, N> map) {
        super(map);
    }

    public static <N, E> Oz2<N, E> m() {
        return new Oz2<>(C8227nG0.i(2));
    }

    public static <N, E> Oz2<N, E> n(Map<E, N> map) {
        return new Oz2<>(RN0.K(map));
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> c() {
        return Collections.unmodifiableSet(((InterfaceC4626Wm) this.a).values());
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> l(N n) {
        return new B90(((InterfaceC4626Wm) this.a).m5(), n);
    }
}
