package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnv implements zzcah {
    public final /* synthetic */ zzbnt a;

    public zzbnv(zzbny zzbnyVar, zzbnt zzbntVar) {
        this.a = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcah
    public final void a() {
        com.google.android.gms.ads.internal.util.zze.k("Rejecting reference for JS Engine.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V7)).booleanValue()) {
            this.a.d(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.a.c();
        }
    }
}
