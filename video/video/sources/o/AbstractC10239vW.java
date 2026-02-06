package o;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import o.NG2;

@Deprecated
/* renamed from: o.vW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10239vW extends AbstractC2853El {
    public static final String T1 = "DecoderVideoRenderer";
    public static final int U1 = 0;
    public static final int V1 = 1;
    public static final int W1 = 2;
    @InterfaceC11300zs1
    public InterfaceC7201j70 A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public long G1;
    public long H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    @InterfaceC11300zs1
    public PG2 L1;
    public long M1;
    public int N1;
    public int O1;
    public int P1;
    public long Q1;
    public long R1;
    public C8775pW S1;
    public final long k1;
    public final int l1;
    public final NG2.a m1;
    public final C6889hp2<C10833xx0> n1;
    public final C9267rW o1;
    public C10833xx0 p1;
    public C10833xx0 q1;
    @InterfaceC11300zs1
    public InterfaceC8288nW<C9267rW, ? extends BF2, ? extends C9018qW> r1;
    public C9267rW s1;
    public BF2 t1;
    public int u1;
    @InterfaceC11300zs1
    public Object v1;
    @InterfaceC11300zs1
    public Surface w1;
    @InterfaceC11300zs1
    public CF2 x1;
    @InterfaceC11300zs1
    public InterfaceC5529cG2 y1;
    @InterfaceC11300zs1
    public InterfaceC7201j70 z1;

    public AbstractC10239vW(long j, @InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 NG2 ng2, int i) {
        super(2);
        this.k1 = j;
        this.l1 = i;
        this.H1 = C10323vs.b;
        f0();
        this.n1 = new C6889hp2<>();
        this.o1 = C9267rW.z();
        this.m1 = new NG2.a(handler, ng2);
        this.B1 = 0;
        this.u1 = -1;
    }

    private void F0(@InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j70) {
        InterfaceC7201j70.e(this.z1, interfaceC7201j70);
        this.z1 = interfaceC7201j70;
    }

    private void H0() {
        long j;
        if (this.k1 > 0) {
            j = SystemClock.elapsedRealtime() + this.k1;
        } else {
            j = C10323vs.b;
        }
        this.H1 = j;
    }

    private void J0(@InterfaceC11300zs1 InterfaceC7201j70 interfaceC7201j70) {
        InterfaceC7201j70.e(this.A1, interfaceC7201j70);
        this.A1 = interfaceC7201j70;
    }

    private void e0() {
        this.D1 = false;
    }

    private void f0() {
        this.L1 = null;
    }

    private boolean h0(long j, long j2) throws C3824Og0, C9018qW {
        if (this.t1 == null) {
            BF2 b = this.r1.b();
            this.t1 = b;
            if (b == null) {
                return false;
            }
            C8775pW c8775pW = this.S1;
            int i = c8775pW.f;
            int i2 = b.Z;
            c8775pW.f = i + i2;
            this.P1 -= i2;
        }
        if (this.t1.q()) {
            if (this.B1 == 2) {
                C0();
                p0();
            } else {
                this.t1.v();
                this.t1 = null;
                this.K1 = true;
            }
            return false;
        }
        boolean B0 = B0(j, j2);
        if (B0) {
            z0(this.t1.Y);
            this.t1 = null;
        }
        return B0;
    }

    private boolean j0() throws C9018qW, C3824Og0 {
        InterfaceC8288nW<C9267rW, ? extends BF2, ? extends C9018qW> interfaceC8288nW = this.r1;
        if (interfaceC8288nW == null || this.B1 == 2 || this.J1) {
            return false;
        }
        if (this.s1 == null) {
            C9267rW d = interfaceC8288nW.d();
            this.s1 = d;
            if (d == null) {
                return false;
            }
        }
        if (this.B1 == 1) {
            this.s1.u(4);
            this.r1.c(this.s1);
            this.s1 = null;
            this.B1 = 2;
            return false;
        }
        C2899Ex0 L = L();
        int a0 = a0(L, this.s1, 0);
        if (a0 != -5) {
            if (a0 != -4) {
                if (a0 == -3) {
                    return false;
                }
                throw new IllegalStateException();
            } else if (this.s1.q()) {
                this.J1 = true;
                this.r1.c(this.s1);
                this.s1 = null;
                return false;
            } else {
                if (this.I1) {
                    this.n1.a(this.s1.a1, this.p1);
                    this.I1 = false;
                }
                this.s1.x();
                C9267rW c9267rW = this.s1;
                c9267rW.Y = this.p1;
                A0(c9267rW);
                this.r1.c(this.s1);
                this.P1++;
                this.C1 = true;
                this.S1.c++;
                this.s1 = null;
                return true;
            }
        }
        v0(L);
        return true;
    }

    private static boolean m0(long j) {
        if (j < -30000) {
            return true;
        }
        return false;
    }

    private static boolean n0(long j) {
        if (j < -500000) {
            return true;
        }
        return false;
    }

    private void p0() throws C3824Og0 {
        InterfaceC7280jR interfaceC7280jR;
        if (this.r1 == null) {
            F0(this.A1);
            InterfaceC7201j70 interfaceC7201j70 = this.z1;
            if (interfaceC7201j70 != null) {
                interfaceC7280jR = interfaceC7201j70.d();
                if (interfaceC7280jR == null && this.z1.i() == null) {
                    return;
                }
            } else {
                interfaceC7280jR = null;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.r1 = g0(this.p1, interfaceC7280jR);
                G0(this.u1);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.m1.k(this.r1.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.S1.a++;
            } catch (OutOfMemoryError e) {
                throw I(e, this.p1, AD1.p1);
            } catch (C9018qW e2) {
                I31.e(T1, "Video codec error", e2);
                this.m1.s(e2);
                throw I(e2, this.p1, AD1.p1);
            }
        }
    }

    private void q0() {
        if (this.N1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.m1.n(this.N1, elapsedRealtime - this.M1);
            this.N1 = 0;
            this.M1 = elapsedRealtime;
        }
    }

    private void r0() {
        this.F1 = true;
        if (!this.D1) {
            this.D1 = true;
            this.m1.q(this.v1);
        }
    }

    private void t0() {
        if (this.D1) {
            this.m1.q(this.v1);
        }
    }

    private void u0() {
        PG2 pg2 = this.L1;
        if (pg2 != null) {
            this.m1.t(pg2);
        }
    }

    public final boolean B0(long j, long j2) throws C3824Og0, C9018qW {
        boolean z;
        if (this.G1 == C10323vs.b) {
            this.G1 = j;
        }
        long j3 = this.t1.Y - j;
        if (!l0()) {
            if (!m0(j3)) {
                return false;
            }
            N0(this.t1);
            return true;
        }
        long j4 = this.t1.Y - this.R1;
        C10833xx0 j5 = this.n1.j(j4);
        if (j5 != null) {
            this.q1 = j5;
        }
        long j1 = TD2.j1(SystemClock.elapsedRealtime()) - this.Q1;
        if (getState() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.F1 ? this.D1 : !z && !this.E1) {
            if (!z || !M0(j3, j1)) {
                if (!z || j == this.G1 || (K0(j3, j2) && o0(j))) {
                    return false;
                }
                if (L0(j3, j2)) {
                    i0(this.t1);
                    return true;
                }
                if (j3 < 30000) {
                    D0(this.t1, j4, this.q1);
                    return true;
                }
                return false;
            }
        }
        D0(this.t1, j4, this.q1);
        return true;
    }

    @InterfaceC2591Bt
    public void C0() {
        this.s1 = null;
        this.t1 = null;
        this.B1 = 0;
        this.C1 = false;
        this.P1 = 0;
        InterfaceC8288nW<C9267rW, ? extends BF2, ? extends C9018qW> interfaceC8288nW = this.r1;
        if (interfaceC8288nW != null) {
            this.S1.b++;
            interfaceC8288nW.g();
            this.m1.l(this.r1.getName());
            this.r1 = null;
        }
        F0(null);
    }

    @Override // o.InterfaceC10469wR1
    public void D(long j, long j2) throws C3824Og0 {
        if (!this.K1) {
            if (this.p1 == null) {
                C2899Ex0 L = L();
                this.o1.l();
                int a0 = a0(L, this.o1, 2);
                if (a0 == -5) {
                    v0(L);
                } else if (a0 == -4) {
                    C9542sf.i(this.o1.q());
                    this.J1 = true;
                    this.K1 = true;
                    return;
                } else {
                    return;
                }
            }
            p0();
            if (this.r1 != null) {
                try {
                    C7624kr2.a("drainAndFeed");
                    while (h0(j, j2)) {
                    }
                    while (j0()) {
                    }
                    C7624kr2.c();
                    this.S1.c();
                } catch (C9018qW e) {
                    I31.e(T1, "Video codec error", e);
                    this.m1.s(e);
                    throw I(e, this.p1, AD1.r1);
                }
            }
        }
    }

    public void D0(BF2 bf2, long j, C10833xx0 c10833xx0) throws C9018qW {
        boolean z;
        boolean z2;
        InterfaceC5529cG2 interfaceC5529cG2 = this.y1;
        if (interfaceC5529cG2 != null) {
            interfaceC5529cG2.h(j, System.nanoTime(), c10833xx0, null);
        }
        this.Q1 = TD2.j1(SystemClock.elapsedRealtime());
        int i = bf2.Z0;
        if (i == 1 && this.w1 != null) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0 && this.x1 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !z) {
            i0(bf2);
            return;
        }
        s0(bf2.b1, bf2.c1);
        if (z2) {
            this.x1.setOutputBuffer(bf2);
        } else {
            E0(bf2, this.w1);
        }
        this.O1 = 0;
        this.S1.e++;
        r0();
    }

    public abstract void E0(BF2 bf2, Surface surface) throws C9018qW;

    public abstract void G0(int i);

    public final void I0(@InterfaceC11300zs1 Object obj) {
        if (obj instanceof Surface) {
            this.w1 = (Surface) obj;
            this.x1 = null;
            this.u1 = 1;
        } else if (obj instanceof CF2) {
            this.w1 = null;
            this.x1 = (CF2) obj;
            this.u1 = 0;
        } else {
            this.w1 = null;
            this.x1 = null;
            this.u1 = -1;
            obj = null;
        }
        if (this.v1 != obj) {
            this.v1 = obj;
            if (obj != null) {
                if (this.r1 != null) {
                    G0(this.u1);
                }
                w0();
                return;
            }
            x0();
        } else if (obj != null) {
            y0();
        }
    }

    public boolean K0(long j, long j2) {
        return n0(j);
    }

    public boolean L0(long j, long j2) {
        return m0(j);
    }

    public boolean M0(long j, long j2) {
        if (m0(j) && j2 > 100000) {
            return true;
        }
        return false;
    }

    public void N0(BF2 bf2) {
        this.S1.f++;
        bf2.v();
    }

    public void O0(int i, int i2) {
        C8775pW c8775pW = this.S1;
        c8775pW.h += i;
        int i3 = i + i2;
        c8775pW.g += i3;
        this.N1 += i3;
        int i4 = this.O1 + i3;
        this.O1 = i4;
        c8775pW.i = Math.max(i4, c8775pW.i);
        int i5 = this.l1;
        if (i5 > 0 && this.N1 >= i5) {
            q0();
        }
    }

    @Override // o.AbstractC2853El
    public void R() {
        this.p1 = null;
        f0();
        e0();
        try {
            J0(null);
            C0();
        } finally {
            this.m1.m(this.S1);
        }
    }

    @Override // o.AbstractC2853El
    public void S(boolean z, boolean z2) throws C3824Og0 {
        C8775pW c8775pW = new C8775pW();
        this.S1 = c8775pW;
        this.m1.o(c8775pW);
        this.E1 = z2;
        this.F1 = false;
    }

    @Override // o.AbstractC2853El
    public void T(long j, boolean z) throws C3824Og0 {
        this.J1 = false;
        this.K1 = false;
        e0();
        this.G1 = C10323vs.b;
        this.O1 = 0;
        if (this.r1 != null) {
            k0();
        }
        if (z) {
            H0();
        } else {
            this.H1 = C10323vs.b;
        }
        this.n1.c();
    }

    @Override // o.AbstractC2853El
    public void X() {
        this.N1 = 0;
        this.M1 = SystemClock.elapsedRealtime();
        this.Q1 = TD2.j1(SystemClock.elapsedRealtime());
    }

    @Override // o.AbstractC2853El
    public void Y() {
        this.H1 = C10323vs.b;
        q0();
    }

    @Override // o.AbstractC2853El
    public void Z(C10833xx0[] c10833xx0Arr, long j, long j2) throws C3824Og0 {
        this.R1 = j2;
        super.Z(c10833xx0Arr, j, j2);
    }

    @Override // o.InterfaceC10469wR1
    public boolean c() {
        return this.K1;
    }

    public C9996uW d0(String str, C10833xx0 c10833xx0, C10833xx0 c10833xx02) {
        return new C9996uW(str, c10833xx0, c10833xx02, 0, 1);
    }

    public abstract InterfaceC8288nW<C9267rW, ? extends BF2, ? extends C9018qW> g0(C10833xx0 c10833xx0, @InterfaceC11300zs1 InterfaceC7280jR interfaceC7280jR) throws C9018qW;

    public void i0(BF2 bf2) {
        O0(0, 1);
        bf2.v();
    }

    @Override // o.InterfaceC10469wR1
    public boolean isReady() {
        if (this.p1 != null && ((Q() || this.t1 != null) && (this.D1 || !l0()))) {
            this.H1 = C10323vs.b;
            return true;
        } else if (this.H1 == C10323vs.b) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.H1) {
                return true;
            }
            this.H1 = C10323vs.b;
            return false;
        }
    }

    @InterfaceC2591Bt
    public void k0() throws C3824Og0 {
        this.P1 = 0;
        if (this.B1 != 0) {
            C0();
            p0();
            return;
        }
        this.s1 = null;
        BF2 bf2 = this.t1;
        if (bf2 != null) {
            bf2.v();
            this.t1 = null;
        }
        this.r1.flush();
        this.C1 = false;
    }

    public final boolean l0() {
        if (this.u1 != -1) {
            return true;
        }
        return false;
    }

    public boolean o0(long j) throws C3824Og0 {
        int c0 = c0(j);
        if (c0 == 0) {
            return false;
        }
        this.S1.j++;
        O0(c0, this.P1);
        k0();
        return true;
    }

    public final void s0(int i, int i2) {
        PG2 pg2 = this.L1;
        if (pg2 != null && pg2.X == i && pg2.Y == i2) {
            return;
        }
        PG2 pg22 = new PG2(i, i2);
        this.L1 = pg22;
        this.m1.t(pg22);
    }

    @Override // o.AbstractC2853El, o.OD1.b
    public void t(int i, @InterfaceC11300zs1 Object obj) throws C3824Og0 {
        if (i == 1) {
            I0(obj);
        } else if (i == 7) {
            this.y1 = (InterfaceC5529cG2) obj;
        } else {
            super.t(i, obj);
        }
    }

    @InterfaceC2591Bt
    public void v0(C2899Ex0 c2899Ex0) throws C3824Og0 {
        C9996uW d0;
        this.I1 = true;
        C10833xx0 c10833xx0 = (C10833xx0) C9542sf.g(c2899Ex0.b);
        J0(c2899Ex0.a);
        C10833xx0 c10833xx02 = this.p1;
        this.p1 = c10833xx0;
        InterfaceC8288nW<C9267rW, ? extends BF2, ? extends C9018qW> interfaceC8288nW = this.r1;
        if (interfaceC8288nW == null) {
            p0();
            this.m1.p(this.p1, null);
            return;
        }
        if (this.A1 != this.z1) {
            d0 = new C9996uW(interfaceC8288nW.getName(), c10833xx02, c10833xx0, 0, 128);
        } else {
            d0 = d0(interfaceC8288nW.getName(), c10833xx02, c10833xx0);
        }
        if (d0.d == 0) {
            if (this.C1) {
                this.B1 = 1;
            } else {
                C0();
                p0();
            }
        }
        this.m1.p(this.p1, d0);
    }

    public final void w0() {
        u0();
        e0();
        if (getState() == 2) {
            H0();
        }
    }

    public final void x0() {
        f0();
        e0();
    }

    public final void y0() {
        u0();
        t0();
    }

    @InterfaceC2591Bt
    public void z0(long j) {
        this.P1--;
    }

    public void A0(C9267rW c9267rW) {
    }
}
