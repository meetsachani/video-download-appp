package o;

import java.time.Duration;

/* renamed from: o.Fn2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC2973Fn2 implements Runnable {
    public final Thread X;
    public final Duration Y;

    public RunnableC2973Fn2(Thread thread, Duration duration) {
        this.X = thread;
        this.Y = duration;
    }

    public static Thread a(Thread thread, Duration duration) {
        boolean isZero;
        boolean isNegative;
        isZero = duration.isZero();
        if (!isZero) {
            isNegative = duration.isNegative();
            if (!isNegative) {
                Thread thread2 = new Thread(new RunnableC2973Fn2(thread, duration), RunnableC2973Fn2.class.getSimpleName());
                thread2.setDaemon(true);
                thread2.start();
                return thread2;
            }
            return null;
        }
        return null;
    }

    public static Thread b(Duration duration) {
        return a(Thread.currentThread(), duration);
    }

    public static void c(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C5174ao2.b(this.Y);
            this.X.interrupt();
        } catch (InterruptedException unused) {
        }
    }
}
