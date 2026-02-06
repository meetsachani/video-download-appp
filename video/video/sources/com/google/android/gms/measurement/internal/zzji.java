package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzji implements Runnable {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ zziq Z;

    public zzji(zziq zziqVar, AtomicReference atomicReference, boolean z) {
        this.Z = zziqVar;
        this.X = atomicReference;
        this.Y = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.t().U(this.X, this.Y);
    }
}
