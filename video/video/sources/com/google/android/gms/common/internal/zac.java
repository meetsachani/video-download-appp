package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import o.C9654t62;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8223nF0;
import o.VJ;

/* loaded from: classes2.dex */
public final class zac {
    @InterfaceC8223nF0("sCache")
    public static final C9654t62<String, String> a = new C9654t62<>();
    @InterfaceC11300zs1
    @InterfaceC8223nF0("sCache")
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.g);
    }

    @InterfaceC5670cr1
    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(R.string.a);
            }
            return resources.getString(R.string.j);
        }
        return resources.getString(R.string.d);
    }

    @InterfaceC5670cr1
    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case 16:
                                            return h(context, "common_google_play_services_api_unavailable_text", a2);
                                        case 17:
                                            return h(context, "common_google_play_services_sign_in_failed_text", a2);
                                        case 18:
                                            return resources.getString(R.string.m, a2);
                                        default:
                                            return resources.getString(com.google.android.gms.common.R.string.a, a2);
                                    }
                                }
                                return h(context, "common_google_play_services_restricted_profile_text", a2);
                            }
                            return resources.getString(R.string.i, a2);
                        }
                        return h(context, "common_google_play_services_network_error_text", a2);
                    }
                    return h(context, "common_google_play_services_invalid_account_text", a2);
                }
                return resources.getString(R.string.b, a2);
            } else if (DeviceProperties.m(context)) {
                return resources.getString(R.string.n);
            } else {
                return resources.getString(R.string.k, a2);
            }
        }
        return resources.getString(R.string.e, a2);
    }

    @InterfaceC5670cr1
    public static String e(Context context, int i) {
        if (i != 6 && i != 19) {
            return d(context, i);
        }
        return h(context, "common_google_play_services_resolution_required_text", a(context));
    }

    @InterfaceC5670cr1
    public static String f(Context context, int i) {
        String g;
        if (i == 6) {
            g = i(context, "common_google_play_services_resolution_required_title");
        } else {
            g = g(context, i);
        }
        if (g == null) {
            return context.getResources().getString(R.string.h);
        }
        return g;
    }

    @InterfaceC11300zs1
    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.f);
            case 2:
                return resources.getString(R.string.l);
            case 3:
                return resources.getString(R.string.c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = i(context, str);
        if (i == null) {
            i = resources.getString(com.google.android.gms.common.R.string.a);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    @InterfaceC11300zs1
    public static String i(Context context, String str) {
        String str2;
        String str3;
        C9654t62<String, String> c9654t62 = a;
        synchronized (c9654t62) {
            try {
                Locale d = VJ.a(context.getResources().getConfiguration()).d(0);
                if (!d.equals(b)) {
                    c9654t62.clear();
                    b = d;
                }
                String str4 = c9654t62.get(str);
                if (str4 != null) {
                    return str4;
                }
                Resources j = GooglePlayServicesUtil.j(context);
                if (j == null) {
                    return null;
                }
                int identifier = j.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    if (str.length() != 0) {
                        str3 = "Missing resource: ".concat(str);
                    } else {
                        str3 = new String("Missing resource: ");
                    }
                    Log.w("GoogleApiAvailability", str3);
                    return null;
                }
                String string = j.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    if (str.length() != 0) {
                        str2 = "Got empty resource: ".concat(str);
                    } else {
                        str2 = new String("Got empty resource: ");
                    }
                    Log.w("GoogleApiAvailability", str2);
                    return null;
                }
                c9654t62.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
