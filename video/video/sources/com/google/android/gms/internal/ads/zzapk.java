package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzapk implements Runnable {
    public final zzapu X;
    public final zzaqa Y;
    public final Runnable Z;

    public zzapk(zzapu zzapuVar, zzaqa zzaqaVar, Runnable runnable) {
        this.X = zzapuVar;
        this.Y = zzaqaVar;
        this.Z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapu zzapuVar = this.X;
        zzapuVar.B();
        zzaqa zzaqaVar = this.Y;
        if (zzaqaVar.c()) {
            zzapuVar.t(zzaqaVar.a);
        } else {
            zzapuVar.s(zzaqaVar.c);
        }
        if (zzaqaVar.d) {
            zzapuVar.r("intermediate-response");
        } else {
            zzapuVar.u("done");
        }
        Runnable runnable = this.Z;
        if (runnable != null) {
            runnable.run();
        }
    }
}
