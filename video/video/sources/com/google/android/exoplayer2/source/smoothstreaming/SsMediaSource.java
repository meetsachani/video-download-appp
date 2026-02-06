package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC10541wl;
import o.AbstractC5317bO0;
import o.C10323vs;
import o.C10415wE;
import o.C10519wf1;
import o.C11223zZ;
import o.C3031Gd2;
import o.C4086Qy1;
import o.C4128Rj1;
import o.C6361fi0;
import o.C6903ht0;
import o.C8322nf1;
import o.C8781pY;
import o.C9286rb2;
import o.C9419s82;
import o.C9529sb2;
import o.C9542sf;
import o.FU;
import o.InterfaceC10877y8;
import o.InterfaceC11300zs1;
import o.InterfaceC4261Sr2;
import o.InterfaceC4410Ug1;
import o.InterfaceC6181ey;
import o.InterfaceC7583kh1;
import o.InterfaceC9170r70;
import o.InterfaceC9309rh1;
import o.InterfaceC9552sh1;
import o.InterfaceC9656t70;
import o.M11;
import o.N11;
import o.OY;
import o.R11;
import o.T11;
import o.TD2;
import o.VI;

@Deprecated
/* loaded from: classes2.dex */
public final class SsMediaSource extends AbstractC10541wl implements R11.b<C4086Qy1<C9286rb2>> {
    public static final long x1 = 30000;
    public static final int y1 = 5000;
    public static final long z1 = 5000000;
    public final boolean c1;
    public final Uri d1;
    public final C8322nf1.h e1;
    public final C8322nf1 f1;
    public final FU.a g1;
    public final b.a h1;
    public final VI i1;
    @InterfaceC11300zs1
    public final C10415wE j1;
    public final InterfaceC9170r70 k1;
    public final M11 l1;
    public final long m1;
    public final InterfaceC9309rh1.a n1;
    public final C4086Qy1.a<? extends C9286rb2> o1;
    public final ArrayList<c> p1;
    public FU q1;
    public R11 r1;
    public T11 s1;
    @InterfaceC11300zs1
    public InterfaceC4261Sr2 t1;
    public long u1;
    public C9286rb2 v1;
    public Handler w1;

    /* loaded from: classes2.dex */
    public static final class Factory implements InterfaceC9552sh1 {
        public final b.a c;
        @InterfaceC11300zs1
        public final FU.a d;
        public VI e;
        @InterfaceC11300zs1
        public C10415wE.b f;
        public InterfaceC9656t70 g;
        public M11 h;
        public long i;
        @InterfaceC11300zs1
        public C4086Qy1.a<? extends C9286rb2> j;

        public Factory(FU.a aVar) {
            this(new a.C0099a(aVar), aVar);
        }

        @Override // o.InterfaceC7583kh1.a
        public int[] b() {
            return new int[]{1};
        }

        @Override // o.InterfaceC7583kh1.a
        /* renamed from: f */
        public SsMediaSource e(C8322nf1 c8322nf1) {
            C6903ht0 c6903ht0;
            C10415wE a;
            C9542sf.g(c8322nf1.Y);
            C4086Qy1.a aVar = this.j;
            if (aVar == null) {
                aVar = new C9529sb2();
            }
            List<C3031Gd2> list = c8322nf1.Y.Z0;
            if (!list.isEmpty()) {
                c6903ht0 = new C6903ht0(aVar, list);
            } else {
                c6903ht0 = aVar;
            }
            C10415wE.b bVar = this.f;
            if (bVar == null) {
                a = null;
            } else {
                a = bVar.a(c8322nf1);
            }
            return new SsMediaSource(c8322nf1, null, this.d, c6903ht0, this.c, this.e, a, this.g.a(c8322nf1), this.h, this.i);
        }

        public SsMediaSource g(C9286rb2 c9286rb2) {
            return h(c9286rb2, C8322nf1.d(Uri.EMPTY));
        }

        public SsMediaSource h(C9286rb2 c9286rb2, C8322nf1 c8322nf1) {
            List<C3031Gd2> L;
            Uri uri;
            C10415wE a;
            C9286rb2 c9286rb22 = c9286rb2;
            boolean z = true;
            C9542sf.a(!c9286rb22.d);
            C8322nf1.h hVar = c8322nf1.Y;
            if (hVar != null) {
                L = hVar.Z0;
            } else {
                L = AbstractC5317bO0.L();
            }
            if (!L.isEmpty()) {
                c9286rb22 = c9286rb22.a(L);
            }
            C9286rb2 c9286rb23 = c9286rb22;
            if (c8322nf1.Y == null) {
                z = false;
            }
            C8322nf1.c F = c8322nf1.b().F(C4128Rj1.v0);
            if (z) {
                uri = c8322nf1.Y.X;
            } else {
                uri = Uri.EMPTY;
            }
            C8322nf1 a2 = F.L(uri).a();
            C10415wE.b bVar = this.f;
            if (bVar == null) {
                a = null;
            } else {
                a = bVar.a(a2);
            }
            return new SsMediaSource(a2, c9286rb23, null, null, this.c, this.e, a, this.g.a(a2), this.h, this.i);
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: i */
        public Factory c(C10415wE.b bVar) {
            this.f = (C10415wE.b) C9542sf.g(bVar);
            return this;
        }

        @InterfaceC6181ey
        public Factory j(VI vi) {
            this.e = (VI) C9542sf.h(vi, "SsMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: k */
        public Factory d(InterfaceC9656t70 interfaceC9656t70) {
            this.g = (InterfaceC9656t70) C9542sf.h(interfaceC9656t70, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @InterfaceC6181ey
        public Factory l(long j) {
            this.i = j;
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        @InterfaceC6181ey
        /* renamed from: m */
        public Factory a(M11 m11) {
            this.h = (M11) C9542sf.h(m11, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @InterfaceC6181ey
        public Factory n(@InterfaceC11300zs1 C4086Qy1.a<? extends C9286rb2> aVar) {
            this.j = aVar;
            return this;
        }

        public Factory(b.a aVar, @InterfaceC11300zs1 FU.a aVar2) {
            this.c = (b.a) C9542sf.g(aVar);
            this.d = aVar2;
            this.g = new OY();
            this.h = new C11223zZ();
            this.i = 30000L;
            this.e = new C8781pY();
        }
    }

    static {
        C6361fi0.a("goog.exo.smoothstreaming");
    }

    @Override // o.InterfaceC7583kh1
    public void Q() throws IOException {
        this.s1.b();
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        InterfaceC9309rh1.a b0 = b0(bVar);
        c cVar = new c(this.v1, this.h1, this.t1, this.i1, this.j1, this.k1, Y(bVar), this.l1, b0, this.s1, interfaceC10877y8);
        this.p1.add(cVar);
        return cVar;
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.f1;
    }

    @Override // o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        this.t1 = interfaceC4261Sr2;
        this.k1.e(Looper.myLooper(), i0());
        this.k1.m0();
        if (this.c1) {
            this.s1 = new T11.a();
            x0();
            return;
        }
        this.q1 = this.g1.a();
        R11 r11 = new R11("SsMediaSource");
        this.r1 = r11;
        this.s1 = r11;
        this.w1 = TD2.C();
        z0();
    }

    @Override // o.AbstractC10541wl
    public void q0() {
        C9286rb2 c9286rb2;
        if (this.c1) {
            c9286rb2 = this.v1;
        } else {
            c9286rb2 = null;
        }
        this.v1 = c9286rb2;
        this.q1 = null;
        this.u1 = 0L;
        R11 r11 = this.r1;
        if (r11 != null) {
            r11.l();
            this.r1 = null;
        }
        Handler handler = this.w1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.w1 = null;
        }
        this.k1.g();
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((c) interfaceC4410Ug1).v();
        this.p1.remove(interfaceC4410Ug1);
    }

    @Override // o.R11.b
    /* renamed from: t0 */
    public void M(C4086Qy1<C9286rb2> c4086Qy1, long j, long j2, boolean z) {
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        this.l1.c(c4086Qy1.a);
        this.n1.j(n11, c4086Qy1.c);
    }

    @Override // o.R11.b
    /* renamed from: v0 */
    public void t(C4086Qy1<C9286rb2> c4086Qy1, long j, long j2) {
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        this.l1.c(c4086Qy1.a);
        this.n1.m(n11, c4086Qy1.c);
        this.v1 = c4086Qy1.e();
        this.u1 = j - j2;
        x0();
        y0();
    }

    @Override // o.R11.b
    /* renamed from: w0 */
    public R11.c N(C4086Qy1<C9286rb2> c4086Qy1, long j, long j2, IOException iOException, int i) {
        R11.c i2;
        N11 n11 = new N11(c4086Qy1.a, c4086Qy1.b, c4086Qy1.f(), c4086Qy1.d(), j, j2, c4086Qy1.b());
        long d = this.l1.d(new M11.d(n11, new C10519wf1(c4086Qy1.c), iOException, i));
        if (d == C10323vs.b) {
            i2 = R11.l;
        } else {
            i2 = R11.i(false, d);
        }
        boolean c = i2.c();
        this.n1.q(n11, c4086Qy1.c, iOException, !c);
        if (!c) {
            this.l1.c(c4086Qy1.a);
        }
        return i2;
    }

    public final void x0() {
        C9286rb2.b[] bVarArr;
        C9419s82 c9419s82;
        long j;
        for (int i = 0; i < this.p1.size(); i++) {
            this.p1.get(i).w(this.v1);
        }
        long j2 = Long.MIN_VALUE;
        long j3 = Long.MAX_VALUE;
        for (C9286rb2.b bVar : this.v1.f) {
            if (bVar.k > 0) {
                j3 = Math.min(j3, bVar.e(0));
                j2 = Math.max(j2, bVar.e(bVar.k - 1) + bVar.c(bVar.k - 1));
            }
        }
        if (j3 == Long.MAX_VALUE) {
            if (this.v1.d) {
                j = -9223372036854775807L;
            } else {
                j = 0;
            }
            C9286rb2 c9286rb2 = this.v1;
            boolean z = c9286rb2.d;
            c9419s82 = new C9419s82(j, 0L, 0L, 0L, true, z, z, (Object) c9286rb2, this.f1);
        } else {
            C9286rb2 c9286rb22 = this.v1;
            if (c9286rb22.d) {
                long j4 = c9286rb22.h;
                if (j4 != C10323vs.b && j4 > 0) {
                    j3 = Math.max(j3, j2 - j4);
                }
                long j5 = j3;
                long j6 = j2 - j5;
                long j1 = j6 - TD2.j1(this.m1);
                if (j1 < 5000000) {
                    j1 = Math.min(5000000L, j6 / 2);
                }
                c9419s82 = new C9419s82((long) C10323vs.b, j6, j5, j1, true, true, true, (Object) this.v1, this.f1);
            } else {
                long j7 = c9286rb22.g;
                if (j7 == C10323vs.b) {
                    j7 = j2 - j3;
                }
                long j8 = j7;
                c9419s82 = new C9419s82(j3 + j8, j8, j3, 0L, true, false, false, (Object) this.v1, this.f1);
            }
        }
        p0(c9419s82);
    }

    public final void y0() {
        if (!this.v1.d) {
            return;
        }
        this.w1.postDelayed(new Runnable() { // from class: o.tb2
            @Override // java.lang.Runnable
            public final void run() {
                SsMediaSource.this.z0();
            }
        }, Math.max(0L, (this.u1 + 5000) - SystemClock.elapsedRealtime()));
    }

    public final void z0() {
        if (this.r1.j()) {
            return;
        }
        C4086Qy1 c4086Qy1 = new C4086Qy1(this.q1, this.d1, 4, this.o1);
        this.n1.s(new N11(c4086Qy1.a, c4086Qy1.b, this.r1.n(c4086Qy1, this, this.l1.a(c4086Qy1.c))), c4086Qy1.c);
    }

    public SsMediaSource(C8322nf1 c8322nf1, @InterfaceC11300zs1 C9286rb2 c9286rb2, @InterfaceC11300zs1 FU.a aVar, @InterfaceC11300zs1 C4086Qy1.a<? extends C9286rb2> aVar2, b.a aVar3, VI vi, @InterfaceC11300zs1 C10415wE c10415wE, InterfaceC9170r70 interfaceC9170r70, M11 m11, long j) {
        C9542sf.i(c9286rb2 == null || !c9286rb2.d);
        this.f1 = c8322nf1;
        C8322nf1.h hVar = (C8322nf1.h) C9542sf.g(c8322nf1.Y);
        this.e1 = hVar;
        this.v1 = c9286rb2;
        this.d1 = hVar.X.equals(Uri.EMPTY) ? null : TD2.L(hVar.X);
        this.g1 = aVar;
        this.o1 = aVar2;
        this.h1 = aVar3;
        this.i1 = vi;
        this.j1 = c10415wE;
        this.k1 = interfaceC9170r70;
        this.l1 = m11;
        this.m1 = j;
        this.n1 = b0(null);
        this.c1 = c9286rb2 != null;
        this.p1 = new ArrayList<>();
    }
}
