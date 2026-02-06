package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzjd implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ zziq Y;

    public zzjd(zziq zziqVar, long j) {
        this.Y = zziqVar;
        this.X = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.h().k.b(this.X);
        this.Y.j().F().b("Session timeout duration set", Long.valueOf(this.X));
    }
}
