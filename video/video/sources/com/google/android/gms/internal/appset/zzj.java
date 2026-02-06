package com.google.android.gms.internal.appset;

import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes2.dex */
final class zzj implements Runnable {
    public final /* synthetic */ zzl X;

    public /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.X = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long a = this.X.a();
        if (a != -1 && DefaultClock.d().a() > a) {
            zzl.f(zzl.c(this.X));
        }
    }
}
