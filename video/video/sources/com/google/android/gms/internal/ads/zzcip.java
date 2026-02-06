package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcip implements zzewu {
    public final zzcil a;
    public Context b;
    public String c;

    public /* synthetic */ zzcip(zzcil zzcilVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewu
    public final /* bridge */ /* synthetic */ zzewu a(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewu
    public final zzewv c() {
        zzhgd.c(this.b, Context.class);
        zzhgd.c(this.c, String.class);
        return new zzciq(this.a, this.b, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzewu
    public final /* bridge */ /* synthetic */ zzewu w(String str) {
        str.getClass();
        this.c = str;
        return this;
    }
}
