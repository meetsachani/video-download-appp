package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* loaded from: classes2.dex */
final class zza implements Runnable {
    public final Runnable X;

    public zza(Runnable runnable, int i) {
        this.X = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.X.run();
    }
}
