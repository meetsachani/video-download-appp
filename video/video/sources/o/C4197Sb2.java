package o;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

@InterfaceC7070ia0
/* renamed from: o.Sb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4197Sb2<N, E> extends AbstractC8900q2<N, E> {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Y90<N> d;
    public final Y90<E> e;
    public final W71<N, InterfaceC2773Dp1<N, E>> f;
    public final W71<E, N> g;

    public C4197Sb2(C11288zp1<? super N, ? super E> c11288zp1) {
        this(c11288zp1, c11288zp1.c.c(c11288zp1.e.g(10).intValue()), c11288zp1.g.c(c11288zp1.h.g(20).intValue()));
    }

    @Override // o.InterfaceC10802xp1
    public AbstractC4099Rc0<N> F(E e) {
        N S = S(e);
        InterfaceC2773Dp1<N, E> f = this.f.f(S);
        Objects.requireNonNull(f);
        return AbstractC4099Rc0.k(this, S, f.h(e));
    }

    @Override // o.InterfaceC10802xp1
    public Y90<E> I() {
        return this.e;
    }

    @Override // o.InterfaceC10802xp1
    public Set<E> K(N n) {
        return R(n).i();
    }

    public final InterfaceC2773Dp1<N, E> R(N n) {
        InterfaceC2773Dp1<N, E> f = this.f.f(n);
        if (f != null) {
            return f;
        }
        C10664xF1.E(n);
        throw new IllegalArgumentException(String.format(GE0.f, n));
    }

    public final N S(E e) {
        N f = this.g.f(e);
        if (f != null) {
            return f;
        }
        C10664xF1.E(e);
        throw new IllegalArgumentException(String.format(GE0.g, e));
    }

    public final boolean T(E e) {
        return this.g.e(e);
    }

    public final boolean U(N n) {
        return this.f.e(n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC10802xp1, o.CF1, o.DE0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a((C4197Sb2<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC10802xp1, o.InterfaceC5631ch2, o.DE0
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b((C4197Sb2<N, E>) obj);
    }

    @Override // o.InterfaceC10802xp1
    public Set<E> d() {
        return this.g.k();
    }

    @Override // o.InterfaceC10802xp1
    public boolean f() {
        return this.a;
    }

    @Override // o.InterfaceC10802xp1
    public Y90<N> h() {
        return this.d;
    }

    @Override // o.InterfaceC10802xp1
    public boolean j() {
        return this.c;
    }

    @Override // o.InterfaceC10802xp1
    public Set<N> k(N n) {
        return R(n).c();
    }

    @Override // o.InterfaceC10802xp1
    public Set<E> l(N n) {
        return R(n).g();
    }

    @Override // o.InterfaceC10802xp1
    public Set<N> m() {
        return this.f.k();
    }

    @Override // o.InterfaceC10802xp1
    public Set<E> v(N n) {
        return R(n).k();
    }

    @Override // o.AbstractC8900q2, o.InterfaceC10802xp1
    public Set<E> x(N n, N n2) {
        InterfaceC2773Dp1<N, E> R = R(n);
        if (!this.c && n == n2) {
            return AbstractC9481sO0.M();
        }
        C10664xF1.u(U(n2), GE0.f, n2);
        return R.l(n2);
    }

    @Override // o.InterfaceC10802xp1
    public boolean y() {
        return this.b;
    }

    @Override // o.InterfaceC10802xp1, o.CF1, o.DE0
    public Set<N> a(N n) {
        return R(n).b();
    }

    @Override // o.InterfaceC10802xp1, o.InterfaceC5631ch2, o.DE0
    public Set<N> b(N n) {
        return R(n).a();
    }

    public C4197Sb2(C11288zp1<? super N, ? super E> c11288zp1, Map<N, InterfaceC2773Dp1<N, E>> map, Map<E, N> map2) {
        W71<N, InterfaceC2773Dp1<N, E>> w71;
        this.a = c11288zp1.a;
        this.b = c11288zp1.f;
        this.c = c11288zp1.b;
        this.d = (Y90<N>) c11288zp1.c.a();
        this.e = (Y90<E>) c11288zp1.g.a();
        if (map instanceof TreeMap) {
            w71 = new C5254b81<>(map);
        } else {
            w71 = new W71<>(map);
        }
        this.f = w71;
        this.g = new W71<>(map2);
    }
}
