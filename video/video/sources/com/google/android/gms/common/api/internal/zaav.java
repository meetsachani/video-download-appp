package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
import o.InterfaceC10697xN2;

/* loaded from: classes2.dex */
abstract class zaav implements Runnable {
    public final /* synthetic */ zaaw X;

    @InterfaceC10697xN2
    public abstract void a();

    @Override // java.lang.Runnable
    @InterfaceC10697xN2
    public final void run() {
        Lock lock;
        Lock lock2;
        zabi zabiVar;
        Lock lock3;
        lock = this.X.b;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock3 = this.X.b;
                } else {
                    a();
                    lock3 = this.X.b;
                }
            } catch (RuntimeException e) {
                zabiVar = this.X.a;
                zabiVar.t(e);
                lock3 = this.X.b;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.X.b;
            lock2.unlock();
            throw th;
        }
    }
}
