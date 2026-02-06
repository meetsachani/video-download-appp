package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzo implements Runnable {
    public final /* synthetic */ Task X;
    public final /* synthetic */ zzp Y;

    public zzo(zzp zzpVar, Task task) {
        this.Y = zzpVar;
        this.X = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SuccessContinuation successContinuation;
        try {
            successContinuation = this.Y.b;
            Task a = successContinuation.a(this.X.r());
            if (a == null) {
                this.Y.e(new NullPointerException("Continuation returned null"));
                return;
            }
            zzp zzpVar = this.Y;
            Executor executor = TaskExecutors.b;
            a.l(executor, zzpVar);
            a.i(executor, this.Y);
            a.c(executor, this.Y);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.Y.e((Exception) e.getCause());
            } else {
                this.Y.e(e);
            }
        } catch (CancellationException unused) {
            this.Y.b();
        } catch (Exception e2) {
            this.Y.e(e2);
        }
    }
}
