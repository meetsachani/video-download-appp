package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.ww0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10586ww0<E> implements Iterable<E> {
    public final Iterable<E> X;

    public C10586ww0() {
        this.X = this;
    }

    public static <T> C10586ww0<T> G(Iterable<T> iterable) {
        ZT0.g(iterable);
        if (iterable instanceof C10586ww0) {
            return (C10586ww0) iterable;
        }
        return new C10586ww0<>(iterable);
    }

    public static <T> C10586ww0<T> H(T t) {
        return G(C6566gU0.n(new D82(t, false)));
    }

    public static <T> C10586ww0<T> J(T... tArr) {
        return G(Arrays.asList(tArr));
    }

    public static <T> C10586ww0<T> p() {
        return ZT0.a;
    }

    public void B(InterfaceC8705pE<? super E> interfaceC8705pE) {
        ZT0.t(this.X, interfaceC8705pE);
    }

    public C10586ww0<E> D(long j) {
        return G(ZT0.b(this.X, j));
    }

    public C10586ww0<E> F() {
        return G(ZT0.z(this.X));
    }

    public C10586ww0<E> K() {
        return G(ZT0.F(this.X));
    }

    public C10586ww0<E> L(long j) {
        return G(ZT0.H(this.X, j));
    }

    public E[] M(Class<E> cls) {
        return (E[]) C6566gU0.d0(iterator(), cls);
    }

    public List<E> Q() {
        return ZT0.I(this.X);
    }

    public <O> C10586ww0<O> U(InterfaceC3287Is2<? super E, ? extends O> interfaceC3287Is2) {
        return G(ZT0.M(this.X, interfaceC3287Is2));
    }

    public C10586ww0<E> V() {
        return G(ZT0.N(this.X));
    }

    public C10586ww0<E> X() {
        return G(ZT0.O(this.X));
    }

    public C10586ww0<E> Y(Iterable<? extends E> iterable) {
        return G(ZT0.P(this.X, iterable));
    }

    public C10586ww0<E> a0(Iterable<? extends E>... iterableArr) {
        return G(ZT0.Q(this.X, iterableArr));
    }

    public boolean contains(Object obj) {
        return ZT0.k(this.X, obj);
    }

    public boolean d(KF1<? super E> kf1) {
        return ZT0.A(this.X, kf1);
    }

    public boolean e(KF1<? super E> kf1) {
        return ZT0.B(this.X, kf1);
    }

    public C10586ww0<E> f(Iterable<? extends E> iterable) {
        return G(ZT0.c(this.X, iterable));
    }

    public E get(int i) {
        return (E) ZT0.w(this.X, i);
    }

    public C10586ww0<E> h(E... eArr) {
        return f(Arrays.asList(eArr));
    }

    public Enumeration<E> i() {
        return C6566gU0.m(iterator());
    }

    public boolean isEmpty() {
        return ZT0.y(this.X);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return this.X.iterator();
    }

    public C10586ww0<E> j(Iterable<? extends E> iterable) {
        return G(ZT0.i(this.X, iterable));
    }

    public C10586ww0<E> k(Iterable<? extends E> iterable, Comparator<? super E> comparator) {
        return G(ZT0.j(comparator, this.X, iterable));
    }

    public void l(Collection<? super E> collection) {
        if (collection != null) {
            C6748hF.a(collection, this.X);
            return;
        }
        throw new NullPointerException("Collection must not be null");
    }

    public C10586ww0<E> r() {
        return G(Q());
    }

    public int size() {
        return ZT0.G(this.X);
    }

    public String toString() {
        return ZT0.J(this.X);
    }

    public C10586ww0<E> w(KF1<? super E> kf1) {
        return G(ZT0.q(this.X, kf1));
    }

    public C10586ww0(Iterable<E> iterable) {
        this.X = iterable;
    }
}
