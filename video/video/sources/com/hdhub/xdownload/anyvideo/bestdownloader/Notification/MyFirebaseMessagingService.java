package com.hdhub.xdownload.anyvideo.bestdownloader.Notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.messaging.RemoteMessage;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.SplashActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.HashMap;
import o.C10201vM;
import o.C10323vs;
import o.C3771Nr1;
import o.ES1;

/* loaded from: classes3.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final String j1 = "com.myProject.chat_notification";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    @ES1(api = 23)
    public void p(RemoteMessage remoteMessage) {
        super.p(remoteMessage);
        try {
            if (remoteMessage.O0() != null) {
                w(this, remoteMessage);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(String str) {
        super.r(str);
    }

    public void w(Context context, RemoteMessage remoteMessage) {
        new Intent().addFlags(67108864);
        Intent intent = new Intent(context, SplashActivity.class);
        intent.putExtra(j1, new HashMap(remoteMessage.B0()));
        ((NotificationManager) context.getSystemService(MessagingAnalytics.b)).notify(0, new C3771Nr1.n(context).t0(R.mipmap.ic_launcher).b0(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)).I(C10201vM.g(context, R.color.white)).O(remoteMessage.B0().get("title")).N(remoteMessage.B0().get("content")).C(true).z0(new C3771Nr1.k().D(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))).x0(RingtoneManager.getDefaultUri(2)).S(2).k0(2).M(PendingIntent.getActivity(context, 0, intent, C10323vs.Q0)).h());
    }
}
