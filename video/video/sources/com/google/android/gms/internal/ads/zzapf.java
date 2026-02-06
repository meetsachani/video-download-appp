package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzapf implements Runnable {
    public final /* synthetic */ zzapu X;
    public final /* synthetic */ zzapg Y;

    public zzapf(zzapg zzapgVar, zzapu zzapuVar) {
        this.X = zzapuVar;
        this.Y = zzapgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.Y.Y;
            blockingQueue.put(this.X);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
