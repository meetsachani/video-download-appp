package o;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC2824Ed2;
import o.C3051Gi2;
import o.C3597Ly;
import o.C3679Mt;
import o.C9204rF2;
import o.C9800ti2;
import o.InterfaceC2789Dt1;
import o.InterfaceC5070aN0;
import o.InterfaceC6040eN0;
import o.InterfaceC6743hD2;
import o.InterfaceC6986iD2;
import o.InterfaceC9085qn2;
import o.InterfaceC9694tG2;
import o.T12;
import o.V00;

/* renamed from: o.rF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9204rF2<T extends InterfaceC9694tG2> extends androidx.camera.core.m {
    public static final String A = "VideoCapture";
    public static final String B = "androidx.camera.video.VideoCapture.streamUpdate";
    public static final e C = new e();
    public static boolean D;
    public static final boolean E;
    public D10 n;

    /* renamed from: o  reason: collision with root package name */
    public C6618gi2 f847o;
    public AbstractC2824Ed2 p;
    public T12.b q;
    public InterfaceFutureC8411o11<Void> r;
    public C3051Gi2 s;
    public InterfaceC9694tG2.a t;
    public C9800ti2 u;
    public NF2 v;
    public Rect w;
    public int x;
    public boolean y;
    public final InterfaceC2789Dt1.a<AbstractC2824Ed2> z;

    /* renamed from: o.rF2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2789Dt1.a<AbstractC2824Ed2> {
        public a() {
        }

        @Override // o.InterfaceC2789Dt1.a
        /* renamed from: b */
        public void a(AbstractC2824Ed2 abstractC2824Ed2) {
            if (abstractC2824Ed2 != null) {
                if (C9204rF2.this.t != InterfaceC9694tG2.a.INACTIVE) {
                    C7433k41.a(C9204rF2.A, "Stream info update: old: " + C9204rF2.this.p + " new: " + abstractC2824Ed2);
                    C9204rF2 c9204rF2 = C9204rF2.this;
                    AbstractC2824Ed2 abstractC2824Ed22 = c9204rF2.p;
                    c9204rF2.p = abstractC2824Ed2;
                    AbstractC4008Qd2 abstractC4008Qd2 = (AbstractC4008Qd2) C10907yF1.l(c9204rF2.e());
                    if (!C9204rF2.this.O0(abstractC2824Ed22.a(), abstractC2824Ed2.a()) && !C9204rF2.this.a1(abstractC2824Ed22, abstractC2824Ed2)) {
                        if ((abstractC2824Ed22.a() != -1 && abstractC2824Ed2.a() == -1) || (abstractC2824Ed22.a() == -1 && abstractC2824Ed2.a() != -1)) {
                            C9204rF2 c9204rF22 = C9204rF2.this;
                            c9204rF22.u0(c9204rF22.q, abstractC2824Ed2, abstractC4008Qd2);
                            C9204rF2 c9204rF23 = C9204rF2.this;
                            c9204rF23.X(c9204rF23.q.q());
                            C9204rF2.this.F();
                            return;
                        } else if (abstractC2824Ed22.c() != abstractC2824Ed2.c()) {
                            C9204rF2 c9204rF24 = C9204rF2.this;
                            c9204rF24.u0(c9204rF24.q, abstractC2824Ed2, abstractC4008Qd2);
                            C9204rF2 c9204rF25 = C9204rF2.this;
                            c9204rF25.X(c9204rF25.q.q());
                            C9204rF2.this.H();
                            return;
                        } else {
                            return;
                        }
                    }
                    C9204rF2 c9204rF26 = C9204rF2.this;
                    c9204rF26.Q0(c9204rF26.i(), (C10176vF2) C9204rF2.this.j(), (AbstractC4008Qd2) C10907yF1.l(C9204rF2.this.e()));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("StreamInfo can't be null");
        }

        @Override // o.InterfaceC2789Dt1.a
        public void onError(Throwable th) {
            C7433k41.q(C9204rF2.A, "Receive onError from StreamState observer", th);
        }
    }

    /* renamed from: o.rF2$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC3393Jv {
        public boolean a = true;
        public final /* synthetic */ AtomicBoolean b;
        public final /* synthetic */ C3679Mt.a c;
        public final /* synthetic */ T12.b d;

        public b(AtomicBoolean atomicBoolean, C3679Mt.a aVar, T12.b bVar) {
            this.b = atomicBoolean;
            this.c = aVar;
            this.d = bVar;
        }

        public static /* synthetic */ void d(b bVar, T12.b bVar2) {
            bVar.getClass();
            bVar2.u(bVar);
        }

        @Override // o.AbstractC3393Jv
        public void b(InterfaceC3784Nv interfaceC3784Nv) {
            Object d;
            super.b(interfaceC3784Nv);
            if (this.a) {
                this.a = false;
                C7433k41.a(C9204rF2.A, "cameraCaptureResult timestampNs = " + interfaceC3784Nv.c() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (!this.b.get() && (d = interfaceC3784Nv.a().d(C9204rF2.B)) != null && ((Integer) d).intValue() == this.c.hashCode() && this.c.c(null) && !this.b.getAndSet(true)) {
                ScheduledExecutorService f = C5211ay.f();
                final T12.b bVar = this.d;
                f.execute(new Runnable() { // from class: o.sF2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9204rF2.b.d(C9204rF2.b.this, bVar);
                    }
                });
            }
        }
    }

    /* renamed from: o.rF2$c */
    /* loaded from: classes.dex */
    public class c implements XB0<Void> {
        public final /* synthetic */ InterfaceFutureC8411o11 a;
        public final /* synthetic */ boolean b;

        public c(InterfaceFutureC8411o11 interfaceFutureC8411o11, boolean z) {
            this.a = interfaceFutureC8411o11;
            this.b = z;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            if (!(th instanceof CancellationException)) {
                C7433k41.d(C9204rF2.A, "Surface update completed with unexpected exception", th);
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r3) {
            InterfaceC9694tG2.a aVar;
            InterfaceFutureC8411o11<Void> interfaceFutureC8411o11 = this.a;
            C9204rF2 c9204rF2 = C9204rF2.this;
            if (interfaceFutureC8411o11 == c9204rF2.r && c9204rF2.t != InterfaceC9694tG2.a.INACTIVE) {
                if (this.b) {
                    aVar = InterfaceC9694tG2.a.ACTIVE_STREAMING;
                } else {
                    aVar = InterfaceC9694tG2.a.ACTIVE_NON_STREAMING;
                }
                c9204rF2.T0(aVar);
            }
        }
    }

    /* renamed from: o.rF2$d */
    /* loaded from: classes.dex */
    public static final class d<T extends InterfaceC9694tG2> implements InterfaceC6743hD2.a<C9204rF2<T>, C10176vF2<T>, d<T>>, InterfaceC6040eN0.a<d<T>>, InterfaceC5070aN0.a<d<T>>, InterfaceC9085qn2.a<d<T>> {
        public final C2569Bn1 a;

        public d(T t) {
            this(A(t));
        }

        public static <T extends InterfaceC9694tG2> C2569Bn1 A(T t) {
            C2569Bn1 u0 = C2569Bn1.u0();
            u0.h0(C10176vF2.L, t);
            return u0;
        }

        public static d<? extends InterfaceC9694tG2> B(HJ hj) {
            return new d<>(C2569Bn1.v0(hj));
        }

        public static <T extends InterfaceC9694tG2> d<T> C(C10176vF2<T> c10176vF2) {
            return new d<>(C2569Bn1.v0(c10176vF2));
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: D */
        public C10176vF2<T> t() {
            return new C10176vF2<>(C5932dw1.t0(this.a));
        }

        @Override // o.InterfaceC9085qn2.a
        /* renamed from: E */
        public d<T> h(Executor executor) {
            e().h0(InterfaceC9085qn2.y, executor);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: F */
        public d<T> b(C2898Ex c2898Ex) {
            e().h0(InterfaceC6743hD2.E, c2898Ex);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: G */
        public d<T> i(C3597Ly.b bVar) {
            e().h0(InterfaceC6743hD2.C, bVar);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: H */
        public d<T> x(InterfaceC6986iD2.b bVar) {
            e().h0(InterfaceC6743hD2.I, bVar);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: I */
        public d<T> m(List<Size> list) {
            e().h0(InterfaceC6040eN0.u, list);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: J */
        public d<T> v(C3597Ly c3597Ly) {
            e().h0(InterfaceC6743hD2.A, c3597Ly);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: K */
        public d<T> l(Size size) {
            e().h0(InterfaceC6040eN0.q, size);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: L */
        public d<T> j(T12 t12) {
            e().h0(InterfaceC6743hD2.z, t12);
            return this;
        }

        @Override // o.InterfaceC5070aN0.a
        /* renamed from: M */
        public d<T> p(N80 n80) {
            e().h0(InterfaceC5070aN0.i, n80);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: N */
        public d<T> n(boolean z) {
            e().h0(InterfaceC6743hD2.H, Boolean.valueOf(z));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: O */
        public d<T> o(Size size) {
            e().h0(InterfaceC6040eN0.r, size);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: P */
        public d<T> u(int i) {
            e().h0(InterfaceC6040eN0.f723o, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: Q */
        public d<T> f(US1 us1) {
            e().h0(InterfaceC6040eN0.t, us1);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: R */
        public d<T> d(T12.d dVar) {
            e().h0(InterfaceC6743hD2.B, dVar);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: S */
        public d<T> w(List<Pair<Integer, Size[]>> list) {
            e().h0(InterfaceC6040eN0.s, list);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: T */
        public d<T> y(int i) {
            e().h0(InterfaceC6743hD2.D, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: U */
        public d<T> s(int i) {
            throw new UnsupportedOperationException("setTargetAspectRatio is not supported.");
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: V */
        public d<T> q(Class<C9204rF2<T>> cls) {
            e().h0(InterfaceC3063Gl2.x, cls);
            if (e().h(InterfaceC3063Gl2.w, null) == null) {
                k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public d<T> W(Range<Integer> range) {
            e().h0(InterfaceC6743hD2.F, range);
            return this;
        }

        @Override // o.InterfaceC3063Gl2.a
        /* renamed from: X */
        public d<T> k(String str) {
            e().h0(InterfaceC3063Gl2.w, str);
            return this;
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: Y */
        public d<T> r(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // o.InterfaceC6040eN0.a
        /* renamed from: Z */
        public d<T> g(int i) {
            e().h0(InterfaceC6040eN0.m, Integer.valueOf(i));
            return this;
        }

        @Override // o.InterfaceC7470kD2.a
        /* renamed from: a0 */
        public d<T> c(m.b bVar) {
            e().h0(InterfaceC7470kD2.J, bVar);
            return this;
        }

        public d<T> b0(InterfaceC6490gB0<IF2, NF2> interfaceC6490gB0) {
            e().h0(C10176vF2.M, interfaceC6490gB0);
            return this;
        }

        @Override // o.InterfaceC6743hD2.a
        /* renamed from: c0 */
        public d<T> a(boolean z) {
            e().h0(InterfaceC6743hD2.G, Boolean.valueOf(z));
            return this;
        }

        @Override // o.InterfaceC10288vj0
        public InterfaceC3849Om1 e() {
            return this.a;
        }

        @Override // o.InterfaceC10288vj0
        /* renamed from: z */
        public C9204rF2<T> build() {
            return new C9204rF2<>(t());
        }

        public d(C2569Bn1 c2569Bn1) {
            this.a = c2569Bn1;
            if (c2569Bn1.g(C10176vF2.L)) {
                Class cls = (Class) c2569Bn1.h(InterfaceC3063Gl2.x, null);
                if (cls != null && !cls.equals(C9204rF2.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                q(C9204rF2.class);
                return;
            }
            throw new IllegalArgumentException("VideoOutput is required");
        }
    }

    /* renamed from: o.rF2$e */
    /* loaded from: classes.dex */
    public static final class e implements SJ<C10176vF2<?>> {
        public static final int a = 5;
        public static final InterfaceC9694tG2 b;
        public static final C10176vF2<?> c;
        public static final InterfaceC6490gB0<IF2, NF2> d;
        public static final Range<Integer> e;
        public static final N80 f;

        static {
            InterfaceC9694tG2 interfaceC9694tG2 = new InterfaceC9694tG2() { // from class: o.uF2
                @Override // o.InterfaceC9694tG2
                public final void a(C3051Gi2 c3051Gi2) {
                    c3051Gi2.w();
                }
            };
            b = interfaceC9694tG2;
            InterfaceC6490gB0<IF2, NF2> b2 = b();
            d = b2;
            e = new Range<>(30, 30);
            N80 n80 = N80.n;
            f = n80;
            c = (C10176vF2<T>) new d(interfaceC9694tG2).y(5).b0(b2).p(n80).x(InterfaceC6986iD2.b.VIDEO_CAPTURE).t();
        }

        public static /* synthetic */ NF2 a(IF2 if2) {
            try {
                return OF2.k(if2);
            } catch (C8279nT0 e2) {
                C7433k41.q(C9204rF2.A, "Unable to find VideoEncoderInfo", e2);
                return null;
            }
        }

        public static InterfaceC6490gB0<IF2, NF2> b() {
            return new InterfaceC6490gB0() { // from class: o.tF2
                @Override // o.InterfaceC6490gB0
                public final Object apply(Object obj) {
                    return C9204rF2.e.a((IF2) obj);
                }
            };
        }

        @Override // o.SJ
        /* renamed from: c */
        public C10176vF2<?> d() {
            return c;
        }
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (V20.a(C6017eH1.class) != null) {
            z = true;
        } else {
            z = false;
        }
        if (V20.a(XG1.class) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (V20.a(FM0.class) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean N0 = N0();
        if (V20.a(C4030Qj0.class) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z && !z2 && !z3) {
            z5 = false;
        } else {
            z5 = true;
        }
        E = z5;
        if (z2 || z3 || N0 || z4) {
            z6 = true;
        }
        D = z6;
    }

    public C9204rF2(C10176vF2<T> c10176vF2) {
        super(c10176vF2);
        this.p = AbstractC2824Ed2.c;
        this.q = new T12.b();
        this.r = null;
        this.t = InterfaceC9694tG2.a.INACTIVE;
        this.y = false;
        this.z = new a();
    }

    public static boolean N0() {
        for (BG2 bg2 : V20.b(BG2.class)) {
            if (bg2.a()) {
                return true;
            }
        }
        return false;
    }

    public static NF2 R0(InterfaceC6490gB0<IF2, NF2> interfaceC6490gB0, VG2 vg2, AbstractC3242Ih1 abstractC3242Ih1, Size size, N80 n80, Range<Integer> range) {
        return interfaceC6490gB0.apply(C10422wF2.c(C10422wF2.d(abstractC3242Ih1, n80, vg2), EnumC5905dp2.UPTIME, abstractC3242Ih1.d(), size, n80, range));
    }

    private void S0() {
        InterfaceC7402jx g = g();
        C6618gi2 c6618gi2 = this.f847o;
        if (g != null && c6618gi2 != null) {
            int q0 = q0(q(g, B(g)));
            this.x = q0;
            c6618gi2.D(q0, d());
        }
    }

    public static boolean X0(Rect rect, Size size) {
        if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return false;
        }
        return true;
    }

    public static boolean Y0(InterfaceC7402jx interfaceC7402jx) {
        if (interfaceC7402jx.r() && D) {
            return true;
        }
        return false;
    }

    private boolean Z0(InterfaceC7402jx interfaceC7402jx) {
        if (interfaceC7402jx.r() && B(interfaceC7402jx)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int b0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    public static /* synthetic */ void c0(C9204rF2 c9204rF2, D10 d10) {
        if (d10 == c9204rF2.n) {
            c9204rF2.w0();
        }
    }

    public static <T extends InterfaceC9694tG2> C9204rF2<T> c1(T t) {
        return new d((InterfaceC9694tG2) C10907yF1.l(t)).x(InterfaceC6986iD2.b.VIDEO_CAPTURE).build();
    }

    public static /* synthetic */ void e0(AtomicBoolean atomicBoolean, T12.b bVar, AbstractC3393Jv abstractC3393Jv) {
        C10907yF1.o(C5901do2.f(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.u(abstractC3393Jv);
    }

    public static /* synthetic */ Object f0(C9204rF2 c9204rF2, final T12.b bVar, C3679Mt.a aVar) {
        c9204rF2.getClass();
        bVar.p(B, Integer.valueOf(aVar.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar2 = new b(atomicBoolean, aVar, bVar);
        aVar.a(new Runnable() { // from class: o.kF2
            @Override // java.lang.Runnable
            public final void run() {
                C9204rF2.e0(atomicBoolean, bVar, bVar2);
            }
        }, C5211ay.b());
        bVar.l(bVar2);
        return String.format("%s[0x%x]", B, Integer.valueOf(aVar.hashCode()));
    }

    public static void m0(Set<Size> set, int i, int i2, Size size, NF2 nf2) {
        if (i <= size.getWidth() && i2 <= size.getHeight()) {
            try {
                set.add(new Size(i, nf2.g(i).clamp(Integer.valueOf(i2)).intValue()));
            } catch (IllegalArgumentException e2) {
                C7433k41.q(A, "No supportedHeights for width: " + i, e2);
            }
            try {
                set.add(new Size(nf2.b(i2).clamp(Integer.valueOf(i)).intValue(), i2));
            } catch (IllegalArgumentException e3) {
                C7433k41.q(A, "No supportedWidths for height: " + i2, e3);
            }
        }
    }

    public static Rect n0(final Rect rect, Size size, NF2 nf2) {
        boolean z;
        C7433k41.a(A, String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", C5433bs2.n(rect), Integer.valueOf(nf2.e()), Integer.valueOf(nf2.c()), nf2.h(), nf2.i()));
        int e2 = nf2.e();
        int c2 = nf2.c();
        Range<Integer> h = nf2.h();
        Range<Integer> i = nf2.i();
        int s0 = s0(rect.width(), e2, h);
        int t0 = t0(rect.width(), e2, h);
        int s02 = s0(rect.height(), c2, i);
        int t02 = t0(rect.height(), c2, i);
        HashSet hashSet = new HashSet();
        m0(hashSet, s0, s02, size, nf2);
        m0(hashSet, s0, t02, size, nf2);
        m0(hashSet, t0, s02, size, nf2);
        m0(hashSet, t0, t02, size, nf2);
        if (hashSet.isEmpty()) {
            C7433k41.p(A, "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        C7433k41.a(A, "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: o.lF2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C9204rF2.b0(rect, (Size) obj, (Size) obj2);
            }
        });
        C7433k41.a(A, "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            C7433k41.a(A, "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        if (width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int max = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = max;
            int i2 = max + width;
            rect2.right = i2;
            if (i2 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int max2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = max2;
            int i3 = max2 + height;
            rect2.bottom = i3;
            if (i3 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        C7433k41.a(A, String.format("Adjust cropRect from %s to %s", C5433bs2.n(rect), C5433bs2.n(rect2)));
        return rect2;
    }

    public static int r0(boolean z, int i, int i2, Range<Integer> range) {
        int i3 = i % i2;
        if (i3 != 0) {
            if (z) {
                i -= i3;
            } else {
                i += i2 - i3;
            }
        }
        return range.clamp(Integer.valueOf(i)).intValue();
    }

    public static int s0(int i, int i2, Range<Integer> range) {
        return r0(true, i, i2, range);
    }

    public static int t0(int i, int i2, Range<Integer> range) {
        return r0(false, i, i2, range);
    }

    private void w0() {
        C5901do2.c();
        D10 d10 = this.n;
        if (d10 != null) {
            d10.d();
            this.n = null;
        }
        C9800ti2 c9800ti2 = this.u;
        if (c9800ti2 != null) {
            c9800ti2.g();
            this.u = null;
        }
        C6618gi2 c6618gi2 = this.f847o;
        if (c6618gi2 != null) {
            c6618gi2.i();
            this.f847o = null;
        }
        this.v = null;
        this.w = null;
        this.s = null;
        this.p = AbstractC2824Ed2.c;
        this.x = 0;
        this.y = false;
    }

    public static <T> T z0(InterfaceC2789Dt1<T> interfaceC2789Dt1, T t) {
        InterfaceFutureC8411o11<T> a2 = interfaceC2789Dt1.a();
        if (!a2.isDone()) {
            return t;
        }
        try {
            return a2.get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public C6618gi2 A0() {
        return this.f847o;
    }

    public Rect B0() {
        return this.w;
    }

    public N80 C0() {
        if (j().V()) {
            return j().P();
        }
        return e.f;
    }

    public final AbstractC3242Ih1 D0() {
        return (AbstractC3242Ih1) z0(G0().b(), null);
    }

    public int E0() {
        return n();
    }

    public C9800ti2 F0() {
        return this.u;
    }

    public T G0() {
        return (T) ((C10176vF2) j()).s0();
    }

    public int H0() {
        return this.x;
    }

    public C3051Gi2 I0() {
        C3051Gi2 c3051Gi2 = this.s;
        Objects.requireNonNull(c3051Gi2);
        return c3051Gi2;
    }

    public Range<Integer> J0() {
        return v();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> K(InterfaceC6918hx interfaceC6918hx, InterfaceC6743hD2.a<?, ?, ?> aVar) {
        b1(interfaceC6918hx, aVar);
        return aVar.t();
    }

    public int K0() {
        return w();
    }

    @Override // androidx.camera.core.m
    public void L() {
        boolean z;
        super.L();
        C10907yF1.m(e(), "The suggested stream specification should be already updated and shouldn't be null.");
        if (this.s == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "The surface request should be null when VideoCapture is attached.");
        AbstractC4008Qd2 abstractC4008Qd2 = (AbstractC4008Qd2) C10907yF1.l(e());
        this.p = (AbstractC2824Ed2) z0(G0().d(), AbstractC2824Ed2.c);
        T12.b y0 = y0(i(), (C10176vF2) j(), abstractC4008Qd2);
        this.q = y0;
        u0(y0, this.p, abstractC4008Qd2);
        X(this.q.q());
        D();
        G0().d().b(C5211ay.f(), this.z);
        T0(InterfaceC9694tG2.a.ACTIVE_NON_STREAMING);
    }

    public final InterfaceC7235jF2 L0(InterfaceC6420fx interfaceC6420fx) {
        return G0().f(interfaceC6420fx);
    }

    @Override // androidx.camera.core.m
    public void M() {
        C10907yF1.o(C5901do2.f(), "VideoCapture can only be detached on the main thread.");
        T0(InterfaceC9694tG2.a.INACTIVE);
        G0().d().d(this.z);
        InterfaceFutureC8411o11<Void> interfaceFutureC8411o11 = this.r;
        if (interfaceFutureC8411o11 != null && interfaceFutureC8411o11.cancel(false)) {
            C7433k41.a(A, "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        w0();
    }

    public final NF2 M0(InterfaceC6490gB0<IF2, NF2> interfaceC6490gB0, InterfaceC7235jF2 interfaceC7235jF2, N80 n80, AbstractC3242Ih1 abstractC3242Ih1, Size size, Range<Integer> range) {
        NF2 nf2 = this.v;
        if (nf2 != null) {
            return nf2;
        }
        VG2 e2 = interfaceC7235jF2.e(size, n80);
        NF2 R0 = R0(interfaceC6490gB0, e2, abstractC3242Ih1, size, n80, range);
        Size size2 = null;
        if (R0 == null) {
            C7433k41.p(A, "Can't find videoEncoderInfo");
            return null;
        }
        if (e2 != null) {
            size2 = new Size(e2.k().k(), e2.k().h());
        }
        NF2 j = PF2.j(R0, size2);
        this.v = j;
        return j;
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 N(HJ hj) {
        this.q.h(hj);
        X(this.q.q());
        return e().f().d(hj).a();
    }

    @Override // androidx.camera.core.m
    public AbstractC4008Qd2 O(AbstractC4008Qd2 abstractC4008Qd2) {
        C7433k41.a(A, "onSuggestedStreamSpecUpdated: " + abstractC4008Qd2);
        List<Size> R = ((C10176vF2) j()).R(null);
        if (R != null && !R.contains(abstractC4008Qd2.e())) {
            C7433k41.p(A, "suggested resolution " + abstractC4008Qd2.e() + " is not in custom ordered resolutions " + R);
        }
        return abstractC4008Qd2;
    }

    public boolean O0(int i, int i2) {
        Set<Integer> set = AbstractC2824Ed2.d;
        if (!set.contains(Integer.valueOf(i)) && !set.contains(Integer.valueOf(i2)) && i != i2) {
            return true;
        }
        return false;
    }

    public final void P0(C6618gi2 c6618gi2, InterfaceC7402jx interfaceC7402jx, C10176vF2<T> c10176vF2, EnumC5905dp2 enumC5905dp2) {
        if (interfaceC7402jx == g()) {
            this.s = c6618gi2.k(interfaceC7402jx);
            c10176vF2.s0().c(this.s, enumC5905dp2);
            S0();
        }
    }

    public void Q0(String str, C10176vF2<T> c10176vF2, AbstractC4008Qd2 abstractC4008Qd2) {
        w0();
        if (z(str)) {
            T12.b y0 = y0(str, c10176vF2, abstractC4008Qd2);
            this.q = y0;
            u0(y0, this.p, abstractC4008Qd2);
            X(this.q.q());
            F();
        }
    }

    public void T0(InterfaceC9694tG2.a aVar) {
        if (aVar != this.t) {
            this.t = aVar;
            G0().e(aVar);
        }
    }

    @Override // androidx.camera.core.m
    public void U(Rect rect) {
        super.U(rect);
        S0();
    }

    public void U0(int i) {
        if (T(i)) {
            S0();
        }
    }

    public final void V0(final T12.b bVar, boolean z) {
        InterfaceFutureC8411o11<Void> interfaceFutureC8411o11 = this.r;
        if (interfaceFutureC8411o11 != null && interfaceFutureC8411o11.cancel(false)) {
            C7433k41.a(A, "A newer surface update is requested. Previous surface update cancelled.");
        }
        InterfaceFutureC8411o11<Void> a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.mF2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C9204rF2.f0(C9204rF2.this, bVar, aVar);
            }
        });
        this.r = a2;
        C7221jC0.b(a2, new c(a2, z), C5211ay.f());
    }

    public final boolean W0() {
        if (this.p.b() != null) {
            return true;
        }
        return false;
    }

    public boolean a1(AbstractC2824Ed2 abstractC2824Ed2, AbstractC2824Ed2 abstractC2824Ed22) {
        if (this.y && abstractC2824Ed2.b() != null && abstractC2824Ed22.b() == null) {
            return true;
        }
        return false;
    }

    public final void b1(InterfaceC6918hx interfaceC6918hx, InterfaceC6743hD2.a<?, ?, ?> aVar) throws IllegalArgumentException {
        boolean z;
        AbstractC3242Ih1 D0 = D0();
        if (D0 != null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Unable to update target resolution by null MediaSpec.");
        N80 C0 = C0();
        InterfaceC7235jF2 L0 = L0(interfaceC6918hx);
        List<C5548cL1> b2 = L0.b(C0);
        if (b2.isEmpty()) {
            C7433k41.p(A, "Can't find any supported quality on the device.");
            return;
        }
        QG2 d2 = D0.d();
        C6276fL1 e2 = d2.e();
        List<C5548cL1> h = e2.h(b2);
        C7433k41.a(A, "Found selectedQualities " + h + " by " + e2);
        if (!h.isEmpty()) {
            int b3 = d2.b();
            C6033eL1 c6033eL1 = new C6033eL1(interfaceC6918hx.n(m()), C6276fL1.j(L0, C0));
            ArrayList arrayList = new ArrayList();
            for (C5548cL1 c5548cL1 : h) {
                arrayList.addAll(c6033eL1.g(c5548cL1, b3));
            }
            C7433k41.a(A, "Set custom ordered resolutions = " + arrayList);
            aVar.e().h0(InterfaceC6040eN0.u, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o.hD2, o.hD2<?>] */
    @Override // androidx.camera.core.m
    public InterfaceC6743hD2<?> k(boolean z, InterfaceC6986iD2 interfaceC6986iD2) {
        e eVar = C;
        HJ a2 = interfaceC6986iD2.a(eVar.d().g0(), 1);
        if (z) {
            a2 = HJ.J(a2, eVar.d());
        }
        if (a2 == null) {
            return null;
        }
        return x(a2).t();
    }

    public final Rect o0(Rect rect, int i) {
        if (W0()) {
            return C5433bs2.t(C5433bs2.f(((C3051Gi2.h) C10907yF1.l(this.p.b())).a(), i));
        }
        return rect;
    }

    public final Size p0(Size size, Rect rect, Rect rect2) {
        if (W0() && !rect2.equals(rect)) {
            float height = rect2.height() / rect.height();
            return new Size((int) Math.ceil(size.getWidth() * height), (int) Math.ceil(size.getHeight() * height));
        }
        return size;
    }

    public final int q0(int i) {
        if (W0()) {
            return C5433bs2.A(i - this.p.b().c());
        }
        return i;
    }

    public String toString() {
        return "VideoCapture:" + o();
    }

    @Override // androidx.camera.core.m
    public Set<Integer> u() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    public void u0(T12.b bVar, AbstractC2824Ed2 abstractC2824Ed2, AbstractC4008Qd2 abstractC4008Qd2) {
        boolean z;
        boolean z2 = false;
        if (abstractC2824Ed2.a() == -1) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC2824Ed2.c() == AbstractC2824Ed2.a.ACTIVE) {
            z2 = true;
        }
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.r();
        N80 b2 = abstractC4008Qd2.b();
        if (!z) {
            if (z2) {
                bVar.o(this.n, b2);
            } else {
                bVar.j(this.n, b2);
            }
        }
        V0(bVar, z2);
    }

    public final Rect v0(Size size, NF2 nf2) {
        Rect rect;
        if (y() != null) {
            rect = y();
        } else {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        if (nf2 != null && !nf2.d(rect.width(), rect.height())) {
            return n0(rect, size, nf2);
        }
        return rect;
    }

    @Override // androidx.camera.core.m
    public InterfaceC6743hD2.a<?, ?, ?> x(HJ hj) {
        return d.B(hj);
    }

    public final C9800ti2 x0(InterfaceC7402jx interfaceC7402jx, Rect rect, Size size, N80 n80) {
        InterfaceC8822pi2 a2;
        if (l() == null && !Y0(interfaceC7402jx) && !X0(rect, size) && !Z0(interfaceC7402jx) && !W0()) {
            return null;
        }
        C7433k41.a(A, "Surface processing is enabled.");
        InterfaceC7402jx g = g();
        Objects.requireNonNull(g);
        InterfaceC7402jx interfaceC7402jx2 = g;
        if (l() != null) {
            a2 = l().a();
        } else {
            a2 = V00.a.a(n80);
        }
        return new C9800ti2(interfaceC7402jx2, a2);
    }

    public final T12.b y0(final String str, C10176vF2<T> c10176vF2, final AbstractC4008Qd2 abstractC4008Qd2) {
        EnumC5905dp2 r;
        boolean z;
        final C10176vF2<T> c10176vF22;
        final C9204rF2<T> c9204rF2 = this;
        C5901do2.c();
        final InterfaceC7402jx interfaceC7402jx = (InterfaceC7402jx) C10907yF1.l(c9204rF2.g());
        Size e2 = abstractC4008Qd2.e();
        Runnable runnable = new Runnable() { // from class: o.nF2
            @Override // java.lang.Runnable
            public final void run() {
                C9204rF2.this.F();
            }
        };
        Range<Integer> c2 = abstractC4008Qd2.c();
        if (Objects.equals(c2, AbstractC4008Qd2.a)) {
            c2 = e.e;
        }
        Range<Integer> range = c2;
        AbstractC3242Ih1 D0 = c9204rF2.D0();
        Objects.requireNonNull(D0);
        InterfaceC7235jF2 L0 = c9204rF2.L0(interfaceC7402jx.c());
        N80 b2 = abstractC4008Qd2.b();
        NF2 M0 = c9204rF2.M0(c10176vF2.r0(), L0, b2, D0, e2, range);
        c9204rF2.x = c9204rF2.q0(c9204rF2.q(interfaceC7402jx, c9204rF2.B(interfaceC7402jx)));
        Rect v0 = c9204rF2.v0(e2, M0);
        Rect o0 = c9204rF2.o0(v0, c9204rF2.x);
        c9204rF2.w = o0;
        Size p0 = c9204rF2.p0(e2, v0, o0);
        if (c9204rF2.W0()) {
            c9204rF2.y = true;
        }
        C9800ti2 x0 = c9204rF2.x0(interfaceC7402jx, c9204rF2.w, e2, b2);
        c9204rF2.u = x0;
        if (x0 == null && interfaceC7402jx.r()) {
            r = EnumC5905dp2.UPTIME;
        } else {
            r = interfaceC7402jx.n().r();
        }
        final EnumC5905dp2 enumC5905dp2 = r;
        C7433k41.a(A, "camera timebase = " + interfaceC7402jx.n().r() + ", processing timebase = " + enumC5905dp2);
        AbstractC4008Qd2 a2 = abstractC4008Qd2.f().e(p0).c(range).a();
        if (c9204rF2.f847o == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        C6618gi2 c6618gi2 = new C6618gi2(2, 34, a2, c9204rF2.s(), interfaceC7402jx.r(), c9204rF2.w, c9204rF2.x, c9204rF2.d(), c9204rF2.Z0(interfaceC7402jx));
        c9204rF2.f847o = c6618gi2;
        c6618gi2.f(runnable);
        if (c9204rF2.u != null) {
            C9800ti2.d i = C9800ti2.d.i(c9204rF2.f847o);
            final C6618gi2 c6618gi22 = c9204rF2.u.a(C9800ti2.b.c(c9204rF2.f847o, Collections.singletonList(i))).get(i);
            Objects.requireNonNull(c6618gi22);
            c10176vF22 = c10176vF2;
            c9204rF2 = this;
            c6618gi22.f(new Runnable() { // from class: o.oF2
                @Override // java.lang.Runnable
                public final void run() {
                    C9204rF2.this.P0(c6618gi22, interfaceC7402jx, c10176vF22, enumC5905dp2);
                }
            });
            c9204rF2.s = c6618gi22.k(interfaceC7402jx);
            final D10 o2 = c9204rF2.f847o.o();
            c9204rF2.n = o2;
            o2.k().h4(new Runnable() { // from class: o.pF2
                @Override // java.lang.Runnable
                public final void run() {
                    C9204rF2.c0(C9204rF2.this, o2);
                }
            }, C5211ay.f());
        } else {
            c10176vF22 = c10176vF2;
            C3051Gi2 k = c9204rF2.f847o.k(interfaceC7402jx);
            c9204rF2.s = k;
            c9204rF2.n = k.m();
        }
        c10176vF22.s0().c(c9204rF2.s, enumC5905dp2);
        c9204rF2.S0();
        c9204rF2.n.q(MediaCodec.class);
        T12.b s = T12.b.s(c10176vF22, abstractC4008Qd2.e());
        s.w(abstractC4008Qd2.c());
        s.g(new T12.c() { // from class: o.qF2
            @Override // o.T12.c
            public final void a(T12 t12, T12.f fVar) {
                C9204rF2.this.Q0(str, c10176vF22, abstractC4008Qd2);
            }
        });
        if (E) {
            s.z(1);
        }
        if (abstractC4008Qd2.d() != null) {
            s.h(abstractC4008Qd2.d());
        }
        return s;
    }
}
