package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
public final class zzejd implements com.google.android.gms.ads.internal.zzg {
    public com.google.android.gms.ads.internal.zzg a;

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void a(View view) {
        com.google.android.gms.ads.internal.zzg zzgVar = this.a;
        if (zzgVar != null) {
            zzgVar.a(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void b() {
        com.google.android.gms.ads.internal.zzg zzgVar = this.a;
        if (zzgVar != null) {
            zzgVar.b();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void c() {
        com.google.android.gms.ads.internal.zzg zzgVar = this.a;
        if (zzgVar != null) {
            zzgVar.c();
        }
    }

    public final synchronized void d(com.google.android.gms.ads.internal.zzg zzgVar) {
        this.a = zzgVar;
    }
}
