package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjy implements Runnable {
    public final /* synthetic */ zzih X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ zzih Y0;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ zziq Z0;

    public zzjy(zziq zziqVar, zzih zzihVar, long j, boolean z, zzih zzihVar2) {
        this.Z0 = zziqVar;
        this.X = zzihVar;
        this.Y = j;
        this.Z = z;
        this.Y0 = zzihVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z0.K(this.X);
        zziq.O(this.Z0, this.X, this.Y, false, this.Z);
        if (zzps.a() && this.Z0.d().s(zzbi.x0)) {
            zziq.P(this.Z0, this.X, this.Y0);
        }
    }
}
