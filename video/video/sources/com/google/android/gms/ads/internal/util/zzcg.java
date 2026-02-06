package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

/* loaded from: classes2.dex */
public final class zzcg {
    public static zzcg b;
    public String a;

    private zzcg() {
    }

    public static zzcg a() {
        if (b == null) {
            b = new zzcg();
        }
        return b;
    }

    public final void b(Context context) {
        zze.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.a)) {
            Context i = GooglePlayServicesUtilLight.i(context);
            if (!ClientLibraryUtils.c()) {
                if (i == null) {
                    i = null;
                }
                this.a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (i == null) {
                putString.apply();
            } else {
                SharedPreferencesUtils.a(context, putString, "admob_user_agent");
            }
            this.a = defaultUserAgent;
        }
        zze.k("User agent is updated.");
    }
}
