package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import o.AbstractC4008Qd2;
import o.AbstractC4078Qw;
import o.C10907yF1;
import o.C2569Bn1;
import o.C3553Ll2;
import o.C5433bs2;
import o.C7227jD2;
import o.D10;
import o.HJ;
import o.InterfaceC3063Gl2;
import o.InterfaceC6040eN0;
import o.InterfaceC6420fx;
import o.InterfaceC6743hD2;
import o.InterfaceC6918hx;
import o.InterfaceC6986iD2;
import o.InterfaceC7402jx;
import o.InterfaceC9610sw;
import o.T12;
import o.TS1;
import o.US1;

/* loaded from: classes.dex */
public abstract class m {
    public InterfaceC6743hD2<?> d;
    public InterfaceC6743hD2<?> e;
    public InterfaceC6743hD2<?> f;
    public AbstractC4008Qd2 g;
    public InterfaceC6743hD2<?> h;
    public Rect i;
    public InterfaceC7402jx k;
    public AbstractC4078Qw l;
    public final Set<d> a = new HashSet();
    public final Object b = new Object();
    public c c = c.INACTIVE;
    public Matrix j = new Matrix();
    public T12 m = T12.a();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(InterfaceC6420fx interfaceC6420fx);
    }

    /* loaded from: classes.dex */
    public enum c {
        ACTIVE,
        INACTIVE
    }

    /* loaded from: classes.dex */
    public interface d {
        void h(m mVar);

        void i(m mVar);

        void p(m mVar);

        void s(m mVar);
    }

    public m(InterfaceC6743hD2<?> interfaceC6743hD2) {
        this.e = interfaceC6743hD2;
        this.f = interfaceC6743hD2;
    }

    public static int V(int i) {
        C10907yF1.g(i, 0, 359, "orientation");
        if (i >= 315 || i < 45) {
            return 0;
        }
        if (i >= 225) {
            return 1;
        }
        if (i >= 135) {
            return 2;
        }
        return 3;
    }

    public boolean A(int i) {
        for (Integer num : u()) {
            if (C3553Ll2.e(i, num.intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean B(InterfaceC7402jx interfaceC7402jx) {
        int n = n();
        if (n != 0) {
            if (n == 1) {
                return true;
            }
            if (n == 2) {
                return interfaceC7402jx.o();
            }
            throw new AssertionError("Unknown mirrorMode: " + n);
        }
        return false;
    }

    public InterfaceC6743hD2<?> C(InterfaceC6918hx interfaceC6918hx, InterfaceC6743hD2<?> interfaceC6743hD2, InterfaceC6743hD2<?> interfaceC6743hD22) {
        C2569Bn1 u0;
        if (interfaceC6743hD22 != null) {
            u0 = C2569Bn1.v0(interfaceC6743hD22);
            u0.Q(InterfaceC3063Gl2.w);
        } else {
            u0 = C2569Bn1.u0();
        }
        if (this.e.g(InterfaceC6040eN0.l) || this.e.g(InterfaceC6040eN0.p)) {
            HJ.a<US1> aVar = InterfaceC6040eN0.t;
            if (u0.g(aVar)) {
                u0.Q(aVar);
            }
        }
        InterfaceC6743hD2<?> interfaceC6743hD23 = this.e;
        HJ.a<US1> aVar2 = InterfaceC6040eN0.t;
        if (interfaceC6743hD23.g(aVar2)) {
            HJ.a<Size> aVar3 = InterfaceC6040eN0.r;
            if (u0.g(aVar3) && ((US1) this.e.j(aVar2)).d() != null) {
                u0.Q(aVar3);
            }
        }
        for (HJ.a<?> aVar4 : this.e.f()) {
            HJ.k0(u0, u0, this.e, aVar4);
        }
        if (interfaceC6743hD2 != null) {
            for (HJ.a<?> aVar5 : interfaceC6743hD2.f()) {
                if (!aVar5.c().equals(InterfaceC3063Gl2.w.c())) {
                    HJ.k0(u0, u0, interfaceC6743hD2, aVar5);
                }
            }
        }
        if (u0.g(InterfaceC6040eN0.p)) {
            HJ.a<Integer> aVar6 = InterfaceC6040eN0.l;
            if (u0.g(aVar6)) {
                u0.Q(aVar6);
            }
        }
        HJ.a<US1> aVar7 = InterfaceC6040eN0.t;
        if (u0.g(aVar7) && ((US1) u0.j(aVar7)).a() != 0) {
            u0.h0(InterfaceC6743hD2.G, Boolean.TRUE);
        }
        return K(interfaceC6918hx, x(u0));
    }

    public final void D() {
        this.c = c.ACTIVE;
        G();
    }

    public final void E() {
        this.c = c.INACTIVE;
        G();
    }

    public final void F() {
        for (d dVar : this.a) {
            dVar.p(this);
        }
    }

    public final void G() {
        int i = a.a[this.c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                for (d dVar : this.a) {
                    dVar.h(this);
                }
                return;
            }
            return;
        }
        for (d dVar2 : this.a) {
            dVar2.s(this);
        }
    }

    public final void H() {
        for (d dVar : this.a) {
            dVar.i(this);
        }
    }

    public void I() {
    }

    public void J() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.hD2, o.hD2<?>] */
    public InterfaceC6743hD2<?> K(InterfaceC6918hx interfaceC6918hx, InterfaceC6743hD2.a<?, ?, ?> aVar) {
        return aVar.t();
    }

    public void L() {
    }

    public void M() {
    }

    public AbstractC4008Qd2 N(HJ hj) {
        AbstractC4008Qd2 abstractC4008Qd2 = this.g;
        if (abstractC4008Qd2 != null) {
            return abstractC4008Qd2.f().d(hj).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    public void P() {
    }

    public final void Q(d dVar) {
        this.a.remove(dVar);
    }

    public void R(AbstractC4078Qw abstractC4078Qw) {
        boolean z;
        if (abstractC4078Qw != null && !A(abstractC4078Qw.f())) {
            z = false;
        } else {
            z = true;
        }
        C10907yF1.a(z);
        this.l = abstractC4078Qw;
    }

    public void S(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [o.hD2, o.hD2<?>] */
    public boolean T(int i) {
        int N = ((InterfaceC6040eN0) j()).N(-1);
        if (N != -1 && N == i) {
            return false;
        }
        InterfaceC6743hD2.a<?, ?, ?> x = x(this.e);
        C7227jD2.a(x, i);
        this.e = x.t();
        InterfaceC7402jx g = g();
        if (g == null) {
            this.f = this.e;
            return true;
        }
        this.f = C(g.n(), this.d, this.h);
        return true;
    }

    public void U(Rect rect) {
        this.i = rect;
    }

    public final void W(InterfaceC7402jx interfaceC7402jx) {
        boolean z;
        P();
        b p0 = this.f.p0(null);
        if (p0 != null) {
            p0.a();
        }
        synchronized (this.b) {
            if (interfaceC7402jx == this.k) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.a(z);
            Q(this.k);
            this.k = null;
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public void X(T12 t12) {
        this.m = t12;
        for (D10 d10 : t12.l()) {
            if (d10.g() == null) {
                d10.q(getClass());
            }
        }
    }

    public void Y(AbstractC4008Qd2 abstractC4008Qd2) {
        this.g = O(abstractC4008Qd2);
    }

    public void Z(HJ hj) {
        this.g = N(hj);
    }

    public final void a(d dVar) {
        this.a.add(dVar);
    }

    public final void b(InterfaceC7402jx interfaceC7402jx, InterfaceC6743hD2<?> interfaceC6743hD2, InterfaceC6743hD2<?> interfaceC6743hD22) {
        synchronized (this.b) {
            this.k = interfaceC7402jx;
            a(interfaceC7402jx);
        }
        this.d = interfaceC6743hD2;
        this.h = interfaceC6743hD22;
        InterfaceC6743hD2<?> C = C(interfaceC7402jx.n(), this.d, this.h);
        this.f = C;
        b p0 = C.p0(null);
        if (p0 != null) {
            p0.b(interfaceC7402jx.n());
        }
        I();
    }

    public InterfaceC6743hD2<?> c() {
        return this.e;
    }

    public int d() {
        return ((InterfaceC6040eN0) this.f).u(-1);
    }

    public AbstractC4008Qd2 e() {
        return this.g;
    }

    public Size f() {
        AbstractC4008Qd2 abstractC4008Qd2 = this.g;
        if (abstractC4008Qd2 != null) {
            return abstractC4008Qd2.e();
        }
        return null;
    }

    public InterfaceC7402jx g() {
        InterfaceC7402jx interfaceC7402jx;
        synchronized (this.b) {
            interfaceC7402jx = this.k;
        }
        return interfaceC7402jx;
    }

    public InterfaceC9610sw h() {
        synchronized (this.b) {
            try {
                InterfaceC7402jx interfaceC7402jx = this.k;
                if (interfaceC7402jx == null) {
                    return InterfaceC9610sw.a;
                }
                return interfaceC7402jx.j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        InterfaceC7402jx g = g();
        return ((InterfaceC7402jx) C10907yF1.m(g, "No camera attached to use case: " + this)).n().c();
    }

    public InterfaceC6743hD2<?> j() {
        return this.f;
    }

    public abstract InterfaceC6743hD2<?> k(boolean z, InterfaceC6986iD2 interfaceC6986iD2);

    public AbstractC4078Qw l() {
        return this.l;
    }

    public int m() {
        return this.f.t();
    }

    public int n() {
        return ((InterfaceC6040eN0) this.f).q0(0);
    }

    public String o() {
        InterfaceC6743hD2<?> interfaceC6743hD2 = this.f;
        String v = interfaceC6743hD2.v("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(v);
        return v;
    }

    public int p(InterfaceC7402jx interfaceC7402jx) {
        return q(interfaceC7402jx, false);
    }

    public int q(InterfaceC7402jx interfaceC7402jx, boolean z) {
        int t = interfaceC7402jx.n().t(w());
        if (!interfaceC7402jx.r() && z) {
            return C5433bs2.A(-t);
        }
        return t;
    }

    public TS1 r() {
        InterfaceC7402jx g = g();
        Size f = f();
        if (g != null && f != null) {
            Rect y = y();
            if (y == null) {
                y = new Rect(0, 0, f.getWidth(), f.getHeight());
            }
            return new TS1(f, y, p(g));
        }
        return null;
    }

    public Matrix s() {
        return this.j;
    }

    public T12 t() {
        return this.m;
    }

    public Set<Integer> u() {
        return Collections.EMPTY_SET;
    }

    public Range<Integer> v() {
        return this.f.E(AbstractC4008Qd2.a);
    }

    public int w() {
        return ((InterfaceC6040eN0) this.f).N(0);
    }

    public abstract InterfaceC6743hD2.a<?, ?, ?> x(HJ hj);

    public Rect y() {
        return this.i;
    }

    public boolean z(String str) {
        if (g() == null) {
            return false;
        }
        return Objects.equals(str, i());
    }

    public AbstractC4008Qd2 O(AbstractC4008Qd2 abstractC4008Qd2) {
        return abstractC4008Qd2;
    }
}
