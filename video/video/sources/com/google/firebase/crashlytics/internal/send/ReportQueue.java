package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.AbstractC2434Ae0;
import o.C8637ox0;
import o.EnumC10429wH1;
import o.InterfaceC3584Lt2;
import o.Xt2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ReportQueue {
    public static final int l = 1000;
    public static final int m = 60000;
    public static final int n = 3600000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f346o = 2000;
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final BlockingQueue<Runnable> f;
    public final ThreadPoolExecutor g;
    public final InterfaceC3584Lt2<CrashlyticsReport> h;
    public final OnDemandCounter i;
    public int j;
    public long k;

    /* loaded from: classes3.dex */
    public final class ReportRunnable implements Runnable {
        public final CrashlyticsReportWithSessionId X;
        public final TaskCompletionSource<CrashlyticsReportWithSessionId> Y;

        @Override // java.lang.Runnable
        public void run() {
            ReportQueue.this.n(this.X, this.Y);
            ReportQueue.this.i.e();
            double g = ReportQueue.this.g();
            Logger f = Logger.f();
            f.b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g / 1000.0d)) + " s for report: " + this.X.d());
            ReportQueue.o(g);
        }

        public ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.X = crashlyticsReportWithSessionId;
            this.Y = taskCompletionSource;
        }
    }

    public ReportQueue(InterfaceC3584Lt2<CrashlyticsReport> interfaceC3584Lt2, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.f, settings.g, settings.h * 1000, interfaceC3584Lt2, onDemandCounter);
    }

    public static /* synthetic */ void a(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        reportQueue.getClass();
        if (exc != null) {
            taskCompletionSource.d(exc);
            return;
        }
        if (z) {
            reportQueue.j();
        }
        taskCompletionSource.e(crashlyticsReportWithSessionId);
    }

    public static /* synthetic */ void b(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        reportQueue.getClass();
        try {
            C8637ox0.a(reportQueue.h, EnumC10429wH1.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    public static void o(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.a) * Math.pow(this.b, h()));
    }

    public final int h() {
        int max;
        if (this.k == 0) {
            this.k = m();
        }
        int m2 = (int) ((m() - this.k) / this.c);
        if (l()) {
            max = Math.min(100, this.j + m2);
        } else {
            max = Math.max(0, this.j - m2);
        }
        if (this.j != max) {
            this.j = max;
            this.k = m();
        }
        return max;
    }

    public TaskCompletionSource<CrashlyticsReportWithSessionId> i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.f) {
            try {
                TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource = new TaskCompletionSource<>();
                if (z) {
                    this.i.d();
                    if (k()) {
                        Logger f = Logger.f();
                        f.b("Enqueueing report: " + crashlyticsReportWithSessionId.d());
                        Logger f2 = Logger.f();
                        f2.b("Queue size: " + this.f.size());
                        this.g.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                        Logger f3 = Logger.f();
                        f3.b("Closing task for report: " + crashlyticsReportWithSessionId.d());
                        taskCompletionSource.e(crashlyticsReportWithSessionId);
                        return taskCompletionSource;
                    }
                    h();
                    Logger f4 = Logger.f();
                    f4.b("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.d());
                    this.i.c();
                    taskCompletionSource.e(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                n(crashlyticsReportWithSessionId, taskCompletionSource);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.a
            @Override // java.lang.Runnable
            public final void run() {
                ReportQueue.b(ReportQueue.this, countDownLatch);
            }
        }).start();
        Utils.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        if (this.f.size() < this.e) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.f.size() == this.e) {
            return true;
        }
        return false;
    }

    public final long m() {
        return System.currentTimeMillis();
    }

    public final void n(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        final boolean z;
        Logger f = Logger.f();
        f.b("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.d());
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z = true;
        } else {
            z = false;
        }
        this.h.b(AbstractC2434Ae0.o(crashlyticsReportWithSessionId.b()), new Xt2() { // from class: com.google.firebase.crashlytics.internal.send.b
            @Override // o.Xt2
            public final void a(Exception exc) {
                ReportQueue.a(ReportQueue.this, taskCompletionSource, z, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ReportQueue(double d, double d2, long j, InterfaceC3584Lt2<CrashlyticsReport> interfaceC3584Lt2, OnDemandCounter onDemandCounter) {
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = interfaceC3584Lt2;
        this.i = onDemandCounter;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }
}
