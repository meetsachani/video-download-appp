package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzad<T> implements zzae<T> {
    public final CountDownLatch a = new CountDownLatch(1);

    private zzad() {
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void a(T t) {
        this.a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void b() {
        this.a.countDown();
    }

    public final void c() throws InterruptedException {
        this.a.await();
    }

    public final boolean d(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(j, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void e(@InterfaceC5670cr1 Exception exc) {
        this.a.countDown();
    }

    public /* synthetic */ zzad(zzac zzacVar) {
    }
}
