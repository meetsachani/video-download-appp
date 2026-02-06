package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class NotificationParams {
    public static final int b = -16777216;
    public static final int c = 1;
    public static final int d = -1;
    public static final int e = 1;
    public static final String f = "NotificationParams";
    @InterfaceC5670cr1
    public final Bundle a;

    public NotificationParams(@InterfaceC5670cr1 Bundle bundle) {
        if (bundle != null) {
            this.a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public static String B(String str) {
        if (str.startsWith(Constants.MessageNotificationKeys.b)) {
            return str.substring(6);
        }
        return str;
    }

    public static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean t(String str) {
        if (!str.startsWith(Constants.AnalyticsKeys.a) && !str.equals("from")) {
            return false;
        }
        return true;
    }

    public static boolean v(Bundle bundle) {
        if (!"1".equals(bundle.getString(Constants.MessageNotificationKeys.d)) && !"1".equals(bundle.getString(x(Constants.MessageNotificationKeys.d)))) {
            return false;
        }
        return true;
    }

    public static boolean w(String str) {
        if (!str.startsWith(Constants.MessagePayloadKeys.p) && !str.startsWith(Constants.MessageNotificationKeys.b) && !str.startsWith(Constants.MessageNotificationKeys.c)) {
            return false;
        }
        return true;
    }

    public static String x(String str) {
        if (!str.startsWith(Constants.MessageNotificationKeys.b)) {
            return str;
        }
        return str.replace(Constants.MessageNotificationKeys.b, Constants.MessageNotificationKeys.c);
    }

    public Bundle A() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (w(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public boolean a(String str) {
        String p = p(str);
        if (!"1".equals(p) && !Boolean.parseBoolean(p)) {
            return false;
        }
        return true;
    }

    public Integer b(String str) {
        String p = p(str);
        if (!TextUtils.isEmpty(p)) {
            try {
                return Integer.valueOf(Integer.parseInt(p));
            } catch (NumberFormatException unused) {
                Log.w(f, "Couldn't parse value of " + B(str) + C9811tl1.c + p + ") into an int");
                return null;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public JSONArray c(String str) {
        String p = p(str);
        if (!TextUtils.isEmpty(p)) {
            try {
                return new JSONArray(p);
            } catch (JSONException unused) {
                Log.w(f, "Malformed JSON for key " + B(str) + ": " + p + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public int[] e() {
        JSONArray c2 = c(Constants.MessageNotificationKeys.w);
        if (c2 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c2.length() == 3) {
                iArr[0] = d(c2.optString(0));
                iArr[1] = c2.optInt(1);
                iArr[2] = c2.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e2) {
            Log.w(f, "LightSettings is invalid: " + c2 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w(f, "LightSettings is invalid: " + c2 + ". Skipping setting LightSettings");
            return null;
        }
    }

    @InterfaceC11300zs1
    public Uri f() {
        String p = p(Constants.MessageNotificationKeys.C);
        if (TextUtils.isEmpty(p)) {
            p = p(Constants.MessageNotificationKeys.B);
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    @InterfaceC11300zs1
    public Object[] g(String str) {
        JSONArray c2 = c(str + Constants.MessageNotificationKeys.G);
        if (c2 == null) {
            return null;
        }
        int length = c2.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c2.optString(i);
        }
        return strArr;
    }

    @InterfaceC11300zs1
    public String h(String str) {
        return p(str + Constants.MessageNotificationKeys.F);
    }

    @InterfaceC11300zs1
    public String i(Resources resources, String str, String str2) {
        String h = h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            Log.w(f, B(str2 + Constants.MessageNotificationKeys.F) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g = g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e2) {
            Log.w(f, "Missing format argument for " + B(str2) + ": " + Arrays.toString(g) + " Default value will be used.", e2);
            return null;
        }
    }

    public Long j(String str) {
        String p = p(str);
        if (!TextUtils.isEmpty(p)) {
            try {
                return Long.valueOf(Long.parseLong(p));
            } catch (NumberFormatException unused) {
                Log.w(f, "Couldn't parse value of " + B(str) + C9811tl1.c + p + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String k() {
        return p(Constants.MessageNotificationKeys.D);
    }

    @InterfaceC11300zs1
    public Integer l() {
        Integer b2 = b(Constants.MessageNotificationKeys.t);
        if (b2 == null) {
            return null;
        }
        if (b2.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b2 + ". Skipping setting notificationCount.");
            return null;
        }
        return b2;
    }

    @InterfaceC11300zs1
    public Integer m() {
        Integer b2 = b(Constants.MessageNotificationKeys.p);
        if (b2 == null) {
            return null;
        }
        if (b2.intValue() >= -2 && b2.intValue() <= 2) {
            return b2;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b2 + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p = p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return i(resources, str, str2);
    }

    @InterfaceC11300zs1
    public String o() {
        String p = p(Constants.MessageNotificationKeys.y);
        if (TextUtils.isEmpty(p)) {
            return p(Constants.MessageNotificationKeys.z);
        }
        return p;
    }

    public String p(String str) {
        return this.a.getString(y(str));
    }

    @InterfaceC11300zs1
    public long[] q() {
        JSONArray c2 = c(Constants.MessageNotificationKeys.v);
        if (c2 == null) {
            return null;
        }
        try {
            if (c2.length() > 1) {
                int length = c2.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c2.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w(f, "User defined vibrateTimings is invalid: " + c2 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Integer r() {
        Integer b2 = b(Constants.MessageNotificationKeys.u);
        if (b2 == null) {
            return null;
        }
        if (b2.intValue() >= -1 && b2.intValue() <= 1) {
            return b2;
        }
        Log.w(f, "visibility is invalid: " + b2 + ". Skipping setting visibility.");
        return null;
    }

    public boolean s() {
        return !TextUtils.isEmpty(p(Constants.MessageNotificationKeys.j));
    }

    public boolean u() {
        return a(Constants.MessageNotificationKeys.d);
    }

    public final String y(String str) {
        if (!this.a.containsKey(str) && str.startsWith(Constants.MessageNotificationKeys.b)) {
            String x = x(str);
            if (this.a.containsKey(x)) {
                return x;
            }
        }
        return str;
    }

    public Bundle z() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!t(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
