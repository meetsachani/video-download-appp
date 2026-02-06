package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcjm implements com.google.android.gms.ads.nonagon.signalgeneration.zzab {
    public final zzcil a;
    public zzcvc b;
    public com.google.android.gms.ads.nonagon.signalgeneration.zzaz c;

    public /* synthetic */ zzcjm(zzcil zzcilVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab a(zzcvc zzcvcVar) {
        this.b = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab b(com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzazVar) {
        this.c = zzazVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac c() {
        zzhgd.c(this.b, zzcvc.class);
        zzhgd.c(this.c, com.google.android.gms.ads.nonagon.signalgeneration.zzaz.class);
        return new zzcjn(this.a, this.c, new zzcsd(), new zzcue(), new zzdss(), this.b, null, null);
    }
}
