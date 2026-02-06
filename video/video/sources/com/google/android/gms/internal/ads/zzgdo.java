package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbm;
import o.C6566gU0;

/* loaded from: classes2.dex */
final class zzgdo extends zzgbm.zzf implements Runnable {
    public final Runnable c1;

    public zzgdo(Runnable runnable) {
        runnable.getClass();
        this.c1 = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final String j() {
        String obj = this.c1.toString();
        return "task=[" + obj + C6566gU0.g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c1.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
