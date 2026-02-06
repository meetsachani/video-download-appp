package o;

import java.util.Set;

@InterfaceC7070ia0
@L40("Use GraphBuilder to create a real instance")
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public interface DE0<N> extends InterfaceC6870hl<N> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    /* bridge */ /* synthetic */ default Iterable a(Object obj) {
        return a((DE0<N>) obj);
    }

    @Override // o.InterfaceC6870hl, o.CF1, o.DE0
    Set<N> a(N n);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    /* bridge */ /* synthetic */ default Iterable b(Object obj) {
        return b((DE0<N>) obj);
    }

    @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    Set<N> b(N n);

    @Override // o.InterfaceC6870hl, o.DE2
    boolean c(AbstractC4099Rc0<N> abstractC4099Rc0);

    @Override // o.InterfaceC6870hl, o.DE2
    Set<AbstractC4099Rc0<N>> d();

    @Override // o.InterfaceC6870hl, o.DE2
    boolean e(N n, N n2);

    boolean equals(@MB Object obj);

    @Override // 
    boolean f();

    @Override // o.InterfaceC6870hl, o.DE2
    int g(N n);

    @Override // 
    Y90<N> h();

    int hashCode();

    @Override // o.InterfaceC6870hl, o.DE2
    int i(N n);

    @Override // 
    boolean j();

    @Override // 
    Set<N> k(N n);

    @Override // o.InterfaceC6870hl, o.DE2
    Set<AbstractC4099Rc0<N>> l(N n);

    @Override // 
    Set<N> m();

    @Override // o.InterfaceC6870hl, o.DE2
    int n(N n);

    @Override // o.InterfaceC6870hl, o.DE2
    Y90<N> p();
}
