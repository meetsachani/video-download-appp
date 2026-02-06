package com.google.android.gms.internal.ads;

import android.content.Context;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzcjh implements zzfbn {
    public final zzcil a;
    public Context b;
    public String c;

    public /* synthetic */ zzcjh(zzcil zzcilVar, zzcjp zzcjpVar) {
        this.a = zzcilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbn
    public final /* bridge */ /* synthetic */ zzfbn a(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbn
    public final zzfbo c() {
        zzhgd.c(this.b, Context.class);
        return new zzcji(this.a, this.b, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzfbn
    public final /* synthetic */ zzfbn w(@InterfaceC11300zs1 String str) {
        this.c = str;
        return this;
    }
}
