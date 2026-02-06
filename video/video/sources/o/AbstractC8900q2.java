package o;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@InterfaceC7070ia0
@InterfaceC4238Sm
/* renamed from: o.q2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8900q2<N, E> implements InterfaceC10802xp1<N, E> {

    /* renamed from: o.q2$a */
    /* loaded from: classes3.dex */
    public class a extends R0<N> {

        /* renamed from: o.q2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0323a extends AbstractSet<AbstractC4099Rc0<N>> {

            /* renamed from: o.q2$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0324a implements YA0<E, AbstractC4099Rc0<N>> {
                public C0324a() {
                }

                @Override // o.YA0
                /* renamed from: a */
                public AbstractC4099Rc0<N> apply(E e) {
                    return AbstractC8900q2.this.F(e);
                }
            }

            public C0323a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@MB Object obj) {
                if (!(obj instanceof AbstractC4099Rc0)) {
                    return false;
                }
                AbstractC4099Rc0<?> abstractC4099Rc0 = (AbstractC4099Rc0) obj;
                if (!a.this.O(abstractC4099Rc0) || !a.this.m().contains(abstractC4099Rc0.h()) || !a.this.b((a) abstractC4099Rc0.h()).contains(abstractC4099Rc0.i())) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<AbstractC4099Rc0<N>> iterator() {
                return C7052iU0.c0(AbstractC8900q2.this.d().iterator(), new C0324a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractC8900q2.this.d().size();
            }
        }

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
            if (AbstractC8900q2.this.y()) {
                return super.d();
            }
            return new C0323a();
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public boolean f() {
            return AbstractC8900q2.this.f();
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public Y90<N> h() {
            return AbstractC8900q2.this.h();
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public boolean j() {
            return AbstractC8900q2.this.j();
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public Set<N> k(N n) {
            return AbstractC8900q2.this.k(n);
        }

        @Override // o.InterfaceC6870hl, o.DE0
        public Set<N> m() {
            return AbstractC8900q2.this.m();
        }

        @Override // o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public Y90<N> p() {
            return Y90.i();
        }

        @Override // o.InterfaceC6870hl, o.CF1, o.DE0
        public Set<N> a(N n) {
            return AbstractC8900q2.this.a((AbstractC8900q2) n);
        }

        @Override // o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
        public Set<N> b(N n) {
            return AbstractC8900q2.this.b((AbstractC8900q2) n);
        }
    }

    /* renamed from: o.q2$b */
    /* loaded from: classes3.dex */
    public class b implements IF1<E> {
        public final /* synthetic */ Object X;
        public final /* synthetic */ Object Y;

        public b(Object obj, Object obj2) {
            this.X = obj;
            this.Y = obj2;
        }

        @Override // o.IF1
        public boolean apply(E e) {
            return AbstractC8900q2.this.F(e).d((N) this.X).equals(this.Y);
        }
    }

    /* renamed from: o.q2$c */
    /* loaded from: classes3.dex */
    public class c implements YA0<E, AbstractC4099Rc0<N>> {
        public final /* synthetic */ InterfaceC10802xp1 X;

        public c(InterfaceC10802xp1 interfaceC10802xp1) {
            this.X = interfaceC10802xp1;
        }

        @Override // o.YA0
        /* renamed from: a */
        public AbstractC4099Rc0<N> apply(E e) {
            return this.X.F(e);
        }
    }

    public static <N, E> Map<E, AbstractC4099Rc0<N>> O(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        return C7935m81.j(interfaceC10802xp1.d(), new c(interfaceC10802xp1));
    }

    @Override // o.InterfaceC10802xp1
    public Set<E> C(AbstractC4099Rc0<N> abstractC4099Rc0) {
        Q(abstractC4099Rc0);
        return x(abstractC4099Rc0.h(), abstractC4099Rc0.i());
    }

    @Override // o.InterfaceC10802xp1
    @MB
    public E D(N n, N n2) {
        Set<E> x = x(n, n2);
        int size = x.size();
        if (size != 0) {
            if (size == 1) {
                return x.iterator().next();
            }
            throw new IllegalArgumentException(String.format(GE0.i, n, n2));
        }
        return null;
    }

    @Override // o.InterfaceC10802xp1
    @MB
    public E G(AbstractC4099Rc0<N> abstractC4099Rc0) {
        Q(abstractC4099Rc0);
        return D(abstractC4099Rc0.h(), abstractC4099Rc0.i());
    }

    public final IF1<E> N(N n, N n2) {
        return new b(n, n2);
    }

    public final boolean P(AbstractC4099Rc0<?> abstractC4099Rc0) {
        if (!abstractC4099Rc0.e() && f()) {
            return false;
        }
        return true;
    }

    public final void Q(AbstractC4099Rc0<?> abstractC4099Rc0) {
        C10664xF1.E(abstractC4099Rc0);
        C10664xF1.e(P(abstractC4099Rc0), GE0.n);
    }

    @Override // o.InterfaceC10802xp1
    public boolean c(AbstractC4099Rc0<N> abstractC4099Rc0) {
        C10664xF1.E(abstractC4099Rc0);
        if (!P(abstractC4099Rc0)) {
            return false;
        }
        return e(abstractC4099Rc0.h(), abstractC4099Rc0.i());
    }

    @Override // o.InterfaceC10802xp1
    public boolean e(N n, N n2) {
        C10664xF1.E(n);
        C10664xF1.E(n2);
        if (m().contains(n) && b((AbstractC8900q2<N, E>) n).contains(n2)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10802xp1
    public final boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC10802xp1)) {
            return false;
        }
        InterfaceC10802xp1 interfaceC10802xp1 = (InterfaceC10802xp1) obj;
        if (f() == interfaceC10802xp1.f() && m().equals(interfaceC10802xp1.m()) && O(this).equals(O(interfaceC10802xp1))) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10802xp1
    public int g(N n) {
        if (f()) {
            return C9979uR0.t(K(n).size(), v(n).size());
        }
        return C9979uR0.t(l(n).size(), x(n, n).size());
    }

    @Override // o.InterfaceC10802xp1
    public final int hashCode() {
        return O(this).hashCode();
    }

    @Override // o.InterfaceC10802xp1
    public int i(N n) {
        if (f()) {
            return v(n).size();
        }
        return g(n);
    }

    @Override // o.InterfaceC10802xp1
    public int n(N n) {
        if (f()) {
            return K(n).size();
        }
        return g(n);
    }

    @Override // o.InterfaceC10802xp1
    public DE0<N> s() {
        return new a();
    }

    public String toString() {
        boolean f = f();
        boolean y = y();
        boolean j = j();
        String valueOf = String.valueOf(m());
        String valueOf2 = String.valueOf(O(this));
        StringBuilder sb = new StringBuilder(valueOf.length() + 87 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(f);
        sb.append(", allowsParallelEdges: ");
        sb.append(y);
        sb.append(", allowsSelfLoops: ");
        sb.append(j);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }

    @Override // o.InterfaceC10802xp1
    public Set<E> w(E e) {
        AbstractC4099Rc0<N> F = F(e);
        return C10856y22.f(C10856y22.N(l(F.h()), l(F.i())), AbstractC9481sO0.Q(e));
    }

    @Override // o.InterfaceC10802xp1
    public Set<E> x(N n, N n2) {
        Set<E> v = v(n);
        Set<E> K = K(n2);
        if (v.size() <= K.size()) {
            return Collections.unmodifiableSet(C10856y22.i(v, N(n, n2)));
        }
        return Collections.unmodifiableSet(C10856y22.i(K, N(n2, n)));
    }
}
