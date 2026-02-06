package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdlv implements zzgcu {
    public final /* synthetic */ zzcaf a;

    public zzdlv(zzdlw zzdlwVar, zzcaf zzcafVar) {
        this.a = zzcafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.d("Failed to load media data due to video view load failure.");
        this.a.d(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzcfb zzcfbVar = (zzcfb) obj;
        if (zzcfbVar != null) {
            zzcfbVar.r1("/video", new zzccu(new zzdlu(this.a)));
            zzcfbVar.c0();
            return;
        }
        this.a.d(new zzegy(1, "Missing webview from video view future."));
    }
}
