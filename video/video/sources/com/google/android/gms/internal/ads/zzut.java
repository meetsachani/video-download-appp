package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzut implements zzuz, zzuy {
    public final zzvb X;
    public final long Y;
    public zzuz Y0;
    public zzvd Z;
    @InterfaceC11300zs1
    public zzuy Z0;
    public long a1 = C10323vs.b;
    public final zzzg b1;

    public zzut(zzvb zzvbVar, zzzg zzzgVar, long j) {
        this.X = zzvbVar;
        this.b1 = zzzgVar;
        this.Y = j;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean a(zzkv zzkvVar) {
        zzuz zzuzVar = this.Y0;
        if (zzuzVar != null && zzuzVar.a(zzkvVar)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long b() {
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        return zzuzVar.b();
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long c() {
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        return zzuzVar.c();
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final void d(long j) {
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        zzuzVar.d(j);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long e(long j, zzmd zzmdVar) {
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        return zzuzVar.e(j, zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long f() {
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        return zzuzVar.f();
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final zzxe g() {
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        return zzuzVar.g();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final /* bridge */ /* synthetic */ void h(zzwv zzwvVar) {
        zzuz zzuzVar = (zzuz) zzwvVar;
        zzuy zzuyVar = this.Z0;
        String str = zzeu.a;
        zzuyVar.h(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void i(zzuz zzuzVar) {
        zzuy zzuyVar = this.Z0;
        String str = zzeu.a;
        zzuyVar.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void j() throws IOException {
        zzuz zzuzVar = this.Y0;
        if (zzuzVar != null) {
            zzuzVar.j();
            return;
        }
        zzvd zzvdVar = this.Z;
        if (zzvdVar != null) {
            zzvdVar.C();
        }
    }

    public final long k() {
        return this.a1;
    }

    public final long l() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void m(zzuy zzuyVar, long j) {
        this.Z0 = zzuyVar;
        zzuz zzuzVar = this.Y0;
        if (zzuzVar != null) {
            zzuzVar.m(this, u(this.Y));
        }
    }

    public final void n(zzvb zzvbVar) {
        long u = u(this.Y);
        zzvd zzvdVar = this.Z;
        zzvdVar.getClass();
        zzuz k = zzvdVar.k(zzvbVar, this.b1, u);
        this.Y0 = k;
        if (this.Z0 != null) {
            k.m(this, u);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean o() {
        zzuz zzuzVar = this.Y0;
        if (zzuzVar != null && zzuzVar.o()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void p(long j, boolean z) {
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        zzuzVar.p(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long q(zzyq[] zzyqVarArr, boolean[] zArr, zzwt[] zzwtVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.a1;
        if (j3 != C10323vs.b && j == this.Y) {
            j2 = j3;
        } else {
            j2 = j;
        }
        this.a1 = C10323vs.b;
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        return zzuzVar.q(zzyqVarArr, zArr, zzwtVarArr, zArr2, j2);
    }

    public final void r(long j) {
        this.a1 = j;
    }

    public final void s() {
        zzuz zzuzVar = this.Y0;
        if (zzuzVar != null) {
            zzvd zzvdVar = this.Z;
            zzvdVar.getClass();
            zzvdVar.c(zzuzVar);
        }
    }

    public final void t(zzvd zzvdVar) {
        boolean z;
        if (this.Z == null) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        this.Z = zzvdVar;
    }

    public final long u(long j) {
        long j2 = this.a1;
        return j2 != C10323vs.b ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long w(long j) {
        zzuz zzuzVar = this.Y0;
        String str = zzeu.a;
        return zzuzVar.w(j);
    }
}
