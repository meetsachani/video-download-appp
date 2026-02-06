package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhg implements Runnable {
    public final /* synthetic */ zzio X;
    public final /* synthetic */ zzhf Y;

    public zzhg(zzhf zzhfVar, zzio zzioVar) {
        this.Y = zzhfVar;
        this.X = zzioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhf.g(this.Y, this.X);
        this.Y.d(this.X.g);
    }
}
