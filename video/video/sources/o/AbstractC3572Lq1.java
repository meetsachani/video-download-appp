package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.Lq1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3572Lq1 implements InterfaceC10469wR1, InterfaceC10712xR1 {
    public C10955yR1 X;
    public int Y;
    @InterfaceC11300zs1
    public IX1 Y0;
    public int Z;
    public boolean Z0;

    @Override // o.InterfaceC10712xR1
    public int B() throws C3824Og0 {
        return 0;
    }

    @Override // o.InterfaceC10469wR1
    public final void C(C10833xx0[] c10833xx0Arr, IX1 ix1, long j, long j2) throws C3824Og0 {
        C9542sf.i(!this.Z0);
        this.Y0 = ix1;
        K(j2);
    }

    @Override // o.InterfaceC10469wR1
    public long E() {
        return Long.MIN_VALUE;
    }

    @Override // o.InterfaceC10469wR1
    public final void F(long j) throws C3824Og0 {
        this.Z0 = false;
        J(j, false);
    }

    @Override // o.InterfaceC10469wR1
    @InterfaceC11300zs1
    public InterfaceC2729De1 G() {
        return null;
    }

    @Override // o.InterfaceC10712xR1
    public int a(C10833xx0 c10833xx0) throws C3824Og0 {
        return InterfaceC10712xR1.r(0);
    }

    @Override // o.InterfaceC10469wR1
    public final void b() {
        boolean z = true;
        if (this.Z != 1) {
            z = false;
        }
        C9542sf.i(z);
        this.Z = 0;
        this.Y0 = null;
        this.Z0 = false;
        z();
    }

    @Override // o.InterfaceC10469wR1
    public boolean c() {
        return true;
    }

    @Override // o.InterfaceC10469wR1, o.InterfaceC10712xR1
    public final int d() {
        return -2;
    }

    @Override // o.InterfaceC10469wR1
    @InterfaceC11300zs1
    public final IX1 e() {
        return this.Y0;
    }

    @InterfaceC11300zs1
    public final C10955yR1 f() {
        return this.X;
    }

    @Override // o.InterfaceC10469wR1
    public final int getState() {
        return this.Z;
    }

    public final int h() {
        return this.Y;
    }

    @Override // o.InterfaceC10469wR1
    public boolean isReady() {
        return true;
    }

    @Override // o.InterfaceC10469wR1
    public final void j(C10955yR1 c10955yR1, C10833xx0[] c10833xx0Arr, IX1 ix1, long j, boolean z, boolean z2, long j2, long j3) throws C3824Og0 {
        boolean z3;
        if (this.Z == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9542sf.i(z3);
        this.X = c10955yR1;
        this.Z = 1;
        I(z);
        C(c10833xx0Arr, ix1, j2, j3);
        J(j, z);
    }

    @Override // o.InterfaceC10469wR1
    public final boolean k() {
        return true;
    }

    @Override // o.InterfaceC10469wR1
    public final void m() {
        this.Z0 = true;
    }

    @Override // o.InterfaceC10469wR1
    public final void o(int i, ND1 nd1) {
        this.Y = i;
    }

    @Override // o.InterfaceC10469wR1
    public final void reset() {
        boolean z;
        if (this.Z == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        L();
    }

    @Override // o.InterfaceC10469wR1
    public final void start() throws C3824Og0 {
        boolean z = true;
        if (this.Z != 1) {
            z = false;
        }
        C9542sf.i(z);
        this.Z = 2;
        M();
    }

    @Override // o.InterfaceC10469wR1
    public final void stop() {
        boolean z;
        if (this.Z == 2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.Z = 1;
        N();
    }

    @Override // o.InterfaceC10469wR1
    public final boolean v() {
        return this.Z0;
    }

    public void L() {
    }

    public void M() throws C3824Og0 {
    }

    public void N() {
    }

    @Override // o.InterfaceC10469wR1
    public final void u() throws IOException {
    }

    @Override // o.InterfaceC10469wR1
    public final InterfaceC10712xR1 x() {
        return this;
    }

    public void z() {
    }

    public void I(boolean z) throws C3824Og0 {
    }

    public void K(long j) throws C3824Og0 {
    }

    public void J(long j, boolean z) throws C3824Og0 {
    }

    @Override // o.OD1.b
    public void t(int i, @InterfaceC11300zs1 Object obj) throws C3824Og0 {
    }
}
