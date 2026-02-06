package o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: o.Hr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3184Hr1 {
    public static Notification a(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        NotificationChannel notificationChannel;
        int importance;
        notificationManager.createNotificationChannel(C3086Gr1.a(str, str2, 3));
        notificationChannel = notificationManager.getNotificationChannel(str);
        importance = notificationChannel.getImportance();
        if (importance == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }

    public static boolean b(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance == 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
