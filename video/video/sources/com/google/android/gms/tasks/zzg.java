package com.google.android.gms.tasks;

/* loaded from: classes3.dex */
final class zzg implements Runnable {
    public final /* synthetic */ zzh X;

    public zzg(zzh zzhVar) {
        this.X = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCanceledListener onCanceledListener;
        OnCanceledListener onCanceledListener2;
        obj = this.X.b;
        synchronized (obj) {
            try {
                zzh zzhVar = this.X;
                onCanceledListener = zzhVar.c;
                if (onCanceledListener != null) {
                    onCanceledListener2 = zzhVar.c;
                    onCanceledListener2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
