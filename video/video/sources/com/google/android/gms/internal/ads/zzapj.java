package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzapj implements Executor {
    public final /* synthetic */ Handler X;

    public zzapj(zzapl zzaplVar, Handler handler) {
        this.X = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.post(runnable);
    }
}
