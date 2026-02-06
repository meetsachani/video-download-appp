package o;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class H12 {
    public static final int a = 1;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 255;
    public static final int e = 1073745919;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Service service, int i) {
            service.stopForeground(i);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Service service, int i, Notification notification, int i2) {
            if (i2 != 0 && i2 != -1) {
                service.startForeground(i, notification, i2 & 255);
            } else {
                service.startForeground(i, notification, i2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(Service service, int i, Notification notification, int i2) {
            if (i2 != 0 && i2 != -1) {
                service.startForeground(i, notification, i2 & H12.e);
            } else {
                service.startForeground(i, notification, i2);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    public static void a(Service service, int i, Notification notification, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            c.a(service, i, notification, i2);
        } else if (i3 >= 29) {
            b.a(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }

    public static void b(Service service, int i) {
        a.a(service, i);
    }
}
