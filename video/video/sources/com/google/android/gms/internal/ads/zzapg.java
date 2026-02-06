package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzapg extends Thread {
    public static final boolean b1 = zzaqg.b;
    public final BlockingQueue X;
    public final BlockingQueue Y;
    public volatile boolean Y0 = false;
    public final zzape Z;
    public final zzaqh Z0;
    public final zzapl a1;

    public zzapg(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzape zzapeVar, zzapl zzaplVar) {
        this.X = blockingQueue;
        this.Y = blockingQueue2;
        this.Z = zzapeVar;
        this.a1 = zzaplVar;
        this.Z0 = new zzaqh(this, blockingQueue2, zzaplVar);
    }

    public final void b() {
        this.Y0 = true;
        interrupt();
    }

    public final void c() throws InterruptedException {
        zzapu zzapuVar = (zzapu) this.X.take();
        zzapuVar.r("cache-queue-take");
        zzapuVar.y(1);
        try {
            zzapuVar.B();
            zzape zzapeVar = this.Z;
            zzapd w = zzapeVar.w(zzapuVar.o());
            if (w == null) {
                zzapuVar.r("cache-miss");
                if (!this.Z0.c(zzapuVar)) {
                    this.Y.put(zzapuVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (w.a(currentTimeMillis)) {
                    zzapuVar.r("cache-hit-expired");
                    zzapuVar.i(w);
                    if (!this.Z0.c(zzapuVar)) {
                        this.Y.put(zzapuVar);
                    }
                } else {
                    zzapuVar.r("cache-hit");
                    zzaqa m = zzapuVar.m(new zzapq(w.a, w.g));
                    zzapuVar.r("cache-hit-parsed");
                    if (!m.c()) {
                        zzapuVar.r("cache-parsing-failed");
                        zzapeVar.a(zzapuVar.o(), true);
                        zzapuVar.i(null);
                        if (!this.Z0.c(zzapuVar)) {
                            this.Y.put(zzapuVar);
                        }
                    } else if (w.f < currentTimeMillis) {
                        zzapuVar.r("cache-hit-refresh-needed");
                        zzapuVar.i(w);
                        m.d = true;
                        if (!this.Z0.c(zzapuVar)) {
                            this.a1.b(zzapuVar, m, new zzapf(this, zzapuVar));
                        } else {
                            this.a1.b(zzapuVar, m, null);
                        }
                    } else {
                        this.a1.b(zzapuVar, m, null);
                    }
                }
            }
            zzapuVar.y(2);
        } catch (Throwable th) {
            zzapuVar.y(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (b1) {
            zzaqg.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.Z.b();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.Y0) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqg.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
