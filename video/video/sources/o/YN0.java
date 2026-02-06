package o;

import java.util.Set;
import o.AbstractC6044eO0;
import o.GE0;

@NN0(containerOf = {"N"})
@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public class YN0<N> extends AbstractC5939dy0<N> {
    public final InterfaceC6870hl<N> a;

    /* loaded from: classes3.dex */
    public static class a<N> {
        public final InterfaceC5412bn1<N> a;

        public a(EE0<N> ee0) {
            this.a = ee0.d().i(Y90.g()).b();
        }

        @InterfaceC6181ey
        public a<N> a(N n) {
            this.a.q(n);
            return this;
        }

        public YN0<N> b() {
            return YN0.S(this.a);
        }

        @InterfaceC6181ey
        public a<N> c(N n, N n2) {
            this.a.H(n, n2);
            return this;
        }

        @InterfaceC6181ey
        public a<N> d(AbstractC4099Rc0<N> abstractC4099Rc0) {
            this.a.u(abstractC4099Rc0);
            return this;
        }
    }

    public YN0(InterfaceC6870hl<N> interfaceC6870hl) {
        this.a = interfaceC6870hl;
    }

    public static <N> FE0<N, GE0.a> R(DE0<N> de0, N n) {
        YA0 b = MB0.b(GE0.a.EDGE_EXISTS);
        if (de0.f()) {
            return J30.v(n, de0.l(n), b);
        }
        return Mz2.l(C7935m81.j(de0.k(n), b));
    }

    public static <N> YN0<N> S(DE0<N> de0) {
        if (de0 instanceof YN0) {
            return (YN0) de0;
        }
        return new YN0<>(new C4682Xb2(EE0.g(de0), U(de0), de0.d().size()));
    }

    @Deprecated
    public static <N> YN0<N> T(YN0<N> yn0) {
        return (YN0) C10664xF1.E(yn0);
    }

    public static <N> AbstractC6044eO0<N, FE0<N, GE0.a>> U(DE0<N> de0) {
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        for (N n : de0.m()) {
            b.i(n, R(de0, n));
        }
        return b.d();
    }

    @Override // o.AbstractC5939dy0
    public InterfaceC6870hl<N> Q() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.CF1, o.DE0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a((YN0<N>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b((YN0<N>) obj);
    }

    @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ boolean c(AbstractC4099Rc0 abstractC4099Rc0) {
        return super.c(abstractC4099Rc0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return super.g(obj);
    }

    @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ Y90 h() {
        return super.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int i(Object obj) {
        return super.i(obj);
    }

    @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ Set k(Object obj) {
        return super.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.DE0
    public /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int n(Object obj) {
        return super.n(obj);
    }

    @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
    public Y90<N> p() {
        return Y90.g();
    }
}
