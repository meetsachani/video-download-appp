package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgdg extends AtomicReference implements Runnable {
    public static final Runnable X = new zzgde(null);
    public static final Runnable Y = new zzgde(null);

    public abstract Object a() throws Exception;

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgdd zzgddVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzgdd)) {
                if (runnable != Y) {
                    break;
                }
            } else {
                zzgddVar = (zzgdd) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = Y;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (Thread.interrupted() || z) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LockSupport.park(zzgddVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean f();

    public final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgdd zzgddVar = new zzgdd(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzgddVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(X)) == Y) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(X)) == Y) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean f = f();
            if (!f) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        zzgdr.a(th);
                        if (!compareAndSet(currentThread, X)) {
                            c(currentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, X)) {
                            c(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, X)) {
                c(currentThread);
            }
            if (!f) {
                e(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == X) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzgdd) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + C6566gU0.g;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + C6566gU0.h + b();
    }
}
