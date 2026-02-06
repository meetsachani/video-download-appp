package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbex;

/* loaded from: classes2.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {
    public static final /* synthetic */ int b = 0;

    public static void k(String str) {
        if (m()) {
            if (str != null && str.length() > 4000) {
                boolean z = true;
                for (String str2 : com.google.android.gms.ads.internal.util.client.zzo.a.d(str)) {
                    if (z) {
                        Log.v("Ads", str2);
                    } else {
                        Log.v("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.v("Ads", str);
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        if (com.google.android.gms.ads.internal.util.client.zzo.j(2) && ((Boolean) zzbex.a.e()).booleanValue()) {
            return true;
        }
        return false;
    }
}
