package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zza implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ zzb Z;

    public zza(zzb zzbVar, String str, long j) {
        this.Z = zzbVar;
        this.X = str;
        this.Y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb.y(this.Z, this.X, this.Y);
    }
}
