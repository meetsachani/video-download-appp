package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjf implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ long Y0;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ zziq Z0;

    public zzjf(zziq zziqVar, String str, String str2, Object obj, long j) {
        this.Z0 = zziqVar;
        this.X = str;
        this.Y = str2;
        this.Z = obj;
        this.Y0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z0.b0(this.X, this.Y, this.Z, this.Y0);
    }
}
