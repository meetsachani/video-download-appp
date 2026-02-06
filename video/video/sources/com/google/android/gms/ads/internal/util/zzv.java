package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbcv;
import o.C2781Dr1;
import o.C3086Gr1;
import o.C4842Yr1;
import o.C9273rY;
import o.IT2;
import o.InterfaceC11300zs1;
import o.JT2;

@TargetApi(26)
/* loaded from: classes2.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    @InterfaceC11300zs1
    public final Intent e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final zzbca.zzq f(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzv.v();
        if (zzs.b(context, C9273rY.b)) {
            if (IT2.a(telephonyManager)) {
                return zzbca.zzq.ENUM_TRUE;
            }
            return zzbca.zzq.ENUM_FALSE;
        }
        return zzbca.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void g(Context context, String str, String str2) {
        C4842Yr1.a();
        NotificationChannel a = C3086Gr1.a("offline_notification_channel", "AdMob Offline Notifications", ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N8)).intValue());
        JT2.a(a, false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(a);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean h(Context context, String str) {
        NotificationChannel notificationChannel;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null || C2781Dr1.a(notificationChannel) != 0) {
            return false;
        }
        return true;
    }
}
