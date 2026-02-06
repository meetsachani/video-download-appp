package o;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public final class K30<N, E> extends AbstractC10359w0<N, E> {
    @MB
    @SY0
    public transient Reference<InterfaceC2467Am1<N>> d;
    @MB
    @SY0
    public transient Reference<InterfaceC2467Am1<N>> e;

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
            return K30.this.s().w4(this.Z);
        }
    }

    public K30(Map<E, N> map, Map<E, N> map2, int i) {
        super(map, map2, i);
    }

    @MB
    public static <T> T o(@MB Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static <N, E> K30<N, E> p() {
        return new K30<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    public static <N, E> K30<N, E> q(Map<E, N> map, Map<E, N> map2, int i) {
        return new K30<>(AbstractC6044eO0.g(map), AbstractC6044eO0.g(map2), i);
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> a() {
        return Collections.unmodifiableSet(s().n());
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> b() {
        return Collections.unmodifiableSet(r().n());
    }

    @Override // o.AbstractC10359w0, o.InterfaceC2773Dp1
    public N d(E e, boolean z) {
        N n = (N) super.d(e, z);
        InterfaceC2467Am1 interfaceC2467Am1 = (InterfaceC2467Am1) o(this.d);
        if (interfaceC2467Am1 != null) {
            C10664xF1.g0(interfaceC2467Am1.remove(n));
        }
        return n;
    }

    @Override // o.AbstractC10359w0, o.InterfaceC2773Dp1
    public void e(E e, N n) {
        super.e(e, n);
        InterfaceC2467Am1 interfaceC2467Am1 = (InterfaceC2467Am1) o(this.e);
        if (interfaceC2467Am1 != null) {
            C10664xF1.g0(interfaceC2467Am1.add(n));
        }
    }

    @Override // o.AbstractC10359w0, o.InterfaceC2773Dp1
    public void f(E e, N n, boolean z) {
        super.f(e, n, z);
        InterfaceC2467Am1 interfaceC2467Am1 = (InterfaceC2467Am1) o(this.d);
        if (interfaceC2467Am1 != null) {
            C10664xF1.g0(interfaceC2467Am1.add(n));
        }
    }

    @Override // o.AbstractC10359w0, o.InterfaceC2773Dp1
    public N j(E e) {
        N n = (N) super.j(e);
        InterfaceC2467Am1 interfaceC2467Am1 = (InterfaceC2467Am1) o(this.e);
        if (interfaceC2467Am1 != null) {
            C10664xF1.g0(interfaceC2467Am1.remove(n));
        }
        return n;
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> l(N n) {
        return new a(this.b, n, n);
    }

    public final InterfaceC2467Am1<N> r() {
        InterfaceC2467Am1<N> interfaceC2467Am1 = (InterfaceC2467Am1) o(this.d);
        if (interfaceC2467Am1 == null) {
            C10424wG0 r = C10424wG0.r(this.a.values());
            this.d = new SoftReference(r);
            return r;
        }
        return interfaceC2467Am1;
    }

    public final InterfaceC2467Am1<N> s() {
        InterfaceC2467Am1<N> interfaceC2467Am1 = (InterfaceC2467Am1) o(this.e);
        if (interfaceC2467Am1 == null) {
            C10424wG0 r = C10424wG0.r(this.b.values());
            this.e = new SoftReference(r);
            return r;
        }
        return interfaceC2467Am1;
    }
}
