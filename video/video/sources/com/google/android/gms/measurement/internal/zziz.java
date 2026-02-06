package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziz implements Executor {
    public final /* synthetic */ zziq X;

    public zziz(zziq zziqVar) {
        this.X = zziqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.l().D(runnable);
    }
}
