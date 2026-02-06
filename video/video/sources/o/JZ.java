package o;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.C10415wE;
import o.C10637x82;
import o.C10833xx0;
import o.C10977yY;
import o.C8322nf1;
import o.C8970qJ1;
import o.FU;
import o.InterfaceC11116z7;
import o.InterfaceC7583kh1;
import o.JZ;
import o.KZ1;

@Deprecated
/* loaded from: classes2.dex */
public final class JZ implements InterfaceC9552sh1 {

    /* renamed from: o  reason: collision with root package name */
    public static final String f504o = "DMediaSourceFactory";
    public final b c;
    public FU.a d;
    @InterfaceC11300zs1
    public InterfaceC7583kh1.a e;
    @InterfaceC11300zs1
    public InterfaceC11116z7.b f;
    @InterfaceC11300zs1
    public InterfaceC7929m7 g;
    @InterfaceC11300zs1
    public M11 h;
    public long i;
    public long j;
    public long k;
    public float l;
    public float m;
    public boolean n;

    @Deprecated
    /* loaded from: classes2.dex */
    public interface a extends InterfaceC11116z7.b {
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final InterfaceC4809Yj0 a;
        public final Map<Integer, InterfaceC8331nh2<InterfaceC7583kh1.a>> b = new HashMap();
        public final Set<Integer> c = new HashSet();
        public final Map<Integer, InterfaceC7583kh1.a> d = new HashMap();
        public FU.a e;
        @InterfaceC11300zs1
        public C10415wE.b f;
        @InterfaceC11300zs1
        public InterfaceC9656t70 g;
        @InterfaceC11300zs1
        public M11 h;

        public b(InterfaceC4809Yj0 interfaceC4809Yj0) {
            this.a = interfaceC4809Yj0;
        }

        public static /* synthetic */ InterfaceC7583kh1.a d(b bVar, FU.a aVar) {
            bVar.getClass();
            return new C8970qJ1.b(aVar, bVar.a);
        }

        public final void f() {
            i(0);
            i(1);
            i(2);
            i(3);
            i(4);
        }

        @InterfaceC11300zs1
        public InterfaceC7583kh1.a g(int i) {
            InterfaceC7583kh1.a aVar = this.d.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
            InterfaceC8331nh2<InterfaceC7583kh1.a> i2 = i(i);
            if (i2 == null) {
                return null;
            }
            InterfaceC7583kh1.a aVar2 = i2.get();
            C10415wE.b bVar = this.f;
            if (bVar != null) {
                aVar2.c(bVar);
            }
            InterfaceC9656t70 interfaceC9656t70 = this.g;
            if (interfaceC9656t70 != null) {
                aVar2.d(interfaceC9656t70);
            }
            M11 m11 = this.h;
            if (m11 != null) {
                aVar2.a(m11);
            }
            this.d.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }

        public int[] h() {
            f();
            return C7775lT0.B(this.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
        @InterfaceC11300zs1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC8331nh2<InterfaceC7583kh1.a> i(int i) {
            InterfaceC8331nh2<InterfaceC7583kh1.a> interfaceC8331nh2;
            InterfaceC8331nh2<InterfaceC7583kh1.a> interfaceC8331nh22;
            if (this.b.containsKey(Integer.valueOf(i))) {
                return this.b.get(Integer.valueOf(i));
            }
            final FU.a aVar = (FU.a) C9542sf.g(this.e);
            InterfaceC8331nh2<InterfaceC7583kh1.a> interfaceC8331nh23 = null;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                interfaceC8331nh22 = new InterfaceC8331nh2() { // from class: o.OZ
                                    @Override // o.InterfaceC8331nh2
                                    public final Object get() {
                                        return JZ.b.d(JZ.b.this, aVar);
                                    }
                                };
                            }
                            this.b.put(Integer.valueOf(i), interfaceC8331nh23);
                            if (interfaceC8331nh23 != null) {
                                this.c.add(Integer.valueOf(i));
                            }
                            return interfaceC8331nh23;
                        }
                        final Class<? extends U> asSubclass = Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC7583kh1.a.class);
                        interfaceC8331nh22 = new InterfaceC8331nh2() { // from class: o.NZ
                            @Override // o.InterfaceC8331nh2
                            public final Object get() {
                                InterfaceC7583kh1.a m;
                                m = JZ.m(asSubclass);
                                return m;
                            }
                        };
                        interfaceC8331nh23 = interfaceC8331nh22;
                        this.b.put(Integer.valueOf(i), interfaceC8331nh23);
                        if (interfaceC8331nh23 != null) {
                        }
                        return interfaceC8331nh23;
                    }
                    final Class<? extends U> asSubclass2 = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(InterfaceC7583kh1.a.class);
                    interfaceC8331nh2 = new InterfaceC8331nh2() { // from class: o.MZ
                        @Override // o.InterfaceC8331nh2
                        public final Object get() {
                            InterfaceC7583kh1.a n;
                            n = JZ.n(asSubclass2, aVar);
                            return n;
                        }
                    };
                } else {
                    final Class<? extends U> asSubclass3 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC7583kh1.a.class);
                    interfaceC8331nh2 = new InterfaceC8331nh2() { // from class: o.LZ
                        @Override // o.InterfaceC8331nh2
                        public final Object get() {
                            InterfaceC7583kh1.a n;
                            n = JZ.n(asSubclass3, aVar);
                            return n;
                        }
                    };
                }
            } else {
                final Class<? extends U> asSubclass4 = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(InterfaceC7583kh1.a.class);
                interfaceC8331nh2 = new InterfaceC8331nh2() { // from class: o.KZ
                    @Override // o.InterfaceC8331nh2
                    public final Object get() {
                        InterfaceC7583kh1.a n;
                        n = JZ.n(asSubclass4, aVar);
                        return n;
                    }
                };
            }
            interfaceC8331nh23 = interfaceC8331nh2;
            this.b.put(Integer.valueOf(i), interfaceC8331nh23);
            if (interfaceC8331nh23 != null) {
            }
            return interfaceC8331nh23;
        }

        public void j(C10415wE.b bVar) {
            this.f = bVar;
            for (InterfaceC7583kh1.a aVar : this.d.values()) {
                aVar.c(bVar);
            }
        }

        public void k(FU.a aVar) {
            if (aVar != this.e) {
                this.e = aVar;
                this.b.clear();
                this.d.clear();
            }
        }

        public void l(InterfaceC9656t70 interfaceC9656t70) {
            this.g = interfaceC9656t70;
            for (InterfaceC7583kh1.a aVar : this.d.values()) {
                aVar.d(interfaceC9656t70);
            }
        }

        public void m(M11 m11) {
            this.h = m11;
            for (InterfaceC7583kh1.a aVar : this.d.values()) {
                aVar.a(m11);
            }
        }
    }

    public JZ(Context context) {
        this(new C10977yY.a(context));
    }

    public static /* synthetic */ InterfaceC4324Tj0[] f(C10833xx0 c10833xx0) {
        InterfaceC4324Tj0 cVar;
        InterfaceC4314Tg2 interfaceC4314Tg2 = InterfaceC4314Tg2.a;
        if (interfaceC4314Tg2.a(c10833xx0)) {
            cVar = new C4411Ug2(interfaceC4314Tg2.b(c10833xx0), c10833xx0);
        } else {
            cVar = new c(c10833xx0);
        }
        return new InterfaceC4324Tj0[]{cVar};
    }

    public static InterfaceC7583kh1 k(C8322nf1 c8322nf1, InterfaceC7583kh1 interfaceC7583kh1) {
        C8322nf1.d dVar = c8322nf1.a1;
        if (dVar.X == 0 && dVar.Y == Long.MIN_VALUE && !dVar.Y0) {
            return interfaceC7583kh1;
        }
        long j1 = TD2.j1(c8322nf1.a1.X);
        long j12 = TD2.j1(c8322nf1.a1.Y);
        C8322nf1.d dVar2 = c8322nf1.a1;
        return new KD(interfaceC7583kh1, j1, j12, !dVar2.Z0, dVar2.Z, dVar2.Y0);
    }

    public static InterfaceC7583kh1.a m(Class<? extends InterfaceC7583kh1.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static InterfaceC7583kh1.a n(Class<? extends InterfaceC7583kh1.a> cls, FU.a aVar) {
        try {
            return cls.getConstructor(FU.a.class).newInstance(aVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @InterfaceC6181ey
    public JZ A(@InterfaceC11300zs1 InterfaceC7583kh1.a aVar) {
        this.e = aVar;
        return this;
    }

    @Override // o.InterfaceC7583kh1.a
    public int[] b() {
        return this.c.h();
    }

    @Override // o.InterfaceC7583kh1.a
    public InterfaceC7583kh1 e(C8322nf1 c8322nf1) {
        C9542sf.g(c8322nf1.Y);
        String scheme = c8322nf1.Y.X.getScheme();
        if (scheme != null && scheme.equals(C10323vs.p)) {
            return ((InterfaceC7583kh1.a) C9542sf.g(this.e)).e(c8322nf1);
        }
        C8322nf1.h hVar = c8322nf1.Y;
        int P0 = TD2.P0(hVar.X, hVar.Y);
        InterfaceC7583kh1.a g = this.c.g(P0);
        C9542sf.l(g, "No suitable media source factory found for content type: " + P0);
        C8322nf1.g.a b2 = c8322nf1.Y0.b();
        if (c8322nf1.Y0.X == C10323vs.b) {
            b2.k(this.i);
        }
        if (c8322nf1.Y0.Y0 == -3.4028235E38f) {
            b2.j(this.l);
        }
        if (c8322nf1.Y0.Z0 == -3.4028235E38f) {
            b2.h(this.m);
        }
        if (c8322nf1.Y0.Y == C10323vs.b) {
            b2.i(this.j);
        }
        if (c8322nf1.Y0.Z == C10323vs.b) {
            b2.g(this.k);
        }
        C8322nf1.g f = b2.f();
        if (!f.equals(c8322nf1.Y0)) {
            c8322nf1 = c8322nf1.b().x(f).a();
        }
        InterfaceC7583kh1 e = g.e(c8322nf1);
        AbstractC5317bO0<C8322nf1.k> abstractC5317bO0 = ((C8322nf1.h) TD2.o(c8322nf1.Y)).b1;
        if (!abstractC5317bO0.isEmpty()) {
            InterfaceC7583kh1[] interfaceC7583kh1Arr = new InterfaceC7583kh1[abstractC5317bO0.size() + 1];
            interfaceC7583kh1Arr[0] = e;
            for (int i = 0; i < abstractC5317bO0.size(); i++) {
                if (this.n) {
                    final C10833xx0 G = new C10833xx0.b().g0(abstractC5317bO0.get(i).Y).X(abstractC5317bO0.get(i).Z).i0(abstractC5317bO0.get(i).Y0).e0(abstractC5317bO0.get(i).Z0).W(abstractC5317bO0.get(i).a1).U(abstractC5317bO0.get(i).b1).G();
                    C8970qJ1.b bVar = new C8970qJ1.b(this.d, new InterfaceC4809Yj0() { // from class: o.IZ
                        @Override // o.InterfaceC4809Yj0
                        public final InterfaceC4324Tj0[] b() {
                            return JZ.f(C10833xx0.this);
                        }
                    });
                    M11 m11 = this.h;
                    if (m11 != null) {
                        bVar.a(m11);
                    }
                    interfaceC7583kh1Arr[i + 1] = bVar.e(C8322nf1.f(abstractC5317bO0.get(i).X.toString()));
                } else {
                    C10637x82.b bVar2 = new C10637x82.b(this.d);
                    M11 m112 = this.h;
                    if (m112 != null) {
                        bVar2.b(m112);
                    }
                    interfaceC7583kh1Arr[i + 1] = bVar2.a(abstractC5317bO0.get(i), C10323vs.b);
                }
            }
            e = new C2549Bi1(interfaceC7583kh1Arr);
        }
        return l(c8322nf1, k(c8322nf1, e));
    }

    @InterfaceC6181ey
    public JZ i() {
        this.f = null;
        this.g = null;
        return this;
    }

    @InterfaceC6181ey
    public JZ j(boolean z) {
        this.n = z;
        return this;
    }

    public final InterfaceC7583kh1 l(C8322nf1 c8322nf1, InterfaceC7583kh1 interfaceC7583kh1) {
        C9542sf.g(c8322nf1.Y);
        C8322nf1.b bVar = c8322nf1.Y.Y0;
        if (bVar == null) {
            return interfaceC7583kh1;
        }
        InterfaceC11116z7.b bVar2 = this.f;
        InterfaceC7929m7 interfaceC7929m7 = this.g;
        if (bVar2 != null && interfaceC7929m7 != null) {
            InterfaceC11116z7 a2 = bVar2.a(bVar);
            if (a2 == null) {
                I31.n(f504o, "Playing media without ads, as no AdsLoader was provided.");
                return interfaceC7583kh1;
            }
            OU ou = new OU(bVar.X);
            Object obj = bVar.Y;
            if (obj == null) {
                obj = AbstractC5317bO0.U(c8322nf1.X, c8322nf1.Y.X, bVar.X);
            }
            return new C7(interfaceC7583kh1, ou, obj, this, a2, interfaceC7929m7);
        }
        I31.n(f504o, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return interfaceC7583kh1;
    }

    @InterfaceC6181ey
    @Deprecated
    public JZ o(@InterfaceC11300zs1 InterfaceC7929m7 interfaceC7929m7) {
        this.g = interfaceC7929m7;
        return this;
    }

    @InterfaceC6181ey
    @Deprecated
    public JZ p(@InterfaceC11300zs1 InterfaceC11116z7.b bVar) {
        this.f = bVar;
        return this;
    }

    @Override // o.InterfaceC7583kh1.a
    @InterfaceC6181ey
    /* renamed from: q */
    public JZ c(C10415wE.b bVar) {
        this.c.j((C10415wE.b) C9542sf.g(bVar));
        return this;
    }

    @InterfaceC6181ey
    public JZ r(FU.a aVar) {
        this.d = aVar;
        this.c.k(aVar);
        return this;
    }

    @Override // o.InterfaceC7583kh1.a
    @InterfaceC6181ey
    /* renamed from: s */
    public JZ d(InterfaceC9656t70 interfaceC9656t70) {
        this.c.l((InterfaceC9656t70) C9542sf.h(interfaceC9656t70, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @InterfaceC6181ey
    public JZ t(long j) {
        this.k = j;
        return this;
    }

    @InterfaceC6181ey
    public JZ u(float f) {
        this.m = f;
        return this;
    }

    @InterfaceC6181ey
    public JZ v(long j) {
        this.j = j;
        return this;
    }

    @InterfaceC6181ey
    public JZ w(float f) {
        this.l = f;
        return this;
    }

    @InterfaceC6181ey
    public JZ x(long j) {
        this.i = j;
        return this;
    }

    @Override // o.InterfaceC7583kh1.a
    @InterfaceC6181ey
    /* renamed from: y */
    public JZ a(M11 m11) {
        this.h = (M11) C9542sf.h(m11, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c.m(m11);
        return this;
    }

    @InterfaceC6181ey
    public JZ z(InterfaceC11116z7.b bVar, InterfaceC7929m7 interfaceC7929m7) {
        this.f = (InterfaceC11116z7.b) C9542sf.g(bVar);
        this.g = (InterfaceC7929m7) C9542sf.g(interfaceC7929m7);
        return this;
    }

    public JZ(Context context, InterfaceC4809Yj0 interfaceC4809Yj0) {
        this(new C10977yY.a(context), interfaceC4809Yj0);
    }

    public JZ(FU.a aVar) {
        this(aVar, new ZY());
    }

    public JZ(FU.a aVar, InterfaceC4809Yj0 interfaceC4809Yj0) {
        this.d = aVar;
        b bVar = new b(interfaceC4809Yj0);
        this.c = bVar;
        bVar.k(aVar);
        this.i = C10323vs.b;
        this.j = C10323vs.b;
        this.k = C10323vs.b;
        this.l = -3.4028235E38f;
        this.m = -3.4028235E38f;
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC4324Tj0 {
        public final C10833xx0 d;

        public c(C10833xx0 c10833xx0) {
            this.d = c10833xx0;
        }

        @Override // o.InterfaceC4324Tj0
        public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
            InterfaceC10568wr2 b = interfaceC4518Vj0.b(0, 3);
            interfaceC4518Vj0.p(new KZ1.b(C10323vs.b));
            interfaceC4518Vj0.n();
            b.a(this.d.b().g0(C4128Rj1.p0).K(this.d.g1).G());
        }

        @Override // o.InterfaceC4324Tj0
        public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) {
            return true;
        }

        @Override // o.InterfaceC4324Tj0
        public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
            if (interfaceC4421Uj0.c(Integer.MAX_VALUE) == -1) {
                return -1;
            }
            return 0;
        }

        @Override // o.InterfaceC4324Tj0
        public void g() {
        }

        @Override // o.InterfaceC4324Tj0
        public void a(long j, long j2) {
        }
    }
}
