package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class zzlq implements Runnable {
    public final /* synthetic */ zzlm X;

    public zzlq(zzlm zzlmVar) {
        this.X = zzlmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp.M(this.X.Z, new ComponentName(this.X.Z.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
