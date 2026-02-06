package o;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public abstract class D3<N, V> extends Q<N> implements DE2<N, V> {

    /* loaded from: classes3.dex */
    public class a extends R0<N> {
        public a() {
        }

        @Override // o.InterfaceC6870hl, o.CF1, o.DE0
        public /* bridge */ /* synthetic */ Iterable a(Object obj) {
            return a((a) obj);
        }

        @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
        public /* bridge */ /* synthetic */ Iterable b(Object obj) {
            return b((a) obj);
        }

        @Override // o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public Set<AbstractC4099Rc0<N>> d() {
            return D3.this.d();
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public boolean f() {
            return D3.this.f();
        }

        @Override // o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public int g(N n) {
            return D3.this.g(n);
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public Y90<N> h() {
            return D3.this.h();
        }

        @Override // o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public int i(N n) {
            return D3.this.i(n);
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public boolean j() {
            return D3.this.j();
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public Set<N> k(N n) {
            return D3.this.k(n);
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public Set<N> m() {
            return D3.this.m();
        }

        @Override // o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public int n(N n) {
            return D3.this.n(n);
        }

        @Override // o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public Y90<N> p() {
            return D3.this.p();
        }

        @Override // o.InterfaceC6870hl, o.CF1, o.DE0
        public Set<N> a(N n) {
            return D3.this.a((D3) n);
        }

        @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
        public Set<N> b(N n) {
            return D3.this.b((D3) n);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements YA0<AbstractC4099Rc0<N>, V> {
        public final /* synthetic */ DE2 X;

        public b(DE2 de2) {
            this.X = de2;
        }

        @Override // o.YA0
        /* renamed from: a */
        public V apply(AbstractC4099Rc0<N> abstractC4099Rc0) {
            V v = (V) this.X.B(abstractC4099Rc0.h(), abstractC4099Rc0.i(), null);
            Objects.requireNonNull(v);
            return v;
        }
    }

    public static <N, V> Map<AbstractC4099Rc0<N>, V> Q(DE2<N, V> de2) {
        return C7935m81.j(de2.d(), new b(de2));
    }

    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ boolean c(AbstractC4099Rc0 abstractC4099Rc0) {
        return super.c(abstractC4099Rc0);
    }

    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // o.DE2
    public final boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DE2)) {
            return false;
        }
        DE2 de2 = (DE2) obj;
        if (f() == de2.f() && m().equals(de2.m()) && Q(this).equals(Q(de2))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return super.g(obj);
    }

    @Override // o.DE2
    public final int hashCode() {
        return Q(this).hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int i(Object obj) {
        return super.i(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ int n(Object obj) {
        return super.n(obj);
    }

    @Override // o.Q, o.InterfaceC6870hl, o.DE2
    public /* bridge */ /* synthetic */ Y90 p() {
        return super.p();
    }

    @Override // o.DE2
    public DE0<N> s() {
        return new a();
    }

    public String toString() {
        boolean f = f();
        boolean j = j();
        String valueOf = String.valueOf(m());
        String valueOf2 = String.valueOf(Q(this));
        StringBuilder sb = new StringBuilder(valueOf.length() + 59 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(f);
        sb.append(", allowsSelfLoops: ");
        sb.append(j);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
