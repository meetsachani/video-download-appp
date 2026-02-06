package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class zzjk implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ zziq Y;

    public zzjk(zziq zziqVar, long j) {
        this.Y = zziqVar;
        this.X = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.F(this.X, true);
        this.Y.t().Q(new AtomicReference<>());
    }
}
