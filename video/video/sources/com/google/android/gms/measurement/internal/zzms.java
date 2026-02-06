package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzms implements Runnable {
    public final /* synthetic */ zzna X;
    public final /* synthetic */ zzmp Y;

    public zzms(zzmp zzmpVar, zzna zznaVar) {
        this.Y = zzmpVar;
        this.X = zznaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp.w(this.Y, this.X);
        this.Y.s0();
    }
}
