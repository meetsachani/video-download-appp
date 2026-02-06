package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import o.Q;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public abstract class Q<N> implements InterfaceC6870hl<N> {

    /* loaded from: classes3.dex */
    public class a extends AbstractSet<AbstractC4099Rc0<N>> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (!(obj instanceof AbstractC4099Rc0)) {
                return false;
            }
            AbstractC4099Rc0<?> abstractC4099Rc0 = (AbstractC4099Rc0) obj;
            if (!Q.this.O(abstractC4099Rc0) || !Q.this.m().contains(abstractC4099Rc0.h()) || !Q.this.b((Q) abstractC4099Rc0.h()).contains(abstractC4099Rc0.i())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public AbstractC6237fB2<AbstractC4099Rc0<N>> iterator() {
            return AbstractC4199Sc0.f(Q.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C7775lT0.x(Q.this.N());
        }
    }

    /* loaded from: classes3.dex */
    public class b extends ZO0<N> {
        public b(Q q, InterfaceC6870hl interfaceC6870hl, Object obj) {
            super(interfaceC6870hl, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: h */
        public AbstractC6237fB2<AbstractC4099Rc0<N>> iterator() {
            if (this.Y.f()) {
                return C7052iU0.e0(C7052iU0.j(C7052iU0.c0(this.Y.a((InterfaceC6870hl<N>) this.X).iterator(), new YA0() { // from class: o.S
                    @Override // o.YA0
                    public final Object apply(Object obj) {
                        AbstractC4099Rc0 l;
                        l = AbstractC4099Rc0.l(obj, Q.b.this.X);
                        return l;
                    }
                }), C7052iU0.c0(C10856y22.f(this.Y.b((InterfaceC6870hl<N>) this.X), AbstractC9481sO0.Q(this.X)).iterator(), new YA0() { // from class: o.T
                    @Override // o.YA0
                    public final Object apply(Object obj) {
                        AbstractC4099Rc0 l;
                        l = AbstractC4099Rc0.l(Q.b.this.X, obj);
                        return l;
                    }
                })));
            }
            return C7052iU0.e0(C7052iU0.c0(this.Y.k(this.X).iterator(), new YA0() { // from class: o.U
                @Override // o.YA0
                public final Object apply(Object obj) {
                    AbstractC4099Rc0 w;
                    w = AbstractC4099Rc0.w(Q.b.this.X, obj);
                    return w;
                }
            }));
        }
    }

    public long N() {
        Iterator<N> it;
        boolean z;
        long j = 0;
        while (m().iterator().hasNext()) {
            j += g(it.next());
        }
        if ((1 & j) == 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return j >>> 1;
    }

    public final boolean O(AbstractC4099Rc0<?> abstractC4099Rc0) {
        if (!abstractC4099Rc0.e() && f()) {
            return false;
        }
        return true;
    }

    public final void P(AbstractC4099Rc0<?> abstractC4099Rc0) {
        C10664xF1.E(abstractC4099Rc0);
        C10664xF1.e(O(abstractC4099Rc0), GE0.n);
    }

    @Override // o.InterfaceC6870hl, o.DE2
    public boolean c(AbstractC4099Rc0<N> abstractC4099Rc0) {
        C10664xF1.E(abstractC4099Rc0);
        if (!O(abstractC4099Rc0)) {
            return false;
        }
        N h = abstractC4099Rc0.h();
        N i = abstractC4099Rc0.i();
        if (!m().contains(h) || !b((Q<N>) h).contains(i)) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC6870hl, o.DE2
    public Set<AbstractC4099Rc0<N>> d() {
        return new a();
    }

    @Override // o.InterfaceC6870hl, o.DE2
    public boolean e(N n, N n2) {
        C10664xF1.E(n);
        C10664xF1.E(n2);
        if (m().contains(n) && b((Q<N>) n).contains(n2)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6870hl, o.DE2
    public int g(N n) {
        int i;
        if (f()) {
            return C9979uR0.t(a((Q<N>) n).size(), b((Q<N>) n).size());
        }
        Set<N> k = k(n);
        if (j() && k.contains(n)) {
            i = 1;
        } else {
            i = 0;
        }
        return C9979uR0.t(k.size(), i);
    }

    @Override // o.InterfaceC6870hl, o.DE2
    public int i(N n) {
        if (f()) {
            return b((Q<N>) n).size();
        }
        return g(n);
    }

    @Override // o.InterfaceC6870hl, o.DE2
    public Set<AbstractC4099Rc0<N>> l(N n) {
        C10664xF1.E(n);
        C10664xF1.u(m().contains(n), GE0.f, n);
        return new b(this, this, n);
    }

    @Override // o.InterfaceC6870hl, o.DE2
    public int n(N n) {
        if (f()) {
            return a((Q<N>) n).size();
        }
        return g(n);
    }

    @Override // o.InterfaceC6870hl, o.DE2
    public Y90<N> p() {
        return Y90.i();
    }
}
