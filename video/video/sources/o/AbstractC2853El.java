package o;

import java.io.IOException;
import o.InterfaceC10712xR1;

@Deprecated
/* renamed from: o.El  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2853El implements InterfaceC10469wR1, InterfaceC10712xR1 {
    public final int Y;
    @InterfaceC11300zs1
    public C10955yR1 Y0;
    public int Z0;
    public ND1 a1;
    public int b1;
    @InterfaceC11300zs1
    public IX1 c1;
    @InterfaceC11300zs1
    public C10833xx0[] d1;
    public long e1;
    public long f1;
    public boolean h1;
    public boolean i1;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1
    public InterfaceC10712xR1.f j1;
    public final Object X = new Object();
    public final C2899Ex0 Z = new C2899Ex0();
    public long g1 = Long.MIN_VALUE;

    public AbstractC2853El(int i) {
        this.Y = i;
    }

    @Override // o.InterfaceC10712xR1
    public int B() throws C3824Og0 {
        return 0;
    }

    @Override // o.InterfaceC10469wR1
    public final void C(C10833xx0[] c10833xx0Arr, IX1 ix1, long j, long j2) throws C3824Og0 {
        C9542sf.i(!this.h1);
        this.c1 = ix1;
        if (this.g1 == Long.MIN_VALUE) {
            this.g1 = j;
        }
        this.d1 = c10833xx0Arr;
        this.e1 = j2;
        Z(c10833xx0Arr, j, j2);
    }

    @Override // o.InterfaceC10469wR1
    public final long E() {
        return this.g1;
    }

    @Override // o.InterfaceC10469wR1
    public final void F(long j) throws C3824Og0 {
        b0(j, false);
    }

    @Override // o.InterfaceC10469wR1
    @InterfaceC11300zs1
    public InterfaceC2729De1 G() {
        return null;
    }

    public final C3824Og0 I(Throwable th, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i) {
        return J(th, c10833xx0, false, i);
    }

    public final C3824Og0 J(Throwable th, @InterfaceC11300zs1 C10833xx0 c10833xx0, boolean z, int i) {
        int i2;
        if (c10833xx0 != null && !this.i1) {
            this.i1 = true;
            try {
                i2 = InterfaceC10712xR1.H(a(c10833xx0));
            } catch (C3824Og0 unused) {
            } finally {
                this.i1 = false;
            }
            return C3824Og0.k(th, getName(), M(), c10833xx0, i2, z, i);
        }
        i2 = 4;
        return C3824Og0.k(th, getName(), M(), c10833xx0, i2, z, i);
    }

    public final C10955yR1 K() {
        return (C10955yR1) C9542sf.g(this.Y0);
    }

    public final C2899Ex0 L() {
        this.Z.a();
        return this.Z;
    }

    public final int M() {
        return this.Z0;
    }

    public final long N() {
        return this.f1;
    }

    public final ND1 O() {
        return (ND1) C9542sf.g(this.a1);
    }

    public final C10833xx0[] P() {
        return (C10833xx0[]) C9542sf.g(this.d1);
    }

    public final boolean Q() {
        if (k()) {
            return this.h1;
        }
        return ((IX1) C9542sf.g(this.c1)).isReady();
    }

    public final void V() {
        InterfaceC10712xR1.f fVar;
        synchronized (this.X) {
            fVar = this.j1;
        }
        if (fVar != null) {
            fVar.a(this);
        }
    }

    public final int a0(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
        int j = ((IX1) C9542sf.g(this.c1)).j(c2899Ex0, c9267rW, i);
        if (j == -4) {
            if (c9267rW.q()) {
                this.g1 = Long.MIN_VALUE;
                if (this.h1) {
                    return -4;
                }
                return -3;
            }
            long j2 = c9267rW.a1 + this.e1;
            c9267rW.a1 = j2;
            this.g1 = Math.max(this.g1, j2);
            return j;
        }
        if (j == -5) {
            C10833xx0 c10833xx0 = (C10833xx0) C9542sf.g(c2899Ex0.b);
            if (c10833xx0.k1 != Long.MAX_VALUE) {
                c2899Ex0.b = c10833xx0.b().k0(c10833xx0.k1 + this.e1).G();
            }
        }
        return j;
    }

    @Override // o.InterfaceC10469wR1
    public final void b() {
        boolean z = true;
        if (this.b1 != 1) {
            z = false;
        }
        C9542sf.i(z);
        this.Z.a();
        this.b1 = 0;
        this.c1 = null;
        this.d1 = null;
        this.h1 = false;
        R();
    }

    public final void b0(long j, boolean z) throws C3824Og0 {
        this.h1 = false;
        this.f1 = j;
        this.g1 = j;
        T(j, z);
    }

    public int c0(long j) {
        return ((IX1) C9542sf.g(this.c1)).n(j - this.e1);
    }

    @Override // o.InterfaceC10469wR1, o.InterfaceC10712xR1
    public final int d() {
        return this.Y;
    }

    @Override // o.InterfaceC10469wR1
    @InterfaceC11300zs1
    public final IX1 e() {
        return this.c1;
    }

    @Override // o.InterfaceC10469wR1
    public final void g() {
        boolean z;
        if (this.b1 == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        U();
    }

    @Override // o.InterfaceC10469wR1
    public final int getState() {
        return this.b1;
    }

    @Override // o.InterfaceC10712xR1
    public final void i() {
        synchronized (this.X) {
            this.j1 = null;
        }
    }

    @Override // o.InterfaceC10469wR1
    public final void j(C10955yR1 c10955yR1, C10833xx0[] c10833xx0Arr, IX1 ix1, long j, boolean z, boolean z2, long j2, long j3) throws C3824Og0 {
        boolean z3;
        if (this.b1 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9542sf.i(z3);
        this.Y0 = c10955yR1;
        this.b1 = 1;
        S(z, z2);
        C(c10833xx0Arr, ix1, j2, j3);
        b0(j, z);
    }

    @Override // o.InterfaceC10469wR1
    public final boolean k() {
        if (this.g1 == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10469wR1
    public final void m() {
        this.h1 = true;
    }

    @Override // o.InterfaceC10469wR1
    public final void o(int i, ND1 nd1) {
        this.Z0 = i;
        this.a1 = nd1;
    }

    @Override // o.InterfaceC10469wR1
    public final void reset() {
        boolean z;
        if (this.b1 == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.Z.a();
        W();
    }

    @Override // o.InterfaceC10712xR1
    public final void s(InterfaceC10712xR1.f fVar) {
        synchronized (this.X) {
            this.j1 = fVar;
        }
    }

    @Override // o.InterfaceC10469wR1
    public final void start() throws C3824Og0 {
        boolean z = true;
        if (this.b1 != 1) {
            z = false;
        }
        C9542sf.i(z);
        this.b1 = 2;
        X();
    }

    @Override // o.InterfaceC10469wR1
    public final void stop() {
        boolean z;
        if (this.b1 == 2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.b1 = 1;
        Y();
    }

    @Override // o.InterfaceC10469wR1
    public final void u() throws IOException {
        ((IX1) C9542sf.g(this.c1)).b();
    }

    @Override // o.InterfaceC10469wR1
    public final boolean v() {
        return this.h1;
    }

    public void R() {
    }

    public void U() {
    }

    public void W() {
    }

    public void X() throws C3824Og0 {
    }

    public void Y() {
    }

    @Override // o.InterfaceC10469wR1
    public final InterfaceC10712xR1 x() {
        return this;
    }

    public void S(boolean z, boolean z2) throws C3824Og0 {
    }

    public void T(long j, boolean z) throws C3824Og0 {
    }

    @Override // o.OD1.b
    public void t(int i, @InterfaceC11300zs1 Object obj) throws C3824Og0 {
    }

    public void Z(C10833xx0[] c10833xx0Arr, long j, long j2) throws C3824Og0 {
    }
}
