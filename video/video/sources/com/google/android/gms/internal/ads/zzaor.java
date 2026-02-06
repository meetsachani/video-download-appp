package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import o.C4128Rj1;

/* loaded from: classes2.dex */
public final class zzaor implements zzadn {
    public final zzek a = new zzek(4);
    public final zzaeo b = new zzaeo(-1, -1, C4128Rj1.Q0);

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        this.b.e(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        zzek zzekVar = this.a;
        zzekVar.i(4);
        zzadd zzaddVar = (zzadd) zzadoVar;
        zzaddVar.F(zzekVar.n(), 0, 4, false);
        if (zzekVar.O() == 1380533830) {
            zzaddVar.g(4, false);
            zzekVar.i(4);
            zzaddVar.F(zzekVar.n(), 0, 4, false);
            if (zzekVar.O() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.b.i(zzadqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        return this.b.j(zzadoVar, zzaejVar);
    }
}
