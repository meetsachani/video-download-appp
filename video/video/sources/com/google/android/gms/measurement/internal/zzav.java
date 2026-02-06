package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzav implements Runnable {
    public final /* synthetic */ zzif X;
    public final /* synthetic */ zzaw Y;

    public zzav(zzaw zzawVar, zzif zzifVar) {
        this.Y = zzawVar;
        this.X = zzifVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.X.f();
        if (zzae.a()) {
            this.X.l().D(this);
            return;
        }
        boolean e = this.Y.e();
        this.Y.c = 0L;
        if (e) {
            this.Y.d();
        }
    }
}
