package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.foreground.a;
import com.google.firebase.messaging.MessagingAnalytics;
import o.AbstractC6949i41;
import o.C9073qk2;
import o.NZ0;

/* loaded from: classes.dex */
public class SystemForegroundService extends NZ0 implements a.b {
    public static final String a1 = AbstractC6949i41.f("SystemFgService");
    public static SystemForegroundService b1 = null;
    public Handler Y;
    public androidx.work.impl.foreground.a Y0;
    public boolean Z;
    public NotificationManager Z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int X;
        public final /* synthetic */ Notification Y;
        public final /* synthetic */ int Z;

        public a(final int val$notificationId, final Notification val$notification, final int val$notificationType) {
            this.X = val$notificationId;
            this.Y = val$notification;
            this.Z = val$notificationType;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                C9073qk2.a(SystemForegroundService.this, this.X, this.Y, this.Z);
            } else {
                SystemForegroundService.this.startForeground(this.X, this.Y);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ int X;
        public final /* synthetic */ Notification Y;

        public b(final int val$notificationId, final Notification val$notification) {
            this.X = val$notificationId;
            this.Y = val$notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.Z0.notify(this.X, this.Y);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ int X;

        public c(final int val$notificationId) {
            this.X = val$notificationId;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.Z0.cancel(this.X);
        }
    }

    public static SystemForegroundService f() {
        return b1;
    }

    private void g() {
        this.Y = new Handler(Looper.getMainLooper());
        this.Z0 = (NotificationManager) getApplicationContext().getSystemService(MessagingAnalytics.b);
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.Y0 = aVar;
        aVar.o(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(final int notificationId, final Notification notification) {
        this.Y.post(new b(notificationId, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(final int notificationId, final int notificationType, final Notification notification) {
        this.Y.post(new a(notificationId, notification, notificationType));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(final int notificationId) {
        this.Y.post(new c(notificationId));
    }

    @Override // o.NZ0, android.app.Service
    public void onCreate() {
        super.onCreate();
        b1 = this;
        g();
    }

    @Override // o.NZ0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.Y0.m();
    }

    @Override // o.NZ0, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.Z) {
            AbstractC6949i41.c().d(a1, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.Y0.m();
            g();
            this.Z = false;
        }
        if (intent != null) {
            this.Y0.n(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.Z = true;
        AbstractC6949i41.c().a(a1, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        b1 = null;
        stopSelf();
    }
}
