package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import o.AbstractC7373jp2;
import o.C10521wg;
import o.C3144Hh1;
import o.C3704Na2;
import o.C4399Ud2;
import o.C4505Vg;
import o.C6118ei0;
import o.C9876u11;
import o.HD1;
import o.InterfaceC3921Pg0;
import o.InterfaceC7583kh1;
import o.OD1;
import o.Q20;
import o.U52;

@Deprecated
/* renamed from: o.Qh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4022Qh0 extends AbstractC2559Bl implements InterfaceC3921Pg0, InterfaceC3921Pg0.a, InterfaceC3921Pg0.f, InterfaceC3921Pg0.e, InterfaceC3921Pg0.d {
    public static final String x2 = "ExoPlayerImpl";
    public final C9949uJ2 A1;
    public final XK2 B1;
    public final long C1;
    public int D1;
    public boolean E1;
    public int F1;
    public int G1;
    public boolean H1;
    public int I1;
    public boolean J1;
    public LZ1 K1;
    public U52 L1;
    public boolean M1;
    public HD1.c N1;
    public C11005yf1 O1;
    public C11005yf1 P1;
    @InterfaceC11300zs1
    public C10833xx0 Q1;
    @InterfaceC11300zs1
    public C10833xx0 R1;
    @InterfaceC11300zs1
    public AudioTrack S1;
    @InterfaceC11300zs1
    public Object T1;
    @InterfaceC11300zs1
    public Surface U1;
    @InterfaceC11300zs1
    public SurfaceHolder V1;
    @InterfaceC11300zs1
    public C3704Na2 W1;
    public boolean X1;
    @InterfaceC11300zs1
    public TextureView Y1;
    public final C3381Jr2 Z0;
    public int Z1;
    public final HD1.c a1;
    public int a2;
    public final CJ b1;
    public L82 b2;
    public final Context c1;
    @InterfaceC11300zs1
    public C8775pW c2;
    public final HD1 d1;
    @InterfaceC11300zs1
    public C8775pW d2;
    public final InterfaceC10469wR1[] e1;
    public int e2;
    public final AbstractC3283Ir2 f1;
    public C9546sg f2;
    public final InterfaceC5285bG0 g1;
    public float g2;
    public final C6118ei0.f h1;
    public boolean h2;
    public final C6118ei0 i1;
    public C8274nS i2;
    public final C9876u11<HD1.g> j1;
    @InterfaceC11300zs1
    public InterfaceC5529cG2 j2;
    public final CopyOnWriteArraySet<InterfaceC3921Pg0.b> k1;
    @InterfaceC11300zs1
    public InterfaceC9857tx k2;
    public final AbstractC7373jp2.b l1;
    public boolean l2;
    public final List<e> m1;
    public boolean m2;
    public final boolean n1;
    @InterfaceC11300zs1
    public FH1 n2;
    public final InterfaceC7583kh1.a o1;
    public boolean o2;
    public final F8 p1;
    public boolean p2;
    public final Looper q1;
    public Q20 q2;
    public final InterfaceC3643Mk r1;
    public PG2 r2;
    public final long s1;
    public C11005yf1 s2;
    public final long t1;
    public BD1 t2;
    public final LD u1;
    public int u2;
    public final c v1;
    public int v2;
    public final d w1;
    public long w2;
    public final C10521wg x1;
    public final C4505Vg y1;
    @InterfaceC11300zs1
    public final C4399Ud2 z1;

    @ES1(31)
    /* renamed from: o.Qh0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @K40
        public static ND1 a(Context context, C4022Qh0 c4022Qh0, boolean z) {
            LogSessionId logSessionId;
            C2443Ag1 C0 = C2443Ag1.C0(context);
            if (C0 == null) {
                I31.n(C4022Qh0.x2, "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new ND1(logSessionId);
            }
            if (z) {
                c4022Qh0.P(C0);
            }
            return new ND1(C0.J0());
        }
    }

    /* renamed from: o.Qh0$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC5529cG2, InterfaceC9857tx, OD1.b {
        public static final int Z0 = 7;
        public static final int a1 = 8;
        public static final int b1 = 10000;
        @InterfaceC11300zs1
        public InterfaceC5529cG2 X;
        @InterfaceC11300zs1
        public InterfaceC9857tx Y;
        @InterfaceC11300zs1
        public InterfaceC9857tx Y0;
        @InterfaceC11300zs1
        public InterfaceC5529cG2 Z;

        public d() {
        }

        @Override // o.InterfaceC9857tx
        public void a(long j, float[] fArr) {
            InterfaceC9857tx interfaceC9857tx = this.Y0;
            if (interfaceC9857tx != null) {
                interfaceC9857tx.a(j, fArr);
            }
            InterfaceC9857tx interfaceC9857tx2 = this.Y;
            if (interfaceC9857tx2 != null) {
                interfaceC9857tx2.a(j, fArr);
            }
        }

        @Override // o.InterfaceC9857tx
        public void f() {
            InterfaceC9857tx interfaceC9857tx = this.Y0;
            if (interfaceC9857tx != null) {
                interfaceC9857tx.f();
            }
            InterfaceC9857tx interfaceC9857tx2 = this.Y;
            if (interfaceC9857tx2 != null) {
                interfaceC9857tx2.f();
            }
        }

        @Override // o.InterfaceC5529cG2
        public void h(long j, long j2, C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaFormat mediaFormat) {
            long j3;
            long j4;
            C10833xx0 c10833xx02;
            MediaFormat mediaFormat2;
            InterfaceC5529cG2 interfaceC5529cG2 = this.Z;
            if (interfaceC5529cG2 != null) {
                interfaceC5529cG2.h(j, j2, c10833xx0, mediaFormat);
                mediaFormat2 = mediaFormat;
                c10833xx02 = c10833xx0;
                j4 = j2;
                j3 = j;
            } else {
                j3 = j;
                j4 = j2;
                c10833xx02 = c10833xx0;
                mediaFormat2 = mediaFormat;
            }
            InterfaceC5529cG2 interfaceC5529cG22 = this.X;
            if (interfaceC5529cG22 != null) {
                interfaceC5529cG22.h(j3, j4, c10833xx02, mediaFormat2);
            }
        }

        @Override // o.OD1.b
        public void t(int i, @InterfaceC11300zs1 Object obj) {
            if (i != 7) {
                if (i != 8) {
                    if (i != 10000) {
                        return;
                    }
                    C3704Na2 c3704Na2 = (C3704Na2) obj;
                    if (c3704Na2 == null) {
                        this.Z = null;
                        this.Y0 = null;
                        return;
                    }
                    this.Z = c3704Na2.getVideoFrameMetadataListener();
                    this.Y0 = c3704Na2.getCameraMotionListener();
                    return;
                }
                this.Y = (InterfaceC9857tx) obj;
                return;
            }
            this.X = (InterfaceC5529cG2) obj;
        }
    }

    /* renamed from: o.Qh0$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC9795th1 {
        public final Object a;
        public AbstractC7373jp2 b;

        public e(Object obj, AbstractC7373jp2 abstractC7373jp2) {
            this.a = obj;
            this.b = abstractC7373jp2;
        }

        @Override // o.InterfaceC9795th1
        public Object a() {
            return this.a;
        }

        @Override // o.InterfaceC9795th1
        public AbstractC7373jp2 b() {
            return this.b;
        }
    }

    static {
        C6361fi0.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public C4022Qh0(InterfaceC3921Pg0.c cVar, @InterfaceC11300zs1 HD1 hd1) {
        boolean z;
        C4022Qh0 c4022Qh0;
        ND1 a2;
        C9546sg c9546sg;
        boolean z2;
        boolean z3;
        CJ cj = new CJ();
        this.b1 = cj;
        try {
            I31.h(x2, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + C6361fi0.c + "] [" + TD2.e + C6566gU0.g);
            Context applicationContext = cVar.a.getApplicationContext();
            this.c1 = applicationContext;
            F8 apply = cVar.i.apply(cVar.b);
            this.p1 = apply;
            this.n2 = cVar.k;
            this.f2 = cVar.l;
            this.Z1 = cVar.r;
            this.a2 = cVar.s;
            this.h2 = cVar.p;
            this.C1 = cVar.z;
            c cVar2 = new c();
            this.v1 = cVar2;
            d dVar = new d();
            this.w1 = dVar;
            Handler handler = new Handler(cVar.j);
            InterfaceC10469wR1[] a3 = cVar.d.get().a(handler, cVar2, cVar2, cVar2, cVar2);
            this.e1 = a3;
            if (a3.length > 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            AbstractC3283Ir2 abstractC3283Ir2 = cVar.f.get();
            this.f1 = abstractC3283Ir2;
            this.o1 = cVar.e.get();
            InterfaceC3643Mk interfaceC3643Mk = cVar.h.get();
            this.r1 = interfaceC3643Mk;
            this.n1 = cVar.t;
            this.K1 = cVar.u;
            this.s1 = cVar.v;
            this.t1 = cVar.w;
            this.M1 = cVar.A;
            Looper looper = cVar.j;
            this.q1 = looper;
            LD ld = cVar.b;
            this.u1 = ld;
            if (hd1 == null) {
                c4022Qh0 = this;
            } else {
                c4022Qh0 = hd1;
            }
            this.d1 = c4022Qh0;
            this.j1 = new C9876u11<>(looper, ld, new C9876u11.b() { // from class: o.Ch0
                @Override // o.C9876u11.b
                public final void a(Object obj, C4170Ru0 c4170Ru0) {
                    ((HD1.g) obj).c0(C4022Qh0.this.d1, new HD1.f(c4170Ru0));
                }
            });
            this.k1 = new CopyOnWriteArraySet<>();
            this.m1 = new ArrayList();
            this.L1 = new U52.a(0);
            C3381Jr2 c3381Jr2 = new C3381Jr2(new C10955yR1[a3.length], new InterfaceC6859hi0[a3.length], C3773Nr2.Y, null);
            this.Z0 = c3381Jr2;
            this.l1 = new AbstractC7373jp2.b();
            HD1.c f = new HD1.c.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).e(29, abstractC3283Ir2.h()).e(23, cVar.q).e(25, cVar.q).e(33, cVar.q).e(26, cVar.q).e(34, cVar.q).f();
            this.a1 = f;
            this.N1 = new HD1.c.a().b(f).a(4).a(10).f();
            this.g1 = ld.d(looper, null);
            C6118ei0.f fVar = new C6118ei0.f() { // from class: o.Dh0
                @Override // o.C6118ei0.f
                public final void a(C6118ei0.e eVar) {
                    r0.g1.k(new Runnable() { // from class: o.yh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4022Qh0.this.Y3(eVar);
                        }
                    });
                }
            };
            this.h1 = fVar;
            this.t2 = BD1.k(c3381Jr2);
            apply.l0(c4022Qh0, looper);
            int i = TD2.a;
            if (i < 31) {
                a2 = new ND1();
            } else {
                a2 = b.a(applicationContext, this, cVar.B);
            }
            C6118ei0 c6118ei0 = new C6118ei0(a3, abstractC3283Ir2, c3381Jr2, cVar.g.get(), interfaceC3643Mk, this.D1, this.E1, apply, this.K1, cVar.x, cVar.y, this.M1, looper, ld, fVar, a2, cVar.C);
            this.i1 = c6118ei0;
            this.g2 = 1.0f;
            this.D1 = 0;
            C11005yf1 c11005yf1 = C11005yf1.Q2;
            this.O1 = c11005yf1;
            this.P1 = c11005yf1;
            this.s2 = c11005yf1;
            this.u2 = -1;
            if (i < 21) {
                this.e2 = Z3(0);
            } else {
                this.e2 = TD2.P(applicationContext);
            }
            this.i2 = C8274nS.Z;
            this.l2 = true;
            l1(apply);
            interfaceC3643Mk.a(new Handler(looper), apply);
            B0(cVar2);
            long j = cVar.c;
            if (j > 0) {
                c6118ei0.v(j);
            }
            C10521wg c10521wg = new C10521wg(cVar.a, handler, cVar2);
            this.x1 = c10521wg;
            c10521wg.b(cVar.f584o);
            C4505Vg c4505Vg = new C4505Vg(cVar.a, handler, cVar2);
            this.y1 = c4505Vg;
            if (cVar.m) {
                c9546sg = this.f2;
            } else {
                c9546sg = null;
            }
            c4505Vg.n(c9546sg);
            if (cVar.q) {
                C4399Ud2 c4399Ud2 = new C4399Ud2(cVar.a, handler, cVar2);
                this.z1 = c4399Ud2;
                c4399Ud2.m(TD2.y0(this.f2.Z));
            } else {
                this.z1 = null;
            }
            C9949uJ2 c9949uJ2 = new C9949uJ2(cVar.a);
            this.A1 = c9949uJ2;
            if (cVar.n != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c9949uJ2.a(z2);
            XK2 xk2 = new XK2(cVar.a);
            this.B1 = xk2;
            if (cVar.n == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            xk2.a(z3);
            this.q2 = L3(this.z1);
            this.r2 = PG2.d1;
            this.b2 = L82.c;
            abstractC3283Ir2.l(this.f2);
            h4(1, 10, Integer.valueOf(this.e2));
            h4(2, 10, Integer.valueOf(this.e2));
            h4(1, 3, this.f2);
            h4(2, 4, Integer.valueOf(this.Z1));
            h4(2, 5, Integer.valueOf(this.a2));
            h4(1, 9, Boolean.valueOf(this.h2));
            h4(2, 7, dVar);
            h4(6, 8, dVar);
            cj.f();
        } catch (Throwable th) {
            this.b1.f();
            throw th;
        }
    }

    public static Q20 L3(@InterfaceC11300zs1 C4399Ud2 c4399Ud2) {
        int i;
        int i2 = 0;
        Q20.b bVar = new Q20.b(0);
        if (c4399Ud2 != null) {
            i = c4399Ud2.e();
        } else {
            i = 0;
        }
        Q20.b g = bVar.g(i);
        if (c4399Ud2 != null) {
            i2 = c4399Ud2.d();
        }
        return g.f(i2).e();
    }

    public static /* synthetic */ void S2(int i, HD1.k kVar, HD1.k kVar2, HD1.g gVar) {
        gVar.e0(i);
        gVar.R(kVar, kVar2, i);
    }

    public static int U3(boolean z, int i) {
        if (!z || i == 1) {
            return 1;
        }
        return 2;
    }

    public static long X3(BD1 bd1) {
        AbstractC7373jp2.d dVar = new AbstractC7373jp2.d();
        AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
        bd1.a.m(bd1.b.a, bVar);
        if (bd1.c == C10323vs.b) {
            return bd1.a.u(bVar.Z, dVar).f();
        }
        return bVar.t() + bd1.c;
    }

    public static /* synthetic */ void b3(BD1 bd1, HD1.g gVar) {
        gVar.L(bd1.g);
        gVar.i0(bd1.g);
    }

    @Override // o.HD1
    public void A(@InterfaceC11300zs1 TextureView textureView) {
        u4();
        if (textureView != null && textureView == this.Y1) {
            F();
        }
    }

    @Override // o.InterfaceC3921Pg0
    public void A0(InterfaceC7583kh1 interfaceC7583kh1, long j) {
        u4();
        W0(Collections.singletonList(interfaceC7583kh1), 0, j);
    }

    @Override // o.InterfaceC3921Pg0
    public InterfaceC10469wR1 A1(int i) {
        u4();
        return this.e1[i];
    }

    @Override // o.HD1
    public PG2 B() {
        u4();
        return this.r2;
    }

    @Override // o.InterfaceC3921Pg0
    public void B0(InterfaceC3921Pg0.b bVar) {
        this.k1.add(bVar);
    }

    @Override // o.HD1
    public Q20 C() {
        u4();
        return this.q2;
    }

    @Override // o.InterfaceC3921Pg0
    public void C0(InterfaceC7583kh1 interfaceC7583kh1) {
        u4();
        r0(Collections.singletonList(interfaceC7583kh1));
    }

    @Override // o.HD1
    public int C1() {
        u4();
        if (this.t2.a.x()) {
            return this.v2;
        }
        BD1 bd1 = this.t2;
        return bd1.a.g(bd1.b.a);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void D(InterfaceC9857tx interfaceC9857tx) {
        u4();
        if (this.k2 != interfaceC9857tx) {
            return;
        }
        O3(this.w1).u(8).r(null).n();
    }

    @Override // o.HD1
    public void D0(boolean z) {
        u4();
        int q = this.y1.q(z, X());
        q4(z, q, U3(z, q));
    }

    @Override // o.HD1
    public void D1(int i, int i2) {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.n(i, i2);
        }
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void E(InterfaceC9857tx interfaceC9857tx) {
        u4();
        this.k2 = interfaceC9857tx;
        O3(this.w1).u(8).r(interfaceC9857tx).n();
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC6181ey
    @Deprecated
    public InterfaceC3921Pg0.f E0() {
        u4();
        return this;
    }

    @Override // o.HD1
    public void F() {
        u4();
        g4();
        n4(null);
        c4(0, 0);
    }

    @Override // o.HD1
    public void F1(C11005yf1 c11005yf1) {
        u4();
        C9542sf.g(c11005yf1);
        if (c11005yf1.equals(this.P1)) {
            return;
        }
        this.P1 = c11005yf1;
        this.j1.l(15, new C9876u11.a() { // from class: o.Bh0
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((HD1.g) obj).Y(C4022Qh0.this.P1);
            }
        });
    }

    @Override // o.HD1
    public void G(@InterfaceC11300zs1 SurfaceView surfaceView) {
        SurfaceHolder holder;
        u4();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        x(holder);
    }

    @Override // o.HD1
    public int G1() {
        u4();
        if (O()) {
            return this.t2.b.c;
        }
        return -1;
    }

    @Override // o.HD1
    public boolean H() {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            return c4399Ud2.j();
        }
        return false;
    }

    @Override // o.InterfaceC3921Pg0
    public void H1(List<InterfaceC7583kh1> list) {
        u4();
        z1(this.m1.size(), list);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public int I() {
        u4();
        return this.Z1;
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    public C10833xx0 I0() {
        u4();
        return this.Q1;
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC6181ey
    @Deprecated
    public InterfaceC3921Pg0.d I1() {
        u4();
        return this;
    }

    public final List<C3144Hh1.c> I3(int i, List<InterfaceC7583kh1> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3144Hh1.c cVar = new C3144Hh1.c(list.get(i2), this.n1);
            arrayList.add(cVar);
            this.m1.add(i2 + i, new e(cVar.b, cVar.a.S0()));
        }
        this.L1 = this.L1.g(i, arrayList.size());
        return arrayList;
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void J(final C9546sg c9546sg, boolean z) {
        C9546sg c9546sg2;
        u4();
        if (this.p2) {
            return;
        }
        if (!TD2.g(this.f2, c9546sg)) {
            this.f2 = c9546sg;
            h4(1, 3, c9546sg);
            C4399Ud2 c4399Ud2 = this.z1;
            if (c4399Ud2 != null) {
                c4399Ud2.m(TD2.y0(c9546sg.Z));
            }
            this.j1.i(20, new C9876u11.a() { // from class: o.uh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).X(C9546sg.this);
                }
            });
        }
        C4505Vg c4505Vg = this.y1;
        if (z) {
            c9546sg2 = c9546sg;
        } else {
            c9546sg2 = null;
        }
        c4505Vg.n(c9546sg2);
        this.f1.l(c9546sg);
        boolean u1 = u1();
        int q = this.y1.q(u1, X());
        q4(u1, q, U3(u1, q));
        this.j1.g();
    }

    @Override // o.InterfaceC3921Pg0
    public void J0(List<P90> list) {
        u4();
        h4(2, 13, list);
    }

    public final BD1 J3(BD1 bd1, int i, List<InterfaceC7583kh1> list) {
        AbstractC7373jp2 abstractC7373jp2 = bd1.a;
        this.F1++;
        List<C3144Hh1.c> I3 = I3(i, list);
        AbstractC7373jp2 M3 = M3();
        BD1 a4 = a4(bd1, M3, T3(abstractC7373jp2, M3, S3(bd1), Q3(bd1)));
        this.i1.k(i, I3, this.L1);
        return a4;
    }

    @Override // o.HD1
    @Deprecated
    public void K(int i) {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.n(i, 1);
        }
    }

    @Override // o.HD1
    public void K0(int i) {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.c(i);
        }
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC6181ey
    @Deprecated
    public InterfaceC3921Pg0.a K1() {
        u4();
        return this;
    }

    public final C11005yf1 K3() {
        AbstractC7373jp2 e1 = e1();
        if (e1.x()) {
            return this.s2;
        }
        return this.s2.b().J(e1.u(c2(), this.Y0).Z.Z0).H();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void L(InterfaceC5529cG2 interfaceC5529cG2) {
        u4();
        if (this.j2 != interfaceC5529cG2) {
            return;
        }
        O3(this.w1).u(7).r(null).n();
    }

    @Override // o.HD1
    public C3773Nr2 L0() {
        u4();
        return this.t2.i.d;
    }

    @Override // o.HD1
    public void L1(List<C8322nf1> list, int i, long j) {
        u4();
        W0(N3(list), i, j);
    }

    @Override // o.InterfaceC3921Pg0
    public boolean M() {
        C10955yR1[] c10955yR1Arr;
        u4();
        for (C10955yR1 c10955yR1 : this.t2.i.b) {
            if (c10955yR1 != null && c10955yR1.a) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC3921Pg0
    public void M0(List<InterfaceC7583kh1> list, boolean z) {
        u4();
        j4(list, -1, C10323vs.b, z);
    }

    public final AbstractC7373jp2 M3() {
        return new QD1(this.m1, this.L1);
    }

    @Override // o.HD1
    public void N(final C2989Fr2 c2989Fr2) {
        u4();
        if (this.f1.h() && !c2989Fr2.equals(this.f1.c())) {
            this.f1.m(c2989Fr2);
            this.j1.l(19, new C9876u11.a() { // from class: o.xh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).k0(C2989Fr2.this);
                }
            });
        }
    }

    @Override // o.InterfaceC3921Pg0
    public void N0(boolean z) {
        u4();
        this.i1.w(z);
        Iterator<InterfaceC3921Pg0.b> it = this.k1.iterator();
        while (it.hasNext()) {
            it.next().y(z);
        }
    }

    @Override // o.HD1
    public long N1() {
        u4();
        return this.t1;
    }

    public final List<InterfaceC7583kh1> N3(List<C8322nf1> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.o1.e(list.get(i)));
        }
        return arrayList;
    }

    @Override // o.HD1
    public boolean O() {
        u4();
        return this.t2.b.c();
    }

    @Override // o.InterfaceC3921Pg0
    @ES1(23)
    public void O0(@InterfaceC11300zs1 AudioDeviceInfo audioDeviceInfo) {
        u4();
        h4(1, 12, audioDeviceInfo);
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    public C8775pW O1() {
        u4();
        return this.c2;
    }

    public final OD1 O3(OD1.b bVar) {
        int S3 = S3(this.t2);
        C6118ei0 c6118ei0 = this.i1;
        AbstractC7373jp2 abstractC7373jp2 = this.t2.a;
        if (S3 == -1) {
            S3 = 0;
        }
        return new OD1(c6118ei0, bVar, abstractC7373jp2, S3, this.u1, c6118ei0.E());
    }

    @Override // o.InterfaceC3921Pg0
    public void P(J8 j8) {
        this.p1.o0((J8) C9542sf.g(j8));
    }

    @Override // o.HD1
    public long P1() {
        u4();
        return Q3(this.t2);
    }

    public final Pair<Boolean, Integer> P3(BD1 bd1, BD1 bd12, boolean z, int i, boolean z2, boolean z3) {
        AbstractC7373jp2 abstractC7373jp2 = bd12.a;
        AbstractC7373jp2 abstractC7373jp22 = bd1.a;
        if (abstractC7373jp22.x() && abstractC7373jp2.x()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (abstractC7373jp22.x() != abstractC7373jp2.x()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!abstractC7373jp2.u(abstractC7373jp2.m(bd12.b.a, this.l1).Z, this.Y0).X.equals(abstractC7373jp22.u(abstractC7373jp22.m(bd1.b.a, this.l1).Z, this.Y0).X)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
        } else if (z && i == 0 && bd12.b.d < bd1.b.d) {
            return new Pair<>(Boolean.TRUE, 0);
        } else {
            if (z && i == 1 && z3) {
                return new Pair<>(Boolean.TRUE, 2);
            }
            return new Pair<>(Boolean.FALSE, -1);
        }
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    public C10833xx0 Q1() {
        u4();
        return this.R1;
    }

    public final long Q3(BD1 bd1) {
        if (bd1.b.c()) {
            bd1.a.m(bd1.b.a, this.l1);
            if (bd1.c == C10323vs.b) {
                return bd1.a.u(S3(bd1), this.Y0).d();
            }
            return this.l1.s() + TD2.b2(bd1.c);
        }
        return TD2.b2(R3(bd1));
    }

    @Override // o.HD1
    public long R() {
        u4();
        return TD2.b2(this.t2.q);
    }

    @Override // o.HD1
    public int R0() {
        u4();
        if (O()) {
            return this.t2.b.b;
        }
        return -1;
    }

    @Override // o.InterfaceC3921Pg0
    public void R1(InterfaceC7583kh1 interfaceC7583kh1, boolean z) {
        u4();
        M0(Collections.singletonList(interfaceC7583kh1), z);
    }

    public final long R3(BD1 bd1) {
        long j;
        if (bd1.a.x()) {
            return TD2.j1(this.w2);
        }
        if (bd1.f415o) {
            j = bd1.m();
        } else {
            j = bd1.r;
        }
        if (bd1.b.c()) {
            return j;
        }
        return d4(bd1.a, bd1.b, j);
    }

    @Override // o.HD1
    public void S(boolean z, int i) {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.l(z, i);
        }
    }

    @Override // o.InterfaceC3921Pg0
    public void S0(boolean z) {
        u4();
        if (this.p2) {
            return;
        }
        this.x1.b(z);
    }

    @Override // o.HD1
    public void S1(int i, List<C8322nf1> list) {
        u4();
        z1(i, N3(list));
    }

    public final int S3(BD1 bd1) {
        if (bd1.a.x()) {
            return this.u2;
        }
        return bd1.a.m(bd1.b.a, this.l1).Z;
    }

    @InterfaceC11300zs1
    public final Pair<Object, Long> T3(AbstractC7373jp2 abstractC7373jp2, AbstractC7373jp2 abstractC7373jp22, int i, long j) {
        boolean z;
        boolean x = abstractC7373jp2.x();
        long j2 = C10323vs.b;
        int i2 = -1;
        if (!x && !abstractC7373jp22.x()) {
            Pair<Object, Long> q = abstractC7373jp2.q(this.Y0, this.l1, i, TD2.j1(j));
            Object obj = ((Pair) TD2.o(q)).first;
            if (abstractC7373jp22.g(obj) != -1) {
                return q;
            }
            Object C0 = C6118ei0.C0(this.Y0, this.l1, this.D1, this.E1, obj, abstractC7373jp2, abstractC7373jp22);
            if (C0 != null) {
                abstractC7373jp22.m(C0, this.l1);
                int i3 = this.l1.Z;
                return b4(abstractC7373jp22, i3, abstractC7373jp22.u(i3, this.Y0).d());
            }
            return b4(abstractC7373jp22, -1, C10323vs.b);
        }
        if (!abstractC7373jp2.x() && abstractC7373jp22.x()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i2 = i;
        }
        if (!z) {
            j2 = j;
        }
        return b4(abstractC7373jp22, i2, j2);
    }

    @Override // o.HD1
    public long U1() {
        u4();
        if (O()) {
            BD1 bd1 = this.t2;
            if (bd1.k.equals(bd1.b)) {
                return TD2.b2(this.t2.p);
            }
            return getDuration();
        }
        return o2();
    }

    @Override // o.InterfaceC3921Pg0
    public LD V() {
        return this.u1;
    }

    @Override // o.InterfaceC3921Pg0
    public void V0(boolean z) {
        u4();
        if (this.M1 == z) {
            return;
        }
        this.M1 = z;
        this.i1.U0(z);
    }

    public final HD1.k V3(long j) {
        Object obj;
        int i;
        C8322nf1 c8322nf1;
        Object obj2;
        long j2;
        int c2 = c2();
        if (!this.t2.a.x()) {
            BD1 bd1 = this.t2;
            Object obj3 = bd1.b.a;
            bd1.a.m(obj3, this.l1);
            i = this.t2.a.g(obj3);
            obj2 = obj3;
            obj = this.t2.a.u(c2, this.Y0).X;
            c8322nf1 = this.Y0.Z;
        } else {
            obj = null;
            i = -1;
            c8322nf1 = null;
            obj2 = null;
        }
        int i2 = i;
        long b2 = TD2.b2(j);
        if (this.t2.b.c()) {
            j2 = TD2.b2(X3(this.t2));
        } else {
            j2 = b2;
        }
        InterfaceC7583kh1.b bVar = this.t2.b;
        return new HD1.k(obj, c2, c8322nf1, obj2, i2, b2, j2, bVar.b, bVar.c);
    }

    @Override // o.InterfaceC3921Pg0
    public AbstractC3283Ir2 W() {
        u4();
        return this.f1;
    }

    @Override // o.InterfaceC3921Pg0
    public void W0(List<InterfaceC7583kh1> list, int i, long j) {
        u4();
        j4(list, i, j, false);
    }

    @Override // o.InterfaceC3921Pg0
    public void W1(J8 j8) {
        u4();
        this.p1.W((J8) C9542sf.g(j8));
    }

    public final HD1.k W3(int i, BD1 bd1, int i2) {
        int i3;
        Object obj;
        C8322nf1 c8322nf1;
        Object obj2;
        int i4;
        long j;
        long X3;
        AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
        if (!bd1.a.x()) {
            Object obj3 = bd1.b.a;
            bd1.a.m(obj3, bVar);
            int i5 = bVar.Z;
            int g = bd1.a.g(obj3);
            Object obj4 = bd1.a.u(i5, this.Y0).X;
            c8322nf1 = this.Y0.Z;
            obj2 = obj3;
            i4 = g;
            obj = obj4;
            i3 = i5;
        } else {
            i3 = i2;
            obj = null;
            c8322nf1 = null;
            obj2 = null;
            i4 = -1;
        }
        if (i == 0) {
            if (bd1.b.c()) {
                InterfaceC7583kh1.b bVar2 = bd1.b;
                j = bVar.f(bVar2.b, bVar2.c);
                X3 = X3(bd1);
            } else {
                if (bd1.b.e != -1) {
                    j = X3(this.t2);
                } else {
                    j = bVar.Z0 + bVar.Y0;
                }
                X3 = j;
            }
        } else if (bd1.b.c()) {
            j = bd1.r;
            X3 = X3(bd1);
        } else {
            j = bVar.Z0 + bd1.r;
            X3 = j;
        }
        long b2 = TD2.b2(j);
        long b22 = TD2.b2(X3);
        InterfaceC7583kh1.b bVar3 = bd1.b;
        return new HD1.k(obj, i3, c8322nf1, obj2, i4, b2, b22, bVar3.b, bVar3.c);
    }

    @Override // o.HD1
    public int X() {
        u4();
        return this.t2.e;
    }

    @Override // o.InterfaceC3921Pg0
    public void X1(int i, InterfaceC7583kh1 interfaceC7583kh1) {
        u4();
        z1(i, Collections.singletonList(interfaceC7583kh1));
    }

    @Override // o.HD1
    public C11005yf1 Y1() {
        u4();
        return this.P1;
    }

    public final void Y3(C6118ei0.e eVar) {
        long j;
        boolean z;
        int i = this.F1 - eVar.c;
        this.F1 = i;
        boolean z2 = true;
        if (eVar.d) {
            this.G1 = eVar.e;
            this.H1 = true;
        }
        if (eVar.f) {
            this.I1 = eVar.g;
        }
        if (i == 0) {
            AbstractC7373jp2 abstractC7373jp2 = eVar.b.a;
            if (!this.t2.a.x() && abstractC7373jp2.x()) {
                this.u2 = -1;
                this.w2 = 0L;
                this.v2 = 0;
            }
            if (!abstractC7373jp2.x()) {
                List<AbstractC7373jp2> N = ((QD1) abstractC7373jp2).N();
                if (N.size() == this.m1.size()) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.i(z);
                for (int i2 = 0; i2 < N.size(); i2++) {
                    this.m1.get(i2).b = N.get(i2);
                }
            }
            boolean z3 = this.H1;
            long j2 = C10323vs.b;
            if (z3) {
                if (eVar.b.b.equals(this.t2.b) && eVar.b.d == this.t2.r) {
                    z2 = false;
                }
                if (z2) {
                    if (!abstractC7373jp2.x() && !eVar.b.b.c()) {
                        BD1 bd1 = eVar.b;
                        j = d4(abstractC7373jp2, bd1.b, bd1.d);
                    } else {
                        j = eVar.b.d;
                    }
                    j2 = j;
                }
            } else {
                z2 = false;
            }
            this.H1 = false;
            r4(eVar.b, 1, this.I1, z2, this.G1, j2, -1, false);
        }
    }

    @Override // o.HD1
    public int Z0() {
        u4();
        return this.t2.m;
    }

    @Override // o.InterfaceC3921Pg0
    public Looper Z1() {
        return this.i1.E();
    }

    public final int Z3(int i) {
        AudioTrack audioTrack = this.S1;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.S1.release();
            this.S1 = null;
        }
        if (this.S1 == null) {
            this.S1 = new AudioTrack(3, S92.y, 4, 2, 2, 0, i);
        }
        return this.S1.getAudioSessionId();
    }

    @Override // o.HD1
    public boolean a() {
        u4();
        return this.t2.g;
    }

    @Override // o.InterfaceC3921Pg0
    @Deprecated
    public void a0(InterfaceC7583kh1 interfaceC7583kh1, boolean z, boolean z2) {
        u4();
        R1(interfaceC7583kh1, z);
        m0();
    }

    public final BD1 a4(BD1 bd1, AbstractC7373jp2 abstractC7373jp2, @InterfaceC11300zs1 Pair<Object, Long> pair) {
        boolean z;
        InterfaceC7583kh1.b bVar;
        C10079ur2 c10079ur2;
        C3381Jr2 c3381Jr2;
        List<C4224Si1> list;
        int i;
        long j;
        if (!abstractC7373jp2.x() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        AbstractC7373jp2 abstractC7373jp22 = bd1.a;
        long Q3 = Q3(bd1);
        BD1 j2 = bd1.j(abstractC7373jp2);
        if (abstractC7373jp2.x()) {
            InterfaceC7583kh1.b l = BD1.l();
            long j1 = TD2.j1(this.w2);
            BD1 c2 = j2.d(l, j1, j1, j1, 0L, C10079ur2.Z0, this.Z0, AbstractC5317bO0.L()).c(l);
            c2.p = c2.r;
            return c2;
        }
        Object obj = j2.b.a;
        boolean equals = obj.equals(((Pair) TD2.o(pair)).first);
        if (!equals) {
            bVar = new InterfaceC7583kh1.b(pair.first);
        } else {
            bVar = j2.b;
        }
        long longValue = ((Long) pair.second).longValue();
        long j12 = TD2.j1(Q3);
        if (!abstractC7373jp22.x()) {
            j12 -= abstractC7373jp22.m(obj, this.l1).t();
        }
        if (!equals || longValue < j12) {
            InterfaceC7583kh1.b bVar2 = bVar;
            C9542sf.i(!bVar2.c());
            if (!equals) {
                c10079ur2 = C10079ur2.Z0;
            } else {
                c10079ur2 = j2.h;
            }
            C10079ur2 c10079ur22 = c10079ur2;
            if (!equals) {
                c3381Jr2 = this.Z0;
            } else {
                c3381Jr2 = j2.i;
            }
            C3381Jr2 c3381Jr22 = c3381Jr2;
            if (!equals) {
                list = AbstractC5317bO0.L();
            } else {
                list = j2.j;
            }
            BD1 c3 = j2.d(bVar2, longValue, longValue, longValue, 0L, c10079ur22, c3381Jr22, list).c(bVar2);
            c3.p = longValue;
            return c3;
        } else if (i == 0) {
            int g = abstractC7373jp2.g(j2.k.a);
            if (g != -1 && abstractC7373jp2.k(g, this.l1).Z == abstractC7373jp2.m(bVar.a, this.l1).Z) {
                return j2;
            }
            abstractC7373jp2.m(bVar.a, this.l1);
            if (bVar.c()) {
                j = this.l1.f(bVar.b, bVar.c);
            } else {
                j = this.l1.Y0;
            }
            InterfaceC7583kh1.b bVar3 = bVar;
            BD1 c4 = j2.d(bVar3, j2.r, j2.r, j2.d, j - j2.r, j2.h, j2.i, j2.j).c(bVar3);
            c4.p = j;
            return c4;
        } else {
            InterfaceC7583kh1.b bVar4 = bVar;
            C9542sf.i(!bVar4.c());
            long max = Math.max(0L, j2.q - (longValue - j12));
            long j3 = j2.p;
            if (j2.k.equals(j2.b)) {
                j3 = longValue + max;
            }
            BD1 d2 = j2.d(bVar4, longValue, longValue, longValue, max, j2.h, j2.i, j2.j);
            d2.p = j3;
            return d2;
        }
    }

    @Override // o.HD1
    public C9546sg b() {
        u4();
        return this.f2;
    }

    @Override // o.InterfaceC3921Pg0
    public boolean b2() {
        u4();
        return this.t2.f415o;
    }

    @InterfaceC11300zs1
    public final Pair<Object, Long> b4(AbstractC7373jp2 abstractC7373jp2, int i, long j) {
        if (abstractC7373jp2.x()) {
            this.u2 = i;
            if (j == C10323vs.b) {
                j = 0;
            }
            this.w2 = j;
            this.v2 = 0;
            return null;
        }
        if (i == -1 || i >= abstractC7373jp2.w()) {
            i = abstractC7373jp2.f(this.E1);
            j = abstractC7373jp2.u(i, this.Y0).d();
        }
        return abstractC7373jp2.q(this.Y0, this.l1, i, TD2.j1(j));
    }

    @Override // o.InterfaceC3921Pg0
    public C10079ur2 c1() {
        u4();
        return this.t2.h;
    }

    @Override // o.HD1
    public int c2() {
        u4();
        int S3 = S3(this.t2);
        if (S3 == -1) {
            return 0;
        }
        return S3;
    }

    public final void c4(final int i, final int i2) {
        if (i == this.b2.b() && i2 == this.b2.a()) {
            return;
        }
        this.b2 = new L82(i, i2);
        this.j1.l(24, new C9876u11.a() { // from class: o.Gh0
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((HD1.g) obj).a0(i, i2);
            }
        });
        h4(2, 14, new L82(i, i2));
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void d(final int i) {
        u4();
        if (this.e2 == i) {
            return;
        }
        if (i == 0) {
            if (TD2.a < 21) {
                i = Z3(0);
            } else {
                i = TD2.P(this.c1);
            }
        } else if (TD2.a < 21) {
            Z3(i);
        }
        this.e2 = i;
        h4(1, 10, Integer.valueOf(i));
        h4(2, 10, Integer.valueOf(i));
        this.j1.l(21, new C9876u11.a() { // from class: o.Fh0
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((HD1.g) obj).N(i);
            }
        });
    }

    public final long d4(AbstractC7373jp2 abstractC7373jp2, InterfaceC7583kh1.b bVar, long j) {
        abstractC7373jp2.m(bVar.a, this.l1);
        return j + this.l1.t();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void e(int i) {
        u4();
        this.Z1 = i;
        h4(2, 4, Integer.valueOf(i));
    }

    @Override // o.HD1
    public void e0(List<C8322nf1> list, boolean z) {
        u4();
        M0(N3(list), z);
    }

    @Override // o.HD1
    public AbstractC7373jp2 e1() {
        u4();
        return this.t2.a;
    }

    @Override // o.InterfaceC3921Pg0
    public void e2(int i) {
        u4();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.A1.a(true);
                this.B1.a(true);
                return;
            }
            this.A1.a(true);
            this.B1.a(false);
            return;
        }
        this.A1.a(false);
        this.B1.a(false);
    }

    public final BD1 e4(BD1 bd1, int i, int i2) {
        int S3 = S3(bd1);
        long Q3 = Q3(bd1);
        AbstractC7373jp2 abstractC7373jp2 = bd1.a;
        int size = this.m1.size();
        this.F1++;
        f4(i, i2);
        AbstractC7373jp2 M3 = M3();
        BD1 a4 = a4(bd1, M3, T3(abstractC7373jp2, M3, S3, Q3));
        int i3 = a4.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && S3 >= a4.a.w()) {
            a4 = a4.h(4);
        }
        this.i1.q0(i, i2, this.L1);
        return a4;
    }

    @Override // o.HD1
    public void f(DD1 dd1) {
        u4();
        if (dd1 == null) {
            dd1 = DD1.Y0;
        }
        if (this.t2.n.equals(dd1)) {
            return;
        }
        BD1 g = this.t2.g(dd1);
        this.F1++;
        this.i1.Y0(dd1);
        r4(g, 0, 1, false, 5, C10323vs.b, -1, false);
    }

    @Override // o.InterfaceC3921Pg0
    public void f0(boolean z) {
        u4();
        if (this.J1 != z) {
            this.J1 = z;
            if (!this.i1.O0(z)) {
                o4(C3824Og0.n(new C6616gi0(2), 1003));
            }
        }
    }

    @Override // o.HD1
    public void f1(HD1.g gVar) {
        u4();
        this.j1.k((HD1.g) C9542sf.g(gVar));
    }

    @Override // o.InterfaceC3921Pg0
    public OD1 f2(OD1.b bVar) {
        u4();
        return O3(bVar);
    }

    public final void f4(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.m1.remove(i3);
        }
        this.L1 = this.L1.a(i, i2);
    }

    @Override // o.HD1
    public void g() {
        AudioTrack audioTrack;
        I31.h(x2, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + C6361fi0.c + "] [" + TD2.e + "] [" + C6361fi0.b() + C6566gU0.g);
        u4();
        if (TD2.a < 21 && (audioTrack = this.S1) != null) {
            audioTrack.release();
            this.S1 = null;
        }
        this.x1.b(false);
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.k();
        }
        this.A1.b(false);
        this.B1.b(false);
        this.y1.j();
        if (!this.i1.m0()) {
            this.j1.l(10, new C9876u11.a() { // from class: o.vh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).S(C3824Og0.n(new C6616gi0(1), 1003));
                }
            });
        }
        this.j1.j();
        this.g1.g(null);
        this.r1.c(this.p1);
        BD1 bd1 = this.t2;
        if (bd1.f415o) {
            this.t2 = bd1.a();
        }
        BD1 h = this.t2.h(1);
        this.t2 = h;
        BD1 c2 = h.c(h.b);
        this.t2 = c2;
        c2.p = c2.r;
        this.t2.q = 0L;
        this.p1.g();
        this.f1.j();
        g4();
        Surface surface = this.U1;
        if (surface != null) {
            surface.release();
            this.U1 = null;
        }
        if (this.o2) {
            ((FH1) C9542sf.g(this.n2)).e(0);
            this.o2 = false;
        }
        this.i2 = C8274nS.Z;
        this.p2 = true;
    }

    @Override // o.InterfaceC3921Pg0
    public void g1(@InterfaceC11300zs1 LZ1 lz1) {
        u4();
        if (lz1 == null) {
            lz1 = LZ1.g;
        }
        if (!this.K1.equals(lz1)) {
            this.K1 = lz1;
            this.i1.c1(lz1);
        }
    }

    @Override // o.InterfaceC3921Pg0
    public LZ1 g2() {
        u4();
        return this.K1;
    }

    public final void g4() {
        if (this.W1 != null) {
            O3(this.w1).u(10000).r(null).n();
            this.W1.g(this.v1);
            this.W1 = null;
        }
        TextureView textureView = this.Y1;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.v1) {
                I31.n(x2, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Y1.setSurfaceTextureListener(null);
            }
            this.Y1 = null;
        }
        SurfaceHolder surfaceHolder = this.V1;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.v1);
            this.V1 = null;
        }
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public int getAudioSessionId() {
        u4();
        return this.e2;
    }

    @Override // o.HD1
    public long getCurrentPosition() {
        u4();
        return TD2.b2(R3(this.t2));
    }

    @Override // o.HD1
    public long getDuration() {
        u4();
        if (O()) {
            BD1 bd1 = this.t2;
            InterfaceC7583kh1.b bVar = bd1.b;
            bd1.a.m(bVar.a, this.l1);
            return TD2.b2(this.l1.f(bVar.b, bVar.c));
        }
        return B1();
    }

    @Override // o.HD1
    public float getVolume() {
        u4();
        return this.g2;
    }

    @Override // o.HD1
    public DD1 h() {
        u4();
        return this.t2.n;
    }

    @Override // o.HD1
    public void h0(int i) {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.i(i);
        }
    }

    @Override // o.HD1
    public Looper h1() {
        return this.q1;
    }

    @Override // o.InterfaceC3921Pg0
    public void h2(InterfaceC7583kh1 interfaceC7583kh1) {
        u4();
        H1(Collections.singletonList(interfaceC7583kh1));
    }

    public final void h4(int i, int i2, @InterfaceC11300zs1 Object obj) {
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        for (InterfaceC10469wR1 interfaceC10469wR1 : this.e1) {
            if (interfaceC10469wR1.d() == i) {
                O3(interfaceC10469wR1).u(i2).r(obj).n();
            }
        }
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void i(C3737Nj c3737Nj) {
        u4();
        h4(1, 6, c3737Nj);
    }

    @Override // o.HD1
    public C2989Fr2 i1() {
        u4();
        return this.f1.c();
    }

    public final void i4() {
        h4(1, 2, Float.valueOf(this.g2 * this.y1.h()));
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public boolean j() {
        u4();
        return this.h2;
    }

    public final void j4(List<InterfaceC7583kh1> list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        BD1 h;
        boolean z2;
        int i4 = i;
        int S3 = S3(this.t2);
        long currentPosition = getCurrentPosition();
        this.F1++;
        if (!this.m1.isEmpty()) {
            f4(0, this.m1.size());
        }
        List<C3144Hh1.c> I3 = I3(0, list);
        AbstractC7373jp2 M3 = M3();
        if (!M3.x() && i4 >= M3.w()) {
            throw new C6534gM0(M3, i4, j);
        }
        if (z) {
            i4 = M3.f(this.E1);
            j2 = C10323vs.b;
        } else if (i4 == -1) {
            i2 = S3;
            j2 = currentPosition;
            BD1 a4 = a4(this.t2, M3, b4(M3, i2, j2));
            i3 = a4.e;
            if (i2 != -1 && i3 != 1) {
                i3 = (!M3.x() || i2 >= M3.w()) ? 4 : 2;
            }
            h = a4.h(i3);
            this.i1.S0(I3, i2, TD2.j1(j2), this.L1);
            if (this.t2.b.a.equals(h.b.a) && !this.t2.a.x()) {
                z2 = true;
            } else {
                z2 = false;
            }
            r4(h, 0, 1, z2, 4, R3(h), -1, false);
        } else {
            j2 = j;
        }
        i2 = i4;
        BD1 a42 = a4(this.t2, M3, b4(M3, i2, j2));
        i3 = a42.e;
        if (i2 != -1) {
            if (M3.x()) {
            }
        }
        h = a42.h(i3);
        this.i1.S0(I3, i2, TD2.j1(j2), this.L1);
        if (this.t2.b.a.equals(h.b.a)) {
        }
        z2 = false;
        r4(h, 0, 1, z2, 4, R3(h), -1, false);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void k(final boolean z) {
        u4();
        if (this.h2 == z) {
            return;
        }
        this.h2 = z;
        h4(1, 9, Boolean.valueOf(z));
        this.j1.l(23, new C9876u11.a() { // from class: o.wh0
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((HD1.g) obj).a(z);
            }
        });
    }

    @Override // o.HD1
    public L82 k0() {
        u4();
        return this.b2;
    }

    @Override // o.InterfaceC3921Pg0
    public C11297zr2 k1() {
        u4();
        return new C11297zr2(this.t2.i.c);
    }

    @Override // o.HD1
    public void k2(int i, int i2, int i3) {
        boolean z;
        u4();
        if (i >= 0 && i <= i2 && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int size = this.m1.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            AbstractC7373jp2 e1 = e1();
            this.F1++;
            TD2.i1(this.m1, i, min, min2);
            AbstractC7373jp2 M3 = M3();
            BD1 bd1 = this.t2;
            BD1 a4 = a4(bd1, M3, T3(e1, M3, S3(bd1), Q3(this.t2)));
            this.i1.f0(i, min, min2, this.L1);
            r4(a4, 0, 1, false, 5, C10323vs.b, -1, false);
        }
    }

    public final void k4(SurfaceHolder surfaceHolder) {
        this.X1 = false;
        this.V1 = surfaceHolder;
        surfaceHolder.addCallback(this.v1);
        Surface surface = this.V1.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.V1.getSurfaceFrame();
            c4(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        c4(0, 0);
    }

    @Override // o.HD1
    public void l(@InterfaceC11300zs1 Surface surface) {
        int i;
        u4();
        g4();
        n4(surface);
        if (surface == null) {
            i = 0;
        } else {
            i = -1;
        }
        c4(i, i);
    }

    @Override // o.HD1
    public void l0(int i, int i2, List<C8322nf1> list) {
        boolean z;
        u4();
        boolean z2 = false;
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int size = this.m1.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        List<InterfaceC7583kh1> N3 = N3(list);
        if (this.m1.isEmpty()) {
            if (this.u2 == -1) {
                z2 = true;
            }
            M0(N3, z2);
            return;
        }
        BD1 e4 = e4(J3(this.t2, min, N3), i, min);
        r4(e4, 0, 1, !e4.b.a.equals(this.t2.b.a), 4, R3(e4), -1, false);
    }

    @Override // o.HD1
    public void l1(HD1.g gVar) {
        this.j1.c((HD1.g) C9542sf.g(gVar));
    }

    @Override // o.InterfaceC3921Pg0
    public F8 l2() {
        u4();
        return this.p1;
    }

    public final void l4(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        n4(surface);
        this.U1 = surface;
    }

    @Override // o.HD1
    public void m(@InterfaceC11300zs1 Surface surface) {
        u4();
        if (surface != null && surface == this.T1) {
            F();
        }
    }

    @Override // o.HD1
    public void m0() {
        u4();
        boolean u1 = u1();
        int i = 2;
        int q = this.y1.q(u1, 2);
        q4(u1, q, U3(u1, q));
        BD1 bd1 = this.t2;
        if (bd1.e != 1) {
            return;
        }
        BD1 f = bd1.f(null);
        if (f.a.x()) {
            i = 4;
        }
        BD1 h = f.h(i);
        this.F1++;
        this.i1.k0();
        r4(h, 1, 1, false, 5, C10323vs.b, -1, false);
    }

    @Override // o.InterfaceC3921Pg0
    public int m1(int i) {
        u4();
        return this.e1[i].d();
    }

    public void m4(boolean z) {
        this.l2 = z;
        this.j1.m(z);
        F8 f8 = this.p1;
        if (f8 instanceof UX) {
            ((UX) f8).Y1(z);
        }
    }

    @Override // o.HD1
    @Deprecated
    public void n() {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.c(1);
        }
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC6181ey
    @Deprecated
    public InterfaceC3921Pg0.e n1() {
        u4();
        return this;
    }

    @Override // o.HD1
    public boolean n2() {
        u4();
        return this.E1;
    }

    public final void n4(@InterfaceC11300zs1 Object obj) {
        InterfaceC10469wR1[] interfaceC10469wR1Arr;
        ArrayList<OD1> arrayList = new ArrayList();
        boolean z = false;
        for (InterfaceC10469wR1 interfaceC10469wR1 : this.e1) {
            if (interfaceC10469wR1.d() == 2) {
                arrayList.add(O3(interfaceC10469wR1).u(1).r(obj).n());
            }
        }
        Object obj2 = this.T1;
        if (obj2 != null && obj2 != obj) {
            try {
                for (OD1 od1 : arrayList) {
                    od1.b(this.C1);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.T1;
            Surface surface = this.U1;
            if (obj3 == surface) {
                surface.release();
                this.U1 = null;
            }
        }
        this.T1 = obj;
        if (z) {
            o4(C3824Og0.n(new C6616gi0(3), 1003));
        }
    }

    @Override // o.HD1
    public void o(@InterfaceC11300zs1 SurfaceView surfaceView) {
        SurfaceHolder holder;
        u4();
        if (surfaceView instanceof CF2) {
            g4();
            n4(surfaceView);
            k4(surfaceView.getHolder());
        } else if (surfaceView instanceof C3704Na2) {
            g4();
            this.W1 = (C3704Na2) surfaceView;
            O3(this.w1).u(10000).r(this.W1).n();
            this.W1.d(this.v1);
            n4(this.W1.getVideoSurface());
            k4(surfaceView.getHolder());
        } else {
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            p(holder);
        }
    }

    @Override // o.InterfaceC3921Pg0
    public void o1(U52 u52) {
        boolean z;
        u4();
        if (u52.getLength() == this.m1.size()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.L1 = u52;
        AbstractC7373jp2 M3 = M3();
        BD1 a4 = a4(this.t2, M3, b4(M3, c2(), getCurrentPosition()));
        this.F1++;
        this.i1.g1(u52);
        r4(a4, 0, 1, false, 5, C10323vs.b, -1, false);
    }

    @Override // o.HD1
    public long o2() {
        u4();
        if (this.t2.a.x()) {
            return this.w2;
        }
        BD1 bd1 = this.t2;
        if (bd1.k.d != bd1.b.d) {
            return bd1.a.u(c2(), this.Y0).g();
        }
        long j = bd1.p;
        if (this.t2.k.c()) {
            BD1 bd12 = this.t2;
            AbstractC7373jp2.b m = bd12.a.m(bd12.k.a, this.l1);
            long j2 = m.j(this.t2.k.b);
            if (j2 == Long.MIN_VALUE) {
                j = m.Y0;
            } else {
                j = j2;
            }
        }
        BD1 bd13 = this.t2;
        return TD2.b2(d4(bd13.a, bd13.k, j));
    }

    public final void o4(@InterfaceC11300zs1 C3824Og0 c3824Og0) {
        BD1 bd1 = this.t2;
        BD1 c2 = bd1.c(bd1.b);
        c2.p = c2.r;
        c2.q = 0L;
        BD1 h = c2.h(1);
        if (c3824Og0 != null) {
            h = h.f(c3824Og0);
        }
        this.F1++;
        this.i1.p1();
        r4(h, 0, 1, false, 5, C10323vs.b, -1, false);
    }

    @Override // o.HD1
    public void p(@InterfaceC11300zs1 SurfaceHolder surfaceHolder) {
        u4();
        if (surfaceHolder == null) {
            F();
            return;
        }
        g4();
        this.X1 = true;
        this.V1 = surfaceHolder;
        surfaceHolder.addCallback(this.v1);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            n4(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            c4(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        n4(null);
        c4(0, 0);
    }

    @Override // o.InterfaceC3921Pg0
    public boolean p1() {
        u4();
        return this.M1;
    }

    public final void p4() {
        HD1.c cVar = this.N1;
        HD1.c U = TD2.U(this.d1, this.a1);
        this.N1 = U;
        if (!U.equals(cVar)) {
            this.j1.i(13, new C9876u11.a() { // from class: o.Hh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).b0(C4022Qh0.this.N1);
                }
            });
        }
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void q(InterfaceC5529cG2 interfaceC5529cG2) {
        u4();
        this.j2 = interfaceC5529cG2;
        O3(this.w1).u(7).r(interfaceC5529cG2).n();
    }

    @Override // o.InterfaceC3921Pg0
    @Deprecated
    public void q0(InterfaceC7583kh1 interfaceC7583kh1) {
        u4();
        C0(interfaceC7583kh1);
        m0();
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    public C8775pW q2() {
        u4();
        return this.d2;
    }

    public final void q4(boolean z, int i, int i2) {
        boolean z2;
        int i3 = 0;
        if (z && i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && i != 1) {
            i3 = 1;
        }
        BD1 bd1 = this.t2;
        if (bd1.l == z2 && bd1.m == i3) {
            return;
        }
        this.F1++;
        if (bd1.f415o) {
            bd1 = bd1.a();
        }
        BD1 e2 = bd1.e(z2, i3);
        this.i1.W0(z2, i3);
        r4(e2, 0, i2, false, 5, C10323vs.b, -1, false);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public int r() {
        u4();
        return this.a2;
    }

    @Override // o.InterfaceC3921Pg0
    public void r0(List<InterfaceC7583kh1> list) {
        u4();
        M0(list, true);
    }

    @Override // o.InterfaceC3921Pg0
    public void r1(@InterfaceC11300zs1 FH1 fh1) {
        u4();
        if (TD2.g(this.n2, fh1)) {
            return;
        }
        if (this.o2) {
            ((FH1) C9542sf.g(this.n2)).e(0);
        }
        if (fh1 != null && a()) {
            fh1.a(0);
            this.o2 = true;
        } else {
            this.o2 = false;
        }
        this.n2 = fh1;
    }

    public final void r4(final BD1 bd1, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        BD1 bd12 = this.t2;
        this.t2 = bd1;
        boolean equals = bd12.a.equals(bd1.a);
        Pair<Boolean, Integer> P3 = P3(bd1, bd12, z, i3, !equals, z2);
        boolean booleanValue = ((Boolean) P3.first).booleanValue();
        final int intValue = ((Integer) P3.second).intValue();
        C11005yf1 c11005yf1 = this.O1;
        final C8322nf1 c8322nf1 = null;
        if (booleanValue) {
            if (!bd1.a.x()) {
                c8322nf1 = bd1.a.u(bd1.a.m(bd1.b.a, this.l1).Z, this.Y0).Z;
            }
            this.s2 = C11005yf1.Q2;
        }
        if (booleanValue || !bd12.j.equals(bd1.j)) {
            this.s2 = this.s2.b().K(bd1.j).H();
            c11005yf1 = K3();
        }
        boolean equals2 = c11005yf1.equals(this.O1);
        this.O1 = c11005yf1;
        if (bd12.l != bd1.l) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bd12.e != bd1.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || z3) {
            t4();
        }
        boolean z6 = bd12.g;
        boolean z7 = bd1.g;
        if (z6 != z7) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            s4(z7);
        }
        if (!equals) {
            this.j1.i(0, new C9876u11.a() { // from class: o.oh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    HD1.g gVar = (HD1.g) obj;
                    gVar.T(BD1.this.a, i);
                }
            });
        }
        if (z) {
            final HD1.k W3 = W3(i3, bd12, i4);
            final HD1.k V3 = V3(j);
            this.j1.i(11, new C9876u11.a() { // from class: o.Lh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    C4022Qh0.S2(i3, W3, V3, (HD1.g) obj);
                }
            });
        }
        if (booleanValue) {
            this.j1.i(1, new C9876u11.a() { // from class: o.Mh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).x0(C8322nf1.this, intValue);
                }
            });
        }
        if (bd12.f != bd1.f) {
            this.j1.i(10, new C9876u11.a() { // from class: o.Nh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).g0(BD1.this.f);
                }
            });
            if (bd1.f != null) {
                this.j1.i(10, new C9876u11.a() { // from class: o.Oh0
                    @Override // o.C9876u11.a
                    public final void invoke(Object obj) {
                        ((HD1.g) obj).S(BD1.this.f);
                    }
                });
            }
        }
        C3381Jr2 c3381Jr2 = bd12.i;
        C3381Jr2 c3381Jr22 = bd1.i;
        if (c3381Jr2 != c3381Jr22) {
            this.f1.i(c3381Jr22.e);
            this.j1.i(2, new C9876u11.a() { // from class: o.Ph0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).M(BD1.this.i.d);
                }
            });
        }
        if (!equals2) {
            final C11005yf1 c11005yf12 = this.O1;
            this.j1.i(14, new C9876u11.a() { // from class: o.ph0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).p0(C11005yf1.this);
                }
            });
        }
        if (z5) {
            this.j1.i(3, new C9876u11.a() { // from class: o.qh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    C4022Qh0.b3(BD1.this, (HD1.g) obj);
                }
            });
        }
        if (z4 || z3) {
            this.j1.i(-1, new C9876u11.a() { // from class: o.rh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).q0(r0.l, BD1.this.e);
                }
            });
        }
        if (z4) {
            this.j1.i(4, new C9876u11.a() { // from class: o.sh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).O(BD1.this.e);
                }
            });
        }
        if (z3) {
            this.j1.i(5, new C9876u11.a() { // from class: o.zh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    HD1.g gVar = (HD1.g) obj;
                    gVar.w0(BD1.this.l, i2);
                }
            });
        }
        if (bd12.m != bd1.m) {
            this.j1.i(6, new C9876u11.a() { // from class: o.Ih0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).K(BD1.this.m);
                }
            });
        }
        if (bd12.n() != bd1.n()) {
            this.j1.i(7, new C9876u11.a() { // from class: o.Jh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).y0(BD1.this.n());
                }
            });
        }
        if (!bd12.n.equals(bd1.n)) {
            this.j1.i(12, new C9876u11.a() { // from class: o.Kh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).A(BD1.this.n);
                }
            });
        }
        p4();
        this.j1.g();
        if (bd12.f415o != bd1.f415o) {
            Iterator<InterfaceC3921Pg0.b> it = this.k1.iterator();
            while (it.hasNext()) {
                it.next().m(bd1.f415o);
            }
        }
    }

    @Override // o.HD1
    public C8274nS s() {
        u4();
        return this.i2;
    }

    @Override // o.HD1
    public void s0(int i, int i2) {
        boolean z;
        u4();
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int size = this.m1.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            BD1 e4 = e4(this.t2, i, min);
            r4(e4, 0, 1, !e4.b.a.equals(this.t2.b.a), 4, R3(e4), -1, false);
        }
    }

    @Override // o.HD1
    public C11005yf1 s2() {
        u4();
        return this.O1;
    }

    public final void s4(boolean z) {
        FH1 fh1 = this.n2;
        if (fh1 != null) {
            if (z && !this.o2) {
                fh1.a(0);
                this.o2 = true;
            } else if (!z && this.o2) {
                fh1.e(0);
                this.o2 = false;
            }
        }
    }

    @Override // o.HD1
    public void setVolume(float f) {
        u4();
        final float v = TD2.v(f, 0.0f, 1.0f);
        if (this.g2 == v) {
            return;
        }
        this.g2 = v;
        i4();
        this.j1.l(22, new C9876u11.a() { // from class: o.Ah0
            @Override // o.C9876u11.a
            public final void invoke(Object obj) {
                ((HD1.g) obj).j0(v);
            }
        });
    }

    @Override // o.HD1
    public void stop() {
        u4();
        this.y1.q(u1(), 1);
        o4(null);
        this.i2 = new C8274nS(AbstractC5317bO0.L(), this.t2.r);
    }

    @Override // o.HD1
    @Deprecated
    public void t(boolean z) {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.l(z, 1);
        }
    }

    @Override // o.HD1
    public HD1.c t1() {
        u4();
        return this.N1;
    }

    public final void t4() {
        int X = X();
        boolean z = false;
        if (X != 1) {
            if (X != 2 && X != 3) {
                if (X != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean b2 = b2();
                C9949uJ2 c9949uJ2 = this.A1;
                if (u1() && !b2) {
                    z = true;
                }
                c9949uJ2.b(z);
                this.B1.b(u1());
                return;
            }
        }
        this.A1.b(false);
        this.B1.b(false);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void u(int i) {
        u4();
        if (this.a2 == i) {
            return;
        }
        this.a2 = i;
        h4(2, 5, Integer.valueOf(i));
    }

    @Override // o.HD1
    public void u0(final int i) {
        u4();
        if (this.D1 != i) {
            this.D1 = i;
            this.i1.a1(i);
            this.j1.i(8, new C9876u11.a() { // from class: o.Eh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).f1(i);
                }
            });
            p4();
            this.j1.g();
        }
    }

    @Override // o.HD1
    public boolean u1() {
        u4();
        return this.t2.l;
    }

    @Override // o.HD1
    public long u2() {
        u4();
        return this.s1;
    }

    public final void u4() {
        IllegalStateException illegalStateException;
        this.b1.c();
        if (Thread.currentThread() != h1().getThread()) {
            String M = TD2.M("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), h1().getThread().getName());
            if (!this.l2) {
                if (this.m2) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                I31.o(x2, M, illegalStateException);
                this.m2 = true;
                return;
            }
            throw new IllegalStateException(M);
        }
    }

    @Override // o.HD1
    @Deprecated
    public void v() {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            c4399Ud2.i(1);
        }
    }

    @Override // o.HD1
    public void v1(final boolean z) {
        u4();
        if (this.E1 != z) {
            this.E1 = z;
            this.i1.e1(z);
            this.j1.i(9, new C9876u11.a() { // from class: o.th0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).Q(z);
                }
            });
            p4();
            this.j1.g();
        }
    }

    @Override // o.HD1
    public void w(@InterfaceC11300zs1 TextureView textureView) {
        SurfaceTexture surfaceTexture;
        u4();
        if (textureView == null) {
            F();
            return;
        }
        g4();
        this.Y1 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            I31.n(x2, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.v1);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            n4(null);
            c4(0, 0);
            return;
        }
        l4(surfaceTexture);
        c4(textureView.getWidth(), textureView.getHeight());
    }

    @Override // o.HD1
    public int w0() {
        u4();
        return this.D1;
    }

    @Override // o.InterfaceC3921Pg0
    public int w1() {
        u4();
        return this.e1.length;
    }

    @Override // o.HD1
    public void x(@InterfaceC11300zs1 SurfaceHolder surfaceHolder) {
        u4();
        if (surfaceHolder != null && surfaceHolder == this.V1) {
            F();
        }
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void y() {
        u4();
        i(new C3737Nj(0, 0.0f));
    }

    @Override // o.InterfaceC3921Pg0
    public void y0(InterfaceC3921Pg0.b bVar) {
        u4();
        this.k1.remove(bVar);
    }

    @Override // o.HD1
    public long y1() {
        u4();
        return 3000L;
    }

    @Override // o.AbstractC2559Bl
    public void y2(int i, long j, int i2, boolean z) {
        boolean z2;
        u4();
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a(z2);
        this.p1.P();
        AbstractC7373jp2 abstractC7373jp2 = this.t2.a;
        if (!abstractC7373jp2.x() && i >= abstractC7373jp2.w()) {
            return;
        }
        this.F1++;
        if (O()) {
            I31.n(x2, "seekTo ignored because an ad is playing");
            C6118ei0.e eVar = new C6118ei0.e(this.t2);
            eVar.b(1);
            this.h1.a(eVar);
            return;
        }
        BD1 bd1 = this.t2;
        int i3 = bd1.e;
        if (i3 == 3 || (i3 == 4 && !abstractC7373jp2.x())) {
            bd1 = this.t2.h(2);
        }
        int c2 = c2();
        BD1 a4 = a4(bd1, abstractC7373jp2, b4(abstractC7373jp2, i, j));
        this.i1.E0(abstractC7373jp2, i, TD2.j1(j));
        r4(a4, 0, 1, true, 1, R3(a4), c2, z);
    }

    @Override // o.HD1
    public int z() {
        u4();
        C4399Ud2 c4399Ud2 = this.z1;
        if (c4399Ud2 != null) {
            return c4399Ud2.g();
        }
        return 0;
    }

    @Override // o.InterfaceC3921Pg0
    public void z1(int i, List<InterfaceC7583kh1> list) {
        boolean z;
        u4();
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int min = Math.min(i, this.m1.size());
        if (this.m1.isEmpty()) {
            if (this.u2 == -1) {
                z2 = true;
            }
            M0(list, z2);
            return;
        }
        r4(J3(this.t2, min, list), 0, 1, false, 5, C10323vs.b, -1, false);
    }

    @Override // o.HD1
    @InterfaceC11300zs1
    public C3824Og0 c() {
        u4();
        return this.t2.f;
    }

    /* renamed from: o.Qh0$c */
    /* loaded from: classes2.dex */
    public final class c implements NG2, InterfaceC8085mh, InterfaceC3850Om2, InterfaceC6864hj1, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C3704Na2.b, C4505Vg.c, C10521wg.b, C4399Ud2.b, InterfaceC3921Pg0.b {
        public c() {
        }

        @Override // o.NG2
        public void B(C10833xx0 c10833xx0, @InterfaceC11300zs1 C9996uW c9996uW) {
            C4022Qh0.this.Q1 = c10833xx0;
            C4022Qh0.this.p1.B(c10833xx0, c9996uW);
        }

        @Override // o.NG2
        public void C(int i, long j) {
            C4022Qh0.this.p1.C(i, j);
        }

        @Override // o.InterfaceC8085mh
        public void D(C10833xx0 c10833xx0, @InterfaceC11300zs1 C9996uW c9996uW) {
            C4022Qh0.this.R1 = c10833xx0;
            C4022Qh0.this.p1.D(c10833xx0, c9996uW);
        }

        @Override // o.NG2
        public void E(C8775pW c8775pW) {
            C4022Qh0.this.p1.E(c8775pW);
            C4022Qh0.this.Q1 = null;
            C4022Qh0.this.c2 = null;
        }

        @Override // o.NG2
        public void F(Object obj, long j) {
            C4022Qh0.this.p1.F(obj, j);
            if (C4022Qh0.this.T1 == obj) {
                C4022Qh0.this.j1.l(26, new C4607Wh0());
            }
        }

        @Override // o.InterfaceC3850Om2
        public void G(final C8274nS c8274nS) {
            C4022Qh0.this.i2 = c8274nS;
            C4022Qh0.this.j1.l(27, new C9876u11.a() { // from class: o.Th0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).G(C8274nS.this);
                }
            });
        }

        @Override // o.InterfaceC8085mh
        public void H(Exception exc) {
            C4022Qh0.this.p1.H(exc);
        }

        @Override // o.InterfaceC8085mh
        public void I(int i, long j, long j2) {
            C4022Qh0.this.p1.I(i, j, j2);
        }

        @Override // o.NG2
        public void J(long j, int i) {
            C4022Qh0.this.p1.J(j, i);
        }

        @Override // o.InterfaceC8085mh
        public void a(final boolean z) {
            if (C4022Qh0.this.h2 != z) {
                C4022Qh0.this.h2 = z;
                C4022Qh0.this.j1.l(23, new C9876u11.a() { // from class: o.Yh0
                    @Override // o.C9876u11.a
                    public final void invoke(Object obj) {
                        ((HD1.g) obj).a(z);
                    }
                });
            }
        }

        @Override // o.InterfaceC8085mh
        public void b(Exception exc) {
            C4022Qh0.this.p1.b(exc);
        }

        @Override // o.NG2
        public void c(String str) {
            C4022Qh0.this.p1.c(str);
        }

        @Override // o.NG2
        public void d(String str, long j, long j2) {
            C4022Qh0.this.p1.d(str, j, j2);
        }

        @Override // o.C4399Ud2.b
        public void e(int i) {
            final Q20 L3 = C4022Qh0.L3(C4022Qh0.this.z1);
            if (!L3.equals(C4022Qh0.this.q2)) {
                C4022Qh0.this.q2 = L3;
                C4022Qh0.this.j1.l(29, new C9876u11.a() { // from class: o.Zh0
                    @Override // o.C9876u11.a
                    public final void invoke(Object obj) {
                        ((HD1.g) obj).r0(Q20.this);
                    }
                });
            }
        }

        @Override // o.InterfaceC8085mh
        public void f(C8775pW c8775pW) {
            C4022Qh0.this.d2 = c8775pW;
            C4022Qh0.this.p1.f(c8775pW);
        }

        @Override // o.C10521wg.b
        public void g() {
            C4022Qh0.this.q4(false, -1, 3);
        }

        @Override // o.C3704Na2.b
        public void h(Surface surface) {
            C4022Qh0.this.n4(null);
        }

        @Override // o.C3704Na2.b
        public void i(Surface surface) {
            C4022Qh0.this.n4(surface);
        }

        @Override // o.C4399Ud2.b
        public void j(final int i, final boolean z) {
            C4022Qh0.this.j1.l(30, new C9876u11.a() { // from class: o.Xh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).U(i, z);
                }
            });
        }

        @Override // o.InterfaceC3921Pg0.b
        public void m(boolean z) {
            C4022Qh0.this.t4();
        }

        @Override // o.C4505Vg.c
        public void n(float f) {
            C4022Qh0.this.i4();
        }

        @Override // o.C4505Vg.c
        public void o(int i) {
            boolean u1 = C4022Qh0.this.u1();
            C4022Qh0.this.q4(u1, i, C4022Qh0.U3(u1, i));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C4022Qh0.this.l4(surfaceTexture);
            C4022Qh0.this.c4(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C4022Qh0.this.n4(null);
            C4022Qh0.this.c4(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C4022Qh0.this.c4(i, i2);
        }

        @Override // o.InterfaceC8085mh
        public void q(String str) {
            C4022Qh0.this.p1.q(str);
        }

        @Override // o.InterfaceC8085mh
        public void r(String str, long j, long j2) {
            C4022Qh0.this.p1.r(str, j, j2);
        }

        @Override // o.InterfaceC6864hj1
        public void s(final C4224Si1 c4224Si1) {
            C4022Qh0 c4022Qh0 = C4022Qh0.this;
            c4022Qh0.s2 = c4022Qh0.s2.b().L(c4224Si1).H();
            C11005yf1 K3 = C4022Qh0.this.K3();
            if (!K3.equals(C4022Qh0.this.O1)) {
                C4022Qh0.this.O1 = K3;
                C4022Qh0.this.j1.i(14, new C9876u11.a() { // from class: o.Uh0
                    @Override // o.C9876u11.a
                    public final void invoke(Object obj) {
                        ((HD1.g) obj).p0(C4022Qh0.this.O1);
                    }
                });
            }
            C4022Qh0.this.j1.i(28, new C9876u11.a() { // from class: o.Vh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).s(C4224Si1.this);
                }
            });
            C4022Qh0.this.j1.g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C4022Qh0.this.c4(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C4022Qh0.this.X1) {
                C4022Qh0.this.n4(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C4022Qh0.this.X1) {
                C4022Qh0.this.n4(null);
            }
            C4022Qh0.this.c4(0, 0);
        }

        @Override // o.NG2
        public void t(final PG2 pg2) {
            C4022Qh0.this.r2 = pg2;
            C4022Qh0.this.j1.l(25, new C9876u11.a() { // from class: o.ai0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).t(PG2.this);
                }
            });
        }

        @Override // o.InterfaceC3850Om2
        public void u(final List<C7284jS> list) {
            C4022Qh0.this.j1.l(27, new C9876u11.a() { // from class: o.Sh0
                @Override // o.C9876u11.a
                public final void invoke(Object obj) {
                    ((HD1.g) obj).u(list);
                }
            });
        }

        @Override // o.InterfaceC8085mh
        public void v(long j) {
            C4022Qh0.this.p1.v(j);
        }

        @Override // o.NG2
        public void w(Exception exc) {
            C4022Qh0.this.p1.w(exc);
        }

        @Override // o.InterfaceC8085mh
        public void x(C8775pW c8775pW) {
            C4022Qh0.this.p1.x(c8775pW);
            C4022Qh0.this.R1 = null;
            C4022Qh0.this.d2 = null;
        }

        @Override // o.NG2
        public void z(C8775pW c8775pW) {
            C4022Qh0.this.c2 = c8775pW;
            C4022Qh0.this.p1.z(c8775pW);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
