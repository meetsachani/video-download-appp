package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.google.firebase.messaging.MessagingAnalytics;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SuppressLint({"InlinedApi"})
@Deprecated
/* renamed from: o.Zr1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4949Zr1 {
    public static final int a = -1000;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Zr1$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public static void a(Context context, String str, @InterfaceC3329Je2 int i, @InterfaceC3329Je2 int i2, int i3) {
        if (TD2.a >= 26) {
            NotificationManager notificationManager = (NotificationManager) C9542sf.g((NotificationManager) context.getSystemService(MessagingAnalytics.b));
            C4842Yr1.a();
            NotificationChannel a2 = C3086Gr1.a(str, context.getString(i), i3);
            if (i2 != 0) {
                a2.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(a2);
        }
    }

    public static void b(Context context, int i, @InterfaceC11300zs1 Notification notification) {
        NotificationManager notificationManager = (NotificationManager) C9542sf.g((NotificationManager) context.getSystemService(MessagingAnalytics.b));
        if (notification != null) {
            notificationManager.notify(i, notification);
        } else {
            notificationManager.cancel(i);
        }
    }
}
