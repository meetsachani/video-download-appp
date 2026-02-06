package o;

import java.util.Set;

@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public interface DE2<N, V> extends InterfaceC6870hl<N> {
    @MB
    V A(AbstractC4099Rc0<N> abstractC4099Rc0, @MB V v);

    @MB
    V B(N n, N n2, @MB V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC6870hl, o.CF1, o.DE0
    /* bridge */ /* synthetic */ default Iterable a(Object obj) {
        return a((DE2<N, V>) obj);
    }

    @Override // o.InterfaceC6870hl, o.CF1, o.DE0
    Set<N> a(N n);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    /* bridge */ /* synthetic */ default Iterable b(Object obj) {
        return b((DE2<N, V>) obj);
    }

    @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    Set<N> b(N n);

    @Override // 
    boolean c(AbstractC4099Rc0<N> abstractC4099Rc0);

    @Override // 
    Set<AbstractC4099Rc0<N>> d();

    @Override // 
    boolean e(N n, N n2);

    boolean equals(@MB Object obj);

    @Override // o.InterfaceC6870hl, o.DE0
    boolean f();

    @Override // 
    int g(N n);

    @Override // o.InterfaceC6870hl, o.DE0
    Y90<N> h();

    int hashCode();

    @Override // 
    int i(N n);

    @Override // o.InterfaceC6870hl, o.DE0
    boolean j();

    @Override // o.InterfaceC6870hl, o.DE0
    Set<N> k(N n);

    @Override // 
    Set<AbstractC4099Rc0<N>> l(N n);

    @Override // o.InterfaceC6870hl, o.DE0
    Set<N> m();

    @Override // 
    int n(N n);

    @Override // 
    Y90<N> p();

    DE0<N> s();
}
