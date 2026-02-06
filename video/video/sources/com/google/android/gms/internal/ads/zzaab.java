package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzaab implements zzaac {
    public final /* synthetic */ Executor X;
    public final /* synthetic */ zzdk Y;

    public zzaab(Executor executor, zzdk zzdkVar) {
        this.X = executor;
        this.Y = zzdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void a() {
        this.Y.b(this.X);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.execute(runnable);
    }
}
