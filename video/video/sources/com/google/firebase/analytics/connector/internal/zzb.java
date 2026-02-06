package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.measurement.internal.zzii;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import o.AbstractC5317bO0;
import o.AbstractC9481sO0;

/* loaded from: classes3.dex */
public final class zzb {
    public static final AbstractC9481sO0<String> a = AbstractC9481sO0.a0("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.g, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final AbstractC5317bO0<String> b = AbstractC5317bO0.a0("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final AbstractC5317bO0<String> c = AbstractC5317bO0.U("auto", FirebaseMessaging.r, "am");
    public static final AbstractC5317bO0<String> d = AbstractC5317bO0.Q("_r", "_dbg");
    public static final AbstractC5317bO0<String> e = new AbstractC5317bO0.a().b(zzij.a).b(zzij.b).e();
    public static final AbstractC5317bO0<String> f = AbstractC5317bO0.Q("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = conditionalUserProperty.b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = conditionalUserProperty.c;
        if (obj != null) {
            zzie.b(bundle, obj);
        }
        String str3 = conditionalUserProperty.d;
        if (str3 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.d, str3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.e, conditionalUserProperty.e);
        String str4 = conditionalUserProperty.f;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.f, str4);
        }
        Bundle bundle2 = conditionalUserProperty.g;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.g, bundle2);
        }
        String str5 = conditionalUserProperty.h;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.h, str5);
        }
        Bundle bundle3 = conditionalUserProperty.i;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.i, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.j, conditionalUserProperty.j);
        String str6 = conditionalUserProperty.k;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.k, str6);
        }
        Bundle bundle4 = conditionalUserProperty.l;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.l, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.m, conditionalUserProperty.m);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.n, conditionalUserProperty.n);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.f309o, conditionalUserProperty.f336o);
        return bundle;
    }

    public static AnalyticsConnector.ConditionalUserProperty b(Bundle bundle) {
        Preconditions.r(bundle);
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.a = (String) Preconditions.r((String) zzie.a(bundle, "origin", String.class, null));
        conditionalUserProperty.b = (String) Preconditions.r((String) zzie.a(bundle, "name", String.class, null));
        conditionalUserProperty.c = zzie.a(bundle, "value", Object.class, null);
        conditionalUserProperty.d = (String) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.d, String.class, null);
        conditionalUserProperty.e = ((Long) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.e, Long.class, 0L)).longValue();
        conditionalUserProperty.f = (String) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.f, String.class, null);
        conditionalUserProperty.g = (Bundle) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.g, Bundle.class, null);
        conditionalUserProperty.h = (String) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.h, String.class, null);
        conditionalUserProperty.i = (Bundle) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.i, Bundle.class, null);
        conditionalUserProperty.j = ((Long) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.j, Long.class, 0L)).longValue();
        conditionalUserProperty.k = (String) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.k, String.class, null);
        conditionalUserProperty.l = (Bundle) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.l, Bundle.class, null);
        conditionalUserProperty.n = ((Boolean) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.n, Boolean.class, Boolean.FALSE)).booleanValue();
        conditionalUserProperty.m = ((Long) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.m, Long.class, 0L)).longValue();
        conditionalUserProperty.f336o = ((Long) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.f309o, Long.class, 0L)).longValue();
        return conditionalUserProperty;
    }

    public static String c(String str) {
        String a2 = zzii.a(str);
        if (a2 != null) {
            return a2;
        }
        return str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            AbstractC5317bO0<String> abstractC5317bO0 = d;
            int size = abstractC5317bO0.size();
            int i = 0;
            while (i < size) {
                String str2 = abstractC5317bO0.get(i);
                i++;
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if (Constants.ScionAnalytics.q.equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            } else if (e.contains(str2)) {
                return false;
            } else {
                AbstractC5317bO0<String> abstractC5317bO0 = f;
                int size = abstractC5317bO0.size();
                int i = 0;
                while (i < size) {
                    String str3 = abstractC5317bO0.get(i);
                    i++;
                    if (str2.matches(str3)) {
                        return false;
                    }
                }
                return true;
            }
        } else if (str.equals("fcm") || str.equals("frc")) {
            return true;
        } else {
            return false;
        }
    }

    public static String g(String str) {
        String b2 = zzii.b(str);
        if (b2 != null) {
            return b2;
        }
        return str;
    }

    public static boolean h(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = conditionalUserProperty.c;
        if ((obj != null && zzkf.a(obj) == null) || !m(str) || !f(str, conditionalUserProperty.b)) {
            return false;
        }
        String str2 = conditionalUserProperty.k;
        if (str2 != null && (!e(str2, conditionalUserProperty.l) || !i(str, conditionalUserProperty.k, conditionalUserProperty.l))) {
            return false;
        }
        String str3 = conditionalUserProperty.h;
        if (str3 != null && (!e(str3, conditionalUserProperty.i) || !i(str, conditionalUserProperty.h, conditionalUserProperty.i))) {
            return false;
        }
        String str4 = conditionalUserProperty.f;
        if (str4 != null) {
            if (!e(str4, conditionalUserProperty.g) || !i(str, conditionalUserProperty.f, conditionalUserProperty.g)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean i(String str, String str2, Bundle bundle) {
        if (!Constants.ScionAnalytics.l.equals(str2)) {
            return true;
        }
        if (!m(str) || bundle == null) {
            return false;
        }
        AbstractC5317bO0<String> abstractC5317bO0 = d;
        int size = abstractC5317bO0.size();
        int i = 0;
        while (i < size) {
            String str3 = abstractC5317bO0.get(i);
            i++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c2 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean j(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean k(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean l(String str) {
        if (!a.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean m(String str) {
        if (!c.contains(str)) {
            return true;
        }
        return false;
    }
}
