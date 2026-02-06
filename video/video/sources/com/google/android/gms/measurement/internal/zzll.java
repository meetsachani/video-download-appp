package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzll implements Runnable {
    public final /* synthetic */ zzfk X;
    public final /* synthetic */ zzlm Y;

    public zzll(zzlm zzlmVar, zzfk zzfkVar) {
        this.Y = zzlmVar;
        this.X = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.Y) {
            try {
                this.Y.X = false;
                if (!this.Y.Z.d0()) {
                    this.Y.Z.j().K().a("Connected to service");
                    this.Y.Z.J(this.X);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
