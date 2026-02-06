package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcjf implements zzezz {
    public final zzcil a;
    public Context b;
    public String c;
    public com.google.android.gms.ads.internal.client.zzr d;

    public /* synthetic */ zzcjf(zzcil zzcilVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezz
    public final /* bridge */ /* synthetic */ zzezz I(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezz
    public final /* bridge */ /* synthetic */ zzezz a(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.d = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezz
    public final /* bridge */ /* synthetic */ zzezz b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezz
    public final zzfaa f() {
        zzhgd.c(this.b, Context.class);
        zzhgd.c(this.c, String.class);
        zzhgd.c(this.d, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcjg(this.a, this.b, this.c, this.d);
    }
}
