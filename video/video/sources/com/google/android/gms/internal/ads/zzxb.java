package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10323vs;

/* loaded from: classes2.dex */
final class zzxb implements zzuz, zzuy {
    public final zzuz X;
    public final long Y;
    public zzuy Z;

    public zzxb(zzuz zzuzVar, long j) {
        this.X = zzuzVar;
        this.Y = j;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean a(zzkv zzkvVar) {
        long j = zzkvVar.a;
        long j2 = this.Y;
        zzkt a = zzkvVar.a();
        a.e(j - j2);
        return this.X.a(a.g());
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long b() {
        long b = this.X.b();
        if (b == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return b + this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long c() {
        long c = this.X.c();
        if (c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c + this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final void d(long j) {
        this.X.d(j - this.Y);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long e(long j, zzmd zzmdVar) {
        long j2 = this.Y;
        return this.X.e(j - j2, zzmdVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long f() {
        long f = this.X.f();
        if (f == C10323vs.b) {
            return C10323vs.b;
        }
        return f + this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final zzxe g() {
        return this.X.g();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final /* bridge */ /* synthetic */ void h(zzwv zzwvVar) {
        zzuz zzuzVar = (zzuz) zzwvVar;
        zzuy zzuyVar = this.Z;
        zzuyVar.getClass();
        zzuyVar.h(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void i(zzuz zzuzVar) {
        zzuy zzuyVar = this.Z;
        zzuyVar.getClass();
        zzuyVar.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void j() throws IOException {
        this.X.j();
    }

    public final zzuz k() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void m(zzuy zzuyVar, long j) {
        this.Z = zzuyVar;
        this.X.m(this, j - this.Y);
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean o() {
        return this.X.o();
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void p(long j, boolean z) {
        this.X.p(j - this.Y, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long q(zzyq[] zzyqVarArr, boolean[] zArr, zzwt[] zzwtVarArr, boolean[] zArr2, long j) {
        zzwt[] zzwtVarArr2 = new zzwt[zzwtVarArr.length];
        int i = 0;
        while (true) {
            zzwt zzwtVar = null;
            if (i >= zzwtVarArr.length) {
                break;
            }
            zzxa zzxaVar = (zzxa) zzwtVarArr[i];
            if (zzxaVar != null) {
                zzwtVar = zzxaVar.c();
            }
            zzwtVarArr2[i] = zzwtVar;
            i++;
        }
        zzuz zzuzVar = this.X;
        long j2 = this.Y;
        long q = zzuzVar.q(zzyqVarArr, zArr, zzwtVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzwtVarArr.length; i2++) {
            zzwt zzwtVar2 = zzwtVarArr2[i2];
            if (zzwtVar2 == null) {
                zzwtVarArr[i2] = null;
            } else {
                zzwt zzwtVar3 = zzwtVarArr[i2];
                if (zzwtVar3 == null || ((zzxa) zzwtVar3).c() != zzwtVar2) {
                    zzwtVarArr[i2] = new zzxa(zzwtVar2, j2);
                }
            }
        }
        return q + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long w(long j) {
        long j2 = this.Y;
        return this.X.w(j - j2) + j2;
    }
}
