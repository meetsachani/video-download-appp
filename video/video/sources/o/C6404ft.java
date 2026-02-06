package o;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import o.InterfaceC4747Xs;

/* renamed from: o.ft  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6404ft extends Thread {
    public static final boolean b1 = C6767hJ2.b;
    public final BlockingQueue<AbstractC5091aS1<?>> X;
    public final BlockingQueue<AbstractC5091aS1<?>> Y;
    public final GT1 Y0;
    public final InterfaceC4747Xs Z;
    public volatile boolean Z0 = false;
    public final C9706tJ2 a1;

    /* renamed from: o.ft$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ AbstractC5091aS1 X;

        public a(AbstractC5091aS1 abstractC5091aS1) {
            this.X = abstractC5091aS1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6404ft.this.Y.put(this.X);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public C6404ft(BlockingQueue<AbstractC5091aS1<?>> blockingQueue, BlockingQueue<AbstractC5091aS1<?>> blockingQueue2, InterfaceC4747Xs interfaceC4747Xs, GT1 gt1) {
        this.X = blockingQueue;
        this.Y = blockingQueue2;
        this.Z = interfaceC4747Xs;
        this.Y0 = gt1;
        this.a1 = new C9706tJ2(this, blockingQueue2, gt1);
    }

    private void b() throws InterruptedException {
        c(this.X.take());
    }

    public void c(AbstractC5091aS1<?> abstractC5091aS1) throws InterruptedException {
        abstractC5091aS1.g("cache-queue-take");
        abstractC5091aS1.Q(1);
        try {
            if (abstractC5091aS1.K()) {
                abstractC5091aS1.o("cache-discard-canceled");
                return;
            }
            InterfaceC4747Xs.a m = this.Z.m(abstractC5091aS1.s());
            if (m == null) {
                abstractC5091aS1.g("cache-miss");
                if (!this.a1.c(abstractC5091aS1)) {
                    this.Y.put(abstractC5091aS1);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (m.b(currentTimeMillis)) {
                abstractC5091aS1.g("cache-hit-expired");
                abstractC5091aS1.R(m);
                if (!this.a1.c(abstractC5091aS1)) {
                    this.Y.put(abstractC5091aS1);
                }
                return;
            }
            abstractC5091aS1.g("cache-hit");
            DT1<?> P = abstractC5091aS1.P(new C3470Kp1(m.a, m.g));
            abstractC5091aS1.g("cache-hit-parsed");
            if (!P.b()) {
                abstractC5091aS1.g("cache-parsing-failed");
                this.Z.a(abstractC5091aS1.s(), true);
                abstractC5091aS1.R(null);
                if (!this.a1.c(abstractC5091aS1)) {
                    this.Y.put(abstractC5091aS1);
                }
                return;
            }
            if (!m.d(currentTimeMillis)) {
                this.Y0.c(abstractC5091aS1, P);
            } else {
                abstractC5091aS1.g("cache-hit-refresh-needed");
                abstractC5091aS1.R(m);
                P.d = true;
                if (!this.a1.c(abstractC5091aS1)) {
                    this.Y0.a(abstractC5091aS1, P, new a(abstractC5091aS1));
                } else {
                    this.Y0.c(abstractC5091aS1, P);
                }
            }
        } finally {
            abstractC5091aS1.Q(2);
        }
    }

    public void d() {
        this.Z0 = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (b1) {
            C6767hJ2.f("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.Z.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.Z0) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C6767hJ2.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
