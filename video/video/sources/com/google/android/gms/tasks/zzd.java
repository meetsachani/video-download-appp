package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class zzd implements zzq {
    public final Executor a;
    public final Continuation b;
    public final zzw c;

    public zzd(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 Continuation continuation, @InterfaceC5670cr1 zzw zzwVar) {
        this.a = executor;
        this.b = continuation;
        this.c = zzwVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void d(@InterfaceC5670cr1 Task task) {
        this.a.execute(new zzc(this, task));
    }
}
