package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
abstract class zabg {
    public final zabf a;

    public zabg(zabf zabfVar) {
        this.a = zabfVar;
    }

    public abstract void a();

    public final void b(zabi zabiVar) {
        Lock lock;
        Lock lock2;
        zabf zabfVar;
        Lock lock3;
        lock = zabiVar.X;
        lock.lock();
        try {
            zabfVar = zabiVar.f1;
            if (zabfVar != this.a) {
                lock3 = zabiVar.X;
            } else {
                a();
                lock3 = zabiVar.X;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = zabiVar.X;
            lock2.unlock();
            throw th;
        }
    }
}
