package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjn implements Runnable {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ String Y = null;
    public final /* synthetic */ String Y0;
    public final /* synthetic */ String Z;
    public final /* synthetic */ boolean Z0;
    public final /* synthetic */ zziq a1;

    public zzjn(zziq zziqVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.a1 = zziqVar;
        this.X = atomicReference;
        this.Z = str2;
        this.Y0 = str3;
        this.Z0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a1.a.J().T(this.X, null, this.Z, this.Y0, this.Z0);
    }
}
