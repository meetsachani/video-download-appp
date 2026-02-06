package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzc implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ zzb Y;

    public zzc(zzb zzbVar, long j) {
        this.Y = zzbVar;
        this.X = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.B(this.X);
    }
}
