package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzfka extends com.google.android.gms.ads.internal.client.zzcg {
    public final zzfkg X;

    public zzfka(zzfkg zzfkgVar) {
        this.X = zzfkgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void B1(zzbpl zzbplVar) {
        zzfkg zzfkgVar = this.X;
        zzfkgVar.g(zzbplVar);
        zzfkgVar.i();
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void P2(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        this.X.h(list, zzceVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzbx S(String str) {
        return this.X.b(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbwq f0(String str) {
        return this.X.c(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean g0(String str) {
        return this.X.l(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean k2(String str) {
        return this.X.k(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean p1(String str) {
        return this.X.j(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzban u(String str) {
        return this.X.a(str);
    }
}
