package o;

import o.GO0;
import o.Y90;

@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class EE2<N, V> extends S0<N> {
    public EE2(boolean z) {
        super(z);
    }

    public static EE2<Object, Object> e() {
        return new EE2<>(true);
    }

    public static <N, V> EE2<N, V> g(DE2<N, V> de2) {
        return new EE2(de2.f()).a(de2.j()).j(de2.h()).i(de2.p());
    }

    public static EE2<Object, Object> k() {
        return new EE2<>(false);
    }

    public EE2<N, V> a(boolean z) {
        this.b = z;
        return this;
    }

    public <N1 extends N, V1 extends V> InterfaceC4729Xn1<N1, V1> b() {
        return new C4097Rb2(this);
    }

    public EE2<N, V> d() {
        EE2<N, V> ee2 = new EE2<>(this.a);
        ee2.b = this.b;
        ee2.c = this.c;
        ee2.e = this.e;
        ee2.d = this.d;
        return ee2;
    }

    public EE2<N, V> f(int i) {
        this.e = AbstractC4468Uv1.f(Integer.valueOf(IE0.b(i)));
        return this;
    }

    public <N1 extends N, V1 extends V> GO0.a<N1, V1> h() {
        return new GO0.a<>(c());
    }

    public <N1 extends N> EE2<N1, V> i(Y90<N1> y90) {
        boolean z;
        if (y90.h() != Y90.b.UNORDERED && y90.h() != Y90.b.STABLE) {
            z = false;
        } else {
            z = true;
        }
        C10664xF1.u(z, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", y90);
        EE2<N1, V> ee2 = (EE2<N1, V>) c();
        ee2.d = (Y90) C10664xF1.E(y90);
        return ee2;
    }

    public <N1 extends N> EE2<N1, V> j(Y90<N1> y90) {
        EE2<N1, V> ee2 = (EE2<N1, V>) c();
        ee2.c = (Y90) C10664xF1.E(y90);
        return ee2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N1 extends N, V1 extends V> EE2<N1, V1> c() {
        return this;
    }
}
