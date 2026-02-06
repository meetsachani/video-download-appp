package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkm implements Runnable {
    public final /* synthetic */ zzki X;
    public final /* synthetic */ zzki Y;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ long Z;
    public final /* synthetic */ zzkh Z0;

    public zzkm(zzkh zzkhVar, zzki zzkiVar, zzki zzkiVar2, long j, boolean z) {
        this.Z0 = zzkhVar;
        this.X = zzkiVar;
        this.Y = zzkiVar2;
        this.Z = j;
        this.Y0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z0.N(this.X, this.Y, this.Z, this.Y0, null);
    }
}
