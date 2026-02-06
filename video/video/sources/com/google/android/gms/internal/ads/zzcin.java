package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzcin implements zzcoc {
    public final zzcil a;
    public zzezp b;
    public zzeys c;
    public zzdbr d;
    public zzcvc e;

    public /* synthetic */ zzcin(zzcil zzcilVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final /* bridge */ /* synthetic */ zzcoc a(zzcvc zzcvcVar) {
        this.e = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    /* renamed from: d */
    public final zzcod h() {
        zzhgd.c(this.d, zzdbr.class);
        zzhgd.c(this.e, zzcvc.class);
        return new zzcio(this.a, new zzcsd(), new zzfdu(), new zzcue(), new zzdss(), this.d, this.e, zzehf.a(), null, this.b, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final /* bridge */ /* synthetic */ zzcoc f(zzdbr zzdbrVar) {
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
