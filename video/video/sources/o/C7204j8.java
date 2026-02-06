package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* renamed from: o.j8  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7204j8 {

    /* renamed from: o.j8$a */
    /* loaded from: classes.dex */
    public static class a {
        public static AlarmManager.AlarmClockInfo a(long j, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* renamed from: o.j8$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    /* renamed from: o.j8$c */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }

    public static boolean a(AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.a(alarmManager);
        }
        return true;
    }

    public static void b(AlarmManager alarmManager, long j, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        a.b(alarmManager, a.a(j, pendingIntent), pendingIntent2);
    }

    public static void c(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        b.a(alarmManager, i, j, pendingIntent);
    }

    @JR1(expression = "alarmManager.setExact(type, triggerAtMillis, operation)")
    @Deprecated
    public static void d(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }

    public static void e(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        b.b(alarmManager, i, j, pendingIntent);
    }
}
