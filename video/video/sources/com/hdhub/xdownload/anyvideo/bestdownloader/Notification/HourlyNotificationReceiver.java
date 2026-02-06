package com.hdhub.xdownload.anyvideo.bestdownloader.Notification;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.SplashActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.Calendar;
import java.util.Random;
import o.C10201vM;
import o.C2723Dd;
import o.C2879Er1;
import o.C3086Gr1;
import o.C3771Nr1;
import o.C4551Vr1;

/* loaded from: classes3.dex */
public class HourlyNotificationReceiver extends BroadcastReceiver {
    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel a = C3086Gr1.a("hourly_notification", "Hourly Notifications", 4);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                C2879Er1.a(notificationManager, a);
            }
        }
    }

    public final void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C3771Nr1.K0);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, HourlyNotificationReceiver.class), 201326592);
        Log.d("CheckActivity", "scheduleNextNotification: " + C2723Dd.g0());
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(12, C2723Dd.g0());
        if (alarmManager != null) {
            alarmManager.setRepeating(0, calendar.getTimeInMillis(), C2723Dd.g0() * 60000, broadcast);
        }
    }

    public final void c(Context context) {
        String str;
        String str2;
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, SplashActivity.class), 201326592);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.custom_notification);
        PendingIntent activity2 = PendingIntent.getActivity(context, 1, new Intent(context, SplashActivity.class), 201326592);
        int nextInt = new Random().nextInt(5);
        if (nextInt == 1) {
            remoteViews.setImageViewResource(R.id.icon, R.drawable.ad_logo);
            remoteViews.setImageViewResource(R.id.banner, R.drawable.ad_banner);
            str = "🔥 Private Video Saved!";
            str2 = "Your 18+ clip is downloaded 😉 Stored safely in your private vault—watch anytime without interruptions.";
        } else if (nextInt == 2) {
            remoteViews.setImageViewResource(R.id.icon, R.drawable.ad_logo2);
            remoteViews.setImageViewResource(R.id.banner, R.drawable.ad_banner2);
            str = "💋 Download Complete!";
            str2 = "Your spicy video is ready 😏 Enjoy smooth offline playback in full HD. Tap to open your collection.";
        } else if (nextInt == 3) {
            remoteViews.setImageViewResource(R.id.icon, R.drawable.ad_logo3);
            remoteViews.setImageViewResource(R.id.banner, R.drawable.ad_banner3);
            str = "🔞 HD Clip Ready!";
            str2 = "Your hot content is saved securely 😮\u200d💨 Explore it anytime with total privacy and fast loading.";
        } else if (nextInt == 4) {
            remoteViews.setImageViewResource(R.id.icon, R.drawable.ad_logo4);
            remoteViews.setImageViewResource(R.id.banner, R.drawable.ad_banner4);
            str = "😈 Steamy Reel Downloaded!";
            str2 = "Your adult reel is now stored offline 😘 Watch it later without ads, lag, or restrictions.";
        } else {
            remoteViews.setImageViewResource(R.id.icon, R.drawable.ad_logo5);
            remoteViews.setImageViewResource(R.id.banner, R.drawable.ad_banner5);
            str = "🔥 Private Clip Saved!";
            str2 = "Your exclusive video is downloaded 😉 Fully private, fully HD — ready to watch whenever you want.";
        }
        remoteViews.setOnClickPendingIntent(R.id.ic_start, activity2);
        remoteViews.setTextViewText(R.id.app_name, str);
        remoteViews.setTextViewText(R.id.description, str2);
        C3771Nr1.n M = new C3771Nr1.n(context, "hourly_notification").t0(R.mipmap.ic_launcher_round).z0(new C3771Nr1.q()).Q(remoteViews).k0(1).C(true).M(activity);
        C4551Vr1 q = C4551Vr1.q(context);
        if (C10201vM.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        q.F(1002, M.h());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("CheckActivity", "onreceive notification");
        a(context);
        c(context);
        b(context);
    }
}
