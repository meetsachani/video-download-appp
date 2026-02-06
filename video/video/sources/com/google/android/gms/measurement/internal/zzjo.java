package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjo implements Runnable {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ String Y = null;
    public final /* synthetic */ String Y0;
    public final /* synthetic */ String Z;
    public final /* synthetic */ zziq Z0;

    public zzjo(zziq zziqVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.Z0 = zziqVar;
        this.X = atomicReference;
        this.Z = str2;
        this.Y0 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z0.a.J().S(this.X, null, this.Z, this.Y0);
    }
}
