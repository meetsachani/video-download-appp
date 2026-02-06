package com.google.android.gms.internal.ads;

import o.C4128Rj1;

/* loaded from: classes2.dex */
final class zzail implements zzaii {
    public final int a;
    public final int b;
    public final zzek c;

    public zzail(zzfa zzfaVar, zzz zzzVar) {
        zzek zzekVar = zzfaVar.b;
        this.c = zzekVar;
        zzekVar.l(12);
        int J = zzekVar.J();
        if (C4128Rj1.N.equals(zzzVar.f301o)) {
            int F = zzeu.F(zzzVar.G) * zzzVar.E;
            if (J == 0 || J % F != 0) {
                zzdx.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + F + ", stsz sample size: " + J);
                J = F;
            }
        }
        this.a = J == 0 ? -1 : J;
        this.b = zzekVar.J();
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int c() {
        int i = this.a;
        if (i == -1) {
            return this.c.J();
        }
        return i;
    }
}
