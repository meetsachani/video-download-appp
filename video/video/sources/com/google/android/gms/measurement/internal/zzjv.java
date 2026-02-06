package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjv implements Runnable {
    public final /* synthetic */ zzih X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ long Z;
    public final /* synthetic */ zzih Z0;
    public final /* synthetic */ zziq a1;

    public zzjv(zziq zziqVar, zzih zzihVar, long j, long j2, boolean z, zzih zzihVar2) {
        this.a1 = zziqVar;
        this.X = zzihVar;
        this.Y = j;
        this.Z = j2;
        this.Y0 = z;
        this.Z0 = zzihVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a1.K(this.X);
        this.a1.F(this.Y, false);
        zziq.O(this.a1, this.X, this.Z, true, this.Y0);
        if (zzps.a() && this.a1.d().s(zzbi.x0)) {
            zziq.P(this.a1, this.X, this.Z0);
        }
    }
}
