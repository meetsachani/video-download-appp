package com.google.firebase.installations;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AwaitListener implements OnCompleteListener<Void> {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void a(@InterfaceC5670cr1 Task<Void> task) {
        this.a.countDown();
    }

    public boolean b(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(j, timeUnit);
    }

    public void c() {
        this.a.countDown();
    }
}
