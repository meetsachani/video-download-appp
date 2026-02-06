package o;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@InterfaceC7070ia0
/* renamed from: o.w0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10359w0<N, E> implements InterfaceC2773Dp1<N, E> {
    public final Map<E, N> a;
    public final Map<E, N> b;
    public int c;

    /* renamed from: o.w0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractSet<E> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (!AbstractC10359w0.this.a.containsKey(obj) && !AbstractC10359w0.this.b.containsKey(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public AbstractC6237fB2<E> iterator() {
            Iterable N;
            if (AbstractC10359w0.this.c == 0) {
                N = C5098aU0.f(AbstractC10359w0.this.a.keySet(), AbstractC10359w0.this.b.keySet());
            } else {
                N = C10856y22.N(AbstractC10359w0.this.a.keySet(), AbstractC10359w0.this.b.keySet());
            }
            return C7052iU0.e0(N.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C9979uR0.t(AbstractC10359w0.this.a.size(), AbstractC10359w0.this.b.size() - AbstractC10359w0.this.c);
        }
    }

    public AbstractC10359w0(Map<E, N> map, Map<E, N> map2, int i) {
        boolean z;
        this.a = (Map) C10664xF1.E(map);
        this.b = (Map) C10664xF1.E(map2);
        this.c = IE0.b(i);
        if (i <= map.size() && i <= map2.size()) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> c() {
        return C10856y22.N(b(), a());
    }

    @Override // o.InterfaceC2773Dp1
    public N d(E e, boolean z) {
        if (z) {
            int i = this.c - 1;
            this.c = i;
            IE0.b(i);
        }
        N remove = this.a.remove(e);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // o.InterfaceC2773Dp1
    public void e(E e, N n) {
        boolean z;
        C10664xF1.E(e);
        C10664xF1.E(n);
        if (this.b.put(e, n) == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
    }

    @Override // o.InterfaceC2773Dp1
    public void f(E e, N n, boolean z) {
        C10664xF1.E(e);
        C10664xF1.E(n);
        boolean z2 = true;
        if (z) {
            int i = this.c + 1;
            this.c = i;
            IE0.d(i);
        }
        if (this.a.put(e, n) != null) {
            z2 = false;
        }
        C10664xF1.g0(z2);
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> g() {
        return new a();
    }

    @Override // o.InterfaceC2773Dp1
    public N h(E e) {
        N n = this.b.get(e);
        Objects.requireNonNull(n);
        return n;
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> i() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // o.InterfaceC2773Dp1
    public N j(E e) {
        N remove = this.b.remove(e);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> k() {
        return Collections.unmodifiableSet(this.b.keySet());
    }
}
