package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjw implements Runnable {
    public final /* synthetic */ zzay X;
    public final /* synthetic */ zziq Y;

    public zzjw(zziq zziqVar, zzay zzayVar) {
        this.Y = zziqVar;
        this.X = zzayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.Y.h().z(this.X)) {
            this.Y.t().V(false);
        } else {
            this.Y.j().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.X.a()));
        }
    }
}
