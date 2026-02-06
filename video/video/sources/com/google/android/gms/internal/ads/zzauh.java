package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
final class zzauh implements Runnable {
    private zzauh() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzauj.d(MessageDigest.getInstance("MD5"));
            countDownLatch = zzauj.e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzauj.e;
        } catch (Throwable th) {
            zzauj.e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzauh(zzaui zzauiVar) {
    }
}
