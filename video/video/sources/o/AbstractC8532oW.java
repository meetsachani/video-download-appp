package o;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import o.C5594cY;
import o.InterfaceC8085mh;
import o.InterfaceC8288nW;
import o.InterfaceC9058qh;

@Deprecated
/* renamed from: o.oW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8532oW<T extends InterfaceC8288nW<C9267rW, ? extends O72, ? extends C9018qW>> extends AbstractC2853El implements InterfaceC2729De1 {
    public static final String J1 = "DecoderAudioRenderer";
    public static final int K1 = 0;
    public static final int L1 = 1;
    public static final int M1 = 2;
    public static final int N1 = 10;
    public boolean A1;
    public long B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public long G1;
    public final long[] H1;
    public int I1;
    public final InterfaceC8085mh.a k1;
    public final InterfaceC9058qh l1;
    public final C9267rW m1;
    public C8775pW n1;
    public C10833xx0 o1;
    public int p1;
    public int q1;
    public boolean r1;
    public boolean s1;
    @InterfaceC11300zs1
    public T t1;
    @InterfaceC11300zs1
    public C9267rW u1;
    @InterfaceC11300zs1
    public O72 v1;
    @InterfaceC11300zs1
    public InterfaceC7201j70 w1;
    @InterfaceC11300zs1
    public InterfaceC7201j70 x1;
    public int y1;
    public boolean z1;

    @ES1(23)
    /* renamed from: o.oW$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @K40
        public static void a(InterfaceC9058qh interfaceC9058qh, @InterfaceC11300zs1 Object obj) {
            interfaceC9058qh.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* renamed from: o.oW$c */
    /* loaded from: classes2.dex */
    public final class c implements InterfaceC9058qh.c {
        public c() {
        }

        @Override // o.InterfaceC9058qh.c
        public void a(boolean z) {
            AbstractC8532oW.this.k1.s(z);
        }

        @Override // o.InterfaceC9058qh.c
        public void b(Exception exc) {
            I31.e(AbstractC8532oW.J1, "Audio sink error", exc);
            AbstractC8532oW.this.k1.l(exc);
        }

        @Override // o.InterfaceC9058qh.c
        public void c(long j) {
            AbstractC8532oW.this.k1.r(j);
        }

        @Override // o.InterfaceC9058qh.c
        public void e(int i, long j, long j2) {
            AbstractC8532oW.this.k1.t(i, j, j2);
        }

        @Override // o.InterfaceC9058qh.c
        public void g() {
            AbstractC8532oW.this.o0();
        }
    }

    public AbstractC8532oW() {
        this((Handler) null, (InterfaceC8085mh) null, new InterfaceC5143ah[0]);
    }

    private void j0() throws C3824Og0 {
        if (this.y1 != 0) {
            s0();
            m0();
            return;
        }
        this.u1 = null;
        O72 o72 = this.v1;
        if (o72 != null) {
            o72.v();
            this.v1 = null;
        }
        this.t1.flush();
        this.z1 = false;
    }

    private void n0(C2899Ex0 c2899Ex0) throws C3824Og0 {
        C9996uW e0;
        C10833xx0 c10833xx0 = (C10833xx0) C9542sf.g(c2899Ex0.b);
        v0(c2899Ex0.a);
        C10833xx0 c10833xx02 = this.o1;
        this.o1 = c10833xx0;
        this.p1 = c10833xx0.w1;
        this.q1 = c10833xx0.x1;
        T t = this.t1;
        if (t == null) {
            m0();
            this.k1.q(this.o1, null);
            return;
        }
        if (this.x1 != this.w1) {
            e0 = new C9996uW(t.getName(), c10833xx02, c10833xx0, 0, 128);
        } else {
            e0 = e0(t.getName(), c10833xx02, c10833xx0);
        }
        if (e0.d == 0) {
            if (this.z1) {
                this.y1 = 1;
            } else {
                s0();
                m0();
                this.A1 = true;
            }
        }
        this.k1.q(this.o1, e0);
    }

    private void s0() {
        this.u1 = null;
        this.v1 = null;
        this.y1 = 0;
        this.z1 = false;
        T t = this.t1;
        if (t != null) {
            this.n1.b++;
            t.g();
            this.k1.n(this.t1.getName());
            this.t1 = null;
        }
        t0(null);
    }

    @Override // o.InterfaceC10469wR1
    public void D(long j, long j2) throws C3824Og0 {
        if (this.F1) {
            try {
                this.l1.t();
                return;
            } catch (InterfaceC9058qh.f e) {
                throw J(e, e.Z, e.Y, AD1.v1);
            }
        }
        if (this.o1 == null) {
            C2899Ex0 L = L();
            this.m1.l();
            int a0 = a0(L, this.m1, 2);
            if (a0 == -5) {
                n0(L);
            } else if (a0 == -4) {
                C9542sf.i(this.m1.q());
                this.E1 = true;
                try {
                    q0();
                    return;
                } catch (InterfaceC9058qh.f e2) {
                    throw I(e2, null, AD1.v1);
                }
            } else {
                return;
            }
        }
        m0();
        if (this.t1 != null) {
            try {
                C7624kr2.a("drainAndFeed");
                while (g0()) {
                }
                while (i0()) {
                }
                C7624kr2.c();
                this.n1.c();
            } catch (C9018qW e3) {
                I31.e(J1, "Audio codec error", e3);
                this.k1.k(e3);
                throw I(e3, this.o1, AD1.r1);
            } catch (InterfaceC9058qh.a e4) {
                throw I(e4, e4.X, AD1.u1);
            } catch (InterfaceC9058qh.b e5) {
                throw J(e5, e5.Z, e5.Y, AD1.u1);
            } catch (InterfaceC9058qh.f e6) {
                throw J(e6, e6.Z, e6.Y, AD1.v1);
            }
        }
    }

    @Override // o.AbstractC2853El
    public void R() {
        this.o1 = null;
        this.A1 = true;
        u0(C10323vs.b);
        try {
            v0(null);
            s0();
            this.l1.reset();
        } finally {
            this.k1.o(this.n1);
        }
    }

    @Override // o.AbstractC2853El
    public void S(boolean z, boolean z2) throws C3824Og0 {
        C8775pW c8775pW = new C8775pW();
        this.n1 = c8775pW;
        this.k1.p(c8775pW);
        if (K().a) {
            this.l1.y();
        } else {
            this.l1.o();
        }
        this.l1.l(O());
    }

    @Override // o.AbstractC2853El
    public void T(long j, boolean z) throws C3824Og0 {
        if (this.r1) {
            this.l1.r();
        } else {
            this.l1.flush();
        }
        this.B1 = j;
        this.C1 = true;
        this.D1 = true;
        this.E1 = false;
        this.F1 = false;
        if (this.t1 != null) {
            j0();
        }
    }

    @Override // o.AbstractC2853El
    public void X() {
        this.l1.t0();
    }

    @Override // o.AbstractC2853El
    public void Y() {
        y0();
        this.l1.pause();
    }

    @Override // o.AbstractC2853El
    public void Z(C10833xx0[] c10833xx0Arr, long j, long j2) throws C3824Og0 {
        super.Z(c10833xx0Arr, j, j2);
        this.s1 = false;
        if (this.G1 == C10323vs.b) {
            u0(j2);
            return;
        }
        int i = this.I1;
        if (i == this.H1.length) {
            I31.n(J1, "Too many stream changes, so dropping offset: " + this.H1[this.I1 - 1]);
        } else {
            this.I1 = i + 1;
        }
        this.H1[this.I1 - 1] = j2;
    }

    @Override // o.InterfaceC10712xR1
    public final int a(C10833xx0 c10833xx0) {
        int i = 0;
        if (!C4128Rj1.p(c10833xx0.g1)) {
            return InterfaceC10712xR1.r(0);
        }
        int x0 = x0(c10833xx0);
        if (x0 <= 2) {
            return InterfaceC10712xR1.r(x0);
        }
        if (TD2.a >= 21) {
            i = 32;
        }
        return InterfaceC10712xR1.y(x0, 8, i);
    }

    @Override // o.InterfaceC10469wR1
    public boolean c() {
        if (this.F1 && this.l1.c()) {
            return true;
        }
        return false;
    }

    @InterfaceC6919hx0
    public C9996uW e0(String str, C10833xx0 c10833xx0, C10833xx0 c10833xx02) {
        return new C9996uW(str, c10833xx0, c10833xx02, 0, 1);
    }

    @Override // o.InterfaceC2729De1
    public void f(DD1 dd1) {
        this.l1.f(dd1);
    }

    @InterfaceC6919hx0
    public abstract T f0(C10833xx0 c10833xx0, @InterfaceC11300zs1 InterfaceC7280jR interfaceC7280jR) throws C9018qW;

    public final boolean g0() throws C3824Og0, C9018qW, InterfaceC9058qh.a, InterfaceC9058qh.b, InterfaceC9058qh.f {
        if (this.v1 == null) {
            O72 o72 = (O72) this.t1.b();
            this.v1 = o72;
            if (o72 == null) {
                return false;
            }
            int i = o72.Z;
            if (i > 0) {
                this.n1.f += i;
                this.l1.x();
            }
            if (this.v1.r()) {
                r0();
            }
        }
        if (this.v1.q()) {
            if (this.y1 == 2) {
                s0();
                m0();
                this.A1 = true;
            } else {
                this.v1.v();
                this.v1 = null;
                try {
                    q0();
                } catch (InterfaceC9058qh.f e) {
                    throw J(e, e.Z, e.Y, AD1.v1);
                }
            }
            return false;
        }
        if (this.A1) {
            this.l1.u(k0(this.t1).b().P(this.p1).Q(this.q1).G(), 0, null);
            this.A1 = false;
        }
        InterfaceC9058qh interfaceC9058qh = this.l1;
        O72 o722 = this.v1;
        if (!interfaceC9058qh.q(o722.Z0, o722.Y, 1)) {
            return false;
        }
        this.n1.e++;
        this.v1.v();
        this.v1 = null;
        return true;
    }

    @Override // o.InterfaceC2729De1
    public DD1 h() {
        return this.l1.h();
    }

    public void h0(boolean z) {
        this.r1 = z;
    }

    public final boolean i0() throws C9018qW, C3824Og0 {
        T t = this.t1;
        if (t == null || this.y1 == 2 || this.E1) {
            return false;
        }
        if (this.u1 == null) {
            C9267rW c9267rW = (C9267rW) t.d();
            this.u1 = c9267rW;
            if (c9267rW == null) {
                return false;
            }
        }
        if (this.y1 == 1) {
            this.u1.u(4);
            this.t1.c(this.u1);
            this.u1 = null;
            this.y1 = 2;
            return false;
        }
        C2899Ex0 L = L();
        int a0 = a0(L, this.u1, 0);
        if (a0 != -5) {
            if (a0 != -4) {
                if (a0 == -3) {
                    return false;
                }
                throw new IllegalStateException();
            } else if (this.u1.q()) {
                this.E1 = true;
                this.t1.c(this.u1);
                this.u1 = null;
                return false;
            } else {
                if (!this.s1) {
                    this.s1 = true;
                    this.u1.j(C10323vs.Q0);
                }
                this.u1.x();
                C9267rW c9267rW2 = this.u1;
                c9267rW2.Y = this.o1;
                p0(c9267rW2);
                this.t1.c(this.u1);
                this.z1 = true;
                this.n1.c++;
                this.u1 = null;
                return true;
            }
        }
        n0(L);
        return true;
    }

    @Override // o.InterfaceC10469wR1
    public boolean isReady() {
        if (!this.l1.m()) {
            if (this.o1 != null) {
                if (!Q() && this.v1 == null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @InterfaceC6919hx0
    public abstract C10833xx0 k0(T t);

    public final int l0(C10833xx0 c10833xx0) {
        return this.l1.s(c10833xx0);
    }

    public final void m0() throws C3824Og0 {
        InterfaceC7280jR interfaceC7280jR;
        if (this.t1 == null) {
            t0(this.x1);
            InterfaceC7201j70 interfaceC7201j70 = this.w1;
            if (interfaceC7201j70 != null) {
                interfaceC7280jR = interfaceC7201j70.d();
                if (interfaceC7280jR == null && this.w1.i() == null) {
                    return;
                }
            } else {
                interfaceC7280jR = null;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C7624kr2.a("createAudioDecoder");
                this.t1 = f0(this.o1, interfaceC7280jR);
                C7624kr2.c();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.k1.m(this.t1.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.n1.a++;
            } catch (OutOfMemoryError e) {
                throw I(e, this.o1, AD1.p1);
            } catch (C9018qW e2) {
                I31.e(J1, "Audio codec error", e2);
                this.k1.k(e2);
                throw I(e2, this.o1, AD1.p1);
            }
        }
    }

    @InterfaceC6919hx0
    @InterfaceC2591Bt
    public void o0() {
        this.D1 = true;
    }

    public void p0(C9267rW c9267rW) {
        if (this.C1 && !c9267rW.p()) {
            if (Math.abs(c9267rW.a1 - this.B1) > C6118ei0.r2) {
                this.B1 = c9267rW.a1;
            }
            this.C1 = false;
        }
    }

    public final void q0() throws InterfaceC9058qh.f {
        this.F1 = true;
        this.l1.t();
    }

    public final void r0() {
        this.l1.x();
        if (this.I1 != 0) {
            u0(this.H1[0]);
            int i = this.I1 - 1;
            this.I1 = i;
            long[] jArr = this.H1;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    @Override // o.AbstractC2853El, o.OD1.b
    public void t(int i, @InterfaceC11300zs1 Object obj) throws C3824Og0 {
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 12) {
                        if (i != 9) {
                            if (i != 10) {
                                super.t(i, obj);
                                return;
                            } else {
                                this.l1.d(((Integer) obj).intValue());
                                return;
                            }
                        }
                        this.l1.k(((Boolean) obj).booleanValue());
                        return;
                    } else if (TD2.a >= 23) {
                        b.a(this.l1, obj);
                        return;
                    } else {
                        return;
                    }
                }
                this.l1.i((C3737Nj) obj);
                return;
            }
            this.l1.n((C9546sg) obj);
            return;
        }
        this.l1.setVolume(((Float) obj).floatValue());
    }

    public final void t0(@InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j70) {
        InterfaceC7201j70.e(this.w1, interfaceC7201j70);
        this.w1 = interfaceC7201j70;
    }

    public final void u0(long j) {
        this.G1 = j;
        if (j != C10323vs.b) {
            this.l1.w(j);
        }
    }

    public final void v0(@InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j70) {
        InterfaceC7201j70.e(this.x1, interfaceC7201j70);
        this.x1 = interfaceC7201j70;
    }

    public final boolean w0(C10833xx0 c10833xx0) {
        return this.l1.a(c10833xx0);
    }

    @InterfaceC6919hx0
    public abstract int x0(C10833xx0 c10833xx0);

    public final void y0() {
        long v = this.l1.v(c());
        if (v != Long.MIN_VALUE) {
            if (!this.D1) {
                v = Math.max(this.B1, v);
            }
            this.B1 = v;
            this.D1 = false;
        }
    }

    @Override // o.InterfaceC2729De1
    public long z() {
        if (getState() == 2) {
            y0();
        }
        return this.B1;
    }

    public AbstractC8532oW(@InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh, InterfaceC5143ah... interfaceC5143ahArr) {
        this(handler, interfaceC8085mh, null, interfaceC5143ahArr);
    }

    public AbstractC8532oW(@InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh, C10764xg c10764xg, InterfaceC5143ah... interfaceC5143ahArr) {
        this(handler, interfaceC8085mh, new C5594cY.g().h((C10764xg) C3743Nk1.a(c10764xg, C10764xg.e)).j(interfaceC5143ahArr).g());
    }

    public AbstractC8532oW(@InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh, InterfaceC9058qh interfaceC9058qh) {
        super(1);
        this.k1 = new InterfaceC8085mh.a(handler, interfaceC8085mh);
        this.l1 = interfaceC9058qh;
        interfaceC9058qh.p(new c());
        this.m1 = C9267rW.z();
        this.y1 = 0;
        this.A1 = true;
        u0(C10323vs.b);
        this.H1 = new long[10];
    }

    @Override // o.AbstractC2853El, o.InterfaceC10469wR1
    @InterfaceC11300zs1
    public InterfaceC2729De1 G() {
        return this;
    }
}
