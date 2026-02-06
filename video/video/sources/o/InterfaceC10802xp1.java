package o;

import java.util.Set;

@InterfaceC7070ia0
@L40("Use NetworkBuilder to create a real instance")
@InterfaceC4238Sm
/* renamed from: o.xp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10802xp1<N, E> extends InterfaceC5631ch2<N>, CF1<N> {
    Set<E> C(AbstractC4099Rc0<N> abstractC4099Rc0);

    @MB
    E D(N n, N n2);

    AbstractC4099Rc0<N> F(E e);

    @MB
    E G(AbstractC4099Rc0<N> abstractC4099Rc0);

    Y90<E> I();

    Set<E> K(N n);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable a(Object obj) {
        return a((InterfaceC10802xp1<N, E>) obj);
    }

    Set<N> a(N n);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC5631ch2, o.DE0
    /* bridge */ /* synthetic */ default Iterable b(Object obj) {
        return b((InterfaceC10802xp1<N, E>) obj);
    }

    @Override // o.InterfaceC5631ch2, o.DE0
    Set<N> b(N n);

    boolean c(AbstractC4099Rc0<N> abstractC4099Rc0);

    Set<E> d();

    boolean e(N n, N n2);

    boolean equals(@MB Object obj);

    boolean f();

    int g(N n);

    Y90<N> h();

    int hashCode();

    int i(N n);

    boolean j();

    Set<N> k(N n);

    Set<E> l(N n);

    Set<N> m();

    int n(N n);

    DE0<N> s();

    Set<E> v(N n);

    Set<E> w(E e);

    Set<E> x(N n, N n2);

    boolean y();
}
