package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.k;
import androidx.camera.core.m;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.AbstractC4008Qd2;
import o.AbstractC4078Qw;
import o.C10907yF1;
import o.C2569Bn1;
import o.C2898Ex;
import o.C3051Gi2;
import o.C3597Ly;
import o.C5211ay;
import o.C5901do2;
import o.C5932dw1;
import o.C6618gi2;
import o.C8807pf;
import o.C9800ti2;
import o.D10;
import o.HJ;
import o.InterfaceC3063Gl2;
import o.InterfaceC3849Om1;
import o.InterfaceC5070aN0;
import o.InterfaceC6040eN0;
import o.InterfaceC6743hD2;
import o.InterfaceC6918hx;
import o.InterfaceC6986iD2;
import o.InterfaceC7402jx;
import o.InterfaceC7470kD2;
import o.InterfaceC9085qn2;
import o.SJ;
import o.T12;
import o.TS1;
import o.US1;
import o.WG1;
import o.WS1;

/* loaded from: classes.dex */
public final class k extends m {
    public static final String v = "Preview";
    public c n;

    /* renamed from: o  reason: collision with root package name */
    public Executor f15o;
    public T12.b p;
    public D10 q;
    public C6618gi2 r;
    public C3051Gi2 s;
    public C9800ti2 t;
    public static final b u = new b();
    public static final Executor w = C5211ay.f();

    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6743hD2.a<k, WG1, a>, InterfaceC6040eN0.a<a>, InterfaceC9085qn2.a<a> {
        public final C2569Bn1 a;

        public a() {
            this(C2569Bn1.u0());
        }

        public static a A(WG1 wg1) {
            return new a(C2569Bn1.v0(wg1));
        }

        public static a z(HJ hj) {
            return new a(C2569Bn1.v0(hj));
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: B */
        public WG1 t() {
            return new WG1(C5932dw1.t0(this.a));
        }

        @Override // o.InterfaceC9085qn2.a
        /* renamed from: C */
        public a h(Executor executor) {
            e().h0(InterfaceC9085qn2.y, executor);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: D */
        public a b(C2898Ex c2898Ex) {
            e().h0(InterfaceC6743hD2.E, c2898Ex);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: E */
        public a i(C3597Ly.b bVar) {
            e().h0(InterfaceC6743hD2.C, bVar);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: F */
        public a x(InterfaceC6986iD2.b bVar) {
            e().h0(InterfaceC6743hD2.I, bVar);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: G */
        public a m(List<Size> list) {
            e().h0(InterfaceC6040eN0.u, list);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: H */
        public a v(C3597Ly c3597Ly) {
            e().h0(InterfaceC6743hD2.A, c3597Ly);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: I */
        public a l(Size size) {
            e().h0(InterfaceC6040eN0.q, size);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: J */
        public a j(T12 t12) {
            e().h0(InterfaceC6743hD2.z, t12);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: K */
        public a n(boolean z) {
            e().h0(InterfaceC6743hD2.H, Boolean.valueOf(z));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: L */
        public a o(Size size) {
            e().h0(InterfaceC6040eN0.r, size);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: M */
        public a u(int i) {
            throw new UnsupportedOperationException("setMirrorMode is not supported.");
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: N */
        public a f(US1 us1) {
            e().h0(InterfaceC6040eN0.t, us1);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: O */
        public a d(T12.d dVar) {
            e().h0(InterfaceC6743hD2.B, dVar);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: P */
        public a w(List<Pair<Integer, Size[]>> list) {
            e().h0(InterfaceC6040eN0.s, list);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: Q */
        public a y(int i) {
            e().h0(InterfaceC6743hD2.D, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        @Deprecated
        /* renamed from: R */
        public a s(int i) {
            if (i == -1) {
                i = 0;
            }
            e().h0(InterfaceC6040eN0.l, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: S */
        public a q(Class<k> cls) {
            e().h0(InterfaceC3063Gl2.x, cls);
            if (e().h(InterfaceC3063Gl2.w, null) == null) {
                k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a T(Range<Integer> range) {
            e().h0(InterfaceC6743hD2.F, range);
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: U */
        public a k(String str) {
            e().h0(InterfaceC3063Gl2.w, str);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        @Deprecated
        /* renamed from: V */
        public a r(Size size) {
            e().h0(InterfaceC6040eN0.p, size);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: W */
        public a g(int i) {
            e().h0(InterfaceC6040eN0.m, Integer.valueOf(i));
            e().h0(InterfaceC6040eN0.n, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC7470kD2.a
        /* renamed from: X */
        public a c(m.b bVar) {
            e().h0(InterfaceC7470kD2.J, bVar);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: Y */
        public a a(boolean z) {
            e().h0(InterfaceC6743hD2.G, Boolean.valueOf(z));
            return this;
        }

        @Override // o.InterfaceC10288vj0
        public InterfaceC3849Om1 e() {
            return this.a;
        }

        @Override // o.InterfaceC10288vj0
        /* renamed from: p */
        public k build() {
            WG1 t = t();
            InterfaceC6040eN0.n0(t);
            return new k(t);
        }

        public a(C2569Bn1 c2569Bn1) {
            this.a = c2569Bn1;
            Class cls = (Class) c2569Bn1.h(InterfaceC3063Gl2.x, null);
            if (cls != null && !cls.equals(k.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            q(k.class);
            c2569Bn1.h0(InterfaceC6040eN0.f723o, 2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements SJ<WG1> {
        public static final int a = 2;
        public static final int b = 0;
        public static final int c = 2;
        public static final US1 d;
        public static final WG1 e;

        static {
            US1 a2 = new US1.b().d(C8807pf.e).f(WS1.c).a();
            d = a2;
            e = new a().y(2).s(0).f(a2).x(InterfaceC6986iD2.b.PREVIEW).t();
        }

        @Override // o.SJ
        /* renamed from: a */
        public WG1 d() {
            return e;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(C3051Gi2 c3051Gi2);
    }

    public k(WG1 wg1) {
        super(wg1);
        this.f15o = w;
    }

    public static /* synthetic */ void b0(k kVar, String str, WG1 wg1, AbstractC4008Qd2 abstractC4008Qd2, T12 t12, T12.f fVar) {
        if (kVar.z(str)) {
            kVar.X(kVar.f0(str, wg1, abstractC4008Qd2).q());
            kVar.F();
        }
    }

    private void e0() {
        D10 d10 = this.q;
        if (d10 != null) {
            d10.d();
            this.q = null;
        }
        C9800ti2 c9800ti2 = this.t;
        if (c9800ti2 != null) {
            c9800ti2.g();
            this.t = null;
        }
        C6618gi2 c6618gi2 = this.r;
        if (c6618gi2 != null) {
            c6618gi2.i();
            this.r = null;
        }
        this.s = null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> K(InterfaceC6918hx interfaceC6918hx, InterfaceC6743hD2.a<?, ?, ?> aVar) {
        aVar.e().h0(InterfaceC5070aN0.h, 34);
        return aVar.t();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 N(HJ hj) {
        this.p.h(hj);
        X(this.p.q());
        return e().f().d(hj).a();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 O(AbstractC4008Qd2 abstractC4008Qd2) {
        t0(i(), (WG1) j(), abstractC4008Qd2);
        return abstractC4008Qd2;
    }

    @Override // androidx.camera.core.m
    public void P() {
        e0();
    }

    @Override // androidx.camera.core.m
    public void U(Rect rect) {
        super.U(rect);
        o0();
    }

    public final void d0(T12.b bVar, final String str, final WG1 wg1, final AbstractC4008Qd2 abstractC4008Qd2) {
        if (this.n != null) {
            bVar.o(this.q, abstractC4008Qd2.b());
        }
        bVar.g(new T12.c() { // from class: o.VG1
            @Override // o.T12.c
            public final void a(T12 t12, T12.f fVar) {
                androidx.camera.core.k.b0(androidx.camera.core.k.this, str, wg1, abstractC4008Qd2, t12, fVar);
            }
        });
    }

    public final T12.b f0(String str, WG1 wg1, AbstractC4008Qd2 abstractC4008Qd2) {
        boolean z;
        C5901do2.c();
        InterfaceC7402jx g = g();
        Objects.requireNonNull(g);
        final InterfaceC7402jx interfaceC7402jx = g;
        e0();
        if (this.r == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        Matrix s = s();
        boolean r = interfaceC7402jx.r();
        Rect h0 = h0(abstractC4008Qd2.e());
        Objects.requireNonNull(h0);
        this.r = new C6618gi2(1, 34, abstractC4008Qd2, s, r, h0, q(interfaceC7402jx, B(interfaceC7402jx)), d(), s0(interfaceC7402jx));
        AbstractC4078Qw l = l();
        if (l != null) {
            this.t = new C9800ti2(interfaceC7402jx, l.a());
            this.r.f(new Runnable() { // from class: o.TG1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.k.this.F();
                }
            });
            C9800ti2.d i = C9800ti2.d.i(this.r);
            final C6618gi2 c6618gi2 = this.t.a(C9800ti2.b.c(this.r, Collections.singletonList(i))).get(i);
            Objects.requireNonNull(c6618gi2);
            c6618gi2.f(new Runnable() { // from class: o.UG1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.k.this.m0(c6618gi2, interfaceC7402jx);
                }
            });
            this.s = c6618gi2.k(interfaceC7402jx);
            this.q = this.r.o();
        } else {
            this.r.f(new Runnable() { // from class: o.TG1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.k.this.F();
                }
            });
            C3051Gi2 k = this.r.k(interfaceC7402jx);
            this.s = k;
            this.q = k.m();
        }
        if (this.n != null) {
            n0();
        }
        T12.b s2 = T12.b.s(wg1, abstractC4008Qd2.e());
        s2.w(abstractC4008Qd2.c());
        if (abstractC4008Qd2.d() != null) {
            s2.h(abstractC4008Qd2.d());
        }
        d0(s2, str, wg1, abstractC4008Qd2);
        return s2;
    }

    public C6618gi2 g0() {
        C6618gi2 c6618gi2 = this.r;
        Objects.requireNonNull(c6618gi2);
        return c6618gi2;
    }

    public final Rect h0(Size size) {
        if (y() != null) {
            return y();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public TS1 i0() {
        return r();
    }

    public US1 j0() {
        return ((InterfaceC6040eN0) j()).T(null);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> k(boolean z, InterfaceC6986iD2 interfaceC6986iD2) {
        b bVar = u;
        HJ a2 = interfaceC6986iD2.a(bVar.d().g0(), 1);
        if (z) {
            a2 = HJ.J(a2, bVar.d());
        }
        if (a2 == null) {
            return null;
        }
        return x(a2).t();
    }

    public Range<Integer> k0() {
        return v();
    }

    public int l0() {
        return w();
    }

    public final void m0(C6618gi2 c6618gi2, InterfaceC7402jx interfaceC7402jx) {
        C5901do2.c();
        if (interfaceC7402jx == g()) {
            this.s = c6618gi2.k(interfaceC7402jx);
            n0();
        }
    }

    public final void n0() {
        o0();
        final c cVar = (c) C10907yF1.l(this.n);
        final C3051Gi2 c3051Gi2 = (C3051Gi2) C10907yF1.l(this.s);
        this.f15o.execute(new Runnable() { // from class: o.SG1
            @Override // java.lang.Runnable
            public final void run() {
                k.c.this.a(c3051Gi2);
            }
        });
    }

    public final void o0() {
        InterfaceC7402jx g = g();
        C6618gi2 c6618gi2 = this.r;
        if (g != null && c6618gi2 != null) {
            c6618gi2.D(q(g, B(g)), d());
        }
    }

    public void p0(c cVar) {
        q0(w, cVar);
    }

    @Override // androidx.camera.core.m
    public int q(InterfaceC7402jx interfaceC7402jx, boolean z) {
        if (interfaceC7402jx.r()) {
            return super.q(interfaceC7402jx, z);
        }
        return 0;
    }

    public void q0(Executor executor, c cVar) {
        C5901do2.c();
        if (cVar == null) {
            this.n = null;
            E();
            return;
        }
        this.n = cVar;
        this.f15o = executor;
        if (f() != null) {
            t0(i(), (WG1) j(), e());
            F();
        }
        D();
    }

    public void r0(int i) {
        if (T(i)) {
            o0();
        }
    }

    public final boolean s0(InterfaceC7402jx interfaceC7402jx) {
        if (interfaceC7402jx.r() && B(interfaceC7402jx)) {
            return true;
        }
        return false;
    }

    public final void t0(String str, WG1 wg1, AbstractC4008Qd2 abstractC4008Qd2) {
        T12.b f0 = f0(str, wg1, abstractC4008Qd2);
        this.p = f0;
        X(f0.q());
    }

    public String toString() {
        return "Preview:" + o();
    }

    @Override // androidx.camera.core.m
    public Set<Integer> u() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.m
    public InterfaceC6743hD2.a<?, ?, ?> x(HJ hj) {
        return a.z(hj);
    }
}
