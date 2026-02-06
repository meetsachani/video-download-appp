package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzn implements zzq {
    public final Executor a;
    public final Object b = new Object();
    @InterfaceC10571ws1
    public OnSuccessListener c;

    public zzn(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnSuccessListener onSuccessListener) {
        this.a = executor;
        this.c = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void c() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void d(@InterfaceC5670cr1 Task task) {
        if (task.v()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new zzm(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
