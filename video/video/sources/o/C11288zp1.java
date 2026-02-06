package o;

import o.C8503oO0;

@InterfaceC7070ia0
@InterfaceC4238Sm
/* renamed from: o.zp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11288zp1<N, E> extends S0<N> {
    public boolean f;
    public Y90<? super E> g;
    public AbstractC4468Uv1<Integer> h;

    public C11288zp1(boolean z) {
        super(z);
        this.f = false;
        this.g = Y90.d();
        this.h = AbstractC4468Uv1.a();
    }

    public static C11288zp1<Object, Object> e() {
        return new C11288zp1<>(true);
    }

    public static <N, E> C11288zp1<N, E> i(InterfaceC10802xp1<N, E> interfaceC10802xp1) {
        return new C11288zp1(interfaceC10802xp1.f()).a(interfaceC10802xp1.y()).b(interfaceC10802xp1.j()).k(interfaceC10802xp1.h()).f(interfaceC10802xp1.I());
    }

    public static C11288zp1<Object, Object> l() {
        return new C11288zp1<>(false);
    }

    public C11288zp1<N, E> a(boolean z) {
        this.f = z;
        return this;
    }

    public C11288zp1<N, E> b(boolean z) {
        this.b = z;
        return this;
    }

    public <N1 extends N, E1 extends E> InterfaceC10305vn1<N1, E1> c() {
        return new C4000Qb2(this);
    }

    public <E1 extends E> C11288zp1<N, E1> f(Y90<E1> y90) {
        C11288zp1<N, E1> c11288zp1 = (C11288zp1<N, E1>) d();
        c11288zp1.g = (Y90) C10664xF1.E(y90);
        return c11288zp1;
    }

    public C11288zp1<N, E> g(int i) {
        this.h = AbstractC4468Uv1.f(Integer.valueOf(IE0.b(i)));
        return this;
    }

    public C11288zp1<N, E> h(int i) {
        this.e = AbstractC4468Uv1.f(Integer.valueOf(IE0.b(i)));
        return this;
    }

    public <N1 extends N, E1 extends E> C8503oO0.a<N1, E1> j() {
        return new C8503oO0.a<>(d());
    }

    public <N1 extends N> C11288zp1<N1, E> k(Y90<N1> y90) {
        C11288zp1<N1, E> c11288zp1 = (C11288zp1<N1, E>) d();
        c11288zp1.c = (Y90) C10664xF1.E(y90);
        return c11288zp1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N1 extends N, E1 extends E> C11288zp1<N1, E1> d() {
        return this;
    }
}
