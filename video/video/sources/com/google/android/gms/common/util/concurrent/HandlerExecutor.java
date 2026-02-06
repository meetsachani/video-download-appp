package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class HandlerExecutor implements Executor {
    public final Handler X;

    @KeepForSdk
    public HandlerExecutor(@InterfaceC5670cr1 Looper looper) {
        this.X = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@InterfaceC5670cr1 Runnable runnable) {
        this.X.post(runnable);
    }
}
