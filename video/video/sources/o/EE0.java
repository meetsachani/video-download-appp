package o;

import o.Y90;
import o.YN0;

@InterfaceC7070ia0
@L40
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class EE0<N> extends S0<N> {
    public EE0(boolean z) {
        super(z);
    }

    public static EE0<Object> e() {
        return new EE0<>(true);
    }

    public static <N> EE0<N> g(DE0<N> de0) {
        return new EE0(de0.f()).a(de0.j()).j(de0.h()).i(de0.p());
    }

    public static EE0<Object> k() {
        return new EE0<>(false);
    }

    public EE0<N> a(boolean z) {
        this.b = z;
        return this;
    }

    public <N1 extends N> InterfaceC5412bn1<N1> b() {
        return new C3903Pb2(this);
    }

    public EE0<N> d() {
        EE0<N> ee0 = new EE0<>(this.a);
        ee0.b = this.b;
        ee0.c = this.c;
        ee0.e = this.e;
        ee0.d = this.d;
        return ee0;
    }

    public EE0<N> f(int i) {
        this.e = AbstractC4468Uv1.f(Integer.valueOf(IE0.b(i)));
        return this;
    }

    public <N1 extends N> YN0.a<N1> h() {
        return new YN0.a<>(c());
    }

    public <N1 extends N> EE0<N1> i(Y90<N1> y90) {
        boolean z;
        if (y90.h() != Y90.b.UNORDERED && y90.h() != Y90.b.STABLE) {
            z = false;
        } else {
            z = true;
        }
        C10664xF1.u(z, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", y90);
        EE0<N1> c = c();
        c.d = (Y90) C10664xF1.E(y90);
        return c;
    }

    public <N1 extends N> EE0<N1> j(Y90<N1> y90) {
        EE0<N1> c = c();
        c.c = (Y90) C10664xF1.E(y90);
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N1 extends N> EE0<N1> c() {
        return this;
    }
}
