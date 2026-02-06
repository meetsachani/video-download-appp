package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzbzx implements Executor {
    public final Handler X = new com.google.android.gms.ads.internal.util.zzf(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzv.v();
                com.google.android.gms.ads.internal.util.zzs.n(com.google.android.gms.ads.internal.zzv.t().e(), th);
                throw th;
            }
        }
        this.X.post(runnable);
    }
}
