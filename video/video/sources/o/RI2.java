package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C3716Nd2;
import o.C9800ti2;
import o.D10;
import o.InterfaceC7402jx;
import o.T12;

/* loaded from: classes.dex */
public class RI2 implements InterfaceC7402jx {
    public static final String c1 = "Operation not supported by VirtualCamera.";
    public final Set<androidx.camera.core.m> X;
    public final InterfaceC6986iD2 Y0;
    public final InterfaceC7402jx Z0;
    public final TI2 b1;
    public final Map<androidx.camera.core.m, C6618gi2> Y = new HashMap();
    public final Map<androidx.camera.core.m, Boolean> Z = new HashMap();
    public final AbstractC3393Jv a1 = u();

    /* loaded from: classes.dex */
    public class a extends AbstractC3393Jv {
        public a() {
        }

        @Override // o.AbstractC3393Jv
        public void b(InterfaceC3784Nv interfaceC3784Nv) {
            super.b(interfaceC3784Nv);
            for (androidx.camera.core.m mVar : RI2.this.X) {
                RI2.K(interfaceC3784Nv, mVar.t());
            }
        }
    }

    public RI2(InterfaceC7402jx interfaceC7402jx, Set<androidx.camera.core.m> set, InterfaceC6986iD2 interfaceC6986iD2, C3716Nd2.a aVar) {
        this.Z0 = interfaceC7402jx;
        this.Y0 = interfaceC6986iD2;
        this.X = set;
        this.b1 = new TI2(interfaceC7402jx.j(), aVar);
        for (androidx.camera.core.m mVar : set) {
            this.Z.put(mVar, Boolean.FALSE);
        }
    }

    public static int C(Set<InterfaceC6743hD2<?>> set) {
        int i = 0;
        for (InterfaceC6743hD2<?> interfaceC6743hD2 : set) {
            i = Math.max(i, interfaceC6743hD2.a0());
        }
        return i;
    }

    public static void K(InterfaceC3784Nv interfaceC3784Nv, T12 t12) {
        for (AbstractC3393Jv abstractC3393Jv : t12.h()) {
            abstractC3393Jv.b(new SI2(t12.i().h(), interfaceC3784Nv));
        }
    }

    public static int w(androidx.camera.core.m mVar) {
        if (mVar instanceof androidx.camera.core.f) {
            return 256;
        }
        return 34;
    }

    public static D10 y(androidx.camera.core.m mVar) {
        List<D10> g;
        boolean z;
        if (mVar instanceof androidx.camera.core.f) {
            g = mVar.t().l();
        } else {
            g = mVar.t().i().g();
        }
        if (g.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        if (g.size() == 1) {
            return g.get(0);
        }
        return null;
    }

    public static int z(androidx.camera.core.m mVar) {
        if (mVar instanceof androidx.camera.core.k) {
            return 1;
        }
        if (mVar instanceof androidx.camera.core.f) {
            return 4;
        }
        return 2;
    }

    public Set<androidx.camera.core.m> A() {
        return this.X;
    }

    public Map<androidx.camera.core.m, C9800ti2.d> B(C6618gi2 c6618gi2) {
        HashMap hashMap = new HashMap();
        for (androidx.camera.core.m mVar : this.X) {
            int x = x(mVar);
            hashMap.put(mVar, C9800ti2.d.h(z(mVar), w(mVar), c6618gi2.n(), C5433bs2.f(c6618gi2.n(), x), x, mVar.B(this)));
        }
        return hashMap;
    }

    public AbstractC3393Jv D() {
        return this.a1;
    }

    public final C6618gi2 E(androidx.camera.core.m mVar) {
        C6618gi2 c6618gi2 = this.Y.get(mVar);
        Objects.requireNonNull(c6618gi2);
        return c6618gi2;
    }

    public final boolean F(androidx.camera.core.m mVar) {
        Boolean bool = this.Z.get(mVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public void G(InterfaceC3849Om1 interfaceC3849Om1) {
        HashSet hashSet = new HashSet();
        for (androidx.camera.core.m mVar : this.X) {
            hashSet.add(mVar.C(this.Z0.n(), null, mVar.k(true, this.Y0)));
        }
        interfaceC3849Om1.h0(InterfaceC6040eN0.u, XS1.a(new ArrayList(this.Z0.n().n(34)), C5433bs2.m(this.Z0.j().h()), hashSet));
        interfaceC3849Om1.h0(InterfaceC6743hD2.D, Integer.valueOf(C(hashSet)));
    }

    public void H() {
        for (androidx.camera.core.m mVar : this.X) {
            mVar.L();
        }
    }

    public void I() {
        for (androidx.camera.core.m mVar : this.X) {
            mVar.M();
        }
    }

    public void J() {
        C5901do2.c();
        for (androidx.camera.core.m mVar : this.X) {
            p(mVar);
        }
    }

    public void L(Map<androidx.camera.core.m, C6618gi2> map) {
        this.Y.clear();
        this.Y.putAll(map);
        for (Map.Entry<androidx.camera.core.m, C6618gi2> entry : this.Y.entrySet()) {
            androidx.camera.core.m key = entry.getKey();
            C6618gi2 value = entry.getValue();
            key.U(value.n());
            key.S(value.t());
            key.Y(value.u());
            key.G();
        }
    }

    public void M() {
        for (androidx.camera.core.m mVar : this.X) {
            mVar.W(this);
        }
    }

    @Override // o.InterfaceC7402jx
    public void close() {
        throw new UnsupportedOperationException(c1);
    }

    @Override // o.InterfaceC7402jx
    public InterfaceC2789Dt1<InterfaceC7402jx.a> e() {
        return this.Z0.e();
    }

    @Override // o.InterfaceC7402jx
    public InterfaceFutureC8411o11<Void> g() {
        throw new UnsupportedOperationException(c1);
    }

    @Override // androidx.camera.core.m.d
    public void h(androidx.camera.core.m mVar) {
        C5901do2.c();
        if (!F(mVar)) {
            this.Z.put(mVar, Boolean.TRUE);
            D10 y = y(mVar);
            if (y != null) {
                v(E(mVar), y, mVar.t());
            }
        }
    }

    @Override // androidx.camera.core.m.d
    public void i(androidx.camera.core.m mVar) {
        C5901do2.c();
        if (!F(mVar)) {
            return;
        }
        C6618gi2 E = E(mVar);
        D10 y = y(mVar);
        if (y != null) {
            v(E, y, mVar.t());
        } else {
            E.l();
        }
    }

    @Override // o.InterfaceC7402jx
    public InterfaceC9610sw j() {
        return this.b1;
    }

    @Override // o.InterfaceC7402jx
    public void l(Collection<androidx.camera.core.m> collection) {
        throw new UnsupportedOperationException(c1);
    }

    @Override // o.InterfaceC7402jx
    public void m(Collection<androidx.camera.core.m> collection) {
        throw new UnsupportedOperationException(c1);
    }

    @Override // o.InterfaceC7402jx
    public InterfaceC6918hx n() {
        return this.Z0.n();
    }

    @Override // o.InterfaceC7402jx
    public void open() {
        throw new UnsupportedOperationException(c1);
    }

    @Override // androidx.camera.core.m.d
    public void p(androidx.camera.core.m mVar) {
        D10 y;
        C5901do2.c();
        C6618gi2 E = E(mVar);
        E.y();
        if (F(mVar) && (y = y(mVar)) != null) {
            v(E, y, mVar.t());
        }
    }

    @Override // o.InterfaceC7402jx
    public boolean r() {
        return false;
    }

    @Override // androidx.camera.core.m.d
    public void s(androidx.camera.core.m mVar) {
        C5901do2.c();
        if (!F(mVar)) {
            return;
        }
        this.Z.put(mVar, Boolean.FALSE);
        E(mVar).l();
    }

    public void t() {
        for (androidx.camera.core.m mVar : this.X) {
            mVar.b(this, null, mVar.k(true, this.Y0));
        }
    }

    public AbstractC3393Jv u() {
        return new a();
    }

    public final void v(C6618gi2 c6618gi2, D10 d10, T12 t12) {
        c6618gi2.y();
        try {
            c6618gi2.B(d10);
        } catch (D10.a unused) {
            for (T12.c cVar : t12.c()) {
                cVar.a(t12, T12.f.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public final int x(androidx.camera.core.m mVar) {
        if (mVar instanceof androidx.camera.core.k) {
            return this.Z0.c().t(((androidx.camera.core.k) mVar).l0());
        }
        return 0;
    }
}
