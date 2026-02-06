package o;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.c;
import androidx.camera.core.f;
import androidx.camera.core.k;
import androidx.lifecycle.LiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import o.AbstractC2699Cw;
import o.C2602Bw0;
import o.C5587cV1;
import o.C7033iP1;
import o.C7713lD2;
import o.CG2;
import o.InterfaceC6040eN0;
import o.InterfaceC9367rw;

/* renamed from: o.Cw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2699Cw {
    public static final String H = "CameraController";
    public static final String I = "Camera not initialized.";
    public static final String J = "PreviewView not attached to CameraController.";
    public static final String K = "Use cases not attached to camera.";
    public static final String L = "ImageCapture disabled.";
    public static final String M = "VideoCapture disabled.";
    public static final String N = "Recording video. Only one recording can be active at a time.";
    public static final float O = 0.16666667f;
    public static final float P = 0.25f;
    public static final int Q = 1;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 3;
    public static final int V = 4;
    public static final int W = 1;
    public static final int X = 2;
    public static final int Y = 4;
    public final C7364jn1<Integer> A;
    public final C10163vC1<Boolean> B;
    public final C10163vC1<Float> C;
    public final C10163vC1<Float> D;
    public final Set<AbstractC4078Qw> E;
    public final Context F;
    public final InterfaceFutureC8411o11<Void> G;
    public C2898Ex a;
    public int b;
    public androidx.camera.core.k c;
    public d d;
    public androidx.camera.core.f e;
    public d f;
    public Executor g;
    public Executor h;
    public Executor i;
    public c.a j;
    public androidx.camera.core.c k;
    public d l;
    public C9204rF2<C7033iP1> m;
    public C10215vP1 n;

    /* renamed from: o  reason: collision with root package name */
    public Map<InterfaceC10929yL<CG2>, C10215vP1> f433o;
    public C6276fL1 p;
    public InterfaceC3099Gv q;
    public SH1 r;
    public UH2 s;
    public k.c t;
    public final C5587cV1 u;
    public final C5587cV1.b v;
    public boolean w;
    public boolean x;
    public final C9134qy0<InterfaceC9483sO2> y;
    public final C9134qy0<Integer> z;

    /* renamed from: o.Cw$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC10929yL<CG2> {
        public final /* synthetic */ Executor X;
        public final /* synthetic */ InterfaceC10929yL Y;

        public a(Executor executor, InterfaceC10929yL interfaceC10929yL) {
            this.X = executor;
            this.Y = interfaceC10929yL;
        }

        @Override // o.InterfaceC10929yL
        /* renamed from: b */
        public void accept(CG2 cg2) {
            if (cg2 instanceof CG2.a) {
                if (!C5901do2.f()) {
                    this.X.execute(new Runnable() { // from class: o.Bw
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2699Cw.this.m(AbstractC2699Cw.a.this);
                        }
                    });
                } else {
                    AbstractC2699Cw.this.m(this);
                }
            }
            this.Y.accept(cg2);
        }
    }

    /* renamed from: o.Cw$b */
    /* loaded from: classes.dex */
    public class b implements XB0<C3788Nw0> {
        public b() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            if (th instanceof InterfaceC9367rw.a) {
                C7433k41.a(AbstractC2699Cw.H, "Tap-to-focus is canceled by new action.");
                return;
            }
            C7433k41.b(AbstractC2699Cw.H, "Tap to focus failed.", th);
            AbstractC2699Cw.this.A.o(4);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(C3788Nw0 c3788Nw0) {
            int i;
            if (c3788Nw0 == null) {
                return;
            }
            C7433k41.a(AbstractC2699Cw.H, "Tap to focus onSuccess: " + c3788Nw0.c());
            C7364jn1<Integer> c7364jn1 = AbstractC2699Cw.this.A;
            if (c3788Nw0.c()) {
                i = 2;
            } else {
                i = 3;
            }
            c7364jn1.o(Integer.valueOf(i));
        }
    }

    /* renamed from: o.Cw$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Cw$e */
    /* loaded from: classes.dex */
    public @interface e {
    }

    public AbstractC2699Cw(Context context) {
        this(context, C7221jC0.n(androidx.camera.lifecycle.b.u(context), new InterfaceC6490gB0() { // from class: o.yw
            @Override // o.InterfaceC6490gB0
            public final Object apply(Object obj) {
                return new TH1((androidx.camera.lifecycle.b) obj);
            }
        }, C5211ay.b()));
    }

    public static /* synthetic */ Void a(AbstractC2699Cw abstractC2699Cw, SH1 sh1) {
        abstractC2699Cw.r = sh1;
        abstractC2699Cw.t0();
        return null;
    }

    public static /* synthetic */ void b(AbstractC2699Cw abstractC2699Cw, int i) {
        abstractC2699Cw.k.s0(i);
        abstractC2699Cw.e.E0(i);
        abstractC2699Cw.m.U0(i);
    }

    public static C7033iP1 o(C6276fL1 c6276fL1) {
        return new C7033iP1.j().j(c6276fL1).e();
    }

    public static Context p(Context context) {
        String b2;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30 && (b2 = c.b(context)) != null) {
            return c.a(applicationContext, b2);
        }
        return applicationContext;
    }

    public d A() {
        C5901do2.c();
        return this.f;
    }

    public final void A0() {
        this.u.c(this.v);
    }

    public InterfaceFutureC8411o11<Void> B() {
        return this.G;
    }

    public final void B0() {
        C5901do2.c();
        C10215vP1 c10215vP1 = this.n;
        if (c10215vP1 != null) {
            c10215vP1.m();
            l(this.n);
        }
    }

    public d C() {
        C5901do2.c();
        return this.d;
    }

    public void C0(f.l lVar, Executor executor, f.k kVar) {
        C5901do2.c();
        C10907yF1.o(J(), I);
        C10907yF1.o(L(), L);
        I0(lVar);
        this.e.G0(lVar, executor, kVar);
    }

    public LiveData<Integer> D() {
        C5901do2.c();
        return this.A;
    }

    public void D0(Executor executor, f.j jVar) {
        C5901do2.c();
        C10907yF1.o(J(), I);
        C10907yF1.o(L(), L);
        this.e.H0(executor, jVar);
    }

    public LiveData<Integer> E() {
        C5901do2.c();
        return this.z;
    }

    public final void E0(int i, int i2) {
        c.a aVar;
        C5901do2.c();
        if (J()) {
            this.r.b(this.k);
        }
        c.C0014c O2 = new c.C0014c().E(i).O(i2);
        o0(O2, this.l);
        Executor executor = this.i;
        if (executor != null) {
            O2.h(executor);
        }
        androidx.camera.core.c build = O2.build();
        this.k = build;
        Executor executor2 = this.h;
        if (executor2 != null && (aVar = this.j) != null) {
            build.r0(executor2, aVar);
        }
    }

    public C6276fL1 F() {
        C5901do2.c();
        return this.p;
    }

    public final void F0(int i) {
        if (J()) {
            this.r.b(this.e);
        }
        f.b F = new f.b().F(i);
        o0(F, this.f);
        Executor executor = this.g;
        if (executor != null) {
            F.h(executor);
        }
        this.e = F.build();
    }

    public LiveData<InterfaceC9483sO2> G() {
        C5901do2.c();
        return this.y;
    }

    public final void G0() {
        if (J()) {
            this.r.b(this.c);
        }
        k.a aVar = new k.a();
        o0(aVar, this.d);
        this.c = aVar.build();
    }

    public boolean H(C2898Ex c2898Ex) {
        C5901do2.c();
        C10907yF1.l(c2898Ex);
        SH1 sh1 = this.r;
        if (sh1 != null) {
            try {
                return sh1.c(c2898Ex);
            } catch (C7159ix e2) {
                C7433k41.q(H, "Failed to check camera availability", e2);
                return false;
            }
        }
        throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
    }

    public final void H0() {
        if (J()) {
            this.r.b(this.m);
        }
        this.m = j();
    }

    public final boolean I() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    public void I0(f.l lVar) {
        boolean z;
        if (this.a.d() != null && !lVar.d().c()) {
            f.i d2 = lVar.d();
            if (this.a.d().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            d2.f(z);
        }
    }

    public final boolean J() {
        if (this.r != null) {
            return true;
        }
        return false;
    }

    public void J0(Matrix matrix) {
        C5901do2.c();
        c.a aVar = this.j;
        if (aVar != null && aVar.b() == 1) {
            this.j.c(matrix);
        }
    }

    public boolean K() {
        C5901do2.c();
        return R(2);
    }

    public final InterfaceC10929yL<CG2> K0(InterfaceC10929yL<CG2> interfaceC10929yL) {
        return new a(C10201vM.o(this.F), interfaceC10929yL);
    }

    public boolean L() {
        C5901do2.c();
        return R(1);
    }

    public final boolean M(d dVar, d dVar2) {
        if (dVar == dVar2) {
            return true;
        }
        if (dVar != null && dVar.equals(dVar2)) {
            return true;
        }
        return false;
    }

    public boolean N() {
        C5901do2.c();
        return this.w;
    }

    public final boolean O() {
        if (this.t != null && this.s != null) {
            return true;
        }
        return false;
    }

    public boolean P() {
        C5901do2.c();
        C10215vP1 c10215vP1 = this.n;
        if (c10215vP1 != null && !c10215vP1.isClosed()) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        C5901do2.c();
        return this.x;
    }

    public final boolean R(int i) {
        if ((i & this.b) != 0) {
            return true;
        }
        return false;
    }

    public boolean S() {
        C5901do2.c();
        return R(4);
    }

    public void T(float f) {
        if (!I()) {
            C7433k41.p(H, K);
        } else if (!this.w) {
            C7433k41.a(H, "Pinch to zoom disabled.");
        } else {
            C7433k41.a(H, "Pinch to zoom with scale: " + f);
            InterfaceC9483sO2 f2 = G().f();
            if (f2 == null) {
                return;
            }
            q0(Math.min(Math.max(f2.d() * r0(f), f2.c()), f2.a()));
        }
    }

    public void U(AbstractC8825pj1 abstractC8825pj1, float f, float f2) {
        if (!I()) {
            C7433k41.p(H, K);
        } else if (!this.x) {
            C7433k41.a(H, "Tap to focus disabled. ");
        } else {
            C7433k41.a(H, "Tap to focus started: " + f + C6566gU0.h + f2);
            this.A.o(1);
            C8582oj1 c2 = abstractC8825pj1.c(f, f2, 0.16666667f);
            C7221jC0.b(this.q.a().m(new C2602Bw0.a(c2, 1).b(abstractC8825pj1.c(f, f2, 0.25f), 2).c()), new b(), C5211ay.b());
        }
    }

    public final C9677tC1 V(AbstractC5209ax1 abstractC5209ax1) {
        C7033iP1 G0 = this.m.G0();
        if (abstractC5209ax1 instanceof C9583sp0) {
            return G0.f0(this.F, (C9583sp0) abstractC5209ax1);
        }
        if (abstractC5209ax1 instanceof C5903dp0) {
            if (Build.VERSION.SDK_INT >= 26) {
                return G0.e0(this.F, (C5903dp0) abstractC5209ax1);
            }
            throw new UnsupportedOperationException("File descriptors are not supported on pre-Android O (API 26) devices.");
        } else if (abstractC5209ax1 instanceof C3536Lh1) {
            return G0.g0(this.F, (C3536Lh1) abstractC5209ax1);
        } else {
            throw new IllegalArgumentException("Unsupported OutputOptions type.");
        }
    }

    public final void W(c.a aVar, c.a aVar2) {
        Size a2;
        Size size = null;
        if (aVar == null) {
            a2 = null;
        } else {
            a2 = aVar.a();
        }
        if (aVar2 != null) {
            size = aVar2.a();
        }
        if (!Objects.equals(a2, size)) {
            E0(this.k.i0(), this.k.j0());
            t0();
        }
    }

    public final void X(C10215vP1 c10215vP1, InterfaceC10929yL<CG2> interfaceC10929yL) {
        this.f433o.put(interfaceC10929yL, c10215vP1);
        this.n = c10215vP1;
    }

    public void Y(C2898Ex c2898Ex) {
        C5901do2.c();
        final C2898Ex c2898Ex2 = this.a;
        if (c2898Ex2 != c2898Ex) {
            this.a = c2898Ex;
            SH1 sh1 = this.r;
            if (sh1 == null) {
                return;
            }
            sh1.b(this.c, this.e, this.k, this.m);
            u0(new Runnable() { // from class: o.Aw
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2699Cw.this.a = c2898Ex2;
                }
            });
        }
    }

    public void Z(Set<AbstractC4078Qw> set) {
        C5901do2.c();
        if (Objects.equals(this.E, set)) {
            return;
        }
        SH1 sh1 = this.r;
        if (sh1 != null) {
            sh1.a();
        }
        this.E.clear();
        this.E.addAll(set);
        t0();
    }

    public void a0(int i) {
        C5901do2.c();
        final int i2 = this.b;
        if (i == i2) {
            return;
        }
        this.b = i;
        if (!S() && P()) {
            B0();
        }
        u0(new Runnable() { // from class: o.zw
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2699Cw.this.b = i2;
            }
        });
    }

    public void b0(Executor executor, c.a aVar) {
        C5901do2.c();
        c.a aVar2 = this.j;
        if (aVar2 == aVar && this.h == executor) {
            return;
        }
        this.h = executor;
        this.j = aVar;
        this.k.r0(executor, aVar);
        W(aVar2, aVar);
    }

    public void c0(Executor executor) {
        C5901do2.c();
        if (this.i == executor) {
            return;
        }
        this.i = executor;
        E0(this.k.i0(), this.k.j0());
        t0();
    }

    public void d0(int i) {
        C5901do2.c();
        if (this.k.i0() == i) {
            return;
        }
        E0(i, this.k.j0());
        t0();
    }

    public void e(k.c cVar, UH2 uh2) {
        C5901do2.c();
        if (this.t != cVar) {
            this.t = cVar;
            this.c.p0(cVar);
        }
        this.s = uh2;
        v0();
        t0();
    }

    public void e0(int i) {
        C5901do2.c();
        if (this.k.j0() == i) {
            return;
        }
        E0(this.k.i0(), i);
        t0();
    }

    public final void f() {
        if (EC1.d(this.F, "android.permission.RECORD_AUDIO") != -1) {
            return;
        }
        throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
    }

    public void f0(d dVar) {
        C5901do2.c();
        if (M(this.l, dVar)) {
            return;
        }
        this.l = dVar;
        E0(this.k.i0(), this.k.j0());
        t0();
    }

    public void g() {
        C5901do2.c();
        SH1 sh1 = this.r;
        if (sh1 != null) {
            sh1.a();
        }
        this.E.clear();
        t0();
    }

    public void g0(int i) {
        C5901do2.c();
        this.e.D0(i);
    }

    public void h() {
        C5901do2.c();
        c.a aVar = this.j;
        this.h = null;
        this.j = null;
        this.k.e0();
        W(aVar, null);
    }

    public void h0(Executor executor) {
        C5901do2.c();
        if (this.g == executor) {
            return;
        }
        this.g = executor;
        F0(this.e.l0());
        t0();
    }

    public void i() {
        C5901do2.c();
        SH1 sh1 = this.r;
        if (sh1 != null) {
            sh1.b(this.c, this.e, this.k, this.m);
        }
        this.c.p0(null);
        this.q = null;
        this.t = null;
        this.s = null;
        A0();
    }

    public void i0(int i) {
        C5901do2.c();
        if (this.e.l0() == i) {
            return;
        }
        F0(i);
        t0();
    }

    public final C9204rF2<C7033iP1> j() {
        return C9204rF2.c1(o(this.p));
    }

    public void j0(d dVar) {
        C5901do2.c();
        if (M(this.f, dVar)) {
            return;
        }
        this.f = dVar;
        F0(z());
        t0();
    }

    public C7713lD2 k() {
        if (!J()) {
            C7433k41.a(H, I);
            return null;
        } else if (!O()) {
            C7433k41.a(H, J);
            return null;
        } else {
            C7713lD2.a b2 = new C7713lD2.a().b(this.c);
            if (L()) {
                b2.b(this.e);
            } else {
                this.r.b(this.e);
            }
            if (K()) {
                b2.b(this.k);
            } else {
                this.r.b(this.k);
            }
            if (S()) {
                b2.b(this.m);
            } else {
                this.r.b(this.m);
            }
            b2.e(this.s);
            for (AbstractC4078Qw abstractC4078Qw : this.E) {
                b2.a(abstractC4078Qw);
            }
            return b2.c();
        }
    }

    public InterfaceFutureC8411o11<Void> k0(float f) {
        C5901do2.c();
        if (!I()) {
            return this.C.c(Float.valueOf(f));
        }
        return this.q.a().d(f);
    }

    public final void l(C10215vP1 c10215vP1) {
        if (this.n == c10215vP1) {
            this.n = null;
        }
    }

    public void l0(boolean z) {
        C5901do2.c();
        this.w = z;
    }

    public void m(InterfaceC10929yL<CG2> interfaceC10929yL) {
        C10215vP1 remove = this.f433o.remove(interfaceC10929yL);
        if (remove != null) {
            l(remove);
        }
    }

    public void m0(d dVar) {
        C5901do2.c();
        if (M(this.d, dVar)) {
            return;
        }
        this.d = dVar;
        G0();
        t0();
    }

    public InterfaceFutureC8411o11<Void> n(boolean z) {
        C5901do2.c();
        if (!I()) {
            return this.B.c(Boolean.valueOf(z));
        }
        return this.q.a().j(z);
    }

    public void n0(boolean z) {
        C5901do2.c();
        this.x = z;
    }

    public final void o0(InterfaceC6040eN0.a<?> aVar, d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.b() != null) {
            aVar.r(dVar.b());
        } else if (dVar.a() != -1) {
            aVar.s(dVar.a());
        } else {
            C7433k41.c(H, "Invalid target surface size. " + dVar);
        }
    }

    public void p0(C6276fL1 c6276fL1) {
        C5901do2.c();
        this.p = c6276fL1;
        H0();
        t0();
    }

    public InterfaceC9367rw q() {
        C5901do2.c();
        InterfaceC3099Gv interfaceC3099Gv = this.q;
        if (interfaceC3099Gv == null) {
            return null;
        }
        return interfaceC3099Gv.a();
    }

    public InterfaceFutureC8411o11<Void> q0(float f) {
        C5901do2.c();
        if (!I()) {
            return this.D.c(Float.valueOf(f));
        }
        return this.q.a().g(f);
    }

    public InterfaceC6420fx r() {
        C5901do2.c();
        InterfaceC3099Gv interfaceC3099Gv = this.q;
        if (interfaceC3099Gv == null) {
            return null;
        }
        return interfaceC3099Gv.c();
    }

    public final float r0(float f) {
        if (f > 1.0f) {
            return ((f - 1.0f) * 2.0f) + 1.0f;
        }
        return 1.0f - ((1.0f - f) * 2.0f);
    }

    public C2898Ex s() {
        C5901do2.c();
        return this.a;
    }

    public abstract InterfaceC3099Gv s0();

    public Executor t() {
        C5901do2.c();
        return this.i;
    }

    public void t0() {
        u0(null);
    }

    public int u() {
        C5901do2.c();
        return this.k.i0();
    }

    public void u0(Runnable runnable) {
        try {
            this.q = s0();
            if (!I()) {
                C7433k41.a(H, K);
                return;
            }
            this.y.u(this.q.c().x());
            this.z.u(this.q.c().o());
            this.B.b(new InterfaceC6490gB0() { // from class: o.tw
                @Override // o.InterfaceC6490gB0
                public final Object apply(Object obj) {
                    return AbstractC2699Cw.this.n(((Boolean) obj).booleanValue());
                }
            });
            this.C.b(new InterfaceC6490gB0() { // from class: o.uw
                @Override // o.InterfaceC6490gB0
                public final Object apply(Object obj) {
                    return AbstractC2699Cw.this.k0(((Float) obj).floatValue());
                }
            });
            this.D.b(new InterfaceC6490gB0() { // from class: o.vw
                @Override // o.InterfaceC6490gB0
                public final Object apply(Object obj) {
                    return AbstractC2699Cw.this.q0(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e2) {
            if (runnable != null) {
                runnable.run();
            }
            throw e2;
        }
    }

    public int v() {
        C5901do2.c();
        return this.k.j0();
    }

    public final void v0() {
        this.u.a(C5211ay.f(), this.v);
    }

    public d w() {
        C5901do2.c();
        return this.l;
    }

    public C10215vP1 w0(C5903dp0 c5903dp0, C2441Ag c2441Ag, Executor executor, InterfaceC10929yL<CG2> interfaceC10929yL) {
        return z0(c5903dp0, c2441Ag, executor, interfaceC10929yL);
    }

    public int x() {
        C5901do2.c();
        return this.e.n0();
    }

    public C10215vP1 x0(C9583sp0 c9583sp0, C2441Ag c2441Ag, Executor executor, InterfaceC10929yL<CG2> interfaceC10929yL) {
        return z0(c9583sp0, c2441Ag, executor, interfaceC10929yL);
    }

    public Executor y() {
        C5901do2.c();
        return this.g;
    }

    public C10215vP1 y0(C3536Lh1 c3536Lh1, C2441Ag c2441Ag, Executor executor, InterfaceC10929yL<CG2> interfaceC10929yL) {
        return z0(c3536Lh1, c2441Ag, executor, interfaceC10929yL);
    }

    public int z() {
        C5901do2.c();
        return this.e.l0();
    }

    public final C10215vP1 z0(AbstractC5209ax1 abstractC5209ax1, C2441Ag c2441Ag, Executor executor, InterfaceC10929yL<CG2> interfaceC10929yL) {
        C5901do2.c();
        C10907yF1.o(J(), I);
        C10907yF1.o(S(), M);
        C10907yF1.o(!P(), N);
        InterfaceC10929yL<CG2> K0 = K0(interfaceC10929yL);
        C9677tC1 V2 = V(abstractC5209ax1);
        if (c2441Ag.b()) {
            f();
            V2.j();
        }
        C10215vP1 i = V2.i(executor, K0);
        X(i, K0);
        return i;
    }

    /* renamed from: o.Cw$d */
    /* loaded from: classes.dex */
    public static final class d {
        public static final int c = -1;
        public final int a;
        public final Size b;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.Cw$d$a */
        /* loaded from: classes.dex */
        public @interface a {
        }

        public d(int i) {
            C10907yF1.a(i != -1);
            this.a = i;
            this.b = null;
        }

        public int a() {
            return this.a;
        }

        public Size b() {
            return this.b;
        }

        public String toString() {
            return "aspect ratio: " + this.a + " resolution: " + this.b;
        }

        public d(Size size) {
            C10907yF1.l(size);
            this.a = -1;
            this.b = size;
        }
    }

    public AbstractC2699Cw(Context context, InterfaceFutureC8411o11<SH1> interfaceFutureC8411o11) {
        this.a = C2898Ex.g;
        this.b = 3;
        this.n = null;
        this.f433o = new HashMap();
        this.p = C7033iP1.j0;
        this.w = true;
        this.x = true;
        this.y = new C9134qy0<>();
        this.z = new C9134qy0<>();
        this.A = new C7364jn1<>(0);
        this.B = new C10163vC1<>();
        this.C = new C10163vC1<>();
        this.D = new C10163vC1<>();
        this.E = new HashSet();
        Context p = p(context);
        this.F = p;
        this.c = new k.a().build();
        this.e = new f.b().build();
        this.k = new c.C0014c().build();
        this.m = j();
        this.G = C7221jC0.n(interfaceFutureC8411o11, new InterfaceC6490gB0() { // from class: o.ww
            @Override // o.InterfaceC6490gB0
            public final Object apply(Object obj) {
                return AbstractC2699Cw.a(AbstractC2699Cw.this, (SH1) obj);
            }
        }, C5211ay.f());
        this.u = new C5587cV1(p);
        this.v = new C5587cV1.b() { // from class: o.xw
            @Override // o.C5587cV1.b
            public final void a(int i) {
                AbstractC2699Cw.b(AbstractC2699Cw.this, i);
            }
        };
    }
}
