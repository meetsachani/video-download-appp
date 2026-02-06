package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class zzh implements zzq {
    public final Executor a;
    public final Object b = new Object();
    @InterfaceC10571ws1
    public OnCanceledListener c;

    public zzh(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnCanceledListener onCanceledListener) {
        this.a = executor;
        this.c = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void c() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void d(@InterfaceC5670cr1 Task task) {
        if (task.t()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new zzg(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
