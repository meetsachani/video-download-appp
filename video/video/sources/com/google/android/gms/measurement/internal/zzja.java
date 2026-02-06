package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzja implements Runnable {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ zziq Y;

    public zzja(zziq zziqVar, AtomicReference atomicReference) {
        this.Y = zziqVar;
        this.X = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.X) {
            try {
                this.X.set(Boolean.valueOf(this.Y.d().J(this.Y.p().F())));
                this.X.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
