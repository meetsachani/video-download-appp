package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class zzp<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {
    public final Executor a;
    public final SuccessContinuation b;
    public final zzw c;

    public zzp(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 SuccessContinuation successContinuation, @InterfaceC5670cr1 zzw zzwVar) {
        this.a = executor;
        this.b = successContinuation;
        this.c = zzwVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void a(TContinuationResult tcontinuationresult) {
        this.c.z(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void b() {
        this.c.A();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void d(@InterfaceC5670cr1 Task task) {
        this.a.execute(new zzo(this, task));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void e(@InterfaceC5670cr1 Exception exc) {
        this.c.y(exc);
    }
}
