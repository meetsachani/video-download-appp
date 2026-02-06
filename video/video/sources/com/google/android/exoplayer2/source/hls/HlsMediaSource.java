package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import o.AbstractC10541wl;
import o.C10323vs;
import o.C10415wE;
import o.C11223zZ;
import o.C3031Gd2;
import o.C6361fi0;
import o.C6660gt0;
import o.C6823hZ;
import o.C7307jZ;
import o.C7793lZ;
import o.C8322nf1;
import o.C8781pY;
import o.C9419s82;
import o.C9542sf;
import o.FU;
import o.InterfaceC10877y8;
import o.InterfaceC11300zs1;
import o.InterfaceC4261Sr2;
import o.InterfaceC4410Ug1;
import o.InterfaceC5056aJ2;
import o.InterfaceC6181ey;
import o.InterfaceC7583kh1;
import o.InterfaceC9170r70;
import o.InterfaceC9309rh1;
import o.InterfaceC9552sh1;
import o.InterfaceC9656t70;
import o.M11;
import o.NH0;
import o.OY;
import o.PH0;
import o.QH0;
import o.TD2;
import o.TH0;
import o.UH0;
import o.VH0;
import o.VI;
import o.YH0;
import o.ZH0;

@Deprecated
/* loaded from: classes2.dex */
public final class HlsMediaSource extends AbstractC10541wl implements ZH0.e {
    public static final int s1 = 1;
    public static final int t1 = 3;
    public final PH0 c1;
    public final C8322nf1.h d1;
    public final NH0 e1;
    public final VI f1;
    @InterfaceC11300zs1
    public final C10415wE g1;
    public final InterfaceC9170r70 h1;
    public final M11 i1;
    public final boolean j1;
    public final int k1;
    public final boolean l1;
    public final ZH0 m1;
    public final long n1;
    public final C8322nf1 o1;
    public final long p1;
    public C8322nf1.g q1;
    @InterfaceC11300zs1
    public InterfaceC4261Sr2 r1;

    /* loaded from: classes2.dex */
    public static final class Factory implements InterfaceC9552sh1 {
        public final NH0 c;
        public PH0 d;
        public YH0 e;
        public ZH0.a f;
        public VI g;
        @InterfaceC11300zs1
        public C10415wE.b h;
        public InterfaceC9656t70 i;
        public M11 j;
        public boolean k;
        public int l;
        public boolean m;
        public long n;

        /* renamed from: o  reason: collision with root package name */
        public long f162o;

        public Factory(FU.a aVar) {
            this(new C6823hZ(aVar));
        }

        @Override // o.InterfaceC7583kh1.a
        public int[] b() {
            return new int[]{2};
        }

        @Override // o.InterfaceC7583kh1.a
        /* renamed from: f */
        public HlsMediaSource e(C8322nf1 c8322nf1) {
            C10415wE a;
            C9542sf.g(c8322nf1.Y);
            YH0 yh0 = this.e;
            List<C3031Gd2> list = c8322nf1.Y.Z0;
            if (!list.isEmpty()) {
                yh0 = new C6660gt0(yh0, list);
            }
            C10415wE.b bVar = this.h;
            if (bVar == null) {
                a = null;
            } else {
                a = bVar.a(c8322nf1);
            }
            C10415wE c10415wE = a;
            NH0 nh0 = this.c;
            PH0 ph0 = this.d;
            VI vi = this.g;
            InterfaceC9170r70 a2 = this.i.a(c8322nf1);
            M11 m11 = this.j;
            return new HlsMediaSource(c8322nf1, nh0, ph0, vi, c10415wE, a2, m11, this.f.a(this.c, m11, yh0), this.n, this.k, this.l, this.m, this.f162o);
        }

        @InterfaceC6181ey
        public Factory g(boolean z) {
            this.k = z;
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: h */
        public Factory c(C10415wE.b bVar) {
            this.h = (C10415wE.b) C9542sf.g(bVar);
            return this;
        }

        @InterfaceC6181ey
        public Factory i(VI vi) {
            this.g = (VI) C9542sf.h(vi, "HlsMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: j */
        public Factory d(InterfaceC9656t70 interfaceC9656t70) {
            this.i = (InterfaceC9656t70) C9542sf.h(interfaceC9656t70, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5056aJ2
        public Factory k(long j) {
            this.n = j;
            return this;
        }

        @InterfaceC6181ey
        public Factory l(@InterfaceC11300zs1 PH0 ph0) {
            if (ph0 == null) {
                ph0 = PH0.a;
            }
            this.d = ph0;
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: m */
        public Factory a(M11 m11) {
            this.j = (M11) C9542sf.h(m11, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @InterfaceC6181ey
        public Factory n(int i) {
            this.l = i;
            return this;
        }

        @InterfaceC6181ey
        public Factory o(YH0 yh0) {
            this.e = (YH0) C9542sf.h(yh0, "HlsMediaSource.Factory#setPlaylistParserFactory no longer handles null by instantiating a new DefaultHlsPlaylistParserFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @InterfaceC6181ey
        public Factory p(ZH0.a aVar) {
            this.f = (ZH0.a) C9542sf.h(aVar, "HlsMediaSource.Factory#setPlaylistTrackerFactory no longer handles null by defaulting to DefaultHlsPlaylistTracker.FACTORY. Explicitly pass a reference to this instance in order to retain the old behavior.");
            return this;
        }

        @InterfaceC6181ey
        public Factory q(long j) {
            this.f162o = j;
            return this;
        }

        @InterfaceC6181ey
        public Factory r(boolean z) {
            this.m = z;
            return this;
        }

        public Factory(NH0 nh0) {
            this.c = (NH0) C9542sf.g(nh0);
            this.i = new OY();
            this.e = new C7307jZ();
            this.f = C7793lZ.k1;
            this.d = PH0.a;
            this.j = new C11223zZ();
            this.g = new C8781pY();
            this.l = 1;
            this.n = C10323vs.b;
            this.k = true;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    static {
        C6361fi0.a("goog.exo.hls");
    }

    @InterfaceC11300zs1
    public static UH0.b v0(List<UH0.b> list, long j) {
        UH0.b bVar = null;
        for (int i = 0; i < list.size(); i++) {
            UH0.b bVar2 = list.get(i);
            long j2 = bVar2.Z0;
            if (j2 <= j && bVar2.g1) {
                bVar = bVar2;
            } else if (j2 > j) {
                break;
            }
        }
        return bVar;
    }

    public static UH0.e w0(List<UH0.e> list, long j) {
        return list.get(TD2.k(list, Long.valueOf(j), true, true));
    }

    public static long z0(UH0 uh0, long j) {
        long j2;
        UH0.g gVar = uh0.v;
        long j3 = uh0.e;
        if (j3 != C10323vs.b) {
            j2 = uh0.u - j3;
        } else {
            long j4 = gVar.d;
            if (j4 != C10323vs.b && uh0.n != C10323vs.b) {
                j2 = j4;
            } else {
                long j5 = gVar.c;
                if (j5 != C10323vs.b) {
                    j2 = j5;
                } else {
                    j2 = uh0.m * 3;
                }
            }
        }
        return j2 + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(UH0 uh0, long j) {
        boolean z;
        float f;
        C8322nf1.g gVar = this.o1.Y0;
        if (gVar.Y0 == -3.4028235E38f && gVar.Z0 == -3.4028235E38f) {
            UH0.g gVar2 = uh0.v;
            if (gVar2.c == C10323vs.b && gVar2.d == C10323vs.b) {
                z = true;
                C8322nf1.g.a k = new C8322nf1.g.a().k(TD2.b2(j));
                float f2 = 1.0f;
                if (!z) {
                    f = 1.0f;
                } else {
                    f = this.q1.Y0;
                }
                C8322nf1.g.a j2 = k.j(f);
                if (!z) {
                    f2 = this.q1.Z0;
                }
                this.q1 = j2.h(f2).f();
            }
        }
        z = false;
        C8322nf1.g.a k2 = new C8322nf1.g.a().k(TD2.b2(j));
        float f22 = 1.0f;
        if (!z) {
        }
        C8322nf1.g.a j22 = k2.j(f);
        if (!z) {
        }
        this.q1 = j22.h(f22).f();
    }

    @Override // o.ZH0.e
    public void K(UH0 uh0) {
        long j;
        long j2;
        C9419s82 t0;
        if (uh0.p) {
            j = TD2.b2(uh0.h);
        } else {
            j = -9223372036854775807L;
        }
        int i = uh0.d;
        if (i != 2 && i != 1) {
            j2 = -9223372036854775807L;
        } else {
            j2 = j;
        }
        QH0 qh0 = new QH0((VH0) C9542sf.g(this.m1.d()), uh0);
        if (this.m1.i()) {
            t0 = r0(uh0, j2, j, qh0);
        } else {
            t0 = t0(uh0, j2, j, qh0);
        }
        p0(t0);
    }

    @Override // o.InterfaceC7583kh1
    public void Q() throws IOException {
        this.m1.k();
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        InterfaceC9309rh1.a b0 = b0(bVar);
        return new TH0(this.c1, this.m1, this.e1, this.r1, this.g1, this.h1, Y(bVar), this.i1, b0, interfaceC10877y8, this.f1, this.j1, this.k1, this.l1, i0(), this.p1);
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.o1;
    }

    @Override // o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        this.r1 = interfaceC4261Sr2;
        this.h1.e((Looper) C9542sf.g(Looper.myLooper()), i0());
        this.h1.m0();
        this.m1.h(this.d1.X, b0(null), this);
    }

    @Override // o.AbstractC10541wl
    public void q0() {
        this.m1.stop();
        this.h1.g();
    }

    public final C9419s82 r0(UH0 uh0, long j, long j2, QH0 qh0) {
        long j3;
        long z0;
        boolean z;
        long c = uh0.h - this.m1.c();
        if (uh0.f624o) {
            j3 = c + uh0.u;
        } else {
            j3 = -9223372036854775807L;
        }
        long x0 = x0(uh0);
        long j4 = this.q1.X;
        if (j4 != C10323vs.b) {
            z0 = TD2.j1(j4);
        } else {
            z0 = z0(uh0, x0);
        }
        A0(uh0, TD2.x(z0, x0, uh0.u + x0));
        long y0 = y0(uh0, x0);
        if (uh0.d == 2 && uh0.f) {
            z = true;
        } else {
            z = false;
        }
        return new C9419s82(j, j2, C10323vs.b, j3, uh0.u, c, y0, true, !uh0.f624o, z, qh0, this.o1, this.q1);
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((TH0) interfaceC4410Ug1).C();
    }

    public final C9419s82 t0(UH0 uh0, long j, long j2, QH0 qh0) {
        long j3;
        if (uh0.e != C10323vs.b && !uh0.r.isEmpty()) {
            if (!uh0.g) {
                long j4 = uh0.e;
                if (j4 != uh0.u) {
                    j3 = w0(uh0.r, j4).Z0;
                }
            }
            j3 = uh0.e;
        } else {
            j3 = 0;
        }
        long j5 = j3;
        long j6 = uh0.u;
        return new C9419s82(j, j2, C10323vs.b, j6, j6, 0L, j5, true, false, true, qh0, this.o1, null);
    }

    public final long x0(UH0 uh0) {
        if (uh0.p) {
            return TD2.j1(TD2.t0(this.n1)) - uh0.e();
        }
        return 0L;
    }

    public final long y0(UH0 uh0, long j) {
        long j2 = uh0.e;
        if (j2 == C10323vs.b) {
            j2 = (uh0.u + j) - TD2.j1(this.q1.X);
        }
        if (uh0.g) {
            return j2;
        }
        UH0.b v0 = v0(uh0.s, j2);
        if (v0 != null) {
            return v0.Z0;
        }
        if (uh0.r.isEmpty()) {
            return 0L;
        }
        UH0.e w0 = w0(uh0.r, j2);
        UH0.b v02 = v0(w0.h1, j2);
        if (v02 != null) {
            return v02.Z0;
        }
        return w0.Z0;
    }

    public HlsMediaSource(C8322nf1 c8322nf1, NH0 nh0, PH0 ph0, VI vi, @InterfaceC11300zs1 C10415wE c10415wE, InterfaceC9170r70 interfaceC9170r70, M11 m11, ZH0 zh0, long j, boolean z, int i, boolean z2, long j2) {
        this.d1 = (C8322nf1.h) C9542sf.g(c8322nf1.Y);
        this.o1 = c8322nf1;
        this.q1 = c8322nf1.Y0;
        this.e1 = nh0;
        this.c1 = ph0;
        this.f1 = vi;
        this.g1 = c10415wE;
        this.h1 = interfaceC9170r70;
        this.i1 = m11;
        this.m1 = zh0;
        this.n1 = j;
        this.j1 = z;
        this.k1 = i;
        this.l1 = z2;
        this.p1 = j2;
    }
}
