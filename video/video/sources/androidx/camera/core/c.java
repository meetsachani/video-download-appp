package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.c;
import androidx.camera.core.m;
import com.facebook.internal.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.AbstractC4008Qd2;
import o.C10907yF1;
import o.C2569Bn1;
import o.C2898Ex;
import o.C3597Ly;
import o.C5211ay;
import o.C5901do2;
import o.C5932dw1;
import o.C8495oM0;
import o.C8738pM0;
import o.C8807pf;
import o.C8985qN0;
import o.D10;
import o.HJ;
import o.InterfaceC10094uv1;
import o.InterfaceC3063Gl2;
import o.InterfaceC3849Om1;
import o.InterfaceC5070aN0;
import o.InterfaceC6040eN0;
import o.InterfaceC6743hD2;
import o.InterfaceC6918hx;
import o.InterfaceC6986iD2;
import o.InterfaceC7402jx;
import o.InterfaceC7470kD2;
import o.InterfaceC8742pN0;
import o.InterfaceC9085qn2;
import o.MN0;
import o.N80;
import o.SJ;
import o.SS1;
import o.T12;
import o.TS1;
import o.US1;
import o.W82;
import o.WS1;

/* loaded from: classes.dex */
public final class c extends m {
    public static final int A = 6;
    public static final int B = 1;
    public static final boolean D = false;
    public static final int E = 0;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 1;
    public static final int v = 2;
    public static final String x = "ImageAnalysis";
    public static final int y = 4;
    public static final int z = 0;
    public final androidx.camera.core.d n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f12o;
    public a p;
    public T12.b q;
    public D10 r;
    public static final d w = new d();
    public static final Boolean C = null;

    /* loaded from: classes.dex */
    public interface a {
        default Size a() {
            return null;
        }

        default int b() {
            return 0;
        }

        default void c(Matrix matrix) {
        }

        void d(g gVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* renamed from: androidx.camera.core.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0014c implements InterfaceC6040eN0.a<C0014c>, InterfaceC9085qn2.a<C0014c>, InterfaceC6743hD2.a<c, C8738pM0, C0014c>, InterfaceC5070aN0.a<C0014c> {
        public final C2569Bn1 a;

        public C0014c() {
            this(C2569Bn1.u0());
        }

        public static C0014c A(HJ hj) {
            return new C0014c(C2569Bn1.v0(hj));
        }

        public static C0014c B(C8738pM0 c8738pM0) {
            return new C0014c(C2569Bn1.v0(c8738pM0));
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: C */
        public C8738pM0 t() {
            return new C8738pM0(C5932dw1.t0(this.a));
        }

        @Override // o.InterfaceC9085qn2.a
        /* renamed from: D */
        public C0014c h(Executor executor) {
            e().h0(InterfaceC9085qn2.y, executor);
            return this;
        }

        public C0014c E(int i) {
            e().h0(C8738pM0.L, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: F */
        public C0014c b(C2898Ex c2898Ex) {
            e().h0(InterfaceC6743hD2.E, c2898Ex);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: G */
        public C0014c i(C3597Ly.b bVar) {
            e().h0(InterfaceC6743hD2.C, bVar);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: H */
        public C0014c x(InterfaceC6986iD2.b bVar) {
            e().h0(InterfaceC6743hD2.I, bVar);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: I */
        public C0014c m(List<Size> list) {
            e().h0(InterfaceC6040eN0.u, list);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: J */
        public C0014c v(C3597Ly c3597Ly) {
            e().h0(InterfaceC6743hD2.A, c3597Ly);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: K */
        public C0014c l(Size size) {
            e().h0(InterfaceC6040eN0.q, size);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: L */
        public C0014c j(T12 t12) {
            e().h0(InterfaceC6743hD2.z, t12);
            return this;
        }

        @Override // o.InterfaceC5070aN0.a
        /* renamed from: M */
        public C0014c p(N80 n80) {
            if (Objects.equals(N80.n, n80)) {
                e().h0(InterfaceC5070aN0.i, n80);
                return this;
            }
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: N */
        public C0014c n(boolean z) {
            e().h0(InterfaceC6743hD2.H, Boolean.valueOf(z));
            return this;
        }

        public C0014c O(int i) {
            e().h0(C8738pM0.M, Integer.valueOf(i));
            return this;
        }

        public C0014c P(InterfaceC8742pN0 interfaceC8742pN0) {
            e().h0(C8738pM0.N, interfaceC8742pN0);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: Q */
        public C0014c o(Size size) {
            e().h0(InterfaceC6040eN0.r, size);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: R */
        public C0014c u(int i) {
            throw new UnsupportedOperationException("setMirrorMode is not supported.");
        }

        public C0014c S(boolean z) {
            e().h0(C8738pM0.P, Boolean.valueOf(z));
            return this;
        }

        public C0014c T(int i) {
            e().h0(C8738pM0.O, Integer.valueOf(i));
            return this;
        }

        public C0014c U(boolean z) {
            e().h0(C8738pM0.Q, Boolean.valueOf(z));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: V */
        public C0014c f(US1 us1) {
            e().h0(InterfaceC6040eN0.t, us1);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: W */
        public C0014c d(T12.d dVar) {
            e().h0(InterfaceC6743hD2.B, dVar);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: X */
        public C0014c w(List<Pair<Integer, Size[]>> list) {
            e().h0(InterfaceC6040eN0.s, list);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: Y */
        public C0014c y(int i) {
            e().h0(InterfaceC6743hD2.D, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        @Deprecated
        /* renamed from: Z */
        public C0014c s(int i) {
            if (i == -1) {
                i = 0;
            }
            e().h0(InterfaceC6040eN0.l, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: a0 */
        public C0014c q(Class<c> cls) {
            e().h0(InterfaceC3063Gl2.x, cls);
            if (e().h(InterfaceC3063Gl2.w, null) == null) {
                k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: b0 */
        public C0014c k(String str) {
            e().h0(InterfaceC3063Gl2.w, str);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        @Deprecated
        /* renamed from: c0 */
        public C0014c r(Size size) {
            e().h0(InterfaceC6040eN0.p, size);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: d0 */
        public C0014c g(int i) {
            e().h0(InterfaceC6040eN0.m, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC10288vj0
        public InterfaceC3849Om1 e() {
            return this.a;
        }

        @Override // o.InterfaceC7470kD2.a
        /* renamed from: e0 */
        public C0014c c(m.b bVar) {
            e().h0(InterfaceC7470kD2.J, bVar);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: f0 */
        public C0014c a(boolean z) {
            e().h0(InterfaceC6743hD2.G, Boolean.valueOf(z));
            return this;
        }

        @Override // o.InterfaceC10288vj0
        /* renamed from: z */
        public c build() {
            C8738pM0 t = t();
            InterfaceC6040eN0.n0(t);
            return new c(t);
        }

        public C0014c(C2569Bn1 c2569Bn1) {
            this.a = c2569Bn1;
            Class cls = (Class) c2569Bn1.h(InterfaceC3063Gl2.x, null);
            if (cls != null && !cls.equals(c.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            q(c.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements SJ<C8738pM0> {
        public static final Size a;
        public static final int b = 1;
        public static final int c = 0;
        public static final N80 d;
        public static final US1 e;
        public static final C8738pM0 f;

        static {
            Size size = new Size(640, q0.n1);
            a = size;
            N80 n80 = N80.n;
            d = n80;
            US1 a2 = new US1.b().d(C8807pf.e).f(new WS1(W82.c, 1)).a();
            e = a2;
            f = new C0014c().l(size).y(1).s(0).f(a2).x(InterfaceC6986iD2.b.IMAGE_ANALYSIS).p(n80).t();
        }

        @Override // o.SJ
        /* renamed from: a */
        public C8738pM0 d() {
            return f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public c(C8738pM0 c8738pM0) {
        super(c8738pM0);
        this.f12o = new Object();
        if (((C8738pM0) j()).s0(0) == 1) {
            this.n = new C8495oM0();
        } else {
            this.n = new androidx.camera.core.e(c8738pM0.o0(C5211ay.c()));
        }
        this.n.r(l0());
        this.n.s(q0());
    }

    public static /* synthetic */ void a0(l lVar, l lVar2) {
        lVar.l();
        if (lVar2 != null) {
            lVar2.l();
        }
    }

    public static /* synthetic */ void c0(c cVar, String str, C8738pM0 c8738pM0, AbstractC4008Qd2 abstractC4008Qd2, T12 t12, T12.f fVar) {
        cVar.f0();
        cVar.n.g();
        if (cVar.z(str)) {
            cVar.X(cVar.g0(str, c8738pM0, abstractC4008Qd2).q());
            cVar.F();
        }
    }

    public static /* synthetic */ List d0(Size size, List list, int i) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.m
    public void I() {
        this.n.f();
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [o.hD2, o.hD2<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [o.CO1, o.hD2] */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.CO1, o.hD2] */
    /* JADX WARN: Type inference failed for: r6v8, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> K(InterfaceC6918hx interfaceC6918hx, InterfaceC6743hD2.a<?, ?, ?> aVar) {
        final Size size;
        US1.b b2;
        Boolean k0 = k0();
        boolean a2 = interfaceC6918hx.m().a(InterfaceC10094uv1.class);
        androidx.camera.core.d dVar = this.n;
        if (k0 != null) {
            a2 = k0.booleanValue();
        }
        dVar.q(a2);
        synchronized (this.f12o) {
            try {
                a aVar2 = this.p;
                if (aVar2 != null) {
                    size = aVar2.a();
                } else {
                    size = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size == null) {
            return aVar.t();
        }
        if (interfaceC6918hx.t(((Integer) aVar.e().h(InterfaceC6040eN0.m, 0)).intValue()) % 180 == 90) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        ?? t2 = aVar.t();
        HJ.a<Size> aVar3 = InterfaceC6040eN0.p;
        if (!t2.g(aVar3)) {
            aVar.e().h0(aVar3, size);
        }
        ?? t3 = aVar.t();
        HJ.a aVar4 = InterfaceC6040eN0.t;
        if (t3.g(aVar4)) {
            US1 us1 = (US1) c().h(aVar4, null);
            if (us1 == null) {
                b2 = new US1.b();
            } else {
                b2 = US1.b.b(us1);
            }
            if (us1 == null || us1.d() == null) {
                b2.f(new WS1(size, 1));
            }
            if (us1 == null) {
                b2.e(new SS1() { // from class: o.lM0
                    @Override // o.SS1
                    public final List a(List list, int i) {
                        return androidx.camera.core.c.d0(size, list, i);
                    }
                });
            }
            aVar.e().h0(aVar4, b2.a());
        }
        return aVar.t();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 N(HJ hj) {
        this.q.h(hj);
        X(this.q.q());
        return e().f().d(hj).a();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 O(AbstractC4008Qd2 abstractC4008Qd2) {
        T12.b g0 = g0(i(), (C8738pM0) j(), abstractC4008Qd2);
        this.q = g0;
        X(g0.q());
        return abstractC4008Qd2;
    }

    @Override // androidx.camera.core.m
    public void P() {
        f0();
        this.n.j();
    }

    @Override // androidx.camera.core.m
    public void S(Matrix matrix) {
        super.S(matrix);
        this.n.v(matrix);
    }

    @Override // androidx.camera.core.m
    public void U(Rect rect) {
        super.U(rect);
        this.n.w(rect);
    }

    public void e0() {
        synchronized (this.f12o) {
            try {
                this.n.p(null, null);
                if (this.p != null) {
                    E();
                }
                this.p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f0() {
        C5901do2.c();
        D10 d10 = this.r;
        if (d10 != null) {
            d10.d();
            this.r = null;
        }
    }

    public T12.b g0(final String str, final C8738pM0 c8738pM0, final AbstractC4008Qd2 abstractC4008Qd2) {
        int i;
        final l lVar;
        boolean z2;
        int width;
        int height;
        int i2;
        boolean z3;
        final l lVar2;
        C5901do2.c();
        Size e2 = abstractC4008Qd2.e();
        Executor executor = (Executor) C10907yF1.l(c8738pM0.o0(C5211ay.c()));
        boolean z4 = true;
        if (i0() == 1) {
            i = j0();
        } else {
            i = 4;
        }
        int i3 = i;
        if (c8738pM0.v0() != null) {
            lVar = new l(c8738pM0.v0().a(e2.getWidth(), e2.getHeight(), m(), i3, 0L));
        } else {
            lVar = new l(C8985qN0.a(e2.getWidth(), e2.getHeight(), m(), i3));
        }
        if (g() != null) {
            z2 = p0(g());
        } else {
            z2 = false;
        }
        if (z2) {
            width = e2.getHeight();
        } else {
            width = e2.getWidth();
        }
        if (z2) {
            height = e2.getWidth();
        } else {
            height = e2.getHeight();
        }
        if (l0() == 2) {
            i2 = 1;
        } else {
            i2 = 35;
        }
        if (m() == 35 && l0() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (m() != 35 || ((g() == null || p(g()) == 0) && !Boolean.TRUE.equals(k0()))) {
            z4 = false;
        }
        if (!z3 && !z4) {
            lVar2 = null;
        } else {
            lVar2 = new l(C8985qN0.a(width, height, i2, lVar.e()));
        }
        if (lVar2 != null) {
            this.n.t(lVar2);
        }
        t0();
        lVar.f(this.n, executor);
        T12.b s2 = T12.b.s(c8738pM0, abstractC4008Qd2.e());
        if (abstractC4008Qd2.d() != null) {
            s2.h(abstractC4008Qd2.d());
        }
        D10 d10 = this.r;
        if (d10 != null) {
            d10.d();
        }
        MN0 mn0 = new MN0(lVar.getSurface(), e2, m());
        this.r = mn0;
        mn0.k().h4(new Runnable() { // from class: o.iM0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.c.a0(androidx.camera.core.l.this, lVar2);
            }
        }, C5211ay.f());
        s2.w(abstractC4008Qd2.c());
        s2.o(this.r, abstractC4008Qd2.b());
        s2.g(new T12.c() { // from class: o.jM0
            @Override // o.T12.c
            public final void a(T12 t12, T12.f fVar) {
                androidx.camera.core.c.c0(androidx.camera.core.c.this, str, c8738pM0, abstractC4008Qd2, t12, fVar);
            }
        });
        return s2;
    }

    public Executor h0() {
        return ((C8738pM0) j()).o0(null);
    }

    public int i0() {
        return ((C8738pM0) j()).s0(0);
    }

    public int j0() {
        return ((C8738pM0) j()).u0(6);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> k(boolean z2, InterfaceC6986iD2 interfaceC6986iD2) {
        d dVar = w;
        HJ a2 = interfaceC6986iD2.a(dVar.d().g0(), 1);
        if (z2) {
            a2 = HJ.J(a2, dVar.d());
        }
        if (a2 == null) {
            return null;
        }
        return x(a2).t();
    }

    public Boolean k0() {
        return ((C8738pM0) j()).w0(C);
    }

    public int l0() {
        return ((C8738pM0) j()).x0(1);
    }

    public TS1 m0() {
        return r();
    }

    public US1 n0() {
        return ((InterfaceC6040eN0) j()).T(null);
    }

    public int o0() {
        return w();
    }

    public final boolean p0(InterfaceC7402jx interfaceC7402jx) {
        if (!q0() || p(interfaceC7402jx) % 180 == 0) {
            return false;
        }
        return true;
    }

    public boolean q0() {
        return ((C8738pM0) j()).y0(Boolean.FALSE).booleanValue();
    }

    public void r0(Executor executor, final a aVar) {
        synchronized (this.f12o) {
            try {
                this.n.p(executor, new a() { // from class: o.kM0
                    @Override // androidx.camera.core.c.a
                    public final void d(androidx.camera.core.g gVar) {
                        c.a.this.d(gVar);
                    }
                });
                if (this.p == null) {
                    D();
                }
                this.p = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s0(int i) {
        if (T(i)) {
            t0();
        }
    }

    public final void t0() {
        InterfaceC7402jx g = g();
        if (g != null) {
            this.n.u(p(g));
        }
    }

    public String toString() {
        return "ImageAnalysis:" + o();
    }

    @Override // androidx.camera.core.m
    public InterfaceC6743hD2.a<?, ?, ?> x(HJ hj) {
        return C0014c.A(hj);
    }
}
