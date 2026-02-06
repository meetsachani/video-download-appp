package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class IE0 {

    /* loaded from: classes3.dex */
    public enum a {
        PENDING,
        COMPLETE
    }

    /* loaded from: classes3.dex */
    public static class b<N> extends AbstractC5939dy0<N> {
        public final DE0<N> a;

        /* loaded from: classes3.dex */
        public class a extends ZO0<N> {

            /* renamed from: o.IE0$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0189a implements YA0<AbstractC4099Rc0<N>, AbstractC4099Rc0<N>> {
                public C0189a() {
                }

                @Override // o.YA0
                /* renamed from: a */
                public AbstractC4099Rc0<N> apply(AbstractC4099Rc0<N> abstractC4099Rc0) {
                    return AbstractC4099Rc0.j(b.this.Q(), abstractC4099Rc0.i(), abstractC4099Rc0.h());
                }
            }

            public a(InterfaceC6870hl interfaceC6870hl, Object obj) {
                super(interfaceC6870hl, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<AbstractC4099Rc0<N>> iterator() {
                return C7052iU0.c0(b.this.Q().l(this.X).iterator(), new C0189a());
            }
        }

        public b(DE0<N> de0) {
            this.a = de0;
        }

        @Override // o.AbstractC5939dy0
        /* renamed from: S */
        public DE0<N> Q() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.CF1, o.DE0
        public /* bridge */ /* synthetic */ Iterable a(Object obj) {
            return a((b<N>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
        public /* bridge */ /* synthetic */ Iterable b(Object obj) {
            return b((b<N>) obj);
        }

        @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public boolean c(AbstractC4099Rc0<N> abstractC4099Rc0) {
            return Q().c(IE0.q(abstractC4099Rc0));
        }

        @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public boolean e(N n, N n2) {
            return Q().e(n2, n);
        }

        @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public int i(N n) {
            return Q().n(n);
        }

        @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public Set<AbstractC4099Rc0<N>> l(N n) {
            return new a(this, n);
        }

        @Override // o.AbstractC5939dy0, o.R0, o.Q, o.InterfaceC6870hl, o.DE2
        public int n(N n) {
            return Q().i(n);
        }

        @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.CF1, o.DE0
        public Set<N> a(N n) {
            return Q().b((DE0<N>) n);
        }

        @Override // o.AbstractC5939dy0, o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
        public Set<N> b(N n) {
            return Q().a((DE0<N>) n);
        }
    }

    /* loaded from: classes3.dex */
    public static class c<N, E> extends AbstractC11323zy0<N, E> {
        public final InterfaceC10802xp1<N, E> a;

        public c(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
            this.a = interfaceC10802xp1;
        }

        @Override // o.AbstractC11323zy0, o.AbstractC8900q2, o.InterfaceC10802xp1
        public Set<E> C(AbstractC4099Rc0<N> abstractC4099Rc0) {
            return R().C(IE0.q(abstractC4099Rc0));
        }

        @Override // o.AbstractC11323zy0, o.AbstractC8900q2, o.InterfaceC10802xp1
        @MB
        public E D(N n, N n2) {
            return R().D(n2, n);
        }

        @Override // o.AbstractC11323zy0, o.InterfaceC10802xp1
        public AbstractC4099Rc0<N> F(E e) {
            AbstractC4099Rc0<N> F = R().F(e);
            return AbstractC4099Rc0.k(this.a, F.i(), F.h());
        }

        @Override // o.AbstractC11323zy0, o.AbstractC8900q2, o.InterfaceC10802xp1
        @MB
        public E G(AbstractC4099Rc0<N> abstractC4099Rc0) {
            return R().G(IE0.q(abstractC4099Rc0));
        }

        @Override // o.AbstractC11323zy0, o.InterfaceC10802xp1
        public Set<E> K(N n) {
            return R().v(n);
        }

        @Override // o.AbstractC11323zy0
        public InterfaceC10802xp1<N, E> R() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC11323zy0, o.InterfaceC10802xp1, o.CF1, o.DE0
        public /* bridge */ /* synthetic */ Iterable a(Object obj) {
            return a((c<N, E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC11323zy0, o.InterfaceC10802xp1, o.InterfaceC5631ch2, o.DE0
        public /* bridge */ /* synthetic */ Iterable b(Object obj) {
            return b((c<N, E>) obj);
        }

        @Override // o.AbstractC11323zy0, o.AbstractC8900q2, o.InterfaceC10802xp1
        public boolean c(AbstractC4099Rc0<N> abstractC4099Rc0) {
            return R().c(IE0.q(abstractC4099Rc0));
        }

        @Override // o.AbstractC11323zy0, o.AbstractC8900q2, o.InterfaceC10802xp1
        public boolean e(N n, N n2) {
            return R().e(n2, n);
        }

        @Override // o.AbstractC11323zy0, o.AbstractC8900q2, o.InterfaceC10802xp1
        public int i(N n) {
            return R().n(n);
        }

        @Override // o.AbstractC11323zy0, o.AbstractC8900q2, o.InterfaceC10802xp1
        public int n(N n) {
            return R().i(n);
        }

        @Override // o.AbstractC11323zy0, o.InterfaceC10802xp1
        public Set<E> v(N n) {
            return R().K(n);
        }

        @Override // o.AbstractC11323zy0, o.AbstractC8900q2, o.InterfaceC10802xp1
        public Set<E> x(N n, N n2) {
            return R().x(n2, n);
        }

        @Override // o.AbstractC11323zy0, o.InterfaceC10802xp1, o.CF1, o.DE0
        public Set<N> a(N n) {
            return R().b((InterfaceC10802xp1<N, E>) n);
        }

        @Override // o.AbstractC11323zy0, o.InterfaceC10802xp1, o.InterfaceC5631ch2, o.DE0
        public Set<N> b(N n) {
            return R().a((InterfaceC10802xp1<N, E>) n);
        }
    }

    /* loaded from: classes3.dex */
    public static class d<N, V> extends AbstractC3891Oy0<N, V> {
        public final DE2<N, V> a;

        public d(DE2<N, V> de2) {
            this.a = de2;
        }

        @Override // o.AbstractC3891Oy0, o.DE2
        @MB
        public V A(AbstractC4099Rc0<N> abstractC4099Rc0, @MB V v) {
            return R().A(IE0.q(abstractC4099Rc0), v);
        }

        @Override // o.AbstractC3891Oy0, o.DE2
        @MB
        public V B(N n, N n2, @MB V v) {
            return R().B(n2, n, v);
        }

        @Override // o.AbstractC3891Oy0
        public DE2<N, V> R() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC3891Oy0, o.InterfaceC6870hl, o.CF1, o.DE0
        public /* bridge */ /* synthetic */ Iterable a(Object obj) {
            return a((d<N, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC3891Oy0, o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
        public /* bridge */ /* synthetic */ Iterable b(Object obj) {
            return b((d<N, V>) obj);
        }

        @Override // o.AbstractC3891Oy0, o.D3, o.Q, o.InterfaceC6870hl, o.DE2
        public boolean c(AbstractC4099Rc0<N> abstractC4099Rc0) {
            return R().c(IE0.q(abstractC4099Rc0));
        }

        @Override // o.AbstractC3891Oy0, o.D3, o.Q, o.InterfaceC6870hl, o.DE2
        public boolean e(N n, N n2) {
            return R().e(n2, n);
        }

        @Override // o.AbstractC3891Oy0, o.D3, o.Q, o.InterfaceC6870hl, o.DE2
        public int i(N n) {
            return R().n(n);
        }

        @Override // o.AbstractC3891Oy0, o.D3, o.Q, o.InterfaceC6870hl, o.DE2
        public int n(N n) {
            return R().i(n);
        }

        @Override // o.AbstractC3891Oy0, o.InterfaceC6870hl, o.CF1, o.DE0
        public Set<N> a(N n) {
            return R().b((DE2<N, V>) n);
        }

        @Override // o.AbstractC3891Oy0, o.InterfaceC6870hl, o.InterfaceC5631ch2, o.DE0
        public Set<N> b(N n) {
            return R().a((DE2<N, V>) n);
        }
    }

    public static boolean a(DE0<?> de0, Object obj, @MB Object obj2) {
        if (!de0.f() && C2593Bt1.a(obj2, obj)) {
            return false;
        }
        return true;
    }

    @InterfaceC6181ey
    public static int b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Not true that %s is non-negative.", i);
        return i;
    }

    @InterfaceC6181ey
    public static long c(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "Not true that %s is non-negative.", j);
        return j;
    }

    @InterfaceC6181ey
    public static int d(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Not true that %s is positive.", i);
        return i;
    }

    @InterfaceC6181ey
    public static long e(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "Not true that %s is positive.", j);
        return j;
    }

    public static <N> InterfaceC5412bn1<N> f(DE0<N> de0) {
        InterfaceC5412bn1<N> interfaceC5412bn1 = (InterfaceC5412bn1<N>) EE0.g(de0).f(de0.m().size()).b();
        for (N n : de0.m()) {
            interfaceC5412bn1.q(n);
        }
        for (AbstractC4099Rc0<N> abstractC4099Rc0 : de0.d()) {
            interfaceC5412bn1.H(abstractC4099Rc0.h(), abstractC4099Rc0.i());
        }
        return interfaceC5412bn1;
    }

    public static <N, E> InterfaceC10305vn1<N, E> g(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        InterfaceC10305vn1<N, E> interfaceC10305vn1 = (InterfaceC10305vn1<N, E>) C11288zp1.i(interfaceC10802xp1).h(interfaceC10802xp1.m().size()).g(interfaceC10802xp1.d().size()).c();
        for (N n : interfaceC10802xp1.m()) {
            interfaceC10305vn1.q(n);
        }
        for (E e : interfaceC10802xp1.d()) {
            AbstractC4099Rc0<N> F = interfaceC10802xp1.F(e);
            interfaceC10305vn1.M(F.h(), F.i(), e);
        }
        return interfaceC10305vn1;
    }

    public static <N, V> InterfaceC4729Xn1<N, V> h(DE2<N, V> de2) {
        InterfaceC4729Xn1<N, V> interfaceC4729Xn1 = (InterfaceC4729Xn1<N, V>) EE2.g(de2).f(de2.m().size()).b();
        for (N n : de2.m()) {
            interfaceC4729Xn1.q(n);
        }
        for (AbstractC4099Rc0<N> abstractC4099Rc0 : de2.d()) {
            N h = abstractC4099Rc0.h();
            N i = abstractC4099Rc0.i();
            V B = de2.B(abstractC4099Rc0.h(), abstractC4099Rc0.i(), null);
            Objects.requireNonNull(B);
            interfaceC4729Xn1.L(h, i, B);
        }
        return interfaceC4729Xn1;
    }

    public static <N> boolean i(DE0<N> de0) {
        int size = de0.d().size();
        if (size == 0) {
            return false;
        }
        if (!de0.f() && size >= de0.m().size()) {
            return true;
        }
        HashMap a0 = C7935m81.a0(de0.m().size());
        for (N n : de0.m()) {
            if (o(de0, a0, n, null)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(InterfaceC10802xp1<?, ?> interfaceC10802xp1) {
        if (!interfaceC10802xp1.f() && interfaceC10802xp1.y() && interfaceC10802xp1.d().size() > interfaceC10802xp1.s().d().size()) {
            return true;
        }
        return i(interfaceC10802xp1.s());
    }

    public static <N> InterfaceC5412bn1<N> k(DE0<N> de0, Iterable<? extends N> iterable) {
        InterfaceC5412bn1<N> interfaceC5412bn1;
        if (iterable instanceof Collection) {
            interfaceC5412bn1 = EE0.g(de0).f(((Collection) iterable).size()).b();
        } else {
            interfaceC5412bn1 = EE0.g(de0).b();
        }
        for (N n : iterable) {
            interfaceC5412bn1.q(n);
        }
        for (N n2 : interfaceC5412bn1.m()) {
            for (N n3 : de0.b((DE0<N>) n2)) {
                if (interfaceC5412bn1.m().contains(n3)) {
                    interfaceC5412bn1.H(n2, n3);
                }
            }
        }
        return interfaceC5412bn1;
    }

    public static <N, E> InterfaceC10305vn1<N, E> l(InterfaceC10802xp1<N, E> interfaceC10802xp1, Iterable<? extends N> iterable) {
        InterfaceC10305vn1<N, E> interfaceC10305vn1;
        if (iterable instanceof Collection) {
            interfaceC10305vn1 = C11288zp1.i(interfaceC10802xp1).h(((Collection) iterable).size()).c();
        } else {
            interfaceC10305vn1 = C11288zp1.i(interfaceC10802xp1).c();
        }
        for (N n : iterable) {
            interfaceC10305vn1.q(n);
        }
        for (N n2 : interfaceC10305vn1.m()) {
            for (E e : interfaceC10802xp1.v(n2)) {
                N d2 = interfaceC10802xp1.F(e).d(n2);
                if (interfaceC10305vn1.m().contains(d2)) {
                    interfaceC10305vn1.M(n2, d2, e);
                }
            }
        }
        return interfaceC10305vn1;
    }

    public static <N, V> InterfaceC4729Xn1<N, V> m(DE2<N, V> de2, Iterable<? extends N> iterable) {
        InterfaceC4729Xn1<N, V> interfaceC4729Xn1;
        if (iterable instanceof Collection) {
            interfaceC4729Xn1 = EE2.g(de2).f(((Collection) iterable).size()).b();
        } else {
            interfaceC4729Xn1 = EE2.g(de2).b();
        }
        for (N n : iterable) {
            interfaceC4729Xn1.q(n);
        }
        for (N n2 : interfaceC4729Xn1.m()) {
            for (N n3 : de2.b((DE2<N, V>) n2)) {
                if (interfaceC4729Xn1.m().contains(n3)) {
                    V B = de2.B(n2, n3, null);
                    Objects.requireNonNull(B);
                    interfaceC4729Xn1.L(n2, n3, B);
                }
            }
        }
        return interfaceC4729Xn1;
    }

    public static <N> Set<N> n(DE0<N> de0, N n) {
        C10664xF1.u(de0.m().contains(n), GE0.f, n);
        return AbstractC9481sO0.F(Yt2.g(de0).b(n));
    }

    public static <N> boolean o(DE0<N> de0, Map<Object, a> map, N n, @MB N n2) {
        a aVar = map.get(n);
        if (aVar == a.COMPLETE) {
            return false;
        }
        a aVar2 = a.PENDING;
        if (aVar == aVar2) {
            return true;
        }
        map.put(n, aVar2);
        for (N n3 : de0.b((DE0<N>) n)) {
            if (a(de0, n3, n2) && o(de0, map, n3, n)) {
                return true;
            }
        }
        map.put(n, a.COMPLETE);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.DE0<N>, o.bn1] */
    public static <N> DE0<N> p(DE0<N> de0) {
        ?? b2 = EE0.g(de0).a(true).b();
        if (de0.f()) {
            for (N n : de0.m()) {
                for (Object obj : n(de0, n)) {
                    b2.H(n, obj);
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n2 : de0.m()) {
                if (!hashSet.contains(n2)) {
                    Set n3 = n(de0, n2);
                    hashSet.addAll(n3);
                    int i = 1;
                    for (Object obj2 : n3) {
                        int i2 = i + 1;
                        for (Object obj3 : C5098aU0.D(n3, i)) {
                            b2.H(obj2, obj3);
                        }
                        i = i2;
                    }
                }
            }
        }
        return b2;
    }

    public static <N> AbstractC4099Rc0<N> q(AbstractC4099Rc0<N> abstractC4099Rc0) {
        if (abstractC4099Rc0.e()) {
            return AbstractC4099Rc0.l(abstractC4099Rc0.r(), abstractC4099Rc0.p());
        }
        return abstractC4099Rc0;
    }

    public static <N> DE0<N> r(DE0<N> de0) {
        if (!de0.f()) {
            return de0;
        }
        if (de0 instanceof b) {
            return ((b) de0).a;
        }
        return new b(de0);
    }

    public static <N, E> InterfaceC10802xp1<N, E> s(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        if (!interfaceC10802xp1.f()) {
            return interfaceC10802xp1;
        }
        if (interfaceC10802xp1 instanceof c) {
            return ((c) interfaceC10802xp1).a;
        }
        return new c(interfaceC10802xp1);
    }

    public static <N, V> DE2<N, V> t(DE2<N, V> de2) {
        if (!de2.f()) {
            return de2;
        }
        if (de2 instanceof d) {
            return ((d) de2).a;
        }
        return new d(de2);
    }
}
