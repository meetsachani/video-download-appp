package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgcv implements Runnable {
    public final Future X;
    public final zzgcu Y;

    public zzgcv(Future future, zzgcu zzgcuVar) {
        this.X = future;
        this.Y = zzgcuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable a;
        Future future = this.X;
        if ((future instanceof zzgec) && (a = zzged.a((zzgec) future)) != null) {
            this.Y.a(a);
            return;
        }
        try {
            this.Y.c(zzgcy.p(future));
        } catch (ExecutionException e) {
            this.Y.a(e.getCause());
        } catch (Throwable th) {
            this.Y.a(th);
        }
    }

    public final String toString() {
        zzfuw a = zzfuy.a(this);
        a.a(this.Y);
        return a.toString();
    }
}
