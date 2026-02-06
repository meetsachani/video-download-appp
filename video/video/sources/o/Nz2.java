package o;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public final class Nz2<N, E> extends B3<N, E> {
    @MB
    @SY0
    public transient Reference<InterfaceC2467Am1<N>> b;

    /* loaded from: classes3.dex */
    public class a extends AbstractC3552Ll1<E> {
        public final /* synthetic */ Object Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.Z = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Nz2.this.n().w4(this.Z);
        }
    }

    public Nz2(Map<E, N> map) {
        super(map);
    }

    @MB
    private static <T> T o(@MB Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static <N, E> Nz2<N, E> p() {
        return new Nz2<>(new HashMap(2, 1.0f));
    }

    public static <N, E> Nz2<N, E> q(Map<E, N> map) {
        return new Nz2<>(AbstractC6044eO0.g(map));
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> c() {
        return Collections.unmodifiableSet(n().n());
    }

    @Override // o.B3, o.InterfaceC2773Dp1
    @MB
    public N d(E e, boolean z) {
        if (!z) {
            return j(e);
        }
        return null;
    }

    @Override // o.B3, o.InterfaceC2773Dp1
    public void e(E e, N n) {
        super.e(e, n);
        InterfaceC2467Am1 interfaceC2467Am1 = (InterfaceC2467Am1) o(this.b);
        if (interfaceC2467Am1 != null) {
            C10664xF1.g0(interfaceC2467Am1.add(n));
        }
    }

    @Override // o.B3, o.InterfaceC2773Dp1
    public void f(E e, N n, boolean z) {
        if (!z) {
            e(e, n);
        }
    }

    @Override // o.B3, o.InterfaceC2773Dp1
    public N j(E e) {
        N n = (N) super.j(e);
        InterfaceC2467Am1 interfaceC2467Am1 = (InterfaceC2467Am1) o(this.b);
        if (interfaceC2467Am1 != null) {
            C10664xF1.g0(interfaceC2467Am1.remove(n));
        }
        return n;
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> l(N n) {
        return new a(this.a, n, n);
    }

    public final InterfaceC2467Am1<N> n() {
        InterfaceC2467Am1<N> interfaceC2467Am1 = (InterfaceC2467Am1) o(this.b);
        if (interfaceC2467Am1 == null) {
            C10424wG0 r = C10424wG0.r(this.a.values());
            this.b = new SoftReference(r);
            return r;
        }
        return interfaceC2467Am1;
    }
}
