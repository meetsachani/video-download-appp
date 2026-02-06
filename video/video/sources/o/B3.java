package o;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public abstract class B3<N, E> implements InterfaceC2773Dp1<N, E> {
    public final Map<E, N> a;

    public B3(Map<E, N> map) {
        this.a = (Map) C10664xF1.E(map);
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> a() {
        return c();
    }

    @Override // o.InterfaceC2773Dp1
    public Set<N> b() {
        return c();
    }

    @Override // o.InterfaceC2773Dp1
    @MB
    public N d(E e, boolean z) {
        if (!z) {
            return j(e);
        }
        return null;
    }

    @Override // o.InterfaceC2773Dp1
    public void e(E e, N n) {
        boolean z;
        if (this.a.put(e, n) == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
    }

    @Override // o.InterfaceC2773Dp1
    public void f(E e, N n, boolean z) {
        if (!z) {
            e(e, n);
        }
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> g() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // o.InterfaceC2773Dp1
    public N h(E e) {
        N n = this.a.get(e);
        Objects.requireNonNull(n);
        return n;
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> i() {
        return g();
    }

    @Override // o.InterfaceC2773Dp1
    public N j(E e) {
        N remove = this.a.remove(e);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // o.InterfaceC2773Dp1
    public Set<E> k() {
        return g();
    }
}
