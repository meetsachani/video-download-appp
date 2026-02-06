package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class zav implements Runnable {
    public final /* synthetic */ zaaa X;

    public zav(zaaa zaaaVar) {
        this.X = zaaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.X.h1;
        lock.lock();
        try {
            zaaa.C(this.X);
        } finally {
            lock2 = this.X.h1;
            lock2.unlock();
        }
    }
}
