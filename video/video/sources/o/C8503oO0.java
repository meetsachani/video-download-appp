package o;

import java.util.Map;
import java.util.Set;
import o.AbstractC6044eO0;

@NN0(containerOf = {"N", C2638Cg0.S4})
@InterfaceC7070ia0
@InterfaceC4238Sm
/* renamed from: o.oO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8503oO0<N, E> extends C4197Sb2<N, E> {

    /* renamed from: o.oO0$a */
    /* loaded from: classes3.dex */
    public static class a<N, E> {
        public final InterfaceC10305vn1<N, E> a;

        public a(C11288zp1<N, E> c11288zp1) {
            this.a = (InterfaceC10305vn1<N, E>) c11288zp1.c();
        }

        @InterfaceC6181ey
        public a<N, E> a(N n, N n2, E e) {
            this.a.M(n, n2, e);
            return this;
        }

        @InterfaceC6181ey
        public a<N, E> b(AbstractC4099Rc0<N> abstractC4099Rc0, E e) {
            this.a.z(abstractC4099Rc0, e);
            return this;
        }

        @InterfaceC6181ey
        public a<N, E> c(N n) {
            this.a.q(n);
            return this;
        }

        public C8503oO0<N, E> d() {
            return C8503oO0.c0(this.a);
        }
    }

    public C8503oO0(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        super(C11288zp1.i(interfaceC10802xp1), e0(interfaceC10802xp1), d0(interfaceC10802xp1));
    }

    public static <N, E> YA0<E, N> Y(final InterfaceC10802xp1<N, E> interfaceC10802xp1, final N n) {
        return new YA0() { // from class: o.mO0
            @Override // o.YA0
            public final Object apply(Object obj) {
                Object d;
                d = InterfaceC10802xp1.this.F(obj).d(n);
                return d;
            }
        };
    }

    public static <N, E> InterfaceC2773Dp1<N, E> a0(InterfaceC10802xp1<N, E> interfaceC10802xp1, N n) {
        if (interfaceC10802xp1.f()) {
            Map j = C7935m81.j(interfaceC10802xp1.K(n), f0(interfaceC10802xp1));
            Map j2 = C7935m81.j(interfaceC10802xp1.v(n), g0(interfaceC10802xp1));
            int size = interfaceC10802xp1.x(n, n).size();
            if (interfaceC10802xp1.y()) {
                return K30.q(j, j2, size);
            }
            return L30.o(j, j2, size);
        }
        Map j3 = C7935m81.j(interfaceC10802xp1.l(n), Y(interfaceC10802xp1, n));
        if (interfaceC10802xp1.y()) {
            return Nz2.q(j3);
        }
        return Oz2.n(j3);
    }

    @Deprecated
    public static <N, E> C8503oO0<N, E> b0(C8503oO0<N, E> c8503oO0) {
        return (C8503oO0) C10664xF1.E(c8503oO0);
    }

    public static <N, E> C8503oO0<N, E> c0(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        if (interfaceC10802xp1 instanceof C8503oO0) {
            return (C8503oO0) interfaceC10802xp1;
        }
        return new C8503oO0<>(interfaceC10802xp1);
    }

    public static <N, E> Map<E, N> d0(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        for (E e : interfaceC10802xp1.d()) {
            b.i(e, interfaceC10802xp1.F(e).h());
        }
        return b.d();
    }

    public static <N, E> Map<N, InterfaceC2773Dp1<N, E>> e0(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        for (N n : interfaceC10802xp1.m()) {
            b.i(n, a0(interfaceC10802xp1, n));
        }
        return b.d();
    }

    public static <N, E> YA0<E, N> f0(final InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        return new YA0() { // from class: o.lO0
            @Override // o.YA0
            public final Object apply(Object obj) {
                Object p;
                p = InterfaceC10802xp1.this.F(obj).p();
                return p;
            }
        };
    }

    public static <N, E> YA0<E, N> g0(final InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        return new YA0() { // from class: o.nO0
            @Override // o.YA0
            public final Object apply(Object obj) {
                Object r;
                r = InterfaceC10802xp1.this.F(obj).r();
                return r;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ AbstractC4099Rc0 F(Object obj) {
        return super.F(obj);
    }

    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Y90 I() {
        return super.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Set K(Object obj) {
        return super.K(obj);
    }

    @Override // o.AbstractC8900q2, o.InterfaceC10802xp1
    /* renamed from: Z */
    public YN0<N> s() {
        return new YN0<>(super.s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4197Sb2, o.InterfaceC10802xp1, o.CF1, o.DE0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a((C8503oO0<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4197Sb2, o.InterfaceC10802xp1, o.InterfaceC5631ch2, o.DE0
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b((C8503oO0<N, E>) obj);
    }

    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Y90 h() {
        return super.h();
    }

    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Set k(Object obj) {
        return super.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Set v(Object obj) {
        return super.v(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C4197Sb2, o.AbstractC8900q2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ Set x(Object obj, Object obj2) {
        return super.x(obj, obj2);
    }

    @Override // o.C4197Sb2, o.InterfaceC10802xp1
    public /* bridge */ /* synthetic */ boolean y() {
        return super.y();
    }
}
