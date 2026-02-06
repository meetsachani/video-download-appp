package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.firebase.messaging.Constants;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String d1 = "com.google.android.c2dm.intent.RECEIVE";
    public static final String e1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    public static final String f1 = "com.google.firebase.messaging.NEW_TOKEN";
    public static final String g1 = "token";
    public static final int h1 = 10;
    public static final Queue<String> i1 = new ArrayDeque(10);
    public Rpc c1;

    @InterfaceC5056aJ2
    public static void u() {
        i1.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent e(Intent intent) {
        return ServiceStarter.b().c();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void f(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !e1.equals(action)) {
            if (f1.equals(action)) {
                r(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        n(intent);
    }

    public final boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = i1;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    public final void k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (NotificationParams.v(extras)) {
            NotificationParams notificationParams = new NotificationParams(extras);
            ExecutorService f = FcmExecutors.f();
            try {
                if (new DisplayNotification(this, notificationParams, f).a()) {
                    return;
                }
                f.shutdown();
                if (MessagingAnalytics.E(intent)) {
                    MessagingAnalytics.w(intent);
                }
            } finally {
                f.shutdown();
            }
        }
        p(new RemoteMessage(extras));
    }

    public final String l(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.h);
        if (stringExtra == null) {
            return intent.getStringExtra(Constants.MessagePayloadKeys.f);
        }
        return stringExtra;
    }

    public final Rpc m(Context context) {
        if (this.c1 == null) {
            this.c1 = new Rpc(context.getApplicationContext());
        }
        return this.c1;
    }

    public final void n(Intent intent) {
        if (!j(intent.getStringExtra(Constants.MessagePayloadKeys.h))) {
            t(intent);
        }
        m(this).a(new CloudMessage(intent));
    }

    @InterfaceC10697xN2
    public void o() {
    }

    @InterfaceC10697xN2
    public void p(@InterfaceC5670cr1 RemoteMessage remoteMessage) {
    }

    @InterfaceC10697xN2
    public void q(@InterfaceC5670cr1 String str) {
    }

    @InterfaceC10697xN2
    public void r(@InterfaceC5670cr1 String str) {
    }

    @InterfaceC10697xN2
    public void s(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Exception exc) {
    }

    public final void t(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.d);
        if (stringExtra == null) {
            stringExtra = Constants.MessageTypes.a;
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(Constants.MessageTypes.b)) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(Constants.MessageTypes.a)) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(Constants.MessageTypes.d)) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(Constants.MessageTypes.c)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                o();
                return;
            case 1:
                MessagingAnalytics.y(intent);
                k(intent);
                return;
            case 2:
                s(l(intent), new SendException(intent.getStringExtra("error")));
                return;
            case 3:
                q(intent.getStringExtra(Constants.MessagePayloadKeys.h));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    @InterfaceC5056aJ2
    public void v(Rpc rpc) {
        this.c1 = rpc;
    }
}
