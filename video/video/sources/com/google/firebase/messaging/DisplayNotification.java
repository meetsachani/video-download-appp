package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C3771Nr1;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
class DisplayNotification {
    public static final int d = 5;
    public final ExecutorService a;
    public final Context b;
    public final NotificationParams c;

    public DisplayNotification(Context context, NotificationParams notificationParams, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = notificationParams;
    }

    public boolean a() {
        if (this.c.a(Constants.MessageNotificationKeys.f)) {
            return true;
        }
        if (b()) {
            return false;
        }
        ImageDownload d2 = d();
        CommonNotificationBuilder.DisplayNotificationInfo e = CommonNotificationBuilder.e(this.b, this.c);
        e(e.a, d2);
        c(e);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.j()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService(androidx.appcompat.widget.b.r)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void c(CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService(MessagingAnalytics.b)).notify(displayNotificationInfo.b, displayNotificationInfo.c, displayNotificationInfo.a.h());
    }

    @InterfaceC11300zs1
    public final ImageDownload d() {
        ImageDownload h = ImageDownload.h(this.c.p(Constants.MessageNotificationKeys.j));
        if (h != null) {
            h.j(this.a);
        }
        return h;
    }

    public final void e(C3771Nr1.n nVar, @InterfaceC11300zs1 ImageDownload imageDownload) {
        if (imageDownload != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.b(imageDownload.i(), 5L, TimeUnit.SECONDS);
                nVar.b0(bitmap);
                nVar.z0(new C3771Nr1.k().D(bitmap).B(null));
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                imageDownload.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                imageDownload.close();
            }
        }
    }
}
