package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* renamed from: o.m8  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7933m8 {
    public static final String a = AbstractC6949i41.f("Alarms");

    public static void a(Context context, ZM2 workManager, String workSpecId) {
        InterfaceC9808tk2 I = workManager.M().I();
        C9565sk2 a2 = I.a(workSpecId);
        if (a2 != null) {
            b(context, workSpecId, a2.b);
            AbstractC6949i41.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", workSpecId), new Throwable[0]);
            I.d(workSpecId);
        }
    }

    public static void b(Context context, String workSpecId, int alarmId) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C3771Nr1.K0);
        PendingIntent service = PendingIntent.getService(context, alarmId, androidx.work.impl.background.systemalarm.a.b(context, workSpecId), 603979776);
        if (service != null && alarmManager != null) {
            AbstractC6949i41.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", workSpecId, Integer.valueOf(alarmId)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, ZM2 workManager, String workSpecId, long triggerAtMillis) {
        WorkDatabase M = workManager.M();
        InterfaceC9808tk2 I = M.I();
        C9565sk2 a2 = I.a(workSpecId);
        if (a2 != null) {
            b(context, workSpecId, a2.b);
            d(context, workSpecId, a2.b, triggerAtMillis);
            return;
        }
        int b = new OL0(M).b();
        I.c(new C9565sk2(workSpecId, b));
        d(context, workSpecId, b, triggerAtMillis);
    }

    public static void d(Context context, String workSpecId, int alarmId, long triggerAtMillis) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C3771Nr1.K0);
        PendingIntent service = PendingIntent.getService(context, alarmId, androidx.work.impl.background.systemalarm.a.b(context, workSpecId), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, triggerAtMillis, service);
        }
    }
}
