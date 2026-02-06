package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class zzeix implements com.google.android.gms.ads.internal.zzg {
    public final /* synthetic */ zzcaf a;
    public final /* synthetic */ zzfcg b;
    public final /* synthetic */ zzfbu c;
    public final /* synthetic */ zzejd d;
    public final /* synthetic */ zzeiy e;

    public zzeix(zzeiy zzeiyVar, zzcaf zzcafVar, zzfcg zzfcgVar, zzfbu zzfbuVar, zzejd zzejdVar) {
        this.a = zzcafVar;
        this.b = zzfcgVar;
        this.c = zzfbuVar;
        this.d = zzejdVar;
        this.e = zzeiyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void a(View view) {
        zzejh zzejhVar;
        zzejd zzejdVar = this.d;
        zzejhVar = this.e.d;
        this.a.c(zzejhVar.a(this.b, this.c, view, zzejdVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void b() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void c() {
    }
}
