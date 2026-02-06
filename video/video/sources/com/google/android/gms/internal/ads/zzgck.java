package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgck extends zzgdg {
    public final /* synthetic */ zzgcl Y0;
    public final Executor Z;

    public zzgck(zzgcl zzgclVar, Executor executor) {
        this.Y0 = zzgclVar;
        executor.getClass();
        this.Z = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final void d(Throwable th) {
        zzgcl zzgclVar = this.Y0;
        zzgclVar.k1 = null;
        if (th instanceof ExecutionException) {
            zzgclVar.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzgclVar.cancel(false);
        } else {
            zzgclVar.m(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final void e(Object obj) {
        this.Y0.k1 = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final boolean f() {
        return this.Y0.isDone();
    }

    public abstract void h(Object obj);

    public final void i() {
        try {
            this.Z.execute(this);
        } catch (RejectedExecutionException e) {
            this.Y0.m(e);
        }
    }
}
