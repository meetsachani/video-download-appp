package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjt implements Runnable {
    public final /* synthetic */ Boolean X;
    public final /* synthetic */ zziq Y;

    public zzjt(zziq zziqVar, Boolean bool) {
        this.Y = zziqVar;
        this.X = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.T(this.X, true);
    }
}
