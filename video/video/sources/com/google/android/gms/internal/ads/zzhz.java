package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public abstract class zzhz implements zzlv, zzly {
    public final int Y;
    @InterfaceC11300zs1
    public zzlz Y0;
    public int Z0;
    public zzpc a1;
    public zzdg b1;
    public int c1;
    @InterfaceC11300zs1
    public zzwt d1;
    @InterfaceC11300zs1
    public zzz[] e1;
    public long f1;
    public long g1;
    public boolean i1;
    public boolean j1;
    @InterfaceC11300zs1
    public zzvb l1;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1
    public zzlx m1;
    public final Object X = new Object();
    public final zzkq Z = new zzkq();
    public long h1 = Long.MIN_VALUE;
    public zzbl k1 = zzbl.a;

    public zzhz(int i) {
        this.Y = i;
    }

    public final void A() {
        zzlx zzlxVar;
        synchronized (this.X) {
            zzlxVar = this.m1;
        }
        if (zzlxVar != null) {
            zzlxVar.a(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void B() throws IOException {
        zzwt zzwtVar = this.d1;
        zzwtVar.getClass();
        zzwtVar.f();
    }

    public void C() {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void D() {
        boolean z;
        if (this.c1 == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        zzkq zzkqVar = this.Z;
        zzkqVar.b = null;
        zzkqVar.a = null;
        C();
    }

    public void E() throws zzik {
    }

    public void F() {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void G() {
        this.i1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void H() throws zzik {
        boolean z = true;
        if (this.c1 != 1) {
            z = false;
        }
        zzdc.f(z);
        this.c1 = 2;
        E();
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final boolean I() {
        return this.i1;
    }

    public void J(zzz[] zzzVarArr, long j, long j2, zzvb zzvbVar) throws zzik {
    }

    public final boolean K() {
        if (d0()) {
            return this.i1;
        }
        zzwt zzwtVar = this.d1;
        zzwtVar.getClass();
        return zzwtVar.d();
    }

    public final zzz[] L() {
        zzz[] zzzVarArr = this.e1;
        zzzVarArr.getClass();
        return zzzVarArr;
    }

    public final void M(long j, boolean z) throws zzik {
        this.i1 = false;
        this.g1 = j;
        this.h1 = j;
        c0(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void N() {
        boolean z;
        if (this.c1 == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        z();
    }

    public final int O(zzkq zzkqVar, zzhp zzhpVar, int i) {
        zzwt zzwtVar = this.d1;
        zzwtVar.getClass();
        int b = zzwtVar.b(zzkqVar, zzhpVar, i);
        if (b == -4) {
            if (zzhpVar.f()) {
                this.h1 = Long.MIN_VALUE;
                if (this.i1) {
                    return -4;
                }
                return -3;
            }
            long j = zzhpVar.f + this.f1;
            zzhpVar.f = j;
            this.h1 = Math.max(this.h1, j);
            return b;
        }
        if (b == -5) {
            zzz zzzVar = zzkqVar.a;
            zzzVar.getClass();
            long j2 = zzzVar.t;
            if (j2 != Long.MAX_VALUE) {
                zzx b2 = zzzVar.b();
                b2.I(j2 + this.f1);
                zzkqVar.a = b2.K();
                return -5;
            }
        }
        return b;
    }

    public final zzik P(Throwable th, @InterfaceC11300zs1 zzz zzzVar, boolean z, int i) {
        int i2 = 4;
        if (zzzVar != null && !this.j1) {
            this.j1 = true;
            try {
                i2 = k(zzzVar) & 7;
            } catch (zzik unused) {
            } finally {
                this.j1 = false;
            }
        }
        return zzik.b(th, X(), this.Z0, zzzVar, i2, this.l1, z, i);
    }

    public final int Q(long j) {
        zzwt zzwtVar = this.d1;
        zzwtVar.getClass();
        return zzwtVar.a(j - this.f1);
    }

    public final long R() {
        return this.g1;
    }

    public final zzbl S() {
        return this.k1;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void T() {
        boolean z;
        if (this.c1 == 2) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        this.c1 = 1;
        F();
    }

    public final zzdg U() {
        zzdg zzdgVar = this.b1;
        zzdgVar.getClass();
        return zzdgVar;
    }

    public final zzkq W() {
        zzkq zzkqVar = this.Z;
        zzkqVar.b = null;
        zzkqVar.a = null;
        return zzkqVar;
    }

    public final zzlz Y() {
        zzlz zzlzVar = this.Y0;
        zzlzVar.getClass();
        return zzlzVar;
    }

    public final zzpc Z() {
        zzpc zzpcVar = this.a1;
        zzpcVar.getClass();
        return zzpcVar;
    }

    public void a0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzlv, com.google.android.gms.internal.ads.zzly
    public final int b() {
        return this.Y;
    }

    public void b0(boolean z, boolean z2) throws zzik {
    }

    public void c0(long j, boolean z) throws zzik {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public int d() throws zzik {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final boolean d0() {
        return this.h1 == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void e(zzlx zzlxVar) {
        synchronized (this.X) {
            this.m1 = zzlxVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void f(zzz[] zzzVarArr, zzwt zzwtVar, long j, long j2, zzvb zzvbVar) throws zzik {
        zzdc.f(!this.i1);
        this.d1 = zzwtVar;
        this.l1 = zzvbVar;
        if (this.h1 == Long.MIN_VALUE) {
            this.h1 = j;
        }
        this.e1 = zzzVarArr;
        this.f1 = j2;
        J(zzzVarArr, j, j2, zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void h(int i, zzpc zzpcVar, zzdg zzdgVar) {
        this.Z0 = i;
        this.a1 = zzpcVar;
        this.b1 = zzdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    @InterfaceC11300zs1
    public zzkw l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final zzly m() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final int n() {
        return this.c1;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    @InterfaceC11300zs1
    public final zzwt o() {
        return this.d1;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void q(long j) throws zzik {
        M(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void r() {
        synchronized (this.X) {
            this.m1 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void s(zzlz zzlzVar, zzz[] zzzVarArr, zzwt zzwtVar, long j, boolean z, boolean z2, long j2, long j3, zzvb zzvbVar) throws zzik {
        boolean z3;
        if (this.c1 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzdc.f(z3);
        this.Y0 = zzlzVar;
        this.l1 = zzvbVar;
        this.c1 = 1;
        b0(z, z2);
        f(zzzVarArr, zzwtVar, j2, j3, zzvbVar);
        M(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void t(zzbl zzblVar) {
        if (!Objects.equals(this.k1, zzblVar)) {
            this.k1 = zzblVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public /* synthetic */ void u(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public /* synthetic */ void v() {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public void w(int i, @InterfaceC11300zs1 Object obj) throws zzik {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void x() {
        boolean z = true;
        if (this.c1 != 1) {
            z = false;
        }
        zzdc.f(z);
        zzkq zzkqVar = this.Z;
        zzkqVar.b = null;
        zzkqVar.a = null;
        this.c1 = 0;
        this.d1 = null;
        this.e1 = null;
        this.i1 = false;
        a0();
        this.l1 = null;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final long y() {
        return this.h1;
    }

    public void z() {
    }
}
