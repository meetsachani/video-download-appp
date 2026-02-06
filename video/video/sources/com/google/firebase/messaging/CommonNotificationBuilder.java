package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import o.C10201vM;
import o.C3086Gr1;
import o.C3771Nr1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.JT;
import o.NG;

/* loaded from: classes3.dex */
public final class CommonNotificationBuilder {
    public static final String a = "com.google.firebase.messaging.default_notification_color";
    public static final String b = "com.google.firebase.messaging.default_notification_icon";
    public static final String c = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String d = "fcm_fallback_notification_channel";
    public static final String e = "fcm_fallback_notification_channel_label";
    public static final String f = "Misc";
    public static final String g = "com.google.android.c2dm.intent.RECEIVE";
    public static final int h = 0;
    public static final AtomicInteger i = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* loaded from: classes3.dex */
    public static class DisplayNotificationInfo {
        public final C3771Nr1.n a;
        public final String b;
        public final int c;

        public DisplayNotificationInfo(C3771Nr1.n nVar, String str, int i) {
            this.a = nVar;
            this.b = str;
            this.c = i;
        }
    }

    private CommonNotificationBuilder() {
    }

    @InterfaceC11300zs1
    public static PendingIntent a(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent f2 = f(str, notificationParams, packageManager);
        if (f2 == null) {
            return null;
        }
        f2.addFlags(67108864);
        f2.putExtras(notificationParams.A());
        if (q(notificationParams)) {
            f2.putExtra(Constants.MessageNotificationKeys.E, notificationParams.z());
        }
        return PendingIntent.getActivity(context, g(), f2, l(1073741824));
    }

    @InterfaceC11300zs1
    public static PendingIntent b(Context context, Context context2, NotificationParams notificationParams) {
        if (!q(notificationParams)) {
            return null;
        }
        return c(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.b).putExtras(notificationParams.z()));
    }

    public static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static DisplayNotificationInfo d(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C3771Nr1.n nVar = new C3771Nr1.n(context2, str);
        String n = notificationParams.n(resources, packageName, Constants.MessageNotificationKeys.g);
        if (!TextUtils.isEmpty(n)) {
            nVar.O(n);
        }
        String n2 = notificationParams.n(resources, packageName, Constants.MessageNotificationKeys.h);
        if (!TextUtils.isEmpty(n2)) {
            nVar.N(n2);
            nVar.z0(new C3771Nr1.l().A(n2));
        }
        nVar.t0(m(packageManager, resources, packageName, notificationParams.p(Constants.MessageNotificationKeys.i), bundle));
        Uri n3 = n(packageName, notificationParams, resources);
        if (n3 != null) {
            nVar.x0(n3);
        }
        nVar.M(a(context, notificationParams, packageName, packageManager));
        PendingIntent b2 = b(context, context2, notificationParams);
        if (b2 != null) {
            nVar.T(b2);
        }
        Integer h2 = h(context2, notificationParams.p(Constants.MessageNotificationKeys.l), bundle);
        if (h2 != null) {
            nVar.I(h2.intValue());
        }
        nVar.C(!notificationParams.a(Constants.MessageNotificationKeys.f368o));
        nVar.e0(notificationParams.a(Constants.MessageNotificationKeys.n));
        String p = notificationParams.p(Constants.MessageNotificationKeys.m);
        if (p != null) {
            nVar.B0(p);
        }
        Integer m = notificationParams.m();
        if (m != null) {
            nVar.k0(m.intValue());
        }
        Integer r = notificationParams.r();
        if (r != null) {
            nVar.G0(r.intValue());
        }
        Integer l = notificationParams.l();
        if (l != null) {
            nVar.h0(l.intValue());
        }
        Long j = notificationParams.j(Constants.MessageNotificationKeys.x);
        if (j != null) {
            nVar.r0(true);
            nVar.H0(j.longValue());
        }
        long[] q = notificationParams.q();
        if (q != null) {
            nVar.F0(q);
        }
        int[] e2 = notificationParams.e();
        if (e2 != null) {
            nVar.d0(e2[0], e2[1], e2[2]);
        }
        nVar.S(i(notificationParams));
        return new DisplayNotificationInfo(nVar, o(notificationParams), 0);
    }

    public static DisplayNotificationInfo e(Context context, NotificationParams notificationParams) {
        Bundle j = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, notificationParams, k(context, notificationParams.k(), j), j);
    }

    public static Intent f(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String p = notificationParams.p(Constants.MessageNotificationKeys.A);
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f2 = notificationParams.f();
        if (f2 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f2);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return i.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i2 = bundle.getInt(a, 0);
        if (i2 != 0) {
            try {
                return Integer.valueOf(C10201vM.g(context, i2));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int i(NotificationParams notificationParams) {
        boolean a2 = notificationParams.a(Constants.MessageNotificationKeys.q);
        ?? r0 = a2;
        if (notificationParams.a(Constants.MessageNotificationKeys.r)) {
            r0 = (a2 ? 1 : 0) | true;
        }
        if (notificationParams.a(Constants.MessageNotificationKeys.s)) {
            return r0 | 4;
        }
        return r0;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
        }
        return Bundle.EMPTY;
    }

    @InterfaceC5056aJ2
    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString(c);
            if (!TextUtils.isEmpty(string2)) {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel(d);
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier(e, "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = f;
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(C3086Gr1.a(d, string, 3));
            }
            return d;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int l(int i2) {
        return i2 | 67108864;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i2 = bundle.getInt(b, 0);
        if (i2 == 0 || !p(resources, i2)) {
            try {
                i2 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
            }
        }
        if (i2 == 0 || !p(resources, i2)) {
            return 17301651;
        }
        return i2;
    }

    public static Uri n(String str, NotificationParams notificationParams, Resources resources) {
        String o2 = notificationParams.o();
        if (TextUtils.isEmpty(o2)) {
            return null;
        }
        if (!JT.d.equals(o2) && resources.getIdentifier(o2, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + o2);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    public static String o(NotificationParams notificationParams) {
        String p = notificationParams.p(Constants.MessageNotificationKeys.k);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    public static boolean p(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!NG.a(resources.getDrawable(i2, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i2);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i2 + ", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean q(@InterfaceC5670cr1 NotificationParams notificationParams) {
        return notificationParams.a(Constants.AnalyticsKeys.b);
    }
}
