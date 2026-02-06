package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzko implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ zzkh Y;

    public zzko(zzkh zzkhVar, long j) {
        this.Y = zzkhVar;
        this.X = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.o().v(this.X);
        this.Y.e = null;
    }
}
