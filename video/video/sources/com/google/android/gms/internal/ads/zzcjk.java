package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzcjk implements zzdol {
    public final zzcil a;
    public zzezp b;
    public zzeys c;
    public zzdbr d;
    public zzcvc e;

    public /* synthetic */ zzcjk(zzcil zzcilVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdol
    public final /* bridge */ /* synthetic */ zzdol a(zzcvc zzcvcVar) {
        this.e = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    /* renamed from: d */
    public final zzdom h() {
        zzhgd.c(this.d, zzdbr.class);
        zzhgd.c(this.e, zzcvc.class);
        return new zzcjl(this.a, new zzcsd(), new zzfdu(), new zzcue(), new zzdss(), this.d, this.e, zzehf.a(), null, this.b, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzdol
    public final /* bridge */ /* synthetic */ zzdol f(zzdbr zzdbrVar) {
        this.d = zzdbrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy o(@InterfaceC11300zs1 zzeys zzeysVar) {
        this.c = zzeysVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy u(@InterfaceC11300zs1 zzezp zzezpVar) {
        this.b = zzezpVar;
        return this;
    }
}
