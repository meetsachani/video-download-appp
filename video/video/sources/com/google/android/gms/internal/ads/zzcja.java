package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcja implements zzdtn {
    public final zzcil a;
    public Context b;
    public zzbkv c;

    public /* synthetic */ zzcja(zzcil zzcilVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* bridge */ /* synthetic */ zzdtn a(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* bridge */ /* synthetic */ zzdtn b(zzbkv zzbkvVar) {
        zzbkvVar.getClass();
        this.c = zzbkvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final zzdto c() {
        zzhgd.c(this.b, Context.class);
        zzhgd.c(this.c, zzbkv.class);
        return new zzcjb(this.a, this.b, this.c);
    }
}
