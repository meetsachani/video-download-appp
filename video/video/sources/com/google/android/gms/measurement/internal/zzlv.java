package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlv implements Runnable {
    public final /* synthetic */ zzmp X;
    public final /* synthetic */ Runnable Y;

    public zzlv(zzlu zzluVar, zzmp zzmpVar, Runnable runnable) {
        this.X = zzmpVar;
        this.Y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.X.o0();
        this.X.y(this.Y);
        this.X.t0();
    }
}
