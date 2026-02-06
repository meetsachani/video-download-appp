package o;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@InterfaceC7070ia0
/* renamed from: o.Xb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4682Xb2<N, V> extends D3<N, V> {
    public final boolean a;
    public final boolean b;
    public final Y90<N> c;
    public final W71<N, FE0<N, V>> d;
    public long e;

    /* renamed from: o.Xb2$a */
    /* loaded from: classes3.dex */
    public class a extends ZO0<N> {
        public final /* synthetic */ FE0 Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4682Xb2 c4682Xb2, InterfaceC6870hl interfaceC6870hl, Object obj, FE0 fe0) {
            super(interfaceC6870hl, obj);
            this.Z = fe0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<AbstractC4099Rc0<N>> iterator() {
            return this.Z.g(this.X);
        }
    }

    public C4682Xb2(S0<? super N> s0) {
        this(s0, s0.c.c(s0.e.g(10).intValue()), 0L);
    }

    @MB
    public V A(AbstractC4099Rc0<N> abstractC4099Rc0, @MB V v) {
        P(abstractC4099Rc0);
        return T(abstractC4099Rc0.h(), abstractC4099Rc0.i(), v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MB
    public V B(N n, N n2, @MB V v) {
        return (V) T(C10664xF1.E(n), C10664xF1.E(n2), v);
    }

    @Override // o.Q
    public long N() {
        return this.e;
    }

    public final FE0<N, V> R(N n) {
        FE0<N, V> f = this.d.f(n);
        if (f != null) {
            return f;
        }
        C10664xF1.E(n);
        String valueOf = String.valueOf(n);
        StringBuilder sb = new StringBuilder(valueOf.length() + 38);
        sb.append("Node ");
        sb.append(valueOf);
        sb.append(" is not an element of this graph.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean S(@MB N n) {
        return this.d.e(n);
    }

    @MB
    public final V T(N n, N n2, @MB V v) {
        V d;
        FE0<N, V> f = this.d.f(n);
        if (f == null) {
            d = null;
        } else {
            d = f.d(n2);
        }
        if (d == null) {
            return v;
        }
        return d;
    }

    public final boolean U(N n, N n2) {
        FE0<N, V> f = this.d.f(n);
        if (f != null && f.a().contains(n2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC6870hl, o.CF1, o.DE0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a((C4682Xb2<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b((C4682Xb2<N, V>) obj);
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public boolean c(AbstractC4099Rc0<N> abstractC4099Rc0) {
        C10664xF1.E(abstractC4099Rc0);
        if (O(abstractC4099Rc0) && U(abstractC4099Rc0.h(), abstractC4099Rc0.i())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public boolean e(N n, N n2) {
        return U(C10664xF1.E(n), C10664xF1.E(n2));
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public boolean f() {
        return this.a;
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public Y90<N> h() {
        return this.c;
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public boolean j() {
        return this.b;
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public Set<N> k(N n) {
        return R(n).c();
    }

    @Override // o.D3, o.Q, o.InterfaceC6870hl, o.DE2
    public Set<AbstractC4099Rc0<N>> l(N n) {
        return new a(this, this, n, R(n));
    }

    @Override // o.InterfaceC6870hl, o.DE0
    public Set<N> m() {
        return this.d.k();
    }

    @Override // o.InterfaceC6870hl, o.CF1, o.DE0
    public Set<N> a(N n) {
        return R(n).b();
    }

    @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
    public Set<N> b(N n) {
        return R(n).a();
    }

    public C4682Xb2(S0<? super N> s0, Map<N, FE0<N, V>> map, long j) {
        W71<N, FE0<N, V>> w71;
        this.a = s0.a;
        this.b = s0.b;
        this.c = (Y90<N>) s0.c.a();
        if (map instanceof TreeMap) {
            w71 = new C5254b81<>(map);
        } else {
            w71 = new W71<>(map);
        }
        this.d = w71;
        this.e = IE0.c(j);
    }
}
