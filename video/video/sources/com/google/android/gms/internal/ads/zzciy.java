package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzciy implements zzdtf {
    public final zzcil a;
    public final zzcjb b;
    public Long c;
    public String d;

    public /* synthetic */ zzciy(zzcil zzcilVar, zzcjb zzcjbVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
        this.b = zzcjbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final /* bridge */ /* synthetic */ zzdtf a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdtg c() {
        zzhgd.c(this.c, Long.class);
        zzhgd.c(this.d, String.class);
        return new zzciz(this.a, this.b, this.c, this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final /* bridge */ /* synthetic */ zzdtf w(String str) {
        str.getClass();
        this.d = str;
        return this;
    }
}
