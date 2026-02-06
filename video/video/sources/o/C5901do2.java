package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: o.do2 */
/* loaded from: classes.dex */
public final class C5901do2 {
    public static final long a = 30000;

    public static /* synthetic */ void a(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void b() {
        C10907yF1.o(e(), "In application's main thread");
    }

    public static void c() {
        C10907yF1.o(f(), "Not in application's main thread");
    }

    public static Handler d() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean e() {
        return !f();
    }

    public static boolean f() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void g(Runnable runnable) {
        if (f()) {
            runnable.run();
        } else {
            C10907yF1.o(d().post(runnable), "Unable to post to main thread");
        }
    }

    public static void h(final Runnable runnable) {
        if (f()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C10907yF1.o(d().post(new Runnable() { // from class: o.bo2
            @Override // java.lang.Runnable
            public final void run() {
                C5901do2.a(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            throw new IllegalStateException("Timeout to wait main thread execution");
        } catch (InterruptedException e) {
            throw new RS0(e);
        }
    }
}
