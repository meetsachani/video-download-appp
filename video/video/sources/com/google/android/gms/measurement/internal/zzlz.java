package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzlz implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ zzlx Y;

    public zzlz(zzlx zzlxVar, long j) {
        this.Y = zzlxVar;
        this.X = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlx.C(this.Y, this.X);
    }
}
