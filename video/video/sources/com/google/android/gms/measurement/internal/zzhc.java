package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhc extends Thread {
    public final Object X;
    public final BlockingQueue<zzhd<?>> Y;
    public final /* synthetic */ zzgy Y0;
    @InterfaceC8710pF0("threadLifeCycleLock")
    public boolean Z = false;

    public zzhc(zzgy zzgyVar, String str, BlockingQueue<zzhd<?>> blockingQueue) {
        this.Y0 = zzgyVar;
        Preconditions.r(str);
        Preconditions.r(blockingQueue);
        this.X = new Object();
        this.Y = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.X) {
            this.X.notifyAll();
        }
    }

    public final void b(InterruptedException interruptedException) {
        zzft L = this.Y0.j().L();
        String name = getName();
        L.b(name + " was interrupted", interruptedException);
    }

    public final void c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzhc zzhcVar;
        zzhc zzhcVar2;
        obj = this.Y0.i;
        synchronized (obj) {
            try {
                if (!this.Z) {
                    semaphore = this.Y0.j;
                    semaphore.release();
                    obj2 = this.Y0.i;
                    obj2.notifyAll();
                    zzhcVar = this.Y0.c;
                    if (this == zzhcVar) {
                        this.Y0.c = null;
                    } else {
                        zzhcVar2 = this.Y0.d;
                        if (this == zzhcVar2) {
                            this.Y0.d = null;
                        } else {
                            this.Y0.j().G().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.Z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        Object obj;
        boolean z;
        Semaphore semaphore;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore = this.Y0.j;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzhd<?> poll = this.Y.poll();
                if (poll != null) {
                    if (poll.Y) {
                        i = threadPriority;
                    } else {
                        i = 10;
                    }
                    Process.setThreadPriority(i);
                    poll.run();
                } else {
                    synchronized (this.X) {
                        if (this.Y.peek() == null) {
                            z = this.Y0.k;
                            if (!z) {
                                try {
                                    this.X.wait(30000L);
                                } catch (InterruptedException e2) {
                                    b(e2);
                                }
                            }
                        }
                    }
                    obj = this.Y0.i;
                    synchronized (obj) {
                        if (this.Y.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
