package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;
import o.C9191rC1;

/* renamed from: o.rC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9191rC1 {

    /* renamed from: o.rC1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i, intent, onFinished, handler, str, bundle);
        }
    }

    /* renamed from: o.rC1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static PendingIntent a(Context context, int i, Intent intent, int i2) {
            return PendingIntent.getForegroundService(context, i, intent, i2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.rC1$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* renamed from: o.rC1$d */
    /* loaded from: classes.dex */
    public static class d implements Closeable {
        public PendingIntent.OnFinished Y;
        public final CountDownLatch X = new CountDownLatch(1);
        public boolean Z = false;

        public d(PendingIntent.OnFinished onFinished) {
            this.Y = onFinished;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.Z) {
                this.Y = null;
            }
            this.X.countDown();
        }

        public void d() {
            this.Z = true;
        }

        public PendingIntent.OnFinished f() {
            if (this.Y == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: o.sC1
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
                    C9191rC1.d.this.h(pendingIntent, intent, i, str, bundle);
                }
            };
        }

        public final void h(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            boolean z = false;
            while (true) {
                try {
                    this.X.await();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i = i;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.Y;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i, str, bundle);
                this.Y = null;
            }
        }
    }

    public static int a(boolean z, int i) {
        int i2;
        if (z) {
            if (Build.VERSION.SDK_INT >= 31) {
                i2 = 33554432;
            } else {
                return i;
            }
        } else {
            i2 = 67108864;
        }
        return i2 | i;
    }

    public static PendingIntent b(Context context, int i, Intent[] intentArr, int i2, Bundle bundle, boolean z) {
        return PendingIntent.getActivities(context, i, intentArr, a(z, i2), bundle);
    }

    public static PendingIntent c(Context context, int i, Intent[] intentArr, int i2, boolean z) {
        return PendingIntent.getActivities(context, i, intentArr, a(z, i2));
    }

    public static PendingIntent d(Context context, int i, Intent intent, int i2, Bundle bundle, boolean z) {
        return PendingIntent.getActivity(context, i, intent, a(z, i2), bundle);
    }

    public static PendingIntent e(Context context, int i, Intent intent, int i2, boolean z) {
        return PendingIntent.getActivity(context, i, intent, a(z, i2));
    }

    public static PendingIntent f(Context context, int i, Intent intent, int i2, boolean z) {
        return PendingIntent.getBroadcast(context, i, intent, a(z, i2));
    }

    public static PendingIntent g(Context context, int i, Intent intent, int i2, boolean z) {
        return b.a(context, i, intent, a(z, i2));
    }

    public static PendingIntent h(Context context, int i, Intent intent, int i2, boolean z) {
        return PendingIntent.getService(context, i, intent, a(z, i2));
    }

    public static void i(PendingIntent pendingIntent, int i, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            pendingIntent.send(i, dVar.f(), handler);
            dVar.d();
            dVar.close();
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void j(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        k(pendingIntent, context, i, intent, onFinished, handler, null, null);
    }

    public static void k(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            a.a(pendingIntent, context, i, intent, onFinished, handler, str, bundle);
            dVar.d();
            dVar.close();
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
