package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzapo extends Thread {
    public final BlockingQueue X;
    public final zzapn Y;
    public volatile boolean Y0 = false;
    public final zzape Z;
    public final zzapl Z0;

    public zzapo(BlockingQueue blockingQueue, zzapn zzapnVar, zzape zzapeVar, zzapl zzaplVar) {
        this.X = blockingQueue;
        this.Y = zzapnVar;
        this.Z = zzapeVar;
        this.Z0 = zzaplVar;
    }

    public final void a() {
        this.Y0 = true;
        interrupt();
    }

    public final void b() throws InterruptedException {
        zzapu zzapuVar = (zzapu) this.X.take();
        SystemClock.elapsedRealtime();
        zzapuVar.y(3);
        try {
            try {
                zzapuVar.r("network-queue-take");
                zzapuVar.B();
                TrafficStats.setThreadStatsTag(zzapuVar.g());
                zzapq a = this.Y.a(zzapuVar);
                zzapuVar.r("network-http-complete");
                if (a.e && zzapuVar.A()) {
                    zzapuVar.u("not-modified");
                    zzapuVar.w();
                } else {
                    zzaqa m = zzapuVar.m(a);
                    zzapuVar.r("network-parse-complete");
                    zzapd zzapdVar = m.b;
                    if (zzapdVar != null) {
                        this.Z.c(zzapuVar.o(), zzapdVar);
                        zzapuVar.r("network-cache-written");
                    }
                    zzapuVar.v();
                    this.Z0.b(zzapuVar, m, null);
                    zzapuVar.x(m);
                }
            } catch (zzaqd e) {
                SystemClock.elapsedRealtime();
                this.Z0.a(zzapuVar, e);
                zzapuVar.w();
            } catch (Exception e2) {
                zzaqg.c(e2, "Unhandled exception %s", e2.toString());
                zzaqd zzaqdVar = new zzaqd(e2);
                SystemClock.elapsedRealtime();
                this.Z0.a(zzapuVar, zzaqdVar);
                zzapuVar.w();
            }
            zzapuVar.y(4);
        } catch (Throwable th) {
            zzapuVar.y(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.Y0) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqg.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
