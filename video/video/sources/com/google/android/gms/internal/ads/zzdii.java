package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdii implements zzgcu {
    public final /* synthetic */ View a;
    public final /* synthetic */ zzdij b;

    public zzdii(zzdij zzdijVar, View view) {
        this.a = view;
        this.b = zzdijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E5)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.t().w(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.b.P(this.a, (zzeda) obj);
    }
}
