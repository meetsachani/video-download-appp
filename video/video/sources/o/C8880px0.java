package o;

import android.app.Notification;

/* renamed from: o.px0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8880px0 {
    public final int a;
    public final int b;
    public final Notification c;

    public C8880px0(int notificationId, Notification notification) {
        this(notificationId, notification, 0);
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || C8880px0.class != o2.getClass()) {
            return false;
        }
        C8880px0 c8880px0 = (C8880px0) o2;
        if (this.a != c8880px0.a || this.b != c8880px0.b) {
            return false;
        }
        return this.c.equals(c8880px0.c);
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }

    public C8880px0(int notificationId, Notification notification, int foregroundServiceType) {
        this.a = notificationId;
        this.c = notification;
        this.b = foregroundServiceType;
    }
}
