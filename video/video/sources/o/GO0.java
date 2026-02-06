package o;

import java.util.Objects;
import java.util.Set;
import o.AbstractC6044eO0;

@NN0(containerOf = {"N", C2638Cg0.X4})
@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class GO0<N, V> extends C4682Xb2<N, V> {

    /* loaded from: classes3.dex */
    public static class a<N, V> {
        public final InterfaceC4729Xn1<N, V> a;

        public a(EE2<N, V> ee2) {
            this.a = ee2.d().i(Y90.g()).b();
        }

        @InterfaceC6181ey
        public a<N, V> a(N n) {
            this.a.q(n);
            return this;
        }

        public GO0<N, V> b() {
            return GO0.Z(this.a);
        }

        @InterfaceC6181ey
        public a<N, V> c(N n, N n2, V v) {
            this.a.L(n, n2, v);
            return this;
        }

        @InterfaceC6181ey
        public a<N, V> d(AbstractC4099Rc0<N> abstractC4099Rc0, V v) {
            this.a.E(abstractC4099Rc0, v);
            return this;
        }
    }

    public GO0(DE2<N, V> de2) {
        super(EE2.g(de2), a0(de2), de2.d().size());
    }

    public static /* synthetic */ Object V(DE2 de2, Object obj, Object obj2) {
        Object B = de2.B(obj, obj2, null);
        Objects.requireNonNull(B);
        return B;
    }

    public static <N, V> FE0<N, V> X(final DE2<N, V> de2, final N n) {
        YA0 ya0 = new YA0() { // from class: o.FO0
            @Override // o.YA0
            public final Object apply(Object obj) {
                return GO0.V(DE2.this, n, obj);
            }
        };
        if (de2.f()) {
            return J30.v(n, de2.l(n), ya0);
        }
        return Mz2.l(C7935m81.j(de2.k(n), ya0));
    }

    @Deprecated
    public static <N, V> GO0<N, V> Y(GO0<N, V> go0) {
        return (GO0) C10664xF1.E(go0);
    }

    public static <N, V> GO0<N, V> Z(DE2<N, V> de2) {
        if (de2 instanceof GO0) {
            return (GO0) de2;
        }
        return new GO0<>(de2);
    }

    public static <N, V> AbstractC6044eO0<N, FE0<N, V>> a0(DE2<N, V> de2) {
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        for (N n : de2.m()) {
            b.i(n, X(de2, n));
        }
        return b.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4682Xb2, o.DE2
    @MB
    public /* bridge */ /* synthetic */ Object A(AbstractC4099Rc0 abstractC4099Rc0, @MB Object obj) {
        return super.A(abstractC4099Rc0, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4682Xb2, o.DE2
    @MB
    public /* bridge */ /* synthetic */ Object B(Object obj, Object obj2, @MB Object obj3) {
        return super.B(obj, obj2, obj3);
    }

    @Override // o.D3, o.DE2
    /* renamed from: W */
    public YN0<N> s() {
        return new YN0<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4682Xb2, o.InterfaceC6870hl, o.CF1, o.DE0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a((GO0<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4682Xb2, o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b((GO0<N, V>) obj);
    }

    @Override // o.C4682Xb2, o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ boolean c(AbstractC4099Rc0 abstractC4099Rc0) {
        return super.c(abstractC4099Rc0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4682Xb2, o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // o.C4682Xb2, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    @Override // o.C4682Xb2, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ Y90 h() {
        return super.h();
    }

    @Override // o.C4682Xb2, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4682Xb2, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ Set k(Object obj) {
        return super.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4682Xb2, o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    @Override // o.C4682Xb2, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public Y90<N> p() {
        return Y90.g();
    }
}
