package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class zzu implements Executor {
    public final Handler X = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@InterfaceC5670cr1 Runnable runnable) {
        this.X.post(runnable);
    }
}
