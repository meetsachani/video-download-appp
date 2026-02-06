package com.google.android.gms.tasks;

/* loaded from: classes3.dex */
final class zzc implements Runnable {
    public final /* synthetic */ Task X;
    public final /* synthetic */ zzd Y;

    public zzc(zzd zzdVar, Task task) {
        this.Y = zzdVar;
        this.X = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        zzw zzwVar3;
        Continuation continuation;
        zzw zzwVar4;
        zzw zzwVar5;
        if (this.X.t()) {
            zzwVar5 = this.Y.c;
            zzwVar5.A();
            return;
        }
        try {
            continuation = this.Y.b;
            Object a = continuation.a(this.X);
            zzwVar4 = this.Y.c;
            zzwVar4.z(a);
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
