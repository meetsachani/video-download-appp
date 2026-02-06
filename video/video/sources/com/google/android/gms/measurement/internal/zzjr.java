package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjr implements Runnable {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ zziq Y;

    public zzjr(zziq zziqVar, AtomicReference atomicReference) {
        this.Y = zziqVar;
        this.X = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.X) {
            try {
                this.X.set(Integer.valueOf(this.Y.d().u(this.Y.p().F(), zzbi.P)));
                this.X.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
