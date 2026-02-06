package o;

import java.util.Objects;

@InterfaceC7070ia0
/* renamed from: o.Qb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4000Qb2<N, E> extends C4197Sb2<N, E> implements InterfaceC10305vn1<N, E> {
    public C4000Qb2(C11288zp1<? super N, ? super E> c11288zp1) {
        super(c11288zp1);
    }

    @Override // o.InterfaceC10305vn1
    @InterfaceC6181ey
    public boolean J(E e) {
        C10664xF1.F(e, "edge");
        N f = this.g.f(e);
        boolean z = false;
        if (f == null) {
            return false;
        }
        InterfaceC2773Dp1<N, E> f2 = this.f.f(f);
        Objects.requireNonNull(f2);
        InterfaceC2773Dp1<N, E> interfaceC2773Dp1 = f2;
        N h = interfaceC2773Dp1.h(e);
        InterfaceC2773Dp1<N, E> f3 = this.f.f(h);
        Objects.requireNonNull(f3);
        InterfaceC2773Dp1<N, E> interfaceC2773Dp12 = f3;
        interfaceC2773Dp1.j(e);
        if (j() && f.equals(h)) {
            z = true;
        }
        interfaceC2773Dp12.d(e, z);
        this.g.j(e);
        return true;
    }

    @Override // o.InterfaceC10305vn1
    @InterfaceC6181ey
    public boolean M(N n, N n2, E e) {
        C10664xF1.F(n, "nodeU");
        C10664xF1.F(n2, "nodeV");
        C10664xF1.F(e, "edge");
        boolean z = false;
        if (T(e)) {
            AbstractC4099Rc0<N> F = F(e);
            AbstractC4099Rc0 k = AbstractC4099Rc0.k(this, n, n2);
            C10664xF1.z(F.equals(k), GE0.h, e, F, k);
            return false;
        }
        InterfaceC2773Dp1<N, E> f = this.f.f(n);
        if (!y()) {
            if (f == null || !f.a().contains(n2)) {
                z = true;
            }
            C10664xF1.y(z, GE0.j, n, n2);
        }
        boolean equals = n.equals(n2);
        if (!j()) {
            C10664xF1.u(!equals, GE0.k, n);
        }
        if (f == null) {
            f = V(n);
        }
        f.e(e, n2);
        InterfaceC2773Dp1<N, E> f2 = this.f.f(n2);
        if (f2 == null) {
            f2 = V(n2);
        }
        f2.f(e, n, equals);
        this.g.i(e, n);
        return true;
    }

    @InterfaceC6181ey
    public final InterfaceC2773Dp1<N, E> V(N n) {
        boolean z;
        InterfaceC2773Dp1<N, E> W = W();
        if (this.f.i(n, W) == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return W;
    }

    public final InterfaceC2773Dp1<N, E> W() {
        if (f()) {
            if (y()) {
                return K30.p();
            }
            return L30.n();
        } else if (y()) {
            return Nz2.p();
        } else {
            return Oz2.m();
        }
    }

    @Override // o.InterfaceC10305vn1
    @InterfaceC6181ey
    public boolean o(N n) {
        C10664xF1.F(n, "node");
        InterfaceC2773Dp1<N, E> f = this.f.f(n);
        if (f == null) {
            return false;
        }
        AbstractC6237fB2<E> it = AbstractC5317bO0.F(f.g()).iterator();
        while (it.hasNext()) {
            J(it.next());
        }
        this.f.j(n);
        return true;
    }

    @Override // o.InterfaceC10305vn1
    @InterfaceC6181ey
    public boolean q(N n) {
        C10664xF1.F(n, "node");
        if (U(n)) {
            return false;
        }
        V(n);
        return true;
    }

    @Override // o.InterfaceC10305vn1
    @InterfaceC6181ey
    public boolean z(AbstractC4099Rc0<N> abstractC4099Rc0, E e) {
        Q(abstractC4099Rc0);
        return M(abstractC4099Rc0.h(), abstractC4099Rc0.i(), e);
    }
}
