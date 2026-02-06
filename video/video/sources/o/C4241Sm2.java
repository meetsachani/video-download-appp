package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

@Deprecated
/* renamed from: o.Sm2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4241Sm2 extends AbstractC2853El implements Handler.Callback {
    public static final String B1 = "TextRenderer";
    public static final int C1 = 0;
    public static final int D1 = 1;
    public static final int E1 = 2;
    public static final int F1 = 0;
    public long A1;
    @InterfaceC11300zs1
    public final Handler k1;
    public final InterfaceC3850Om2 l1;
    public final InterfaceC4314Tg2 m1;
    public final C2899Ex0 n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public int r1;
    @InterfaceC11300zs1
    public C10833xx0 s1;
    @InterfaceC11300zs1
    public InterfaceC4117Rg2 t1;
    @InterfaceC11300zs1
    public C4508Vg2 u1;
    @InterfaceC11300zs1
    public AbstractC4605Wg2 v1;
    @InterfaceC11300zs1
    public AbstractC4605Wg2 w1;
    public int x1;
    public long y1;
    public long z1;

    public C4241Sm2(InterfaceC3850Om2 interfaceC3850Om2, @InterfaceC11300zs1 Looper looper) {
        this(interfaceC3850Om2, looper, InterfaceC4314Tg2.a);
    }

    @V52
    private long g0(long j) {
        boolean z;
        boolean z2 = false;
        if (j != C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (this.z1 != C10323vs.b) {
            z2 = true;
        }
        C9542sf.i(z2);
        return j - this.z1;
    }

    private void l0() {
        k0();
        ((InterfaceC4117Rg2) C9542sf.g(this.t1)).g();
        this.t1 = null;
        this.r1 = 0;
    }

    @Override // o.InterfaceC10469wR1
    public void D(long j, long j2) {
        boolean z;
        this.A1 = j;
        if (v()) {
            long j3 = this.y1;
            if (j3 != C10323vs.b && j >= j3) {
                k0();
                this.p1 = true;
            }
        }
        if (!this.p1) {
            if (this.w1 == null) {
                ((InterfaceC4117Rg2) C9542sf.g(this.t1)).a(j);
                try {
                    this.w1 = ((InterfaceC4117Rg2) C9542sf.g(this.t1)).b();
                } catch (C4217Sg2 e) {
                    h0(e);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.v1 != null) {
                    long f0 = f0();
                    z = false;
                    while (f0 <= j) {
                        this.x1++;
                        f0 = f0();
                        z = true;
                    }
                } else {
                    z = false;
                }
                AbstractC4605Wg2 abstractC4605Wg2 = this.w1;
                if (abstractC4605Wg2 != null) {
                    if (abstractC4605Wg2.q()) {
                        if (!z && f0() == Long.MAX_VALUE) {
                            if (this.r1 == 2) {
                                m0();
                            } else {
                                k0();
                                this.p1 = true;
                            }
                        }
                    } else if (abstractC4605Wg2.Y <= j) {
                        AbstractC4605Wg2 abstractC4605Wg22 = this.v1;
                        if (abstractC4605Wg22 != null) {
                            abstractC4605Wg22.v();
                        }
                        this.x1 = abstractC4605Wg2.e(j);
                        this.v1 = abstractC4605Wg2;
                        this.w1 = null;
                        z = true;
                    }
                }
                if (z) {
                    C9542sf.g(this.v1);
                    o0(new C8274nS(this.v1.g(j), g0(e0(j))));
                }
                if (this.r1 != 2) {
                    while (!this.o1) {
                        try {
                            C4508Vg2 c4508Vg2 = this.u1;
                            if (c4508Vg2 == null) {
                                c4508Vg2 = ((InterfaceC4117Rg2) C9542sf.g(this.t1)).d();
                                if (c4508Vg2 != null) {
                                    this.u1 = c4508Vg2;
                                } else {
                                    return;
                                }
                            }
                            if (this.r1 == 1) {
                                c4508Vg2.u(4);
                                ((InterfaceC4117Rg2) C9542sf.g(this.t1)).c(c4508Vg2);
                                this.u1 = null;
                                this.r1 = 2;
                                return;
                            }
                            int a0 = a0(this.n1, c4508Vg2, 0);
                            if (a0 == -4) {
                                if (c4508Vg2.q()) {
                                    this.o1 = true;
                                    this.q1 = false;
                                } else {
                                    C10833xx0 c10833xx0 = this.n1.b;
                                    if (c10833xx0 != null) {
                                        c4508Vg2.h1 = c10833xx0.k1;
                                        c4508Vg2.x();
                                        this.q1 &= !c4508Vg2.s();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.q1) {
                                    ((InterfaceC4117Rg2) C9542sf.g(this.t1)).c(c4508Vg2);
                                    this.u1 = null;
                                }
                            } else if (a0 == -3) {
                                return;
                            }
                        } catch (C4217Sg2 e2) {
                            h0(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // o.AbstractC2853El
    public void R() {
        this.s1 = null;
        this.y1 = C10323vs.b;
        d0();
        this.z1 = C10323vs.b;
        this.A1 = C10323vs.b;
        l0();
    }

    @Override // o.AbstractC2853El
    public void T(long j, boolean z) {
        this.A1 = j;
        d0();
        this.o1 = false;
        this.p1 = false;
        this.y1 = C10323vs.b;
        if (this.r1 != 0) {
            m0();
            return;
        }
        k0();
        ((InterfaceC4117Rg2) C9542sf.g(this.t1)).flush();
    }

    @Override // o.AbstractC2853El
    public void Z(C10833xx0[] c10833xx0Arr, long j, long j2) {
        this.z1 = j2;
        this.s1 = c10833xx0Arr[0];
        if (this.t1 != null) {
            this.r1 = 1;
        } else {
            i0();
        }
    }

    @Override // o.InterfaceC10712xR1
    public int a(C10833xx0 c10833xx0) {
        int i;
        if (this.m1.a(c10833xx0)) {
            if (c10833xx0.B1 == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return InterfaceC10712xR1.r(i);
        } else if (C4128Rj1.s(c10833xx0.g1)) {
            return InterfaceC10712xR1.r(1);
        } else {
            return InterfaceC10712xR1.r(0);
        }
    }

    @Override // o.InterfaceC10469wR1
    public boolean c() {
        return this.p1;
    }

    public final void d0() {
        o0(new C8274nS(AbstractC5317bO0.L(), g0(this.A1)));
    }

    @V52
    @HS1({"subtitle"})
    public final long e0(long j) {
        int e = this.v1.e(j);
        if (e != 0 && this.v1.i() != 0) {
            if (e == -1) {
                AbstractC4605Wg2 abstractC4605Wg2 = this.v1;
                return abstractC4605Wg2.h(abstractC4605Wg2.i() - 1);
            }
            return this.v1.h(e - 1);
        }
        return this.v1.Y;
    }

    public final long f0() {
        if (this.x1 == -1) {
            return Long.MAX_VALUE;
        }
        C9542sf.g(this.v1);
        if (this.x1 >= this.v1.i()) {
            return Long.MAX_VALUE;
        }
        return this.v1.h(this.x1);
    }

    @Override // o.InterfaceC10469wR1, o.InterfaceC10712xR1
    public String getName() {
        return B1;
    }

    public final void h0(C4217Sg2 c4217Sg2) {
        I31.e(B1, "Subtitle decoding failed. streamFormat=" + this.s1, c4217Sg2);
        d0();
        m0();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            j0((C8274nS) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final void i0() {
        this.q1 = true;
        this.t1 = this.m1.b((C10833xx0) C9542sf.g(this.s1));
    }

    @Override // o.InterfaceC10469wR1
    public boolean isReady() {
        return true;
    }

    public final void j0(C8274nS c8274nS) {
        this.l1.u(c8274nS.X);
        this.l1.G(c8274nS);
    }

    public final void k0() {
        this.u1 = null;
        this.x1 = -1;
        AbstractC4605Wg2 abstractC4605Wg2 = this.v1;
        if (abstractC4605Wg2 != null) {
            abstractC4605Wg2.v();
            this.v1 = null;
        }
        AbstractC4605Wg2 abstractC4605Wg22 = this.w1;
        if (abstractC4605Wg22 != null) {
            abstractC4605Wg22.v();
            this.w1 = null;
        }
    }

    public final void m0() {
        l0();
        i0();
    }

    public void n0(long j) {
        C9542sf.i(v());
        this.y1 = j;
    }

    public final void o0(C8274nS c8274nS) {
        Handler handler = this.k1;
        if (handler != null) {
            handler.obtainMessage(0, c8274nS).sendToTarget();
        } else {
            j0(c8274nS);
        }
    }

    public C4241Sm2(InterfaceC3850Om2 interfaceC3850Om2, @InterfaceC11300zs1 Looper looper, InterfaceC4314Tg2 interfaceC4314Tg2) {
        super(3);
        this.l1 = (InterfaceC3850Om2) C9542sf.g(interfaceC3850Om2);
        this.k1 = looper == null ? null : TD2.B(looper, this);
        this.m1 = interfaceC4314Tg2;
        this.n1 = new C2899Ex0();
        this.y1 = C10323vs.b;
        this.z1 = C10323vs.b;
        this.A1 = C10323vs.b;
    }
}
