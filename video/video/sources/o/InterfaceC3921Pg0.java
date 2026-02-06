package o;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import o.C10737xZ;
import o.InterfaceC3921Pg0;
import o.InterfaceC7583kh1;
import o.OD1;

@Deprecated
/* renamed from: o.Pg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3921Pg0 extends HD1 {
    public static final long a = 500;
    public static final long b = 2000;

    @Deprecated
    /* renamed from: o.Pg0$a */
    /* loaded from: classes2.dex */
    public interface a {
        @Deprecated
        void J(C9546sg c9546sg, boolean z);

        @Deprecated
        C9546sg b();

        @Deprecated
        void d(int i);

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        float getVolume();

        @Deprecated
        void i(C3737Nj c3737Nj);

        @Deprecated
        boolean j();

        @Deprecated
        void k(boolean z);

        @Deprecated
        void setVolume(float f);

        @Deprecated
        void y();
    }

    /* renamed from: o.Pg0$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public boolean A;
        public boolean B;
        @InterfaceC11300zs1
        public Looper C;
        public boolean D;
        public final Context a;
        public LD b;
        public long c;
        public InterfaceC8331nh2<InterfaceC11198zR1> d;
        public InterfaceC8331nh2<InterfaceC7583kh1.a> e;
        public InterfaceC8331nh2<AbstractC3283Ir2> f;
        public InterfaceC8331nh2<L11> g;
        public InterfaceC8331nh2<InterfaceC3643Mk> h;
        public YA0<LD, F8> i;
        public Looper j;
        @InterfaceC11300zs1
        public FH1 k;
        public C9546sg l;
        public boolean m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f584o;
        public boolean p;
        public boolean q;
        public int r;
        public int s;
        public boolean t;
        public LZ1 u;
        public long v;
        public long w;
        public K11 x;
        public long y;
        public long z;

        public c(final Context context) {
            this(context, new InterfaceC8331nh2() { // from class: o.bh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.b(context);
                }
            }, new InterfaceC8331nh2() { // from class: o.gh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.j(context);
                }
            });
        }

        public static /* synthetic */ L11 a(L11 l11) {
            return l11;
        }

        public static /* synthetic */ InterfaceC11198zR1 b(Context context) {
            return new C7902m00(context);
        }

        public static /* synthetic */ InterfaceC7583kh1.a c(InterfaceC7583kh1.a aVar) {
            return aVar;
        }

        public static /* synthetic */ AbstractC3283Ir2 d(AbstractC3283Ir2 abstractC3283Ir2) {
            return abstractC3283Ir2;
        }

        public static /* synthetic */ InterfaceC7583kh1.a e(InterfaceC7583kh1.a aVar) {
            return aVar;
        }

        public static /* synthetic */ InterfaceC11198zR1 f(InterfaceC11198zR1 interfaceC11198zR1) {
            return interfaceC11198zR1;
        }

        public static /* synthetic */ F8 g(F8 f8, LD ld) {
            return f8;
        }

        public static /* synthetic */ InterfaceC11198zR1 h(InterfaceC11198zR1 interfaceC11198zR1) {
            return interfaceC11198zR1;
        }

        public static /* synthetic */ InterfaceC11198zR1 i(Context context) {
            return new C7902m00(context);
        }

        public static /* synthetic */ InterfaceC7583kh1.a j(Context context) {
            return new JZ(context, new ZY());
        }

        public static /* synthetic */ InterfaceC7583kh1.a l(InterfaceC7583kh1.a aVar) {
            return aVar;
        }

        public static /* synthetic */ InterfaceC7583kh1.a m(Context context) {
            return new JZ(context, new ZY());
        }

        public static /* synthetic */ AbstractC3283Ir2 n(AbstractC3283Ir2 abstractC3283Ir2) {
            return abstractC3283Ir2;
        }

        public static /* synthetic */ InterfaceC3643Mk o(InterfaceC3643Mk interfaceC3643Mk) {
            return interfaceC3643Mk;
        }

        public static /* synthetic */ AbstractC3283Ir2 p(Context context) {
            return new C7177j10(context);
        }

        public static /* synthetic */ InterfaceC11198zR1 q(InterfaceC11198zR1 interfaceC11198zR1) {
            return interfaceC11198zR1;
        }

        public static /* synthetic */ InterfaceC7583kh1.a r(InterfaceC7583kh1.a aVar) {
            return aVar;
        }

        public static /* synthetic */ InterfaceC3643Mk s(InterfaceC3643Mk interfaceC3643Mk) {
            return interfaceC3643Mk;
        }

        public static /* synthetic */ F8 t(F8 f8, LD ld) {
            return f8;
        }

        public static /* synthetic */ L11 u(L11 l11) {
            return l11;
        }

        public static /* synthetic */ InterfaceC11198zR1 v(InterfaceC11198zR1 interfaceC11198zR1) {
            return interfaceC11198zR1;
        }

        @InterfaceC6181ey
        public c A(C9546sg c9546sg, boolean z) {
            C9542sf.i(!this.D);
            this.l = (C9546sg) C9542sf.g(c9546sg);
            this.m = z;
            return this;
        }

        @InterfaceC6181ey
        public c B(final InterfaceC3643Mk interfaceC3643Mk) {
            C9542sf.i(!this.D);
            C9542sf.g(interfaceC3643Mk);
            this.h = new InterfaceC8331nh2() { // from class: o.jh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.o(InterfaceC3643Mk.this);
                }
            };
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5056aJ2
        public c C(LD ld) {
            C9542sf.i(!this.D);
            this.b = ld;
            return this;
        }

        @InterfaceC6181ey
        public c D(long j) {
            C9542sf.i(!this.D);
            this.z = j;
            return this;
        }

        @InterfaceC6181ey
        public c E(boolean z) {
            C9542sf.i(!this.D);
            this.q = z;
            return this;
        }

        @InterfaceC6181ey
        public c F(boolean z) {
            C9542sf.i(!this.D);
            this.f584o = z;
            return this;
        }

        @InterfaceC6181ey
        public c G(K11 k11) {
            C9542sf.i(!this.D);
            this.x = (K11) C9542sf.g(k11);
            return this;
        }

        @InterfaceC6181ey
        public c H(final L11 l11) {
            C9542sf.i(!this.D);
            C9542sf.g(l11);
            this.g = new InterfaceC8331nh2() { // from class: o.Qg0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.u(L11.this);
                }
            };
            return this;
        }

        @InterfaceC6181ey
        public c I(Looper looper) {
            C9542sf.i(!this.D);
            C9542sf.g(looper);
            this.j = looper;
            return this;
        }

        @InterfaceC6181ey
        public c J(final InterfaceC7583kh1.a aVar) {
            C9542sf.i(!this.D);
            C9542sf.g(aVar);
            this.e = new InterfaceC8331nh2() { // from class: o.fh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.c(InterfaceC7583kh1.a.this);
                }
            };
            return this;
        }

        @InterfaceC6181ey
        public c K(boolean z) {
            C9542sf.i(!this.D);
            this.A = z;
            return this;
        }

        @InterfaceC6181ey
        public c L(Looper looper) {
            C9542sf.i(!this.D);
            this.C = looper;
            return this;
        }

        @InterfaceC6181ey
        public c M(@InterfaceC11300zs1 FH1 fh1) {
            C9542sf.i(!this.D);
            this.k = fh1;
            return this;
        }

        @InterfaceC6181ey
        public c N(long j) {
            C9542sf.i(!this.D);
            this.y = j;
            return this;
        }

        @InterfaceC6181ey
        public c O(final InterfaceC11198zR1 interfaceC11198zR1) {
            C9542sf.i(!this.D);
            C9542sf.g(interfaceC11198zR1);
            this.d = new InterfaceC8331nh2() { // from class: o.eh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.f(InterfaceC11198zR1.this);
                }
            };
            return this;
        }

        @InterfaceC6181ey
        public c P(@BR0(from = 1) long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            C9542sf.i(!this.D);
            this.v = j;
            return this;
        }

        @InterfaceC6181ey
        public c Q(@BR0(from = 1) long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            C9542sf.i(!this.D);
            this.w = j;
            return this;
        }

        @InterfaceC6181ey
        public c R(LZ1 lz1) {
            C9542sf.i(!this.D);
            this.u = (LZ1) C9542sf.g(lz1);
            return this;
        }

        @InterfaceC6181ey
        public c S(boolean z) {
            C9542sf.i(!this.D);
            this.p = z;
            return this;
        }

        @InterfaceC6181ey
        public c T(final AbstractC3283Ir2 abstractC3283Ir2) {
            C9542sf.i(!this.D);
            C9542sf.g(abstractC3283Ir2);
            this.f = new InterfaceC8331nh2() { // from class: o.Tg0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.d(AbstractC3283Ir2.this);
                }
            };
            return this;
        }

        @InterfaceC6181ey
        public c U(boolean z) {
            C9542sf.i(!this.D);
            this.t = z;
            return this;
        }

        @InterfaceC6181ey
        public c V(boolean z) {
            C9542sf.i(!this.D);
            this.B = z;
            return this;
        }

        @InterfaceC6181ey
        public c W(int i) {
            C9542sf.i(!this.D);
            this.s = i;
            return this;
        }

        @InterfaceC6181ey
        public c X(int i) {
            C9542sf.i(!this.D);
            this.r = i;
            return this;
        }

        @InterfaceC6181ey
        public c Y(int i) {
            C9542sf.i(!this.D);
            this.n = i;
            return this;
        }

        public InterfaceC3921Pg0 w() {
            C9542sf.i(!this.D);
            this.D = true;
            return new C4022Qh0(this, null);
        }

        public Q72 x() {
            C9542sf.i(!this.D);
            this.D = true;
            return new Q72(this);
        }

        @InterfaceC6181ey
        public c y(long j) {
            C9542sf.i(!this.D);
            this.c = j;
            return this;
        }

        @InterfaceC6181ey
        public c z(final F8 f8) {
            C9542sf.i(!this.D);
            C9542sf.g(f8);
            this.i = new YA0() { // from class: o.dh0
                @Override // o.YA0
                public final Object apply(Object obj) {
                    return InterfaceC3921Pg0.c.g(F8.this, (LD) obj);
                }
            };
            return this;
        }

        public c(final Context context, final InterfaceC11198zR1 interfaceC11198zR1) {
            this(context, new InterfaceC8331nh2() { // from class: o.Ug0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.h(InterfaceC11198zR1.this);
                }
            }, new InterfaceC8331nh2() { // from class: o.Vg0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.m(context);
                }
            });
            C9542sf.g(interfaceC11198zR1);
        }

        public c(final Context context, final InterfaceC7583kh1.a aVar) {
            this(context, new InterfaceC8331nh2() { // from class: o.Wg0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.i(context);
                }
            }, new InterfaceC8331nh2() { // from class: o.Xg0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.r(InterfaceC7583kh1.a.this);
                }
            });
            C9542sf.g(aVar);
        }

        public c(Context context, final InterfaceC11198zR1 interfaceC11198zR1, final InterfaceC7583kh1.a aVar) {
            this(context, new InterfaceC8331nh2() { // from class: o.hh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.v(InterfaceC11198zR1.this);
                }
            }, new InterfaceC8331nh2() { // from class: o.ih0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.e(InterfaceC7583kh1.a.this);
                }
            });
            C9542sf.g(interfaceC11198zR1);
            C9542sf.g(aVar);
        }

        public c(Context context, final InterfaceC11198zR1 interfaceC11198zR1, final InterfaceC7583kh1.a aVar, final AbstractC3283Ir2 abstractC3283Ir2, final L11 l11, final InterfaceC3643Mk interfaceC3643Mk, final F8 f8) {
            this(context, new InterfaceC8331nh2() { // from class: o.kh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.q(InterfaceC11198zR1.this);
                }
            }, new InterfaceC8331nh2() { // from class: o.lh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.l(InterfaceC7583kh1.a.this);
                }
            }, new InterfaceC8331nh2() { // from class: o.mh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.n(AbstractC3283Ir2.this);
                }
            }, new InterfaceC8331nh2() { // from class: o.nh0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.a(L11.this);
                }
            }, new InterfaceC8331nh2() { // from class: o.Rg0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.s(InterfaceC3643Mk.this);
                }
            }, new YA0() { // from class: o.Sg0
                @Override // o.YA0
                public final Object apply(Object obj) {
                    return InterfaceC3921Pg0.c.t(F8.this, (LD) obj);
                }
            });
            C9542sf.g(interfaceC11198zR1);
            C9542sf.g(aVar);
            C9542sf.g(abstractC3283Ir2);
            C9542sf.g(interfaceC3643Mk);
            C9542sf.g(f8);
        }

        public c(final Context context, InterfaceC8331nh2<InterfaceC11198zR1> interfaceC8331nh2, InterfaceC8331nh2<InterfaceC7583kh1.a> interfaceC8331nh22) {
            this(context, interfaceC8331nh2, interfaceC8331nh22, new InterfaceC8331nh2() { // from class: o.Yg0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return InterfaceC3921Pg0.c.p(context);
                }
            }, new InterfaceC8331nh2() { // from class: o.Zg0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return new C10980yZ();
                }
            }, new InterfaceC8331nh2() { // from class: o.ah0
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    InterfaceC3643Mk n;
                    n = C7547kY.n(context);
                    return n;
                }
            }, new YA0() { // from class: o.ch0
                @Override // o.YA0
                public final Object apply(Object obj) {
                    return new UX((LD) obj);
                }
            });
        }

        public c(Context context, InterfaceC8331nh2<InterfaceC11198zR1> interfaceC8331nh2, InterfaceC8331nh2<InterfaceC7583kh1.a> interfaceC8331nh22, InterfaceC8331nh2<AbstractC3283Ir2> interfaceC8331nh23, InterfaceC8331nh2<L11> interfaceC8331nh24, InterfaceC8331nh2<InterfaceC3643Mk> interfaceC8331nh25, YA0<LD, F8> ya0) {
            this.a = (Context) C9542sf.g(context);
            this.d = interfaceC8331nh2;
            this.e = interfaceC8331nh22;
            this.f = interfaceC8331nh23;
            this.g = interfaceC8331nh24;
            this.h = interfaceC8331nh25;
            this.i = ya0;
            this.j = TD2.d0();
            this.l = C9546sg.b1;
            this.n = 0;
            this.r = 1;
            this.s = 0;
            this.t = true;
            this.u = LZ1.g;
            this.v = 5000L;
            this.w = 15000L;
            this.x = new C10737xZ.b().a();
            this.b = LD.a;
            this.y = 500L;
            this.z = 2000L;
            this.B = true;
        }
    }

    @Deprecated
    /* renamed from: o.Pg0$d */
    /* loaded from: classes2.dex */
    public interface d {
        @Deprecated
        Q20 C();

        @Deprecated
        boolean H();

        @Deprecated
        void K(int i);

        @Deprecated
        void n();

        @Deprecated
        void t(boolean z);

        @Deprecated
        void v();

        @Deprecated
        int z();
    }

    @Deprecated
    /* renamed from: o.Pg0$e */
    /* loaded from: classes2.dex */
    public interface e {
        @Deprecated
        C8274nS s();
    }

    @Deprecated
    /* renamed from: o.Pg0$f */
    /* loaded from: classes2.dex */
    public interface f {
        @Deprecated
        void A(@InterfaceC11300zs1 TextureView textureView);

        @Deprecated
        PG2 B();

        @Deprecated
        void D(InterfaceC9857tx interfaceC9857tx);

        @Deprecated
        void E(InterfaceC9857tx interfaceC9857tx);

        @Deprecated
        void F();

        @Deprecated
        void G(@InterfaceC11300zs1 SurfaceView surfaceView);

        @Deprecated
        int I();

        @Deprecated
        void L(InterfaceC5529cG2 interfaceC5529cG2);

        @Deprecated
        void e(int i);

        @Deprecated
        void l(@InterfaceC11300zs1 Surface surface);

        @Deprecated
        void m(@InterfaceC11300zs1 Surface surface);

        @Deprecated
        void o(@InterfaceC11300zs1 SurfaceView surfaceView);

        @Deprecated
        void p(@InterfaceC11300zs1 SurfaceHolder surfaceHolder);

        @Deprecated
        void q(InterfaceC5529cG2 interfaceC5529cG2);

        @Deprecated
        int r();

        @Deprecated
        void u(int i);

        @Deprecated
        void w(@InterfaceC11300zs1 TextureView textureView);

        @Deprecated
        void x(@InterfaceC11300zs1 SurfaceHolder surfaceHolder);
    }

    void A0(InterfaceC7583kh1 interfaceC7583kh1, long j);

    InterfaceC10469wR1 A1(int i);

    void B0(b bVar);

    void C0(InterfaceC7583kh1 interfaceC7583kh1);

    void D(InterfaceC9857tx interfaceC9857tx);

    void E(InterfaceC9857tx interfaceC9857tx);

    @InterfaceC11300zs1
    @Deprecated
    f E0();

    void H1(List<InterfaceC7583kh1> list);

    int I();

    @InterfaceC11300zs1
    C10833xx0 I0();

    @InterfaceC11300zs1
    @Deprecated
    d I1();

    void J(C9546sg c9546sg, boolean z);

    @ES1(18)
    void J0(List<P90> list);

    @InterfaceC11300zs1
    @Deprecated
    a K1();

    void L(InterfaceC5529cG2 interfaceC5529cG2);

    boolean M();

    void M0(List<InterfaceC7583kh1> list, boolean z);

    void N0(boolean z);

    @ES1(23)
    void O0(@InterfaceC11300zs1 AudioDeviceInfo audioDeviceInfo);

    @InterfaceC11300zs1
    C8775pW O1();

    void P(J8 j8);

    @InterfaceC11300zs1
    C10833xx0 Q1();

    void R1(InterfaceC7583kh1 interfaceC7583kh1, boolean z);

    void S0(boolean z);

    LD V();

    void V0(boolean z);

    @InterfaceC11300zs1
    AbstractC3283Ir2 W();

    void W0(List<InterfaceC7583kh1> list, int i, long j);

    void W1(J8 j8);

    void X1(int i, InterfaceC7583kh1 interfaceC7583kh1);

    Looper Z1();

    @Deprecated
    void a0(InterfaceC7583kh1 interfaceC7583kh1, boolean z, boolean z2);

    boolean b2();

    @Override // o.HD1
    @InterfaceC11300zs1
    C3824Og0 c();

    @Deprecated
    C10079ur2 c1();

    void d(int i);

    void e(int i);

    void e2(int i);

    void f0(boolean z);

    OD1 f2(OD1.b bVar);

    void g1(@InterfaceC11300zs1 LZ1 lz1);

    LZ1 g2();

    int getAudioSessionId();

    void h2(InterfaceC7583kh1 interfaceC7583kh1);

    void i(C3737Nj c3737Nj);

    boolean j();

    void k(boolean z);

    @Deprecated
    C11297zr2 k1();

    F8 l2();

    int m1(int i);

    @InterfaceC11300zs1
    @Deprecated
    e n1();

    void o1(U52 u52);

    boolean p1();

    void q(InterfaceC5529cG2 interfaceC5529cG2);

    @Deprecated
    void q0(InterfaceC7583kh1 interfaceC7583kh1);

    @InterfaceC11300zs1
    C8775pW q2();

    int r();

    void r0(List<InterfaceC7583kh1> list);

    void r1(@InterfaceC11300zs1 FH1 fh1);

    void u(int i);

    int w1();

    void y();

    void y0(b bVar);

    void z1(int i, List<InterfaceC7583kh1> list);

    /* renamed from: o.Pg0$b */
    /* loaded from: classes2.dex */
    public interface b {
        default void k(boolean z) {
        }

        default void m(boolean z) {
        }

        default void y(boolean z) {
        }
    }
}
