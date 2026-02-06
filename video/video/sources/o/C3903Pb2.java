package o;

import o.GE0;

@InterfaceC7070ia0
/* renamed from: o.Pb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3903Pb2<N> extends AbstractC5939dy0<N> implements InterfaceC5412bn1<N> {
    public final InterfaceC4729Xn1<N, GE0.a> a;

    public C3903Pb2(S0<? super N> s0) {
        this.a = new C4097Rb2(s0);
    }

    @Override // o.InterfaceC5412bn1
    public boolean H(N n, N n2) {
        if (this.a.L(n, n2, GE0.a.EDGE_EXISTS) == null) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC5939dy0
    public InterfaceC6870hl<N> Q() {
        return this.a;
    }

    @Override // o.InterfaceC5412bn1
    public boolean o(N n) {
        return this.a.o(n);
    }

    @Override // o.InterfaceC5412bn1
    public boolean q(N n) {
        return this.a.q(n);
    }

    @Override // o.InterfaceC5412bn1
    public boolean r(N n, N n2) {
        if (this.a.r(n, n2) != null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC5412bn1
    public boolean t(AbstractC4099Rc0<N> abstractC4099Rc0) {
        P(abstractC4099Rc0);
        return r(abstractC4099Rc0.h(), abstractC4099Rc0.i());
    }

    @Override // o.InterfaceC5412bn1
    public boolean u(AbstractC4099Rc0<N> abstractC4099Rc0) {
        P(abstractC4099Rc0);
        return H(abstractC4099Rc0.h(), abstractC4099Rc0.i());
    }
}
