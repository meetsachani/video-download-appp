package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class zzj implements zzq {
    public final Executor a;
    public final Object b = new Object();
    @InterfaceC10571ws1
    public OnCompleteListener c;

    public zzj(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnCompleteListener onCompleteListener) {
        this.a = executor;
        this.c = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void c() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void d(@InterfaceC5670cr1 Task task) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new zzi(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
