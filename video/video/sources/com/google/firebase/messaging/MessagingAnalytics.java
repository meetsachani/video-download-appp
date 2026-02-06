package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.concurrent.ExecutionException;
import o.AbstractC2434Ae0;
import o.BI1;
import o.C3123Hc0;
import o.InterfaceC11300zs1;
import o.InterfaceC3385Js2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.Ot2;

/* loaded from: classes3.dex */
public class MessagingAnalytics {
    public static final String a = "Firebase";
    public static final String b = "notification";
    public static final String c = "com.google.firebase.messaging";
    public static final String d = "export_to_big_query";
    public static final String e = "delivery_metrics_exported_to_big_query_enabled";
    public static final int f = 111881503;

    @InterfaceC5056aJ2
    public static void A(String str, Bundle bundle) {
        try {
            FirebaseApp.p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d2 = d(bundle);
            if (d2 != null) {
                bundle2.putString(Constants.ScionAnalytics.r, d2);
            }
            String e2 = e(bundle);
            if (e2 != null) {
                bundle2.putString(Constants.ScionAnalytics.g, e2);
            }
            String i = i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString(Constants.ScionAnalytics.j, g);
            }
            String r = r(bundle);
            if (r != null) {
                bundle2.putString(Constants.ScionAnalytics.e, r);
            }
            String l = l(bundle);
            if (l != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.h, Integer.parseInt(l));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e3);
                }
            }
            String t = t(bundle);
            if (t != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.i, Integer.parseInt(t));
                } catch (NumberFormatException e4) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e4);
                }
            }
            String n = n(bundle);
            if (Constants.ScionAnalytics.m.equals(str) || Constants.ScionAnalytics.p.equals(str)) {
                bundle2.putString(Constants.ScionAnalytics.k, n);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.p().l(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.b("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void B(boolean z) {
        FirebaseApp.p().n().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean(d, z).apply();
    }

    public static void C(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString(Constants.AnalyticsKeys.g))) {
                AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.p().l(AnalyticsConnector.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (analyticsConnector != null) {
                    String string = bundle.getString(Constants.AnalyticsKeys.c);
                    analyticsConnector.c("fcm", Constants.ScionAnalytics.q, string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", a);
                    bundle2.putString("medium", b);
                    bundle2.putString("campaign", string);
                    analyticsConnector.b("fcm", Constants.ScionAnalytics.l, bundle2);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }

    public static boolean D(Intent intent) {
        if (intent != null && !u(intent)) {
            return a();
        }
        return false;
    }

    public static boolean E(Intent intent) {
        if (intent != null && !u(intent)) {
            return F(intent.getExtras());
        }
        return false;
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(Constants.AnalyticsKeys.b));
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.p();
            Context n = FirebaseApp.p().n();
            SharedPreferences sharedPreferences = n.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(d)) {
                return sharedPreferences.getBoolean(d, false);
            }
            try {
                PackageManager packageManager = n.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(n.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(e)) {
                    return applicationInfo.metaData.getBoolean(e, false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static MessagingClientEvent b(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.Builder j = MessagingClientEvent.q().p(s(extras)).g(event).h(f(extras)).k(o()).n(MessagingClientEvent.SDKPlatform.ANDROID).j(m(extras));
        String h = h(extras);
        if (h != null) {
            j.i(h);
        }
        String r = r(extras);
        if (r != null) {
            j.o(r);
        }
        String c2 = c(extras);
        if (c2 != null) {
            j.e(c2);
        }
        String i = i(extras);
        if (i != null) {
            j.b(i);
        }
        String e2 = e(extras);
        if (e2 != null) {
            j.f(e2);
        }
        long q = q(extras);
        if (q > 0) {
            j.m(q);
        }
        return j.a();
    }

    @InterfaceC11300zs1
    public static String c(Bundle bundle) {
        return bundle.getString(Constants.MessagePayloadKeys.e);
    }

    @InterfaceC11300zs1
    public static String d(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.c);
    }

    @InterfaceC11300zs1
    public static String e(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.d);
    }

    @InterfaceC5670cr1
    public static String f(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.g);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.a(FirebaseInstallations.v(FirebaseApp.p()).getId());
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    @InterfaceC11300zs1
    public static String g(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.j);
    }

    @InterfaceC11300zs1
    public static String h(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.h);
        if (string == null) {
            return bundle.getString(Constants.MessagePayloadKeys.f);
        }
        return string;
    }

    @InterfaceC11300zs1
    public static String i(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.i);
    }

    @InterfaceC5670cr1
    public static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    public static int k(Bundle bundle) {
        int p = p(bundle);
        if (p == 2) {
            return 5;
        }
        if (p == 1) {
            return 10;
        }
        return 0;
    }

    @InterfaceC11300zs1
    public static String l(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.e);
    }

    @InterfaceC5670cr1
    public static MessagingClientEvent.MessageType m(Bundle bundle) {
        if (bundle != null && NotificationParams.v(bundle)) {
            return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
        }
        return MessagingClientEvent.MessageType.DATA_MESSAGE;
    }

    @InterfaceC5670cr1
    public static String n(Bundle bundle) {
        if (bundle != null && NotificationParams.v(bundle)) {
            return "display";
        }
        return "data";
    }

    @InterfaceC5670cr1
    public static String o() {
        return FirebaseApp.p().n().getPackageName();
    }

    @InterfaceC5670cr1
    public static int p(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.l);
        if (string == null) {
            if ("1".equals(bundle.getString(Constants.MessagePayloadKeys.n))) {
                return 2;
            }
            string = bundle.getString(Constants.MessagePayloadKeys.m);
        }
        return j(string);
    }

    @InterfaceC11300zs1
    public static long q(Bundle bundle) {
        if (bundle.containsKey(Constants.MessagePayloadKeys.q)) {
            try {
                return Long.parseLong(bundle.getString(Constants.MessagePayloadKeys.q));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing project number", e2);
            }
        }
        FirebaseApp p = FirebaseApp.p();
        String m = p.s().m();
        if (m != null) {
            try {
                return Long.parseLong(m);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e3);
            }
        }
        String j = p.s().j();
        if (!j.startsWith("1:")) {
            try {
                return Long.parseLong(j);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        } else {
            String[] split = j.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e5) {
                Log.w("FirebaseMessaging", "error parsing app ID", e5);
            }
        }
        return 0L;
    }

    @InterfaceC11300zs1
    public static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string != null && string.startsWith("/topics/")) {
            return string;
        }
        return null;
    }

    @InterfaceC5670cr1
    public static int s(Bundle bundle) {
        Object obj = bundle.get(Constants.MessagePayloadKeys.i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    @InterfaceC11300zs1
    public static String t(Bundle bundle) {
        if (bundle.containsKey(Constants.AnalyticsKeys.f)) {
            return bundle.getString(Constants.AnalyticsKeys.f);
        }
        return null;
    }

    public static boolean u(Intent intent) {
        return FirebaseMessagingService.e1.equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A(Constants.ScionAnalytics.f370o, intent.getExtras());
    }

    public static void w(Intent intent) {
        A(Constants.ScionAnalytics.p, intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A(Constants.ScionAnalytics.n, bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A(Constants.ScionAnalytics.m, intent.getExtras());
        }
        if (D(intent)) {
            z(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.A());
        }
    }

    public static void z(MessagingClientEvent.Event event, Intent intent, @InterfaceC11300zs1 Ot2 ot2) {
        if (ot2 == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        MessagingClientEvent b2 = b(event, intent);
        if (b2 == null) {
            return;
        }
        try {
            ot2.b(Constants.FirelogAnalytics.a, MessagingClientEventExtension.class, C3123Hc0.b("proto"), new InterfaceC3385Js2() { // from class: o.Ri1
                @Override // o.InterfaceC3385Js2
                public final Object apply(Object obj) {
                    return ((MessagingClientEventExtension) obj).e();
                }
            }).a(AbstractC2434Ae0.h(MessagingClientEventExtension.d().b(b2).a(), BI1.b(Integer.valueOf(intent.getIntExtra(Constants.MessagePayloadKeys.f369o, f)))));
        } catch (RuntimeException e2) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e2);
        }
    }
}
