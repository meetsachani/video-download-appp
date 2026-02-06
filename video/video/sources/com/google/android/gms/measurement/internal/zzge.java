package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzge implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ zzgb Y;

    public zzge(zzgb zzgbVar, boolean z) {
        this.Y = zzgbVar;
        this.X = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmpVar = this.Y.a;
        zzmpVar.H(this.X);
    }
}
