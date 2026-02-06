package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzciu implements zzeyi {
    public final zzcil a;
    public Context b;
    public String c;
    public com.google.android.gms.ads.internal.client.zzr d;

    public /* synthetic */ zzciu(zzcil zzcilVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final /* bridge */ /* synthetic */ zzeyi I(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final /* bridge */ /* synthetic */ zzeyi a(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.d = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final /* bridge */ /* synthetic */ zzeyi b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final zzeyj f() {
        zzhgd.c(this.b, Context.class);
        zzhgd.c(this.c, String.class);
        zzhgd.c(this.d, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzciv(this.a, this.b, this.c, this.d);
    }
}
