package com.hdhub.xdownload.anyvideo.bestdownloader.Notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;
import o.C2723Dd;
import o.C3771Nr1;

/* loaded from: classes3.dex */
public class BootReceiver extends BroadcastReceiver {
    public final void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C3771Nr1.K0);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, HourlyNotificationReceiver.class), 201326592);
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(12, C2723Dd.g0());
        if (alarmManager != null) {
            alarmManager.setRepeating(0, calendar.getTimeInMillis(), C2723Dd.g0() * 60000, broadcast);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            a(context);
        }
    }
}
