package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfnc implements Runnable {
    public final /* synthetic */ zzfnh X;

    public zzfnc(zzfnh zzfnhVar) {
        this.X = zzfnhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfnb zzfnbVar;
        zzfnbVar = this.X.g;
        zzfnbVar.b();
    }
}
