package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zze implements Runnable {
    public final /* synthetic */ Task X;
    public final /* synthetic */ zzf Y;

    public zze(zzf zzfVar, Task task) {
        this.Y = zzfVar;
        this.X = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        zzw zzwVar3;
        Continuation continuation;
        try {
            continuation = this.Y.b;
            Task task = (Task) continuation.a(this.X);
            if (task == null) {
                this.Y.e(new NullPointerException("Continuation returned null"));
                return;
            }
            zzf zzfVar = this.Y;
            Executor executor = TaskExecutors.b;
            task.l(executor, zzfVar);
            task.i(executor, this.Y);
            task.c(executor, this.Y);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                zzwVar3 = this.Y.c;
                zzwVar3.y((Exception) e.getCause());
                return;
            }
            zzwVar2 = this.Y.c;
            zzwVar2.y(e);
        } catch (Exception e2) {
            zzwVar = this.Y.c;
            zzwVar.y(e2);
        }
    }
}
