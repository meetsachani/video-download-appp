package o;

import java.util.List;
import o.AbstractC7373jp2;

@Deprecated
/* renamed from: o.Bl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2559Bl implements HD1 {
    public final AbstractC7373jp2.d Y0 = new AbstractC7373jp2.d();

    public final void A2(int i, int i2) {
        y2(i, C10323vs.b, i2, false);
    }

    @Override // o.HD1
    public final long B1() {
        AbstractC7373jp2 e1 = e1();
        if (e1.x()) {
            return C10323vs.b;
        }
        return e1.u(c2(), this.Y0).g();
    }

    public final void B2(int i) {
        int Q0 = Q0();
        if (Q0 == -1) {
            return;
        }
        if (Q0 == c2()) {
            x2(i);
        } else {
            A2(Q0, i);
        }
    }

    public final void C2(long j, int i) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != C10323vs.b) {
            currentPosition = Math.min(currentPosition, duration);
        }
        z2(Math.max(currentPosition, 0L), i);
    }

    public final void D2(int i) {
        int Z = Z();
        if (Z == -1) {
            return;
        }
        if (Z == c2()) {
            x2(i);
        } else {
            A2(Z, i);
        }
    }

    @Override // o.HD1
    public final boolean E1() {
        if (Z() != -1) {
            return true;
        }
        return false;
    }

    @Override // o.HD1
    @Deprecated
    public final void F0() {
        c0();
    }

    @Override // o.HD1
    @InterfaceC11300zs1
    public final Object G0() {
        AbstractC7373jp2 e1 = e1();
        if (e1.x()) {
            return null;
        }
        return e1.u(c2(), this.Y0).Y0;
    }

    @Override // o.HD1
    public final void H0() {
        B2(8);
    }

    @Override // o.HD1
    @Deprecated
    public final boolean J1() {
        return E1();
    }

    @Override // o.HD1
    public final void M1(int i) {
        A2(i, 10);
    }

    @Override // o.HD1
    public final boolean P0() {
        if (Q0() != -1) {
            return true;
        }
        return false;
    }

    @Override // o.HD1
    @Deprecated
    public final boolean Q() {
        return P0();
    }

    @Override // o.HD1
    public final int Q0() {
        AbstractC7373jp2 e1 = e1();
        if (e1.x()) {
            return -1;
        }
        return e1.j(c2(), w2(), n2());
    }

    @Override // o.HD1
    public final void T() {
        s0(0, Integer.MAX_VALUE);
    }

    @Override // o.HD1
    public final boolean T0(int i) {
        return t1().d(i);
    }

    @Override // o.HD1
    @Deprecated
    public final int T1() {
        return Z();
    }

    @Override // o.HD1
    @InterfaceC11300zs1
    public final C8322nf1 U() {
        AbstractC7373jp2 e1 = e1();
        if (e1.x()) {
            return null;
        }
        return e1.u(c2(), this.Y0).Z;
    }

    @Override // o.HD1
    public final void U0(C8322nf1 c8322nf1, long j) {
        L1(AbstractC5317bO0.M(c8322nf1), 0, j);
    }

    @Override // o.HD1
    public final boolean V1() {
        AbstractC7373jp2 e1 = e1();
        if (!e1.x() && e1.u(c2(), this.Y0).c1) {
            return true;
        }
        return false;
    }

    @Override // o.HD1
    public final boolean X0() {
        AbstractC7373jp2 e1 = e1();
        if (!e1.x() && e1.u(c2(), this.Y0).d1) {
            return true;
        }
        return false;
    }

    @Override // o.HD1
    public final int Y() {
        long U1 = U1();
        long duration = getDuration();
        if (U1 == C10323vs.b || duration == C10323vs.b) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return TD2.w((int) ((U1 * 100) / duration), 0, 100);
    }

    @Override // o.HD1
    public final void Y0(long j) {
        z2(j, 5);
    }

    @Override // o.HD1
    public final int Z() {
        AbstractC7373jp2 e1 = e1();
        if (e1.x()) {
            return -1;
        }
        return e1.s(c2(), w2(), n2());
    }

    @Override // o.HD1
    public final void a1(C8322nf1 c8322nf1, boolean z) {
        e0(AbstractC5317bO0.M(c8322nf1), z);
    }

    @Override // o.HD1
    public final void a2(int i, C8322nf1 c8322nf1) {
        l0(i, i + 1, AbstractC5317bO0.M(c8322nf1));
    }

    @Override // o.HD1
    @Deprecated
    public final boolean b0() {
        return V1();
    }

    @Override // o.HD1
    public final void b1(float f) {
        f(h().c(f));
    }

    @Override // o.HD1
    public final void c0() {
        D2(6);
    }

    @Override // o.HD1
    public final void d0() {
        A2(c2(), 4);
    }

    @Override // o.HD1
    public final void d1(C8322nf1 c8322nf1) {
        m2(AbstractC5317bO0.M(c8322nf1));
    }

    @Override // o.HD1
    @Deprecated
    public final int d2() {
        return Q0();
    }

    @Override // o.HD1
    public final void g0(C8322nf1 c8322nf1) {
        t2(AbstractC5317bO0.M(c8322nf1));
    }

    @Override // o.HD1
    @Deprecated
    public final boolean hasNext() {
        return P0();
    }

    @Override // o.HD1
    @Deprecated
    public final boolean hasPrevious() {
        return E1();
    }

    @Override // o.HD1
    @Deprecated
    public final void i0() {
        H0();
    }

    @Override // o.HD1
    public final void i2(int i, int i2) {
        if (i != i2) {
            k2(i, i + 1, i2);
        }
    }

    @Override // o.HD1
    public final boolean isPlaying() {
        if (X() == 3 && u1() && Z0() == 0) {
            return true;
        }
        return false;
    }

    @Override // o.HD1
    @Deprecated
    public final boolean j0() {
        return X0();
    }

    @Override // o.HD1
    public final void j1() {
        if (!e1().x() && !O()) {
            if (P0()) {
                B2(9);
            } else if (v2() && X0()) {
                A2(c2(), 9);
            }
        }
    }

    @Override // o.HD1
    @Deprecated
    public final boolean j2() {
        return v2();
    }

    @Override // o.HD1
    public final void m2(List<C8322nf1> list) {
        S1(Integer.MAX_VALUE, list);
    }

    @Override // o.HD1
    public final boolean n0() {
        return true;
    }

    @Override // o.HD1
    @Deprecated
    public final void next() {
        H0();
    }

    @Override // o.HD1
    public final void o0(int i) {
        s0(i, i + 1);
    }

    @Override // o.HD1
    public final int p0() {
        return e1().w();
    }

    @Override // o.HD1
    public final void p2() {
        C2(N1(), 12);
    }

    @Override // o.HD1
    public final void pause() {
        D0(false);
    }

    @Override // o.HD1
    @Deprecated
    public final void previous() {
        c0();
    }

    @Override // o.HD1
    public final long q1() {
        AbstractC7373jp2 e1 = e1();
        if (e1.x() || e1.u(c2(), this.Y0).a1 == C10323vs.b) {
            return C10323vs.b;
        }
        return (this.Y0.c() - this.Y0.a1) - P1();
    }

    @Override // o.HD1
    public final void r2() {
        C2(-u2(), 11);
    }

    @Override // o.HD1
    public final void s1(int i, long j) {
        y2(i, j, 10, false);
    }

    @Override // o.HD1
    public final void t0() {
        D0(true);
    }

    @Override // o.HD1
    public final void t2(List<C8322nf1> list) {
        e0(list, true);
    }

    @Override // o.HD1
    @Deprecated
    public final int v0() {
        return c2();
    }

    @Override // o.HD1
    public final boolean v2() {
        AbstractC7373jp2 e1 = e1();
        if (!e1.x() && e1.u(c2(), this.Y0).k()) {
            return true;
        }
        return false;
    }

    public final int w2() {
        int w0 = w0();
        if (w0 == 1) {
            return 0;
        }
        return w0;
    }

    @Override // o.HD1
    public final void x0(int i, C8322nf1 c8322nf1) {
        S1(i, AbstractC5317bO0.M(c8322nf1));
    }

    @Override // o.HD1
    public final C8322nf1 x1(int i) {
        return e1().u(i, this.Y0).Z;
    }

    public final void x2(int i) {
        y2(c2(), C10323vs.b, i, true);
    }

    @InterfaceC5056aJ2(otherwise = 4)
    public abstract void y2(int i, long j, int i2, boolean z);

    @Override // o.HD1
    public final void z0() {
        if (!e1().x() && !O()) {
            boolean E1 = E1();
            if (v2() && !V1()) {
                if (E1) {
                    D2(7);
                }
            } else if (E1 && getCurrentPosition() <= y1()) {
                D2(7);
            } else {
                z2(0L, 7);
            }
        }
    }

    public final void z2(long j, int i) {
        y2(c2(), j, i, false);
    }
}
