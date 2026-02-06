package o;

import java.util.Objects;

@InterfaceC7070ia0
/* renamed from: o.Rb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4097Rb2<N, V> extends C4682Xb2<N, V> implements InterfaceC4729Xn1<N, V> {
    public final Y90<N> f;

    public C4097Rb2(S0<? super N> s0) {
        super(s0);
        this.f = (Y90<N>) s0.d.a();
    }

    @Override // o.InterfaceC4729Xn1
    @InterfaceC6181ey
    @MB
    public V E(AbstractC4099Rc0<N> abstractC4099Rc0, V v) {
        P(abstractC4099Rc0);
        return L(abstractC4099Rc0.h(), abstractC4099Rc0.i(), v);
    }

    @Override // o.InterfaceC4729Xn1
    @InterfaceC6181ey
    @MB
    public V L(N n, N n2, V v) {
        C10664xF1.F(n, "nodeU");
        C10664xF1.F(n2, "nodeV");
        C10664xF1.F(v, "value");
        if (!j()) {
            C10664xF1.u(!n.equals(n2), GE0.k, n);
        }
        FE0<N, V> f = this.d.f(n);
        if (f == null) {
            f = V(n);
        }
        V h = f.h(n2, v);
        FE0<N, V> f2 = this.d.f(n2);
        if (f2 == null) {
            f2 = V(n2);
        }
        f2.i(n, v);
        if (h == null) {
            long j = this.e + 1;
            this.e = j;
            IE0.e(j);
        }
        return h;
    }

    @InterfaceC6181ey
    public final FE0<N, V> V(N n) {
        boolean z;
        FE0<N, V> W = W();
        if (this.d.i(n, W) == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return W;
    }

    public final FE0<N, V> W() {
        if (f()) {
            return J30.u(this.f);
        }
        return Mz2.k(this.f);
    }

    @Override // o.InterfaceC4729Xn1
    @InterfaceC6181ey
    public boolean o(N n) {
        boolean z;
        C10664xF1.F(n, "node");
        FE0<N, V> f = this.d.f(n);
        if (f == null) {
            return false;
        }
        if (j() && f.e(n) != null) {
            f.f(n);
            this.e--;
        }
        for (N n2 : f.a()) {
            FE0<N, V> h = this.d.h(n2);
            Objects.requireNonNull(h);
            h.f(n);
            this.e--;
        }
        if (f()) {
            for (N n3 : f.b()) {
                FE0<N, V> h2 = this.d.h(n3);
                Objects.requireNonNull(h2);
                if (h2.e(n) != null) {
                    z = true;
                } else {
                    z = false;
                }
                C10664xF1.g0(z);
                this.e--;
            }
        }
        this.d.j(n);
        IE0.c(this.e);
        return true;
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public Y90<N> p() {
        return this.f;
    }

    @Override // o.InterfaceC4729Xn1
    @InterfaceC6181ey
    public boolean q(N n) {
        C10664xF1.F(n, "node");
        if (S(n)) {
            return false;
        }
        V(n);
        return true;
    }

    @Override // o.InterfaceC4729Xn1
    @InterfaceC6181ey
    @MB
    public V r(N n, N n2) {
        C10664xF1.F(n, "nodeU");
        C10664xF1.F(n2, "nodeV");
        FE0<N, V> f = this.d.f(n);
        FE0<N, V> f2 = this.d.f(n2);
        if (f != null && f2 != null) {
            V e = f.e(n2);
            if (e != null) {
                f2.f(n);
                long j = this.e - 1;
                this.e = j;
                IE0.c(j);
            }
            return e;
        }
        return null;
    }

    @Override // o.InterfaceC4729Xn1
    @InterfaceC6181ey
    @MB
    public V t(AbstractC4099Rc0<N> abstractC4099Rc0) {
        P(abstractC4099Rc0);
        return r(abstractC4099Rc0.h(), abstractC4099Rc0.i());
    }
}
