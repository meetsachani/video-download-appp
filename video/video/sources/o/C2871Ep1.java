package o;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: o.Ep1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2871Ep1 extends Thread {
    public final BlockingQueue<AbstractC5091aS1<?>> X;
    public final InterfaceC11045yp1 Y;
    public final GT1 Y0;
    public final InterfaceC4747Xs Z;
    public volatile boolean Z0 = false;

    public C2871Ep1(BlockingQueue<AbstractC5091aS1<?>> blockingQueue, InterfaceC11045yp1 interfaceC11045yp1, InterfaceC4747Xs interfaceC4747Xs, GT1 gt1) {
        this.X = blockingQueue;
        this.Y = interfaceC11045yp1;
        this.Z = interfaceC4747Xs;
        this.Y0 = gt1;
    }

    private void c() throws InterruptedException {
        d(this.X.take());
    }

    public final void a(AbstractC5091aS1<?> abstractC5091aS1) {
        TrafficStats.setThreadStatsTag(abstractC5091aS1.H());
    }

    public final void b(AbstractC5091aS1<?> abstractC5091aS1, C6524gJ2 c6524gJ2) {
        this.Y0.b(abstractC5091aS1, abstractC5091aS1.O(c6524gJ2));
    }

    public void d(AbstractC5091aS1<?> abstractC5091aS1) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        abstractC5091aS1.Q(3);
        try {
            try {
                try {
                    abstractC5091aS1.g("network-queue-take");
                    if (abstractC5091aS1.K()) {
                        abstractC5091aS1.o("network-discard-cancelled");
                        abstractC5091aS1.M();
                        return;
                    }
                    a(abstractC5091aS1);
                    C3470Kp1 a = this.Y.a(abstractC5091aS1);
                    abstractC5091aS1.g("network-http-complete");
                    if (a.e && abstractC5091aS1.J()) {
                        abstractC5091aS1.o("not-modified");
                        abstractC5091aS1.M();
                        return;
                    }
                    DT1<?> P = abstractC5091aS1.P(a);
                    abstractC5091aS1.g("network-parse-complete");
                    if (abstractC5091aS1.b0() && P.b != null) {
                        this.Z.b(abstractC5091aS1.s(), P.b);
                        abstractC5091aS1.g("network-cache-written");
                    }
                    abstractC5091aS1.L();
                    this.Y0.c(abstractC5091aS1, P);
                    abstractC5091aS1.N(P);
                } catch (Exception e) {
                    C6767hJ2.d(e, "Unhandled exception %s", e.toString());
                    C6524gJ2 c6524gJ2 = new C6524gJ2(e);
                    c6524gJ2.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.Y0.b(abstractC5091aS1, c6524gJ2);
                    abstractC5091aS1.M();
                }
            } catch (C6524gJ2 e2) {
                e2.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                b(abstractC5091aS1, e2);
                abstractC5091aS1.M();
            }
        } finally {
            abstractC5091aS1.Q(4);
        }
    }

    public void e() {
        this.Z0 = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.Z0) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C6767hJ2.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
