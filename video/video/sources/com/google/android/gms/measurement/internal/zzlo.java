package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class zzlo implements Runnable {
    public final /* synthetic */ ComponentName X;
    public final /* synthetic */ zzlm Y;

    public zzlo(zzlm zzlmVar, ComponentName componentName) {
        this.Y = zzlmVar;
        this.X = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp.M(this.Y.Z, this.X);
    }
}
