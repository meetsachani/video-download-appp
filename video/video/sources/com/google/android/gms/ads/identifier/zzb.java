package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzb extends Thread {
    public final WeakReference<AdvertisingIdClient> X;
    public final long Y;
    public final CountDownLatch Z = new CountDownLatch(1);
    public boolean Y0 = false;

    public zzb(AdvertisingIdClient advertisingIdClient, long j) {
        this.X = new WeakReference<>(advertisingIdClient);
        this.Y = j;
        start();
    }

    public final void a() {
        AdvertisingIdClient advertisingIdClient = this.X.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.f();
            this.Y0 = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.Z.await(this.Y, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
