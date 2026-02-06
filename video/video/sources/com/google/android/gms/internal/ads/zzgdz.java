package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgdz extends zzgco implements RunnableFuture {
    public volatile zzgdg c1;

    public zzgdz(zzgce zzgceVar) {
        this.c1 = new zzgdx(this, zzgceVar);
    }

    public static zzgdz B(Runnable runnable, Object obj) {
        return new zzgdz(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final String j() {
        zzgdg zzgdgVar = this.c1;
        if (zzgdgVar != null) {
            String obj = zzgdgVar.toString();
            return "task=[" + obj + C6566gU0.g;
        }
        return super.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final void k() {
        zzgdg zzgdgVar;
        if (w() && (zzgdgVar = this.c1) != null) {
            zzgdgVar.g();
        }
        this.c1 = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgdg zzgdgVar = this.c1;
        if (zzgdgVar != null) {
            zzgdgVar.run();
        }
        this.c1 = null;
    }

    public zzgdz(Callable callable) {
        this.c1 = new zzgdy(this, callable);
    }
}
