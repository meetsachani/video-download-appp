package com.google.android.gms.ads.internal.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zza implements Runnable {
    public final /* synthetic */ zzb X;

    public zza(zzb zzbVar) {
        this.X = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.X;
        zzbVar.b = Thread.currentThread();
        zzbVar.a();
    }
}
