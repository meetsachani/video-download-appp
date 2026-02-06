package o;

import java.util.Set;

@InterfaceC7070ia0
/* renamed from: o.Oy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3891Oy0<N, V> extends D3<N, V> {
    @MB
    public V A(AbstractC4099Rc0<N> abstractC4099Rc0, @MB V v) {
        return R().A(abstractC4099Rc0, v);
    }

    @MB
    public V B(N n, N n2, @MB V v) {
        return R().B(n, n2, v);
    }

    @Override // o.Q
    public long N() {
        return R().d().size();
    }

    public abstract DE2<N, V> R();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC6870hl, o.CF1, o.DE0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a((AbstractC3891Oy0<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b((AbstractC3891Oy0<N, V>) obj);
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public boolean c(AbstractC4099Rc0<N> abstractC4099Rc0) {
        return R().c(abstractC4099Rc0);
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public boolean e(N n, N n2) {
        return R().e(n, n2);
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public boolean f() {
        return R().f();
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public int g(N n) {
        return R().g(n);
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public Y90<N> h() {
        return R().h();
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public int i(N n) {
        return R().i(n);
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public boolean j() {
        return R().j();
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public Set<N> k(N n) {
        return R().k(n);
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public Set<N> m() {
        return R().m();
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public int n(N n) {
        return R().n(n);
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public Y90<N> p() {
        return R().p();
    }

    @Override // o.InterfaceC6870hl, o.CF1, o.DE0
    public Set<N> a(N n) {
        return R().a((DE2<N, V>) n);
    }

    @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    public Set<N> b(N n) {
        return R().b((DE2<N, V>) n);
    }
}
