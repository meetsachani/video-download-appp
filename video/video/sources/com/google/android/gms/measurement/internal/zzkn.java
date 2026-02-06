package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkn implements Runnable {
    public final /* synthetic */ zzki X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ zzkh Z;

    public zzkn(zzkh zzkhVar, zzki zzkiVar, long j) {
        this.Z = zzkhVar;
        this.X = zzkiVar;
        this.Y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.O(this.X, false, this.Y);
        zzkh zzkhVar = this.Z;
        zzkhVar.e = null;
        zzkhVar.t().L(null);
    }
}
